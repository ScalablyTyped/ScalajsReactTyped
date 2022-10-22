package typingsJapgolly.chromeApps.chrome

import typingsJapgolly.chromeApps.anon.Data
import typingsJapgolly.chromeApps.anon.Uuid
import typingsJapgolly.chromeApps.chromeAppsStrings.read_
import typingsJapgolly.chromeApps.chromeAppsStrings.write_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @since Chrome 37
  * @requires Manifest: 'bluetooth': {...}
  * @requires Important: This API works only on Chrome OS.
  * @requires Note: With Chrome 56, users can select nearby Bluetooth Low Energy devices to provide to web sites that use the Web Bluetooth API.
  * @description
  * The chrome.bluetoothLowEnergy API is used to communicate
  * with Bluetooth Smart (Low Energy) devices using the
  * Generic Attribute Profile (GATT).
  */
object bluetoothLowEnergy {
  
  trait Advertisement extends StObject {
    
    /** List of manufacturer specific data to be included in 'Manufacturer Specific Data' fields of the advertising data. */
    var manufacturerData: js.UndefOr[Data] = js.undefined
    
    /** List of service data to be included in 'Service Data' fields of the advertising data. */
    var serviceData: Uuid
    
    /** List of UUIDs to include in the 'Service UUIDs' field of the Advertising Data. These UUIDs can be of the 16bit, 32bit or 128 formats. */
    var serviceUuids: js.UndefOr[js.Array[String]] = js.undefined
    
    /** List of UUIDs to include in the 'Solicit UUIDs' field of the Advertising Data. These UUIDs can be of the 16bit, 32bit or 128 formats. */
    var solicitUuids: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Type of advertisement. */
    var `type`: AdvertisementType
  }
  object Advertisement {
    
    inline def apply(serviceData: Uuid, `type`: AdvertisementType): Advertisement = {
      val __obj = js.Dynamic.literal(serviceData = serviceData.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Advertisement]
    }
    
    extension [Self <: Advertisement](x: Self) {
      
      inline def setManufacturerData(value: Data): Self = StObject.set(x, "manufacturerData", value.asInstanceOf[js.Any])
      
      inline def setManufacturerDataUndefined: Self = StObject.set(x, "manufacturerData", js.undefined)
      
      inline def setServiceData(value: Uuid): Self = StObject.set(x, "serviceData", value.asInstanceOf[js.Any])
      
      inline def setServiceUuids(value: js.Array[String]): Self = StObject.set(x, "serviceUuids", value.asInstanceOf[js.Any])
      
      inline def setServiceUuidsUndefined: Self = StObject.set(x, "serviceUuids", js.undefined)
      
      inline def setServiceUuidsVarargs(value: String*): Self = StObject.set(x, "serviceUuids", js.Array(value*))
      
      inline def setSolicitUuids(value: js.Array[String]): Self = StObject.set(x, "solicitUuids", value.asInstanceOf[js.Any])
      
      inline def setSolicitUuidsUndefined: Self = StObject.set(x, "solicitUuids", js.undefined)
      
      inline def setSolicitUuidsVarargs(value: String*): Self = StObject.set(x, "solicitUuids", js.Array(value*))
      
      inline def setType(value: AdvertisementType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.chromeApps.chromeAppsStrings.broadcast
    - typingsJapgolly.chromeApps.chromeAppsStrings.peripheral
  */
  trait AdvertisementType extends StObject
  object AdvertisementType {
    
    inline def broadcast: typingsJapgolly.chromeApps.chromeAppsStrings.broadcast = "broadcast".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.broadcast]
    
    inline def peripheral: typingsJapgolly.chromeApps.chromeAppsStrings.peripheral = "peripheral".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.peripheral]
  }
  
  trait Characteristic extends StObject {
    
    /** Returns the identifier assigned to this characteristic. Use the instance ID to distinguish between characteristics from a peripheral with the same UUID and to make function calls that take in a characteristic identifier. Present, if this instance represents a remote characteristic. */
    var instanceId: js.UndefOr[String] = js.undefined
    
