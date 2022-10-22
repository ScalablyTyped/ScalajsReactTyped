package typingsJapgolly.reactJsonschemaForm.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.jsonSchema.mod.JSONSchema6
import typingsJapgolly.reactJsonschemaForm.anon.Definitions
import typingsJapgolly.reactJsonschemaForm.libComponentsFieldsSchemaFieldMod.SchemaFieldProps
import typingsJapgolly.reactJsonschemaForm.libComponentsFieldsSchemaFieldMod.default
import typingsJapgolly.reactJsonschemaForm.mod.ErrorSchema
import typingsJapgolly.reactJsonschemaForm.mod.IdSchema
import typingsJapgolly.reactJsonschemaForm.mod.UiSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SchemaField {
  
  inline def apply(
    errorSchema: ErrorSchema,
    formContext: Any,
    formData: Any,
    idSchema: IdSchema[Any],
    registry: Definitions,
    schema: JSONSchema6,
    uiSchema: UiSchema
  ): Default[default] = {
    val __props = js.Dynamic.literal(errorSchema = errorSchema.asInstanceOf[js.Any], formContext = formContext.asInstanceOf[js.Any], formData = formData.asInstanceOf[js.Any], idSchema = idSchema.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], uiSchema = uiSchema.asInstanceOf[js.Any])
    new Default[default](js.Array(this.component, __props.asInstanceOf[SchemaFieldProps[Any]]))
  }
  
  @JSImport("react-jsonschema-form/lib/components/fields/SchemaField", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: SchemaFieldProps[Any]): Default[default] = new Default[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
