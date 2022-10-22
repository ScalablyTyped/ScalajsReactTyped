package typingsJapgolly.teechart.Tee

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICursorTool
  extends StObject
     with ITool {
  
  var direction: String
  
  var dragging: Double
  
  var followMouse: Boolean
  
  var format: IFormat
  
  var horizAxis: IAxis
  
  def over(point: IPoint): Boolean
  
  var render: String
  
  def setRender(render: String): Unit
  
  var size: IPoint
  
  var vertAxis: IAxis
}
object ICursorTool {
  
  inline def apply(
    active: Boolean,
    chart: IChart,
    clicked: IPoint => Boolean,
    direction: String,
    dragging: Double,
    draw: Callback,
    followMouse: Boolean,
    format: IFormat,
    horizAxis: IAxis,
    mousedown: Any => Boolean,
    mousemove: Any => Boolean,
    over: IPoint => Boolean,
    render: String,
    setRender: String => Callback,
    size: IPoint,
    vertAxis: IAxis
  ): ICursorTool = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], clicked = js.Any.fromFunction1(clicked), direction = direction.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], draw = draw.toJsFn, followMouse = followMouse.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], horizAxis = horizAxis.asInstanceOf[js.Any], mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), over = js.Any.fromFunction1(over), render = render.asInstanceOf[js.Any], setRender = js.Any.fromFunction1((t0: String) => setRender(t0).runNow()), size = size.asInstanceOf[js.Any], vertAxis = vertAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICursorTool]
  }
  
  extension [Self <: ICursorTool](x: Self) {
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDragging(value: Double): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
    
    inline def setFollowMouse(value: Boolean): Self = StObject.set(x, "followMouse", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: IFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setHorizAxis(value: IAxis): Self = StObject.set(x, "horizAxis", value.asInstanceOf[js.Any])
    
    inline def setOver(value: IPoint => Boolean): Self = StObject.set(x, "over", js.Any.fromFunction1(value))
    
    inline def setRender(value: String): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    
    inline def setSetRender(value: String => Callback): Self = StObject.set(x, "setRender", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSize(value: IPoint): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setVertAxis(value: IAxis): Self = StObject.set(x, "vertAxis", value.asInstanceOf[js.Any])
  }
}
