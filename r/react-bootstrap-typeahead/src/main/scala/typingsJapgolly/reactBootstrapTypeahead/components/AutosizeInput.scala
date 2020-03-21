package typingsJapgolly.reactBootstrapTypeahead.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.reactBootstrapTypeahead.PickCSSPropertiesboxSizin
import typingsJapgolly.reactBootstrapTypeahead.mod.AutosizeInputProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AutosizeInput {
  def apply(
    style: CSSProperties,
    className: String = null,
    inputClassName: String = null,
    inputRef: LegacyRef[HTMLInputElement] = null,
    inputStyle: PickCSSPropertiesboxSizin = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    AutosizeInputProps, 
    typingsJapgolly.reactBootstrapTypeahead.mod.AutosizeInput, 
    Unit, 
    AutosizeInputProps
  ] = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (inputClassName != null) __obj.updateDynamic("inputClassName")(inputClassName.asInstanceOf[js.Any])
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactBootstrapTypeahead.mod.AutosizeInputProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactBootstrapTypeahead.mod.AutosizeInput](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactBootstrapTypeahead.mod.AutosizeInputProps])(children: _*)
  }
  @JSImport("react-bootstrap-typeahead", "AutosizeInput")
  @js.native
  object componentImport extends js.Object
  
}

