package typingsJapgolly.senchaTouch.Ext.chart.series

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPolar
  extends StObject
     with ISeries {
  
  /** [Config Option] (Array) */
  var center: js.UndefOr[Array] = js.undefined
  
  /** [Method] Returns the value of center
    * @returns Array
    */
  var getCenter: js.UndefOr[js.Function0[Array]] = js.undefined
  
  /** [Method] Returns the value of offsetX
    * @returns Number
    */
  var getOffsetX: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of offsetY
    * @returns Number
    */
  var getOffsetY: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of radius
    * @returns Number
    */
  var getRadius: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of rotation
    * @returns Number
    */
  var getRotation: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of xAxis
    * @returns Object
    */
  var getXAxis: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of xField
    * @returns String
    */
  var getXField: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of yAxis
    * @returns Object
    */
  var getYAxis: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of yField
    * @returns String
    */
  var getYField: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Config Option] (Number) */
  var offsetX: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var offsetY: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var radius: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var rotation: js.UndefOr[Double] = js.undefined
  
  /** [Method] Sets the value of center
    * @param center Array The new value.
    */
  var setCenter: js.UndefOr[js.Function1[/* center */ js.UndefOr[Array], Unit]] = js.undefined
  
  /** [Method] Sets the value of offsetX
    * @param offsetX Number The new value.
    */
  var setOffsetX: js.UndefOr[js.Function1[/* offsetX */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of offsetY
    * @param offsetY Number The new value.
    */
  var setOffsetY: js.UndefOr[js.Function1[/* offsetY */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of radius
    * @param radius Number The new value.
    */
  var setRadius: js.UndefOr[js.Function1[/* radius */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of rotation
    * @param rotation Number The new value.
    */
  var setRotation: js.UndefOr[js.Function1[/* rotation */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of xAxis
    * @param xAxis Object The new value.
    */
  var setXAxis: js.UndefOr[js.Function1[/* xAxis */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of xField
    * @param xField String The new value.
    */
  var setXField: js.UndefOr[js.Function1[/* xField */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of yAxis
    * @param yAxis Object The new value.
    */
  var setYAxis: js.UndefOr[js.Function1[/* yAxis */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of yField
    * @param yField String The new value.
    */
  var setYField: js.UndefOr[js.Function1[/* yField */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var xField: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var yField: js.UndefOr[String] = js.undefined
}
object IPolar {
  
  inline def apply(): IPolar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPolar]
  }
  
  extension [Self <: IPolar](x: Self) {
    
    inline def setCenter(value: Array): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setGetCenter(value: CallbackTo[Array]): Self = StObject.set(x, "getCenter", value.toJsFn)
    
    inline def setGetCenterUndefined: Self = StObject.set(x, "getCenter", js.undefined)
    
    inline def setGetOffsetX(value: CallbackTo[Double]): Self = StObject.set(x, "getOffsetX", value.toJsFn)
    
    inline def setGetOffsetXUndefined: Self = StObject.set(x, "getOffsetX", js.undefined)
    
    inline def setGetOffsetY(value: CallbackTo[Double]): Self = StObject.set(x, "getOffsetY", value.toJsFn)
    
    inline def setGetOffsetYUndefined: Self = StObject.set(x, "getOffsetY", js.undefined)
    
    inline def setGetRadius(value: CallbackTo[Double]): Self = StObject.set(x, "getRadius", value.toJsFn)
    
    inline def setGetRadiusUndefined: Self = StObject.set(x, "getRadius", js.undefined)
    
    inline def setGetRotation(value: CallbackTo[Double]): Self = StObject.set(x, "getRotation", value.toJsFn)
    
    inline def setGetRotationUndefined: Self = StObject.set(x, "getRotation", js.undefined)
    
    inline def setGetXAxis(value: CallbackTo[Any]): Self = StObject.set(x, "getXAxis", value.toJsFn)
    
    inline def setGetXAxisUndefined: Self = StObject.set(x, "getXAxis", js.undefined)
    
    inline def setGetXField(value: CallbackTo[String]): Self = StObject.set(x, "getXField", value.toJsFn)
    
    inline def setGetXFieldUndefined: Self = StObject.set(x, "getXField", js.undefined)
    
    inline def setGetYAxis(value: CallbackTo[Any]): Self = StObject.set(x, "getYAxis", value.toJsFn)
    
    inline def setGetYAxisUndefined: Self = StObject.set(x, "getYAxis", js.undefined)
    
    inline def setGetYField(value: CallbackTo[String]): Self = StObject.set(x, "getYField", value.toJsFn)
    
    inline def setGetYFieldUndefined: Self = StObject.set(x, "getYField", js.undefined)
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    inline def setSetCenter(value: /* center */ js.UndefOr[Array] => Callback): Self = StObject.set(x, "setCenter", js.Any.fromFunction1((t0: /* center */ js.UndefOr[Array]) => value(t0).runNow()))
    
    inline def setSetCenterUndefined: Self = StObject.set(x, "setCenter", js.undefined)
    
    inline def setSetOffsetX(value: /* offsetX */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setOffsetX", js.Any.fromFunction1((t0: /* offsetX */ js.UndefOr[Double]) => value(t0).runNow()))
    
    inline def setSetOffsetXUndefined: Self = StObject.set(x, "setOffsetX", js.undefined)
    
    inline def setSetOffsetY(value: /* offsetY */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setOffsetY", js.Any.fromFunction1((t0: /* offsetY */ js.UndefOr[Double]) => value(t0).runNow()))
    
    inline def setSetOffsetYUndefined: Self = StObject.set(x, "setOffsetY", js.undefined)
    
    inline def setSetRadius(value: /* radius */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setRadius", js.Any.fromFunction1((t0: /* radius */ js.UndefOr[Double]) => value(t0).runNow()))
    
    inline def setSetRadiusUndefined: Self = StObject.set(x, "setRadius", js.undefined)
    
    inline def setSetRotation(value: /* rotation */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setRotation", js.Any.fromFunction1((t0: /* rotation */ js.UndefOr[Double]) => value(t0).runNow()))
    
    inline def setSetRotationUndefined: Self = StObject.set(x, "setRotation", js.undefined)
    
    inline def setSetXAxis(value: /* xAxis */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setXAxis", js.Any.fromFunction1((t0: /* xAxis */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetXAxisUndefined: Self = StObject.set(x, "setXAxis", js.undefined)
    
    inline def setSetXField(value: /* xField */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setXField", js.Any.fromFunction1((t0: /* xField */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetXFieldUndefined: Self = StObject.set(x, "setXField", js.undefined)
    
    inline def setSetYAxis(value: /* yAxis */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setYAxis", js.Any.fromFunction1((t0: /* yAxis */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetYAxisUndefined: Self = StObject.set(x, "setYAxis", js.undefined)
    
    inline def setSetYField(value: /* yField */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setYField", js.Any.fromFunction1((t0: /* yField */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetYFieldUndefined: Self = StObject.set(x, "setYField", js.undefined)
    
    inline def setXField(value: String): Self = StObject.set(x, "xField", value.asInstanceOf[js.Any])
    
    inline def setXFieldUndefined: Self = StObject.set(x, "xField", js.undefined)
    
    inline def setYField(value: String): Self = StObject.set(x, "yField", value.asInstanceOf[js.Any])
    
    inline def setYFieldUndefined: Self = StObject.set(x, "yField", js.undefined)
  }
}
