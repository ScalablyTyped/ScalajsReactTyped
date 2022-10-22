package typingsJapgolly.activexOffice.Office

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentLibraryVersion extends StObject {
  
  val Application: Any
  
  val Comments: String
  
  val Creator: Double
  
  def Delete(): Unit
  
  val Index: Double
  
  val Modified: VarDate
  
  val ModifiedBy: String
  
  /* private */ @JSName("Office.DocumentLibraryVersion_typekey")
  var OfficeDotDocumentLibraryVersion_typekey: DocumentLibraryVersion
  
  def Open(): Any
  
  val Parent: Any
  
  def Restore(): Any
}
object DocumentLibraryVersion {
  
  inline def apply(
    Application: Any,
    Comments: String,
    Creator: Double,
    Delete: Callback,
    Index: Double,
    Modified: VarDate,
    ModifiedBy: String,
    OfficeDotDocumentLibraryVersion_typekey: DocumentLibraryVersion,
    Open: CallbackTo[Any],
    Parent: Any,
    Restore: CallbackTo[Any]
  ): DocumentLibraryVersion = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Comments = Comments.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = Delete.toJsFn, Index = Index.asInstanceOf[js.Any], Modified = Modified.asInstanceOf[js.Any], ModifiedBy = ModifiedBy.asInstanceOf[js.Any], Open = Open.toJsFn, Parent = Parent.asInstanceOf[js.Any], Restore = Restore.toJsFn)
    __obj.updateDynamic("Office.DocumentLibraryVersion_typekey")(OfficeDotDocumentLibraryVersion_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentLibraryVersion]
  }
  
  extension [Self <: DocumentLibraryVersion](x: Self) {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setComments(value: String): Self = StObject.set(x, "Comments", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: Callback): Self = StObject.set(x, "Delete", value.toJsFn)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setModified(value: VarDate): Self = StObject.set(x, "Modified", value.asInstanceOf[js.Any])
    
    inline def setModifiedBy(value: String): Self = StObject.set(x, "ModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotDocumentLibraryVersion_typekey(value: DocumentLibraryVersion): Self = StObject.set(x, "Office.DocumentLibraryVersion_typekey", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: CallbackTo[Any]): Self = StObject.set(x, "Open", value.toJsFn)
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setRestore(value: CallbackTo[Any]): Self = StObject.set(x, "Restore", value.toJsFn)
  }
}
