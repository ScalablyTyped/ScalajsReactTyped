package typingsJapgolly.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactNative.mod.ShareSharedAction
  - typingsJapgolly.reactNative.mod.ShareDismissedAction
*/
trait ShareAction extends StObject
object ShareAction {
  
  inline def ShareDismissedAction(): typingsJapgolly.reactNative.mod.ShareDismissedAction = {
    val __obj = js.Dynamic.literal(action = "dismissedAction")
    __obj.asInstanceOf[typingsJapgolly.reactNative.mod.ShareDismissedAction]
  }
  
  inline def ShareSharedAction(): typingsJapgolly.reactNative.mod.ShareSharedAction = {
    val __obj = js.Dynamic.literal(action = "sharedAction")
    __obj.asInstanceOf[typingsJapgolly.reactNative.mod.ShareSharedAction]
  }
}
