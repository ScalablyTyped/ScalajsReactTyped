package typingsJapgolly.reactMdUtils

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.RefFn
import org.scalajs.dom.DOMRect
import org.scalajs.dom.Document
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLSpanElement
import org.scalajs.dom.Window
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.DependencyList
import typingsJapgolly.react.mod.EffectCallback
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.KeyboardEventHandler
import typingsJapgolly.react.mod.MutableRefObject
import typingsJapgolly.react.mod.Provider
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactMdUtils.anon.AppSizeinitializedboolean
import typingsJapgolly.reactMdUtils.anon.Current
import typingsJapgolly.reactMdUtils.anon.ReadonlyActiveDescendantC
import typingsJapgolly.reactMdUtils.anon.ReadonlyKeyboardFocusCont
import typingsJapgolly.reactMdUtils.reactMdUtilsStrings.height
import typingsJapgolly.reactMdUtils.reactMdUtilsStrings.max
import typingsJapgolly.reactMdUtils.reactMdUtilsStrings.min
import typingsJapgolly.reactMdUtils.reactMdUtilsStrings.width
import typingsJapgolly.reactMdUtils.typesBemMod.BEMResult
import typingsJapgolly.reactMdUtils.typesBemMod.Block
import typingsJapgolly.reactMdUtils.typesColorsHexToRGBMod.BlueBit
import typingsJapgolly.reactMdUtils.typesColorsHexToRGBMod.GreenBit
import typingsJapgolly.reactMdUtils.typesColorsHexToRGBMod.HexString
import typingsJapgolly.reactMdUtils.typesColorsHexToRGBMod.RedBit
import typingsJapgolly.reactMdUtils.typesColorsIsContrastCompliantMod.ContrastRatioCompliance
import typingsJapgolly.reactMdUtils.typesContainsElementMod.CheckableThing
import typingsJapgolly.reactMdUtils.typesDirMod.DirProps
import typingsJapgolly.reactMdUtils.typesDirMod.WritingDirection
import typingsJapgolly.reactMdUtils.typesDirMod.WritingDirectionContext
import typingsJapgolly.reactMdUtils.typesEventsScrollListenerMod.ScrollListenerProps
import typingsJapgolly.reactMdUtils.typesEventsUseScrollListenerMod.ScrollListenerHookOptions
import typingsJapgolly.reactMdUtils.typesEventsUtilsMod.DelegatedEventHandler
import typingsJapgolly.reactMdUtils.typesEventsUtilsMod.DelegatedEventTarget
import typingsJapgolly.reactMdUtils.typesGetPercentageMod.GetPercentageOptions
import typingsJapgolly.reactMdUtils.typesHoverHoverModeProviderMod.HoverModeProviderProps
import typingsJapgolly.reactMdUtils.typesHoverUseHoverModeContextMod.HoverModeContext
import typingsJapgolly.reactMdUtils.typesHoverUseHoverModeMod.HoverModeHookReturnValue
import typingsJapgolly.reactMdUtils.typesHoverUseHoverModeMod.HoverModeOptions
import typingsJapgolly.reactMdUtils.typesKeyboardMovementActiveDescendantContextMod.ActiveDescendantContext
import typingsJapgolly.reactMdUtils.typesKeyboardMovementActiveDescendantMovementProviderMod.ActiveDescendantMovementProviderProps
import typingsJapgolly.reactMdUtils.typesKeyboardMovementKeyboardMovementProviderMod.KeyboardMovementProviderProps
import typingsJapgolly.reactMdUtils.typesKeyboardMovementTypesMod.KeyboardFocusContext
import typingsJapgolly.reactMdUtils.typesKeyboardMovementUseActiveDescendantFocusMod.ActiveDescendantFocusHookOptions
import typingsJapgolly.reactMdUtils.typesKeyboardMovementUseActiveDescendantFocusMod.ActiveDescendantFocusHookReturnValue
import typingsJapgolly.reactMdUtils.typesKeyboardMovementUseActiveDescendantMod.ActiveDescendantHookOptions
import typingsJapgolly.reactMdUtils.typesKeyboardMovementUseActiveDescendantMod.ActiveDescendantHookReturnValue
import typingsJapgolly.reactMdUtils.typesKeyboardMovementUseKeyboardFocusMod.KeyboardFocusHookOptions
import typingsJapgolly.reactMdUtils.typesKeyboardMovementUseKeyboardFocusMod.KeyboardFocusHookReturnValue
import typingsJapgolly.reactMdUtils.typesLayoutGridCellMod.GridCellProps
import typingsJapgolly.reactMdUtils.typesLayoutGridListCellMod.GridListCellProps
import typingsJapgolly.reactMdUtils.typesLayoutGridListMod.GridListProps
import typingsJapgolly.reactMdUtils.typesLayoutGridMod.GridProps
import typingsJapgolly.reactMdUtils.typesLayoutUseGridListMod.GridListSize
import typingsJapgolly.reactMdUtils.typesLayoutUseGridListMod.UseGridListOptions
import typingsJapgolly.reactMdUtils.typesLayoutUseGridListMod.UseGridListReturnValue
import typingsJapgolly.reactMdUtils.typesLoopMod.LoopOptions
import typingsJapgolly.reactMdUtils.typesModeTypesMod.UserInteractionMode
import typingsJapgolly.reactMdUtils.typesModeUserInteractionModeListenerMod.UserInteractionModeListenerProps
import typingsJapgolly.reactMdUtils.typesPositioningTypesMod.Coords
import typingsJapgolly.reactMdUtils.typesPositioningTypesMod.FixedPosition
import typingsJapgolly.reactMdUtils.typesPositioningTypesMod.FixedPositionOptions
import typingsJapgolly.reactMdUtils.typesPositioningTypesMod.PositionAnchor
import typingsJapgolly.reactMdUtils.typesSearchCaseInsensitiveFilterMod.CaseInsensitiveOptions
import typingsJapgolly.reactMdUtils.typesSearchUseKeyboardSearchMod.KeyboardSearchOptions
import typingsJapgolly.reactMdUtils.typesSearchUtilsMod.GetItemValue_
import typingsJapgolly.reactMdUtils.typesSearchUtilsMod.SearchOptions
import typingsJapgolly.reactMdUtils.typesSizingAppSizeListenerMod.AppSizeListenerProps
import typingsJapgolly.reactMdUtils.typesSizingConstantsMod.QuerySize
import typingsJapgolly.reactMdUtils.typesSizingMediaOnlyMod.MediaOnlyProps
import typingsJapgolly.reactMdUtils.typesSizingResizeListenerMod.ResizeListenerProps
import typingsJapgolly.reactMdUtils.typesSizingUseAppSizeMediaMod.AppSize
import typingsJapgolly.reactMdUtils.typesSizingUseAppSizeMediaMod.AppSizeOptions
import typingsJapgolly.reactMdUtils.typesSizingUseResizeListenerMod.ResizeListenerOptions
import typingsJapgolly.reactMdUtils.typesSizingUseResizeObserverMod.OnResizeObserverChange
import typingsJapgolly.reactMdUtils.typesSizingUseResizeObserverMod.UseResizeObserverOptions
import typingsJapgolly.reactMdUtils.typesSizingUseWidthMediaQueryMod.WidthMediaQuery
import typingsJapgolly.reactMdUtils.typesSizingUseWidthMediaQueryMod.WidthMediaQuerys
import typingsJapgolly.reactMdUtils.typesThrottleMod.ThrottleableFunction
import typingsJapgolly.reactMdUtils.typesThrottleMod.ThrottledFunction
import typingsJapgolly.reactMdUtils.typesTypesMod.PropsWithRef
import typingsJapgolly.reactMdUtils.typesUnitToNumberMod.UnitToNumberOptions
import typingsJapgolly.reactMdUtils.typesUseCloseOnOutsideClickMod.CloseOnOutsideClickOptions
import typingsJapgolly.reactMdUtils.typesUseDropzoneMod.DropzoneHandlers
import typingsJapgolly.reactMdUtils.typesUseDropzoneMod.DropzoneHookReturnValue
import typingsJapgolly.reactMdUtils.typesUseEnsuredRefMod.EnsuredRefs
import typingsJapgolly.reactMdUtils.typesUseIntervalMod.ReturnValue
import typingsJapgolly.reactMdUtils.typesWiaAriaFocusContainerMod.FocusContainerProps
import typingsJapgolly.reactMdUtils.typesWiaAriaFocusElementWithinMod.Focus
import typingsJapgolly.reactMdUtils.typesWiaAriaGetInstanceMod.RefOrInstance
import typingsJapgolly.reactMdUtils.typesWiaAriaIsFocusableMod.ElementFocusType
import typingsJapgolly.reactMdUtils.typesWiaAriaMovementTypesMod.MovementConfig
import typingsJapgolly.reactMdUtils.typesWiaAriaMovementUseActiveDescendantMovementMod.ActiveDescendantMovementProviders
import typingsJapgolly.reactMdUtils.typesWiaAriaMovementUseActiveDescendantMovementMod.ActiveDescendantOptions
import typingsJapgolly.reactMdUtils.typesWiaAriaMovementUseFocusMovementMod.KeyboardFocusOptions
import typingsJapgolly.reactMdUtils.typesWiaAriaMovementUseKeyboardMovementMod.KeyboardMovementOptions
import typingsJapgolly.reactMdUtils.typesWiaAriaMovementUseKeyboardMovementMod.KeyboardMovementProviders
import typingsJapgolly.reactMdUtils.typesWiaAriaRadioRadioGroupMod.RadioGroupProps
import typingsJapgolly.reactMdUtils.typesWiaAriaRadioRadioWidgetMod.RadioWidgetProps
import typingsJapgolly.reactMdUtils.typesWiaAriaRadioTypesMod.RadioItem
import typingsJapgolly.reactMdUtils.typesWiaAriaRadioTypesMod.RadioItemStyleObject
import typingsJapgolly.reactMdUtils.typesWiaAriaTryToSubmitRelatedFormMod.KeyboardSubmitEventPartial
import typingsJapgolly.reactMdUtils.typesWiaAriaUsePreviousFocusMod.FocusFallback
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.Omit
import typingsJapgolly.std.OrientationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/utils", "AAA_CONTRAST_RATIO")
  @js.native
  val AAA_CONTRAST_RATIO: /* 7 */ Double = js.native
  
  @JSImport("@react-md/utils", "ABOVE_CENTER_ANCHOR")
  @js.native
  val ABOVE_CENTER_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "ABOVE_INNER_LEFT_ANCHOR")
  @js.native
  val ABOVE_INNER_LEFT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "ABOVE_INNER_RIGHT_ANCHOR")
  @js.native
  val ABOVE_INNER_RIGHT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "ABOVE_LEFT_ANCHOR")
  @js.native
  val ABOVE_LEFT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "ABOVE_RIGHT_ANCHOR")
  @js.native
  val ABOVE_RIGHT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "ActiveDescendantContextProvider")
  @js.native
  val ActiveDescendantContextProvider: Provider[ActiveDescendantContext] = js.native
  
  inline def ActiveDescendantMovementProvider(hasChildrenActiveIdSetActiveId: ActiveDescendantMovementProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ActiveDescendantMovementProvider")(hasChildrenActiveIdSetActiveId.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@react-md/utils", "AppSizeContext")
  @js.native
  val AppSizeContext: Context[AppSizeinitializedboolean] = js.native
  
  inline def AppSizeListener(
    hasChildrenOnChangePhoneMaxWidthTabletMinWidthTabletMaxWidthDesktopMinWidthDesktopLargeMinWidthDefaultSize: AppSizeListenerProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("AppSizeListener")(hasChildrenOnChangePhoneMaxWidthTabletMinWidthTabletMaxWidthDesktopMinWidthDesktopLargeMinWidthDefaultSize.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@react-md/utils", "BELOW_CENTER_ANCHOR")
  @js.native
  val BELOW_CENTER_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "BELOW_INNER_LEFT_ANCHOR")
  @js.native
  val BELOW_INNER_LEFT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "BELOW_INNER_RIGHT_ANCHOR")
  @js.native
  val BELOW_INNER_RIGHT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "BELOW_LEFT_ANCHOR")
  @js.native
  val BELOW_LEFT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "BELOW_RIGHT_ANCHOR")
  @js.native
  val BELOW_RIGHT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "BOTTOM_CENTER_ANCHOR")
  @js.native
  val BOTTOM_CENTER_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "BOTTOM_INNER_LEFT_ANCHOR")
  @js.native
  val BOTTOM_INNER_LEFT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "BOTTOM_INNER_RIGHT_ANCHOR")
  @js.native
  val BOTTOM_INNER_RIGHT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "BOTTOM_LEFT_ANCHOR")
  @js.native
  val BOTTOM_LEFT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "BOTTOM_RIGHT_ANCHOR")
  @js.native
  val BOTTOM_RIGHT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "CELL_MARGIN_VAR")
  @js.native
  val CELL_MARGIN_VAR: /* "--rmd-cell-margin" */ String = js.native
  
  @JSImport("@react-md/utils", "CELL_SIZE_VAR")
  @js.native
  val CELL_SIZE_VAR: /* "--rmd-cell-size" */ String = js.native
  
  @JSImport("@react-md/utils", "CENTER_CENTER_ANCHOR")
  @js.native
  val CENTER_CENTER_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "CENTER_INNER_LEFT_ANCHOR")
  @js.native
  val CENTER_INNER_LEFT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "CENTER_INNER_RIGHT_ANCHOR")
  @js.native
  val CENTER_INNER_RIGHT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "CENTER_LEFT_ANCHOR")
  @js.native
  val CENTER_LEFT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "CENTER_RIGHT_ANCHOR")
  @js.native
  val CENTER_RIGHT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "DATA_RMD_NOSCROLL")
  @js.native
  val DATA_RMD_NOSCROLL: /* "data-rmd-noscroll" */ String = js.native
  
  @JSImport("@react-md/utils", "DEFAULT_APP_SIZE")
  @js.native
  val DEFAULT_APP_SIZE: AppSize = js.native
  
  @JSImport("@react-md/utils", "DEFAULT_DESKTOP_LARGE_MIN_WIDTH")
  @js.native
  val DEFAULT_DESKTOP_LARGE_MIN_WIDTH: QuerySize = js.native
  
  @JSImport("@react-md/utils", "DEFAULT_DESKTOP_MIN_WIDTH")
  @js.native
  val DEFAULT_DESKTOP_MIN_WIDTH: QuerySize = js.native
  
  inline def DEFAULT_DIR(): WritingDirection = ^.asInstanceOf[js.Dynamic].applyDynamic("DEFAULT_DIR")().asInstanceOf[WritingDirection]
  
  @JSImport("@react-md/utils", "DEFAULT_GET_ITEM_VALUE")
  @js.native
  val DEFAULT_GET_ITEM_VALUE: js.Function2[/* item */ Any, /* valueKey */ js.UndefOr[String], String] = js.native
  
  @JSImport("@react-md/utils", "DEFAULT_GRID_LIST_MAX_CELL_SIZE")
  @js.native
  val DEFAULT_GRID_LIST_MAX_CELL_SIZE: /* 150 */ Double = js.native
  
  @JSImport("@react-md/utils", "DEFAULT_GRID_LIST_PADDING")
  @js.native
  val DEFAULT_GRID_LIST_PADDING: /* 16 */ Double = js.native
  
  @JSImport("@react-md/utils", "DEFAULT_HOVER_MODE_DEACTIVATION_TIME")
  @js.native
  val DEFAULT_HOVER_MODE_DEACTIVATION_TIME: /* 1000 */ Double = js.native
  
  @JSImport("@react-md/utils", "DEFAULT_HOVER_MODE_EXIT_TIME")
  @js.native
  val DEFAULT_HOVER_MODE_EXIT_TIME: /* 300 */ Double = js.native
  
  @JSImport("@react-md/utils", "DEFAULT_HOVER_MODE_VISIBLE_IN_TIME")
  @js.native
  val DEFAULT_HOVER_MODE_VISIBLE_IN_TIME: /* 1000 */ Double = js.native
  
  @JSImport("@react-md/utils", "DEFAULT_IGNORE_WHITESPACE")
  @js.native
  val DEFAULT_IGNORE_WHITESPACE: /* false */ Boolean = js.native
  
  /* Inlined std.Readonly<@react-md/utils.@react-md/utils/types/keyboardMovement/types.KeyboardMovementConfig> */
  object DEFAULT_KEYBOARD_MOVEMENT {
    
    @JSImport("@react-md/utils", "DEFAULT_KEYBOARD_MOVEMENT.decrementKeys")
    @js.native
    val decrementKeys: js.Array[String] = js.native
    
    @JSImport("@react-md/utils", "DEFAULT_KEYBOARD_MOVEMENT.incrementKeys")
    @js.native
    val incrementKeys: js.Array[String] = js.native
    
    @JSImport("@react-md/utils", "DEFAULT_KEYBOARD_MOVEMENT.jumpToFirstKeys")
    @js.native
    val jumpToFirstKeys: js.Array[String] = js.native
    
    @JSImport("@react-md/utils", "DEFAULT_KEYBOARD_MOVEMENT.jumpToLastKeys")
    @js.native
    val jumpToLastKeys: js.Array[String] = js.native
  }
  
  /* Inlined std.Readonly<@react-md/utils.@react-md/utils/types/keyboardMovement/types.KeyboardMovementConfig> */
  object DEFAULT_LTR_KEYBOARD_MOVEMENT {
    
    @JSImport("@react-md/utils", "DEFAULT_LTR_KEYBOARD_MOVEMENT.decrementKeys")
    @js.native
    val decrementKeys: js.Array[String] = js.native
    
    @JSImport("@react-md/utils", "DEFAULT_LTR_KEYBOARD_MOVEMENT.incrementKeys")
    @js.native
    val incrementKeys: js.Array[String] = js.native
    
    @JSImport("@react-md/utils", "DEFAULT_LTR_KEYBOARD_MOVEMENT.jumpToFirstKeys")
    @js.native
    val jumpToFirstKeys: js.Array[String] = js.native
    
    @JSImport("@react-md/utils", "DEFAULT_LTR_KEYBOARD_MOVEMENT.jumpToLastKeys")
    @js.native
    val jumpToLastKeys: js.Array[String] = js.native
  }
  
  @JSImport("@react-md/utils", "DEFAULT_PHONE_MAX_WIDTH")
  @js.native
  val DEFAULT_PHONE_MAX_WIDTH: QuerySize = js.native
  
  /* Inlined std.Readonly<@react-md/utils.@react-md/utils/types/keyboardMovement/types.KeyboardMovementConfig> */
  object DEFAULT_RTL_KEYBOARD_MOVEMENT {
    
    @JSImport("@react-md/utils", "DEFAULT_RTL_KEYBOARD_MOVEMENT.decrementKeys")
    @js.native
    val decrementKeys: js.Array[String] = js.native
    
    @JSImport("@react-md/utils", "DEFAULT_RTL_KEYBOARD_MOVEMENT.incrementKeys")
    @js.native
    val incrementKeys: js.Array[String] = js.native
    
    @JSImport("@react-md/utils", "DEFAULT_RTL_KEYBOARD_MOVEMENT.jumpToFirstKeys")
    @js.native
    val jumpToFirstKeys: js.Array[String] = js.native
    
    @JSImport("@react-md/utils", "DEFAULT_RTL_KEYBOARD_MOVEMENT.jumpToLastKeys")
    @js.native
    val jumpToLastKeys: js.Array[String] = js.native
  }
  
  /* Inlined std.Required<@react-md/utils.@react-md/utils/types/search/utils.SearchOptions<unknown>> */
  object DEFAULT_SEARCH_OPTIONS {
    
    @JSImport("@react-md/utils", "DEFAULT_SEARCH_OPTIONS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-md/utils", "DEFAULT_SEARCH_OPTIONS.getItemValue")
    @js.native
    def getItemValue: GetItemValue_[Any] = js.native
    inline def getItemValue_=(x: GetItemValue_[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getItemValue")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-md/utils", "DEFAULT_SEARCH_OPTIONS.ignoreWhitespace")
    @js.native
    def ignoreWhitespace: Boolean = js.native
    inline def ignoreWhitespace_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ignoreWhitespace")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-md/utils", "DEFAULT_SEARCH_OPTIONS.trim")
    @js.native
    def trim: Boolean = js.native
    inline def trim_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trim")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-md/utils", "DEFAULT_SEARCH_OPTIONS.valueKey")
    @js.native
    def valueKey: String = js.native
    inline def valueKey_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("valueKey")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@react-md/utils", "DEFAULT_SEARCH_RESET_TIME")
  @js.native
  val DEFAULT_SEARCH_RESET_TIME: /* 500 */ Double = js.native
  
  @JSImport("@react-md/utils", "DEFAULT_TABLET_MAX_WIDTH")
  @js.native
  val DEFAULT_TABLET_MAX_WIDTH: QuerySize = js.native
  
  @JSImport("@react-md/utils", "DEFAULT_TABLET_MIN_WIDTH")
  @js.native
  val DEFAULT_TABLET_MIN_WIDTH: QuerySize = js.native
  
  @JSImport("@react-md/utils", "DEFAULT_TRIM")
  @js.native
  val DEFAULT_TRIM: /* true */ Boolean = js.native
  
  @JSImport("@react-md/utils", "DEFAULT_VALUE_KEY")
  @js.native
  val DEFAULT_VALUE_KEY: /* "value" */ String = js.native
  
  inline def DesktopOnly(hasChildrenFallback: MediaOnlyProps): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("DesktopOnly")(hasChildrenFallback.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  inline def Dir(hasChildrenDefaultDir: DirProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Dir")(hasChildrenDefaultDir.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@react-md/utils", "FOCUSABLE_ELEMENTS")
  @js.native
  val FOCUSABLE_ELEMENTS: js.Array[String] = js.native
  
  @JSImport("@react-md/utils", "FocusContainer")
  @js.native
  val FocusContainer: ForwardRefExoticComponent[FocusContainerProps & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/utils", "GRID_COLUMNS_VAR")
  @js.native
  val GRID_COLUMNS_VAR: /* "--rmd-grid-cols" */ String = js.native
  
  @JSImport("@react-md/utils", "GRID_GUTTER_VAR")
  @js.native
  val GRID_GUTTER_VAR: /* "--rmd-grid-gutter" */ String = js.native
  
  @JSImport("@react-md/utils", "Grid")
  @js.native
  val Grid: ForwardRefExoticComponent[GridProps & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/utils", "GridCell")
  @js.native
  val GridCell: ForwardRefExoticComponent[GridCellProps & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/utils", "GridList")
  @js.native
  val GridList: ForwardRefExoticComponent[GridListProps & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/utils", "GridListCell")
  @js.native
  val GridListCell: ForwardRefExoticComponent[GridListCellProps & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/utils", "GridListSizeProvider")
  @js.native
  val GridListSizeProvider: Provider[GridListSize] = js.native
  
  @JSImport("@react-md/utils", "HoverModeContextProvider")
  @js.native
  val HoverModeContextProvider: Provider[HoverModeContext] = js.native
  
  inline def HoverModeProvider(hasChildrenDisabledDefaultVisibleInTimeDeactivateTime: HoverModeProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("HoverModeProvider")(hasChildrenDisabledDefaultVisibleInTimeDeactivateTime.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@react-md/utils", "IncrementMovementKey")
  @js.native
  object IncrementMovementKey extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.reactMdUtils.typesWiaAriaMovementTypesMod.IncrementMovementKey & String
      ] = js.native
    
    /* "Alt+ArrowDown" */ val AltArrowDown: typingsJapgolly.reactMdUtils.typesWiaAriaMovementTypesMod.IncrementMovementKey.AltArrowDown & String = js.native
    
    /* "Alt+ArrowLeft" */ val AltArrowLeft: typingsJapgolly.reactMdUtils.typesWiaAriaMovementTypesMod.IncrementMovementKey.AltArrowLeft & String = js.native
    
    /* "Alt+ArrowRight" */ val AltArrowRight: typingsJapgolly.reactMdUtils.typesWiaAriaMovementTypesMod.IncrementMovementKey.AltArrowRight & String = js.native
    
    /* "Alt+ArrowUp" */ val AltArrowUp: typingsJapgolly.reactMdUtils.typesWiaAriaMovementTypesMod.IncrementMovementKey.AltArrowUp & String = js.native
    
    /* "Alt+PageDown" */ val AltPageDown: typingsJapgolly.reactMdUtils.typesWiaAriaMovementTypesMod.IncrementMovementKey.AltPageDown & String = js.native
    
    /* "Alt+PageUp" */ val AltPageUp: typingsJapgolly.reactMdUtils.typesWiaAriaMovementTypesMod.IncrementMovementKey.AltPageUp & String = js.native
    
    /* "ArrowDown" */ val ArrowDown: typingsJapgolly.reactMdUtils.typesWiaAriaMovementTypesMod.IncrementMovementKey.ArrowDown & String = js.native
    
    /* "ArrowLeft" */ val ArrowLeft: typingsJapgolly.reactMdUtils.typesWiaAriaMovementTypesMod.IncrementMovementKey.ArrowLeft & String = js.native
    
    /* "ArrowRight" */ val ArrowRight: typingsJapgolly.reactMdUtils.typesWiaAriaMovementTypesMod.IncrementMovementKey.ArrowRight & String = js.native
    
    /* "ArrowUp" */ val ArrowUp: typingsJapgolly.reactMdUtils.typesWiaAriaMovementTypesMod.IncrementMovementKey.ArrowUp & String = js.native
    
    /* "Control+ArrowDown" */ val ControlArrowDown: typingsJapgolly.reactMdUtils.typesWiaAriaMovementTypesMod.IncrementMovementKey.ControlArrowDown & String = js.native
    
    /* "Control+ArrowUp" */ val ControlArrowUp: typingsJapgolly.reactMdUtils.typesWiaAriaMovementTypesMod.IncrementMovementKey.ControlArrowUp & String = js.native
    
    /* "PageDown" */ val PageDown: typingsJapgolly.reactMdUtils.typesWiaAriaMovementTypesMod.IncrementMovementKey.PageDown & String = js.native
    
    /* "PageUp" */ val PageUp: typingsJapgolly.reactMdUtils.typesWiaAriaMovementTypesMod.IncrementMovementKey.PageUp & String = js.native
    
    /* "Shift+ArrowDown" */ val ShiftArrowDown: typingsJapgolly.reactMdUtils.typesWiaAriaMovementTypesMod.IncrementMovementKey.ShiftArrowDown & String = js.native
    
    /* "Shift+ArrowLeft" */ val ShiftArrowLeft: typingsJapgolly.reactMdUtils.typesWiaAriaMovementTypesMod.IncrementMovementKey.ShiftArrowLeft & String = js.native
    
    /* "Shift+ArrowRight" */ val ShiftArrowRight: typingsJapgolly.reactMdUtils.typesWiaAriaMovementTypesMod.IncrementMovementKey.ShiftArrowRight & String = js.native
    
    /* "Shift+ArrowUp" */ val ShiftArrowUp: typingsJapgolly.reactMdUtils.typesWiaAriaMovementTypesMod.IncrementMovementKey.ShiftArrowUp & String = js.native
  }
  
  @JSImport("@react-md/utils", "JumpMovementKey")
  @js.native
  object JumpMovementKey extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.reactMdUtils.typesWiaAriaMovementTypesMod.JumpMovementKey & String
      ] = js.native
    
    /* "Alt+End" */ val AltEnd: typingsJapgolly.reactMdUtils.typesWiaAriaMovementTypesMod.JumpMovementKey.AltEnd & String = js.native
    
    /* "Alt+Home" */ val AltHome: typingsJapgolly.reactMdUtils.typesWiaAriaMovementTypesMod.JumpMovementKey.AltHome & String = js.native
    
    /* "Control+End" */ val ControlEnd: typingsJapgolly.reactMdUtils.typesWiaAriaMovementTypesMod.JumpMovementKey.ControlEnd & String = js.native
    
    /* "Control+Home" */ val ControlHome: typingsJapgolly.reactMdUtils.typesWiaAriaMovementTypesMod.JumpMovementKey.ControlHome & String = js.native
    
    /* "Control+Shift+End" */ val ControlShiftEnd: typingsJapgolly.reactMdUtils.typesWiaAriaMovementTypesMod.JumpMovementKey.ControlShiftEnd & String = js.native
    
    /* "Control+Shift+Home" */ val ControlShiftHome: typingsJapgolly.reactMdUtils.typesWiaAriaMovementTypesMod.JumpMovementKey.ControlShiftHome & String = js.native
    
    /* "End" */ val End: typingsJapgolly.reactMdUtils.typesWiaAriaMovementTypesMod.JumpMovementKey.End & String = js.native
    
    /* "Home" */ val Home: typingsJapgolly.reactMdUtils.typesWiaAriaMovementTypesMod.JumpMovementKey.Home & String = js.native
  }
  
  @JSImport("@react-md/utils", "KeyboardMovementContextProvider")
  @js.native
  val KeyboardMovementContextProvider: Provider[KeyboardFocusContext] = js.native
  
  inline def KeyboardMovementProvider(
    hasChildrenLoopableSearchableHorizontalIncludeDisabledPropIncrementKeysPropDecrementKeysPropJumpToFirstKeysPropJumpToLastKeys: KeyboardMovementProviderProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("KeyboardMovementProvider")(hasChildrenLoopableSearchableHorizontalIncludeDisabledPropIncrementKeysPropDecrementKeysPropJumpToFirstKeysPropJumpToLastKeys.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@react-md/utils", "LARGE_TEXT_CONTRAST_RATIO")
  @js.native
  val LARGE_TEXT_CONTRAST_RATIO: /* 3 */ Double = js.native
  
  inline def MobileOnly(hasChildrenFallback: MediaOnlyProps): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("MobileOnly")(hasChildrenFallback.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  object MovementPresets {
    
    @JSImport("@react-md/utils", "MovementPresets.HORIZONTAL_COMBOBOX")
    @js.native
    val HORIZONTAL_COMBOBOX: MovementConfig = js.native
    
    @JSImport("@react-md/utils", "MovementPresets.HORIZONTAL_LISTBOX")
    @js.native
    val HORIZONTAL_LISTBOX: MovementConfig = js.native
    
    @JSImport("@react-md/utils", "MovementPresets.HORIZONTAL_MENU")
    @js.native
    val HORIZONTAL_MENU: MovementConfig = js.native
    
    @JSImport("@react-md/utils", "MovementPresets.HORIZONTAL_TABS")
    @js.native
    val HORIZONTAL_TABS: MovementConfig = js.native
    
    @JSImport("@react-md/utils", "MovementPresets.HORIZONTAL_TREE")
    @js.native
    val HORIZONTAL_TREE: MovementConfig = js.native
    
    @JSImport("@react-md/utils", "MovementPresets.VERTICAL_COMBOBOX")
    @js.native
    val VERTICAL_COMBOBOX: MovementConfig = js.native
    
    @JSImport("@react-md/utils", "MovementPresets.VERTICAL_LISTBOX")
    @js.native
    val VERTICAL_LISTBOX: MovementConfig = js.native
    
    @JSImport("@react-md/utils", "MovementPresets.VERTICAL_MENU")
    @js.native
    val VERTICAL_MENU: MovementConfig = js.native
    
    @JSImport("@react-md/utils", "MovementPresets.VERTICAL_TABS")
    @js.native
    val VERTICAL_TABS: MovementConfig = js.native
    
    @JSImport("@react-md/utils", "MovementPresets.VERTICAL_TREE")
    @js.native
    val VERTICAL_TREE: MovementConfig = js.native
  }
  
  @JSImport("@react-md/utils", "NORMAL_TEXT_CONTRAST_RATIO")
  @js.native
  val NORMAL_TEXT_CONTRAST_RATIO: /* 4.5 */ Double = js.native
  
  @JSImport("@react-md/utils", "PROGRAMATICALLY_FOCUSABLE")
  @js.native
  val PROGRAMATICALLY_FOCUSABLE: String = js.native
  
  inline def PhoneOnly(hasChildrenFallback: MediaOnlyProps): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("PhoneOnly")(hasChildrenFallback.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  @JSImport("@react-md/utils", "RadioGroup")
  @js.native
  val RadioGroup: ForwardRefExoticComponent[RadioGroupProps & RefAttributes[HTMLSpanElement]] = js.native
  
  @JSImport("@react-md/utils", "RadioWidget")
  @js.native
  val RadioWidget: ForwardRefExoticComponent[RadioWidgetProps & RefAttributes[HTMLSpanElement]] = js.native
  
  inline def ResizeListener(hasOnResizeOptionsImmediate: ResizeListenerProps): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("ResizeListener")(hasOnResizeOptionsImmediate.asInstanceOf[js.Any]).asInstanceOf[Null]
  
  inline def ScrollListener(props: ScrollListenerProps): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("ScrollListener")(props.asInstanceOf[js.Any]).asInstanceOf[Null]
  
  @JSImport("@react-md/utils", "TAB_FOCUSABLE")
  @js.native
  val TAB_FOCUSABLE: String = js.native
  
  @JSImport("@react-md/utils", "TOP_CENTER_ANCHOR")
  @js.native
  val TOP_CENTER_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "TOP_INNER_LEFT_ANCHOR")
  @js.native
  val TOP_INNER_LEFT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "TOP_INNER_RIGHT_ANCHOR")
  @js.native
  val TOP_INNER_RIGHT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "TOP_LEFT_ANCHOR")
  @js.native
  val TOP_LEFT_ANCHOR: PositionAnchor = js.native
  
  @JSImport("@react-md/utils", "TOP_RIGHT_ANCHOR")
  @js.native
  val TOP_RIGHT_ANCHOR: PositionAnchor = js.native
  
  inline def TabletOnly(hasChildrenFallback: MediaOnlyProps): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("TabletOnly")(hasChildrenFallback.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  inline def UserInteractionModeListener(hasChildren: UserInteractionModeListenerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("UserInteractionModeListener")(hasChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def applyRef[E](): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("applyRef")().asInstanceOf[Unit]
  inline def applyRef[E](instance: E): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("applyRef")(instance.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def applyRef[E](instance: E, ref: Ref[E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyRef")(instance.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def applyRef[E](instance: Null, ref: Ref[E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyRef")(instance.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def bem(base: Block): BEMResult = ^.asInstanceOf[js.Dynamic].applyDynamic("bem")(base.asInstanceOf[js.Any]).asInstanceOf[BEMResult]
  
  inline def caseInsensitiveFilter[T](query: String, searchable: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("caseInsensitiveFilter")(query.asInstanceOf[js.Any], searchable.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def caseInsensitiveFilter[T](query: String, searchable: js.Array[T], options: CaseInsensitiveOptions[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("caseInsensitiveFilter")(query.asInstanceOf[js.Any], searchable.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def containsElement(container: CheckableThing, child: CheckableThing): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("containsElement")(container.asInstanceOf[js.Any], child.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def defaultGetRadioClassName(item: RadioItemStyleObject): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultGetRadioClassName")(item.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def defaultGetRadioStyle(item: RadioItemStyleObject): js.UndefOr[CSSProperties] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultGetRadioStyle")(item.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[CSSProperties]]
  
  inline def defaults[O /* <: js.Object */, R /* <: js.Object */](optional: O, required: R): O & R = (^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(optional.asInstanceOf[js.Any], required.asInstanceOf[js.Any])).asInstanceOf[O & R]
  
  inline def delegateEvent(eventType: String): DelegatedEventHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[DelegatedEventHandler]
  inline def delegateEvent(eventType: String, eventTarget: Unit, throttle: Boolean): DelegatedEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any], eventTarget.asInstanceOf[js.Any], throttle.asInstanceOf[js.Any])).asInstanceOf[DelegatedEventHandler]
  inline def delegateEvent(eventType: String, eventTarget: Unit, throttle: Boolean, options: Boolean): DelegatedEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any], eventTarget.asInstanceOf[js.Any], throttle.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DelegatedEventHandler]
  inline def delegateEvent(eventType: String, eventTarget: Unit, throttle: Boolean, options: AddEventListenerOptions): DelegatedEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any], eventTarget.asInstanceOf[js.Any], throttle.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DelegatedEventHandler]
  inline def delegateEvent(eventType: String, eventTarget: Unit, throttle: Unit, options: Boolean): DelegatedEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any], eventTarget.asInstanceOf[js.Any], throttle.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DelegatedEventHandler]
  inline def delegateEvent(eventType: String, eventTarget: Unit, throttle: Unit, options: AddEventListenerOptions): DelegatedEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any], eventTarget.asInstanceOf[js.Any], throttle.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DelegatedEventHandler]
  inline def delegateEvent(eventType: String, eventTarget: DelegatedEventTarget): DelegatedEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any], eventTarget.asInstanceOf[js.Any])).asInstanceOf[DelegatedEventHandler]
  inline def delegateEvent(eventType: String, eventTarget: DelegatedEventTarget, throttle: Boolean): DelegatedEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any], eventTarget.asInstanceOf[js.Any], throttle.asInstanceOf[js.Any])).asInstanceOf[DelegatedEventHandler]
  inline def delegateEvent(eventType: String, eventTarget: DelegatedEventTarget, throttle: Boolean, options: Boolean): DelegatedEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any], eventTarget.asInstanceOf[js.Any], throttle.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DelegatedEventHandler]
  inline def delegateEvent(
    eventType: String,
    eventTarget: DelegatedEventTarget,
    throttle: Boolean,
    options: AddEventListenerOptions
  ): DelegatedEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any], eventTarget.asInstanceOf[js.Any], throttle.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DelegatedEventHandler]
  inline def delegateEvent(eventType: String, eventTarget: DelegatedEventTarget, throttle: Unit, options: Boolean): DelegatedEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any], eventTarget.asInstanceOf[js.Any], throttle.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DelegatedEventHandler]
  inline def delegateEvent(
    eventType: String,
    eventTarget: DelegatedEventTarget,
    throttle: Unit,
    options: AddEventListenerOptions
  ): DelegatedEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any], eventTarget.asInstanceOf[js.Any], throttle.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DelegatedEventHandler]
  
  inline def disableScrollLock(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableScrollLock")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def enableScrollLock(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableScrollLock")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def extractTextContent(stringOrElement: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extractTextContent")(stringOrElement.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def extractTextContent(stringOrElement: String, fontIconQuerySelector: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("extractTextContent")(stringOrElement.asInstanceOf[js.Any], fontIconQuerySelector.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def extractTextContent(stringOrElement: HTMLElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extractTextContent")(stringOrElement.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def extractTextContent(stringOrElement: HTMLElement, fontIconQuerySelector: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("extractTextContent")(stringOrElement.asInstanceOf[js.Any], fontIconQuerySelector.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def findIgnoreCase[T](query: String, searchable: js.Array[T]): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findIgnoreCase")(query.asInstanceOf[js.Any], searchable.asInstanceOf[js.Any])).asInstanceOf[T | Null]
  inline def findIgnoreCase[T](query: String, searchable: js.Array[T], options: SearchOptions[T]): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findIgnoreCase")(query.asInstanceOf[js.Any], searchable.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T | Null]
  
  inline def findMatchInRange(value: String, values: js.Array[String], startIndex: Double, endIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findMatchInRange")(value.asInstanceOf[js.Any], values.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def findMatchIndex(value: String, values: js.Array[String], startIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findMatchIndex")(value.asInstanceOf[js.Any], values.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def findMatchIndex(value: String, values: js.Array[String], startIndex: Double, isSelfMatchable: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findMatchIndex")(value.asInstanceOf[js.Any], values.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], isSelfMatchable.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def findSizingContainer(): HTMLElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findSizingContainer")().asInstanceOf[HTMLElement | Null]
  inline def findSizingContainer(el: HTMLElement): HTMLElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findSizingContainer")(el.asInstanceOf[js.Any]).asInstanceOf[HTMLElement | Null]
  
  inline def focusElementWithin(container: Document, focus: Focus): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(container: Document, focus: Focus, programmatic: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(container: Document, focus: Focus, programmatic: Boolean, preventScroll: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(
    container: Document,
    focus: Focus,
    programmatic: Boolean,
    preventScroll: Boolean,
    elements: js.Array[HTMLElement]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(
    container: Document,
    focus: Focus,
    programmatic: Boolean,
    preventScroll: Unit,
    elements: js.Array[HTMLElement]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(container: Document, focus: Focus, programmatic: Unit, preventScroll: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(
    container: Document,
    focus: Focus,
    programmatic: Unit,
    preventScroll: Boolean,
    elements: js.Array[HTMLElement]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(
    container: Document,
    focus: Focus,
    programmatic: Unit,
    preventScroll: Unit,
    elements: js.Array[HTMLElement]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(container: HTMLElement, focus: Focus): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(container: HTMLElement, focus: Focus, programmatic: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(container: HTMLElement, focus: Focus, programmatic: Boolean, preventScroll: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(
    container: HTMLElement,
    focus: Focus,
    programmatic: Boolean,
    preventScroll: Boolean,
    elements: js.Array[HTMLElement]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(
    container: HTMLElement,
    focus: Focus,
    programmatic: Boolean,
    preventScroll: Unit,
    elements: js.Array[HTMLElement]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(container: HTMLElement, focus: Focus, programmatic: Unit, preventScroll: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(
    container: HTMLElement,
    focus: Focus,
    programmatic: Unit,
    preventScroll: Boolean,
    elements: js.Array[HTMLElement]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def focusElementWithin(
    container: HTMLElement,
    focus: Focus,
    programmatic: Unit,
    preventScroll: Unit,
    elements: js.Array[HTMLElement]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusElementWithin")(container.asInstanceOf[js.Any], focus.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fuzzyFilter[T](query: String, searchable: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fuzzyFilter")(query.asInstanceOf[js.Any], searchable.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def fuzzyFilter[T](query: String, searchable: js.Array[T], options: SearchOptions[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fuzzyFilter")(query.asInstanceOf[js.Any], searchable.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def getContrastRatio(background: HexString, foreground: HexString): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getContrastRatio")(background.asInstanceOf[js.Any], foreground.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getElement[E /* <: HTMLElement */](): E | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getElement")().asInstanceOf[E | Null]
  inline def getElement[E /* <: HTMLElement */](element: E): E | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getElement")(element.asInstanceOf[js.Any]).asInstanceOf[E | Null]
  inline def getElement[E /* <: HTMLElement */](element: MutableRefObject[E | Null]): E | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getElement")(element.asInstanceOf[js.Any]).asInstanceOf[E | Null]
  
  inline def getElementRect(element: HTMLElement): DOMRect = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementRect")(element.asInstanceOf[js.Any]).asInstanceOf[DOMRect]
  inline def getElementRect(element: HTMLElement, coords: Coords): DOMRect = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementRect")(element.asInstanceOf[js.Any], coords.asInstanceOf[js.Any])).asInstanceOf[DOMRect]
  
  inline def getFixedPosition(
    hasContainerElementAnchorInitialXInitialYVwMarginVhMarginXMarginYMarginWidthTypePreventOverlapTransformOriginPropDisableSwappingDisableVHBounds: FixedPositionOptions
  ): FixedPosition = ^.asInstanceOf[js.Dynamic].applyDynamic("getFixedPosition")(hasContainerElementAnchorInitialXInitialYVwMarginVhMarginXMarginYMarginWidthTypePreventOverlapTransformOriginPropDisableSwappingDisableVHBounds.asInstanceOf[js.Any]).asInstanceOf[FixedPosition]
  
  inline def getFocusableElements(container: Document): js.Array[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFocusableElements")(container.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLElement]]
  inline def getFocusableElements(container: Document, programatic: Boolean): js.Array[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFocusableElements")(container.asInstanceOf[js.Any], programatic.asInstanceOf[js.Any])).asInstanceOf[js.Array[HTMLElement]]
  inline def getFocusableElements(container: HTMLElement): js.Array[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFocusableElements")(container.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLElement]]
  inline def getFocusableElements(container: HTMLElement, programatic: Boolean): js.Array[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFocusableElements")(container.asInstanceOf[js.Any], programatic.asInstanceOf[js.Any])).asInstanceOf[js.Array[HTMLElement]]
  
  inline def getFuzzyRegExp(query: String): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("getFuzzyRegExp")(query.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
  
  inline def getItemId(id: String, i: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getItemId")(id.asInstanceOf[js.Any], i.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getItemValue(item: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getItemValue")(item.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getItemValue(item: Any, valueKey: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getItemValue")(item.asInstanceOf[js.Any], valueKey.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getOrientationType(): OrientationType = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrientationType")().asInstanceOf[OrientationType]
  
  inline def getPercentage(hasMinMaxValueValidate: GetPercentageOptions): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getPercentage")(hasMinMaxValueValidate.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getRadioItemValue(value: RadioItem): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRadioItemValue")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getSearchString(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSearchString")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getSearchString(value: String, lowercase: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSearchString")(value.asInstanceOf[js.Any], lowercase.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getSearchString(value: String, lowercase: Boolean, trim: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSearchString")(value.asInstanceOf[js.Any], lowercase.asInstanceOf[js.Any], trim.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getSearchString(value: String, lowercase: Boolean, trim: Boolean, ignoreWhitespace: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSearchString")(value.asInstanceOf[js.Any], lowercase.asInstanceOf[js.Any], trim.asInstanceOf[js.Any], ignoreWhitespace.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getSearchString(value: String, lowercase: Boolean, trim: Unit, ignoreWhitespace: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSearchString")(value.asInstanceOf[js.Any], lowercase.asInstanceOf[js.Any], trim.asInstanceOf[js.Any], ignoreWhitespace.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getSearchString(value: String, lowercase: Unit, trim: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSearchString")(value.asInstanceOf[js.Any], lowercase.asInstanceOf[js.Any], trim.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getSearchString(value: String, lowercase: Unit, trim: Boolean, ignoreWhitespace: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSearchString")(value.asInstanceOf[js.Any], lowercase.asInstanceOf[js.Any], trim.asInstanceOf[js.Any], ignoreWhitespace.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getSearchString(value: String, lowercase: Unit, trim: Unit, ignoreWhitespace: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSearchString")(value.asInstanceOf[js.Any], lowercase.asInstanceOf[js.Any], trim.asInstanceOf[js.Any], ignoreWhitespace.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getViewportSize(direction: height | width): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getViewportSize")(direction.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def hexToRGB(hex: HexString): js.Tuple3[RedBit, GreenBit, BlueBit] = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToRGB")(hex.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[RedBit, GreenBit, BlueBit]]
  
  inline def isContrastCompliant(background: HexString, foreground: HexString): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isContrastCompliant")(background.asInstanceOf[js.Any], foreground.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isContrastCompliant(background: HexString, foreground: HexString, compliance: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isContrastCompliant")(background.asInstanceOf[js.Any], foreground.asInstanceOf[js.Any], compliance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isContrastCompliant(background: HexString, foreground: HexString, compliance: ContrastRatioCompliance): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isContrastCompliant")(background.asInstanceOf[js.Any], foreground.asInstanceOf[js.Any], compliance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isFocusable(element: Document): /* is std.HTMLElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFocusable")(element.asInstanceOf[js.Any]).asInstanceOf[/* is std.HTMLElement */ Boolean]
  inline def isFocusable(element: Document, `type`: ElementFocusType): /* is std.HTMLElement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFocusable")(element.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* is std.HTMLElement */ Boolean]
  inline def isFocusable(element: HTMLElement): /* is std.HTMLElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFocusable")(element.asInstanceOf[js.Any]).asInstanceOf[/* is std.HTMLElement */ Boolean]
  inline def isFocusable(element: HTMLElement, `type`: ElementFocusType): /* is std.HTMLElement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFocusable")(element.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* is std.HTMLElement */ Boolean]
  inline def isFocusable(element: Window): /* is std.HTMLElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFocusable")(element.asInstanceOf[js.Any]).asInstanceOf[/* is std.HTMLElement */ Boolean]
  inline def isFocusable(element: Window, `type`: ElementFocusType): /* is std.HTMLElement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFocusable")(element.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* is std.HTMLElement */ Boolean]
  
  inline def loop(hasValueMinMaxIncrementMinmax: LoopOptions): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("loop")(hasValueMinMaxIncrementMinmax.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def nearest(value: Double, min: Double, max: Double, steps: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("nearest")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], steps.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def nearest(value: Double, min: Double, max: Double, steps: Double, range: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("nearest")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], steps.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def omit[T /* <: js.Object */, K /* <: /* keyof T */ String */](`object`: T, omitKeys: js.Array[K | String]): Omit[T, K] = (^.asInstanceOf[js.Dynamic].applyDynamic("omit")(`object`.asInstanceOf[js.Any], omitKeys.asInstanceOf[js.Any])).asInstanceOf[Omit[T, K]]
  
  inline def scrollIntoView(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollIntoView")().asInstanceOf[Unit]
  inline def scrollIntoView(container: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollIntoView")(container.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def scrollIntoView(container: HTMLElement, element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollIntoView")(container.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def scrollIntoView(container: Null, element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollIntoView")(container.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def throttle[F /* <: ThrottleableFunction */](fn: F, wait: Double): ThrottledFunction[F] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(fn.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[ThrottledFunction[F]]
  
  inline def toWidthPart(v: Unit, prefix: min | max): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toWidthPart")(v.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toWidthPart(v: QuerySize, prefix: min | max): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toWidthPart")(v.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def tryToSubmitRelatedForm(event: KeyboardSubmitEventPartial): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("tryToSubmitRelatedForm")(event.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def unitToNumber(unit: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("unitToNumber")(unit.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def unitToNumber(unit: String, options: UnitToNumberOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("unitToNumber")(unit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def unitToNumber(unit: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("unitToNumber")(unit.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def unitToNumber(unit: Double, options: UnitToNumberOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("unitToNumber")(unit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def useActiveDescendant[E /* <: HTMLElement */](hasIdRef: ActiveDescendantHookOptions[E]): ActiveDescendantHookReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useActiveDescendant")(hasIdRef.asInstanceOf[js.Any]).asInstanceOf[ActiveDescendantHookReturnValue[E]]
  
  inline def useActiveDescendantContext(): ReadonlyActiveDescendantC = ^.asInstanceOf[js.Dynamic].applyDynamic("useActiveDescendantContext")().asInstanceOf[ReadonlyActiveDescendantC]
  
  inline def useActiveDescendantFocus[E /* <: HTMLElement */](): ActiveDescendantFocusHookReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useActiveDescendantFocus")().asInstanceOf[ActiveDescendantFocusHookReturnValue[E]]
  inline def useActiveDescendantFocus[E /* <: HTMLElement */](hasDefaultActiveIdOptions: ActiveDescendantFocusHookOptions[E]): ActiveDescendantFocusHookReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useActiveDescendantFocus")(hasDefaultActiveIdOptions.asInstanceOf[js.Any]).asInstanceOf[ActiveDescendantFocusHookReturnValue[E]]
  
  inline def useActiveDescendantMovement[D, CE /* <: HTMLElement */, IE /* <: HTMLElement */](
    hasBaseIdGetIdDefaultFocusedIndexItemsOnChangeGetItemValueValueKeyOnKeyDownOnEnterOnSpaceOptions: ActiveDescendantOptions[D, CE, IE]
  ): ActiveDescendantMovementProviders[CE, IE] = ^.asInstanceOf[js.Dynamic].applyDynamic("useActiveDescendantMovement")(hasBaseIdGetIdDefaultFocusedIndexItemsOnChangeGetItemValueValueKeyOnKeyDownOnEnterOnSpaceOptions.asInstanceOf[js.Any]).asInstanceOf[ActiveDescendantMovementProviders[CE, IE]]
  
  inline def useAppSize(): AppSize = ^.asInstanceOf[js.Dynamic].applyDynamic("useAppSize")().asInstanceOf[AppSize]
  
  inline def useAppSizeMedia(): AppSize = ^.asInstanceOf[js.Dynamic].applyDynamic("useAppSizeMedia")().asInstanceOf[AppSize]
  inline def useAppSizeMedia(
    hasPhoneMaxWidthTabletMinWidthTabletMaxWidthDesktopMinWidthDesktopLargeMinWidthDefaultSize: AppSizeOptions
  ): AppSize = ^.asInstanceOf[js.Dynamic].applyDynamic("useAppSizeMedia")(hasPhoneMaxWidthTabletMinWidthTabletMaxWidthDesktopMinWidthDesktopLargeMinWidthDefaultSize.asInstanceOf[js.Any]).asInstanceOf[AppSize]
  
  inline def useCloseOnEscape[E /* <: HTMLElement */](onRequestClose: js.Function0[Unit], disabled: Boolean): js.UndefOr[KeyboardEventHandler[E]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useCloseOnEscape")(onRequestClose.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[KeyboardEventHandler[E]]]
  inline def useCloseOnEscape[E /* <: HTMLElement */](onRequestClose: js.Function0[Unit], disabled: Boolean, onKeyDown: KeyboardEventHandler[E]): js.UndefOr[KeyboardEventHandler[E]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useCloseOnEscape")(onRequestClose.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any], onKeyDown.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[KeyboardEventHandler[E]]]
  
  inline def useCloseOnOutsideClick[E /* <: HTMLElement */](hasEnabledElementOnOutsideClick: CloseOnOutsideClickOptions[E]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useCloseOnOutsideClick")(hasEnabledElementOnOutsideClick.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useDir(): WritingDirectionContext = ^.asInstanceOf[js.Dynamic].applyDynamic("useDir")().asInstanceOf[WritingDirectionContext]
  
  inline def useDropzone[E /* <: HTMLElement */](options: DropzoneHandlers[E]): DropzoneHookReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useDropzone")(options.asInstanceOf[js.Any]).asInstanceOf[DropzoneHookReturnValue[E]]
  
  inline def useEnsuredRef[E /* <: HTMLElement */](): EnsuredRefs[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useEnsuredRef")().asInstanceOf[EnsuredRefs[E]]
  inline def useEnsuredRef[E /* <: HTMLElement */](propRef: Ref[E | Null]): EnsuredRefs[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useEnsuredRef")(propRef.asInstanceOf[js.Any]).asInstanceOf[EnsuredRefs[E]]
  
  inline def useFocusMovement[D, CE /* <: HTMLElement */, IE /* <: HTMLElement */](hasDefaultFocusedIndexOnChangeOptions: KeyboardFocusOptions[D, CE, IE]): KeyboardMovementProviders[CE, IE] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusMovement")(hasDefaultFocusedIndexOnChangeOptions.asInstanceOf[js.Any]).asInstanceOf[KeyboardMovementProviders[CE, IE]]
  
  inline def useFocusOnMount(refOrInstance: RefOrInstance, defaultFocus: Focus): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useFocusOnMount")(refOrInstance.asInstanceOf[js.Any], defaultFocus.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useFocusOnMount(refOrInstance: RefOrInstance, defaultFocus: Focus, preventScroll: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useFocusOnMount")(refOrInstance.asInstanceOf[js.Any], defaultFocus.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useFocusOnMount(refOrInstance: RefOrInstance, defaultFocus: Focus, preventScroll: Boolean, programmatic: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useFocusOnMount")(refOrInstance.asInstanceOf[js.Any], defaultFocus.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useFocusOnMount(
    refOrInstance: RefOrInstance,
    defaultFocus: Focus,
    preventScroll: Boolean,
    programmatic: Boolean,
    disabled: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useFocusOnMount")(refOrInstance.asInstanceOf[js.Any], defaultFocus.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useFocusOnMount(
    refOrInstance: RefOrInstance,
    defaultFocus: Focus,
    preventScroll: Boolean,
    programmatic: Unit,
    disabled: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useFocusOnMount")(refOrInstance.asInstanceOf[js.Any], defaultFocus.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useFocusOnMount(refOrInstance: RefOrInstance, defaultFocus: Focus, preventScroll: Unit, programmatic: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useFocusOnMount")(refOrInstance.asInstanceOf[js.Any], defaultFocus.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useFocusOnMount(
    refOrInstance: RefOrInstance,
    defaultFocus: Focus,
    preventScroll: Unit,
    programmatic: Boolean,
    disabled: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useFocusOnMount")(refOrInstance.asInstanceOf[js.Any], defaultFocus.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useFocusOnMount(
    refOrInstance: RefOrInstance,
    defaultFocus: Focus,
    preventScroll: Unit,
    programmatic: Unit,
    disabled: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useFocusOnMount")(refOrInstance.asInstanceOf[js.Any], defaultFocus.asInstanceOf[js.Any], preventScroll.asInstanceOf[js.Any], programmatic.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGridList[E /* <: HTMLElement */](): UseGridListReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useGridList")().asInstanceOf[UseGridListReturnValue[E]]
  inline def useGridList[E /* <: HTMLElement */](
    hasPropRefStyleClassNameCellMarginDefaultSizeMaxCellSizeDisableHeightDisableWidthContainerPadding: PropsWithRef[UseGridListOptions, E]
  ): UseGridListReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useGridList")(hasPropRefStyleClassNameCellMarginDefaultSizeMaxCellSizeDisableHeightDisableWidthContainerPadding.asInstanceOf[js.Any]).asInstanceOf[UseGridListReturnValue[E]]
  
  inline def useGridListSize(): GridListSize = ^.asInstanceOf[js.Dynamic].applyDynamic("useGridListSize")().asInstanceOf[GridListSize]
  
  inline def useHoverMode(): HoverModeHookReturnValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useHoverMode")().asInstanceOf[HoverModeHookReturnValue]
  inline def useHoverMode(hasDisabledDefaultVisibleExitVisibilityDelay: HoverModeOptions): HoverModeHookReturnValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useHoverMode")(hasDisabledDefaultVisibleExitVisibilityDelay.asInstanceOf[js.Any]).asInstanceOf[HoverModeHookReturnValue]
  
  inline def useHoverModeContext(): HoverModeContext = ^.asInstanceOf[js.Dynamic].applyDynamic("useHoverModeContext")().asInstanceOf[HoverModeContext]
  
  inline def useInterval(callback: js.Function1[/* stop */ js.Function0[Unit], Unit], delay: Double): ReturnValue = (^.asInstanceOf[js.Dynamic].applyDynamic("useInterval")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[ReturnValue]
  inline def useInterval(
    callback: js.Function1[/* stop */ js.Function0[Unit], Unit],
    delay: Double,
    defaultRunning: Boolean
  ): ReturnValue = (^.asInstanceOf[js.Dynamic].applyDynamic("useInterval")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], defaultRunning.asInstanceOf[js.Any])).asInstanceOf[ReturnValue]
  
  inline def useIsUserInteractionMode(mode: UserInteractionMode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsUserInteractionMode")(mode.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def useIsomorphicLayoutEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsomorphicLayoutEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useIsomorphicLayoutEffect(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useIsomorphicLayoutEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useKeyboardFocus[E /* <: HTMLElement */](): KeyboardFocusHookReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useKeyboardFocus")().asInstanceOf[KeyboardFocusHookReturnValue[E]]
  inline def useKeyboardFocus[E /* <: HTMLElement */](options: KeyboardFocusHookOptions[E]): KeyboardFocusHookReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useKeyboardFocus")(options.asInstanceOf[js.Any]).asInstanceOf[KeyboardFocusHookReturnValue[E]]
  
  inline def useKeyboardFocusContext(): ReadonlyKeyboardFocusCont = ^.asInstanceOf[js.Dynamic].applyDynamic("useKeyboardFocusContext")().asInstanceOf[ReadonlyKeyboardFocusCont]
  
  inline def useKeyboardFocusableElement[E /* <: HTMLElement */](): RefFn[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useKeyboardFocusableElement")().asInstanceOf[RefFn[E]]
  inline def useKeyboardFocusableElement[E /* <: HTMLElement */](ref: Ref[E]): RefFn[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useKeyboardFocusableElement")(ref.asInstanceOf[js.Any]).asInstanceOf[RefFn[E]]
  
  inline def useKeyboardMovement[D, CE /* <: HTMLElement */, IE /* <: HTMLElement */](
    hasOnKeyDownIncrementKeysDecrementKeysJumpToFirstKeysJumpToLastKeysStopPropagationOnChangeItemsResetTimeFindMatchIndexFocusedIndexLoopableSearchableValueKeyGetItemValue: KeyboardMovementOptions[D, CE, IE]
  ): KeyboardMovementProviders[CE, IE] = ^.asInstanceOf[js.Dynamic].applyDynamic("useKeyboardMovement")(hasOnKeyDownIncrementKeysDecrementKeysJumpToFirstKeysJumpToLastKeysStopPropagationOnChangeItemsResetTimeFindMatchIndexFocusedIndexLoopableSearchableValueKeyGetItemValue.asInstanceOf[js.Any]).asInstanceOf[KeyboardMovementProviders[CE, IE]]
  
  inline def useKeyboardSearch[D, E /* <: HTMLElement */](
    hasItemsOnChangeOnKeyDownResetTimeSearchIndexValueKeyGetItemValueFindMatchIndex: KeyboardSearchOptions[D, E]
  ): typingsJapgolly.reactMdUtils.typesSearchUseKeyboardSearchMod.ReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useKeyboardSearch")(hasItemsOnChangeOnKeyDownResetTimeSearchIndexValueKeyGetItemValueFindMatchIndex.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.reactMdUtils.typesSearchUseKeyboardSearchMod.ReturnValue[E]]
  
  inline def useMediaQuery(query: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useMediaQuery")(query.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def useMediaQuery(query: String, defaultValue: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("useMediaQuery")(query.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def useMediaQuery(query: String, defaultValue: Boolean, disabled: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("useMediaQuery")(query.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def useMediaQuery(query: String, defaultValue: Boolean, disabled: Boolean, checkImmediately: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("useMediaQuery")(query.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any], checkImmediately.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def useMediaQuery(query: String, defaultValue: Boolean, disabled: Unit, checkImmediately: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("useMediaQuery")(query.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any], checkImmediately.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def useMediaQuery(query: String, defaultValue: Unit, disabled: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("useMediaQuery")(query.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def useMediaQuery(query: String, defaultValue: Unit, disabled: Boolean, checkImmediately: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("useMediaQuery")(query.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any], checkImmediately.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def useMediaQuery(query: String, defaultValue: Unit, disabled: Unit, checkImmediately: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("useMediaQuery")(query.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any], checkImmediately.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def useOnUnmount(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useOnUnmount")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useOrientation(): OrientationType = ^.asInstanceOf[js.Dynamic].applyDynamic("useOrientation")().asInstanceOf[OrientationType]
  inline def useOrientation(defaultValue: OrientationType): OrientationType = ^.asInstanceOf[js.Dynamic].applyDynamic("useOrientation")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[OrientationType]
  
  inline def usePreviousFocus(disabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("usePreviousFocus")(disabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def usePreviousFocus(disabled: Boolean, fallback: Unit, previousElement: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("usePreviousFocus")(disabled.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any], previousElement.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def usePreviousFocus(disabled: Boolean, fallback: FocusFallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("usePreviousFocus")(disabled.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def usePreviousFocus(disabled: Boolean, fallback: FocusFallback, previousElement: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("usePreviousFocus")(disabled.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any], previousElement.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useRefCache[T](cacheable: T): Current[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRefCache")(cacheable.asInstanceOf[js.Any]).asInstanceOf[Current[T]]
  
  inline def useResizeListener(hasOnResizeOptionsImmediateEnabled: ResizeListenerOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useResizeListener")(hasOnResizeOptionsImmediateEnabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useResizeObserver[E /* <: HTMLElement */](onResize: OnResizeObserverChange[E]): EnsuredRefs[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useResizeObserver")(onResize.asInstanceOf[js.Any]).asInstanceOf[EnsuredRefs[E]]
  inline def useResizeObserver[E /* <: HTMLElement */](onResize: OnResizeObserverChange[E], options: UseResizeObserverOptions[E]): EnsuredRefs[E] = (^.asInstanceOf[js.Dynamic].applyDynamic("useResizeObserver")(onResize.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EnsuredRefs[E]]
  
  inline def useScrollListener(hasOncePassiveSignalCaptureEnabledOnScroll: ScrollListenerHookOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useScrollListener")(hasOncePassiveSignalCaptureEnabledOnScroll.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useScrollLock(enabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useScrollLock")(enabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useScrollLock(enabled: Boolean, selectorOrElement: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useScrollLock")(enabled.asInstanceOf[js.Any], selectorOrElement.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useScrollLock(enabled: Boolean, selectorOrElement: js.Function0[HTMLElement]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useScrollLock")(enabled.asInstanceOf[js.Any], selectorOrElement.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useScrollLock(enabled: Boolean, selectorOrElement: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useScrollLock")(enabled.asInstanceOf[js.Any], selectorOrElement.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useTempValue[T](defaultValue: T): typingsJapgolly.reactMdUtils.typesUseTempValueMod.ReturnValue[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTempValue")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.reactMdUtils.typesUseTempValueMod.ReturnValue[T]]
  inline def useTempValue[T](defaultValue: T, resetTime: Double): typingsJapgolly.reactMdUtils.typesUseTempValueMod.ReturnValue[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useTempValue")(defaultValue.asInstanceOf[js.Any], resetTime.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.reactMdUtils.typesUseTempValueMod.ReturnValue[T]]
  
  inline def useTimeout(cb: js.Function0[Unit], delay: Double): typingsJapgolly.reactMdUtils.typesUseTimeoutMod.ReturnValue = (^.asInstanceOf[js.Dynamic].applyDynamic("useTimeout")(cb.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.reactMdUtils.typesUseTimeoutMod.ReturnValue]
  inline def useTimeout(cb: js.Function0[Unit], delay: Double, defaultStarted: js.Function0[Boolean]): typingsJapgolly.reactMdUtils.typesUseTimeoutMod.ReturnValue = (^.asInstanceOf[js.Dynamic].applyDynamic("useTimeout")(cb.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], defaultStarted.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.reactMdUtils.typesUseTimeoutMod.ReturnValue]
  inline def useTimeout(cb: js.Function0[Unit], delay: Double, defaultStarted: Boolean): typingsJapgolly.reactMdUtils.typesUseTimeoutMod.ReturnValue = (^.asInstanceOf[js.Dynamic].applyDynamic("useTimeout")(cb.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], defaultStarted.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.reactMdUtils.typesUseTimeoutMod.ReturnValue]
  
  inline def useToggle(defaultToggled: js.Function0[Boolean]): typingsJapgolly.reactMdUtils.typesUseToggleMod.ReturnValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useToggle")(defaultToggled.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.reactMdUtils.typesUseToggleMod.ReturnValue]
  inline def useToggle(defaultToggled: Boolean): typingsJapgolly.reactMdUtils.typesUseToggleMod.ReturnValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useToggle")(defaultToggled.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.reactMdUtils.typesUseToggleMod.ReturnValue]
  
  inline def useUserInteractionMode(): UserInteractionMode = ^.asInstanceOf[js.Dynamic].applyDynamic("useUserInteractionMode")().asInstanceOf[UserInteractionMode]
  
  inline def useWidthMediaQuery(hasMinMax: WidthMediaQuery & WidthMediaQuerys): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useWidthMediaQuery")(hasMinMax.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def withinRange(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("withinRange")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def withinRange(value: Double, min: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("withinRange")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def withinRange(value: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("withinRange")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def withinRange(value: Double, min: Unit, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("withinRange")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
}
