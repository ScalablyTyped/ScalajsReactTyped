package typingsJapgolly.forgeViewer.global.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.Skeleton")
@js.native
open class Skeleton protected ()
  extends StObject
     with typingsJapgolly.forgeViewer.THREE.Skeleton {
  def this(bones: js.Array[typingsJapgolly.forgeViewer.THREE.Bone]) = this()
  def this(
    bones: js.Array[typingsJapgolly.forgeViewer.THREE.Bone],
    boneInverses: js.Array[typingsJapgolly.forgeViewer.THREE.Matrix4]
  ) = this()
  def this(
    bones: js.Array[typingsJapgolly.forgeViewer.THREE.Bone],
    boneInverses: js.Array[typingsJapgolly.forgeViewer.THREE.Matrix4],
    useVertexTexture: Boolean
  ) = this()
  def this(
    bones: js.Array[typingsJapgolly.forgeViewer.THREE.Bone],
    boneInverses: Unit,
    useVertexTexture: Boolean
  ) = this()
  
  /* CompleteClass */
  var boneInverses: js.Array[typingsJapgolly.forgeViewer.THREE.Matrix4] = js.native
  
  /* CompleteClass */
  var boneMatrices: js.typedarray.Float32Array = js.native
  
  /* CompleteClass */
  var boneTexture: typingsJapgolly.forgeViewer.THREE.DataTexture = js.native
  
  /* CompleteClass */
  var boneTextureHeight: Double = js.native
  
  /* CompleteClass */
  var boneTextureWidth: Double = js.native
  
  /* CompleteClass */
  var bones: js.Array[typingsJapgolly.forgeViewer.THREE.Bone] = js.native
  
  /* CompleteClass */
  override def calculateInverses(bone: typingsJapgolly.forgeViewer.THREE.Bone): Unit = js.native
  
  /* CompleteClass */
  var identityMatrix: typingsJapgolly.forgeViewer.THREE.Matrix4 = js.native
  
  /* CompleteClass */
  override def pose(): Unit = js.native
  
  /* CompleteClass */
  override def update(): Unit = js.native
  
  /* CompleteClass */
  var useVertexTexture: Boolean = js.native
}
