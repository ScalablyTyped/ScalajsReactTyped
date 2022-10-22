package typingsJapgolly.raml1Parser.distParserArtifactsRaml10parserapiMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseScalarsAnnotations extends StObject {
  
  /**
    * Response.description annotations
    **/
  def description(): js.Array[AnnotationRef]
}
object ResponseScalarsAnnotations {
  
  inline def apply(description: CallbackTo[js.Array[AnnotationRef]]): ResponseScalarsAnnotations = {
    val __obj = js.Dynamic.literal(description = description.toJsFn)
    __obj.asInstanceOf[ResponseScalarsAnnotations]
  }
  
  extension [Self <: ResponseScalarsAnnotations](x: Self) {
    
    inline def setDescription(value: CallbackTo[js.Array[AnnotationRef]]): Self = StObject.set(x, "description", value.toJsFn)
  }
}
