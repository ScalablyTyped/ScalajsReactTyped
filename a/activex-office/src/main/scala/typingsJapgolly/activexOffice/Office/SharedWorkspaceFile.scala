package typingsJapgolly.activexOffice.Office

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedWorkspaceFile extends StObject {
  
  val Application: Any
  
  val CreatedBy: String
  
  val CreatedDate: VarDate
  
  val Creator: Double
  
  def Delete(): Unit
  
  val ModifiedBy: String
  
  val ModifiedDate: VarDate
  
  /* private */ @JSName("Office.SharedWorkspaceFile_typekey")
  var OfficeDotSharedWorkspaceFile_typekey: SharedWorkspaceFile
  
  val Parent: Any
  
  val URL: String
}
object SharedWorkspaceFile {
  
  inline def apply(
    Application: Any,
    CreatedBy: String,
    CreatedDate: VarDate,
    Creator: Double,
    Delete: Callback,
    ModifiedBy: String,
    ModifiedDate: VarDate,
    OfficeDotSharedWorkspaceFile_typekey: SharedWorkspaceFile,
    Parent: Any,
    URL: String
  ): SharedWorkspaceFile = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], CreatedBy = CreatedBy.asInstanceOf[js.Any], CreatedDate = CreatedDate.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = Delete.toJsFn, ModifiedBy = ModifiedBy.asInstanceOf[js.Any], ModifiedDate = ModifiedDate.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.SharedWorkspaceFile_typekey")(OfficeDotSharedWorkspaceFile_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedWorkspaceFile]
  }
  
  extension [Self <: SharedWorkspaceFile](x: Self) {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreatedBy(value: String): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedDate(value: VarDate): Self = StObject.set(x, "CreatedDate", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: Callback): Self = StObject.set(x, "Delete", value.toJsFn)
    
    inline def setModifiedBy(value: String): Self = StObject.set(x, "ModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setModifiedDate(value: VarDate): Self = StObject.set(x, "ModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotSharedWorkspaceFile_typekey(value: SharedWorkspaceFile): Self = StObject.set(x, "Office.SharedWorkspaceFile_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
  }
}
