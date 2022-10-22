package typingsJapgolly.plottable.anon

import typingsJapgolly.plottable.plottableStrings.canvas
import typingsJapgolly.plottable.plottableStrings.svg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Canvas extends StObject {
  
  var canvas: typingsJapgolly.plottable.plottableStrings.canvas
  
  var svg: typingsJapgolly.plottable.plottableStrings.svg
}
object Canvas {
  
  inline def apply(): Canvas = {
    val __obj = js.Dynamic.literal(canvas = "canvas", svg = "svg")
    __obj.asInstanceOf[Canvas]
  }
  
  extension [Self <: Canvas](x: Self) {
    
    inline def setCanvas(value: canvas): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
    
    inline def setSvg(value: svg): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
  }
}
