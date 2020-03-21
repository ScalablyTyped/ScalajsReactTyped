package typingsJapgolly.reactTouch.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactTouch.mod.CustomGestureProps
import typingsJapgolly.reactTouch.mod.moves
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CustomGesture {
  def apply(
    config: js.Array[moves],
    onGesture: Callback,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    CustomGestureProps, 
    typingsJapgolly.reactTouch.mod.CustomGesture, 
    Unit, 
    CustomGestureProps
  ] = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onGesture")(onGesture.toJsFn)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactTouch.mod.CustomGestureProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactTouch.mod.CustomGesture](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactTouch.mod.CustomGestureProps])(children: _*)
  }
  @JSImport("react-touch", "CustomGesture")
  @js.native
  object componentImport extends js.Object
  
}

