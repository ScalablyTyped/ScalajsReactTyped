package typingsJapgolly.winrt.Windows.Security.Credentials

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPasswordVault extends StObject {
  
  def add(credential: PasswordCredential): Unit
  
  def findAllByResource(resource: String): IVectorView[PasswordCredential]
  
  def findAllByUserName(userName: String): IVectorView[PasswordCredential]
  
  def remove(credential: PasswordCredential): Unit
  
  def retrieve(resource: String, userName: String): PasswordCredential
  
  def retrieveAll(): IVectorView[PasswordCredential]
}
object IPasswordVault {
  
  inline def apply(
    add: PasswordCredential => Callback,
    findAllByResource: String => IVectorView[PasswordCredential],
    findAllByUserName: String => IVectorView[PasswordCredential],
    remove: PasswordCredential => Callback,
    retrieve: (String, String) => PasswordCredential,
    retrieveAll: CallbackTo[IVectorView[PasswordCredential]]
  ): IPasswordVault = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1((t0: PasswordCredential) => add(t0).runNow()), findAllByResource = js.Any.fromFunction1(findAllByResource), findAllByUserName = js.Any.fromFunction1(findAllByUserName), remove = js.Any.fromFunction1((t0: PasswordCredential) => remove(t0).runNow()), retrieve = js.Any.fromFunction2(retrieve), retrieveAll = retrieveAll.toJsFn)
    __obj.asInstanceOf[IPasswordVault]
  }
  
  extension [Self <: IPasswordVault](x: Self) {
    
    inline def setAdd(value: PasswordCredential => Callback): Self = StObject.set(x, "add", js.Any.fromFunction1((t0: PasswordCredential) => value(t0).runNow()))
    
    inline def setFindAllByResource(value: String => IVectorView[PasswordCredential]): Self = StObject.set(x, "findAllByResource", js.Any.fromFunction1(value))
    
    inline def setFindAllByUserName(value: String => IVectorView[PasswordCredential]): Self = StObject.set(x, "findAllByUserName", js.Any.fromFunction1(value))
    
    inline def setRemove(value: PasswordCredential => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: PasswordCredential) => value(t0).runNow()))
    
    inline def setRetrieve(value: (String, String) => PasswordCredential): Self = StObject.set(x, "retrieve", js.Any.fromFunction2(value))
    
    inline def setRetrieveAll(value: CallbackTo[IVectorView[PasswordCredential]]): Self = StObject.set(x, "retrieveAll", value.toJsFn)
  }
}
