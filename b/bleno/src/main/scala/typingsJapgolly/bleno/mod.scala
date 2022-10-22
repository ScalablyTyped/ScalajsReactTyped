package typingsJapgolly.bleno

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.bleno.anon.TypeofCharacteristic
import typingsJapgolly.bleno.blenoStrings.accept
import typingsJapgolly.bleno.blenoStrings.advertisingStart
import typingsJapgolly.bleno.blenoStrings.advertisingStartError
import typingsJapgolly.bleno.blenoStrings.advertisingStop
import typingsJapgolly.bleno.blenoStrings.disconnect
import typingsJapgolly.bleno.blenoStrings.mtuChange
import typingsJapgolly.bleno.blenoStrings.rssiUpdate
import typingsJapgolly.bleno.blenoStrings.servicesSet
import typingsJapgolly.bleno.blenoStrings.servicesSetError
import typingsJapgolly.bleno.blenoStrings.stateChange
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.eventsMod.global.NodeJS.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("bleno", JSImport.Namespace)
  @js.native
  val ^ : Bleno = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("bleno", "Characteristic")
  @js.native
  open class CharacteristicCls protected ()
    extends StObject
       with Characteristic {
    def this(options: CharacteristicOptions) = this()
    
    /* CompleteClass */
    override val RESULT_ATTR_NOT_LONG: Double = js.native
    
    /* CompleteClass */
    override val RESULT_INVALID_ATTRIBUTE_LENGTH: Double = js.native
    
    /* CompleteClass */
    override val RESULT_INVALID_OFFSET: Double = js.native
    
    /* CompleteClass */
    override val RESULT_SUCCESS: Double = js.native
    
    /* CompleteClass */
    override val RESULT_UNLIKELY_ERROR: Double = js.native
    
    /* CompleteClass */
    var descriptors: js.Array[Descriptor] = js.native
    
    /* CompleteClass */
    override def onIndicate(): Unit = js.native
    
    /* CompleteClass */
    override def onNotify(): Unit = js.native
    
    /* CompleteClass */
    override def onReadRequest(offset: Double, callback: js.Function2[/* result */ Double, /* data */ js.UndefOr[Buffer], Unit]): Unit = js.native
    
    /* CompleteClass */
    override def onSubscribe(maxValueSize: Double, updateValueCallback: Any): Unit = js.native
    
    /* CompleteClass */
    override def onUnsubscribe(): Unit = js.native
    
    /* CompleteClass */
    override def onWriteRequest(
      data: Buffer,
      offset: Double,
      withoutResponse: Boolean,
      callback: js.Function1[/* result */ Double, Unit]
    ): Unit = js.native
    
    /* CompleteClass */
    var properties: js.Array[Property] = js.native
    
    /* CompleteClass */
    var secure: js.Array[Property] = js.native
    
    /* CompleteClass */
    var uuid: String = js.native
    
    /* CompleteClass */
    var value: Buffer | Null = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("bleno", "Descriptor")
  @js.native
  open class DescriptorCls protected ()
    extends StObject
       with Descriptor {
    def this(options: DescriptorOptions) = this()
    
    /* CompleteClass */
    var uuid: String = js.native
    
    /* CompleteClass */
    var value: Buffer = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("bleno", "PrimaryService")
  @js.native
  open class PrimaryServiceCls protected ()
    extends StObject
       with PrimaryService {
    def this(options: PrimaryServiceOptions) = this()
    
    /* CompleteClass */
    var characteristics: js.Array[Characteristic] = js.native
    
    /* CompleteClass */
    var uuid: String = js.native
  }
  
  @js.native
  trait Bleno
    extends StObject
       with EventEmitter {
    
    val Characteristic: TypeofCharacteristic & (Instantiable1[/* options */ CharacteristicOptions, typingsJapgolly.bleno.mod.Characteristic]) = js.native
    
    val Descriptor: Instantiable1[/* options */ DescriptorOptions, typingsJapgolly.bleno.mod.Descriptor] = js.native
    
    val PrimaryService: Instantiable1[/* options */ PrimaryServiceOptions, typingsJapgolly.bleno.mod.PrimaryService] = js.native
    
    val address: String = js.native
    
    def disconnect(): Unit = js.native
    
    val mtu: Double = js.native
    
    @JSName("on")
    def on_accept(event: accept, cb: js.Function1[/* address */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_advertisingStart(event: advertisingStart, cb: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]): this.type = js.native
    @JSName("on")
    def on_advertisingStartError(event: advertisingStartError, cb: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("on")
    def on_advertisingStop(event: advertisingStop, cb: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_disconnect(event: disconnect, cb: js.Function1[/* clientAddress */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_mtuChange(event: mtuChange, cb: js.Function1[/* mtu */ Double, Unit]): this.type = js.native
    @JSName("on")
    def on_rssiUpdate(event: rssiUpdate, cb: js.Function1[/* rssi */ Double, Unit]): this.type = js.native
    @JSName("on")
    def on_servicesSet(event: servicesSet, cb: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]): this.type = js.native
    @JSName("on")
    def on_servicesSetError(event: servicesSetError, cb: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("on")
    def on_stateChange(event: stateChange, cb: js.Function1[/* state */ State, Unit]): this.type = js.native
    
    val platform: String = js.native
    
    val rssi: Double = js.native
    
    def setServices(services: js.Array[typingsJapgolly.bleno.mod.PrimaryService]): Unit = js.native
    def setServices(
      services: js.Array[typingsJapgolly.bleno.mod.PrimaryService],
      callback: js.Function1[/* arg */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    
    def startAdvertising(name: String): Unit = js.native
    def startAdvertising(name: String, serviceUuids: js.Array[String]): Unit = js.native
    def startAdvertising(
      name: String,
      serviceUuids: js.Array[String],
      callback: js.Function1[/* arg */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    def startAdvertising(
      name: String,
      serviceUuids: Unit,
      callback: js.Function1[/* arg */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    
    def startAdvertisingIBeacon(uuid: String, major: Double, minor: Double, measuredPower: Double): Unit = js.native
    def startAdvertisingIBeacon(
      uuid: String,
      major: Double,
      minor: Double,
      measuredPower: Double,
      callback: js.Function1[/* arg */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    
    def startAdvertisingWithEIRData(advertisementData: Buffer): Unit = js.native
    def startAdvertisingWithEIRData(advertisementData: Buffer, callback: js.Function1[/* arg */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
    def startAdvertisingWithEIRData(advertisementData: Buffer, scanData: Buffer): Unit = js.native
    def startAdvertisingWithEIRData(
      advertisementData: Buffer,
      scanData: Buffer,
      callback: js.Function1[/* arg */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    
    val state: State = js.native
    
    def stopAdvertising(): Unit = js.native
    def stopAdvertising(callback: js.Function0[Unit]): Unit = js.native
    
    def updateRssi(): Unit = js.native
    def updateRssi(callback: js.Function2[/* err */ Null, /* rssi */ Double, Unit]): Unit = js.native
  }
  
  trait Characteristic extends StObject {
    
    val RESULT_ATTR_NOT_LONG: Double
    
    val RESULT_INVALID_ATTRIBUTE_LENGTH: Double
    
    val RESULT_INVALID_OFFSET: Double
    
    val RESULT_SUCCESS: Double
    
    val RESULT_UNLIKELY_ERROR: Double
    
    var descriptors: js.Array[Descriptor]
    
    def onIndicate(): Unit
    
    def onNotify(): Unit
    
    def onReadRequest(offset: Double, callback: js.Function2[/* result */ Double, /* data */ js.UndefOr[Buffer], Unit]): Unit
    
    def onSubscribe(maxValueSize: Double, updateValueCallback: Any): Unit
    
    def onUnsubscribe(): Unit
    
    def onWriteRequest(
      data: Buffer,
      offset: Double,
      withoutResponse: Boolean,
      callback: js.Function1[/* result */ Double, Unit]
    ): Unit
    
    var properties: js.Array[Property]
    
    var secure: js.Array[Property]
    
    var uuid: String
    
    var value: Buffer | Null
  }
  object Characteristic {
    
    inline def apply(
      RESULT_ATTR_NOT_LONG: Double,
      RESULT_INVALID_ATTRIBUTE_LENGTH: Double,
      RESULT_INVALID_OFFSET: Double,
      RESULT_SUCCESS: Double,
      RESULT_UNLIKELY_ERROR: Double,
      descriptors: js.Array[Descriptor],
      onIndicate: Callback,
      onNotify: Callback,
      onReadRequest: (Double, js.Function2[/* result */ Double, /* data */ js.UndefOr[Buffer], Unit]) => Callback,
      onSubscribe: (Double, Any) => Callback,
      onUnsubscribe: Callback,
      onWriteRequest: (Buffer, Double, Boolean, js.Function1[/* result */ Double, Unit]) => Callback,
      properties: js.Array[Property],
      secure: js.Array[Property],
      uuid: String
    ): Characteristic = {
      val __obj = js.Dynamic.literal(RESULT_ATTR_NOT_LONG = RESULT_ATTR_NOT_LONG.asInstanceOf[js.Any], RESULT_INVALID_ATTRIBUTE_LENGTH = RESULT_INVALID_ATTRIBUTE_LENGTH.asInstanceOf[js.Any], RESULT_INVALID_OFFSET = RESULT_INVALID_OFFSET.asInstanceOf[js.Any], RESULT_SUCCESS = RESULT_SUCCESS.asInstanceOf[js.Any], RESULT_UNLIKELY_ERROR = RESULT_UNLIKELY_ERROR.asInstanceOf[js.Any], descriptors = descriptors.asInstanceOf[js.Any], onIndicate = onIndicate.toJsFn, onNotify = onNotify.toJsFn, onReadRequest = js.Any.fromFunction2((t0: Double, t1: js.Function2[/* result */ Double, /* data */ js.UndefOr[Buffer], Unit]) => (onReadRequest(t0, t1)).runNow()), onSubscribe = js.Any.fromFunction2((t0: Double, t1: Any) => (onSubscribe(t0, t1)).runNow()), onUnsubscribe = onUnsubscribe.toJsFn, onWriteRequest = js.Any.fromFunction4((t0: Buffer, t1: Double, t2: Boolean, t3: js.Function1[/* result */ Double, Unit]) => (onWriteRequest(t0, t1, t2, t3)).runNow()), properties = properties.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], value = null)
      __obj.asInstanceOf[Characteristic]
    }
    
    extension [Self <: Characteristic](x: Self) {
      
      inline def setDescriptors(value: js.Array[Descriptor]): Self = StObject.set(x, "descriptors", value.asInstanceOf[js.Any])
      
      inline def setDescriptorsVarargs(value: Descriptor*): Self = StObject.set(x, "descriptors", js.Array(value*))
      
      inline def setOnIndicate(value: Callback): Self = StObject.set(x, "onIndicate", value.toJsFn)
      
      inline def setOnNotify(value: Callback): Self = StObject.set(x, "onNotify", value.toJsFn)
      
      inline def setOnReadRequest(
        value: (Double, js.Function2[/* result */ Double, /* data */ js.UndefOr[Buffer], Unit]) => Callback
      ): Self = StObject.set(x, "onReadRequest", js.Any.fromFunction2((t0: Double, t1: js.Function2[/* result */ Double, /* data */ js.UndefOr[Buffer], Unit]) => (value(t0, t1)).runNow()))
      
      inline def setOnSubscribe(value: (Double, Any) => Callback): Self = StObject.set(x, "onSubscribe", js.Any.fromFunction2((t0: Double, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setOnUnsubscribe(value: Callback): Self = StObject.set(x, "onUnsubscribe", value.toJsFn)
      
      inline def setOnWriteRequest(value: (Buffer, Double, Boolean, js.Function1[/* result */ Double, Unit]) => Callback): Self = StObject.set(x, "onWriteRequest", js.Any.fromFunction4((t0: Buffer, t1: Double, t2: Boolean, t3: js.Function1[/* result */ Double, Unit]) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setProperties(value: js.Array[Property]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesVarargs(value: Property*): Self = StObject.set(x, "properties", js.Array(value*))
      
      inline def setRESULT_ATTR_NOT_LONG(value: Double): Self = StObject.set(x, "RESULT_ATTR_NOT_LONG", value.asInstanceOf[js.Any])
      
      inline def setRESULT_INVALID_ATTRIBUTE_LENGTH(value: Double): Self = StObject.set(x, "RESULT_INVALID_ATTRIBUTE_LENGTH", value.asInstanceOf[js.Any])
      
      inline def setRESULT_INVALID_OFFSET(value: Double): Self = StObject.set(x, "RESULT_INVALID_OFFSET", value.asInstanceOf[js.Any])
      
      inline def setRESULT_SUCCESS(value: Double): Self = StObject.set(x, "RESULT_SUCCESS", value.asInstanceOf[js.Any])
      
      inline def setRESULT_UNLIKELY_ERROR(value: Double): Self = StObject.set(x, "RESULT_UNLIKELY_ERROR", value.asInstanceOf[js.Any])
      
      inline def setSecure(value: js.Array[Property]): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureVarargs(value: Property*): Self = StObject.set(x, "secure", js.Array(value*))
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Buffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
    }
  }
  
  trait CharacteristicOptions extends StObject {
    
    var descriptors: js.UndefOr[js.Array[Descriptor] | Null] = js.undefined
    
    var onIndicate: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
    
    var onNotify: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
    
    var onReadRequest: js.UndefOr[
        (js.Function2[
          /* offset */ Double, 
          /* callback */ js.Function2[/* result */ Double, /* data */ js.UndefOr[Buffer], Unit], 
          Unit
        ]) | Null
      ] = js.undefined
    
    var onSubscribe: js.UndefOr[
        (js.Function2[/* maxValueSize */ Double, /* updateValueCallback */ Any, Unit]) | Null
      ] = js.undefined
    
    var onUnsubscribe: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
    
    var onWriteRequest: js.UndefOr[
        (js.Function4[
          /* data */ Buffer, 
          /* offset */ Double, 
          /* withoutResponse */ Boolean, 
          /* callback */ js.Function1[/* result */ Double, Unit], 
          Unit
        ]) | Null
      ] = js.undefined
    
    var properties: js.UndefOr[js.Array[Property] | Null] = js.undefined
    
    var secure: js.UndefOr[js.Array[Property] | Null] = js.undefined
    
    var uuid: String
    
    var value: js.UndefOr[Buffer | Null] = js.undefined
  }
  object CharacteristicOptions {
    
    inline def apply(uuid: String): CharacteristicOptions = {
      val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[CharacteristicOptions]
    }
    
    extension [Self <: CharacteristicOptions](x: Self) {
      
      inline def setDescriptors(value: js.Array[Descriptor]): Self = StObject.set(x, "descriptors", value.asInstanceOf[js.Any])
      
      inline def setDescriptorsNull: Self = StObject.set(x, "descriptors", null)
      
      inline def setDescriptorsUndefined: Self = StObject.set(x, "descriptors", js.undefined)
      
      inline def setDescriptorsVarargs(value: Descriptor*): Self = StObject.set(x, "descriptors", js.Array(value*))
      
      inline def setOnIndicate(value: Callback): Self = StObject.set(x, "onIndicate", value.toJsFn)
      
      inline def setOnIndicateNull: Self = StObject.set(x, "onIndicate", null)
      
      inline def setOnIndicateUndefined: Self = StObject.set(x, "onIndicate", js.undefined)
      
      inline def setOnNotify(value: Callback): Self = StObject.set(x, "onNotify", value.toJsFn)
      
      inline def setOnNotifyNull: Self = StObject.set(x, "onNotify", null)
      
      inline def setOnNotifyUndefined: Self = StObject.set(x, "onNotify", js.undefined)
      
      inline def setOnReadRequest(
        value: (/* offset */ Double, /* callback */ js.Function2[/* result */ Double, /* data */ js.UndefOr[Buffer], Unit]) => Callback
      ): Self = StObject.set(x, "onReadRequest", js.Any.fromFunction2((t0: /* offset */ Double, t1: /* callback */ js.Function2[/* result */ Double, /* data */ js.UndefOr[Buffer], Unit]) => (value(t0, t1)).runNow()))
      
      inline def setOnReadRequestNull: Self = StObject.set(x, "onReadRequest", null)
      
      inline def setOnReadRequestUndefined: Self = StObject.set(x, "onReadRequest", js.undefined)
      
      inline def setOnSubscribe(value: (/* maxValueSize */ Double, /* updateValueCallback */ Any) => Callback): Self = StObject.set(x, "onSubscribe", js.Any.fromFunction2((t0: /* maxValueSize */ Double, t1: /* updateValueCallback */ Any) => (value(t0, t1)).runNow()))
      
      inline def setOnSubscribeNull: Self = StObject.set(x, "onSubscribe", null)
      
      inline def setOnSubscribeUndefined: Self = StObject.set(x, "onSubscribe", js.undefined)
      
      inline def setOnUnsubscribe(value: Callback): Self = StObject.set(x, "onUnsubscribe", value.toJsFn)
      
      inline def setOnUnsubscribeNull: Self = StObject.set(x, "onUnsubscribe", null)
      
      inline def setOnUnsubscribeUndefined: Self = StObject.set(x, "onUnsubscribe", js.undefined)
      
      inline def setOnWriteRequest(
        value: (/* data */ Buffer, /* offset */ Double, /* withoutResponse */ Boolean, /* callback */ js.Function1[/* result */ Double, Unit]) => Callback
      ): Self = StObject.set(x, "onWriteRequest", js.Any.fromFunction4((t0: /* data */ Buffer, t1: /* offset */ Double, t2: /* withoutResponse */ Boolean, t3: /* callback */ js.Function1[/* result */ Double, Unit]) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setOnWriteRequestNull: Self = StObject.set(x, "onWriteRequest", null)
      
      inline def setOnWriteRequestUndefined: Self = StObject.set(x, "onWriteRequest", js.undefined)
      
      inline def setProperties(value: js.Array[Property]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesNull: Self = StObject.set(x, "properties", null)
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setPropertiesVarargs(value: Property*): Self = StObject.set(x, "properties", js.Array(value*))
      
      inline def setSecure(value: js.Array[Property]): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureNull: Self = StObject.set(x, "secure", null)
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      inline def setSecureVarargs(value: Property*): Self = StObject.set(x, "secure", js.Array(value*))
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Buffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait Descriptor extends StObject {
    
    var uuid: String
    
    var value: Buffer
  }
  object Descriptor {
    
    inline def apply(uuid: String, value: Buffer): Descriptor = {
      val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Descriptor]
    }
    
    extension [Self <: Descriptor](x: Self) {
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Buffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait DescriptorOptions extends StObject {
    
    var uuid: String
    
    var value: js.UndefOr[Buffer | String | Null] = js.undefined
  }
  object DescriptorOptions {
    
    inline def apply(uuid: String): DescriptorOptions = {
      val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescriptorOptions]
    }
    
    extension [Self <: DescriptorOptions](x: Self) {
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Buffer | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait PrimaryService extends StObject {
    
    var characteristics: js.Array[Characteristic]
    
    var uuid: String
  }
  object PrimaryService {
    
    inline def apply(characteristics: js.Array[Characteristic], uuid: String): PrimaryService = {
      val __obj = js.Dynamic.literal(characteristics = characteristics.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrimaryService]
    }
    
    extension [Self <: PrimaryService](x: Self) {
      
      inline def setCharacteristics(value: js.Array[Characteristic]): Self = StObject.set(x, "characteristics", value.asInstanceOf[js.Any])
      
      inline def setCharacteristicsVarargs(value: Characteristic*): Self = StObject.set(x, "characteristics", js.Array(value*))
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
  
  trait PrimaryServiceOptions extends StObject {
    
    var characteristics: js.UndefOr[js.Array[Characteristic] | Null] = js.undefined
    
    var uuid: String
  }
  object PrimaryServiceOptions {
    
    inline def apply(uuid: String): PrimaryServiceOptions = {
      val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrimaryServiceOptions]
    }
    
    extension [Self <: PrimaryServiceOptions](x: Self) {
      
      inline def setCharacteristics(value: js.Array[Characteristic]): Self = StObject.set(x, "characteristics", value.asInstanceOf[js.Any])
      
      inline def setCharacteristicsNull: Self = StObject.set(x, "characteristics", null)
      
      inline def setCharacteristicsUndefined: Self = StObject.set(x, "characteristics", js.undefined)
      
      inline def setCharacteristicsVarargs(value: Characteristic*): Self = StObject.set(x, "characteristics", js.Array(value*))
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.bleno.blenoStrings.read
    - typingsJapgolly.bleno.blenoStrings.write
    - typingsJapgolly.bleno.blenoStrings.indicate
    - typingsJapgolly.bleno.blenoStrings.notify
    - typingsJapgolly.bleno.blenoStrings.writeWithoutResponse
  */
  trait Property extends StObject
  object Property {
    
    inline def indicate: typingsJapgolly.bleno.blenoStrings.indicate = "indicate".asInstanceOf[typingsJapgolly.bleno.blenoStrings.indicate]
    
    inline def read: typingsJapgolly.bleno.blenoStrings.read = "read".asInstanceOf[typingsJapgolly.bleno.blenoStrings.read]
    
    inline def write: typingsJapgolly.bleno.blenoStrings.write = "write".asInstanceOf[typingsJapgolly.bleno.blenoStrings.write]
    
    inline def writeWithoutResponse: typingsJapgolly.bleno.blenoStrings.writeWithoutResponse = "writeWithoutResponse".asInstanceOf[typingsJapgolly.bleno.blenoStrings.writeWithoutResponse]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.bleno.blenoStrings.poweredOn
    - typingsJapgolly.bleno.blenoStrings.poweredOff
    - typingsJapgolly.bleno.blenoStrings.unauthorized
    - typingsJapgolly.bleno.blenoStrings.unsupported
    - typingsJapgolly.bleno.blenoStrings.unknown
    - typingsJapgolly.bleno.blenoStrings.resetting
  */
  trait State extends StObject
  object State {
    
    inline def poweredOff: typingsJapgolly.bleno.blenoStrings.poweredOff = "poweredOff".asInstanceOf[typingsJapgolly.bleno.blenoStrings.poweredOff]
    
    inline def poweredOn: typingsJapgolly.bleno.blenoStrings.poweredOn = "poweredOn".asInstanceOf[typingsJapgolly.bleno.blenoStrings.poweredOn]
    
    inline def resetting: typingsJapgolly.bleno.blenoStrings.resetting = "resetting".asInstanceOf[typingsJapgolly.bleno.blenoStrings.resetting]
    
    inline def unauthorized: typingsJapgolly.bleno.blenoStrings.unauthorized = "unauthorized".asInstanceOf[typingsJapgolly.bleno.blenoStrings.unauthorized]
    
    inline def unknown: typingsJapgolly.bleno.blenoStrings.unknown = "unknown".asInstanceOf[typingsJapgolly.bleno.blenoStrings.unknown]
    
    inline def unsupported: typingsJapgolly.bleno.blenoStrings.unsupported = "unsupported".asInstanceOf[typingsJapgolly.bleno.blenoStrings.unsupported]
  }
  
  type _To = Bleno
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Bleno = ^
}
