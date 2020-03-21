package typingsJapgolly.sharepoint.SP.JsGrid

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.microsoftAjax.Sys.UI.DomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IEditControl extends js.Object {
  var Focus: js.UndefOr[js.Function1[/* eventInfo */ DomEvent, Unit]] = js.undefined
  var GetCellContext: js.UndefOr[js.Function0[IEditControlCellContext]] = js.undefined
  var GetInputElement: js.UndefOr[js.Function0[HTMLElement]] = js.undefined
  var GetOriginalValue: js.UndefOr[js.Function0[IValue]] = js.undefined
  var IsCurrentlyUsingGridTextInputElement: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var OnCellMove: js.UndefOr[js.Function0[Unit]] = js.undefined
  var OnValueChanged: js.UndefOr[js.Function1[/* newValue */ IValue, Unit]] = js.undefined
  var SetSize: js.UndefOr[js.Function2[/* width */ Double, /* height */ Double, Unit]] = js.undefined
  var SetValue: js.UndefOr[js.Function1[/* value */ IValue, Unit]] = js.undefined
  var SupportedReadMode: js.UndefOr[EditActorReadType] = js.undefined
  var SupportedWriteMode: js.UndefOr[EditActorWriteType] = js.undefined
  def BindToCell(cellContext: IEditControlCellContext): Unit
  def Dispose(): Unit
  def OnBeginEdit(eventInfo: DomEvent): Unit
  def OnEndEdit(): Unit
  def Unbind(): Unit
}

object IEditControl {
  @scala.inline
  def apply(
    BindToCell: IEditControlCellContext => Callback,
    Dispose: Callback,
    OnBeginEdit: DomEvent => Callback,
    OnEndEdit: Callback,
    Unbind: Callback,
    Focus: /* eventInfo */ DomEvent => Callback = null,
    GetCellContext: js.UndefOr[CallbackTo[IEditControlCellContext]] = js.undefined,
    GetInputElement: js.UndefOr[CallbackTo[HTMLElement]] = js.undefined,
    GetOriginalValue: js.UndefOr[CallbackTo[IValue]] = js.undefined,
    IsCurrentlyUsingGridTextInputElement: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    OnCellMove: js.UndefOr[Callback] = js.undefined,
    OnValueChanged: /* newValue */ IValue => Callback = null,
    SetSize: (/* width */ Double, /* height */ Double) => Callback = null,
    SetValue: /* value */ IValue => Callback = null,
    SupportedReadMode: EditActorReadType = null,
    SupportedWriteMode: EditActorWriteType = null
  ): IEditControl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BindToCell")(js.Any.fromFunction1((t0: typingsJapgolly.sharepoint.SP.JsGrid.IEditControlCellContext) => BindToCell(t0).runNow()))
    __obj.updateDynamic("Dispose")(Dispose.toJsFn)
    __obj.updateDynamic("OnBeginEdit")(js.Any.fromFunction1((t0: typingsJapgolly.microsoftAjax.Sys.UI.DomEvent) => OnBeginEdit(t0).runNow()))
    __obj.updateDynamic("OnEndEdit")(OnEndEdit.toJsFn)
    __obj.updateDynamic("Unbind")(Unbind.toJsFn)
    if (Focus != null) __obj.updateDynamic("Focus")(js.Any.fromFunction1((t0: /* eventInfo */ typingsJapgolly.microsoftAjax.Sys.UI.DomEvent) => Focus(t0).runNow()))
    GetCellContext.foreach(p => __obj.updateDynamic("GetCellContext")(p.toJsFn))
    GetInputElement.foreach(p => __obj.updateDynamic("GetInputElement")(p.toJsFn))
    GetOriginalValue.foreach(p => __obj.updateDynamic("GetOriginalValue")(p.toJsFn))
    IsCurrentlyUsingGridTextInputElement.foreach(p => __obj.updateDynamic("IsCurrentlyUsingGridTextInputElement")(p.toJsFn))
    OnCellMove.foreach(p => __obj.updateDynamic("OnCellMove")(p.toJsFn))
    if (OnValueChanged != null) __obj.updateDynamic("OnValueChanged")(js.Any.fromFunction1((t0: /* newValue */ typingsJapgolly.sharepoint.SP.JsGrid.IValue) => OnValueChanged(t0).runNow()))
    if (SetSize != null) __obj.updateDynamic("SetSize")(js.Any.fromFunction2((t0: /* width */ scala.Double, t1: /* height */ scala.Double) => SetSize(t0, t1).runNow()))
    if (SetValue != null) __obj.updateDynamic("SetValue")(js.Any.fromFunction1((t0: /* value */ typingsJapgolly.sharepoint.SP.JsGrid.IValue) => SetValue(t0).runNow()))
    if (SupportedReadMode != null) __obj.updateDynamic("SupportedReadMode")(SupportedReadMode.asInstanceOf[js.Any])
    if (SupportedWriteMode != null) __obj.updateDynamic("SupportedWriteMode")(SupportedWriteMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditControl]
  }
}

