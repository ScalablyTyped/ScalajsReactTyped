package typingsJapgolly.activexLibreoffice.com_.sun.star.task

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** allows to change the master password, or let it be requested and checked. */
trait XMasterPasswordHandling
  extends StObject
     with XInterface {
  
  /**
    * allows to specify whether persistent storing of passwords is allowed
    *
    * After the storing is forbidden the master password and all the stored passwords are removed.
    */
  def allowPersistentStoring(bAllow: Boolean): Boolean
  
  /**
    * allows to check the user authorization.
    *
    * This call let the master password be requested from user using the provided interaction handler.
    *
    * The call will use the standard interaction handler service {@link InteractionHandler} if no handler is provided.
    */
  def authorizateWithMasterPassword(xHandler: XInteractionHandler): Boolean
  
  /**
    * allows to change the master password.
    *
    * If there is still no master password, the user will be asked to provide the new one.
    *
    * The call will use the standard interaction handler service {@link InteractionHandler} if no handler is provided.
    */
  def changeMasterPassword(xHandler: XInteractionHandler): Boolean
  
  /** allows to detect whether there is already a master password */
  def hasMasterPassword(): Boolean
  
  /** allows to detect whether persistent storing of passwords is allowed */
  def isPersistentStoringAllowed(): Boolean
  
  /** let the master password and all the related stored passwords be removed. */
  def removeMasterPassword(): Unit
}
object XMasterPasswordHandling {
  
  inline def apply(
    acquire: Callback,
    allowPersistentStoring: Boolean => Boolean,
    authorizateWithMasterPassword: XInteractionHandler => Boolean,
    changeMasterPassword: XInteractionHandler => Boolean,
    hasMasterPassword: CallbackTo[Boolean],
    isPersistentStoringAllowed: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    removeMasterPassword: Callback
  ): XMasterPasswordHandling = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, allowPersistentStoring = js.Any.fromFunction1(allowPersistentStoring), authorizateWithMasterPassword = js.Any.fromFunction1(authorizateWithMasterPassword), changeMasterPassword = js.Any.fromFunction1(changeMasterPassword), hasMasterPassword = hasMasterPassword.toJsFn, isPersistentStoringAllowed = isPersistentStoringAllowed.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeMasterPassword = removeMasterPassword.toJsFn)
    __obj.asInstanceOf[XMasterPasswordHandling]
  }
  
  extension [Self <: XMasterPasswordHandling](x: Self) {
    
    inline def setAllowPersistentStoring(value: Boolean => Boolean): Self = StObject.set(x, "allowPersistentStoring", js.Any.fromFunction1(value))
    
    inline def setAuthorizateWithMasterPassword(value: XInteractionHandler => Boolean): Self = StObject.set(x, "authorizateWithMasterPassword", js.Any.fromFunction1(value))
    
    inline def setChangeMasterPassword(value: XInteractionHandler => Boolean): Self = StObject.set(x, "changeMasterPassword", js.Any.fromFunction1(value))
    
    inline def setHasMasterPassword(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasMasterPassword", value.toJsFn)
    
    inline def setIsPersistentStoringAllowed(value: CallbackTo[Boolean]): Self = StObject.set(x, "isPersistentStoringAllowed", value.toJsFn)
    
    inline def setRemoveMasterPassword(value: Callback): Self = StObject.set(x, "removeMasterPassword", value.toJsFn)
  }
}
