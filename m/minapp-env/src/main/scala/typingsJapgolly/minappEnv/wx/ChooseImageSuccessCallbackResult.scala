package typingsJapgolly.minappEnv.wx

import typingsJapgolly.minappEnv.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChooseImageSuccessCallbackResult extends StObject {
  
  /** 图片的本地临时文件路径列表 */
  var tempFilePaths: Array[String]
  
  /** 图片的本地临时文件列表
    *
    * 最低基础库： `1.2.0` */
  var tempFiles: Array[ImageFile]
}
object ChooseImageSuccessCallbackResult {
  
  inline def apply(tempFilePaths: Array[String], tempFiles: Array[ImageFile]): ChooseImageSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(tempFilePaths = tempFilePaths.asInstanceOf[js.Any], tempFiles = tempFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseImageSuccessCallbackResult]
  }
  
  extension [Self <: ChooseImageSuccessCallbackResult](x: Self) {
    
    inline def setTempFilePaths(value: Array[String]): Self = StObject.set(x, "tempFilePaths", value.asInstanceOf[js.Any])
    
    inline def setTempFiles(value: Array[ImageFile]): Self = StObject.set(x, "tempFiles", value.asInstanceOf[js.Any])
  }
}
