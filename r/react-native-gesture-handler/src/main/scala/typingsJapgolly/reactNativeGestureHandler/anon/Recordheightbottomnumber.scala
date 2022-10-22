package typingsJapgolly.reactNativeGestureHandler.anon

import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGestureHandlerCommonMod._HitSlop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<'height' | 'bottom', number> */
trait Recordheightbottomnumber
  extends StObject
     with _HitSlop {
  
  var bottom: Double
  
  var height: Double
}
object Recordheightbottomnumber {
  
  inline def apply(bottom: Double, height: Double): Recordheightbottomnumber = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recordheightbottomnumber]
  }
  
  extension [Self <: Recordheightbottomnumber](x: Self) {
    
    inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
  }
}
