package typingsJapgolly.expo

import typingsJapgolly.expo.buildAuthSessionMod.AuthSessionResult
import typingsJapgolly.expo.expoStrings.cancel
import typingsJapgolly.expo.expoStrings.dismiss
import typingsJapgolly.expo.expoStrings.locked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cancel extends AuthSessionResult {
  var `type`: cancel | dismiss | locked
}

object Anon_Cancel {
  @scala.inline
  def apply(`type`: cancel | dismiss | locked): Anon_Cancel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Cancel]
  }
}

