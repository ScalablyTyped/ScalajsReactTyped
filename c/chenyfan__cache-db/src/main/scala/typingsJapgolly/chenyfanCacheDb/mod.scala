package typingsJapgolly.chenyfanCacheDb

import org.scalajs.dom.Blob
import org.scalajs.dom.FormData
import org.scalajs.dom.ReadableStream
import typingsJapgolly.chenyfanCacheDb.chenyfanCacheDbStrings.arrayBuffer
import typingsJapgolly.chenyfanCacheDb.chenyfanCacheDbStrings.blob
import typingsJapgolly.chenyfanCacheDb.chenyfanCacheDbStrings.json
import typingsJapgolly.chenyfanCacheDb.chenyfanCacheDbStrings.text
import typingsJapgolly.std.URLSearchParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@chenyfan/cache-db", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with CacheDB {
    def this(namespace: String) = this()
    def this(namespace: String, prefix: String) = this()
    def this(namespace: Unit, prefix: String) = this()
  }
  
  @js.native
  trait CacheDB extends StObject {
    
    def delete(key: String): js.Promise[Boolean] = js.native
    
    var namespace: String = js.native
    
    var prefix: String = js.native
    
    def read(key: String): js.Promise[ReadMethodData] = js.native
    def read(key: String, config: Config): js.Promise[ReadMethodData] = js.native
    
    def write(key: String, value: WriteValue): js.Promise[Boolean] = js.native
    def write(key: String, value: WriteValue, config: Config): js.Promise[Boolean] = js.native
    def write(key: Boolean, value: WriteValue): js.Promise[Boolean] = js.native
    def write(key: Boolean, value: WriteValue, config: Config): js.Promise[Boolean] = js.native
    def write(key: Double, value: WriteValue): js.Promise[Boolean] = js.native
    def write(key: Double, value: WriteValue, config: Config): js.Promise[Boolean] = js.native
  }
  
  trait Config extends StObject {
    
    var `type`: json | arrayBuffer | blob | text | String
  }
  object Config {
    
    inline def apply(`type`: json | arrayBuffer | blob | text | String): Config = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setType(value: json | arrayBuffer | blob | text | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type ReadMethodData = js.Object | js.typedarray.ArrayBuffer | Blob | String | Null
  
  type WriteValue = ReadableStream[Any] | Blob | js.typedarray.ArrayBufferView | js.typedarray.ArrayBuffer | FormData | URLSearchParams | String
}
