package typingsJapgolly.baseui

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.baseui.layerTypesMod.TetherPlacement
import typingsJapgolly.baseui.popoverTypesMod.AccessibilityType
import typingsJapgolly.baseui.popoverTypesMod.PopoverOverrides
import typingsJapgolly.baseui.popoverTypesMod.TriggerType
import typingsJapgolly.std.FocusOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipDefaultPropsMod {
  
  /* Inlined std.Partial<baseui.baseui/tooltip/types.BaseTooltipProps> */
  object default {
    
    @JSImport("baseui/tooltip/default-props", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/tooltip/default-props", "default.accessibilityType")
    @js.native
    def accessibilityType: js.UndefOr[AccessibilityType] = js.native
    inline def accessibilityType_=(x: js.UndefOr[AccessibilityType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityType")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/tooltip/default-props", "default.animateOutTime")
    @js.native
    def animateOutTime: js.UndefOr[Double] = js.native
    inline def animateOutTime_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animateOutTime")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/tooltip/default-props", "default.autoFocus")
    @js.native
    def autoFocus: js.UndefOr[Boolean] = js.native
    inline def autoFocus_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/tooltip/default-props", "default.data-baseweb")
    @js.native
    def dataBaseweb: js.UndefOr[String] = js.native
    
    inline def dataBaseweb_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("data-baseweb")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/tooltip/default-props", "default.focusLock")
    @js.native
    def focusLock: js.UndefOr[Boolean] = js.native
    inline def focusLock_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("focusLock")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/tooltip/default-props", "default.focusOptions")
    @js.native
    def focusOptions: js.UndefOr[FocusOptions] = js.native
    inline def focusOptions_=(x: js.UndefOr[FocusOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("focusOptions")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/tooltip/default-props", "default.id")
    @js.native
    def id: js.UndefOr[String] = js.native
    inline def id_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/tooltip/default-props", "default.ignoreBoundary")
    @js.native
    def ignoreBoundary: js.UndefOr[Boolean] = js.native
    inline def ignoreBoundary_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ignoreBoundary")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/tooltip/default-props", "default.mountNode")
    @js.native
    def mountNode: js.UndefOr[HTMLElement] = js.native
    inline def mountNode_=(x: js.UndefOr[HTMLElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mountNode")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/tooltip/default-props", "default.onBlur")
    @js.native
    def onBlur: js.UndefOr[js.Function1[/* e */ ReactFocusEventFrom[Element], Any]] = js.native
    inline def onBlur_=(x: js.UndefOr[js.Function1[/* e */ ReactFocusEventFrom[Element], Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/tooltip/default-props", "default.onClick")
    @js.native
    def onClick: js.UndefOr[js.Function1[/* e */ ReactEventFrom[Element], Any]] = js.native
    inline def onClick_=(x: js.UndefOr[js.Function1[/* e */ ReactEventFrom[Element], Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClick")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/tooltip/default-props", "default.onFocus")
    @js.native
    def onFocus: js.UndefOr[js.Function1[/* e */ ReactFocusEventFrom[Element], Any]] = js.native
    inline def onFocus_=(x: js.UndefOr[js.Function1[/* e */ ReactFocusEventFrom[Element], Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/tooltip/default-props", "default.onMouseEnter")
    @js.native
    def onMouseEnter: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[Element], Any]] = js.native
    
    @JSImport("baseui/tooltip/default-props", "default.onMouseEnterDelay")
    @js.native
    def onMouseEnterDelay: js.UndefOr[Double] = js.native
    inline def onMouseEnterDelay_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnterDelay")(x.asInstanceOf[js.Any])
    
    inline def onMouseEnter_=(x: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[Element], Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/tooltip/default-props", "default.onMouseLeave")
    @js.native
    def onMouseLeave: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[Element], Any]] = js.native
    
    @JSImport("baseui/tooltip/default-props", "default.onMouseLeaveDelay")
    @js.native
    def onMouseLeaveDelay: js.UndefOr[Double] = js.native
    inline def onMouseLeaveDelay_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeaveDelay")(x.asInstanceOf[js.Any])
    
    inline def onMouseLeave_=(x: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[Element], Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/tooltip/default-props", "default.overrides")
    @js.native
    def overrides: js.UndefOr[PopoverOverrides] = js.native
    inline def overrides_=(x: js.UndefOr[PopoverOverrides]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overrides")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/tooltip/default-props", "default.placement")
    @js.native
    def placement: js.UndefOr[TetherPlacement] = js.native
    inline def placement_=(x: js.UndefOr[TetherPlacement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placement")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/tooltip/default-props", "default.popoverMargin")
    @js.native
    def popoverMargin: js.UndefOr[Double] = js.native
    inline def popoverMargin_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("popoverMargin")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/tooltip/default-props", "default.popperOptions")
    @js.native
    def popperOptions: js.UndefOr[Any] = js.native
    inline def popperOptions_=(x: js.UndefOr[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("popperOptions")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/tooltip/default-props", "default.renderAll")
    @js.native
    def renderAll: js.UndefOr[Boolean] = js.native
    inline def renderAll_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderAll")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/tooltip/default-props", "default.returnFocus")
    @js.native
    def returnFocus: js.UndefOr[
        Boolean | FocusOptions | (js.Function1[/* returnTo */ Element, Boolean | FocusOptions])
      ] = js.native
    inline def returnFocus_=(
      x: js.UndefOr[
          Boolean | FocusOptions | (js.Function1[/* returnTo */ Element, Boolean | FocusOptions])
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("returnFocus")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/tooltip/default-props", "default.showArrow")
    @js.native
    def showArrow: js.UndefOr[Boolean] = js.native
    inline def showArrow_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showArrow")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/tooltip/default-props", "default.triggerType")
    @js.native
    def triggerType: js.UndefOr[TriggerType] = js.native
    inline def triggerType_=(x: js.UndefOr[TriggerType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("triggerType")(x.asInstanceOf[js.Any])
  }
}
