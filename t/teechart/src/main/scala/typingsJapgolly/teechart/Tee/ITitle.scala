package typingsJapgolly.teechart.Tee

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITitle
  extends StObject
     with IAnnotation {
  
  var expand: Boolean
  
  var padding: Double
}
object ITitle {
  
  inline def apply(
    active: Boolean,
    add: String => IAnnotation,
    bounds: IRectangle,
    chart: IChart,
    clicked: IPoint => Boolean,
    draw: Callback,
    expand: Boolean,
    format: IFormat,
    items: js.Array[IAnnotation],
    margins: IMargins,
    mousedown: Any => Boolean,
    mousemove: Any => Boolean,
    padding: Double,
    position: IPoint,
    resize: Callback,
    text: String,
    transparent: Boolean,
    visible: Boolean
  ): ITitle = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], add = js.Any.fromFunction1(add), bounds = bounds.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], clicked = js.Any.fromFunction1(clicked), draw = draw.toJsFn, expand = expand.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], margins = margins.asInstanceOf[js.Any], mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), padding = padding.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], resize = resize.toJsFn, text = text.asInstanceOf[js.Any], transparent = transparent.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITitle]
  }
  
  extension [Self <: ITitle](x: Self) {
    
    inline def setExpand(value: Boolean): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
  }
}
