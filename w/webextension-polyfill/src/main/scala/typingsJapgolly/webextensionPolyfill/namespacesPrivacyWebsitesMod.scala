package typingsJapgolly.webextensionPolyfill

import typingsJapgolly.webextensionPolyfill.namespacesTypesMod.Types.Setting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namespacesPrivacyWebsitesMod {
  
  object PrivacyWebsites {
    
    /**
      * The settings for cookies.
      */
    trait CookieConfig extends StObject {
      
      /**
        * The type of cookies to allow.
        * Optional.
        */
      var behavior: js.UndefOr[CookieConfigBehaviorEnum] = js.undefined
    }
    object CookieConfig {
      
      inline def apply(): CookieConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CookieConfig]
      }
      
      extension [Self <: CookieConfig](x: Self) {
        
        inline def setBehavior(value: CookieConfigBehaviorEnum): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
        
        inline def setBehaviorUndefined: Self = StObject.set(x, "behavior", js.undefined)
      }
    }
    
    /**
      * The type of cookies to allow.
      */
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.allow_all
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.reject_all
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.reject_third_party
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.allow_visited
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.reject_trackers
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.reject_trackers_and_partition_foreign
    */
    trait CookieConfigBehaviorEnum extends StObject
    object CookieConfigBehaviorEnum {
      
      inline def allow_all: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.allow_all = "allow_all".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.allow_all]
      
      inline def allow_visited: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.allow_visited = "allow_visited".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.allow_visited]
      
      inline def reject_all: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.reject_all = "reject_all".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.reject_all]
      
      inline def reject_third_party: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.reject_third_party = "reject_third_party".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.reject_third_party]
      
      inline def reject_trackers: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.reject_trackers = "reject_trackers".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.reject_trackers]
      
      inline def reject_trackers_and_partition_foreign: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.reject_trackers_and_partition_foreign = "reject_trackers_and_partition_foreign".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.reject_trackers_and_partition_foreign]
    }
    
    trait Static extends StObject {
      
      /**
        * Allow users to specify the default settings for allowing cookies, as well as whether all cookies should be created as
        * non-persistent cookies. This setting's value is of type CookieConfig.
        */
      var cookieConfig: Setting
      
      /**
        * If enabled, the browser will associate all data (including cookies, HSTS data, cached images, and more)
        * for any third party domains with the domain in the address bar. This prevents third party trackers from using directly
        * stored information to identify you across different websites, but may break websites where you login with a third party
        * account (such as a Facebook or Google login.) The value of this preference is of type boolean,
        * and the default value is <code>false</code>.
        */
      var firstPartyIsolate: Setting
      
      /**
        * If enabled, the browser sends auditing pings when requested by a website (<code>&lt;a ping&gt;</code>).
        * The value of this preference is of type boolean, and the default value is <code>true</code>.
        */
      var hyperlinkAuditingEnabled: Setting
      
      /**
        * If enabled, the browser sends <code>referer</code> headers with your requests. Yes,
        * the name of this preference doesn't match the misspelled header. No, we're not going to change it.
        * The value of this preference is of type boolean, and the default value is <code>true</code>.
        */
      var referrersEnabled: Setting
      
      /**
        * If enabled, the browser attempts to appear similar to other users by reporting generic information to websites.
        * This can prevent websites from uniquely identifying users. Examples of data that is spoofed include number of CPU cores,
        * precision of JavaScript timers, the local timezone, and disabling features such as GamePad support,
        * and the WebSpeech and Navigator APIs. The value of this preference is of type boolean, and the default value is <code>
        * false</code>.
        */
      var resistFingerprinting: Setting
      
      /**
        * Allow users to specify the mode for tracking protection. This setting's value is of type TrackingProtectionModeOption,
        * defaulting to <code>private_browsing_only</code>.
        */
      var trackingProtectionMode: Setting
    }
    object Static {
      
      inline def apply(
        cookieConfig: Setting,
        firstPartyIsolate: Setting,
        hyperlinkAuditingEnabled: Setting,
        referrersEnabled: Setting,
        resistFingerprinting: Setting,
        trackingProtectionMode: Setting
      ): Static = {
        val __obj = js.Dynamic.literal(cookieConfig = cookieConfig.asInstanceOf[js.Any], firstPartyIsolate = firstPartyIsolate.asInstanceOf[js.Any], hyperlinkAuditingEnabled = hyperlinkAuditingEnabled.asInstanceOf[js.Any], referrersEnabled = referrersEnabled.asInstanceOf[js.Any], resistFingerprinting = resistFingerprinting.asInstanceOf[js.Any], trackingProtectionMode = trackingProtectionMode.asInstanceOf[js.Any])
        __obj.asInstanceOf[Static]
      }
      
      extension [Self <: Static](x: Self) {
        
        inline def setCookieConfig(value: Setting): Self = StObject.set(x, "cookieConfig", value.asInstanceOf[js.Any])
        
        inline def setFirstPartyIsolate(value: Setting): Self = StObject.set(x, "firstPartyIsolate", value.asInstanceOf[js.Any])
        
        inline def setHyperlinkAuditingEnabled(value: Setting): Self = StObject.set(x, "hyperlinkAuditingEnabled", value.asInstanceOf[js.Any])
        
        inline def setReferrersEnabled(value: Setting): Self = StObject.set(x, "referrersEnabled", value.asInstanceOf[js.Any])
        
        inline def setResistFingerprinting(value: Setting): Self = StObject.set(x, "resistFingerprinting", value.asInstanceOf[js.Any])
        
        inline def setTrackingProtectionMode(value: Setting): Self = StObject.set(x, "trackingProtectionMode", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The mode for tracking protection.
      */
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.always
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.never
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.private_browsing
    */
    trait TrackingProtectionModeOption extends StObject
    object TrackingProtectionModeOption {
      
      inline def always: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.always = "always".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.always]
      
      inline def never: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.never = "never".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.never]
      
      inline def private_browsing: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.private_browsing = "private_browsing".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.private_browsing]
    }
  }
}
