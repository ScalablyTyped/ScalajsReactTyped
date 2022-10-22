package typingsJapgolly.reactNativeRatings.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_TapRatingProps_528061035 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def count(value: Double): this.type = set("count", value.asInstanceOf[js.Any])
  
  inline def defaultRating(value: Double): this.type = set("defaultRating", value.asInstanceOf[js.Any])
  
  inline def isDisabled(value: Boolean): this.type = set("isDisabled", value.asInstanceOf[js.Any])
  
  inline def onFinishRating(value: /* number */ Any => Callback): this.type = set("onFinishRating", js.Any.fromFunction1((t0: /* number */ Any) => value(t0).runNow()))
  
  inline def ratingContainerStyle(value: StyleProp[ViewStyle]): this.type = set("ratingContainerStyle", value.asInstanceOf[js.Any])
  
  inline def ratingContainerStyleNull: this.type = set("ratingContainerStyle", null)
  
  inline def reviewColor(value: String): this.type = set("reviewColor", value.asInstanceOf[js.Any])
  
  inline def reviewSize(value: Double): this.type = set("reviewSize", value.asInstanceOf[js.Any])
  
  inline def reviews(value: js.Array[String]): this.type = set("reviews", value.asInstanceOf[js.Any])
  
  inline def reviewsVarargs(value: String*): this.type = set("reviews", js.Array(value*))
  
  inline def selectedColor(value: String): this.type = set("selectedColor", value.asInstanceOf[js.Any])
  
  inline def showRating(value: Boolean): this.type = set("showRating", value.asInstanceOf[js.Any])
  
  inline def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
  
  inline def starContainerStyle(value: StyleProp[ViewStyle]): this.type = set("starContainerStyle", value.asInstanceOf[js.Any])
  
  inline def starContainerStyleNull: this.type = set("starContainerStyle", null)
  
  inline def starImage(value: String): this.type = set("starImage", value.asInstanceOf[js.Any])
}
