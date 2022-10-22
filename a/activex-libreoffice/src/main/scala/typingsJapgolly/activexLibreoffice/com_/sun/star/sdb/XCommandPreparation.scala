package typingsJapgolly.activexLibreoffice.com_.sun.star.sdb

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XPreparedStatement
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is used for preparation of commands.
  *
  * A command could be a table, query, or any kind of SQL statement prepared by the user.
  */
trait XCommandPreparation
  extends StObject
     with XInterface {
  
  /**
    * creates a {@link com.sun.star.sdbc.PreparedStatement} object for sending parameterized SQL statements to the database.
    *
    * A SQL statement with or without IN parameters can be pre-compiled and stored in a {@link PreparedStatement} object. This object can then be used to
    * efficiently execute this statement multiple times.
    * @param command the command to be prepared. Any SQL statement.
    * @param commandType kind of the command {@link com.sun.star.sdb.CommandType}
    * @returns the {@link PreparedStatement} object
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def prepareCommand(command: String, commandType: Double): XPreparedStatement
}
object XCommandPreparation {
  
  inline def apply(
    acquire: Callback,
    prepareCommand: (String, Double) => XPreparedStatement,
    queryInterface: `type` => Any,
    release: Callback
  ): XCommandPreparation = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, prepareCommand = js.Any.fromFunction2(prepareCommand), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XCommandPreparation]
  }
  
  extension [Self <: XCommandPreparation](x: Self) {
    
    inline def setPrepareCommand(value: (String, Double) => XPreparedStatement): Self = StObject.set(x, "prepareCommand", js.Any.fromFunction2(value))
  }
}
