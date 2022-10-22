package typingsJapgolly.tuyaPanelKit

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefHandle
import typingsJapgolly.tuyaPanelKit.anon.Animated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `@reactNavigationNativeUseScrollToTopMod` {
  
  @JSImport("tuya-panel-kit/@react-navigation/native/useScrollToTop", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(ref: RefHandle[ScrollableWrapper]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  // tslint:disable-next-line strict-export-declare-modifiers interface-over-type-literal
  trait ScrollOptions extends StObject {
    
    var animated: js.UndefOr[Boolean] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object ScrollOptions {
    
    inline def apply(): ScrollOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollOptions]
    }
    
    extension [Self <: ScrollOptions](x: Self) {
      
      inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  // tslint:disable-next-line strict-export-declare-modifiers interface-over-type-literal
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tuyaPanelKit.anon.ScrollToTop
    - typingsJapgolly.tuyaPanelKit.anon.ScrollTo
    - typingsJapgolly.tuyaPanelKit.anon.ScrollToOffset
    - typingsJapgolly.tuyaPanelKit.anon.ScrollResponderScrollTo
  */
  trait ScrollableView
    extends StObject
       with ScrollableWrapper
  object ScrollableView {
    
    inline def ScrollResponderScrollTo(scrollResponderScrollTo: ScrollOptions => Callback): typingsJapgolly.tuyaPanelKit.anon.ScrollResponderScrollTo = {
      val __obj = js.Dynamic.literal(scrollResponderScrollTo = js.Any.fromFunction1((t0: ScrollOptions) => scrollResponderScrollTo(t0).runNow()))
      __obj.asInstanceOf[typingsJapgolly.tuyaPanelKit.anon.ScrollResponderScrollTo]
    }
    
    inline def ScrollTo(scrollTo: ScrollOptions => Callback): typingsJapgolly.tuyaPanelKit.anon.ScrollTo = {
      val __obj = js.Dynamic.literal(scrollTo = js.Any.fromFunction1((t0: ScrollOptions) => scrollTo(t0).runNow()))
      __obj.asInstanceOf[typingsJapgolly.tuyaPanelKit.anon.ScrollTo]
    }
    
    inline def ScrollToOffset(scrollToOffset: Animated => Callback): typingsJapgolly.tuyaPanelKit.anon.ScrollToOffset = {
      val __obj = js.Dynamic.literal(scrollToOffset = js.Any.fromFunction1((t0: Animated) => scrollToOffset(t0).runNow()))
      __obj.asInstanceOf[typingsJapgolly.tuyaPanelKit.anon.ScrollToOffset]
    }
    
    inline def ScrollToTop(scrollToTop: Callback): typingsJapgolly.tuyaPanelKit.anon.ScrollToTop = {
      val __obj = js.Dynamic.literal(scrollToTop = scrollToTop.toJsFn)
      __obj.asInstanceOf[typingsJapgolly.tuyaPanelKit.anon.ScrollToTop]
    }
  }
  
  // tslint:disable-next-line strict-export-declare-modifiers
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tuyaPanelKit.anon.GetScrollResponder
    - typingsJapgolly.tuyaPanelKit.anon.GetNode
    - typingsJapgolly.tuyaPanelKit.`@reactNavigationNativeUseScrollToTopMod`.ScrollableView
  */
  trait ScrollableWrapper extends StObject
  object ScrollableWrapper {
    
    inline def GetNode(getNode: CallbackTo[ScrollableView]): typingsJapgolly.tuyaPanelKit.anon.GetNode = {
      val __obj = js.Dynamic.literal(getNode = getNode.toJsFn)
      __obj.asInstanceOf[typingsJapgolly.tuyaPanelKit.anon.GetNode]
    }
    
    inline def GetScrollResponder(getScrollResponder: CallbackTo[Node]): typingsJapgolly.tuyaPanelKit.anon.GetScrollResponder = {
      val __obj = js.Dynamic.literal(getScrollResponder = getScrollResponder.toJsFn)
      __obj.asInstanceOf[typingsJapgolly.tuyaPanelKit.anon.GetScrollResponder]
    }
    
    inline def ScrollResponderScrollTo(scrollResponderScrollTo: ScrollOptions => Callback): typingsJapgolly.tuyaPanelKit.anon.ScrollResponderScrollTo = {
      val __obj = js.Dynamic.literal(scrollResponderScrollTo = js.Any.fromFunction1((t0: ScrollOptions) => scrollResponderScrollTo(t0).runNow()))
      __obj.asInstanceOf[typingsJapgolly.tuyaPanelKit.anon.ScrollResponderScrollTo]
    }
    
    inline def ScrollTo(scrollTo: ScrollOptions => Callback): typingsJapgolly.tuyaPanelKit.anon.ScrollTo = {
      val __obj = js.Dynamic.literal(scrollTo = js.Any.fromFunction1((t0: ScrollOptions) => scrollTo(t0).runNow()))
      __obj.asInstanceOf[typingsJapgolly.tuyaPanelKit.anon.ScrollTo]
    }
    
    inline def ScrollToOffset(scrollToOffset: Animated => Callback): typingsJapgolly.tuyaPanelKit.anon.ScrollToOffset = {
      val __obj = js.Dynamic.literal(scrollToOffset = js.Any.fromFunction1((t0: Animated) => scrollToOffset(t0).runNow()))
      __obj.asInstanceOf[typingsJapgolly.tuyaPanelKit.anon.ScrollToOffset]
    }
    
    inline def ScrollToTop(scrollToTop: Callback): typingsJapgolly.tuyaPanelKit.anon.ScrollToTop = {
      val __obj = js.Dynamic.literal(scrollToTop = scrollToTop.toJsFn)
      __obj.asInstanceOf[typingsJapgolly.tuyaPanelKit.anon.ScrollToTop]
    }
  }
}
