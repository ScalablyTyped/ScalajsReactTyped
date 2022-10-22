package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.wixUiCore.anon.Dictx
import typingsJapgolly.wixUiCore.anon.Dragging
import typingsJapgolly.wixUiCore.anon.Height
import typingsJapgolly.wixUiCore.anon.Left
import typingsJapgolly.wixUiCore.anon.OffsetHeight
import typingsJapgolly.wixUiCore.anon.OffsetLeft
import typingsJapgolly.wixUiCore.anon.OffsetTop
import typingsJapgolly.wixUiCore.anon.PartialSliderProps
import typingsJapgolly.wixUiCore.wixUiCoreStrings.across
import typingsJapgolly.wixUiCore.wixUiCoreStrings.always
import typingsJapgolly.wixUiCore.wixUiCoreStrings.bar
import typingsJapgolly.wixUiCore.wixUiCoreStrings.circle
import typingsJapgolly.wixUiCore.wixUiCoreStrings.count
import typingsJapgolly.wixUiCore.wixUiCoreStrings.dot
import typingsJapgolly.wixUiCore.wixUiCoreStrings.horizontal
import typingsJapgolly.wixUiCore.wixUiCoreStrings.hover
import typingsJapgolly.wixUiCore.wixUiCoreStrings.left
import typingsJapgolly.wixUiCore.wixUiCoreStrings.line
import typingsJapgolly.wixUiCore.wixUiCoreStrings.middle
import typingsJapgolly.wixUiCore.wixUiCoreStrings.none
import typingsJapgolly.wixUiCore.wixUiCoreStrings.normal
import typingsJapgolly.wixUiCore.wixUiCoreStrings.rectangle
import typingsJapgolly.wixUiCore.wixUiCoreStrings.right
import typingsJapgolly.wixUiCore.wixUiCoreStrings.square
import typingsJapgolly.wixUiCore.wixUiCoreStrings.value
import typingsJapgolly.wixUiCore.wixUiCoreStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsSliderSliderMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/slider/Slider", "Slider")
  @js.native
  open class Slider protected () extends PureComponent[SliderProps, SliderState, Any] {
    def this(props: SliderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SliderProps, context: Any) = this()
    
    def blur(): Unit = js.native
    
    def calcDiscreteStepValue(min: Any, max: Any, step: Any, stepType: Any): Any = js.native
    
    def calcThumbCrossPosition(): String = js.native
    
    def calcThumbPosition(): Left | Dictx = js.native
    
    def calcThumbProgressPosition(): String = js.native
    
    def calcTrackFillPosition(): String = js.native
    
    def clamp(`val`: Any, min: Any, max: Any): Double = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MSlider(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MSlider(): Unit = js.native
    
    def floorValue(value: Any): Double = js.native
    def floorValue(value: Any, precision: Double): Double = js.native
    
    def focus(): Unit = js.native
    
    def getInnerDims(): Any = js.native
    
    def getInnerOffsets(): OffsetHeight | OffsetLeft | OffsetTop = js.native
    
    def getSliderLength(): Double = js.native
    
    def getSliderSize(): Double = js.native
    
    def getStartPos(): right | left = js.native
    
    def getStepValue(): Any = js.native
    
    def getThumbSize(): Height = js.native
    
    def getThumbSizeCrossAxis(): Double = js.native
    
    def getThumbSizeMainAxis(): Double = js.native
    
    def handleBlur(): Unit = js.native
    
    def handleChange(value: Any): Unit = js.native
    
    def handleKeyDown(ev: Any): Unit = js.native
    
    def handleMouseDown(): Unit = js.native
    
    def handleMouseMove(ev: Any): Unit = js.native
    
    def handleMouseUp(): Unit = js.native
    
    def handleThumbEnter(): Unit = js.native
    
    def handleThumbLeave(): Unit = js.native
    
    def isContinuous(): Boolean = js.native
    
    def isRtl(): Boolean = js.native
    
    def isShallowEqual(v: Any, o: Any): Boolean = js.native
    
    def isVertical(): Boolean = js.native
    
    def moveThumbByMouse(ev: Any): Unit = js.native
    
    def renderTooltip(): Element = js.native
    
    var root: HTMLDivElement = js.native
    
    def setTrackNode(track: Any): Unit = js.native
    
    def shouldShowTooltip(): Boolean = js.native
    
    @JSName("state")
    var state_Slider: Dragging = js.native
    
    def ticksShown(): Boolean = js.native
    
    var track: HTMLDivElement = js.native
  }
  /* static members */
  object Slider {
    
    @JSImport("wix-ui-core/dist/es/src/components/slider/Slider", "Slider")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/es/src/components/slider/Slider", "Slider.defaultProps")
    @js.native
    def defaultProps: PartialSliderProps = js.native
    inline def defaultProps_=(x: PartialSliderProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/es/src/components/slider/Slider", "Slider.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait SliderProps extends StObject {
    
    var `aria-label`: String
    
    var className: js.UndefOr[String] = js.undefined
    
    /** hook for testing purposes */
    var `data-hook`: js.UndefOr[String] = js.undefined
    
    var dir: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var onBlur: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* x */ Any, Unit]] = js.undefined
    
    var onFocus: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var orientation: js.UndefOr[horizontal | vertical] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var step: js.UndefOr[Double] = js.undefined
    
    var stepType: js.UndefOr[value | count] = js.undefined
    
    var style: js.UndefOr[Style] = js.undefined
    
    var thumbShape: js.UndefOr[circle | square | rectangle | bar] = js.undefined
    
    var tickMarksPosition: js.UndefOr[normal | middle | across] = js.undefined
    
    var tickMarksShape: js.UndefOr[none | line | dot] = js.undefined
    
    var tooltipPosition: js.UndefOr[normal | across] = js.undefined
    
    var tooltipPrefix: js.UndefOr[String] = js.undefined
    
    var tooltipSuffix: js.UndefOr[String] = js.undefined
    
    var tooltipVisibility: js.UndefOr[none | always | hover] = js.undefined
    
    var trackSize: js.UndefOr[Double] = js.undefined
    
    var value: js.UndefOr[Double] = js.undefined
  }
  object SliderProps {
    
    inline def apply(`aria-label`: String): SliderProps = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SliderProps]
    }
    
    extension [Self <: SliderProps](x: Self) {
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def `setData-hook`(value: String): Self = StObject.set(x, "data-hook", value.asInstanceOf[js.Any])
      
      inline def `setData-hookUndefined`: Self = StObject.set(x, "data-hook", js.undefined)
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setOnBlur(value: Callback): Self = StObject.set(x, "onBlur", value.toJsFn)
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: /* x */ Any => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* x */ Any) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnFocus(value: Callback): Self = StObject.set(x, "onFocus", value.toJsFn)
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepType(value: value | count): Self = StObject.set(x, "stepType", value.asInstanceOf[js.Any])
      
      inline def setStepTypeUndefined: Self = StObject.set(x, "stepType", js.undefined)
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setStyle(value: Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setThumbShape(value: circle | square | rectangle | bar): Self = StObject.set(x, "thumbShape", value.asInstanceOf[js.Any])
      
      inline def setThumbShapeUndefined: Self = StObject.set(x, "thumbShape", js.undefined)
      
      inline def setTickMarksPosition(value: normal | middle | across): Self = StObject.set(x, "tickMarksPosition", value.asInstanceOf[js.Any])
      
      inline def setTickMarksPositionUndefined: Self = StObject.set(x, "tickMarksPosition", js.undefined)
      
      inline def setTickMarksShape(value: none | line | dot): Self = StObject.set(x, "tickMarksShape", value.asInstanceOf[js.Any])
      
      inline def setTickMarksShapeUndefined: Self = StObject.set(x, "tickMarksShape", js.undefined)
      
      inline def setTooltipPosition(value: normal | across): Self = StObject.set(x, "tooltipPosition", value.asInstanceOf[js.Any])
      
      inline def setTooltipPositionUndefined: Self = StObject.set(x, "tooltipPosition", js.undefined)
      
      inline def setTooltipPrefix(value: String): Self = StObject.set(x, "tooltipPrefix", value.asInstanceOf[js.Any])
      
      inline def setTooltipPrefixUndefined: Self = StObject.set(x, "tooltipPrefix", js.undefined)
      
      inline def setTooltipSuffix(value: String): Self = StObject.set(x, "tooltipSuffix", value.asInstanceOf[js.Any])
      
      inline def setTooltipSuffixUndefined: Self = StObject.set(x, "tooltipSuffix", js.undefined)
      
      inline def setTooltipVisibility(value: none | always | hover): Self = StObject.set(x, "tooltipVisibility", value.asInstanceOf[js.Any])
      
      inline def setTooltipVisibilityUndefined: Self = StObject.set(x, "tooltipVisibility", js.undefined)
      
      inline def setTrackSize(value: Double): Self = StObject.set(x, "trackSize", value.asInstanceOf[js.Any])
      
      inline def setTrackSizeUndefined: Self = StObject.set(x, "trackSize", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait SliderState extends StObject {
    
    var dragging: Boolean
    
    var inKeyPress: Boolean
    
    var mouseDown: Boolean
    
    var thumbHover: Boolean
  }
  object SliderState {
    
    inline def apply(dragging: Boolean, inKeyPress: Boolean, mouseDown: Boolean, thumbHover: Boolean): SliderState = {
      val __obj = js.Dynamic.literal(dragging = dragging.asInstanceOf[js.Any], inKeyPress = inKeyPress.asInstanceOf[js.Any], mouseDown = mouseDown.asInstanceOf[js.Any], thumbHover = thumbHover.asInstanceOf[js.Any])
      __obj.asInstanceOf[SliderState]
    }
    
    extension [Self <: SliderState](x: Self) {
      
      inline def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
      
      inline def setInKeyPress(value: Boolean): Self = StObject.set(x, "inKeyPress", value.asInstanceOf[js.Any])
      
      inline def setMouseDown(value: Boolean): Self = StObject.set(x, "mouseDown", value.asInstanceOf[js.Any])
      
      inline def setThumbHover(value: Boolean): Self = StObject.set(x, "thumbHover", value.asInstanceOf[js.Any])
    }
  }
  
  trait Style extends StObject {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object Style {
    
    inline def apply(): Style = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Style]
    }
    
    extension [Self <: Style](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
