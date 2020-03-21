package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.baseui.progressBarMod.ProgressBarOverrides
import typingsJapgolly.baseui.progressBarMod.ProgressBarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ProgressBar {
  def apply(
    getProgressLabel: (/* value */ Double, /* successValue */ Double) => CallbackTo[Node] = null,
    infinite: js.UndefOr[Boolean] = js.undefined,
    overrides: ProgressBarOverrides = null,
    showLabel: js.UndefOr[Boolean] = js.undefined,
    successValue: Int | Double = null,
    value: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ProgressBarProps, 
    typingsJapgolly.baseui.progressBarMod.ProgressBar, 
    Unit, 
    ProgressBarProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (getProgressLabel != null) __obj.updateDynamic("getProgressLabel")(js.Any.fromFunction2((t0: /* value */ scala.Double, t1: /* successValue */ scala.Double) => getProgressLabel(t0, t1).runNow()))
    if (!js.isUndefined(infinite)) __obj.updateDynamic("infinite")(infinite.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(showLabel)) __obj.updateDynamic("showLabel")(showLabel.asInstanceOf[js.Any])
    if (successValue != null) __obj.updateDynamic("successValue")(successValue.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.baseui.progressBarMod.ProgressBarProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.baseui.progressBarMod.ProgressBar](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.progressBarMod.ProgressBarProps])(children: _*)
  }
  @JSImport("baseui/progress-bar", "ProgressBar")
  @js.native
  object componentImport extends js.Object
  
}

