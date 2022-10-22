package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellAddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides methods to access cell annotations via index and to insert and remove annotations.
  * @see com.sun.star.sheet.CellAnnotation
  * @see com.sun.star.sheet.SheetCell
  */
trait XSheetAnnotations
  extends StObject
     with XIndexAccess {
  
  /**
    * creates a new annotation.
    *
    * This method creates a new annotation object, attaches it to the specified cell and inserts it into the collection.
    * @param aPosition contains the address of the cell that will contain the annotation.
    * @param aText contains the annotation text.
    */
  def insertNew(aPosition: CellAddress, aText: String): Unit
  
  /**
    * removes a cell annotation from the collection.
    *
    * This method removes the annotation from its cell and from the collection.
    * @param nIndex is the index of the annotation in the collection.
    */
  def removeByIndex(nIndex: Double): Unit
}
object XSheetAnnotations {
  
  inline def apply(
    Count: Double,
    ElementType: `type`,
    acquire: Callback,
    getByIndex: Double => Any,
    getCount: CallbackTo[Double],
    getElementType: CallbackTo[`type`],
    hasElements: CallbackTo[Boolean],
    insertNew: (CellAddress, String) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeByIndex: Double => Callback
  ): XSheetAnnotations = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = acquire.toJsFn, getByIndex = js.Any.fromFunction1(getByIndex), getCount = getCount.toJsFn, getElementType = getElementType.toJsFn, hasElements = hasElements.toJsFn, insertNew = js.Any.fromFunction2((t0: CellAddress, t1: String) => (insertNew(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeByIndex = js.Any.fromFunction1((t0: Double) => removeByIndex(t0).runNow()))
    __obj.asInstanceOf[XSheetAnnotations]
  }
  
  extension [Self <: XSheetAnnotations](x: Self) {
    
    inline def setInsertNew(value: (CellAddress, String) => Callback): Self = StObject.set(x, "insertNew", js.Any.fromFunction2((t0: CellAddress, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setRemoveByIndex(value: Double => Callback): Self = StObject.set(x, "removeByIndex", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
