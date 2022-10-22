package typingsJapgolly.aframe.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.aframe.aframeStrings.alternate
import typingsJapgolly.aframe.aframeStrings.alternateReverse
import typingsJapgolly.aframe.aframeStrings.backwards
import typingsJapgolly.aframe.aframeStrings.both
import typingsJapgolly.aframe.aframeStrings.forwards
import typingsJapgolly.aframe.aframeStrings.indefinite
import typingsJapgolly.aframe.aframeStrings.none
import typingsJapgolly.aframe.aframeStrings.normal
import typingsJapgolly.aframe.aframeStrings.reverse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Animation extends StObject {
  
  var attribute: String
  
  var begin: String | Double
  
  var delay: Double
  
  var direction: alternate | alternateReverse | normal | reverse
  
  var dur: Double
  
  def easing(): Unit
  
  var end: String
  
  var fill: backwards | both | forwards | none
  
  var from: Any
  
  // TODO type
  var repeat: Double | indefinite
  
  var to: Double
}
object Animation {
  
  inline def apply(
    attribute: String,
    begin: String | Double,
    delay: Double,
    direction: alternate | alternateReverse | normal | reverse,
    dur: Double,
    easing: Callback,
    end: String,
    fill: backwards | both | forwards | none,
    from: Any,
    repeat: Double | indefinite,
    to: Double
  ): Animation = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], begin = begin.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], dur = dur.asInstanceOf[js.Any], easing = easing.toJsFn, end = end.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], repeat = repeat.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animation]
  }
  
  extension [Self <: Animation](x: Self) {
    
    inline def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setBegin(value: String | Double): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDirection(value: alternate | alternateReverse | normal | reverse): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDur(value: Double): Self = StObject.set(x, "dur", value.asInstanceOf[js.Any])
    
    inline def setEasing(value: Callback): Self = StObject.set(x, "easing", value.toJsFn)
    
    inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setFill(value: backwards | both | forwards | none): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFrom(value: Any): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setRepeat(value: Double | indefinite): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
