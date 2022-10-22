package typingsJapgolly.rsocketTcpServer

import typingsJapgolly.rsocketCore.rsocketencodingMod.Encoders
import typingsJapgolly.rsocketTcpServer.rsockettcpserverMod.ServerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rsocket-tcp-server", JSImport.Default)
  @js.native
  open class default protected ()
    extends typingsJapgolly.rsocketTcpServer.rsockettcpserverMod.default {
    def this(options: ServerOptions) = this()
    def this(options: ServerOptions, encoders: Encoders[Any]) = this()
  }
}
