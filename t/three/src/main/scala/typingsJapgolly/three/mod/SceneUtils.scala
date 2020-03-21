package typingsJapgolly.three.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "SceneUtils")
@js.native
object SceneUtils extends js.Object {
  def attach(
    child: typingsJapgolly.three.object3DMod.Object3D,
    scene: typingsJapgolly.three.sceneMod.Scene,
    parent: typingsJapgolly.three.object3DMod.Object3D
  ): Unit = js.native
  def createMultiMaterialObject(
    geometry: typingsJapgolly.three.geometryMod.Geometry,
    materials: js.Array[typingsJapgolly.three.materialMod.Material]
  ): typingsJapgolly.three.object3DMod.Object3D = js.native
  def detach(
    child: typingsJapgolly.three.object3DMod.Object3D,
    parent: typingsJapgolly.three.object3DMod.Object3D,
    scene: typingsJapgolly.three.sceneMod.Scene
  ): Unit = js.native
}

