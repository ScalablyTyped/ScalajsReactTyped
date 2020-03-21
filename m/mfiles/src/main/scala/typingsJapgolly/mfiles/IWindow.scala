package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWindow extends js.Object {
  val Events: IWindowEvents
  val Handle: Double
  var Height: Double
  val IsFocused: Boolean
  var Maximizable: Boolean
  var Minimizable: Boolean
  var Resizable: Boolean
  var Title: String
  var Width: Double
  def Close(): Unit
  def Focus(): Unit
  def Maximize(): Unit
  def Minimize(): Unit
  def Restore(): Unit
  def SetDefaultSize(defaultWidth: Double, defaultHeight: Double, resizeToDefault: Boolean): Unit
}

object IWindow {
  @scala.inline
  def apply(
    Close: Callback,
    Events: IWindowEvents,
    Focus: Callback,
    Handle: Double,
    Height: Double,
    IsFocused: Boolean,
    Maximizable: Boolean,
    Maximize: Callback,
    Minimizable: Boolean,
    Minimize: Callback,
    Resizable: Boolean,
    Restore: Callback,
    SetDefaultSize: (Double, Double, Boolean) => Callback,
    Title: String,
    Width: Double
  ): IWindow = {
    val __obj = js.Dynamic.literal(Events = Events.asInstanceOf[js.Any], Handle = Handle.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], IsFocused = IsFocused.asInstanceOf[js.Any], Maximizable = Maximizable.asInstanceOf[js.Any], Minimizable = Minimizable.asInstanceOf[js.Any], Resizable = Resizable.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("Close")(Close.toJsFn)
    __obj.updateDynamic("Focus")(Focus.toJsFn)
    __obj.updateDynamic("Maximize")(Maximize.toJsFn)
    __obj.updateDynamic("Minimize")(Minimize.toJsFn)
    __obj.updateDynamic("Restore")(Restore.toJsFn)
    __obj.updateDynamic("SetDefaultSize")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Boolean) => SetDefaultSize(t0, t1, t2).runNow()))
    __obj.asInstanceOf[IWindow]
  }
}

