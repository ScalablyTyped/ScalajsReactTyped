package typingsJapgolly.forgeViewer.global.THREE

import typingsJapgolly.forgeViewer.anon.Offset
import typingsJapgolly.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.InstancedInterleavedBuffer")
@js.native
open class InstancedInterleavedBuffer protected ()
  extends StObject
     with typingsJapgolly.forgeViewer.THREE.InstancedInterleavedBuffer {
  def this(array: ArrayLike[Double], stride: Double) = this()
  def this(array: ArrayLike[Double], stride: Double, meshPerAttribute: Double) = this()
  
  /* CompleteClass */
  var array: ArrayLike[Double] = js.native
  
  /* CompleteClass */
  override def copy(source: typingsJapgolly.forgeViewer.THREE.InstancedInterleavedBuffer): typingsJapgolly.forgeViewer.THREE.InstancedInterleavedBuffer = js.native
  /* CompleteClass */
  override def copy(source: typingsJapgolly.forgeViewer.THREE.InterleavedBuffer): typingsJapgolly.forgeViewer.THREE.InterleavedBuffer = js.native
  
  /* CompleteClass */
  override def copyAt(
    index1: Double,
    attribute: typingsJapgolly.forgeViewer.THREE.InterleavedBufferAttribute,
    index2: Double
  ): typingsJapgolly.forgeViewer.THREE.InterleavedBuffer = js.native
  
  /* CompleteClass */
  var count: Double = js.native
  
  /* CompleteClass */
  var dynamic: Boolean = js.native
  
  /* CompleteClass */
  var length: Double = js.native
  
  /* CompleteClass */
  var meshPerAttribute: Double = js.native
  
  /* CompleteClass */
  var needsUpdate: Boolean = js.native
  
  /* CompleteClass */
  override def set(value: ArrayLike[Double], index: Double): typingsJapgolly.forgeViewer.THREE.InterleavedBuffer = js.native
  
  /* CompleteClass */
  override def setDynamic(dynamic: Boolean): typingsJapgolly.forgeViewer.THREE.InterleavedBuffer = js.native
  
  /* CompleteClass */
  var stride: Double = js.native
  
  /* CompleteClass */
  var updateRange: Offset = js.native
  
  /* CompleteClass */
  var version: Double = js.native
}
