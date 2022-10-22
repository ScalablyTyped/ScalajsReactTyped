package typingsJapgolly.electron.Electron

import typingsJapgolly.electron.electronStrings.button
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationAction extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/notification-action
  /**
    * The label for the given action.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * The type of action, can be `button`.
    */
  var `type`: button
}
object NotificationAction {
  
  inline def apply(): NotificationAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("button")
    __obj.asInstanceOf[NotificationAction]
  }
  
  extension [Self <: NotificationAction](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setType(value: button): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
