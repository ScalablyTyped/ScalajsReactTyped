package typingsJapgolly.semanticUiReact.mod

import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.react.mod.Component
import typingsJapgolly.semanticUiReact.distCommonjsModulesSearchSearchResultMod.SearchResultProps
import typingsJapgolly.semanticUiReact.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("semantic-ui-react", "SearchResult")
@js.native
open class SearchResult protected ()
  extends Component[SearchResultProps, js.Object, Any] {
  def this(props: SearchResultProps) = this()
  def this(props: SearchResultProps, context: Any) = this()
}
object SearchResult {
  
  inline def apply: ComponentClassP[SearchResultProps & js.Object] = ^.asInstanceOf[js.Dynamic].selectDynamic("SearchResult").asInstanceOf[ComponentClassP[SearchResultProps & js.Object]]
}
