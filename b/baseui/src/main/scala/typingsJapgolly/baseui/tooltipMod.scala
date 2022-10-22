package typingsJapgolly.baseui

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import typingsJapgolly.baseui.anon.OmitPopoverPropschildren
import typingsJapgolly.baseui.baseuiStrings.div
import typingsJapgolly.baseui.layerTypesMod.TetherPlacement
import typingsJapgolly.baseui.popoverTypesMod.AccessibilityType
import typingsJapgolly.baseui.popoverTypesMod.ContentRenderProp
import typingsJapgolly.baseui.popoverTypesMod.PopoverOverrides
import typingsJapgolly.baseui.popoverTypesMod.SharedStylePropsArg
import typingsJapgolly.baseui.popoverTypesMod.State
import typingsJapgolly.baseui.popoverTypesMod.StateReducer
import typingsJapgolly.baseui.popoverTypesMod.StatefulContentRenderProp
import typingsJapgolly.baseui.popoverTypesMod.TriggerType
import typingsJapgolly.baseui.tooltipStatefulTooltipContainerMod.default
import typingsJapgolly.baseui.tooltipTypesMod.StatefulTooltipProps
import typingsJapgolly.std.FocusOptions
import typingsJapgolly.styletronReact.libTypesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipMod {
  
  object ACCESSIBILITY_TYPE {
    
    @JSImport("baseui/tooltip", "ACCESSIBILITY_TYPE.menu")
    @js.native
    val menu: typingsJapgolly.baseui.baseuiStrings.menu = js.native
    
    @JSImport("baseui/tooltip", "ACCESSIBILITY_TYPE.none")
    @js.native
    val none: typingsJapgolly.baseui.baseuiStrings.none = js.native
    
    @JSImport("baseui/tooltip", "ACCESSIBILITY_TYPE.tooltip")
    @js.native
    val tooltip: typingsJapgolly.baseui.baseuiStrings.tooltip = js.native
  }
  
  object PLACEMENT {
    
    @JSImport("baseui/tooltip", "PLACEMENT.auto")
    @js.native
    val auto: typingsJapgolly.baseui.baseuiStrings.auto = js.native
    
    @JSImport("baseui/tooltip", "PLACEMENT.bottom")
    @js.native
    val bottom: typingsJapgolly.baseui.baseuiStrings.bottom = js.native
    
    @JSImport("baseui/tooltip", "PLACEMENT.bottomLeft")
    @js.native
    val bottomLeft: typingsJapgolly.baseui.baseuiStrings.bottomLeft = js.native
    
    @JSImport("baseui/tooltip", "PLACEMENT.bottomRight")
    @js.native
    val bottomRight: typingsJapgolly.baseui.baseuiStrings.bottomRight = js.native
    
    @JSImport("baseui/tooltip", "PLACEMENT.left")
    @js.native
    val left: typingsJapgolly.baseui.baseuiStrings.left = js.native
    
    @JSImport("baseui/tooltip", "PLACEMENT.leftBottom")
    @js.native
    val leftBottom: typingsJapgolly.baseui.baseuiStrings.leftBottom = js.native
    
    @JSImport("baseui/tooltip", "PLACEMENT.leftTop")
    @js.native
    val leftTop: typingsJapgolly.baseui.baseuiStrings.leftTop = js.native
    
    @JSImport("baseui/tooltip", "PLACEMENT.right")
    @js.native
    val right: typingsJapgolly.baseui.baseuiStrings.right = js.native
    
    @JSImport("baseui/tooltip", "PLACEMENT.rightBottom")
    @js.native
    val rightBottom: typingsJapgolly.baseui.baseuiStrings.rightBottom = js.native
    
    @JSImport("baseui/tooltip", "PLACEMENT.rightTop")
    @js.native
    val rightTop: typingsJapgolly.baseui.baseuiStrings.rightTop = js.native
    
    @JSImport("baseui/tooltip", "PLACEMENT.top")
    @js.native
    val top: typingsJapgolly.baseui.baseuiStrings.top = js.native
    
    @JSImport("baseui/tooltip", "PLACEMENT.topLeft")
    @js.native
    val topLeft: typingsJapgolly.baseui.baseuiStrings.topLeft = js.native
    
    @JSImport("baseui/tooltip", "PLACEMENT.topRight")
    @js.native
    val topRight: typingsJapgolly.baseui.baseuiStrings.topRight = js.native
  }
  
  object STATE_CHANGE_TYPE {
    
    @JSImport("baseui/tooltip", "STATE_CHANGE_TYPE.close")
    @js.native
    val close: typingsJapgolly.baseui.baseuiStrings.close = js.native
    
    @JSImport("baseui/tooltip", "STATE_CHANGE_TYPE.open")
    @js.native
    val open: typingsJapgolly.baseui.baseuiStrings.open = js.native
  }
  
  @JSImport("baseui/tooltip", "StatefulContainer")
  @js.native
  open class StatefulContainer () extends default
  object StatefulContainer {
    
    /* static member */
    /* Inlined std.Partial<baseui.baseui/tooltip/types.StatefulTooltipContainerProps> */
    object defaultProps {
      
      @JSImport("baseui/tooltip", "StatefulContainer.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/tooltip", "StatefulContainer.defaultProps.accessibilityType")
      @js.native
      def accessibilityType: js.UndefOr[AccessibilityType] = js.native
      inline def accessibilityType_=(x: js.UndefOr[AccessibilityType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityType")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulContainer.defaultProps.animateOutTime")
      @js.native
      def animateOutTime: js.UndefOr[Double] = js.native
      inline def animateOutTime_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animateOutTime")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulContainer.defaultProps.autoFocus")
      @js.native
      def autoFocus: js.UndefOr[Boolean] = js.native
      inline def autoFocus_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulContainer.defaultProps.children")
      @js.native
      def children: js.UndefOr[js.Function1[/* props */ OmitPopoverPropschildren, Node]] = js.native
      inline def children_=(x: js.UndefOr[js.Function1[/* props */ OmitPopoverPropschildren, Node]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulContainer.defaultProps.content")
      @js.native
      def content: js.UndefOr[Node | StatefulContentRenderProp] = js.native
      inline def content_=(x: js.UndefOr[Node | StatefulContentRenderProp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("content")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulContainer.defaultProps.data-baseweb")
      @js.native
      def dataBaseweb: js.UndefOr[String] = js.native
      
      inline def dataBaseweb_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("data-baseweb")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulContainer.defaultProps.dismissOnClickOutside")
      @js.native
      def dismissOnClickOutside: js.UndefOr[Boolean] = js.native
      inline def dismissOnClickOutside_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dismissOnClickOutside")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulContainer.defaultProps.dismissOnEsc")
      @js.native
      def dismissOnEsc: js.UndefOr[Boolean] = js.native
      inline def dismissOnEsc_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dismissOnEsc")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulContainer.defaultProps.focusLock")
      @js.native
      def focusLock: js.UndefOr[Boolean] = js.native
      inline def focusLock_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("focusLock")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulContainer.defaultProps.focusOptions")
      @js.native
      def focusOptions: js.UndefOr[FocusOptions] = js.native
      inline def focusOptions_=(x: js.UndefOr[FocusOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("focusOptions")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulContainer.defaultProps.id")
      @js.native
      def id: js.UndefOr[String] = js.native
      inline def id_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulContainer.defaultProps.ignoreBoundary")
      @js.native
      def ignoreBoundary: js.UndefOr[Boolean] = js.native
      inline def ignoreBoundary_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ignoreBoundary")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulContainer.defaultProps.initialState")
      @js.native
      def initialState: js.UndefOr[State] = js.native
      inline def initialState_=(x: js.UndefOr[State]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("initialState")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulContainer.defaultProps.mountNode")
      @js.native
      def mountNode: js.UndefOr[HTMLElement] = js.native
      inline def mountNode_=(x: js.UndefOr[HTMLElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mountNode")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulContainer.defaultProps.onBlur")
      @js.native
      def onBlur: js.UndefOr[js.Function1[/* e */ ReactFocusEventFrom[Element], Any]] = js.native
      inline def onBlur_=(x: js.UndefOr[js.Function1[/* e */ ReactFocusEventFrom[Element], Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulContainer.defaultProps.onClick")
      @js.native
      def onClick: js.UndefOr[js.Function1[/* e */ ReactEventFrom[Element], Any]] = js.native
      inline def onClick_=(x: js.UndefOr[js.Function1[/* e */ ReactEventFrom[Element], Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClick")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulContainer.defaultProps.onClose")
      @js.native
      def onClose: js.UndefOr[js.Function0[Any]] = js.native
      inline def onClose_=(x: js.UndefOr[js.Function0[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClose")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulContainer.defaultProps.onFocus")
      @js.native
      def onFocus: js.UndefOr[js.Function1[/* e */ ReactFocusEventFrom[Element], Any]] = js.native
      inline def onFocus_=(x: js.UndefOr[js.Function1[/* e */ ReactFocusEventFrom[Element], Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulContainer.defaultProps.onMouseEnter")
      @js.native
      def onMouseEnter: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[Element], Any]] = js.native
      
      @JSImport("baseui/tooltip", "StatefulContainer.defaultProps.onMouseEnterDelay")
      @js.native
      def onMouseEnterDelay: js.UndefOr[Double] = js.native
      inline def onMouseEnterDelay_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnterDelay")(x.asInstanceOf[js.Any])
      
      inline def onMouseEnter_=(x: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[Element], Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulContainer.defaultProps.onMouseLeave")
      @js.native
      def onMouseLeave: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[Element], Any]] = js.native
      
      @JSImport("baseui/tooltip", "StatefulContainer.defaultProps.onMouseLeaveDelay")
      @js.native
      def onMouseLeaveDelay: js.UndefOr[Double] = js.native
      inline def onMouseLeaveDelay_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeaveDelay")(x.asInstanceOf[js.Any])
      
      inline def onMouseLeave_=(x: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[Element], Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulContainer.defaultProps.onOpen")
      @js.native
      def onOpen: js.UndefOr[js.Function0[Any]] = js.native
      inline def onOpen_=(x: js.UndefOr[js.Function0[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulContainer.defaultProps.overrides")
      @js.native
      def overrides: js.UndefOr[PopoverOverrides] = js.native
      inline def overrides_=(x: js.UndefOr[PopoverOverrides]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overrides")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulContainer.defaultProps.placement")
      @js.native
      def placement: js.UndefOr[TetherPlacement] = js.native
      inline def placement_=(x: js.UndefOr[TetherPlacement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placement")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulContainer.defaultProps.popoverMargin")
      @js.native
      def popoverMargin: js.UndefOr[Double] = js.native
      inline def popoverMargin_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("popoverMargin")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulContainer.defaultProps.popperOptions")
      @js.native
      def popperOptions: js.UndefOr[Any] = js.native
      inline def popperOptions_=(x: js.UndefOr[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("popperOptions")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulContainer.defaultProps.renderAll")
      @js.native
      def renderAll: js.UndefOr[Boolean] = js.native
      inline def renderAll_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderAll")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulContainer.defaultProps.returnFocus")
      @js.native
      def returnFocus: js.UndefOr[
            Boolean | FocusOptions | (js.Function1[/* returnTo */ Element, Boolean | FocusOptions])
          ] = js.native
      inline def returnFocus_=(
        x: js.UndefOr[
              Boolean | FocusOptions | (js.Function1[/* returnTo */ Element, Boolean | FocusOptions])
            ]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("returnFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulContainer.defaultProps.showArrow")
      @js.native
      def showArrow: js.UndefOr[Boolean] = js.native
      inline def showArrow_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showArrow")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulContainer.defaultProps.stateReducer")
      @js.native
      def stateReducer: js.UndefOr[StateReducer] = js.native
      inline def stateReducer_=(x: js.UndefOr[StateReducer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stateReducer")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulContainer.defaultProps.triggerType")
      @js.native
      def triggerType: js.UndefOr[TriggerType] = js.native
      inline def triggerType_=(x: js.UndefOr[TriggerType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("triggerType")(x.asInstanceOf[js.Any])
    }
  }
  
  object StatefulTooltip {
    
    inline def apply(props: StatefulTooltipProps): typingsJapgolly.react.mod.global.JSX.Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.react.mod.global.JSX.Element]
    
    @JSImport("baseui/tooltip", "StatefulTooltip")
    @js.native
    val ^ : js.Any = js.native
    
    /* Inlined std.Partial<baseui.baseui/popover.StatefulPopoverContainerProps> */
    object defaultProps {
      
      @JSImport("baseui/tooltip", "StatefulTooltip.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/tooltip", "StatefulTooltip.defaultProps.accessibilityType")
      @js.native
      def accessibilityType: js.UndefOr[AccessibilityType] = js.native
      inline def accessibilityType_=(x: js.UndefOr[AccessibilityType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityType")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulTooltip.defaultProps.animateOutTime")
      @js.native
      def animateOutTime: js.UndefOr[Double] = js.native
      inline def animateOutTime_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animateOutTime")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulTooltip.defaultProps.autoFocus")
      @js.native
      def autoFocus: js.UndefOr[Boolean] = js.native
      inline def autoFocus_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulTooltip.defaultProps.children")
      @js.native
      def children: js.UndefOr[js.Function1[/* props */ OmitPopoverPropschildren, Node]] = js.native
      inline def children_=(x: js.UndefOr[js.Function1[/* props */ OmitPopoverPropschildren, Node]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulTooltip.defaultProps.content")
      @js.native
      def content: js.UndefOr[Node | StatefulContentRenderProp] = js.native
      inline def content_=(x: js.UndefOr[Node | StatefulContentRenderProp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("content")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulTooltip.defaultProps.data-baseweb")
      @js.native
      def dataBaseweb: js.UndefOr[String] = js.native
      
      inline def dataBaseweb_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("data-baseweb")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulTooltip.defaultProps.dismissOnClickOutside")
      @js.native
      def dismissOnClickOutside: js.UndefOr[Boolean] = js.native
      inline def dismissOnClickOutside_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dismissOnClickOutside")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulTooltip.defaultProps.dismissOnEsc")
      @js.native
      def dismissOnEsc: js.UndefOr[Boolean] = js.native
      inline def dismissOnEsc_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dismissOnEsc")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulTooltip.defaultProps.focusLock")
      @js.native
      def focusLock: js.UndefOr[Boolean] = js.native
      inline def focusLock_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("focusLock")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulTooltip.defaultProps.focusOptions")
      @js.native
      def focusOptions: js.UndefOr[FocusOptions] = js.native
      inline def focusOptions_=(x: js.UndefOr[FocusOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("focusOptions")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulTooltip.defaultProps.id")
      @js.native
      def id: js.UndefOr[String] = js.native
      inline def id_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulTooltip.defaultProps.ignoreBoundary")
      @js.native
      def ignoreBoundary: js.UndefOr[Boolean] = js.native
      inline def ignoreBoundary_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ignoreBoundary")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulTooltip.defaultProps.initialState")
      @js.native
      def initialState: js.UndefOr[State] = js.native
      inline def initialState_=(x: js.UndefOr[State]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("initialState")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulTooltip.defaultProps.mountNode")
      @js.native
      def mountNode: js.UndefOr[HTMLElement] = js.native
      inline def mountNode_=(x: js.UndefOr[HTMLElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mountNode")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulTooltip.defaultProps.onBlur")
      @js.native
      def onBlur: js.UndefOr[js.Function1[/* e */ ReactFocusEventFrom[Element], Any]] = js.native
      inline def onBlur_=(x: js.UndefOr[js.Function1[/* e */ ReactFocusEventFrom[Element], Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulTooltip.defaultProps.onClick")
      @js.native
      def onClick: js.UndefOr[js.Function1[/* e */ ReactEventFrom[Element], Any]] = js.native
      inline def onClick_=(x: js.UndefOr[js.Function1[/* e */ ReactEventFrom[Element], Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClick")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulTooltip.defaultProps.onClose")
      @js.native
      def onClose: js.UndefOr[js.Function0[Any]] = js.native
      inline def onClose_=(x: js.UndefOr[js.Function0[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClose")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulTooltip.defaultProps.onFocus")
      @js.native
      def onFocus: js.UndefOr[js.Function1[/* e */ ReactFocusEventFrom[Element], Any]] = js.native
      inline def onFocus_=(x: js.UndefOr[js.Function1[/* e */ ReactFocusEventFrom[Element], Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulTooltip.defaultProps.onMouseEnter")
      @js.native
      def onMouseEnter: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[Element], Any]] = js.native
      
      @JSImport("baseui/tooltip", "StatefulTooltip.defaultProps.onMouseEnterDelay")
      @js.native
      def onMouseEnterDelay: js.UndefOr[Double] = js.native
      inline def onMouseEnterDelay_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnterDelay")(x.asInstanceOf[js.Any])
      
      inline def onMouseEnter_=(x: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[Element], Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulTooltip.defaultProps.onMouseLeave")
      @js.native
      def onMouseLeave: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[Element], Any]] = js.native
      
      @JSImport("baseui/tooltip", "StatefulTooltip.defaultProps.onMouseLeaveDelay")
      @js.native
      def onMouseLeaveDelay: js.UndefOr[Double] = js.native
      inline def onMouseLeaveDelay_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeaveDelay")(x.asInstanceOf[js.Any])
      
      inline def onMouseLeave_=(x: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[Element], Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulTooltip.defaultProps.onOpen")
      @js.native
      def onOpen: js.UndefOr[js.Function0[Any]] = js.native
      inline def onOpen_=(x: js.UndefOr[js.Function0[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulTooltip.defaultProps.overrides")
      @js.native
      def overrides: js.UndefOr[PopoverOverrides] = js.native
      inline def overrides_=(x: js.UndefOr[PopoverOverrides]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overrides")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulTooltip.defaultProps.placement")
      @js.native
      def placement: js.UndefOr[TetherPlacement] = js.native
      inline def placement_=(x: js.UndefOr[TetherPlacement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placement")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulTooltip.defaultProps.popoverMargin")
      @js.native
      def popoverMargin: js.UndefOr[Double] = js.native
      inline def popoverMargin_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("popoverMargin")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulTooltip.defaultProps.popperOptions")
      @js.native
      def popperOptions: js.UndefOr[Any] = js.native
      inline def popperOptions_=(x: js.UndefOr[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("popperOptions")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulTooltip.defaultProps.renderAll")
      @js.native
      def renderAll: js.UndefOr[Boolean] = js.native
      inline def renderAll_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderAll")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulTooltip.defaultProps.returnFocus")
      @js.native
      def returnFocus: js.UndefOr[
            Boolean | FocusOptions | (js.Function1[/* returnTo */ Element, Boolean | FocusOptions])
          ] = js.native
      inline def returnFocus_=(
        x: js.UndefOr[
              Boolean | FocusOptions | (js.Function1[/* returnTo */ Element, Boolean | FocusOptions])
            ]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("returnFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulTooltip.defaultProps.showArrow")
      @js.native
      def showArrow: js.UndefOr[Boolean] = js.native
      inline def showArrow_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showArrow")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulTooltip.defaultProps.stateReducer")
      @js.native
      def stateReducer: js.UndefOr[StateReducer] = js.native
      inline def stateReducer_=(x: js.UndefOr[StateReducer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stateReducer")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "StatefulTooltip.defaultProps.triggerType")
      @js.native
      def triggerType: js.UndefOr[TriggerType] = js.native
      inline def triggerType_=(x: js.UndefOr[TriggerType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("triggerType")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("baseui/tooltip", "StyledArrow")
  @js.native
  val StyledArrow: StyletronComponent[div, SharedStylePropsArg] = js.native
  
  @JSImport("baseui/tooltip", "StyledBody")
  @js.native
  val StyledBody: StyletronComponent[div, SharedStylePropsArg] = js.native
  
  @JSImport("baseui/tooltip", "StyledInner")
  @js.native
  val StyledInner: StyletronComponent[div, SharedStylePropsArg] = js.native
  
  object TRIGGER_TYPE {
    
    @JSImport("baseui/tooltip", "TRIGGER_TYPE.click")
    @js.native
    val click: typingsJapgolly.baseui.baseuiStrings.click = js.native
    
    @JSImport("baseui/tooltip", "TRIGGER_TYPE.hover")
    @js.native
    val hover: typingsJapgolly.baseui.baseuiStrings.hover = js.native
  }
  
  @JSImport("baseui/tooltip", "Tooltip")
  @js.native
  open class Tooltip ()
    extends typingsJapgolly.baseui.tooltipTooltipMod.default
  object Tooltip {
    
    /* static member */
    /* Inlined std.Partial<baseui.baseui/tooltip/types.TooltipProps> */
    object defaultProps {
      
      @JSImport("baseui/tooltip", "Tooltip.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/tooltip", "Tooltip.defaultProps.accessibilityType")
      @js.native
      def accessibilityType: js.UndefOr[AccessibilityType] = js.native
      inline def accessibilityType_=(x: js.UndefOr[AccessibilityType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityType")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "Tooltip.defaultProps.animateOutTime")
      @js.native
      def animateOutTime: js.UndefOr[Double] = js.native
      inline def animateOutTime_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animateOutTime")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "Tooltip.defaultProps.autoFocus")
      @js.native
      def autoFocus: js.UndefOr[Boolean] = js.native
      inline def autoFocus_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "Tooltip.defaultProps.children")
      @js.native
      def children: js.UndefOr[Node] = js.native
      inline def children_=(x: js.UndefOr[Node]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "Tooltip.defaultProps.content")
      @js.native
      def content: js.UndefOr[Node | ContentRenderProp] = js.native
      inline def content_=(x: js.UndefOr[Node | ContentRenderProp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("content")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "Tooltip.defaultProps.data-baseweb")
      @js.native
      def dataBaseweb: js.UndefOr[String] = js.native
      
      inline def dataBaseweb_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("data-baseweb")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "Tooltip.defaultProps.focusLock")
      @js.native
      def focusLock: js.UndefOr[Boolean] = js.native
      inline def focusLock_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("focusLock")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "Tooltip.defaultProps.focusOptions")
      @js.native
      def focusOptions: js.UndefOr[FocusOptions] = js.native
      inline def focusOptions_=(x: js.UndefOr[FocusOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("focusOptions")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "Tooltip.defaultProps.id")
      @js.native
      def id: js.UndefOr[String] = js.native
      inline def id_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "Tooltip.defaultProps.ignoreBoundary")
      @js.native
      def ignoreBoundary: js.UndefOr[Boolean] = js.native
      inline def ignoreBoundary_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ignoreBoundary")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "Tooltip.defaultProps.isOpen")
      @js.native
      def isOpen: js.UndefOr[Boolean] = js.native
      inline def isOpen_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "Tooltip.defaultProps.mountNode")
      @js.native
      def mountNode: js.UndefOr[HTMLElement] = js.native
      inline def mountNode_=(x: js.UndefOr[HTMLElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mountNode")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "Tooltip.defaultProps.onBlur")
      @js.native
      def onBlur: js.UndefOr[js.Function1[/* e */ ReactFocusEventFrom[Element], Any]] = js.native
      inline def onBlur_=(x: js.UndefOr[js.Function1[/* e */ ReactFocusEventFrom[Element], Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "Tooltip.defaultProps.onClick")
      @js.native
      def onClick: js.UndefOr[js.Function1[/* e */ ReactEventFrom[Element], Any]] = js.native
      
      @JSImport("baseui/tooltip", "Tooltip.defaultProps.onClickOutside")
      @js.native
      def onClickOutside: js.UndefOr[js.Function1[/* event */ MouseEvent, Any]] = js.native
      inline def onClickOutside_=(x: js.UndefOr[js.Function1[/* event */ MouseEvent, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClickOutside")(x.asInstanceOf[js.Any])
      
      inline def onClick_=(x: js.UndefOr[js.Function1[/* e */ ReactEventFrom[Element], Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClick")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "Tooltip.defaultProps.onEsc")
      @js.native
      def onEsc: js.UndefOr[js.Function0[Any]] = js.native
      inline def onEsc_=(x: js.UndefOr[js.Function0[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onEsc")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "Tooltip.defaultProps.onFocus")
      @js.native
      def onFocus: js.UndefOr[js.Function1[/* e */ ReactFocusEventFrom[Element], Any]] = js.native
      inline def onFocus_=(x: js.UndefOr[js.Function1[/* e */ ReactFocusEventFrom[Element], Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "Tooltip.defaultProps.onMouseEnter")
      @js.native
      def onMouseEnter: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[Element], Any]] = js.native
      
      @JSImport("baseui/tooltip", "Tooltip.defaultProps.onMouseEnterDelay")
      @js.native
      def onMouseEnterDelay: js.UndefOr[Double] = js.native
      inline def onMouseEnterDelay_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnterDelay")(x.asInstanceOf[js.Any])
      
      inline def onMouseEnter_=(x: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[Element], Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "Tooltip.defaultProps.onMouseLeave")
      @js.native
      def onMouseLeave: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[Element], Any]] = js.native
      
      @JSImport("baseui/tooltip", "Tooltip.defaultProps.onMouseLeaveDelay")
      @js.native
      def onMouseLeaveDelay: js.UndefOr[Double] = js.native
      inline def onMouseLeaveDelay_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeaveDelay")(x.asInstanceOf[js.Any])
      
      inline def onMouseLeave_=(x: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[Element], Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "Tooltip.defaultProps.overrides")
      @js.native
      def overrides: js.UndefOr[PopoverOverrides] = js.native
      inline def overrides_=(x: js.UndefOr[PopoverOverrides]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overrides")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "Tooltip.defaultProps.placement")
      @js.native
      def placement: js.UndefOr[TetherPlacement] = js.native
      inline def placement_=(x: js.UndefOr[TetherPlacement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placement")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "Tooltip.defaultProps.popoverMargin")
      @js.native
      def popoverMargin: js.UndefOr[Double] = js.native
      inline def popoverMargin_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("popoverMargin")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "Tooltip.defaultProps.popperOptions")
      @js.native
      def popperOptions: js.UndefOr[Any] = js.native
      inline def popperOptions_=(x: js.UndefOr[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("popperOptions")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "Tooltip.defaultProps.renderAll")
      @js.native
      def renderAll: js.UndefOr[Boolean] = js.native
      inline def renderAll_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderAll")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "Tooltip.defaultProps.returnFocus")
      @js.native
      def returnFocus: js.UndefOr[
            Boolean | FocusOptions | (js.Function1[/* returnTo */ Element, Boolean | FocusOptions])
          ] = js.native
      inline def returnFocus_=(
        x: js.UndefOr[
              Boolean | FocusOptions | (js.Function1[/* returnTo */ Element, Boolean | FocusOptions])
            ]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("returnFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "Tooltip.defaultProps.showArrow")
      @js.native
      def showArrow: js.UndefOr[Boolean] = js.native
      inline def showArrow_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showArrow")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip", "Tooltip.defaultProps.triggerType")
      @js.native
      def triggerType: js.UndefOr[TriggerType] = js.native
      inline def triggerType_=(x: js.UndefOr[TriggerType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("triggerType")(x.asInstanceOf[js.Any])
    }
  }
}
