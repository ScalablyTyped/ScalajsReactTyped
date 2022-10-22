package typingsJapgolly.firefoxWebextBrowser.browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Permissions: `privacy`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object privacy {
  
  /**
    * Use the `browser.privacy` API to control usage of the features in the browser that can affect a user's privacy.
    *
    * Permissions: `privacy`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  object network {
    
    /** The mode for https-only mode. */
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.always
      - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.private_browsing
      - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.never
    */
    trait HTTPSOnlyModeOption extends StObject
    object HTTPSOnlyModeOption {
      
      inline def always: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.always = "always".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.always]
      
      inline def never: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.never = "never".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.never]
      
      inline def private_browsing: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.private_browsing = "private_browsing".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.private_browsing]
    }
    
    /* privacy.network types */
    /** The IP handling policy of WebRTC. */
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.default
      - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.default_public_and_private_interfaces
      - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.default_public_interface_only
      - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.disable_non_proxied_udp
      - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.proxy_only
    */
    trait IPHandlingPolicy extends StObject
    object IPHandlingPolicy {
      
      inline def default: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.default = "default".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.default]
      
      inline def default_public_and_private_interfaces: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.default_public_and_private_interfaces = "default_public_and_private_interfaces".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.default_public_and_private_interfaces]
      
      inline def default_public_interface_only: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.default_public_interface_only = "default_public_interface_only".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.default_public_interface_only]
      
      inline def disable_non_proxied_udp: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.disable_non_proxied_udp = "disable_non_proxied_udp".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.disable_non_proxied_udp]
      
      inline def proxy_only: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.proxy_only = "proxy_only".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.proxy_only]
    }
    
    /** The maximum TLS version supported. */
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1
      - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot1
      - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot2
      - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot3
      - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown
    */
    trait TlsVersionRestrictionConfigMaximum extends StObject
    object TlsVersionRestrictionConfigMaximum {
      
      inline def TLSv1: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1 = "TLSv1".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1]
      
      inline def TLSv1Dot1: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot1 = "TLSv1.1".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot1]
      
      inline def TLSv1Dot2: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot2 = "TLSv1.2".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot2]
      
      inline def TLSv1Dot3: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot3 = "TLSv1.3".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot3]
      
      inline def unknown: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown = "unknown".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown]
    }
    
    /** The minimum TLS version supported. */
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1
      - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot1
      - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot2
      - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot3
      - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown
    */
    trait TlsVersionRestrictionConfigMinimum extends StObject
    object TlsVersionRestrictionConfigMinimum {
      
      inline def TLSv1: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1 = "TLSv1".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1]
      
      inline def TLSv1Dot1: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot1 = "TLSv1.1".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot1]
      
      inline def TLSv1Dot2: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot2 = "TLSv1.2".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot2]
      
      inline def TLSv1Dot3: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot3 = "TLSv1.3".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot3]
      
      inline def unknown: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown = "unknown".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown]
    }
    
    /** An object which describes TLS minimum and maximum versions. */
    trait tlsVersionRestrictionConfig extends StObject {
      
      /** The maximum TLS version supported. */
      var maximum: js.UndefOr[TlsVersionRestrictionConfigMaximum] = js.undefined
      
      /** The minimum TLS version supported. */
      var minimum: js.UndefOr[TlsVersionRestrictionConfigMinimum] = js.undefined
    }
    object tlsVersionRestrictionConfig {
      
      inline def apply(): tlsVersionRestrictionConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[tlsVersionRestrictionConfig]
      }
      
      extension [Self <: tlsVersionRestrictionConfig](x: Self) {
        
        inline def setMaximum(value: TlsVersionRestrictionConfigMaximum): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
        
        inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
        
        inline def setMinimum(value: TlsVersionRestrictionConfigMinimum): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
        
        inline def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
      }
    }
  }
  
  /**
    * Use the `browser.privacy` API to control usage of the features in the browser that can affect a user's privacy.
    *
    * Permissions: `privacy`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  object websites {
    
    /** The settings for cookies. */
    trait CookieConfig extends StObject {
      
      /** The type of cookies to allow. */
      var behavior: js.UndefOr[CookieConfigBehavior] = js.undefined
      
      /** Whether to create all cookies as nonPersistent (i.e., session) cookies. */
      var nonPersistentCookies: js.UndefOr[Boolean] = js.undefined
    }
    object CookieConfig {
      
      inline def apply(): CookieConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CookieConfig]
      }
      
      extension [Self <: CookieConfig](x: Self) {
        
        inline def setBehavior(value: CookieConfigBehavior): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
        
        inline def setBehaviorUndefined: Self = StObject.set(x, "behavior", js.undefined)
        
        inline def setNonPersistentCookies(value: Boolean): Self = StObject.set(x, "nonPersistentCookies", value.asInstanceOf[js.Any])
        
        inline def setNonPersistentCookiesUndefined: Self = StObject.set(x, "nonPersistentCookies", js.undefined)
      }
    }
    
    /** The type of cookies to allow. */
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.allow_all
      - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.reject_all
      - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.reject_third_party
      - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.allow_visited
      - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.reject_trackers
      - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.reject_trackers_and_partition_foreign
    */
    trait CookieConfigBehavior extends StObject
    object CookieConfigBehavior {
      
      inline def allow_all: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.allow_all = "allow_all".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.allow_all]
      
      inline def allow_visited: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.allow_visited = "allow_visited".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.allow_visited]
      
      inline def reject_all: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.reject_all = "reject_all".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.reject_all]
      
      inline def reject_third_party: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.reject_third_party = "reject_third_party".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.reject_third_party]
      
      inline def reject_trackers: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.reject_trackers = "reject_trackers".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.reject_trackers]
      
      inline def reject_trackers_and_partition_foreign: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.reject_trackers_and_partition_foreign = "reject_trackers_and_partition_foreign".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.reject_trackers_and_partition_foreign]
    }
    
    /* privacy.websites types */
    /** The mode for tracking protection. */
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.always
      - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.never
      - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.private_browsing
    */
    trait TrackingProtectionModeOption extends StObject
    object TrackingProtectionModeOption {
      
      inline def always: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.always = "always".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.always]
      
      inline def never: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.never = "never".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.never]
      
      inline def private_browsing: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.private_browsing = "private_browsing".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.private_browsing]
    }
  }
}
