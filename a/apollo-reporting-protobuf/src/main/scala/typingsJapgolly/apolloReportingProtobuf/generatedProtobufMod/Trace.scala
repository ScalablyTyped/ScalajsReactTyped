package typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.apolloProtobufjs.mod.IConversionOptions
import typingsJapgolly.apolloProtobufjs.mod.Reader
import typingsJapgolly.apolloProtobufjs.mod.Writer
import typingsJapgolly.apolloReportingProtobuf.apolloReportingProtobufStrings.fetch
import typingsJapgolly.apolloReportingProtobuf.apolloReportingProtobufStrings.fieldName
import typingsJapgolly.apolloReportingProtobuf.apolloReportingProtobufStrings.flatten
import typingsJapgolly.apolloReportingProtobuf.apolloReportingProtobufStrings.index
import typingsJapgolly.apolloReportingProtobuf.apolloReportingProtobufStrings.parallel
import typingsJapgolly.apolloReportingProtobuf.apolloReportingProtobufStrings.responseName
import typingsJapgolly.apolloReportingProtobuf.apolloReportingProtobufStrings.sequence
import typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.Trace.CachePolicy.Scope
import typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.Trace.HTTP.IValues
import typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.Trace.HTTP.Method
import typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.Trace.QueryPlanNode.IFetchNode
import typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.Trace.QueryPlanNode.IFlattenNode
import typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.Trace.QueryPlanNode.IParallelNode
import typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.Trace.QueryPlanNode.ISequenceNode
import typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.google.protobuf.ITimestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-reporting-protobuf/generated/protobuf", "Trace")
@js.native
/**
  * Constructs a new Trace.
  * @param [properties] Properties to set
  */
open class Trace ()
  extends StObject
     with ITrace {
  def this(properties: ITrace) = this()
  
  /** Trace clientName. */
  @JSName("clientName")
  var clientName_Trace: String = js.native
  
  /** Trace clientVersion. */
  @JSName("clientVersion")
  var clientVersion_Trace: String = js.native
  
  /** Trace durationNs. */
  @JSName("durationNs")
  var durationNs_Trace: Double = js.native
  
  /** Trace fieldExecutionWeight. */
  @JSName("fieldExecutionWeight")
  var fieldExecutionWeight_Trace: Double = js.native
  
  /** Trace forbiddenOperation. */
  @JSName("forbiddenOperation")
  var forbiddenOperation_Trace: Boolean = js.native
  
  /** Trace fullQueryCacheHit. */
  @JSName("fullQueryCacheHit")
  var fullQueryCacheHit_Trace: Boolean = js.native
  
  /** Trace persistedQueryHit. */
  @JSName("persistedQueryHit")
  var persistedQueryHit_Trace: Boolean = js.native
  
  /** Trace persistedQueryRegister. */
  @JSName("persistedQueryRegister")
  var persistedQueryRegister_Trace: Boolean = js.native
  
  /** Trace registeredOperation. */
  @JSName("registeredOperation")
  var registeredOperation_Trace: Boolean = js.native
  
  /** Trace signature. */
  @JSName("signature")
  var signature_Trace: String = js.native
  
  /**
    * Converts this Trace to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
  
  /** Trace unexecutedOperationBody. */
  @JSName("unexecutedOperationBody")
  var unexecutedOperationBody_Trace: String = js.native
  
  /** Trace unexecutedOperationName. */
  @JSName("unexecutedOperationName")
  var unexecutedOperationName_Trace: String = js.native
}
/* static members */
object Trace {
  
  @JSImport("apollo-reporting-protobuf/generated/protobuf", "Trace")
  @js.native
  val ^ : js.Any = js.native
  
  /** Represents a CachePolicy. */
  @JSImport("apollo-reporting-protobuf/generated/protobuf", "Trace.CachePolicy")
  @js.native
  /**
    * Constructs a new CachePolicy.
    * @param [properties] Properties to set
    */
  open class CachePolicy ()
    extends StObject
       with ICachePolicy {
    def this(properties: ICachePolicy) = this()
    
    /** CachePolicy maxAgeNs. */
    @JSName("maxAgeNs")
    var maxAgeNs_CachePolicy: Double = js.native
    
    /** CachePolicy scope. */
    @JSName("scope")
    var scope_CachePolicy: Scope = js.native
    
    /**
      * Converts this CachePolicy to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object CachePolicy {
    
    @JSImport("apollo-reporting-protobuf/generated/protobuf", "Trace.CachePolicy")
    @js.native
    val ^ : js.Any = js.native
    
    @js.native
    sealed trait Scope extends StObject
    /** Scope enum. */
    @JSImport("apollo-reporting-protobuf/generated/protobuf", "Trace.CachePolicy.Scope")
    @js.native
    object Scope extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[Scope & Double] = js.native
      
      @js.native
      sealed trait PRIVATE
        extends StObject
           with Scope
      /* 2 */ val PRIVATE: typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.Trace.CachePolicy.Scope.PRIVATE & Double = js.native
      
      @js.native
      sealed trait PUBLIC
        extends StObject
           with Scope
      /* 1 */ val PUBLIC: typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.Trace.CachePolicy.Scope.PUBLIC & Double = js.native
      
      @js.native
      sealed trait UNKNOWN
        extends StObject
           with Scope
      /* 0 */ val UNKNOWN: typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.Trace.CachePolicy.Scope.UNKNOWN & Double = js.native
    }
    
    /**
      * Creates a new CachePolicy instance using the specified properties.
      * @param [properties] Properties to set
      * @returns CachePolicy instance
      */
    /* static member */
    inline def create(): CachePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[CachePolicy]
    inline def create(properties: ICachePolicy): CachePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[CachePolicy]
    
