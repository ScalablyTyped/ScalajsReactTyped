package typingsJapgolly.naverWhale.whale.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabActiveInfo extends StObject {
  
  /** The ID of the tab that has become active. */
  var tabId: Double
  
  /** The ID of the window the active tab changed inside of. */
  var windowId: Double
}
object TabActiveInfo {
  
  inline def apply(tabId: Double, windowId: Double): TabActiveInfo = {
    val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any], windowId = windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabActiveInfo]
  }
  
  extension [Self <: TabActiveInfo](x: Self) {
    
    inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    
    inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
  }
}
