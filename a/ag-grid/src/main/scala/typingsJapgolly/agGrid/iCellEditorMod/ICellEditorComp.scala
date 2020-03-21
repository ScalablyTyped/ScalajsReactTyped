package typingsJapgolly.agGrid.iCellEditorMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.agGrid.iComponentMod.IAfterGuiAttachedParams
import typingsJapgolly.agGrid.iComponentMod.IComponent
import typingsJapgolly.agGrid.utilsMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICellEditorComp
  extends ICellEditor
     with IComponent[ICellEditorParams]

object ICellEditorComp {
  @scala.inline
  def apply(
    getGui: CallbackTo[HTMLElement],
    getValue: CallbackTo[js.Any],
    afterGuiAttached: /* params */ js.UndefOr[IAfterGuiAttachedParams] => Callback = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    focusIn: js.UndefOr[Callback] = js.undefined,
    focusOut: js.UndefOr[Callback] = js.undefined,
    init: ICellEditorParams => CallbackTo[Promise[Unit] | Unit] = null,
    isCancelAfterEnd: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isCancelBeforeStart: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isPopup: js.UndefOr[CallbackTo[Boolean]] = js.undefined
  ): ICellEditorComp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getGui")(getGui.toJsFn)
    __obj.updateDynamic("getValue")(getValue.toJsFn)
    if (afterGuiAttached != null) __obj.updateDynamic("afterGuiAttached")(js.Any.fromFunction1((t0: /* params */ js.UndefOr[typingsJapgolly.agGrid.iComponentMod.IAfterGuiAttachedParams]) => afterGuiAttached(t0).runNow()))
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    focusIn.foreach(p => __obj.updateDynamic("focusIn")(p.toJsFn))
    focusOut.foreach(p => __obj.updateDynamic("focusOut")(p.toJsFn))
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1((t0: typingsJapgolly.agGrid.iCellEditorMod.ICellEditorParams) => init(t0).runNow()))
    isCancelAfterEnd.foreach(p => __obj.updateDynamic("isCancelAfterEnd")(p.toJsFn))
    isCancelBeforeStart.foreach(p => __obj.updateDynamic("isCancelBeforeStart")(p.toJsFn))
    isPopup.foreach(p => __obj.updateDynamic("isPopup")(p.toJsFn))
    __obj.asInstanceOf[ICellEditorComp]
  }
}

