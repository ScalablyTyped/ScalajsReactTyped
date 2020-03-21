package typingsJapgolly.materialUi.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialUi.MaterialUI.propTypes.tooltipHorizontal
import typingsJapgolly.materialUi.MaterialUI.propTypes.vertical
import typingsJapgolly.materialUi.tooltipMod.TooltipProps
import typingsJapgolly.materialUi.tooltipMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tooltip {
  def apply(
    label: js.Any,
    className: String = null,
    horizontalPosition: tooltipHorizontal = null,
    show: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    touch: js.UndefOr[Boolean] = js.undefined,
    verticalPosition: vertical = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TooltipProps, default, Unit, TooltipProps] = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (horizontalPosition != null) __obj.updateDynamic("horizontalPosition")(horizontalPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(touch)) __obj.updateDynamic("touch")(touch.asInstanceOf[js.Any])
    if (verticalPosition != null) __obj.updateDynamic("verticalPosition")(verticalPosition.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialUi.tooltipMod.TooltipProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialUi.tooltipMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialUi.tooltipMod.TooltipProps])(children: _*)
  }
  @JSImport("material-ui/internal/Tooltip", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

