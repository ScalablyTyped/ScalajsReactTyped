package typingsJapgolly.ioredis

import typingsJapgolly.ioredis.builtConnectorsSentinelConnectorMod.SentinelConnectionOptions
import typingsJapgolly.ioredis.builtConnectorsSentinelConnectorMod.default
import typingsJapgolly.ioredis.builtConnectorsStandaloneConnectorMod.StandaloneConnectionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builtConnectorsMod {
  
  @JSImport("ioredis/built/connectors", "SentinelConnector")
  @js.native
  open class SentinelConnector protected () extends default {
    def this(options: SentinelConnectionOptions) = this()
  }
  
  @JSImport("ioredis/built/connectors", "StandaloneConnector")
  @js.native
  open class StandaloneConnector protected ()
    extends typingsJapgolly.ioredis.builtConnectorsStandaloneConnectorMod.default {
    def this(options: StandaloneConnectionOptions) = this()
  }
}
