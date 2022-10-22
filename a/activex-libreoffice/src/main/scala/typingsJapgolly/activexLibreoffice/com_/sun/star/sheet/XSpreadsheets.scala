package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameContainer
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides methods to access the spreadsheets by name and to insert, copy, remove and rearrange spreadsheets.
  * @see com.sun.star.sheet.Spreadsheets
  */
trait XSpreadsheets
  extends StObject
     with XNameContainer {
  
  /**
    * copies a sheet within the collection.
    * @param aName the name of the spreadsheet to copy.
    * @param aCopy the name of the copy of the spreadsheet.
    * @param nDestination the index of the copy in the collection.
    */
  def copyByName(aName: String, aCopy: String, nDestination: Double): Unit
  
  /**
    * inserts a new sheet into the collection.
    * @param aName the name of the new spreadsheet.
    * @param nPosition the index of the new spreadsheet in the collection.
    */
  def insertNewByName(aName: String, nPosition: Double): Unit
  
  /**
    * moves a sheet within the collection.
    * @param aName the name of the spreadsheet to move.
    * @param nDestination the new index of the spreadsheet in the collection.
    */
  def moveByName(aName: String, nDestination: Double): Unit
}
object XSpreadsheets {
  
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
    insertByName: (String, Any) => Callback,
    insertNewByName: (String, Double) => Callback,
    moveByName: (String, Double) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeByName: String => Callback,
    replaceByName: (String, Any) => Callback
  ): XSpreadsheets = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = acquire.toJsFn, copyByName = js.Any.fromFunction3((t0: String, t1: String, t2: Double) => (copyByName(t0, t1, t2)).runNow()), getByName = js.Any.fromFunction1(getByName), getElementNames = getElementNames.toJsFn, getElementType = getElementType.toJsFn, hasByName = js.Any.fromFunction1(hasByName), hasElements = hasElements.toJsFn, insertByName = js.Any.fromFunction2((t0: String, t1: Any) => (insertByName(t0, t1)).runNow()), insertNewByName = js.Any.fromFunction2((t0: String, t1: Double) => (insertNewByName(t0, t1)).runNow()), moveByName = js.Any.fromFunction2((t0: String, t1: Double) => (moveByName(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeByName = js.Any.fromFunction1((t0: String) => removeByName(t0).runNow()), replaceByName = js.Any.fromFunction2((t0: String, t1: Any) => (replaceByName(t0, t1)).runNow()))
    __obj.asInstanceOf[XSpreadsheets]
  }
  
  extension [Self <: XSpreadsheets](x: Self) {
    
    inline def setCopyByName(value: (String, String, Double) => Callback): Self = StObject.set(x, "copyByName", js.Any.fromFunction3((t0: String, t1: String, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setInsertNewByName(value: (String, Double) => Callback): Self = StObject.set(x, "insertNewByName", js.Any.fromFunction2((t0: String, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setMoveByName(value: (String, Double) => Callback): Self = StObject.set(x, "moveByName", js.Any.fromFunction2((t0: String, t1: Double) => (value(t0, t1)).runNow()))
  }
}
