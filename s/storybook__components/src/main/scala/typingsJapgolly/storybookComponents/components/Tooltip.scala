package typingsJapgolly.storybookComponents.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.storybookComponents.tooltipMod.TooltipProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tooltip {
  def apply(
    arrowProps: js.Any = null,
    arrowRef: js.Any = null,
    color: String = null,
    hasChrome: js.UndefOr[Boolean] = js.undefined,
    placement: String = null,
    tooltipRef: js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    TooltipProps, 
    MountedWithRawType[TooltipProps, js.Object, RawMounted[TooltipProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (arrowProps != null) __obj.updateDynamic("arrowProps")(arrowProps.asInstanceOf[js.Any])
    if (arrowRef != null) __obj.updateDynamic("arrowRef")(arrowRef.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(hasChrome)) __obj.updateDynamic("hasChrome")(hasChrome.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (tooltipRef != null) __obj.updateDynamic("tooltipRef")(tooltipRef.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.storybookComponents.tooltipMod.TooltipProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.storybookComponents.tooltipMod.TooltipProps])(children: _*)
  }
  @JSImport("@storybook/components/dist/tooltip/Tooltip", "Tooltip")
  @js.native
  object componentImport extends js.Object
  
}

