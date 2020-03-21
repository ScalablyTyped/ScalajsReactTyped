package typingsJapgolly.blueprintjsCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.blueprintjsCore.handlePropsMod.HandleInteractionKind
import typingsJapgolly.blueprintjsCore.handlePropsMod.HandleType
import typingsJapgolly.blueprintjsCore.handlePropsMod.IHandleProps
import typingsJapgolly.blueprintjsCore.intentMod.Intent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MultiSliderHandle {
  def apply(
    value: Double,
    className: String = null,
    intentAfter: Intent = null,
    intentBefore: Intent = null,
    interactionKind: HandleInteractionKind = null,
    onChange: /* newValue */ Double => Callback = null,
    onRelease: /* newValue */ Double => Callback = null,
    `type`: HandleType = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    IHandleProps, 
    MountedWithRawType[IHandleProps, js.Object, RawMounted[IHandleProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (intentAfter != null) __obj.updateDynamic("intentAfter")(intentAfter.asInstanceOf[js.Any])
    if (intentBefore != null) __obj.updateDynamic("intentBefore")(intentBefore.asInstanceOf[js.Any])
    if (interactionKind != null) __obj.updateDynamic("interactionKind")(interactionKind.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* newValue */ scala.Double) => onChange(t0).runNow()))
    if (onRelease != null) __obj.updateDynamic("onRelease")(js.Any.fromFunction1((t0: /* newValue */ scala.Double) => onRelease(t0).runNow()))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.blueprintjsCore.handlePropsMod.IHandleProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsCore.handlePropsMod.IHandleProps])(children: _*)
  }
  @JSImport("@blueprintjs/core", "MultiSlider.Handle")
  @js.native
  object componentImport extends js.Object
  
}

