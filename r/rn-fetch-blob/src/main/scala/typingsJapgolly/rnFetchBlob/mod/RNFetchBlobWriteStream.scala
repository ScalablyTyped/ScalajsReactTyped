package typingsJapgolly.rnFetchBlob.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RNFetchBlobWriteStream extends StObject {
  
  var append: Boolean
  
  def close(): Unit
  
  var encoding: String
  
  var id: String
  
  def write(data: String): js.Promise[Unit]
}
object RNFetchBlobWriteStream {
  
  inline def apply(append: Boolean, close: Callback, encoding: String, id: String, write: String => js.Promise[Unit]): RNFetchBlobWriteStream = {
    val __obj = js.Dynamic.literal(append = append.asInstanceOf[js.Any], close = close.toJsFn, encoding = encoding.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[RNFetchBlobWriteStream]
  }
  
  extension [Self <: RNFetchBlobWriteStream](x: Self) {
    
    inline def setAppend(value: Boolean): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setWrite(value: String => js.Promise[Unit]): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
  }
}
