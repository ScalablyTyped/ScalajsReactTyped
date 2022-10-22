package typingsJapgolly.reactNativeOnboardingSwiper.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNative.mod.FlatListProps
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeOnboardingSwiper.mod.DoneButtonProps
import typingsJapgolly.reactNativeOnboardingSwiper.mod.DotProps
import typingsJapgolly.reactNativeOnboardingSwiper.mod.NextButtonProps
import typingsJapgolly.reactNativeOnboardingSwiper.mod.Page
import typingsJapgolly.reactNativeOnboardingSwiper.mod.Props
import typingsJapgolly.reactNativeOnboardingSwiper.mod.SkipButtonProps
import typingsJapgolly.reactNativeOnboardingSwiper.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeOnboardingSwiper {
  
  inline def apply(pages: js.Array[Page]): Builder = {
    val __props = js.Dynamic.literal(pages = pages.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-native-onboarding-swiper", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def DoneButtonComponent(value: FC[DoneButtonProps]): this.type = set("DoneButtonComponent", value.asInstanceOf[js.Any])
    
    inline def DotComponent(value: FC[DotProps]): this.type = set("DotComponent", value.asInstanceOf[js.Any])
    
    inline def NextButtonComponent(value: FC[NextButtonProps]): this.type = set("NextButtonComponent", value.asInstanceOf[js.Any])
    
    inline def SkipButtonComponent(value: FC[SkipButtonProps]): this.type = set("SkipButtonComponent", value.asInstanceOf[js.Any])
    
    inline def allowFontScaling(value: Boolean): this.type = set("allowFontScaling", value.asInstanceOf[js.Any])
    
    inline def bottomBarColor(value: String): this.type = set("bottomBarColor", value.asInstanceOf[js.Any])
    
    inline def bottomBarHeight(value: Double): this.type = set("bottomBarHeight", value.asInstanceOf[js.Any])
    
    inline def bottomBarHighlight(value: Boolean): this.type = set("bottomBarHighlight", value.asInstanceOf[js.Any])
    
    inline def containerStyles(value: StyleProp[ViewStyle]): this.type = set("containerStyles", value.asInstanceOf[js.Any])
    
    inline def containerStylesNull: this.type = set("containerStyles", null)
    
    inline def controlStatusBar(value: Boolean): this.type = set("controlStatusBar", value.asInstanceOf[js.Any])
    
    inline def flatlistProps(value: FlatListProps[Page]): this.type = set("flatlistProps", value.asInstanceOf[js.Any])
    
    inline def imageContainerStyles(value: StyleProp[ViewStyle]): this.type = set("imageContainerStyles", value.asInstanceOf[js.Any])
    
    inline def imageContainerStylesNull: this.type = set("imageContainerStyles", null)
    
    inline def nextLabel(value: String | Element): this.type = set("nextLabel", value.asInstanceOf[js.Any])
    
    inline def nextLabelVdomElement(value: VdomElement): this.type = set("nextLabel", value.rawElement.asInstanceOf[js.Any])
    
    inline def onDone(value: CallbackTo[Any]): this.type = set("onDone", value.toJsFn)
    
    inline def onSkip(value: CallbackTo[Any]): this.type = set("onSkip", value.toJsFn)
    
    inline def pageIndexCallback(value: /* pageIndex */ Double => Any): this.type = set("pageIndexCallback", js.Any.fromFunction1(value))
    
    inline def showDone(value: Boolean): this.type = set("showDone", value.asInstanceOf[js.Any])
    
    inline def showNext(value: Boolean): this.type = set("showNext", value.asInstanceOf[js.Any])
    
    inline def showPagination(value: Boolean): this.type = set("showPagination", value.asInstanceOf[js.Any])
    
    inline def showSkip(value: Boolean): this.type = set("showSkip", value.asInstanceOf[js.Any])
    
    inline def skipLabel(value: String | Element): this.type = set("skipLabel", value.asInstanceOf[js.Any])
    
    inline def skipLabelVdomElement(value: VdomElement): this.type = set("skipLabel", value.rawElement.asInstanceOf[js.Any])
    
    inline def skipToPage(value: Double): this.type = set("skipToPage", value.asInstanceOf[js.Any])
    
    inline def subTitleStyles(value: StyleProp[TextStyle]): this.type = set("subTitleStyles", value.asInstanceOf[js.Any])
    
    inline def subTitleStylesNull: this.type = set("subTitleStyles", null)
    
    inline def titleStyles(value: StyleProp[TextStyle]): this.type = set("titleStyles", value.asInstanceOf[js.Any])
    
    inline def titleStylesNull: this.type = set("titleStyles", null)
    
    inline def transitionAnimationDuration(value: Double): this.type = set("transitionAnimationDuration", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
