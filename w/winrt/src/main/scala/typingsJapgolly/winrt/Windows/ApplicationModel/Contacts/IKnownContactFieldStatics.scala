package typingsJapgolly.winrt.Windows.ApplicationModel.Contacts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKnownContactFieldStatics extends js.Object {
  var email: String
  var instantMessage: String
  var location: String
  var phoneNumber: String
  def convertNameToType(name: String): ContactFieldType
  def convertTypeToName(`type`: ContactFieldType): String
}

object IKnownContactFieldStatics {
  @scala.inline
  def apply(
    convertNameToType: String => CallbackTo[ContactFieldType],
    convertTypeToName: ContactFieldType => CallbackTo[String],
    email: String,
    instantMessage: String,
    location: String,
    phoneNumber: String
  ): IKnownContactFieldStatics = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], instantMessage = instantMessage.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any])
    __obj.updateDynamic("convertNameToType")(js.Any.fromFunction1((t0: java.lang.String) => convertNameToType(t0).runNow()))
    __obj.updateDynamic("convertTypeToName")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.ApplicationModel.Contacts.ContactFieldType) => convertTypeToName(t0).runNow()))
    __obj.asInstanceOf[IKnownContactFieldStatics]
  }
}

