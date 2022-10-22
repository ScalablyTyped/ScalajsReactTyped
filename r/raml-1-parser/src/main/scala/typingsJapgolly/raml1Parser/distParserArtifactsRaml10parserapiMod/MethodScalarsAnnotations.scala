package typingsJapgolly.raml1Parser.distParserArtifactsRaml10parserapiMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MethodScalarsAnnotations
  extends StObject
     with MethodBaseScalarsAnnotations
object MethodScalarsAnnotations {
  
  inline def apply(
    description: CallbackTo[js.Array[AnnotationRef]],
    displayName: CallbackTo[js.Array[AnnotationRef]],
    is: CallbackTo[js.Array[js.Array[AnnotationRef]]],
    protocols: CallbackTo[js.Array[js.Array[AnnotationRef]]],
    securedBy: CallbackTo[js.Array[js.Array[AnnotationRef]]]
  ): MethodScalarsAnnotations = {
    val __obj = js.Dynamic.literal(description = description.toJsFn, displayName = displayName.toJsFn, is = is.toJsFn, protocols = protocols.toJsFn, securedBy = securedBy.toJsFn)
    __obj.asInstanceOf[MethodScalarsAnnotations]
  }
}
