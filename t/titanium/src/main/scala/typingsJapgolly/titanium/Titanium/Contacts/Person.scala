package typingsJapgolly.titanium.Titanium.Contacts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.titanium.Titanium.Blob
import typingsJapgolly.titanium.Titanium.Proxy
import typingsJapgolly.titanium.Titanium.UI.TabGroup
import typingsJapgolly.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * An object that represents a contact record for a person or organization in the system contacts
		 * address book.
		 */
trait Person extends Proxy {
  /**
  			 * Addresses for the person. Multi-value. Read-only on Android.
  			 */
  var address: js.Any
  /**
  			 * Alternate birthday of the person. Single Dictionary.
  			 */
  var alternateBirthday: js.Any
  /**
  			 * Date of birth of the person. Single value.
  			 */
  var birthday: String
  /**
  			 * Date and time that the person record was created. Single value. Deprecated since iOS 9.
  			 */
  val created: String
  /**
  			 * Dates associated with the person. Multi-value.
  			 */
  var date: js.Any
  /**
  			 * Department of the person. Single value.
  			 */
  var department: String
  /**
  			 * Email addresses for the person. Multi-value. Read-only on Android.
  			 */
  var email: js.Any
  /**
  			 * First name of the person. Single value.
  			 */
  var firstName: String
  /**
  			 * Phonetic first name of the person.  Single value.
  			 */
  var firstPhonetic: String
  /**
  			 * Localized full name of the person. Single value. Read-only on Android.
  			 */
  val fullName: String
  /**
  			 * Record identifier of the person. Single value.
  			 */
  val id: Double
  /**
  			 * Identifier of the person.
  			 */
  val identifier: String
  /**
  			 * Image for the person. Single value. Read-only for >= iOS9
  			 */
  var image: Blob
  /**
  			 * Instant messenger information of the person. Multi-value.
  			 */
  var instantMessage: js.Any
  /**
  			 * Job title of the person. Single value.
  			 */
  var jobTitle: String
  /**
  			 * Determines the type of information the person record contains; either person or organization.
  			 * Read-only on Android.
  			 */
  var kind: Double
  /**
  			 * Last name of the person. Single value.
  			 */
  var lastName: String
  /**
  			 * Phonetic last name of the person. Single value.
  			 */
  var lastPhonetic: String
  /**
  			 * Middle name of the person. Single value.
  			 */
  var middleName: String
  /**
  			 * Phonetic middle name of the person. Single value.
  			 */
  var middlePhonetic: String
  /**
  			 * Date and time that the person record was last modified. Single value. Deprecated since iOS 9.
  			 */
  val modified: String
  /**
  			 * Nickname of the person. Single value.
  			 */
  var nickname: String
  /**
  			 * Notes for the person. Single value.
  			 */
  var note: String
  /**
  			 * Organization to which the person belongs. Single value.
  			 */
  var organization: String
  /**
  			 * Phone numbers for the person. Multi-value. Read-only on Android.
  			 */
  var phone: js.Any
  /**
  			 * Prefix for the person. Single value.
  			 */
  val prefix: String
  /**
  			 * Record identifier of the person. Single value. Deprecated since iOS 9.
  			 */
  var recordId: Double
  /**
  			 * Names of people to which the person is related. Multi-value.
  			 */
  var relatedNames: js.Any
  /**
  			 * Social profile information of the person. Multi-value.
  			 */
  var socialProfile: js.Any
  /**
  			 * Suffix for the person. Single value.
  			 */
  val suffix: String
  /**
  			 * URLs of webpages associated with the person. Multi-value.
  			 */
  var url: js.Any
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.address> property.
  			 */
  def getAddress(): js.Any
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.alternateBirthday> property.
  			 */
  def getAlternateBirthday(): js.Any
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.birthday> property.
  			 */
  def getBirthday(): String
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.created> property.
  			 */
  def getCreated(): String
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.date> property.
  			 */
  def getDate(): js.Any
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.department> property.
  			 */
  def getDepartment(): String
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.email> property.
  			 */
  def getEmail(): js.Any
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.firstName> property.
  			 */
  def getFirstName(): String
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.firstPhonetic> property.
  			 */
  def getFirstPhonetic(): String
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.fullName> property.
  			 */
  def getFullName(): String
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.id> property.
  			 */
  def getId(): Double
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.identifier> property.
  			 */
  def getIdentifier(): String
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.image> property.
  			 */
  def getImage(): Blob
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.instantMessage> property.
  			 */
  def getInstantMessage(): js.Any
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.jobTitle> property.
  			 */
  def getJobTitle(): String
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.kind> property.
  			 */
  def getKind(): Double
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.lastName> property.
  			 */
  def getLastName(): String
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.lastPhonetic> property.
  			 */
  def getLastPhonetic(): String
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.middleName> property.
  			 */
  def getMiddleName(): String
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.middlePhonetic> property.
  			 */
  def getMiddlePhonetic(): String
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.modified> property.
  			 */
  def getModified(): String
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.nickname> property.
  			 */
  def getNickname(): String
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.note> property.
  			 */
  def getNote(): String
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.organization> property.
  			 */
  def getOrganization(): String
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.phone> property.
  			 */
  def getPhone(): js.Any
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.prefix> property.
  			 */
  def getPrefix(): String
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.recordId> property.
  			 */
  def getRecordId(): Double
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.relatedNames> property.
  			 */
  def getRelatedNames(): js.Any
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.socialProfile> property.
  			 */
  def getSocialProfile(): js.Any
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.suffix> property.
  			 */
  def getSuffix(): String
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.url> property.
  			 */
  def getUrl(): js.Any
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.address> property.
  			 */
  def setAddress(address: js.Any): Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.alternateBirthday> property.
  			 */
  def setAlternateBirthday(alternateBirthday: js.Any): Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.birthday> property.
  			 */
  def setBirthday(birthday: String): Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.date> property.
  			 */
  def setDate(date: js.Any): Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.department> property.
  			 */
  def setDepartment(department: String): Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.email> property.
  			 */
  def setEmail(email: js.Any): Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.firstName> property.
  			 */
  def setFirstName(firstName: String): Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.firstPhonetic> property.
  			 */
  def setFirstPhonetic(firstPhonetic: String): Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.image> property.
  			 */
  def setImage(image: Blob): Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.instantMessage> property.
  			 */
  def setInstantMessage(instantMessage: js.Any): Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.jobTitle> property.
  			 */
  def setJobTitle(jobTitle: String): Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.kind> property.
  			 */
  def setKind(kind: Double): Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.lastName> property.
  			 */
  def setLastName(lastName: String): Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.lastPhonetic> property.
  			 */
  def setLastPhonetic(lastPhonetic: String): Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.middleName> property.
  			 */
  def setMiddleName(middleName: String): Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.middlePhonetic> property.
  			 */
  def setMiddlePhonetic(middlePhonetic: String): Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.nickname> property.
  			 */
  def setNickname(nickname: String): Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.note> property.
  			 */
  def setNote(note: String): Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.organization> property.
  			 */
  def setOrganization(organization: String): Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.phone> property.
  			 */
  def setPhone(phone: js.Any): Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.recordId> property.
  			 */
  def setRecordId(recordId: Double): Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.relatedNames> property.
  			 */
  def setRelatedNames(relatedNames: js.Any): Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.socialProfile> property.
  			 */
  def setSocialProfile(socialProfile: js.Any): Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.url> property.
  			 */
  def setUrl(url: js.Any): Unit
}

