package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.std.InstanceType
import typingsJapgolly.wixUiCore.anon.AriaActivedescendant
import typingsJapgolly.wixUiCore.anon.FilterPredicate
import typingsJapgolly.wixUiCore.distEsSrcComponentsDropdownConstantsMod.OPEN_TRIGGER_TYPE
import typingsJapgolly.wixUiCore.distEsSrcComponentsDropdownContentDropdownContentMod.IDOMid
import typingsJapgolly.wixUiCore.distEsSrcComponentsDropdownOptionOptionFactoryMod.Option
import typingsJapgolly.wixUiCore.distEsSrcComponentsInputInputMod.InputProps
import typingsJapgolly.wixUiCore.distEsSrcComponentsPopoverPopoverMod.AppendTo
import typingsJapgolly.wixUiCore.distEsSrcComponentsPopoverPopoverMod.Placement
import typingsJapgolly.wixUiCore.distEsSrcComponentsPopoverUtilsGetModifiersMod.MoveBy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsInputWithOptionsInputWithOptionsMod {
  
  object DataHooks {
    
    @JSImport("wix-ui-core/dist/es/src/components/input-with-options/InputWithOptions", "DataHooks")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/es/src/components/input-with-options/InputWithOptions", "DataHooks.emptyState")
    @js.native
    def emptyState: String = js.native
    inline def emptyState_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emptyState")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/es/src/components/input-with-options/InputWithOptions", "DataHooks.input")
    @js.native
    def input: String = js.native
    inline def input_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("input")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("wix-ui-core/dist/es/src/components/input-with-options/InputWithOptions", "InputWithOptions")
  @js.native
  open class InputWithOptions protected () extends PureComponent[InputWithOptionsProps, InputWithOptionsState, Any] {
    def this(props: InputWithOptionsProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: InputWithOptionsProps, context: Any) = this()
    
    def _filterOptions(): js.Array[Option] = js.native
    
    def _onBlur(event: ReactFocusEventFrom[HTMLInputElement]): Unit = js.native
    
    def _onContentMouseDown(e: Any): Unit = js.native
    
    def _onFocus(event: ReactFocusEventFrom[HTMLInputElement]): Unit = js.native
    
    def _onKeyDown(event: ReactKeyboardEventFrom[HTMLInputElement]): Unit = js.native
    
    def _onSelect(): Unit = js.native
    def _onSelect(option: Option): Unit = js.native
    
    def _setDropDownRef(
      ref: InstanceType[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DropdownComponent */ Any
        ]
    ): Unit = js.native
    
    def changeExpanded(isExpanded: Boolean): Unit = js.native
    
    def close(): Unit = js.native
    
    var dropDownRef: (InstanceType[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DropdownComponent */ Any
      ]) | Null = js.native
    
    var isEditing: Boolean = js.native
    
    def onOptionHover(): Unit = js.native
    def onOptionHover(option: Option & IDOMid): Unit = js.native
    
    def open(): Unit = js.native
    
    @JSName("state")
    var state_InputWithOptions: AriaActivedescendant = js.native
  }
  /* static members */
  object InputWithOptions {
    
    @JSImport("wix-ui-core/dist/es/src/components/input-with-options/InputWithOptions", "InputWithOptions")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/es/src/components/input-with-options/InputWithOptions", "InputWithOptions.bypassDefaultPropsTypecheck")
    @js.native
    def bypassDefaultPropsTypecheck: Any = js.native
    inline def bypassDefaultPropsTypecheck_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bypassDefaultPropsTypecheck")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/es/src/components/input-with-options/InputWithOptions", "InputWithOptions.defaultProps")
    @js.native
    def defaultProps: FilterPredicate = js.native
    inline def defaultProps_=(x: FilterPredicate): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/es/src/components/input-with-options/InputWithOptions", "InputWithOptions.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined std.Pick<wix-ui-core.wix-ui-core/dist/es/src/components/popover.PopoverProps, 'fixed' | 'flip' | 'moveBy'> & std.Pick<wix-ui-core.wix-ui-core/dist/es/src/components/dropdown.DropdownProps, 'onContentMouseDown' | 'dynamicWidth'> & {  data-hook :string | undefined,   placement :wix-ui-core.wix-ui-core/dist/es/src/components/popover.Placement | undefined,   options :std.Array<wix-ui-core.wix-ui-core/dist/es/src/components/dropdown-option.Option>,   openTrigger :wix-ui-core.wix-ui-core/dist/es/src/components/dropdown/constants.OPEN_TRIGGER_TYPE | undefined,   onSelect :(option : wix-ui-core.wix-ui-core/dist/es/src/components/dropdown-option.Option): void | undefined,   onDeselect :(option : wix-ui-core.wix-ui-core/dist/es/src/components/dropdown-option.Option): void | undefined,   initialSelectedIds :std.Array<string | number> | undefined,   onInitialSelectedOptionsSet :(options : std.Array<wix-ui-core.wix-ui-core/dist/es/src/components/dropdown-option.Option>): void | undefined,   multi :boolean | undefined,   fixedHeader :react.react.ReactNode | undefined,   fixedFooter :react.react.ReactNode | undefined,   timeout :number | undefined,   onManualInput :(value : string): void | undefined,   highlightMatches :boolean | undefined,   forceContentElementVisibility :boolean | undefined,   inputProps :wix-ui-core.wix-ui-core/dist/es/src/components/input.InputProps | undefined,   style :object | undefined,   id :string | undefined,   allowReselect :boolean | undefined,   filterPredicate :(inputValue : string, optionValue : string): std.Boolean | undefined,   emptyStateMessage :string | undefined,   emptyStateStyle :react.react.CSSProperties | undefined,   optionsContainerZIndex :number | undefined,   appendTo :wix-ui-core.wix-ui-core/dist/es/src/components/popover.AppendTo | undefined,   className :string | undefined} */
  trait InputWithOptionsProps extends StObject {
    
    /** Allow onSelect event to be triggered upon re-selecting an option */
    var allowReselect: js.UndefOr[Boolean] = js.undefined
    
    /** Enables calculations in relation to a dom element */
    var appendTo: js.UndefOr[AppendTo] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /** hook for testing purposes */
    var `data-hook`: js.UndefOr[String] = js.undefined
    
    var dynamicWidth: js.UndefOr[Boolean] = js.undefined
    
    /** Empty state message to be displayed in case all options are filtered out */
    var emptyStateMessage: js.UndefOr[String] = js.undefined
    
    /** Inline style to be passed to empty state message */
    var emptyStateStyle: js.UndefOr[CSSProperties] = js.undefined
    
    /** Filter by predicate */
    var filterPredicate: js.UndefOr[js.Function2[/* inputValue */ String, /* optionValue */ String, Boolean]] = js.undefined
    
    var fixed: js.UndefOr[Boolean] = js.undefined
    
    /** An element that always appears at the bottom of the options */
    var fixedFooter: js.UndefOr[Node] = js.undefined
    
    /** An element that always appears at the top of the options */
    var fixedHeader: js.UndefOr[Node] = js.undefined
    
    var flip: js.UndefOr[Boolean] = js.undefined
    
    /** If set to true, content element will always be visible, used for preview mode */
    var forceContentElementVisibility: js.UndefOr[Boolean] = js.undefined
    
    /** Should mark the text that matched the filter */
    var highlightMatches: js.UndefOr[Boolean] = js.undefined
    
    /** Id */
    var id: js.UndefOr[String] = js.undefined
    
    /** initial selected option ids */
    var initialSelectedIds: js.UndefOr[js.Array[String | Double]] = js.undefined
    
    /** Input prop types */
    var inputProps: js.UndefOr[InputProps] = js.undefined
    
    var moveBy: js.UndefOr[MoveBy] = js.undefined
    
    /** set true for multiple selection, false for single */
    var multi: js.UndefOr[Boolean] = js.undefined
    
    var onContentMouseDown: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[Element], Unit]] = js.undefined
    
    /** Handler for when an option is deselected */
    var onDeselect: js.UndefOr[js.Function1[/* option */ Option, Unit]] = js.undefined
    
    /** A callback for when initial selected options are set */
    var onInitialSelectedOptionsSet: js.UndefOr[js.Function1[/* options */ js.Array[Option], Unit]] = js.undefined
    
    /** Callback when the user pressed the Enter key or Tab key after he wrote in the Input field - meaning the user selected something not in the list  */
    var onManualInput: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
    
    /** Handler for when an option is selected */
    var onSelect: js.UndefOr[js.Function1[/* option */ Option, Unit]] = js.undefined
    
    /** Trigger type to open the content */
    var openTrigger: js.UndefOr[OPEN_TRIGGER_TYPE] = js.undefined
    
    /** The dropdown options array */
    var options: js.Array[Option]
    
    /** Options box z-index */
    var optionsContainerZIndex: js.UndefOr[Double] = js.undefined
    
    /** The location to display the content */
    var placement: js.UndefOr[Placement] = js.undefined
    
    /** Inline styles */
    var style: js.UndefOr[js.Object] = js.undefined
    
    /** Animation timer */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object InputWithOptionsProps {
    
    inline def apply(options: js.Array[Option]): InputWithOptionsProps = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputWithOptionsProps]
    }
    
    extension [Self <: InputWithOptionsProps](x: Self) {
      
      inline def setAllowReselect(value: Boolean): Self = StObject.set(x, "allowReselect", value.asInstanceOf[js.Any])
      
      inline def setAllowReselectUndefined: Self = StObject.set(x, "allowReselect", js.undefined)
      
      inline def setAppendTo(value: AppendTo): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      inline def setAppendToFunction1(value: /* s */ Element => Boolean): Self = StObject.set(x, "appendTo", js.Any.fromFunction1(value))
      
      inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def `setData-hook`(value: String): Self = StObject.set(x, "data-hook", value.asInstanceOf[js.Any])
      
      inline def `setData-hookUndefined`: Self = StObject.set(x, "data-hook", js.undefined)
      
      inline def setDynamicWidth(value: Boolean): Self = StObject.set(x, "dynamicWidth", value.asInstanceOf[js.Any])
      
      inline def setDynamicWidthUndefined: Self = StObject.set(x, "dynamicWidth", js.undefined)
      
      inline def setEmptyStateMessage(value: String): Self = StObject.set(x, "emptyStateMessage", value.asInstanceOf[js.Any])
      
      inline def setEmptyStateMessageUndefined: Self = StObject.set(x, "emptyStateMessage", js.undefined)
      
      inline def setEmptyStateStyle(value: CSSProperties): Self = StObject.set(x, "emptyStateStyle", value.asInstanceOf[js.Any])
      
      inline def setEmptyStateStyleUndefined: Self = StObject.set(x, "emptyStateStyle", js.undefined)
      
      inline def setFilterPredicate(value: (/* inputValue */ String, /* optionValue */ String) => Boolean): Self = StObject.set(x, "filterPredicate", js.Any.fromFunction2(value))
      
      inline def setFilterPredicateUndefined: Self = StObject.set(x, "filterPredicate", js.undefined)
      
      inline def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setFixedFooter(value: VdomNode): Self = StObject.set(x, "fixedFooter", value.rawNode.asInstanceOf[js.Any])
      
      inline def setFixedFooterNull: Self = StObject.set(x, "fixedFooter", null)
      
      inline def setFixedFooterUndefined: Self = StObject.set(x, "fixedFooter", js.undefined)
      
      inline def setFixedFooterVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "fixedFooter", js.Array(value*))
      
      inline def setFixedFooterVdomElement(value: VdomElement): Self = StObject.set(x, "fixedFooter", value.rawElement.asInstanceOf[js.Any])
      
      inline def setFixedHeader(value: VdomNode): Self = StObject.set(x, "fixedHeader", value.rawNode.asInstanceOf[js.Any])
      
      inline def setFixedHeaderNull: Self = StObject.set(x, "fixedHeader", null)
      
      inline def setFixedHeaderUndefined: Self = StObject.set(x, "fixedHeader", js.undefined)
      
      inline def setFixedHeaderVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "fixedHeader", js.Array(value*))
      
      inline def setFixedHeaderVdomElement(value: VdomElement): Self = StObject.set(x, "fixedHeader", value.rawElement.asInstanceOf[js.Any])
      
      inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      inline def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      inline def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
      
      inline def setForceContentElementVisibility(value: Boolean): Self = StObject.set(x, "forceContentElementVisibility", value.asInstanceOf[js.Any])
      
      inline def setForceContentElementVisibilityUndefined: Self = StObject.set(x, "forceContentElementVisibility", js.undefined)
      
      inline def setHighlightMatches(value: Boolean): Self = StObject.set(x, "highlightMatches", value.asInstanceOf[js.Any])
      
      inline def setHighlightMatchesUndefined: Self = StObject.set(x, "highlightMatches", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInitialSelectedIds(value: js.Array[String | Double]): Self = StObject.set(x, "initialSelectedIds", value.asInstanceOf[js.Any])
      
      inline def setInitialSelectedIdsUndefined: Self = StObject.set(x, "initialSelectedIds", js.undefined)
      
      inline def setInitialSelectedIdsVarargs(value: (String | Double)*): Self = StObject.set(x, "initialSelectedIds", js.Array(value*))
      
      inline def setInputProps(value: InputProps): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      inline def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
      
      inline def setMoveBy(value: MoveBy): Self = StObject.set(x, "moveBy", value.asInstanceOf[js.Any])
      
      inline def setMoveByUndefined: Self = StObject.set(x, "moveBy", js.undefined)
      
      inline def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
      
      inline def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
      
      inline def setOnContentMouseDown(value: /* e */ ReactMouseEventFrom[Element] => Callback): Self = StObject.set(x, "onContentMouseDown", js.Any.fromFunction1((t0: /* e */ ReactMouseEventFrom[Element]) => value(t0).runNow()))
      
      inline def setOnContentMouseDownUndefined: Self = StObject.set(x, "onContentMouseDown", js.undefined)
      
      inline def setOnDeselect(value: /* option */ Option => Callback): Self = StObject.set(x, "onDeselect", js.Any.fromFunction1((t0: /* option */ Option) => value(t0).runNow()))
      
      inline def setOnDeselectUndefined: Self = StObject.set(x, "onDeselect", js.undefined)
      
      inline def setOnInitialSelectedOptionsSet(value: /* options */ js.Array[Option] => Callback): Self = StObject.set(x, "onInitialSelectedOptionsSet", js.Any.fromFunction1((t0: /* options */ js.Array[Option]) => value(t0).runNow()))
      
      inline def setOnInitialSelectedOptionsSetUndefined: Self = StObject.set(x, "onInitialSelectedOptionsSet", js.undefined)
      
      inline def setOnManualInput(value: /* value */ String => Callback): Self = StObject.set(x, "onManualInput", js.Any.fromFunction1((t0: /* value */ String) => value(t0).runNow()))
      
      inline def setOnManualInputUndefined: Self = StObject.set(x, "onManualInput", js.undefined)
      
      inline def setOnSelect(value: /* option */ Option => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction1((t0: /* option */ Option) => value(t0).runNow()))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOpenTrigger(value: OPEN_TRIGGER_TYPE): Self = StObject.set(x, "openTrigger", value.asInstanceOf[js.Any])
      
      inline def setOpenTriggerUndefined: Self = StObject.set(x, "openTrigger", js.undefined)
      
      inline def setOptions(value: js.Array[Option]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsContainerZIndex(value: Double): Self = StObject.set(x, "optionsContainerZIndex", value.asInstanceOf[js.Any])
      
      inline def setOptionsContainerZIndexUndefined: Self = StObject.set(x, "optionsContainerZIndex", js.undefined)
      
      inline def setOptionsVarargs(value: Option*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait InputWithOptionsState extends StObject {
    
    var ariaActivedescendant: String | Null
    
    var ariaExpanded: Boolean
  }
  object InputWithOptionsState {
    
    inline def apply(ariaExpanded: Boolean): InputWithOptionsState = {
      val __obj = js.Dynamic.literal(ariaExpanded = ariaExpanded.asInstanceOf[js.Any], ariaActivedescendant = null)
      __obj.asInstanceOf[InputWithOptionsState]
    }
    
    extension [Self <: InputWithOptionsState](x: Self) {
      
      inline def setAriaActivedescendant(value: String): Self = StObject.set(x, "ariaActivedescendant", value.asInstanceOf[js.Any])
      
      inline def setAriaActivedescendantNull: Self = StObject.set(x, "ariaActivedescendant", null)
      
      inline def setAriaExpanded(value: Boolean): Self = StObject.set(x, "ariaExpanded", value.asInstanceOf[js.Any])
    }
  }
}
