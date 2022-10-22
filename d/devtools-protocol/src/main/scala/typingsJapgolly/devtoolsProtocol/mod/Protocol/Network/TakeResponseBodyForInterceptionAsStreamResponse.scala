package typingsJapgolly.devtoolsProtocol.mod.Protocol.Network

import typingsJapgolly.devtoolsProtocol.mod.Protocol.IO.StreamHandle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TakeResponseBodyForInterceptionAsStreamResponse extends StObject {
  
  var stream: StreamHandle
}
object TakeResponseBodyForInterceptionAsStreamResponse {
  
  inline def apply(stream: StreamHandle): TakeResponseBodyForInterceptionAsStreamResponse = {
    val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[TakeResponseBodyForInterceptionAsStreamResponse]
  }
  
  extension [Self <: TakeResponseBodyForInterceptionAsStreamResponse](x: Self) {
    
    inline def setStream(value: StreamHandle): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
  }
}
