package typingsJapgolly.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Person extends StObject {
  
  /** The person's street addresses. */
  var addresses: js.UndefOr[js.Array[Address]] = js.undefined
  
  /** Output only. **DEPRECATED** (Please use `person.ageRanges` instead) The person's age range. */
  var ageRange: js.UndefOr[String] = js.undefined
  
  /** Output only. The person's age ranges. */
  var ageRanges: js.UndefOr[js.Array[AgeRangeType]] = js.undefined
  
  /** The person's biographies. This field is a singleton for contact sources. */
  var biographies: js.UndefOr[js.Array[Biography]] = js.undefined
  
  /** The person's birthdays. This field is a singleton for contact sources. */
  var birthdays: js.UndefOr[js.Array[Birthday]] = js.undefined
  
  /** **DEPRECATED**: No data will be returned The person's bragging rights. */
  var braggingRights: js.UndefOr[js.Array[BraggingRights]] = js.undefined
  
  /** The person's calendar URLs. */
  var calendarUrls: js.UndefOr[js.Array[CalendarUrl]] = js.undefined
  
  /** The person's client data. */
  var clientData: js.UndefOr[js.Array[ClientData]] = js.undefined
  
  /** Output only. The person's cover photos. */
  var coverPhotos: js.UndefOr[js.Array[CoverPhoto]] = js.undefined
  
  /**
    * The person's email addresses. For `people.connections.list` and `otherContacts.list` the number of email addresses is limited to 100. If a Person has more email addresses the entire
    * set can be obtained by calling GetPeople.
    */
  var emailAddresses: js.UndefOr[js.Array[EmailAddress]] = js.undefined
  
  /** The [HTTP entity tag](https://en.wikipedia.org/wiki/HTTP_ETag) of the resource. Used for web cache validation. */
  var etag: js.UndefOr[String] = js.undefined
  
  /** The person's events. */
  var events: js.UndefOr[js.Array[Event]] = js.undefined
  
  /** The person's external IDs. */
  var externalIds: js.UndefOr[js.Array[ExternalId]] = js.undefined
  
  /** The person's file-ases. */
  var fileAses: js.UndefOr[js.Array[FileAs]] = js.undefined
  
  /** The person's genders. This field is a singleton for contact sources. */
  var genders: js.UndefOr[js.Array[Gender]] = js.undefined
  
  /** The person's instant messaging clients. */
  var imClients: js.UndefOr[js.Array[ImClient]] = js.undefined
  
  /** The person's interests. */
  var interests: js.UndefOr[js.Array[Interest]] = js.undefined
  
  /** The person's locale preferences. */
  var locales: js.UndefOr[js.Array[Locale]] = js.undefined
  
  /** The person's locations. */
  var locations: js.UndefOr[js.Array[Location]] = js.undefined
  
  /** The person's group memberships. */
  var memberships: js.UndefOr[js.Array[Membership]] = js.undefined
  
  /** Output only. Metadata about the person. */
  var metadata: js.UndefOr[PersonMetadata] = js.undefined
  
  /** The person's miscellaneous keywords. */
  var miscKeywords: js.UndefOr[js.Array[MiscKeyword]] = js.undefined
  
  /** The person's names. This field is a singleton for contact sources. */
  var names: js.UndefOr[js.Array[Name]] = js.undefined
  
  /** The person's nicknames. */
  var nicknames: js.UndefOr[js.Array[Nickname]] = js.undefined
  
  /** The person's occupations. */
  var occupations: js.UndefOr[js.Array[Occupation]] = js.undefined
  
  /** The person's past or current organizations. */
  var organizations: js.UndefOr[js.Array[Organization]] = js.undefined
  
  /**
    * The person's phone numbers. For `people.connections.list` and `otherContacts.list` the number of phone numbers is limited to 100. If a Person has more phone numbers the entire set
    * can be obtained by calling GetPeople.
    */
  var phoneNumbers: js.UndefOr[js.Array[PhoneNumber]] = js.undefined
  
  /** Output only. The person's photos. */
  var photos: js.UndefOr[js.Array[Photo]] = js.undefined
  
  /** The person's relations. */
  var relations: js.UndefOr[js.Array[Relation]] = js.undefined
  
  /** Output only. **DEPRECATED**: No data will be returned The person's relationship interests. */
  var relationshipInterests: js.UndefOr[js.Array[RelationshipInterest]] = js.undefined
  
  /** Output only. **DEPRECATED**: No data will be returned The person's relationship statuses. */
  var relationshipStatuses: js.UndefOr[js.Array[RelationshipStatus]] = js.undefined
  
  /** **DEPRECATED**: (Please use `person.locations` instead) The person's residences. */
  var residences: js.UndefOr[js.Array[Residence]] = js.undefined
  
  /** The resource name for the person, assigned by the server. An ASCII string with a max length of 27 characters, in the form of `people/{person_id}`. */
  var resourceName: js.UndefOr[String] = js.undefined
  
  /** The person's SIP addresses. */
  var sipAddresses: js.UndefOr[js.Array[SipAddress]] = js.undefined
  
  /** The person's skills. */
  var skills: js.UndefOr[js.Array[Skill]] = js.undefined
  
  /** Output only. **DEPRECATED**: No data will be returned The person's taglines. */
  var taglines: js.UndefOr[js.Array[Tagline]] = js.undefined
  
  /** The person's associated URLs. */
  var urls: js.UndefOr[js.Array[Url]] = js.undefined
  
  /** The person's user defined data. */
  var userDefined: js.UndefOr[js.Array[UserDefined]] = js.undefined
}
object Person {
  
