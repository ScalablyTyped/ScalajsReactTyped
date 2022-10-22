package typingsJapgolly.reactNavigationNative

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefHandle
import typingsJapgolly.reactNavigationNative.anon.Animated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcUseScrollToTopMod {
  
  @JSImport("@react-navigation/native/lib/typescript/src/useScrollToTop", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(ref: RefHandle[ScrollableWrapper]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait ScrollOptions extends StObject {
    
    var animated: js.UndefOr[Boolean] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
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
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNavigationNative.anon.ScrollToTop
    - typingsJapgolly.reactNavigationNative.anon.ScrollTo
    - typingsJapgolly.reactNavigationNative.anon.ScrollToOffset
    - typingsJapgolly.reactNavigationNative.anon.ScrollResponderScrollTo
  */
  trait ScrollableView
    extends StObject
       with ScrollableWrapper
  object ScrollableView {
    
    inline def ScrollResponderScrollTo(scrollResponderScrollTo: ScrollOptions => Callback): typingsJapgolly.reactNavigationNative.anon.ScrollResponderScrollTo = {
      val __obj = js.Dynamic.literal(scrollResponderScrollTo = js.Any.fromFunction1((t0: ScrollOptions) => scrollResponderScrollTo(t0).runNow()))
      __obj.asInstanceOf[typingsJapgolly.reactNavigationNative.anon.ScrollResponderScrollTo]
    }
    
    inline def ScrollTo(scrollTo: ScrollOptions => Callback): typingsJapgolly.reactNavigationNative.anon.ScrollTo = {
      val __obj = js.Dynamic.literal(scrollTo = js.Any.fromFunction1((t0: ScrollOptions) => scrollTo(t0).runNow()))
      __obj.asInstanceOf[typingsJapgolly.reactNavigationNative.anon.ScrollTo]
    }
    
    inline def ScrollToOffset(scrollToOffset: Animated => Callback): typingsJapgolly.reactNavigationNative.anon.ScrollToOffset = {
      val __obj = js.Dynamic.literal(scrollToOffset = js.Any.fromFunction1((t0: Animated) => scrollToOffset(t0).runNow()))
      __obj.asInstanceOf[typingsJapgolly.reactNavigationNative.anon.ScrollToOffset]
    }
    
    inline def ScrollToTop(scrollToTop: Callback): typingsJapgolly.reactNavigationNative.anon.ScrollToTop = {
      val __obj = js.Dynamic.literal(scrollToTop = scrollToTop.toJsFn)
      __obj.asInstanceOf[typingsJapgolly.reactNavigationNative.anon.ScrollToTop]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNavigationNative.anon.GetScrollResponder
    - typingsJapgolly.reactNavigationNative.anon.GetNode
    - typingsJapgolly.reactNavigationNative.libTypescriptSrcUseScrollToTopMod.ScrollableView
  */
  trait ScrollableWrapper extends StObject
  object ScrollableWrapper {
    
    inline def GetNode(getNode: CallbackTo[ScrollableView]): typingsJapgolly.reactNavigationNative.anon.GetNode = {
      val __obj = js.Dynamic.literal(getNode = getNode.toJsFn)
      __obj.asInstanceOf[typingsJapgolly.reactNavigationNative.anon.GetNode]
    }
    
    inline def GetScrollResponder(getScrollResponder: CallbackTo[Node]): typingsJapgolly.reactNavigationNative.anon.GetScrollResponder = {
      val __obj = js.Dynamic.literal(getScrollResponder = getScrollResponder.toJsFn)
      __obj.asInstanceOf[typingsJapgolly.reactNavigationNative.anon.GetScrollResponder]
    }
    
    inline def ScrollResponderScrollTo(scrollResponderScrollTo: ScrollOptions => Callback): typingsJapgolly.reactNavigationNative.anon.ScrollResponderScrollTo = {
      val __obj = js.Dynamic.literal(scrollResponderScrollTo = js.Any.fromFunction1((t0: ScrollOptions) => scrollResponderScrollTo(t0).runNow()))
      __obj.asInstanceOf[typingsJapgolly.reactNavigationNative.anon.ScrollResponderScrollTo]
    }
    
    inline def ScrollTo(scrollTo: ScrollOptions => Callback): typingsJapgolly.reactNavigationNative.anon.ScrollTo = {
      val __obj = js.Dynamic.literal(scrollTo = js.Any.fromFunction1((t0: ScrollOptions) => scrollTo(t0).runNow()))
      __obj.asInstanceOf[typingsJapgolly.reactNavigationNative.anon.ScrollTo]
    }
    
    inline def ScrollToOffset(scrollToOffset: Animated => Callback): typingsJapgolly.reactNavigationNative.anon.ScrollToOffset = {
      val __obj = js.Dynamic.literal(scrollToOffset = js.Any.fromFunction1((t0: Animated) => scrollToOffset(t0).runNow()))
      __obj.asInstanceOf[typingsJapgolly.reactNavigationNative.anon.ScrollToOffset]
    }
    
    inline def ScrollToTop(scrollToTop: Callback): typingsJapgolly.reactNavigationNative.anon.ScrollToTop = {
      val __obj = js.Dynamic.literal(scrollToTop = scrollToTop.toJsFn)
      __obj.asInstanceOf[typingsJapgolly.reactNavigationNative.anon.ScrollToTop]
    }
  }
}
