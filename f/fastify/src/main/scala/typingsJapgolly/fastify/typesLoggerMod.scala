package typingsJapgolly.fastify

import japgolly.scalajs.react.Callback
import typingsJapgolly.fastify.anon.Err
import typingsJapgolly.fastify.typesReplyMod.FastifyReply
import typingsJapgolly.fastify.typesRequestMod.FastifyRequest
import typingsJapgolly.fastify.typesRouteMod.RouteGenericInterface
import typingsJapgolly.fastify.typesSchemaMod.FastifySchema
import typingsJapgolly.fastify.typesTypeProviderMod.FastifyTypeProvider
import typingsJapgolly.fastify.typesTypeProviderMod.ResolveFastifyReplyType
import typingsJapgolly.fastify.typesTypeProviderMod.ResolveFastifyRequestType
import typingsJapgolly.fastify.typesUtilsMod.ContextConfigDefault
import typingsJapgolly.fastify.typesUtilsMod.RawReplyDefaultExpression
import typingsJapgolly.fastify.typesUtilsMod.RawRequestDefaultExpression
import typingsJapgolly.fastify.typesUtilsMod.RawServerBase
import typingsJapgolly.pino.mod.pino.BaseLogger
import typingsJapgolly.pino.mod.pino.Level
import typingsJapgolly.pino.mod.pino.LogFn
import typingsJapgolly.pino.mod.pino.LoggerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLoggerMod {
  
  type Bindings = typingsJapgolly.pino.mod.pino.Bindings
  
  type ChildLoggerOptions = typingsJapgolly.pino.mod.pino.ChildLoggerOptions
  
  @js.native
  trait FastifyBaseLogger
    extends StObject
       with BaseLogger {
    
    def child(bindings: Bindings): FastifyBaseLogger = js.native
    def child(bindings: Bindings, options: ChildLoggerOptions): FastifyBaseLogger = js.native
  }
  
  type FastifyLogFn = LogFn
  
  type FastifyLoggerInstance = FastifyBaseLogger
  
  trait FastifyLoggerOptions[RawServer /* <: RawServerBase */, RawRequest /* <: FastifyRequest[
    RouteGenericInterface, 
    RawServer, 
    RawRequestDefaultExpression[RawServer], 
    FastifySchema, 
    FastifyTypeProvider, 
    ContextConfigDefault, 
    FastifyBaseLogger, 
    ResolveFastifyRequestType[FastifyTypeProvider, FastifySchema, RouteGenericInterface]
  ] */, RawReply /* <: FastifyReply[
    RawServer, 
    RawRequestDefaultExpression[RawServer], 
    RawReplyDefaultExpression[RawServer], 
    RouteGenericInterface, 
    ContextConfigDefault, 
    FastifySchema, 
    FastifyTypeProvider, 
    ResolveFastifyReplyType[FastifyTypeProvider, FastifySchema, RouteGenericInterface]
  ] */] extends StObject {
    
    var file: js.UndefOr[String] = js.undefined
    
    var genReqId: js.UndefOr[js.Function1[/* req */ RawRequest, String]] = js.undefined
    
    var level: js.UndefOr[String] = js.undefined
    
    var serializers: js.UndefOr[Err[RawRequest, RawReply, RawServer]] = js.undefined
    
    var stream: js.UndefOr[FastifyLoggerStreamDestination] = js.undefined
  }
  object FastifyLoggerOptions {
    
    inline def apply[RawServer /* <: RawServerBase */, RawRequest /* <: FastifyRequest[
        RouteGenericInterface, 
        RawServer, 
        RawRequestDefaultExpression[RawServer], 
        FastifySchema, 
        FastifyTypeProvider, 
        ContextConfigDefault, 
        FastifyBaseLogger, 
        ResolveFastifyRequestType[FastifyTypeProvider, FastifySchema, RouteGenericInterface]
      ] */, RawReply /* <: FastifyReply[
        RawServer, 
        RawRequestDefaultExpression[RawServer], 
        RawReplyDefaultExpression[RawServer], 
        RouteGenericInterface, 
        ContextConfigDefault, 
        FastifySchema, 
        FastifyTypeProvider, 
        ResolveFastifyReplyType[FastifyTypeProvider, FastifySchema, RouteGenericInterface]
      ] */](): FastifyLoggerOptions[RawServer, RawRequest, RawReply] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FastifyLoggerOptions[RawServer, RawRequest, RawReply]]
    }
    
    extension [Self <: FastifyLoggerOptions[?, ?, ?], RawServer /* <: RawServerBase */, RawRequest /* <: FastifyRequest[
        RouteGenericInterface, 
        RawServer, 
        RawRequestDefaultExpression[RawServer], 
        FastifySchema, 
        FastifyTypeProvider, 
        ContextConfigDefault, 
        FastifyBaseLogger, 
        ResolveFastifyRequestType[FastifyTypeProvider, FastifySchema, RouteGenericInterface]
      ] */, RawReply /* <: FastifyReply[
        RawServer, 
        RawRequestDefaultExpression[RawServer], 
        RawReplyDefaultExpression[RawServer], 
        RouteGenericInterface, 
        ContextConfigDefault, 
        FastifySchema, 
        FastifyTypeProvider, 
        ResolveFastifyReplyType[FastifyTypeProvider, FastifySchema, RouteGenericInterface]
      ] */](x: Self & (FastifyLoggerOptions[RawServer, RawRequest, RawReply])) {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setGenReqId(value: /* req */ RawRequest => String): Self = StObject.set(x, "genReqId", js.Any.fromFunction1(value))
      
      inline def setGenReqIdUndefined: Self = StObject.set(x, "genReqId", js.undefined)
      
      inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setSerializers(value: Err[RawRequest, RawReply, RawServer]): Self = StObject.set(x, "serializers", value.asInstanceOf[js.Any])
      
      inline def setSerializersUndefined: Self = StObject.set(x, "serializers", js.undefined)
      
      inline def setStream(value: FastifyLoggerStreamDestination): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
    }
  }
  
  trait FastifyLoggerStreamDestination extends StObject {
    
    def write(msg: String): Unit
  }
  object FastifyLoggerStreamDestination {
    
    inline def apply(write: String => Callback): FastifyLoggerStreamDestination = {
      val __obj = js.Dynamic.literal(write = js.Any.fromFunction1((t0: String) => write(t0).runNow()))
      __obj.asInstanceOf[FastifyLoggerStreamDestination]
    }
    
    extension [Self <: FastifyLoggerStreamDestination](x: Self) {
      
      inline def setWrite(value: String => Callback): Self = StObject.set(x, "write", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
  
  type LogLevel = Level
  
  type PinoLoggerOptions = LoggerOptions
}
