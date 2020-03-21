package typingsJapgolly.reactBeautifulDnd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactBeautifulDnd.mod.BeforeCapture
import typingsJapgolly.reactBeautifulDnd.mod.DragDropContextProps
import typingsJapgolly.reactBeautifulDnd.mod.DragStart
import typingsJapgolly.reactBeautifulDnd.mod.DragUpdate
import typingsJapgolly.reactBeautifulDnd.mod.DropResult
import typingsJapgolly.reactBeautifulDnd.mod.ResponderProvided
import typingsJapgolly.reactBeautifulDnd.mod.Sensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DragDropContext {
  def apply(
    onDragEnd: (DropResult, ResponderProvided) => Callback,
    onBeforeCapture: /* before */ BeforeCapture => Callback = null,
    onBeforeDragStart: /* initial */ DragStart => Callback = null,
    onDragStart: (/* initial */ DragStart, /* provided */ ResponderProvided) => Callback = null,
    onDragUpdate: (/* initial */ DragUpdate, /* provided */ ResponderProvided) => Callback = null,
    sensors: js.Array[Sensor] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    DragDropContextProps, 
    typingsJapgolly.reactBeautifulDnd.mod.DragDropContext, 
    Unit, 
    DragDropContextProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("onDragEnd")(js.Any.fromFunction2((t0: typingsJapgolly.reactBeautifulDnd.mod.DropResult, t1: typingsJapgolly.reactBeautifulDnd.mod.ResponderProvided) => onDragEnd(t0, t1).runNow()))
    if (onBeforeCapture != null) __obj.updateDynamic("onBeforeCapture")(js.Any.fromFunction1((t0: /* before */ typingsJapgolly.reactBeautifulDnd.mod.BeforeCapture) => onBeforeCapture(t0).runNow()))
    if (onBeforeDragStart != null) __obj.updateDynamic("onBeforeDragStart")(js.Any.fromFunction1((t0: /* initial */ typingsJapgolly.reactBeautifulDnd.mod.DragStart) => onBeforeDragStart(t0).runNow()))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction2((t0: /* initial */ typingsJapgolly.reactBeautifulDnd.mod.DragStart, t1: /* provided */ typingsJapgolly.reactBeautifulDnd.mod.ResponderProvided) => onDragStart(t0, t1).runNow()))
    if (onDragUpdate != null) __obj.updateDynamic("onDragUpdate")(js.Any.fromFunction2((t0: /* initial */ typingsJapgolly.reactBeautifulDnd.mod.DragUpdate, t1: /* provided */ typingsJapgolly.reactBeautifulDnd.mod.ResponderProvided) => onDragUpdate(t0, t1).runNow()))
    if (sensors != null) __obj.updateDynamic("sensors")(sensors.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactBeautifulDnd.mod.DragDropContextProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactBeautifulDnd.mod.DragDropContext](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactBeautifulDnd.mod.DragDropContextProps])(children: _*)
  }
  @JSImport("react-beautiful-dnd", "DragDropContext")
  @js.native
  object componentImport extends js.Object
  
}

