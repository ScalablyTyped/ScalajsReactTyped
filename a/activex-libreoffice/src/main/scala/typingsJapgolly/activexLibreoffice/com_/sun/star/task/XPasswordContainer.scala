package typingsJapgolly.activexLibreoffice.com_.sun.star.task

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Allows to save passwords with URL-pattern, to use them later. */
trait XPasswordContainer
  extends StObject
     with XInterface {
  
  /**
    * Save passwords in to the container.
    * @param Url URL-pattern, that will be used later to retrieve passwords.
    * @param UserName The username.
    * @param Passwords The password-list.
    * @param Handler The handler to get super password to en/decrypt passwords
    */
  def add(Url: String, UserName: String, Passwords: SeqEquiv[String], Handler: XInteractionHandler): Unit
  
  /**
    * Save passwords in to the container, and store them in the file.
    * @param Url URL-pattern, that will be used later to retrieve passwords.
    * @param UserName The username.
    * @param Passwords The password-list.
    * @param Handler The handler to get super password to en/decrypt passwords
    */
  def addPersistent(Url: String, UserName: String, Passwords: SeqEquiv[String], Handler: XInteractionHandler): Unit
  
  /**
    * Find users with passwords for the url pattern.
    * @param Url URL-pattern to retrieve password for.
    * @param Handler The handler to get super password to en/decrypt passwords
    * @returns Best matched url-pattern with user-records list.
    */
  def find(Url: String, Handler: XInteractionHandler): UrlRecord
  
  /**
    * Find passwords for the url pattern and username.
    * @param Url URL-pattern to retrieve passwords for.
    * @param UserName Username to retrieve passwords for.
    * @param Handler The handler to get super password to en/decrypt passwords
    * @returns Best matched url-pattern for the username.
    */
  def findForName(Url: String, UserName: String, Handler: XInteractionHandler): UrlRecord
  
  /**
    * Get all records from the file.
    * @returns List of url-records.
    */
  def getAllPersistent(Handler: XInteractionHandler): SafeArray[UrlRecord]
  
  /**
    * Remove passwords for the url pattern and username.
    * @param Url URL-pattern to remove passwords for.
    * @param UserName Username to remove passwords for.
    */
  def remove(Url: String, UserName: String): Unit
  
  /** Clean the file. */
  def removeAllPersistent(): Unit
  
  /**
    * Remove passwords for the url pattern and username from the file.
    * @param Url URL-pattern to remove passwords for.
    * @param UserName Username to remove passwords for.
    */
  def removePersistent(Url: String, UserName: String): Unit
}
object XPasswordContainer {
  
  inline def apply(
    acquire: Callback,
    add: (String, String, SeqEquiv[String], XInteractionHandler) => Callback,
    addPersistent: (String, String, SeqEquiv[String], XInteractionHandler) => Callback,
    find: (String, XInteractionHandler) => UrlRecord,
    findForName: (String, String, XInteractionHandler) => UrlRecord,
    getAllPersistent: XInteractionHandler => SafeArray[UrlRecord],
    queryInterface: `type` => Any,
    release: Callback,
    remove: (String, String) => Callback,
    removeAllPersistent: Callback,
    removePersistent: (String, String) => Callback
  ): XPasswordContainer = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, add = js.Any.fromFunction4((t0: String, t1: String, t2: SeqEquiv[String], t3: XInteractionHandler) => (add(t0, t1, t2, t3)).runNow()), addPersistent = js.Any.fromFunction4((t0: String, t1: String, t2: SeqEquiv[String], t3: XInteractionHandler) => (addPersistent(t0, t1, t2, t3)).runNow()), find = js.Any.fromFunction2(find), findForName = js.Any.fromFunction3(findForName), getAllPersistent = js.Any.fromFunction1(getAllPersistent), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, remove = js.Any.fromFunction2((t0: String, t1: String) => (remove(t0, t1)).runNow()), removeAllPersistent = removeAllPersistent.toJsFn, removePersistent = js.Any.fromFunction2((t0: String, t1: String) => (removePersistent(t0, t1)).runNow()))
    __obj.asInstanceOf[XPasswordContainer]
  }
  
  extension [Self <: XPasswordContainer](x: Self) {
    
    inline def setAdd(value: (String, String, SeqEquiv[String], XInteractionHandler) => Callback): Self = StObject.set(x, "add", js.Any.fromFunction4((t0: String, t1: String, t2: SeqEquiv[String], t3: XInteractionHandler) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setAddPersistent(value: (String, String, SeqEquiv[String], XInteractionHandler) => Callback): Self = StObject.set(x, "addPersistent", js.Any.fromFunction4((t0: String, t1: String, t2: SeqEquiv[String], t3: XInteractionHandler) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setFind(value: (String, XInteractionHandler) => UrlRecord): Self = StObject.set(x, "find", js.Any.fromFunction2(value))
    
    inline def setFindForName(value: (String, String, XInteractionHandler) => UrlRecord): Self = StObject.set(x, "findForName", js.Any.fromFunction3(value))
    
    inline def setGetAllPersistent(value: XInteractionHandler => SafeArray[UrlRecord]): Self = StObject.set(x, "getAllPersistent", js.Any.fromFunction1(value))
    
    inline def setRemove(value: (String, String) => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setRemoveAllPersistent(value: Callback): Self = StObject.set(x, "removeAllPersistent", value.toJsFn)
    
    inline def setRemovePersistent(value: (String, String) => Callback): Self = StObject.set(x, "removePersistent", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
  }
}
