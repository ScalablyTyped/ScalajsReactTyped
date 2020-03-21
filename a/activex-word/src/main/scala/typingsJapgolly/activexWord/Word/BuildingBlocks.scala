package typingsJapgolly.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.BuildingBlocks")
@js.native
class BuildingBlocks protected () extends js.Object {
  val Application: typingsJapgolly.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.BuildingBlocks_typekey")
  var WordDotBuildingBlocks_typekey: BuildingBlocks = js.native
  /** @param Word.WdDocPartInsertOptions [InsertOptions=0] */
  def Add(Name: String, Range: Range, Description: js.Any): BuildingBlock = js.native
  def Add(Name: String, Range: Range, Description: js.Any, InsertOptions: WdDocPartInsertOptions): BuildingBlock = js.native
  def Item(Index: js.Any): BuildingBlock = js.native
}

