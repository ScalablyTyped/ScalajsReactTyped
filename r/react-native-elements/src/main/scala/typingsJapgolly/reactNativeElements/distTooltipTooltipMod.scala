package typingsJapgolly.reactNativeElements

import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNative.mod.ColorValue
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.View
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeElements.anon.Dictx
import typingsJapgolly.reactNativeElements.anon.ElementHeight
import typingsJapgolly.reactNativeElements.anon.PickwithPointerbooleanund
import typingsJapgolly.reactNativeElements.anon.TooltipPropsPartialThemeP
import typingsJapgolly.reactNativeElements.anon.TypeofComponent
import typingsJapgolly.reactNativeElements.anon.withPointerbooleanundefin
import typingsJapgolly.reactNativeElements.reactNativeElementsBooleans.`false`
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.onLongPress
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.onPress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTooltipTooltipMod extends Shortcut {
  
  @JSImport("react-native-elements/dist/tooltip/Tooltip", JSImport.Default)
  @js.native
  val default: FunctionComponent[PickwithPointerbooleanund] | ForwardRefExoticComponent[withPointerbooleanundefin] = js.native
  
  @js.native
  trait Tooltip extends Component[TooltipPropsPartialThemeP, TooltipState, Any] {
    
    var _isMounted: Boolean = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MTooltip(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MTooltip(): Unit = js.native
    
    def containerStyle(withOverlay: Boolean, overlayColor: String): ViewStyle = js.native
    
    def getElementPosition(): Unit = js.native
    
    def getTooltipHighlightedButtonStyle(): ViewStyle = js.native
    
    def getTooltipStyle(): ViewStyle | (`false` & js.Object) | Dictx = js.native
    
    def renderContent(withTooltip: Boolean): js.Object = js.native
    
    def renderHighlightedButton(): Element = js.native
    
    def renderModalContent(): Element = js.native
    
    def renderPointer(): Element = js.native
    def renderPointer(tooltipY: String): Element = js.native
    def renderPointer(tooltipY: Double): Element = js.native
    
    def renderStaticHighlightedButton(): Element = js.native
    
    def renderStaticModalContent(): Element = js.native
    
    def renderTogglingModalContent(): Element = js.native
    
    def renderTouchableHighlightedButton(): Element = js.native
    
    var renderedElement: js.UndefOr[View | Null] = js.native
    
    @JSName("state")
    var state_Tooltip: ElementHeight = js.native
    
    def toggleTooltip(): Unit = js.native
    
    def wrapWithPress(
      toggleOnPress: js.UndefOr[Boolean] & Boolean,
      toggleAction: (js.UndefOr[String | onPress | onLongPress]) & String,
      children: Node
    ): js.Object = js.native
  }
  
  @js.native
  trait TooltipProps extends StObject {
    
    var ModalComponent: js.UndefOr[
        TypeofComponent & (Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
          japgolly.scalajs.react.facade.React.Component[js.Object, js.Object]
        ])
      ] = js.native
    
    var backgroundColor: js.UndefOr[ColorValue] & String = js.native
    
    var closeOnlyOnBackdropPress: js.UndefOr[Boolean] & Boolean = js.native
    
    var containerStyle: js.UndefOr[StyleProp[ViewStyle]] & js.Object = js.native
    
    var height: (js.UndefOr[Double | String]) & Double = js.native
    
    var highlightColor: js.UndefOr[ColorValue] & String = js.native
    
    def onClose(): Unit = js.native
    @JSName("onClose")
    var onClose_FTooltipProps: js.UndefOr[js.Function0[Unit]] = js.native
    
    def onOpen(): Unit = js.native
    @JSName("onOpen")
    var onOpen_FTooltipProps: js.UndefOr[js.Function0[Unit]] = js.native
    
    var overlayColor: js.UndefOr[ColorValue] & String = js.native
    
    var pointerColor: js.UndefOr[ColorValue] = js.native
    
    var popover: js.UndefOr[japgolly.scalajs.react.facade.React.Element] = js.native
    
    var skipAndroidStatusBar: js.UndefOr[Boolean] & Boolean = js.native
    
    var toggleAction: (js.UndefOr[String | onPress | onLongPress]) & String = js.native
    
    var toggleOnPress: js.UndefOr[Boolean] & Boolean = js.native
    
    var width: (js.UndefOr[Double | String]) & Double = js.native
    
    var withOverlay: js.UndefOr[Boolean] & Boolean = js.native
    
    var withPointer: js.UndefOr[Boolean] & Boolean = js.native
  }
  
  trait TooltipState extends StObject {
    
    var elementHeight: Double
    
    var elementWidth: Double
    
    var isVisible: Boolean
    
    var xOffset: Double
    
    var yOffset: Double
  }
  object TooltipState {
    
    inline def apply(elementHeight: Double, elementWidth: Double, isVisible: Boolean, xOffset: Double, yOffset: Double): TooltipState = {
      val __obj = js.Dynamic.literal(elementHeight = elementHeight.asInstanceOf[js.Any], elementWidth = elementWidth.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], xOffset = xOffset.asInstanceOf[js.Any], yOffset = yOffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipState]
    }
    
    extension [Self <: TooltipState](x: Self) {
      
      inline def setElementHeight(value: Double): Self = StObject.set(x, "elementHeight", value.asInstanceOf[js.Any])
      
      inline def setElementWidth(value: Double): Self = StObject.set(x, "elementWidth", value.asInstanceOf[js.Any])
      
      inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
      
      inline def setXOffset(value: Double): Self = StObject.set(x, "xOffset", value.asInstanceOf[js.Any])
      
      inline def setYOffset(value: Double): Self = StObject.set(x, "yOffset", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FunctionComponent[PickwithPointerbooleanund] | ForwardRefExoticComponent[withPointerbooleanundefin]
  
  /* This means you don't have to write `default`, but can instead just say `distTooltipTooltipMod.foo` */
  override def _to: FunctionComponent[PickwithPointerbooleanund] | ForwardRefExoticComponent[withPointerbooleanundefin] = default
}
