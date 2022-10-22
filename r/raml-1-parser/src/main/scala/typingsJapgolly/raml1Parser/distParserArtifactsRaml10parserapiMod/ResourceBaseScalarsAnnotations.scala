package typingsJapgolly.raml1Parser.distParserArtifactsRaml10parserapiMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceBaseScalarsAnnotations extends StObject {
  
  /**
    * ResourceBase.description annotations
    **/
  def description(): js.Array[AnnotationRef]
  
  /**
    * ResourceBase.is annotations
    **/
  def is(): js.Array[js.Array[AnnotationRef]]
  
  /**
    * ResourceBase.securedBy annotations
    **/
  def securedBy(): js.Array[js.Array[AnnotationRef]]
  
  /**
    * ResourceBase.type annotations
    **/
  def `type`(): js.Array[AnnotationRef]
}
object ResourceBaseScalarsAnnotations {
  
  inline def apply(
    description: CallbackTo[js.Array[AnnotationRef]],
    is: CallbackTo[js.Array[js.Array[AnnotationRef]]],
    securedBy: CallbackTo[js.Array[js.Array[AnnotationRef]]],
    `type`: CallbackTo[js.Array[AnnotationRef]]
  ): ResourceBaseScalarsAnnotations = {
    val __obj = js.Dynamic.literal(description = description.toJsFn, is = is.toJsFn, securedBy = securedBy.toJsFn)
    __obj.updateDynamic("type")(`type`.toJsFn)
    __obj.asInstanceOf[ResourceBaseScalarsAnnotations]
  }
  
  extension [Self <: ResourceBaseScalarsAnnotations](x: Self) {
    
    inline def setDescription(value: CallbackTo[js.Array[AnnotationRef]]): Self = StObject.set(x, "description", value.toJsFn)
    
    inline def setIs(value: CallbackTo[js.Array[js.Array[AnnotationRef]]]): Self = StObject.set(x, "is", value.toJsFn)
    
    inline def setSecuredBy(value: CallbackTo[js.Array[js.Array[AnnotationRef]]]): Self = StObject.set(x, "securedBy", value.toJsFn)
    
    inline def setType(value: CallbackTo[js.Array[AnnotationRef]]): Self = StObject.set(x, "type", value.toJsFn)
  }
}
