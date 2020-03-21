package typingsJapgolly.winrtUwp

import typingsJapgolly.winrtUwp.Windows.Foundation.Numerics.Matrix4x4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonResult extends js.Object {
  /** If a correlation exists, this will be set to a 4x4 transform matrix that changes basis from the infrared frame source coordinate system to the target entity coordinate system. */ var result: Matrix4x4
  /** True if a correlation exists, otherwise false. */ var returnValue: Boolean
}

object AnonResult {
  @scala.inline
  def apply(result: Matrix4x4, returnValue: Boolean): AnonResult = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonResult]
  }
}

