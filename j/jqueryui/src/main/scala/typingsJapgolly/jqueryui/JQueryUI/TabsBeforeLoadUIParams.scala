package typingsJapgolly.jqueryui.JQueryUI

import typingsJapgolly.jquery.JQueryXHR
import typingsJapgolly.jqueryui.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabsBeforeLoadUIParams extends StObject {
  
  var ajaxSettings: Any
  
  var jqXHR: JQueryXHR
  
  var panel: JQuery
  
  var tab: JQuery
}
object TabsBeforeLoadUIParams {
  
  inline def apply(ajaxSettings: Any, jqXHR: JQueryXHR, panel: JQuery, tab: JQuery): TabsBeforeLoadUIParams = {
    val __obj = js.Dynamic.literal(ajaxSettings = ajaxSettings.asInstanceOf[js.Any], jqXHR = jqXHR.asInstanceOf[js.Any], panel = panel.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsBeforeLoadUIParams]
  }
  
  extension [Self <: TabsBeforeLoadUIParams](x: Self) {
    
    inline def setAjaxSettings(value: Any): Self = StObject.set(x, "ajaxSettings", value.asInstanceOf[js.Any])
    
    inline def setJqXHR(value: JQueryXHR): Self = StObject.set(x, "jqXHR", value.asInstanceOf[js.Any])
    
    inline def setPanel(value: JQuery): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
    
    inline def setTab(value: JQuery): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
  }
}
