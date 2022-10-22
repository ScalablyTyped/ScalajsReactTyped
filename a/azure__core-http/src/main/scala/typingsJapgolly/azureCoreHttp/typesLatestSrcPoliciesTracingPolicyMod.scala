package typingsJapgolly.azureCoreHttp

import typingsJapgolly.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.BaseRequestPolicy
import typingsJapgolly.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.RequestPolicy
import typingsJapgolly.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.RequestPolicyFactory
import typingsJapgolly.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.RequestPolicyOptions
import typingsJapgolly.azureCoreHttp.typesLatestSrcWebResourceMod.WebResourceLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLatestSrcPoliciesTracingPolicyMod {
  
  @JSImport("@azure/core-http/types/latest/src/policies/tracingPolicy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@azure/core-http/types/latest/src/policies/tracingPolicy", "TracingPolicy")
  @js.native
  open class TracingPolicy_ protected () extends BaseRequestPolicy {
    def this(nextPolicy: RequestPolicy, options: RequestPolicyOptions, tracingOptions: TracingPolicyOptions) = this()
    
    def tryCreateSpan(request: WebResourceLike): js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Span */ Any
      ] = js.native
    
    /* private */ var tryProcessError: Any = js.native
    
    /* private */ var tryProcessResponse: Any = js.native
    
    /* private */ var userAgent: Any = js.native
  }
  
  inline def tracingPolicy(): RequestPolicyFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("tracingPolicy")().asInstanceOf[RequestPolicyFactory]
  inline def tracingPolicy(tracingOptions: TracingPolicyOptions): RequestPolicyFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("tracingPolicy")(tracingOptions.asInstanceOf[js.Any]).asInstanceOf[RequestPolicyFactory]
  
  trait TracingPolicyOptions extends StObject {
    
    /**
      * User agent used to better identify the outgoing requests traced by the tracing policy.
      */
    var userAgent: js.UndefOr[String] = js.undefined
  }
  object TracingPolicyOptions {
    
    inline def apply(): TracingPolicyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TracingPolicyOptions]
    }
    
    extension [Self <: TracingPolicyOptions](x: Self) {
      
      inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
    }
  }
}
