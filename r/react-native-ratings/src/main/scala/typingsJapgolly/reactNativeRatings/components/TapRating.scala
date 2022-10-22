package typingsJapgolly.reactNativeRatings.components

import typingsJapgolly.reactNativeRatings.distTapRatingMod.TapRatingProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TapRating {
  
  @JSImport("react-native-ratings/dist/TapRating", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: TapRating.type): SharedBuilder_TapRatingProps_528061035 = new SharedBuilder_TapRatingProps_528061035(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TapRatingProps): SharedBuilder_TapRatingProps_528061035 = new SharedBuilder_TapRatingProps_528061035(js.Array(this.component, p.asInstanceOf[js.Any]))
}
