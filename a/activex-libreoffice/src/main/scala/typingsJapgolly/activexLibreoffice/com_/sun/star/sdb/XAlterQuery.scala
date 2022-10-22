package typingsJapgolly.activexLibreoffice.com_.sun.star.sdb

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is used to alter the command of a query. */
trait XAlterQuery
  extends StObject
     with XInterface {
  
  /**
    * is intended to alter the command of a query object.
    * @param command the SQL statement
    * @param useEscapeProcessing `TRUE` when escape processing should be used
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def alterCommand(command: String, useEscapeProcessing: Boolean): Unit
}
object XAlterQuery {
  
  inline def apply(
    acquire: Callback,
    alterCommand: (String, Boolean) => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XAlterQuery = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, alterCommand = js.Any.fromFunction2((t0: String, t1: Boolean) => (alterCommand(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XAlterQuery]
  }
  
  extension [Self <: XAlterQuery](x: Self) {
    
    inline def setAlterCommand(value: (String, Boolean) => Callback): Self = StObject.set(x, "alterCommand", js.Any.fromFunction2((t0: String, t1: Boolean) => (value(t0, t1)).runNow()))
  }
}
