package typingsJapgolly.reactNativeSnapCarousel.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Component
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.FlatListProps
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeSnapCarousel.mod.PaginationProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Pagination {
  
  inline def apply(activeDotIndex: Double, dotsLength: Double): Builder = {
    val __props = js.Dynamic.literal(activeDotIndex = activeDotIndex.asInstanceOf[js.Any], dotsLength = dotsLength.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PaginationProperties]))
  }
  
  @JSImport("react-native-snap-carousel", "Pagination")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeSnapCarousel.mod.Pagination] {
    
    inline def activeOpacity(value: Double): this.type = set("activeOpacity", value.asInstanceOf[js.Any])
    
    inline def animatedDuration(value: Double): this.type = set("animatedDuration", value.asInstanceOf[js.Any])
    
    inline def animatedFriction(value: Double): this.type = set("animatedFriction", value.asInstanceOf[js.Any])
    
    inline def animatedTension(value: Double): this.type = set("animatedTension", value.asInstanceOf[js.Any])
    
    inline def carouselRef(value: Component[FlatListProps[Any] & js.Object, js.Object]): this.type = set("carouselRef", value.asInstanceOf[js.Any])
    
    inline def containerStyle(value: StyleProp[ViewStyle]): this.type = set("containerStyle", value.asInstanceOf[js.Any])
    
    inline def containerStyleNull: this.type = set("containerStyle", null)
    
    inline def delayPressInDot(value: Double): this.type = set("delayPressInDot", value.asInstanceOf[js.Any])
    
    inline def dotColor(value: String): this.type = set("dotColor", value.asInstanceOf[js.Any])
    
    inline def dotContainerStyle(value: StyleProp[ViewStyle]): this.type = set("dotContainerStyle", value.asInstanceOf[js.Any])
    
    inline def dotContainerStyleNull: this.type = set("dotContainerStyle", null)
    
    inline def dotElement(value: VdomNode): this.type = set("dotElement", value.rawNode.asInstanceOf[js.Any])
    
    inline def dotElementNull: this.type = set("dotElement", null)
    
    inline def dotElementVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("dotElement", js.Array(value*))
    
    inline def dotElementVdomElement(value: VdomElement): this.type = set("dotElement", value.rawElement.asInstanceOf[js.Any])
    
    inline def dotStyle(value: StyleProp[ViewStyle]): this.type = set("dotStyle", value.asInstanceOf[js.Any])
    
    inline def dotStyleNull: this.type = set("dotStyle", null)
    
    inline def inactiveDotColor(value: String): this.type = set("inactiveDotColor", value.asInstanceOf[js.Any])
    
    inline def inactiveDotElement(value: VdomNode): this.type = set("inactiveDotElement", value.rawNode.asInstanceOf[js.Any])
    
    inline def inactiveDotElementNull: this.type = set("inactiveDotElement", null)
    
    inline def inactiveDotElementVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("inactiveDotElement", js.Array(value*))
    
    inline def inactiveDotElementVdomElement(value: VdomElement): this.type = set("inactiveDotElement", value.rawElement.asInstanceOf[js.Any])
    
    inline def inactiveDotOpacity(value: Double): this.type = set("inactiveDotOpacity", value.asInstanceOf[js.Any])
    
    inline def inactiveDotScale(value: Double): this.type = set("inactiveDotScale", value.asInstanceOf[js.Any])
    
    inline def inactiveDotStyle(value: StyleProp[ViewStyle]): this.type = set("inactiveDotStyle", value.asInstanceOf[js.Any])
    
    inline def inactiveDotStyleNull: this.type = set("inactiveDotStyle", null)
    
    inline def renderDots(value: (/* activeIndex */ Double, /* total */ Double, /* context */ Any) => Node): this.type = set("renderDots", js.Any.fromFunction3(value))
    
    inline def tappableDots(value: Boolean): this.type = set("tappableDots", value.asInstanceOf[js.Any])
    
    inline def vertical(value: Boolean): this.type = set("vertical", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PaginationProperties): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
