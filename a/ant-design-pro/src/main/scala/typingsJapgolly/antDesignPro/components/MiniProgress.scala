package typingsJapgolly.antDesignPro.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignPro.miniProgressMod.IMiniProgressProps
import typingsJapgolly.antDesignPro.miniProgressMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MiniProgress {
  def apply(
    target: Double,
    targetLabel: String,
    color: String = null,
    percent: Int | Double = null,
    strokeWidth: Int | Double = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[IMiniProgressProps, default, Unit, IMiniProgressProps] = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any], targetLabel = targetLabel.asInstanceOf[js.Any])
  
      if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (percent != null) __obj.updateDynamic("percent")(percent.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignPro.miniProgressMod.IMiniProgressProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignPro.miniProgressMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignPro.miniProgressMod.IMiniProgressProps])(children: _*)
  }
  @JSImport("ant-design-pro/lib/Charts/MiniProgress", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

