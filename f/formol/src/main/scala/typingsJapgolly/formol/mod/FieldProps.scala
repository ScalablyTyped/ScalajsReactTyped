package typingsJapgolly.formol.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.raw.React.Ref
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldProps[V] extends js.Object {
  var TypeField: js.UndefOr[ComponentType[js.Object]] = js.undefined
  var children: js.UndefOr[js.Any] = js.undefined
  var choices: js.UndefOr[js.Array[_]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var classNameModifiers: js.UndefOr[js.Any] = js.undefined
  var dangerousRawHTMLLabels: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var error: js.UndefOr[Node] = js.undefined
  var extras: js.UndefOr[Node] = js.undefined
  var formatter: js.UndefOr[js.Function1[/* v */ V, V]] = js.undefined
  var handleChange: js.UndefOr[js.Function2[/* name */ String, /* v */ V, Unit]] = js.undefined
  var handleEntered: js.UndefOr[js.Function2[/* name */ String, /* v */ V, Unit]] = js.undefined
  var i18n: js.UndefOr[js.Any] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var minLength: js.UndefOr[Double] = js.undefined
  var modified: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var normalizer: js.UndefOr[js.Function1[/* v */ V, V]] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var register: js.UndefOr[
    js.Function4[
      /* name */ String, 
      /* element */ Ref, 
      /* validator */ js.Any, 
      /* validityErrors */ js.Any, 
      Unit
    ]
  ] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var unformatter: js.UndefOr[js.Function1[/* v */ V, V]] = js.undefined
  var unit: js.UndefOr[Node] = js.undefined
  var unregister: js.UndefOr[js.Function1[/* name */ String, Unit]] = js.undefined
  var validator: js.UndefOr[js.Function1[/* v */ V, String]] = js.undefined
  var validityErrors: js.UndefOr[js.Any] = js.undefined
  var value: js.UndefOr[V] = js.undefined
}

object FieldProps {
  @scala.inline
  def apply[V](
    TypeField: ComponentType[js.Object] = null,
    children: js.Any = null,
    choices: js.Array[_] = null,
    className: String = null,
    classNameModifiers: js.Any = null,
    dangerousRawHTMLLabels: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: VdomNode = null,
    extras: VdomNode = null,
    formatter: /* v */ V => CallbackTo[V] = null,
    handleChange: (/* name */ String, /* v */ V) => Callback = null,
    handleEntered: (/* name */ String, /* v */ V) => Callback = null,
    i18n: js.Any = null,
    max: Int | Double = null,
    minLength: Int | Double = null,
    modified: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    normalizer: /* v */ V => CallbackTo[V] = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    register: (/* name */ String, /* element */ Ref, /* validator */ js.Any, /* validityErrors */ js.Any) => Callback = null,
    required: js.UndefOr[Boolean] = js.undefined,
    size: Int | Double = null,
    title: String = null,
    `type`: String = null,
    unformatter: /* v */ V => CallbackTo[V] = null,
    unit: VdomNode = null,
    unregister: /* name */ String => Callback = null,
    validator: /* v */ V => CallbackTo[String] = null,
    validityErrors: js.Any = null,
    value: V = null
  ): FieldProps[V] = {
    val __obj = js.Dynamic.literal()
    if (TypeField != null) __obj.updateDynamic("TypeField")(TypeField.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (choices != null) __obj.updateDynamic("choices")(choices.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (classNameModifiers != null) __obj.updateDynamic("classNameModifiers")(classNameModifiers.asInstanceOf[js.Any])
    if (!js.isUndefined(dangerousRawHTMLLabels)) __obj.updateDynamic("dangerousRawHTMLLabels")(dangerousRawHTMLLabels.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.rawNode.asInstanceOf[js.Any])
    if (extras != null) __obj.updateDynamic("extras")(extras.rawNode.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction1((t0: /* v */ V) => formatter(t0).runNow()))
    if (handleChange != null) __obj.updateDynamic("handleChange")(js.Any.fromFunction2((t0: /* name */ java.lang.String, t1: /* v */ V) => handleChange(t0, t1).runNow()))
    if (handleEntered != null) __obj.updateDynamic("handleEntered")(js.Any.fromFunction2((t0: /* name */ java.lang.String, t1: /* v */ V) => handleEntered(t0, t1).runNow()))
    if (i18n != null) __obj.updateDynamic("i18n")(i18n.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (!js.isUndefined(modified)) __obj.updateDynamic("modified")(modified.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (normalizer != null) __obj.updateDynamic("normalizer")(js.Any.fromFunction1((t0: /* v */ V) => normalizer(t0).runNow()))
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (register != null) __obj.updateDynamic("register")(js.Any.fromFunction4((t0: /* name */ java.lang.String, t1: /* element */ japgolly.scalajs.react.raw.React.Ref, t2: /* validator */ js.Any, t3: /* validityErrors */ js.Any) => register(t0, t1, t2, t3).runNow()))
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (unformatter != null) __obj.updateDynamic("unformatter")(js.Any.fromFunction1((t0: /* v */ V) => unformatter(t0).runNow()))
    if (unit != null) __obj.updateDynamic("unit")(unit.rawNode.asInstanceOf[js.Any])
    if (unregister != null) __obj.updateDynamic("unregister")(js.Any.fromFunction1((t0: /* name */ java.lang.String) => unregister(t0).runNow()))
    if (validator != null) __obj.updateDynamic("validator")(js.Any.fromFunction1((t0: /* v */ V) => validator(t0).runNow()))
    if (validityErrors != null) __obj.updateDynamic("validityErrors")(validityErrors.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldProps[V]]
  }
}

