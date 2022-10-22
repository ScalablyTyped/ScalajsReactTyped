package typingsJapgolly.raml1Parser.distParserArtifactsRaml10parserapiMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectTypeDeclarationScalarsAnnotations
  extends StObject
     with TypeDeclarationScalarsAnnotations {
  
  /**
    * ObjectTypeDeclaration.additionalProperties annotations
    **/
  def additionalProperties(): js.Array[AnnotationRef]
  
  /**
    * ObjectTypeDeclaration.discriminator annotations
    **/
  def discriminator(): js.Array[AnnotationRef]
  
  /**
    * ObjectTypeDeclaration.discriminatorValue annotations
    **/
  def discriminatorValue(): js.Array[AnnotationRef]
  
  /**
    * ObjectTypeDeclaration.enum annotations
    **/
  def `enum`(): js.Array[js.Array[AnnotationRef]]
  
  /**
    * ObjectTypeDeclaration.maxProperties annotations
    **/
  def maxProperties(): js.Array[AnnotationRef]
  
  /**
    * ObjectTypeDeclaration.minProperties annotations
    **/
  def minProperties(): js.Array[AnnotationRef]
}
object ObjectTypeDeclarationScalarsAnnotations {
  
  inline def apply(
    additionalProperties: CallbackTo[js.Array[AnnotationRef]],
    allowedTargets: CallbackTo[js.Array[js.Array[AnnotationRef]]],
    default: CallbackTo[js.Array[AnnotationRef]],
    description: CallbackTo[js.Array[AnnotationRef]],
    discriminator: CallbackTo[js.Array[AnnotationRef]],
    discriminatorValue: CallbackTo[js.Array[AnnotationRef]],
    displayName: CallbackTo[js.Array[AnnotationRef]],
    `enum`: CallbackTo[js.Array[js.Array[AnnotationRef]]],
    isAnnotation: CallbackTo[js.Array[AnnotationRef]],
    location: CallbackTo[js.Array[AnnotationRef]],
    locationKind: CallbackTo[js.Array[AnnotationRef]],
    maxProperties: CallbackTo[js.Array[AnnotationRef]],
    minProperties: CallbackTo[js.Array[AnnotationRef]],
    required: CallbackTo[js.Array[AnnotationRef]],
    schema: CallbackTo[js.Array[js.Array[AnnotationRef]]],
    `type`: CallbackTo[js.Array[js.Array[AnnotationRef]]]
  ): ObjectTypeDeclarationScalarsAnnotations = {
    val __obj = js.Dynamic.literal(additionalProperties = additionalProperties.toJsFn, allowedTargets = allowedTargets.toJsFn, default = default.toJsFn, description = description.toJsFn, discriminator = discriminator.toJsFn, discriminatorValue = discriminatorValue.toJsFn, displayName = displayName.toJsFn, isAnnotation = isAnnotation.toJsFn, location = location.toJsFn, locationKind = locationKind.toJsFn, maxProperties = maxProperties.toJsFn, minProperties = minProperties.toJsFn, required = required.toJsFn, schema = schema.toJsFn)
    __obj.updateDynamic("enum")(`enum`.toJsFn)
    __obj.updateDynamic("type")(`type`.toJsFn)
    __obj.asInstanceOf[ObjectTypeDeclarationScalarsAnnotations]
  }
  
  extension [Self <: ObjectTypeDeclarationScalarsAnnotations](x: Self) {
    
    inline def setAdditionalProperties(value: CallbackTo[js.Array[AnnotationRef]]): Self = StObject.set(x, "additionalProperties", value.toJsFn)
    
    inline def setDiscriminator(value: CallbackTo[js.Array[AnnotationRef]]): Self = StObject.set(x, "discriminator", value.toJsFn)
    
    inline def setDiscriminatorValue(value: CallbackTo[js.Array[AnnotationRef]]): Self = StObject.set(x, "discriminatorValue", value.toJsFn)
    
    inline def setEnum(value: CallbackTo[js.Array[js.Array[AnnotationRef]]]): Self = StObject.set(x, "enum", value.toJsFn)
    
    inline def setMaxProperties(value: CallbackTo[js.Array[AnnotationRef]]): Self = StObject.set(x, "maxProperties", value.toJsFn)
    
    inline def setMinProperties(value: CallbackTo[js.Array[AnnotationRef]]): Self = StObject.set(x, "minProperties", value.toJsFn)
  }
}
