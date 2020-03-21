package typingsJapgolly.rmcSteps.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.rmcSteps.stepMod.IStepProps
import typingsJapgolly.rmcSteps.stepMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Step {
  def apply(
    adjustMarginRight: Double | String = null,
    className: String = null,
    description: js.Any = null,
    icon: VdomNode = null,
    iconPrefix: String = null,
    itemWidth: Double | String = null,
    prefixCls: String = null,
    progressDot: Boolean | js.Function = null,
    status: String = null,
    stepNumber: Int | Double = null,
    style: js.Any = null,
    title: js.Any = null,
    wrapperStyle: js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[IStepProps, default, Unit, IStepProps] = {
    val __obj = js.Dynamic.literal()
  
      if (adjustMarginRight != null) __obj.updateDynamic("adjustMarginRight")(adjustMarginRight.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.rawNode.asInstanceOf[js.Any])
    if (iconPrefix != null) __obj.updateDynamic("iconPrefix")(iconPrefix.asInstanceOf[js.Any])
    if (itemWidth != null) __obj.updateDynamic("itemWidth")(itemWidth.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (progressDot != null) __obj.updateDynamic("progressDot")(progressDot.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (stepNumber != null) __obj.updateDynamic("stepNumber")(stepNumber.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (wrapperStyle != null) __obj.updateDynamic("wrapperStyle")(wrapperStyle.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.rmcSteps.stepMod.IStepProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.rmcSteps.stepMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.rmcSteps.stepMod.IStepProps])(children: _*)
  }
  @JSImport("rmc-steps/lib/Step", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

