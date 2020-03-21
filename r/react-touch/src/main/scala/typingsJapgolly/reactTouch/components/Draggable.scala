package typingsJapgolly.reactTouch.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactTouch.mod.DraggableCallbackArgument
import typingsJapgolly.reactTouch.mod.DraggableProps
import typingsJapgolly.reactTouch.mod.DraggableStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Draggable {
  def apply(
    style: DraggableStyle,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: /* argument */ DraggableCallbackArgument => CallbackTo[Element]
  ): UnmountedWithRoot[DraggableProps, typingsJapgolly.reactTouch.mod.Draggable, Unit, DraggableProps] = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
  
      __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* argument */ typingsJapgolly.reactTouch.mod.DraggableCallbackArgument) => children(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactTouch.mod.DraggableProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactTouch.mod.Draggable](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactTouch.mod.DraggableProps])
  }
  @JSImport("react-touch", "Draggable")
  @js.native
  object componentImport extends js.Object
  
}

