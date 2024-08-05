package org.devescort.contactlist.contacts.presentation

import org.devescort.contactlist.contacts.domain.Contact

sealed interface ContactListEvent{

    data object OnAddNewContact: ContactListEvent
    data object DismissContact: ContactListEvent
    data class OnFirstNameChanged(val firstName: String): ContactListEvent
    data class OnLastNameChanged(val lastName: String): ContactListEvent
    data class OnEmailChanged(val email: String): ContactListEvent
    data class OnPhoneNumberChanged(val phoneNumber: String): ContactListEvent
    data class OnPhotoPicked(val photoBytes: ByteArray): ContactListEvent
    data object OnAddPhotoClicked: ContactListEvent
    data object SaveContact: ContactListEvent
    data class SelectContact(val contact: Contact): ContactListEvent
    data class EditContact(val contact: Contact): ContactListEvent
    data object DeleteContact : ContactListEvent
}