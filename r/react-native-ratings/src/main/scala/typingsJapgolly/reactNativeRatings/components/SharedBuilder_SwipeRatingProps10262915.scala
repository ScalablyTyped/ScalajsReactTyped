package typingsJapgolly.reactNativeRatings.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_SwipeRatingProps10262915[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def fractions(value: Any): this.type = set("fractions", value.asInstanceOf[js.Any])
  
  inline def imageSize(value: Double): this.type = set("imageSize", value.asInstanceOf[js.Any])
  
  inline def jumpValue(value: Double): this.type = set("jumpValue", value.asInstanceOf[js.Any])
  
  inline def minValue(value: Double): this.type = set("minValue", value.asInstanceOf[js.Any])
  
  inline def onFinishRating(value: js.Function): this.type = set("onFinishRating", value.asInstanceOf[js.Any])
  
  inline def onStartRating(value: js.Function): this.type = set("onStartRating", value.asInstanceOf[js.Any])
  
  inline def onSwipeRating(value: /* number */ Any => Callback): this.type = set("onSwipeRating", js.Any.fromFunction1((t0: /* number */ Any) => value(t0).runNow()))
  
  inline def ratingBackgroundColor(value: String): this.type = set("ratingBackgroundColor", value.asInstanceOf[js.Any])
  
  inline def ratingColor(value: String): this.type = set("ratingColor", value.asInstanceOf[js.Any])
  
  inline def ratingCount(value: Double): this.type = set("ratingCount", value.asInstanceOf[js.Any])
  
  inline def ratingImage(value: VdomNode): this.type = set("ratingImage", value.rawNode.asInstanceOf[js.Any])
  
  inline def ratingImageNull: this.type = set("ratingImage", null)
  
  inline def ratingImageVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("ratingImage", js.Array(value*))
  
  inline def ratingImageVdomElement(value: VdomElement): this.type = set("ratingImage", value.rawElement.asInstanceOf[js.Any])
  
  inline def ratingTextColor(value: String): this.type = set("ratingTextColor", value.asInstanceOf[js.Any])
  
  inline def readonly(value: Boolean): this.type = set("readonly", value.asInstanceOf[js.Any])
  
  inline def showRating(value: Boolean): this.type = set("showRating", value.asInstanceOf[js.Any])
  
  inline def showReadOnlyText(value: Boolean): this.type = set("showReadOnlyText", value.asInstanceOf[js.Any])
  
  inline def startingValue(value: Double): this.type = set("startingValue", value.asInstanceOf[js.Any])
  
  inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def styleNull: this.type = set("style", null)
  
  inline def tintColor(value: String): this.type = set("tintColor", value.asInstanceOf[js.Any])
  
  inline def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
}
