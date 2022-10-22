package typingsJapgolly.reactInstantsearch.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactInstantsearchDom.mod.RefinementItem
import typingsJapgolly.reactInstantsearchDom.mod.SortByProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SortBy {
  
  inline def apply(defaultRefinement: String, items: js.Array[RefinementItem[String]]): Builder = {
    val __props = js.Dynamic.literal(defaultRefinement = defaultRefinement.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SortByProps]))
  }
  
  @JSImport("react-instantsearch/dom", "SortBy")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactInstantsearch.domMod.SortBy] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def transformItems(value: /* items */ js.Array[RefinementItem[String]] => js.Array[RefinementItem[String]]): this.type = set("transformItems", js.Any.fromFunction1(value))
  }
  
  def withProps(p: SortByProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
