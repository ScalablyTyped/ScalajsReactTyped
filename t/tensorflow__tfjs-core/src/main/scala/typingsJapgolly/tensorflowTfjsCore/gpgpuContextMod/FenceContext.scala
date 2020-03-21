package typingsJapgolly.tensorflowTfjsCore.gpgpuContextMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.WebGLQuery
import typingsJapgolly.std.WebGLSync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FenceContext extends js.Object {
  var query: WebGLQuery | WebGLSync
  def isFencePassed(): Boolean
}

object FenceContext {
  @scala.inline
  def apply(isFencePassed: CallbackTo[Boolean], query: WebGLQuery | WebGLSync): FenceContext = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.updateDynamic("isFencePassed")(isFencePassed.toJsFn)
    __obj.asInstanceOf[FenceContext]
  }
}

