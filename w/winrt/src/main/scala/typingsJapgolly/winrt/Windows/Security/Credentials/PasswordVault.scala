package typingsJapgolly.winrt.Windows.Security.Credentials

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PasswordVault
  extends StObject
     with IPasswordVault
object PasswordVault {
  
  inline def apply(
    add: PasswordCredential => Callback,
    findAllByResource: String => IVectorView[PasswordCredential],
    findAllByUserName: String => IVectorView[PasswordCredential],
    remove: PasswordCredential => Callback,
    retrieve: (String, String) => PasswordCredential,
    retrieveAll: CallbackTo[IVectorView[PasswordCredential]]
  ): PasswordVault = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1((t0: PasswordCredential) => add(t0).runNow()), findAllByResource = js.Any.fromFunction1(findAllByResource), findAllByUserName = js.Any.fromFunction1(findAllByUserName), remove = js.Any.fromFunction1((t0: PasswordCredential) => remove(t0).runNow()), retrieve = js.Any.fromFunction2(retrieve), retrieveAll = retrieveAll.toJsFn)
    __obj.asInstanceOf[PasswordVault]
  }
}
