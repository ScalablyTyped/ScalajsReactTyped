package typingsJapgolly.activexLibreoffice.com_.sun.star.sdbcx

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides for the deletion of more than one row at a time. */
trait XDeleteRows
  extends StObject
     with XInterface {
  
  /**
    * deletes one or more rows identified by their bookmarks.
    * @param rows list of bookmarks identifying the rows.
    * @returns an array of update counts containing one element for each row. The array is ordered according to the order in which bookmarks were given.
    * @throws com::sun::star::sdbc::SQLException if a fatal error occurs, for instance, the connection gets lost if bookmarks are used which do not belong to t
    */
  def deleteRows(rows: SeqEquiv[Any]): SafeArray[Double]
}
object XDeleteRows {
  
  inline def apply(
    acquire: Callback,
    deleteRows: SeqEquiv[Any] => SafeArray[Double],
    queryInterface: `type` => Any,
    release: Callback
  ): XDeleteRows = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, deleteRows = js.Any.fromFunction1(deleteRows), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XDeleteRows]
  }
  
  extension [Self <: XDeleteRows](x: Self) {
    
    inline def setDeleteRows(value: SeqEquiv[Any] => SafeArray[Double]): Self = StObject.set(x, "deleteRows", js.Any.fromFunction1(value))
  }
}
