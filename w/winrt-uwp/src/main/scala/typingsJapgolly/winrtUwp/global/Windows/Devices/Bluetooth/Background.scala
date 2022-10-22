package typingsJapgolly.winrtUwp.global.Windows.Devices.Bluetooth

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
  /* note: abstract class */ @JSGlobal("Windows.Devices.Bluetooth.Background.BluetoothLEAdvertisementPublisherTriggerDetails")
  @js.native
  open class BluetoothLEAdvertisementPublisherTriggerDetails ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Devices.Bluetooth.Background.BluetoothLEAdvertisementPublisherTriggerDetails {
    
    /** Gets the error status for the trigger. */
    /* CompleteClass */
    var error: typingsJapgolly.winrtUwp.Windows.Devices.Bluetooth.BluetoothError = js.native
    
    /** Gets the current status of the BluetoothLEAdvertisementPublisher . */
    /* CompleteClass */
    var status: BluetoothLEAdvertisementPublisherStatus = js.native
  }
  
  /** Provides information about a BluetoothLEAdvertisementWatcher trigger. */
  /* note: abstract class */ @JSGlobal("Windows.Devices.Bluetooth.Background.BluetoothLEAdvertisementWatcherTriggerDetails")
  @js.native
  open class BluetoothLEAdvertisementWatcherTriggerDetails ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Devices.Bluetooth.Background.BluetoothLEAdvertisementWatcherTriggerDetails {
    
    /** Gets a collection of Bluetooth LE advertisements. */
    /* CompleteClass */
    var advertisements: IVectorView[BluetoothLEAdvertisementReceivedEventArgs] = js.native
    
    /** Gets the error status for the trigger. */
    /* CompleteClass */
    var error: typingsJapgolly.winrtUwp.Windows.Devices.Bluetooth.BluetoothError = js.native
    
    /** Gets the parameters used to configure received signal strength indicator (RSSI)-based filtering. */
    /* CompleteClass */
    var signalStrengthFilter: typingsJapgolly.winrtUwp.Windows.Devices.Bluetooth.BluetoothSignalStrengthFilter = js.native
  }
  
  /** Provides information about the Bluetooth LE device that caused this trigger to fire. */
  /* note: abstract class */ @JSGlobal("Windows.Devices.Bluetooth.Background.GattCharacteristicNotificationTriggerDetails")
  @js.native
  open class GattCharacteristicNotificationTriggerDetails ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Devices.Bluetooth.Background.GattCharacteristicNotificationTriggerDetails {
    
    /** Gets the GATT characteristic that changed. */
    /* CompleteClass */
    var characteristic: GattCharacteristic = js.native
    
    /** Gets a byte stream containing the new value of the characteristic. */
    /* CompleteClass */
    var value: IBuffer = js.native
  }
  
  /** Provides information about the Bluetooth device that caused this trigger to fire. */
  /* note: abstract class */ @JSGlobal("Windows.Devices.Bluetooth.Background.RfcommConnectionTriggerDetails")
  @js.native
  open class RfcommConnectionTriggerDetails ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Devices.Bluetooth.Background.RfcommConnectionTriggerDetails {
    
    /** Gets whether this is an incoming connection. */
    /* CompleteClass */
    var incoming: Boolean = js.native
    
    /** Gets the BluetoothDevice object that represents the remote device. */
    /* CompleteClass */
    var remoteDevice: typingsJapgolly.winrtUwp.Windows.Devices.Bluetooth.BluetoothDevice = js.native
    
    /** Gets a reference to the underlying StreamSocket of this connection. */
    /* CompleteClass */
    var socket: StreamSocket = js.native
  }
  
  /** Provides information about incoming RFCOMM connections. If an app wants the system to listen for incoming connections on behalf of an RfcommConnectionTrigger , the app must create this object and attach it to the RfcommConnectionTrigger. */
  /* note: abstract class */ @JSGlobal("Windows.Devices.Bluetooth.Background.RfcommInboundConnectionInformation")
  @js.native
  open class RfcommInboundConnectionInformation ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Devices.Bluetooth.Background.RfcommInboundConnectionInformation {
    
    /** Gets or sets the service UUID that will be advertised in the SDP record. */
    /* CompleteClass */
    var localServiceId: RfcommServiceId = js.native
    
    /** Gets or sets the Bluetooth SDP record that the system will advertise on behalf of the app. */
    /* CompleteClass */
    var sdpRecord: IBuffer = js.native
    
    /** Gets or sets the service capabilities that will be advertised. */
    /* CompleteClass */
    var serviceCapabilities: typingsJapgolly.winrtUwp.Windows.Devices.Bluetooth.BluetoothServiceCapabilities = js.native
  }
  
  /** Provides information for RFCOMM outbound connections. If an app wants the system to create outbound connections on its behalf, the app must create this object and attach it to the RfcommConnectionTrigger . */
  /* note: abstract class */ @JSGlobal("Windows.Devices.Bluetooth.Background.RfcommOutboundConnectionInformation")
  @js.native
  open class RfcommOutboundConnectionInformation ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Devices.Bluetooth.Background.RfcommOutboundConnectionInformation {
    
    /** Gets or sets the service UUID of the remote service to which the system will connect on behalf of the app. */
    /* CompleteClass */
    var remoteServiceId: RfcommServiceId = js.native
  }
}
