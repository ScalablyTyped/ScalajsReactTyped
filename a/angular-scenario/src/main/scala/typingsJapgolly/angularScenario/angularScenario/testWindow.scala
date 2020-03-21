package typingsJapgolly.angularScenario.angularScenario

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait testWindow extends js.Object {
  def hash(): Future
  def href(): Future
  def path(): Future
  def search(): Future
}

object testWindow {
  @scala.inline
  def apply(
    hash: CallbackTo[Future],
    href: CallbackTo[Future],
    path: CallbackTo[Future],
    search: CallbackTo[Future]
  ): testWindow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hash")(hash.toJsFn)
    __obj.updateDynamic("href")(href.toJsFn)
    __obj.updateDynamic("path")(path.toJsFn)
    __obj.updateDynamic("search")(search.toJsFn)
    __obj.asInstanceOf[testWindow]
  }
}

