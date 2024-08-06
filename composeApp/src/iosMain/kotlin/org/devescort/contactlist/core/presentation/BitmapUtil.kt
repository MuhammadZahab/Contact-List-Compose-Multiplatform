package org.devescort.contactlist.core.presentation

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asComposeImageBitmap
import org.jetbrains.skia.Bitmap
import org.jetbrains.skia.Image

@Composable
actual fun rememberBitmapFromBytes(byteArray: ByteArray?): ImageBitmap? {
    return if (byteArray != null)
        Bitmap.makeFromImage(Image.makeFromEncoded(byteArray)).asComposeImageBitmap()
    else return null
}