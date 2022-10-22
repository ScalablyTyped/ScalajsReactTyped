package typingsJapgolly.activexLibreoffice.com_.sun.star.sdbcx

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides for access to a container of tables, typically used for a database definition object. */
trait XTablesSupplier
  extends StObject
     with XInterface {
  
  /**
    * returns the container of tables.
    * @returns the tables
    */
  val Tables: XNameAccess
  
  /**
    * returns the container of tables.
    * @returns the tables
    */
  def getTables(): XNameAccess
}
object XTablesSupplier {
  
  inline def apply(
    Tables: XNameAccess,
    acquire: Callback,
    getTables: CallbackTo[XNameAccess],
    queryInterface: `type` => Any,
    release: Callback
  ): XTablesSupplier = {
    val __obj = js.Dynamic.literal(Tables = Tables.asInstanceOf[js.Any], acquire = acquire.toJsFn, getTables = getTables.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XTablesSupplier]
  }
  
  extension [Self <: XTablesSupplier](x: Self) {
    
    inline def setGetTables(value: CallbackTo[XNameAccess]): Self = StObject.set(x, "getTables", value.toJsFn)
    
    inline def setTables(value: XNameAccess): Self = StObject.set(x, "Tables", value.asInstanceOf[js.Any])
  }
}
