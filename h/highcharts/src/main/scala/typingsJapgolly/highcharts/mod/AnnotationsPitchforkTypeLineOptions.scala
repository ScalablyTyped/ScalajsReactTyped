package typingsJapgolly.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationsPitchforkTypeLineOptions extends StObject {
  
  var fill: js.UndefOr[String] = js.undefined
}
object AnnotationsPitchforkTypeLineOptions {
  
  inline def apply(): AnnotationsPitchforkTypeLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsPitchforkTypeLineOptions]
  }
  
  extension [Self <: AnnotationsPitchforkTypeLineOptions](x: Self) {
    
    inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
  }
}
