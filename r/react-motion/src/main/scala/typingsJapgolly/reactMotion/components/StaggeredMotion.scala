package typingsJapgolly.reactMotion.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactMotion.mod.PlainStyle
import typingsJapgolly.reactMotion.mod.StaggeredMotionProps
import typingsJapgolly.reactMotion.mod.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StaggeredMotion {
  def apply(
    styles: js.UndefOr[js.Array[PlainStyle]] => CallbackTo[js.Array[Style]],
    defaultStyles: js.Array[PlainStyle] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    StaggeredMotionProps, 
    typingsJapgolly.reactMotion.mod.StaggeredMotion, 
    Unit, 
    StaggeredMotionProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("styles")(js.Any.fromFunction1((t0: js.UndefOr[js.Array[typingsJapgolly.reactMotion.mod.PlainStyle]]) => styles(t0).runNow()))
    if (defaultStyles != null) __obj.updateDynamic("defaultStyles")(defaultStyles.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactMotion.mod.StaggeredMotionProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactMotion.mod.StaggeredMotion](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactMotion.mod.StaggeredMotionProps])(children: _*)
  }
  @JSImport("react-motion", "StaggeredMotion")
  @js.native
  object componentImport extends js.Object
  
}

