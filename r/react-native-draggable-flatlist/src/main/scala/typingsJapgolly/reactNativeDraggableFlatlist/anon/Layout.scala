package typingsJapgolly.reactNativeDraggableFlatlist.anon

import japgolly.scalajs.react.facade.React.RefHandle
import typingsJapgolly.reactNative.mod.LayoutRectangle
import typingsJapgolly.reactNativeReanimated.mod.Animated.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Layout extends StObject {
  
  var containerRef: RefHandle[View]
  
  var layout: LayoutRectangle
}
object Layout {
  
  inline def apply(containerRef: RefHandle[View], layout: LayoutRectangle): Layout = {
    val __obj = js.Dynamic.literal(containerRef = containerRef.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layout]
  }
  
  extension [Self <: Layout](x: Self) {
    
    inline def setContainerRef(value: RefHandle[View]): Self = StObject.set(x, "containerRef", value.asInstanceOf[js.Any])
    
    inline def setLayout(value: LayoutRectangle): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
  }
}
