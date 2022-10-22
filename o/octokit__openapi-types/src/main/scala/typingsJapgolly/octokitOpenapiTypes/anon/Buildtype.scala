package typingsJapgolly.octokitOpenapiTypes.anon

import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.building
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.built
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.errored
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.legacy
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.pending
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.unverified
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.verified
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.workflow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Buildtype extends StObject {
  
  /**
    * @description The process in which the Page will be built.
    * @example legacy
    * @enum {string|null}
    */
  var build_type: js.UndefOr[legacy | workflow | Null] = js.undefined
  
  /**
    * @description The Pages site's custom domain
    * @example example.com
    */
  var cname: String | Null
  
  /**
    * @description Whether the Page has a custom 404 page.
    * @default false
    * @example false
    */
  var custom_404: Boolean
  
  /**
    * Format: uri
    * @description The web address the Page can be accessed from.
    * @example https://example.com
    */
  var html_url: js.UndefOr[String] = js.undefined
  
  var https_certificate: js.UndefOr[Domains] = js.undefined
  
  /**
    * @description Whether https is enabled on the domain
    * @example true
    */
  var https_enforced: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Format: date-time
    * @description The timestamp when a pending domain becomes unverified.
    */
  var pending_domain_unverified_at: js.UndefOr[String | Null] = js.undefined
  
  /**
    * @description The state if the domain is verified
    * @example pending
    * @enum {string|null}
    */
  var protected_domain_state: js.UndefOr[pending | verified | unverified | Null] = js.undefined
  
  /**
    * @description Whether the GitHub Pages site is publicly visible. If set to `true`, the site is accessible to anyone on the internet. If set to `false`, the site will only be accessible to users who have at least `read` access to the repository that published the site.
    * @example true
    */
  var public: Boolean
  
  var source: js.UndefOr[Branch] = js.undefined
  
  /**
    * @description The status of the most recent build of the Page.
    * @example built
    * @enum {string|null}
    */
  var status: built | building | errored | Null
  
  /**
    * Format: uri
    * @description The API address for accessing this Page resource.
    * @example https://api.github.com/repos/github/hello-world/pages
    */
  var url: String
}
object Buildtype {
  
  inline def apply(custom_404: Boolean, public: Boolean, url: String): Buildtype = {
    val __obj = js.Dynamic.literal(custom_404 = custom_404.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], cname = null, status = null)
    __obj.asInstanceOf[Buildtype]
  }
  
  extension [Self <: Buildtype](x: Self) {
    
    inline def setBuild_type(value: legacy | workflow): Self = StObject.set(x, "build_type", value.asInstanceOf[js.Any])
    
    inline def setBuild_typeNull: Self = StObject.set(x, "build_type", null)
    
    inline def setBuild_typeUndefined: Self = StObject.set(x, "build_type", js.undefined)
    
    inline def setCname(value: String): Self = StObject.set(x, "cname", value.asInstanceOf[js.Any])
    
    inline def setCnameNull: Self = StObject.set(x, "cname", null)
    
    inline def setCustom_404(value: Boolean): Self = StObject.set(x, "custom_404", value.asInstanceOf[js.Any])
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setHtml_urlUndefined: Self = StObject.set(x, "html_url", js.undefined)
    
    inline def setHttps_certificate(value: Domains): Self = StObject.set(x, "https_certificate", value.asInstanceOf[js.Any])
    
    inline def setHttps_certificateUndefined: Self = StObject.set(x, "https_certificate", js.undefined)
    
    inline def setHttps_enforced(value: Boolean): Self = StObject.set(x, "https_enforced", value.asInstanceOf[js.Any])
    
    inline def setHttps_enforcedUndefined: Self = StObject.set(x, "https_enforced", js.undefined)
    
    inline def setPending_domain_unverified_at(value: String): Self = StObject.set(x, "pending_domain_unverified_at", value.asInstanceOf[js.Any])
    
    inline def setPending_domain_unverified_atNull: Self = StObject.set(x, "pending_domain_unverified_at", null)
    
    inline def setPending_domain_unverified_atUndefined: Self = StObject.set(x, "pending_domain_unverified_at", js.undefined)
    
    inline def setProtected_domain_state(value: pending | verified | unverified): Self = StObject.set(x, "protected_domain_state", value.asInstanceOf[js.Any])
    
    inline def setProtected_domain_stateNull: Self = StObject.set(x, "protected_domain_state", null)
    
    inline def setProtected_domain_stateUndefined: Self = StObject.set(x, "protected_domain_state", js.undefined)
    
    inline def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    
    inline def setSource(value: Branch): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setStatus(value: built | building | errored): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
