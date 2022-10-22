package typingsJapgolly.pkijs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCompatible extends StObject {
  
  /**
    * Converts parsed ASN.1 object into current class
    * @param schema
    */
  def fromSchema(schema: SchemaType): Unit
  
  def toJSON(): Any
  
  /**
    * Convert current object to asn1js object and set correct values
    * @returns asn1js object
    */
  def toSchema(): SchemaType
}
object SchemaCompatible {
  
  inline def apply(fromSchema: SchemaType => Callback, toJSON: CallbackTo[Any], toSchema: CallbackTo[SchemaType]): SchemaCompatible = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1((t0: SchemaType) => fromSchema(t0).runNow()), toJSON = toJSON.toJsFn, toSchema = toSchema.toJsFn)
    __obj.asInstanceOf[SchemaCompatible]
  }
  
  extension [Self <: SchemaCompatible](x: Self) {
    
    inline def setFromSchema(value: SchemaType => Callback): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1((t0: SchemaType) => value(t0).runNow()))
    
    inline def setToJSON(value: CallbackTo[Any]): Self = StObject.set(x, "toJSON", value.toJsFn)
    
    inline def setToSchema(value: CallbackTo[SchemaType]): Self = StObject.set(x, "toSchema", value.toJsFn)
  }
}
