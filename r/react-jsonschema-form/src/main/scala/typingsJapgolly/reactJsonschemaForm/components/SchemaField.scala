package typingsJapgolly.reactJsonschemaForm.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.jsonSchema.mod.JSONSchema6
import typingsJapgolly.reactJsonschemaForm.AnonDefinitions
import typingsJapgolly.reactJsonschemaForm.mod.ErrorSchema
import typingsJapgolly.reactJsonschemaForm.mod.IdSchema
import typingsJapgolly.reactJsonschemaForm.mod.UiSchema
import typingsJapgolly.reactJsonschemaForm.schemaFieldMod.SchemaFieldProps
import typingsJapgolly.reactJsonschemaForm.schemaFieldMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SchemaField {
  def apply(
    errorSchema: ErrorSchema,
    formContext: js.Any,
    formData: js.Any,
    idSchema: IdSchema[_],
    registry: AnonDefinitions,
    schema: JSONSchema6,
    uiSchema: UiSchema,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SchemaFieldProps[js.Any], default, Unit, SchemaFieldProps[js.Any]] = {
    val __obj = js.Dynamic.literal(errorSchema = errorSchema.asInstanceOf[js.Any], formContext = formContext.asInstanceOf[js.Any], formData = formData.asInstanceOf[js.Any], idSchema = idSchema.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], uiSchema = uiSchema.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactJsonschemaForm.schemaFieldMod.SchemaFieldProps[js.Any], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactJsonschemaForm.schemaFieldMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactJsonschemaForm.schemaFieldMod.SchemaFieldProps[js.Any]])(children: _*)
  }
  @JSImport("react-jsonschema-form/lib/components/fields/SchemaField", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

