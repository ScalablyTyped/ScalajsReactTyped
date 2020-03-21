package typingsJapgolly.agGrid.dateComponentMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.agGrid.iComponentMod.IAfterGuiAttachedParams
import typingsJapgolly.agGrid.iComponentMod.IComponent
import typingsJapgolly.agGrid.utilsMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDateComp
  extends IComponent[IDateParams]
     with IDate

object IDateComp {
  @scala.inline
  def apply(
    getDate: CallbackTo[js.Date],
    getGui: CallbackTo[HTMLElement],
    setDate: js.Date => Callback,
    afterGuiAttached: /* params */ js.UndefOr[IAfterGuiAttachedParams] => Callback = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    init: IDateParams => CallbackTo[Promise[Unit] | Unit] = null
  ): IDateComp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDate")(getDate.toJsFn)
    __obj.updateDynamic("getGui")(getGui.toJsFn)
    __obj.updateDynamic("setDate")(js.Any.fromFunction1((t0: js.Date) => setDate(t0).runNow()))
    if (afterGuiAttached != null) __obj.updateDynamic("afterGuiAttached")(js.Any.fromFunction1((t0: /* params */ js.UndefOr[typingsJapgolly.agGrid.iComponentMod.IAfterGuiAttachedParams]) => afterGuiAttached(t0).runNow()))
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1((t0: typingsJapgolly.agGrid.dateComponentMod.IDateParams) => init(t0).runNow()))
    __obj.asInstanceOf[IDateComp]
  }
}

