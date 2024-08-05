package org.devescort.contactlist.contacts.domain

data class Contact(
    val id : Long?,
    val firstName: String?,
    val lastName: String?,
    val email: String?,
    val phone: String?,
    val photoBytes: ByteArray?
)