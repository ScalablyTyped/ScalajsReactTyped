package typingsJapgolly.agGrid.headerGroupCompMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.agGrid.iComponentMod.IAfterGuiAttachedParams
import typingsJapgolly.agGrid.iComponentMod.IComponent
import typingsJapgolly.agGrid.utilsMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHeaderGroupComp
  extends IHeaderGroup
     with IComponent[IHeaderGroupParams]

object IHeaderGroupComp {
  @scala.inline
  def apply(
    getGui: CallbackTo[HTMLElement],
    afterGuiAttached: /* params */ js.UndefOr[IAfterGuiAttachedParams] => Callback = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    init: IHeaderGroupParams => CallbackTo[Promise[Unit] | Unit] = null
  ): IHeaderGroupComp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getGui")(getGui.toJsFn)
    if (afterGuiAttached != null) __obj.updateDynamic("afterGuiAttached")(js.Any.fromFunction1((t0: /* params */ js.UndefOr[typingsJapgolly.agGrid.iComponentMod.IAfterGuiAttachedParams]) => afterGuiAttached(t0).runNow()))
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1((t0: typingsJapgolly.agGrid.headerGroupCompMod.IHeaderGroupParams) => init(t0).runNow()))
    __obj.asInstanceOf[IHeaderGroupComp]
  }
}

