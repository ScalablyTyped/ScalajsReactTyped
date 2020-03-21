package typingsJapgolly.antDesignPro.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignPro.AnonY
import typingsJapgolly.antDesignPro.miniBarMod.IMiniBarProps
import typingsJapgolly.antDesignPro.miniBarMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MiniBar {
  def apply(
    data: js.Array[AnonY],
    height: Double,
    color: String = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[IMiniBarProps, default, Unit, IMiniBarProps] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any])
  
      if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignPro.miniBarMod.IMiniBarProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignPro.miniBarMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignPro.miniBarMod.IMiniBarProps])(children: _*)
  }
  @JSImport("ant-design-pro/lib/Charts/MiniBar", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

