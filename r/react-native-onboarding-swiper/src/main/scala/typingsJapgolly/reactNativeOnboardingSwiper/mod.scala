package typingsJapgolly.reactNativeOnboardingSwiper

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNative.mod.FlatList
import typingsJapgolly.reactNative.mod.FlatListProps
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-onboarding-swiper", JSImport.Default)
  @js.native
  open class default () extends Onboarding
  
  trait DoneButtonProps extends StObject {
    
    var allowFontScaling: Boolean
    
    var isLight: Boolean
    
    def onPress(): Any
  }
  object DoneButtonProps {
    
    inline def apply(allowFontScaling: Boolean, isLight: Boolean, onPress: CallbackTo[Any]): DoneButtonProps = {
      val __obj = js.Dynamic.literal(allowFontScaling = allowFontScaling.asInstanceOf[js.Any], isLight = isLight.asInstanceOf[js.Any], onPress = onPress.toJsFn)
      __obj.asInstanceOf[DoneButtonProps]
    }
    
    extension [Self <: DoneButtonProps](x: Self) {
      
      inline def setAllowFontScaling(value: Boolean): Self = StObject.set(x, "allowFontScaling", value.asInstanceOf[js.Any])
      
      inline def setIsLight(value: Boolean): Self = StObject.set(x, "isLight", value.asInstanceOf[js.Any])
      
      inline def setOnPress(value: CallbackTo[Any]): Self = StObject.set(x, "onPress", value.toJsFn)
    }
  }
  
  trait DotProps extends StObject {
    
    var isLight: Boolean
    
    var selected: Boolean
  }
  object DotProps {
    
    inline def apply(isLight: Boolean, selected: Boolean): DotProps = {
      val __obj = js.Dynamic.literal(isLight = isLight.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[DotProps]
    }
    
    extension [Self <: DotProps](x: Self) {
      
      inline def setIsLight(value: Boolean): Self = StObject.set(x, "isLight", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
  
  trait NextButtonProps extends StObject {
    
    var allowFontScaling: Boolean
    
    var isLight: Boolean
    
    var nextLabel: String | Element
    
    def onPress(): Any
  }
  object NextButtonProps {
    
    inline def apply(allowFontScaling: Boolean, isLight: Boolean, nextLabel: String | Element, onPress: CallbackTo[Any]): NextButtonProps = {
      val __obj = js.Dynamic.literal(allowFontScaling = allowFontScaling.asInstanceOf[js.Any], isLight = isLight.asInstanceOf[js.Any], nextLabel = nextLabel.asInstanceOf[js.Any], onPress = onPress.toJsFn)
      __obj.asInstanceOf[NextButtonProps]
    }
    
    extension [Self <: NextButtonProps](x: Self) {
      
      inline def setAllowFontScaling(value: Boolean): Self = StObject.set(x, "allowFontScaling", value.asInstanceOf[js.Any])
      
      inline def setIsLight(value: Boolean): Self = StObject.set(x, "isLight", value.asInstanceOf[js.Any])
      
      inline def setNextLabel(value: String | Element): Self = StObject.set(x, "nextLabel", value.asInstanceOf[js.Any])
      
      inline def setNextLabelVdomElement(value: VdomElement): Self = StObject.set(x, "nextLabel", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnPress(value: CallbackTo[Any]): Self = StObject.set(x, "onPress", value.toJsFn)
    }
  }
  
  @js.native
  trait Onboarding
    extends Component[Props, js.Object, Any] {
    
    var flatList: js.UndefOr[FlatList[Any]] = js.native
    
    def goNext(): Unit = js.native
  }
  
  trait Page extends StObject {
    
    /**
      * A background color. The color of the font and dots adapts to the background color.
      */
    var backgroundColor: String
    
    /**
      * A component (e.g. <Image />) to display at the top of the page.
      */
    var image: Element
    
    /**
      * Modify styles of a specific page's subtitle.
      */
    var subTitleStyles: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    /**
      * A string OR a React-Native component.
      */
    var subtitle: String | Element
    
    /**
      * A string OR a React-Native component.
      */
    var title: String | Element
    
    // INDIVIDUAL PAGE STYLES
    /**
      * Modify styles of a specific page's title.
      */
    var titleStyles: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  }
  object Page {
    
    inline def apply(backgroundColor: String, image: VdomElement, subtitle: String | Element, title: String | Element): Page = {
      val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], image = image.rawElement.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Page]
    }
    
    extension [Self <: Page](x: Self) {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setImage(value: VdomElement): Self = StObject.set(x, "image", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSubTitleStyles(value: StyleProp[TextStyle]): Self = StObject.set(x, "subTitleStyles", value.asInstanceOf[js.Any])
      
      inline def setSubTitleStylesNull: Self = StObject.set(x, "subTitleStyles", null)
      
      inline def setSubTitleStylesUndefined: Self = StObject.set(x, "subTitleStyles", js.undefined)
      
      inline def setSubtitle(value: String | Element): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleVdomElement(value: VdomElement): Self = StObject.set(x, "subtitle", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTitle(value: String | Element): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleStyles(value: StyleProp[TextStyle]): Self = StObject.set(x, "titleStyles", value.asInstanceOf[js.Any])
      
      inline def setTitleStylesNull: Self = StObject.set(x, "titleStyles", null)
      
      inline def setTitleStylesUndefined: Self = StObject.set(x, "titleStyles", js.undefined)
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  trait Props extends StObject {
    
    /**
      * Done Button.
      */
    var DoneButtonComponent: js.UndefOr[FC[DoneButtonProps]] = js.undefined
    
    /**
      * Dot for the pagination, gets selected as prop to indicate the active page.
      */
    var DotComponent: js.UndefOr[FC[DotProps]] = js.undefined
    
    /**
      * Next Button, gets nextLabel as prop.
      */
    var NextButtonComponent: js.UndefOr[FC[NextButtonProps]] = js.undefined
    
    // CUSTOM COMPONENTS
    /**
      * Skip Button, gets skipLabel as prop.
      */
    var SkipButtonComponent: js.UndefOr[FC[SkipButtonProps]] = js.undefined
    
    /**
      * Font scaling can cause troubles with high-resolution screens. You may want to disable it.
      * @default true
      */
    var allowFontScaling: js.UndefOr[Boolean] = js.undefined
    
    /**
      * BackgroundColor of the bottom bar.
      * @default "transparent"
      */
    var bottomBarColor: js.UndefOr[String] = js.undefined
    
    // GENERAL
    /**
      * A number for the height of the bottom bar.
      * @default 60
      */
    var bottomBarHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * A bool flag indicating whether the bottom bar should be highlighted.
      * @default true
      */
    var bottomBarHighlight: js.UndefOr[Boolean] = js.undefined
    
    // DEFAULT PAGE STYLES
    /**
      * Override the default container styles.
      */
    var containerStyles: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    /**
      * A bool flag indicating whether the status bar should change with the background color.
      * @default true
      */
    var controlStatusBar: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Additional props for the FlatList which holds all the pages.
      */
    var flatlistProps: js.UndefOr[FlatListProps[Page]] = js.undefined
    
    /**
      * Override the default image container styles e.g. the paddingBottom of 60.
      */
    var imageContainerStyles: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    // BUTTONS
    /**
      * A string OR a React-Native component for the Next label.
      * @default "Next"
      */
    var nextLabel: js.UndefOr[String | Element] = js.undefined
    
    /**
      * A callback that is fired after the Onboarding is completed.
      */
    var onDone: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /**
      * A callback that is fired if the Onboarding is skipped.
      */
    var onSkip: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /**
      * A function that receives the page index as a parameter on page change. Example Usage.
      */
    var pageIndexCallback: js.UndefOr[js.Function1[/* pageIndex */ Double, Any]] = js.undefined
    
    /**
      * An array of pages in the following shape.
      */
    var pages: js.Array[Page]
    
    /**
      * A bool flag indicating whether the Done checkmark button is visible.
      * @default true
      */
    var showDone: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A bool flag indicating whether the Next button is visible.
      * @default true
      */
    var showNext: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to show the bottom pagination bar.
      * @default true
      */
    var showPagination: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A bool flag indicating whether the Skip button is visible.
      * @default true
      */
    var showSkip: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A string OR a React-Native component for the Skip label.
      * @default "Skip"
      */
    var skipLabel: js.UndefOr[String | Element] = js.undefined
    
    /**
      * When pressing skip, go to that page (e.g. skipToPage={2}). If this prop is provided, ignores onSkip.
      */
    var skipToPage: js.UndefOr[Double] = js.undefined
    
    /**
      * Override the default subtitle styles.
      */
    var subTitleStyles: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    /**
      * Override the default title styles.
      */
    var titleStyles: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    /**
      * The duration in milliseconds for the animation of the background color for the page transition.
      * @default 500
      */
    var transitionAnimationDuration: js.UndefOr[Double] = js.undefined
  }
  object Props {
    
    inline def apply(pages: js.Array[Page]): Props = {
      val __obj = js.Dynamic.literal(pages = pages.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setAllowFontScaling(value: Boolean): Self = StObject.set(x, "allowFontScaling", value.asInstanceOf[js.Any])
      
      inline def setAllowFontScalingUndefined: Self = StObject.set(x, "allowFontScaling", js.undefined)
      
      inline def setBottomBarColor(value: String): Self = StObject.set(x, "bottomBarColor", value.asInstanceOf[js.Any])
      
      inline def setBottomBarColorUndefined: Self = StObject.set(x, "bottomBarColor", js.undefined)
      
      inline def setBottomBarHeight(value: Double): Self = StObject.set(x, "bottomBarHeight", value.asInstanceOf[js.Any])
      
      inline def setBottomBarHeightUndefined: Self = StObject.set(x, "bottomBarHeight", js.undefined)
      
      inline def setBottomBarHighlight(value: Boolean): Self = StObject.set(x, "bottomBarHighlight", value.asInstanceOf[js.Any])
      
      inline def setBottomBarHighlightUndefined: Self = StObject.set(x, "bottomBarHighlight", js.undefined)
      
      inline def setContainerStyles(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyles", value.asInstanceOf[js.Any])
      
      inline def setContainerStylesNull: Self = StObject.set(x, "containerStyles", null)
      
      inline def setContainerStylesUndefined: Self = StObject.set(x, "containerStyles", js.undefined)
      
      inline def setControlStatusBar(value: Boolean): Self = StObject.set(x, "controlStatusBar", value.asInstanceOf[js.Any])
      
      inline def setControlStatusBarUndefined: Self = StObject.set(x, "controlStatusBar", js.undefined)
      
      inline def setDoneButtonComponent(value: FC[DoneButtonProps]): Self = StObject.set(x, "DoneButtonComponent", value.asInstanceOf[js.Any])
      
      inline def setDoneButtonComponentUndefined: Self = StObject.set(x, "DoneButtonComponent", js.undefined)
      
      inline def setDotComponent(value: FC[DotProps]): Self = StObject.set(x, "DotComponent", value.asInstanceOf[js.Any])
      
      inline def setDotComponentUndefined: Self = StObject.set(x, "DotComponent", js.undefined)
      
      inline def setFlatlistProps(value: FlatListProps[Page]): Self = StObject.set(x, "flatlistProps", value.asInstanceOf[js.Any])
      
      inline def setFlatlistPropsUndefined: Self = StObject.set(x, "flatlistProps", js.undefined)
      
      inline def setImageContainerStyles(value: StyleProp[ViewStyle]): Self = StObject.set(x, "imageContainerStyles", value.asInstanceOf[js.Any])
      
      inline def setImageContainerStylesNull: Self = StObject.set(x, "imageContainerStyles", null)
      
      inline def setImageContainerStylesUndefined: Self = StObject.set(x, "imageContainerStyles", js.undefined)
      
      inline def setNextButtonComponent(value: FC[NextButtonProps]): Self = StObject.set(x, "NextButtonComponent", value.asInstanceOf[js.Any])
      
      inline def setNextButtonComponentUndefined: Self = StObject.set(x, "NextButtonComponent", js.undefined)
      
      inline def setNextLabel(value: String | Element): Self = StObject.set(x, "nextLabel", value.asInstanceOf[js.Any])
      
      inline def setNextLabelUndefined: Self = StObject.set(x, "nextLabel", js.undefined)
      
      inline def setNextLabelVdomElement(value: VdomElement): Self = StObject.set(x, "nextLabel", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnDone(value: CallbackTo[Any]): Self = StObject.set(x, "onDone", value.toJsFn)
      
      inline def setOnDoneUndefined: Self = StObject.set(x, "onDone", js.undefined)
      
      inline def setOnSkip(value: CallbackTo[Any]): Self = StObject.set(x, "onSkip", value.toJsFn)
      
      inline def setOnSkipUndefined: Self = StObject.set(x, "onSkip", js.undefined)
      
      inline def setPageIndexCallback(value: /* pageIndex */ Double => Any): Self = StObject.set(x, "pageIndexCallback", js.Any.fromFunction1(value))
      
      inline def setPageIndexCallbackUndefined: Self = StObject.set(x, "pageIndexCallback", js.undefined)
      
      inline def setPages(value: js.Array[Page]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      inline def setPagesVarargs(value: Page*): Self = StObject.set(x, "pages", js.Array(value*))
      
      inline def setShowDone(value: Boolean): Self = StObject.set(x, "showDone", value.asInstanceOf[js.Any])
      
      inline def setShowDoneUndefined: Self = StObject.set(x, "showDone", js.undefined)
      
      inline def setShowNext(value: Boolean): Self = StObject.set(x, "showNext", value.asInstanceOf[js.Any])
      
      inline def setShowNextUndefined: Self = StObject.set(x, "showNext", js.undefined)
      
      inline def setShowPagination(value: Boolean): Self = StObject.set(x, "showPagination", value.asInstanceOf[js.Any])
      
      inline def setShowPaginationUndefined: Self = StObject.set(x, "showPagination", js.undefined)
      
      inline def setShowSkip(value: Boolean): Self = StObject.set(x, "showSkip", value.asInstanceOf[js.Any])
      
      inline def setShowSkipUndefined: Self = StObject.set(x, "showSkip", js.undefined)
      
      inline def setSkipButtonComponent(value: FC[SkipButtonProps]): Self = StObject.set(x, "SkipButtonComponent", value.asInstanceOf[js.Any])
      
      inline def setSkipButtonComponentUndefined: Self = StObject.set(x, "SkipButtonComponent", js.undefined)
      
      inline def setSkipLabel(value: String | Element): Self = StObject.set(x, "skipLabel", value.asInstanceOf[js.Any])
      
      inline def setSkipLabelUndefined: Self = StObject.set(x, "skipLabel", js.undefined)
      
      inline def setSkipLabelVdomElement(value: VdomElement): Self = StObject.set(x, "skipLabel", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSkipToPage(value: Double): Self = StObject.set(x, "skipToPage", value.asInstanceOf[js.Any])
      
      inline def setSkipToPageUndefined: Self = StObject.set(x, "skipToPage", js.undefined)
      
      inline def setSubTitleStyles(value: StyleProp[TextStyle]): Self = StObject.set(x, "subTitleStyles", value.asInstanceOf[js.Any])
      
      inline def setSubTitleStylesNull: Self = StObject.set(x, "subTitleStyles", null)
      
      inline def setSubTitleStylesUndefined: Self = StObject.set(x, "subTitleStyles", js.undefined)
      
      inline def setTitleStyles(value: StyleProp[TextStyle]): Self = StObject.set(x, "titleStyles", value.asInstanceOf[js.Any])
      
      inline def setTitleStylesNull: Self = StObject.set(x, "titleStyles", null)
      
      inline def setTitleStylesUndefined: Self = StObject.set(x, "titleStyles", js.undefined)
      
      inline def setTransitionAnimationDuration(value: Double): Self = StObject.set(x, "transitionAnimationDuration", value.asInstanceOf[js.Any])
      
      inline def setTransitionAnimationDurationUndefined: Self = StObject.set(x, "transitionAnimationDuration", js.undefined)
    }
  }
  
  trait SkipButtonProps extends StObject {
    
    var allowFontScaling: Boolean
    
    var isLight: Boolean
    
    def onPress(): Any
    
    var skipLabel: String | Element
  }
  object SkipButtonProps {
    
    inline def apply(allowFontScaling: Boolean, isLight: Boolean, onPress: CallbackTo[Any], skipLabel: String | Element): SkipButtonProps = {
      val __obj = js.Dynamic.literal(allowFontScaling = allowFontScaling.asInstanceOf[js.Any], isLight = isLight.asInstanceOf[js.Any], onPress = onPress.toJsFn, skipLabel = skipLabel.asInstanceOf[js.Any])
      __obj.asInstanceOf[SkipButtonProps]
    }
    
    extension [Self <: SkipButtonProps](x: Self) {
      
      inline def setAllowFontScaling(value: Boolean): Self = StObject.set(x, "allowFontScaling", value.asInstanceOf[js.Any])
      
      inline def setIsLight(value: Boolean): Self = StObject.set(x, "isLight", value.asInstanceOf[js.Any])
      
      inline def setOnPress(value: CallbackTo[Any]): Self = StObject.set(x, "onPress", value.toJsFn)
      
      inline def setSkipLabel(value: String | Element): Self = StObject.set(x, "skipLabel", value.asInstanceOf[js.Any])
      
      inline def setSkipLabelVdomElement(value: VdomElement): Self = StObject.set(x, "skipLabel", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
