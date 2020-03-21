package typingsJapgolly.agGrid.floatingFilterWrapperMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.agGrid.floatingFilterMod.FloatingFilterChange
import typingsJapgolly.agGrid.floatingFilterMod.IFloatingFilterParams
import typingsJapgolly.agGrid.iComponentMod.IAfterGuiAttachedParams
import typingsJapgolly.agGrid.iComponentMod.IComponent
import typingsJapgolly.agGrid.utilsMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFloatingFilterWrapperComp[M, F /* <: FloatingFilterChange */, PC /* <: IFloatingFilterParams[M, F] */, P /* <: IFloatingFilterWrapperParams[M, F, PC] */]
  extends IFloatingFilterWrapper[M]
     with IComponent[P]

object IFloatingFilterWrapperComp {
  @scala.inline
  def apply[M, F /* <: FloatingFilterChange */, PC /* <: IFloatingFilterParams[M, F] */, P /* <: IFloatingFilterWrapperParams[M, F, PC] */](
    getGui: CallbackTo[HTMLElement],
    onParentModelChanged: M => Callback,
    afterGuiAttached: /* params */ js.UndefOr[IAfterGuiAttachedParams] => Callback = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    init: P => CallbackTo[Promise[Unit] | Unit] = null
  ): IFloatingFilterWrapperComp[M, F, PC, P] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getGui")(getGui.toJsFn)
    __obj.updateDynamic("onParentModelChanged")(js.Any.fromFunction1((t0: M) => onParentModelChanged(t0).runNow()))
    if (afterGuiAttached != null) __obj.updateDynamic("afterGuiAttached")(js.Any.fromFunction1((t0: /* params */ js.UndefOr[typingsJapgolly.agGrid.iComponentMod.IAfterGuiAttachedParams]) => afterGuiAttached(t0).runNow()))
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1((t0: P) => init(t0).runNow()))
    __obj.asInstanceOf[IFloatingFilterWrapperComp[M, F, PC, P]]
  }
}