    inline def decode(reader: js.typedarray.Uint8Array): CachePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CachePolicy]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): CachePolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CachePolicy]
    /**
      * Decodes a CachePolicy message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns CachePolicy
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): CachePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[CachePolicy]
    inline def decode(reader: Reader, length: Double): CachePolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[CachePolicy]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): CachePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CachePolicy]
    /**
      * Decodes a CachePolicy message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns CachePolicy
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): CachePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[CachePolicy]
    
    /**
      * Encodes the specified CachePolicy message. Does not implicitly {@link Trace.CachePolicy.verify|verify} messages.
      * @param message CachePolicy message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: ICachePolicy): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: ICachePolicy, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified CachePolicy message, length delimited. Does not implicitly {@link Trace.CachePolicy.verify|verify} messages.
      * @param message CachePolicy message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: ICachePolicy): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: ICachePolicy, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a plain object from a CachePolicy message. Also converts values to other types if specified.
      * @param message CachePolicy
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: CachePolicy): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: CachePolicy, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a CachePolicy message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a Details. */
  @JSImport("apollo-reporting-protobuf/generated/protobuf", "Trace.Details")
  @js.native
  /**
    * Constructs a new Details.
    * @param [properties] Properties to set
    */
  open class Details ()
    extends StObject
       with IDetails {
    def this(properties: IDetails) = this()
    
    /** Details operationName. */
    @JSName("operationName")
    var operationName_Details: String = js.native
    
    /**
      * Converts this Details to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
    
    /** Details variablesJson. */
    @JSName("variablesJson")
    var variablesJson_Details: StringDictionary[String] = js.native
  }
  object Details {
    
    @JSImport("apollo-reporting-protobuf/generated/protobuf", "Trace.Details")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Details instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Details instance
      */
    /* static member */
    inline def create(): Details = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Details]
    inline def create(properties: IDetails): Details = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Details]
    
    inline def decode(reader: js.typedarray.Uint8Array): Details = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Details]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): Details = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Details]
    /**
      * Decodes a Details message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Details
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): Details = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Details]
    inline def decode(reader: Reader, length: Double): Details = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Details]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): Details = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Details]
    /**
      * Decodes a Details message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Details
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): Details = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Details]
    
    /**
      * Encodes the specified Details message. Does not implicitly {@link Trace.Details.verify|verify} messages.
      * @param message Details message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IDetails): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IDetails, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified Details message, length delimited. Does not implicitly {@link Trace.Details.verify|verify} messages.
      * @param message Details message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IDetails): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IDetails, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a plain object from a Details message. Also converts values to other types if specified.
      * @param message Details
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: Details): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: Details, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a Details message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents an Error. */
  @JSImport("apollo-reporting-protobuf/generated/protobuf", "Trace.Error")
  @js.native
  /**
    * Constructs a new Error.
    * @param [properties] Properties to set
    */
  open class Error ()
    extends StObject
       with IError {
    def this(properties: IError) = this()
    
    /** Error json. */
    @JSName("json")
    var json_Error: String = js.native
    
    /** Error location. */
    @JSName("location")
    var location_Error: js.Array[ILocation] = js.native
    
    /** Error message. */
    @JSName("message")
    var message_Error: String = js.native
    
    /** Error timeNs. */
    @JSName("timeNs")
    var timeNs_Error: Double = js.native
    
    /**
      * Converts this Error to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object Error {
    
    @JSImport("apollo-reporting-protobuf/generated/protobuf", "Trace.Error")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Error instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Error instance
      */
    /* static member */
    inline def create(): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Error]
    inline def create(properties: IError): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Error]
    
    inline def decode(reader: js.typedarray.Uint8Array): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Error]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): Error = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Error]
    /**
      * Decodes an Error message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Error
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Error]
    inline def decode(reader: Reader, length: Double): Error = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Error]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Error]
    /**
      * Decodes an Error message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Error
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Error]
    
    /**
      * Encodes the specified Error message. Does not implicitly {@link Trace.Error.verify|verify} messages.
      * @param message Error message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IError): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IError, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified Error message, length delimited. Does not implicitly {@link Trace.Error.verify|verify} messages.
      * @param message Error message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IError): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IError, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a plain object from an Error message. Also converts values to other types if specified.
      * @param message Error
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: Error): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: Error, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies an Error message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a HTTP. */
  @JSImport("apollo-reporting-protobuf/generated/protobuf", "Trace.HTTP")
  @js.native
  /**
    * Constructs a new HTTP.
    * @param [properties] Properties to set
    */
  open class HTTP ()
    extends StObject
       with IHTTP {
    def this(properties: IHTTP) = this()
    
    /** HTTP host. */
    @JSName("host")
    var host_HTTP: String = js.native
    
    /** HTTP method. */
    @JSName("method")
    var method_HTTP: Method = js.native
    
    /** HTTP path. */
    @JSName("path")
    var path_HTTP: String = js.native
    
    /** HTTP protocol. */
    @JSName("protocol")
    var protocol_HTTP: String = js.native
    
    /** HTTP requestHeaders. */
    @JSName("requestHeaders")
    var requestHeaders_HTTP: StringDictionary[IValues] = js.native
    
    /** HTTP responseHeaders. */
    @JSName("responseHeaders")
    var responseHeaders_HTTP: StringDictionary[IValues] = js.native
    
    /** HTTP secure. */
    @JSName("secure")
    var secure_HTTP: Boolean = js.native
    
    /** HTTP statusCode. */
    @JSName("statusCode")
    var statusCode_HTTP: Double = js.native
    
    /**
      * Converts this HTTP to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object HTTP {
    
    @JSImport("apollo-reporting-protobuf/generated/protobuf", "Trace.HTTP")
    @js.native
    val ^ : js.Any = js.native
    
    @js.native
    sealed trait Method extends StObject
    /** Method enum. */
    @JSImport("apollo-reporting-protobuf/generated/protobuf", "Trace.HTTP.Method")
    @js.native
    object Method extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[Method & Double] = js.native
      
      @js.native
      sealed trait CONNECT
        extends StObject
           with Method
      /* 8 */ val CONNECT: typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.Trace.HTTP.Method.CONNECT & Double = js.native
      
      @js.native
      sealed trait DELETE
        extends StObject
           with Method
      /* 6 */ val DELETE: typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.Trace.HTTP.Method.DELETE & Double = js.native
      
      @js.native
      sealed trait GET
        extends StObject
           with Method
      /* 2 */ val GET: typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.Trace.HTTP.Method.GET & Double = js.native
      
      @js.native
      sealed trait HEAD
        extends StObject
           with Method
      /* 3 */ val HEAD: typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.Trace.HTTP.Method.HEAD & Double = js.native
      
      @js.native
      sealed trait OPTIONS
        extends StObject
           with Method
      /* 1 */ val OPTIONS: typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.Trace.HTTP.Method.OPTIONS & Double = js.native
      
      @js.native
      sealed trait PATCH
        extends StObject
           with Method
      /* 9 */ val PATCH: typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.Trace.HTTP.Method.PATCH & Double = js.native
      
      @js.native
      sealed trait POST
        extends StObject
           with Method
      /* 4 */ val POST: typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.Trace.HTTP.Method.POST & Double = js.native
      
      @js.native
      sealed trait PUT
        extends StObject
           with Method
      /* 5 */ val PUT: typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.Trace.HTTP.Method.PUT & Double = js.native
      
      @js.native
      sealed trait TRACE
        extends StObject
           with Method
      /* 7 */ val TRACE: typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.Trace.HTTP.Method.TRACE & Double = js.native
      
      @js.native
      sealed trait UNKNOWN
        extends StObject
           with Method
      /* 0 */ val UNKNOWN: typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.Trace.HTTP.Method.UNKNOWN & Double = js.native
    }
    
    /** Represents a Values. */
    @JSImport("apollo-reporting-protobuf/generated/protobuf", "Trace.HTTP.Values")
    @js.native
    /**
      * Constructs a new Values.
      * @param [properties] Properties to set
      */
    open class Values ()
      extends StObject
         with IValues {
      def this(properties: IValues) = this()
      
      /**
        * Converts this Values to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[Any] = js.native
      
      /** Values value. */
      @JSName("value")
      var value_Values: js.Array[String] = js.native
    }
    object Values {
      
      @JSImport("apollo-reporting-protobuf/generated/protobuf", "Trace.HTTP.Values")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new Values instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Values instance
        */
      /* static member */
      inline def create(): Values = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Values]
      inline def create(properties: IValues): Values = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Values]
      
      inline def decode(reader: js.typedarray.Uint8Array): Values = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Values]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): Values = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Values]
      /**
        * Decodes a Values message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Values
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): Values = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Values]
      inline def decode(reader: Reader, length: Double): Values = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Values]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): Values = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Values]
      /**
        * Decodes a Values message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Values
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): Values = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Values]
      
      /**
        * Encodes the specified Values message. Does not implicitly {@link Trace.HTTP.Values.verify|verify} messages.
        * @param message Values message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: IValues): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: IValues, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified Values message, length delimited. Does not implicitly {@link Trace.HTTP.Values.verify|verify} messages.
        * @param message Values message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: IValues): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: IValues, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a plain object from a Values message. Also converts values to other types if specified.
        * @param message Values
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: Values): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(message: Values, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a Values message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /**
      * Creates a new HTTP instance using the specified properties.
      * @param [properties] Properties to set
      * @returns HTTP instance
      */
    /* static member */
    inline def create(): HTTP = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[HTTP]
    inline def create(properties: IHTTP): HTTP = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[HTTP]
    
    inline def decode(reader: js.typedarray.Uint8Array): HTTP = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[HTTP]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): HTTP = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[HTTP]
    /**
      * Decodes a HTTP message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns HTTP
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): HTTP = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[HTTP]
    inline def decode(reader: Reader, length: Double): HTTP = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[HTTP]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): HTTP = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[HTTP]
    /**
      * Decodes a HTTP message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns HTTP
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): HTTP = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[HTTP]
    
    /**
      * Encodes the specified HTTP message. Does not implicitly {@link Trace.HTTP.verify|verify} messages.
      * @param message HTTP message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IHTTP): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IHTTP, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified HTTP message, length delimited. Does not implicitly {@link Trace.HTTP.verify|verify} messages.
      * @param message HTTP message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IHTTP): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IHTTP, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a plain object from a HTTP message. Also converts values to other types if specified.
      * @param message HTTP
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: HTTP): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: HTTP, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a HTTP message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    
    /** Properties of a Values. */
    trait IValues extends StObject {
      
      /** Values value */
      var value: js.UndefOr[js.Array[String] | Null] = js.undefined
    }
    object IValues {
      
      inline def apply(): IValues = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IValues]
      }
      
      extension [Self <: IValues](x: Self) {
        
        inline def setValue(value: js.Array[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueNull: Self = StObject.set(x, "value", null)
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
        
        inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
      }
    }
  }
  
  /** Represents a Location. */
  @JSImport("apollo-reporting-protobuf/generated/protobuf", "Trace.Location")
  @js.native
  /**
    * Constructs a new Location.
    * @param [properties] Properties to set
    */
  open class Location ()
    extends StObject
       with ILocation {
    def this(properties: ILocation) = this()
    
    /** Location column. */
    @JSName("column")
    var column_Location: Double = js.native
    
    /** Location line. */
    @JSName("line")
    var line_Location: Double = js.native
    
    /**
      * Converts this Location to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object Location {
    
    @JSImport("apollo-reporting-protobuf/generated/protobuf", "Trace.Location")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Location instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Location instance
      */
    /* static member */
    inline def create(): Location = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Location]
    inline def create(properties: ILocation): Location = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Location]
    
    inline def decode(reader: js.typedarray.Uint8Array): Location = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Location]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): Location = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Location]
    /**
      * Decodes a Location message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Location
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): Location = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Location]
    inline def decode(reader: Reader, length: Double): Location = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Location]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): Location = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Location]
    /**
      * Decodes a Location message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Location
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): Location = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Location]
    
    /**
      * Encodes the specified Location message. Does not implicitly {@link Trace.Location.verify|verify} messages.
      * @param message Location message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: ILocation): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: ILocation, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified Location message, length delimited. Does not implicitly {@link Trace.Location.verify|verify} messages.
      * @param message Location message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: ILocation): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: ILocation, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a plain object from a Location message. Also converts values to other types if specified.
      * @param message Location
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: Location): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: Location, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a Location message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a Node. */
  @JSImport("apollo-reporting-protobuf/generated/protobuf", "Trace.Node")
  @js.native
  /**
    * Constructs a new Node.
    * @param [properties] Properties to set
    */
  open class Node ()
    extends StObject
       with INode {
    def this(properties: INode) = this()
    
    /** Node child. */
    @JSName("child")
    var child_Node: js.Array[INode] = js.native
    
    /** Node endTime. */
    @JSName("endTime")
    var endTime_Node: Double = js.native
    
    /** Node error. */
    @JSName("error")
    var error_Node: js.Array[IError] = js.native
    
    /** Node id. */
    var id: js.UndefOr[responseName | index] = js.native
    
    /** Node index. */
    @JSName("index")
    var index_Node: Double = js.native
    
    /** Node originalFieldName. */
    @JSName("originalFieldName")
    var originalFieldName_Node: String = js.native
    
    /** Node parentType. */
    @JSName("parentType")
    var parentType_Node: String = js.native
    
    /** Node responseName. */
    @JSName("responseName")
    var responseName_Node: String = js.native
    
    /** Node startTime. */
    @JSName("startTime")
    var startTime_Node: Double = js.native
    
    /**
      * Converts this Node to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
    
    /** Node type. */
    @JSName("type")
    var type_Node: String = js.native
  }
  object Node {
    
    @JSImport("apollo-reporting-protobuf/generated/protobuf", "Trace.Node")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Node instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Node instance
      */
    /* static member */
    inline def create(): Node = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Node]
    inline def create(properties: INode): Node = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Node]
    
    inline def decode(reader: js.typedarray.Uint8Array): Node = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Node]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Node]
    /**
      * Decodes a Node message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Node
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): Node = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Node]
    inline def decode(reader: Reader, length: Double): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Node]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): Node = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Node]
    /**
      * Decodes a Node message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Node
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): Node = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Node]
    
    /**
      * Encodes the specified Node message. Does not implicitly {@link Trace.Node.verify|verify} messages.
      * @param message Node message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: INode): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: INode, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified Node message, length delimited. Does not implicitly {@link Trace.Node.verify|verify} messages.
      * @param message Node message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: INode): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: INode, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a plain object from a Node message. Also converts values to other types if specified.
      * @param message Node
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: Node): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: Node, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a Node message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a QueryPlanNode. */
  @JSImport("apollo-reporting-protobuf/generated/protobuf", "Trace.QueryPlanNode")
  @js.native
  /**
    * Constructs a new QueryPlanNode.
    * @param [properties] Properties to set
    */
  open class QueryPlanNode ()
    extends StObject
       with IQueryPlanNode {
    def this(properties: IQueryPlanNode) = this()
    
    /** QueryPlanNode node. */
    var node: js.UndefOr[sequence | parallel | fetch | flatten] = js.native
    
    /**
      * Converts this QueryPlanNode to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object QueryPlanNode {
    
    @JSImport("apollo-reporting-protobuf/generated/protobuf", "Trace.QueryPlanNode")
    @js.native
    val ^ : js.Any = js.native
    
    /** Represents a FetchNode. */
    @JSImport("apollo-reporting-protobuf/generated/protobuf", "Trace.QueryPlanNode.FetchNode")
    @js.native
    /**
      * Constructs a new FetchNode.
      * @param [properties] Properties to set
      */
    open class FetchNode ()
      extends StObject
         with IFetchNode {
      def this(properties: IFetchNode) = this()
      
      /** FetchNode sentTimeOffset. */
      @JSName("sentTimeOffset")
      var sentTimeOffset_FetchNode: Double = js.native
      
      /** FetchNode serviceName. */
      @JSName("serviceName")
      var serviceName_FetchNode: String = js.native
      
      /**
        * Converts this FetchNode to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[Any] = js.native
      
      /** FetchNode traceParsingFailed. */
      @JSName("traceParsingFailed")
      var traceParsingFailed_FetchNode: Boolean = js.native
    }
    object FetchNode {
      
      @JSImport("apollo-reporting-protobuf/generated/protobuf", "Trace.QueryPlanNode.FetchNode")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new FetchNode instance using the specified properties.
        * @param [properties] Properties to set
        * @returns FetchNode instance
        */
      /* static member */
      inline def create(): FetchNode = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[FetchNode]
      inline def create(properties: IFetchNode): FetchNode = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[FetchNode]
      
      inline def decode(reader: js.typedarray.Uint8Array): FetchNode = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[FetchNode]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): FetchNode = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[FetchNode]
      /**
        * Decodes a FetchNode message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns FetchNode
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): FetchNode = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[FetchNode]
      inline def decode(reader: Reader, length: Double): FetchNode = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[FetchNode]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): FetchNode = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[FetchNode]
      /**
        * Decodes a FetchNode message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns FetchNode
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): FetchNode = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[FetchNode]
      
      /**
        * Encodes the specified FetchNode message. Does not implicitly {@link Trace.QueryPlanNode.FetchNode.verify|verify} messages.
        * @param message FetchNode message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: IFetchNode): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: IFetchNode, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified FetchNode message, length delimited. Does not implicitly {@link Trace.QueryPlanNode.FetchNode.verify|verify} messages.
        * @param message FetchNode message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: IFetchNode): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: IFetchNode, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a plain object from a FetchNode message. Also converts values to other types if specified.
        * @param message FetchNode
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: FetchNode): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(message: FetchNode, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a FetchNode message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a FlattenNode. */
    @JSImport("apollo-reporting-protobuf/generated/protobuf", "Trace.QueryPlanNode.FlattenNode")
    @js.native
    /**
      * Constructs a new FlattenNode.
      * @param [properties] Properties to set
      */
    open class FlattenNode ()
      extends StObject
         with IFlattenNode {
      def this(properties: IFlattenNode) = this()
      
      /** FlattenNode responsePath. */
      @JSName("responsePath")
      var responsePath_FlattenNode: js.Array[IResponsePathElement] = js.native
      
      /**
        * Converts this FlattenNode to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[Any] = js.native
    }
    object FlattenNode {
      
      @JSImport("apollo-reporting-protobuf/generated/protobuf", "Trace.QueryPlanNode.FlattenNode")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new FlattenNode instance using the specified properties.
        * @param [properties] Properties to set
        * @returns FlattenNode instance
        */
      /* static member */
      inline def create(): FlattenNode = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[FlattenNode]
      inline def create(properties: IFlattenNode): FlattenNode = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[FlattenNode]
      
      inline def decode(reader: js.typedarray.Uint8Array): FlattenNode = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[FlattenNode]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): FlattenNode = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[FlattenNode]
      /**
        * Decodes a FlattenNode message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns FlattenNode
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): FlattenNode = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[FlattenNode]
      inline def decode(reader: Reader, length: Double): FlattenNode = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[FlattenNode]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): FlattenNode = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[FlattenNode]
      /**
        * Decodes a FlattenNode message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns FlattenNode
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): FlattenNode = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[FlattenNode]
      
      /**
        * Encodes the specified FlattenNode message. Does not implicitly {@link Trace.QueryPlanNode.FlattenNode.verify|verify} messages.
        * @param message FlattenNode message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: IFlattenNode): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: IFlattenNode, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified FlattenNode message, length delimited. Does not implicitly {@link Trace.QueryPlanNode.FlattenNode.verify|verify} messages.
        * @param message FlattenNode message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: IFlattenNode): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: IFlattenNode, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a plain object from a FlattenNode message. Also converts values to other types if specified.
        * @param message FlattenNode
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: FlattenNode): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(message: FlattenNode, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a FlattenNode message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a ParallelNode. */
    @JSImport("apollo-reporting-protobuf/generated/protobuf", "Trace.QueryPlanNode.ParallelNode")
    @js.native
    /**
      * Constructs a new ParallelNode.
      * @param [properties] Properties to set
      */
    open class ParallelNode ()
      extends StObject
         with IParallelNode {
      def this(properties: IParallelNode) = this()
      
      /** ParallelNode nodes. */
      @JSName("nodes")
      var nodes_ParallelNode: js.Array[IQueryPlanNode] = js.native
      
      /**
        * Converts this ParallelNode to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[Any] = js.native
    }
    object ParallelNode {
      
      @JSImport("apollo-reporting-protobuf/generated/protobuf", "Trace.QueryPlanNode.ParallelNode")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new ParallelNode instance using the specified properties.
        * @param [properties] Properties to set
        * @returns ParallelNode instance
        */
      /* static member */
      inline def create(): ParallelNode = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ParallelNode]
      inline def create(properties: IParallelNode): ParallelNode = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ParallelNode]
      
      inline def decode(reader: js.typedarray.Uint8Array): ParallelNode = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ParallelNode]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): ParallelNode = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ParallelNode]
      /**
        * Decodes a ParallelNode message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns ParallelNode
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): ParallelNode = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ParallelNode]
      inline def decode(reader: Reader, length: Double): ParallelNode = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ParallelNode]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): ParallelNode = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ParallelNode]
      /**
        * Decodes a ParallelNode message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns ParallelNode
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): ParallelNode = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ParallelNode]
      
      /**
        * Encodes the specified ParallelNode message. Does not implicitly {@link Trace.QueryPlanNode.ParallelNode.verify|verify} messages.
        * @param message ParallelNode message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: IParallelNode): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: IParallelNode, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified ParallelNode message, length delimited. Does not implicitly {@link Trace.QueryPlanNode.ParallelNode.verify|verify} messages.
        * @param message ParallelNode message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: IParallelNode): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: IParallelNode, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a plain object from a ParallelNode message. Also converts values to other types if specified.
        * @param message ParallelNode
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: ParallelNode): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(message: ParallelNode, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a ParallelNode message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a ResponsePathElement. */
    @JSImport("apollo-reporting-protobuf/generated/protobuf", "Trace.QueryPlanNode.ResponsePathElement")
    @js.native
    /**
      * Constructs a new ResponsePathElement.
      * @param [properties] Properties to set
      */
    open class ResponsePathElement ()
      extends StObject
         with IResponsePathElement {
      def this(properties: IResponsePathElement) = this()
      
      /** ResponsePathElement fieldName. */
      @JSName("fieldName")
      var fieldName_ResponsePathElement: String = js.native
      
      /** ResponsePathElement id. */
      var id: js.UndefOr[fieldName | index] = js.native
      
      /** ResponsePathElement index. */
      @JSName("index")
      var index_ResponsePathElement: Double = js.native
      
      /**
        * Converts this ResponsePathElement to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[Any] = js.native
    }
    object ResponsePathElement {
      
      @JSImport("apollo-reporting-protobuf/generated/protobuf", "Trace.QueryPlanNode.ResponsePathElement")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new ResponsePathElement instance using the specified properties.
        * @param [properties] Properties to set
        * @returns ResponsePathElement instance
        */
      /* static member */
      inline def create(): ResponsePathElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ResponsePathElement]
      inline def create(properties: IResponsePathElement): ResponsePathElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ResponsePathElement]
      
      inline def decode(reader: js.typedarray.Uint8Array): ResponsePathElement = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ResponsePathElement]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): ResponsePathElement = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ResponsePathElement]
      /**
        * Decodes a ResponsePathElement message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns ResponsePathElement
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): ResponsePathElement = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ResponsePathElement]
      inline def decode(reader: Reader, length: Double): ResponsePathElement = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ResponsePathElement]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): ResponsePathElement = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ResponsePathElement]
      /**
        * Decodes a ResponsePathElement message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns ResponsePathElement
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): ResponsePathElement = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ResponsePathElement]
      
      /**
        * Encodes the specified ResponsePathElement message. Does not implicitly {@link Trace.QueryPlanNode.ResponsePathElement.verify|verify} messages.
        * @param message ResponsePathElement message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: IResponsePathElement): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: IResponsePathElement, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified ResponsePathElement message, length delimited. Does not implicitly {@link Trace.QueryPlanNode.ResponsePathElement.verify|verify} messages.
        * @param message ResponsePathElement message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: IResponsePathElement): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: IResponsePathElement, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a plain object from a ResponsePathElement message. Also converts values to other types if specified.
        * @param message ResponsePathElement
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: ResponsePathElement): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(message: ResponsePathElement, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a ResponsePathElement message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a SequenceNode. */
    @JSImport("apollo-reporting-protobuf/generated/protobuf", "Trace.QueryPlanNode.SequenceNode")
    @js.native
    /**
      * Constructs a new SequenceNode.
      * @param [properties] Properties to set
      */
    open class SequenceNode ()
      extends StObject
         with ISequenceNode {
      def this(properties: ISequenceNode) = this()
      
      /** SequenceNode nodes. */
      @JSName("nodes")
      var nodes_SequenceNode: js.Array[IQueryPlanNode] = js.native
      
      /**
        * Converts this SequenceNode to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[Any] = js.native
    }
    object SequenceNode {
      
      @JSImport("apollo-reporting-protobuf/generated/protobuf", "Trace.QueryPlanNode.SequenceNode")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new SequenceNode instance using the specified properties.
        * @param [properties] Properties to set
        * @returns SequenceNode instance
        */
      /* static member */
      inline def create(): SequenceNode = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[SequenceNode]
      inline def create(properties: ISequenceNode): SequenceNode = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[SequenceNode]
      
      inline def decode(reader: js.typedarray.Uint8Array): SequenceNode = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SequenceNode]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): SequenceNode = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SequenceNode]
      /**
        * Decodes a SequenceNode message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns SequenceNode
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): SequenceNode = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SequenceNode]
      inline def decode(reader: Reader, length: Double): SequenceNode = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SequenceNode]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): SequenceNode = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SequenceNode]
      /**
        * Decodes a SequenceNode message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns SequenceNode
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): SequenceNode = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SequenceNode]
      
      /**
        * Encodes the specified SequenceNode message. Does not implicitly {@link Trace.QueryPlanNode.SequenceNode.verify|verify} messages.
        * @param message SequenceNode message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: ISequenceNode): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: ISequenceNode, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified SequenceNode message, length delimited. Does not implicitly {@link Trace.QueryPlanNode.SequenceNode.verify|verify} messages.
        * @param message SequenceNode message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: ISequenceNode): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: ISequenceNode, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a plain object from a SequenceNode message. Also converts values to other types if specified.
        * @param message SequenceNode
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: SequenceNode): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(message: SequenceNode, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a SequenceNode message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /**
      * Creates a new QueryPlanNode instance using the specified properties.
      * @param [properties] Properties to set
      * @returns QueryPlanNode instance
      */
    /* static member */
    inline def create(): QueryPlanNode = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[QueryPlanNode]
    inline def create(properties: IQueryPlanNode): QueryPlanNode = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[QueryPlanNode]
    
    inline def decode(reader: js.typedarray.Uint8Array): QueryPlanNode = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[QueryPlanNode]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): QueryPlanNode = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[QueryPlanNode]
    /**
      * Decodes a QueryPlanNode message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns QueryPlanNode
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): QueryPlanNode = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[QueryPlanNode]
    inline def decode(reader: Reader, length: Double): QueryPlanNode = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[QueryPlanNode]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): QueryPlanNode = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[QueryPlanNode]
    /**
      * Decodes a QueryPlanNode message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns QueryPlanNode
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): QueryPlanNode = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[QueryPlanNode]
    
    /**
      * Encodes the specified QueryPlanNode message. Does not implicitly {@link Trace.QueryPlanNode.verify|verify} messages.
      * @param message QueryPlanNode message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IQueryPlanNode): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IQueryPlanNode, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified QueryPlanNode message, length delimited. Does not implicitly {@link Trace.QueryPlanNode.verify|verify} messages.
      * @param message QueryPlanNode message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IQueryPlanNode): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IQueryPlanNode, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a plain object from a QueryPlanNode message. Also converts values to other types if specified.
      * @param message QueryPlanNode
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: QueryPlanNode): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: QueryPlanNode, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a QueryPlanNode message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    
    /** Properties of a FetchNode. */
    trait IFetchNode extends StObject {
      
      /** FetchNode receivedTime */
      var receivedTime: js.UndefOr[ITimestamp | Null] = js.undefined
      
      /** FetchNode sentTime */
      var sentTime: js.UndefOr[ITimestamp | Null] = js.undefined
      
      /** FetchNode sentTimeOffset */
      var sentTimeOffset: js.UndefOr[Double | Null] = js.undefined
      
      /** FetchNode serviceName */
      var serviceName: js.UndefOr[String | Null] = js.undefined
      
      /** FetchNode trace */
      var trace: js.UndefOr[ITrace | Null] = js.undefined
      
      /** FetchNode traceParsingFailed */
      var traceParsingFailed: js.UndefOr[Boolean | Null] = js.undefined
    }
    object IFetchNode {
      
      inline def apply(): IFetchNode = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IFetchNode]
      }
      
      extension [Self <: IFetchNode](x: Self) {
        
        inline def setReceivedTime(value: ITimestamp): Self = StObject.set(x, "receivedTime", value.asInstanceOf[js.Any])
        
        inline def setReceivedTimeNull: Self = StObject.set(x, "receivedTime", null)
        
        inline def setReceivedTimeUndefined: Self = StObject.set(x, "receivedTime", js.undefined)
        
        inline def setSentTime(value: ITimestamp): Self = StObject.set(x, "sentTime", value.asInstanceOf[js.Any])
        
        inline def setSentTimeNull: Self = StObject.set(x, "sentTime", null)
        
        inline def setSentTimeOffset(value: Double): Self = StObject.set(x, "sentTimeOffset", value.asInstanceOf[js.Any])
        
        inline def setSentTimeOffsetNull: Self = StObject.set(x, "sentTimeOffset", null)
        
        inline def setSentTimeOffsetUndefined: Self = StObject.set(x, "sentTimeOffset", js.undefined)
        
        inline def setSentTimeUndefined: Self = StObject.set(x, "sentTime", js.undefined)
        
        inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
        
        inline def setServiceNameNull: Self = StObject.set(x, "serviceName", null)
        
        inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
        
        inline def setTrace(value: ITrace): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
        
        inline def setTraceNull: Self = StObject.set(x, "trace", null)
        
        inline def setTraceParsingFailed(value: Boolean): Self = StObject.set(x, "traceParsingFailed", value.asInstanceOf[js.Any])
        
        inline def setTraceParsingFailedNull: Self = StObject.set(x, "traceParsingFailed", null)
        
        inline def setTraceParsingFailedUndefined: Self = StObject.set(x, "traceParsingFailed", js.undefined)
        
        inline def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
      }
    }
    
    /** Properties of a FlattenNode. */
    trait IFlattenNode extends StObject {
      
      /** FlattenNode node */
      var node: js.UndefOr[IQueryPlanNode | Null] = js.undefined
      
      /** FlattenNode responsePath */
      var responsePath: js.UndefOr[js.Array[IResponsePathElement] | Null] = js.undefined
    }
    object IFlattenNode {
      
      inline def apply(): IFlattenNode = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IFlattenNode]
      }
      
      extension [Self <: IFlattenNode](x: Self) {
        
        inline def setNode(value: IQueryPlanNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
        
        inline def setNodeNull: Self = StObject.set(x, "node", null)
        
        inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
        
        inline def setResponsePath(value: js.Array[IResponsePathElement]): Self = StObject.set(x, "responsePath", value.asInstanceOf[js.Any])
        
        inline def setResponsePathNull: Self = StObject.set(x, "responsePath", null)
        
        inline def setResponsePathUndefined: Self = StObject.set(x, "responsePath", js.undefined)
        
        inline def setResponsePathVarargs(value: IResponsePathElement*): Self = StObject.set(x, "responsePath", js.Array(value*))
      }
    }
    
    /** Properties of a ParallelNode. */
    trait IParallelNode extends StObject {
      
      /** ParallelNode nodes */
      var nodes: js.UndefOr[js.Array[IQueryPlanNode] | Null] = js.undefined
    }
    object IParallelNode {
      
      inline def apply(): IParallelNode = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IParallelNode]
      }
      
      extension [Self <: IParallelNode](x: Self) {
        
        inline def setNodes(value: js.Array[IQueryPlanNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
        
        inline def setNodesNull: Self = StObject.set(x, "nodes", null)
        
        inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
        
        inline def setNodesVarargs(value: IQueryPlanNode*): Self = StObject.set(x, "nodes", js.Array(value*))
      }
    }
    
    /** Properties of a ResponsePathElement. */
    trait IResponsePathElement extends StObject {
      
      /** ResponsePathElement fieldName */
      var fieldName: js.UndefOr[String | Null] = js.undefined
      
      /** ResponsePathElement index */
      var index: js.UndefOr[Double | Null] = js.undefined
    }
    object IResponsePathElement {
      
      inline def apply(): IResponsePathElement = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IResponsePathElement]
      }
      
      extension [Self <: IResponsePathElement](x: Self) {
        
        inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
        
        inline def setFieldNameNull: Self = StObject.set(x, "fieldName", null)
        
        inline def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
        
        inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
        
        inline def setIndexNull: Self = StObject.set(x, "index", null)
        
        inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      }
    }
    
    /** Properties of a SequenceNode. */
    trait ISequenceNode extends StObject {
      
      /** SequenceNode nodes */
      var nodes: js.UndefOr[js.Array[IQueryPlanNode] | Null] = js.undefined
    }
    object ISequenceNode {
      
      inline def apply(): ISequenceNode = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ISequenceNode]
      }
      
      extension [Self <: ISequenceNode](x: Self) {
        
        inline def setNodes(value: js.Array[IQueryPlanNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
        
        inline def setNodesNull: Self = StObject.set(x, "nodes", null)
        
        inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
        
        inline def setNodesVarargs(value: IQueryPlanNode*): Self = StObject.set(x, "nodes", js.Array(value*))
      }
    }
  }
  
  /**
    * Creates a new Trace instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Trace instance
    */
  inline def create(): Trace = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Trace]
  inline def create(properties: ITrace): Trace = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Trace]
  
  inline def decode(reader: js.typedarray.Uint8Array): Trace = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Trace]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): Trace = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Trace]
  /**
    * Decodes a Trace message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Trace
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): Trace = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Trace]
  inline def decode(reader: Reader, length: Double): Trace = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Trace]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): Trace = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Trace]
  /**
    * Decodes a Trace message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Trace
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): Trace = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Trace]
  
  /**
    * Encodes the specified Trace message. Does not implicitly {@link Trace.verify|verify} messages.
    * @param message Trace message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: ITrace): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ITrace, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified Trace message, length delimited. Does not implicitly {@link Trace.verify|verify} messages.
    * @param message Trace message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: ITrace): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ITrace, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a plain object from a Trace message. Also converts values to other types if specified.
    * @param message Trace
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: Trace): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: Trace, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a Trace message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  /** Properties of a CachePolicy. */
  trait ICachePolicy extends StObject {
    
    /** CachePolicy maxAgeNs */
    var maxAgeNs: js.UndefOr[Double | Null] = js.undefined
    
    /** CachePolicy scope */
    var scope: js.UndefOr[Scope | Null] = js.undefined
  }
  object ICachePolicy {
    
    inline def apply(): ICachePolicy = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICachePolicy]
    }
    
    extension [Self <: ICachePolicy](x: Self) {
      
      inline def setMaxAgeNs(value: Double): Self = StObject.set(x, "maxAgeNs", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeNsNull: Self = StObject.set(x, "maxAgeNs", null)
      
      inline def setMaxAgeNsUndefined: Self = StObject.set(x, "maxAgeNs", js.undefined)
      
      inline def setScope(value: Scope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeNull: Self = StObject.set(x, "scope", null)
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
  
  /** Properties of a Details. */
  trait IDetails extends StObject {
    
    /** Details operationName */
    var operationName: js.UndefOr[String | Null] = js.undefined
    
    /** Details variablesJson */
    var variablesJson: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  }
  object IDetails {
    
    inline def apply(): IDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDetails]
    }
    
    extension [Self <: IDetails](x: Self) {
      
      inline def setOperationName(value: String): Self = StObject.set(x, "operationName", value.asInstanceOf[js.Any])
      
      inline def setOperationNameNull: Self = StObject.set(x, "operationName", null)
      
      inline def setOperationNameUndefined: Self = StObject.set(x, "operationName", js.undefined)
      
      inline def setVariablesJson(value: StringDictionary[String]): Self = StObject.set(x, "variablesJson", value.asInstanceOf[js.Any])
      
      inline def setVariablesJsonNull: Self = StObject.set(x, "variablesJson", null)
      
      inline def setVariablesJsonUndefined: Self = StObject.set(x, "variablesJson", js.undefined)
    }
  }
  
  /** Properties of an Error. */
  trait IError extends StObject {
    
    /** Error json */
    var json: js.UndefOr[String | Null] = js.undefined
    
    /** Error location */
    var location: js.UndefOr[js.Array[ILocation] | Null] = js.undefined
    
    /** Error message */
    var message: js.UndefOr[String | Null] = js.undefined
    
    /** Error timeNs */
    var timeNs: js.UndefOr[Double | Null] = js.undefined
  }
  object IError {
    
    inline def apply(): IError = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IError]
    }
    
    extension [Self <: IError](x: Self) {
      
      inline def setJson(value: String): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonNull: Self = StObject.set(x, "json", null)
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def setLocation(value: js.Array[ILocation]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationNull: Self = StObject.set(x, "location", null)
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setLocationVarargs(value: ILocation*): Self = StObject.set(x, "location", js.Array(value*))
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageNull: Self = StObject.set(x, "message", null)
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setTimeNs(value: Double): Self = StObject.set(x, "timeNs", value.asInstanceOf[js.Any])
      
      inline def setTimeNsNull: Self = StObject.set(x, "timeNs", null)
      
      inline def setTimeNsUndefined: Self = StObject.set(x, "timeNs", js.undefined)
    }
  }
  
  /** Properties of a HTTP. */
  trait IHTTP extends StObject {
    
    /** HTTP host */
    var host: js.UndefOr[String | Null] = js.undefined
    
    /** HTTP method */
    var method: js.UndefOr[Method | Null] = js.undefined
    
    /** HTTP path */
    var path: js.UndefOr[String | Null] = js.undefined
    
    /** HTTP protocol */
    var protocol: js.UndefOr[String | Null] = js.undefined
    
    /** HTTP requestHeaders */
    var requestHeaders: js.UndefOr[StringDictionary[IValues] | Null] = js.undefined
    
    /** HTTP responseHeaders */
    var responseHeaders: js.UndefOr[StringDictionary[IValues] | Null] = js.undefined
    
    /** HTTP secure */
    var secure: js.UndefOr[Boolean | Null] = js.undefined
    
    /** HTTP statusCode */
    var statusCode: js.UndefOr[Double | Null] = js.undefined
  }
  object IHTTP {
    
    inline def apply(): IHTTP = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IHTTP]
    }
    
    extension [Self <: IHTTP](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostNull: Self = StObject.set(x, "host", null)
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setMethod(value: Method): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodNull: Self = StObject.set(x, "method", null)
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathNull: Self = StObject.set(x, "path", null)
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolNull: Self = StObject.set(x, "protocol", null)
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setRequestHeaders(value: StringDictionary[IValues]): Self = StObject.set(x, "requestHeaders", value.asInstanceOf[js.Any])
      
      inline def setRequestHeadersNull: Self = StObject.set(x, "requestHeaders", null)
      
      inline def setRequestHeadersUndefined: Self = StObject.set(x, "requestHeaders", js.undefined)
      
      inline def setResponseHeaders(value: StringDictionary[IValues]): Self = StObject.set(x, "responseHeaders", value.asInstanceOf[js.Any])
      
      inline def setResponseHeadersNull: Self = StObject.set(x, "responseHeaders", null)
      
      inline def setResponseHeadersUndefined: Self = StObject.set(x, "responseHeaders", js.undefined)
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureNull: Self = StObject.set(x, "secure", null)
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusCodeNull: Self = StObject.set(x, "statusCode", null)
      
      inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    }
  }
  
  /** Properties of a Location. */
  trait ILocation extends StObject {
    
    /** Location column */
    var column: js.UndefOr[Double | Null] = js.undefined
    
    /** Location line */
    var line: js.UndefOr[Double | Null] = js.undefined
  }
  object ILocation {
    
    inline def apply(): ILocation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ILocation]
    }
    
    extension [Self <: ILocation](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnNull: Self = StObject.set(x, "column", null)
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLineNull: Self = StObject.set(x, "line", null)
      
      inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    }
  }
  
  /** Properties of a Node. */
  trait INode extends StObject {
    
    /** Node cachePolicy */
    var cachePolicy: js.UndefOr[ICachePolicy | Null] = js.undefined
    
    /** Node child */
    var child: js.UndefOr[js.Array[INode] | Null] = js.undefined
    
    /** Node endTime */
    var endTime: js.UndefOr[Double | Null] = js.undefined
    
    /** Node error */
    var error: js.UndefOr[js.Array[IError] | Null] = js.undefined
    
    /** Node index */
    var index: js.UndefOr[Double | Null] = js.undefined
    
    /** Node originalFieldName */
    var originalFieldName: js.UndefOr[String | Null] = js.undefined
    
    /** Node parentType */
    var parentType: js.UndefOr[String | Null] = js.undefined
    
    /** Node responseName */
    var responseName: js.UndefOr[String | Null] = js.undefined
    
    /** Node startTime */
    var startTime: js.UndefOr[Double | Null] = js.undefined
    
    /** Node type */
    var `type`: js.UndefOr[String | Null] = js.undefined
  }
  object INode {
    
    inline def apply(): INode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[INode]
    }
    
    extension [Self <: INode](x: Self) {
      
      inline def setCachePolicy(value: ICachePolicy): Self = StObject.set(x, "cachePolicy", value.asInstanceOf[js.Any])
      
      inline def setCachePolicyNull: Self = StObject.set(x, "cachePolicy", null)
      
      inline def setCachePolicyUndefined: Self = StObject.set(x, "cachePolicy", js.undefined)
      
      inline def setChild(value: js.Array[INode]): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
      
      inline def setChildNull: Self = StObject.set(x, "child", null)
      
      inline def setChildUndefined: Self = StObject.set(x, "child", js.undefined)
      
      inline def setChildVarargs(value: INode*): Self = StObject.set(x, "child", js.Array(value*))
      
      inline def setEndTime(value: Double): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
      
      inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
      
      inline def setError(value: js.Array[IError]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorNull: Self = StObject.set(x, "error", null)
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setErrorVarargs(value: IError*): Self = StObject.set(x, "error", js.Array(value*))
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexNull: Self = StObject.set(x, "index", null)
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setOriginalFieldName(value: String): Self = StObject.set(x, "originalFieldName", value.asInstanceOf[js.Any])
      
      inline def setOriginalFieldNameNull: Self = StObject.set(x, "originalFieldName", null)
      
      inline def setOriginalFieldNameUndefined: Self = StObject.set(x, "originalFieldName", js.undefined)
      
      inline def setParentType(value: String): Self = StObject.set(x, "parentType", value.asInstanceOf[js.Any])
      
      inline def setParentTypeNull: Self = StObject.set(x, "parentType", null)
      
      inline def setParentTypeUndefined: Self = StObject.set(x, "parentType", js.undefined)
      
      inline def setResponseName(value: String): Self = StObject.set(x, "responseName", value.asInstanceOf[js.Any])
      
      inline def setResponseNameNull: Self = StObject.set(x, "responseName", null)
      
      inline def setResponseNameUndefined: Self = StObject.set(x, "responseName", js.undefined)
      
      inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
      
      inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeNull: Self = StObject.set(x, "type", null)
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /** Properties of a QueryPlanNode. */
  trait IQueryPlanNode extends StObject {
    
    /** QueryPlanNode fetch */
    var fetch: js.UndefOr[IFetchNode | Null] = js.undefined
    
    /** QueryPlanNode flatten */
    var flatten: js.UndefOr[IFlattenNode | Null] = js.undefined
    
    /** QueryPlanNode parallel */
    var parallel: js.UndefOr[IParallelNode | Null] = js.undefined
    
    /** QueryPlanNode sequence */
    var sequence: js.UndefOr[ISequenceNode | Null] = js.undefined
  }
  object IQueryPlanNode {
    
    inline def apply(): IQueryPlanNode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IQueryPlanNode]
    }
    
    extension [Self <: IQueryPlanNode](x: Self) {
      
      inline def setFetch(value: IFetchNode): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
      
      inline def setFetchNull: Self = StObject.set(x, "fetch", null)
      
      inline def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
      
      inline def setFlatten(value: IFlattenNode): Self = StObject.set(x, "flatten", value.asInstanceOf[js.Any])
      
      inline def setFlattenNull: Self = StObject.set(x, "flatten", null)
      
      inline def setFlattenUndefined: Self = StObject.set(x, "flatten", js.undefined)
      
      inline def setParallel(value: IParallelNode): Self = StObject.set(x, "parallel", value.asInstanceOf[js.Any])
      
      inline def setParallelNull: Self = StObject.set(x, "parallel", null)
      
      inline def setParallelUndefined: Self = StObject.set(x, "parallel", js.undefined)
      
      inline def setSequence(value: ISequenceNode): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
      
      inline def setSequenceNull: Self = StObject.set(x, "sequence", null)
      
      inline def setSequenceUndefined: Self = StObject.set(x, "sequence", js.undefined)
    }
  }
}
