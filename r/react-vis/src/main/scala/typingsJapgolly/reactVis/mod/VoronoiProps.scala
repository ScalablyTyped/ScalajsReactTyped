package typingsJapgolly.reactVis.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoronoiProps extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  // default: ''
  var extent: js.Array[js.Array[Double]]
  
  var nodes: js.Array[VoronoiPoint]
  
  var onBlur: js.UndefOr[RVMouseEventHandler] = js.undefined
  
  var onClick: js.UndefOr[RVMouseEventHandler] = js.undefined
  
  var onHover: js.UndefOr[RVMouseEventHandler] = js.undefined
  
  var onMouseDown: js.UndefOr[RVMouseEventHandler] = js.undefined
  
  var onMouseUp: js.UndefOr[RVMouseEventHandler] = js.undefined
  
  var x: js.UndefOr[js.Function1[/* d */ Any, Double]] = js.undefined
  
  var y: js.UndefOr[js.Function1[/* d */ Any, Double]] = js.undefined
}
object VoronoiProps {
  
  inline def apply(extent: js.Array[js.Array[Double]], nodes: js.Array[VoronoiPoint]): VoronoiProps = {
    val __obj = js.Dynamic.literal(extent = extent.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoronoiProps]
  }
  
  extension [Self <: VoronoiProps](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setExtent(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    inline def setExtentVarargs(value: js.Array[Double]*): Self = StObject.set(x, "extent", js.Array(value*))
    
    inline def setNodes(value: js.Array[VoronoiPoint]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: VoronoiPoint*): Self = StObject.set(x, "nodes", js.Array(value*))
    
    inline def setOnBlur(value: ReactMouseEventFrom[HTMLElement & Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnClick(value: ReactMouseEventFrom[HTMLElement & Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnHover(value: ReactMouseEventFrom[HTMLElement & Element] => Callback): Self = StObject.set(x, "onHover", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def setOnHoverUndefined: Self = StObject.set(x, "onHover", js.undefined)
    
    inline def setOnMouseDown(value: ReactMouseEventFrom[HTMLElement & Element] => Callback): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    
    inline def setOnMouseUp(value: ReactMouseEventFrom[HTMLElement & Element] => Callback): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
    
    inline def setX(value: /* d */ Any => Double): Self = StObject.set(x, "x", js.Any.fromFunction1(value))
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: /* d */ Any => Double): Self = StObject.set(x, "y", js.Any.fromFunction1(value))
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
