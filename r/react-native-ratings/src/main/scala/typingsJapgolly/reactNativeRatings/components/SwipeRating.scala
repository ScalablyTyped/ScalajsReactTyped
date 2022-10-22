package typingsJapgolly.reactNativeRatings.components

import typingsJapgolly.reactNativeRatings.distSwipeRatingMod.SwipeRatingProps
import typingsJapgolly.reactNativeRatings.distSwipeRatingMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SwipeRating {
  
  @JSImport("react-native-ratings/dist/SwipeRating", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: SwipeRating.type): SharedBuilder_SwipeRatingProps10262915[default] = new SharedBuilder_SwipeRatingProps10262915[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SwipeRatingProps): SharedBuilder_SwipeRatingProps10262915[default] = new SharedBuilder_SwipeRatingProps10262915[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
