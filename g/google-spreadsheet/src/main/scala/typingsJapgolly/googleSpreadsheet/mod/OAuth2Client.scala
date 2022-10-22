package typingsJapgolly.googleSpreadsheet.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OAuth2Client extends StObject {
  
  def getAccessToken(): js.Promise[GetAccessTokenResponse]
}
object OAuth2Client {
  
  inline def apply(getAccessToken: CallbackTo[js.Promise[GetAccessTokenResponse]]): OAuth2Client = {
    val __obj = js.Dynamic.literal(getAccessToken = getAccessToken.toJsFn)
    __obj.asInstanceOf[OAuth2Client]
  }
  
  extension [Self <: OAuth2Client](x: Self) {
    
    inline def setGetAccessToken(value: CallbackTo[js.Promise[GetAccessTokenResponse]]): Self = StObject.set(x, "getAccessToken", value.toJsFn)
  }
}
