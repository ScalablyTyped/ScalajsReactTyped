package typingsJapgolly.rjsfUtils.mod

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The properties that are passed to a `ArrayFieldDescriptionTemplate` implementation */
/* Inlined std.Omit<@rjsf/utils.@rjsf/utils.DescriptionFieldProps<T, F>, 'id' | 'description'> & {  description :string | react.react.ReactElement | undefined,   idSchema :@rjsf/utils.@rjsf/utils.IdSchema<T>} */
trait ArrayFieldDescriptionProps[T, F] extends StObject {
  
  /** The description of the field being rendered */
  var description: js.UndefOr[String | Element] = js.undefined
  
  /** The idSchema of the field in the hierarchy */
  var idSchema: IdSchema[T]
  
  var registry: Registry[T, F]
  
  var schema: RJSFSchema
  
  var uiSchema: js.UndefOr[UiSchema[T, F]] = js.undefined
}
object ArrayFieldDescriptionProps {
  
  inline def apply[T, F](idSchema: IdSchema[T], registry: Registry[T, F], schema: RJSFSchema): ArrayFieldDescriptionProps[T, F] = {
    val __obj = js.Dynamic.literal(idSchema = idSchema.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayFieldDescriptionProps[T, F]]
  }
  
  extension [Self <: ArrayFieldDescriptionProps[?, ?], T, F](x: Self & (ArrayFieldDescriptionProps[T, F])) {
    
    inline def setDescription(value: String | Element): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDescriptionVdomElement(value: VdomElement): Self = StObject.set(x, "description", value.rawElement.asInstanceOf[js.Any])
    
    inline def setIdSchema(value: IdSchema[T]): Self = StObject.set(x, "idSchema", value.asInstanceOf[js.Any])
    
    inline def setRegistry(value: Registry[T, F]): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: RJSFSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setUiSchema(value: UiSchema[T, F]): Self = StObject.set(x, "uiSchema", value.asInstanceOf[js.Any])
    
    inline def setUiSchemaUndefined: Self = StObject.set(x, "uiSchema", js.undefined)
  }
}
