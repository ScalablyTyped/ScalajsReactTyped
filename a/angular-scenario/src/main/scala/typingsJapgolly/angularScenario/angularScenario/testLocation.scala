package typingsJapgolly.angularScenario.angularScenario

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait testLocation extends js.Object {
  def hash(): Future
  def path(): Future
  def search(): Future
  def url(): Future
}

object testLocation {
  @scala.inline
  def apply(
    hash: CallbackTo[Future],
    path: CallbackTo[Future],
    search: CallbackTo[Future],
    url: CallbackTo[Future]
  ): testLocation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hash")(hash.toJsFn)
    __obj.updateDynamic("path")(path.toJsFn)
    __obj.updateDynamic("search")(search.toJsFn)
    __obj.updateDynamic("url")(url.toJsFn)
    __obj.asInstanceOf[testLocation]
  }
}