object Person {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    address: js.Any,
    alternateBirthday: js.Any,
    apiName: String,
    applyProperties: js.Any => Callback,
    birthday: String,
    bubbleParent: Boolean,
    created: String,
    date: js.Any,
    department: String,
    email: js.Any,
    fireEvent: (String, js.Any) => Callback,
    firstName: String,
    firstPhonetic: String,
    fullName: String,
    getAddress: CallbackTo[js.Any],
    getAlternateBirthday: CallbackTo[js.Any],
    getApiName: CallbackTo[String],
    getBirthday: CallbackTo[String],
    getBubbleParent: CallbackTo[Boolean],
    getCreated: CallbackTo[String],
    getDate: CallbackTo[js.Any],
    getDepartment: CallbackTo[String],
    getEmail: CallbackTo[js.Any],
    getFirstName: CallbackTo[String],
    getFirstPhonetic: CallbackTo[String],
    getFullName: CallbackTo[String],
    getId: CallbackTo[Double],
    getIdentifier: CallbackTo[String],
    getImage: CallbackTo[Blob],
    getInstantMessage: CallbackTo[js.Any],
    getJobTitle: CallbackTo[String],
    getKind: CallbackTo[Double],
    getLastName: CallbackTo[String],
    getLastPhonetic: CallbackTo[String],
    getMiddleName: CallbackTo[String],
    getMiddlePhonetic: CallbackTo[String],
    getModified: CallbackTo[String],
    getNickname: CallbackTo[String],
    getNote: CallbackTo[String],
    getOrganization: CallbackTo[String],
    getPhone: CallbackTo[js.Any],
    getPrefix: CallbackTo[String],
    getRecordId: CallbackTo[Double],
    getRelatedNames: CallbackTo[js.Any],
    getSocialProfile: CallbackTo[js.Any],
    getSuffix: CallbackTo[String],
    getUrl: CallbackTo[js.Any],
    id: Double,
    identifier: String,
    image: Blob,
    instantMessage: js.Any,
    jobTitle: String,
    kind: Double,
    lastName: String,
    lastPhonetic: String,
    middleName: String,
    middlePhonetic: String,
    modified: String,
    nickname: String,
    note: String,
    organization: String,
    phone: js.Any,
    prefix: String,
    recordId: Double,
    relatedNames: js.Any,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    setAddress: js.Any => Callback,
    setAlternateBirthday: js.Any => Callback,
    setBirthday: String => Callback,
    setBubbleParent: Boolean => Callback,
    setDate: js.Any => Callback,
    setDepartment: String => Callback,
    setEmail: js.Any => Callback,
    setFirstName: String => Callback,
    setFirstPhonetic: String => Callback,
    setImage: Blob => Callback,
    setInstantMessage: js.Any => Callback,
    setJobTitle: String => Callback,
    setKind: Double => Callback,
    setLastName: String => Callback,
    setLastPhonetic: String => Callback,
    setMiddleName: String => Callback,
    setMiddlePhonetic: String => Callback,
    setNickname: String => Callback,
    setNote: String => Callback,
    setOrganization: String => Callback,
    setPhone: js.Any => Callback,
    setRecordId: Double => Callback,
    setRelatedNames: js.Any => Callback,
    setSocialProfile: js.Any => Callback,
    setUrl: js.Any => Callback,
    socialProfile: js.Any,
    suffix: String,
    url: js.Any,
    getLifecycleContainer: js.UndefOr[CallbackTo[Window | TabGroup]] = js.undefined,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): Person = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], alternateBirthday = alternateBirthday.asInstanceOf[js.Any], apiName = apiName.asInstanceOf[js.Any], birthday = birthday.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], department = department.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], firstName = firstName.asInstanceOf[js.Any], firstPhonetic = firstPhonetic.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], instantMessage = instantMessage.asInstanceOf[js.Any], jobTitle = jobTitle.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any], lastPhonetic = lastPhonetic.asInstanceOf[js.Any], middleName = middleName.asInstanceOf[js.Any], middlePhonetic = middlePhonetic.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], recordId = recordId.asInstanceOf[js.Any], relatedNames = relatedNames.asInstanceOf[js.Any], socialProfile = socialProfile.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getAddress")(getAddress.toJsFn)
    __obj.updateDynamic("getAlternateBirthday")(getAlternateBirthday.toJsFn)
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getBirthday")(getBirthday.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("getCreated")(getCreated.toJsFn)
    __obj.updateDynamic("getDate")(getDate.toJsFn)
    __obj.updateDynamic("getDepartment")(getDepartment.toJsFn)
    __obj.updateDynamic("getEmail")(getEmail.toJsFn)
    __obj.updateDynamic("getFirstName")(getFirstName.toJsFn)
    __obj.updateDynamic("getFirstPhonetic")(getFirstPhonetic.toJsFn)
    __obj.updateDynamic("getFullName")(getFullName.toJsFn)
    __obj.updateDynamic("getId")(getId.toJsFn)
    __obj.updateDynamic("getIdentifier")(getIdentifier.toJsFn)
    __obj.updateDynamic("getImage")(getImage.toJsFn)
    __obj.updateDynamic("getInstantMessage")(getInstantMessage.toJsFn)
    __obj.updateDynamic("getJobTitle")(getJobTitle.toJsFn)
    __obj.updateDynamic("getKind")(getKind.toJsFn)
    __obj.updateDynamic("getLastName")(getLastName.toJsFn)
    __obj.updateDynamic("getLastPhonetic")(getLastPhonetic.toJsFn)
    __obj.updateDynamic("getMiddleName")(getMiddleName.toJsFn)
    __obj.updateDynamic("getMiddlePhonetic")(getMiddlePhonetic.toJsFn)
    __obj.updateDynamic("getModified")(getModified.toJsFn)
    __obj.updateDynamic("getNickname")(getNickname.toJsFn)
    __obj.updateDynamic("getNote")(getNote.toJsFn)
    __obj.updateDynamic("getOrganization")(getOrganization.toJsFn)
    __obj.updateDynamic("getPhone")(getPhone.toJsFn)
    __obj.updateDynamic("getPrefix")(getPrefix.toJsFn)
    __obj.updateDynamic("getRecordId")(getRecordId.toJsFn)
    __obj.updateDynamic("getRelatedNames")(getRelatedNames.toJsFn)
    __obj.updateDynamic("getSocialProfile")(getSocialProfile.toJsFn)
    __obj.updateDynamic("getSuffix")(getSuffix.toJsFn)
    __obj.updateDynamic("getUrl")(getUrl.toJsFn)
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("setAddress")(js.Any.fromFunction1((t0: js.Any) => setAddress(t0).runNow()))
    __obj.updateDynamic("setAlternateBirthday")(js.Any.fromFunction1((t0: js.Any) => setAlternateBirthday(t0).runNow()))
    __obj.updateDynamic("setBirthday")(js.Any.fromFunction1((t0: java.lang.String) => setBirthday(t0).runNow()))
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    __obj.updateDynamic("setDate")(js.Any.fromFunction1((t0: js.Any) => setDate(t0).runNow()))
    __obj.updateDynamic("setDepartment")(js.Any.fromFunction1((t0: java.lang.String) => setDepartment(t0).runNow()))
    __obj.updateDynamic("setEmail")(js.Any.fromFunction1((t0: js.Any) => setEmail(t0).runNow()))
    __obj.updateDynamic("setFirstName")(js.Any.fromFunction1((t0: java.lang.String) => setFirstName(t0).runNow()))
    __obj.updateDynamic("setFirstPhonetic")(js.Any.fromFunction1((t0: java.lang.String) => setFirstPhonetic(t0).runNow()))
    __obj.updateDynamic("setImage")(js.Any.fromFunction1((t0: typingsJapgolly.titanium.Titanium.Blob) => setImage(t0).runNow()))
    __obj.updateDynamic("setInstantMessage")(js.Any.fromFunction1((t0: js.Any) => setInstantMessage(t0).runNow()))
    __obj.updateDynamic("setJobTitle")(js.Any.fromFunction1((t0: java.lang.String) => setJobTitle(t0).runNow()))
    __obj.updateDynamic("setKind")(js.Any.fromFunction1((t0: scala.Double) => setKind(t0).runNow()))
    __obj.updateDynamic("setLastName")(js.Any.fromFunction1((t0: java.lang.String) => setLastName(t0).runNow()))
    __obj.updateDynamic("setLastPhonetic")(js.Any.fromFunction1((t0: java.lang.String) => setLastPhonetic(t0).runNow()))
    __obj.updateDynamic("setMiddleName")(js.Any.fromFunction1((t0: java.lang.String) => setMiddleName(t0).runNow()))
    __obj.updateDynamic("setMiddlePhonetic")(js.Any.fromFunction1((t0: java.lang.String) => setMiddlePhonetic(t0).runNow()))
    __obj.updateDynamic("setNickname")(js.Any.fromFunction1((t0: java.lang.String) => setNickname(t0).runNow()))
    __obj.updateDynamic("setNote")(js.Any.fromFunction1((t0: java.lang.String) => setNote(t0).runNow()))
    __obj.updateDynamic("setOrganization")(js.Any.fromFunction1((t0: java.lang.String) => setOrganization(t0).runNow()))
    __obj.updateDynamic("setPhone")(js.Any.fromFunction1((t0: js.Any) => setPhone(t0).runNow()))
    __obj.updateDynamic("setRecordId")(js.Any.fromFunction1((t0: scala.Double) => setRecordId(t0).runNow()))
    __obj.updateDynamic("setRelatedNames")(js.Any.fromFunction1((t0: js.Any) => setRelatedNames(t0).runNow()))
    __obj.updateDynamic("setSocialProfile")(js.Any.fromFunction1((t0: js.Any) => setSocialProfile(t0).runNow()))
    __obj.updateDynamic("setUrl")(js.Any.fromFunction1((t0: js.Any) => setUrl(t0).runNow()))
    getLifecycleContainer.foreach(p => __obj.updateDynamic("getLifecycleContainer")(p.toJsFn))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Person]
  }
}

