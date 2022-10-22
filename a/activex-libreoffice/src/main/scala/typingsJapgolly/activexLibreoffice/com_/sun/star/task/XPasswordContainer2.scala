package typingsJapgolly.activexLibreoffice.com_.sun.star.task

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides a unified interface for the {@link PasswordContainer} service to implement.
  * @since LibreOffice 4.0
  */
trait XPasswordContainer2
  extends StObject
     with XPasswordContainer
     with XMasterPasswordHandling2
     with XUrlContainer
object XPasswordContainer2 {
  
  inline def apply(
    acquire: Callback,
    add: (String, String, SeqEquiv[String], XInteractionHandler) => Callback,
    addPersistent: (String, String, SeqEquiv[String], XInteractionHandler) => Callback,
    addUrl: (String, Boolean) => Callback,
    allowPersistentStoring: Boolean => Boolean,
    authorizateWithMasterPassword: XInteractionHandler => Boolean,
    changeMasterPassword: XInteractionHandler => Boolean,
    find: (String, XInteractionHandler) => UrlRecord,
    findForName: (String, String, XInteractionHandler) => UrlRecord,
    findUrl: String => String,
    getAllPersistent: XInteractionHandler => SafeArray[UrlRecord],
    getUrls: Boolean => SafeArray[String],
    hasMasterPassword: CallbackTo[Boolean],
    isDefaultMasterPasswordUsed: CallbackTo[Boolean],
    isPersistentStoringAllowed: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    remove: (String, String) => Callback,
    removeAllPersistent: Callback,
    removeMasterPassword: Callback,
    removePersistent: (String, String) => Callback,
    removeUrl: String => Callback,
    useDefaultMasterPassword: XInteractionHandler => Boolean
  ): XPasswordContainer2 = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, add = js.Any.fromFunction4((t0: String, t1: String, t2: SeqEquiv[String], t3: XInteractionHandler) => (add(t0, t1, t2, t3)).runNow()), addPersistent = js.Any.fromFunction4((t0: String, t1: String, t2: SeqEquiv[String], t3: XInteractionHandler) => (addPersistent(t0, t1, t2, t3)).runNow()), addUrl = js.Any.fromFunction2((t0: String, t1: Boolean) => (addUrl(t0, t1)).runNow()), allowPersistentStoring = js.Any.fromFunction1(allowPersistentStoring), authorizateWithMasterPassword = js.Any.fromFunction1(authorizateWithMasterPassword), changeMasterPassword = js.Any.fromFunction1(changeMasterPassword), find = js.Any.fromFunction2(find), findForName = js.Any.fromFunction3(findForName), findUrl = js.Any.fromFunction1(findUrl), getAllPersistent = js.Any.fromFunction1(getAllPersistent), getUrls = js.Any.fromFunction1(getUrls), hasMasterPassword = hasMasterPassword.toJsFn, isDefaultMasterPasswordUsed = isDefaultMasterPasswordUsed.toJsFn, isPersistentStoringAllowed = isPersistentStoringAllowed.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, remove = js.Any.fromFunction2((t0: String, t1: String) => (remove(t0, t1)).runNow()), removeAllPersistent = removeAllPersistent.toJsFn, removeMasterPassword = removeMasterPassword.toJsFn, removePersistent = js.Any.fromFunction2((t0: String, t1: String) => (removePersistent(t0, t1)).runNow()), removeUrl = js.Any.fromFunction1((t0: String) => removeUrl(t0).runNow()), useDefaultMasterPassword = js.Any.fromFunction1(useDefaultMasterPassword))
    __obj.asInstanceOf[XPasswordContainer2]
  }
}
