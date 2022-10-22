package typingsJapgolly.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationsFibonacciLabelStyleOptions extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
}
object AnnotationsFibonacciLabelStyleOptions {
  
  inline def apply(): AnnotationsFibonacciLabelStyleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsFibonacciLabelStyleOptions]
  }
  
  extension [Self <: AnnotationsFibonacciLabelStyleOptions](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
