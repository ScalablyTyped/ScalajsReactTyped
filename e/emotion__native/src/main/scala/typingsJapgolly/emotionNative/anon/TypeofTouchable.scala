package typingsJapgolly.emotionNative.anon

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.reactNative.anon.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTouchable extends StObject {
  
  var TOUCH_TARGET_DEBUG: Boolean
  
  def renderDebugView(config: Color): Element | Null
}
object TypeofTouchable {
  
  inline def apply(TOUCH_TARGET_DEBUG: Boolean, renderDebugView: Color => Element | Null): TypeofTouchable = {
    val __obj = js.Dynamic.literal(TOUCH_TARGET_DEBUG = TOUCH_TARGET_DEBUG.asInstanceOf[js.Any], renderDebugView = js.Any.fromFunction1(renderDebugView))
    __obj.asInstanceOf[TypeofTouchable]
  }
  
  extension [Self <: TypeofTouchable](x: Self) {
    
    inline def setRenderDebugView(value: Color => Element | Null): Self = StObject.set(x, "renderDebugView", js.Any.fromFunction1(value))
    
    inline def setTOUCH_TARGET_DEBUG(value: Boolean): Self = StObject.set(x, "TOUCH_TARGET_DEBUG", value.asInstanceOf[js.Any])
  }
}
