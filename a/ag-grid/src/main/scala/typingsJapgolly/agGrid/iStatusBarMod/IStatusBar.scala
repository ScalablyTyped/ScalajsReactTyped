package typingsJapgolly.agGrid.iStatusBarMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.agGrid.gridPanelMod.GridPanel
import typingsJapgolly.agGrid.iComponentMod.IAfterGuiAttachedParams
import typingsJapgolly.agGrid.iComponentMod.IComponent
import typingsJapgolly.agGrid.utilsMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStatusBar
  extends IComponent[js.Any] {
  def registerGridPanel(gridPanel: GridPanel): Unit
}

object IStatusBar {
  @scala.inline
  def apply(
    getGui: CallbackTo[HTMLElement],
    registerGridPanel: GridPanel => Callback,
    afterGuiAttached: /* params */ js.UndefOr[IAfterGuiAttachedParams] => Callback = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    init: js.Any => CallbackTo[Promise[Unit] | Unit] = null
  ): IStatusBar = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getGui")(getGui.toJsFn)
    __obj.updateDynamic("registerGridPanel")(js.Any.fromFunction1((t0: typingsJapgolly.agGrid.gridPanelMod.GridPanel) => registerGridPanel(t0).runNow()))
    if (afterGuiAttached != null) __obj.updateDynamic("afterGuiAttached")(js.Any.fromFunction1((t0: /* params */ js.UndefOr[typingsJapgolly.agGrid.iComponentMod.IAfterGuiAttachedParams]) => afterGuiAttached(t0).runNow()))
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1((t0: js.Any) => init(t0).runNow()))
    __obj.asInstanceOf[IStatusBar]
  }
}

