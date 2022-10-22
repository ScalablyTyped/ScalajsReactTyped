package typingsJapgolly.activexLibreoffice.com_.sun.star.script

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Extension of {@link XLibraryContainer} to provide password functionality. This interface should be implemented together with {@link
  * XLibraryContainer2}
  */
trait XLibraryContainerPassword
  extends StObject
     with XInterface {
  
  /**
    * Changes the library's password.
    *
    * If the library wasn't password protected before: The OldPassword parameter has to be an empty string. Afterwards calls to isLibraryPasswordProtected
    * and isLibraryPasswordVerified for this library will return true.
    *
    * If the library already was password protected: The OldPassword parameter has to be set to the previous defined password. If then the NewPassword
    * parameter is an empty string the library password protection will be disabled afterwards (afterwards calls to isLibraryPasswordProtected for this
    * library will return false). If the NewPassword parameter is not an empty string it will accepted as the new password for the library.
    *
    * If a library with the this name doesn't exist but isn't {@link com.sun.star.container.NoSuchElementException} is thrown.
    *
    * If the library exists and is password protected and a wrong OldPassword is passed to the method a {@link com.sun.star.lang.IllegalArgumentException}
    * is thrown.
    *
    * If the library exists and isn't password protected and the OldPassword isn't an empty string or the library is read only a {@link
    * com.sun.star.lang.IllegalArgumentException} is thrown.
    */
  def changeLibraryPassword(Name: String, OldPassword: String, NewPassword: String): Unit
  
  /**
    * Returns true if the accessed library item is protected by a password.
    *
    * If a library with the this name doesn't exist a {@link com.sun.star.container.NoSuchElementException} is thrown.
    */
  def isLibraryPasswordProtected(Name: String): Boolean
  
  /**
    * Returns true if the accessed library item is protected by a password (see isLibraryPasswordProtected) and the password was already verified with
    * verifyLibraryPassword or if an initial password was set with changeLibraryPassword.
    *
    * If a library with the this name doesn't exist a {@link com.sun.star.container.NoSuchElementException} is thrown.
    *
    * If the library exists but isn't password protected a {@link com.sun.star.lang.IllegalArgumentException} is thrown.
    */
  def isLibraryPasswordVerified(Name: String): Boolean
  
  /**
    * Verifies the library's password. If the correct password was passed, the method returns true and further calls to isLibraryPasswordVerified will also
    * return true.
    *
    * If a library with the this name doesn't exist a {@link com.sun.star.container.NoSuchElementException} is thrown.
    *
    * If the library exists but isn't password protected a {@link com.sun.star.lang.IllegalArgumentException} is thrown.
    *
    * If the library password is already verified a {@link com.sun.star.lang.IllegalArgumentException} is thrown.
    */
  def verifyLibraryPassword(Name: String, Password: String): Boolean
}
object XLibraryContainerPassword {
  
  inline def apply(
    acquire: Callback,
    changeLibraryPassword: (String, String, String) => Callback,
    isLibraryPasswordProtected: String => Boolean,
    isLibraryPasswordVerified: String => Boolean,
    queryInterface: `type` => Any,
    release: Callback,
    verifyLibraryPassword: (String, String) => Boolean
  ): XLibraryContainerPassword = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, changeLibraryPassword = js.Any.fromFunction3((t0: String, t1: String, t2: String) => (changeLibraryPassword(t0, t1, t2)).runNow()), isLibraryPasswordProtected = js.Any.fromFunction1(isLibraryPasswordProtected), isLibraryPasswordVerified = js.Any.fromFunction1(isLibraryPasswordVerified), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, verifyLibraryPassword = js.Any.fromFunction2(verifyLibraryPassword))
    __obj.asInstanceOf[XLibraryContainerPassword]
  }
  
  extension [Self <: XLibraryContainerPassword](x: Self) {
    
    inline def setChangeLibraryPassword(value: (String, String, String) => Callback): Self = StObject.set(x, "changeLibraryPassword", js.Any.fromFunction3((t0: String, t1: String, t2: String) => (value(t0, t1, t2)).runNow()))
    
    inline def setIsLibraryPasswordProtected(value: String => Boolean): Self = StObject.set(x, "isLibraryPasswordProtected", js.Any.fromFunction1(value))
    
    inline def setIsLibraryPasswordVerified(value: String => Boolean): Self = StObject.set(x, "isLibraryPasswordVerified", js.Any.fromFunction1(value))
    
    inline def setVerifyLibraryPassword(value: (String, String) => Boolean): Self = StObject.set(x, "verifyLibraryPassword", js.Any.fromFunction2(value))
  }
}
