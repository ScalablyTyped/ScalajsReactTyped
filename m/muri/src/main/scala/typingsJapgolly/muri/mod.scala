package typingsJapgolly.muri

import typingsJapgolly.muri.anon.Pass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(uri: String): ParsedUri = ^.asInstanceOf[js.Dynamic].apply(uri.asInstanceOf[js.Any]).asInstanceOf[ParsedUri]
  
  @JSImport("muri", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait DefaultHost
    extends StObject
       with Host {
    
    var host: String
    
    var port: Double
  }
  object DefaultHost {
    
    inline def apply(host: String, port: Double): DefaultHost = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultHost]
    }
    
    extension [Self <: DefaultHost](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.muri.mod.DefaultHost
    - typingsJapgolly.muri.mod.SocketHost
  */
  trait Host extends StObject
  object Host {
    
    inline def DefaultHost(host: String, port: Double): typingsJapgolly.muri.mod.DefaultHost = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.muri.mod.DefaultHost]
    }
    
    inline def SocketHost(ipc: String): typingsJapgolly.muri.mod.SocketHost = {
      val __obj = js.Dynamic.literal(ipc = ipc.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.muri.mod.SocketHost]
    }
  }
  
  trait ParsedUri extends StObject {
    
    var auth: js.UndefOr[Pass] = js.undefined
    
    var db: String
    
    var hosts: js.Array[Host]
    
    var options: Any
  }
  object ParsedUri {
    
    inline def apply(db: String, hosts: js.Array[Host], options: Any): ParsedUri = {
      val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any], hosts = hosts.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedUri]
    }
    
    extension [Self <: ParsedUri](x: Self) {
      
      inline def setAuth(value: Pass): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setDb(value: String): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
      
      inline def setHosts(value: js.Array[Host]): Self = StObject.set(x, "hosts", value.asInstanceOf[js.Any])
      
      inline def setHostsVarargs(value: Host*): Self = StObject.set(x, "hosts", js.Array(value*))
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  trait SocketHost
    extends StObject
       with Host {
    
    var ipc: String
  }
  object SocketHost {
    
    inline def apply(ipc: String): SocketHost = {
      val __obj = js.Dynamic.literal(ipc = ipc.asInstanceOf[js.Any])
      __obj.asInstanceOf[SocketHost]
    }
    
    extension [Self <: SocketHost](x: Self) {
      
      inline def setIpc(value: String): Self = StObject.set(x, "ipc", value.asInstanceOf[js.Any])
    }
  }
}
