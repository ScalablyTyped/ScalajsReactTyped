package typingsJapgolly.samchon.templatesMod

import typingsJapgolly.samchon.protocolCommunicatorIclientdriverMod.IClientDriver
import typingsJapgolly.samchon.templatesExternalInterfacesIexternalserverMod.IExternalServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object external {
  
  /* note: abstract class */ @JSImport("samchon/templates", "external.ExternalClientArray")
  @js.native
  /**
    * Default Constructor.
    */
  open class ExternalClientArray[T /* <: typingsJapgolly.samchon.templatesExternalExternalSystemMod.ExternalSystem */] ()
    extends typingsJapgolly.samchon.templatesExternalMod.ExternalClientArray[T]
  
  /* note: abstract class */ @JSImport("samchon/templates", "external.ExternalServer")
  @js.native
  open class ExternalServer protected ()
    extends typingsJapgolly.samchon.templatesExternalMod.ExternalServer {
    /**
      * Construct from parent {@link ExternalSystemArray}.
      *
      * @param systemArray The parent {@link ExternalSystemArray} object.
      */
    def this(systemArray: typingsJapgolly.samchon.templatesExternalExternalSystemArrayMod.ExternalSystemArray[IExternalServer]) = this()
  }
  
  /* note: abstract class */ @JSImport("samchon/templates", "external.ExternalServerArray")
  @js.native
  /**
    * Default Constructor.
    */
  open class ExternalServerArray[T /* <: IExternalServer */] ()
    extends typingsJapgolly.samchon.templatesExternalMod.ExternalServerArray[T]
  
  /* note: abstract class */ @JSImport("samchon/templates", "external.ExternalServerClientArray")
  @js.native
  /**
    * Default Constructor.
    */
  open class ExternalServerClientArray[T /* <: typingsJapgolly.samchon.templatesExternalExternalSystemMod.ExternalSystem */] ()
    extends typingsJapgolly.samchon.templatesExternalMod.ExternalServerClientArray[T]
  
  /* note: abstract class */ @JSImport("samchon/templates", "external.ExternalSystem")
  @js.native
  open class ExternalSystem protected ()
    extends typingsJapgolly.samchon.templatesExternalMod.ExternalSystem {
    /**
      * Construct from parent {@link ExternalSystemArray}.
      *
      * @param systemArray The parent {@link ExternalSystemArray} object.
      */
    def this(systemArray: typingsJapgolly.samchon.templatesExternalExternalSystemArrayMod.ExternalSystemArray[typingsJapgolly.samchon.templatesExternalExternalSystemMod.ExternalSystem]) = this()
    /**
      * Constrct from parent {@link ExternalSystemArray} and communicator.
      *
      * @param systemArray The parent {@link ExternalSystemArray} object.
      * @param communicator Communicator with the remote, external system.
      */
    def this(
      systemArray: typingsJapgolly.samchon.templatesExternalExternalSystemArrayMod.ExternalSystemArray[typingsJapgolly.samchon.templatesExternalExternalSystemMod.ExternalSystem],
      communicator: IClientDriver
    ) = this()
  }
  
  /* note: abstract class */ @JSImport("samchon/templates", "external.ExternalSystemArray")
  @js.native
  /**
    * Default Constructor.
    */
  open class ExternalSystemArray[System /* <: typingsJapgolly.samchon.templatesExternalExternalSystemMod.ExternalSystem */] ()
    extends typingsJapgolly.samchon.templatesExternalMod.ExternalSystemArray[System]
  
  /* note: abstract class */ @JSImport("samchon/templates", "external.ExternalSystemRole")
  @js.native
  open class ExternalSystemRole protected ()
    extends typingsJapgolly.samchon.templatesExternalMod.ExternalSystemRole {
    /**
      * Constructor from a system.
      *
      * @param system An external system containing this role.
      */
    def this(system: typingsJapgolly.samchon.templatesExternalExternalSystemMod.ExternalSystem) = this()
  }
}
