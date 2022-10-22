package typingsJapgolly.teechart.Tee

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAxisTitle
  extends StObject
     with IAnnotation {
  
  var padding: Double
}
object IAxisTitle {
  
  inline def apply(
    active: Boolean,
    add: String => IAnnotation,
    bounds: IRectangle,
    chart: IChart,
    clicked: IPoint => Boolean,
    draw: Callback,
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
  ): IAxisTitle = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], add = js.Any.fromFunction1(add), bounds = bounds.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], clicked = js.Any.fromFunction1(clicked), draw = draw.toJsFn, format = format.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], margins = margins.asInstanceOf[js.Any], mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), padding = padding.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], resize = resize.toJsFn, text = text.asInstanceOf[js.Any], transparent = transparent.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAxisTitle]
  }
  
  extension [Self <: IAxisTitle](x: Self) {
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
  }
}
