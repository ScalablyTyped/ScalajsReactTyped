package typingsJapgolly.history

import typingsJapgolly.history.createMemoryHistoryMod.MemoryHistory
import typingsJapgolly.history.createMemoryHistoryMod.MemoryHistoryBuildOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_OptionsLocationState extends js.Object {
  def apply[S](): MemoryHistory[S] = js.native
  def apply[S](options: MemoryHistoryBuildOptions): MemoryHistory[S] = js.native
}

