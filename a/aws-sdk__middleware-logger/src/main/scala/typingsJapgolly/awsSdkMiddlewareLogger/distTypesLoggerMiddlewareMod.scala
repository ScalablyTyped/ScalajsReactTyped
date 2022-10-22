package typingsJapgolly.awsSdkMiddlewareLogger

import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.AbsoluteLocation
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.HandlerExecutionContext
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.InitializeHandler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.InitializeHandlerOptions
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Pluggable
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.MetadataBearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLoggerMiddlewareMod {
  
  @JSImport("@aws-sdk/middleware-logger/dist-types/loggerMiddleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getLoggerPlugin(options: Any): Pluggable[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLoggerPlugin")(options.asInstanceOf[js.Any]).asInstanceOf[Pluggable[Any, Any]]
  
  inline def loggerMiddleware(): js.Function2[
    /* next */ InitializeHandler[Any, MetadataBearer], 
    /* context */ HandlerExecutionContext, 
    InitializeHandler[Any, MetadataBearer]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("loggerMiddleware")().asInstanceOf[js.Function2[
    /* next */ InitializeHandler[Any, MetadataBearer], 
    /* context */ HandlerExecutionContext, 
    InitializeHandler[Any, MetadataBearer]
  ]]
  
  @JSImport("@aws-sdk/middleware-logger/dist-types/loggerMiddleware", "loggerMiddlewareOptions")
  @js.native
  val loggerMiddlewareOptions: InitializeHandlerOptions & AbsoluteLocation = js.native
}
