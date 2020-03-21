package typingsJapgolly.reactDragtastic.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactDragtastic.StateisActivebooleanevent
import typingsJapgolly.reactDragtastic.mod.DraggableProps
import typingsJapgolly.reactDragtastic.mod.Id
import typingsJapgolly.reactDragtastic.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Draggable {
  def apply(
    data: js.Any = null,
    delay: Int | Double = null,
    id: Id = null,
    onDrag: js.UndefOr[Callback] = js.undefined,
    onDragEnd: /* data */ js.Any => Callback = null,
    onDragStart: /* data */ js.Any => Callback = null,
    subscribeTo: js.Array[String] = null,
    `type`: Type = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: StateisActivebooleanevent => CallbackTo[Node]
  ): UnmountedWithRoot[DraggableProps, typingsJapgolly.reactDragtastic.mod.Draggable, Unit, DraggableProps] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.reactDragtastic.StateisActivebooleanevent) => children(t0).runNow()))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    onDrag.foreach(p => __obj.updateDynamic("onDrag")(p.toJsFn))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1((t0: /* data */ js.Any) => onDragEnd(t0).runNow()))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1((t0: /* data */ js.Any) => onDragStart(t0).runNow()))
    if (subscribeTo != null) __obj.updateDynamic("subscribeTo")(subscribeTo.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDragtastic.mod.DraggableProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactDragtastic.mod.Draggable](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactDragtastic.mod.DraggableProps])
  }
  @JSImport("react-dragtastic", "Draggable")
  @js.native
  object componentImport extends js.Object
  
}

