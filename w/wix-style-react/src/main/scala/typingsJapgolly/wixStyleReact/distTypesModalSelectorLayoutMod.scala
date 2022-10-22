package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.wixStyleReact.anon.TotalCount
import typingsJapgolly.wixStyleReact.wixStyleReactBooleans.`false`
import typingsJapgolly.wixStyleReact.wixStyleReactBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesModalSelectorLayoutMod {
  
  @JSImport("wix-style-react/dist/types/ModalSelectorLayout", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[ModalSelectorLayoutProps, js.Object, Any]
  
  type ModalSelectorLayout = PureComponent[ModalSelectorLayoutProps, js.Object, Any]
  
  trait ModalSelectorLayoutCommonProps extends StObject {
    
    var cancelButtonText: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var dataSource: ModalSelectorLayoutDatasourceFn
    
    var deselectAllText: js.UndefOr[String] = js.undefined
    
    var disableConfirmation: js.UndefOr[Boolean] = js.undefined
    
    var emptyState: js.UndefOr[Node] = js.undefined
    
    var height: js.UndefOr[String] = js.undefined
    
    var imageShape: js.UndefOr[ModalSelectorLayoutImageShape] = js.undefined
    
    var imageSize: js.UndefOr[ModalSelectorLayoutImageSize] = js.undefined
    
    var itemsPerPage: js.UndefOr[Double] = js.undefined
    
    var maxHeight: js.UndefOr[String] = js.undefined
    
    var noResultsFoundStateFactory: js.UndefOr[js.Function1[/* searchValue */ String, Node]] = js.undefined
    
    var okButtonText: js.UndefOr[String] = js.undefined
    
    var onCancel: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var onClose: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var onSelect: js.UndefOr[js.Function1[/* item */ ModalSelectorLayoutItem, Unit]] = js.undefined
    
    var searchDebounceMs: js.UndefOr[Double] = js.undefined
    
    var searchPlaceholder: js.UndefOr[String] = js.undefined
    
    var selectAllText: js.UndefOr[String] = js.undefined
    
    var sideActions: js.UndefOr[Node] = js.undefined
    
    var subtitle: js.UndefOr[Node] = js.undefined
    
    var title: js.UndefOr[Node] = js.undefined
    
    var withSearch: js.UndefOr[Boolean] = js.undefined
  }
  object ModalSelectorLayoutCommonProps {
    
    inline def apply(
      dataSource: (/* searchQuery */ String, /* offset */ Double, /* limit */ Double) => js.Promise[TotalCount]
    ): ModalSelectorLayoutCommonProps = {
      val __obj = js.Dynamic.literal(dataSource = js.Any.fromFunction3(dataSource))
      __obj.asInstanceOf[ModalSelectorLayoutCommonProps]
    }
    
    extension [Self <: ModalSelectorLayoutCommonProps](x: Self) {
      
      inline def setCancelButtonText(value: String): Self = StObject.set(x, "cancelButtonText", value.asInstanceOf[js.Any])
      
      inline def setCancelButtonTextUndefined: Self = StObject.set(x, "cancelButtonText", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDataSource(
        value: (/* searchQuery */ String, /* offset */ Double, /* limit */ Double) => js.Promise[TotalCount]
      ): Self = StObject.set(x, "dataSource", js.Any.fromFunction3(value))
      
      inline def setDeselectAllText(value: String): Self = StObject.set(x, "deselectAllText", value.asInstanceOf[js.Any])
      
      inline def setDeselectAllTextUndefined: Self = StObject.set(x, "deselectAllText", js.undefined)
      
      inline def setDisableConfirmation(value: Boolean): Self = StObject.set(x, "disableConfirmation", value.asInstanceOf[js.Any])
      
      inline def setDisableConfirmationUndefined: Self = StObject.set(x, "disableConfirmation", js.undefined)
      
      inline def setEmptyState(value: VdomNode): Self = StObject.set(x, "emptyState", value.rawNode.asInstanceOf[js.Any])
      
      inline def setEmptyStateNull: Self = StObject.set(x, "emptyState", null)
      
      inline def setEmptyStateUndefined: Self = StObject.set(x, "emptyState", js.undefined)
      
      inline def setEmptyStateVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "emptyState", js.Array(value*))
      
      inline def setEmptyStateVdomElement(value: VdomElement): Self = StObject.set(x, "emptyState", value.rawElement.asInstanceOf[js.Any])
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setImageShape(value: ModalSelectorLayoutImageShape): Self = StObject.set(x, "imageShape", value.asInstanceOf[js.Any])
      
      inline def setImageShapeUndefined: Self = StObject.set(x, "imageShape", js.undefined)
      
      inline def setImageSize(value: ModalSelectorLayoutImageSize): Self = StObject.set(x, "imageSize", value.asInstanceOf[js.Any])
      
      inline def setImageSizeUndefined: Self = StObject.set(x, "imageSize", js.undefined)
      
      inline def setItemsPerPage(value: Double): Self = StObject.set(x, "itemsPerPage", value.asInstanceOf[js.Any])
      
      inline def setItemsPerPageUndefined: Self = StObject.set(x, "itemsPerPage", js.undefined)
      
      inline def setMaxHeight(value: String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setNoResultsFoundStateFactory(value: /* searchValue */ String => Node): Self = StObject.set(x, "noResultsFoundStateFactory", js.Any.fromFunction1(value))
      
      inline def setNoResultsFoundStateFactoryUndefined: Self = StObject.set(x, "noResultsFoundStateFactory", js.undefined)
      
      inline def setOkButtonText(value: String): Self = StObject.set(x, "okButtonText", value.asInstanceOf[js.Any])
      
      inline def setOkButtonTextUndefined: Self = StObject.set(x, "okButtonText", js.undefined)
      
      inline def setOnCancel(value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCancel", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      inline def setOnClose(value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onClose", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnSelect(value: /* item */ ModalSelectorLayoutItem => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction1((t0: /* item */ ModalSelectorLayoutItem) => value(t0).runNow()))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setSearchDebounceMs(value: Double): Self = StObject.set(x, "searchDebounceMs", value.asInstanceOf[js.Any])
      
      inline def setSearchDebounceMsUndefined: Self = StObject.set(x, "searchDebounceMs", js.undefined)
      
      inline def setSearchPlaceholder(value: String): Self = StObject.set(x, "searchPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setSearchPlaceholderUndefined: Self = StObject.set(x, "searchPlaceholder", js.undefined)
      
      inline def setSelectAllText(value: String): Self = StObject.set(x, "selectAllText", value.asInstanceOf[js.Any])
      
      inline def setSelectAllTextUndefined: Self = StObject.set(x, "selectAllText", js.undefined)
      
      inline def setSideActions(value: VdomNode): Self = StObject.set(x, "sideActions", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSideActionsNull: Self = StObject.set(x, "sideActions", null)
      
      inline def setSideActionsUndefined: Self = StObject.set(x, "sideActions", js.undefined)
      
      inline def setSideActionsVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "sideActions", js.Array(value*))
      
      inline def setSideActionsVdomElement(value: VdomElement): Self = StObject.set(x, "sideActions", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSubtitle(value: VdomNode): Self = StObject.set(x, "subtitle", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSubtitleNull: Self = StObject.set(x, "subtitle", null)
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setSubtitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "subtitle", js.Array(value*))
      
      inline def setSubtitleVdomElement(value: VdomElement): Self = StObject.set(x, "subtitle", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
      
      inline def setWithSearch(value: Boolean): Self = StObject.set(x, "withSearch", value.asInstanceOf[js.Any])
      
      inline def setWithSearchUndefined: Self = StObject.set(x, "withSearch", js.undefined)
    }
  }
  
  type ModalSelectorLayoutDatasourceFn = js.Function3[
    /* searchQuery */ String, 
    /* offset */ Double, 
    /* limit */ Double, 
    js.Promise[TotalCount]
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.rectangular
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.circle
  */
  trait ModalSelectorLayoutImageShape extends StObject
  object ModalSelectorLayoutImageShape {
    
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
  trait ModalSelectorLayoutImageSize extends StObject
  object ModalSelectorLayoutImageSize {
    
    inline def cinema: typingsJapgolly.wixStyleReact.wixStyleReactStrings.cinema = "cinema".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.cinema]
    
    inline def large: typingsJapgolly.wixStyleReact.wixStyleReactStrings.large = "large".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.large]
    
    inline def portrait: typingsJapgolly.wixStyleReact.wixStyleReactStrings.portrait = "portrait".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.portrait]
    
    inline def small: typingsJapgolly.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.small]
    
    inline def tiny: typingsJapgolly.wixStyleReact.wixStyleReactStrings.tiny = "tiny".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.tiny]
  }
  
  trait ModalSelectorLayoutItem extends StObject {
    
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
  object ModalSelectorLayoutItem {
    
    inline def apply(id: Double | String): ModalSelectorLayoutItem = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = null)
      __obj.asInstanceOf[ModalSelectorLayoutItem]
    }
    
    extension [Self <: ModalSelectorLayoutItem](x: Self) {
      
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
  
  trait ModalSelectorLayoutMultipleProps extends StObject {
    
    var multiple: `true`
    
    var onOk: js.UndefOr[js.Function1[/* selectedItems */ js.Array[ModalSelectorLayoutItem], Unit]] = js.undefined
  }
  object ModalSelectorLayoutMultipleProps {
    
    inline def apply(): ModalSelectorLayoutMultipleProps = {
      val __obj = js.Dynamic.literal(multiple = true)
      __obj.asInstanceOf[ModalSelectorLayoutMultipleProps]
    }
    
    extension [Self <: ModalSelectorLayoutMultipleProps](x: Self) {
      
      inline def setMultiple(value: `true`): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setOnOk(value: /* selectedItems */ js.Array[ModalSelectorLayoutItem] => Callback): Self = StObject.set(x, "onOk", js.Any.fromFunction1((t0: /* selectedItems */ js.Array[ModalSelectorLayoutItem]) => value(t0).runNow()))
      
      inline def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
    }
  }
  
  type ModalSelectorLayoutProps = (ModalSelectorLayoutSingleProps & ModalSelectorLayoutCommonProps) | (ModalSelectorLayoutMultipleProps & ModalSelectorLayoutCommonProps)
  
  trait ModalSelectorLayoutSingleProps extends StObject {
    
    var multiple: js.UndefOr[`false`] = js.undefined
    
    var onOk: js.UndefOr[js.Function1[/* selectedItem */ ModalSelectorLayoutItem, Unit]] = js.undefined
  }
  object ModalSelectorLayoutSingleProps {
    
    inline def apply(): ModalSelectorLayoutSingleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalSelectorLayoutSingleProps]
    }
    
    extension [Self <: ModalSelectorLayoutSingleProps](x: Self) {
      
      inline def setMultiple(value: `false`): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setOnOk(value: /* selectedItem */ ModalSelectorLayoutItem => Callback): Self = StObject.set(x, "onOk", js.Any.fromFunction1((t0: /* selectedItem */ ModalSelectorLayoutItem) => value(t0).runNow()))
      
      inline def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
    }
  }
}
