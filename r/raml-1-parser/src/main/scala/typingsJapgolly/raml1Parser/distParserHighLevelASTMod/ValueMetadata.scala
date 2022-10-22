package typingsJapgolly.raml1Parser.distParserHighLevelASTMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueMetadata extends StObject {
  
  /**
    * Returns 'true', if the actual value is missing, and returned value has
    * been obtained from the RAML document by means of some rule.
    * @default false
    */
  def calculated(): Boolean
  
  /**
    * Returns 'true', if the actual value is missing, and returned value is
    * stated in the RAML spec as default for the property
    * @default false
    */
  def insertedAsDefault(): Boolean
  
  /**
    * Returns 'true', if all values are default.
    */
  def isDefault(): Boolean
  
  /**
    * Returns 'true' for optional siblings of traits and resource types
    * @default false
    */
  def optional(): Boolean
  
  def toJSON(): Any
}
object ValueMetadata {
  
  inline def apply(
    calculated: CallbackTo[Boolean],
    insertedAsDefault: CallbackTo[Boolean],
    isDefault: CallbackTo[Boolean],
    optional: CallbackTo[Boolean],
    toJSON: CallbackTo[Any]
  ): ValueMetadata = {
    val __obj = js.Dynamic.literal(calculated = calculated.toJsFn, insertedAsDefault = insertedAsDefault.toJsFn, isDefault = isDefault.toJsFn, optional = optional.toJsFn, toJSON = toJSON.toJsFn)
    __obj.asInstanceOf[ValueMetadata]
  }
  
  extension [Self <: ValueMetadata](x: Self) {
    
    inline def setCalculated(value: CallbackTo[Boolean]): Self = StObject.set(x, "calculated", value.toJsFn)
    
    inline def setInsertedAsDefault(value: CallbackTo[Boolean]): Self = StObject.set(x, "insertedAsDefault", value.toJsFn)
    
    inline def setIsDefault(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDefault", value.toJsFn)
    
    inline def setOptional(value: CallbackTo[Boolean]): Self = StObject.set(x, "optional", value.toJsFn)
    
    inline def setToJSON(value: CallbackTo[Any]): Self = StObject.set(x, "toJSON", value.toJsFn)
  }
}
