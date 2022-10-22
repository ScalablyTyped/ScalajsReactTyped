package typingsJapgolly.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListEntries extends StObject {
  
  def Add(Name: String): ListEntry = js.native
  def Add(Name: String, Index: Any): ListEntry = js.native
  
  val Application: typingsJapgolly.activexWord.Word.Application = js.native
  
  def Clear(): Unit = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: Any): ListEntry = js.native
  
  val Parent: Any = js.native
  
  /* private */ @JSName("Word.ListEntries_typekey")
  var WordDotListEntries_typekey: ListEntries = js.native
}
