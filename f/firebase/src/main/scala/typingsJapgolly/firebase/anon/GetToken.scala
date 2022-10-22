package typingsJapgolly.firebase.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.firebase.compatMod.firebase.appCheck.AppCheckToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetToken extends StObject {
  
  def getToken(): AppCheckToken
}
object GetToken {
  
  inline def apply(getToken: CallbackTo[AppCheckToken]): GetToken = {
    val __obj = js.Dynamic.literal(getToken = getToken.toJsFn)
    __obj.asInstanceOf[GetToken]
  }
  
  extension [Self <: GetToken](x: Self) {
    
    inline def setGetToken(value: CallbackTo[AppCheckToken]): Self = StObject.set(x, "getToken", value.toJsFn)
  }
}
