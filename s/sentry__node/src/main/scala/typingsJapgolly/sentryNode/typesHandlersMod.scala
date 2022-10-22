package typingsJapgolly.sentryNode

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import typingsJapgolly.sentryNode.anon.AddRequestDataToEventOpti
import typingsJapgolly.sentryNode.anon.FlushTimeout
import typingsJapgolly.sentryNode.anon.ShouldHandleError
import typingsJapgolly.sentryNode.anon.StatusCode
import typingsJapgolly.sentryNode.typesRequestDataDeprecatedMod.ExpressRequest
import typingsJapgolly.sentryNode.typesRequestDataDeprecatedMod.ParseRequestOptions
import typingsJapgolly.sentryTypes.typesEventMod.Event
import typingsJapgolly.sentryTypes.typesMiscMod.ExtractedNodeRequestData
import typingsJapgolly.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesHandlersMod {
  
  @JSImport("@sentry/node/types/handlers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def errorHandler(): js.Function4[
    /* error */ MiddlewareError, 
    /* req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function1[/* error */ MiddlewareError, Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("errorHandler")().asInstanceOf[js.Function4[
    /* error */ MiddlewareError, 
    /* req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function1[/* error */ MiddlewareError, Unit], 
    Unit
  ]]
  inline def errorHandler(options: ShouldHandleError): js.Function4[
    /* error */ MiddlewareError, 
    /* req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function1[/* error */ MiddlewareError, Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("errorHandler")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function4[
    /* error */ MiddlewareError, 
    /* req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function1[/* error */ MiddlewareError, Unit], 
    Unit
  ]]
  
  inline def extractRequestData(req: StringDictionary[Any]): ExtractedNodeRequestData = ^.asInstanceOf[js.Dynamic].applyDynamic("extractRequestData")(req.asInstanceOf[js.Any]).asInstanceOf[ExtractedNodeRequestData]
  inline def extractRequestData(req: StringDictionary[Any], keys: js.Array[String]): ExtractedNodeRequestData = (^.asInstanceOf[js.Dynamic].applyDynamic("extractRequestData")(req.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[ExtractedNodeRequestData]
  
  inline def parseRequest(event: Event, req: ExpressRequest): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("parseRequest")(event.asInstanceOf[js.Any], req.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def parseRequest(event: Event, req: ExpressRequest, options: ParseRequestOptions): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("parseRequest")(event.asInstanceOf[js.Any], req.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def requestHandler(): js.Function3[
    /* req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function1[/* error */ js.UndefOr[Any], Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestHandler")().asInstanceOf[js.Function3[
    /* req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function1[/* error */ js.UndefOr[Any], Unit], 
    Unit
  ]]
  inline def requestHandler(options: RequestHandlerOptions): js.Function3[
    /* req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function1[/* error */ js.UndefOr[Any], Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestHandler")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function1[/* error */ js.UndefOr[Any], Unit], 
    Unit
  ]]
  
  inline def tracingHandler(): js.Function3[
    /* req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function1[/* error */ js.UndefOr[Any], Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("tracingHandler")().asInstanceOf[js.Function3[
    /* req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function1[/* error */ js.UndefOr[Any], Unit], 
    Unit
  ]]
  
  /** JSDoc */
  trait MiddlewareError
    extends StObject
       with Error {
    
    var output: js.UndefOr[StatusCode] = js.undefined
    
    var status: js.UndefOr[Double | String] = js.undefined
    
    var statusCode: js.UndefOr[Double | String] = js.undefined
    
    var status_code: js.UndefOr[Double | String] = js.undefined
  }
  object MiddlewareError {
    
    inline def apply(message: String, name: String): MiddlewareError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[MiddlewareError]
    }
    
    extension [Self <: MiddlewareError](x: Self) {
      
      inline def setOutput(value: StatusCode): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      inline def setStatus(value: Double | String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double | String): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setStatus_code(value: Double | String): Self = StObject.set(x, "status_code", value.asInstanceOf[js.Any])
      
      inline def setStatus_codeUndefined: Self = StObject.set(x, "status_code", js.undefined)
    }
  }
  
  type RequestHandlerOptions = (ParseRequestOptions & FlushTimeout) | AddRequestDataToEventOpti
}
