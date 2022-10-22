package typingsJapgolly.azureCoreRestPipeline

import typingsJapgolly.azureCoreRestPipeline.anon.CustomNoProxyList
import typingsJapgolly.azureCoreRestPipeline.types3Dot1CoreRestPipelineMod.BearerTokenAuthenticationPolicyOptions
import typingsJapgolly.azureCoreRestPipeline.types3Dot1CoreRestPipelineMod.DefaultRetryPolicyOptions
import typingsJapgolly.azureCoreRestPipeline.types3Dot1CoreRestPipelineMod.ExponentialRetryPolicyOptions
import typingsJapgolly.azureCoreRestPipeline.types3Dot1CoreRestPipelineMod.HttpClient
import typingsJapgolly.azureCoreRestPipeline.types3Dot1CoreRestPipelineMod.HttpHeaders
import typingsJapgolly.azureCoreRestPipeline.types3Dot1CoreRestPipelineMod.InternalPipelineOptions
import typingsJapgolly.azureCoreRestPipeline.types3Dot1CoreRestPipelineMod.LogPolicyOptions
import typingsJapgolly.azureCoreRestPipeline.types3Dot1CoreRestPipelineMod.Pipeline
import typingsJapgolly.azureCoreRestPipeline.types3Dot1CoreRestPipelineMod.PipelinePolicy
import typingsJapgolly.azureCoreRestPipeline.types3Dot1CoreRestPipelineMod.PipelineRequest
import typingsJapgolly.azureCoreRestPipeline.types3Dot1CoreRestPipelineMod.PipelineRequestOptions
import typingsJapgolly.azureCoreRestPipeline.types3Dot1CoreRestPipelineMod.ProxySettings
import typingsJapgolly.azureCoreRestPipeline.types3Dot1CoreRestPipelineMod.RawHttpHeadersInput
import typingsJapgolly.azureCoreRestPipeline.types3Dot1CoreRestPipelineMod.RedirectPolicyOptions
import typingsJapgolly.azureCoreRestPipeline.types3Dot1CoreRestPipelineMod.RestErrorOptions
import typingsJapgolly.azureCoreRestPipeline.types3Dot1CoreRestPipelineMod.RetryPolicyOptions
import typingsJapgolly.azureCoreRestPipeline.types3Dot1CoreRestPipelineMod.RetryStrategy
import typingsJapgolly.azureCoreRestPipeline.types3Dot1CoreRestPipelineMod.SystemErrorRetryPolicyOptions
import typingsJapgolly.azureCoreRestPipeline.types3Dot1CoreRestPipelineMod.ThrottlingRetryPolicyOptions
import typingsJapgolly.azureCoreRestPipeline.types3Dot1CoreRestPipelineMod.TlsSettings
import typingsJapgolly.azureCoreRestPipeline.types3Dot1CoreRestPipelineMod.TracingPolicyOptions
import typingsJapgolly.azureCoreRestPipeline.types3Dot1CoreRestPipelineMod.UserAgentPolicyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreRestPipelineDotshims31Mod {
  
  @JSImport("@azure/core-rest-pipeline/core-rest-pipeline.shims-3_1", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@azure/core-rest-pipeline/core-rest-pipeline.shims-3_1", "RestError")
  @js.native
  open class RestError protected ()
    extends typingsJapgolly.azureCoreRestPipeline.types3Dot1CoreRestPipelineMod.RestError {
    def this(message: String) = this()
    def this(message: String, options: RestErrorOptions) = this()
  }
  /* static members */
  object RestError {
    
    /**
      * This means that parsing the response from the server failed.
      * It may have been malformed.
      */
    @JSImport("@azure/core-rest-pipeline/core-rest-pipeline.shims-3_1", "RestError.PARSE_ERROR")
    @js.native
    val PARSE_ERROR: String = js.native
    
    /**
      * Something went wrong when making the request.
      * This means the actual request failed for some reason,
      * such as a DNS issue or the connection being lost.
      */
    @JSImport("@azure/core-rest-pipeline/core-rest-pipeline.shims-3_1", "RestError.REQUEST_SEND_ERROR")
    @js.native
    val REQUEST_SEND_ERROR: String = js.native
  }
  
  inline def bearerTokenAuthenticationPolicy(options: BearerTokenAuthenticationPolicyOptions): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("bearerTokenAuthenticationPolicy")(options.asInstanceOf[js.Any]).asInstanceOf[PipelinePolicy]
  
  @JSImport("@azure/core-rest-pipeline/core-rest-pipeline.shims-3_1", "bearerTokenAuthenticationPolicyName")
  @js.native
  val bearerTokenAuthenticationPolicyName: /* "bearerTokenAuthenticationPolicy" */ String = js.native
  
  inline def createDefaultHttpClient(): HttpClient = ^.asInstanceOf[js.Dynamic].applyDynamic("createDefaultHttpClient")().asInstanceOf[HttpClient]
  
  inline def createEmptyPipeline(): Pipeline = ^.asInstanceOf[js.Dynamic].applyDynamic("createEmptyPipeline")().asInstanceOf[Pipeline]
  
  inline def createHttpHeaders(): HttpHeaders = ^.asInstanceOf[js.Dynamic].applyDynamic("createHttpHeaders")().asInstanceOf[HttpHeaders]
  inline def createHttpHeaders(rawHeaders: RawHttpHeadersInput): HttpHeaders = ^.asInstanceOf[js.Dynamic].applyDynamic("createHttpHeaders")(rawHeaders.asInstanceOf[js.Any]).asInstanceOf[HttpHeaders]
  
  inline def createPipelineFromOptions(options: InternalPipelineOptions): Pipeline = ^.asInstanceOf[js.Dynamic].applyDynamic("createPipelineFromOptions")(options.asInstanceOf[js.Any]).asInstanceOf[Pipeline]
  
  inline def createPipelineRequest(options: PipelineRequestOptions): PipelineRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("createPipelineRequest")(options.asInstanceOf[js.Any]).asInstanceOf[PipelineRequest]
  
  inline def decompressResponsePolicy(): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("decompressResponsePolicy")().asInstanceOf[PipelinePolicy]
  
  @JSImport("@azure/core-rest-pipeline/core-rest-pipeline.shims-3_1", "decompressResponsePolicyName")
  @js.native
  val decompressResponsePolicyName: /* "decompressResponsePolicy" */ String = js.native
  
  inline def defaultRetryPolicy(): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultRetryPolicy")().asInstanceOf[PipelinePolicy]
  inline def defaultRetryPolicy(options: DefaultRetryPolicyOptions): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultRetryPolicy")(options.asInstanceOf[js.Any]).asInstanceOf[PipelinePolicy]
  
  inline def exponentialRetryPolicy(): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("exponentialRetryPolicy")().asInstanceOf[PipelinePolicy]
  inline def exponentialRetryPolicy(options: ExponentialRetryPolicyOptions): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("exponentialRetryPolicy")(options.asInstanceOf[js.Any]).asInstanceOf[PipelinePolicy]
  
  @JSImport("@azure/core-rest-pipeline/core-rest-pipeline.shims-3_1", "exponentialRetryPolicyName")
  @js.native
  val exponentialRetryPolicyName: /* "exponentialRetryPolicy" */ String = js.native
  
  inline def formDataPolicy(): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("formDataPolicy")().asInstanceOf[PipelinePolicy]
  
  @JSImport("@azure/core-rest-pipeline/core-rest-pipeline.shims-3_1", "formDataPolicyName")
  @js.native
  val formDataPolicyName: /* "formDataPolicy" */ String = js.native
  
  inline def getDefaultProxySettings(): js.UndefOr[ProxySettings] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultProxySettings")().asInstanceOf[js.UndefOr[ProxySettings]]
  inline def getDefaultProxySettings(proxyUrl: String): js.UndefOr[ProxySettings] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultProxySettings")(proxyUrl.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ProxySettings]]
  
  inline def isRestError(e: Any): /* is @azure/core-rest-pipeline.@azure/core-rest-pipeline/types/3.1/core-rest-pipeline.RestError */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRestError")(e.asInstanceOf[js.Any]).asInstanceOf[/* is @azure/core-rest-pipeline.@azure/core-rest-pipeline/types/3.1/core-rest-pipeline.RestError */ Boolean]
  
  inline def logPolicy(): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("logPolicy")().asInstanceOf[PipelinePolicy]
  inline def logPolicy(options: LogPolicyOptions): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("logPolicy")(options.asInstanceOf[js.Any]).asInstanceOf[PipelinePolicy]
  
  @JSImport("@azure/core-rest-pipeline/core-rest-pipeline.shims-3_1", "logPolicyName")
  @js.native
  val logPolicyName: /* "logPolicy" */ String = js.native
  
  inline def ndJsonPolicy(): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("ndJsonPolicy")().asInstanceOf[PipelinePolicy]
  
  @JSImport("@azure/core-rest-pipeline/core-rest-pipeline.shims-3_1", "ndJsonPolicyName")
  @js.native
  val ndJsonPolicyName: /* "ndJsonPolicy" */ String = js.native
  
  inline def proxyPolicy(): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("proxyPolicy")().asInstanceOf[PipelinePolicy]
  inline def proxyPolicy(proxySettings: Unit, options: CustomNoProxyList): PipelinePolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("proxyPolicy")(proxySettings.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PipelinePolicy]
  inline def proxyPolicy(proxySettings: ProxySettings): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("proxyPolicy")(proxySettings.asInstanceOf[js.Any]).asInstanceOf[PipelinePolicy]
  inline def proxyPolicy(proxySettings: ProxySettings, options: CustomNoProxyList): PipelinePolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("proxyPolicy")(proxySettings.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PipelinePolicy]
  
  @JSImport("@azure/core-rest-pipeline/core-rest-pipeline.shims-3_1", "proxyPolicyName")
  @js.native
  val proxyPolicyName: /* "proxyPolicy" */ String = js.native
  
  inline def redirectPolicy(): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("redirectPolicy")().asInstanceOf[PipelinePolicy]
  inline def redirectPolicy(options: RedirectPolicyOptions): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("redirectPolicy")(options.asInstanceOf[js.Any]).asInstanceOf[PipelinePolicy]
  
  @JSImport("@azure/core-rest-pipeline/core-rest-pipeline.shims-3_1", "redirectPolicyName")
  @js.native
  val redirectPolicyName: /* "redirectPolicy" */ String = js.native
  
  inline def retryPolicy(strategies: js.Array[RetryStrategy]): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("retryPolicy")(strategies.asInstanceOf[js.Any]).asInstanceOf[PipelinePolicy]
  inline def retryPolicy(strategies: js.Array[RetryStrategy], options: RetryPolicyOptions): PipelinePolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("retryPolicy")(strategies.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PipelinePolicy]
  
  inline def setClientRequestIdPolicy(): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("setClientRequestIdPolicy")().asInstanceOf[PipelinePolicy]
  inline def setClientRequestIdPolicy(requestIdHeaderName: String): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("setClientRequestIdPolicy")(requestIdHeaderName.asInstanceOf[js.Any]).asInstanceOf[PipelinePolicy]
  
  @JSImport("@azure/core-rest-pipeline/core-rest-pipeline.shims-3_1", "setClientRequestIdPolicyName")
  @js.native
  val setClientRequestIdPolicyName: /* "setClientRequestIdPolicy" */ String = js.native
  
  inline def systemErrorRetryPolicy(): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("systemErrorRetryPolicy")().asInstanceOf[PipelinePolicy]
  inline def systemErrorRetryPolicy(options: SystemErrorRetryPolicyOptions): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("systemErrorRetryPolicy")(options.asInstanceOf[js.Any]).asInstanceOf[PipelinePolicy]
  
  @JSImport("@azure/core-rest-pipeline/core-rest-pipeline.shims-3_1", "systemErrorRetryPolicyName")
  @js.native
  val systemErrorRetryPolicyName: /* "systemErrorRetryPolicy" */ String = js.native
  
  inline def throttlingRetryPolicy(): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("throttlingRetryPolicy")().asInstanceOf[PipelinePolicy]
  inline def throttlingRetryPolicy(options: ThrottlingRetryPolicyOptions): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("throttlingRetryPolicy")(options.asInstanceOf[js.Any]).asInstanceOf[PipelinePolicy]
  
  @JSImport("@azure/core-rest-pipeline/core-rest-pipeline.shims-3_1", "throttlingRetryPolicyName")
  @js.native
  val throttlingRetryPolicyName: /* "throttlingRetryPolicy" */ String = js.native
  
  inline def tlsPolicy(): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("tlsPolicy")().asInstanceOf[PipelinePolicy]
  inline def tlsPolicy(tlsSettings: TlsSettings): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("tlsPolicy")(tlsSettings.asInstanceOf[js.Any]).asInstanceOf[PipelinePolicy]
  
  @JSImport("@azure/core-rest-pipeline/core-rest-pipeline.shims-3_1", "tlsPolicyName")
  @js.native
  val tlsPolicyName: /* "tlsPolicy" */ String = js.native
  
  inline def tracingPolicy(): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("tracingPolicy")().asInstanceOf[PipelinePolicy]
  inline def tracingPolicy(options: TracingPolicyOptions): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("tracingPolicy")(options.asInstanceOf[js.Any]).asInstanceOf[PipelinePolicy]
  
  @JSImport("@azure/core-rest-pipeline/core-rest-pipeline.shims-3_1", "tracingPolicyName")
  @js.native
  val tracingPolicyName: /* "tracingPolicy" */ String = js.native
  
  inline def userAgentPolicy(): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("userAgentPolicy")().asInstanceOf[PipelinePolicy]
  inline def userAgentPolicy(options: UserAgentPolicyOptions): PipelinePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("userAgentPolicy")(options.asInstanceOf[js.Any]).asInstanceOf[PipelinePolicy]
  
  @JSImport("@azure/core-rest-pipeline/core-rest-pipeline.shims-3_1", "userAgentPolicyName")
  @js.native
  val userAgentPolicyName: /* "userAgentPolicy" */ String = js.native
}
