package typingsJapgolly.reduxFirstRouting.mod

import typingsJapgolly.history.createBrowserHistoryMod.BrowserHistoryBuildOptions
import typingsJapgolly.history.mod.History
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-first-routing", "createBrowserHistory")
@js.native
object createBrowserHistory extends js.Object {
  def apply[S](): History[S] = js.native
  def apply[S](options: BrowserHistoryBuildOptions): History[S] = js.native
}

