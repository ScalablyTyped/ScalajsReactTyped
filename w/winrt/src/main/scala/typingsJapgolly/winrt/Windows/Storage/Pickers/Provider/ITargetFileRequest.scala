package typingsJapgolly.winrt.Windows.Storage.Pickers.Provider

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Storage.IStorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITargetFileRequest extends StObject {
  
  def getDeferral(): TargetFileRequestDeferral
  
  var targetFile: IStorageFile
}
object ITargetFileRequest {
  
  inline def apply(getDeferral: CallbackTo[TargetFileRequestDeferral], targetFile: IStorageFile): ITargetFileRequest = {
    val __obj = js.Dynamic.literal(getDeferral = getDeferral.toJsFn, targetFile = targetFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITargetFileRequest]
  }
  
  extension [Self <: ITargetFileRequest](x: Self) {
    
    inline def setGetDeferral(value: CallbackTo[TargetFileRequestDeferral]): Self = StObject.set(x, "getDeferral", value.toJsFn)
    
    inline def setTargetFile(value: IStorageFile): Self = StObject.set(x, "targetFile", value.asInstanceOf[js.Any])
  }
}
