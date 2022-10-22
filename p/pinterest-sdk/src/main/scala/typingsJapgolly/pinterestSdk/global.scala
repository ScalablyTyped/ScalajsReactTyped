package typingsJapgolly.pinterestSdk

import typingsJapgolly.pinterestSdk.mod.HttpMethod
import typingsJapgolly.pinterestSdk.mod.InitOptions
import typingsJapgolly.pinterestSdk.mod.LoginOptions
import typingsJapgolly.pinterestSdk.mod.OauthSession
import typingsJapgolly.pinterestSdk.mod.PinData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object PDK {
    
    @JSGlobal("PDK")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("PDK.HttpMethod")
    @js.native
    object HttpMethod extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.pinterestSdk.mod.HttpMethod & Double] = js.native
      
      /* 3 */ val delete: typingsJapgolly.pinterestSdk.mod.HttpMethod.delete & Double = js.native
      
      /* 0 */ val get: typingsJapgolly.pinterestSdk.mod.HttpMethod.get & Double = js.native
      
      /* 2 */ val post: typingsJapgolly.pinterestSdk.mod.HttpMethod.post & Double = js.native
      
      /* 1 */ val put: typingsJapgolly.pinterestSdk.mod.HttpMethod.put & Double = js.native
    }
    
    @JSGlobal("PDK.OAuthScopes")
    @js.native
    object OAuthScopes extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.pinterestSdk.mod.OAuthScopes & Double] = js.native
      
      /* 0 */ val read_public: typingsJapgolly.pinterestSdk.mod.OAuthScopes.read_public & Double = js.native
      
      /* 2 */ val read_relationships: typingsJapgolly.pinterestSdk.mod.OAuthScopes.read_relationships & Double = js.native
      
      /* 1 */ val write_public: typingsJapgolly.pinterestSdk.mod.OAuthScopes.write_public & Double = js.native
      
      /* 3 */ val write_relationships: typingsJapgolly.pinterestSdk.mod.OAuthScopes.write_relationships & Double = js.native
    }
    
    inline def getSession(): OauthSession = ^.asInstanceOf[js.Dynamic].applyDynamic("getSession")().asInstanceOf[OauthSession]
    
    inline def init(options: InitOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def login(options: LoginOptions, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("login")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def logout(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logout")().asInstanceOf[Unit]
    inline def logout(callback: js.Function1[/* session */ OauthSession, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logout")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def me(callback: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("me")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def me(path: String, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("me")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def me(path: String, params: js.Object, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("me")(path.asInstanceOf[js.Any], params.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def pin(imageUrl: String, note: String, url: String, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pin")(imageUrl.asInstanceOf[js.Any], note.asInstanceOf[js.Any], url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def request(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def request(path: String, httpMethod: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(path.asInstanceOf[js.Any], httpMethod.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def request(path: String, httpMethod: String, data: Unit, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(path.asInstanceOf[js.Any], httpMethod.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def request(path: String, httpMethod: String, data: PinData): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(path.asInstanceOf[js.Any], httpMethod.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def request(path: String, httpMethod: String, data: PinData, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(path.asInstanceOf[js.Any], httpMethod.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def request(path: String, httpMethod: Unit, data: Unit, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(path.asInstanceOf[js.Any], httpMethod.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def request(path: String, httpMethod: Unit, data: PinData): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(path.asInstanceOf[js.Any], httpMethod.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def request(path: String, httpMethod: Unit, data: PinData, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(path.asInstanceOf[js.Any], httpMethod.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def request(path: String, httpMethod: HttpMethod): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(path.asInstanceOf[js.Any], httpMethod.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def request(path: String, httpMethod: HttpMethod, data: Unit, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(path.asInstanceOf[js.Any], httpMethod.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def request(path: String, httpMethod: HttpMethod, data: PinData): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(path.asInstanceOf[js.Any], httpMethod.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def request(path: String, httpMethod: HttpMethod, data: PinData, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(path.asInstanceOf[js.Any], httpMethod.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setSession(session: OauthSession): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSession")(session.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def setSession(session: OauthSession, callback: js.Function1[/* session */ OauthSession, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setSession")(session.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
