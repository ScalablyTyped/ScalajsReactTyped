package typingsJapgolly.raml1Parser.distParserArtifactsRaml10parserapiMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IAttribute
import typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IStructuredValue
import typingsJapgolly.raml1Parser.distParserWrappedAstParserCoreApiMod.BasicNode
import typingsJapgolly.raml1Parser.distParserWrappedAstParserCoreApiMod.ValueMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationRef
  extends StObject
     with Reference {
  
  /**
    * Returns referenced annotation
    **/
  def annotation(): TypeDeclaration
}
object AnnotationRef {
  
  inline def apply(
    RAMLVersion: CallbackTo[String],
    annotation: CallbackTo[TypeDeclaration],
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
  ): AnnotationRef = {
    val __obj = js.Dynamic.literal(RAMLVersion = RAMLVersion.toJsFn, annotation = annotation.toJsFn, highLevel = highLevel.toJsFn, kind = kind.toJsFn, meta = meta.toJsFn, name = name.toJsFn, optional = optional.toJsFn, parent = parent.toJsFn, structuredValue = structuredValue.toJsFn, toJSON = toJSON.toJsFn, value = value.toJsFn, wrapperClassName = wrapperClassName.toJsFn)
    __obj.asInstanceOf[AnnotationRef]
  }
  
  extension [Self <: AnnotationRef](x: Self) {
    
    inline def setAnnotation(value: CallbackTo[TypeDeclaration]): Self = StObject.set(x, "annotation", value.toJsFn)
  }
}
