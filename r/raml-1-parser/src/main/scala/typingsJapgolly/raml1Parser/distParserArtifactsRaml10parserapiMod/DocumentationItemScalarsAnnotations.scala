package typingsJapgolly.raml1Parser.distParserArtifactsRaml10parserapiMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentationItemScalarsAnnotations extends StObject {
  
  /**
    * DocumentationItem.content annotations
    **/
  def content(): js.Array[AnnotationRef]
  
  /**
    * DocumentationItem.title annotations
    **/
  def title(): js.Array[AnnotationRef]
}
object DocumentationItemScalarsAnnotations {
  
  inline def apply(content: CallbackTo[js.Array[AnnotationRef]], title: CallbackTo[js.Array[AnnotationRef]]): DocumentationItemScalarsAnnotations = {
    val __obj = js.Dynamic.literal(content = content.toJsFn, title = title.toJsFn)
    __obj.asInstanceOf[DocumentationItemScalarsAnnotations]
  }
  
  extension [Self <: DocumentationItemScalarsAnnotations](x: Self) {
    
    inline def setContent(value: CallbackTo[js.Array[AnnotationRef]]): Self = StObject.set(x, "content", value.toJsFn)
    
    inline def setTitle(value: CallbackTo[js.Array[AnnotationRef]]): Self = StObject.set(x, "title", value.toJsFn)
  }
}
