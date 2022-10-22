package typingsJapgolly.activexLibreoffice.com_.sun.star.chart

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to receive events when chart data changes. */
trait XChartDataChangeEventListener
  extends StObject
     with XEventListener {
  
  /**
    * is called whenever chart data changes in value or structure.
    *
    * This interface must be implemented by components that wish to get notified of changes in chart data. They can be registered at an {@link XChartData}
    * component.
    * @param aEvent the event that gives further information on what changed.
    * @see ChartDataChangeEvent
    * @see XChartData
    */
  def chartDataChanged(aEvent: ChartDataChangeEvent): Unit
}
object XChartDataChangeEventListener {
  
  inline def apply(
    acquire: Callback,
    chartDataChanged: ChartDataChangeEvent => Callback,
    disposing: EventObject => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XChartDataChangeEventListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, chartDataChanged = js.Any.fromFunction1((t0: ChartDataChangeEvent) => chartDataChanged(t0).runNow()), disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XChartDataChangeEventListener]
  }
  
  extension [Self <: XChartDataChangeEventListener](x: Self) {
    
    inline def setChartDataChanged(value: ChartDataChangeEvent => Callback): Self = StObject.set(x, "chartDataChanged", js.Any.fromFunction1((t0: ChartDataChangeEvent) => value(t0).runNow()))
  }
}
