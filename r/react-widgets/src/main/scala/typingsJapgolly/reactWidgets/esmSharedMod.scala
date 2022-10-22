package typingsJapgolly.reactWidgets

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactAnimationEventFrom
import japgolly.scalajs.react.ReactDragEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactPointerEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import japgolly.scalajs.react.ReactTransitionEventFrom
import japgolly.scalajs.react.ReactUIEventFrom
import japgolly.scalajs.react.ReactWheelEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.AnimationEventHandler
import typingsJapgolly.react.mod.AriaAttributes
import typingsJapgolly.react.mod.AriaRole
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.DragEventHandler
import typingsJapgolly.react.mod.FocusEventHandler
import typingsJapgolly.react.mod.KeyboardEventHandler
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.PointerEventHandler
import typingsJapgolly.react.mod.TouchEventHandler
import typingsJapgolly.react.mod.TransitionEventHandler
import typingsJapgolly.react.mod.UIEventHandler
import typingsJapgolly.react.mod.WheelEventHandler
import typingsJapgolly.reactTransitionGroup.transitionMod.TransitionProps
import typingsJapgolly.reactWidgets.anon.Disabled
import typingsJapgolly.reactWidgets.anon.Group
import typingsJapgolly.reactWidgets.anon.OriginalEvent
import typingsJapgolly.reactWidgets.anon.Ref
import typingsJapgolly.reactWidgets.anon.Source
import typingsJapgolly.reactWidgets.anon.`0`
import typingsJapgolly.reactWidgets.esmAccessorsMod.DataKeyAccessor
import typingsJapgolly.reactWidgets.esmAccessorsMod.TextAccessor
import typingsJapgolly.reactWidgets.esmFilterMod.Filter
import typingsJapgolly.reactWidgets.esmListMod.GroupBy
import typingsJapgolly.reactWidgets.esmListMod.ListProps
import typingsJapgolly.reactWidgets.esmListMod.OptionComponentProp
import typingsJapgolly.reactWidgets.esmListMod.RenderGroupProp
import typingsJapgolly.reactWidgets.esmListMod.RenderItemProp
import typingsJapgolly.reactWidgets.esmLocalizationMod.DateFormats
import typingsJapgolly.reactWidgets.esmMessagesMod.UserProvidedMessages
import typingsJapgolly.reactWidgets.esmPopupMod.PopupProps
import typingsJapgolly.reactWidgets.esmTypesMod.DataItem
import typingsJapgolly.reactWidgets.esmTypesMod.SearchMetadata
import typingsJapgolly.reactWidgets.reactWidgetsStrings.onFilter
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmSharedMod {
  
  type AllowCreate = Boolean | onFilter
  
  trait BaseListboxInputProps[TDataItem, TValue] extends StObject {
    
    var busy: js.UndefOr[Boolean] = js.undefined
    
    var busySpinner: js.UndefOr[Node] = js.undefined
    
    var data: js.UndefOr[js.Array[TDataItem]] = js.undefined
    
    var dataKey: js.UndefOr[DataKeyAccessor] = js.undefined
    
    var defaultFocusedItem: js.UndefOr[TDataItem] = js.undefined
    
    var defaultValue: js.UndefOr[TValue] = js.undefined
    
    var disabled: js.UndefOr[Boolean | js.Array[TDataItem]] = js.undefined
    
    var focusFirstItem: js.UndefOr[Boolean] = js.undefined
    
    var groupBy: js.UndefOr[GroupBy[TDataItem]] = js.undefined
    
    var inputProps: js.UndefOr[js.Object] = js.undefined
    
    var listComponent: js.UndefOr[ComponentType[ListProps[TDataItem] & Ref]] = js.undefined
    
    var listProps: js.UndefOr[js.Object] = js.undefined
    
    var onChange: js.UndefOr[ChangeHandler[TDataItem]] = js.undefined
    
    var onSelect: js.UndefOr[SelectHandler[TDataItem]] = js.undefined
    
    var optionComponent: js.UndefOr[OptionComponentProp] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var renderListGroup: js.UndefOr[RenderGroupProp] = js.undefined
    
    var renderListItem: js.UndefOr[RenderItemProp[TDataItem]] = js.undefined
    
    var selectIcon: js.UndefOr[Node] = js.undefined
    
    var textField: js.UndefOr[TextAccessor] = js.undefined
    
    var value: js.UndefOr[TValue] = js.undefined
  }
  object BaseListboxInputProps {
    
    inline def apply[TDataItem, TValue](): BaseListboxInputProps[TDataItem, TValue] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseListboxInputProps[TDataItem, TValue]]
    }
    
    extension [Self <: BaseListboxInputProps[?, ?], TDataItem, TValue](x: Self & (BaseListboxInputProps[TDataItem, TValue])) {
      
      inline def setBusy(value: Boolean): Self = StObject.set(x, "busy", value.asInstanceOf[js.Any])
      
      inline def setBusySpinner(value: VdomNode): Self = StObject.set(x, "busySpinner", value.rawNode.asInstanceOf[js.Any])
      
      inline def setBusySpinnerNull: Self = StObject.set(x, "busySpinner", null)
      
      inline def setBusySpinnerUndefined: Self = StObject.set(x, "busySpinner", js.undefined)
      
      inline def setBusySpinnerVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "busySpinner", js.Array(value*))
      
      inline def setBusySpinnerVdomElement(value: VdomElement): Self = StObject.set(x, "busySpinner", value.rawElement.asInstanceOf[js.Any])
      
      inline def setBusyUndefined: Self = StObject.set(x, "busy", js.undefined)
      
      inline def setData(value: js.Array[TDataItem]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataKey(value: DataKeyAccessor): Self = StObject.set(x, "dataKey", value.asInstanceOf[js.Any])
      
      inline def setDataKeyFunction1(value: /* item */ DataItem => DataItem): Self = StObject.set(x, "dataKey", js.Any.fromFunction1(value))
      
      inline def setDataKeyUndefined: Self = StObject.set(x, "dataKey", js.undefined)
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: TDataItem*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDefaultFocusedItem(value: TDataItem): Self = StObject.set(x, "defaultFocusedItem", value.asInstanceOf[js.Any])
      
      inline def setDefaultFocusedItemUndefined: Self = StObject.set(x, "defaultFocusedItem", js.undefined)
      
      inline def setDefaultValue(value: TValue): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDisabled(value: Boolean | js.Array[TDataItem]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDisabledVarargs(value: TDataItem*): Self = StObject.set(x, "disabled", js.Array(value*))
      
      inline def setFocusFirstItem(value: Boolean): Self = StObject.set(x, "focusFirstItem", value.asInstanceOf[js.Any])
      
      inline def setFocusFirstItemUndefined: Self = StObject.set(x, "focusFirstItem", js.undefined)
      
      inline def setGroupBy(value: GroupBy[TDataItem]): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
      
      inline def setGroupByFunction1(value: TDataItem => Any): Self = StObject.set(x, "groupBy", js.Any.fromFunction1(value))
      
      inline def setGroupByUndefined: Self = StObject.set(x, "groupBy", js.undefined)
      
      inline def setInputProps(value: js.Object): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      inline def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
      
      inline def setListComponent(value: ComponentType[ListProps[TDataItem] & Ref]): Self = StObject.set(x, "listComponent", value.asInstanceOf[js.Any])
      
      inline def setListComponentUndefined: Self = StObject.set(x, "listComponent", js.undefined)
      
      inline def setListProps(value: js.Object): Self = StObject.set(x, "listProps", value.asInstanceOf[js.Any])
      
      inline def setListPropsUndefined: Self = StObject.set(x, "listProps", js.undefined)
      
      inline def setOnChange(value: (TDataItem, /* metadata */ Source) => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: TDataItem, t1: /* metadata */ Source) => (value(t0, t1)).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnSelect(value: (TDataItem, /* metadata */ `0`) => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction2((t0: TDataItem, t1: /* metadata */ `0`) => (value(t0, t1)).runNow()))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOptionComponent(value: OptionComponentProp): Self = StObject.set(x, "optionComponent", value.asInstanceOf[js.Any])
      
      inline def setOptionComponentUndefined: Self = StObject.set(x, "optionComponent", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRenderListGroup(value: Group => Node): Self = StObject.set(x, "renderListGroup", js.Any.fromFunction1(value))
      
      inline def setRenderListGroupUndefined: Self = StObject.set(x, "renderListGroup", js.undefined)
      
      inline def setRenderListItem(value: Disabled[TDataItem] => Node): Self = StObject.set(x, "renderListItem", js.Any.fromFunction1(value))
      
      inline def setRenderListItemUndefined: Self = StObject.set(x, "renderListItem", js.undefined)
      
      inline def setSelectIcon(value: VdomNode): Self = StObject.set(x, "selectIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSelectIconNull: Self = StObject.set(x, "selectIcon", null)
      
      inline def setSelectIconUndefined: Self = StObject.set(x, "selectIcon", js.undefined)
      
      inline def setSelectIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "selectIcon", js.Array(value*))
      
      inline def setSelectIconVdomElement(value: VdomElement): Self = StObject.set(x, "selectIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTextField(value: TextAccessor): Self = StObject.set(x, "textField", value.asInstanceOf[js.Any])
      
      inline def setTextFieldFunction1(value: /* item */ DataItem => String): Self = StObject.set(x, "textField", js.Any.fromFunction1(value))
      
      inline def setTextFieldUndefined: Self = StObject.set(x, "textField", js.undefined)
      
      inline def setValue(value: TValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type ChangeHandler[TDataItem] = js.Function2[/* dataItem */ TDataItem, /* metadata */ Source, Unit]
  
  trait DateLocalizationProps[TLocalizer] extends StObject {
    
    var formats: js.UndefOr[DateFormats[InferFormat[TLocalizer]]] = js.undefined
  }
  object DateLocalizationProps {
    
    inline def apply[TLocalizer](): DateLocalizationProps[TLocalizer] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateLocalizationProps[TLocalizer]]
    }
    
    extension [Self <: DateLocalizationProps[?], TLocalizer](x: Self & DateLocalizationProps[TLocalizer]) {
      
      inline def setFormats(value: DateFormats[InferFormat[TLocalizer]]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      inline def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
    }
  }
  
  trait Filterable[TDataItem] extends StObject {
    
    var allowCreate: js.UndefOr[AllowCreate] = js.undefined
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var filter: js.UndefOr[Filter[TDataItem]] = js.undefined
  }
  object Filterable {
    
    inline def apply[TDataItem](): Filterable[TDataItem] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Filterable[TDataItem]]
    }
    
    extension [Self <: Filterable[?], TDataItem](x: Self & Filterable[TDataItem]) {
      
      inline def setAllowCreate(value: AllowCreate): Self = StObject.set(x, "allowCreate", value.asInstanceOf[js.Any])
      
      inline def setAllowCreateUndefined: Self = StObject.set(x, "allowCreate", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setFilter(value: Filter[TDataItem]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterFunction3(value: (TDataItem, /* searchTerm */ String, /* idx */ js.UndefOr[Double]) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction3(value))
      
      inline def setFilterNull: Self = StObject.set(x, "filter", null)
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    TLocalizer extends react-widgets.react-widgets/esm/Localization.Localizer<infer TFormat, any> ? TFormat : unknown
    }}}
    */
  @js.native
  trait InferFormat[TLocalizer] extends StObject
  
  type MultipleChangeHandler[TDataItem] = js.Function2[/* dataItem */ js.Array[TDataItem], /* metadata */ OriginalEvent[TDataItem], Unit]
  
  trait NumberLocalizationProps[TLocalizer] extends StObject {
    
    var formats: js.UndefOr[DateFormats[InferFormat[TLocalizer]]] = js.undefined
  }
  object NumberLocalizationProps {
    
    inline def apply[TLocalizer](): NumberLocalizationProps[TLocalizer] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NumberLocalizationProps[TLocalizer]]
    }
    
    extension [Self <: NumberLocalizationProps[?], TLocalizer](x: Self & NumberLocalizationProps[TLocalizer]) {
      
      inline def setFormats(value: DateFormats[InferFormat[TLocalizer]]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      inline def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
    }
  }
  
  trait PopupWidgetProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var containerClassName: js.UndefOr[String] = js.undefined
    
    var defaultOpen: js.UndefOr[Boolean] = js.undefined
    
    var dropUp: js.UndefOr[Boolean] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.undefined
    
    var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.undefined
    
    var onToggle: js.UndefOr[js.Function1[/* isOpen */ Boolean, Unit]] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var popupComponent: js.UndefOr[ComponentType[PopupProps]] = js.undefined
    
    var popupProps: js.UndefOr[Record[String, Any]] = js.undefined
    
    var popupTransition: js.UndefOr[ComponentType[TransitionProps[Unit]]] = js.undefined
  }
  object PopupWidgetProps {
    
    inline def apply(): PopupWidgetProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopupWidgetProps]
    }
    
    extension [Self <: PopupWidgetProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
      
      inline def setContainerClassNameUndefined: Self = StObject.set(x, "containerClassName", js.undefined)
      
      inline def setDefaultOpen(value: Boolean): Self = StObject.set(x, "defaultOpen", value.asInstanceOf[js.Any])
      
      inline def setDefaultOpenUndefined: Self = StObject.set(x, "defaultOpen", js.undefined)
      
      inline def setDropUp(value: Boolean): Self = StObject.set(x, "dropUp", value.asInstanceOf[js.Any])
      
      inline def setDropUpUndefined: Self = StObject.set(x, "dropUp", js.undefined)
      
      inline def setOnKeyDown(value: ReactKeyboardEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyPress(value: ReactKeyboardEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setOnToggle(value: /* isOpen */ Boolean => Callback): Self = StObject.set(x, "onToggle", js.Any.fromFunction1((t0: /* isOpen */ Boolean) => value(t0).runNow()))
      
      inline def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setPopupComponent(value: ComponentType[PopupProps]): Self = StObject.set(x, "popupComponent", value.asInstanceOf[js.Any])
      
      inline def setPopupComponentUndefined: Self = StObject.set(x, "popupComponent", js.undefined)
      
      inline def setPopupProps(value: Record[String, Any]): Self = StObject.set(x, "popupProps", value.asInstanceOf[js.Any])
      
      inline def setPopupPropsUndefined: Self = StObject.set(x, "popupProps", js.undefined)
      
      inline def setPopupTransition(value: ComponentType[TransitionProps[Unit]]): Self = StObject.set(x, "popupTransition", value.asInstanceOf[js.Any])
      
      inline def setPopupTransitionUndefined: Self = StObject.set(x, "popupTransition", js.undefined)
    }
  }
  
  type SearchHandler = js.Function2[/* searchTerm */ String, /* metadata */ SearchMetadata, Unit]
  
  trait Searchable extends StObject {
    
    var defaultSearchTerm: js.UndefOr[String] = js.undefined
    
    var onSearch: js.UndefOr[SearchHandler] = js.undefined
    
    var searchTerm: js.UndefOr[String] = js.undefined
  }
  object Searchable {
    
    inline def apply(): Searchable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Searchable]
    }
    
    extension [Self <: Searchable](x: Self) {
      
      inline def setDefaultSearchTerm(value: String): Self = StObject.set(x, "defaultSearchTerm", value.asInstanceOf[js.Any])
      
      inline def setDefaultSearchTermUndefined: Self = StObject.set(x, "defaultSearchTerm", js.undefined)
      
      inline def setOnSearch(value: (/* searchTerm */ String, /* metadata */ SearchMetadata) => Callback): Self = StObject.set(x, "onSearch", js.Any.fromFunction2((t0: /* searchTerm */ String, t1: /* metadata */ SearchMetadata) => (value(t0, t1)).runNow()))
      
      inline def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
      
      inline def setSearchTerm(value: String): Self = StObject.set(x, "searchTerm", value.asInstanceOf[js.Any])
      
      inline def setSearchTermUndefined: Self = StObject.set(x, "searchTerm", js.undefined)
    }
  }
  
  type SelectHandler[TDataItem] = js.Function2[/* dataItem */ TDataItem, /* metadata */ `0`, Unit]
  
  trait WidgetHTMLProps[T]
    extends StObject
       with AriaAttributes {
    
    var accessKey: js.UndefOr[String] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var contextMenu: js.UndefOr[String] = js.undefined
    
    var dir: js.UndefOr[String] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var lang: js.UndefOr[String] = js.undefined
    
    var onAnimationEnd: js.UndefOr[AnimationEventHandler[T]] = js.undefined
    
    var onAnimationEndCapture: js.UndefOr[AnimationEventHandler[T]] = js.undefined
    
    var onAnimationIteration: js.UndefOr[AnimationEventHandler[T]] = js.undefined
    
    var onAnimationIterationCapture: js.UndefOr[AnimationEventHandler[T]] = js.undefined
    
    var onAnimationStart: js.UndefOr[AnimationEventHandler[T]] = js.undefined
    
    var onAnimationStartCapture: js.UndefOr[AnimationEventHandler[T]] = js.undefined
    
    var onAuxClick: js.UndefOr[MouseEventHandler[T]] = js.undefined
    
    var onAuxClickCapture: js.UndefOr[MouseEventHandler[T]] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[T]] = js.undefined
    
    var onBlurCapture: js.UndefOr[FocusEventHandler[T]] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[T]] = js.undefined
    
    var onClickCapture: js.UndefOr[MouseEventHandler[T]] = js.undefined
    
    var onContextMenu: js.UndefOr[MouseEventHandler[T]] = js.undefined
    
    var onContextMenuCapture: js.UndefOr[MouseEventHandler[T]] = js.undefined
    
    var onDoubleClick: js.UndefOr[MouseEventHandler[T]] = js.undefined
    
    var onDoubleClickCapture: js.UndefOr[MouseEventHandler[T]] = js.undefined
    
    var onDrag: js.UndefOr[DragEventHandler[T]] = js.undefined
    
    var onDragCapture: js.UndefOr[DragEventHandler[T]] = js.undefined
    
    var onDragEnd: js.UndefOr[DragEventHandler[T]] = js.undefined
    
    var onDragEndCapture: js.UndefOr[DragEventHandler[T]] = js.undefined
    
    var onDragEnter: js.UndefOr[DragEventHandler[T]] = js.undefined
    
    var onDragEnterCapture: js.UndefOr[DragEventHandler[T]] = js.undefined
    
    var onDragExit: js.UndefOr[DragEventHandler[T]] = js.undefined
    
    var onDragExitCapture: js.UndefOr[DragEventHandler[T]] = js.undefined
    
    var onDragLeave: js.UndefOr[DragEventHandler[T]] = js.undefined
    
    var onDragLeaveCapture: js.UndefOr[DragEventHandler[T]] = js.undefined
    
    var onDragOver: js.UndefOr[DragEventHandler[T]] = js.undefined
    
    var onDragOverCapture: js.UndefOr[DragEventHandler[T]] = js.undefined
    
    var onDragStart: js.UndefOr[DragEventHandler[T]] = js.undefined
    
    var onDragStartCapture: js.UndefOr[DragEventHandler[T]] = js.undefined
    
    var onDrop: js.UndefOr[DragEventHandler[T]] = js.undefined
    
    var onDropCapture: js.UndefOr[DragEventHandler[T]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[T]] = js.undefined
    
    var onFocusCapture: js.UndefOr[FocusEventHandler[T]] = js.undefined
    
    var onGotPointerCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
    
    var onGotPointerCaptureCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[T]] = js.undefined
    
    var onKeyDownCapture: js.UndefOr[KeyboardEventHandler[T]] = js.undefined
    
    var onKeyPress: js.UndefOr[KeyboardEventHandler[T]] = js.undefined
    
    var onKeyPressCapture: js.UndefOr[KeyboardEventHandler[T]] = js.undefined
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[T]] = js.undefined
    
    var onKeyUpCapture: js.UndefOr[KeyboardEventHandler[T]] = js.undefined
    
    var onLostPointerCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
    
    var onLostPointerCaptureCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
    
    var onMouseDown: js.UndefOr[MouseEventHandler[T]] = js.undefined
    
    var onMouseDownCapture: js.UndefOr[MouseEventHandler[T]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[T]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[T]] = js.undefined
    
    var onMouseMove: js.UndefOr[MouseEventHandler[T]] = js.undefined
    
    var onMouseMoveCapture: js.UndefOr[MouseEventHandler[T]] = js.undefined
    
    var onMouseOut: js.UndefOr[MouseEventHandler[T]] = js.undefined
    
    var onMouseOutCapture: js.UndefOr[MouseEventHandler[T]] = js.undefined
    
    var onMouseOver: js.UndefOr[MouseEventHandler[T]] = js.undefined
    
    var onMouseOverCapture: js.UndefOr[MouseEventHandler[T]] = js.undefined
    
    var onMouseUp: js.UndefOr[MouseEventHandler[T]] = js.undefined
    
    var onMouseUpCapture: js.UndefOr[MouseEventHandler[T]] = js.undefined
    
    var onPointerCancel: js.UndefOr[PointerEventHandler[T]] = js.undefined
    
    var onPointerCancelCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
    
    var onPointerDown: js.UndefOr[PointerEventHandler[T]] = js.undefined
    
    var onPointerDownCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
    
    var onPointerEnter: js.UndefOr[PointerEventHandler[T]] = js.undefined
    
    var onPointerEnterCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
    
    var onPointerLeave: js.UndefOr[PointerEventHandler[T]] = js.undefined
    
    var onPointerLeaveCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
    
    var onPointerMove: js.UndefOr[PointerEventHandler[T]] = js.undefined
    
    var onPointerMoveCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
    
    var onPointerOut: js.UndefOr[PointerEventHandler[T]] = js.undefined
    
    var onPointerOutCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
    
    var onPointerOver: js.UndefOr[PointerEventHandler[T]] = js.undefined
    
    var onPointerOverCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
    
    var onPointerUp: js.UndefOr[PointerEventHandler[T]] = js.undefined
    
    var onPointerUpCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
    
    var onScroll: js.UndefOr[UIEventHandler[T]] = js.undefined
    
    var onScrollCapture: js.UndefOr[UIEventHandler[T]] = js.undefined
    
    var onTouchCancel: js.UndefOr[TouchEventHandler[T]] = js.undefined
    
    var onTouchCancelCapture: js.UndefOr[TouchEventHandler[T]] = js.undefined
    
    var onTouchEnd: js.UndefOr[TouchEventHandler[T]] = js.undefined
    
    var onTouchEndCapture: js.UndefOr[TouchEventHandler[T]] = js.undefined
    
    var onTouchMove: js.UndefOr[TouchEventHandler[T]] = js.undefined
    
    var onTouchMoveCapture: js.UndefOr[TouchEventHandler[T]] = js.undefined
    
    var onTouchStart: js.UndefOr[TouchEventHandler[T]] = js.undefined
    
    var onTouchStartCapture: js.UndefOr[TouchEventHandler[T]] = js.undefined
    
    var onTransitionEnd: js.UndefOr[TransitionEventHandler[T]] = js.undefined
    
    var onTransitionEndCapture: js.UndefOr[TransitionEventHandler[T]] = js.undefined
    
    var onWheel: js.UndefOr[WheelEventHandler[T]] = js.undefined
    
    var onWheelCapture: js.UndefOr[WheelEventHandler[T]] = js.undefined
    
    var role: js.UndefOr[AriaRole] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
    
    var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object WidgetHTMLProps {
    
    inline def apply[T](): WidgetHTMLProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WidgetHTMLProps[T]]
    }
    
    extension [Self <: WidgetHTMLProps[?], T](x: Self & WidgetHTMLProps[T]) {
      
      inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setOnAnimationEnd(value: ReactAnimationEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1((t0: ReactAnimationEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnAnimationEndCapture(value: ReactAnimationEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAnimationEndCapture", js.Any.fromFunction1((t0: ReactAnimationEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnAnimationEndCaptureUndefined: Self = StObject.set(x, "onAnimationEndCapture", js.undefined)
      
      inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      inline def setOnAnimationIteration(value: ReactAnimationEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1((t0: ReactAnimationEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnAnimationIterationCapture(value: ReactAnimationEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAnimationIterationCapture", js.Any.fromFunction1((t0: ReactAnimationEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnAnimationIterationCaptureUndefined: Self = StObject.set(x, "onAnimationIterationCapture", js.undefined)
      
      inline def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
      
      inline def setOnAnimationStart(value: ReactAnimationEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1((t0: ReactAnimationEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnAnimationStartCapture(value: ReactAnimationEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAnimationStartCapture", js.Any.fromFunction1((t0: ReactAnimationEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnAnimationStartCaptureUndefined: Self = StObject.set(x, "onAnimationStartCapture", js.undefined)
      
      inline def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
      
      inline def setOnAuxClick(value: ReactMouseEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnAuxClickCapture(value: ReactMouseEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAuxClickCapture", js.Any.fromFunction1((t0: ReactMouseEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnAuxClickCaptureUndefined: Self = StObject.set(x, "onAuxClickCapture", js.undefined)
      
      inline def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
      
      inline def setOnBlur(value: ReactFocusEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnBlurCapture(value: ReactFocusEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onBlurCapture", js.Any.fromFunction1((t0: ReactFocusEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnBlurCaptureUndefined: Self = StObject.set(x, "onBlurCapture", js.undefined)
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnClick(value: ReactMouseEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnClickCapture(value: ReactMouseEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onClickCapture", js.Any.fromFunction1((t0: ReactMouseEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnClickCaptureUndefined: Self = StObject.set(x, "onClickCapture", js.undefined)
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnContextMenu(value: ReactMouseEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1((t0: ReactMouseEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnContextMenuCapture(value: ReactMouseEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onContextMenuCapture", js.Any.fromFunction1((t0: ReactMouseEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnContextMenuCaptureUndefined: Self = StObject.set(x, "onContextMenuCapture", js.undefined)
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnDoubleClick(value: ReactMouseEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDoubleClickCapture(value: ReactMouseEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDoubleClickCapture", js.Any.fromFunction1((t0: ReactMouseEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDoubleClickCaptureUndefined: Self = StObject.set(x, "onDoubleClickCapture", js.undefined)
      
      inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      inline def setOnDrag(value: ReactDragEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDrag", js.Any.fromFunction1((t0: ReactDragEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDragCapture(value: ReactDragEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragCapture", js.Any.fromFunction1((t0: ReactDragEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDragCaptureUndefined: Self = StObject.set(x, "onDragCapture", js.undefined)
      
      inline def setOnDragEnd(value: ReactDragEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1((t0: ReactDragEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDragEndCapture(value: ReactDragEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragEndCapture", js.Any.fromFunction1((t0: ReactDragEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDragEndCaptureUndefined: Self = StObject.set(x, "onDragEndCapture", js.undefined)
      
      inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      inline def setOnDragEnter(value: ReactDragEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1((t0: ReactDragEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDragEnterCapture(value: ReactDragEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragEnterCapture", js.Any.fromFunction1((t0: ReactDragEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDragEnterCaptureUndefined: Self = StObject.set(x, "onDragEnterCapture", js.undefined)
      
      inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      inline def setOnDragExit(value: ReactDragEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1((t0: ReactDragEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDragExitCapture(value: ReactDragEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragExitCapture", js.Any.fromFunction1((t0: ReactDragEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDragExitCaptureUndefined: Self = StObject.set(x, "onDragExitCapture", js.undefined)
      
      inline def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
      
      inline def setOnDragLeave(value: ReactDragEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1((t0: ReactDragEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDragLeaveCapture(value: ReactDragEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragLeaveCapture", js.Any.fromFunction1((t0: ReactDragEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDragLeaveCaptureUndefined: Self = StObject.set(x, "onDragLeaveCapture", js.undefined)
      
      inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      inline def setOnDragOver(value: ReactDragEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1((t0: ReactDragEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDragOverCapture(value: ReactDragEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragOverCapture", js.Any.fromFunction1((t0: ReactDragEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDragOverCaptureUndefined: Self = StObject.set(x, "onDragOverCapture", js.undefined)
      
      inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      inline def setOnDragStart(value: ReactDragEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1((t0: ReactDragEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDragStartCapture(value: ReactDragEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragStartCapture", js.Any.fromFunction1((t0: ReactDragEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDragStartCaptureUndefined: Self = StObject.set(x, "onDragStartCapture", js.undefined)
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      inline def setOnDrop(value: ReactDragEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDrop", js.Any.fromFunction1((t0: ReactDragEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDropCapture(value: ReactDragEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDropCapture", js.Any.fromFunction1((t0: ReactDragEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnDropCaptureUndefined: Self = StObject.set(x, "onDropCapture", js.undefined)
      
      inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      inline def setOnFocus(value: ReactFocusEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnFocusCapture(value: ReactFocusEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onFocusCapture", js.Any.fromFunction1((t0: ReactFocusEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnFocusCaptureUndefined: Self = StObject.set(x, "onFocusCapture", js.undefined)
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnGotPointerCapture(value: ReactPointerEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onGotPointerCapture", js.Any.fromFunction1((t0: ReactPointerEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnGotPointerCaptureCapture(value: ReactPointerEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onGotPointerCaptureCapture", js.Any.fromFunction1((t0: ReactPointerEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnGotPointerCaptureCaptureUndefined: Self = StObject.set(x, "onGotPointerCaptureCapture", js.undefined)
      
      inline def setOnGotPointerCaptureUndefined: Self = StObject.set(x, "onGotPointerCapture", js.undefined)
      
      inline def setOnKeyDown(value: ReactKeyboardEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnKeyDownCapture(value: ReactKeyboardEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onKeyDownCapture", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnKeyDownCaptureUndefined: Self = StObject.set(x, "onKeyDownCapture", js.undefined)
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyPress(value: ReactKeyboardEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnKeyPressCapture(value: ReactKeyboardEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onKeyPressCapture", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnKeyPressCaptureUndefined: Self = StObject.set(x, "onKeyPressCapture", js.undefined)
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setOnKeyUp(value: ReactKeyboardEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnKeyUpCapture(value: ReactKeyboardEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onKeyUpCapture", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnKeyUpCaptureUndefined: Self = StObject.set(x, "onKeyUpCapture", js.undefined)
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setOnLostPointerCapture(value: ReactPointerEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onLostPointerCapture", js.Any.fromFunction1((t0: ReactPointerEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnLostPointerCaptureCapture(value: ReactPointerEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onLostPointerCaptureCapture", js.Any.fromFunction1((t0: ReactPointerEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnLostPointerCaptureCaptureUndefined: Self = StObject.set(x, "onLostPointerCaptureCapture", js.undefined)
      
      inline def setOnLostPointerCaptureUndefined: Self = StObject.set(x, "onLostPointerCapture", js.undefined)
      
      inline def setOnMouseDown(value: ReactMouseEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseDownCapture(value: ReactMouseEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseDownCapture", js.Any.fromFunction1((t0: ReactMouseEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseDownCaptureUndefined: Self = StObject.set(x, "onMouseDownCapture", js.undefined)
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnMouseEnter(value: ReactMouseEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: ReactMouseEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(value: ReactMouseEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1((t0: ReactMouseEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseMoveCapture(value: ReactMouseEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseMoveCapture", js.Any.fromFunction1((t0: ReactMouseEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseMoveCaptureUndefined: Self = StObject.set(x, "onMouseMoveCapture", js.undefined)
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setOnMouseOut(value: ReactMouseEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1((t0: ReactMouseEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseOutCapture(value: ReactMouseEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseOutCapture", js.Any.fromFunction1((t0: ReactMouseEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseOutCaptureUndefined: Self = StObject.set(x, "onMouseOutCapture", js.undefined)
      
      inline def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      inline def setOnMouseOver(value: ReactMouseEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1((t0: ReactMouseEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseOverCapture(value: ReactMouseEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseOverCapture", js.Any.fromFunction1((t0: ReactMouseEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseOverCaptureUndefined: Self = StObject.set(x, "onMouseOverCapture", js.undefined)
      
      inline def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      inline def setOnMouseUp(value: ReactMouseEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1((t0: ReactMouseEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseUpCapture(value: ReactMouseEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseUpCapture", js.Any.fromFunction1((t0: ReactMouseEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseUpCaptureUndefined: Self = StObject.set(x, "onMouseUpCapture", js.undefined)
      
      inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      inline def setOnPointerCancel(value: ReactPointerEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1((t0: ReactPointerEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerCancelCapture(value: ReactPointerEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerCancelCapture", js.Any.fromFunction1((t0: ReactPointerEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerCancelCaptureUndefined: Self = StObject.set(x, "onPointerCancelCapture", js.undefined)
      
      inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      inline def setOnPointerDown(value: ReactPointerEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1((t0: ReactPointerEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerDownCapture(value: ReactPointerEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerDownCapture", js.Any.fromFunction1((t0: ReactPointerEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerDownCaptureUndefined: Self = StObject.set(x, "onPointerDownCapture", js.undefined)
      
      inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      inline def setOnPointerEnter(value: ReactPointerEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1((t0: ReactPointerEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerEnterCapture(value: ReactPointerEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerEnterCapture", js.Any.fromFunction1((t0: ReactPointerEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerEnterCaptureUndefined: Self = StObject.set(x, "onPointerEnterCapture", js.undefined)
      
      inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      inline def setOnPointerLeave(value: ReactPointerEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1((t0: ReactPointerEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerLeaveCapture(value: ReactPointerEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerLeaveCapture", js.Any.fromFunction1((t0: ReactPointerEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerLeaveCaptureUndefined: Self = StObject.set(x, "onPointerLeaveCapture", js.undefined)
      
      inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      inline def setOnPointerMove(value: ReactPointerEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1((t0: ReactPointerEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerMoveCapture(value: ReactPointerEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerMoveCapture", js.Any.fromFunction1((t0: ReactPointerEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerMoveCaptureUndefined: Self = StObject.set(x, "onPointerMoveCapture", js.undefined)
      
      inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      inline def setOnPointerOut(value: ReactPointerEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1((t0: ReactPointerEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerOutCapture(value: ReactPointerEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerOutCapture", js.Any.fromFunction1((t0: ReactPointerEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerOutCaptureUndefined: Self = StObject.set(x, "onPointerOutCapture", js.undefined)
      
      inline def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
      
      inline def setOnPointerOver(value: ReactPointerEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1((t0: ReactPointerEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerOverCapture(value: ReactPointerEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerOverCapture", js.Any.fromFunction1((t0: ReactPointerEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerOverCaptureUndefined: Self = StObject.set(x, "onPointerOverCapture", js.undefined)
      
      inline def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
      
      inline def setOnPointerUp(value: ReactPointerEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1((t0: ReactPointerEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerUpCapture(value: ReactPointerEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerUpCapture", js.Any.fromFunction1((t0: ReactPointerEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerUpCaptureUndefined: Self = StObject.set(x, "onPointerUpCapture", js.undefined)
      
      inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      inline def setOnScroll(value: ReactUIEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onScroll", js.Any.fromFunction1((t0: ReactUIEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnScrollCapture(value: ReactUIEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onScrollCapture", js.Any.fromFunction1((t0: ReactUIEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnScrollCaptureUndefined: Self = StObject.set(x, "onScrollCapture", js.undefined)
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setOnTouchCancel(value: ReactTouchEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1((t0: ReactTouchEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnTouchCancelCapture(value: ReactTouchEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTouchCancelCapture", js.Any.fromFunction1((t0: ReactTouchEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnTouchCancelCaptureUndefined: Self = StObject.set(x, "onTouchCancelCapture", js.undefined)
      
      inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      inline def setOnTouchEnd(value: ReactTouchEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1((t0: ReactTouchEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnTouchEndCapture(value: ReactTouchEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTouchEndCapture", js.Any.fromFunction1((t0: ReactTouchEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnTouchEndCaptureUndefined: Self = StObject.set(x, "onTouchEndCapture", js.undefined)
      
      inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      inline def setOnTouchMove(value: ReactTouchEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1((t0: ReactTouchEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnTouchMoveCapture(value: ReactTouchEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTouchMoveCapture", js.Any.fromFunction1((t0: ReactTouchEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnTouchMoveCaptureUndefined: Self = StObject.set(x, "onTouchMoveCapture", js.undefined)
      
      inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      inline def setOnTouchStart(value: ReactTouchEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1((t0: ReactTouchEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnTouchStartCapture(value: ReactTouchEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTouchStartCapture", js.Any.fromFunction1((t0: ReactTouchEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnTouchStartCaptureUndefined: Self = StObject.set(x, "onTouchStartCapture", js.undefined)
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      inline def setOnTransitionEnd(value: ReactTransitionEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1((t0: ReactTransitionEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnTransitionEndCapture(value: ReactTransitionEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTransitionEndCapture", js.Any.fromFunction1((t0: ReactTransitionEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnTransitionEndCaptureUndefined: Self = StObject.set(x, "onTransitionEndCapture", js.undefined)
      
      inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      inline def setOnWheel(value: ReactWheelEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onWheel", js.Any.fromFunction1((t0: ReactWheelEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnWheelCapture(value: ReactWheelEventFrom[T & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onWheelCapture", js.Any.fromFunction1((t0: ReactWheelEventFrom[T & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnWheelCaptureUndefined: Self = StObject.set(x, "onWheelCapture", js.undefined)
      
      inline def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      inline def setRole(value: AriaRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSuppressContentEditableWarning(value: Boolean): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
      
      inline def setSuppressHydrationWarning(value: Boolean): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait WidgetProps extends StObject {
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var messages: js.UndefOr[UserProvidedMessages] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
  }
  object WidgetProps {
    
    inline def apply(): WidgetProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WidgetProps]
    }
    
    extension [Self <: WidgetProps](x: Self) {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setMessages(value: UserProvidedMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    }
  }
}
