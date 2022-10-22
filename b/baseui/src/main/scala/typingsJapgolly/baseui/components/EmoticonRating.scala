package typingsJapgolly.baseui.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.anon.ValueNumber
import typingsJapgolly.baseui.ratingTypesMod.EmoticonRatingProps
import typingsJapgolly.baseui.ratingTypesMod.RatingOverrides
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EmoticonRating {
  
  @JSImport("baseui/rating", "EmoticonRating")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.baseui.ratingMod.EmoticonRating] {
    
    inline def onChange(value: /* a */ ValueNumber => Any): this.type = set("onChange", js.Any.fromFunction1(value))
    
    inline def overrides(value: RatingOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    inline def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: EmoticonRating.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: EmoticonRatingProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
