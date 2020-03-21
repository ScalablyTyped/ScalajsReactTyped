package typingsJapgolly.expo.authSessionMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.expo.expoStrings.cancel
import typingsJapgolly.expo.expoStrings.dismiss
import typingsJapgolly.expo.expoStrings.error
import typingsJapgolly.expo.expoStrings.locked
import typingsJapgolly.expo.expoStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.expo.AnonType
  - typingsJapgolly.expo.AnonErrorCode
*/
trait AuthSessionResult extends js.Object

object AuthSessionResult {
  @scala.inline
  def AnonType(`type`: cancel | dismiss | locked): AuthSessionResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthSessionResult]
  }
  @scala.inline
  def AnonErrorCode(params: StringDictionary[String], `type`: error | success, url: String, errorCode: String = null): AuthSessionResult = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthSessionResult]
  }
}

