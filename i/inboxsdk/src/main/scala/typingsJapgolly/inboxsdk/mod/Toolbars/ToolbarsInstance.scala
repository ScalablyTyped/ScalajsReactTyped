package typingsJapgolly.inboxsdk.mod.Toolbars

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarsInstance extends js.Object {
  def addToolbarButtonForApp(appToolbarButtonDescriptor: AppToolbarButtonDescriptor): AppToolbarButtonView
  def registerThreadButton(toolbarButtonDescriptor: ToolbarButtonDescriptor): js.Function0[Unit]
  /**
    * @deprecated. use registerThreadButton
    * @param toolbarButtonDescriptor
    */
  def registerToolbarButtonForList(toolbarButtonDescriptor: LegacyToolbarButtonDescriptor): js.Function0[Unit]
  /**
    * @deprecated. use registerThreadButton
    * @param toolbarButtonDescriptor
    */
  def registerToolbarButtonForThreadView(toolbarButtonDescriptor: LegacyToolbarButtonDescriptor): js.Function0[Unit]
}

object ToolbarsInstance {
  @scala.inline
  def apply(
    addToolbarButtonForApp: AppToolbarButtonDescriptor => CallbackTo[AppToolbarButtonView],
    registerThreadButton: ToolbarButtonDescriptor => CallbackTo[js.Function0[Unit]],
    registerToolbarButtonForList: LegacyToolbarButtonDescriptor => CallbackTo[js.Function0[Unit]],
    registerToolbarButtonForThreadView: LegacyToolbarButtonDescriptor => CallbackTo[js.Function0[Unit]]
  ): ToolbarsInstance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addToolbarButtonForApp")(js.Any.fromFunction1((t0: typingsJapgolly.inboxsdk.mod.Toolbars.AppToolbarButtonDescriptor) => addToolbarButtonForApp(t0).runNow()))
    __obj.updateDynamic("registerThreadButton")(js.Any.fromFunction1((t0: typingsJapgolly.inboxsdk.mod.Toolbars.ToolbarButtonDescriptor) => registerThreadButton(t0).runNow()))
    __obj.updateDynamic("registerToolbarButtonForList")(js.Any.fromFunction1((t0: typingsJapgolly.inboxsdk.mod.Toolbars.LegacyToolbarButtonDescriptor) => registerToolbarButtonForList(t0).runNow()))
    __obj.updateDynamic("registerToolbarButtonForThreadView")(js.Any.fromFunction1((t0: typingsJapgolly.inboxsdk.mod.Toolbars.LegacyToolbarButtonDescriptor) => registerToolbarButtonForThreadView(t0).runNow()))
    __obj.asInstanceOf[ToolbarsInstance]
  }
}

