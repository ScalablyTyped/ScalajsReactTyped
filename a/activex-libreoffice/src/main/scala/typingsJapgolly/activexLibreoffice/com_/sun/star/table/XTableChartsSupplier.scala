package typingsJapgolly.activexLibreoffice.com_.sun.star.table

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides a method to access a collection of charts in a table or spreadsheet. */
trait XTableChartsSupplier
  extends StObject
     with XInterface {
  
  /**
    * returns the collection of charts.
    * @see com.sun.star.table.TableCharts
    */
  val Charts: XTableCharts
  
  /**
    * returns the collection of charts.
    * @see com.sun.star.table.TableCharts
    */
  def getCharts(): XTableCharts
}
object XTableChartsSupplier {
  
  inline def apply(
    Charts: XTableCharts,
    acquire: Callback,
    getCharts: CallbackTo[XTableCharts],
    queryInterface: `type` => Any,
    release: Callback
  ): XTableChartsSupplier = {
    val __obj = js.Dynamic.literal(Charts = Charts.asInstanceOf[js.Any], acquire = acquire.toJsFn, getCharts = getCharts.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XTableChartsSupplier]
  }
  
  extension [Self <: XTableChartsSupplier](x: Self) {
    
    inline def setCharts(value: XTableCharts): Self = StObject.set(x, "Charts", value.asInstanceOf[js.Any])
    
    inline def setGetCharts(value: CallbackTo[XTableCharts]): Self = StObject.set(x, "getCharts", value.toJsFn)
  }
}
