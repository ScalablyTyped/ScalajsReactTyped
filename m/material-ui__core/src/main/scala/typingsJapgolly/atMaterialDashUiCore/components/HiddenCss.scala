package typingsJapgolly.atMaterialDashUiCore.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.atMaterialDashUiCore.hiddenHiddenCssMod.HiddenCssProps
import typingsJapgolly.atMaterialDashUiCore.hiddenHiddenCssMod.default
import typingsJapgolly.atMaterialDashUiCore.stylesCreateBreakpointsMod.Breakpoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object HiddenCss {
  def apply(
    lgDown: js.UndefOr[Boolean] = js.undefined,
    lgUp: js.UndefOr[Boolean] = js.undefined,
    mdDown: js.UndefOr[Boolean] = js.undefined,
    mdUp: js.UndefOr[Boolean] = js.undefined,
    only: Breakpoint | js.Array[Breakpoint] = null,
    smDown: js.UndefOr[Boolean] = js.undefined,
    smUp: js.UndefOr[Boolean] = js.undefined,
    xlDown: js.UndefOr[Boolean] = js.undefined,
    xlUp: js.UndefOr[Boolean] = js.undefined,
    xsDown: js.UndefOr[Boolean] = js.undefined,
    xsUp: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[HiddenCssProps, default, Unit, HiddenCssProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(lgDown)) __obj.updateDynamic("lgDown")(lgDown.asInstanceOf[js.Any])
    if (!js.isUndefined(lgUp)) __obj.updateDynamic("lgUp")(lgUp.asInstanceOf[js.Any])
    if (!js.isUndefined(mdDown)) __obj.updateDynamic("mdDown")(mdDown.asInstanceOf[js.Any])
    if (!js.isUndefined(mdUp)) __obj.updateDynamic("mdUp")(mdUp.asInstanceOf[js.Any])
    if (only != null) __obj.updateDynamic("only")(only.asInstanceOf[js.Any])
    if (!js.isUndefined(smDown)) __obj.updateDynamic("smDown")(smDown.asInstanceOf[js.Any])
    if (!js.isUndefined(smUp)) __obj.updateDynamic("smUp")(smUp.asInstanceOf[js.Any])
    if (!js.isUndefined(xlDown)) __obj.updateDynamic("xlDown")(xlDown.asInstanceOf[js.Any])
    if (!js.isUndefined(xlUp)) __obj.updateDynamic("xlUp")(xlUp.asInstanceOf[js.Any])
    if (!js.isUndefined(xsDown)) __obj.updateDynamic("xsDown")(xsDown.asInstanceOf[js.Any])
    if (!js.isUndefined(xsUp)) __obj.updateDynamic("xsUp")(xsUp.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.atMaterialDashUiCore.hiddenHiddenCssMod.HiddenCssProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.atMaterialDashUiCore.hiddenHiddenCssMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.atMaterialDashUiCore.hiddenHiddenCssMod.HiddenCssProps])(children: _*)
  }
  @JSImport("@material-ui/core/Hidden/HiddenCss", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

