package typingsJapgolly.wegameApi.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.wegameApi.wegameApiStrings.game
import typingsJapgolly.wegameApi.wegameApiStrings.normal
import typingsJapgolly.wegameApi.wegameApiStrings.ui
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  interval :'game' | 'ui' | 'normal'} & wegame-api.wx.types.Callbacks */
trait intervalgameuinormalCallb extends StObject {
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 开始监听设备方向的变化。默认值normal，
    * game - 适用于更新游戏的回调频率，在 20ms/次 左右
    * ui - 适用于更新 UI 的回调频率，在 60ms/次 左右
    * normal - 普通的回调频率，在 200ms/次 左右
    */
  var interval: game | ui | normal
  
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object intervalgameuinormalCallb {
  
  inline def apply(interval: game | ui | normal): intervalgameuinormalCallb = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[intervalgameuinormalCallb]
  }
  
  extension [Self <: intervalgameuinormalCallb](x: Self) {
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: Callback): Self = StObject.set(x, "fail", value.toJsFn)
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setInterval(value: game | ui | normal): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: Callback): Self = StObject.set(x, "success", value.toJsFn)
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
