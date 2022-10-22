package typingsJapgolly.wixUiCore.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.unidriverCore.mod.UniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContentElement extends StObject {
  
  def getContentElement(): js.Promise[UniDriver[Any]]
  
  def queryDocumentOrElement(query: String): js.Promise[UniDriver[Any]]
}
object GetContentElement {
  
  inline def apply(
    getContentElement: CallbackTo[js.Promise[UniDriver[Any]]],
    queryDocumentOrElement: String => js.Promise[UniDriver[Any]]
  ): GetContentElement = {
    val __obj = js.Dynamic.literal(getContentElement = getContentElement.toJsFn, queryDocumentOrElement = js.Any.fromFunction1(queryDocumentOrElement))
    __obj.asInstanceOf[GetContentElement]
  }
  
  extension [Self <: GetContentElement](x: Self) {
    
    inline def setGetContentElement(value: CallbackTo[js.Promise[UniDriver[Any]]]): Self = StObject.set(x, "getContentElement", value.toJsFn)
    
    inline def setQueryDocumentOrElement(value: String => js.Promise[UniDriver[Any]]): Self = StObject.set(x, "queryDocumentOrElement", js.Any.fromFunction1(value))
  }
}
