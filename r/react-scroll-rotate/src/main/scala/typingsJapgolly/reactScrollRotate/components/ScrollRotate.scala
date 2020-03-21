package typingsJapgolly.reactScrollRotate.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactScrollRotate.mod.ScrollRotateProps
import typingsJapgolly.reactScrollRotate.reactScrollRotateStrings.prec
import typingsJapgolly.reactScrollRotate.reactScrollRotateStrings.px
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ScrollRotate {
  def apply(
    animationDuration: Int | Double = null,
    from: Int | Double = null,
    loops: Int | Double = null,
    method: px | prec = null,
    target: String = null,
    throttle: Int | Double = null,
    to: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ScrollRotateProps, 
    typingsJapgolly.reactScrollRotate.mod.ScrollRotate, 
    Unit, 
    ScrollRotateProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (loops != null) __obj.updateDynamic("loops")(loops.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (throttle != null) __obj.updateDynamic("throttle")(throttle.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactScrollRotate.mod.ScrollRotateProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactScrollRotate.mod.ScrollRotate](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactScrollRotate.mod.ScrollRotateProps])(children: _*)
  }
  @JSImport("react-scroll-rotate", "ScrollRotate")
  @js.native
  object componentImport extends js.Object
  
}

