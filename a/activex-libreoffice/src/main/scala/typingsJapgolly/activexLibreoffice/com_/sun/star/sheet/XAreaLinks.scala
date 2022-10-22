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
  * provides access via index to a collection of area links and inserting and removing area links.
  * @see com.sun.star.sheet.CellAreaLinks
  * @see com.sun.star.sheet.CellAreaLink
  */
trait XAreaLinks
  extends StObject
     with XIndexAccess {
  
  /**
    * creates an area link and adds it to the collection.
    * @param aDestPos the address of the first cell of the range inside the current document.
    * @param aFileName the URL of the source document.
    * @param aSourceArea the name of the range in the source document.  This can be the address of a cell or range in the form "Sheet1.A1:C5", or the name of
    * @param aFilter the name of the filter used to load the source document.
    * @param aFilterOptions optional filter options for the specified filter.
    */
  def insertAtPosition(
    aDestPos: CellAddress,
    aFileName: String,
    aSourceArea: String,
    aFilter: String,
    aFilterOptions: String
  ): Unit
  
  /** removes an area link from the collection. */
  def removeByIndex(nIndex: Double): Unit
}
object XAreaLinks {
  
  inline def apply(
    Count: Double,
    ElementType: `type`,
    acquire: Callback,
    getByIndex: Double => Any,
    getCount: CallbackTo[Double],
    getElementType: CallbackTo[`type`],
    hasElements: CallbackTo[Boolean],
    insertAtPosition: (CellAddress, String, String, String, String) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeByIndex: Double => Callback
  ): XAreaLinks = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = acquire.toJsFn, getByIndex = js.Any.fromFunction1(getByIndex), getCount = getCount.toJsFn, getElementType = getElementType.toJsFn, hasElements = hasElements.toJsFn, insertAtPosition = js.Any.fromFunction5((t0: CellAddress, t1: String, t2: String, t3: String, t4: String) => (insertAtPosition(t0, t1, t2, t3, t4)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeByIndex = js.Any.fromFunction1((t0: Double) => removeByIndex(t0).runNow()))
    __obj.asInstanceOf[XAreaLinks]
  }
  
  extension [Self <: XAreaLinks](x: Self) {
    
    inline def setInsertAtPosition(value: (CellAddress, String, String, String, String) => Callback): Self = StObject.set(x, "insertAtPosition", js.Any.fromFunction5((t0: CellAddress, t1: String, t2: String, t3: String, t4: String) => (value(t0, t1, t2, t3, t4)).runNow()))
    
    inline def setRemoveByIndex(value: Double => Callback): Self = StObject.set(x, "removeByIndex", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
