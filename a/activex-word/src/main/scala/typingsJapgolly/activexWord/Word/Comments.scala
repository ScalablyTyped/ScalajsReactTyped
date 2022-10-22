package typingsJapgolly.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Comments extends StObject {
  
  def Add(Range: Range): Comment = js.native
  def Add(Range: Range, Text: Any): Comment = js.native
  
  val Application: typingsJapgolly.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: Double): Comment = js.native
  
  val Parent: Any = js.native
  
  var ShowBy: String = js.native
  
  /* private */ @JSName("Word.Comments_typekey")
  var WordDotComments_typekey: Comments = js.native
}
