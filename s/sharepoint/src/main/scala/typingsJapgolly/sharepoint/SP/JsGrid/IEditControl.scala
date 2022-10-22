package typingsJapgolly.sharepoint.SP.JsGrid

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.microsoftAjax.Sys.UI.DomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEditControl extends StObject {
  
  def BindToCell(cellContext: IEditControlCellContext): Unit
  
  def Dispose(): Unit
  
  var Focus: js.UndefOr[js.Function1[/* eventInfo */ DomEvent, Unit]] = js.undefined
  
  var GetCellContext: js.UndefOr[js.Function0[IEditControlCellContext]] = js.undefined
  
  var GetInputElement: js.UndefOr[js.Function0[HTMLElement]] = js.undefined
  
  var GetOriginalValue: js.UndefOr[js.Function0[IValue]] = js.undefined
  
  var IsCurrentlyUsingGridTextInputElement: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  def OnBeginEdit(eventInfo: DomEvent): Unit
  
  var OnCellMove: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  def OnEndEdit(): Unit
  
  var OnValueChanged: js.UndefOr[js.Function1[/* newValue */ IValue, Unit]] = js.undefined
  
  var SetSize: js.UndefOr[js.Function2[/* width */ Double, /* height */ Double, Unit]] = js.undefined
  
  var SetValue: js.UndefOr[js.Function1[/* value */ IValue, Unit]] = js.undefined
  
  var SupportedReadMode: js.UndefOr[EditActorReadType] = js.undefined
  
  var SupportedWriteMode: js.UndefOr[EditActorWriteType] = js.undefined
  
  def Unbind(): Unit
}
object IEditControl {
  
  inline def apply(
    BindToCell: IEditControlCellContext => Callback,
    Dispose: Callback,
    OnBeginEdit: DomEvent => Callback,
    OnEndEdit: Callback,
    Unbind: Callback
  ): IEditControl = {
    val __obj = js.Dynamic.literal(BindToCell = js.Any.fromFunction1((t0: IEditControlCellContext) => BindToCell(t0).runNow()), Dispose = Dispose.toJsFn, OnBeginEdit = js.Any.fromFunction1((t0: DomEvent) => OnBeginEdit(t0).runNow()), OnEndEdit = OnEndEdit.toJsFn, Unbind = Unbind.toJsFn)
    __obj.asInstanceOf[IEditControl]
  }
  
  extension [Self <: IEditControl](x: Self) {
    
    inline def setBindToCell(value: IEditControlCellContext => Callback): Self = StObject.set(x, "BindToCell", js.Any.fromFunction1((t0: IEditControlCellContext) => value(t0).runNow()))
    
    inline def setDispose(value: Callback): Self = StObject.set(x, "Dispose", value.toJsFn)
    
    inline def setFocus(value: /* eventInfo */ DomEvent => Callback): Self = StObject.set(x, "Focus", js.Any.fromFunction1((t0: /* eventInfo */ DomEvent) => value(t0).runNow()))
    
    inline def setFocusUndefined: Self = StObject.set(x, "Focus", js.undefined)
    
    inline def setGetCellContext(value: CallbackTo[IEditControlCellContext]): Self = StObject.set(x, "GetCellContext", value.toJsFn)
    
    inline def setGetCellContextUndefined: Self = StObject.set(x, "GetCellContext", js.undefined)
    
    inline def setGetInputElement(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "GetInputElement", value.toJsFn)
    
    inline def setGetInputElementUndefined: Self = StObject.set(x, "GetInputElement", js.undefined)
    
    inline def setGetOriginalValue(value: CallbackTo[IValue]): Self = StObject.set(x, "GetOriginalValue", value.toJsFn)
    
    inline def setGetOriginalValueUndefined: Self = StObject.set(x, "GetOriginalValue", js.undefined)
    
    inline def setIsCurrentlyUsingGridTextInputElement(value: CallbackTo[Boolean]): Self = StObject.set(x, "IsCurrentlyUsingGridTextInputElement", value.toJsFn)
    
    inline def setIsCurrentlyUsingGridTextInputElementUndefined: Self = StObject.set(x, "IsCurrentlyUsingGridTextInputElement", js.undefined)
    
    inline def setOnBeginEdit(value: DomEvent => Callback): Self = StObject.set(x, "OnBeginEdit", js.Any.fromFunction1((t0: DomEvent) => value(t0).runNow()))
    
    inline def setOnCellMove(value: Callback): Self = StObject.set(x, "OnCellMove", value.toJsFn)
    
    inline def setOnCellMoveUndefined: Self = StObject.set(x, "OnCellMove", js.undefined)
    
    inline def setOnEndEdit(value: Callback): Self = StObject.set(x, "OnEndEdit", value.toJsFn)
    
    inline def setOnValueChanged(value: /* newValue */ IValue => Callback): Self = StObject.set(x, "OnValueChanged", js.Any.fromFunction1((t0: /* newValue */ IValue) => value(t0).runNow()))
    
    inline def setOnValueChangedUndefined: Self = StObject.set(x, "OnValueChanged", js.undefined)
    
    inline def setSetSize(value: (/* width */ Double, /* height */ Double) => Callback): Self = StObject.set(x, "SetSize", js.Any.fromFunction2((t0: /* width */ Double, t1: /* height */ Double) => (value(t0, t1)).runNow()))
    
    inline def setSetSizeUndefined: Self = StObject.set(x, "SetSize", js.undefined)
    
    inline def setSetValue(value: /* value */ IValue => Callback): Self = StObject.set(x, "SetValue", js.Any.fromFunction1((t0: /* value */ IValue) => value(t0).runNow()))
    
    inline def setSetValueUndefined: Self = StObject.set(x, "SetValue", js.undefined)
    
    inline def setSupportedReadMode(value: EditActorReadType): Self = StObject.set(x, "SupportedReadMode", value.asInstanceOf[js.Any])
    
    inline def setSupportedReadModeUndefined: Self = StObject.set(x, "SupportedReadMode", js.undefined)
    
    inline def setSupportedWriteMode(value: EditActorWriteType): Self = StObject.set(x, "SupportedWriteMode", value.asInstanceOf[js.Any])
    
    inline def setSupportedWriteModeUndefined: Self = StObject.set(x, "SupportedWriteMode", js.undefined)
    
    inline def setUnbind(value: Callback): Self = StObject.set(x, "Unbind", value.toJsFn)
  }
}
