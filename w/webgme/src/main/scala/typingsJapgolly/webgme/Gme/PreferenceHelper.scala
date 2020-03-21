package typingsJapgolly.webgme.Gme

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreferenceHelper extends js.Object {
  def getPreferences(): PreferenceHelper
}

object PreferenceHelper {
  @scala.inline
  def apply(getPreferences: CallbackTo[PreferenceHelper]): PreferenceHelper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getPreferences")(getPreferences.toJsFn)
    __obj.asInstanceOf[PreferenceHelper]
  }
}

