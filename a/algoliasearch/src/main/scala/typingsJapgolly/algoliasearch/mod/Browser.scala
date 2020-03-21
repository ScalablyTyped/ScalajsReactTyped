package typingsJapgolly.algoliasearch.mod

import typingsJapgolly.algoliasearch.algoliasearchStrings.end
import typingsJapgolly.algoliasearch.algoliasearchStrings.error
import typingsJapgolly.algoliasearch.algoliasearchStrings.result
import typingsJapgolly.algoliasearch.algoliasearchStrings.stop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Browser extends js.Object {
  @JSName("on")
  def on_end(`type`: end, cb: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_error(`type`: error, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  @JSName("on")
  def on_result(`type`: result, cb: js.Function1[/* content */ BrowseResponse, Unit]): Unit = js.native
  @JSName("on")
  def on_stop(`type`: stop, cb: js.Function0[Unit]): Unit = js.native
  def stop(): Unit = js.native
}

