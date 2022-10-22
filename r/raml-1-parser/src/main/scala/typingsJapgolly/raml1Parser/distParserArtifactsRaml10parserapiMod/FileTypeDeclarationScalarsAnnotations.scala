package typingsJapgolly.raml1Parser.distParserArtifactsRaml10parserapiMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileTypeDeclarationScalarsAnnotations
  extends StObject
     with TypeDeclarationScalarsAnnotations {
  
  /**
    * FileTypeDeclaration.fileTypes annotations
    **/
  def fileTypes(): js.Array[js.Array[AnnotationRef]]
  
  /**
    * FileTypeDeclaration.maxLength annotations
    **/
  def maxLength(): js.Array[AnnotationRef]
  
  /**
    * FileTypeDeclaration.minLength annotations
    **/
  def minLength(): js.Array[AnnotationRef]
}
object FileTypeDeclarationScalarsAnnotations {
  
  inline def apply(
    allowedTargets: CallbackTo[js.Array[js.Array[AnnotationRef]]],
    default: CallbackTo[js.Array[AnnotationRef]],
    description: CallbackTo[js.Array[AnnotationRef]],
    displayName: CallbackTo[js.Array[AnnotationRef]],
    fileTypes: CallbackTo[js.Array[js.Array[AnnotationRef]]],
    isAnnotation: CallbackTo[js.Array[AnnotationRef]],
    location: CallbackTo[js.Array[AnnotationRef]],
    locationKind: CallbackTo[js.Array[AnnotationRef]],
    maxLength: CallbackTo[js.Array[AnnotationRef]],
    minLength: CallbackTo[js.Array[AnnotationRef]],
    required: CallbackTo[js.Array[AnnotationRef]],
    schema: CallbackTo[js.Array[js.Array[AnnotationRef]]],
    `type`: CallbackTo[js.Array[js.Array[AnnotationRef]]]
  ): FileTypeDeclarationScalarsAnnotations = {
    val __obj = js.Dynamic.literal(allowedTargets = allowedTargets.toJsFn, default = default.toJsFn, description = description.toJsFn, displayName = displayName.toJsFn, fileTypes = fileTypes.toJsFn, isAnnotation = isAnnotation.toJsFn, location = location.toJsFn, locationKind = locationKind.toJsFn, maxLength = maxLength.toJsFn, minLength = minLength.toJsFn, required = required.toJsFn, schema = schema.toJsFn)
    __obj.updateDynamic("type")(`type`.toJsFn)
    __obj.asInstanceOf[FileTypeDeclarationScalarsAnnotations]
  }
  
  extension [Self <: FileTypeDeclarationScalarsAnnotations](x: Self) {
    
    inline def setFileTypes(value: CallbackTo[js.Array[js.Array[AnnotationRef]]]): Self = StObject.set(x, "fileTypes", value.toJsFn)
    
    inline def setMaxLength(value: CallbackTo[js.Array[AnnotationRef]]): Self = StObject.set(x, "maxLength", value.toJsFn)
    
    inline def setMinLength(value: CallbackTo[js.Array[AnnotationRef]]): Self = StObject.set(x, "minLength", value.toJsFn)
  }
}
