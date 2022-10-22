package typingsJapgolly.activexLibreoffice.com_.sun.star.sdbcx

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides the access to a container of users, typically used for a database definition object. */
trait XUsersSupplier
  extends StObject
     with XInterface {
  
  /**
    * returns the container of users.
    * @returns the users
    */
  val Users: XNameAccess
  
  /**
    * returns the container of users.
    * @returns the users
    */
  def getUsers(): XNameAccess
}
object XUsersSupplier {
  
  inline def apply(
    Users: XNameAccess,
    acquire: Callback,
    getUsers: CallbackTo[XNameAccess],
    queryInterface: `type` => Any,
    release: Callback
  ): XUsersSupplier = {
    val __obj = js.Dynamic.literal(Users = Users.asInstanceOf[js.Any], acquire = acquire.toJsFn, getUsers = getUsers.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XUsersSupplier]
  }
  
  extension [Self <: XUsersSupplier](x: Self) {
    
    inline def setGetUsers(value: CallbackTo[XNameAccess]): Self = StObject.set(x, "getUsers", value.toJsFn)
    
    inline def setUsers(value: XNameAccess): Self = StObject.set(x, "Users", value.asInstanceOf[js.Any])
  }
}
