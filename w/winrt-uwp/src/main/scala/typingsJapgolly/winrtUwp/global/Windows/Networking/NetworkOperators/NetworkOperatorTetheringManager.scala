package typingsJapgolly.winrtUwp.global.Windows.Networking.NetworkOperators

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.Networking.Connectivity.ConnectionProfile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This interface exposes the methods and properties used to control and configure tethering capabilities for a specific network account. */
/* note: abstract class */ @JSGlobal("Windows.Networking.NetworkOperators.NetworkOperatorTetheringManager")
@js.native
open class NetworkOperatorTetheringManager ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators.NetworkOperatorTetheringManager {
  
  /** Gets the current number of connected clients on the tethering network. */
  /* CompleteClass */
  var clientCount: Double = js.native
  
  /**
    * Use this method to provide tethering network configuration details for the tethering network.
    * @param configuration Provides a network account ID (SSID) and specifies the passphrase used for authentication when establishing a tethered network connection.
    * @return The asynchronous action.
    */
  /* CompleteClass */
  override def configureAccessPointAsync(
    configuration: typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators.NetworkOperatorTetheringAccessPointConfiguration
  ): IPromiseWithIAsyncAction = js.native
  
  /**
    * Gets the current access point configuration for a network account as defined by a NetworkOperatorTetheringAccessPointConfiguration object.
    * @return Indicates the network account id and specifies the pass-phrase used for authentication when establishing a connection over the tethering network.
    */
  /* CompleteClass */
  override def getCurrentAccessPointConfiguration(): typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators.NetworkOperatorTetheringAccessPointConfiguration = js.native
  
  /**
    * Retrieves a list of tethering clients for this NetworkOperatorTetheringManager .
    * @return A list of clients.
    */
  /* CompleteClass */
  override def getTetheringClients(): IVectorView[
    typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators.NetworkOperatorTetheringClient
  ] = js.native
  
  /** Gets the maximum number of client connections over a tethered network. */
  /* CompleteClass */
  var maxClientCount: Double = js.native
  
  /**
    * Establishes the tethering network.
    * @return The result of the tethering network operation.
    */
  /* CompleteClass */
  override def startTetheringAsync(): IPromiseWithIAsyncOperation[
    typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators.NetworkOperatorTetheringOperationResult
  ] = js.native
  
  /**
    * Shuts down the tethering network.
    * @return The result of the tethering network operation.
    */
  /* CompleteClass */
  override def stopTetheringAsync(): IPromiseWithIAsyncOperation[
    typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators.NetworkOperatorTetheringOperationResult
  ] = js.native
  
  /** Gets the current operational state of the tethering feature. Possible values are defined by TetheringOperationalState */
  /* CompleteClass */
  var tetheringOperationalState: typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators.TetheringOperationalState = js.native
}
object NetworkOperatorTetheringManager {
  
  @JSGlobal("Windows.Networking.NetworkOperators.NetworkOperatorTetheringManager")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a NetworkOperatorTetheringManager using the given profile.
    * @param profile Connection profile to be used.
    * @return The resulting manager object.
    */
  /* static member */
  inline def createFromConnectionProfile(profile: ConnectionProfile): typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators.NetworkOperatorTetheringManager = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromConnectionProfile")(profile.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators.NetworkOperatorTetheringManager]
  
  /**
    * Creates an instance of NetworkOperatorTetheringManager for a specific network account using the provided network account ID for the mobile broadband device.
    * @param networkAccountId The network account ID.
    * @return A NetworkOperatorTetheringManager object.
    */
  /* static member */
  inline def createFromNetworkAccountId(networkAccountId: String): typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators.NetworkOperatorTetheringManager = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromNetworkAccountId")(networkAccountId.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators.NetworkOperatorTetheringManager]
  
  /**
    * Indicates if a device is capable of creating a tethering network. Possible values are defined by TetheringCapability .
    * @param networkAccountId The network account ID.
    * @return The tethering capabilities of a network account.
    */
  /* static member */
  inline def getTetheringCapability(networkAccountId: String): typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators.TetheringCapability = ^.asInstanceOf[js.Dynamic].applyDynamic("getTetheringCapability")(networkAccountId.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators.TetheringCapability]
  
  /**
    * Gets tethering capabilities, based on the given connection profile.
    * @param profile Connection profile to be checked.
    * @return Tethering capabilities of the connection profile.
    */
  /* static member */
  inline def getTetheringCapabilityFromConnectionProfile(profile: ConnectionProfile): typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators.TetheringCapability = ^.asInstanceOf[js.Dynamic].applyDynamic("getTetheringCapabilityFromConnectionProfile")(profile.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators.TetheringCapability]
}
