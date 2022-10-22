package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to a collection of spreadsheets.
  * @see com.sun.star.sheet.SpreadsheetDocument
  */
trait XSpreadsheetDocument
  extends StObject
     with XInterface {
  
  /**
    * returns the collection of sheets in the document.
    * @see com.sun.star.sheet.Spreadsheets
    */
  val Sheets: XSpreadsheets
  
  /**
    * returns the collection of sheets in the document.
    * @see com.sun.star.sheet.Spreadsheets
    */
  def getSheets(): XSpreadsheets
}
object XSpreadsheetDocument {
  
  inline def apply(
    Sheets: XSpreadsheets,
    acquire: Callback,
    getSheets: CallbackTo[XSpreadsheets],
    queryInterface: `type` => Any,
    release: Callback
  ): XSpreadsheetDocument = {
    val __obj = js.Dynamic.literal(Sheets = Sheets.asInstanceOf[js.Any], acquire = acquire.toJsFn, getSheets = getSheets.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XSpreadsheetDocument]
  }
  
  extension [Self <: XSpreadsheetDocument](x: Self) {
    
    inline def setGetSheets(value: CallbackTo[XSpreadsheets]): Self = StObject.set(x, "getSheets", value.toJsFn)
    
    inline def setSheets(value: XSpreadsheets): Self = StObject.set(x, "Sheets", value.asInstanceOf[js.Any])
  }
}
