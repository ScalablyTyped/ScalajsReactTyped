package typingsJapgolly.reactNativeRatings.components

import typingsJapgolly.reactNativeRatings.distSwipeRatingMod.SwipeRatingProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Rating {
  
  @JSImport("react-native-ratings", "Rating")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Rating.type): SharedBuilder_SwipeRatingProps10262915[typingsJapgolly.reactNativeRatings.mod.Rating] = new SharedBuilder_SwipeRatingProps10262915[typingsJapgolly.reactNativeRatings.mod.Rating](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SwipeRatingProps): SharedBuilder_SwipeRatingProps10262915[typingsJapgolly.reactNativeRatings.mod.Rating] = new SharedBuilder_SwipeRatingProps10262915[typingsJapgolly.reactNativeRatings.mod.Rating](js.Array(this.component, p.asInstanceOf[js.Any]))
}
