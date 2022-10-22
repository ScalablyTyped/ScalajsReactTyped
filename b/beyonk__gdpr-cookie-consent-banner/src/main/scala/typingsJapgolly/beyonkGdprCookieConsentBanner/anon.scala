package typingsJapgolly.beyonkGdprCookieConsentBanner

import japgolly.scalajs.react.Callback
import typingsJapgolly.beyonkGdprCookieConsentBanner.beyonkGdprCookieConsentBannerBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Domain extends StObject {
    
    var domain: String
    
    var path: String
  }
  object Domain {
    
    inline def apply(domain: String, path: String): Domain = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Domain]
    }
    
    extension [Self <: Domain](x: Self) {
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<std.Record<@beyonk/gdpr-cookie-consent-banner.Category, @beyonk/gdpr-cookie-consent-banner.Choice | false>> */
  trait PartialRecordCategoryChoi extends StObject {
    
    var analytics: js.UndefOr[Choice | `false`] = js.undefined
    
    var marketing: js.UndefOr[Choice | `false`] = js.undefined
    
    var necessary: js.UndefOr[Choice | `false`] = js.undefined
    
    var tracking: js.UndefOr[Choice | `false`] = js.undefined
  }
  object PartialRecordCategoryChoi {
    
    inline def apply(): PartialRecordCategoryChoi = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRecordCategoryChoi]
    }
    
    extension [Self <: PartialRecordCategoryChoi](x: Self) {
      
      inline def setAnalytics(value: Choice | `false`): Self = StObject.set(x, "analytics", value.asInstanceOf[js.Any])
      
      inline def setAnalyticsUndefined: Self = StObject.set(x, "analytics", js.undefined)
      
      inline def setMarketing(value: Choice | `false`): Self = StObject.set(x, "marketing", value.asInstanceOf[js.Any])
      
      inline def setMarketingUndefined: Self = StObject.set(x, "marketing", js.undefined)
      
      inline def setNecessary(value: Choice | `false`): Self = StObject.set(x, "necessary", value.asInstanceOf[js.Any])
      
      inline def setNecessaryUndefined: Self = StObject.set(x, "necessary", js.undefined)
      
      inline def setTracking(value: Choice | `false`): Self = StObject.set(x, "tracking", value.asInstanceOf[js.Any])
      
      inline def setTrackingUndefined: Self = StObject.set(x, "tracking", js.undefined)
    }
  }
  
  /* Inlined std.Partial<std.Record<@beyonk/gdpr-cookie-consent-banner.Category, (): void>> */
  trait PartialRecordCategoryvoid extends StObject {
    
    var analytics: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var marketing: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var necessary: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var tracking: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object PartialRecordCategoryvoid {
    
    inline def apply(): PartialRecordCategoryvoid = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRecordCategoryvoid]
    }
    
    extension [Self <: PartialRecordCategoryvoid](x: Self) {
      
      inline def setAnalytics(value: Callback): Self = StObject.set(x, "analytics", value.toJsFn)
      
      inline def setAnalyticsUndefined: Self = StObject.set(x, "analytics", js.undefined)
      
      inline def setMarketing(value: Callback): Self = StObject.set(x, "marketing", value.toJsFn)
      
      inline def setMarketingUndefined: Self = StObject.set(x, "marketing", js.undefined)
      
      inline def setNecessary(value: Callback): Self = StObject.set(x, "necessary", value.toJsFn)
      
      inline def setNecessaryUndefined: Self = StObject.set(x, "necessary", js.undefined)
      
      inline def setTracking(value: Callback): Self = StObject.set(x, "tracking", value.toJsFn)
      
      inline def setTrackingUndefined: Self = StObject.set(x, "tracking", js.undefined)
    }
  }
}
