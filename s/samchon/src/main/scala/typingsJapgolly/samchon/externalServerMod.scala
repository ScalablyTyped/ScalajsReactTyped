package typingsJapgolly.samchon

import typingsJapgolly.samchon.externalSystemArrayMod.ExternalSystemArray
import typingsJapgolly.samchon.iexternalserverMod.IExternalServer
import typingsJapgolly.samchon.iserverconnectorMod.IServerConnector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/external/derived/ExternalServer", JSImport.Namespace)
@js.native
object externalServerMod extends js.Object {
  @js.native
  abstract class ExternalServer protected () extends IExternalServer {
    /**
      * Construct from parent {@link ExternalSystemArray}.
      *
      * @param systemArray The parent {@link ExternalSystemArray} object.
      */
    def this(systemArray: ExternalSystemArray[IExternalServer]) = this()
    /**
      * IP address of target external system to connect.
      */
    var ip: String = js.native
    /**
      * Port number of target external system to connect.
      */
    var port: Double = js.native
    /**
      * Factory method creating {@link IServerConnector} object.
      *
      * The {@link createServerConnector createServerConnector()} is an abstract method creating
      * {@link IServerConnector} object. Overrides and returns one of them, considering which templates the external
      * system follows:
      *
      * - {@link ServerConnector}
      * - {@link WebServerConnector}
      * - {@link DedicatedWorkerServerConnector}
      * - {@link SharedWorkerServerConnector}
      *
      * @return A newly created {@link IServerConnector} object.
      */
    /* protected */ def createServerConnector(): IServerConnector = js.native
  }
  
}

