package typingsJapgolly.three

import typingsJapgolly.three.srcMathMatrix4Mod.Matrix4
import typingsJapgolly.three.srcObjectsBoneMod.Bone
import typingsJapgolly.three.srcTexturesDataTextureMod.DataTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/objects/Skeleton", JSImport.Namespace)
@js.native
object srcObjectsSkeletonMod extends js.Object {
  @js.native
  class Skeleton protected () extends js.Object {
    def this(bones: js.Array[Bone]) = this()
    def this(bones: js.Array[Bone], boneInverses: js.Array[Matrix4]) = this()
    var boneInverses: js.Array[Matrix4] = js.native
    var boneMatrices: scala.scalajs.js.typedarray.Float32Array = js.native
    var boneTexture: DataTexture = js.native
    var boneTextureHeight: Double = js.native
    var boneTextureWidth: Double = js.native
    var bones: js.Array[Bone] = js.native
    var identityMatrix: Matrix4 = js.native
    /**
    	 * @deprecated This property has been removed completely.
    	 */
    var useVertexTexture: Boolean = js.native
    def calculateInverses(bone: Bone): Unit = js.native
    def pose(): Unit = js.native
    def update(): Unit = js.native
  }
  
}

