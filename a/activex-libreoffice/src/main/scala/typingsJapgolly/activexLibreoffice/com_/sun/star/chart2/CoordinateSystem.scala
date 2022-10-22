package typingsJapgolly.activexLibreoffice.com_.sun.star.chart2

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XCloneable
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoordinateSystem
  extends StObject
     with XCoordinateSystem
     with XChartTypeContainer
     with XCloneable {
  
  var SwapXAndYAxis: Boolean
}
object CoordinateSystem {
  
  inline def apply(
    ChartTypes: SafeArray[XChartType],
    CoordinateSystemType: String,
    Dimension: Double,
    SwapXAndYAxis: Boolean,
    ViewServiceName: String,
    acquire: Callback,
    addChartType: XChartType => Callback,
    createClone: CallbackTo[XCloneable],
    getAxisByDimension: (Double, Double) => XAxis,
    getChartTypes: CallbackTo[SafeArray[XChartType]],
    getCoordinateSystemType: CallbackTo[String],
    getDimension: CallbackTo[Double],
    getMaximumAxisIndexByDimension: Double => Double,
    getViewServiceName: CallbackTo[String],
    queryInterface: `type` => Any,
    release: Callback,
    removeChartType: XChartType => Callback,
    setAxisByDimension: (Double, XAxis, Double) => Callback,
    setChartTypes: SeqEquiv[XChartType] => Callback
  ): CoordinateSystem = {
    val __obj = js.Dynamic.literal(ChartTypes = ChartTypes.asInstanceOf[js.Any], CoordinateSystemType = CoordinateSystemType.asInstanceOf[js.Any], Dimension = Dimension.asInstanceOf[js.Any], SwapXAndYAxis = SwapXAndYAxis.asInstanceOf[js.Any], ViewServiceName = ViewServiceName.asInstanceOf[js.Any], acquire = acquire.toJsFn, addChartType = js.Any.fromFunction1((t0: XChartType) => addChartType(t0).runNow()), createClone = createClone.toJsFn, getAxisByDimension = js.Any.fromFunction2(getAxisByDimension), getChartTypes = getChartTypes.toJsFn, getCoordinateSystemType = getCoordinateSystemType.toJsFn, getDimension = getDimension.toJsFn, getMaximumAxisIndexByDimension = js.Any.fromFunction1(getMaximumAxisIndexByDimension), getViewServiceName = getViewServiceName.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeChartType = js.Any.fromFunction1((t0: XChartType) => removeChartType(t0).runNow()), setAxisByDimension = js.Any.fromFunction3((t0: Double, t1: XAxis, t2: Double) => (setAxisByDimension(t0, t1, t2)).runNow()), setChartTypes = js.Any.fromFunction1((t0: SeqEquiv[XChartType]) => setChartTypes(t0).runNow()))
    __obj.asInstanceOf[CoordinateSystem]
  }
  
  extension [Self <: CoordinateSystem](x: Self) {
    
    inline def setSwapXAndYAxis(value: Boolean): Self = StObject.set(x, "SwapXAndYAxis", value.asInstanceOf[js.Any])
  }
}
