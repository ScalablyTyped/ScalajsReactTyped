package typingsJapgolly.reactNavigationNative.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNavigationNative.libTypescriptSrcUseScrollToTopMod.ScrollableView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollToTop
  extends StObject
     with ScrollableView {
  
  def scrollToTop(): Unit
}
object ScrollToTop {
  
  inline def apply(scrollToTop: Callback): ScrollToTop = {
    val __obj = js.Dynamic.literal(scrollToTop = scrollToTop.toJsFn)
    __obj.asInstanceOf[ScrollToTop]
  }
  
  extension [Self <: ScrollToTop](x: Self) {
    
    inline def setScrollToTop(value: Callback): Self = StObject.set(x, "scrollToTop", value.toJsFn)
  }
}
