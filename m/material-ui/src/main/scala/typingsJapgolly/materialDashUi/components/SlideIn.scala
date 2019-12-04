package typingsJapgolly.materialDashUi.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialDashUi.__MaterialUI.propTypes.direction
import typingsJapgolly.materialDashUi.internalSlideInMod.SlideInProps
import typingsJapgolly.materialDashUi.internalSlideInMod.default
import typingsJapgolly.react.reactMod.CSSProperties
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
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SlideInProps, default, Unit, SlideInProps] = {
    val __obj = js.Dynamic.literal()
  
      if (childStyle != null) __obj.updateDynamic("childStyle")(childStyle.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (enterDelay != null) __obj.updateDynamic("enterDelay")(enterDelay.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialDashUi.internalSlideInMod.SlideInProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialDashUi.internalSlideInMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialDashUi.internalSlideInMod.SlideInProps])(children: _*)
  }
  @JSImport("material-ui/internal/SlideIn", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

