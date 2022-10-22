package typingsJapgolly.three

import typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry
import typingsJapgolly.three.srcCoreEventDispatcherMod.Event
import typingsJapgolly.three.srcMaterialsMaterialMod.Material
import typingsJapgolly.three.srcThreeMod.Group
import typingsJapgolly.three.srcThreeMod.InstancedMesh
import typingsJapgolly.three.srcThreeMod.Mesh
import typingsJapgolly.three.srcThreeMod.Object3D
import typingsJapgolly.three.srcThreeMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmUtilsSceneUtilsMod {
  
  @JSImport("three/examples/jsm/utils/SceneUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def attach(child: Object3D[Event], scene: Scene, parent: Object3D[Event]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attach")(child.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createMeshesFromInstancedMesh(instancedMesh: InstancedMesh[BufferGeometry, Material | js.Array[Material]]): Group = ^.asInstanceOf[js.Dynamic].applyDynamic("createMeshesFromInstancedMesh")(instancedMesh.asInstanceOf[js.Any]).asInstanceOf[Group]
  
  inline def createMeshesFromMultiMaterialMesh(mesh: Mesh[BufferGeometry, Material | js.Array[Material]]): Group = ^.asInstanceOf[js.Dynamic].applyDynamic("createMeshesFromMultiMaterialMesh")(mesh.asInstanceOf[js.Any]).asInstanceOf[Group]
  
  inline def createMultiMaterialObject(
    geometry: typingsJapgolly.three.srcThreeMod.BufferGeometry,
    materials: js.Array[typingsJapgolly.three.srcThreeMod.Material]
  ): Group = (^.asInstanceOf[js.Dynamic].applyDynamic("createMultiMaterialObject")(geometry.asInstanceOf[js.Any], materials.asInstanceOf[js.Any])).asInstanceOf[Group]
  
  inline def detach(child: Object3D[Event], parent: Object3D[Event], scene: Scene): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("detach")(child.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
