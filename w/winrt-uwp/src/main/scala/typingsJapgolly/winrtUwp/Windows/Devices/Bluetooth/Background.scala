package typingsJapgolly.winrtUwp.Windows.Devices.Bluetooth

import typingsJapgolly.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementPublisherStatus
import typingsJapgolly.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementReceivedEventArgs
import typingsJapgolly.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristic
import typingsJapgolly.winrtUwp.Windows.Devices.Bluetooth.Rfcomm.RfcommServiceId
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrtUwp.Windows.Networking.Sockets.StreamSocket
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides class describing trigger details for Bluetooth triggers. */
object Background {
  
  /** Provides information about a BluetoothLEAdvertisementPublisher trigger. */
  trait BluetoothLEAdvertisementPublisherTriggerDetails extends StObject {
    
    /** Gets the error status for the trigger. */
    var error: BluetoothError
    
    /** Gets the current status of the BluetoothLEAdvertisementPublisher . */
    var status: BluetoothLEAdvertisementPublisherStatus
  }
  object BluetoothLEAdvertisementPublisherTriggerDetails {
    
    inline def apply(error: BluetoothError, status: BluetoothLEAdvertisementPublisherStatus): BluetoothLEAdvertisementPublisherTriggerDetails = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[BluetoothLEAdvertisementPublisherTriggerDetails]
    }
    
    extension [Self <: BluetoothLEAdvertisementPublisherTriggerDetails](x: Self) {
      
