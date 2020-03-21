package typingsJapgolly.agGrid.iFilterMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.agGrid.iComponentMod.IAfterGuiAttachedParams
import typingsJapgolly.agGrid.iComponentMod.IComponent
import typingsJapgolly.agGrid.utilsMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFilterComp
  extends IFilter
     with IComponent[IFilterParams]

object IFilterComp {
  @scala.inline
  def apply(
    doesFilterPass: IDoesFilterPassParams => CallbackTo[Boolean],
    getGui: CallbackTo[HTMLElement],
    getModel: CallbackTo[js.Any],
    isFilterActive: CallbackTo[Boolean],
    setModel: js.Any => Callback,
    afterGuiAttached: /* params */ js.UndefOr[IAfterGuiAttachedParams] => Callback = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    getFrameworkComponentInstance: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getModelAsString: /* model */ js.Any => CallbackTo[String] = null,
    init: IFilterParams => CallbackTo[Promise[Unit] | Unit] = null,
    onFloatingFilterChanged: /* change */ js.Any => Callback = null,
    onNewRowsLoaded: js.UndefOr[Callback] = js.undefined
  ): IFilterComp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("doesFilterPass")(js.Any.fromFunction1((t0: typingsJapgolly.agGrid.iFilterMod.IDoesFilterPassParams) => doesFilterPass(t0).runNow()))
    __obj.updateDynamic("getGui")(getGui.toJsFn)
    __obj.updateDynamic("getModel")(getModel.toJsFn)
    __obj.updateDynamic("isFilterActive")(isFilterActive.toJsFn)
    __obj.updateDynamic("setModel")(js.Any.fromFunction1((t0: js.Any) => setModel(t0).runNow()))
    if (afterGuiAttached != null) __obj.updateDynamic("afterGuiAttached")(js.Any.fromFunction1((t0: /* params */ js.UndefOr[typingsJapgolly.agGrid.iComponentMod.IAfterGuiAttachedParams]) => afterGuiAttached(t0).runNow()))
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    getFrameworkComponentInstance.foreach(p => __obj.updateDynamic("getFrameworkComponentInstance")(p.toJsFn))
    if (getModelAsString != null) __obj.updateDynamic("getModelAsString")(js.Any.fromFunction1((t0: /* model */ js.Any) => getModelAsString(t0).runNow()))
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1((t0: typingsJapgolly.agGrid.iFilterMod.IFilterParams) => init(t0).runNow()))
    if (onFloatingFilterChanged != null) __obj.updateDynamic("onFloatingFilterChanged")(js.Any.fromFunction1((t0: /* change */ js.Any) => onFloatingFilterChanged(t0).runNow()))
    onNewRowsLoaded.foreach(p => __obj.updateDynamic("onNewRowsLoaded")(p.toJsFn))
    __obj.asInstanceOf[IFilterComp]
  }
}

