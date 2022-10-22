package typingsJapgolly.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bookmarks extends StObject {
  
  def Add(Name: String): Bookmark = js.native
  def Add(Name: String, Range: Any): Bookmark = js.native
  
  val Application: typingsJapgolly.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  var DefaultSorting: WdBookmarkSortBy = js.native
  
  def Exists(Name: String): Boolean = js.native
  
  def Item(Index: String): Bookmark = js.native
  def Item(Index: Double): Bookmark = js.native
  
  val Parent: Any = js.native
  
  var ShowHidden: Boolean = js.native
  
  /* private */ @JSName("Word.Bookmarks_typekey")
  var WordDotBookmarks_typekey: Bookmarks = js.native
}
