package typingsJapgolly.reactWidgets

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.propTypes.mod.Validator
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmSlideDownTransitionMod {
  
  @JSImport("react-widgets/esm/SlideDownTransition", JSImport.Default)
  @js.native
  open class default () extends SlideDownTransition
  object default {
    
    /* static member */
    object propTypes {
      
      @JSImport("react-widgets/esm/SlideDownTransition", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-widgets/esm/SlideDownTransition", "default.propTypes.dropUp")
      @js.native
      def dropUp: Requireable[Boolean] = js.native
      inline def dropUp_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dropUp")(x.asInstanceOf[js.Any])
      
      @JSImport("react-widgets/esm/SlideDownTransition", "default.propTypes.in")
      @js.native
      def in: Validator[Boolean] = js.native
      inline def in_=(x: Validator[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("in")(x.asInstanceOf[js.Any])
      
      @JSImport("react-widgets/esm/SlideDownTransition", "default.propTypes.innerClassName")
      @js.native
      def innerClassName: Requireable[String] = js.native
      inline def innerClassName_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("innerClassName")(x.asInstanceOf[js.Any])
      
      @JSImport("react-widgets/esm/SlideDownTransition", "default.propTypes.onEntered")
      @js.native
      def onEntered: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onEntered_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onEntered")(x.asInstanceOf[js.Any])
      
      @JSImport("react-widgets/esm/SlideDownTransition", "default.propTypes.onEntering")
      @js.native
      def onEntering: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onEntering_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onEntering")(x.asInstanceOf[js.Any])
      
      @JSImport("react-widgets/esm/SlideDownTransition", "default.propTypes.onExit")
      @js.native
      def onExit: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onExit_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onExit")(x.asInstanceOf[js.Any])
      
      @JSImport("react-widgets/esm/SlideDownTransition", "default.propTypes.onExited")
      @js.native
      def onExited: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onExited_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onExited")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SlideDownTransition
    extends Component[SlideDownTransitionProps, js.Object, Any] {
    
    def clearContainerHeight(elem: HTMLElement): Unit = js.native
    
    def getHeight(container: HTMLElement): Double = js.native
    
    def handleEntered(elem: HTMLElement): Unit = js.native
    
    def handleEntering(): Unit = js.native
    
    def handleExit(elem: HTMLElement): Unit = js.native
    
    def handleExited(elem: HTMLElement): Unit = js.native
    
    def handleTransitionEnd(el: HTMLElement, done: js.Function0[Unit]): Unit = js.native
    
    def setContainerHeight(elem: HTMLElement): Unit = js.native
  }
  
  trait SlideDownTransitionProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var dropUp: js.UndefOr[Boolean] = js.undefined
    
    var in: Boolean
    
    var innerClassName: js.UndefOr[String] = js.undefined
    
    var onEntered: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onEntering: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onExit: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onExited: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object SlideDownTransitionProps {
    
    inline def apply(in: Boolean): SlideDownTransitionProps = {
      val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any])
      __obj.asInstanceOf[SlideDownTransitionProps]
    }
    
    extension [Self <: SlideDownTransitionProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDropUp(value: Boolean): Self = StObject.set(x, "dropUp", value.asInstanceOf[js.Any])
      
      inline def setDropUpUndefined: Self = StObject.set(x, "dropUp", js.undefined)
      
      inline def setIn(value: Boolean): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      inline def setInnerClassName(value: String): Self = StObject.set(x, "innerClassName", value.asInstanceOf[js.Any])
      
      inline def setInnerClassNameUndefined: Self = StObject.set(x, "innerClassName", js.undefined)
      
      inline def setOnEntered(value: Callback): Self = StObject.set(x, "onEntered", value.toJsFn)
      
      inline def setOnEnteredUndefined: Self = StObject.set(x, "onEntered", js.undefined)
      
      inline def setOnEntering(value: Callback): Self = StObject.set(x, "onEntering", value.toJsFn)
      
      inline def setOnEnteringUndefined: Self = StObject.set(x, "onEntering", js.undefined)
      
      inline def setOnExit(value: Callback): Self = StObject.set(x, "onExit", value.toJsFn)
      
      inline def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
      
      inline def setOnExited(value: Callback): Self = StObject.set(x, "onExited", value.toJsFn)
      
      inline def setOnExitedUndefined: Self = StObject.set(x, "onExited", js.undefined)
    }
  }
}
