package typingsJapgolly.minappEnv.wx

import japgolly.scalajs.react.Callback
import typingsJapgolly.minappEnv.Array
import typingsJapgolly.minappEnv.minappEnvStrings.barCode
import typingsJapgolly.minappEnv.minappEnvStrings.datamatrix
import typingsJapgolly.minappEnv.minappEnvStrings.pdf417
import typingsJapgolly.minappEnv.minappEnvStrings.qrCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScanCodeOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ScanCodeCompleteCallback] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ScanCodeFailCallback] = js.undefined
  
  /** 是否只能从相机扫码，不允许从相册选择图片
    *
    * 最低基础库： `1.2.0` */
  var onlyFromCamera: js.UndefOr[Boolean] = js.undefined
  
  /** 扫码类型
    *
    * 可选值：
    * - 'barCode': 一维码;
    * - 'qrCode': 二维码;
    * - 'datamatrix': Data Matrix 码;
    * - 'pdf417': PDF417 条码;
    *
    * 最低基础库： `1.7.0` */
  var scanType: js.UndefOr[Array[barCode | qrCode | datamatrix | pdf417]] = js.undefined
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ScanCodeSuccessCallback] = js.undefined
}
object ScanCodeOption {
  
  inline def apply(): ScanCodeOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScanCodeOption]
  }
  
  extension [Self <: ScanCodeOption](x: Self) {
    
    inline def setComplete(value: /* res */ GeneralCallbackResult => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: /* res */ GeneralCallbackResult) => value(t0).runNow()))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: /* res */ GeneralCallbackResult => Callback): Self = StObject.set(x, "fail", js.Any.fromFunction1((t0: /* res */ GeneralCallbackResult) => value(t0).runNow()))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setOnlyFromCamera(value: Boolean): Self = StObject.set(x, "onlyFromCamera", value.asInstanceOf[js.Any])
    
    inline def setOnlyFromCameraUndefined: Self = StObject.set(x, "onlyFromCamera", js.undefined)
    
    inline def setScanType(value: Array[barCode | qrCode | datamatrix | pdf417]): Self = StObject.set(x, "scanType", value.asInstanceOf[js.Any])
    
    inline def setScanTypeUndefined: Self = StObject.set(x, "scanType", js.undefined)
    
    inline def setSuccess(value: /* result */ ScanCodeSuccessCallbackResult => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* result */ ScanCodeSuccessCallbackResult) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
