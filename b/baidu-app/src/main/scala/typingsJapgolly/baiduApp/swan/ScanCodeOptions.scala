package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScanCodeOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /**
    * 是否只能从相机扫码，不允许从相册选择图片
    * @version 1.2.0
    */
  var onlyFromCamera: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 扫码类型，参数类型是数组
    * 二维码是'qrCode'，一维码是'barCode'，DataMatrix是‘datamatrix’，pdf417是‘pdf417’。
    * @version 1.7.0
    */
  var scanType: js.UndefOr[js.Array[String]] = js.undefined
  
  @JSName("success")
  def success_MScanCodeOptions(res: ScanCodeData): Unit
}
object ScanCodeOptions {
  
  inline def apply(success: ScanCodeData => Callback): ScanCodeOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1((t0: ScanCodeData) => success(t0).runNow()))
    __obj.asInstanceOf[ScanCodeOptions]
  }
  
  extension [Self <: ScanCodeOptions](x: Self) {
    
    inline def setOnlyFromCamera(value: Boolean): Self = StObject.set(x, "onlyFromCamera", value.asInstanceOf[js.Any])
    
    inline def setOnlyFromCameraUndefined: Self = StObject.set(x, "onlyFromCamera", js.undefined)
    
    inline def setScanType(value: js.Array[String]): Self = StObject.set(x, "scanType", value.asInstanceOf[js.Any])
    
    inline def setScanTypeUndefined: Self = StObject.set(x, "scanType", js.undefined)
    
    inline def setScanTypeVarargs(value: String*): Self = StObject.set(x, "scanType", js.Array(value*))
    
    inline def setSuccess(value: ScanCodeData => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: ScanCodeData) => value(t0).runNow()))
  }
}
