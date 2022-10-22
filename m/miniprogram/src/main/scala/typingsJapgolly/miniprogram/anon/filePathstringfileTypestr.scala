package typingsJapgolly.miniprogram.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.miniprogram.AsyncCallbackFailObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  filePath :string,   fileType :string} & miniprogram.AsyncCallback<any> */
trait filePathstringfileTypestr extends StObject {
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var fail: js.UndefOr[js.Function1[/* err */ AsyncCallbackFailObject, Unit]] = js.undefined
  
  var filePath: String
  
  var fileType: String
  
  var success: js.UndefOr[js.Function1[/* res */ Any, Unit]] = js.undefined
}
object filePathstringfileTypestr {
  
  inline def apply(filePath: String, fileType: String): filePathstringfileTypestr = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], fileType = fileType.asInstanceOf[js.Any])
    __obj.asInstanceOf[filePathstringfileTypestr]
  }
  
  extension [Self <: filePathstringfileTypestr](x: Self) {
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: /* err */ AsyncCallbackFailObject => Callback): Self = StObject.set(x, "fail", js.Any.fromFunction1((t0: /* err */ AsyncCallbackFailObject) => value(t0).runNow()))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setFileType(value: String): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: /* res */ Any => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* res */ Any) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
