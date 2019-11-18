package typingsJapgolly.antd.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antd.esTooltipMod.TooltipProps
import typingsJapgolly.antd.esTooltipMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tooltip {
  def apply(
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TooltipProps, default, Unit, TooltipProps] = {
    val __obj = js.Dynamic.literal()
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.esTooltipMod.TooltipProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antd.esTooltipMod.default](js.constructorOf[typingsJapgolly.antd.esTooltipMod.default])
    f(__obj.asInstanceOf[typingsJapgolly.antd.esTooltipMod.TooltipProps])(children: _*)
  }
}

