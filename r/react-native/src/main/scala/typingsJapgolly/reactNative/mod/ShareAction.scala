package typingsJapgolly.reactNative.mod

import typingsJapgolly.reactNative.reactNativeStrings.dismissedAction
import typingsJapgolly.reactNative.reactNativeStrings.sharedAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactNative.mod.ShareSharedAction
  - typingsJapgolly.reactNative.mod.ShareDismissedAction
*/
trait ShareAction extends js.Object

object ShareAction {
  @scala.inline
  def ShareSharedAction(action: sharedAction, activityType: String = null): ShareAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    if (activityType != null) __obj.updateDynamic("activityType")(activityType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareAction]
  }
  @scala.inline
  def ShareDismissedAction(action: dismissedAction): ShareAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ShareAction]
  }
}

