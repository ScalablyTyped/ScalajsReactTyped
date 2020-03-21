package typingsJapgolly.three

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.three.bufferGeometryMod.BufferGeometry
import typingsJapgolly.three.constantsMod.TrianglesDrawModes
import typingsJapgolly.three.geometryMod.Geometry
import typingsJapgolly.three.materialMod.Material
import typingsJapgolly.three.object3DMod.Object3D
import typingsJapgolly.three.threeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/objects/Mesh", JSImport.Namespace)
@js.native
object meshMod extends js.Object {
  @js.native
  class Mesh () extends Object3D {
    def this(geometry: BufferGeometry) = this()
    def this(geometry: Geometry) = this()
    def this(geometry: BufferGeometry, material: js.Array[Material]) = this()
    def this(geometry: BufferGeometry, material: Material) = this()
    def this(geometry: Geometry, material: js.Array[Material]) = this()
    def this(geometry: Geometry, material: Material) = this()
    var drawMode: TrianglesDrawModes = js.native
    var geometry: Geometry | BufferGeometry = js.native
    var isMesh: `true` = js.native
    var material: Material | js.Array[Material] = js.native
    var morphTargetDictionary: js.UndefOr[StringDictionary[Double]] = js.native
    var morphTargetInfluences: js.UndefOr[js.Array[Double]] = js.native
    def setDrawMode(drawMode: TrianglesDrawModes): Unit = js.native
    def updateMorphTargets(): Unit = js.native
  }
  
}

