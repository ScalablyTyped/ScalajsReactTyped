package typingsJapgolly.plottable.anon

import typingsJapgolly.plottable.plottableStrings.bottom
import typingsJapgolly.plottable.plottableStrings.center
import typingsJapgolly.plottable.plottableStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BottomCenter extends StObject {
  
  var bottom: typingsJapgolly.plottable.plottableStrings.bottom
  
  var center: typingsJapgolly.plottable.plottableStrings.center
  
  var top: typingsJapgolly.plottable.plottableStrings.top
}
object BottomCenter {
  
  inline def apply(): BottomCenter = {
    val __obj = js.Dynamic.literal(bottom = "bottom", center = "center", top = "top")
    __obj.asInstanceOf[BottomCenter]
  }
  
  extension [Self <: BottomCenter](x: Self) {
    
    inline def setBottom(value: bottom): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setCenter(value: center): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setTop(value: top): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
