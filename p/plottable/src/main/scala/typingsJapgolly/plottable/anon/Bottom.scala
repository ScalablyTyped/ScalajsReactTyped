package typingsJapgolly.plottable.anon

import typingsJapgolly.plottable.plottableStrings.bottom
import typingsJapgolly.plottable.plottableStrings.left
import typingsJapgolly.plottable.plottableStrings.right
import typingsJapgolly.plottable.plottableStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bottom extends StObject {
  
  var bottom: typingsJapgolly.plottable.plottableStrings.bottom
  
  var left: typingsJapgolly.plottable.plottableStrings.left
  
  var right: typingsJapgolly.plottable.plottableStrings.right
  
  var top: typingsJapgolly.plottable.plottableStrings.top
}
object Bottom {
  
  inline def apply(): Bottom = {
    val __obj = js.Dynamic.literal(bottom = "bottom", left = "left", right = "right", top = "top")
    __obj.asInstanceOf[Bottom]
  }
  
  extension [Self <: Bottom](x: Self) {
    
    inline def setBottom(value: bottom): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: left): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: right): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setTop(value: top): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
