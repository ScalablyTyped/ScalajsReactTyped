package typingsJapgolly.activexLibreoffice.com_.sun.star.table

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexAccess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides methods to access columns via index and to insert and remove columns.
  * @see com.sun.star.table.TableColumns
  */
trait XTableColumns
  extends StObject
     with XIndexAccess {
  
  /**
    * inserts new columns.
    * @param nIndex is the index the first inserted column will have.
    * @param nCount is the number of columns to insert.
    */
  def insertByIndex(nIndex: Double, nCount: Double): Unit
  
  /**
    * deletes columns.
    * @param nIndex is the index of the first column to delete.
    * @param nCount is the number of columns to delete.
    */
  def removeByIndex(nIndex: Double, nCount: Double): Unit
}
object XTableColumns {
  
  inline def apply(
    Count: Double,
    ElementType: `type`,
    acquire: Callback,
    getByIndex: Double => Any,
    getCount: CallbackTo[Double],
    getElementType: CallbackTo[`type`],
    hasElements: CallbackTo[Boolean],
    insertByIndex: (Double, Double) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeByIndex: (Double, Double) => Callback
  ): XTableColumns = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = acquire.toJsFn, getByIndex = js.Any.fromFunction1(getByIndex), getCount = getCount.toJsFn, getElementType = getElementType.toJsFn, hasElements = hasElements.toJsFn, insertByIndex = js.Any.fromFunction2((t0: Double, t1: Double) => (insertByIndex(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeByIndex = js.Any.fromFunction2((t0: Double, t1: Double) => (removeByIndex(t0, t1)).runNow()))
    __obj.asInstanceOf[XTableColumns]
  }
  
  extension [Self <: XTableColumns](x: Self) {
    
    inline def setInsertByIndex(value: (Double, Double) => Callback): Self = StObject.set(x, "insertByIndex", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setRemoveByIndex(value: (Double, Double) => Callback): Self = StObject.set(x, "removeByIndex", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
  }
}
