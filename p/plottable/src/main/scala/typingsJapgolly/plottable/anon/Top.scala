package typingsJapgolly.plottable.anon

import typingsJapgolly.plottable.plottableStrings.bottom
import typingsJapgolly.plottable.plottableStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Top extends StObject {
  
  var bottom: typingsJapgolly.plottable.plottableStrings.bottom
  
  var top: typingsJapgolly.plottable.plottableStrings.top
}
object Top {
  
  inline def apply(): Top = {
    val __obj = js.Dynamic.literal(bottom = "bottom", top = "top")
    __obj.asInstanceOf[Top]
  }
  
  extension [Self <: Top](x: Self) {
    
    inline def setBottom(value: bottom): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setTop(value: top): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
