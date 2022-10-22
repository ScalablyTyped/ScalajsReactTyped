package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.TouchEvent
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.wixStyleReact.anon.DisabledHovered
import typingsJapgolly.wixStyleReact.wixStyleReactInts.`-1`
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.`-_`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDropdownLayoutMod {
  
  @JSImport("wix-style-react/dist/types/DropdownLayout", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[DropdownLayoutProps, js.Object, Any]
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/types/DropdownLayout", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/DropdownLayout", "default.NONE_SELECTED_ID")
    @js.native
    def NONE_SELECTED_ID: NoneSelectedId = js.native
    inline def NONE_SELECTED_ID_=(x: NoneSelectedId): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NONE_SELECTED_ID")(x.asInstanceOf[js.Any])
  }
  
  type DropdownLayout = PureComponent[DropdownLayoutProps, js.Object, Any]
  
  trait DropdownLayoutDividerOption
    extends StObject
       with DropdownLayoutOption {
    
    var id: js.UndefOr[String | Double] = js.undefined
    
    var value: `-_`
  }
  object DropdownLayoutDividerOption {
    
    inline def apply(): DropdownLayoutDividerOption = {
      val __obj = js.Dynamic.literal(value = "-")
      __obj.asInstanceOf[DropdownLayoutDividerOption]
    }
    
    extension [Self <: DropdownLayoutDividerOption](x: Self) {
      
      inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setValue(value: `-_`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.small
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.big
  */
  trait DropdownLayoutItemHeight extends StObject
  object DropdownLayoutItemHeight {
    
    inline def big: typingsJapgolly.wixStyleReact.wixStyleReactStrings.big = "big".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.big]
    
    inline def small: typingsJapgolly.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.small]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.distTypesDropdownLayoutMod.DropdownLayoutValueOption
    - typingsJapgolly.wixStyleReact.distTypesDropdownLayoutMod.DropdownLayoutDividerOption
  */
  trait DropdownLayoutOption extends StObject
  object DropdownLayoutOption {
    
    inline def DropdownLayoutDividerOption(): typingsJapgolly.wixStyleReact.distTypesDropdownLayoutMod.DropdownLayoutDividerOption = {
      val __obj = js.Dynamic.literal(value = "-")
      __obj.asInstanceOf[typingsJapgolly.wixStyleReact.distTypesDropdownLayoutMod.DropdownLayoutDividerOption]
    }
    
    inline def DropdownLayoutValueOption(id: String | Double): typingsJapgolly.wixStyleReact.distTypesDropdownLayoutMod.DropdownLayoutValueOption = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], value = null)
      __obj.asInstanceOf[typingsJapgolly.wixStyleReact.distTypesDropdownLayoutMod.DropdownLayoutValueOption]
    }
  }
  
  trait DropdownLayoutProps extends StObject {
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var closeOnSelect: js.UndefOr[Boolean] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var dropDirectionUp: js.UndefOr[Boolean] = js.undefined
    
    var fixedFooter: js.UndefOr[Node] = js.undefined
    
    var fixedHeader: js.UndefOr[Node] = js.undefined
    
    var focusOnOption: js.UndefOr[String | Double] = js.undefined
    
    var focusOnSelectedOption: js.UndefOr[Boolean] = js.undefined
    
    var hasMore: js.UndefOr[Boolean] = js.undefined
    
    var inContainer: js.UndefOr[Boolean] = js.undefined
    
    var infiniteScroll: js.UndefOr[Boolean] = js.undefined
    
    var itemHeight: js.UndefOr[DropdownLayoutItemHeight] = js.undefined
    
    var listType: js.UndefOr[ListType] = js.undefined
    
    var loadMore: js.UndefOr[js.Function1[/* page */ Double, Unit]] = js.undefined
    
    var markedOption: js.UndefOr[Boolean | String | Double] = js.undefined
    
    var maxHeightPixels: js.UndefOr[String | Double] = js.undefined
    
    var minWidthPixels: js.UndefOr[String | Double] = js.undefined
    
    var onClickOutside: js.UndefOr[js.Function1[/* e */ TouchEvent | MouseEvent, Unit]] = js.undefined
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var onOptionMarked: js.UndefOr[js.Function1[/* option */ DropdownLayoutValueOption | Null, Unit]] = js.undefined
    
    var onSelect: js.UndefOr[
        js.Function2[/* option */ DropdownLayoutValueOption, /* sameOptionWasPicked */ Boolean, Unit]
      ] = js.undefined
    
    var options: js.UndefOr[js.Array[DropdownLayoutOption]] = js.undefined
    
    var overflow: js.UndefOr[Overflow] = js.undefined
    
    var scrollToOption: js.UndefOr[String | Double] = js.undefined
    
    var selectedHighlight: js.UndefOr[Boolean] = js.undefined
    
    var selectedId: js.UndefOr[String | Double] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
    
    var withArrow: js.UndefOr[Boolean] = js.undefined
  }
  object DropdownLayoutProps {
    
    inline def apply(): DropdownLayoutProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropdownLayoutProps]
    }
    
    extension [Self <: DropdownLayoutProps](x: Self) {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCloseOnSelect(value: Boolean): Self = StObject.set(x, "closeOnSelect", value.asInstanceOf[js.Any])
      
      inline def setCloseOnSelectUndefined: Self = StObject.set(x, "closeOnSelect", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDropDirectionUp(value: Boolean): Self = StObject.set(x, "dropDirectionUp", value.asInstanceOf[js.Any])
      
      inline def setDropDirectionUpUndefined: Self = StObject.set(x, "dropDirectionUp", js.undefined)
      
      inline def setFixedFooter(value: VdomNode): Self = StObject.set(x, "fixedFooter", value.rawNode.asInstanceOf[js.Any])
      
      inline def setFixedFooterNull: Self = StObject.set(x, "fixedFooter", null)
      
      inline def setFixedFooterUndefined: Self = StObject.set(x, "fixedFooter", js.undefined)
      
      inline def setFixedFooterVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "fixedFooter", js.Array(value*))
      
      inline def setFixedFooterVdomElement(value: VdomElement): Self = StObject.set(x, "fixedFooter", value.rawElement.asInstanceOf[js.Any])
      
      inline def setFixedHeader(value: VdomNode): Self = StObject.set(x, "fixedHeader", value.rawNode.asInstanceOf[js.Any])
      
      inline def setFixedHeaderNull: Self = StObject.set(x, "fixedHeader", null)
      
      inline def setFixedHeaderUndefined: Self = StObject.set(x, "fixedHeader", js.undefined)
      
      inline def setFixedHeaderVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "fixedHeader", js.Array(value*))
      
      inline def setFixedHeaderVdomElement(value: VdomElement): Self = StObject.set(x, "fixedHeader", value.rawElement.asInstanceOf[js.Any])
      
      inline def setFocusOnOption(value: String | Double): Self = StObject.set(x, "focusOnOption", value.asInstanceOf[js.Any])
      
      inline def setFocusOnOptionUndefined: Self = StObject.set(x, "focusOnOption", js.undefined)
      
      inline def setFocusOnSelectedOption(value: Boolean): Self = StObject.set(x, "focusOnSelectedOption", value.asInstanceOf[js.Any])
      
      inline def setFocusOnSelectedOptionUndefined: Self = StObject.set(x, "focusOnSelectedOption", js.undefined)
      
      inline def setHasMore(value: Boolean): Self = StObject.set(x, "hasMore", value.asInstanceOf[js.Any])
      
      inline def setHasMoreUndefined: Self = StObject.set(x, "hasMore", js.undefined)
      
      inline def setInContainer(value: Boolean): Self = StObject.set(x, "inContainer", value.asInstanceOf[js.Any])
      
      inline def setInContainerUndefined: Self = StObject.set(x, "inContainer", js.undefined)
      
      inline def setInfiniteScroll(value: Boolean): Self = StObject.set(x, "infiniteScroll", value.asInstanceOf[js.Any])
      
      inline def setInfiniteScrollUndefined: Self = StObject.set(x, "infiniteScroll", js.undefined)
      
      inline def setItemHeight(value: DropdownLayoutItemHeight): Self = StObject.set(x, "itemHeight", value.asInstanceOf[js.Any])
      
      inline def setItemHeightUndefined: Self = StObject.set(x, "itemHeight", js.undefined)
      
      inline def setListType(value: ListType): Self = StObject.set(x, "listType", value.asInstanceOf[js.Any])
      
      inline def setListTypeUndefined: Self = StObject.set(x, "listType", js.undefined)
      
      inline def setLoadMore(value: /* page */ Double => Callback): Self = StObject.set(x, "loadMore", js.Any.fromFunction1((t0: /* page */ Double) => value(t0).runNow()))
      
      inline def setLoadMoreUndefined: Self = StObject.set(x, "loadMore", js.undefined)
      
      inline def setMarkedOption(value: Boolean | String | Double): Self = StObject.set(x, "markedOption", value.asInstanceOf[js.Any])
      
      inline def setMarkedOptionUndefined: Self = StObject.set(x, "markedOption", js.undefined)
      
      inline def setMaxHeightPixels(value: String | Double): Self = StObject.set(x, "maxHeightPixels", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightPixelsUndefined: Self = StObject.set(x, "maxHeightPixels", js.undefined)
      
      inline def setMinWidthPixels(value: String | Double): Self = StObject.set(x, "minWidthPixels", value.asInstanceOf[js.Any])
      
      inline def setMinWidthPixelsUndefined: Self = StObject.set(x, "minWidthPixels", js.undefined)
      
      inline def setOnClickOutside(value: /* e */ TouchEvent | MouseEvent => Callback): Self = StObject.set(x, "onClickOutside", js.Any.fromFunction1((t0: /* e */ TouchEvent | MouseEvent) => value(t0).runNow()))
      
      inline def setOnClickOutsideUndefined: Self = StObject.set(x, "onClickOutside", js.undefined)
      
      inline def setOnClose(value: Callback): Self = StObject.set(x, "onClose", value.toJsFn)
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnMouseEnter(value: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnOptionMarked(value: /* option */ DropdownLayoutValueOption | Null => Callback): Self = StObject.set(x, "onOptionMarked", js.Any.fromFunction1((t0: /* option */ DropdownLayoutValueOption | Null) => value(t0).runNow()))
      
      inline def setOnOptionMarkedUndefined: Self = StObject.set(x, "onOptionMarked", js.undefined)
      
      inline def setOnSelect(value: (/* option */ DropdownLayoutValueOption, /* sameOptionWasPicked */ Boolean) => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction2((t0: /* option */ DropdownLayoutValueOption, t1: /* sameOptionWasPicked */ Boolean) => (value(t0, t1)).runNow()))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOptions(value: js.Array[DropdownLayoutOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOptionsVarargs(value: DropdownLayoutOption*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setOverflow(value: Overflow): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      inline def setScrollToOption(value: String | Double): Self = StObject.set(x, "scrollToOption", value.asInstanceOf[js.Any])
      
      inline def setScrollToOptionUndefined: Self = StObject.set(x, "scrollToOption", js.undefined)
      
      inline def setSelectedHighlight(value: Boolean): Self = StObject.set(x, "selectedHighlight", value.asInstanceOf[js.Any])
      
      inline def setSelectedHighlightUndefined: Self = StObject.set(x, "selectedHighlight", js.undefined)
      
      inline def setSelectedId(value: String | Double): Self = StObject.set(x, "selectedId", value.asInstanceOf[js.Any])
      
      inline def setSelectedIdUndefined: Self = StObject.set(x, "selectedId", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWithArrow(value: Boolean): Self = StObject.set(x, "withArrow", value.asInstanceOf[js.Any])
      
      inline def setWithArrowUndefined: Self = StObject.set(x, "withArrow", js.undefined)
    }
  }
  
  trait DropdownLayoutValueOption
    extends StObject
       with DropdownLayoutOption {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var id: String | Double
    
    var label: js.UndefOr[String] = js.undefined
    
    var linkTo: js.UndefOr[String] = js.undefined
    
    var overrideOptionStyle: js.UndefOr[Boolean] = js.undefined
    
    var overrideStyle: js.UndefOr[Boolean] = js.undefined
    
    var title: js.UndefOr[Boolean] = js.undefined
    
    var value: Node | String | RenderOptionFn
  }
  object DropdownLayoutValueOption {
    
    inline def apply(id: String | Double): DropdownLayoutValueOption = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], value = null)
      __obj.asInstanceOf[DropdownLayoutValueOption]
    }
    
    extension [Self <: DropdownLayoutValueOption](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLinkTo(value: String): Self = StObject.set(x, "linkTo", value.asInstanceOf[js.Any])
      
      inline def setLinkToUndefined: Self = StObject.set(x, "linkTo", js.undefined)
      
      inline def setOverrideOptionStyle(value: Boolean): Self = StObject.set(x, "overrideOptionStyle", value.asInstanceOf[js.Any])
      
      inline def setOverrideOptionStyleUndefined: Self = StObject.set(x, "overrideOptionStyle", js.undefined)
      
      inline def setOverrideStyle(value: Boolean): Self = StObject.set(x, "overrideStyle", value.asInstanceOf[js.Any])
      
      inline def setOverrideStyleUndefined: Self = StObject.set(x, "overrideStyle", js.undefined)
      
      inline def setTitle(value: Boolean): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setValue(value: Node | String | RenderOptionFn): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueFunction1(value: /* options */ DisabledHovered => typingsJapgolly.react.mod.global.JSX.Element): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "value", js.Array(value*))
      
      inline def setValueVdomElement(value: VdomElement): Self = StObject.set(x, "value", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.action
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.select
  */
  trait ListType extends StObject
  object ListType {
    
    inline def action: typingsJapgolly.wixStyleReact.wixStyleReactStrings.action = "action".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.action]
    
    inline def select: typingsJapgolly.wixStyleReact.wixStyleReactStrings.select = "select".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.select]
  }
  
  type NoneSelectedId = `-1`
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.visible
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.hidden
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.scroll
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.auto
  */
  trait Overflow extends StObject
  object Overflow {
    
    inline def auto: typingsJapgolly.wixStyleReact.wixStyleReactStrings.auto = "auto".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.auto]
    
    inline def hidden: typingsJapgolly.wixStyleReact.wixStyleReactStrings.hidden = "hidden".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.hidden]
    
    inline def scroll: typingsJapgolly.wixStyleReact.wixStyleReactStrings.scroll = "scroll".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.scroll]
    
    inline def visible: typingsJapgolly.wixStyleReact.wixStyleReactStrings.visible = "visible".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.visible]
  }
  
  type RenderOptionFn = js.Function1[/* options */ DisabledHovered, typingsJapgolly.react.mod.global.JSX.Element]
}
