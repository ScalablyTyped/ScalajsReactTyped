package typingsJapgolly.raml1Parser.distParserArtifactsRaml10parserapiMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringTypeDeclarationScalarsAnnotations
  extends StObject
     with TypeDeclarationScalarsAnnotations {
  
  /**
    * StringTypeDeclaration.enum annotations
    **/
  def `enum`(): js.Array[js.Array[AnnotationRef]]
  
  /**
    * StringTypeDeclaration.maxLength annotations
    **/
  def maxLength(): js.Array[AnnotationRef]
  
  /**
    * StringTypeDeclaration.minLength annotations
    **/
  def minLength(): js.Array[AnnotationRef]
  
  /**
    * StringTypeDeclaration.pattern annotations
    **/
  def pattern(): js.Array[AnnotationRef]
}
object StringTypeDeclarationScalarsAnnotations {
  
  inline def apply(
    allowedTargets: CallbackTo[js.Array[js.Array[AnnotationRef]]],
    default: CallbackTo[js.Array[AnnotationRef]],
    description: CallbackTo[js.Array[AnnotationRef]],
    displayName: CallbackTo[js.Array[AnnotationRef]],
    `enum`: CallbackTo[js.Array[js.Array[AnnotationRef]]],
    isAnnotation: CallbackTo[js.Array[AnnotationRef]],
    location: CallbackTo[js.Array[AnnotationRef]],
    locationKind: CallbackTo[js.Array[AnnotationRef]],
    maxLength: CallbackTo[js.Array[AnnotationRef]],
    minLength: CallbackTo[js.Array[AnnotationRef]],
    pattern: CallbackTo[js.Array[AnnotationRef]],
    required: CallbackTo[js.Array[AnnotationRef]],
    schema: CallbackTo[js.Array[js.Array[AnnotationRef]]],
    `type`: CallbackTo[js.Array[js.Array[AnnotationRef]]]
  ): StringTypeDeclarationScalarsAnnotations = {
    val __obj = js.Dynamic.literal(allowedTargets = allowedTargets.toJsFn, default = default.toJsFn, description = description.toJsFn, displayName = displayName.toJsFn, isAnnotation = isAnnotation.toJsFn, location = location.toJsFn, locationKind = locationKind.toJsFn, maxLength = maxLength.toJsFn, minLength = minLength.toJsFn, pattern = pattern.toJsFn, required = required.toJsFn, schema = schema.toJsFn)
    __obj.updateDynamic("enum")(`enum`.toJsFn)
    __obj.updateDynamic("type")(`type`.toJsFn)
    __obj.asInstanceOf[StringTypeDeclarationScalarsAnnotations]
  }
  
  extension [Self <: StringTypeDeclarationScalarsAnnotations](x: Self) {
    
    inline def setEnum(value: CallbackTo[js.Array[js.Array[AnnotationRef]]]): Self = StObject.set(x, "enum", value.toJsFn)
    
    inline def setMaxLength(value: CallbackTo[js.Array[AnnotationRef]]): Self = StObject.set(x, "maxLength", value.toJsFn)
    
    inline def setMinLength(value: CallbackTo[js.Array[AnnotationRef]]): Self = StObject.set(x, "minLength", value.toJsFn)
    
    inline def setPattern(value: CallbackTo[js.Array[AnnotationRef]]): Self = StObject.set(x, "pattern", value.toJsFn)
  }
}
