package typingsJapgolly.activexLibreoffice.com_.sun.star.sdbcx

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * could be used as an extension for performing data definition tasks on databases, and to control the access rights on database objects.
  *
  * It may be implemented by a database driver provider, to encapsulate the complexity of data definition, and to give a common way for data definition as
  * the DDL of most DBMS differs.
  *
  * At least, the access to the tables of a database should be implemented. The implementation of other known database objects like views is optional.
  *
  * To control the access rights of users, there is the possibility to implement objects like users and groups.
  */
trait DatabaseDefinition
  extends StObject
     with XTablesSupplier
     with XViewsSupplier
     with XUsersSupplier
     with XGroupsSupplier
object DatabaseDefinition {
  
  inline def apply(
    Groups: XNameAccess,
    Tables: XNameAccess,
    Users: XNameAccess,
    Views: XNameAccess,
    acquire: Callback,
    getGroups: CallbackTo[XNameAccess],
    getTables: CallbackTo[XNameAccess],
    getUsers: CallbackTo[XNameAccess],
    getViews: CallbackTo[XNameAccess],
    queryInterface: `type` => Any,
    release: Callback
  ): DatabaseDefinition = {
    val __obj = js.Dynamic.literal(Groups = Groups.asInstanceOf[js.Any], Tables = Tables.asInstanceOf[js.Any], Users = Users.asInstanceOf[js.Any], Views = Views.asInstanceOf[js.Any], acquire = acquire.toJsFn, getGroups = getGroups.toJsFn, getTables = getTables.toJsFn, getUsers = getUsers.toJsFn, getViews = getViews.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[DatabaseDefinition]
  }
}
