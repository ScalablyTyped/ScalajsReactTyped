package typingsJapgolly.activexLibreoffice.com_.sun.star.sdbcx

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** allows for changing a users password. */
trait XUser
  extends StObject
     with XAuthorizable {
  
  /**
    * allows modifying a user password.
    * @param oldPassword the old password to be reset
    * @param newPassword the new password
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def changePassword(oldPassword: String, newPassword: String): Unit
}
object XUser {
  
  inline def apply(
    acquire: Callback,
    changePassword: (String, String) => Callback,
    getGrantablePrivileges: (String, Double) => Double,
    getPrivileges: (String, Double) => Double,
    grantPrivileges: (String, Double, Double) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    revokePrivileges: (String, Double, Double) => Callback
  ): XUser = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, changePassword = js.Any.fromFunction2((t0: String, t1: String) => (changePassword(t0, t1)).runNow()), getGrantablePrivileges = js.Any.fromFunction2(getGrantablePrivileges), getPrivileges = js.Any.fromFunction2(getPrivileges), grantPrivileges = js.Any.fromFunction3((t0: String, t1: Double, t2: Double) => (grantPrivileges(t0, t1, t2)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, revokePrivileges = js.Any.fromFunction3((t0: String, t1: Double, t2: Double) => (revokePrivileges(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[XUser]
  }
  
  extension [Self <: XUser](x: Self) {
    
    inline def setChangePassword(value: (String, String) => Callback): Self = StObject.set(x, "changePassword", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
  }
}
