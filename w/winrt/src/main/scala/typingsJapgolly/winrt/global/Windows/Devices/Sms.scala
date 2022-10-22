package typingsJapgolly.winrt.global.Windows.Devices

import typingsJapgolly.winrt.Windows.Devices.Sms.CellularClass
import typingsJapgolly.winrt.Windows.Devices.Sms.ISmsBinaryMessage
import typingsJapgolly.winrt.Windows.Devices.Sms.ISmsMessage
import typingsJapgolly.winrt.Windows.Devices.Sms.SmsDataFormat
import typingsJapgolly.winrt.Windows.Devices.Sms.SmsDeviceStatus
import typingsJapgolly.winrt.Windows.Devices.Sms.SmsEncodedLength
import typingsJapgolly.winrt.Windows.Devices.Sms.SmsEncoding
import typingsJapgolly.winrt.Windows.Devices.Sms.SmsMessageClass
import typingsJapgolly.winrt.Windows.Devices.Sms.SmsMessageFilter
import typingsJapgolly.winrt.Windows.Foundation.AsyncStatus
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.IAsyncAction
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperationWithProgress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Sms {
  
  @JSGlobal("Windows.Devices.Sms.CellularClass")
  @js.native
  object CellularClass extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Devices.Sms.CellularClass & Double] = js.native
    
    /* 2 */ val cdma: typingsJapgolly.winrt.Windows.Devices.Sms.CellularClass.cdma & Double = js.native
    
    /* 1 */ val gsm: typingsJapgolly.winrt.Windows.Devices.Sms.CellularClass.gsm & Double = js.native
    
    /* 0 */ val none: typingsJapgolly.winrt.Windows.Devices.Sms.CellularClass.none & Double = js.native
  }
  
  @JSGlobal("Windows.Devices.Sms.DeleteSmsMessageOperation")
  @js.native
  open class DeleteSmsMessageOperation ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Devices.Sms.DeleteSmsMessageOperation {
    
    /* CompleteClass */
    override def cancel(): Unit = js.native
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* CompleteClass */
    var errorCode: Double = js.native
    
    /* CompleteClass */
    var id: Double = js.native
    
    /* CompleteClass */
    var status: AsyncStatus = js.native
  }
  
  @JSGlobal("Windows.Devices.Sms.DeleteSmsMessagesOperation")
  @js.native
  open class DeleteSmsMessagesOperation ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Devices.Sms.DeleteSmsMessagesOperation {
    
    /* CompleteClass */
    override def cancel(): Unit = js.native
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* CompleteClass */
    var errorCode: Double = js.native
    
    /* CompleteClass */
    var id: Double = js.native
    
    /* CompleteClass */
    var status: AsyncStatus = js.native
  }
  
  @JSGlobal("Windows.Devices.Sms.GetSmsDeviceOperation")
  @js.native
  open class GetSmsDeviceOperation ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Devices.Sms.GetSmsDeviceOperation {
    
    /* InferMemberOverrides */
    override def cancel(): Unit = js.native
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* CompleteClass */
    var errorCode: Double = js.native
    
    /* CompleteClass */
    var id: Double = js.native
    
    /* CompleteClass */
    var status: AsyncStatus = js.native
  }
  
  @JSGlobal("Windows.Devices.Sms.GetSmsMessageOperation")
  @js.native
  open class GetSmsMessageOperation ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Devices.Sms.GetSmsMessageOperation {
    
    /* InferMemberOverrides */
    override def cancel(): Unit = js.native
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* CompleteClass */
    var errorCode: Double = js.native
    
    /* CompleteClass */
    var id: Double = js.native
    
    /* CompleteClass */
    var status: AsyncStatus = js.native
  }
  
  @JSGlobal("Windows.Devices.Sms.GetSmsMessagesOperation")
  @js.native
  open class GetSmsMessagesOperation ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Devices.Sms.GetSmsMessagesOperation {
    
    /* InferMemberOverrides */
    override def cancel(): Unit = js.native
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* CompleteClass */
    var errorCode: Double = js.native
    
    /* CompleteClass */
    var id: Double = js.native
    
    /* CompleteClass */
    var status: AsyncStatus = js.native
  }
  
  @JSGlobal("Windows.Devices.Sms.SendSmsMessageOperation")
  @js.native
  open class SendSmsMessageOperation ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Devices.Sms.SendSmsMessageOperation {
    
    /* CompleteClass */
    override def cancel(): Unit = js.native
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* CompleteClass */
    var errorCode: Double = js.native
    
    /* CompleteClass */
    var id: Double = js.native
    
    /* CompleteClass */
    var status: AsyncStatus = js.native
  }
  
  @JSGlobal("Windows.Devices.Sms.SmsBinaryMessage")
  @js.native
  open class SmsBinaryMessage ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Devices.Sms.SmsBinaryMessage {
    
    /* CompleteClass */
    var format: SmsDataFormat = js.native
    
    /* CompleteClass */
    override def getData(): js.typedarray.Uint8Array = js.native
    
    /* CompleteClass */
    var id: Double = js.native
    
    /* CompleteClass */
    var messageClass: SmsMessageClass = js.native
    
    /* CompleteClass */
    override def setData(value: js.typedarray.Uint8Array): Unit = js.native
  }
  
  @JSGlobal("Windows.Devices.Sms.SmsDataFormat")
  @js.native
  object SmsDataFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Devices.Sms.SmsDataFormat & Double] = js.native
    
    /* 3 */ val cdmaDeliver: typingsJapgolly.winrt.Windows.Devices.Sms.SmsDataFormat.cdmaDeliver & Double = js.native
    
    /* 1 */ val cdmaSubmit: typingsJapgolly.winrt.Windows.Devices.Sms.SmsDataFormat.cdmaSubmit & Double = js.native
    
    /* 4 */ val gsmDeliver: typingsJapgolly.winrt.Windows.Devices.Sms.SmsDataFormat.gsmDeliver & Double = js.native
    
    /* 2 */ val gsmSubmit: typingsJapgolly.winrt.Windows.Devices.Sms.SmsDataFormat.gsmSubmit & Double = js.native
    
    /* 0 */ val unknown: typingsJapgolly.winrt.Windows.Devices.Sms.SmsDataFormat.unknown & Double = js.native
  }
  
  @JSGlobal("Windows.Devices.Sms.SmsDevice")
  @js.native
  open class SmsDevice ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Devices.Sms.SmsDevice {
    
    /* CompleteClass */
    var accountPhoneNumber: String = js.native
    
    /* CompleteClass */
    override def calculateLength(message: typingsJapgolly.winrt.Windows.Devices.Sms.SmsTextMessage): SmsEncodedLength = js.native
    
    /* CompleteClass */
    var cellularClass: CellularClass = js.native
    
    /* CompleteClass */
    var deviceStatus: SmsDeviceStatus = js.native
    
    /* CompleteClass */
    var messageStore: typingsJapgolly.winrt.Windows.Devices.Sms.SmsDeviceMessageStore = js.native
    
    /* CompleteClass */
    var onsmsdevicestatuschanged: Any = js.native
    
    /* CompleteClass */
    var onsmsmessagereceived: Any = js.native
    
    /* CompleteClass */
    override def sendMessageAsync(message: ISmsMessage): typingsJapgolly.winrt.Windows.Devices.Sms.SendSmsMessageOperation = js.native
  }
  /* static members */
  object SmsDevice {
    
    @JSGlobal("Windows.Devices.Sms.SmsDevice")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromIdAsync(deviceInstanceId: String): IAsyncOperation[typingsJapgolly.winrt.Windows.Devices.Sms.SmsDevice] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIdAsync")(deviceInstanceId.asInstanceOf[js.Any]).asInstanceOf[IAsyncOperation[typingsJapgolly.winrt.Windows.Devices.Sms.SmsDevice]]
    
    inline def getDefaultAsync(): IAsyncOperation[typingsJapgolly.winrt.Windows.Devices.Sms.SmsDevice] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultAsync")().asInstanceOf[IAsyncOperation[typingsJapgolly.winrt.Windows.Devices.Sms.SmsDevice]]
    
    inline def getDeviceSelector(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceSelector")().asInstanceOf[String]
  }
  
  @JSGlobal("Windows.Devices.Sms.SmsDeviceMessageStore")
  @js.native
  open class SmsDeviceMessageStore ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Devices.Sms.SmsDeviceMessageStore {
    
    /* CompleteClass */
    override def deleteMessageAsync(messageId: Double): IAsyncAction = js.native
    
    /* CompleteClass */
    override def deleteMessagesAsync(messageFilter: SmsMessageFilter): IAsyncAction = js.native
    
    /* CompleteClass */
    override def getMessageAsync(messageId: Double): IAsyncOperation[ISmsMessage] = js.native
    
    /* CompleteClass */
    override def getMessagesAsync(messageFilter: SmsMessageFilter): IAsyncOperationWithProgress[IVectorView[ISmsMessage], Double] = js.native
    
    /* CompleteClass */
    var maxMessages: Double = js.native
  }
  
  @JSGlobal("Windows.Devices.Sms.SmsDeviceStatus")
  @js.native
  object SmsDeviceStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Devices.Sms.SmsDeviceStatus & Double] = js.native
    
    /* 3 */ val badSim: typingsJapgolly.winrt.Windows.Devices.Sms.SmsDeviceStatus.badSim & Double = js.native
    
    /* 7 */ val deviceBlocked: typingsJapgolly.winrt.Windows.Devices.Sms.SmsDeviceStatus.deviceBlocked & Double = js.native
    
    /* 4 */ val deviceFailure: typingsJapgolly.winrt.Windows.Devices.Sms.SmsDeviceStatus.deviceFailure & Double = js.native
    
    /* 6 */ val deviceLocked: typingsJapgolly.winrt.Windows.Devices.Sms.SmsDeviceStatus.deviceLocked & Double = js.native
    
    /* 0 */ val off: typingsJapgolly.winrt.Windows.Devices.Sms.SmsDeviceStatus.off & Double = js.native
    
    /* 1 */ val ready: typingsJapgolly.winrt.Windows.Devices.Sms.SmsDeviceStatus.ready & Double = js.native
    
    /* 2 */ val simNotInserted: typingsJapgolly.winrt.Windows.Devices.Sms.SmsDeviceStatus.simNotInserted & Double = js.native
    
    /* 5 */ val subscriptionNotActivated: typingsJapgolly.winrt.Windows.Devices.Sms.SmsDeviceStatus.subscriptionNotActivated & Double = js.native
  }
  
  @JSGlobal("Windows.Devices.Sms.SmsEncoding")
  @js.native
  object SmsEncoding extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Devices.Sms.SmsEncoding & Double] = js.native
    
    /* 4 */ val gsmSevenBit: typingsJapgolly.winrt.Windows.Devices.Sms.SmsEncoding.gsmSevenBit & Double = js.native
    
    /* 1 */ val optimal: typingsJapgolly.winrt.Windows.Devices.Sms.SmsEncoding.optimal & Double = js.native
    
    /* 2 */ val sevenBitAscii: typingsJapgolly.winrt.Windows.Devices.Sms.SmsEncoding.sevenBitAscii & Double = js.native
    
    /* 3 */ val unicode: typingsJapgolly.winrt.Windows.Devices.Sms.SmsEncoding.unicode & Double = js.native
    
    /* 0 */ val unknown: typingsJapgolly.winrt.Windows.Devices.Sms.SmsEncoding.unknown & Double = js.native
  }
  
  @JSGlobal("Windows.Devices.Sms.SmsMessageClass")
  @js.native
  object SmsMessageClass extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Devices.Sms.SmsMessageClass & Double] = js.native
    
    /* 1 */ val class0: typingsJapgolly.winrt.Windows.Devices.Sms.SmsMessageClass.class0 & Double = js.native
    
    /* 2 */ val class1: typingsJapgolly.winrt.Windows.Devices.Sms.SmsMessageClass.class1 & Double = js.native
    
    /* 3 */ val class2: typingsJapgolly.winrt.Windows.Devices.Sms.SmsMessageClass.class2 & Double = js.native
    
    /* 4 */ val class3: typingsJapgolly.winrt.Windows.Devices.Sms.SmsMessageClass.class3 & Double = js.native
    
    /* 0 */ val none: typingsJapgolly.winrt.Windows.Devices.Sms.SmsMessageClass.none & Double = js.native
  }
  
  @JSGlobal("Windows.Devices.Sms.SmsMessageFilter")
  @js.native
  object SmsMessageFilter extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Devices.Sms.SmsMessageFilter & Double] = js.native
    
    /* 0 */ val all: typingsJapgolly.winrt.Windows.Devices.Sms.SmsMessageFilter.all & Double = js.native
    
    /* 4 */ val draft: typingsJapgolly.winrt.Windows.Devices.Sms.SmsMessageFilter.draft & Double = js.native
    
    /* 2 */ val read: typingsJapgolly.winrt.Windows.Devices.Sms.SmsMessageFilter.read & Double = js.native
    
    /* 3 */ val sent: typingsJapgolly.winrt.Windows.Devices.Sms.SmsMessageFilter.sent & Double = js.native
    
    /* 1 */ val unread: typingsJapgolly.winrt.Windows.Devices.Sms.SmsMessageFilter.unread & Double = js.native
  }
  
  @JSGlobal("Windows.Devices.Sms.SmsMessageReceivedEventArgs")
  @js.native
  open class SmsMessageReceivedEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Devices.Sms.SmsMessageReceivedEventArgs {
    
    /* CompleteClass */
    var binaryMessage: typingsJapgolly.winrt.Windows.Devices.Sms.SmsBinaryMessage = js.native
    
    /* CompleteClass */
    var textMessage: typingsJapgolly.winrt.Windows.Devices.Sms.SmsTextMessage = js.native
  }
  
  @JSGlobal("Windows.Devices.Sms.SmsMessageType")
  @js.native
  object SmsMessageType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Devices.Sms.SmsMessageType & Double] = js.native
    
    /* 0 */ val binary: typingsJapgolly.winrt.Windows.Devices.Sms.SmsMessageType.binary & Double = js.native
    
    /* 1 */ val text: typingsJapgolly.winrt.Windows.Devices.Sms.SmsMessageType.text & Double = js.native
  }
  
  @JSGlobal("Windows.Devices.Sms.SmsReceivedEventDetails")
  @js.native
  open class SmsReceivedEventDetails ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Devices.Sms.SmsReceivedEventDetails {
    
    /* CompleteClass */
    var deviceId: String = js.native
    
    /* CompleteClass */
    var messageIndex: Double = js.native
  }
  
  @JSGlobal("Windows.Devices.Sms.SmsTextMessage")
  @js.native
  open class SmsTextMessage ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Devices.Sms.SmsTextMessage {
    
    /* CompleteClass */
    var body: String = js.native
    
    /* CompleteClass */
    var encoding: SmsEncoding = js.native
    
    /* CompleteClass */
    var from: String = js.native
    
    /* CompleteClass */
    var id: Double = js.native
    
    /* CompleteClass */
    var messageClass: SmsMessageClass = js.native
    
    /* CompleteClass */
    var partCount: Double = js.native
    
    /* CompleteClass */
    var partNumber: Double = js.native
    
    /* CompleteClass */
    var partReferenceId: Double = js.native
    
    /* CompleteClass */
    var timestamp: js.Date = js.native
    
    /* CompleteClass */
    var to: String = js.native
    
    /* CompleteClass */
    override def toBinaryMessages(format: SmsDataFormat): IVectorView[ISmsBinaryMessage] = js.native
  }
  /* static members */
  object SmsTextMessage {
    
    @JSGlobal("Windows.Devices.Sms.SmsTextMessage")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromBinaryData(format: SmsDataFormat, value: js.typedarray.Uint8Array): typingsJapgolly.winrt.Windows.Devices.Sms.SmsTextMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinaryData")(format.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.winrt.Windows.Devices.Sms.SmsTextMessage]
    
    inline def fromBinaryMessage(binaryMessage: typingsJapgolly.winrt.Windows.Devices.Sms.SmsBinaryMessage): typingsJapgolly.winrt.Windows.Devices.Sms.SmsTextMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinaryMessage")(binaryMessage.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winrt.Windows.Devices.Sms.SmsTextMessage]
  }
}