    /** The properties of this characteristic. */
    var properties: js.Array[CharacteristicProperties]
    
    /** The GATT service this characteristic belongs to. */
    var service: js.UndefOr[Service] = js.undefined
    
    /** The UUID of the characteristic, e.g. 00002a37-0000-1000-8000-00805f9b34fb. */
    var uuid: String
    
    /** The currently cached characteristic value. This value gets updated when the value of the characteristic is read or updated via a notification or indication. */
    var value: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
  }
  object Characteristic {
    
    inline def apply(properties: js.Array[CharacteristicProperties], uuid: String): Characteristic = {
      val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Characteristic]
    }
    
    extension [Self <: Characteristic](x: Self) {
      
      inline def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
      
      inline def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
      
      inline def setProperties(value: js.Array[CharacteristicProperties]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesVarargs(value: CharacteristicProperties*): Self = StObject.set(x, "properties", js.Array(value*))
      
      inline def setService(value: Service): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.chromeApps.chromeAppsStrings.broadcast
    - typingsJapgolly.chromeApps.chromeAppsStrings.read_
    - typingsJapgolly.chromeApps.chromeAppsStrings.writeWithoutResponse
    - typingsJapgolly.chromeApps.chromeAppsStrings.write_
    - typingsJapgolly.chromeApps.chromeAppsStrings.notify
    - typingsJapgolly.chromeApps.chromeAppsStrings.indicate
    - typingsJapgolly.chromeApps.chromeAppsStrings.authenticatedSignedWrites
    - typingsJapgolly.chromeApps.chromeAppsStrings.extendedProperties
    - typingsJapgolly.chromeApps.chromeAppsStrings.reliableWrite
    - typingsJapgolly.chromeApps.chromeAppsStrings.writableAuxiliaries
    - typingsJapgolly.chromeApps.chromeAppsStrings.encryptRead
    - typingsJapgolly.chromeApps.chromeAppsStrings.encryptWrite
    - typingsJapgolly.chromeApps.chromeAppsStrings.encryptAuthenticatedRead
    - typingsJapgolly.chromeApps.chromeAppsStrings.encryptAuthenticatedWrite
  */
  trait CharacteristicProperties extends StObject
  object CharacteristicProperties {
    
    inline def authenticatedSignedWrites: typingsJapgolly.chromeApps.chromeAppsStrings.authenticatedSignedWrites = "authenticatedSignedWrites".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.authenticatedSignedWrites]
    
    inline def broadcast: typingsJapgolly.chromeApps.chromeAppsStrings.broadcast = "broadcast".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.broadcast]
    
    inline def encryptAuthenticatedRead: typingsJapgolly.chromeApps.chromeAppsStrings.encryptAuthenticatedRead = "encryptAuthenticatedRead".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.encryptAuthenticatedRead]
    
    inline def encryptAuthenticatedWrite: typingsJapgolly.chromeApps.chromeAppsStrings.encryptAuthenticatedWrite = "encryptAuthenticatedWrite".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.encryptAuthenticatedWrite]
    
