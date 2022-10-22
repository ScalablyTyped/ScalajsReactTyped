package typingsJapgolly.azureCoreHttp

import typingsJapgolly.azureCoreHttp.anon.CustomNoProxyList
import typingsJapgolly.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.BaseRequestPolicy
import typingsJapgolly.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.RequestPolicy
import typingsJapgolly.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.RequestPolicyFactory
import typingsJapgolly.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.RequestPolicyOptions
import typingsJapgolly.azureCoreHttp.typesLatestSrcServiceClientMod.ProxySettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLatestSrcPoliciesProxyPolicyMod {
  
  @JSImport("@azure/core-http/types/latest/src/policies/proxyPolicy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@azure/core-http/types/latest/src/policies/proxyPolicy", "ProxyPolicy")
  @js.native
  open class ProxyPolicy_ protected () extends BaseRequestPolicy {
    def this(nextPolicy: RequestPolicy, options: RequestPolicyOptions, proxySettings: ProxySettings) = this()
    def this(
      nextPolicy: RequestPolicy,
      options: RequestPolicyOptions,
      proxySettings: ProxySettings,
      customNoProxyList: js.Array[String]
    ) = this()
    
    /* private */ var customNoProxyList: Any = js.native
    
    var proxySettings: ProxySettings = js.native
  }
  
  inline def getDefaultProxySettings(): js.UndefOr[ProxySettings] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultProxySettings")().asInstanceOf[js.UndefOr[ProxySettings]]
  inline def getDefaultProxySettings(proxyUrl: String): js.UndefOr[ProxySettings] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultProxySettings")(proxyUrl.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ProxySettings]]
  
  @JSImport("@azure/core-http/types/latest/src/policies/proxyPolicy", "globalNoProxyList")
  @js.native
  val globalNoProxyList: js.Array[String] = js.native
  
  inline def loadNoProxy(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadNoProxy")().asInstanceOf[js.Array[String]]
  
  inline def proxyPolicy(): RequestPolicyFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("proxyPolicy")().asInstanceOf[RequestPolicyFactory]
  inline def proxyPolicy(proxySettings: Unit, options: CustomNoProxyList): RequestPolicyFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("proxyPolicy")(proxySettings.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RequestPolicyFactory]
  inline def proxyPolicy(proxySettings: ProxySettings): RequestPolicyFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("proxyPolicy")(proxySettings.asInstanceOf[js.Any]).asInstanceOf[RequestPolicyFactory]
  inline def proxyPolicy(proxySettings: ProxySettings, options: CustomNoProxyList): RequestPolicyFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("proxyPolicy")(proxySettings.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RequestPolicyFactory]
}
