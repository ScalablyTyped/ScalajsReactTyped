package typingsJapgolly.cloudflare.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cloudflare.anon.Country
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait User extends StObject {
  
  def edit(user: Country): js.Promise[js.Object]
  
  def read(): js.Promise[js.Object]
}
object User {
  
  inline def apply(edit: Country => js.Promise[js.Object], read: CallbackTo[js.Promise[js.Object]]): User = {
    val __obj = js.Dynamic.literal(edit = js.Any.fromFunction1(edit), read = read.toJsFn)
    __obj.asInstanceOf[User]
  }
  
  extension [Self <: User](x: Self) {
    
    inline def setEdit(value: Country => js.Promise[js.Object]): Self = StObject.set(x, "edit", js.Any.fromFunction1(value))
    
    inline def setRead(value: CallbackTo[js.Promise[js.Object]]): Self = StObject.set(x, "read", value.toJsFn)
  }
}
