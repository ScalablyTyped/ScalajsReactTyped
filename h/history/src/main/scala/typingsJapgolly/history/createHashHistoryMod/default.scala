package typingsJapgolly.history.createHashHistoryMod

import typingsJapgolly.history.historyMod.History
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("history/createHashHistory", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[S](): History[S] = js.native
  def apply[S](options: HashHistoryBuildOptions): History[S] = js.native
}

