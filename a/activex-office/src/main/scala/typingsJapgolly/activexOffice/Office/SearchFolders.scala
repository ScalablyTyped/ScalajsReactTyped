package typingsJapgolly.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchFolders extends js.Object {
  val Application: js.Any = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  def apply(Index: Double): ScopeFolder = js.native
  def Add(ScopeFolder: ScopeFolder): Unit = js.native
  def Item(Index: Double): ScopeFolder = js.native
  def Remove(Index: Double): Unit = js.native
}

