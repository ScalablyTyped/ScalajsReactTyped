package typingsJapgolly.three.anon

import typingsJapgolly.std.Set
import typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry
import typingsJapgolly.three.srcMaterialsMaterialMod.Material
import typingsJapgolly.three.srcThreeMod.Mesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ids extends StObject {
  
  var ids: Set[Double]
  
  var mesh: Mesh[BufferGeometry, Material | js.Array[Material]]
}
object Ids {
  
  inline def apply(ids: Set[Double], mesh: Mesh[BufferGeometry, Material | js.Array[Material]]): Ids = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], mesh = mesh.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ids]
  }
  
  extension [Self <: Ids](x: Self) {
    
    inline def setIds(value: Set[Double]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setMesh(value: Mesh[BufferGeometry, Material | js.Array[Material]]): Self = StObject.set(x, "mesh", value.asInstanceOf[js.Any])
  }
}
