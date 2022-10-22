package typingsJapgolly.matrixJsSdk.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccessToken extends StObject {
  
  def getAccessToken(): js.Promise[String]
}
object GetAccessToken {
  
  inline def apply(getAccessToken: CallbackTo[js.Promise[String]]): GetAccessToken = {
    val __obj = js.Dynamic.literal(getAccessToken = getAccessToken.toJsFn)
    __obj.asInstanceOf[GetAccessToken]
  }
  
  extension [Self <: GetAccessToken](x: Self) {
    
    inline def setGetAccessToken(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getAccessToken", value.toJsFn)
  }
}
