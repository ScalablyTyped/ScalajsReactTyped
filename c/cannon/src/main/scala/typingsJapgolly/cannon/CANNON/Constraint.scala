package typingsJapgolly.cannon.CANNON

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Constraint extends StObject {
  
  var bodyA: Body
  
  var bodyB: Body
  
  var collideConnected: Boolean
  
  def disable(): Unit
  
  def enable(): Unit
  
  var equations: js.Array[Any]
  
  var id: Double
  
  def update(): Unit
}
object Constraint {
  
  inline def apply(
    bodyA: Body,
    bodyB: Body,
    collideConnected: Boolean,
    disable: Callback,
    enable: Callback,
    equations: js.Array[Any],
    id: Double,
    update: Callback
  ): Constraint = {
    val __obj = js.Dynamic.literal(bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], collideConnected = collideConnected.asInstanceOf[js.Any], disable = disable.toJsFn, enable = enable.toJsFn, equations = equations.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], update = update.toJsFn)
    __obj.asInstanceOf[Constraint]
  }
  
  extension [Self <: Constraint](x: Self) {
    
    inline def setBodyA(value: Body): Self = StObject.set(x, "bodyA", value.asInstanceOf[js.Any])
    
    inline def setBodyB(value: Body): Self = StObject.set(x, "bodyB", value.asInstanceOf[js.Any])
    
    inline def setCollideConnected(value: Boolean): Self = StObject.set(x, "collideConnected", value.asInstanceOf[js.Any])
    
    inline def setDisable(value: Callback): Self = StObject.set(x, "disable", value.toJsFn)
    
    inline def setEnable(value: Callback): Self = StObject.set(x, "enable", value.toJsFn)
    
    inline def setEquations(value: js.Array[Any]): Self = StObject.set(x, "equations", value.asInstanceOf[js.Any])
    
    inline def setEquationsVarargs(value: Any*): Self = StObject.set(x, "equations", js.Array(value*))
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: Callback): Self = StObject.set(x, "update", value.toJsFn)
  }
}
