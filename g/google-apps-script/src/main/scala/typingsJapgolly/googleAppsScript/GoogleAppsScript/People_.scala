package typingsJapgolly.googleAppsScript.GoogleAppsScript

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.People.Collection.ContactGroupsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.People.Collection.PeopleCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.People.Schema.Address
import typingsJapgolly.googleAppsScript.GoogleAppsScript.People.Schema.AgeRangeType
import typingsJapgolly.googleAppsScript.GoogleAppsScript.People.Schema.Biography
import typingsJapgolly.googleAppsScript.GoogleAppsScript.People.Schema.Birthday
import typingsJapgolly.googleAppsScript.GoogleAppsScript.People.Schema.BraggingRights
import typingsJapgolly.googleAppsScript.GoogleAppsScript.People.Schema.ContactGroup
import typingsJapgolly.googleAppsScript.GoogleAppsScript.People.Schema.ContactGroupMembership
import typingsJapgolly.googleAppsScript.GoogleAppsScript.People.Schema.ContactGroupMetadata
import typingsJapgolly.googleAppsScript.GoogleAppsScript.People.Schema.CoverPhoto
import typingsJapgolly.googleAppsScript.GoogleAppsScript.People.Schema.CreateContactGroupRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.People.Schema.Date
import typingsJapgolly.googleAppsScript.GoogleAppsScript.People.Schema.DomainMembership
import typingsJapgolly.googleAppsScript.GoogleAppsScript.People.Schema.EmailAddress
import typingsJapgolly.googleAppsScript.GoogleAppsScript.People.Schema.Event
import typingsJapgolly.googleAppsScript.GoogleAppsScript.People.Schema.FieldMetadata
import typingsJapgolly.googleAppsScript.GoogleAppsScript.People.Schema.Gender
import typingsJapgolly.googleAppsScript.GoogleAppsScript.People.Schema.ImClient
import typingsJapgolly.googleAppsScript.GoogleAppsScript.People.Schema.Interest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.People.Schema.Locale
import typingsJapgolly.googleAppsScript.GoogleAppsScript.People.Schema.Membership
import typingsJapgolly.googleAppsScript.GoogleAppsScript.People.Schema.ModifyContactGroupMembersRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.People.Schema.Name
import typingsJapgolly.googleAppsScript.GoogleAppsScript.People.Schema.Nickname
import typingsJapgolly.googleAppsScript.GoogleAppsScript.People.Schema.Occupation
import typingsJapgolly.googleAppsScript.GoogleAppsScript.People.Schema.Organization
import typingsJapgolly.googleAppsScript.GoogleAppsScript.People.Schema.Person
import typingsJapgolly.googleAppsScript.GoogleAppsScript.People.Schema.PersonMetadata
import typingsJapgolly.googleAppsScript.GoogleAppsScript.People.Schema.PhoneNumber
import typingsJapgolly.googleAppsScript.GoogleAppsScript.People.Schema.Photo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.People.Schema.ProfileMetadata
import typingsJapgolly.googleAppsScript.GoogleAppsScript.People.Schema.Relation
import typingsJapgolly.googleAppsScript.GoogleAppsScript.People.Schema.RelationshipInterest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.People.Schema.RelationshipStatus
import typingsJapgolly.googleAppsScript.GoogleAppsScript.People.Schema.Residence
import typingsJapgolly.googleAppsScript.GoogleAppsScript.People.Schema.SipAddress
import typingsJapgolly.googleAppsScript.GoogleAppsScript.People.Schema.Skill
import typingsJapgolly.googleAppsScript.GoogleAppsScript.People.Schema.Source
import typingsJapgolly.googleAppsScript.GoogleAppsScript.People.Schema.Tagline
import typingsJapgolly.googleAppsScript.GoogleAppsScript.People.Schema.UpdateContactGroupRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.People.Schema.Url
import typingsJapgolly.googleAppsScript.GoogleAppsScript.People.Schema.UserDefined
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait People_ extends js.Object {
  var ContactGroups: js.UndefOr[ContactGroupsCollection] = js.undefined
  var People: js.UndefOr[PeopleCollection] = js.undefined
  // Create a new instance of Address
  def newAddress(): Address
  // Create a new instance of AgeRangeType
  def newAgeRangeType(): AgeRangeType
  // Create a new instance of Biography
  def newBiography(): Biography
  // Create a new instance of Birthday
  def newBirthday(): Birthday
  // Create a new instance of BraggingRights
  def newBraggingRights(): BraggingRights
  // Create a new instance of ContactGroup
  def newContactGroup(): ContactGroup
  // Create a new instance of ContactGroupMembership
  def newContactGroupMembership(): ContactGroupMembership
  // Create a new instance of ContactGroupMetadata
  def newContactGroupMetadata(): ContactGroupMetadata
  // Create a new instance of CoverPhoto
  def newCoverPhoto(): CoverPhoto
  // Create a new instance of CreateContactGroupRequest
  def newCreateContactGroupRequest(): CreateContactGroupRequest
  // Create a new instance of Date
  def newDate(): Date
  // Create a new instance of DomainMembership
  def newDomainMembership(): DomainMembership
  // Create a new instance of EmailAddress
  def newEmailAddress(): EmailAddress
  // Create a new instance of Event
  def newEvent(): Event
  // Create a new instance of FieldMetadata
  def newFieldMetadata(): FieldMetadata
  // Create a new instance of Gender
  def newGender(): Gender
  // Create a new instance of ImClient
  def newImClient(): ImClient
  // Create a new instance of Interest
  def newInterest(): Interest
  // Create a new instance of Locale
  def newLocale(): Locale
  // Create a new instance of Membership
  def newMembership(): Membership
  // Create a new instance of ModifyContactGroupMembersRequest
  def newModifyContactGroupMembersRequest(): ModifyContactGroupMembersRequest
  // Create a new instance of Name
  def newName(): Name
  // Create a new instance of Nickname
  def newNickname(): Nickname
  // Create a new instance of Occupation
  def newOccupation(): Occupation
  // Create a new instance of Organization
  def newOrganization(): Organization
  // Create a new instance of Person
  def newPerson(): Person
  // Create a new instance of PersonMetadata
  def newPersonMetadata(): PersonMetadata
  // Create a new instance of PhoneNumber
  def newPhoneNumber(): PhoneNumber
  // Create a new instance of Photo
  def newPhoto(): Photo
  // Create a new instance of ProfileMetadata
  def newProfileMetadata(): ProfileMetadata
  // Create a new instance of Relation
  def newRelation(): Relation
  // Create a new instance of RelationshipInterest
  def newRelationshipInterest(): RelationshipInterest
  // Create a new instance of RelationshipStatus
  def newRelationshipStatus(): RelationshipStatus
  // Create a new instance of Residence
  def newResidence(): Residence
  // Create a new instance of SipAddress
  def newSipAddress(): SipAddress
  // Create a new instance of Skill
  def newSkill(): Skill
  // Create a new instance of Source
  def newSource(): Source
  // Create a new instance of Tagline
  def newTagline(): Tagline
  // Create a new instance of UpdateContactGroupRequest
  def newUpdateContactGroupRequest(): UpdateContactGroupRequest
  // Create a new instance of Url
  def newUrl(): Url
  // Create a new instance of UserDefined
  def newUserDefined(): UserDefined
}

