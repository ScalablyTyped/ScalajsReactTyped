package typingsJapgolly.jqueryLazyload

import typingsJapgolly.jqueryLazyload.JQueryLazyLoad.Options
import typingsJapgolly.jqueryLazyload.jqueryLazyloadStrings.load
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def lazyload(): JQuery = js.native
  def lazyload(options: Options): JQuery = js.native
  @JSName("on")
  def on_load(event: load, callback: js.Function1[/* options */ js.UndefOr[Options], Unit]): JQuery = js.native
}

