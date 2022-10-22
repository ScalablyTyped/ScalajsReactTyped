package typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This interface exposes the methods and properties used to control and configure tethering capabilities for a specific network account. */
trait NetworkOperatorTetheringManager extends StObject {
  
  /** Gets the current number of connected clients on the tethering network. */
  var clientCount: Double
  
  /**
    * Use this method to provide tethering network configuration details for the tethering network.
    * @param configuration Provides a network account ID (SSID) and specifies the passphrase used for authentication when establishing a tethered network connection.
    * @return The asynchronous action.
    */
  def configureAccessPointAsync(configuration: NetworkOperatorTetheringAccessPointConfiguration): IPromiseWithIAsyncAction
  
  /**
    * Gets the current access point configuration for a network account as defined by a NetworkOperatorTetheringAccessPointConfiguration object.
    * @return Indicates the network account id and specifies the pass-phrase used for authentication when establishing a connection over the tethering network.
    */
  def getCurrentAccessPointConfiguration(): NetworkOperatorTetheringAccessPointConfiguration
  
  /**
    * Retrieves a list of tethering clients for this NetworkOperatorTetheringManager .
    * @return A list of clients.
    */
  def getTetheringClients(): IVectorView[NetworkOperatorTetheringClient]
  
  /** Gets the maximum number of client connections over a tethered network. */
  var maxClientCount: Double
  
  /**
    * Establishes the tethering network.
    * @return The result of the tethering network operation.
    */
  def startTetheringAsync(): IPromiseWithIAsyncOperation[NetworkOperatorTetheringOperationResult]
  
  /**
    * Shuts down the tethering network.
    * @return The result of the tethering network operation.
    */
  def stopTetheringAsync(): IPromiseWithIAsyncOperation[NetworkOperatorTetheringOperationResult]
  
  /** Gets the current operational state of the tethering feature. Possible values are defined by TetheringOperationalState */
  var tetheringOperationalState: TetheringOperationalState
}
object NetworkOperatorTetheringManager {
  
  inline def apply(
    clientCount: Double,
    configureAccessPointAsync: NetworkOperatorTetheringAccessPointConfiguration => IPromiseWithIAsyncAction,
    getCurrentAccessPointConfiguration: CallbackTo[NetworkOperatorTetheringAccessPointConfiguration],
    getTetheringClients: CallbackTo[IVectorView[NetworkOperatorTetheringClient]],
    maxClientCount: Double,
    startTetheringAsync: CallbackTo[IPromiseWithIAsyncOperation[NetworkOperatorTetheringOperationResult]],
    stopTetheringAsync: CallbackTo[IPromiseWithIAsyncOperation[NetworkOperatorTetheringOperationResult]],
    tetheringOperationalState: TetheringOperationalState
  ): NetworkOperatorTetheringManager = {
    val __obj = js.Dynamic.literal(clientCount = clientCount.asInstanceOf[js.Any], configureAccessPointAsync = js.Any.fromFunction1(configureAccessPointAsync), getCurrentAccessPointConfiguration = getCurrentAccessPointConfiguration.toJsFn, getTetheringClients = getTetheringClients.toJsFn, maxClientCount = maxClientCount.asInstanceOf[js.Any], startTetheringAsync = startTetheringAsync.toJsFn, stopTetheringAsync = stopTetheringAsync.toJsFn, tetheringOperationalState = tetheringOperationalState.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkOperatorTetheringManager]
  }
  
  extension [Self <: NetworkOperatorTetheringManager](x: Self) {
    
    inline def setClientCount(value: Double): Self = StObject.set(x, "clientCount", value.asInstanceOf[js.Any])
    
    inline def setConfigureAccessPointAsync(value: NetworkOperatorTetheringAccessPointConfiguration => IPromiseWithIAsyncAction): Self = StObject.set(x, "configureAccessPointAsync", js.Any.fromFunction1(value))
    
    inline def setGetCurrentAccessPointConfiguration(value: CallbackTo[NetworkOperatorTetheringAccessPointConfiguration]): Self = StObject.set(x, "getCurrentAccessPointConfiguration", value.toJsFn)
    
    inline def setGetTetheringClients(value: CallbackTo[IVectorView[NetworkOperatorTetheringClient]]): Self = StObject.set(x, "getTetheringClients", value.toJsFn)
    
    inline def setMaxClientCount(value: Double): Self = StObject.set(x, "maxClientCount", value.asInstanceOf[js.Any])
    
    inline def setStartTetheringAsync(value: CallbackTo[IPromiseWithIAsyncOperation[NetworkOperatorTetheringOperationResult]]): Self = StObject.set(x, "startTetheringAsync", value.toJsFn)
    
    inline def setStopTetheringAsync(value: CallbackTo[IPromiseWithIAsyncOperation[NetworkOperatorTetheringOperationResult]]): Self = StObject.set(x, "stopTetheringAsync", value.toJsFn)
    
    inline def setTetheringOperationalState(value: TetheringOperationalState): Self = StObject.set(x, "tetheringOperationalState", value.asInstanceOf[js.Any])
  }
}
