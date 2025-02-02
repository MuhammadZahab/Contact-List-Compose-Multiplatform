package org.devescort.contactlist.contacts.presentation

import org.devescort.contactlist.contacts.domain.Contact

data class ContactListState(
    val contacts: List<Contact> = emptyList(),
    val recentlyAddedContact: List<Contact> = emptyList(),
    val selectedContact: Contact? = null,
    val isAddContactSheetOpen: Boolean = false,
    val isSelectedContactSheetOpen: Boolean = false,
    val firstNameError: String? = null,
    val lastNameError: String? = null,
    val emailError: String? = null,
    val phoneNumberError: String? = null,
    )