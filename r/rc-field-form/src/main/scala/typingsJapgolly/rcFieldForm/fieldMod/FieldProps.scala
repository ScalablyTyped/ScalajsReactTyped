package typingsJapgolly.rcFieldForm.fieldMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.rcFieldForm.interfaceMod.EventArgs
import typingsJapgolly.rcFieldForm.interfaceMod.FormInstance
import typingsJapgolly.rcFieldForm.interfaceMod.Meta
import typingsJapgolly.rcFieldForm.interfaceMod.NamePath
import typingsJapgolly.rcFieldForm.interfaceMod.Rule
import typingsJapgolly.rcFieldForm.interfaceMod.Store
import typingsJapgolly.rcFieldForm.interfaceMod.StoreValue
import typingsJapgolly.rcFieldForm.rcFieldFormBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldProps extends js.Object {
  var children: js.UndefOr[
    Element | (js.Function3[/* control */ ChildProps, /* meta */ Meta, /* form */ FormInstance, Node])
  ] = js.undefined
  /**
    * Set up `dependencies` field.
    * When dependencies field update and current field is touched,
    * will trigger validate rules and render.
    */
  var dependencies: js.UndefOr[js.Array[NamePath]] = js.undefined
  var getValueFromEvent: js.UndefOr[js.Function1[/* args */ EventArgs, StoreValue]] = js.undefined
  var name: js.UndefOr[NamePath] = js.undefined
  var normalize: js.UndefOr[
    js.Function3[/* value */ StoreValue, /* prevValue */ StoreValue, /* allValues */ Store, StoreValue]
  ] = js.undefined
  var onReset: js.UndefOr[js.Function0[Unit]] = js.undefined
  var rules: js.UndefOr[js.Array[Rule]] = js.undefined
  var shouldUpdate: js.UndefOr[ShouldUpdate] = js.undefined
  var trigger: js.UndefOr[String] = js.undefined
  var validateFirst: js.UndefOr[Boolean] = js.undefined
  var validateTrigger: js.UndefOr[String | js.Array[String] | `false`] = js.undefined
  var valuePropName: js.UndefOr[String] = js.undefined
}

object FieldProps {
  @scala.inline
  def apply(
    children: Element | (js.Function3[/* control */ ChildProps, /* meta */ Meta, /* form */ FormInstance, Node]) = null,
    dependencies: js.Array[NamePath] = null,
    getValueFromEvent: /* args */ EventArgs => CallbackTo[StoreValue] = null,
    name: NamePath = null,
    normalize: (/* value */ StoreValue, /* prevValue */ StoreValue, /* allValues */ Store) => CallbackTo[StoreValue] = null,
    onReset: js.UndefOr[Callback] = js.undefined,
    rules: js.Array[Rule] = null,
    shouldUpdate: ShouldUpdate = null,
    trigger: String = null,
    validateFirst: js.UndefOr[Boolean] = js.undefined,
    validateTrigger: String | js.Array[String] | `false` = null,
    valuePropName: String = null
  ): FieldProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (getValueFromEvent != null) __obj.updateDynamic("getValueFromEvent")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.rcFieldForm.interfaceMod.EventArgs) => getValueFromEvent(t0).runNow()))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (normalize != null) __obj.updateDynamic("normalize")(js.Any.fromFunction3((t0: /* value */ typingsJapgolly.rcFieldForm.interfaceMod.StoreValue, t1: /* prevValue */ typingsJapgolly.rcFieldForm.interfaceMod.StoreValue, t2: /* allValues */ typingsJapgolly.rcFieldForm.interfaceMod.Store) => normalize(t0, t1, t2).runNow()))
    onReset.foreach(p => __obj.updateDynamic("onReset")(p.toJsFn))
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    if (shouldUpdate != null) __obj.updateDynamic("shouldUpdate")(shouldUpdate.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (!js.isUndefined(validateFirst)) __obj.updateDynamic("validateFirst")(validateFirst.asInstanceOf[js.Any])
    if (validateTrigger != null) __obj.updateDynamic("validateTrigger")(validateTrigger.asInstanceOf[js.Any])
    if (valuePropName != null) __obj.updateDynamic("valuePropName")(valuePropName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldProps]
  }
}

