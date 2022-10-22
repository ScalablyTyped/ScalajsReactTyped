package typingsJapgolly.hellosignSdk.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.hellosignSdk.anon.Callbackurl
import typingsJapgolly.hellosignSdk.anon.Emailaddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountModule extends StObject {
  
  def create(options: Emailaddress): js.Promise[AccountResponse]
  
  def get(): js.Promise[AccountResponse]
  
  def update(options: Callbackurl): js.Promise[AccountResponse]
  
  def verify(options: Emailaddress): js.Promise[AccountResponse]
}
object AccountModule {
  
  inline def apply(
    create: Emailaddress => js.Promise[AccountResponse],
    get: CallbackTo[js.Promise[AccountResponse]],
    update: Callbackurl => js.Promise[AccountResponse],
    verify: Emailaddress => js.Promise[AccountResponse]
  ): AccountModule = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), get = get.toJsFn, update = js.Any.fromFunction1(update), verify = js.Any.fromFunction1(verify))
    __obj.asInstanceOf[AccountModule]
  }
  
  extension [Self <: AccountModule](x: Self) {
    
    inline def setCreate(value: Emailaddress => js.Promise[AccountResponse]): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    
    inline def setGet(value: CallbackTo[js.Promise[AccountResponse]]): Self = StObject.set(x, "get", value.toJsFn)
    
    inline def setUpdate(value: Callbackurl => js.Promise[AccountResponse]): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    
    inline def setVerify(value: Emailaddress => js.Promise[AccountResponse]): Self = StObject.set(x, "verify", js.Any.fromFunction1(value))
  }
}
