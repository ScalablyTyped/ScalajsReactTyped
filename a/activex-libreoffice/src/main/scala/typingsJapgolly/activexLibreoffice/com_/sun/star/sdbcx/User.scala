package typingsJapgolly.activexLibreoffice.com_.sun.star.sdbcx

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** represents a user of the database, who has certain access rights for the objects of the database. */
trait User
  extends StObject
     with XUser
     with XGroupsSupplier
     with XPropertySet {
  
  /** is the name of the user. */
  var Name: String
}
object User {
  
  inline def apply(
    Groups: XNameAccess,
    Name: String,
    PropertySetInfo: XPropertySetInfo,
    acquire: Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    changePassword: (String, String) => Callback,
    getGrantablePrivileges: (String, Double) => Double,
    getGroups: CallbackTo[XNameAccess],
    getPrivileges: (String, Double) => Double,
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    grantPrivileges: (String, Double, Double) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    revokePrivileges: (String, Double, Double) => Callback,
    setPropertyValue: (String, Any) => Callback
  ): User = {
    val __obj = js.Dynamic.literal(Groups = Groups.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), changePassword = js.Any.fromFunction2((t0: String, t1: String) => (changePassword(t0, t1)).runNow()), getGrantablePrivileges = js.Any.fromFunction2(getGrantablePrivileges), getGroups = getGroups.toJsFn, getPrivileges = js.Any.fromFunction2(getPrivileges), getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), grantPrivileges = js.Any.fromFunction3((t0: String, t1: Double, t2: Double) => (grantPrivileges(t0, t1, t2)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), revokePrivileges = js.Any.fromFunction3((t0: String, t1: Double, t2: Double) => (revokePrivileges(t0, t1, t2)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()))
    __obj.asInstanceOf[User]
  }
  
  extension [Self <: User](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
