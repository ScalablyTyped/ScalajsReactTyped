package typingsJapgolly.raml1Parser.distParserArtifactsRaml10parserapiMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeDeclarationScalarsAnnotations extends StObject {
  
  /**
    * TypeDeclaration.default annotations
    **/
  def default(): js.Array[AnnotationRef]
  
  /**
    * TypeDeclaration.allowedTargets annotations
    **/
  def allowedTargets(): js.Array[js.Array[AnnotationRef]]
  
  /**
    * TypeDeclaration.description annotations
    **/
  def description(): js.Array[AnnotationRef]
  
  /**
    * TypeDeclaration.displayName annotations
    **/
  def displayName(): js.Array[AnnotationRef]
  
  /**
    * TypeDeclaration.isAnnotation annotations
    **/
  def isAnnotation(): js.Array[AnnotationRef]
  
  /**
    * TypeDeclaration.location annotations
    **/
  def location(): js.Array[AnnotationRef]
  
  /**
    * TypeDeclaration.locationKind annotations
    **/
  def locationKind(): js.Array[AnnotationRef]
  
  /**
    * TypeDeclaration.required annotations
    **/
  def required(): js.Array[AnnotationRef]
  
  /**
    * TypeDeclaration.schema annotations
    **/
  def schema(): js.Array[js.Array[AnnotationRef]]
  
  /**
    * TypeDeclaration.type annotations
    **/
  def `type`(): js.Array[js.Array[AnnotationRef]]
}
object TypeDeclarationScalarsAnnotations {
  
  inline def apply(
    allowedTargets: CallbackTo[js.Array[js.Array[AnnotationRef]]],
    default: CallbackTo[js.Array[AnnotationRef]],
    description: CallbackTo[js.Array[AnnotationRef]],
    displayName: CallbackTo[js.Array[AnnotationRef]],
    isAnnotation: CallbackTo[js.Array[AnnotationRef]],
    location: CallbackTo[js.Array[AnnotationRef]],
    locationKind: CallbackTo[js.Array[AnnotationRef]],
    required: CallbackTo[js.Array[AnnotationRef]],
    schema: CallbackTo[js.Array[js.Array[AnnotationRef]]],
    `type`: CallbackTo[js.Array[js.Array[AnnotationRef]]]
  ): TypeDeclarationScalarsAnnotations = {
    val __obj = js.Dynamic.literal(allowedTargets = allowedTargets.toJsFn, default = default.toJsFn, description = description.toJsFn, displayName = displayName.toJsFn, isAnnotation = isAnnotation.toJsFn, location = location.toJsFn, locationKind = locationKind.toJsFn, required = required.toJsFn, schema = schema.toJsFn)
    __obj.updateDynamic("type")(`type`.toJsFn)
    __obj.asInstanceOf[TypeDeclarationScalarsAnnotations]
  }
  
  extension [Self <: TypeDeclarationScalarsAnnotations](x: Self) {
    
    inline def setAllowedTargets(value: CallbackTo[js.Array[js.Array[AnnotationRef]]]): Self = StObject.set(x, "allowedTargets", value.toJsFn)
    
    inline def setDefault(value: CallbackTo[js.Array[AnnotationRef]]): Self = StObject.set(x, "default", value.toJsFn)
    
    inline def setDescription(value: CallbackTo[js.Array[AnnotationRef]]): Self = StObject.set(x, "description", value.toJsFn)
    
    inline def setDisplayName(value: CallbackTo[js.Array[AnnotationRef]]): Self = StObject.set(x, "displayName", value.toJsFn)
    
    inline def setIsAnnotation(value: CallbackTo[js.Array[AnnotationRef]]): Self = StObject.set(x, "isAnnotation", value.toJsFn)
    
    inline def setLocation(value: CallbackTo[js.Array[AnnotationRef]]): Self = StObject.set(x, "location", value.toJsFn)
    
    inline def setLocationKind(value: CallbackTo[js.Array[AnnotationRef]]): Self = StObject.set(x, "locationKind", value.toJsFn)
    
    inline def setRequired(value: CallbackTo[js.Array[AnnotationRef]]): Self = StObject.set(x, "required", value.toJsFn)
    
    inline def setSchema(value: CallbackTo[js.Array[js.Array[AnnotationRef]]]): Self = StObject.set(x, "schema", value.toJsFn)
    
    inline def setType(value: CallbackTo[js.Array[js.Array[AnnotationRef]]]): Self = StObject.set(x, "type", value.toJsFn)
  }
}
