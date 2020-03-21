package typingsJapgolly.reactDragtastic.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactDragtastic.StateisOverbooleanwillAcc
import typingsJapgolly.reactDragtastic.mod.Accepts
import typingsJapgolly.reactDragtastic.mod.DroppableProps
import typingsJapgolly.reactDragtastic.mod.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Droppable {
  def apply(
    accepts: Accepts = null,
    id: Id = null,
    onDragEnter: js.UndefOr[Callback] = js.undefined,
    onDragLeave: js.UndefOr[Callback] = js.undefined,
    onDrop: /* data */ js.Any => Callback = null,
    subscribeTo: js.Array[String] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: StateisOverbooleanwillAcc => CallbackTo[Node]
  ): UnmountedWithRoot[DroppableProps, typingsJapgolly.reactDragtastic.mod.Droppable, Unit, DroppableProps] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.reactDragtastic.StateisOverbooleanwillAcc) => children(t0).runNow()))
    if (accepts != null) __obj.updateDynamic("accepts")(accepts.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    onDragEnter.foreach(p => __obj.updateDynamic("onDragEnter")(p.toJsFn))
    onDragLeave.foreach(p => __obj.updateDynamic("onDragLeave")(p.toJsFn))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1((t0: /* data */ js.Any) => onDrop(t0).runNow()))
    if (subscribeTo != null) __obj.updateDynamic("subscribeTo")(subscribeTo.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDragtastic.mod.DroppableProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactDragtastic.mod.Droppable](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactDragtastic.mod.DroppableProps])
  }
  @JSImport("react-dragtastic", "Droppable")
  @js.native
  object componentImport extends js.Object
  
}

