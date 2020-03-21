package typingsJapgolly.unsplashJs.mod.UnsplashApi

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.experimental.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stats extends js.Object {
  def total(): js.Promise[Response]
}

object Stats {
  @scala.inline
  def apply(total: CallbackTo[js.Promise[Response]]): Stats = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("total")(total.toJsFn)
    __obj.asInstanceOf[Stats]
  }
}

