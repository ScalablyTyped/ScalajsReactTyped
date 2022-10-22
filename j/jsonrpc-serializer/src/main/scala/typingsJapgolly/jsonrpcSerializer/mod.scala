package typingsJapgolly.jsonrpcSerializer

import typingsJapgolly.jsonrpcSerializer.mod.err.JsonRpcError
import typingsJapgolly.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsonrpc-serializer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deserialize(msg: String): DeserializeObject_ = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(msg.asInstanceOf[js.Any]).asInstanceOf[DeserializeObject_]
  
  inline def deserializeObject(msg: PayloadObject): DeserializeObject_ = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeObject")(msg.asInstanceOf[js.Any]).asInstanceOf[DeserializeObject_]
  
  object err {
    
    @JSImport("jsonrpc-serializer", "err.InvalidParamsError")
    @js.native
    open class InvalidParamsError protected () extends JsonRpcError {
      def this(args: Any*) = this()
    }
    
    @JSImport("jsonrpc-serializer", "err.InvalidRequestError")
    @js.native
    open class InvalidRequestError protected () extends JsonRpcError {
      def this(args: Any*) = this()
    }
    
    // const ErrorCode = {
    //    JsonRpcError: -32603 as ErrorCode,
    //    ParseError: -32700 as ErrorCode,
    //    InvalidRequestError: -32600 as ErrorCode,
    //    MethodNotFoundError: -32601 as ErrorCode,
    //    InvalidParamsError: -32602 as ErrorCode
    // };
    @JSImport("jsonrpc-serializer", "err.JsonRpcError")
    @js.native
    open class JsonRpcError protected ()
      extends StObject
         with SerializerError {
      def this(msg: String, args: Any*) = this()
      
      /* CompleteClass */
      var code: Double = js.native
      @JSName("code")
      var code_JsonRpcError: Double | ErrorCode = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var message: String = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var name: String = js.native
      @JSName("name")
      var name_JsonRpcError: String | ErrorName = js.native
      
      def serialize(): String = js.native
    }
    
    @JSImport("jsonrpc-serializer", "err.MethodNotFoundError")
    @js.native
    open class MethodNotFoundError protected () extends JsonRpcError {
      def this(args: Any*) = this()
    }
    
    @JSImport("jsonrpc-serializer", "err.ParseError")
    @js.native
    open class ParseError protected () extends JsonRpcError {
      def this(args: Any*) = this()
    }
    
    // const ErrorName = {
    //    JsonRpcError: 'JsonRpcError' as ErrorName,
    //    ParseError: 'ParseError' as ErrorName,
    //    InvalidRequestError: 'InvalidRequestError' as ErrorName,
    //    MethodNotFoundError: 'MethodNotFoundError' as ErrorName,
    //    InvalidParamsError: 'InvalidParamsError' as ErrorName
    // };
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerInts.`-32603`
      - typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerInts.`-32700`
      - typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerInts.`-32600`
      - typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerInts.`-32601`
      - typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerInts.`-32602`
    */
    trait ErrorCode extends StObject
    object ErrorCode {
      
      inline def `-32600`: typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerInts.`-32600` = -32600.asInstanceOf[typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerInts.`-32600`]
      
      inline def `-32601`: typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerInts.`-32601` = -32601.asInstanceOf[typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerInts.`-32601`]
      
      inline def `-32602`: typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerInts.`-32602` = -32602.asInstanceOf[typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerInts.`-32602`]
      
      inline def `-32603`: typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerInts.`-32603` = -32603.asInstanceOf[typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerInts.`-32603`]
      
      inline def `-32700`: typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerInts.`-32700` = -32700.asInstanceOf[typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerInts.`-32700`]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerStrings.JsonRpcError
      - typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerStrings.ParseError
      - typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerStrings.InvalidRequestError
      - typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerStrings.MethodNotFoundError
      - typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerStrings.InvalidParamsError
    */
    trait ErrorName extends StObject
    object ErrorName {
      
      inline def InvalidParamsError: typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerStrings.InvalidParamsError = "InvalidParamsError".asInstanceOf[typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerStrings.InvalidParamsError]
      
      inline def InvalidRequestError: typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerStrings.InvalidRequestError = "InvalidRequestError".asInstanceOf[typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerStrings.InvalidRequestError]
      
      inline def JsonRpcError: typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerStrings.JsonRpcError = "JsonRpcError".asInstanceOf[typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerStrings.JsonRpcError]
      
      inline def MethodNotFoundError: typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerStrings.MethodNotFoundError = "MethodNotFoundError".asInstanceOf[typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerStrings.MethodNotFoundError]
      
      inline def ParseError: typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerStrings.ParseError = "ParseError".asInstanceOf[typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerStrings.ParseError]
    }
  }
  
  inline def error(id: String, error: JsonRpcError): String = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(id.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def error(id: Double, error: JsonRpcError): String = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(id.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def errorObject(id: String, error: SerializerError): PayloadObject = (^.asInstanceOf[js.Dynamic].applyDynamic("errorObject")(id.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[PayloadObject]
  inline def errorObject(id: Double, error: SerializerError): PayloadObject = (^.asInstanceOf[js.Dynamic].applyDynamic("errorObject")(id.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[PayloadObject]
  
  inline def notification(method: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("notification")(method.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def notification(method: String, params: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("notification")(method.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def notificationObject(method: String): PayloadObject = ^.asInstanceOf[js.Dynamic].applyDynamic("notificationObject")(method.asInstanceOf[js.Any]).asInstanceOf[PayloadObject]
  inline def notificationObject(method: String, params: Any): PayloadObject = (^.asInstanceOf[js.Dynamic].applyDynamic("notificationObject")(method.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[PayloadObject]
  
  inline def request(id: String, method: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(id.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def request(id: String, method: String, params: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(id.asInstanceOf[js.Any], method.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def request(id: Double, method: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(id.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def request(id: Double, method: String, params: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(id.asInstanceOf[js.Any], method.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def requestObject(id: String, method: String): PayloadObject = (^.asInstanceOf[js.Dynamic].applyDynamic("requestObject")(id.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[PayloadObject]
  inline def requestObject(id: String, method: String, params: Any): PayloadObject = (^.asInstanceOf[js.Dynamic].applyDynamic("requestObject")(id.asInstanceOf[js.Any], method.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[PayloadObject]
  inline def requestObject(id: Double, method: String): PayloadObject = (^.asInstanceOf[js.Dynamic].applyDynamic("requestObject")(id.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[PayloadObject]
  inline def requestObject(id: Double, method: String, params: Any): PayloadObject = (^.asInstanceOf[js.Dynamic].applyDynamic("requestObject")(id.asInstanceOf[js.Any], method.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[PayloadObject]
  
  inline def success(id: String, result: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("success")(id.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def success(id: Double, result: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("success")(id.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def successObject(id: String, result: Any): PayloadObject = (^.asInstanceOf[js.Dynamic].applyDynamic("successObject")(id.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[PayloadObject]
  inline def successObject(id: Double, result: Any): PayloadObject = (^.asInstanceOf[js.Dynamic].applyDynamic("successObject")(id.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[PayloadObject]
  
  trait DeserializeObject_ extends StObject {
    
    var payload: RequestPayloadObject | NotificationPayloadObject | SuccessPayloadObject | ErrorPayloadObject
    
    var `type`: PayloadType
  }
  object DeserializeObject_ {
    
    inline def apply(
      payload: RequestPayloadObject | NotificationPayloadObject | SuccessPayloadObject | ErrorPayloadObject,
      `type`: PayloadType
    ): DeserializeObject_ = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeserializeObject_]
    }
    
    extension [Self <: DeserializeObject_](x: Self) {
      
      inline def setPayload(
        value: RequestPayloadObject | NotificationPayloadObject | SuccessPayloadObject | ErrorPayloadObject
      ): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setType(value: PayloadType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ErrorPayloadObject
    extends StObject
       with PayloadObject {
    
    @JSName("error")
    var error_ErrorPayloadObject: SerializerError
    
    @JSName("id")
    var id_ErrorPayloadObject: String | Double
  }
  object ErrorPayloadObject {
    
    inline def apply(error: SerializerError, id: String | Double): ErrorPayloadObject = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorPayloadObject]
    }
    
    extension [Self <: ErrorPayloadObject](x: Self) {
      
      inline def setError(value: SerializerError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait NotificationPayloadObject
    extends StObject
       with PayloadObject {
    
    @JSName("method")
    var method_NotificationPayloadObject: String
  }
  object NotificationPayloadObject {
    
    inline def apply(method: String): NotificationPayloadObject = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotificationPayloadObject]
    }
    
    extension [Self <: NotificationPayloadObject](x: Self) {
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    }
  }
  
  trait PayloadObject extends StObject {
    
    var error: js.UndefOr[SerializerError] = js.undefined
    
    var id: js.UndefOr[String | Double] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var params: js.UndefOr[Any] = js.undefined
    
    var result: js.UndefOr[Any] = js.undefined
  }
  object PayloadObject {
    
    inline def apply(): PayloadObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PayloadObject]
    }
    
    extension [Self <: PayloadObject](x: Self) {
      
      inline def setError(value: SerializerError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setResult(value: Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerStrings.request
    - typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerStrings.notification
    - typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerStrings.success
    - typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerStrings.error
  */
  trait PayloadType extends StObject
  object PayloadType {
    
    inline def error: typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerStrings.error = "error".asInstanceOf[typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerStrings.error]
    
    inline def notification: typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerStrings.notification = "notification".asInstanceOf[typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerStrings.notification]
    
    inline def request: typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerStrings.request = "request".asInstanceOf[typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerStrings.request]
    
    inline def success: typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerStrings.success = "success".asInstanceOf[typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerStrings.success]
  }
  
  trait RequestPayloadObject
    extends StObject
       with PayloadObject {
    
    @JSName("id")
    var id_RequestPayloadObject: String
    
    @JSName("method")
    var method_RequestPayloadObject: String
  }
  object RequestPayloadObject {
    
    inline def apply(id: String, method: String): RequestPayloadObject = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestPayloadObject]
    }
    
    extension [Self <: RequestPayloadObject](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    }
  }
  
  trait SerializerError
    extends StObject
       with Error {
    
    var code: Double
    
    var data: js.UndefOr[js.Array[Any]] = js.undefined
  }
  object SerializerError {
    
    inline def apply(code: Double, message: String, name: String): SerializerError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerializerError]
    }
    
    extension [Self <: SerializerError](x: Self) {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Array[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
    }
  }
  
  trait SuccessPayloadObject
    extends StObject
       with PayloadObject {
    
    @JSName("id")
    var id_SuccessPayloadObject: String | Double
  }
  object SuccessPayloadObject {
    
    inline def apply(id: String | Double): SuccessPayloadObject = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[SuccessPayloadObject]
    }
    
    extension [Self <: SuccessPayloadObject](x: Self) {
      
      inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  type errorHandler = js.Function1[/* errors */ js.Array[String] | Null, Unit]
}
