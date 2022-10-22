package typingsJapgolly.reactNativeStarRating.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.ImageURISource
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeStarRating.mod.StarRatingProps
import typingsJapgolly.reactNativeStarRating.mod.default
import typingsJapgolly.reactNativeStarRating.reactNativeStarRatingStrings.bounce
import typingsJapgolly.reactNativeStarRating.reactNativeStarRatingStrings.flash
import typingsJapgolly.reactNativeStarRating.reactNativeStarRatingStrings.jello
import typingsJapgolly.reactNativeStarRating.reactNativeStarRatingStrings.pulse
import typingsJapgolly.reactNativeStarRating.reactNativeStarRatingStrings.rotate
import typingsJapgolly.reactNativeStarRating.reactNativeStarRatingStrings.rubberBand
import typingsJapgolly.reactNativeStarRating.reactNativeStarRatingStrings.shake
import typingsJapgolly.reactNativeStarRating.reactNativeStarRatingStrings.swing
import typingsJapgolly.reactNativeStarRating.reactNativeStarRatingStrings.tada
import typingsJapgolly.reactNativeStarRating.reactNativeStarRatingStrings.wobble
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeStarRating {
  
  @JSImport("react-native-star-rating", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def activeOpacity(value: Double): this.type = set("activeOpacity", value.asInstanceOf[js.Any])
    
    inline def animation(value: bounce | flash | jello | pulse | rotate | rubberBand | shake | swing | tada | wobble): this.type = set("animation", value.asInstanceOf[js.Any])
    
    inline def buttonStyle(value: StyleProp[ViewStyle]): this.type = set("buttonStyle", value.asInstanceOf[js.Any])
    
    inline def buttonStyleNull: this.type = set("buttonStyle", null)
    
    inline def containerStyle(value: StyleProp[ViewStyle]): this.type = set("containerStyle", value.asInstanceOf[js.Any])
    
    inline def containerStyleNull: this.type = set("containerStyle", null)
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def emptyStar(value: String | ImageURISource): this.type = set("emptyStar", value.asInstanceOf[js.Any])
    
    inline def emptyStarColor(value: String): this.type = set("emptyStarColor", value.asInstanceOf[js.Any])
    
    inline def fullStar(value: String | ImageURISource): this.type = set("fullStar", value.asInstanceOf[js.Any])
    
    inline def fullStarColor(value: String): this.type = set("fullStarColor", value.asInstanceOf[js.Any])
    
    inline def halfStar(value: String | ImageURISource): this.type = set("halfStar", value.asInstanceOf[js.Any])
    
    inline def halfStarColor(value: String): this.type = set("halfStarColor", value.asInstanceOf[js.Any])
    
    inline def halfStarEnabled(value: Boolean): this.type = set("halfStarEnabled", value.asInstanceOf[js.Any])
    
    inline def iconSet(value: String): this.type = set("iconSet", value.asInstanceOf[js.Any])
    
    inline def maxStars(value: Double): this.type = set("maxStars", value.asInstanceOf[js.Any])
    
    inline def rating(value: Double): this.type = set("rating", value.asInstanceOf[js.Any])
    
    inline def reversed(value: Boolean): this.type = set("reversed", value.asInstanceOf[js.Any])
    
    inline def selectedStar(value: /* rating */ Double => Callback): this.type = set("selectedStar", js.Any.fromFunction1((t0: /* rating */ Double) => value(t0).runNow()))
    
    inline def starSize(value: Double): this.type = set("starSize", value.asInstanceOf[js.Any])
    
    inline def starStyle(value: StyleProp[ViewStyle]): this.type = set("starStyle", value.asInstanceOf[js.Any])
    
    inline def starStyleNull: this.type = set("starStyle", null)
  }
  
  implicit def make(companion: ReactNativeStarRating.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: StarRatingProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
