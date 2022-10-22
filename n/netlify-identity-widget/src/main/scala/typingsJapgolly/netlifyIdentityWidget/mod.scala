package typingsJapgolly.netlifyIdentityWidget

import typingsJapgolly.netlifyIdentityWidget.anon.ApiURL
import typingsJapgolly.netlifyIdentityWidget.anon.Avatarurl
import typingsJapgolly.netlifyIdentityWidget.anon.Provider
import typingsJapgolly.netlifyIdentityWidget.netlifyIdentityWidgetStrings.close
import typingsJapgolly.netlifyIdentityWidget.netlifyIdentityWidgetStrings.error
import typingsJapgolly.netlifyIdentityWidget.netlifyIdentityWidgetStrings.init
import typingsJapgolly.netlifyIdentityWidget.netlifyIdentityWidgetStrings.login
import typingsJapgolly.netlifyIdentityWidget.netlifyIdentityWidgetStrings.logout
import typingsJapgolly.netlifyIdentityWidget.netlifyIdentityWidgetStrings.open
import typingsJapgolly.netlifyIdentityWidget.netlifyIdentityWidgetStrings.signup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("netlify-identity-widget", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def close(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("close")().asInstanceOf[Unit]
  
  inline def currentUser(): User | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("currentUser")().asInstanceOf[User | Null]
  
  inline def init(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Unit]
  inline def init(opts: InitOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(opts.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def logout(): js.UndefOr[js.Promise[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("logout")().asInstanceOf[js.UndefOr[js.Promise[Unit]]]
  
  inline def off(event: logout | open | close): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def off(event: logout | open | close, cb: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(event.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def off_error(event: error): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def off_error(event: error, cb: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(event.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def off_init(event: init): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def off_init(event: init, cb: js.Function1[/* user */ User | Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(event.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def off_login(event: login): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def off_login(event: login, cb: js.Function1[/* user */ User, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(event.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on(event: logout | open | close, cb: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_error(event: error, cb: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_init(event: init, cb: js.Function1[/* user */ User | Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_login(event: login, cb: js.Function1[/* user */ User, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def open(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("open")().asInstanceOf[Unit]
  inline def open(tabName: signup | login): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(tabName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def refresh(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("refresh")().asInstanceOf[js.Promise[String]]
  inline def refresh(force: Boolean): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("refresh")(force.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def setLocale(locale: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLocale")(locale.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait InitOptions extends StObject {
    
    // Absolute url to endpoint. ONLY USE IN SPECIAL CASES!
    // e.g. https://www.example.com/.netlify/functions/identity
    // Generally avoid setting the APIUrl. You should only set this when
    // your app is served from a domain that differs from where the
    // identity endpoint is served.This is common for Cordova or Electron
    // apps where you host from localhost or a file.
    var APIUrl: js.UndefOr[String] = js.undefined
    
    // The container to attach to. e.g.: '#some-query-selector'
    var container: js.UndefOr[String] = js.undefined
    
    // Initial language
    var locale: js.UndefOr[String] = js.undefined
    
    // Enable Netlify logo
    var logo: js.UndefOr[Boolean] = js.undefined
    
    // custom placeholder for name input form
    var namePlaceholder: js.UndefOr[String] = js.undefined
  }
  object InitOptions {
    
    inline def apply(): InitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InitOptions]
    }
    
    extension [Self <: InitOptions](x: Self) {
      
      inline def setAPIUrl(value: String): Self = StObject.set(x, "APIUrl", value.asInstanceOf[js.Any])
      
      inline def setAPIUrlUndefined: Self = StObject.set(x, "APIUrl", js.undefined)
      
      inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setLogo(value: Boolean): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
      
      inline def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
      
      inline def setNamePlaceholder(value: String): Self = StObject.set(x, "namePlaceholder", value.asInstanceOf[js.Any])
      
      inline def setNamePlaceholderUndefined: Self = StObject.set(x, "namePlaceholder", js.undefined)
    }
  }
  
  trait Token extends StObject {
    
    var access_token: String
    
    var expires_at: String | Double
    
    var expires_in: String | Double
    
    var refresh_token: String
    
    var token_type: String
  }
  object Token {
    
    inline def apply(
      access_token: String,
      expires_at: String | Double,
      expires_in: String | Double,
      refresh_token: String,
      token_type: String
    ): Token = {
      val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], expires_at = expires_at.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any], refresh_token = refresh_token.asInstanceOf[js.Any], token_type = token_type.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    extension [Self <: Token](x: Self) {
      
      inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      inline def setExpires_at(value: String | Double): Self = StObject.set(x, "expires_at", value.asInstanceOf[js.Any])
      
      inline def setExpires_in(value: String | Double): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
      
      inline def setRefresh_token(value: String): Self = StObject.set(x, "refresh_token", value.asInstanceOf[js.Any])
      
      inline def setToken_type(value: String): Self = StObject.set(x, "token_type", value.asInstanceOf[js.Any])
    }
  }
  
  trait User extends StObject {
    
    var api: ApiURL
    
    var app_metadata: Provider
    
    var aud: String
    
    var audience: js.UndefOr[Any] = js.undefined
    
    var confirmed_at: String
    
    var created_at: String
    
    var email: String
    
    var id: String
    
    var invited_at: String
    
    var recovery_sent_at: String
    
    var role: String
    
    var token: js.UndefOr[Token] = js.undefined
    
    var updated_at: String
    
    var url: String
    
    var user_metadata: Avatarurl | Null
  }
  object User {
    
    inline def apply(
      api: ApiURL,
      app_metadata: Provider,
      aud: String,
      confirmed_at: String,
      created_at: String,
      email: String,
      id: String,
      invited_at: String,
      recovery_sent_at: String,
      role: String,
      updated_at: String,
      url: String
    ): User = {
      val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], app_metadata = app_metadata.asInstanceOf[js.Any], aud = aud.asInstanceOf[js.Any], confirmed_at = confirmed_at.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invited_at = invited_at.asInstanceOf[js.Any], recovery_sent_at = recovery_sent_at.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user_metadata = null)
      __obj.asInstanceOf[User]
    }
    
    extension [Self <: User](x: Self) {
      
      inline def setApi(value: ApiURL): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      inline def setApp_metadata(value: Provider): Self = StObject.set(x, "app_metadata", value.asInstanceOf[js.Any])
      
      inline def setAud(value: String): Self = StObject.set(x, "aud", value.asInstanceOf[js.Any])
      
      inline def setAudience(value: Any): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
      
      inline def setConfirmed_at(value: String): Self = StObject.set(x, "confirmed_at", value.asInstanceOf[js.Any])
      
      inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInvited_at(value: String): Self = StObject.set(x, "invited_at", value.asInstanceOf[js.Any])
      
      inline def setRecovery_sent_at(value: String): Self = StObject.set(x, "recovery_sent_at", value.asInstanceOf[js.Any])
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setToken(value: Token): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      
      inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUser_metadata(value: Avatarurl): Self = StObject.set(x, "user_metadata", value.asInstanceOf[js.Any])
      
      inline def setUser_metadataNull: Self = StObject.set(x, "user_metadata", null)
    }
  }
}
