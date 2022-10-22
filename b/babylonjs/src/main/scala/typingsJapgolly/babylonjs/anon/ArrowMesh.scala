package typingsJapgolly.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrowMesh extends StObject {
  
  var arrowMesh: typingsJapgolly.babylonjs.meshesMeshMod.Mesh
  
  var arrowTail: typingsJapgolly.babylonjs.meshesMeshMod.Mesh
}
object ArrowMesh {
  
  inline def apply(
    arrowMesh: typingsJapgolly.babylonjs.meshesMeshMod.Mesh,
    arrowTail: typingsJapgolly.babylonjs.meshesMeshMod.Mesh
  ): ArrowMesh = {
    val __obj = js.Dynamic.literal(arrowMesh = arrowMesh.asInstanceOf[js.Any], arrowTail = arrowTail.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrowMesh]
  }
  
  extension [Self <: ArrowMesh](x: Self) {
    
    inline def setArrowMesh(value: typingsJapgolly.babylonjs.meshesMeshMod.Mesh): Self = StObject.set(x, "arrowMesh", value.asInstanceOf[js.Any])
    
    inline def setArrowTail(value: typingsJapgolly.babylonjs.meshesMeshMod.Mesh): Self = StObject.set(x, "arrowTail", value.asInstanceOf[js.Any])
  }
}
