package typingsJapgolly.reactDragtastic.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactDragtastic.mod.DragStateProps
import typingsJapgolly.reactDragtastic.mod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DragState {
  def apply(
    subscribeTo: js.Array[String] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: State => CallbackTo[Node]
  ): UnmountedWithRoot[DragStateProps, typingsJapgolly.reactDragtastic.mod.DragState, Unit, DragStateProps] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.reactDragtastic.mod.State) => children(t0).runNow()))
    if (subscribeTo != null) __obj.updateDynamic("subscribeTo")(subscribeTo.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDragtastic.mod.DragStateProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactDragtastic.mod.DragState](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactDragtastic.mod.DragStateProps])
  }
  @JSImport("react-dragtastic", "DragState")
  @js.native
  object componentImport extends js.Object
  
}

