package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShellPaneContainer extends js.Object {
  val Content: js.Any
  val Events: IShellPaneContainerEvents
  val IsFocused: Boolean
  var Minimized: Boolean
  val ShellFrame: IShellFrame
  var Size: Double
  val TabTitleSize: Double
  var Visible: Boolean
  def AddTab(TabId: String, tabTitle: String, insertBeforeTabId: String): IShellPaneTab
  def Focus(): Unit
  def GetSelectedTab(): IShellPaneTab
  def GetTab(TabId: String): IShellPaneTab
  def SetDefaultSize(defaultSize: Double, resizeToDefault: Boolean): Unit
  def SetDefaultVisibility(Visible: Boolean, resetToDefault: Boolean): Unit
}

object IShellPaneContainer {
  @scala.inline
  def apply(
    AddTab: (String, String, String) => CallbackTo[IShellPaneTab],
    Content: js.Any,
    Events: IShellPaneContainerEvents,
    Focus: Callback,
    GetSelectedTab: CallbackTo[IShellPaneTab],
    GetTab: String => CallbackTo[IShellPaneTab],
    IsFocused: Boolean,
    Minimized: Boolean,
    SetDefaultSize: (Double, Boolean) => Callback,
    SetDefaultVisibility: (Boolean, Boolean) => Callback,
    ShellFrame: IShellFrame,
    Size: Double,
    TabTitleSize: Double,
    Visible: Boolean
  ): IShellPaneContainer = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], Events = Events.asInstanceOf[js.Any], IsFocused = IsFocused.asInstanceOf[js.Any], Minimized = Minimized.asInstanceOf[js.Any], ShellFrame = ShellFrame.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], TabTitleSize = TabTitleSize.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("AddTab")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => AddTab(t0, t1, t2).runNow()))
    __obj.updateDynamic("Focus")(Focus.toJsFn)
    __obj.updateDynamic("GetSelectedTab")(GetSelectedTab.toJsFn)
    __obj.updateDynamic("GetTab")(js.Any.fromFunction1((t0: java.lang.String) => GetTab(t0).runNow()))
    __obj.updateDynamic("SetDefaultSize")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Boolean) => SetDefaultSize(t0, t1).runNow()))
    __obj.updateDynamic("SetDefaultVisibility")(js.Any.fromFunction2((t0: scala.Boolean, t1: scala.Boolean) => SetDefaultVisibility(t0, t1).runNow()))
    __obj.asInstanceOf[IShellPaneContainer]
  }
}

