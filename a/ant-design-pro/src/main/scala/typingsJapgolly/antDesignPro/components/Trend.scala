package typingsJapgolly.antDesignPro.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignPro.antDesignProStrings.down
import typingsJapgolly.antDesignPro.antDesignProStrings.up
import typingsJapgolly.antDesignPro.trendMod.ITrendProps
import typingsJapgolly.antDesignPro.trendMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Trend {
  def apply(
    flag: up | down,
    className: String = null,
    colorful: js.UndefOr[Boolean] = js.undefined,
    reverseColor: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ITrendProps, default, Unit, ITrendProps] = {
    val __obj = js.Dynamic.literal(flag = flag.asInstanceOf[js.Any])
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(colorful)) __obj.updateDynamic("colorful")(colorful.asInstanceOf[js.Any])
    if (!js.isUndefined(reverseColor)) __obj.updateDynamic("reverseColor")(reverseColor.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignPro.trendMod.ITrendProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignPro.trendMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignPro.trendMod.ITrendProps])(children: _*)
  }
  @JSImport("ant-design-pro/lib/Trend", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

