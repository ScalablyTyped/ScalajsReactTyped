package typingsJapgolly.dwt.anon

import typingsJapgolly.dwt.dynamsoftDotFileUploaderMod.FileUploader
import typingsJapgolly.dwt.dynamsoftMod.DynamsoftLib
import typingsJapgolly.dwt.dynamsoftMod.ManagerEnv
import typingsJapgolly.dwt.dynamsoftMod.Messages
import typingsJapgolly.dwt.dynamsoftMod.WebTwainEnv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofDynamsoftStatic extends StObject {
  
  var FileUploader: typingsJapgolly.dwt.dynamsoftDotFileUploaderMod.FileUploader
  
  var Lib: DynamsoftLib
  
  var MSG: Messages
  
  val WebTwain: TypeofWebTwain
  
  var WebTwainEnv: typingsJapgolly.dwt.dynamsoftMod.WebTwainEnv
  
  var managerEnv: ManagerEnv
}
object TypeofDynamsoftStatic {
  
  inline def apply(
    FileUploader: FileUploader,
    Lib: DynamsoftLib,
    MSG: Messages,
    WebTwain: TypeofWebTwain,
    WebTwainEnv: WebTwainEnv,
    managerEnv: ManagerEnv
  ): TypeofDynamsoftStatic = {
    val __obj = js.Dynamic.literal(FileUploader = FileUploader.asInstanceOf[js.Any], Lib = Lib.asInstanceOf[js.Any], MSG = MSG.asInstanceOf[js.Any], WebTwain = WebTwain.asInstanceOf[js.Any], WebTwainEnv = WebTwainEnv.asInstanceOf[js.Any], managerEnv = managerEnv.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDynamsoftStatic]
  }
  
  extension [Self <: TypeofDynamsoftStatic](x: Self) {
    
    inline def setFileUploader(value: FileUploader): Self = StObject.set(x, "FileUploader", value.asInstanceOf[js.Any])
    
    inline def setLib(value: DynamsoftLib): Self = StObject.set(x, "Lib", value.asInstanceOf[js.Any])
    
    inline def setMSG(value: Messages): Self = StObject.set(x, "MSG", value.asInstanceOf[js.Any])
    
    inline def setManagerEnv(value: ManagerEnv): Self = StObject.set(x, "managerEnv", value.asInstanceOf[js.Any])
    
    inline def setWebTwain(value: TypeofWebTwain): Self = StObject.set(x, "WebTwain", value.asInstanceOf[js.Any])
    
    inline def setWebTwainEnv(value: WebTwainEnv): Self = StObject.set(x, "WebTwainEnv", value.asInstanceOf[js.Any])
  }
}
