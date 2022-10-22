package typingsJapgolly.baseui

import typingsJapgolly.baseui.baseuiStrings.auto
import typingsJapgolly.baseui.baseuiStrings.click
import typingsJapgolly.baseui.baseuiStrings.menu
import typingsJapgolly.baseui.popoverTypesMod.StatefulPopoverProps
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popoverStatefulPopoverMod {
  
  object default {
    
    inline def apply(props: StatefulPopoverProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("baseui/popover/stateful-popover", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("baseui/popover/stateful-popover", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/popover/stateful-popover", "default.defaultProps.accessibilityType")
      @js.native
      def accessibilityType: menu = js.native
      inline def accessibilityType_=(x: menu): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityType")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/popover/stateful-popover", "default.defaultProps.dismissOnClickOutside")
      @js.native
      def dismissOnClickOutside: Boolean = js.native
      inline def dismissOnClickOutside_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dismissOnClickOutside")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/popover/stateful-popover", "default.defaultProps.dismissOnEsc")
      @js.native
      def dismissOnEsc: Boolean = js.native
      inline def dismissOnEsc_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dismissOnEsc")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/popover/stateful-popover", "default.defaultProps.ignoreBoundary")
      @js.native
      def ignoreBoundary: Boolean = js.native
      inline def ignoreBoundary_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ignoreBoundary")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/popover/stateful-popover", "default.defaultProps.onMouseEnterDelay")
      @js.native
      def onMouseEnterDelay: Double = js.native
      inline def onMouseEnterDelay_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnterDelay")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/popover/stateful-popover", "default.defaultProps.onMouseLeaveDelay")
      @js.native
      def onMouseLeaveDelay: Double = js.native
      inline def onMouseLeaveDelay_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeaveDelay")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/popover/stateful-popover", "default.defaultProps.placement")
      @js.native
      def placement: auto = js.native
      inline def placement_=(x: auto): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placement")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/popover/stateful-popover", "default.defaultProps.popoverMargin")
      @js.native
      def popoverMargin: Double = js.native
      inline def popoverMargin_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("popoverMargin")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/popover/stateful-popover", "default.defaultProps.showArrow")
      @js.native
      def showArrow: Boolean = js.native
      inline def showArrow_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showArrow")(x.asInstanceOf[js.Any])
      
      inline def stateReducer(_underscore: Any, nextState: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("stateReducer")(_underscore.asInstanceOf[js.Any], nextState.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      @JSImport("baseui/popover/stateful-popover", "default.defaultProps.triggerType")
      @js.native
      def triggerType: click = js.native
      inline def triggerType_=(x: click): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("triggerType")(x.asInstanceOf[js.Any])
    }
  }
}
