package typingsJapgolly.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScanCodeSuccessRes extends StObject {
  
  /**
    * 所扫码的字符集
    */
  var charSet: js.UndefOr[String] = js.undefined
  
  /**
    * 当所扫的码为当前应用的合法二维码时，会返回此字段，内容为二维码携带的 path。
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * 所扫码的内容
    */
  var result: js.UndefOr[String] = js.undefined
  
  /**
    * 所扫码的类型
    */
  var scanType: js.UndefOr[String] = js.undefined
}
object ScanCodeSuccessRes {
  
  inline def apply(): ScanCodeSuccessRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScanCodeSuccessRes]
  }
  
  extension [Self <: ScanCodeSuccessRes](x: Self) {
    
    inline def setCharSet(value: String): Self = StObject.set(x, "charSet", value.asInstanceOf[js.Any])
    
    inline def setCharSetUndefined: Self = StObject.set(x, "charSet", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    inline def setScanType(value: String): Self = StObject.set(x, "scanType", value.asInstanceOf[js.Any])
    
    inline def setScanTypeUndefined: Self = StObject.set(x, "scanType", js.undefined)
  }
}
