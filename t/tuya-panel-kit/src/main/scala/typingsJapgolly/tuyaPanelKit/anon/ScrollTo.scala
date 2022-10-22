package typingsJapgolly.tuyaPanelKit.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.tuyaPanelKit.`@reactNavigationNativeUseScrollToTopMod`.ScrollOptions
import typingsJapgolly.tuyaPanelKit.`@reactNavigationNativeUseScrollToTopMod`.ScrollableView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollTo
  extends StObject
     with ScrollableView {
  
  def scrollTo(options: ScrollOptions): Unit
}
object ScrollTo {
  
  inline def apply(scrollTo: ScrollOptions => Callback): ScrollTo = {
    val __obj = js.Dynamic.literal(scrollTo = js.Any.fromFunction1((t0: ScrollOptions) => scrollTo(t0).runNow()))
    __obj.asInstanceOf[ScrollTo]
  }
  
  extension [Self <: ScrollTo](x: Self) {
    
    inline def setScrollTo(value: ScrollOptions => Callback): Self = StObject.set(x, "scrollTo", js.Any.fromFunction1((t0: ScrollOptions) => value(t0).runNow()))
  }
}
