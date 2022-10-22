package typingsJapgolly.winrtUwp.Windows.Security.Credentials

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Credential Locker of credentials. The contents of the locker are specific to the app or service. Apps and services don't have access to credentials associated with other apps or services. */
trait PasswordVault extends StObject {
  
  /**
    * Adds a credential to the Credential Locker.
    * @param credential The credential to be added.
    */
  def add(credential: PasswordCredential): Unit
  
  /**
    * Searches the Credential Locker for credentials matching the resource specified.
    * @param resource The resource to be searched for.
    * @return When this method returns, contains an IVectorView of credential objects that match the search criteria.
    */
  def findAllByResource(resource: String): IVectorView[PasswordCredential]
  
  /**
    * Searches the Credential Locker for credentials that match the user name specified.
    * @param userName The user name to be searched for.
    * @return When this method returns, contains an IVectorView of credential objects that match the search criteria.
    */
  def findAllByUserName(userName: String): IVectorView[PasswordCredential]
  
  /**
    * Removes a credential from the Credential Locker.
    * @param credential The credential to be removed.
    */
  def remove(credential: PasswordCredential): Unit
  
  /**
    * Reads a credential from the Credential Locker.
    * @param resource The resource for which the credential is used.
    * @param userName The user name that must be present in the credential.
    * @return The returned credential that contains all the data.
    */
  def retrieve(resource: String, userName: String): PasswordCredential
  
  /**
    * Retrieves all of the credentials stored in the Credential Locker.
    * @return When this method returns, contains an IVectorView output of credential objects that match the search criteria. This output is a snapshot and not dynamic. If the results are used for updating or deleting credentials, those changes won't be reflected in the previous output.
    */
  def retrieveAll(): IVectorView[PasswordCredential]
}
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
  
  extension [Self <: PasswordVault](x: Self) {
    
    inline def setAdd(value: PasswordCredential => Callback): Self = StObject.set(x, "add", js.Any.fromFunction1((t0: PasswordCredential) => value(t0).runNow()))
    
    inline def setFindAllByResource(value: String => IVectorView[PasswordCredential]): Self = StObject.set(x, "findAllByResource", js.Any.fromFunction1(value))
    
    inline def setFindAllByUserName(value: String => IVectorView[PasswordCredential]): Self = StObject.set(x, "findAllByUserName", js.Any.fromFunction1(value))
    
    inline def setRemove(value: PasswordCredential => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: PasswordCredential) => value(t0).runNow()))
    
    inline def setRetrieve(value: (String, String) => PasswordCredential): Self = StObject.set(x, "retrieve", js.Any.fromFunction2(value))
    
    inline def setRetrieveAll(value: CallbackTo[IVectorView[PasswordCredential]]): Self = StObject.set(x, "retrieveAll", value.toJsFn)
  }
}
