package typingsJapgolly.storybookAddonA11y.a11YPanelMod

import typingsJapgolly.storybookAddonA11y.storybookAddonA11yStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait A11YPanelErrorState extends A11YPanelState {
  var error: js.Any
  var status: error
}

object A11YPanelErrorState {
  @scala.inline
  def apply(error: js.Any, status: error): A11YPanelErrorState = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[A11YPanelErrorState]
  }
}

