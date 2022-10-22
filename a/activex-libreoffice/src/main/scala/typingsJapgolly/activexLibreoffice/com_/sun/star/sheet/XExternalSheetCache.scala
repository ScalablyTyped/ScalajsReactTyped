package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Primary interface for the {@link com.sun.star.sheet.ExternalSheetCache} service.
  * @see com.sun.star.sheet.ExternalSheetCache
  * @since OOo 3.1
  */
trait XExternalSheetCache extends StObject {
  
  /**
    * It returns a list of all row numbers where a cached cell or cells exist. The row numbers are sorted in ascending order.
    * @returns sequence<long> list of all row numbers with cached cell(s)
    */
  val AllRows: SafeArray[Double]
  
  /**
    * Index corresponding to this instance of an external sheet cache for usage in formula tokens.
    *
    * This index to the external sheet cache is expected in the {@link SingleReference.Sheet} member if it is part of an external reference token.
    *
    * Each external sheet cache has a unique index value inside the {@link ExternalDocLink} instance.
    * @see FormulaToken
    * @see ExternalReference
    */
  var TokenIndex: Double
  
  /**
    * Given a row number, this method returns a list of all columns numbers that store cached cell values in that row. The column numbers are sorted in
    * ascending order.
    * @returns sequence<long> list of all columns numbers with cached cell values
    */
  def getAllColumns(nRow: Double): SafeArray[Double]
  
  /**
    * It returns a list of all row numbers where a cached cell or cells exist. The row numbers are sorted in ascending order.
    * @returns sequence<long> list of all row numbers with cached cell(s)
    */
  def getAllRows(): SafeArray[Double]
  
  /**
    * It retrieves a cached value from a specified cell position. The cached value can be either string or double.
    * @returns any cached cell value
    */
  def getCellValue(nColumn: Double, nRow: Double): Any
  
  /**
    * It sets a cached value for a specified cell position. The value is expected to be either of type string or of type double. No other data types are
    * supported.
    * @param nRow row position (0-based)
    * @param nColumn column position (0-based)
    * @param aValue cell value to be cached
    */
  def setCellValue(nColumn: Double, nRow: Double, aValue: Any): Unit
}
object XExternalSheetCache {
  
  inline def apply(
    AllRows: SafeArray[Double],
    TokenIndex: Double,
    getAllColumns: Double => SafeArray[Double],
    getAllRows: CallbackTo[SafeArray[Double]],
    getCellValue: (Double, Double) => Any,
    setCellValue: (Double, Double, Any) => Callback
  ): XExternalSheetCache = {
    val __obj = js.Dynamic.literal(AllRows = AllRows.asInstanceOf[js.Any], TokenIndex = TokenIndex.asInstanceOf[js.Any], getAllColumns = js.Any.fromFunction1(getAllColumns), getAllRows = getAllRows.toJsFn, getCellValue = js.Any.fromFunction2(getCellValue), setCellValue = js.Any.fromFunction3((t0: Double, t1: Double, t2: Any) => (setCellValue(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[XExternalSheetCache]
  }
  
  extension [Self <: XExternalSheetCache](x: Self) {
    
    inline def setAllRows(value: SafeArray[Double]): Self = StObject.set(x, "AllRows", value.asInstanceOf[js.Any])
    
    inline def setGetAllColumns(value: Double => SafeArray[Double]): Self = StObject.set(x, "getAllColumns", js.Any.fromFunction1(value))
    
    inline def setGetAllRows(value: CallbackTo[SafeArray[Double]]): Self = StObject.set(x, "getAllRows", value.toJsFn)
    
    inline def setGetCellValue(value: (Double, Double) => Any): Self = StObject.set(x, "getCellValue", js.Any.fromFunction2(value))
    
    inline def setSetCellValue(value: (Double, Double, Any) => Callback): Self = StObject.set(x, "setCellValue", js.Any.fromFunction3((t0: Double, t1: Double, t2: Any) => (value(t0, t1, t2)).runNow()))
    
    inline def setTokenIndex(value: Double): Self = StObject.set(x, "TokenIndex", value.asInstanceOf[js.Any])
  }
}
