package typingsJapgolly.tailwindcss.anon

import typingsJapgolly.tailwindcss.typesConfigMod.KeyValuePair
import typingsJapgolly.tailwindcss.typesConfigMod.ValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RespectImportant[T] extends StObject {
  
  var respectImportant: Boolean
  
  var respectPrefix: Boolean
  
  var supportsNegativeValues: Boolean
  
  var `type`: ValueType | js.Array[ValueType]
  
  var values: KeyValuePair[String, T]
}
object RespectImportant {
  
  inline def apply[T](
    respectImportant: Boolean,
    respectPrefix: Boolean,
    supportsNegativeValues: Boolean,
    `type`: ValueType | js.Array[ValueType],
    values: KeyValuePair[String, T]
  ): RespectImportant[T] = {
    val __obj = js.Dynamic.literal(respectImportant = respectImportant.asInstanceOf[js.Any], respectPrefix = respectPrefix.asInstanceOf[js.Any], supportsNegativeValues = supportsNegativeValues.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RespectImportant[T]]
  }
  
  extension [Self <: RespectImportant[?], T](x: Self & RespectImportant[T]) {
    
    inline def setRespectImportant(value: Boolean): Self = StObject.set(x, "respectImportant", value.asInstanceOf[js.Any])
    
    inline def setRespectPrefix(value: Boolean): Self = StObject.set(x, "respectPrefix", value.asInstanceOf[js.Any])
    
    inline def setSupportsNegativeValues(value: Boolean): Self = StObject.set(x, "supportsNegativeValues", value.asInstanceOf[js.Any])
    
    inline def setType(value: ValueType | js.Array[ValueType]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeVarargs(value: ValueType*): Self = StObject.set(x, "type", js.Array(value*))
    
    inline def setValues(value: KeyValuePair[String, T]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
