package typingsJapgolly.videoJs.mod.videojs

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClickableComponentOptions
  extends StObject
     with ComponentOptions {
  
  var clickHandler: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object ClickableComponentOptions {
  
  inline def apply(): ClickableComponentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClickableComponentOptions]
  }
  
  extension [Self <: ClickableComponentOptions](x: Self) {
    
    inline def setClickHandler(value: Callback): Self = StObject.set(x, "clickHandler", value.toJsFn)
    
    inline def setClickHandlerUndefined: Self = StObject.set(x, "clickHandler", js.undefined)
  }
}
