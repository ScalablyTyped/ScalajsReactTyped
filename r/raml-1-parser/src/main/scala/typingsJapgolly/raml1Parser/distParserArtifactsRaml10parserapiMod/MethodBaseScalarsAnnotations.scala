package typingsJapgolly.raml1Parser.distParserArtifactsRaml10parserapiMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MethodBaseScalarsAnnotations extends StObject {
  
  /**
    * MethodBase.description annotations
    **/
  def description(): js.Array[AnnotationRef]
  
  /**
    * MethodBase.displayName annotations
    **/
  def displayName(): js.Array[AnnotationRef]
  
  /**
    * MethodBase.is annotations
    **/
  def is(): js.Array[js.Array[AnnotationRef]]
  
  /**
    * MethodBase.protocols annotations
    **/
  def protocols(): js.Array[js.Array[AnnotationRef]]
  
  /**
    * MethodBase.securedBy annotations
    **/
  def securedBy(): js.Array[js.Array[AnnotationRef]]
}
object MethodBaseScalarsAnnotations {
  
  inline def apply(
    description: CallbackTo[js.Array[AnnotationRef]],
    displayName: CallbackTo[js.Array[AnnotationRef]],
    is: CallbackTo[js.Array[js.Array[AnnotationRef]]],
    protocols: CallbackTo[js.Array[js.Array[AnnotationRef]]],
    securedBy: CallbackTo[js.Array[js.Array[AnnotationRef]]]
  ): MethodBaseScalarsAnnotations = {
    val __obj = js.Dynamic.literal(description = description.toJsFn, displayName = displayName.toJsFn, is = is.toJsFn, protocols = protocols.toJsFn, securedBy = securedBy.toJsFn)
    __obj.asInstanceOf[MethodBaseScalarsAnnotations]
  }
  
  extension [Self <: MethodBaseScalarsAnnotations](x: Self) {
    
    inline def setDescription(value: CallbackTo[js.Array[AnnotationRef]]): Self = StObject.set(x, "description", value.toJsFn)
    
    inline def setDisplayName(value: CallbackTo[js.Array[AnnotationRef]]): Self = StObject.set(x, "displayName", value.toJsFn)
    
    inline def setIs(value: CallbackTo[js.Array[js.Array[AnnotationRef]]]): Self = StObject.set(x, "is", value.toJsFn)
    
    inline def setProtocols(value: CallbackTo[js.Array[js.Array[AnnotationRef]]]): Self = StObject.set(x, "protocols", value.toJsFn)
    
    inline def setSecuredBy(value: CallbackTo[js.Array[js.Array[AnnotationRef]]]): Self = StObject.set(x, "securedBy", value.toJsFn)
  }
}
