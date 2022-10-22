package typingsJapgolly.reactNativeRatings

import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.reactNativeRatings.anon.ImageSize
import typingsJapgolly.reactNativeRatings.distSwipeRatingMod.default
import typingsJapgolly.reactNativeRatings.distTapRatingMod.TapRatingProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-ratings", "AirbnbRating")
  @js.native
  val AirbnbRating: FunctionComponent[TapRatingProps] = js.native
  
  @JSImport("react-native-ratings", "Rating")
  @js.native
  open class Rating protected () extends default {
    def this(props: Any) = this()
  }
  /* static members */
  object Rating {
    
    @JSImport("react-native-ratings", "Rating")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-ratings", "Rating.defaultProps")
    @js.native
    def defaultProps: ImageSize = js.native
    inline def defaultProps_=(x: ImageSize): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
