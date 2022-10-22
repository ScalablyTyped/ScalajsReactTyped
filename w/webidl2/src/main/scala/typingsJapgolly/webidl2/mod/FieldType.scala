package typingsJapgolly.webidl2.mod

import typingsJapgolly.webidl2.webidl2Strings.field
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldType
  extends StObject
     with AbstractBase {
  
  /** A default value, absent if there is none. */
  var default: ValueDescription | Null
  
  /** An IDL Type describing what field's type. */
  var idlType: IDLTypeDescription
  
  /** The name of the field. */
  var name: String
  
  @JSName("parent")
  var parent_FieldType: DictionaryType
  
  /** Boolean indicating whether this is a required field. */
  var required: Boolean
  
  @JSName("type")
  var type_FieldType: field
}
object FieldType {
  
  inline def apply(
    extAttrs: js.Array[ExtendedAttribute],
    idlType: IDLTypeDescription,
    name: String,
    parent: DictionaryType,
    required: Boolean
  ): FieldType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], default = null)
    __obj.updateDynamic("type")("field")
    __obj.asInstanceOf[FieldType]
  }
  
  extension [Self <: FieldType](x: Self) {
    
    inline def setDefault(value: ValueDescription): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultNull: Self = StObject.set(x, "default", null)
    
    inline def setIdlType(value: IDLTypeDescription): Self = StObject.set(x, "idlType", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: DictionaryType): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setType(value: field): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
