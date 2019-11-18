package typingsJapgolly.three

import typingsJapgolly.three.srcCoreObject3DMod.Object3D
import typingsJapgolly.three.srcMathMatrix4Mod.Matrix4
import typingsJapgolly.three.threeNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/cameras/Camera", JSImport.Namespace)
@js.native
object srcCamerasCameraMod extends js.Object {
  @js.native
  /**
  	 * This constructor sets following properties to the correct type: matrixWorldInverse, projectionMatrix and projectionMatrixInverse.
  	 */
  class Camera () extends Object3D {
    var isCamera: `true` = js.native
    /**
    	 * This is the inverse of matrixWorld. MatrixWorld contains the Matrix which has the world transform of the Camera.
    	 */
    var matrixWorldInverse: Matrix4 = js.native
    /**
    	 * This is the matrix which contains the projection.
    	 */
    var projectionMatrix: Matrix4 = js.native
    /**
    	 * This is the inverse of projectionMatrix.
    	 */
    var projectionMatrixInverse: Matrix4 = js.native
  }
  
}

