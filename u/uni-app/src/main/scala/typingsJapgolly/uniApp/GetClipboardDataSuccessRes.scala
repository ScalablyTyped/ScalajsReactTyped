package typingsJapgolly.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetClipboardDataSuccessRes extends StObject {
  
  /**
    * 剪贴板的内容
    */
  var data: js.UndefOr[String] = js.undefined
}
object GetClipboardDataSuccessRes {
  
  inline def apply(): GetClipboardDataSuccessRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetClipboardDataSuccessRes]
  }
  
  extension [Self <: GetClipboardDataSuccessRes](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
