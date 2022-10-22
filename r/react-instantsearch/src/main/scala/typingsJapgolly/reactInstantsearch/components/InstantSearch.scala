package typingsJapgolly.reactInstantsearch.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactInstantsearchCore.mod.InstantSearchProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InstantSearch {
  
  inline def apply(indexName: String, searchClient: Any): Builder = {
    val __props = js.Dynamic.literal(indexName = indexName.asInstanceOf[js.Any], searchClient = searchClient.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[InstantSearchProps]))
  }
  
  @JSImport("react-instantsearch/dom", "InstantSearch")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactInstantsearch.domMod.InstantSearch] {
    
    inline def createURL(value: /* repeated */ Any => Any): this.type = set("createURL", js.Any.fromFunction1(value))
    
    inline def onSearchParameters(value: /* repeated */ Any => Any): this.type = set("onSearchParameters", js.Any.fromFunction1(value))
    
    inline def onSearchStateChange(value: /* repeated */ Any => Any): this.type = set("onSearchStateChange", js.Any.fromFunction1(value))
    
    inline def refresh(value: Boolean): this.type = set("refresh", value.asInstanceOf[js.Any])
    
    inline def resultsState(value: Any): this.type = set("resultsState", value.asInstanceOf[js.Any])
    
    inline def searchState(value: Any): this.type = set("searchState", value.asInstanceOf[js.Any])
    
    inline def stalledSearchDelay(value: Double): this.type = set("stalledSearchDelay", value.asInstanceOf[js.Any])
    
    inline def widgetsCollector(value: /* repeated */ Any => Any): this.type = set("widgetsCollector", js.Any.fromFunction1(value))
  }
  
  def withProps(p: InstantSearchProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
