package typingsJapgolly.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChooseImageSuccessCallbackResult extends StObject {
  
  /**
    * 图片的本地文件路径列表
    */
  var tempFilePaths: js.UndefOr[String | js.Array[Any]] = js.undefined
  
  /**
    * 图片的本地文件列表，每一项是一个 File 对象
    */
  var tempFiles: js.UndefOr[
    ChooseImageSuccessCallbackResultFile | js.Array[ChooseImageSuccessCallbackResultFile]
  ] = js.undefined
}
object ChooseImageSuccessCallbackResult {
  
  inline def apply(): ChooseImageSuccessCallbackResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChooseImageSuccessCallbackResult]
  }
  
  extension [Self <: ChooseImageSuccessCallbackResult](x: Self) {
    
    inline def setTempFilePaths(value: String | js.Array[Any]): Self = StObject.set(x, "tempFilePaths", value.asInstanceOf[js.Any])
    
    inline def setTempFilePathsUndefined: Self = StObject.set(x, "tempFilePaths", js.undefined)
    
    inline def setTempFilePathsVarargs(value: Any*): Self = StObject.set(x, "tempFilePaths", js.Array(value*))
    
    inline def setTempFiles(value: ChooseImageSuccessCallbackResultFile | js.Array[ChooseImageSuccessCallbackResultFile]): Self = StObject.set(x, "tempFiles", value.asInstanceOf[js.Any])
    
    inline def setTempFilesUndefined: Self = StObject.set(x, "tempFiles", js.undefined)
    
    inline def setTempFilesVarargs(value: ChooseImageSuccessCallbackResultFile*): Self = StObject.set(x, "tempFiles", js.Array(value*))
  }
}
