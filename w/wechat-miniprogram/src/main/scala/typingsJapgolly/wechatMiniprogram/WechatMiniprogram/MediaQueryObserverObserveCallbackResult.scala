package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaQueryObserverObserveCallbackResult extends StObject {
  
  /** 页面的当前状态是否满足所指定的 media query */
  var matches: Boolean
}
object MediaQueryObserverObserveCallbackResult {
  
  inline def apply(matches: Boolean): MediaQueryObserverObserveCallbackResult = {
    val __obj = js.Dynamic.literal(matches = matches.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaQueryObserverObserveCallbackResult]
  }
  
  extension [Self <: MediaQueryObserverObserveCallbackResult](x: Self) {
    
    inline def setMatches(value: Boolean): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
  }
}
