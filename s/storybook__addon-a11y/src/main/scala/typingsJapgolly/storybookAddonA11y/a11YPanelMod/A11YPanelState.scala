package typingsJapgolly.storybookAddonA11y.a11YPanelMod

import typingsJapgolly.axeCore.mod.Result
import typingsJapgolly.storybookAddonA11y.storybookAddonA11yStrings.error
import typingsJapgolly.storybookAddonA11y.storybookAddonA11yStrings.ran
import typingsJapgolly.storybookAddonA11y.storybookAddonA11yStrings.ready
import typingsJapgolly.storybookAddonA11y.storybookAddonA11yStrings.running
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.storybookAddonA11y.a11YPanelMod.A11YPanelNormalState
  - typingsJapgolly.storybookAddonA11y.a11YPanelMod.A11YPanelErrorState
*/
trait A11YPanelState extends js.Object

object A11YPanelState {
  @scala.inline
  def A11YPanelNormalState(
    incomplete: js.Array[Result],
    passes: js.Array[Result],
    status: ready | ran | running,
    violations: js.Array[Result]
  ): A11YPanelState = {
    val __obj = js.Dynamic.literal(incomplete = incomplete.asInstanceOf[js.Any], passes = passes.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], violations = violations.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[A11YPanelState]
  }
  @scala.inline
  def A11YPanelErrorState(error: js.Any, status: error): A11YPanelState = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[A11YPanelState]
  }
}

