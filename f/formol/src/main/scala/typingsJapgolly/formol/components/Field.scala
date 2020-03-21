package typingsJapgolly.formol.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Ref
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.formol.mod.FieldProps
import typingsJapgolly.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Field {
  def apply(
    TypeField: ComponentType[js.Object] = null,
    choices: js.Array[_] = null,
    className: String = null,
    classNameModifiers: js.Any = null,
    dangerousRawHTMLLabels: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: VdomNode = null,
    extras: VdomNode = null,
    formatter: js.Any => CallbackTo[js.Any] = null,
    handleChange: (/* name */ String, js.Any) => Callback = null,
    handleEntered: (/* name */ String, js.Any) => Callback = null,
    i18n: js.Any = null,
    max: Int | Double = null,
    minLength: Int | Double = null,
    modified: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    normalizer: js.Any => CallbackTo[js.Any] = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    register: (/* name */ String, /* element */ Ref, /* validator */ js.Any, /* validityErrors */ js.Any) => Callback = null,
    required: js.UndefOr[Boolean] = js.undefined,
    size: Int | Double = null,
    title: String = null,
    `type`: String = null,
    unformatter: js.Any => CallbackTo[js.Any] = null,
    unit: VdomNode = null,
    unregister: /* name */ String => Callback = null,
    validator: js.Any => CallbackTo[String] = null,
    validityErrors: js.Any = null,
    value: js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: js.Any = null
  ): UnmountedWithRoot[FieldProps[js.Any], typingsJapgolly.formol.mod.Field, Unit, FieldProps[js.Any]] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (TypeField != null) __obj.updateDynamic("TypeField")(TypeField.asInstanceOf[js.Any])
    if (choices != null) __obj.updateDynamic("choices")(choices.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (classNameModifiers != null) __obj.updateDynamic("classNameModifiers")(classNameModifiers.asInstanceOf[js.Any])
    if (!js.isUndefined(dangerousRawHTMLLabels)) __obj.updateDynamic("dangerousRawHTMLLabels")(dangerousRawHTMLLabels.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.rawNode.asInstanceOf[js.Any])
    if (extras != null) __obj.updateDynamic("extras")(extras.rawNode.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction1((t0: js.Any) => formatter(t0).runNow()))
    if (handleChange != null) __obj.updateDynamic("handleChange")(js.Any.fromFunction2((t0: /* name */ java.lang.String, t1: js.Any) => handleChange(t0, t1).runNow()))
    if (handleEntered != null) __obj.updateDynamic("handleEntered")(js.Any.fromFunction2((t0: /* name */ java.lang.String, t1: js.Any) => handleEntered(t0, t1).runNow()))
    if (i18n != null) __obj.updateDynamic("i18n")(i18n.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (!js.isUndefined(modified)) __obj.updateDynamic("modified")(modified.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (normalizer != null) __obj.updateDynamic("normalizer")(js.Any.fromFunction1((t0: js.Any) => normalizer(t0).runNow()))
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (register != null) __obj.updateDynamic("register")(js.Any.fromFunction4((t0: /* name */ java.lang.String, t1: /* element */ japgolly.scalajs.react.raw.React.Ref, t2: /* validator */ js.Any, t3: /* validityErrors */ js.Any) => register(t0, t1, t2, t3).runNow()))
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (unformatter != null) __obj.updateDynamic("unformatter")(js.Any.fromFunction1((t0: js.Any) => unformatter(t0).runNow()))
    if (unit != null) __obj.updateDynamic("unit")(unit.rawNode.asInstanceOf[js.Any])
    if (unregister != null) __obj.updateDynamic("unregister")(js.Any.fromFunction1((t0: /* name */ java.lang.String) => unregister(t0).runNow()))
    if (validator != null) __obj.updateDynamic("validator")(js.Any.fromFunction1((t0: js.Any) => validator(t0).runNow()))
    if (validityErrors != null) __obj.updateDynamic("validityErrors")(validityErrors.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.formol.mod.FieldProps[js.Any], 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.formol.mod.Field](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.formol.mod.FieldProps[js.Any]])
  }
  @JSImport("formol", "Field")
  @js.native
  object componentImport extends js.Object
  
}

