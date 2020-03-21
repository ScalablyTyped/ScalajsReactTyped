package typingsJapgolly.geometryDom

import org.scalablytyped.runtime.Instantiable4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DOMPointReadOnly")
@js.native
class DOMPointReadOnly protected ()
  extends typingsJapgolly.geometryDom.GeometryDom.DOMPointReadOnly {
  def this(x: Double, y: Double, z: Double, w: Double) = this()
  /**
    * w coordinate / readonly
    */
  /* CompleteClass */
  override var w: Double = js.native
  /**
    * x coordinate / readonly
    */
  /* CompleteClass */
  override var x: Double = js.native
  /**
    * y coordinate / readonly
    */
  /* CompleteClass */
  override var y: Double = js.native
  /**
    * z coordinate / readonly
    */
  /* CompleteClass */
  override var z: Double = js.native
  /**
    * Post-multiply point with matrix.
    * @param matrix
    */
  /* CompleteClass */
  override def matrixTransform(matrix: typingsJapgolly.geometryDom.GeometryDom.DOMMatrixReadOnly): typingsJapgolly.geometryDom.GeometryDom.DOMPoint = js.native
}

@JSGlobal("DOMPointReadOnly")
@js.native
object DOMPointReadOnly
  extends Instantiable4[
      /* x */ Double, 
      /* y */ Double, 
      /* z */ Double, 
      /* w */ Double, 
      typingsJapgolly.geometryDom.GeometryDom.DOMPointReadOnly
    ]

