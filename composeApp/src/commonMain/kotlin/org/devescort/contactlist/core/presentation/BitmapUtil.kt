package org.devescort.contactlist.core.presentation

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.ImageBitmap

@Composable
expect fun rememberBitmapFromBytes(byteArray: ByteArray?): ImageBitmap?