package typingsJapgolly.samchon

import typingsJapgolly.samchon.protocolCommunicatorIserverconnectorMod.IServerConnector
import typingsJapgolly.samchon.templatesExternalExternalSystemArrayMod.ExternalSystemArray
import typingsJapgolly.samchon.templatesExternalInterfacesIexternalserverMod.IExternalServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templatesExternalDerivedExternalServerMod {
  
  /* note: abstract class */ @JSImport("samchon/templates/external/derived/ExternalServer", "ExternalServer")
  @js.native
  open class ExternalServer protected () extends IExternalServer {
    /**
      * Construct from parent {@link ExternalSystemArray}.
      *
      * @param systemArray The parent {@link ExternalSystemArray} object.
      */
    def this(systemArray: ExternalSystemArray[IExternalServer]) = this()
    
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
    
    /**
      * IP address of target external system to connect.
      */
    /* protected */ var ip: String = js.native
    
    /**
      * Port number of target external system to connect.
      */
    /* protected */ var port: Double = js.native
  }
}
