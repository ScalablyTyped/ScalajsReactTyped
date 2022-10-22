package typingsJapgolly.awsSdkMiddlewareRetry

import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.FinalizeHandler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Pluggable
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.RelativeMiddlewareOptions
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.MetadataBearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesOmitRetryHeadersMiddlewareMod {
  
  @JSImport("@aws-sdk/middleware-retry/dist-types/omitRetryHeadersMiddleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getOmitRetryHeadersPlugin(options: Any): Pluggable[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOmitRetryHeadersPlugin")(options.asInstanceOf[js.Any]).asInstanceOf[Pluggable[Any, Any]]
  
  inline def omitRetryHeadersMiddleware(): js.Function1[
    /* next */ FinalizeHandler[Any, MetadataBearer], 
    FinalizeHandler[Any, MetadataBearer]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("omitRetryHeadersMiddleware")().asInstanceOf[js.Function1[
    /* next */ FinalizeHandler[Any, MetadataBearer], 
    FinalizeHandler[Any, MetadataBearer]
  ]]
  
  @JSImport("@aws-sdk/middleware-retry/dist-types/omitRetryHeadersMiddleware", "omitRetryHeadersMiddlewareOptions")
  @js.native
  val omitRetryHeadersMiddlewareOptions: RelativeMiddlewareOptions = js.native
}
