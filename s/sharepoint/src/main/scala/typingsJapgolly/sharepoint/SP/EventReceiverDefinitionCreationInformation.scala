package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventReceiverDefinitionCreationInformation
  extends StObject
     with ClientValueObject {
  
  def get_eventType(): EventReceiverType
  
  def get_receiverAssembly(): String
  
  def get_receiverClass(): String
  
  def get_receiverName(): String
  
  def get_receiverUrl(): String
  
  def get_sequenceNumber(): Double
  
  def get_synchronization(): EventReceiverSynchronization
  
  def set_eventType(value: EventReceiverType): Unit
  
  def set_receiverAssembly(value: String): Unit
  
  def set_receiverClass(value: String): Unit
  
  def set_receiverName(value: String): Unit
  
  def set_receiverUrl(value: String): Unit
  
  def set_sequenceNumber(value: Double): Unit
  
  def set_synchronization(value: EventReceiverSynchronization): Unit
}
object EventReceiverDefinitionCreationInformation {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_eventType: CallbackTo[EventReceiverType],
    get_receiverAssembly: CallbackTo[String],
    get_receiverClass: CallbackTo[String],
    get_receiverName: CallbackTo[String],
    get_receiverUrl: CallbackTo[String],
    get_sequenceNumber: CallbackTo[Double],
    get_synchronization: CallbackTo[EventReceiverSynchronization],
    get_typeId: CallbackTo[String],
    set_eventType: EventReceiverType => Callback,
    set_receiverAssembly: String => Callback,
    set_receiverClass: String => Callback,
    set_receiverName: String => Callback,
    set_receiverUrl: String => Callback,
    set_sequenceNumber: Double => Callback,
    set_synchronization: EventReceiverSynchronization => Callback,
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): EventReceiverDefinitionCreationInformation = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_eventType = get_eventType.toJsFn, get_receiverAssembly = get_receiverAssembly.toJsFn, get_receiverClass = get_receiverClass.toJsFn, get_receiverName = get_receiverName.toJsFn, get_receiverUrl = get_receiverUrl.toJsFn, get_sequenceNumber = get_sequenceNumber.toJsFn, get_synchronization = get_synchronization.toJsFn, get_typeId = get_typeId.toJsFn, set_eventType = js.Any.fromFunction1((t0: EventReceiverType) => set_eventType(t0).runNow()), set_receiverAssembly = js.Any.fromFunction1((t0: String) => set_receiverAssembly(t0).runNow()), set_receiverClass = js.Any.fromFunction1((t0: String) => set_receiverClass(t0).runNow()), set_receiverName = js.Any.fromFunction1((t0: String) => set_receiverName(t0).runNow()), set_receiverUrl = js.Any.fromFunction1((t0: String) => set_receiverUrl(t0).runNow()), set_sequenceNumber = js.Any.fromFunction1((t0: Double) => set_sequenceNumber(t0).runNow()), set_synchronization = js.Any.fromFunction1((t0: EventReceiverSynchronization) => set_synchronization(t0).runNow()), writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[EventReceiverDefinitionCreationInformation]
  }
  
  extension [Self <: EventReceiverDefinitionCreationInformation](x: Self) {
    
    inline def setGet_eventType(value: CallbackTo[EventReceiverType]): Self = StObject.set(x, "get_eventType", value.toJsFn)
    
    inline def setGet_receiverAssembly(value: CallbackTo[String]): Self = StObject.set(x, "get_receiverAssembly", value.toJsFn)
    
    inline def setGet_receiverClass(value: CallbackTo[String]): Self = StObject.set(x, "get_receiverClass", value.toJsFn)
    
    inline def setGet_receiverName(value: CallbackTo[String]): Self = StObject.set(x, "get_receiverName", value.toJsFn)
    
    inline def setGet_receiverUrl(value: CallbackTo[String]): Self = StObject.set(x, "get_receiverUrl", value.toJsFn)
    
    inline def setGet_sequenceNumber(value: CallbackTo[Double]): Self = StObject.set(x, "get_sequenceNumber", value.toJsFn)
    
    inline def setGet_synchronization(value: CallbackTo[EventReceiverSynchronization]): Self = StObject.set(x, "get_synchronization", value.toJsFn)
    
    inline def setSet_eventType(value: EventReceiverType => Callback): Self = StObject.set(x, "set_eventType", js.Any.fromFunction1((t0: EventReceiverType) => value(t0).runNow()))
    
    inline def setSet_receiverAssembly(value: String => Callback): Self = StObject.set(x, "set_receiverAssembly", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSet_receiverClass(value: String => Callback): Self = StObject.set(x, "set_receiverClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSet_receiverName(value: String => Callback): Self = StObject.set(x, "set_receiverName", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSet_receiverUrl(value: String => Callback): Self = StObject.set(x, "set_receiverUrl", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSet_sequenceNumber(value: Double => Callback): Self = StObject.set(x, "set_sequenceNumber", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSet_synchronization(value: EventReceiverSynchronization => Callback): Self = StObject.set(x, "set_synchronization", js.Any.fromFunction1((t0: EventReceiverSynchronization) => value(t0).runNow()))
  }
}
