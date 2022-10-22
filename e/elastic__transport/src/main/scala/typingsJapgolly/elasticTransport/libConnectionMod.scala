package typingsJapgolly.elasticTransport

import typingsJapgolly.elasticTransport.anon.ALIVE
import typingsJapgolly.elasticTransport.libConnectionBaseConnectionMod.ConnectionOptions
import typingsJapgolly.elasticTransport.libConnectionBaseConnectionMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libConnectionMod {
  
  @JSImport("@elastic/transport/lib/connection", "BaseConnection")
  @js.native
  open class BaseConnection protected () extends default {
    def this(opts: ConnectionOptions) = this()
  }
  /* static members */
  object BaseConnection {
    
    @JSImport("@elastic/transport/lib/connection", "BaseConnection")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@elastic/transport/lib/connection", "BaseConnection.statuses")
    @js.native
    def statuses: ALIVE = js.native
    inline def statuses_=(x: ALIVE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("statuses")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@elastic/transport/lib/connection", "HttpConnection")
  @js.native
  open class HttpConnection protected ()
    extends typingsJapgolly.elasticTransport.libConnectionHttpConnectionMod.default {
    def this(opts: ConnectionOptions) = this()
  }
  
  @JSImport("@elastic/transport/lib/connection", "UndiciConnection")
  @js.native
  open class UndiciConnection protected ()
    extends typingsJapgolly.elasticTransport.libConnectionUndiciConnectionMod.default {
    def this(opts: ConnectionOptions) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.elasticTransport.libConnectionBaseConnectionMod.default
    - typingsJapgolly.elasticTransport.libConnectionHttpConnectionMod.default
    - typingsJapgolly.elasticTransport.libConnectionUndiciConnectionMod.default
  */
  trait Connection extends StObject
}
