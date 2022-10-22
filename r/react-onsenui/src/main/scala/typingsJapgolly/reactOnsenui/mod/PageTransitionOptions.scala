package typingsJapgolly.reactOnsenui.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageTransitionOptions extends StObject {
  
  var animation: js.UndefOr[NavigatorAnimationTypes] = js.undefined
  
  var animationOptions: js.UndefOr[AnimationOptions] = js.undefined
  
  var callback: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var data: js.UndefOr[Any] = js.undefined
}
object PageTransitionOptions {
  
  inline def apply(): PageTransitionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageTransitionOptions]
  }
  
  extension [Self <: PageTransitionOptions](x: Self) {
    
    inline def setAnimation(value: NavigatorAnimationTypes): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationOptions(value: AnimationOptions): Self = StObject.set(x, "animationOptions", value.asInstanceOf[js.Any])
    
    inline def setAnimationOptionsUndefined: Self = StObject.set(x, "animationOptions", js.undefined)
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setCallback(value: Callback): Self = StObject.set(x, "callback", value.toJsFn)
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
