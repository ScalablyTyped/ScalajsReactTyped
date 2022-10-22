package typingsJapgolly.activexLibreoffice.com_.sun.star.sdbcx

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is used for accessing and setting the permissions of a user for a database object.
  * @see com.sun.star.sdbcx.PrivilegeObject
  * @see com.sun.star.sdbcx.Privilege
  */
trait XAuthorizable
  extends StObject
     with XInterface {
  
  /**
    * retrieves the permissions for a specific object, which could be granted to other users and groups.
    * @param objName the name of the object
    * @param objType a value of {@link com.sun.star.sdbcx.PrivilegeObject}
    * @returns the grant privileges
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getGrantablePrivileges(objName: String, objType: Double): Double
  
  /**
    * retrieves the permissions for a specific object.
    * @param objName the name of the object
    * @param objType a value of {@link com.sun.star.sdbcx.PrivilegeObject}
    * @returns the privileges
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getPrivileges(objName: String, objType: Double): Double
  
  /**
    * adds additional permissions for a specific object.
    * @param objName the name of the object
    * @param objType a value from the {@link com.sun.star.sdbcx.PrivilegeObject} constants group
    * @param objPrivileges a value from the {@link com.sun.star.sdbcx.Privilege} constants group
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def grantPrivileges(objName: String, objType: Double, objPrivileges: Double): Unit
  
  /**
    * removes permissions for a specific object from a group or user.
    * @param objName the name of the object
    * @param objType a value from the {@link com.sun.star.sdbcx.PrivilegeObject} constants group
    * @param objPrivileges a value from the {@link com.sun.star.sdbcx.Privilege} constants group
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def revokePrivileges(objName: String, objType: Double, objPrivileges: Double): Unit
}
object XAuthorizable {
  
  inline def apply(
    acquire: Callback,
    getGrantablePrivileges: (String, Double) => Double,
    getPrivileges: (String, Double) => Double,
    grantPrivileges: (String, Double, Double) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    revokePrivileges: (String, Double, Double) => Callback
  ): XAuthorizable = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getGrantablePrivileges = js.Any.fromFunction2(getGrantablePrivileges), getPrivileges = js.Any.fromFunction2(getPrivileges), grantPrivileges = js.Any.fromFunction3((t0: String, t1: Double, t2: Double) => (grantPrivileges(t0, t1, t2)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, revokePrivileges = js.Any.fromFunction3((t0: String, t1: Double, t2: Double) => (revokePrivileges(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[XAuthorizable]
  }
  
  extension [Self <: XAuthorizable](x: Self) {
    
    inline def setGetGrantablePrivileges(value: (String, Double) => Double): Self = StObject.set(x, "getGrantablePrivileges", js.Any.fromFunction2(value))
    
    inline def setGetPrivileges(value: (String, Double) => Double): Self = StObject.set(x, "getPrivileges", js.Any.fromFunction2(value))
    
    inline def setGrantPrivileges(value: (String, Double, Double) => Callback): Self = StObject.set(x, "grantPrivileges", js.Any.fromFunction3((t0: String, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setRevokePrivileges(value: (String, Double, Double) => Callback): Self = StObject.set(x, "revokePrivileges", js.Any.fromFunction3((t0: String, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
  }
}
