package typingsJapgolly.semanticUiReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.ReactNodeArray
import typingsJapgolly.semanticUiReact.anon.PickSearchCategoryLayoutP
import typingsJapgolly.semanticUiReact.distCommonjsElementsInputInputMod.InputProps
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandItem
import typingsJapgolly.semanticUiReact.distCommonjsModulesSearchSearchCategoryMod.SearchCategoryProps
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

object distCommonjsModulesSearchSearchMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Search/Search", JSImport.Default)
  @js.native
  open class default protected ()
    extends Component[SearchProps, js.Object, Any] {
    def this(props: SearchProps) = this()
    def this(props: SearchProps, context: Any) = this()
  }
  object default extends Shortcut {
    
    @JSImport("semantic-ui-react/dist/commonjs/modules/Search/Search", JSImport.Default)
    @js.native
    val ^ : SearchComponent = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/modules/Search/Search", "default.Result")
    @js.native
    open class Result protected ()
      extends Component[SearchResultProps, js.Object, Any] {
      def this(props: SearchResultProps) = this()
      def this(props: SearchResultProps, context: Any) = this()
    }
    
    type _To = SearchComponent
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: SearchComponent = ^
  }
  
  @js.native
  trait SearchComponent
    extends StObject
       with ComponentClass[SearchProps, js.Object] {
    
    var Category: FC[SearchCategoryProps] = js.native
    
    var Result: ComponentClassP[SearchResultProps & js.Object] = js.native
    
    var Results: FC[SearchResultsProps] = js.native
  }
  
  trait SearchProps
    extends StObject
       with StrictSearchProps
       with /* key */ StringDictionary[Any]
  object SearchProps {
    
    inline def apply(): SearchProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchProps]
    }
  }
  
  trait SearchResultData
    extends StObject
       with SearchProps {
    
    var result: Any
  }
  object SearchResultData {
    
    inline def apply(result: Any): SearchResultData = {
      val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchResultData]
    }
    
    extension [Self <: SearchResultData](x: Self) {
      
      inline def setResult(value: Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  trait StrictSearchProps extends StObject {
    
    // ------------------------------------
    // Style
    // ------------------------------------
    /** A search can have its results aligned to its left or right container edge. */
    var aligned: js.UndefOr[String] = js.undefined
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** A search can display results from remote content ordered by categories. */
    var category: js.UndefOr[Boolean] = js.undefined
    
    // ------------------------------------
    // Rendering
    // ------------------------------------
    /**
      * Renders the SearchCategory layout.
      *
      * @param {object} props - The SearchCategoryLayout props object.
      * @returns {*} - Renderable SearchCategory layout.
      */
    var categoryLayoutRenderer: js.UndefOr[js.Function1[/* props */ PickSearchCategoryLayoutP, Element]] = js.undefined
    
    /**
      * Renders the SearchCategory contents.
      *
      * @param {object} props - The SearchCategory props object.
      * @returns {*} - Renderable SearchCategory contents.
      */
    var categoryRenderer: js.UndefOr[js.Function1[/* props */ SearchCategoryProps, Element]] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    // ------------------------------------
    // Behavior
    // ------------------------------------
    /** Initial value of open. */
    var defaultOpen: js.UndefOr[Boolean] = js.undefined
    
    /** Initial value. */
    var defaultValue: js.UndefOr[String] = js.undefined
    
    /** A search can have its results take up the width of its container. */
    var fluid: js.UndefOr[Boolean] = js.undefined
    
    /** Shorthand for Icon. */
    var icon: js.UndefOr[Any] = js.undefined
    
    /** Shorthand for input element. */
    var input: js.UndefOr[SemanticShorthandItem[InputProps]] = js.undefined
    
    /** A search can show a loading indicator. */
    var loading: js.UndefOr[Boolean] = js.undefined
    
    /** Minimum characters to query for results. */
    var minCharacters: js.UndefOr[Double] = js.undefined
    
    /** Additional text for "No Results" message with less emphasis. */
    var noResultsDescription: js.UndefOr[Node] = js.undefined
    
    /** Message to display when there are no results. */
    var noResultsMessage: js.UndefOr[Node] = js.undefined
    
    // ------------------------------------
    // Callbacks
    // ------------------------------------
    /**
      * Called on blur.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onBlur: js.UndefOr[
        js.Function2[/* event */ ReactMouseEventFrom[HTMLElement], /* data */ SearchProps, Unit]
      ] = js.undefined
    
    /**
      * Called on focus.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onFocus: js.UndefOr[
        js.Function2[/* event */ ReactMouseEventFrom[HTMLElement], /* data */ SearchProps, Unit]
      ] = js.undefined
    
    /**
      * Called on mousedown.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onMouseDown: js.UndefOr[
        js.Function2[/* event */ ReactMouseEventFrom[HTMLElement], /* data */ SearchProps, Unit]
      ] = js.undefined
    
    /**
      * Called when a result is selected.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onResultSelect: js.UndefOr[
        js.Function2[/* event */ ReactMouseEventFrom[HTMLDivElement], /* data */ SearchResultData, Unit]
      ] = js.undefined
    
    /**
      * Called on search input change.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props, includes current value of search input.
      */
    var onSearchChange: js.UndefOr[
        js.Function2[/* event */ ReactMouseEventFrom[HTMLElement], /* data */ SearchProps, Unit]
      ] = js.undefined
    
    /**
      * Called when the active selection index is changed.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onSelectionChange: js.UndefOr[
        js.Function2[/* event */ ReactMouseEventFrom[HTMLElement], /* data */ SearchResultData, Unit]
      ] = js.undefined
    
    /** Controls whether or not the results menu is displayed. */
    var open: js.UndefOr[Boolean] = js.undefined
    
    /** A search can show placeholder text when empty. */
    var placeholder: js.UndefOr[String] = js.undefined
    
    /**
      * Renders the SearchResult contents.
      *
      * @param {object} props - The SearchResult props object.
      * @returns {*} - Renderable SearchResult contents.
      */
    var resultRenderer: js.UndefOr[js.Function1[/* props */ SearchResultProps, Element]] = js.undefined
    
    /**
      * One of:
      * - array of Search.Result props e.g. `{ title: '', description: '' }` or
      * - object of categories e.g. `{ name: '', results: [{ title: '', description: '' }]`
      */
    var results: js.UndefOr[js.Array[Any] | (Record[String, Any])] = js.undefined
    
    /** Whether the search should automatically select the first result after searching. */
    var selectFirstResult: js.UndefOr[Boolean] = js.undefined
    
    /** Whether a "no results" message should be shown if no results are found. */
    var showNoResults: js.UndefOr[Boolean] = js.undefined
    
    /** A search can have different sizes. */
    var size: js.UndefOr[mini | tiny | small | large | big | huge | massive] = js.undefined
    
    /** Current value of the search input. Creates a controlled component. */
    var value: js.UndefOr[String] = js.undefined
  }
  object StrictSearchProps {
    
    inline def apply(): StrictSearchProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictSearchProps]
    }
    
    extension [Self <: StrictSearchProps](x: Self) {
      
      inline def setAligned(value: String): Self = StObject.set(x, "aligned", value.asInstanceOf[js.Any])
      
      inline def setAlignedUndefined: Self = StObject.set(x, "aligned", js.undefined)
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setCategory(value: Boolean): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setCategoryLayoutRenderer(value: /* props */ PickSearchCategoryLayoutP => Element): Self = StObject.set(x, "categoryLayoutRenderer", js.Any.fromFunction1(value))
      
      inline def setCategoryLayoutRendererUndefined: Self = StObject.set(x, "categoryLayoutRenderer", js.undefined)
      
      inline def setCategoryRenderer(value: /* props */ SearchCategoryProps => Element): Self = StObject.set(x, "categoryRenderer", js.Any.fromFunction1(value))
      
      inline def setCategoryRendererUndefined: Self = StObject.set(x, "categoryRenderer", js.undefined)
      
      inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDefaultOpen(value: Boolean): Self = StObject.set(x, "defaultOpen", value.asInstanceOf[js.Any])
      
      inline def setDefaultOpenUndefined: Self = StObject.set(x, "defaultOpen", js.undefined)
      
      inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      inline def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      inline def setIcon(value: Any): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setInput(value: SemanticShorthandItem[InputProps]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputFunction3(
        value: (/* component */ ElementType, InputProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
      ): Self = StObject.set(x, "input", js.Any.fromFunction3(value))
      
      inline def setInputNull: Self = StObject.set(x, "input", null)
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      inline def setInputVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "input", js.Array(value*))
      
      inline def setInputVdomElement(value: VdomElement): Self = StObject.set(x, "input", value.rawElement.asInstanceOf[js.Any])
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setMinCharacters(value: Double): Self = StObject.set(x, "minCharacters", value.asInstanceOf[js.Any])
      
      inline def setMinCharactersUndefined: Self = StObject.set(x, "minCharacters", js.undefined)
      
      inline def setNoResultsDescription(value: VdomNode): Self = StObject.set(x, "noResultsDescription", value.rawNode.asInstanceOf[js.Any])
      
      inline def setNoResultsDescriptionNull: Self = StObject.set(x, "noResultsDescription", null)
      
      inline def setNoResultsDescriptionUndefined: Self = StObject.set(x, "noResultsDescription", js.undefined)
      
      inline def setNoResultsDescriptionVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "noResultsDescription", js.Array(value*))
      
      inline def setNoResultsDescriptionVdomElement(value: VdomElement): Self = StObject.set(x, "noResultsDescription", value.rawElement.asInstanceOf[js.Any])
      
      inline def setNoResultsMessage(value: VdomNode): Self = StObject.set(x, "noResultsMessage", value.rawNode.asInstanceOf[js.Any])
      
      inline def setNoResultsMessageNull: Self = StObject.set(x, "noResultsMessage", null)
      
      inline def setNoResultsMessageUndefined: Self = StObject.set(x, "noResultsMessage", js.undefined)
      
      inline def setNoResultsMessageVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "noResultsMessage", js.Array(value*))
      
      inline def setNoResultsMessageVdomElement(value: VdomElement): Self = StObject.set(x, "noResultsMessage", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnBlur(value: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ SearchProps) => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLElement], t1: /* data */ SearchProps) => (value(t0, t1)).runNow()))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnFocus(value: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ SearchProps) => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLElement], t1: /* data */ SearchProps) => (value(t0, t1)).runNow()))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnMouseDown(value: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ SearchProps) => Callback): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLElement], t1: /* data */ SearchProps) => (value(t0, t1)).runNow()))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnResultSelect(value: (/* event */ ReactMouseEventFrom[HTMLDivElement], /* data */ SearchResultData) => Callback): Self = StObject.set(x, "onResultSelect", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLDivElement], t1: /* data */ SearchResultData) => (value(t0, t1)).runNow()))
      
      inline def setOnResultSelectUndefined: Self = StObject.set(x, "onResultSelect", js.undefined)
      
      inline def setOnSearchChange(value: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ SearchProps) => Callback): Self = StObject.set(x, "onSearchChange", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLElement], t1: /* data */ SearchProps) => (value(t0, t1)).runNow()))
      
      inline def setOnSearchChangeUndefined: Self = StObject.set(x, "onSearchChange", js.undefined)
      
      inline def setOnSelectionChange(value: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ SearchResultData) => Callback): Self = StObject.set(x, "onSelectionChange", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLElement], t1: /* data */ SearchResultData) => (value(t0, t1)).runNow()))
      
      inline def setOnSelectionChangeUndefined: Self = StObject.set(x, "onSelectionChange", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setResultRenderer(value: /* props */ SearchResultProps => Element): Self = StObject.set(x, "resultRenderer", js.Any.fromFunction1(value))
      
      inline def setResultRendererUndefined: Self = StObject.set(x, "resultRenderer", js.undefined)
      
      inline def setResults(value: js.Array[Any] | (Record[String, Any])): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      inline def setResultsVarargs(value: Any*): Self = StObject.set(x, "results", js.Array(value*))
      
      inline def setSelectFirstResult(value: Boolean): Self = StObject.set(x, "selectFirstResult", value.asInstanceOf[js.Any])
      
      inline def setSelectFirstResultUndefined: Self = StObject.set(x, "selectFirstResult", js.undefined)
      
      inline def setShowNoResults(value: Boolean): Self = StObject.set(x, "showNoResults", value.asInstanceOf[js.Any])
      
      inline def setShowNoResultsUndefined: Self = StObject.set(x, "showNoResults", js.undefined)
      
      inline def setSize(value: mini | tiny | small | large | big | huge | massive): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
