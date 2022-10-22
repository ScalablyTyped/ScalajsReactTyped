package typingsJapgolly.raml1Parser.distParserArtifactsRaml10parserapiMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceScalarsAnnotations
  extends StObject
     with ResourceBaseScalarsAnnotations {
  
  /**
    * Resource.displayName annotations
    **/
  def displayName(): js.Array[AnnotationRef]
}
object ResourceScalarsAnnotations {
  
  inline def apply(
    description: CallbackTo[js.Array[AnnotationRef]],
    displayName: CallbackTo[js.Array[AnnotationRef]],
    is: CallbackTo[js.Array[js.Array[AnnotationRef]]],
    securedBy: CallbackTo[js.Array[js.Array[AnnotationRef]]],
    `type`: CallbackTo[js.Array[AnnotationRef]]
  ): ResourceScalarsAnnotations = {
    val __obj = js.Dynamic.literal(description = description.toJsFn, displayName = displayName.toJsFn, is = is.toJsFn, securedBy = securedBy.toJsFn)
    __obj.updateDynamic("type")(`type`.toJsFn)
    __obj.asInstanceOf[ResourceScalarsAnnotations]
  }
  
  extension [Self <: ResourceScalarsAnnotations](x: Self) {
    
    inline def setDisplayName(value: CallbackTo[js.Array[AnnotationRef]]): Self = StObject.set(x, "displayName", value.toJsFn)
  }
}
