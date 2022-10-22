package typingsJapgolly.chromeApps

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AppView {
  
  /////////////////
  // AppView Tag //
  /////////////////
  /**
    * Use the appview tag to embed other Chrome Apps within your Chrome App.
    * The appview runs in a separate process from your app,
    * it doesn't inherit the same permissions and is only allowed
    * to interact with your app through asynchronous APIs.
    * Not all apps can be embedded; apps have to explicitly allow themselves to be embedded.
    * @since Chrome 43.
    * @requires Permissions: 'appview'
    * @see[Documentation]{@link https://developer.chrome.com/apps/tags/appview}
    */
  /* was `typeof HTMLAppViewElement` */
  type ^ = HTMLAppViewElement
  
  trait EmbedRequest extends StObject {
    
    /**
      * Allows the embedding request
      * @param url Specifies the content to be embedded.
      */
    def allow(url: String): Unit
    
    /** Optional developer specified data that the app to be embedded can use when making an embedding decision. */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Prevents the embedding request */
    def deny(): Unit
    
    /** The ID of the app that sent the embedding request. */
    var embedderId: String
  }
  object EmbedRequest {
    
    inline def apply(allow: String => Callback, deny: Callback, embedderId: String): EmbedRequest = {
      val __obj = js.Dynamic.literal(allow = js.Any.fromFunction1((t0: String) => allow(t0).runNow()), deny = deny.toJsFn, embedderId = embedderId.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmbedRequest]
    }
    
    extension [Self <: EmbedRequest](x: Self) {
      
      inline def setAllow(value: String => Callback): Self = StObject.set(x, "allow", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDeny(value: Callback): Self = StObject.set(x, "deny", value.toJsFn)
      
      inline def setEmbedderId(value: String): Self = StObject.set(x, "embedderId", value.asInstanceOf[js.Any])
    }
  }
}
