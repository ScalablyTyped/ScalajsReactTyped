package typingsJapgolly.node.childProcessMod

import typingsJapgolly.node.nodeStrings.buffer_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpawnSyncOptionsWithBufferEncoding
  extends StObject
     with SpawnSyncOptions {
  
  @JSName("encoding")
  var encoding_SpawnSyncOptionsWithBufferEncoding: js.UndefOr[buffer_ | Null] = js.undefined
}
object SpawnSyncOptionsWithBufferEncoding {
  
  inline def apply(): SpawnSyncOptionsWithBufferEncoding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpawnSyncOptionsWithBufferEncoding]
  }
  
  extension [Self <: SpawnSyncOptionsWithBufferEncoding](x: Self) {
    
    inline def setEncoding(value: buffer_): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
  }
}
