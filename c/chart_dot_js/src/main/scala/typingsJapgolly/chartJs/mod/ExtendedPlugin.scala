package typingsJapgolly.chartJs.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtendedPlugin[TType /* <: ChartType */, O, Model] extends StObject {
  
  /**
    * @desc Called after drawing the `tooltip`. Note that this hook will not
    * be called if the tooltip drawing has been previously cancelled.
    * @param {Chart} chart - The chart instance.
    * @param {object} args - The call arguments.
    * @param {Tooltip} args.tooltip - The tooltip.
    * @param {object} options - The plugin options.
    */
  var afterTooltipDraw: js.UndefOr[
    js.Function3[
      /* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], 
      /* args */ typingsJapgolly.chartJs.anon.Tooltip[Model], 
      /* options */ O, 
      Unit
    ]
  ] = js.undefined
  
  /**
    * @desc Called before drawing the `tooltip`. If any plugin returns `false`,
    * the tooltip drawing is cancelled until another `render` is triggered.
    * @param {Chart} chart - The chart instance.
    * @param {object} args - The call arguments.
    * @param {Tooltip} args.tooltip - The tooltip.
    * @param {object} options - The plugin options.
    * @returns {boolean} `false` to cancel the chart tooltip drawing.
    */
  var beforeTooltipDraw: js.UndefOr[
    js.Function3[
      /* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], 
      /* args */ typingsJapgolly.chartJs.anon.Tooltip[Model], 
      /* options */ O, 
      Boolean | Unit
    ]
  ] = js.undefined
}
object ExtendedPlugin {
  
  inline def apply[TType /* <: ChartType */, O, Model](): ExtendedPlugin[TType, O, Model] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtendedPlugin[TType, O, Model]]
  }
  
  extension [Self <: ExtendedPlugin[?, ?, ?], TType /* <: ChartType */, O, Model](x: Self & (ExtendedPlugin[TType, O, Model])) {
    
    inline def setAfterTooltipDraw(
      value: (/* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], /* args */ typingsJapgolly.chartJs.anon.Tooltip[Model], /* options */ O) => Callback
    ): Self = StObject.set(x, "afterTooltipDraw", js.Any.fromFunction3((t0: /* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], t1: /* args */ typingsJapgolly.chartJs.anon.Tooltip[Model], t2: /* options */ O) => (value(t0, t1, t2)).runNow()))
    
    inline def setAfterTooltipDrawUndefined: Self = StObject.set(x, "afterTooltipDraw", js.undefined)
    
    inline def setBeforeTooltipDraw(
      value: (/* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], /* args */ typingsJapgolly.chartJs.anon.Tooltip[Model], /* options */ O) => Boolean | Unit
    ): Self = StObject.set(x, "beforeTooltipDraw", js.Any.fromFunction3(value))
    
    inline def setBeforeTooltipDrawUndefined: Self = StObject.set(x, "beforeTooltipDraw", js.undefined)
  }
}
