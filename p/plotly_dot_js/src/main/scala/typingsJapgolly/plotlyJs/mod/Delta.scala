package typingsJapgolly.plotlyJs.mod

import typingsJapgolly.plotlyJs.anon.Symbol
import typingsJapgolly.plotlyJs.plotlyJsStrings.bottom
import typingsJapgolly.plotlyJs.plotlyJsStrings.left
import typingsJapgolly.plotlyJs.plotlyJsStrings.right
import typingsJapgolly.plotlyJs.plotlyJsStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Delta extends StObject {
  
  var decreasing: Symbol
  
  var increasing: Symbol
  
  var position: top | bottom | left | right
  
  var reference: Double
  
  var relative: Boolean
  
  var valueformat: String
}
object Delta {
  
  inline def apply(
    decreasing: Symbol,
    increasing: Symbol,
    position: top | bottom | left | right,
    reference: Double,
    relative: Boolean,
    valueformat: String
  ): Delta = {
    val __obj = js.Dynamic.literal(decreasing = decreasing.asInstanceOf[js.Any], increasing = increasing.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], relative = relative.asInstanceOf[js.Any], valueformat = valueformat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delta]
  }
  
  extension [Self <: Delta](x: Self) {
    
    inline def setDecreasing(value: Symbol): Self = StObject.set(x, "decreasing", value.asInstanceOf[js.Any])
    
    inline def setIncreasing(value: Symbol): Self = StObject.set(x, "increasing", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: top | bottom | left | right): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setReference(value: Double): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
    
    inline def setValueformat(value: String): Self = StObject.set(x, "valueformat", value.asInstanceOf[js.Any])
  }
}
