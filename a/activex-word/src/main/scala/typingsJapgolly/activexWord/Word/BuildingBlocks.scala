package typingsJapgolly.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildingBlocks extends StObject {
  
  /** @param Word.WdDocPartInsertOptions [InsertOptions=0] */
  def Add(Name: String, Range: Range, Description: Any): BuildingBlock = js.native
  def Add(Name: String, Range: Range, Description: Any, InsertOptions: WdDocPartInsertOptions): BuildingBlock = js.native
  
  val Application: typingsJapgolly.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: Any): BuildingBlock = js.native
  
  val Parent: Any = js.native
  
  /* private */ @JSName("Word.BuildingBlocks_typekey")
  var WordDotBuildingBlocks_typekey: BuildingBlocks = js.native
}
