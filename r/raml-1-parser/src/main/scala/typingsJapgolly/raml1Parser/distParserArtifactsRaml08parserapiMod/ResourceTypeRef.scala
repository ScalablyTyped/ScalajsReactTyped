package typingsJapgolly.raml1Parser.distParserArtifactsRaml08parserapiMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IAttribute
import typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IStructuredValue
import typingsJapgolly.raml1Parser.distParserWrappedAstParserCoreApiMod.BasicNode
import typingsJapgolly.raml1Parser.distParserWrappedAstParserCoreApiMod.ValueMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceTypeRef
  extends StObject
     with Reference {
  
  /**
    * Returns referenced resource type
    **/
  def resourceType(): ResourceType
}
object ResourceTypeRef {
  
  inline def apply(
    RAMLVersion: CallbackTo[String],
    highLevel: CallbackTo[IAttribute],
    kind: CallbackTo[String],
    meta: CallbackTo[ValueMetadata],
    name: CallbackTo[String],
    optional: CallbackTo[Boolean],
    parent: CallbackTo[BasicNode],
    resourceType: CallbackTo[ResourceType],
    structuredValue: CallbackTo[TypeInstance],
    toJSON: CallbackTo[Any],
    value: CallbackTo[IStructuredValue],
    wrapperClassName: CallbackTo[String]
  ): ResourceTypeRef = {
    val __obj = js.Dynamic.literal(RAMLVersion = RAMLVersion.toJsFn, highLevel = highLevel.toJsFn, kind = kind.toJsFn, meta = meta.toJsFn, name = name.toJsFn, optional = optional.toJsFn, parent = parent.toJsFn, resourceType = resourceType.toJsFn, structuredValue = structuredValue.toJsFn, toJSON = toJSON.toJsFn, value = value.toJsFn, wrapperClassName = wrapperClassName.toJsFn)
    __obj.asInstanceOf[ResourceTypeRef]
  }
  
  extension [Self <: ResourceTypeRef](x: Self) {
    
    inline def setResourceType(value: CallbackTo[ResourceType]): Self = StObject.set(x, "resourceType", value.toJsFn)
  }
}
