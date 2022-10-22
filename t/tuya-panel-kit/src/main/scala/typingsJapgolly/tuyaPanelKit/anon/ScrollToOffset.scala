package typingsJapgolly.tuyaPanelKit.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.tuyaPanelKit.`@reactNavigationNativeUseScrollToTopMod`.ScrollableView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollToOffset
  extends StObject
     with ScrollableView {
  
  def scrollToOffset(options: Animated): Unit
}
object ScrollToOffset {
  
  inline def apply(scrollToOffset: Animated => Callback): ScrollToOffset = {
    val __obj = js.Dynamic.literal(scrollToOffset = js.Any.fromFunction1((t0: Animated) => scrollToOffset(t0).runNow()))
    __obj.asInstanceOf[ScrollToOffset]
  }
  
  extension [Self <: ScrollToOffset](x: Self) {
    
    inline def setScrollToOffset(value: Animated => Callback): Self = StObject.set(x, "scrollToOffset", js.Any.fromFunction1((t0: Animated) => value(t0).runNow()))
  }
}
