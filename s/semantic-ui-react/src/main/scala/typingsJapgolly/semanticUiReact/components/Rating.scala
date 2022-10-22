package typingsJapgolly.semanticUiReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.semanticUiReact.distCommonjsModulesRatingRatingIconMod.RatingIconProps
import typingsJapgolly.semanticUiReact.distCommonjsModulesRatingRatingMod.RatingProps
import typingsJapgolly.semanticUiReact.mod.Rating.IconCls
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.auto
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.heart
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.huge
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.large
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.massive
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.mini
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.small
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.star
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.tiny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Rating {
  
  object Icon {
    
    @JSImport("semantic-ui-react", "Rating.Icon")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Icon.type): SharedBuilder_RatingIconProps_1213113030[IconCls] = new SharedBuilder_RatingIconProps_1213113030[IconCls](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: RatingIconProps): SharedBuilder_RatingIconProps_1213113030[IconCls] = new SharedBuilder_RatingIconProps_1213113030[IconCls](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("semantic-ui-react", "Rating")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.semanticUiReact.mod.Rating] {
    
    inline def as(value: Any): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def clearable(value: Boolean | auto): this.type = set("clearable", value.asInstanceOf[js.Any])
    
    inline def defaultRating(value: Double | String): this.type = set("defaultRating", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def icon(value: star | heart): this.type = set("icon", value.asInstanceOf[js.Any])
    
    inline def maxRating(value: Double | String): this.type = set("maxRating", value.asInstanceOf[js.Any])
    
    inline def onRate(value: (/* event */ ReactMouseEventFrom[HTMLDivElement], /* data */ RatingProps) => Callback): this.type = set("onRate", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLDivElement], t1: /* data */ RatingProps) => (value(t0, t1)).runNow()))
    
    inline def rating(value: Double | String): this.type = set("rating", value.asInstanceOf[js.Any])
    
    inline def size(value: mini | tiny | small | large | huge | massive): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Rating.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RatingProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
