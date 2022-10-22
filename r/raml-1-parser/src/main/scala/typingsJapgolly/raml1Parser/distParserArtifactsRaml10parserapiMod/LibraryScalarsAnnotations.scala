package typingsJapgolly.raml1Parser.distParserArtifactsRaml10parserapiMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LibraryScalarsAnnotations extends StObject {
  
  /**
    * Library.usage annotations
    **/
  def usage(): js.Array[AnnotationRef]
}
object LibraryScalarsAnnotations {
  
  inline def apply(usage: CallbackTo[js.Array[AnnotationRef]]): LibraryScalarsAnnotations = {
    val __obj = js.Dynamic.literal(usage = usage.toJsFn)
    __obj.asInstanceOf[LibraryScalarsAnnotations]
  }
  
  extension [Self <: LibraryScalarsAnnotations](x: Self) {
    
    inline def setUsage(value: CallbackTo[js.Array[AnnotationRef]]): Self = StObject.set(x, "usage", value.toJsFn)
  }
}
