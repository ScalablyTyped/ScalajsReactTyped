package typingsJapgolly.onsenui.mod

import typingsJapgolly.onsenui.AnonPage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @description PageLoader class constructor
  */
@JSImport("onsenui", "PageLoader")
@js.native
class PageLoader protected () extends js.Object {
  def this(args: js.Any*) = this()
  var internalLoader: js.Function = js.native
  def load(options: AnonPage, done: js.Function): Unit = js.native
}

