package typingsJapgolly.winrtUwp.Windows.System.RemoteSystems

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This class manages the attributes of a discovered remote system (device) and provides the capabilities to discover remote systems as part of Project Rome. */
trait RemoteSystem extends StObject {
  
  /** A list of the applications on this remote system that have registered with the Connected Devices Platform. */
  var apps: IVectorView[RemoteSystemApp]
  
  /** Gets the machine name of the given remote system. */
  var displayName: String
  
  /** Reports whether the RemoteSystem is capable of the given Remote System feature. */
  def getCapabilitySupportedAsync(capabilityName: String): IPromiseWithIAsyncOperation[Boolean]
  
  /** Gets the unique string identifier for the given remote system. */
  var id: String
  
  /** Checks whether the given remote system is available through proximal connection (such as a Bluetooth or local network connection) as opposed to cloud connection. */
  var isAvailableByProximity: Boolean
  
  /** Checks whether the given remote system is available through spatially proximal connection. */
  var isAvailableBySpatialProximity: Boolean
  
  /** Gets a String representation of the device type of the given remote system (desktop, Xbox, ...). */
  var kind: String
  
  /** Gets the manufacturer name of the given remote system. */
  var manufacturerDisplayName: String
  
  /** Gets the model name of the given remote system. */
  var modelDisplayName: String
  
  /** Gets a value describing the OS platform that this remote system is running. */
  var platform: RemoteSystemPlatform
  
  /** Gets the status of this remote system's availability. */
  var status: RemoteSystemStatus
}
object RemoteSystem {
  
  inline def apply(
    apps: IVectorView[RemoteSystemApp],
    displayName: String,
    getCapabilitySupportedAsync: String => IPromiseWithIAsyncOperation[Boolean],
    id: String,
    isAvailableByProximity: Boolean,
    isAvailableBySpatialProximity: Boolean,
    kind: String,
    manufacturerDisplayName: String,
    modelDisplayName: String,
    platform: RemoteSystemPlatform,
    status: RemoteSystemStatus
  ): RemoteSystem = {
    val __obj = js.Dynamic.literal(apps = apps.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], getCapabilitySupportedAsync = js.Any.fromFunction1(getCapabilitySupportedAsync), id = id.asInstanceOf[js.Any], isAvailableByProximity = isAvailableByProximity.asInstanceOf[js.Any], isAvailableBySpatialProximity = isAvailableBySpatialProximity.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], manufacturerDisplayName = manufacturerDisplayName.asInstanceOf[js.Any], modelDisplayName = modelDisplayName.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteSystem]
  }
  
  extension [Self <: RemoteSystem](x: Self) {
    
    inline def setApps(value: IVectorView[RemoteSystemApp]): Self = StObject.set(x, "apps", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setGetCapabilitySupportedAsync(value: String => IPromiseWithIAsyncOperation[Boolean]): Self = StObject.set(x, "getCapabilitySupportedAsync", js.Any.fromFunction1(value))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsAvailableByProximity(value: Boolean): Self = StObject.set(x, "isAvailableByProximity", value.asInstanceOf[js.Any])
    
    inline def setIsAvailableBySpatialProximity(value: Boolean): Self = StObject.set(x, "isAvailableBySpatialProximity", value.asInstanceOf[js.Any])
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setManufacturerDisplayName(value: String): Self = StObject.set(x, "manufacturerDisplayName", value.asInstanceOf[js.Any])
    
    inline def setModelDisplayName(value: String): Self = StObject.set(x, "modelDisplayName", value.asInstanceOf[js.Any])
    
    inline def setPlatform(value: RemoteSystemPlatform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: RemoteSystemStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