    inline def encryptRead: typingsJapgolly.chromeApps.chromeAppsStrings.encryptRead = "encryptRead".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.encryptRead]
    
    inline def encryptWrite: typingsJapgolly.chromeApps.chromeAppsStrings.encryptWrite = "encryptWrite".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.encryptWrite]
    
    inline def extendedProperties: typingsJapgolly.chromeApps.chromeAppsStrings.extendedProperties = "extendedProperties".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.extendedProperties]
    
    inline def indicate: typingsJapgolly.chromeApps.chromeAppsStrings.indicate = "indicate".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.indicate]
    
    inline def read: read_ = "read".asInstanceOf[read_]
    
    inline def reliableWrite: typingsJapgolly.chromeApps.chromeAppsStrings.reliableWrite = "reliableWrite".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.reliableWrite]
    
    inline def writableAuxiliaries: typingsJapgolly.chromeApps.chromeAppsStrings.writableAuxiliaries = "writableAuxiliaries".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.writableAuxiliaries]
    
    inline def write: write_ = "write".asInstanceOf[write_]
    
    inline def writeWithoutResponse: typingsJapgolly.chromeApps.chromeAppsStrings.writeWithoutResponse = "writeWithoutResponse".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.writeWithoutResponse]
  }
  
  trait Descriptor extends StObject {
    
    /** The GATT characteristic this descriptor belongs to. */
    var characteristic: js.UndefOr[Characteristic] = js.undefined
    
    /** Returns the identifier assigned to this descriptor. Use the instance ID to distinguish between descriptors from a peripheral with the same UUID and to make function calls that take in a descriptor identifier. Present, if this instance represents a remote characteristic. */
    var instanceId: js.UndefOr[String] = js.undefined
    
    /**
      * The permissions of this descriptor.
      * @since Chrome 52.
      */
    var permissions: js.Array[DescriptorPermissions]
    
    /** The UUID of the characteristic descriptor, e.g. 00002902-0000-1000-8000-00805f9b34fb. */
    var uuid: String
    
    /** The currently cached descriptor value. This value gets updated when the value of the descriptor is read. */
    var value: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
  }
  object Descriptor {
    
    inline def apply(permissions: js.Array[DescriptorPermissions], uuid: String): Descriptor = {
      val __obj = js.Dynamic.literal(permissions = permissions.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Descriptor]
    }
    
    extension [Self <: Descriptor](x: Self) {
      
      inline def setCharacteristic(value: Characteristic): Self = StObject.set(x, "characteristic", value.asInstanceOf[js.Any])
      
      inline def setCharacteristicUndefined: Self = StObject.set(x, "characteristic", js.undefined)
      
      inline def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
      
      inline def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
      
      inline def setPermissions(value: js.Array[DescriptorPermissions]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
      
      inline def setPermissionsVarargs(value: DescriptorPermissions*): Self = StObject.set(x, "permissions", js.Array(value*))
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.chromeApps.chromeAppsStrings.read_
    - typingsJapgolly.chromeApps.chromeAppsStrings.write_
    - typingsJapgolly.chromeApps.chromeAppsStrings.encryptedRead
    - typingsJapgolly.chromeApps.chromeAppsStrings.encryptedWrite
    - typingsJapgolly.chromeApps.chromeAppsStrings.encryptedAuthenticatedRead
    - typingsJapgolly.chromeApps.chromeAppsStrings.encryptedAuthenticatedWrite
  */
  trait DescriptorPermissions extends StObject
  object DescriptorPermissions {
    
    inline def encryptedAuthenticatedRead: typingsJapgolly.chromeApps.chromeAppsStrings.encryptedAuthenticatedRead = "encryptedAuthenticatedRead".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.encryptedAuthenticatedRead]
    
    inline def encryptedAuthenticatedWrite: typingsJapgolly.chromeApps.chromeAppsStrings.encryptedAuthenticatedWrite = "encryptedAuthenticatedWrite".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.encryptedAuthenticatedWrite]
    
    inline def encryptedRead: typingsJapgolly.chromeApps.chromeAppsStrings.encryptedRead = "encryptedRead".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.encryptedRead]
    
    inline def encryptedWrite: typingsJapgolly.chromeApps.chromeAppsStrings.encryptedWrite = "encryptedWrite".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.encryptedWrite]
    
    inline def read: read_ = "read".asInstanceOf[read_]
    
    inline def write: write_ = "write".asInstanceOf[write_]
  }
  
  trait INotification extends StObject {
    
    /** Optional flag for sending an indication instead of a notification. */
    var shouldIndicate: Boolean
    
    /** New value of the characteristic. */
    var value: js.typedarray.ArrayBuffer
  }
  object INotification {
    
    inline def apply(shouldIndicate: Boolean, value: js.typedarray.ArrayBuffer): INotification = {
      val __obj = js.Dynamic.literal(shouldIndicate = shouldIndicate.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[INotification]
    }
    
    extension [Self <: INotification](x: Self) {
      
      inline def setShouldIndicate(value: Boolean): Self = StObject.set(x, "shouldIndicate", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait IProperties extends StObject {
    
    /**
      * Flag indicating whether a connection to the device is left open when the event page of the application is unloaded. The default value is false.
      * @see [HowToManageAppLifecycle]{@link https://developer.chrome.com/apps/app_lifecycle}
      * @default false
      */
    var persistent: Boolean
  }
  object IProperties {
    
    inline def apply(persistent: Boolean): IProperties = {
      val __obj = js.Dynamic.literal(persistent = persistent.asInstanceOf[js.Any])
      __obj.asInstanceOf[IProperties]
    }
    
    extension [Self <: IProperties](x: Self) {
      
      inline def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
    }
  }
  
  trait IResponse extends StObject {
    
    /** If this is an error response, this should be true. */
    var isError: Boolean
    
    /** Id of the request this is a response to. */
    var requestId: integer
    
    /** Response value. Write requests and error responses will ignore this parameter. */
    var value: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
  }
  object IResponse {
    
    inline def apply(isError: Boolean, requestId: integer): IResponse = {
      val __obj = js.Dynamic.literal(isError = isError.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
      __obj.asInstanceOf[IResponse]
    }
    
    extension [Self <: IResponse](x: Self) {
      
      inline def setIsError(value: Boolean): Self = StObject.set(x, "isError", value.asInstanceOf[js.Any])
      
      inline def setRequestId(value: integer): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait Request extends StObject {
    
    /** Device that send this request. */
    var device: RequestDevice
    
    /** Unique ID for this request. Use this ID when responding to this request. */
    var requestId: integer
    
    /** Value to write (if this is a write request). */
    var value: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
  }
  object Request {
    
    inline def apply(device: RequestDevice, requestId: integer): Request = {
      val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Request]
    }
    
    extension [Self <: Request](x: Self) {
      
      inline def setDevice(value: RequestDevice): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      inline def setRequestId(value: integer): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait RequestDevice extends StObject {
    
    /** The address of the device, in the format 'XX:XX:XX:XX:XX:XX'. */
    var address: String
    
    /** The class of the device, a bit - field defined by:
      * @see [Specs]{@link http://www.bluetooth.org/en-us/specification/assigned-numbers/baseband}
      **/
    var deviceClass: js.UndefOr[integer] = js.undefined
    
    /** The human-readable name of the device. */
    var name: js.UndefOr[String] = js.undefined
  }
  object RequestDevice {
    
    inline def apply(address: String): RequestDevice = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestDevice]
    }
    
    extension [Self <: RequestDevice](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setDeviceClass(value: integer): Self = StObject.set(x, "deviceClass", value.asInstanceOf[js.Any])
      
      inline def setDeviceClassUndefined: Self = StObject.set(x, "deviceClass", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait Service extends StObject {
    
    /**
      * The device address of the remote peripheral that the GATT service belongs to.
      * Present, if this instance represents a remote service.
      */
    var deviceAddress: js.UndefOr[String] = js.undefined
    
    /**
      * Returns the identifier assigned to this service.
      * Use the instance ID to distinguish between services from a peripheral with the same UUID and to make function calls that take in a service identifier.
      * Present, if this instance represents a remote service.
      **/
    var instanceId: js.UndefOr[String] = js.undefined
    
    /** Indicates whether the type of this service is primary or secondary. */
    var isPrimary: Boolean
    
    /** The UUID of the service, e.g. 0000180d-0000-1000-8000-00805f9b34fb. */
    var uuid: String
  }
  object Service {
    
    inline def apply(isPrimary: Boolean, uuid: String): Service = {
      val __obj = js.Dynamic.literal(isPrimary = isPrimary.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Service]
    }
    
    extension [Self <: Service](x: Self) {
      
      inline def setDeviceAddress(value: String): Self = StObject.set(x, "deviceAddress", value.asInstanceOf[js.Any])
      
      inline def setDeviceAddressUndefined: Self = StObject.set(x, "deviceAddress", js.undefined)
      
      inline def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
      
      inline def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
      
      inline def setIsPrimary(value: Boolean): Self = StObject.set(x, "isPrimary", value.asInstanceOf[js.Any])
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
}
