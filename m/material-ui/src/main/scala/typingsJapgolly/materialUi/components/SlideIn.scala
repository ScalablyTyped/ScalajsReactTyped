package typingsJapgolly.materialUi.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialUi.MaterialUI.propTypes.direction
import typingsJapgolly.materialUi.slideInMod.SlideInProps
import typingsJapgolly.materialUi.slideInMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SlideIn {
  def apply(
    childStyle: CSSProperties = null,
    direction: direction = null,
    enterDelay: Int | Double = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SlideInProps, default, Unit, SlideInProps] = {
    val __obj = js.Dynamic.literal()
  
      if (childStyle != null) __obj.updateDynamic("childStyle")(childStyle.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (enterDelay != null) __obj.updateDynamic("enterDelay")(enterDelay.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialUi.slideInMod.SlideInProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialUi.slideInMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialUi.slideInMod.SlideInProps])(children: _*)
  }
  @JSImport("material-ui/internal/SlideIn", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

