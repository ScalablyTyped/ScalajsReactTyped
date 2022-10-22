package typingsJapgolly.semanticUiReact.components

import typingsJapgolly.semanticUiReact.distCommonjsModulesSearchSearchResultMod.SearchResultProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SearchResult {
  
  inline def apply(title: String): SharedBuilder_SearchResultProps_1847840980[typingsJapgolly.semanticUiReact.mod.SearchResult] = {
    val __props = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    new SharedBuilder_SearchResultProps_1847840980[typingsJapgolly.semanticUiReact.mod.SearchResult](js.Array(this.component, __props.asInstanceOf[SearchResultProps]))
  }
  
  @JSImport("semantic-ui-react", "SearchResult")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: SearchResultProps): SharedBuilder_SearchResultProps_1847840980[typingsJapgolly.semanticUiReact.mod.SearchResult] = new SharedBuilder_SearchResultProps_1847840980[typingsJapgolly.semanticUiReact.mod.SearchResult](js.Array(this.component, p.asInstanceOf[js.Any]))
}
