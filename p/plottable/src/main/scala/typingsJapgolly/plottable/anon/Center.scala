package typingsJapgolly.plottable.anon

import typingsJapgolly.plottable.plottableStrings.center
import typingsJapgolly.plottable.plottableStrings.left
import typingsJapgolly.plottable.plottableStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Center extends StObject {
  
  var center: typingsJapgolly.plottable.plottableStrings.center
  
  var left: typingsJapgolly.plottable.plottableStrings.left
  
  var right: typingsJapgolly.plottable.plottableStrings.right
}
object Center {
  
  inline def apply(): Center = {
    val __obj = js.Dynamic.literal(center = "center", left = "left", right = "right")
    __obj.asInstanceOf[Center]
  }
  
  extension [Self <: Center](x: Self) {
    
    inline def setCenter(value: center): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: left): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: right): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
  }
}