      inline def setError(value: BluetoothError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: BluetoothLEAdvertisementPublisherStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  /** Provides information about a BluetoothLEAdvertisementWatcher trigger. */
  trait BluetoothLEAdvertisementWatcherTriggerDetails extends StObject {
    
    /** Gets a collection of Bluetooth LE advertisements. */
    var advertisements: IVectorView[BluetoothLEAdvertisementReceivedEventArgs]
    
    /** Gets the error status for the trigger. */
    var error: BluetoothError
    
    /** Gets the parameters used to configure received signal strength indicator (RSSI)-based filtering. */
    var signalStrengthFilter: BluetoothSignalStrengthFilter
  }
  object BluetoothLEAdvertisementWatcherTriggerDetails {
    
    inline def apply(
      advertisements: IVectorView[BluetoothLEAdvertisementReceivedEventArgs],
      error: BluetoothError,
      signalStrengthFilter: BluetoothSignalStrengthFilter
    ): BluetoothLEAdvertisementWatcherTriggerDetails = {
      val __obj = js.Dynamic.literal(advertisements = advertisements.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], signalStrengthFilter = signalStrengthFilter.asInstanceOf[js.Any])
      __obj.asInstanceOf[BluetoothLEAdvertisementWatcherTriggerDetails]
    }
    
    extension [Self <: BluetoothLEAdvertisementWatcherTriggerDetails](x: Self) {
      
      inline def setAdvertisements(value: IVectorView[BluetoothLEAdvertisementReceivedEventArgs]): Self = StObject.set(x, "advertisements", value.asInstanceOf[js.Any])
      
      inline def setError(value: BluetoothError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setSignalStrengthFilter(value: BluetoothSignalStrengthFilter): Self = StObject.set(x, "signalStrengthFilter", value.asInstanceOf[js.Any])
    }
  }
  
  /** Provides information about the Bluetooth LE device that caused this trigger to fire. */
  trait GattCharacteristicNotificationTriggerDetails extends StObject {
    
    /** Gets the GATT characteristic that changed. */
    var characteristic: GattCharacteristic
    
    /** Gets a byte stream containing the new value of the characteristic. */
    var value: IBuffer
  }
  object GattCharacteristicNotificationTriggerDetails {
    
    inline def apply(characteristic: GattCharacteristic, value: IBuffer): GattCharacteristicNotificationTriggerDetails = {
      val __obj = js.Dynamic.literal(characteristic = characteristic.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[GattCharacteristicNotificationTriggerDetails]
    }
    
    extension [Self <: GattCharacteristicNotificationTriggerDetails](x: Self) {
      
      inline def setCharacteristic(value: GattCharacteristic): Self = StObject.set(x, "characteristic", value.asInstanceOf[js.Any])
      
      inline def setValue(value: IBuffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /** Provides information about the Bluetooth device that caused this trigger to fire. */
  trait RfcommConnectionTriggerDetails extends StObject {
    
    /** Gets whether this is an incoming connection. */
    var incoming: Boolean
    
    /** Gets the BluetoothDevice object that represents the remote device. */
    var remoteDevice: BluetoothDevice
    
    /** Gets a reference to the underlying StreamSocket of this connection. */
    var socket: StreamSocket
  }
  object RfcommConnectionTriggerDetails {
    
    inline def apply(incoming: Boolean, remoteDevice: BluetoothDevice, socket: StreamSocket): RfcommConnectionTriggerDetails = {
      val __obj = js.Dynamic.literal(incoming = incoming.asInstanceOf[js.Any], remoteDevice = remoteDevice.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
      __obj.asInstanceOf[RfcommConnectionTriggerDetails]
    }
    
    extension [Self <: RfcommConnectionTriggerDetails](x: Self) {
      
      inline def setIncoming(value: Boolean): Self = StObject.set(x, "incoming", value.asInstanceOf[js.Any])
      
      inline def setRemoteDevice(value: BluetoothDevice): Self = StObject.set(x, "remoteDevice", value.asInstanceOf[js.Any])
      
      inline def setSocket(value: StreamSocket): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
    }
  }
  
  /** Provides information about incoming RFCOMM connections. If an app wants the system to listen for incoming connections on behalf of an RfcommConnectionTrigger , the app must create this object and attach it to the RfcommConnectionTrigger. */
  trait RfcommInboundConnectionInformation extends StObject {
    
    /** Gets or sets the service UUID that will be advertised in the SDP record. */
    var localServiceId: RfcommServiceId
    
    /** Gets or sets the Bluetooth SDP record that the system will advertise on behalf of the app. */
    var sdpRecord: IBuffer
    
    /** Gets or sets the service capabilities that will be advertised. */
    var serviceCapabilities: BluetoothServiceCapabilities
  }
  object RfcommInboundConnectionInformation {
    
    inline def apply(
      localServiceId: RfcommServiceId,
      sdpRecord: IBuffer,
      serviceCapabilities: BluetoothServiceCapabilities
    ): RfcommInboundConnectionInformation = {
      val __obj = js.Dynamic.literal(localServiceId = localServiceId.asInstanceOf[js.Any], sdpRecord = sdpRecord.asInstanceOf[js.Any], serviceCapabilities = serviceCapabilities.asInstanceOf[js.Any])
      __obj.asInstanceOf[RfcommInboundConnectionInformation]
    }
    
    extension [Self <: RfcommInboundConnectionInformation](x: Self) {
      
      inline def setLocalServiceId(value: RfcommServiceId): Self = StObject.set(x, "localServiceId", value.asInstanceOf[js.Any])
      
      inline def setSdpRecord(value: IBuffer): Self = StObject.set(x, "sdpRecord", value.asInstanceOf[js.Any])
      
      inline def setServiceCapabilities(value: BluetoothServiceCapabilities): Self = StObject.set(x, "serviceCapabilities", value.asInstanceOf[js.Any])
    }
  }
  
  /** Provides information for RFCOMM outbound connections. If an app wants the system to create outbound connections on its behalf, the app must create this object and attach it to the RfcommConnectionTrigger . */
  trait RfcommOutboundConnectionInformation extends StObject {
    
    /** Gets or sets the service UUID of the remote service to which the system will connect on behalf of the app. */
    var remoteServiceId: RfcommServiceId
  }
  object RfcommOutboundConnectionInformation {
    
    inline def apply(remoteServiceId: RfcommServiceId): RfcommOutboundConnectionInformation = {
      val __obj = js.Dynamic.literal(remoteServiceId = remoteServiceId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RfcommOutboundConnectionInformation]
    }
    
    extension [Self <: RfcommOutboundConnectionInformation](x: Self) {
      
      inline def setRemoteServiceId(value: RfcommServiceId): Self = StObject.set(x, "remoteServiceId", value.asInstanceOf[js.Any])
    }
  }
}
