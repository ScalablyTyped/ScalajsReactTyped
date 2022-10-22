package typingsJapgolly.achingbrainNatPortMapper

import org.scalajs.dom.AbortSignal
import typingsJapgolly.achingbrainNatPortMapper.anon.ControlURL
import typingsJapgolly.achingbrainNatPortMapper.anon.Devices
import typingsJapgolly.achingbrainSsdp.mod.Service
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUpnpDeviceMod {
  
  @JSImport("@achingbrain/nat-port-mapper/dist/src/upnp/device", "Device")
  @js.native
  open class Device protected () extends StObject {
    def this(service: Service[InternetGatewayDevice]) = this()
    
    def getNamespace(data: Any, uri: String): String = js.native
    
    def getService(types: js.Array[String]): ControlURL = js.native
    
    def parseDescription(info: Record[String, Any]): Devices = js.native
    
    def run(action: String, args: js.Array[js.Tuple2[String, String | Double]], signal: AbortSignal): js.Promise[Any] = js.native
    
    /* private */ val service: Any = js.native
    
    /* private */ val services: Any = js.native
  }
  
  trait GatewayDevice extends StObject {
    
    var deviceList: typingsJapgolly.achingbrainNatPortMapper.anon.Device
    
    var serviceList: typingsJapgolly.achingbrainNatPortMapper.anon.Service
  }
  object GatewayDevice {
    
    inline def apply(
      deviceList: typingsJapgolly.achingbrainNatPortMapper.anon.Device,
      serviceList: typingsJapgolly.achingbrainNatPortMapper.anon.Service
    ): GatewayDevice = {
      val __obj = js.Dynamic.literal(deviceList = deviceList.asInstanceOf[js.Any], serviceList = serviceList.asInstanceOf[js.Any])
      __obj.asInstanceOf[GatewayDevice]
    }
    
    extension [Self <: GatewayDevice](x: Self) {
      
      inline def setDeviceList(value: typingsJapgolly.achingbrainNatPortMapper.anon.Device): Self = StObject.set(x, "deviceList", value.asInstanceOf[js.Any])
      
      inline def setServiceList(value: typingsJapgolly.achingbrainNatPortMapper.anon.Service): Self = StObject.set(x, "serviceList", value.asInstanceOf[js.Any])
    }
  }
  
  trait GatewayService extends StObject {
    
    var SCPDURL: String
    
    var controlURL: String
    
    var eventSubURL: String
    
    var serviceId: String
    
    var serviceType: String
  }
  object GatewayService {
    
    inline def apply(SCPDURL: String, controlURL: String, eventSubURL: String, serviceId: String, serviceType: String): GatewayService = {
      val __obj = js.Dynamic.literal(SCPDURL = SCPDURL.asInstanceOf[js.Any], controlURL = controlURL.asInstanceOf[js.Any], eventSubURL = eventSubURL.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], serviceType = serviceType.asInstanceOf[js.Any])
      __obj.asInstanceOf[GatewayService]
    }
    
    extension [Self <: GatewayService](x: Self) {
      
      inline def setControlURL(value: String): Self = StObject.set(x, "controlURL", value.asInstanceOf[js.Any])
      
      inline def setEventSubURL(value: String): Self = StObject.set(x, "eventSubURL", value.asInstanceOf[js.Any])
      
      inline def setSCPDURL(value: String): Self = StObject.set(x, "SCPDURL", value.asInstanceOf[js.Any])
      
      inline def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
      
      inline def setServiceType(value: String): Self = StObject.set(x, "serviceType", value.asInstanceOf[js.Any])
    }
  }
  
  trait InternetGatewayDevice extends StObject {
    
    var device: GatewayDevice
  }
  object InternetGatewayDevice {
    
    inline def apply(device: GatewayDevice): InternetGatewayDevice = {
      val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternetGatewayDevice]
    }
    
    extension [Self <: InternetGatewayDevice](x: Self) {
      
      inline def setDevice(value: GatewayDevice): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    }
  }
}
