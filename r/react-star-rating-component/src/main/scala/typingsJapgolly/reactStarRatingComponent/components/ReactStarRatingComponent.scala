package typingsJapgolly.reactStarRatingComponent.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactStarRatingComponent.mod.StarRatingComponentProps
import typingsJapgolly.reactStarRatingComponent.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactStarRatingComponent {
  
  inline def apply(name: String, value: Double): Builder = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[StarRatingComponentProps]))
  }
  
  @JSImport("react-star-rating-component", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[^] {
    
    inline def editing(value: Boolean): this.type = set("editing", value.asInstanceOf[js.Any])
    
    inline def emptyStarColor(value: String): this.type = set("emptyStarColor", value.asInstanceOf[js.Any])
    
    inline def onStarClick(value: (/* nextValue */ Double, /* prevValue */ Double, /* name */ String) => Callback): this.type = set("onStarClick", js.Any.fromFunction3((t0: /* nextValue */ Double, t1: /* prevValue */ Double, t2: /* name */ String) => (value(t0, t1, t2)).runNow()))
    
    inline def onStarHover(value: (/* nextValue */ Double, /* prevValue */ Double, /* name */ String) => Callback): this.type = set("onStarHover", js.Any.fromFunction3((t0: /* nextValue */ Double, t1: /* prevValue */ Double, t2: /* name */ String) => (value(t0, t1, t2)).runNow()))
    
    inline def onStarHoverOut(value: (/* nextValue */ Double, /* prevValue */ Double, /* name */ String) => Callback): this.type = set("onStarHoverOut", js.Any.fromFunction3((t0: /* nextValue */ Double, t1: /* prevValue */ Double, t2: /* name */ String) => (value(t0, t1, t2)).runNow()))
    
    inline def renderStarIcon(value: (/* nextValue */ Double, /* prevValue */ Double, /* name */ String) => Node | String): this.type = set("renderStarIcon", js.Any.fromFunction3(value))
    
    inline def renderStarIconHalf(value: (/* nextValue */ Double, /* prevValue */ Double, /* name */ String) => Node | String): this.type = set("renderStarIconHalf", js.Any.fromFunction3(value))
    
    inline def starColor(value: String): this.type = set("starColor", value.asInstanceOf[js.Any])
    
    inline def starCount(value: Double): this.type = set("starCount", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StarRatingComponentProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
