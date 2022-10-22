package typingsJapgolly.tuyaPanelKit.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.tuyaPanelKit.`@reactNavigationNativeUseScrollToTopMod`.ScrollOptions
import typingsJapgolly.tuyaPanelKit.`@reactNavigationNativeUseScrollToTopMod`.ScrollableView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollResponderScrollTo
  extends StObject
     with ScrollableView {
  
  def scrollResponderScrollTo(options: ScrollOptions): Unit
}
object ScrollResponderScrollTo {
  
  inline def apply(scrollResponderScrollTo: ScrollOptions => Callback): ScrollResponderScrollTo = {
    val __obj = js.Dynamic.literal(scrollResponderScrollTo = js.Any.fromFunction1((t0: ScrollOptions) => scrollResponderScrollTo(t0).runNow()))
    __obj.asInstanceOf[ScrollResponderScrollTo]
  }
  
  extension [Self <: ScrollResponderScrollTo](x: Self) {
    
    inline def setScrollResponderScrollTo(value: ScrollOptions => Callback): Self = StObject.set(x, "scrollResponderScrollTo", js.Any.fromFunction1((t0: ScrollOptions) => value(t0).runNow()))
  }
}
