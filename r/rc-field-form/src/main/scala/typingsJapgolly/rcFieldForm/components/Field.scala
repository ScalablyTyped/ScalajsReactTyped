package typingsJapgolly.rcFieldForm.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.rcFieldForm.fieldMod.ChildProps
import typingsJapgolly.rcFieldForm.fieldMod.FieldProps
import typingsJapgolly.rcFieldForm.fieldMod.ShouldUpdate
import typingsJapgolly.rcFieldForm.fieldMod.default
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

object Field {
  def apply(
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
    valuePropName: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: Element | (js.Function3[/* control */ ChildProps, /* meta */ Meta, /* form */ FormInstance, Node]) = null
  ): UnmountedWithRoot[FieldProps, default, Unit, FieldProps] = {
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
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.rcFieldForm.fieldMod.FieldProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.rcFieldForm.fieldMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.rcFieldForm.fieldMod.FieldProps])
  }
  @JSImport("rc-field-form/lib/Field", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

