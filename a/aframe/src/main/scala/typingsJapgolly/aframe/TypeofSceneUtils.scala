package typingsJapgolly.aframe

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.three.geometryMod.Geometry
import typingsJapgolly.three.materialMod.Material
import typingsJapgolly.three.object3DMod.Object3D
import typingsJapgolly.three.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofSceneUtils extends js.Object {
  def attach(child: Object3D, scene: Scene, parent: Object3D): Unit
  def createMultiMaterialObject(geometry: Geometry, materials: js.Array[Material]): Object3D
  def detach(child: Object3D, parent: Object3D, scene: Scene): Unit
}

object TypeofSceneUtils {
  @scala.inline
  def apply(
    attach: (Object3D, Scene, Object3D) => Callback,
    createMultiMaterialObject: (Geometry, js.Array[Material]) => CallbackTo[Object3D],
    detach: (Object3D, Object3D, Scene) => Callback
  ): TypeofSceneUtils = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attach")(js.Any.fromFunction3((t0: typingsJapgolly.three.object3DMod.Object3D, t1: typingsJapgolly.three.sceneMod.Scene, t2: typingsJapgolly.three.object3DMod.Object3D) => attach(t0, t1, t2).runNow()))
    __obj.updateDynamic("createMultiMaterialObject")(js.Any.fromFunction2((t0: typingsJapgolly.three.geometryMod.Geometry, t1: js.Array[typingsJapgolly.three.materialMod.Material]) => createMultiMaterialObject(t0, t1).runNow()))
    __obj.updateDynamic("detach")(js.Any.fromFunction3((t0: typingsJapgolly.three.object3DMod.Object3D, t1: typingsJapgolly.three.object3DMod.Object3D, t2: typingsJapgolly.three.sceneMod.Scene) => detach(t0, t1, t2).runNow()))
    __obj.asInstanceOf[TypeofSceneUtils]
  }
}

