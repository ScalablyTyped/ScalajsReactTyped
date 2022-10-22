package typingsJapgolly.asana.mod.resources

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.asana.anon.AsanaBaseUrl
import typingsJapgolly.asana.anon.Nextpage
import typingsJapgolly.bluebird.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceList[T /* <: AnonymousResource */] extends StObject {
  
  var _dispatcher: AsanaBaseUrl
  
  var _response: Nextpage[T]
  
  var data: js.Array[T]
  
  /**
    * Get the next page of results in a collection.
    *
    * @returns {Promise<Collection?>} Resolves to either a collection representing
    *     the next page of results, or null if no more pages.
    */
  def nextPage(): ^[ResourceList[T] | Null]
  
  def stream(): ResourceStream[T]
}
object ResourceList {
  
  inline def apply[T /* <: AnonymousResource */](
    _dispatcher: AsanaBaseUrl,
    _response: Nextpage[T],
    data: js.Array[T],
    nextPage: CallbackTo[^[ResourceList[T] | Null]],
    stream: CallbackTo[ResourceStream[T]]
  ): ResourceList[T] = {
    val __obj = js.Dynamic.literal(_dispatcher = _dispatcher.asInstanceOf[js.Any], _response = _response.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], nextPage = nextPage.toJsFn, stream = stream.toJsFn)
    __obj.asInstanceOf[ResourceList[T]]
  }
  
  extension [Self <: ResourceList[?], T /* <: AnonymousResource */](x: Self & ResourceList[T]) {
    
    inline def setData(value: js.Array[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: T*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setNextPage(value: CallbackTo[^[ResourceList[T] | Null]]): Self = StObject.set(x, "nextPage", value.toJsFn)
    
    inline def setStream(value: CallbackTo[ResourceStream[T]]): Self = StObject.set(x, "stream", value.toJsFn)
    
    inline def set_dispatcher(value: AsanaBaseUrl): Self = StObject.set(x, "_dispatcher", value.asInstanceOf[js.Any])
    
    inline def set_response(value: Nextpage[T]): Self = StObject.set(x, "_response", value.asInstanceOf[js.Any])
  }
}
