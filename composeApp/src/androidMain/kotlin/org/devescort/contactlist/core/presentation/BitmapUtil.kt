package org.devescort.contactlist.core.presentation

import android.graphics.BitmapFactory
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asImageBitmap

@Composable
actual fun rememberBitmapFromBytes(byteArray: ByteArray?): ImageBitmap? {
    return if (byteArray != null)
        BitmapFactory.decodeByteArray(byteArray, 0, byteArray.size).asImageBitmap()
    else null
}