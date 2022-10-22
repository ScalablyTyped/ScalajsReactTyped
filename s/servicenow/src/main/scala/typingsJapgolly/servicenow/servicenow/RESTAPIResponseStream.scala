package typingsJapgolly.servicenow.servicenow

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RESTAPIResponseStream extends StObject {
  
  def writeStream(stream: js.Object): Unit
  
  def writeString(data: String): Unit
}
object RESTAPIResponseStream {
  
  inline def apply(writeStream: js.Object => Callback, writeString: String => Callback): RESTAPIResponseStream = {
    val __obj = js.Dynamic.literal(writeStream = js.Any.fromFunction1((t0: js.Object) => writeStream(t0).runNow()), writeString = js.Any.fromFunction1((t0: String) => writeString(t0).runNow()))
    __obj.asInstanceOf[RESTAPIResponseStream]
  }
  
  extension [Self <: RESTAPIResponseStream](x: Self) {
    
    inline def setWriteStream(value: js.Object => Callback): Self = StObject.set(x, "writeStream", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setWriteString(value: String => Callback): Self = StObject.set(x, "writeString", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
