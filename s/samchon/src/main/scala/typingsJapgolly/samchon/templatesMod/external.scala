package typingsJapgolly.samchon.templatesMod

import typingsJapgolly.samchon.iclientdriverMod.IClientDriver
import typingsJapgolly.samchon.iexternalserverMod.IExternalServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates", "external")
@js.native
object external extends js.Object {
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ExternalClientArray[T /* <: typingsJapgolly.samchon.externalSystemMod.ExternalSystem */] ()
    extends typingsJapgolly.samchon.externalMod.ExternalClientArray[T]
  
  @js.native
  abstract class ExternalServer protected ()
    extends typingsJapgolly.samchon.externalMod.ExternalServer {
    /**
      * Construct from parent {@link ExternalSystemArray}.
      *
      * @param systemArray The parent {@link ExternalSystemArray} object.
      */
    def this(systemArray: typingsJapgolly.samchon.externalSystemArrayMod.ExternalSystemArray[IExternalServer]) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ExternalServerArray[T /* <: IExternalServer */] ()
    extends typingsJapgolly.samchon.externalMod.ExternalServerArray[T]
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ExternalServerClientArray[T /* <: typingsJapgolly.samchon.externalSystemMod.ExternalSystem */] ()
    extends typingsJapgolly.samchon.externalMod.ExternalServerClientArray[T]
  
  @js.native
  abstract class ExternalSystem protected ()
    extends typingsJapgolly.samchon.externalMod.ExternalSystem {
    /**
      * Construct from parent {@link ExternalSystemArray}.
      *
      * @param systemArray The parent {@link ExternalSystemArray} object.
      */
    def this(systemArray: typingsJapgolly.samchon.externalSystemArrayMod.ExternalSystemArray[typingsJapgolly.samchon.externalSystemMod.ExternalSystem]) = this()
    /**
      * Constrct from parent {@link ExternalSystemArray} and communicator.
      *
      * @param systemArray The parent {@link ExternalSystemArray} object.
      * @param communicator Communicator with the remote, external system.
      */
    def this(
      systemArray: typingsJapgolly.samchon.externalSystemArrayMod.ExternalSystemArray[typingsJapgolly.samchon.externalSystemMod.ExternalSystem],
      communicator: IClientDriver
    ) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ExternalSystemArray[System /* <: typingsJapgolly.samchon.externalSystemMod.ExternalSystem */] ()
    extends typingsJapgolly.samchon.externalMod.ExternalSystemArray[System]
  
  @js.native
  abstract class ExternalSystemRole protected ()
    extends typingsJapgolly.samchon.externalMod.ExternalSystemRole {
    /**
      * Constructor from a system.
      *
      * @param system An external system containing this role.
      */
    def this(system: typingsJapgolly.samchon.externalSystemMod.ExternalSystem) = this()
  }
  
}

