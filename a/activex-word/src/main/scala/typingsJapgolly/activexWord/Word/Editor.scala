package typingsJapgolly.activexWord.Word

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Editor extends StObject {
  
  val Application: typingsJapgolly.activexWord.Word.Application
  
  val Creator: Double
  
  def Delete(): Unit
  
  def DeleteAll(): Unit
  
  val ID: String
  
  val Name: String
  
  val NextRange: typingsJapgolly.activexWord.Word.Range
  
  val Parent: Any
  
  val Range: typingsJapgolly.activexWord.Word.Range
  
  def SelectAll(): Unit
  
  /* private */ @JSName("Word.Editor_typekey")
  var WordDotEditor_typekey: Editor
}
object Editor {
  
  inline def apply(
    Application: Application,
    Creator: Double,
    Delete: Callback,
    DeleteAll: Callback,
    ID: String,
    Name: String,
    NextRange: Range,
    Parent: Any,
    Range: Range,
    SelectAll: Callback,
    WordDotEditor_typekey: Editor
  ): Editor = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = Delete.toJsFn, DeleteAll = DeleteAll.toJsFn, ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NextRange = NextRange.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], SelectAll = SelectAll.toJsFn)
    __obj.updateDynamic("Word.Editor_typekey")(WordDotEditor_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Editor]
  }
  
  extension [Self <: Editor](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: Callback): Self = StObject.set(x, "Delete", value.toJsFn)
    
    inline def setDeleteAll(value: Callback): Self = StObject.set(x, "DeleteAll", value.toJsFn)
    
    inline def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNextRange(value: Range): Self = StObject.set(x, "NextRange", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Range): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
    
    inline def setSelectAll(value: Callback): Self = StObject.set(x, "SelectAll", value.toJsFn)
    
    inline def setWordDotEditor_typekey(value: Editor): Self = StObject.set(x, "Word.Editor_typekey", value.asInstanceOf[js.Any])
  }
}