  inline def apply(): Person = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Person]
  }
  
  extension [Self <: Person](x: Self) {
    
    inline def setAddresses(value: js.Array[Address]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    inline def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
    
    inline def setAddressesVarargs(value: Address*): Self = StObject.set(x, "addresses", js.Array(value*))
    
    inline def setAgeRange(value: String): Self = StObject.set(x, "ageRange", value.asInstanceOf[js.Any])
    
    inline def setAgeRangeUndefined: Self = StObject.set(x, "ageRange", js.undefined)
    
    inline def setAgeRanges(value: js.Array[AgeRangeType]): Self = StObject.set(x, "ageRanges", value.asInstanceOf[js.Any])
    
    inline def setAgeRangesUndefined: Self = StObject.set(x, "ageRanges", js.undefined)
    
    inline def setAgeRangesVarargs(value: AgeRangeType*): Self = StObject.set(x, "ageRanges", js.Array(value*))
    
    inline def setBiographies(value: js.Array[Biography]): Self = StObject.set(x, "biographies", value.asInstanceOf[js.Any])
    
    inline def setBiographiesUndefined: Self = StObject.set(x, "biographies", js.undefined)
    
    inline def setBiographiesVarargs(value: Biography*): Self = StObject.set(x, "biographies", js.Array(value*))
    
    inline def setBirthdays(value: js.Array[Birthday]): Self = StObject.set(x, "birthdays", value.asInstanceOf[js.Any])
    
    inline def setBirthdaysUndefined: Self = StObject.set(x, "birthdays", js.undefined)
    
    inline def setBirthdaysVarargs(value: Birthday*): Self = StObject.set(x, "birthdays", js.Array(value*))
    
    inline def setBraggingRights(value: js.Array[BraggingRights]): Self = StObject.set(x, "braggingRights", value.asInstanceOf[js.Any])
    
    inline def setBraggingRightsUndefined: Self = StObject.set(x, "braggingRights", js.undefined)
    
    inline def setBraggingRightsVarargs(value: BraggingRights*): Self = StObject.set(x, "braggingRights", js.Array(value*))
    
    inline def setCalendarUrls(value: js.Array[CalendarUrl]): Self = StObject.set(x, "calendarUrls", value.asInstanceOf[js.Any])
    
    inline def setCalendarUrlsUndefined: Self = StObject.set(x, "calendarUrls", js.undefined)
    
    inline def setCalendarUrlsVarargs(value: CalendarUrl*): Self = StObject.set(x, "calendarUrls", js.Array(value*))
    
    inline def setClientData(value: js.Array[ClientData]): Self = StObject.set(x, "clientData", value.asInstanceOf[js.Any])
    
    inline def setClientDataUndefined: Self = StObject.set(x, "clientData", js.undefined)
    
    inline def setClientDataVarargs(value: ClientData*): Self = StObject.set(x, "clientData", js.Array(value*))
    
    inline def setCoverPhotos(value: js.Array[CoverPhoto]): Self = StObject.set(x, "coverPhotos", value.asInstanceOf[js.Any])
    
    inline def setCoverPhotosUndefined: Self = StObject.set(x, "coverPhotos", js.undefined)
    
    inline def setCoverPhotosVarargs(value: CoverPhoto*): Self = StObject.set(x, "coverPhotos", js.Array(value*))
    
    inline def setEmailAddresses(value: js.Array[EmailAddress]): Self = StObject.set(x, "emailAddresses", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressesUndefined: Self = StObject.set(x, "emailAddresses", js.undefined)
    
    inline def setEmailAddressesVarargs(value: EmailAddress*): Self = StObject.set(x, "emailAddresses", js.Array(value*))
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setEvents(value: js.Array[Event]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(value: Event*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setExternalIds(value: js.Array[ExternalId]): Self = StObject.set(x, "externalIds", value.asInstanceOf[js.Any])
    
    inline def setExternalIdsUndefined: Self = StObject.set(x, "externalIds", js.undefined)
    
    inline def setExternalIdsVarargs(value: ExternalId*): Self = StObject.set(x, "externalIds", js.Array(value*))
    
    inline def setFileAses(value: js.Array[FileAs]): Self = StObject.set(x, "fileAses", value.asInstanceOf[js.Any])
    
    inline def setFileAsesUndefined: Self = StObject.set(x, "fileAses", js.undefined)
    
    inline def setFileAsesVarargs(value: FileAs*): Self = StObject.set(x, "fileAses", js.Array(value*))
    
    inline def setGenders(value: js.Array[Gender]): Self = StObject.set(x, "genders", value.asInstanceOf[js.Any])
    
    inline def setGendersUndefined: Self = StObject.set(x, "genders", js.undefined)
    
    inline def setGendersVarargs(value: Gender*): Self = StObject.set(x, "genders", js.Array(value*))
    
    inline def setImClients(value: js.Array[ImClient]): Self = StObject.set(x, "imClients", value.asInstanceOf[js.Any])
    
    inline def setImClientsUndefined: Self = StObject.set(x, "imClients", js.undefined)
    
    inline def setImClientsVarargs(value: ImClient*): Self = StObject.set(x, "imClients", js.Array(value*))
    
    inline def setInterests(value: js.Array[Interest]): Self = StObject.set(x, "interests", value.asInstanceOf[js.Any])
    
    inline def setInterestsUndefined: Self = StObject.set(x, "interests", js.undefined)
    
    inline def setInterestsVarargs(value: Interest*): Self = StObject.set(x, "interests", js.Array(value*))
    
    inline def setLocales(value: js.Array[Locale]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
    
    inline def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
    
    inline def setLocalesVarargs(value: Locale*): Self = StObject.set(x, "locales", js.Array(value*))
    
    inline def setLocations(value: js.Array[Location]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    inline def setLocationsVarargs(value: Location*): Self = StObject.set(x, "locations", js.Array(value*))
    
    inline def setMemberships(value: js.Array[Membership]): Self = StObject.set(x, "memberships", value.asInstanceOf[js.Any])
    
    inline def setMembershipsUndefined: Self = StObject.set(x, "memberships", js.undefined)
    
    inline def setMembershipsVarargs(value: Membership*): Self = StObject.set(x, "memberships", js.Array(value*))
    
    inline def setMetadata(value: PersonMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setMiscKeywords(value: js.Array[MiscKeyword]): Self = StObject.set(x, "miscKeywords", value.asInstanceOf[js.Any])
    
    inline def setMiscKeywordsUndefined: Self = StObject.set(x, "miscKeywords", js.undefined)
    
    inline def setMiscKeywordsVarargs(value: MiscKeyword*): Self = StObject.set(x, "miscKeywords", js.Array(value*))
    
    inline def setNames(value: js.Array[Name]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
    
    inline def setNamesVarargs(value: Name*): Self = StObject.set(x, "names", js.Array(value*))
    
    inline def setNicknames(value: js.Array[Nickname]): Self = StObject.set(x, "nicknames", value.asInstanceOf[js.Any])
    
    inline def setNicknamesUndefined: Self = StObject.set(x, "nicknames", js.undefined)
    
    inline def setNicknamesVarargs(value: Nickname*): Self = StObject.set(x, "nicknames", js.Array(value*))
    
    inline def setOccupations(value: js.Array[Occupation]): Self = StObject.set(x, "occupations", value.asInstanceOf[js.Any])
    
    inline def setOccupationsUndefined: Self = StObject.set(x, "occupations", js.undefined)
    
    inline def setOccupationsVarargs(value: Occupation*): Self = StObject.set(x, "occupations", js.Array(value*))
    
    inline def setOrganizations(value: js.Array[Organization]): Self = StObject.set(x, "organizations", value.asInstanceOf[js.Any])
    
    inline def setOrganizationsUndefined: Self = StObject.set(x, "organizations", js.undefined)
    
    inline def setOrganizationsVarargs(value: Organization*): Self = StObject.set(x, "organizations", js.Array(value*))
    
    inline def setPhoneNumbers(value: js.Array[PhoneNumber]): Self = StObject.set(x, "phoneNumbers", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumbersUndefined: Self = StObject.set(x, "phoneNumbers", js.undefined)
    
    inline def setPhoneNumbersVarargs(value: PhoneNumber*): Self = StObject.set(x, "phoneNumbers", js.Array(value*))
    
    inline def setPhotos(value: js.Array[Photo]): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
    
    inline def setPhotosUndefined: Self = StObject.set(x, "photos", js.undefined)
    
    inline def setPhotosVarargs(value: Photo*): Self = StObject.set(x, "photos", js.Array(value*))
    
    inline def setRelations(value: js.Array[Relation]): Self = StObject.set(x, "relations", value.asInstanceOf[js.Any])
    
    inline def setRelationsUndefined: Self = StObject.set(x, "relations", js.undefined)
    
    inline def setRelationsVarargs(value: Relation*): Self = StObject.set(x, "relations", js.Array(value*))
    
    inline def setRelationshipInterests(value: js.Array[RelationshipInterest]): Self = StObject.set(x, "relationshipInterests", value.asInstanceOf[js.Any])
    
    inline def setRelationshipInterestsUndefined: Self = StObject.set(x, "relationshipInterests", js.undefined)
    
    inline def setRelationshipInterestsVarargs(value: RelationshipInterest*): Self = StObject.set(x, "relationshipInterests", js.Array(value*))
    
    inline def setRelationshipStatuses(value: js.Array[RelationshipStatus]): Self = StObject.set(x, "relationshipStatuses", value.asInstanceOf[js.Any])
    
    inline def setRelationshipStatusesUndefined: Self = StObject.set(x, "relationshipStatuses", js.undefined)
    
    inline def setRelationshipStatusesVarargs(value: RelationshipStatus*): Self = StObject.set(x, "relationshipStatuses", js.Array(value*))
    
    inline def setResidences(value: js.Array[Residence]): Self = StObject.set(x, "residences", value.asInstanceOf[js.Any])
    
    inline def setResidencesUndefined: Self = StObject.set(x, "residences", js.undefined)
    
    inline def setResidencesVarargs(value: Residence*): Self = StObject.set(x, "residences", js.Array(value*))
    
    inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    inline def setSipAddresses(value: js.Array[SipAddress]): Self = StObject.set(x, "sipAddresses", value.asInstanceOf[js.Any])
    
    inline def setSipAddressesUndefined: Self = StObject.set(x, "sipAddresses", js.undefined)
    
    inline def setSipAddressesVarargs(value: SipAddress*): Self = StObject.set(x, "sipAddresses", js.Array(value*))
    
    inline def setSkills(value: js.Array[Skill]): Self = StObject.set(x, "skills", value.asInstanceOf[js.Any])
    
    inline def setSkillsUndefined: Self = StObject.set(x, "skills", js.undefined)
    
    inline def setSkillsVarargs(value: Skill*): Self = StObject.set(x, "skills", js.Array(value*))
    
    inline def setTaglines(value: js.Array[Tagline]): Self = StObject.set(x, "taglines", value.asInstanceOf[js.Any])
    
    inline def setTaglinesUndefined: Self = StObject.set(x, "taglines", js.undefined)
    
    inline def setTaglinesVarargs(value: Tagline*): Self = StObject.set(x, "taglines", js.Array(value*))
    
    inline def setUrls(value: js.Array[Url]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    inline def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
    
    inline def setUrlsVarargs(value: Url*): Self = StObject.set(x, "urls", js.Array(value*))
    
    inline def setUserDefined(value: js.Array[UserDefined]): Self = StObject.set(x, "userDefined", value.asInstanceOf[js.Any])
    
    inline def setUserDefinedUndefined: Self = StObject.set(x, "userDefined", js.undefined)
    
    inline def setUserDefinedVarargs(value: UserDefined*): Self = StObject.set(x, "userDefined", js.Array(value*))
  }
}
