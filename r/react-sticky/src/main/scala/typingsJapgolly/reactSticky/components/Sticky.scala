package typingsJapgolly.reactSticky.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactSticky.mod.StickyChildArgs
import typingsJapgolly.reactSticky.mod.StickyProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Sticky {
  def apply(
    bottomOffset: Int | Double = null,
    className: String = null,
    disableCompensation: js.UndefOr[Boolean] = js.undefined,
    disableHardwareAcceleration: js.UndefOr[Boolean] = js.undefined,
    isActive: js.UndefOr[Boolean] = js.undefined,
    onStickyStateChange: /* isSticky */ Boolean => Callback = null,
    relative: js.UndefOr[Boolean] = js.undefined,
    stickyClassName: String = null,
    stickyStyle: js.Any = null,
    style: js.Any = null,
    topOffset: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: StickyChildArgs => CallbackTo[Element]
  ): UnmountedWithRoot[StickyProps, typingsJapgolly.reactSticky.mod.Sticky, Unit, StickyProps] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.reactSticky.mod.StickyChildArgs) => children(t0).runNow()))
    if (bottomOffset != null) __obj.updateDynamic("bottomOffset")(bottomOffset.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disableCompensation)) __obj.updateDynamic("disableCompensation")(disableCompensation.asInstanceOf[js.Any])
    if (!js.isUndefined(disableHardwareAcceleration)) __obj.updateDynamic("disableHardwareAcceleration")(disableHardwareAcceleration.asInstanceOf[js.Any])
    if (!js.isUndefined(isActive)) __obj.updateDynamic("isActive")(isActive.asInstanceOf[js.Any])
    if (onStickyStateChange != null) __obj.updateDynamic("onStickyStateChange")(js.Any.fromFunction1((t0: /* isSticky */ scala.Boolean) => onStickyStateChange(t0).runNow()))
    if (!js.isUndefined(relative)) __obj.updateDynamic("relative")(relative.asInstanceOf[js.Any])
    if (stickyClassName != null) __obj.updateDynamic("stickyClassName")(stickyClassName.asInstanceOf[js.Any])
    if (stickyStyle != null) __obj.updateDynamic("stickyStyle")(stickyStyle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (topOffset != null) __obj.updateDynamic("topOffset")(topOffset.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactSticky.mod.StickyProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactSticky.mod.Sticky](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactSticky.mod.StickyProps])
  }
  @JSImport("react-sticky", "Sticky")
  @js.native
  object componentImport extends js.Object
  
}

