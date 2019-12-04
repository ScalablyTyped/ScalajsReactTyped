package typingsJapgolly.materialDashUi.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialDashUi.__MaterialUI.Popover.PopoverAnimationVerticalProps
import typingsJapgolly.materialDashUi.__MaterialUI.propTypes.origin
import typingsJapgolly.materialDashUi.popoverPopoverAnimationVerticalMod.default
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PopoverAnimationVertical {
  def apply(
    open: Boolean,
    className: String = null,
    style: CSSProperties = null,
    targetOrigin: origin = null,
    zDepth: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[PopoverAnimationVerticalProps, default, Unit, PopoverAnimationVerticalProps] = {
    val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (targetOrigin != null) __obj.updateDynamic("targetOrigin")(targetOrigin.asInstanceOf[js.Any])
    if (zDepth != null) __obj.updateDynamic("zDepth")(zDepth.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialDashUi.__MaterialUI.Popover.PopoverAnimationVerticalProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialDashUi.popoverPopoverAnimationVerticalMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialDashUi.__MaterialUI.Popover.PopoverAnimationVerticalProps])(children: _*)
  }
  @JSImport("material-ui/Popover/PopoverAnimationVertical", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

