package typingsJapgolly.raml1Parser.distParserArtifactsRaml10parserapiMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberTypeDeclarationScalarsAnnotations
  extends StObject
     with TypeDeclarationScalarsAnnotations {
  
  /**
    * NumberTypeDeclaration.enum annotations
    **/
  def `enum`(): js.Array[js.Array[AnnotationRef]]
  
  /**
    * NumberTypeDeclaration.format annotations
    **/
  def format(): js.Array[AnnotationRef]
  
  /**
    * NumberTypeDeclaration.maximum annotations
    **/
  def maximum(): js.Array[AnnotationRef]
  
  /**
    * NumberTypeDeclaration.minimum annotations
    **/
  def minimum(): js.Array[AnnotationRef]
  
  /**
    * NumberTypeDeclaration.multipleOf annotations
    **/
  def multipleOf(): js.Array[AnnotationRef]
}
object NumberTypeDeclarationScalarsAnnotations {
  
  inline def apply(
    allowedTargets: CallbackTo[js.Array[js.Array[AnnotationRef]]],
    default: CallbackTo[js.Array[AnnotationRef]],
    description: CallbackTo[js.Array[AnnotationRef]],
    displayName: CallbackTo[js.Array[AnnotationRef]],
    `enum`: CallbackTo[js.Array[js.Array[AnnotationRef]]],
    format: CallbackTo[js.Array[AnnotationRef]],
    isAnnotation: CallbackTo[js.Array[AnnotationRef]],
    location: CallbackTo[js.Array[AnnotationRef]],
    locationKind: CallbackTo[js.Array[AnnotationRef]],
    maximum: CallbackTo[js.Array[AnnotationRef]],
    minimum: CallbackTo[js.Array[AnnotationRef]],
    multipleOf: CallbackTo[js.Array[AnnotationRef]],
    required: CallbackTo[js.Array[AnnotationRef]],
    schema: CallbackTo[js.Array[js.Array[AnnotationRef]]],
    `type`: CallbackTo[js.Array[js.Array[AnnotationRef]]]
  ): NumberTypeDeclarationScalarsAnnotations = {
    val __obj = js.Dynamic.literal(allowedTargets = allowedTargets.toJsFn, default = default.toJsFn, description = description.toJsFn, displayName = displayName.toJsFn, format = format.toJsFn, isAnnotation = isAnnotation.toJsFn, location = location.toJsFn, locationKind = locationKind.toJsFn, maximum = maximum.toJsFn, minimum = minimum.toJsFn, multipleOf = multipleOf.toJsFn, required = required.toJsFn, schema = schema.toJsFn)
    __obj.updateDynamic("enum")(`enum`.toJsFn)
    __obj.updateDynamic("type")(`type`.toJsFn)
    __obj.asInstanceOf[NumberTypeDeclarationScalarsAnnotations]
  }
  
  extension [Self <: NumberTypeDeclarationScalarsAnnotations](x: Self) {
    
    inline def setEnum(value: CallbackTo[js.Array[js.Array[AnnotationRef]]]): Self = StObject.set(x, "enum", value.toJsFn)
    
    inline def setFormat(value: CallbackTo[js.Array[AnnotationRef]]): Self = StObject.set(x, "format", value.toJsFn)
    
    inline def setMaximum(value: CallbackTo[js.Array[AnnotationRef]]): Self = StObject.set(x, "maximum", value.toJsFn)
    
    inline def setMinimum(value: CallbackTo[js.Array[AnnotationRef]]): Self = StObject.set(x, "minimum", value.toJsFn)
    
    inline def setMultipleOf(value: CallbackTo[js.Array[AnnotationRef]]): Self = StObject.set(x, "multipleOf", value.toJsFn)
  }
}
