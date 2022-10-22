package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSelectorListContentMod extends Shortcut {
  
  @JSImport("wix-style-react/dist/types/SelectorList/Content", JSImport.Default)
  @js.native
  val default: FC[SelectorListContentProps] = js.native
  
  trait SelectorListContentProps extends StObject {
    
    var checkIndeterminate: js.UndefOr[js.Function1[/* item */ SelectorListItem, Boolean]] = js.undefined
    
    def checkIsSelected(item: SelectorListItem): Boolean
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var emptyState: js.UndefOr[Node] = js.undefined
    
    var hasMore: js.UndefOr[Boolean] = js.undefined
    
    var imageShape: js.UndefOr[SelectorListImageShape] = js.undefined
    
    var imageSize: js.UndefOr[SelectorListImageSize] = js.undefined
    
    var infiniteScrollRef: js.UndefOr[Ref[Any]] = js.undefined
    
    var isEmpty: js.UndefOr[Boolean] = js.undefined
    
    var isLoading: js.UndefOr[Boolean] = js.undefined
    
    var items: js.Array[SelectorListItem]
    
    def loadMore(): Unit
    
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    var noResultsFound: js.UndefOr[Boolean] = js.undefined
    
    def onToggle(item: SelectorListItem): Unit
    
    var renderNoResults: js.UndefOr[js.Function1[/* searchValue */ String, Node]] = js.undefined
    
    var searchValue: String
    
    var topScrollableContent: js.UndefOr[Node] = js.undefined
  }
  object SelectorListContentProps {
    
    inline def apply(
      checkIsSelected: SelectorListItem => Boolean,
      items: js.Array[SelectorListItem],
      loadMore: Callback,
      onToggle: SelectorListItem => Callback,
      searchValue: String
    ): SelectorListContentProps = {
      val __obj = js.Dynamic.literal(checkIsSelected = js.Any.fromFunction1(checkIsSelected), items = items.asInstanceOf[js.Any], loadMore = loadMore.toJsFn, onToggle = js.Any.fromFunction1((t0: SelectorListItem) => onToggle(t0).runNow()), searchValue = searchValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectorListContentProps]
    }
    
    extension [Self <: SelectorListContentProps](x: Self) {
      
      inline def setCheckIndeterminate(value: /* item */ SelectorListItem => Boolean): Self = StObject.set(x, "checkIndeterminate", js.Any.fromFunction1(value))
      
      inline def setCheckIndeterminateUndefined: Self = StObject.set(x, "checkIndeterminate", js.undefined)
      
      inline def setCheckIsSelected(value: SelectorListItem => Boolean): Self = StObject.set(x, "checkIsSelected", js.Any.fromFunction1(value))
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setEmptyState(value: VdomNode): Self = StObject.set(x, "emptyState", value.rawNode.asInstanceOf[js.Any])
      
      inline def setEmptyStateNull: Self = StObject.set(x, "emptyState", null)
      
      inline def setEmptyStateUndefined: Self = StObject.set(x, "emptyState", js.undefined)
      
      inline def setEmptyStateVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "emptyState", js.Array(value*))
      
      inline def setEmptyStateVdomElement(value: VdomElement): Self = StObject.set(x, "emptyState", value.rawElement.asInstanceOf[js.Any])
      
      inline def setHasMore(value: Boolean): Self = StObject.set(x, "hasMore", value.asInstanceOf[js.Any])
      
      inline def setHasMoreUndefined: Self = StObject.set(x, "hasMore", js.undefined)
      
      inline def setImageShape(value: SelectorListImageShape): Self = StObject.set(x, "imageShape", value.asInstanceOf[js.Any])
      
      inline def setImageShapeUndefined: Self = StObject.set(x, "imageShape", js.undefined)
      
      inline def setImageSize(value: SelectorListImageSize): Self = StObject.set(x, "imageSize", value.asInstanceOf[js.Any])
      
      inline def setImageSizeUndefined: Self = StObject.set(x, "imageSize", js.undefined)
      
      inline def setInfiniteScrollRef(value: Ref[Any]): Self = StObject.set(x, "infiniteScrollRef", value.asInstanceOf[js.Any])
      
      inline def setInfiniteScrollRefFunction1(value: Any | Null => Callback): Self = StObject.set(x, "infiniteScrollRef", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
      
      inline def setInfiniteScrollRefNull: Self = StObject.set(x, "infiniteScrollRef", null)
      
      inline def setInfiniteScrollRefUndefined: Self = StObject.set(x, "infiniteScrollRef", js.undefined)
      
      inline def setIsEmpty(value: Boolean): Self = StObject.set(x, "isEmpty", value.asInstanceOf[js.Any])
      
      inline def setIsEmptyUndefined: Self = StObject.set(x, "isEmpty", js.undefined)
      
      inline def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
      
      inline def setIsLoadingUndefined: Self = StObject.set(x, "isLoading", js.undefined)
      
      inline def setItems(value: js.Array[SelectorListItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: SelectorListItem*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setLoadMore(value: Callback): Self = StObject.set(x, "loadMore", value.toJsFn)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setNoResultsFound(value: Boolean): Self = StObject.set(x, "noResultsFound", value.asInstanceOf[js.Any])
      
      inline def setNoResultsFoundUndefined: Self = StObject.set(x, "noResultsFound", js.undefined)
      
      inline def setOnToggle(value: SelectorListItem => Callback): Self = StObject.set(x, "onToggle", js.Any.fromFunction1((t0: SelectorListItem) => value(t0).runNow()))
      
      inline def setRenderNoResults(value: /* searchValue */ String => Node): Self = StObject.set(x, "renderNoResults", js.Any.fromFunction1(value))
      
      inline def setRenderNoResultsUndefined: Self = StObject.set(x, "renderNoResults", js.undefined)
      
      inline def setSearchValue(value: String): Self = StObject.set(x, "searchValue", value.asInstanceOf[js.Any])
      
      inline def setTopScrollableContent(value: VdomNode): Self = StObject.set(x, "topScrollableContent", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTopScrollableContentNull: Self = StObject.set(x, "topScrollableContent", null)
      
      inline def setTopScrollableContentUndefined: Self = StObject.set(x, "topScrollableContent", js.undefined)
      
      inline def setTopScrollableContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "topScrollableContent", js.Array(value*))
      
      inline def setTopScrollableContentVdomElement(value: VdomElement): Self = StObject.set(x, "topScrollableContent", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.rectangular
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.circle
  */
  trait SelectorListImageShape extends StObject
  object SelectorListImageShape {
    
    inline def circle: typingsJapgolly.wixStyleReact.wixStyleReactStrings.circle = "circle".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.circle]
    
    inline def rectangular: typingsJapgolly.wixStyleReact.wixStyleReactStrings.rectangular = "rectangular".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.rectangular]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.tiny
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.small
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.portrait
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.large
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.cinema
  */
  trait SelectorListImageSize extends StObject
  object SelectorListImageSize {
    
    inline def cinema: typingsJapgolly.wixStyleReact.wixStyleReactStrings.cinema = "cinema".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.cinema]
    
    inline def large: typingsJapgolly.wixStyleReact.wixStyleReactStrings.large = "large".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.large]
    
    inline def portrait: typingsJapgolly.wixStyleReact.wixStyleReactStrings.portrait = "portrait".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.portrait]
    
    inline def small: typingsJapgolly.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.small]
    
    inline def tiny: typingsJapgolly.wixStyleReact.wixStyleReactStrings.tiny = "tiny".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.tiny]
  }
  
  trait SelectorListItem extends StObject {
    
    var belowNode: js.UndefOr[Node] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var extraNode: js.UndefOr[Node] = js.undefined
    
    var extraText: js.UndefOr[String] = js.undefined
    
    var id: Double | String
    
    var image: js.UndefOr[Node] = js.undefined
    
    var selected: js.UndefOr[Boolean] = js.undefined
    
    var showBelowNodeOnSelect: js.UndefOr[Boolean] = js.undefined
    
    var subtitle: js.UndefOr[String] = js.undefined
    
    var subtitleNode: js.UndefOr[Node] = js.undefined
    
    var title: Node
  }
  object SelectorListItem {
    
    inline def apply(id: Double | String): SelectorListItem = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = null)
      __obj.asInstanceOf[SelectorListItem]
    }
    
    extension [Self <: SelectorListItem](x: Self) {
      
      inline def setBelowNode(value: VdomNode): Self = StObject.set(x, "belowNode", value.rawNode.asInstanceOf[js.Any])
      
      inline def setBelowNodeNull: Self = StObject.set(x, "belowNode", null)
      
      inline def setBelowNodeUndefined: Self = StObject.set(x, "belowNode", js.undefined)
      
      inline def setBelowNodeVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "belowNode", js.Array(value*))
      
      inline def setBelowNodeVdomElement(value: VdomElement): Self = StObject.set(x, "belowNode", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setExtraNode(value: VdomNode): Self = StObject.set(x, "extraNode", value.rawNode.asInstanceOf[js.Any])
      
      inline def setExtraNodeNull: Self = StObject.set(x, "extraNode", null)
      
      inline def setExtraNodeUndefined: Self = StObject.set(x, "extraNode", js.undefined)
      
      inline def setExtraNodeVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "extraNode", js.Array(value*))
      
      inline def setExtraNodeVdomElement(value: VdomElement): Self = StObject.set(x, "extraNode", value.rawElement.asInstanceOf[js.Any])
      
      inline def setExtraText(value: String): Self = StObject.set(x, "extraText", value.asInstanceOf[js.Any])
      
      inline def setExtraTextUndefined: Self = StObject.set(x, "extraText", js.undefined)
      
      inline def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setImage(value: VdomNode): Self = StObject.set(x, "image", value.rawNode.asInstanceOf[js.Any])
      
      inline def setImageNull: Self = StObject.set(x, "image", null)
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setImageVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "image", js.Array(value*))
      
      inline def setImageVdomElement(value: VdomElement): Self = StObject.set(x, "image", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setShowBelowNodeOnSelect(value: Boolean): Self = StObject.set(x, "showBelowNodeOnSelect", value.asInstanceOf[js.Any])
      
      inline def setShowBelowNodeOnSelectUndefined: Self = StObject.set(x, "showBelowNodeOnSelect", js.undefined)
      
      inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleNode(value: VdomNode): Self = StObject.set(x, "subtitleNode", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSubtitleNodeNull: Self = StObject.set(x, "subtitleNode", null)
      
      inline def setSubtitleNodeUndefined: Self = StObject.set(x, "subtitleNode", js.undefined)
      
      inline def setSubtitleNodeVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "subtitleNode", js.Array(value*))
      
      inline def setSubtitleNodeVdomElement(value: VdomElement): Self = StObject.set(x, "subtitleNode", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  type _To = FC[SelectorListContentProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesSelectorListContentMod.foo` */
  override def _to: FC[SelectorListContentProps] = default
}
