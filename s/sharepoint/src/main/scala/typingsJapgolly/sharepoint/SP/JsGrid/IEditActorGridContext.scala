package typingsJapgolly.sharepoint.SP.JsGrid

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.microsoftAjax.Sys.UI.DomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEditActorGridContext extends StObject {
  
  def OnKeyDown(domEvent: DomEvent): Unit
  
  var RTL: Any
  
  var bLightFocus: Boolean
  
  var emptyValue: Any
  
  var jsGridObj: JsGridControl
  
  var parentNode: HTMLElement
  
  var styleManager: IStyleManager
}
object IEditActorGridContext {
  
  inline def apply(
    OnKeyDown: DomEvent => Callback,
    RTL: Any,
    bLightFocus: Boolean,
    emptyValue: Any,
    jsGridObj: JsGridControl,
    parentNode: HTMLElement,
    styleManager: IStyleManager
  ): IEditActorGridContext = {
    val __obj = js.Dynamic.literal(OnKeyDown = js.Any.fromFunction1((t0: DomEvent) => OnKeyDown(t0).runNow()), RTL = RTL.asInstanceOf[js.Any], bLightFocus = bLightFocus.asInstanceOf[js.Any], emptyValue = emptyValue.asInstanceOf[js.Any], jsGridObj = jsGridObj.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], styleManager = styleManager.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditActorGridContext]
  }
  
  extension [Self <: IEditActorGridContext](x: Self) {
    
    inline def setBLightFocus(value: Boolean): Self = StObject.set(x, "bLightFocus", value.asInstanceOf[js.Any])
    
    inline def setEmptyValue(value: Any): Self = StObject.set(x, "emptyValue", value.asInstanceOf[js.Any])
    
    inline def setJsGridObj(value: JsGridControl): Self = StObject.set(x, "jsGridObj", value.asInstanceOf[js.Any])
    
    inline def setOnKeyDown(value: DomEvent => Callback): Self = StObject.set(x, "OnKeyDown", js.Any.fromFunction1((t0: DomEvent) => value(t0).runNow()))
    
    inline def setParentNode(value: HTMLElement): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
    
    inline def setRTL(value: Any): Self = StObject.set(x, "RTL", value.asInstanceOf[js.Any])
    
    inline def setStyleManager(value: IStyleManager): Self = StObject.set(x, "styleManager", value.asInstanceOf[js.Any])
  }
}
