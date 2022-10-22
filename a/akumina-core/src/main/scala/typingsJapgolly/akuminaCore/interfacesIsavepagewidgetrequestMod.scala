package typingsJapgolly.akuminaCore

import typingsJapgolly.akuminaCore.interfacesIpagewidgetMod.IPageWidget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesIsavepagewidgetrequestMod {
  
  trait ISavePageWidgetRequest extends StObject {
    
    var pageId: String
    
    var pageWidgets: js.Array[IPageWidget]
  }
  object ISavePageWidgetRequest {
    
    inline def apply(pageId: String, pageWidgets: js.Array[IPageWidget]): ISavePageWidgetRequest = {
      val __obj = js.Dynamic.literal(pageId = pageId.asInstanceOf[js.Any], pageWidgets = pageWidgets.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISavePageWidgetRequest]
    }
    
    extension [Self <: ISavePageWidgetRequest](x: Self) {
      
      inline def setPageId(value: String): Self = StObject.set(x, "pageId", value.asInstanceOf[js.Any])
      
      inline def setPageWidgets(value: js.Array[IPageWidget]): Self = StObject.set(x, "pageWidgets", value.asInstanceOf[js.Any])
      
      inline def setPageWidgetsVarargs(value: IPageWidget*): Self = StObject.set(x, "pageWidgets", js.Array(value*))
    }
  }
}
