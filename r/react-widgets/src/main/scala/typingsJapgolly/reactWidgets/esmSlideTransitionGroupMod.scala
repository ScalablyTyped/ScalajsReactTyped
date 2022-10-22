package typingsJapgolly.reactWidgets

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactWidgets.reactWidgetsStrings.bottom
import typingsJapgolly.reactWidgets.reactWidgetsStrings.left_
import typingsJapgolly.reactWidgets.reactWidgetsStrings.right_
import typingsJapgolly.reactWidgets.reactWidgetsStrings.top
import typingsJapgolly.std.ChildNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmSlideTransitionGroupMod {
  
  @JSImport("react-widgets/esm/SlideTransitionGroup", JSImport.Default)
  @js.native
  open class default protected () extends SlideTransitionGroup {
    def this(args: SlideTransitionGroupProps) = this()
  }
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("react-widgets/esm/SlideTransitionGroup", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-widgets/esm/SlideTransitionGroup", "default.defaultProps.direction")
      @js.native
      def direction: String = js.native
      inline def direction_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("direction")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    object propTypes {
      
      @JSImport("react-widgets/esm/SlideTransitionGroup", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-widgets/esm/SlideTransitionGroup", "default.propTypes.direction")
      @js.native
      def direction: Requireable[String] = js.native
      inline def direction_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("direction")(x.asInstanceOf[js.Any])
      
      @JSImport("react-widgets/esm/SlideTransitionGroup", "default.propTypes.onTransitionEnd")
      @js.native
      def onTransitionEnd: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onTransitionEnd_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onTransitionEnd")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SlideTransitionGroup extends Component[SlideTransitionGroupProps, SlideTransitionGroupState, Any] {
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MSlideTransitionGroup(): Unit = js.native
    
    var container: RefHandle[HTMLDivElement] = js.native
    
    var current: Element = js.native
    
    var flush: js.UndefOr[Boolean] = js.native
    
    def handleTransitionEnd(): Unit = js.native
    def handleTransitionEnd(hadFocus: Boolean): Unit = js.native
    
    var isTransitioning: js.UndefOr[Boolean] = js.native
    
    var prev: js.UndefOr[Element | Null] = js.native
  }
  
  @js.native
  trait SlideTransitionGroupProps extends StObject {
    
    var direction: left_ | right_ | top | bottom = js.native
    
    def onTransitionEnd(node: ChildNode): Unit = js.native
    def onTransitionEnd(node: ChildNode, hadFocus: Boolean): Unit = js.native
  }
  
  trait SlideTransitionGroupState extends StObject {
    
    var currentClasses: String
    
    var prevClasses: String
  }
  object SlideTransitionGroupState {
    
    inline def apply(currentClasses: String, prevClasses: String): SlideTransitionGroupState = {
      val __obj = js.Dynamic.literal(currentClasses = currentClasses.asInstanceOf[js.Any], prevClasses = prevClasses.asInstanceOf[js.Any])
      __obj.asInstanceOf[SlideTransitionGroupState]
    }
    
    extension [Self <: SlideTransitionGroupState](x: Self) {
      
      inline def setCurrentClasses(value: String): Self = StObject.set(x, "currentClasses", value.asInstanceOf[js.Any])
      
      inline def setPrevClasses(value: String): Self = StObject.set(x, "prevClasses", value.asInstanceOf[js.Any])
    }
  }
}
