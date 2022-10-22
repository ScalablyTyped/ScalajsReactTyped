package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellAddress
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** represents a cell which can be addressed with a {@link com.sun.star.table.CellAddress} . */
trait XCellAddressable
  extends StObject
     with XInterface {
  
  /**
    * returns the address of the cell in the spreadsheet document.
    *
    * The {@link com.sun.star.table.CellAddress} can be used to address the cell within its document.
    */
  val CellAddress: typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellAddress
  
  /**
    * returns the address of the cell in the spreadsheet document.
    *
    * The {@link com.sun.star.table.CellAddress} can be used to address the cell within its document.
    */
  def getCellAddress(): typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellAddress
}
object XCellAddressable {
  
  inline def apply(
    CellAddress: CellAddress,
    acquire: Callback,
    getCellAddress: CallbackTo[CellAddress],
    queryInterface: `type` => Any,
    release: Callback
  ): XCellAddressable = {
    val __obj = js.Dynamic.literal(CellAddress = CellAddress.asInstanceOf[js.Any], acquire = acquire.toJsFn, getCellAddress = getCellAddress.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XCellAddressable]
  }
  
  extension [Self <: XCellAddressable](x: Self) {
    
    inline def setCellAddress(value: CellAddress): Self = StObject.set(x, "CellAddress", value.asInstanceOf[js.Any])
    
    inline def setGetCellAddress(value: CallbackTo[CellAddress]): Self = StObject.set(x, "getCellAddress", value.toJsFn)
  }
}
