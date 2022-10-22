package typingsJapgolly.raml1Parser.distParserArtifactsRaml10parserapiMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayTypeDeclarationScalarsAnnotations
  extends StObject
     with TypeDeclarationScalarsAnnotations {
  
  /**
    * ArrayTypeDeclaration.items annotations
    **/
  def items(): js.Array[js.Array[AnnotationRef]]
  
  /**
    * ArrayTypeDeclaration.maxItems annotations
    **/
  def maxItems(): js.Array[AnnotationRef]
  
  /**
    * ArrayTypeDeclaration.minItems annotations
    **/
  def minItems(): js.Array[AnnotationRef]
  
  /**
    * ArrayTypeDeclaration.uniqueItems annotations
    **/
  def uniqueItems(): js.Array[AnnotationRef]
}
object ArrayTypeDeclarationScalarsAnnotations {
  
  inline def apply(
    allowedTargets: CallbackTo[js.Array[js.Array[AnnotationRef]]],
    default: CallbackTo[js.Array[AnnotationRef]],
    description: CallbackTo[js.Array[AnnotationRef]],
    displayName: CallbackTo[js.Array[AnnotationRef]],
    isAnnotation: CallbackTo[js.Array[AnnotationRef]],
    items: CallbackTo[js.Array[js.Array[AnnotationRef]]],
    location: CallbackTo[js.Array[AnnotationRef]],
    locationKind: CallbackTo[js.Array[AnnotationRef]],
    maxItems: CallbackTo[js.Array[AnnotationRef]],
    minItems: CallbackTo[js.Array[AnnotationRef]],
    required: CallbackTo[js.Array[AnnotationRef]],
    schema: CallbackTo[js.Array[js.Array[AnnotationRef]]],
    `type`: CallbackTo[js.Array[js.Array[AnnotationRef]]],
    uniqueItems: CallbackTo[js.Array[AnnotationRef]]
  ): ArrayTypeDeclarationScalarsAnnotations = {
    val __obj = js.Dynamic.literal(allowedTargets = allowedTargets.toJsFn, default = default.toJsFn, description = description.toJsFn, displayName = displayName.toJsFn, isAnnotation = isAnnotation.toJsFn, items = items.toJsFn, location = location.toJsFn, locationKind = locationKind.toJsFn, maxItems = maxItems.toJsFn, minItems = minItems.toJsFn, required = required.toJsFn, schema = schema.toJsFn, uniqueItems = uniqueItems.toJsFn)
    __obj.updateDynamic("type")(`type`.toJsFn)
    __obj.asInstanceOf[ArrayTypeDeclarationScalarsAnnotations]
  }
  
  extension [Self <: ArrayTypeDeclarationScalarsAnnotations](x: Self) {
    
    inline def setItems(value: CallbackTo[js.Array[js.Array[AnnotationRef]]]): Self = StObject.set(x, "items", value.toJsFn)
    
    inline def setMaxItems(value: CallbackTo[js.Array[AnnotationRef]]): Self = StObject.set(x, "maxItems", value.toJsFn)
    
    inline def setMinItems(value: CallbackTo[js.Array[AnnotationRef]]): Self = StObject.set(x, "minItems", value.toJsFn)
    
    inline def setUniqueItems(value: CallbackTo[js.Array[AnnotationRef]]): Self = StObject.set(x, "uniqueItems", value.toJsFn)
  }
}
