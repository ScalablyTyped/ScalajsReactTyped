package typingsJapgolly.persona

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Persona {
  
  trait GetOptions extends StObject {
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var privacyPolicy: js.UndefOr[String] = js.undefined
    
    var siteLogo: js.UndefOr[String] = js.undefined
    
    var siteName: js.UndefOr[String] = js.undefined
    
    var termsOfService: js.UndefOr[String] = js.undefined
  }
  object GetOptions {
    
    inline def apply(): GetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetOptions]
    }
    
    extension [Self <: GetOptions](x: Self) {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setPrivacyPolicy(value: String): Self = StObject.set(x, "privacyPolicy", value.asInstanceOf[js.Any])
      
      inline def setPrivacyPolicyUndefined: Self = StObject.set(x, "privacyPolicy", js.undefined)
      
      inline def setSiteLogo(value: String): Self = StObject.set(x, "siteLogo", value.asInstanceOf[js.Any])
      
      inline def setSiteLogoUndefined: Self = StObject.set(x, "siteLogo", js.undefined)
      
      inline def setSiteName(value: String): Self = StObject.set(x, "siteName", value.asInstanceOf[js.Any])
      
      inline def setSiteNameUndefined: Self = StObject.set(x, "siteName", js.undefined)
      
      inline def setTermsOfService(value: String): Self = StObject.set(x, "termsOfService", value.asInstanceOf[js.Any])
      
      inline def setTermsOfServiceUndefined: Self = StObject.set(x, "termsOfService", js.undefined)
    }
  }
  
  @js.native
  trait Persona extends StObject {
    
    def get(gotAssertion: js.Function1[/* s */ String, Unit]): Unit = js.native
    def get(gotAssertion: js.Function1[/* s */ String, Unit], options: GetOptions): Unit = js.native
    
    def logout(): Unit = js.native
    
    def request(): Unit = js.native
    def request(options: RequestOptions): Unit = js.native
    
    def watch(options: WatchOptions): Unit = js.native
  }
  
  trait RequestOptions extends StObject {
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var oncancel: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var privacyPolicy: js.UndefOr[String] = js.undefined
    
    var returnTo: js.UndefOr[String] = js.undefined
    
    var siteLogo: js.UndefOr[String] = js.undefined
    
    var siteName: js.UndefOr[String] = js.undefined
    
    var termsOfService: js.UndefOr[String] = js.undefined
  }
  object RequestOptions {
    
    inline def apply(): RequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestOptions]
    }
    
    extension [Self <: RequestOptions](x: Self) {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setOncancel(value: Callback): Self = StObject.set(x, "oncancel", value.toJsFn)
      
      inline def setOncancelUndefined: Self = StObject.set(x, "oncancel", js.undefined)
      
      inline def setPrivacyPolicy(value: String): Self = StObject.set(x, "privacyPolicy", value.asInstanceOf[js.Any])
      
      inline def setPrivacyPolicyUndefined: Self = StObject.set(x, "privacyPolicy", js.undefined)
      
      inline def setReturnTo(value: String): Self = StObject.set(x, "returnTo", value.asInstanceOf[js.Any])
      
      inline def setReturnToUndefined: Self = StObject.set(x, "returnTo", js.undefined)
      
      inline def setSiteLogo(value: String): Self = StObject.set(x, "siteLogo", value.asInstanceOf[js.Any])
      
      inline def setSiteLogoUndefined: Self = StObject.set(x, "siteLogo", js.undefined)
      
      inline def setSiteName(value: String): Self = StObject.set(x, "siteName", value.asInstanceOf[js.Any])
      
      inline def setSiteNameUndefined: Self = StObject.set(x, "siteName", js.undefined)
      
      inline def setTermsOfService(value: String): Self = StObject.set(x, "termsOfService", value.asInstanceOf[js.Any])
      
      inline def setTermsOfServiceUndefined: Self = StObject.set(x, "termsOfService", js.undefined)
    }
  }
  
  trait WatchOptions extends StObject {
    
    var loggedInUser: String
    
    def onlogin(s: String): Unit
    
    def onlogout(): Unit
    
    var onready: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object WatchOptions {
    
    inline def apply(loggedInUser: String, onlogin: String => Callback, onlogout: Callback): WatchOptions = {
      val __obj = js.Dynamic.literal(loggedInUser = loggedInUser.asInstanceOf[js.Any], onlogin = js.Any.fromFunction1((t0: String) => onlogin(t0).runNow()), onlogout = onlogout.toJsFn)
      __obj.asInstanceOf[WatchOptions]
    }
    
    extension [Self <: WatchOptions](x: Self) {
      
      inline def setLoggedInUser(value: String): Self = StObject.set(x, "loggedInUser", value.asInstanceOf[js.Any])
      
      inline def setOnlogin(value: String => Callback): Self = StObject.set(x, "onlogin", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setOnlogout(value: Callback): Self = StObject.set(x, "onlogout", value.toJsFn)
      
      inline def setOnready(value: Callback): Self = StObject.set(x, "onready", value.toJsFn)
      
      inline def setOnreadyUndefined: Self = StObject.set(x, "onready", js.undefined)
    }
  }
}
