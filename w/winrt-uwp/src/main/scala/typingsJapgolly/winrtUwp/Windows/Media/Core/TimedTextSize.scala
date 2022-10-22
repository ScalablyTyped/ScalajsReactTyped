package typingsJapgolly.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a size that is used to convey the values of timed text style properties. */
trait TimedTextSize extends StObject {
  
  /** The height. */
  var height: Double
  
  /** The units of the size, either pixels or percentage. */
  var unit: TimedTextUnit
  
  /** The width. */
  var width: Double
}
object TimedTextSize {
  
  inline def apply(height: Double, unit: TimedTextUnit, width: Double): TimedTextSize = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimedTextSize]
  }
  
  extension [Self <: TimedTextSize](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setUnit(value: TimedTextUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
