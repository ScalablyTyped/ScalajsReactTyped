package typingsJapgolly.oidcTokenManager

import typingsJapgolly.oidcTokenManager.Oidc.OidcClientSettings
import typingsJapgolly.oidcTokenManager.Oidc.OidcClientStatic
import typingsJapgolly.oidcTokenManager.Oidc.OidcTokenManagerSettings
import typingsJapgolly.oidcTokenManager.Oidc.OidcTokenManagerStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Oidc {
    
    @JSGlobal("Oidc.DefaultHttpRequest")
    @js.native
    open class DefaultHttpRequest ()
      extends StObject
         with typingsJapgolly.oidcTokenManager.Oidc.DefaultHttpRequest {
      
      /* CompleteClass */
      override def getJSON(url: String, config: Any): typingsJapgolly.oidcTokenManager.Oidc.DefaultPromise = js.native
    }
    
    @JSGlobal("Oidc.DefaultPromise")
    @js.native
    open class DefaultPromise protected ()
      extends StObject
         with typingsJapgolly.oidcTokenManager.Oidc.DefaultPromise {
      def this(promise: Any) = this()
      
      /* CompleteClass */
      override def `catch`(errorCallback: js.Function0[Unit]): typingsJapgolly.oidcTokenManager.Oidc.DefaultPromise = js.native
      
      /* CompleteClass */
      override def `then`(
        successCallback: js.Function1[/* value */ js.UndefOr[Any], Unit],
        errorCallback: js.Function1[/* reason */ js.UndefOr[Any], Unit]
      ): typingsJapgolly.oidcTokenManager.Oidc.DefaultPromise = js.native
    }
    
    @JSGlobal("Oidc.DefaultPromiseFactory")
    @js.native
    open class DefaultPromiseFactory ()
      extends StObject
         with typingsJapgolly.oidcTokenManager.Oidc.DefaultPromiseFactory {
      
      /* CompleteClass */
      override def create(callback: Any): typingsJapgolly.oidcTokenManager.Oidc.DefaultPromise = js.native
      
      /* CompleteClass */
      override def reject(reason: Any): typingsJapgolly.oidcTokenManager.Oidc.DefaultPromise = js.native
      
      /* CompleteClass */
      override def resolve(value: Any): typingsJapgolly.oidcTokenManager.Oidc.DefaultPromise = js.native
    }
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OidcClient")
  @js.native
  open class OidcClient protected ()
    extends StObject
       with typingsJapgolly.oidcTokenManager.Oidc.OidcTokenManager {
    def this(settings: OidcClientSettings) = this()
  }
  @JSGlobal("OidcClient")
  @js.native
  def OidcClient: OidcClientStatic = js.native
  inline def OidcClient_=(x: OidcClientStatic): Unit = js.Dynamic.global.updateDynamic("OidcClient")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OidcTokenManager")
  @js.native
  open class OidcTokenManager ()
    extends StObject
       with typingsJapgolly.oidcTokenManager.Oidc.OidcTokenManager {
    def this(settings: OidcTokenManagerSettings) = this()
  }
  @JSGlobal("OidcTokenManager")
  @js.native
  def OidcTokenManager: OidcTokenManagerStatic = js.native
  inline def OidcTokenManager_=(x: OidcTokenManagerStatic): Unit = js.Dynamic.global.updateDynamic("OidcTokenManager")(x.asInstanceOf[js.Any])
}
