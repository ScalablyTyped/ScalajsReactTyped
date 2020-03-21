package typingsJapgolly.samchon

import typingsJapgolly.samchon.iclientdriverMod.IClientDriver
import typingsJapgolly.samchon.iexternalserverMod.IExternalServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/external", JSImport.Namespace)
@js.native
object externalMod extends js.Object {
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ExternalClientArray[T /* <: typingsJapgolly.samchon.externalSystemMod.ExternalSystem */] ()
    extends typingsJapgolly.samchon.externalClientArrayMod.ExternalClientArray[T]
  
  @js.native
  abstract class ExternalServer protected ()
    extends typingsJapgolly.samchon.externalServerMod.ExternalServer {
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
    extends typingsJapgolly.samchon.externalServerArrayMod.ExternalServerArray[T]
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ExternalServerClientArray[T /* <: typingsJapgolly.samchon.externalSystemMod.ExternalSystem */] ()
    extends typingsJapgolly.samchon.externalServerClientArrayMod.ExternalServerClientArray[T]
  
  @js.native
  abstract class ExternalSystem protected ()
    extends typingsJapgolly.samchon.externalSystemMod.ExternalSystem {
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
    extends typingsJapgolly.samchon.externalSystemArrayMod.ExternalSystemArray[System]
  
  @js.native
  abstract class ExternalSystemRole protected ()
    extends typingsJapgolly.samchon.externalSystemRoleMod.ExternalSystemRole {
    /**
      * Constructor from a system.
      *
      * @param system An external system containing this role.
      */
    def this(system: typingsJapgolly.samchon.externalSystemMod.ExternalSystem) = this()
  }
  
}

