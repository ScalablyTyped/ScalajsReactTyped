package typingsJapgolly.gapiAuth2.gapi.auth2

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicProfile extends js.Object {
  def getEmail(): String
  def getFamilyName(): String
  def getGivenName(): String
  def getId(): String
  def getImageUrl(): String
  def getName(): String
}

object BasicProfile {
  @scala.inline
  def apply(
    getEmail: CallbackTo[String],
    getFamilyName: CallbackTo[String],
    getGivenName: CallbackTo[String],
    getId: CallbackTo[String],
    getImageUrl: CallbackTo[String],
    getName: CallbackTo[String]
  ): BasicProfile = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getEmail")(getEmail.toJsFn)
    __obj.updateDynamic("getFamilyName")(getFamilyName.toJsFn)
    __obj.updateDynamic("getGivenName")(getGivenName.toJsFn)
    __obj.updateDynamic("getId")(getId.toJsFn)
    __obj.updateDynamic("getImageUrl")(getImageUrl.toJsFn)
    __obj.updateDynamic("getName")(getName.toJsFn)
    __obj.asInstanceOf[BasicProfile]
  }
}

