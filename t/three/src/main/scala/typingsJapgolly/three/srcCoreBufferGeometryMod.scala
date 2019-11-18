package typingsJapgolly.three

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.three.srcCoreBufferAttributeMod.BufferAttribute
import typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry
import typingsJapgolly.three.srcCoreDirectGeometryMod.DirectGeometry
import typingsJapgolly.three.srcCoreEventDispatcherMod.EventDispatcher
import typingsJapgolly.three.srcCoreGeometryMod.Geometry
import typingsJapgolly.three.srcCoreInterleavedBufferAttributeMod.InterleavedBufferAttribute
import typingsJapgolly.three.srcCoreObject3DMod.Object3D
import typingsJapgolly.three.srcMathBox3Mod.Box3
import typingsJapgolly.three.srcMathMatrix4Mod.Matrix4
import typingsJapgolly.three.srcMathSphereMod.Sphere
import typingsJapgolly.three.srcMathVector2Mod.Vector2
import typingsJapgolly.three.srcMathVector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/core/BufferGeometry", JSImport.Namespace)
@js.native
object srcCoreBufferGeometryMod extends js.Object {
  @js.native
  /**
  	 * This creates a new BufferGeometry. It also sets several properties to an default value.
  	 */
  class BufferGeometry () extends EventDispatcher {
    var attributes: StringDictionary[BufferAttribute | InterleavedBufferAttribute] = js.native
    var boundingBox: Box3 = js.native
    var boundingSphere: Sphere = js.native
    var drawRange: Anon_CountStart = js.native
    /**
    	 * @deprecated Use {@link BufferGeometry#groups .groups} instead.
    	 */
    var drawcalls: js.Any = js.native
    var groups: js.Array[Anon_CountMaterialIndex] = js.native
    /**
    	 * Unique number of this buffergeometry instance
    	 */
    var id: Double = js.native
    var index: BufferAttribute = js.native
    var isBufferGeometry: Boolean = js.native
    var morphAttributes: js.Any = js.native
    var name: String = js.native
    /**
    	 * @deprecated Use {@link BufferGeometry#groups .groups} instead.
    	 */
    var offsets: js.Any = js.native
    var `type`: String = js.native
    var userData: StringDictionary[js.Any] = js.native
    var uuid: String = js.native
    def addAttribute(name: String, attribute: BufferAttribute): BufferGeometry = js.native
    def addAttribute(name: String, attribute: InterleavedBufferAttribute): BufferGeometry = js.native
    def addAttribute(name: js.Any, array: js.Any, itemSize: js.Any): js.Any = js.native
    /**
    	 * @deprecated Use {@link BufferGeometry#addGroup .addGroup()} instead.
    	 */
    def addDrawCall(start: js.Any, count: js.Any): Unit = js.native
    def addDrawCall(start: js.Any, count: js.Any, indexOffset: js.Any): Unit = js.native
    def addGroup(start: Double, count: Double): Unit = js.native
    def addGroup(start: Double, count: Double, materialIndex: Double): Unit = js.native
    /**
    	 * @deprecated Use {@link BufferGeometry#setIndex .setIndex()} instead.
    	 */
    def addIndex(index: js.Any): Unit = js.native
    /**
    	 * Bakes matrix transform directly into vertex coordinates.
    	 */
    def applyMatrix(matrix: Matrix4): BufferGeometry = js.native
    def center(): BufferGeometry = js.native
    /**
    	 * @deprecated Use {@link BufferGeometry#clearGroups .clearGroups()} instead.
    	 */
    def clearDrawCalls(): Unit = js.native
    def clearGroups(): Unit = js.native
    /**
    	 * Computes bounding box of the geometry, updating Geometry.boundingBox attribute.
    	 * Bounding boxes aren't computed by default. They need to be explicitly computed, otherwise they are null.
    	 */
    def computeBoundingBox(): Unit = js.native
    /**
    	 * Computes bounding sphere of the geometry, updating Geometry.boundingSphere attribute.
    	 * Bounding spheres aren't' computed by default. They need to be explicitly computed, otherwise they are null.
    	 */
    def computeBoundingSphere(): Unit = js.native
    /**
    	 * Computes vertex normals by averaging face normals.
    	 */
    def computeVertexNormals(): Unit = js.native
    def copy(source: BufferGeometry): this.type = js.native
    /**
    	 * Disposes the object from memory.
    	 * You need to call this when you want the bufferGeometry removed while the application is running.
    	 */
    def dispose(): Unit = js.native
    def fromDirectGeometry(geometry: DirectGeometry): BufferGeometry = js.native
    def fromGeometry(geometry: Geometry): BufferGeometry = js.native
    def fromGeometry(geometry: Geometry, settings: js.Any): BufferGeometry = js.native
    def getAttribute(name: String): BufferAttribute | InterleavedBufferAttribute = js.native
    def getIndex(): BufferAttribute = js.native
    def lookAt(v: Vector3): Unit = js.native
    def merge(geometry: BufferGeometry, offset: Double): BufferGeometry = js.native
    def normalizeNormals(): Unit = js.native
    def removeAttribute(name: String): BufferGeometry = js.native
    def rotateX(angle: Double): BufferGeometry = js.native
    def rotateY(angle: Double): BufferGeometry = js.native
    def rotateZ(angle: Double): BufferGeometry = js.native
    def scale(x: Double, y: Double, z: Double): BufferGeometry = js.native
    def setDrawRange(start: Double, count: Double): Unit = js.native
    def setFromObject(`object`: Object3D): BufferGeometry = js.native
    def setFromPoints(points: js.Array[Vector2 | Vector3]): BufferGeometry = js.native
    def setIndex(index: js.Array[Double]): Unit = js.native
    def setIndex(index: BufferAttribute): Unit = js.native
    def toJSON(): js.Any = js.native
    def toNonIndexed(): BufferGeometry = js.native
    def translate(x: Double, y: Double, z: Double): BufferGeometry = js.native
    def updateFromObject(`object`: Object3D): Unit = js.native
  }
  
  /* static members */
  @js.native
  object BufferGeometry extends js.Object {
    var MaxIndex: Double = js.native
  }
  
}

