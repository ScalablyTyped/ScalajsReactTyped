package typingsJapgolly.baseui

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLElement
import typingsJapgolly.baseui.baseuiStrings.bottom
import typingsJapgolly.baseui.baseuiStrings.click
import typingsJapgolly.baseui.baseuiStrings.hover
import typingsJapgolly.baseui.baseuiStrings.menu
import typingsJapgolly.baseui.baseuiStrings.none
import typingsJapgolly.baseui.baseuiStrings.tooltip
import typingsJapgolly.baseui.popoverTypesMod.PopoverOverrides
import typingsJapgolly.baseui.popoverTypesMod.PopoverProps
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.FocusOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helperHelperMod {
  
  object Helper {
    
    inline def apply(props: PopoverProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("baseui/helper/helper", "Helper")
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("baseui/helper/helper", "Helper.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/helper/helper", "Helper.defaultProps.accessibilityType")
      @js.native
      def accessibilityType: js.UndefOr[menu | none | tooltip] = js.native
      inline def accessibilityType_=(x: js.UndefOr[menu | none | tooltip]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityType")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/helper/helper", "Helper.defaultProps.animateOutTime")
      @js.native
      def animateOutTime: js.UndefOr[Double] = js.native
      inline def animateOutTime_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animateOutTime")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/helper/helper", "Helper.defaultProps.autoFocus")
      @js.native
      def autoFocus: js.UndefOr[Boolean] = js.native
      inline def autoFocus_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/helper/helper", "Helper.defaultProps.data-baseweb")
      @js.native
      def dataBaseweb: js.UndefOr[String] = js.native
      
      inline def dataBaseweb_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("data-baseweb")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/helper/helper", "Helper.defaultProps.focusLock")
      @js.native
      def focusLock: js.UndefOr[Boolean] = js.native
      inline def focusLock_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("focusLock")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/helper/helper", "Helper.defaultProps.focusOptions")
      @js.native
      def focusOptions: js.UndefOr[FocusOptions] = js.native
      inline def focusOptions_=(x: js.UndefOr[FocusOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("focusOptions")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/helper/helper", "Helper.defaultProps.id")
      @js.native
      def id: js.UndefOr[String] = js.native
      inline def id_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/helper/helper", "Helper.defaultProps.ignoreBoundary")
      @js.native
      def ignoreBoundary: js.UndefOr[Boolean] = js.native
      inline def ignoreBoundary_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ignoreBoundary")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/helper/helper", "Helper.defaultProps.mountNode")
      @js.native
      def mountNode: js.UndefOr[HTMLElement] = js.native
      inline def mountNode_=(x: js.UndefOr[HTMLElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mountNode")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/helper/helper", "Helper.defaultProps.onBlur")
      @js.native
      def onBlur: js.UndefOr[js.Function1[/* e */ ReactFocusEventFrom[org.scalajs.dom.Element], Any]] = js.native
      inline def onBlur_=(x: js.UndefOr[js.Function1[/* e */ ReactFocusEventFrom[org.scalajs.dom.Element], Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/helper/helper", "Helper.defaultProps.onClick")
      @js.native
      def onClick: js.UndefOr[js.Function1[/* e */ ReactEventFrom[org.scalajs.dom.Element], Any]] = js.native
      inline def onClick_=(x: js.UndefOr[js.Function1[/* e */ ReactEventFrom[org.scalajs.dom.Element], Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClick")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/helper/helper", "Helper.defaultProps.onFocus")
      @js.native
      def onFocus: js.UndefOr[js.Function1[/* e */ ReactFocusEventFrom[org.scalajs.dom.Element], Any]] = js.native
      inline def onFocus_=(x: js.UndefOr[js.Function1[/* e */ ReactFocusEventFrom[org.scalajs.dom.Element], Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/helper/helper", "Helper.defaultProps.onMouseEnter")
      @js.native
      def onMouseEnter: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[org.scalajs.dom.Element], Any]] = js.native
      
      @JSImport("baseui/helper/helper", "Helper.defaultProps.onMouseEnterDelay")
      @js.native
      def onMouseEnterDelay: js.UndefOr[Double] = js.native
      inline def onMouseEnterDelay_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnterDelay")(x.asInstanceOf[js.Any])
      
      inline def onMouseEnter_=(x: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[org.scalajs.dom.Element], Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/helper/helper", "Helper.defaultProps.onMouseLeave")
      @js.native
      def onMouseLeave: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[org.scalajs.dom.Element], Any]] = js.native
      
      @JSImport("baseui/helper/helper", "Helper.defaultProps.onMouseLeaveDelay")
      @js.native
      def onMouseLeaveDelay: js.UndefOr[Double] = js.native
      inline def onMouseLeaveDelay_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeaveDelay")(x.asInstanceOf[js.Any])
      
      inline def onMouseLeave_=(x: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[org.scalajs.dom.Element], Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/helper/helper", "Helper.defaultProps.overrides")
      @js.native
      def overrides: js.UndefOr[PopoverOverrides] = js.native
      inline def overrides_=(x: js.UndefOr[PopoverOverrides]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overrides")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/helper/helper", "Helper.defaultProps.placement")
      @js.native
      def placement: bottom = js.native
      inline def placement_=(x: bottom): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placement")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/helper/helper", "Helper.defaultProps.popoverMargin")
      @js.native
      def popoverMargin: js.UndefOr[Double] = js.native
      inline def popoverMargin_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("popoverMargin")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/helper/helper", "Helper.defaultProps.popperOptions")
      @js.native
      def popperOptions: js.UndefOr[Any] = js.native
      inline def popperOptions_=(x: js.UndefOr[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("popperOptions")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/helper/helper", "Helper.defaultProps.renderAll")
      @js.native
      def renderAll: js.UndefOr[Boolean] = js.native
      inline def renderAll_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderAll")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/helper/helper", "Helper.defaultProps.returnFocus")
      @js.native
      def returnFocus: js.UndefOr[
            Boolean | FocusOptions | (js.Function1[/* returnTo */ org.scalajs.dom.Element, Boolean | FocusOptions])
          ] = js.native
      inline def returnFocus_=(
        x: js.UndefOr[
              Boolean | FocusOptions | (js.Function1[/* returnTo */ org.scalajs.dom.Element, Boolean | FocusOptions])
            ]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("returnFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/helper/helper", "Helper.defaultProps.showArrow")
      @js.native
      def showArrow: Boolean = js.native
      inline def showArrow_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showArrow")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/helper/helper", "Helper.defaultProps.triggerType")
      @js.native
      def triggerType: js.UndefOr[click | hover] = js.native
      inline def triggerType_=(x: js.UndefOr[click | hover]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("triggerType")(x.asInstanceOf[js.Any])
    }
  }
}
