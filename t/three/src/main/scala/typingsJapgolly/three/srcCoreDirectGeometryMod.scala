package typingsJapgolly.three

import typingsJapgolly.three.srcCoreDirectGeometryMod.DirectGeometry
import typingsJapgolly.three.srcCoreGeometryMod.Geometry
import typingsJapgolly.three.srcCoreGeometryMod.MorphTarget
import typingsJapgolly.three.srcMathBox3Mod.Box3
import typingsJapgolly.three.srcMathColorMod.Color
import typingsJapgolly.three.srcMathSphereMod.Sphere
import typingsJapgolly.three.srcMathVector2Mod.Vector2
import typingsJapgolly.three.srcMathVector3Mod.Vector3
import typingsJapgolly.three.srcMathVector4Mod.Vector4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/core/DirectGeometry", JSImport.Namespace)
@js.native
object srcCoreDirectGeometryMod extends js.Object {
  @js.native
  class DirectGeometry () extends js.Object {
    var boundingBox: Box3 = js.native
    var boundingSphere: Sphere = js.native
    var colors: js.Array[Color] = js.native
    var colorsNeedUpdate: Boolean = js.native
    var groups: js.Array[Anon_MaterialIndex] = js.native
    var groupsNeedUpdate: Boolean = js.native
    var id: Double = js.native
    var indices: js.Array[Double] = js.native
    var morphTargets: js.Array[MorphTarget] = js.native
    var name: String = js.native
    var normals: js.Array[Vector3] = js.native
    var normalsNeedUpdate: Boolean = js.native
    var skinIndices: js.Array[Vector4] = js.native
    var skinWeights: js.Array[Vector4] = js.native
    var `type`: String = js.native
    var uuid: String = js.native
    var uvs: js.Array[Vector2] = js.native
    var uvs2: js.Array[Vector2] = js.native
    var uvsNeedUpdate: Boolean = js.native
    var vertices: js.Array[Vector3] = js.native
    var verticesNeedUpdate: Boolean = js.native
    def computeBoundingBox(): Unit = js.native
    def computeBoundingSphere(): Unit = js.native
    def computeGroups(geometry: Geometry): Unit = js.native
    def dispose(): Unit = js.native
    def fromGeometry(geometry: Geometry): DirectGeometry = js.native
  }
  
}

