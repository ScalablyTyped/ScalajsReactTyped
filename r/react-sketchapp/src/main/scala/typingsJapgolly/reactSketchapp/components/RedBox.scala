package typingsJapgolly.reactSketchapp.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactSketchapp.mod.RedBoxProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RedBox {
  def apply(
    error: js.Error,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[RedBoxProps, typingsJapgolly.reactSketchapp.mod.RedBox, Unit, RedBoxProps] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactSketchapp.mod.RedBoxProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactSketchapp.mod.RedBox](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactSketchapp.mod.RedBoxProps])(children: _*)
  }
  @JSImport("react-sketchapp", "RedBox")
  @js.native
  object componentImport extends js.Object
  
}

