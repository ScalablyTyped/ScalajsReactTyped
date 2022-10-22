package typingsJapgolly.activexLibreoffice.com_.sun.star.task

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** allows to change the master password, or let it be requested and checked. */
trait XMasterPasswordHandling2
  extends StObject
     with XMasterPasswordHandling {
  
  /** allows to detect whether the default master password is used */
  def isDefaultMasterPasswordUsed(): Boolean
  
  /**
    * allows to let the default password be used
    *
    * Please use this method with care. Using of default master password let the passwords be stored non-encrypted. If a master password is predefined in
    * the algorithm it is no more an encryption, it is just an encoding.
    */
  def useDefaultMasterPassword(xHandler: XInteractionHandler): Boolean
}
object XMasterPasswordHandling2 {
  
  inline def apply(
    acquire: Callback,
    allowPersistentStoring: Boolean => Boolean,
    authorizateWithMasterPassword: XInteractionHandler => Boolean,
    changeMasterPassword: XInteractionHandler => Boolean,
    hasMasterPassword: CallbackTo[Boolean],
    isDefaultMasterPasswordUsed: CallbackTo[Boolean],
    isPersistentStoringAllowed: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    removeMasterPassword: Callback,
    useDefaultMasterPassword: XInteractionHandler => Boolean
  ): XMasterPasswordHandling2 = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, allowPersistentStoring = js.Any.fromFunction1(allowPersistentStoring), authorizateWithMasterPassword = js.Any.fromFunction1(authorizateWithMasterPassword), changeMasterPassword = js.Any.fromFunction1(changeMasterPassword), hasMasterPassword = hasMasterPassword.toJsFn, isDefaultMasterPasswordUsed = isDefaultMasterPasswordUsed.toJsFn, isPersistentStoringAllowed = isPersistentStoringAllowed.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeMasterPassword = removeMasterPassword.toJsFn, useDefaultMasterPassword = js.Any.fromFunction1(useDefaultMasterPassword))
    __obj.asInstanceOf[XMasterPasswordHandling2]
  }
  
  extension [Self <: XMasterPasswordHandling2](x: Self) {
    
    inline def setIsDefaultMasterPasswordUsed(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDefaultMasterPasswordUsed", value.toJsFn)
    
    inline def setUseDefaultMasterPassword(value: XInteractionHandler => Boolean): Self = StObject.set(x, "useDefaultMasterPassword", js.Any.fromFunction1(value))
  }
}
