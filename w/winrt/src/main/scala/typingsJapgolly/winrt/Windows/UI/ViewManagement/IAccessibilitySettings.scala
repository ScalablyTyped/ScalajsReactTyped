package typingsJapgolly.winrt.Windows.UI.ViewManagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccessibilitySettings extends js.Object {
  var highContrast: Boolean
  var highContrastScheme: String
  var onhighcontrastchanged: js.Any
}

object IAccessibilitySettings {
  @scala.inline
  def apply(highContrast: Boolean, highContrastScheme: String, onhighcontrastchanged: js.Any): IAccessibilitySettings = {
    val __obj = js.Dynamic.literal(highContrast = highContrast.asInstanceOf[js.Any], highContrastScheme = highContrastScheme.asInstanceOf[js.Any], onhighcontrastchanged = onhighcontrastchanged.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IAccessibilitySettings]
  }
}

