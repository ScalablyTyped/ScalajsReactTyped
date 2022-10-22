package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import typingsJapgolly.mfiles.MFiles.MFFileInformationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFileInformation extends StObject {
  
  def Clear(): Unit
  
  var EmailMessage: IEmailMessageInformation
  
  def ExtractFromFile(PathToFile: String): Unit
  
  var FileType: MFFileInformationType
}
object IFileInformation {
  
  inline def apply(
    Clear: Callback,
    EmailMessage: IEmailMessageInformation,
    ExtractFromFile: String => Callback,
    FileType: MFFileInformationType
  ): IFileInformation = {
    val __obj = js.Dynamic.literal(Clear = Clear.toJsFn, EmailMessage = EmailMessage.asInstanceOf[js.Any], ExtractFromFile = js.Any.fromFunction1((t0: String) => ExtractFromFile(t0).runNow()), FileType = FileType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileInformation]
  }
  
  extension [Self <: IFileInformation](x: Self) {
    
    inline def setClear(value: Callback): Self = StObject.set(x, "Clear", value.toJsFn)
    
    inline def setEmailMessage(value: IEmailMessageInformation): Self = StObject.set(x, "EmailMessage", value.asInstanceOf[js.Any])
    
    inline def setExtractFromFile(value: String => Callback): Self = StObject.set(x, "ExtractFromFile", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setFileType(value: MFFileInformationType): Self = StObject.set(x, "FileType", value.asInstanceOf[js.Any])
  }
}
