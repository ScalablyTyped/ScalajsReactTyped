package typingsJapgolly.rcSlider

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.rcSlider.libInterfaceMod.OnStartMove
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTracksMod {
  
  @JSImport("rc-slider/lib/Tracks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: TrackProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait TrackProps extends StObject {
    
    var onStartMove: js.UndefOr[OnStartMove] = js.undefined
    
    var prefixCls: String
    
    var startPoint: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[CSSProperties | js.Array[CSSProperties]] = js.undefined
    
    var values: js.Array[Double]
  }
  object TrackProps {
    
    inline def apply(prefixCls: String, values: js.Array[Double]): TrackProps = {
      val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrackProps]
    }
    
    extension [Self <: TrackProps](x: Self) {
      
      inline def setOnStartMove(
        value: (/* e */ ReactMouseEventFrom[org.scalajs.dom.Element] | ReactTouchEventFrom[org.scalajs.dom.Element], /* valueIndex */ Double) => Callback
      ): Self = StObject.set(x, "onStartMove", js.Any.fromFunction2((t0: /* e */ ReactMouseEventFrom[org.scalajs.dom.Element] | ReactTouchEventFrom[org.scalajs.dom.Element], t1: /* valueIndex */ Double) => (value(t0, t1)).runNow()))
      
      inline def setOnStartMoveUndefined: Self = StObject.set(x, "onStartMove", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setStartPoint(value: Double): Self = StObject.set(x, "startPoint", value.asInstanceOf[js.Any])
      
      inline def setStartPointUndefined: Self = StObject.set(x, "startPoint", js.undefined)
      
      inline def setStyle(value: CSSProperties | js.Array[CSSProperties]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyleVarargs(value: CSSProperties*): Self = StObject.set(x, "style", js.Array(value*))
      
      inline def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
}
