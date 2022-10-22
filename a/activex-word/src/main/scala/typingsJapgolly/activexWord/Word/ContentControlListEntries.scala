package typingsJapgolly.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentControlListEntries extends StObject {
  
  /**
    * @param string [Value='']
    * @param number [Index=0]
    */
  def Add(Text: String): ContentControlListEntry = js.native
  def Add(Text: String, Value: String): ContentControlListEntry = js.native
  def Add(Text: String, Value: String, Index: Double): ContentControlListEntry = js.native
  def Add(Text: String, Value: Unit, Index: Double): ContentControlListEntry = js.native
  
  val Application: typingsJapgolly.activexWord.Word.Application = js.native
  
  def Clear(): Unit = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: Double): ContentControlListEntry = js.native
  
  val Parent: Any = js.native
  
  /* private */ @JSName("Word.ContentControlListEntries_typekey")
  var WordDotContentControlListEntries_typekey: ContentControlListEntries = js.native
}
