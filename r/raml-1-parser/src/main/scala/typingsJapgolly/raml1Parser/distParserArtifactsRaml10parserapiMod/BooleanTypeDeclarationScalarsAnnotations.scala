package typingsJapgolly.raml1Parser.distParserArtifactsRaml10parserapiMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BooleanTypeDeclarationScalarsAnnotations
  extends StObject
     with TypeDeclarationScalarsAnnotations {
  
  /**
    * BooleanTypeDeclaration.enum annotations
    **/
  def `enum`(): js.Array[js.Array[AnnotationRef]]
}
object BooleanTypeDeclarationScalarsAnnotations {
  
  inline def apply(
    allowedTargets: CallbackTo[js.Array[js.Array[AnnotationRef]]],
    default: CallbackTo[js.Array[AnnotationRef]],
    description: CallbackTo[js.Array[AnnotationRef]],
    displayName: CallbackTo[js.Array[AnnotationRef]],
    `enum`: CallbackTo[js.Array[js.Array[AnnotationRef]]],
    isAnnotation: CallbackTo[js.Array[AnnotationRef]],
    location: CallbackTo[js.Array[AnnotationRef]],
    locationKind: CallbackTo[js.Array[AnnotationRef]],
    required: CallbackTo[js.Array[AnnotationRef]],
    schema: CallbackTo[js.Array[js.Array[AnnotationRef]]],
    `type`: CallbackTo[js.Array[js.Array[AnnotationRef]]]
  ): BooleanTypeDeclarationScalarsAnnotations = {
    val __obj = js.Dynamic.literal(allowedTargets = allowedTargets.toJsFn, default = default.toJsFn, description = description.toJsFn, displayName = displayName.toJsFn, isAnnotation = isAnnotation.toJsFn, location = location.toJsFn, locationKind = locationKind.toJsFn, required = required.toJsFn, schema = schema.toJsFn)
    __obj.updateDynamic("enum")(`enum`.toJsFn)
    __obj.updateDynamic("type")(`type`.toJsFn)
    __obj.asInstanceOf[BooleanTypeDeclarationScalarsAnnotations]
  }
  
  extension [Self <: BooleanTypeDeclarationScalarsAnnotations](x: Self) {
    
    inline def setEnum(value: CallbackTo[js.Array[js.Array[AnnotationRef]]]): Self = StObject.set(x, "enum", value.toJsFn)
  }
}
