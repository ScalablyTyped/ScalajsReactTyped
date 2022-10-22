package typingsJapgolly.noble

import typingsJapgolly.noble.anon.Data
import typingsJapgolly.noble.nobleStrings.broadcast
import typingsJapgolly.noble.nobleStrings.characteristicsDiscover
import typingsJapgolly.noble.nobleStrings.connect
import typingsJapgolly.noble.nobleStrings.connected
import typingsJapgolly.noble.nobleStrings.connecting
import typingsJapgolly.noble.nobleStrings.descriptorsDiscover
import typingsJapgolly.noble.nobleStrings.disconnect
import typingsJapgolly.noble.nobleStrings.disconnected
import typingsJapgolly.noble.nobleStrings.disconnecting
import typingsJapgolly.noble.nobleStrings.discover
import typingsJapgolly.noble.nobleStrings.error
import typingsJapgolly.noble.nobleStrings.includedServicesDiscover
import typingsJapgolly.noble.nobleStrings.notify
import typingsJapgolly.noble.nobleStrings.read
import typingsJapgolly.noble.nobleStrings.rssiUpdate
import typingsJapgolly.noble.nobleStrings.scanStart
import typingsJapgolly.noble.nobleStrings.scanStop
import typingsJapgolly.noble.nobleStrings.servicesDiscover
import typingsJapgolly.noble.nobleStrings.stateChange
import typingsJapgolly.noble.nobleStrings.valueRead
import typingsJapgolly.noble.nobleStrings.valueWrite
import typingsJapgolly.noble.nobleStrings.write
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.node.eventsMod.EventEmitterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("noble", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("noble", "Characteristic")
  @js.native
  open class Characteristic () extends EventEmitter {
    def this(options: EventEmitterOptions) = this()
    
    def broadcast(broadcast: Boolean): Unit = js.native
    def broadcast(broadcast: Boolean, callback: js.Function1[/* error */ String, Unit]): Unit = js.native
    
    var descriptors: js.Array[Descriptor] = js.native
    
    def discoverDescriptors(): Unit = js.native
    def discoverDescriptors(callback: js.Function2[/* error */ String, /* descriptors */ js.Array[Descriptor], Unit]): Unit = js.native
    
    var name: String = js.native
    
    def notify(notify: Boolean): Unit = js.native
    def notify(notify: Boolean, callback: js.Function1[/* error */ String, Unit]): Unit = js.native
    
    def on(event: String, listener: js.Function): this.type = js.native
    def on(event: String, option: Boolean, listener: js.Function): this.type = js.native
    @JSName("on")
    def on_broadcast(event: broadcast, listener: js.Function1[/* state */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_descriptorsDiscover(event: descriptorsDiscover, listener: js.Function1[/* descriptors */ js.Array[Descriptor], Unit]): this.type = js.native
    @JSName("on")
    def on_notify(event: notify, listener: js.Function1[/* state */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_read(event: read, listener: js.Function2[/* data */ Buffer, /* isNotification */ Boolean, Unit]): this.type = js.native
    @JSName("on")
    def on_write(event: write, withoutResponse: Boolean, listener: js.Function1[/* error */ String, Unit]): this.type = js.native
    
    def once(event: String, listener: js.Function): this.type = js.native
    def once(event: String, option: Boolean, listener: js.Function): this.type = js.native
    @JSName("once")
    def once_broadcast(event: broadcast, listener: js.Function1[/* state */ String, Unit]): this.type = js.native
    @JSName("once")
    def once_descriptorsDiscover(event: descriptorsDiscover, listener: js.Function1[/* descriptors */ js.Array[Descriptor], Unit]): this.type = js.native
    @JSName("once")
    def once_notify(event: notify, listener: js.Function1[/* state */ String, Unit]): this.type = js.native
    @JSName("once")
    def once_read(event: read, listener: js.Function2[/* data */ Buffer, /* isNotification */ Boolean, Unit]): this.type = js.native
    @JSName("once")
    def once_write(event: write, withoutResponse: Boolean, listener: js.Function1[/* error */ String, Unit]): this.type = js.native
    
    var properties: js.Array[String] = js.native
    
    def read(): Unit = js.native
    def read(callback: js.Function2[/* error */ String, /* data */ Buffer, Unit]): Unit = js.native
    
    def subscribe(): Unit = js.native
    def subscribe(callback: js.Function1[/* error */ String, Unit]): Unit = js.native
    
    var `type`: String = js.native
    
    def unsubscribe(): Unit = js.native
    def unsubscribe(callback: js.Function1[/* error */ String, Unit]): Unit = js.native
    
    var uuid: String = js.native
    
    def write(data: Buffer, notify: Boolean): Unit = js.native
    def write(data: Buffer, notify: Boolean, callback: js.Function1[/* error */ String, Unit]): Unit = js.native
  }
  
  @JSImport("noble", "Descriptor")
  @js.native
  open class Descriptor () extends EventEmitter {
    def this(options: EventEmitterOptions) = this()
    
    var name: String = js.native
    
    def on(event: String, listener: js.Function): this.type = js.native
    @JSName("on")
    def on_valueRead(event: valueRead, listener: js.Function2[/* error */ String, /* data */ Buffer, Unit]): this.type = js.native
    @JSName("on")
    def on_valueWrite(event: valueWrite, listener: js.Function1[/* error */ String, Unit]): this.type = js.native
    
    def once(event: String, listener: js.Function): this.type = js.native
    @JSName("once")
    def once_valueRead(event: valueRead, listener: js.Function2[/* error */ String, /* data */ Buffer, Unit]): this.type = js.native
    @JSName("once")
    def once_valueWrite(event: valueWrite, listener: js.Function1[/* error */ String, Unit]): this.type = js.native
    
    def readValue(): Unit = js.native
    def readValue(callback: js.Function2[/* error */ String, /* data */ Buffer, Unit]): Unit = js.native
    
    var `type`: String = js.native
    
    var uuid: String = js.native
    
    def writeValue(data: Buffer): Unit = js.native
    def writeValue(data: Buffer, callback: js.Function1[/* error */ String, Unit]): Unit = js.native
  }
  
  @JSImport("noble", "Peripheral")
  @js.native
  open class Peripheral () extends EventEmitter {
    def this(options: EventEmitterOptions) = this()
    
    var address: String = js.native
    
    var addressType: String = js.native
    
    var advertisement: Advertisement = js.native
    
    def connect(): Unit = js.native
    def connect(callback: js.Function1[/* error */ String, Unit]): Unit = js.native
    
    var connectable: Boolean = js.native
    
    def disconnect(): Unit = js.native
    def disconnect(callback: js.Function0[Unit]): Unit = js.native
    
    def discoverAllServicesAndCharacteristics(): Unit = js.native
    def discoverAllServicesAndCharacteristics(
      callback: js.Function3[
          /* error */ String, 
          /* services */ js.Array[Service], 
          /* characteristics */ js.Array[Characteristic], 
          Unit
        ]
    ): Unit = js.native
    
    def discoverServices(serviceUUIDs: js.Array[String]): Unit = js.native
    def discoverServices(
      serviceUUIDs: js.Array[String],
      callback: js.Function2[/* error */ String, /* services */ js.Array[Service], Unit]
    ): Unit = js.native
    
    def discoverSomeServicesAndCharacteristics(serviceUUIDs: js.Array[String], characteristicUUIDs: js.Array[String]): Unit = js.native
    def discoverSomeServicesAndCharacteristics(
      serviceUUIDs: js.Array[String],
      characteristicUUIDs: js.Array[String],
      callback: js.Function3[
          /* error */ String, 
          /* services */ js.Array[Service], 
          /* characteristics */ js.Array[Characteristic], 
          Unit
        ]
    ): Unit = js.native
    
    var id: String = js.native
    
    def on(event: String, listener: js.Function): this.type = js.native
    @JSName("on")
    def on_connect(event: connect, listener: js.Function1[/* error */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_disconnect(event: disconnect, listener: js.Function1[/* error */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_rssiUpdate(event: rssiUpdate, listener: js.Function1[/* rssi */ Double, Unit]): this.type = js.native
    @JSName("on")
    def on_servicesDiscover(event: servicesDiscover, listener: js.Function1[/* services */ js.Array[Service], Unit]): this.type = js.native
    
    def once(event: String, listener: js.Function): this.type = js.native
    @JSName("once")
    def once_connect(event: connect, listener: js.Function1[/* error */ String, Unit]): this.type = js.native
    @JSName("once")
    def once_disconnect(event: disconnect, listener: js.Function1[/* error */ String, Unit]): this.type = js.native
    @JSName("once")
    def once_rssiUpdate(event: rssiUpdate, listener: js.Function1[/* rssi */ Double, Unit]): this.type = js.native
    @JSName("once")
    def once_servicesDiscover(event: servicesDiscover, listener: js.Function1[/* services */ js.Array[Service], Unit]): this.type = js.native
    
    def readHandle(handle: Double, callback: js.Function2[/* error */ String, /* data */ Buffer, Unit]): Unit = js.native
    
    var rssi: Double = js.native
    
    var services: js.Array[Service] = js.native
    
    var state: error | connecting | connected | disconnecting | disconnected = js.native
    
    def updateRssi(): Unit = js.native
    def updateRssi(callback: js.Function2[/* error */ String, /* rssi */ Double, Unit]): Unit = js.native
    
    var uuid: String = js.native
    
    def writeHandle(
      handle: Double,
      data: Buffer,
      withoutResponse: Boolean,
      callback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
  }
  
  @JSImport("noble", "Service")
  @js.native
  open class Service () extends EventEmitter {
    def this(options: EventEmitterOptions) = this()
    
    var characteristics: js.Array[Characteristic] = js.native
    
    def discoverCharacteristics(characteristicUUIDs: js.Array[String]): Unit = js.native
    def discoverCharacteristics(
      characteristicUUIDs: js.Array[String],
      callback: js.Function2[/* error */ String, /* characteristics */ js.Array[Characteristic], Unit]
    ): Unit = js.native
    
    def discoverIncludedServices(serviceUUIDs: js.Array[String]): Unit = js.native
    def discoverIncludedServices(
      serviceUUIDs: js.Array[String],
      callback: js.Function2[/* error */ String, /* includedServiceUuids */ js.Array[String], Unit]
    ): Unit = js.native
    
    var includedServiceUuids: js.Array[String] = js.native
    
    var name: String = js.native
    
    def on(event: String, listener: js.Function): this.type = js.native
    @JSName("on")
    def on_characteristicsDiscover(
      event: characteristicsDiscover,
      listener: js.Function1[/* characteristics */ js.Array[Characteristic], Unit]
    ): this.type = js.native
    @JSName("on")
    def on_includedServicesDiscover(
      event: includedServicesDiscover,
      listener: js.Function1[/* includedServiceUuids */ js.Array[String], Unit]
    ): this.type = js.native
    
    def once(event: String, listener: js.Function): this.type = js.native
    @JSName("once")
    def once_characteristicsDiscover(
      event: characteristicsDiscover,
      listener: js.Function1[/* characteristics */ js.Array[Characteristic], Unit]
    ): this.type = js.native
    @JSName("once")
    def once_includedServicesDiscover(
      event: includedServicesDiscover,
      listener: js.Function1[/* includedServiceUuids */ js.Array[String], Unit]
    ): this.type = js.native
    
    var `type`: String = js.native
    
    var uuid: String = js.native
  }
  
  inline def on(event: String, listener: js.Function): EventEmitter = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[EventEmitter]
  
  inline def on_discover(event: discover, listener: js.Function1[/* peripheral */ Peripheral, Unit]): EventEmitter = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[EventEmitter]
  
  inline def on_scanStart(event: scanStart, listener: js.Function0[Unit]): EventEmitter = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[EventEmitter]
  
  inline def on_scanStop(event: scanStop, listener: js.Function0[Unit]): EventEmitter = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[EventEmitter]
  
  inline def on_stateChange(event: stateChange, listener: js.Function1[/* state */ String, Unit]): EventEmitter = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[EventEmitter]
  
  inline def once(event: String, listener: js.Function): EventEmitter = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[EventEmitter]
  
  inline def once_discover(event: discover, listener: js.Function1[/* peripheral */ Peripheral, Unit]): EventEmitter = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[EventEmitter]
  
  inline def once_scanStart(event: scanStart, listener: js.Function0[Unit]): EventEmitter = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[EventEmitter]
  
  inline def once_scanStop(event: scanStop, listener: js.Function0[Unit]): EventEmitter = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[EventEmitter]
  
  inline def once_stateChange(event: stateChange, listener: js.Function1[/* state */ String, Unit]): EventEmitter = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[EventEmitter]
  
  inline def removeAllListeners(): EventEmitter = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAllListeners")().asInstanceOf[EventEmitter]
  inline def removeAllListeners(event: String): EventEmitter = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAllListeners")(event.asInstanceOf[js.Any]).asInstanceOf[EventEmitter]
  
  inline def removeListener(event: String, listener: js.Function): EventEmitter = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[EventEmitter]
  
  inline def removeListener_discover(event: discover, listener: js.Function1[/* peripheral */ Peripheral, Unit]): EventEmitter = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[EventEmitter]
  
  inline def removeListener_scanStart(event: scanStart, listener: js.Function0[Unit]): EventEmitter = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[EventEmitter]
  
  inline def removeListener_scanStop(event: scanStop, listener: js.Function0[Unit]): EventEmitter = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[EventEmitter]
  
  inline def removeListener_stateChange(event: stateChange, listener: js.Function1[/* state */ String, Unit]): EventEmitter = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[EventEmitter]
  
  inline def startScanning(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startScanning")().asInstanceOf[Unit]
  inline def startScanning(callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startScanning")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def startScanning(serviceUUIDs: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startScanning")(serviceUUIDs.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def startScanning(serviceUUIDs: js.Array[String], allowDuplicates: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("startScanning")(serviceUUIDs.asInstanceOf[js.Any], allowDuplicates.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def startScanning(
    serviceUUIDs: js.Array[String],
    allowDuplicates: Boolean,
    callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("startScanning")(serviceUUIDs.asInstanceOf[js.Any], allowDuplicates.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def startScanning(serviceUUIDs: js.Array[String], callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("startScanning")(serviceUUIDs.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("noble", "state")
  @js.native
  def state: String = js.native
  inline def state_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("state")(x.asInstanceOf[js.Any])
  
  inline def stopScanning(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopScanning")().asInstanceOf[Unit]
  inline def stopScanning(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopScanning")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Advertisement extends StObject {
    
    var localName: String
    
    var manufacturerData: Buffer
    
    var serviceData: js.Array[Data]
    
    var serviceUuids: js.Array[String]
    
    var txPowerLevel: Double
  }
  object Advertisement {
    
    inline def apply(
      localName: String,
      manufacturerData: Buffer,
      serviceData: js.Array[Data],
      serviceUuids: js.Array[String],
      txPowerLevel: Double
    ): Advertisement = {
      val __obj = js.Dynamic.literal(localName = localName.asInstanceOf[js.Any], manufacturerData = manufacturerData.asInstanceOf[js.Any], serviceData = serviceData.asInstanceOf[js.Any], serviceUuids = serviceUuids.asInstanceOf[js.Any], txPowerLevel = txPowerLevel.asInstanceOf[js.Any])
      __obj.asInstanceOf[Advertisement]
    }
    
    extension [Self <: Advertisement](x: Self) {
      
      inline def setLocalName(value: String): Self = StObject.set(x, "localName", value.asInstanceOf[js.Any])
      
      inline def setManufacturerData(value: Buffer): Self = StObject.set(x, "manufacturerData", value.asInstanceOf[js.Any])
      
      inline def setServiceData(value: js.Array[Data]): Self = StObject.set(x, "serviceData", value.asInstanceOf[js.Any])
      
      inline def setServiceDataVarargs(value: Data*): Self = StObject.set(x, "serviceData", js.Array(value*))
      
      inline def setServiceUuids(value: js.Array[String]): Self = StObject.set(x, "serviceUuids", value.asInstanceOf[js.Any])
      
      inline def setServiceUuidsVarargs(value: String*): Self = StObject.set(x, "serviceUuids", js.Array(value*))
      
      inline def setTxPowerLevel(value: Double): Self = StObject.set(x, "txPowerLevel", value.asInstanceOf[js.Any])
    }
  }
}
