package typingsJapgolly.reactBootstrap.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.reactBootstrap.radioMod.RadioProps
import typingsJapgolly.reactBootstrap.reactBootstrapStrings.error
import typingsJapgolly.reactBootstrap.reactBootstrapStrings.success
import typingsJapgolly.reactBootstrap.reactBootstrapStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Radio {
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[typingsJapgolly.reactBootstrap.radioMod.Radio] = null,
    ClassAttributes: ClassAttributes[typingsJapgolly.reactBootstrap.radioMod.Radio] = null,
    bsClass: String = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    inputRef: /* instance */ HTMLInputElement => Callback = null,
    validationState: success | warning | error = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[RadioProps, typingsJapgolly.reactBootstrap.mod.Radio, Unit, RadioProps] = {
    val __obj = js.Dynamic.literal()
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (inputRef != null) __obj.updateDynamic("inputRef")(js.Any.fromFunction1((t0: /* instance */ org.scalajs.dom.raw.HTMLInputElement) => inputRef(t0).runNow()))
    if (validationState != null) __obj.updateDynamic("validationState")(validationState.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactBootstrap.radioMod.RadioProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactBootstrap.mod.Radio](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactBootstrap.radioMod.RadioProps])(children: _*)
  }
  @JSImport("react-bootstrap", "Radio")
  @js.native
  object componentImport extends js.Object
  
}

