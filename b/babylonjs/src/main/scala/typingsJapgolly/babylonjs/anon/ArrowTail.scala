package typingsJapgolly.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrowTail extends StObject {
  
  var arrowMesh: typingsJapgolly.babylonjs.BABYLON.Mesh
  
  var arrowTail: typingsJapgolly.babylonjs.BABYLON.Mesh
}
object ArrowTail {
  
  inline def apply(
    arrowMesh: typingsJapgolly.babylonjs.BABYLON.Mesh,
    arrowTail: typingsJapgolly.babylonjs.BABYLON.Mesh
  ): ArrowTail = {
    val __obj = js.Dynamic.literal(arrowMesh = arrowMesh.asInstanceOf[js.Any], arrowTail = arrowTail.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrowTail]
  }
  
  extension [Self <: ArrowTail](x: Self) {
    
    inline def setArrowMesh(value: typingsJapgolly.babylonjs.BABYLON.Mesh): Self = StObject.set(x, "arrowMesh", value.asInstanceOf[js.Any])
    
    inline def setArrowTail(value: typingsJapgolly.babylonjs.BABYLON.Mesh): Self = StObject.set(x, "arrowTail", value.asInstanceOf[js.Any])
  }
}
