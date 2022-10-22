package typingsJapgolly.reactInstantsearchDom.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactInstantsearchDom.mod.HitsPerPageProps
import typingsJapgolly.reactInstantsearchDom.mod.RefinementItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HitsPerPage {
  
  inline def apply(defaultRefinement: Double, items: js.Array[RefinementItem[Double]]): Builder = {
    val __props = js.Dynamic.literal(defaultRefinement = defaultRefinement.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[HitsPerPageProps]))
  }
  
  @JSImport("react-instantsearch-dom", "HitsPerPage")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactInstantsearchDom.mod.HitsPerPage] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def transformItems(value: /* items */ js.Array[RefinementItem[Double]] => js.Array[RefinementItem[Double]]): this.type = set("transformItems", js.Any.fromFunction1(value))
  }
  
  def withProps(p: HitsPerPageProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
