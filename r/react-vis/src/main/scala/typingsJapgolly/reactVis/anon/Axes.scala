package typingsJapgolly.reactVis.anon

import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Axes extends StObject {
  
  var axes: js.UndefOr[CSSProperties] = js.undefined
  
  var labels: js.UndefOr[CSSProperties] = js.undefined
  
  var lines: js.UndefOr[CSSProperties] = js.undefined
}
object Axes {
  
  inline def apply(): Axes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Axes]
  }
  
  extension [Self <: Axes](x: Self) {
    
    inline def setAxes(value: CSSProperties): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
    
    inline def setAxesUndefined: Self = StObject.set(x, "axes", js.undefined)
    
    inline def setLabels(value: CSSProperties): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLines(value: CSSProperties): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
  }
}
