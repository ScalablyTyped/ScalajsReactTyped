package typingsJapgolly.activexLibreoffice.com_.sun.star.sdbcx

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides the access to a container of columns, typically used for tables and indexes. */
trait XColumnsSupplier
  extends StObject
     with XInterface {
  
  /**
    * returns the container of columns.
    * @returns the columns
    */
  val Columns: XNameAccess
  
  /**
    * returns the container of columns.
    * @returns the columns
    */
  def getColumns(): XNameAccess
}
object XColumnsSupplier {
  
  inline def apply(
    Columns: XNameAccess,
    acquire: Callback,
    getColumns: CallbackTo[XNameAccess],
    queryInterface: `type` => Any,
    release: Callback
  ): XColumnsSupplier = {
    val __obj = js.Dynamic.literal(Columns = Columns.asInstanceOf[js.Any], acquire = acquire.toJsFn, getColumns = getColumns.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XColumnsSupplier]
  }
  
  extension [Self <: XColumnsSupplier](x: Self) {
    
    inline def setColumns(value: XNameAccess): Self = StObject.set(x, "Columns", value.asInstanceOf[js.Any])
    
    inline def setGetColumns(value: CallbackTo[XNameAccess]): Self = StObject.set(x, "getColumns", value.toJsFn)
  }
}
