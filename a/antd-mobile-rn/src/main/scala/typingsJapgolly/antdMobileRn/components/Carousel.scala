package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antdMobileRn.libCarouselIndexDotnativeMod.CarouselProps
import typingsJapgolly.antdMobileRn.libCarouselIndexDotnativeMod.CarouselState
import typingsJapgolly.antdMobileRn.libCarouselIndexDotnativeMod.PaginationProps
import typingsJapgolly.reactNative.mod.NativeScrollEvent
import typingsJapgolly.reactNative.mod.NativeSyntheticEvent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Carousel {
  
  @JSImport("antd-mobile-rn", "Carousel")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.antdMobileRn.mod.Carousel] {
    
    inline def afterChange(value: /* index */ Double => Callback): this.type = set("afterChange", js.Any.fromFunction1((t0: /* index */ Double) => value(t0).runNow()))
    
    inline def autoplay(value: Boolean): this.type = set("autoplay", value.asInstanceOf[js.Any])
    
    inline def autoplayInterval(value: Double): this.type = set("autoplayInterval", value.asInstanceOf[js.Any])
    
    inline def bounces(value: Boolean): this.type = set("bounces", value.asInstanceOf[js.Any])
    
    inline def dotActiveStyle(value: StyleProp[ViewStyle]): this.type = set("dotActiveStyle", value.asInstanceOf[js.Any])
    
    inline def dotActiveStyleNull: this.type = set("dotActiveStyle", null)
    
    inline def dotStyle(value: StyleProp[ViewStyle]): this.type = set("dotStyle", value.asInstanceOf[js.Any])
    
    inline def dotStyleNull: this.type = set("dotStyle", null)
    
    inline def dots(value: Boolean): this.type = set("dots", value.asInstanceOf[js.Any])
    
    inline def infinite(value: Boolean): this.type = set("infinite", value.asInstanceOf[js.Any])
    
    inline def initialSlideWidth(value: Double): this.type = set("initialSlideWidth", value.asInstanceOf[js.Any])
    
    inline def onMomentumScrollEnd(
      value: (/* event */ NativeSyntheticEvent[NativeScrollEvent], /* state */ CarouselState, /* carousel */ typingsJapgolly.antdMobileRn.libCarouselIndexDotnativeMod.Carousel) => Callback
    ): this.type = set("onMomentumScrollEnd", js.Any.fromFunction3((t0: /* event */ NativeSyntheticEvent[NativeScrollEvent], t1: /* state */ CarouselState, t2: /* carousel */ typingsJapgolly.antdMobileRn.libCarouselIndexDotnativeMod.Carousel) => (value(t0, t1, t2)).runNow()))
    
    inline def onScrollBeginDrag(
      value: (/* event */ NativeSyntheticEvent[NativeScrollEvent], /* state */ CarouselState, /* carousel */ typingsJapgolly.antdMobileRn.libCarouselIndexDotnativeMod.Carousel) => Callback
    ): this.type = set("onScrollBeginDrag", js.Any.fromFunction3((t0: /* event */ NativeSyntheticEvent[NativeScrollEvent], t1: /* state */ CarouselState, t2: /* carousel */ typingsJapgolly.antdMobileRn.libCarouselIndexDotnativeMod.Carousel) => (value(t0, t1, t2)).runNow()))
    
    inline def pagination(value: /* props */ PaginationProps => Node): this.type = set("pagination", js.Any.fromFunction1(value))
    
    inline def selectedIndex(value: Double): this.type = set("selectedIndex", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def styles(value: Any): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def vertical(value: Boolean): this.type = set("vertical", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Carousel.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CarouselProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
