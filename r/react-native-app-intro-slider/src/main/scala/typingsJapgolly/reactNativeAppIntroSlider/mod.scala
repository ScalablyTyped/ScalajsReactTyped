package typingsJapgolly.reactNativeAppIntroSlider

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNative.mod.FlatList
import typingsJapgolly.reactNative.mod.FlatListProps
import typingsJapgolly.reactNative.mod.GestureResponderEvent
import typingsJapgolly.reactNative.mod.LayoutChangeEvent
import typingsJapgolly.reactNative.mod.ListRenderItemInfo
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeAppIntroSlider.anon.ActiveDotStyle
import typingsJapgolly.reactNativeAppIntroSlider.anon.ActiveIndex
import typingsJapgolly.reactNativeAppIntroSlider.anon.Dimensions
import typingsJapgolly.reactNativeAppIntroSlider.anon.NativeEvent
import typingsJapgolly.reactNativeAppIntroSlider.reactNativeAppIntroSliderBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-app-intro-slider", JSImport.Default)
  @js.native
  open class default[ItemT] () extends AppIntroSlider[ItemT]
  /* static members */
  object default {
    
    @JSImport("react-native-app-intro-slider", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-app-intro-slider", "default.defaultProps")
    @js.native
    def defaultProps: ActiveDotStyle = js.native
    inline def defaultProps_=(x: ActiveDotStyle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait AppIntroSlider[ItemT] extends Component[Props[ItemT], State, Any] {
    
    def _onLayout(hasNativeEvent: LayoutChangeEvent): Unit = js.native
    
    def _onMomentumScrollEnd(e: NativeEvent): Unit = js.native
    
    def _renderButton(name: String, label: String): Element = js.native
    def _renderButton(name: String, label: String, onPress: js.Function0[Unit]): Element = js.native
    def _renderButton(name: String, label: String, onPress: js.Function0[Unit], render: js.Function0[Node]): Element = js.native
    def _renderButton(name: String, label: String, onPress: Unit, render: js.Function0[Node]): Element = js.native
    
    def _renderDefaultButton(name: String, label: String): Element = js.native
    
    def _renderDoneButton(): `false` | Element = js.native
    
    def _renderItem(flatListArgs: Any): Element = js.native
    
    def _renderNextButton(): `false` | Element = js.native
    
    def _renderOuterButton(content: Node, name: String): Element = js.native
    def _renderOuterButton(content: Node, name: String, onPress: js.Function1[/* e */ GestureResponderEvent, Unit]): Element = js.native
    
    def _renderPagination(): Element = js.native
    
    def _renderPrevButton(): `false` | Element = js.native
    
    def _renderSkipButton(): `false` | Element = js.native
    
    def _rtlSafeIndex(i: Double): Double = js.native
    
    var flatList: js.UndefOr[FlatList[ItemT]] = js.native
    
    def getListRef(): js.UndefOr[FlatList[ItemT]] = js.native
    
    def goToSlide(pageNum: Double): Unit = js.native
    def goToSlide(pageNum: Double, triggerOnSlideChange: Boolean): Unit = js.native
    
    @JSName("state")
    var state_AppIntroSlider: ActiveIndex = js.native
  }
  
  trait Props[ItemT]
    extends StObject
       with FlatListProps[ItemT] {
    
    var activeDotStyle: ViewStyle
    
    var bottomButton: Boolean
    
    @JSName("data")
    var data_Props: js.Array[ItemT]
    
    var doneLabel: String
    
    var dotClickEnabled: Boolean
    
    var dotStyle: ViewStyle
    
    var nextLabel: String
    
    var onDone: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onSkip: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onSlideChange: js.UndefOr[js.Function2[/* a */ Double, /* b */ Double, Unit]] = js.undefined
    
    var prevLabel: String
    
    var renderDoneButton: js.UndefOr[js.Function0[Node]] = js.undefined
    
    @JSName("renderItem")
    def renderItem_MProps(info: ListRenderItemInfo[ItemT] & Dimensions): Node
    
    var renderNextButton: js.UndefOr[js.Function0[Node]] = js.undefined
    
    var renderPagination: js.UndefOr[js.Function1[/* activeIndex */ Double, Node]] = js.undefined
    
    var renderPrevButton: js.UndefOr[js.Function0[Node]] = js.undefined
    
    var renderSkipButton: js.UndefOr[js.Function0[Node]] = js.undefined
    
    var showDoneButton: Boolean
    
    var showNextButton: Boolean
    
    var showPrevButton: Boolean
    
    var showSkipButton: Boolean
    
    var skipLabel: String
  }
  object Props {
    
    inline def apply[ItemT](
      activeDotStyle: ViewStyle,
      bottomButton: Boolean,
      data: js.Array[ItemT],
      doneLabel: String,
      dotClickEnabled: Boolean,
      dotStyle: ViewStyle,
      nextLabel: String,
      prevLabel: String,
      renderItem: ListRenderItemInfo[ItemT] & Dimensions => Node,
      showDoneButton: Boolean,
      showNextButton: Boolean,
      showPrevButton: Boolean,
      showSkipButton: Boolean,
      skipLabel: String
    ): Props[ItemT] = {
      val __obj = js.Dynamic.literal(activeDotStyle = activeDotStyle.asInstanceOf[js.Any], bottomButton = bottomButton.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], doneLabel = doneLabel.asInstanceOf[js.Any], dotClickEnabled = dotClickEnabled.asInstanceOf[js.Any], dotStyle = dotStyle.asInstanceOf[js.Any], nextLabel = nextLabel.asInstanceOf[js.Any], prevLabel = prevLabel.asInstanceOf[js.Any], renderItem = js.Any.fromFunction1(renderItem), showDoneButton = showDoneButton.asInstanceOf[js.Any], showNextButton = showNextButton.asInstanceOf[js.Any], showPrevButton = showPrevButton.asInstanceOf[js.Any], showSkipButton = showSkipButton.asInstanceOf[js.Any], skipLabel = skipLabel.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props[ItemT]]
    }
    
    extension [Self <: Props[?], ItemT](x: Self & Props[ItemT]) {
      
      inline def setActiveDotStyle(value: ViewStyle): Self = StObject.set(x, "activeDotStyle", value.asInstanceOf[js.Any])
      
      inline def setBottomButton(value: Boolean): Self = StObject.set(x, "bottomButton", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Array[ItemT]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: ItemT*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDoneLabel(value: String): Self = StObject.set(x, "doneLabel", value.asInstanceOf[js.Any])
      
      inline def setDotClickEnabled(value: Boolean): Self = StObject.set(x, "dotClickEnabled", value.asInstanceOf[js.Any])
      
      inline def setDotStyle(value: ViewStyle): Self = StObject.set(x, "dotStyle", value.asInstanceOf[js.Any])
      
      inline def setNextLabel(value: String): Self = StObject.set(x, "nextLabel", value.asInstanceOf[js.Any])
      
      inline def setOnDone(value: Callback): Self = StObject.set(x, "onDone", value.toJsFn)
      
      inline def setOnDoneUndefined: Self = StObject.set(x, "onDone", js.undefined)
      
      inline def setOnSkip(value: Callback): Self = StObject.set(x, "onSkip", value.toJsFn)
      
      inline def setOnSkipUndefined: Self = StObject.set(x, "onSkip", js.undefined)
      
      inline def setOnSlideChange(value: (/* a */ Double, /* b */ Double) => Callback): Self = StObject.set(x, "onSlideChange", js.Any.fromFunction2((t0: /* a */ Double, t1: /* b */ Double) => (value(t0, t1)).runNow()))
      
      inline def setOnSlideChangeUndefined: Self = StObject.set(x, "onSlideChange", js.undefined)
      
      inline def setPrevLabel(value: String): Self = StObject.set(x, "prevLabel", value.asInstanceOf[js.Any])
      
      inline def setRenderDoneButton(value: CallbackTo[Node]): Self = StObject.set(x, "renderDoneButton", value.toJsFn)
      
      inline def setRenderDoneButtonUndefined: Self = StObject.set(x, "renderDoneButton", js.undefined)
      
      inline def setRenderItem(value: ListRenderItemInfo[ItemT] & Dimensions => Node): Self = StObject.set(x, "renderItem", js.Any.fromFunction1(value))
      
      inline def setRenderNextButton(value: CallbackTo[Node]): Self = StObject.set(x, "renderNextButton", value.toJsFn)
      
      inline def setRenderNextButtonUndefined: Self = StObject.set(x, "renderNextButton", js.undefined)
      
      inline def setRenderPagination(value: /* activeIndex */ Double => Node): Self = StObject.set(x, "renderPagination", js.Any.fromFunction1(value))
      
      inline def setRenderPaginationUndefined: Self = StObject.set(x, "renderPagination", js.undefined)
      
      inline def setRenderPrevButton(value: CallbackTo[Node]): Self = StObject.set(x, "renderPrevButton", value.toJsFn)
      
      inline def setRenderPrevButtonUndefined: Self = StObject.set(x, "renderPrevButton", js.undefined)
      
      inline def setRenderSkipButton(value: CallbackTo[Node]): Self = StObject.set(x, "renderSkipButton", value.toJsFn)
      
      inline def setRenderSkipButtonUndefined: Self = StObject.set(x, "renderSkipButton", js.undefined)
      
      inline def setShowDoneButton(value: Boolean): Self = StObject.set(x, "showDoneButton", value.asInstanceOf[js.Any])
      
      inline def setShowNextButton(value: Boolean): Self = StObject.set(x, "showNextButton", value.asInstanceOf[js.Any])
      
      inline def setShowPrevButton(value: Boolean): Self = StObject.set(x, "showPrevButton", value.asInstanceOf[js.Any])
      
      inline def setShowSkipButton(value: Boolean): Self = StObject.set(x, "showSkipButton", value.asInstanceOf[js.Any])
      
      inline def setSkipLabel(value: String): Self = StObject.set(x, "skipLabel", value.asInstanceOf[js.Any])
    }
  }
  
  trait State extends StObject {
    
    var activeIndex: Double
    
    var height: Double
    
    var width: Double
  }
  object State {
    
    inline def apply(activeIndex: Double, height: Double, width: Double): State = {
      val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
