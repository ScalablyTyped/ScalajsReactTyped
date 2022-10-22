package typingsJapgolly.raml1Parser.distParserArtifactsRaml10parserapiMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TraitScalarsAnnotations
  extends StObject
     with MethodBaseScalarsAnnotations {
  
  /**
    * Trait.usage annotations
    **/
  def usage(): js.Array[AnnotationRef]
}
object TraitScalarsAnnotations {
  
  inline def apply(
    description: CallbackTo[js.Array[AnnotationRef]],
    displayName: CallbackTo[js.Array[AnnotationRef]],
    is: CallbackTo[js.Array[js.Array[AnnotationRef]]],
    protocols: CallbackTo[js.Array[js.Array[AnnotationRef]]],
    securedBy: CallbackTo[js.Array[js.Array[AnnotationRef]]],
    usage: CallbackTo[js.Array[AnnotationRef]]
  ): TraitScalarsAnnotations = {
    val __obj = js.Dynamic.literal(description = description.toJsFn, displayName = displayName.toJsFn, is = is.toJsFn, protocols = protocols.toJsFn, securedBy = securedBy.toJsFn, usage = usage.toJsFn)
    __obj.asInstanceOf[TraitScalarsAnnotations]
  }
  
  extension [Self <: TraitScalarsAnnotations](x: Self) {
    
    inline def setUsage(value: CallbackTo[js.Array[AnnotationRef]]): Self = StObject.set(x, "usage", value.toJsFn)
  }
}
