package typingsJapgolly.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Versions")
@js.native
class Versions protected () extends js.Object {
  val Application: typingsJapgolly.activexWord.Word.Application = js.native
  var AutoVersion: WdAutoVersions = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.Versions_typekey")
  var WordDotVersions_typekey: Versions = js.native
  def Item(Index: Double): Version = js.native
  def Save(): Unit = js.native
  def Save(Comment: js.Any): Unit = js.native
}

