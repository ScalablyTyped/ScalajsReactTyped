package typingsJapgolly.baseui

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.baseui.ratingTypesMod.RatingState
import typingsJapgolly.baseui.ratingTypesMod.StarRatingProps
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ratingStarRatingMod {
  
  @JSImport("baseui/rating/star-rating", JSImport.Default)
  @js.native
  open class default () extends StarRating
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("baseui/rating/star-rating", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/rating/star-rating", "default.defaultProps.numItems")
      @js.native
      def numItems: Double = js.native
      inline def numItems_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("numItems")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/rating/star-rating", "default.defaultProps.readOnly")
      @js.native
      def readOnly: Boolean = js.native
      inline def readOnly_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StarRating extends Component[StarRatingProps, RatingState, Any] {
    
    def handleBlur(event: ReactEventFrom[Element]): Unit = js.native
    
    def handleFocus(event: ReactEventFrom[Element]): Unit = js.native
    
    def renderRatingContents(): js.Array[Any] = js.native
    
    def selectItem(value: Double): Unit = js.native
    
    def updatePreview(): Unit = js.native
    def updatePreview(previewIndex: Double): Unit = js.native
  }
}
