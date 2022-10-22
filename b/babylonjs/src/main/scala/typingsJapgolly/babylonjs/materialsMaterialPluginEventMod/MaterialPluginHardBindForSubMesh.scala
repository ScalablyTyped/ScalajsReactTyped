package typingsJapgolly.babylonjs.materialsMaterialPluginEventMod

import typingsJapgolly.babylonjs.meshesSubMeshMod.SubMesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaterialPluginHardBindForSubMesh extends StObject {
  
  var subMesh: SubMesh
}
object MaterialPluginHardBindForSubMesh {
  
  inline def apply(subMesh: SubMesh): MaterialPluginHardBindForSubMesh = {
    val __obj = js.Dynamic.literal(subMesh = subMesh.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaterialPluginHardBindForSubMesh]
  }
  
  extension [Self <: MaterialPluginHardBindForSubMesh](x: Self) {
    
    inline def setSubMesh(value: SubMesh): Self = StObject.set(x, "subMesh", value.asInstanceOf[js.Any])
  }
}
