package typingsJapgolly.raml1Parser.distParserHighLevelASTMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeMetadata
  extends StObject
     with ValueMetadata {
  
  /**
    * Returns metadata for those properties of the node, whose type is primitive or an array of primitive.
    */
  def primitiveValuesMeta(): StringDictionary[ValueMetadata]
}
object NodeMetadata {
  
  inline def apply(
    calculated: CallbackTo[Boolean],
    insertedAsDefault: CallbackTo[Boolean],
    isDefault: CallbackTo[Boolean],
    optional: CallbackTo[Boolean],
    primitiveValuesMeta: CallbackTo[StringDictionary[ValueMetadata]],
    toJSON: CallbackTo[Any]
  ): NodeMetadata = {
    val __obj = js.Dynamic.literal(calculated = calculated.toJsFn, insertedAsDefault = insertedAsDefault.toJsFn, isDefault = isDefault.toJsFn, optional = optional.toJsFn, primitiveValuesMeta = primitiveValuesMeta.toJsFn, toJSON = toJSON.toJsFn)
    __obj.asInstanceOf[NodeMetadata]
  }
  
  extension [Self <: NodeMetadata](x: Self) {
    
    inline def setPrimitiveValuesMeta(value: CallbackTo[StringDictionary[ValueMetadata]]): Self = StObject.set(x, "primitiveValuesMeta", value.toJsFn)
  }
}
