package typingsJapgolly.webextensionPolyfill.namespacesWebNavigationMod.WebNavigation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about the tab to retrieve all frames from.
  */
trait GetAllFramesDetailsType extends StObject {
  
  /**
    * The ID of the tab.
    */
  var tabId: Double
}
object GetAllFramesDetailsType {
  
  inline def apply(tabId: Double): GetAllFramesDetailsType = {
    val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAllFramesDetailsType]
  }
  
  extension [Self <: GetAllFramesDetailsType](x: Self) {
    
    inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
  }
}
