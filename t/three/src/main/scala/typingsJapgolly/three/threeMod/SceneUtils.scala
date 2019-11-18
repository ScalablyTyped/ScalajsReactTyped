package typingsJapgolly.three.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "SceneUtils")
@js.native
object SceneUtils extends js.Object {
  def attach(
    child: typingsJapgolly.three.srcCoreObject3DMod.Object3D,
    scene: typingsJapgolly.three.srcScenesSceneMod.Scene,
    parent: typingsJapgolly.three.srcCoreObject3DMod.Object3D
  ): Unit = js.native
  def createMultiMaterialObject(
    geometry: typingsJapgolly.three.srcCoreGeometryMod.Geometry,
    materials: js.Array[typingsJapgolly.three.srcMaterialsMaterialMod.Material]
  ): typingsJapgolly.three.srcCoreObject3DMod.Object3D = js.native
  def detach(
    child: typingsJapgolly.three.srcCoreObject3DMod.Object3D,
    parent: typingsJapgolly.three.srcCoreObject3DMod.Object3D,
    scene: typingsJapgolly.three.srcScenesSceneMod.Scene
  ): Unit = js.native
}

