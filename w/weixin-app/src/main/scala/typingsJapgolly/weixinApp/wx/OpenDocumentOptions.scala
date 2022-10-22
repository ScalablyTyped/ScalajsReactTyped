package typingsJapgolly.weixinApp.wx

import typingsJapgolly.weixinApp.weixinAppStrings.doc
import typingsJapgolly.weixinApp.weixinAppStrings.docx
import typingsJapgolly.weixinApp.weixinAppStrings.pdf
import typingsJapgolly.weixinApp.weixinAppStrings.ppt
import typingsJapgolly.weixinApp.weixinAppStrings.pptx
import typingsJapgolly.weixinApp.weixinAppStrings.xls
import typingsJapgolly.weixinApp.weixinAppStrings.xlsx
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenDocumentOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /**
    * 文件路径，可通过 downFile 获得
    */
  var filePath: String
  
  /**
    * 文件类型，指定文件类型打开文件，有效值 doc, xls, ppt, pdf, docx, xlsx, pptx
    */
  var fileType: js.UndefOr[doc | xls | ppt | pdf | docx | xlsx | pptx] = js.undefined
}
object OpenDocumentOptions {
  
  inline def apply(filePath: String): OpenDocumentOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenDocumentOptions]
  }
  
  extension [Self <: OpenDocumentOptions](x: Self) {
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setFileType(value: doc | xls | ppt | pdf | docx | xlsx | pptx): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
    
    inline def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
  }
}
