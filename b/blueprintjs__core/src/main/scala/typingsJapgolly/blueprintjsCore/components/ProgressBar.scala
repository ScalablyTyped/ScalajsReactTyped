package typingsJapgolly.blueprintjsCore.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.blueprintjsCore.intentMod.Intent
import typingsJapgolly.blueprintjsCore.progressBarMod.IProgressBarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ProgressBar {
  def apply(
    animate: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    intent: Intent = null,
    stripes: js.UndefOr[Boolean] = js.undefined,
    value: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IProgressBarProps, 
    typingsJapgolly.blueprintjsCore.mod.ProgressBar, 
    Unit, 
    IProgressBarProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    if (!js.isUndefined(stripes)) __obj.updateDynamic("stripes")(stripes.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.blueprintjsCore.progressBarMod.IProgressBarProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.blueprintjsCore.mod.ProgressBar](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsCore.progressBarMod.IProgressBarProps])(children: _*)
  }
  @JSImport("@blueprintjs/core", "ProgressBar")
  @js.native
  object componentImport extends js.Object
  
}

