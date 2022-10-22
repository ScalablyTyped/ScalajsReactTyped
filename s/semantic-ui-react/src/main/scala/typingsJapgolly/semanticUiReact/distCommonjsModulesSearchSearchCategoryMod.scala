package typingsJapgolly.semanticUiReact

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.FC
import typingsJapgolly.semanticUiReact.anon.PickSearchCategoryLayoutP
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsJapgolly.semanticUiReact.distCommonjsModulesSearchSearchResultMod.SearchResultProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsModulesSearchSearchCategoryMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/modules/Search/SearchCategory", JSImport.Default)
  @js.native
  val default: FC[SearchCategoryProps] = js.native
  
  trait SearchCategoryProps
    extends StObject
       with StrictSearchCategoryProps
       with /* key */ StringDictionary[Any]
  object SearchCategoryProps {
    
    inline def apply(): SearchCategoryProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchCategoryProps]
    }
  }
  
  trait StrictSearchCategoryProps extends StObject {
    
    /** The item currently selected by keyboard shortcut. */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[Node] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /**
      * Renders the SearchCategory layout.
      *
      * @param {object} props - The SearchCategoryLayout props object.
      * @returns {*} - Renderable SearchCategory layout.
      */
    var layoutRenderer: js.UndefOr[js.Function1[/* props */ PickSearchCategoryLayoutP, Element]] = js.undefined
    
    /** Display name. */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Renders the category contents.
      *
      * @param {object} props - The SearchCategory props object.
      * @returns {*} - Renderable category contents.
      */
    var renderer: js.UndefOr[js.Function1[/* props */ SearchCategoryProps, Element]] = js.undefined
    
    /** Array of Search.Result props. */
    var results: js.UndefOr[js.Array[ComponentClassP[SearchResultProps & js.Object]]] = js.undefined
  }
  object StrictSearchCategoryProps {
    
    inline def apply(): StrictSearchCategoryProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictSearchCategoryProps]
    }
    
    extension [Self <: StrictSearchCategoryProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
      
      inline def setLayoutRenderer(value: /* props */ PickSearchCategoryLayoutP => Element): Self = StObject.set(x, "layoutRenderer", js.Any.fromFunction1(value))
      
      inline def setLayoutRendererUndefined: Self = StObject.set(x, "layoutRenderer", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRenderer(value: /* props */ SearchCategoryProps => Element): Self = StObject.set(x, "renderer", js.Any.fromFunction1(value))
      
      inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      
      inline def setResults(value: js.Array[ComponentClassP[SearchResultProps & js.Object]]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      inline def setResultsVarargs(value: (ComponentClassP[SearchResultProps & js.Object])*): Self = StObject.set(x, "results", js.Array(value*))
    }
  }
  
  type _To = FC[SearchCategoryProps]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsModulesSearchSearchCategoryMod.foo` */
  override def _to: FC[SearchCategoryProps] = default
}
