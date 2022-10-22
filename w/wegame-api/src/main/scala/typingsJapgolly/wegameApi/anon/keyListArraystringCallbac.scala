package typingsJapgolly.wegameApi.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  keyList :std.Array<string>} & wegame-api.wx.types.CallbacksWithType2<{  encryptedData :string,   cloudID :string}, {  errMsg :string,   errCode :number}> */
trait keyListArraystringCallbac extends StObject {
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var fail: js.UndefOr[js.Function1[/* res */ ErrCode, Unit]] = js.undefined
  
  /**
    * 要获取的 key 列表
    */
  var keyList: js.Array[String]
  
  var success: js.UndefOr[js.Function1[/* res */ CloudID, Unit]] = js.undefined
}
object keyListArraystringCallbac {
  
  inline def apply(keyList: js.Array[String]): keyListArraystringCallbac = {
    val __obj = js.Dynamic.literal(keyList = keyList.asInstanceOf[js.Any])
    __obj.asInstanceOf[keyListArraystringCallbac]
  }
  
  extension [Self <: keyListArraystringCallbac](x: Self) {
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: /* res */ ErrCode => Callback): Self = StObject.set(x, "fail", js.Any.fromFunction1((t0: /* res */ ErrCode) => value(t0).runNow()))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setKeyList(value: js.Array[String]): Self = StObject.set(x, "keyList", value.asInstanceOf[js.Any])
    
    inline def setKeyListVarargs(value: String*): Self = StObject.set(x, "keyList", js.Array(value*))
    
    inline def setSuccess(value: /* res */ CloudID => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* res */ CloudID) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
