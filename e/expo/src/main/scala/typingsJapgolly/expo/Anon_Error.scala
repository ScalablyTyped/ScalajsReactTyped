package typingsJapgolly.expo

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.expo.buildAuthSessionMod.AuthSessionResult
import typingsJapgolly.expo.expoStrings.error
import typingsJapgolly.expo.expoStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends AuthSessionResult {
  var errorCode: String | Null
  var params: StringDictionary[String]
  var `type`: error | success
  var url: String
}

object Anon_Error {
  @scala.inline
  def apply(params: StringDictionary[String], `type`: error | success, url: String, errorCode: String = null): Anon_Error = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Error]
  }
}

