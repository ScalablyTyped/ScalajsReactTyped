package typingsJapgolly.rcSlider

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import typingsJapgolly.rcSlider.libInterfaceMod.OnStartMove
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTracksTrackMod {
  
  @JSImport("rc-slider/lib/Tracks/Track", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: TrackProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait TrackProps extends StObject {
    
    var end: Double
    
    var index: Double
    
    var onStartMove: js.UndefOr[OnStartMove] = js.undefined
    
    var prefixCls: String
    
    var start: Double
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object TrackProps {
    
    inline def apply(end: Double, index: Double, prefixCls: String, start: Double): TrackProps = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrackProps]
    }
    
    extension [Self <: TrackProps](x: Self) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setOnStartMove(
        value: (/* e */ ReactMouseEventFrom[org.scalajs.dom.Element] | ReactTouchEventFrom[org.scalajs.dom.Element], /* valueIndex */ Double) => Callback
      ): Self = StObject.set(x, "onStartMove", js.Any.fromFunction2((t0: /* e */ ReactMouseEventFrom[org.scalajs.dom.Element] | ReactTouchEventFrom[org.scalajs.dom.Element], t1: /* valueIndex */ Double) => (value(t0, t1)).runNow()))
      
      inline def setOnStartMoveUndefined: Self = StObject.set(x, "onStartMove", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
