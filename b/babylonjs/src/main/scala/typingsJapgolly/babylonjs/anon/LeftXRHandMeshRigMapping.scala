package typingsJapgolly.babylonjs.anon

import typingsJapgolly.babylonjs.BABYLON.XRHandMeshRigMapping
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LeftXRHandMeshRigMapping extends StObject {
  
  var left: XRHandMeshRigMapping
  
  var right: XRHandMeshRigMapping
}
object LeftXRHandMeshRigMapping {
  
  inline def apply(left: XRHandMeshRigMapping, right: XRHandMeshRigMapping): LeftXRHandMeshRigMapping = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeftXRHandMeshRigMapping]
  }
  
  extension [Self <: LeftXRHandMeshRigMapping](x: Self) {
    
    inline def setLeft(value: XRHandMeshRigMapping): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: XRHandMeshRigMapping): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
  }
}
