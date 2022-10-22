package typingsJapgolly.firefoxWebextBrowser.browser.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnRemovedRemoveInfo extends StObject {
  
  /** True when the tab is being closed because its window is being closed. */
  var isWindowClosing: Boolean
  
  /** The window whose tab is closed. */
  var windowId: Double
}
object OnRemovedRemoveInfo {
  
  inline def apply(isWindowClosing: Boolean, windowId: Double): OnRemovedRemoveInfo = {
    val __obj = js.Dynamic.literal(isWindowClosing = isWindowClosing.asInstanceOf[js.Any], windowId = windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnRemovedRemoveInfo]
  }
  
  extension [Self <: OnRemovedRemoveInfo](x: Self) {
    
    inline def setIsWindowClosing(value: Boolean): Self = StObject.set(x, "isWindowClosing", value.asInstanceOf[js.Any])
    
    inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
  }
}
