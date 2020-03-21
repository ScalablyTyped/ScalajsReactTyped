package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShellPaneTab extends js.Object {
  val Events: IShellPaneTabEvents
  val IsBuiltIn: Boolean
  val Selected: Boolean
  val TabId: String
  var Title: String
  var Visible: Boolean
  def Remove(): Unit
  def Select(): Unit
  def ShowDashboard(dashboardID: String, data: js.Any): Unit
  def ShowEmptyContent(): Unit
  def ShowFilePreview(file: String): Unit
  def ShowObjectVersionProperties(propertyValuesWithIcons: IPropertyValuesWithIconClues): Unit
  def ShowPersistentContent(sessionHandle: Double): Unit
  def ShowSSRSReport(reportURL: String): Unit
  def Unselect(): Unit
}

object IShellPaneTab {
  @scala.inline
  def apply(
    Events: IShellPaneTabEvents,
    IsBuiltIn: Boolean,
    Remove: Callback,
    Select: Callback,
    Selected: Boolean,
    ShowDashboard: (String, js.Any) => Callback,
    ShowEmptyContent: Callback,
    ShowFilePreview: String => Callback,
    ShowObjectVersionProperties: IPropertyValuesWithIconClues => Callback,
    ShowPersistentContent: Double => Callback,
    ShowSSRSReport: String => Callback,
    TabId: String,
    Title: String,
    Unselect: Callback,
    Visible: Boolean
  ): IShellPaneTab = {
    val __obj = js.Dynamic.literal(Events = Events.asInstanceOf[js.Any], IsBuiltIn = IsBuiltIn.asInstanceOf[js.Any], Selected = Selected.asInstanceOf[js.Any], TabId = TabId.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("Remove")(Remove.toJsFn)
    __obj.updateDynamic("Select")(Select.toJsFn)
    __obj.updateDynamic("ShowDashboard")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => ShowDashboard(t0, t1).runNow()))
    __obj.updateDynamic("ShowEmptyContent")(ShowEmptyContent.toJsFn)
    __obj.updateDynamic("ShowFilePreview")(js.Any.fromFunction1((t0: java.lang.String) => ShowFilePreview(t0).runNow()))
    __obj.updateDynamic("ShowObjectVersionProperties")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IPropertyValuesWithIconClues) => ShowObjectVersionProperties(t0).runNow()))
    __obj.updateDynamic("ShowPersistentContent")(js.Any.fromFunction1((t0: scala.Double) => ShowPersistentContent(t0).runNow()))
    __obj.updateDynamic("ShowSSRSReport")(js.Any.fromFunction1((t0: java.lang.String) => ShowSSRSReport(t0).runNow()))
    __obj.updateDynamic("Unselect")(Unselect.toJsFn)
    __obj.asInstanceOf[IShellPaneTab]
  }
}

