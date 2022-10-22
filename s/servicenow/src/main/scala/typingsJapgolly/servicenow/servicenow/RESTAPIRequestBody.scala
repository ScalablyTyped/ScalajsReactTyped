package typingsJapgolly.servicenow.servicenow

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RESTAPIRequestBody[T] extends StObject {
  
  val data: T
  
  val dataStream: js.Object
  
  val dataString: String
  
  def hasNext(): Boolean
  
  def nextEntry(): Any
}
object RESTAPIRequestBody {
  
  inline def apply[T](
    data: T,
    dataStream: js.Object,
    dataString: String,
    hasNext: CallbackTo[Boolean],
    nextEntry: CallbackTo[Any]
  ): RESTAPIRequestBody[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataStream = dataStream.asInstanceOf[js.Any], dataString = dataString.asInstanceOf[js.Any], hasNext = hasNext.toJsFn, nextEntry = nextEntry.toJsFn)
    __obj.asInstanceOf[RESTAPIRequestBody[T]]
  }
  
  extension [Self <: RESTAPIRequestBody[?], T](x: Self & RESTAPIRequestBody[T]) {
    
    inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataStream(value: js.Object): Self = StObject.set(x, "dataStream", value.asInstanceOf[js.Any])
    
    inline def setDataString(value: String): Self = StObject.set(x, "dataString", value.asInstanceOf[js.Any])
    
    inline def setHasNext(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasNext", value.toJsFn)
    
    inline def setNextEntry(value: CallbackTo[Any]): Self = StObject.set(x, "nextEntry", value.toJsFn)
  }
}
