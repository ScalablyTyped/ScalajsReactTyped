package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * extends {@link XSpreadsheets} interface to import external sheets.
  * @see com.sun.star.sheet.Spreadsheets
  */
trait XSpreadsheets2
  extends StObject
     with XSpreadsheets {
  
  /**
    * copies a sheet from a source document.
    * @param srcDoc a valid {@link XSpreadsheetDocument} reference to source doc
    * @param srcName the source sheet name. Throw IllegalArgumentException if not valid
    * @param nDestPosition the destination sheet position. Throw IndexOutOfBoundsException if not valid
    * @returns the position of the imported sheet
    * @since LibreOffice 3.5
    * @throws com::sun::star::lang::IllegalArgumentException
    * @throws com::sun::star::lang::IndexOutOfBoundsException
    */
  def importSheet(srcDoc: XSpreadsheetDocument, srcName: String, nDestPosition: Double): Double
}
object XSpreadsheets2 {
  
  inline def apply(
    ElementNames: SafeArray[String],
    ElementType: `type`,
    acquire: Callback,
    copyByName: (String, String, Double) => Callback,
    getByName: String => Any,
    getElementNames: CallbackTo[SafeArray[String]],
    getElementType: CallbackTo[`type`],
    hasByName: String => Boolean,
    hasElements: CallbackTo[Boolean],
    importSheet: (XSpreadsheetDocument, String, Double) => Double,
    insertByName: (String, Any) => Callback,
    insertNewByName: (String, Double) => Callback,
    moveByName: (String, Double) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeByName: String => Callback,
    replaceByName: (String, Any) => Callback
  ): XSpreadsheets2 = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = acquire.toJsFn, copyByName = js.Any.fromFunction3((t0: String, t1: String, t2: Double) => (copyByName(t0, t1, t2)).runNow()), getByName = js.Any.fromFunction1(getByName), getElementNames = getElementNames.toJsFn, getElementType = getElementType.toJsFn, hasByName = js.Any.fromFunction1(hasByName), hasElements = hasElements.toJsFn, importSheet = js.Any.fromFunction3(importSheet), insertByName = js.Any.fromFunction2((t0: String, t1: Any) => (insertByName(t0, t1)).runNow()), insertNewByName = js.Any.fromFunction2((t0: String, t1: Double) => (insertNewByName(t0, t1)).runNow()), moveByName = js.Any.fromFunction2((t0: String, t1: Double) => (moveByName(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeByName = js.Any.fromFunction1((t0: String) => removeByName(t0).runNow()), replaceByName = js.Any.fromFunction2((t0: String, t1: Any) => (replaceByName(t0, t1)).runNow()))
    __obj.asInstanceOf[XSpreadsheets2]
  }
  
  extension [Self <: XSpreadsheets2](x: Self) {
    
    inline def setImportSheet(value: (XSpreadsheetDocument, String, Double) => Double): Self = StObject.set(x, "importSheet", js.Any.fromFunction3(value))
  }
}
