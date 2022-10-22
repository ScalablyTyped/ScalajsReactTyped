package typingsJapgolly.raml1Parser.distParserArtifactsRaml10parserapiMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbstractSecuritySchemeScalarsAnnotations extends StObject {
  
  /**
    * AbstractSecurityScheme.description annotations
    **/
  def description(): js.Array[AnnotationRef]
  
  /**
    * AbstractSecurityScheme.displayName annotations
    **/
  def displayName(): js.Array[AnnotationRef]
  
  /**
    * AbstractSecurityScheme.type annotations
    **/
  def `type`(): js.Array[AnnotationRef]
}
object AbstractSecuritySchemeScalarsAnnotations {
  
  inline def apply(
    description: CallbackTo[js.Array[AnnotationRef]],
    displayName: CallbackTo[js.Array[AnnotationRef]],
    `type`: CallbackTo[js.Array[AnnotationRef]]
  ): AbstractSecuritySchemeScalarsAnnotations = {
    val __obj = js.Dynamic.literal(description = description.toJsFn, displayName = displayName.toJsFn)
    __obj.updateDynamic("type")(`type`.toJsFn)
    __obj.asInstanceOf[AbstractSecuritySchemeScalarsAnnotations]
  }
  
  extension [Self <: AbstractSecuritySchemeScalarsAnnotations](x: Self) {
    
    inline def setDescription(value: CallbackTo[js.Array[AnnotationRef]]): Self = StObject.set(x, "description", value.toJsFn)
    
    inline def setDisplayName(value: CallbackTo[js.Array[AnnotationRef]]): Self = StObject.set(x, "displayName", value.toJsFn)
    
    inline def setType(value: CallbackTo[js.Array[AnnotationRef]]): Self = StObject.set(x, "type", value.toJsFn)
  }
}
