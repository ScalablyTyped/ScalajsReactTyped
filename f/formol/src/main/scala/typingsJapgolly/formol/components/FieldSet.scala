package typingsJapgolly.formol.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Ref
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.formol.mod.FieldSetProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FieldSet {
  def apply(
    choices: js.Array[_] = null,
    dangerousRawHTMLLabels: js.UndefOr[Boolean] = js.undefined,
    elementRef: Ref = null,
    isChecked: js.UndefOr[Boolean] = js.undefined,
    onChange: js.UndefOr[Callback] = js.undefined,
    `type`: String = null,
    value: js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    FieldSetProps[js.Any], 
    typingsJapgolly.formol.mod.FieldSet, 
    Unit, 
    FieldSetProps[js.Any]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (choices != null) __obj.updateDynamic("choices")(choices.asInstanceOf[js.Any])
    if (!js.isUndefined(dangerousRawHTMLLabels)) __obj.updateDynamic("dangerousRawHTMLLabels")(dangerousRawHTMLLabels.asInstanceOf[js.Any])
    if (elementRef != null) __obj.updateDynamic("elementRef")(elementRef.asInstanceOf[js.Any])
    if (!js.isUndefined(isChecked)) __obj.updateDynamic("isChecked")(isChecked.asInstanceOf[js.Any])
    onChange.foreach(p => __obj.updateDynamic("onChange")(p.toJsFn))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.formol.mod.FieldSetProps[js.Any], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.formol.mod.FieldSet](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.formol.mod.FieldSetProps[js.Any]])(children: _*)
  }
  @JSImport("formol", "FieldSet")
  @js.native
  object componentImport extends js.Object
  
}

