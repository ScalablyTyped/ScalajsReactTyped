package typingsJapgolly.aframe.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Behavior extends StObject {
  
  def tick(): Unit
}
object Behavior {
  
  inline def apply(tick: Callback): Behavior = {
    val __obj = js.Dynamic.literal(tick = tick.toJsFn)
    __obj.asInstanceOf[Behavior]
  }
  
  extension [Self <: Behavior](x: Self) {
    
    inline def setTick(value: Callback): Self = StObject.set(x, "tick", value.toJsFn)
  }
}
