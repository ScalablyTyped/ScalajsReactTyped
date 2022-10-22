package typingsJapgolly.reactInstantsearch.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactInstantsearchDom.anon.SeeAllOption
import typingsJapgolly.reactInstantsearchDom.mod.MenuSelectProps
import typingsJapgolly.reactInstantsearchDom.mod.RefinementItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MenuSelect {
  
  inline def apply(attribute: String): Builder = {
    val __props = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[MenuSelectProps]))
  }
  
  @JSImport("react-instantsearch/dom", "MenuSelect")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactInstantsearch.domMod.MenuSelect] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def defaultRefinement(value: String): this.type = set("defaultRefinement", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def limit(value: Double): this.type = set("limit", value.asInstanceOf[js.Any])
    
    inline def transformItems(value: /* items */ js.Array[RefinementItem[String]] => js.Array[RefinementItem[String]]): this.type = set("transformItems", js.Any.fromFunction1(value))
    
    inline def translations(value: SeeAllOption): this.type = set("translations", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MenuSelectProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
