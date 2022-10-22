package typingsJapgolly.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageScrollToOptions extends StObject {
  
  /**
    * 滚动动画的时长
    */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
    * 滚动到页面的目标位置
    */
  var scrollTop: js.UndefOr[Double] = js.undefined
}
object PageScrollToOptions {
  
  inline def apply(): PageScrollToOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageScrollToOptions]
  }
  
  extension [Self <: PageScrollToOptions](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
    
    inline def setScrollTopUndefined: Self = StObject.set(x, "scrollTop", js.undefined)
  }
}
