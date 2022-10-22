package typingsJapgolly.physijs.mod

import typingsJapgolly.three.mod.Object3D
import typingsJapgolly.three.mod.Vector3
import typingsJapgolly.three.srcCoreEventDispatcherMod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HingeConstraintDefinition extends StObject {
  
  var axis: Vector3
  
  var id: Double
  
  var objecta: Object3D[Event]
  
  var objectb: Object3D[Event]
  
  var positiona: Vector3
  
  var positionb: Vector3
  
  var `type`: String
}
object HingeConstraintDefinition {
  
  inline def apply(
    axis: Vector3,
    id: Double,
    objecta: Object3D[Event],
    objectb: Object3D[Event],
    positiona: Vector3,
    positionb: Vector3,
    `type`: String
  ): HingeConstraintDefinition = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], objecta = objecta.asInstanceOf[js.Any], objectb = objectb.asInstanceOf[js.Any], positiona = positiona.asInstanceOf[js.Any], positionb = positionb.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HingeConstraintDefinition]
  }
  
  extension [Self <: HingeConstraintDefinition](x: Self) {
    
    inline def setAxis(value: Vector3): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setObjecta(value: Object3D[Event]): Self = StObject.set(x, "objecta", value.asInstanceOf[js.Any])
    
    inline def setObjectb(value: Object3D[Event]): Self = StObject.set(x, "objectb", value.asInstanceOf[js.Any])
    
    inline def setPositiona(value: Vector3): Self = StObject.set(x, "positiona", value.asInstanceOf[js.Any])
    
    inline def setPositionb(value: Vector3): Self = StObject.set(x, "positionb", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
