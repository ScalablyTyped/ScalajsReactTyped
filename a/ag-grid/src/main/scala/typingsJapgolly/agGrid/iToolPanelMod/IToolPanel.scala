package typingsJapgolly.agGrid.iToolPanelMod

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

trait IToolPanel
  extends IComponent[js.Any] {
  def getPreferredWidth(): Double
  def isToolPanelShowing(): Boolean
  def refresh(): Unit
  def registerGridComp(gridPanel: GridPanel): Unit
  def showToolPanel(show: Boolean): Unit
}

object IToolPanel {
  @scala.inline
  def apply(
    getGui: CallbackTo[HTMLElement],
    getPreferredWidth: CallbackTo[Double],
    isToolPanelShowing: CallbackTo[Boolean],
    refresh: Callback,
    registerGridComp: GridPanel => Callback,
    showToolPanel: Boolean => Callback,
    afterGuiAttached: /* params */ js.UndefOr[IAfterGuiAttachedParams] => Callback = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    init: js.Any => CallbackTo[Promise[Unit] | Unit] = null
  ): IToolPanel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getGui")(getGui.toJsFn)
    __obj.updateDynamic("getPreferredWidth")(getPreferredWidth.toJsFn)
    __obj.updateDynamic("isToolPanelShowing")(isToolPanelShowing.toJsFn)
    __obj.updateDynamic("refresh")(refresh.toJsFn)
    __obj.updateDynamic("registerGridComp")(js.Any.fromFunction1((t0: typingsJapgolly.agGrid.gridPanelMod.GridPanel) => registerGridComp(t0).runNow()))
    __obj.updateDynamic("showToolPanel")(js.Any.fromFunction1((t0: scala.Boolean) => showToolPanel(t0).runNow()))
    if (afterGuiAttached != null) __obj.updateDynamic("afterGuiAttached")(js.Any.fromFunction1((t0: /* params */ js.UndefOr[typingsJapgolly.agGrid.iComponentMod.IAfterGuiAttachedParams]) => afterGuiAttached(t0).runNow()))
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1((t0: js.Any) => init(t0).runNow()))
    __obj.asInstanceOf[IToolPanel]
  }
}

