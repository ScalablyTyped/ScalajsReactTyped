package typingsJapgolly.three

import typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry
import typingsJapgolly.three.srcMaterialsMaterialMod.Material
import typingsJapgolly.three.srcMathMatrix4Mod.Matrix4
import typingsJapgolly.three.srcMathVector3Mod.Vector3
import typingsJapgolly.three.srcObjectsMeshMod.Mesh
import typingsJapgolly.three.srcObjectsSkeletonMod.Skeleton
import typingsJapgolly.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsSkinnedMeshMod {
  
  @JSImport("three/src/objects/SkinnedMesh", "SkinnedMesh")
  @js.native
  open class SkinnedMesh[TGeometry /* <: BufferGeometry */, TMaterial /* <: Material | js.Array[Material] */] () extends Mesh[TGeometry, TMaterial] {
    def this(geometry: TGeometry) = this()
    def this(geometry: TGeometry, material: TMaterial) = this()
    def this(geometry: Unit, material: TMaterial) = this()
    def this(geometry: TGeometry, material: TMaterial, useVertexTexture: Boolean) = this()
    def this(geometry: TGeometry, material: Unit, useVertexTexture: Boolean) = this()
    def this(geometry: Unit, material: TMaterial, useVertexTexture: Boolean) = this()
    def this(geometry: Unit, material: Unit, useVertexTexture: Boolean) = this()
    
    def bind(skeleton: Skeleton): Unit = js.native
    def bind(skeleton: Skeleton, bindMatrix: Matrix4): Unit = js.native
    
    var bindMatrix: Matrix4 = js.native
    
    var bindMatrixInverse: Matrix4 = js.native
    
    var bindMode: String = js.native
    
    def boneTransform(index: Double, target: Vector3): Vector3 = js.native
    
    val isSkinnedMesh: `true` = js.native
    
    def normalizeSkinWeights(): Unit = js.native
    
    def pose(): Unit = js.native
    
    var skeleton: Skeleton = js.native
  }
}
