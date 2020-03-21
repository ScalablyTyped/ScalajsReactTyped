package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Ref
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.baseui.baseuiStrings.compact
import typingsJapgolly.baseui.baseuiStrings.default_
import typingsJapgolly.baseui.baseuiStrings.large_
import typingsJapgolly.baseui.selectMod.AutosizeInputOverrides
import typingsJapgolly.baseui.selectMod.AutosizeInputProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AutosizeInput {
  def apply(
    $size: default_ | compact | large_ = null,
    defaultValue: String = null,
    inputRef: Ref = null,
    overrides: AutosizeInputOverrides = null,
    value: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    AutosizeInputProps, 
    typingsJapgolly.baseui.selectMod.AutosizeInput, 
    Unit, 
    AutosizeInputProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if ($size != null) __obj.updateDynamic("$size")($size.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.baseui.selectMod.AutosizeInputProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.baseui.selectMod.AutosizeInput](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.selectMod.AutosizeInputProps])(children: _*)
  }
  @JSImport("baseui/select", "AutosizeInput")
  @js.native
  object componentImport extends js.Object
  
}

