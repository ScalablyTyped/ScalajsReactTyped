package typingsJapgolly.reactNativeElements.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<react-native-ratings.react-native-ratings.TapRatingProps, 'size' | 'count' | 'reviews' | 'showRating' | 'reviewColor' | 'reviewSize' | 'defaultRating' | 'starContainerStyle' | 'onFinishRating' | 'isDisabled' | 'selectedColor' | 'starImage'> */
trait PickTapRatingPropssizecou extends StObject {
  
  var count: js.UndefOr[Double] = js.undefined
  
  var defaultRating: js.UndefOr[Double] = js.undefined
  
  var isDisabled: js.UndefOr[Boolean] = js.undefined
  
  var onFinishRating: js.UndefOr[js.Function1[/* number */ Any, Unit]] = js.undefined
  
  var reviewColor: js.UndefOr[String] = js.undefined
  
  var reviewSize: js.UndefOr[Double] = js.undefined
  
  var reviews: js.UndefOr[js.Array[String]] = js.undefined
  
  var selectedColor: js.UndefOr[String] = js.undefined
  
  var showRating: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var starContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var starImage: js.UndefOr[String] = js.undefined
}
object PickTapRatingPropssizecou {
  
  inline def apply(): PickTapRatingPropssizecou = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickTapRatingPropssizecou]
  }
  
  extension [Self <: PickTapRatingPropssizecou](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setDefaultRating(value: Double): Self = StObject.set(x, "defaultRating", value.asInstanceOf[js.Any])
    
    inline def setDefaultRatingUndefined: Self = StObject.set(x, "defaultRating", js.undefined)
    
    inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
    
    inline def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
    
    inline def setOnFinishRating(value: /* number */ Any => Callback): Self = StObject.set(x, "onFinishRating", js.Any.fromFunction1((t0: /* number */ Any) => value(t0).runNow()))
    
    inline def setOnFinishRatingUndefined: Self = StObject.set(x, "onFinishRating", js.undefined)
    
    inline def setReviewColor(value: String): Self = StObject.set(x, "reviewColor", value.asInstanceOf[js.Any])
    
    inline def setReviewColorUndefined: Self = StObject.set(x, "reviewColor", js.undefined)
    
    inline def setReviewSize(value: Double): Self = StObject.set(x, "reviewSize", value.asInstanceOf[js.Any])
    
    inline def setReviewSizeUndefined: Self = StObject.set(x, "reviewSize", js.undefined)
    
    inline def setReviews(value: js.Array[String]): Self = StObject.set(x, "reviews", value.asInstanceOf[js.Any])
    
    inline def setReviewsUndefined: Self = StObject.set(x, "reviews", js.undefined)
    
    inline def setReviewsVarargs(value: String*): Self = StObject.set(x, "reviews", js.Array(value*))
    
    inline def setSelectedColor(value: String): Self = StObject.set(x, "selectedColor", value.asInstanceOf[js.Any])
    
    inline def setSelectedColorUndefined: Self = StObject.set(x, "selectedColor", js.undefined)
    
    inline def setShowRating(value: Boolean): Self = StObject.set(x, "showRating", value.asInstanceOf[js.Any])
    
    inline def setShowRatingUndefined: Self = StObject.set(x, "showRating", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStarContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "starContainerStyle", value.asInstanceOf[js.Any])
    
    inline def setStarContainerStyleNull: Self = StObject.set(x, "starContainerStyle", null)
    
    inline def setStarContainerStyleUndefined: Self = StObject.set(x, "starContainerStyle", js.undefined)
    
    inline def setStarImage(value: String): Self = StObject.set(x, "starImage", value.asInstanceOf[js.Any])
    
    inline def setStarImageUndefined: Self = StObject.set(x, "starImage", js.undefined)
  }
}
