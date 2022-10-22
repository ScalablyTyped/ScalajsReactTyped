package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.circle
import typingsJapgolly.baseui.baseuiStrings.default_
import typingsJapgolly.baseui.baseuiStrings.pill
import typingsJapgolly.baseui.baseuiStrings.round_
import typingsJapgolly.baseui.baseuiStrings.square
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Circle extends StObject {
  
  val default: default_
  
  val circle: typingsJapgolly.baseui.baseuiStrings.circle
  
  val pill: typingsJapgolly.baseui.baseuiStrings.pill
  
  val round: round_
  
  val square: typingsJapgolly.baseui.baseuiStrings.square
}
object Circle {
  
  inline def apply(): Circle = {
    val __obj = js.Dynamic.literal(circle = "circle", default = "default", pill = "pill", round = "round", square = "square")
    __obj.asInstanceOf[Circle]
  }
  
  extension [Self <: Circle](x: Self) {
    
    inline def setCircle(value: circle): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
    
    inline def setDefault(value: default_): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setPill(value: pill): Self = StObject.set(x, "pill", value.asInstanceOf[js.Any])
    
    inline def setRound(value: round_): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
    
    inline def setSquare(value: square): Self = StObject.set(x, "square", value.asInstanceOf[js.Any])
  }
}
