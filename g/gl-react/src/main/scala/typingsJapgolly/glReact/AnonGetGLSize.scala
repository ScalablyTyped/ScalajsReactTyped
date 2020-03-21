package typingsJapgolly.glReact

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGetGLSize extends js.Object {
  def getGLSize(): js.Tuple2[Double, Double]
}

object AnonGetGLSize {
  @scala.inline
  def apply(getGLSize: CallbackTo[js.Tuple2[Double, Double]]): AnonGetGLSize = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getGLSize")(getGLSize.toJsFn)
    __obj.asInstanceOf[AnonGetGLSize]
  }
}

