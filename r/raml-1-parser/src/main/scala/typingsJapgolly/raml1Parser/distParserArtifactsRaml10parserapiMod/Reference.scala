package typingsJapgolly.raml1Parser.distParserArtifactsRaml10parserapiMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IAttribute
import typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IStructuredValue
import typingsJapgolly.raml1Parser.distParserWrappedAstParserCoreApiMod.AttributeNode
import typingsJapgolly.raml1Parser.distParserWrappedAstParserCoreApiMod.BasicNode
import typingsJapgolly.raml1Parser.distParserWrappedAstParserCoreApiMod.ValueMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reference
  extends StObject
     with AttributeNode {
  
  /**
    * Returns name of referenced object
    **/
  def name(): String
  
  /**
    * Returns a structured object if the reference point to one.
    **/
  def structuredValue(): TypeInstance
  
  /**
    * @return StructuredValue object representing the node value
    **/
  def value(): IStructuredValue
}
object Reference {
  
  inline def apply(
    RAMLVersion: CallbackTo[String],
    highLevel: CallbackTo[IAttribute],
    kind: CallbackTo[String],
    meta: CallbackTo[ValueMetadata],
    name: CallbackTo[String],
    optional: CallbackTo[Boolean],
    parent: CallbackTo[BasicNode],
    structuredValue: CallbackTo[TypeInstance],
    toJSON: CallbackTo[Any],
    value: CallbackTo[IStructuredValue],
    wrapperClassName: CallbackTo[String]
  ): Reference = {
    val __obj = js.Dynamic.literal(RAMLVersion = RAMLVersion.toJsFn, highLevel = highLevel.toJsFn, kind = kind.toJsFn, meta = meta.toJsFn, name = name.toJsFn, optional = optional.toJsFn, parent = parent.toJsFn, structuredValue = structuredValue.toJsFn, toJSON = toJSON.toJsFn, value = value.toJsFn, wrapperClassName = wrapperClassName.toJsFn)
    __obj.asInstanceOf[Reference]
  }
  
  extension [Self <: Reference](x: Self) {
    
    inline def setName(value: CallbackTo[String]): Self = StObject.set(x, "name", value.toJsFn)
    
    inline def setStructuredValue(value: CallbackTo[TypeInstance]): Self = StObject.set(x, "structuredValue", value.toJsFn)
    
    inline def setValue(value: CallbackTo[IStructuredValue]): Self = StObject.set(x, "value", value.toJsFn)
  }
}
