package typingsJapgolly.three

import typingsJapgolly.three.bufferGeometryMod.BufferGeometry
import typingsJapgolly.three.geometryMod.Geometry
import typingsJapgolly.three.materialMod.Material
import typingsJapgolly.three.matrix4Mod.Matrix4
import typingsJapgolly.three.meshMod.Mesh
import typingsJapgolly.three.skeletonMod.Skeleton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/objects/SkinnedMesh", JSImport.Namespace)
@js.native
object skinnedMeshMod extends js.Object {
  @js.native
  class SkinnedMesh () extends Mesh {
    def this(geometry: BufferGeometry) = this()
    def this(geometry: Geometry) = this()
    def this(geometry: BufferGeometry, material: js.Array[Material]) = this()
    def this(geometry: BufferGeometry, material: Material) = this()
    def this(geometry: Geometry, material: js.Array[Material]) = this()
    def this(geometry: Geometry, material: Material) = this()
    def this(geometry: BufferGeometry, material: js.Array[Material], useVertexTexture: Boolean) = this()
    def this(geometry: BufferGeometry, material: Material, useVertexTexture: Boolean) = this()
    def this(geometry: Geometry, material: js.Array[Material], useVertexTexture: Boolean) = this()
    def this(geometry: Geometry, material: Material, useVertexTexture: Boolean) = this()
    var bindMatrix: Matrix4 = js.native
    var bindMatrixInverse: Matrix4 = js.native
    var bindMode: String = js.native
    var skeleton: Skeleton = js.native
    def bind(skeleton: Skeleton): Unit = js.native
    def bind(skeleton: Skeleton, bindMatrix: Matrix4): Unit = js.native
    def normalizeSkinWeights(): Unit = js.native
    def pose(): Unit = js.native
  }
  
}

