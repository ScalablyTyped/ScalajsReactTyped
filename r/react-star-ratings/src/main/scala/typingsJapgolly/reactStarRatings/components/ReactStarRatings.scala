package typingsJapgolly.reactStarRatings.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactStarRatings.mod.StarRatingProps
import typingsJapgolly.reactStarRatings.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactStarRatings {
  
  @JSImport("react-star-ratings", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[^] {
    
    inline def changeRating(value: /* rating */ Double => Callback): this.type = set("changeRating", js.Any.fromFunction1((t0: /* rating */ Double) => value(t0).runNow()))
    
    inline def gradientPathName(value: String): this.type = set("gradientPathName", value.asInstanceOf[js.Any])
    
    inline def ignoreInlineStyles(value: Boolean): this.type = set("ignoreInlineStyles", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def numberOfStars(value: Double): this.type = set("numberOfStars", value.asInstanceOf[js.Any])
    
    inline def rating(value: Double): this.type = set("rating", value.asInstanceOf[js.Any])
    
    inline def starDimension(value: String): this.type = set("starDimension", value.asInstanceOf[js.Any])
    
    inline def starEmptyColor(value: String): this.type = set("starEmptyColor", value.asInstanceOf[js.Any])
    
    inline def starHoverColor(value: String): this.type = set("starHoverColor", value.asInstanceOf[js.Any])
    
    inline def starRatedColor(value: String): this.type = set("starRatedColor", value.asInstanceOf[js.Any])
    
    inline def starSpacing(value: String): this.type = set("starSpacing", value.asInstanceOf[js.Any])
    
    inline def svgIconPath(value: String): this.type = set("svgIconPath", value.asInstanceOf[js.Any])
    
    inline def svgIconViewBox(value: String): this.type = set("svgIconViewBox", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactStarRatings.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: StarRatingProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
