package typingsJapgolly.blueprintjsCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.blueprintjsCore.handleMod.IInternalHandleProps
import typingsJapgolly.blueprintjsCore.handlePropsMod.HandleInteractionKind
import typingsJapgolly.blueprintjsCore.handlePropsMod.HandleType
import typingsJapgolly.blueprintjsCore.intentMod.Intent
import typingsJapgolly.react.mod.ReactChild
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Handle {
  def apply(
    label: ReactChild,
    value: Double,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    intentAfter: Intent = null,
    intentBefore: Intent = null,
    interactionKind: HandleInteractionKind = null,
    max: Int | Double = null,
    min: Int | Double = null,
    onChange: /* newValue */ Double => Callback = null,
    onRelease: /* newValue */ Double => Callback = null,
    stepSize: Int | Double = null,
    tickSize: Int | Double = null,
    tickSizeRatio: Int | Double = null,
    `type`: HandleType = null,
    vertical: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IInternalHandleProps, 
    typingsJapgolly.blueprintjsCore.handleMod.Handle, 
    Unit, 
    IInternalHandleProps
  ] = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (intentAfter != null) __obj.updateDynamic("intentAfter")(intentAfter.asInstanceOf[js.Any])
    if (intentBefore != null) __obj.updateDynamic("intentBefore")(intentBefore.asInstanceOf[js.Any])
    if (interactionKind != null) __obj.updateDynamic("interactionKind")(interactionKind.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* newValue */ scala.Double) => onChange(t0).runNow()))
    if (onRelease != null) __obj.updateDynamic("onRelease")(js.Any.fromFunction1((t0: /* newValue */ scala.Double) => onRelease(t0).runNow()))
    if (stepSize != null) __obj.updateDynamic("stepSize")(stepSize.asInstanceOf[js.Any])
    if (tickSize != null) __obj.updateDynamic("tickSize")(tickSize.asInstanceOf[js.Any])
    if (tickSizeRatio != null) __obj.updateDynamic("tickSizeRatio")(tickSizeRatio.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.blueprintjsCore.handleMod.IInternalHandleProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.blueprintjsCore.handleMod.Handle](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsCore.handleMod.IInternalHandleProps])(children: _*)
  }
  @JSImport("@blueprintjs/core/lib/esm/components/slider/handle", "Handle")
  @js.native
  object componentImport extends js.Object
  
}

