package typingsJapgolly.jqueryAjaxfile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOption extends StObject {
  
  var data: js.UndefOr[Any] = js.undefined
  
  var desiredResponseDataType: js.UndefOr[DataType] = js.undefined
  
  var files: js.UndefOr[js.Array[IFileData]] = js.undefined
  
  var method: js.UndefOr[String] = js.undefined
  
  var timeoutInSeconds: js.UndefOr[Double] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object IOption {
  
  inline def apply(): IOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOption]
  }
  
  extension [Self <: IOption](x: Self) {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDesiredResponseDataType(value: DataType): Self = StObject.set(x, "desiredResponseDataType", value.asInstanceOf[js.Any])
    
    inline def setDesiredResponseDataTypeUndefined: Self = StObject.set(x, "desiredResponseDataType", js.undefined)
    
    inline def setFiles(value: js.Array[IFileData]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setFilesVarargs(value: IFileData*): Self = StObject.set(x, "files", js.Array(value*))
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setTimeoutInSeconds(value: Double): Self = StObject.set(x, "timeoutInSeconds", value.asInstanceOf[js.Any])
    
    inline def setTimeoutInSecondsUndefined: Self = StObject.set(x, "timeoutInSeconds", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
