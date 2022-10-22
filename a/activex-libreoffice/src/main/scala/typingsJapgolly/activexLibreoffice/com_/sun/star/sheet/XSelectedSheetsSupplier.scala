package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @since LibreOffice 3.5 */
trait XSelectedSheetsSupplier
  extends StObject
     with XInterface {
  
  /** returns the indices of currently selected sheets. Sheet indices are 0-based. */
  val SelectedSheets: SafeArray[Double]
  
  /** returns the indices of currently selected sheets. Sheet indices are 0-based. */
  def getSelectedSheets(): SafeArray[Double]
}
object XSelectedSheetsSupplier {
  
  inline def apply(
    SelectedSheets: SafeArray[Double],
    acquire: Callback,
    getSelectedSheets: CallbackTo[SafeArray[Double]],
    queryInterface: `type` => Any,
    release: Callback
  ): XSelectedSheetsSupplier = {
    val __obj = js.Dynamic.literal(SelectedSheets = SelectedSheets.asInstanceOf[js.Any], acquire = acquire.toJsFn, getSelectedSheets = getSelectedSheets.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XSelectedSheetsSupplier]
  }
  
  extension [Self <: XSelectedSheetsSupplier](x: Self) {
    
    inline def setGetSelectedSheets(value: CallbackTo[SafeArray[Double]]): Self = StObject.set(x, "getSelectedSheets", value.toJsFn)
    
    inline def setSelectedSheets(value: SafeArray[Double]): Self = StObject.set(x, "SelectedSheets", value.asInstanceOf[js.Any])
  }
}
