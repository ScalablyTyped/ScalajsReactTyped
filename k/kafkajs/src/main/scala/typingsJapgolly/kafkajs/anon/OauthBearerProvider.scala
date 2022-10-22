package typingsJapgolly.kafkajs.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kafkajs.mod.OauthbearerProviderResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OauthBearerProvider extends StObject {
  
  def oauthBearerProvider(): js.Promise[OauthbearerProviderResponse]
}
object OauthBearerProvider {
  
  inline def apply(oauthBearerProvider: CallbackTo[js.Promise[OauthbearerProviderResponse]]): OauthBearerProvider = {
    val __obj = js.Dynamic.literal(oauthBearerProvider = oauthBearerProvider.toJsFn)
    __obj.asInstanceOf[OauthBearerProvider]
  }
  
  extension [Self <: OauthBearerProvider](x: Self) {
    
    inline def setOauthBearerProvider(value: CallbackTo[js.Promise[OauthbearerProviderResponse]]): Self = StObject.set(x, "oauthBearerProvider", value.toJsFn)
  }
}