object People_ {
  @scala.inline
  def apply(
    newAddress: CallbackTo[Address],
    newAgeRangeType: CallbackTo[AgeRangeType],
    newBiography: CallbackTo[Biography],
    newBirthday: CallbackTo[Birthday],
    newBraggingRights: CallbackTo[BraggingRights],
    newContactGroup: CallbackTo[ContactGroup],
    newContactGroupMembership: CallbackTo[ContactGroupMembership],
    newContactGroupMetadata: CallbackTo[ContactGroupMetadata],
    newCoverPhoto: CallbackTo[CoverPhoto],
    newCreateContactGroupRequest: CallbackTo[CreateContactGroupRequest],
    newDate: CallbackTo[Date],
    newDomainMembership: CallbackTo[DomainMembership],
    newEmailAddress: CallbackTo[EmailAddress],
    newEvent: CallbackTo[Event],
    newFieldMetadata: CallbackTo[FieldMetadata],
    newGender: CallbackTo[Gender],
    newImClient: CallbackTo[ImClient],
    newInterest: CallbackTo[Interest],
    newLocale: CallbackTo[Locale],
    newMembership: CallbackTo[Membership],
    newModifyContactGroupMembersRequest: CallbackTo[ModifyContactGroupMembersRequest],
    newName: CallbackTo[Name],
    newNickname: CallbackTo[Nickname],
    newOccupation: CallbackTo[Occupation],
    newOrganization: CallbackTo[Organization],
    newPerson: CallbackTo[Person],
    newPersonMetadata: CallbackTo[PersonMetadata],
    newPhoneNumber: CallbackTo[PhoneNumber],
    newPhoto: CallbackTo[Photo],
    newProfileMetadata: CallbackTo[ProfileMetadata],
    newRelation: CallbackTo[Relation],
    newRelationshipInterest: CallbackTo[RelationshipInterest],
    newRelationshipStatus: CallbackTo[RelationshipStatus],
    newResidence: CallbackTo[Residence],
    newSipAddress: CallbackTo[SipAddress],
    newSkill: CallbackTo[Skill],
    newSource: CallbackTo[Source],
    newTagline: CallbackTo[Tagline],
    newUpdateContactGroupRequest: CallbackTo[UpdateContactGroupRequest],
    newUrl: CallbackTo[Url],
    newUserDefined: CallbackTo[UserDefined],
    ContactGroups: ContactGroupsCollection = null,
    People: PeopleCollection = null
  ): People_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newAddress")(newAddress.toJsFn)
    __obj.updateDynamic("newAgeRangeType")(newAgeRangeType.toJsFn)
    __obj.updateDynamic("newBiography")(newBiography.toJsFn)
    __obj.updateDynamic("newBirthday")(newBirthday.toJsFn)
    __obj.updateDynamic("newBraggingRights")(newBraggingRights.toJsFn)
    __obj.updateDynamic("newContactGroup")(newContactGroup.toJsFn)
    __obj.updateDynamic("newContactGroupMembership")(newContactGroupMembership.toJsFn)
    __obj.updateDynamic("newContactGroupMetadata")(newContactGroupMetadata.toJsFn)
    __obj.updateDynamic("newCoverPhoto")(newCoverPhoto.toJsFn)
    __obj.updateDynamic("newCreateContactGroupRequest")(newCreateContactGroupRequest.toJsFn)
    __obj.updateDynamic("newDate")(newDate.toJsFn)
    __obj.updateDynamic("newDomainMembership")(newDomainMembership.toJsFn)
    __obj.updateDynamic("newEmailAddress")(newEmailAddress.toJsFn)
    __obj.updateDynamic("newEvent")(newEvent.toJsFn)
    __obj.updateDynamic("newFieldMetadata")(newFieldMetadata.toJsFn)
    __obj.updateDynamic("newGender")(newGender.toJsFn)
    __obj.updateDynamic("newImClient")(newImClient.toJsFn)
    __obj.updateDynamic("newInterest")(newInterest.toJsFn)
    __obj.updateDynamic("newLocale")(newLocale.toJsFn)
    __obj.updateDynamic("newMembership")(newMembership.toJsFn)
    __obj.updateDynamic("newModifyContactGroupMembersRequest")(newModifyContactGroupMembersRequest.toJsFn)
    __obj.updateDynamic("newName")(newName.toJsFn)
    __obj.updateDynamic("newNickname")(newNickname.toJsFn)
    __obj.updateDynamic("newOccupation")(newOccupation.toJsFn)
    __obj.updateDynamic("newOrganization")(newOrganization.toJsFn)
    __obj.updateDynamic("newPerson")(newPerson.toJsFn)
    __obj.updateDynamic("newPersonMetadata")(newPersonMetadata.toJsFn)
    __obj.updateDynamic("newPhoneNumber")(newPhoneNumber.toJsFn)
    __obj.updateDynamic("newPhoto")(newPhoto.toJsFn)
    __obj.updateDynamic("newProfileMetadata")(newProfileMetadata.toJsFn)
    __obj.updateDynamic("newRelation")(newRelation.toJsFn)
    __obj.updateDynamic("newRelationshipInterest")(newRelationshipInterest.toJsFn)
    __obj.updateDynamic("newRelationshipStatus")(newRelationshipStatus.toJsFn)
    __obj.updateDynamic("newResidence")(newResidence.toJsFn)
    __obj.updateDynamic("newSipAddress")(newSipAddress.toJsFn)
    __obj.updateDynamic("newSkill")(newSkill.toJsFn)
    __obj.updateDynamic("newSource")(newSource.toJsFn)
    __obj.updateDynamic("newTagline")(newTagline.toJsFn)
    __obj.updateDynamic("newUpdateContactGroupRequest")(newUpdateContactGroupRequest.toJsFn)
    __obj.updateDynamic("newUrl")(newUrl.toJsFn)
    __obj.updateDynamic("newUserDefined")(newUserDefined.toJsFn)
    if (ContactGroups != null) __obj.updateDynamic("ContactGroups")(ContactGroups.asInstanceOf[js.Any])
    if (People != null) __obj.updateDynamic("People")(People.asInstanceOf[js.Any])
    __obj.asInstanceOf[People_]
  }
}

