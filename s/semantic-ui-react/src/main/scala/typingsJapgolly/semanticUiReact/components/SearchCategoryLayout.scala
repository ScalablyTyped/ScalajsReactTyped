package typingsJapgolly.semanticUiReact.components

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.semanticUiReact.distCommonjsModulesSearchSearchCategoryLayoutMod.SearchCategoryLayoutProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SearchCategoryLayout {
  
  inline def apply(categoryContent: VdomElement, resultsContent: VdomElement): Default[js.Object] = {
    val __props = js.Dynamic.literal(categoryContent = categoryContent.rawElement.asInstanceOf[js.Any], resultsContent = resultsContent.rawElement.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[SearchCategoryLayoutProps]))
  }
  
  @JSImport("semantic-ui-react/dist/commonjs/modules/Search/SearchCategoryLayout", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: SearchCategoryLayoutProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
