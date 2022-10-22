package typingsJapgolly.sharepoint.SP.JsGrid

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.microsoftAjax.Sys.UI.DomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEditControlGridContext
  extends StObject
     with IEditActorGridContext {
  
  def OnActivateActor(): Unit
  
  def OnDeactivateActor(): Unit
}
object IEditControlGridContext {
  
  inline def apply(
    OnActivateActor: Callback,
    OnDeactivateActor: Callback,
    OnKeyDown: DomEvent => Callback,
    RTL: Any,
    bLightFocus: Boolean,
    emptyValue: Any,
    jsGridObj: JsGridControl,
    parentNode: HTMLElement,
    styleManager: IStyleManager
  ): IEditControlGridContext = {
    val __obj = js.Dynamic.literal(OnActivateActor = OnActivateActor.toJsFn, OnDeactivateActor = OnDeactivateActor.toJsFn, OnKeyDown = js.Any.fromFunction1((t0: DomEvent) => OnKeyDown(t0).runNow()), RTL = RTL.asInstanceOf[js.Any], bLightFocus = bLightFocus.asInstanceOf[js.Any], emptyValue = emptyValue.asInstanceOf[js.Any], jsGridObj = jsGridObj.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], styleManager = styleManager.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditControlGridContext]
  }
  
  extension [Self <: IEditControlGridContext](x: Self) {
    
    inline def setOnActivateActor(value: Callback): Self = StObject.set(x, "OnActivateActor", value.toJsFn)
    
    inline def setOnDeactivateActor(value: Callback): Self = StObject.set(x, "OnDeactivateActor", value.toJsFn)
  }
}
