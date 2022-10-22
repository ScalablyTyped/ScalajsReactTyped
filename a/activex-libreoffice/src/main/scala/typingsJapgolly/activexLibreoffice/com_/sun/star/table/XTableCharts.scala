package typingsJapgolly.activexLibreoffice.com_.sun.star.table

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Rectangle
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides methods to access charts via name and to insert and remove charts.
  * @see com.sun.star.table.TableCharts
  */
trait XTableCharts
  extends StObject
     with XNameAccess {
  
  /**
    * creates a chart and adds it to the collection.
    * @param aName is the name of the chart. This name is used to reference the chart in the collection.
    * @param aRect contains the rectangular location of the chart within the table (in 1/100th mm).
    * @param aRanges all cell ranges containing the source data of the chart.
    * @param bColumnHeaders if set to `TRUE` , the topmost row of the source data will be used to set labels for the category axis or the legend.
    * @param bRowHeaders if set to `TRUE` , the leftmost column of the source data will be used to set labels for the category axis or the legend.
    */
  def addNewByName(
    aName: String,
    aRect: Rectangle,
    aRanges: SeqEquiv[CellRangeAddress],
    bColumnHeaders: Boolean,
    bRowHeaders: Boolean
  ): Unit
  
  /**
    * removes a chart from the collection.
    * @param aName is the name of the chart to remove.
    */
  def removeByName(aName: String): Unit
}
object XTableCharts {
  
  inline def apply(
    ElementNames: SafeArray[String],
    ElementType: `type`,
    acquire: Callback,
    addNewByName: (String, Rectangle, SeqEquiv[CellRangeAddress], Boolean, Boolean) => Callback,
    getByName: String => Any,
    getElementNames: CallbackTo[SafeArray[String]],
    getElementType: CallbackTo[`type`],
    hasByName: String => Boolean,
    hasElements: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    removeByName: String => Callback
  ): XTableCharts = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = acquire.toJsFn, addNewByName = js.Any.fromFunction5((t0: String, t1: Rectangle, t2: SeqEquiv[CellRangeAddress], t3: Boolean, t4: Boolean) => (addNewByName(t0, t1, t2, t3, t4)).runNow()), getByName = js.Any.fromFunction1(getByName), getElementNames = getElementNames.toJsFn, getElementType = getElementType.toJsFn, hasByName = js.Any.fromFunction1(hasByName), hasElements = hasElements.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeByName = js.Any.fromFunction1((t0: String) => removeByName(t0).runNow()))
    __obj.asInstanceOf[XTableCharts]
  }
  
  extension [Self <: XTableCharts](x: Self) {
    
    inline def setAddNewByName(value: (String, Rectangle, SeqEquiv[CellRangeAddress], Boolean, Boolean) => Callback): Self = StObject.set(x, "addNewByName", js.Any.fromFunction5((t0: String, t1: Rectangle, t2: SeqEquiv[CellRangeAddress], t3: Boolean, t4: Boolean) => (value(t0, t1, t2, t3, t4)).runNow()))
    
    inline def setRemoveByName(value: String => Callback): Self = StObject.set(x, "removeByName", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
