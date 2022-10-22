package typingsJapgolly.extjs.Ext.chart

import japgolly.scalajs.react.Callback
import typingsJapgolly.extjs.Ext.chart.axis.IAbstract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAxis
  extends StObject
     with IAbstract {
  
  /** [Config Option] (Boolean) */
  var adjustEnd: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Number) */
  var dashSize: js.UndefOr[Double] = js.undefined
  
  /** [Method] Renders the axis into the screen and updates its position
    * @param init Object
    */
  var drawAxis: js.UndefOr[js.Function1[/* init */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Renders an horizontal and or vertical grid into the Surface  */
  var drawGrid: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Renders the labels in the axes  */
  var drawLabel: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (Boolean/Object) */
  var grid: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Boolean) */
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Number) */
  var length: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var majorTickSteps: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var minorTickSteps: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (String) */
  var position: js.UndefOr[String] = js.undefined
  
  /** [Method] Updates the title of this axis
    * @param title String
    */
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var title: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Number) */
  var width: js.UndefOr[Double] = js.undefined
}
object IAxis {
  
  inline def apply(): IAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAxis]
  }
  
  extension [Self <: IAxis](x: Self) {
    
    inline def setAdjustEnd(value: Boolean): Self = StObject.set(x, "adjustEnd", value.asInstanceOf[js.Any])
    
    inline def setAdjustEndUndefined: Self = StObject.set(x, "adjustEnd", js.undefined)
    
    inline def setDashSize(value: Double): Self = StObject.set(x, "dashSize", value.asInstanceOf[js.Any])
    
    inline def setDashSizeUndefined: Self = StObject.set(x, "dashSize", js.undefined)
    
    inline def setDrawAxis(value: /* init */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "drawAxis", js.Any.fromFunction1((t0: /* init */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setDrawAxisUndefined: Self = StObject.set(x, "drawAxis", js.undefined)
    
    inline def setDrawGrid(value: Callback): Self = StObject.set(x, "drawGrid", value.toJsFn)
    
    inline def setDrawGridUndefined: Self = StObject.set(x, "drawGrid", js.undefined)
    
    inline def setDrawLabel(value: Callback): Self = StObject.set(x, "drawLabel", value.toJsFn)
    
    inline def setDrawLabelUndefined: Self = StObject.set(x, "drawLabel", js.undefined)
    
    inline def setGrid(value: Any): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setMajorTickSteps(value: Double): Self = StObject.set(x, "majorTickSteps", value.asInstanceOf[js.Any])
    
    inline def setMajorTickStepsUndefined: Self = StObject.set(x, "majorTickSteps", js.undefined)
    
    inline def setMinorTickSteps(value: Double): Self = StObject.set(x, "minorTickSteps", value.asInstanceOf[js.Any])
    
    inline def setMinorTickStepsUndefined: Self = StObject.set(x, "minorTickSteps", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setSetTitle(value: /* title */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setTitle", js.Any.fromFunction1((t0: /* title */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetTitleUndefined: Self = StObject.set(x, "setTitle", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
