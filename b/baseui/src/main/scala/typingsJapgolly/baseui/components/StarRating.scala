package typingsJapgolly.baseui.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.anon.ValueNumber
import typingsJapgolly.baseui.ratingTypesMod.RatingOverrides
import typingsJapgolly.baseui.ratingTypesMod.StarRatingProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StarRating {
  
  inline def apply(numItems: Double): Builder = {
    val __props = js.Dynamic.literal(numItems = numItems.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[StarRatingProps]))
  }
  
  @JSImport("baseui/rating", "StarRating")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.baseui.ratingMod.StarRating] {
    
    inline def onChange(value: /* a */ ValueNumber => Any): this.type = set("onChange", js.Any.fromFunction1(value))
    
    inline def overrides(value: RatingOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    inline def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StarRatingProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
