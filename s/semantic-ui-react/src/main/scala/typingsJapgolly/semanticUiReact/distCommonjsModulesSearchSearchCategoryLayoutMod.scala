package typingsJapgolly.semanticUiReact

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsModulesSearchSearchCategoryLayoutMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/modules/Search/SearchCategoryLayout", JSImport.Default)
  @js.native
  val default: FC[SearchCategoryLayoutProps] = js.native
  
  trait SearchCategoryLayoutProps
    extends StObject
       with StrictSearchCategoryLayoutProps
       with /* key */ StringDictionary[Any]
  object SearchCategoryLayoutProps {
    
    inline def apply(categoryContent: VdomElement, resultsContent: VdomElement): SearchCategoryLayoutProps = {
      val __obj = js.Dynamic.literal(categoryContent = categoryContent.rawElement.asInstanceOf[js.Any], resultsContent = resultsContent.rawElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchCategoryLayoutProps]
    }
  }
  
  trait StrictSearchCategoryLayoutProps extends StObject {
    
    /** The rendered category content */
    var categoryContent: Element
    
    /** The rendered results content */
    var resultsContent: Element
  }
  object StrictSearchCategoryLayoutProps {
    
    inline def apply(categoryContent: VdomElement, resultsContent: VdomElement): StrictSearchCategoryLayoutProps = {
      val __obj = js.Dynamic.literal(categoryContent = categoryContent.rawElement.asInstanceOf[js.Any], resultsContent = resultsContent.rawElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrictSearchCategoryLayoutProps]
    }
    
    extension [Self <: StrictSearchCategoryLayoutProps](x: Self) {
      
      inline def setCategoryContent(value: VdomElement): Self = StObject.set(x, "categoryContent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setResultsContent(value: VdomElement): Self = StObject.set(x, "resultsContent", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  type _To = FC[SearchCategoryLayoutProps]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsModulesSearchSearchCategoryLayoutMod.foo` */
  override def _to: FC[SearchCategoryLayoutProps] = default
}
