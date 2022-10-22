package typingsJapgolly.activexWord.Word

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Comment extends StObject {
  
  val Application: typingsJapgolly.activexWord.Word.Application
  
  var Author: String
  
  val Creator: Double
  
  val Date: VarDate
  
  def Delete(): Unit
  
  def Edit(): Unit
  
  val Index: Double
  
  var Initial: String
  
  val IsInk: Boolean
  
  val Parent: Any
  
  val Range: typingsJapgolly.activexWord.Word.Range
  
  val Reference: typingsJapgolly.activexWord.Word.Range
  
  val Scope: typingsJapgolly.activexWord.Word.Range
  
  var ShowTip: Boolean
  
  /* private */ @JSName("Word.Comment_typekey")
  var WordDotComment_typekey: Comment
}
object Comment {
  
  inline def apply(
    Application: Application,
    Author: String,
    Creator: Double,
    Date: VarDate,
    Delete: Callback,
    Edit: Callback,
    Index: Double,
    Initial: String,
    IsInk: Boolean,
    Parent: Any,
    Range: Range,
    Reference: Range,
    Scope: Range,
    ShowTip: Boolean,
    WordDotComment_typekey: Comment
  ): Comment = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Author = Author.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Date = Date.asInstanceOf[js.Any], Delete = Delete.toJsFn, Edit = Edit.toJsFn, Index = Index.asInstanceOf[js.Any], Initial = Initial.asInstanceOf[js.Any], IsInk = IsInk.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Reference = Reference.asInstanceOf[js.Any], Scope = Scope.asInstanceOf[js.Any], ShowTip = ShowTip.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Comment_typekey")(WordDotComment_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
  
  extension [Self <: Comment](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setAuthor(value: String): Self = StObject.set(x, "Author", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDate(value: VarDate): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: Callback): Self = StObject.set(x, "Delete", value.toJsFn)
    
    inline def setEdit(value: Callback): Self = StObject.set(x, "Edit", value.toJsFn)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setInitial(value: String): Self = StObject.set(x, "Initial", value.asInstanceOf[js.Any])
    
    inline def setIsInk(value: Boolean): Self = StObject.set(x, "IsInk", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Range): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
    
    inline def setReference(value: Range): Self = StObject.set(x, "Reference", value.asInstanceOf[js.Any])
    
    inline def setScope(value: Range): Self = StObject.set(x, "Scope", value.asInstanceOf[js.Any])
    
    inline def setShowTip(value: Boolean): Self = StObject.set(x, "ShowTip", value.asInstanceOf[js.Any])
    
    inline def setWordDotComment_typekey(value: Comment): Self = StObject.set(x, "Word.Comment_typekey", value.asInstanceOf[js.Any])
  }
}
