package typingsJapgolly.three.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.three.srcThreeMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Func extends StObject {
  
  def func(u: Double, v: Double, dest: Vector3): Unit
  
  var slices: Double
  
  var stacks: Double
}
object Func {
  
  inline def apply(func: (Double, Double, Vector3) => Callback, slices: Double, stacks: Double): Func = {
    val __obj = js.Dynamic.literal(func = js.Any.fromFunction3((t0: Double, t1: Double, t2: Vector3) => (func(t0, t1, t2)).runNow()), slices = slices.asInstanceOf[js.Any], stacks = stacks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Func]
  }
  
  extension [Self <: Func](x: Self) {
    
    inline def setFunc(value: (Double, Double, Vector3) => Callback): Self = StObject.set(x, "func", js.Any.fromFunction3((t0: Double, t1: Double, t2: Vector3) => (value(t0, t1, t2)).runNow()))
    
    inline def setSlices(value: Double): Self = StObject.set(x, "slices", value.asInstanceOf[js.Any])
    
    inline def setStacks(value: Double): Self = StObject.set(x, "stacks", value.asInstanceOf[js.Any])
  }
}
