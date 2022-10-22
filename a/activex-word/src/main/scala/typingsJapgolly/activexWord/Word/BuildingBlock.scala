package typingsJapgolly.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildingBlock extends StObject {
  
  val Application: typingsJapgolly.activexWord.Word.Application = js.native
  
  val Category: typingsJapgolly.activexWord.Word.Category = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Unit = js.native
  
  var Description: String = js.native
  
  val ID: String = js.native
  
  val Index: Double = js.native
  
  def Insert(Where: Range): Range = js.native
  def Insert(Where: Range, RichText: Any): Range = js.native
  
  var InsertOptions: Double = js.native
  
  var Name: String = js.native
  
  val Parent: Any = js.native
  
  val Type: BuildingBlockType = js.native
  
  var Value: String = js.native
  
  /* private */ @JSName("Word.BuildingBlock_typekey")
  var WordDotBuildingBlock_typekey: BuildingBlock = js.native
}
