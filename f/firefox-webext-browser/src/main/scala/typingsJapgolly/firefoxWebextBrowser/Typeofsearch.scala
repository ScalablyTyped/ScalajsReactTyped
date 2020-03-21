package typingsJapgolly.firefoxWebextBrowser

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.firefoxWebextBrowser.browser.search.SearchEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofsearch extends js.Object {
  /* search functions */
  /** Gets a list of search engines. */
  def get(): js.Promise[js.Array[SearchEngine]]
  /** Perform a search. */
  def search(searchProperties: AnonEngine): js.Promise[_]
}

object Typeofsearch {
  @scala.inline
  def apply(
    get: CallbackTo[js.Promise[js.Array[SearchEngine]]],
    search: AnonEngine => CallbackTo[js.Promise[js.Any]]
  ): Typeofsearch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get.toJsFn)
    __obj.updateDynamic("search")(js.Any.fromFunction1((t0: typingsJapgolly.firefoxWebextBrowser.AnonEngine) => search(t0).runNow()))
    __obj.asInstanceOf[Typeofsearch]
  }
}

