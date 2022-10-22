package typingsJapgolly.semanticUiReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.ReactNodeArray
import typingsJapgolly.semanticUiReact.anon.PickSearchCategoryLayoutP
import typingsJapgolly.semanticUiReact.distCommonjsElementsInputInputMod.InputProps
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandItem
import typingsJapgolly.semanticUiReact.distCommonjsModulesSearchSearchCategoryMod.SearchCategoryProps
import typingsJapgolly.semanticUiReact.distCommonjsModulesSearchSearchMod.SearchProps
import typingsJapgolly.semanticUiReact.distCommonjsModulesSearchSearchMod.SearchResultData
import typingsJapgolly.semanticUiReact.distCommonjsModulesSearchSearchResultMod.SearchResultProps
import typingsJapgolly.semanticUiReact.distCommonjsModulesSearchSearchResultsMod.SearchResultsProps
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.big
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.huge
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.large
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.massive
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.mini
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.small
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.tiny
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Search {
  
  object Category {
    
    @JSImport("semantic-ui-react", "Search.Category")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Category.type): SharedBuilder_SearchCategoryProps_1382226292 = new SharedBuilder_SearchCategoryProps_1382226292(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: SearchCategoryProps): SharedBuilder_SearchCategoryProps_1382226292 = new SharedBuilder_SearchCategoryProps_1382226292(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Result {
    
    inline def apply(title: String): SharedBuilder_SearchResultProps_1847840980[typingsJapgolly.semanticUiReact.mod.Search.Result] = {
      val __props = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      new SharedBuilder_SearchResultProps_1847840980[typingsJapgolly.semanticUiReact.mod.Search.Result](js.Array(this.component, __props.asInstanceOf[SearchResultProps]))
    }
    
    @JSImport("semantic-ui-react", "Search.Result")
    @js.native
    val component: js.Object = js.native
    
    def withProps(p: SearchResultProps): SharedBuilder_SearchResultProps_1847840980[typingsJapgolly.semanticUiReact.mod.Search.Result] = new SharedBuilder_SearchResultProps_1847840980[typingsJapgolly.semanticUiReact.mod.Search.Result](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Results {
    
    @JSImport("semantic-ui-react", "Search.Results")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Results.type): SharedBuilder_SearchResultsProps_1346928132 = new SharedBuilder_SearchResultsProps_1346928132(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: SearchResultsProps): SharedBuilder_SearchResultsProps_1346928132 = new SharedBuilder_SearchResultsProps_1346928132(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("semantic-ui-react", "Search")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.semanticUiReact.mod.Search] {
    
    inline def aligned(value: String): this.type = set("aligned", value.asInstanceOf[js.Any])
    
    inline def as(value: Any): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def category(value: Boolean): this.type = set("category", value.asInstanceOf[js.Any])
    
    inline def categoryLayoutRenderer(value: /* props */ PickSearchCategoryLayoutP => Element): this.type = set("categoryLayoutRenderer", js.Any.fromFunction1(value))
    
    inline def categoryRenderer(value: /* props */ SearchCategoryProps => Element): this.type = set("categoryRenderer", js.Any.fromFunction1(value))
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def defaultOpen(value: Boolean): this.type = set("defaultOpen", value.asInstanceOf[js.Any])
    
    inline def defaultValue(value: String): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    inline def fluid(value: Boolean): this.type = set("fluid", value.asInstanceOf[js.Any])
    
    inline def icon(value: Any): this.type = set("icon", value.asInstanceOf[js.Any])
    
    inline def input(value: SemanticShorthandItem[InputProps]): this.type = set("input", value.asInstanceOf[js.Any])
    
    inline def inputFunction3(
      value: (/* component */ ElementType, InputProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
    ): this.type = set("input", js.Any.fromFunction3(value))
    
    inline def inputNull: this.type = set("input", null)
    
    inline def inputVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("input", js.Array(value*))
    
    inline def inputVdomElement(value: VdomElement): this.type = set("input", value.rawElement.asInstanceOf[js.Any])
    
    inline def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    
    inline def minCharacters(value: Double): this.type = set("minCharacters", value.asInstanceOf[js.Any])
    
    inline def noResultsDescription(value: VdomNode): this.type = set("noResultsDescription", value.rawNode.asInstanceOf[js.Any])
    
    inline def noResultsDescriptionNull: this.type = set("noResultsDescription", null)
    
    inline def noResultsDescriptionVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("noResultsDescription", js.Array(value*))
    
    inline def noResultsDescriptionVdomElement(value: VdomElement): this.type = set("noResultsDescription", value.rawElement.asInstanceOf[js.Any])
    
    inline def noResultsMessage(value: VdomNode): this.type = set("noResultsMessage", value.rawNode.asInstanceOf[js.Any])
    
    inline def noResultsMessageNull: this.type = set("noResultsMessage", null)
    
    inline def noResultsMessageVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("noResultsMessage", js.Array(value*))
    
    inline def noResultsMessageVdomElement(value: VdomElement): this.type = set("noResultsMessage", value.rawElement.asInstanceOf[js.Any])
    
    inline def onBlur(value: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ SearchProps) => Callback): this.type = set("onBlur", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLElement], t1: /* data */ SearchProps) => (value(t0, t1)).runNow()))
    
    inline def onFocus(value: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ SearchProps) => Callback): this.type = set("onFocus", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLElement], t1: /* data */ SearchProps) => (value(t0, t1)).runNow()))
    
    inline def onMouseDown(value: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ SearchProps) => Callback): this.type = set("onMouseDown", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLElement], t1: /* data */ SearchProps) => (value(t0, t1)).runNow()))
    
    inline def onResultSelect(value: (/* event */ ReactMouseEventFrom[HTMLDivElement], /* data */ SearchResultData) => Callback): this.type = set("onResultSelect", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLDivElement], t1: /* data */ SearchResultData) => (value(t0, t1)).runNow()))
    
    inline def onSearchChange(value: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ SearchProps) => Callback): this.type = set("onSearchChange", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLElement], t1: /* data */ SearchProps) => (value(t0, t1)).runNow()))
    
    inline def onSelectionChange(value: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ SearchResultData) => Callback): this.type = set("onSelectionChange", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLElement], t1: /* data */ SearchResultData) => (value(t0, t1)).runNow()))
    
    inline def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def resultRenderer(value: /* props */ SearchResultProps => Element): this.type = set("resultRenderer", js.Any.fromFunction1(value))
    
    inline def results(value: js.Array[Any] | (Record[String, Any])): this.type = set("results", value.asInstanceOf[js.Any])
    
    inline def resultsVarargs(value: Any*): this.type = set("results", js.Array(value*))
    
    inline def selectFirstResult(value: Boolean): this.type = set("selectFirstResult", value.asInstanceOf[js.Any])
    
    inline def showNoResults(value: Boolean): this.type = set("showNoResults", value.asInstanceOf[js.Any])
    
    inline def size(value: mini | tiny | small | large | big | huge | massive): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Search.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SearchProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
