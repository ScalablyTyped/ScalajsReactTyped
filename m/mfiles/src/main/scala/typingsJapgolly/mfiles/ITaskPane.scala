package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITaskPane extends js.Object {
  val Available: Boolean
  val Events: ITaskPaneEvents
  var Visible: Boolean
  def AddCustomCommandToGroup(customCommand: Double, group: Double, orderPriority: Double): Unit
  def CreateGroup(groupName: String, priority: Double): Double
  def DeleteGroup(groupID: Double): Unit
  def RemoveCustomCommandFromGroup(customCommand: Double, group: Double): Unit
  def SetLogo(filename: String): Unit
  def SetTheme(theme: ITheme): Unit
}

object ITaskPane {
  @scala.inline
  def apply(
    AddCustomCommandToGroup: (Double, Double, Double) => Callback,
    Available: Boolean,
    CreateGroup: (String, Double) => CallbackTo[Double],
    DeleteGroup: Double => Callback,
    Events: ITaskPaneEvents,
    RemoveCustomCommandFromGroup: (Double, Double) => Callback,
    SetLogo: String => Callback,
    SetTheme: ITheme => Callback,
    Visible: Boolean
  ): ITaskPane = {
    val __obj = js.Dynamic.literal(Available = Available.asInstanceOf[js.Any], Events = Events.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("AddCustomCommandToGroup")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => AddCustomCommandToGroup(t0, t1, t2).runNow()))
    __obj.updateDynamic("CreateGroup")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => CreateGroup(t0, t1).runNow()))
    __obj.updateDynamic("DeleteGroup")(js.Any.fromFunction1((t0: scala.Double) => DeleteGroup(t0).runNow()))
    __obj.updateDynamic("RemoveCustomCommandFromGroup")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => RemoveCustomCommandFromGroup(t0, t1).runNow()))
    __obj.updateDynamic("SetLogo")(js.Any.fromFunction1((t0: java.lang.String) => SetLogo(t0).runNow()))
    __obj.updateDynamic("SetTheme")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.ITheme) => SetTheme(t0).runNow()))
    __obj.asInstanceOf[ITaskPane]
  }
}

