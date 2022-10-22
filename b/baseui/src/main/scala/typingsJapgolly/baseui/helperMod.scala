package typingsJapgolly.baseui

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLElement
import typingsJapgolly.baseui.baseuiStrings.bottom
import typingsJapgolly.baseui.baseuiStrings.click
import typingsJapgolly.baseui.baseuiStrings.div
import typingsJapgolly.baseui.baseuiStrings.hover
import typingsJapgolly.baseui.baseuiStrings.menu
import typingsJapgolly.baseui.baseuiStrings.none
import typingsJapgolly.baseui.baseuiStrings.tooltip
import typingsJapgolly.baseui.helperTypesMod.HelperStepsProps
import typingsJapgolly.baseui.popoverTypesMod.PopoverOverrides
import typingsJapgolly.baseui.popoverTypesMod.PopoverProps
import typingsJapgolly.baseui.popoverTypesMod.SharedStylePropsArg
import typingsJapgolly.baseui.popoverTypesMod.StatefulPopoverProps
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.FocusOptions
import typingsJapgolly.styletronReact.libTypesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helperMod {
  
  @JSImport("baseui/helper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object ACCESSIBILITY_TYPE {
    
    @JSImport("baseui/helper", "ACCESSIBILITY_TYPE.menu")
    @js.native
    val menu: typingsJapgolly.baseui.baseuiStrings.menu = js.native
    
    @JSImport("baseui/helper", "ACCESSIBILITY_TYPE.none")
    @js.native
    val none: typingsJapgolly.baseui.baseuiStrings.none = js.native
    
    @JSImport("baseui/helper", "ACCESSIBILITY_TYPE.tooltip")
    @js.native
    val tooltip: typingsJapgolly.baseui.baseuiStrings.tooltip = js.native
  }
  
  object PLACEMENT {
    
    @JSImport("baseui/helper", "PLACEMENT.auto")
    @js.native
    val auto: typingsJapgolly.baseui.baseuiStrings.auto = js.native
    
    @JSImport("baseui/helper", "PLACEMENT.bottom")
    @js.native
    val bottom: typingsJapgolly.baseui.baseuiStrings.bottom = js.native
    
    @JSImport("baseui/helper", "PLACEMENT.bottomLeft")
    @js.native
    val bottomLeft: typingsJapgolly.baseui.baseuiStrings.bottomLeft = js.native
    
    @JSImport("baseui/helper", "PLACEMENT.bottomRight")
    @js.native
    val bottomRight: typingsJapgolly.baseui.baseuiStrings.bottomRight = js.native
    
    @JSImport("baseui/helper", "PLACEMENT.left")
    @js.native
    val left: typingsJapgolly.baseui.baseuiStrings.left = js.native
    
    @JSImport("baseui/helper", "PLACEMENT.leftBottom")
    @js.native
    val leftBottom: typingsJapgolly.baseui.baseuiStrings.leftBottom = js.native
    
    @JSImport("baseui/helper", "PLACEMENT.leftTop")
    @js.native
    val leftTop: typingsJapgolly.baseui.baseuiStrings.leftTop = js.native
    
    @JSImport("baseui/helper", "PLACEMENT.right")
    @js.native
    val right: typingsJapgolly.baseui.baseuiStrings.right = js.native
    
    @JSImport("baseui/helper", "PLACEMENT.rightBottom")
    @js.native
    val rightBottom: typingsJapgolly.baseui.baseuiStrings.rightBottom = js.native
    
    @JSImport("baseui/helper", "PLACEMENT.rightTop")
    @js.native
    val rightTop: typingsJapgolly.baseui.baseuiStrings.rightTop = js.native
    
    @JSImport("baseui/helper", "PLACEMENT.top")
    @js.native
    val top: typingsJapgolly.baseui.baseuiStrings.top = js.native
    
    @JSImport("baseui/helper", "PLACEMENT.topLeft")
    @js.native
    val topLeft: typingsJapgolly.baseui.baseuiStrings.topLeft = js.native
    
    @JSImport("baseui/helper", "PLACEMENT.topRight")
    @js.native
    val topRight: typingsJapgolly.baseui.baseuiStrings.topRight = js.native
  }
  
  @JSImport("baseui/helper", "StyledArrow")
  @js.native
  val StyledArrow: StyletronComponent[div, SharedStylePropsArg] = js.native
  
  @JSImport("baseui/helper", "StyledBody")
  @js.native
  val StyledBody: StyletronComponent[div, SharedStylePropsArg] = js.native
  
  object TRIGGER_TYPE {
    
    @JSImport("baseui/helper", "TRIGGER_TYPE.click")
    @js.native
    val click: typingsJapgolly.baseui.baseuiStrings.click = js.native
    
    @JSImport("baseui/helper", "TRIGGER_TYPE.hover")
    @js.native
    val hover: typingsJapgolly.baseui.baseuiStrings.hover = js.native
  }
  
  object UnstableHelper {
    
    inline def apply(props: PopoverProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("baseui/helper", "Unstable_Helper")
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("baseui/helper", "Unstable_Helper.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/helper", "Unstable_Helper.defaultProps.accessibilityType")
      @js.native
      def accessibilityType: js.UndefOr[menu | none | tooltip] = js.native
      inline def accessibilityType_=(x: js.UndefOr[menu | none | tooltip]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityType")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/helper", "Unstable_Helper.defaultProps.animateOutTime")
      @js.native
      def animateOutTime: js.UndefOr[Double] = js.native
      inline def animateOutTime_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animateOutTime")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/helper", "Unstable_Helper.defaultProps.autoFocus")
      @js.native
      def autoFocus: js.UndefOr[Boolean] = js.native
      inline def autoFocus_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/helper", "Unstable_Helper.defaultProps.data-baseweb")
      @js.native
      def dataBaseweb: js.UndefOr[String] = js.native
      
      inline def dataBaseweb_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("data-baseweb")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/helper", "Unstable_Helper.defaultProps.focusLock")
      @js.native
      def focusLock: js.UndefOr[Boolean] = js.native
      inline def focusLock_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("focusLock")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/helper", "Unstable_Helper.defaultProps.focusOptions")
      @js.native
      def focusOptions: js.UndefOr[FocusOptions] = js.native
      inline def focusOptions_=(x: js.UndefOr[FocusOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("focusOptions")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/helper", "Unstable_Helper.defaultProps.id")
      @js.native
      def id: js.UndefOr[String] = js.native
      inline def id_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/helper", "Unstable_Helper.defaultProps.ignoreBoundary")
      @js.native
      def ignoreBoundary: js.UndefOr[Boolean] = js.native
      inline def ignoreBoundary_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ignoreBoundary")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/helper", "Unstable_Helper.defaultProps.mountNode")
      @js.native
      def mountNode: js.UndefOr[HTMLElement] = js.native
      inline def mountNode_=(x: js.UndefOr[HTMLElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mountNode")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/helper", "Unstable_Helper.defaultProps.onBlur")
      @js.native
      def onBlur: js.UndefOr[js.Function1[/* e */ ReactFocusEventFrom[org.scalajs.dom.Element], Any]] = js.native
      inline def onBlur_=(x: js.UndefOr[js.Function1[/* e */ ReactFocusEventFrom[org.scalajs.dom.Element], Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/helper", "Unstable_Helper.defaultProps.onClick")
      @js.native
      def onClick: js.UndefOr[js.Function1[/* e */ ReactEventFrom[org.scalajs.dom.Element], Any]] = js.native
      inline def onClick_=(x: js.UndefOr[js.Function1[/* e */ ReactEventFrom[org.scalajs.dom.Element], Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClick")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/helper", "Unstable_Helper.defaultProps.onFocus")
      @js.native
      def onFocus: js.UndefOr[js.Function1[/* e */ ReactFocusEventFrom[org.scalajs.dom.Element], Any]] = js.native
      inline def onFocus_=(x: js.UndefOr[js.Function1[/* e */ ReactFocusEventFrom[org.scalajs.dom.Element], Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/helper", "Unstable_Helper.defaultProps.onMouseEnter")
      @js.native
      def onMouseEnter: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[org.scalajs.dom.Element], Any]] = js.native
      
      @JSImport("baseui/helper", "Unstable_Helper.defaultProps.onMouseEnterDelay")
      @js.native
      def onMouseEnterDelay: js.UndefOr[Double] = js.native
      inline def onMouseEnterDelay_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnterDelay")(x.asInstanceOf[js.Any])
      
      inline def onMouseEnter_=(x: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[org.scalajs.dom.Element], Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/helper", "Unstable_Helper.defaultProps.onMouseLeave")
      @js.native
      def onMouseLeave: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[org.scalajs.dom.Element], Any]] = js.native
      
      @JSImport("baseui/helper", "Unstable_Helper.defaultProps.onMouseLeaveDelay")
      @js.native
      def onMouseLeaveDelay: js.UndefOr[Double] = js.native
      inline def onMouseLeaveDelay_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeaveDelay")(x.asInstanceOf[js.Any])
      
      inline def onMouseLeave_=(x: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[org.scalajs.dom.Element], Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/helper", "Unstable_Helper.defaultProps.overrides")
      @js.native
      def overrides: js.UndefOr[PopoverOverrides] = js.native
      inline def overrides_=(x: js.UndefOr[PopoverOverrides]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overrides")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/helper", "Unstable_Helper.defaultProps.placement")
      @js.native
      def placement: bottom = js.native
      inline def placement_=(x: bottom): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placement")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/helper", "Unstable_Helper.defaultProps.popoverMargin")
      @js.native
      def popoverMargin: js.UndefOr[Double] = js.native
      inline def popoverMargin_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("popoverMargin")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/helper", "Unstable_Helper.defaultProps.popperOptions")
      @js.native
      def popperOptions: js.UndefOr[Any] = js.native
      inline def popperOptions_=(x: js.UndefOr[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("popperOptions")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/helper", "Unstable_Helper.defaultProps.renderAll")
      @js.native
      def renderAll: js.UndefOr[Boolean] = js.native
      inline def renderAll_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderAll")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/helper", "Unstable_Helper.defaultProps.returnFocus")
      @js.native
      def returnFocus: js.UndefOr[
            Boolean | FocusOptions | (js.Function1[/* returnTo */ org.scalajs.dom.Element, Boolean | FocusOptions])
          ] = js.native
      inline def returnFocus_=(
        x: js.UndefOr[
              Boolean | FocusOptions | (js.Function1[/* returnTo */ org.scalajs.dom.Element, Boolean | FocusOptions])
            ]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("returnFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/helper", "Unstable_Helper.defaultProps.showArrow")
      @js.native
      def showArrow: Boolean = js.native
      inline def showArrow_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showArrow")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/helper", "Unstable_Helper.defaultProps.triggerType")
      @js.native
      def triggerType: js.UndefOr[click | hover] = js.native
      inline def triggerType_=(x: js.UndefOr[click | hover]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("triggerType")(x.asInstanceOf[js.Any])
    }
  }
  
  inline def UnstableHelperSteps(hasIndexLengthOnFinishOnPrevOnNext: HelperStepsProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Unstable_HelperSteps")(hasIndexLengthOnFinishOnPrevOnNext.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  object UnstableStatefulHelper {
    
    inline def apply(props: StatefulPopoverProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("baseui/helper", "Unstable_StatefulHelper")
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("baseui/helper", "Unstable_StatefulHelper.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/helper", "Unstable_StatefulHelper.defaultProps.accessibilityType")
      @js.native
      def accessibilityType: menu = js.native
      inline def accessibilityType_=(x: menu): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityType")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/helper", "Unstable_StatefulHelper.defaultProps.dismissOnClickOutside")
      @js.native
      def dismissOnClickOutside: Boolean = js.native
      inline def dismissOnClickOutside_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dismissOnClickOutside")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/helper", "Unstable_StatefulHelper.defaultProps.dismissOnEsc")
      @js.native
      def dismissOnEsc: Boolean = js.native
      inline def dismissOnEsc_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dismissOnEsc")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/helper", "Unstable_StatefulHelper.defaultProps.ignoreBoundary")
      @js.native
      def ignoreBoundary: Boolean = js.native
      inline def ignoreBoundary_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ignoreBoundary")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/helper", "Unstable_StatefulHelper.defaultProps.onMouseEnterDelay")
      @js.native
      def onMouseEnterDelay: Double = js.native
      inline def onMouseEnterDelay_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnterDelay")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/helper", "Unstable_StatefulHelper.defaultProps.onMouseLeaveDelay")
      @js.native
      def onMouseLeaveDelay: Double = js.native
      inline def onMouseLeaveDelay_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeaveDelay")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/helper", "Unstable_StatefulHelper.defaultProps.placement")
      @js.native
      def placement: bottom = js.native
      inline def placement_=(x: bottom): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placement")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/helper", "Unstable_StatefulHelper.defaultProps.popoverMargin")
      @js.native
      def popoverMargin: Double = js.native
      inline def popoverMargin_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("popoverMargin")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/helper", "Unstable_StatefulHelper.defaultProps.showArrow")
      @js.native
      def showArrow: Boolean = js.native
      inline def showArrow_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showArrow")(x.asInstanceOf[js.Any])
      
      inline def stateReducer(_underscore: Any, nextState: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("stateReducer")(_underscore.asInstanceOf[js.Any], nextState.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      @JSImport("baseui/helper", "Unstable_StatefulHelper.defaultProps.triggerType")
      @js.native
      def triggerType: click = js.native
      inline def triggerType_=(x: click): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("triggerType")(x.asInstanceOf[js.Any])
    }
  }
  
  type HelperStepsPropsT = HelperStepsProps
}
