package typingsJapgolly.three

import typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry
import typingsJapgolly.three.srcMaterialsMaterialMod.Material
import typingsJapgolly.three.srcThreeMod.Mesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmUtilsGeometryCompressionUtilsMod {
  
  @JSImport("three/examples/jsm/utils/GeometryCompressionUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compressNormals(mesh: Mesh[BufferGeometry, Material | js.Array[Material]], encodeMethod: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compressNormals")(mesh.asInstanceOf[js.Any], encodeMethod.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def compressPositions(mesh: Mesh[BufferGeometry, Material | js.Array[Material]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("compressPositions")(mesh.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def compressUvs(mesh: Mesh[BufferGeometry, Material | js.Array[Material]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("compressUvs")(mesh.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
