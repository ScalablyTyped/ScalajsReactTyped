package typingsJapgolly.orbitUiReactComponents

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefFn
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.AbortSignal
import org.scalajs.dom.EventListenerOptions
import org.scalajs.dom.EventTarget
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.TreeWalker
import typingsJapgolly.orbitUiReactComponents.anon.Add
import typingsJapgolly.orbitUiReactComponents.anon.AlignItems
import typingsJapgolly.orbitUiReactComponents.anon.ArrowProps
import typingsJapgolly.orbitUiReactComponents.anon.ArrowRef
import typingsJapgolly.orbitUiReactComponents.anon.ClassNameString
import typingsJapgolly.orbitUiReactComponents.anon.Close
import typingsJapgolly.orbitUiReactComponents.anon.Direction
import typingsJapgolly.orbitUiReactComponents.anon.Dispose
import typingsJapgolly.orbitUiReactComponents.anon.From
import typingsJapgolly.orbitUiReactComponents.anon.InputProps
import typingsJapgolly.orbitUiReactComponents.anon.IsDisabled
import typingsJapgolly.orbitUiReactComponents.anon.IsLoading
import typingsJapgolly.orbitUiReactComponents.anon.OmitInnerHeadingPropssize
import typingsJapgolly.orbitUiReactComponents.anon.OmitInnerIconPropssrc
import typingsJapgolly.orbitUiReactComponents.anon.OmitInnerMultiVariantIcon
import typingsJapgolly.orbitUiReactComponents.anon.OnBlurOnFocus
import typingsJapgolly.orbitUiReactComponents.anon.OnClick
import typingsJapgolly.orbitUiReactComponents.anon.OnFocus
import typingsJapgolly.orbitUiReactComponents.anon.OnKeyDown
import typingsJapgolly.orbitUiReactComponents.anon.OnKeyDownUndefined
import typingsJapgolly.orbitUiReactComponents.anon.OnKeyUp
import typingsJapgolly.orbitUiReactComponents.anon.OnMouseEnter
import typingsJapgolly.orbitUiReactComponents.anon.Style
import typingsJapgolly.orbitUiReactComponents.anon.StyleHeight
import typingsJapgolly.orbitUiReactComponents.anon.`0`
import typingsJapgolly.orbitUiReactComponents.anon.`1`
import typingsJapgolly.orbitUiReactComponents.anon.`2`
import typingsJapgolly.orbitUiReactComponents.anon.`3`
import typingsJapgolly.orbitUiReactComponents.distAccordionSrcAccordionContextMod.AccordionContextType
import typingsJapgolly.orbitUiReactComponents.distAccordionSrcAccordionHeaderMod.InnerAccordionHeaderProps
import typingsJapgolly.orbitUiReactComponents.distAccordionSrcAccordionMod.InnerAccordionProps
import typingsJapgolly.orbitUiReactComponents.distAccordionSrcAccordionPanelMod.InnerAccordionPanelProps
import typingsJapgolly.orbitUiReactComponents.distAlertSrcAlertMod.InnerAlertProps
import typingsJapgolly.orbitUiReactComponents.distAlertSrcAlertTriggerMod.InnerAlertTriggerProps
import typingsJapgolly.orbitUiReactComponents.distAutocompleteSrcAutocompleteMod.InnerAutocompleteProps
import typingsJapgolly.orbitUiReactComponents.distAutocompleteSrcHiddenAutocompleteMod.HiddenAutocompleteProps
import typingsJapgolly.orbitUiReactComponents.distAvatarSrcAvatarGroupMod.InnerAvatarGroupProps
import typingsJapgolly.orbitUiReactComponents.distAvatarSrcAvatarMod.AvatarTextProps
import typingsJapgolly.orbitUiReactComponents.distAvatarSrcAvatarMod.InnerAvatarProps
import typingsJapgolly.orbitUiReactComponents.distBadgeSrcBadgeMod.InnerBadgeProps
import typingsJapgolly.orbitUiReactComponents.distBoxSrcBoxMod.InnerBoxProps
import typingsJapgolly.orbitUiReactComponents.distButtonSrcButtonGroupMod.InnerButtonGroupProps
import typingsJapgolly.orbitUiReactComponents.distButtonSrcButtonMod.InnerButtonProps
import typingsJapgolly.orbitUiReactComponents.distButtonSrcCrossButtonMod.InnerCrossButtonProps
import typingsJapgolly.orbitUiReactComponents.distButtonSrcIconButtonMod.InnerIconButtonProps
import typingsJapgolly.orbitUiReactComponents.distButtonSrcToggleButtonMod.InnerToggleButtonProps
import typingsJapgolly.orbitUiReactComponents.distButtonSrcToggleIconButtonMod.InnerToggleIconButtonProps
import typingsJapgolly.orbitUiReactComponents.distCardSrcCardMod.InnerCardProps
import typingsJapgolly.orbitUiReactComponents.distCheckboxSrcCheckboxGroupMod.InnerCheckboxGroupProps
import typingsJapgolly.orbitUiReactComponents.distCheckboxSrcCheckboxMod.InnerCheckboxProps
import typingsJapgolly.orbitUiReactComponents.distCheckboxSrcUseCheckboxMod.UseCheckboxProps
import typingsJapgolly.orbitUiReactComponents.distCheckboxSrcUseCheckboxMod.UseCheckboxReturn
import typingsJapgolly.orbitUiReactComponents.distCollectionSrcItemMod.InnerItemProps
import typingsJapgolly.orbitUiReactComponents.distCollectionSrcSectionMod.InnerSectionProps
import typingsJapgolly.orbitUiReactComponents.distCollectionSrcUseCollectionMod.CollectionItem
import typingsJapgolly.orbitUiReactComponents.distCollectionSrcUseCollectionMod.CollectionNode
import typingsJapgolly.orbitUiReactComponents.distCollectionSrcUseCollectionSearchMod.UseCollectionSearchOptions
import typingsJapgolly.orbitUiReactComponents.distCollectionSrcUseScrollableCollectionMod.UseScrollableCollectionOptions
import typingsJapgolly.orbitUiReactComponents.distCounterSrcCounterMod.InnerCounterProps
import typingsJapgolly.orbitUiReactComponents.distDateInputSrcDateInputMod.InnerDateInputProps
import typingsJapgolly.orbitUiReactComponents.distDateInputSrcDateRangeInputMod.InnerDateRangeInputProps
import typingsJapgolly.orbitUiReactComponents.distDialogSrcDialogMod.InnerDialogProps
import typingsJapgolly.orbitUiReactComponents.distDialogSrcDialogTriggerContextMod.DialogTriggerContextType
import typingsJapgolly.orbitUiReactComponents.distDialogSrcDialogTriggerMod.InnerDialogTriggerProps
import typingsJapgolly.orbitUiReactComponents.distDisclosureSrcDisclosureArrowMod.InnerDisclosureArrowProps
import typingsJapgolly.orbitUiReactComponents.distDisclosureSrcDisclosureContextMod.DisclosureContextType
import typingsJapgolly.orbitUiReactComponents.distDisclosureSrcDisclosureMod.InnerDisclosureProps
import typingsJapgolly.orbitUiReactComponents.distDividerSrcDividerMod.InnerDividerProps
import typingsJapgolly.orbitUiReactComponents.distDotSrcDotMod.InnerDotProps
import typingsJapgolly.orbitUiReactComponents.distFieldSrcErrorMessageMod.InnerErrorMessageProps
import typingsJapgolly.orbitUiReactComponents.distFieldSrcFieldContextMod.ClearFieldContextProps
import typingsJapgolly.orbitUiReactComponents.distFieldSrcFieldContextMod.FieldContextType
import typingsJapgolly.orbitUiReactComponents.distFieldSrcFieldContextMod.UseFieldInputPropsReturn
import typingsJapgolly.orbitUiReactComponents.distFieldSrcFieldContextMod.UseFieldLabelPropsReturn
import typingsJapgolly.orbitUiReactComponents.distFieldSrcFieldContextMod.UseFieldLabelProps_
import typingsJapgolly.orbitUiReactComponents.distFieldSrcFieldContextMod.UseFieldMessagePropsReturn
import typingsJapgolly.orbitUiReactComponents.distFieldSrcFieldMod.InnerFieldProps
import typingsJapgolly.orbitUiReactComponents.distFieldSrcGroupFieldMod.InnerGroupFieldProps
import typingsJapgolly.orbitUiReactComponents.distFieldSrcHelpMessageMod.InnerHelpMessageProps
import typingsJapgolly.orbitUiReactComponents.distFieldSrcLabelMod.InnerLabelProps
import typingsJapgolly.orbitUiReactComponents.distFieldSrcValidMessageMod.InnerValidMessageProps
import typingsJapgolly.orbitUiReactComponents.distFormSrcFieldsetMod.InnerFieldsetProps
import typingsJapgolly.orbitUiReactComponents.distFormSrcFormContextMod.FormContextType
import typingsJapgolly.orbitUiReactComponents.distFormSrcFormMod.InnerFormProps
import typingsJapgolly.orbitUiReactComponents.distFormSrcRowMod.InnerRowProps
import typingsJapgolly.orbitUiReactComponents.distFormSrcUseFormButtonMod.FormButtonProps
import typingsJapgolly.orbitUiReactComponents.distFormSrcUseFormFieldMod.FormFieldProps
import typingsJapgolly.orbitUiReactComponents.distGroupSrcGroupMod.InnerGroupProps
import typingsJapgolly.orbitUiReactComponents.distIconsSrcEmbeddedIconMod.EmbeddedIconProps
import typingsJapgolly.orbitUiReactComponents.distIconsSrcIconListMod.InnerIconListProps
import typingsJapgolly.orbitUiReactComponents.distIconsSrcIconMod.InnerIconProps
import typingsJapgolly.orbitUiReactComponents.distIconsSrcMultiVariantIconMod.InnerMultiVariantIconProps
import typingsJapgolly.orbitUiReactComponents.distIllustrationSrcIllustrationMod.InnerIllustrationProps
import typingsJapgolly.orbitUiReactComponents.distImageSrcAsyncImageMod.InnerAsyncImageProps
import typingsJapgolly.orbitUiReactComponents.distImageSrcImageMod.InnerImageProps
import typingsJapgolly.orbitUiReactComponents.distImageSrcSvgImageMod.InnerSvgImageProps
import typingsJapgolly.orbitUiReactComponents.distInputGroupSrcInputGroupContextMod.ClearInputGroupContextProps
import typingsJapgolly.orbitUiReactComponents.distInputGroupSrcInputGroupContextMod.InputGroupContextType
import typingsJapgolly.orbitUiReactComponents.distInputGroupSrcInputGroupContextMod.UseInputGroupAddonPropsReturn
import typingsJapgolly.orbitUiReactComponents.distInputGroupSrcInputGroupContextMod.UseInputGroupButtonAddonPropsReturn
import typingsJapgolly.orbitUiReactComponents.distInputGroupSrcInputGroupContextMod.UseInputGroupMenuAddonPropsReturn
import typingsJapgolly.orbitUiReactComponents.distInputGroupSrcInputGroupContextMod.UseInputGroupPropsReturn
import typingsJapgolly.orbitUiReactComponents.distInputGroupSrcInputGroupContextMod.UseInputGroupSelectAddonPropsReturn
import typingsJapgolly.orbitUiReactComponents.distInputGroupSrcInputGroupMod.InnerInputGroupProps
import typingsJapgolly.orbitUiReactComponents.distInputGroupSrcTextAddonMod.InnerTextAddonProps
import typingsJapgolly.orbitUiReactComponents.distInputSrcUseGroupInputMod.UseGroupInputProps
import typingsJapgolly.orbitUiReactComponents.distInputSrcUseGroupInputMod.UseGroupInputReturn
import typingsJapgolly.orbitUiReactComponents.distInputSrcUseInputContentMod.UseInputIconProps
import typingsJapgolly.orbitUiReactComponents.distInputSrcUseInputMod.UseInputProps
import typingsJapgolly.orbitUiReactComponents.distInputSrcWrappedInputPropsAdapterMod.AdaptedWrappedInputProps
import typingsJapgolly.orbitUiReactComponents.distLayoutSrcAdaptersMod.Alignment
import typingsJapgolly.orbitUiReactComponents.distLayoutSrcAdaptersMod.Orientation
import typingsJapgolly.orbitUiReactComponents.distLayoutSrcFlexMod.InnerFlexProps
import typingsJapgolly.orbitUiReactComponents.distLayoutSrcInlineMod.InnerInlineProps
import typingsJapgolly.orbitUiReactComponents.distLayoutSrcStackMod.InnerStackProps
import typingsJapgolly.orbitUiReactComponents.distLinkSrcIconLinkMod.InnerIconLinkProps
import typingsJapgolly.orbitUiReactComponents.distLinkSrcLinkMod.InnerLinkProps
import typingsJapgolly.orbitUiReactComponents.distLinkSrcTextLinkMod.InnerTextLinkProps
import typingsJapgolly.orbitUiReactComponents.distListSrcListItemMod.InnerListItemProps
import typingsJapgolly.orbitUiReactComponents.distListSrcListMod.InnerListProps
import typingsJapgolly.orbitUiReactComponents.distListboxSrcListboxContextMod.ListboxContextType
import typingsJapgolly.orbitUiReactComponents.distListboxSrcListboxMod.InnerListboxProps
import typingsJapgolly.orbitUiReactComponents.distListboxSrcListboxMod.ListboxElement
import typingsJapgolly.orbitUiReactComponents.distListboxSrcListboxOptionMod.InnerListboxOptionProps
import typingsJapgolly.orbitUiReactComponents.distListboxSrcListboxSectionMod.InnerListboxSectionProps
import typingsJapgolly.orbitUiReactComponents.distLozengeSrcLozengeMod.InnerLozengeProps
import typingsJapgolly.orbitUiReactComponents.distMenuSrcMenuContextMod.MenuContextType
import typingsJapgolly.orbitUiReactComponents.distMenuSrcMenuItemMod.InnerMenuItemProps
import typingsJapgolly.orbitUiReactComponents.distMenuSrcMenuMod.InnerMenuProps
import typingsJapgolly.orbitUiReactComponents.distMenuSrcMenuSectionMod.InnerMenuSectionProps
import typingsJapgolly.orbitUiReactComponents.distMenuSrcMenuTriggerContextMod.MenuTriggerContextType
import typingsJapgolly.orbitUiReactComponents.distMenuSrcMenuTriggerMod.InnerMenuTriggerProps
import typingsJapgolly.orbitUiReactComponents.distMessageSrcMessageMod.InnerMessageProps
import typingsJapgolly.orbitUiReactComponents.distModalSrcModalMod.InnerModalProps
import typingsJapgolly.orbitUiReactComponents.distModalSrcModalTriggerMod.InnerModalTriggerProps
import typingsJapgolly.orbitUiReactComponents.distNumberInputSrcNumberInputMod.InnerNumberInputProps
import typingsJapgolly.orbitUiReactComponents.distOverlaySrcOverlayArrowMod.InnerOverlayArrowProps
import typingsJapgolly.orbitUiReactComponents.distOverlaySrcOverlayMod.InnerOverlayProps
import typingsJapgolly.orbitUiReactComponents.distOverlaySrcUnderlayMod.InnerUnderlayProps
import typingsJapgolly.orbitUiReactComponents.distOverlaySrcUseOverlayFocusRingMod.UseOverlayFocusRingProps
import typingsJapgolly.orbitUiReactComponents.distOverlaySrcUseOverlayLightDismissMod.UseOverlayLightDismissOptions
import typingsJapgolly.orbitUiReactComponents.distOverlaySrcUseOverlayPositionMod.UseOverlayPositionOptions
import typingsJapgolly.orbitUiReactComponents.distOverlaySrcUseOverlayTriggerMod.UseOverlayTriggerOptions
import typingsJapgolly.orbitUiReactComponents.distOverlaySrcUsePopupMod.UsePopupOptions
import typingsJapgolly.orbitUiReactComponents.distOverlaySrcUseRestoreFocusMod.UseRestoreFocusOptions
import typingsJapgolly.orbitUiReactComponents.distOverlaySrcUseTriggerWidthMod.UseTriggerWidthOptions
import typingsJapgolly.orbitUiReactComponents.distPlaceholdersSrcContentMod.InnerContentProps
import typingsJapgolly.orbitUiReactComponents.distPlaceholdersSrcFooterMod.InnerFooterProps
import typingsJapgolly.orbitUiReactComponents.distPlaceholdersSrcHeaderMod.InnerHeaderProps
import typingsJapgolly.orbitUiReactComponents.distPopoverSrcPopoverMod.InnerPopoverProps
import typingsJapgolly.orbitUiReactComponents.distPopoverSrcPopoverTriggerContextMod.PopoverTriggerContextType
import typingsJapgolly.orbitUiReactComponents.distPopoverSrcPopoverTriggerMod.InnerPopoverTriggerProps
import typingsJapgolly.orbitUiReactComponents.distRadioSrcRadioGroupMod.InnerRadioGroupProps
import typingsJapgolly.orbitUiReactComponents.distRadioSrcRadioMod.InnerRadioProps
import typingsJapgolly.orbitUiReactComponents.distSelectSrcHiddenSelectMod.HiddenSelectProps
import typingsJapgolly.orbitUiReactComponents.distSelectSrcSelectMod.InnerSelectProps
import typingsJapgolly.orbitUiReactComponents.distSelectSrcUseSelectMod.UseSelectProps
import typingsJapgolly.orbitUiReactComponents.distSharedSrcAugmentElementMod.RecordWithSize
import typingsJapgolly.orbitUiReactComponents.distSharedSrcCheckableContextMod.CheckableContextType
import typingsJapgolly.orbitUiReactComponents.distSharedSrcCheckableContextMod.UseCheckablePropsReturn
import typingsJapgolly.orbitUiReactComponents.distSharedSrcFocusableTreeWalkerMod.FocusableTreeWalkerOptions
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.AsRef
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typingsJapgolly.orbitUiReactComponents.distSharedSrcMergePropsMod.Props
import typingsJapgolly.orbitUiReactComponents.distSharedSrcMergePropsMod.TupleTypes
import typingsJapgolly.orbitUiReactComponents.distSharedSrcMergePropsMod.UnionToIntersection
import typingsJapgolly.orbitUiReactComponents.distSharedSrcSizeMod.Size
import typingsJapgolly.orbitUiReactComponents.distSharedSrcSizeMod.SizeAdapter
import typingsJapgolly.orbitUiReactComponents.distSharedSrcSlotsMod.GetSlotsReturn
import typingsJapgolly.orbitUiReactComponents.distSharedSrcSlotsMod.SlotOptions
import typingsJapgolly.orbitUiReactComponents.distSharedSrcSlotsMod.UseSlotsReturn
import typingsJapgolly.orbitUiReactComponents.distSharedSrcStyleContextMod.StyleContextType
import typingsJapgolly.orbitUiReactComponents.distSharedSrcUseAutoFocusMod.AutoFocusChildOptions
import typingsJapgolly.orbitUiReactComponents.distSharedSrcUseAutoFocusMod.AutoFocusOptions
import typingsJapgolly.orbitUiReactComponents.distSharedSrcUseChainedEventCallbackMod.ChainableFunction
import typingsJapgolly.orbitUiReactComponents.distSharedSrcUseControllableStateMod.ControllableStateOptions
import typingsJapgolly.orbitUiReactComponents.distSharedSrcUseFocusManagerMod.FocusManagerOptions
import typingsJapgolly.orbitUiReactComponents.distSharedSrcUseFocusScopeMod.ChangeEventHandler
import typingsJapgolly.orbitUiReactComponents.distSharedSrcUseFocusWithinMod.UseFocusWithinOptions
import typingsJapgolly.orbitUiReactComponents.distSharedSrcUseKeyboardNavigationMod.KeyboardNavigationBindings
import typingsJapgolly.orbitUiReactComponents.distSharedSrcUseKeyboardNavigationMod.KeyboardNavigationOptions
import typingsJapgolly.orbitUiReactComponents.distSharedSrcUseMergedRefsMod.AssignableRef
import typingsJapgolly.orbitUiReactComponents.distSharedSrcUseMergedRefsMod.MergedRef
import typingsJapgolly.orbitUiReactComponents.distSharedSrcUseMergedRefsMod.UnwrapStateType
import typingsJapgolly.orbitUiReactComponents.distSharedSrcUseResizeObserverMod.UseResizeObserverOptions
import typingsJapgolly.orbitUiReactComponents.distSwitchSrcSwitchMod.InnerSwitchProps
import typingsJapgolly.orbitUiReactComponents.distTabsSrcTabListMod.InnerTabListProps
import typingsJapgolly.orbitUiReactComponents.distTabsSrcTabMod.InnerTabProps
import typingsJapgolly.orbitUiReactComponents.distTabsSrcTabPanelMod.InnerTabPanelProps
import typingsJapgolly.orbitUiReactComponents.distTabsSrcTabPanelsMod.TabPanelsProps
import typingsJapgolly.orbitUiReactComponents.distTabsSrcTabsContextMod.TabsContextType
import typingsJapgolly.orbitUiReactComponents.distTabsSrcTabsMod.InnerTabsProps
import typingsJapgolly.orbitUiReactComponents.distTagSrcTagListMod.InnerTagListProps
import typingsJapgolly.orbitUiReactComponents.distTagSrcTagMod.InnerTagProps
import typingsJapgolly.orbitUiReactComponents.distTextAreaSrcTextAreaMod.InnerTextAreaProps
import typingsJapgolly.orbitUiReactComponents.distTextInputSrcPasswordInputMod.InnerPasswordInputProps
import typingsJapgolly.orbitUiReactComponents.distTextInputSrcSearchInputMod.InnerSearchInputProps
import typingsJapgolly.orbitUiReactComponents.distTextInputSrcTextInputMod.InnerTextInputProps
import typingsJapgolly.orbitUiReactComponents.distThemeProviderSrcThemeContextMod.ThemeContextType
import typingsJapgolly.orbitUiReactComponents.distThemeProviderSrcThemeProviderMod.ColorScheme
import typingsJapgolly.orbitUiReactComponents.distThemeProviderSrcThemeProviderMod.ColorSchemeOrSystem
import typingsJapgolly.orbitUiReactComponents.distThemeProviderSrcThemeProviderMod.ThemeProviderProps
import typingsJapgolly.orbitUiReactComponents.distTileSrcTileGroupMod.InnerTileGroupProps
import typingsJapgolly.orbitUiReactComponents.distTileSrcTileLinkMod.InnerTileLinkProps
import typingsJapgolly.orbitUiReactComponents.distTileSrcTileMod.InnerTileProps
import typingsJapgolly.orbitUiReactComponents.distToolbarSrcToolbarContextMod.ClearToolbarProps
import typingsJapgolly.orbitUiReactComponents.distToolbarSrcToolbarContextMod.ToolbarContextType
import typingsJapgolly.orbitUiReactComponents.distToolbarSrcToolbarContextMod.UseToolbarPropsReturn
import typingsJapgolly.orbitUiReactComponents.distToolbarSrcToolbarMod.InnerToolbarProps
import typingsJapgolly.orbitUiReactComponents.distTooltipSrcTooltipMod.InnerTooltipProps
import typingsJapgolly.orbitUiReactComponents.distTooltipSrcTooltipTriggerMod.InnerTooltipTriggerProps
import typingsJapgolly.orbitUiReactComponents.distTransitionSrcTransitionMod.InnerTransitionProps
import typingsJapgolly.orbitUiReactComponents.distTypographySrcHeadingMod.InnerHeadingProps
import typingsJapgolly.orbitUiReactComponents.distTypographySrcParagraphMod.InnerParagraphProps
import typingsJapgolly.orbitUiReactComponents.distTypographySrcTextMod.InnerTextProps
import typingsJapgolly.orbitUiReactComponents.distVisuallyHiddenSrcVisuallyHiddenMod.InnerVisuallyHiddenProps
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsBooleans.`false`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`2xs`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.button
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.className
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.dialog
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.inherit
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.input
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.lg
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.listbox
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.md
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.menu
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.sm
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.svg
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.xs
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.ForwardRefRenderFunction
import typingsJapgolly.react.mod.Provider
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.EventListenerOrEventListenerObject
import typingsJapgolly.std.Omit
import typingsJapgolly.std.Record
import typingsJapgolly.std.ResizeObserverEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@orbit-ui/react-components", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components", "Accordion")
  @js.native
  val Accordion: OrbitComponent[HTMLElement, InnerAccordionProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "AccordionContext")
  @js.native
  val AccordionContext: Context[AccordionContextType] = js.native
  
  @JSImport("@orbit-ui/react-components", "AccordionHeader")
  @js.native
  val AccordionHeader: OrbitComponent[HTMLElement, InnerAccordionHeaderProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "AccordionPanel")
  @js.native
  val AccordionPanel: OrbitComponent[HTMLElement, InnerAccordionPanelProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "AddIcon")
  @js.native
  val AddIcon: OrbitComponent[svg, OmitInnerMultiVariantIcon] = js.native
  
  @JSImport("@orbit-ui/react-components", "AddIcon24")
  @js.native
  val AddIcon24: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "AddIcon32")
  @js.native
  val AddIcon32: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "Alert")
  @js.native
  val Alert: OrbitComponent[HTMLElement, InnerAlertProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "AlertTrigger")
  @js.native
  val AlertTrigger: OrbitComponent[HTMLElement, InnerDialogTriggerProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "ArrowIcon")
  @js.native
  val ArrowIcon: OrbitComponent[svg, OmitInnerMultiVariantIcon] = js.native
  
  @JSImport("@orbit-ui/react-components", "ArrowIcon24")
  @js.native
  val ArrowIcon24: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "ArrowIcon32")
  @js.native
  val ArrowIcon32: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "AsyncImage")
  @js.native
  val AsyncImage: OrbitComponent[HTMLElement, InnerAsyncImageProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "Autocomplete")
  @js.native
  val Autocomplete: OrbitComponent[input, InnerAutocompleteProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "Avatar")
  @js.native
  val Avatar: OrbitComponent[HTMLElement, InnerAvatarProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "AvatarGroup")
  @js.native
  val AvatarGroup: OrbitComponent[HTMLElement, InnerAvatarGroupProps] = js.native
  
  inline def AvatarText(props: AvatarTextProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("AvatarText")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components", "Badge")
  @js.native
  val Badge: OrbitComponent[HTMLElement, InnerBadgeProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "Box")
  @js.native
  val Box: OrbitComponent[HTMLElement, InnerBoxProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "Button")
  @js.native
  val Button: OrbitComponent[button, InnerButtonProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "ButtonGroup")
  @js.native
  val ButtonGroup: OrbitComponent[HTMLElement, InnerButtonGroupProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "CalendarIcon")
  @js.native
  val CalendarIcon: OrbitComponent[svg, OmitInnerMultiVariantIcon] = js.native
  
  @JSImport("@orbit-ui/react-components", "CalendarIcon24")
  @js.native
  val CalendarIcon24: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "CalendarIcon32")
  @js.native
  val CalendarIcon32: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "Card")
  @js.native
  val Card: OrbitComponent[HTMLElement, InnerCardProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "CaretIcon")
  @js.native
  val CaretIcon: OrbitComponent[svg, OmitInnerMultiVariantIcon] = js.native
  
  @JSImport("@orbit-ui/react-components", "CaretIcon24")
  @js.native
  val CaretIcon24: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "CaretIcon32")
  @js.native
  val CaretIcon32: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "CheckCircleIcon")
  @js.native
  val CheckCircleIcon: OrbitComponent[svg, OmitInnerMultiVariantIcon] = js.native
  
  @JSImport("@orbit-ui/react-components", "CheckCircleIcon24")
  @js.native
  val CheckCircleIcon24: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "CheckCircleIcon32")
  @js.native
  val CheckCircleIcon32: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "CheckIcon")
  @js.native
  val CheckIcon: OrbitComponent[svg, OmitInnerMultiVariantIcon] = js.native
  
  @JSImport("@orbit-ui/react-components", "CheckIcon24")
  @js.native
  val CheckIcon24: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "CheckIcon32")
  @js.native
  val CheckIcon32: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "CheckableContext")
  @js.native
  val CheckableContext: Context[CheckableContextType] = js.native
  
  @JSImport("@orbit-ui/react-components", "Checkbox")
  @js.native
  val Checkbox: OrbitComponent[HTMLElement, InnerCheckboxProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "CheckboxGroup")
  @js.native
  val CheckboxGroup: OrbitComponent[HTMLElement, InnerCheckboxGroupProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "ChevronIcon")
  @js.native
  val ChevronIcon: OrbitComponent[svg, OmitInnerMultiVariantIcon] = js.native
  
  @JSImport("@orbit-ui/react-components", "ChevronIcon24")
  @js.native
  val ChevronIcon24: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "ChevronIcon32")
  @js.native
  val ChevronIcon32: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  inline def ClearFieldContext(hasChildren: ClearFieldContextProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ClearFieldContext")(hasChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components", "ClearFilterIcon")
  @js.native
  val ClearFilterIcon: OrbitComponent[svg, OmitInnerMultiVariantIcon] = js.native
  
  @JSImport("@orbit-ui/react-components", "ClearFilterIcon24")
  @js.native
  val ClearFilterIcon24: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "ClearFilterIcon32")
  @js.native
  val ClearFilterIcon32: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  inline def ClearInputGroupContext(hasChildren: ClearInputGroupContextProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ClearInputGroupContext")(hasChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ClearToolbar(hasChildren: ClearToolbarProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ClearToolbar")(hasChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components", "CollectionBuilder")
  @js.native
  open class CollectionBuilder ()
    extends typingsJapgolly.orbitUiReactComponents.distCollectionMod.CollectionBuilder
  
  @JSImport("@orbit-ui/react-components", "CompositeKeyWeakMap")
  @js.native
  open class CompositeKeyWeakMap[T] ()
    extends typingsJapgolly.orbitUiReactComponents.distSharedMod.CompositeKeyWeakMap[T]
  
  @JSImport("@orbit-ui/react-components", "Content")
  @js.native
  val Content: OrbitComponent[HTMLElement, InnerContentProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "Counter")
  @js.native
  val Counter: OrbitComponent[HTMLElement, InnerCounterProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "CrossButton")
  @js.native
  val CrossButton: OrbitComponent[button, InnerCrossButtonProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "CrossIcon")
  @js.native
  val CrossIcon: OrbitComponent[svg, OmitInnerMultiVariantIcon] = js.native
  
  @JSImport("@orbit-ui/react-components", "CrossIcon24")
  @js.native
  val CrossIcon24: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "CrossIcon32")
  @js.native
  val CrossIcon32: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "CsvIcon")
  @js.native
  val CsvIcon: OrbitComponent[svg, OmitInnerMultiVariantIcon] = js.native
  
  @JSImport("@orbit-ui/react-components", "CsvIcon24")
  @js.native
  val CsvIcon24: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "CsvIcon32")
  @js.native
  val CsvIcon32: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "DashIcon")
  @js.native
  val DashIcon: OrbitComponent[svg, OmitInnerMultiVariantIcon] = js.native
  
  @JSImport("@orbit-ui/react-components", "DashIcon24")
  @js.native
  val DashIcon24: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "DashIcon32")
  @js.native
  val DashIcon32: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "DateInput")
  @js.native
  val DateInput: OrbitComponent[input, InnerDateInputProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "DateRangeInput")
  @js.native
  val DateRangeInput: OrbitComponent[HTMLElement, InnerDateRangeInputProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "Dialog")
  @js.native
  val Dialog: OrbitComponent[HTMLElement, InnerDialogProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "DialogTrigger")
  @js.native
  val DialogTrigger: OrbitComponent[HTMLElement, InnerDialogTriggerProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "DialogTriggerContext")
  @js.native
  val DialogTriggerContext: Context[DialogTriggerContextType] = js.native
  
  @JSImport("@orbit-ui/react-components", "Disclosure")
  @js.native
  val Disclosure: OrbitComponent[HTMLElement, InnerDisclosureProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "DisclosureArrow")
  @js.native
  val DisclosureArrow: OrbitComponent[HTMLElement, InnerDisclosureArrowProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "DisclosureContext")
  @js.native
  val DisclosureContext: Context[DisclosureContextType] = js.native
  
  @JSImport("@orbit-ui/react-components", "Divider")
  @js.native
  val Divider: OrbitComponent[HTMLElement, InnerDividerProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "DomScope")
  @js.native
  open class DomScope protected ()
    extends typingsJapgolly.orbitUiReactComponents.distSharedMod.DomScope {
    def this(scopeRef: RefHandle[js.Array[HTMLElement]], handlersRef: RefHandle[js.Array[ChangeEventHandler]]) = this()
  }
  
  @JSImport("@orbit-ui/react-components", "Dot")
  @js.native
  val Dot: OrbitComponent[HTMLElement, InnerDotProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "DownloadIcon")
  @js.native
  val DownloadIcon: OrbitComponent[svg, OmitInnerMultiVariantIcon] = js.native
  
  @JSImport("@orbit-ui/react-components", "DownloadIcon24")
  @js.native
  val DownloadIcon24: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "DownloadIcon32")
  @js.native
  val DownloadIcon32: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "EditIcon")
  @js.native
  val EditIcon: OrbitComponent[svg, OmitInnerMultiVariantIcon] = js.native
  
  @JSImport("@orbit-ui/react-components", "EditIcon24")
  @js.native
  val EditIcon24: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "EditIcon32")
  @js.native
  val EditIcon32: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "ElementIterator")
  @js.native
  open class ElementIterator[T] protected ()
    extends typingsJapgolly.orbitUiReactComponents.distSharedMod.ElementIterator[T] {
    def this(elements: js.Array[T]) = this()
    def this(elements: js.Array[T], hasFrom: From) = this()
  }
  
  @JSImport("@orbit-ui/react-components", "EmailIcon")
  @js.native
  val EmailIcon: OrbitComponent[svg, OmitInnerMultiVariantIcon] = js.native
  
  @JSImport("@orbit-ui/react-components", "EmailIcon24")
  @js.native
  val EmailIcon24: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "EmailIcon32")
  @js.native
  val EmailIcon32: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "EmailReminderIcon")
  @js.native
  val EmailReminderIcon: OrbitComponent[svg, OmitInnerMultiVariantIcon] = js.native
  
  @JSImport("@orbit-ui/react-components", "EmailReminderIcon24")
  @js.native
  val EmailReminderIcon24: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "EmailReminderIcon32")
  @js.native
  val EmailReminderIcon32: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  object EmbeddedIcon {
    
    inline def apply(hasSizeChildrenRest: EmbeddedIconProps): japgolly.scalajs.react.facade.React.Element = ^.asInstanceOf[js.Dynamic].apply(hasSizeChildrenRest.asInstanceOf[js.Any]).asInstanceOf[japgolly.scalajs.react.facade.React.Element]
    
    @JSImport("@orbit-ui/react-components", "EmbeddedIcon")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@orbit-ui/react-components", "EmbeddedIcon.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@orbit-ui/react-components", "ErrorMessage")
  @js.native
  val ErrorMessage: OrbitComponent[HTMLElement, InnerErrorMessageProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "EyeIcon")
  @js.native
  val EyeIcon: OrbitComponent[svg, OmitInnerMultiVariantIcon] = js.native
  
  @JSImport("@orbit-ui/react-components", "EyeIcon24")
  @js.native
  val EyeIcon24: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "EyeIcon32")
  @js.native
  val EyeIcon32: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "Field")
  @js.native
  val Field: OrbitComponent[HTMLElement, InnerFieldProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "FieldContext")
  @js.native
  val FieldContext: Context[FieldContextType] = js.native
  
  @JSImport("@orbit-ui/react-components", "Fieldset")
  @js.native
  val Fieldset: OrbitComponent[HTMLElement, InnerFieldsetProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "FileIcon")
  @js.native
  val FileIcon: OrbitComponent[svg, OmitInnerMultiVariantIcon] = js.native
  
  @JSImport("@orbit-ui/react-components", "FileIcon24")
  @js.native
  val FileIcon24: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "FileIcon32")
  @js.native
  val FileIcon32: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "FilterIcon")
  @js.native
  val FilterIcon: OrbitComponent[svg, OmitInnerMultiVariantIcon] = js.native
  
  @JSImport("@orbit-ui/react-components", "FilterIcon24")
  @js.native
  val FilterIcon24: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "FilterIcon32")
  @js.native
  val FilterIcon32: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "FlagIcon")
  @js.native
  val FlagIcon: OrbitComponent[svg, OmitInnerMultiVariantIcon] = js.native
  
  @JSImport("@orbit-ui/react-components", "FlagIcon24")
  @js.native
  val FlagIcon24: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "FlagIcon32")
  @js.native
  val FlagIcon32: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "Flex")
  @js.native
  val Flex: OrbitComponent[HTMLElement, InnerFlexProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "FocusManager")
  @js.native
  open class FocusManager protected ()
    extends typingsJapgolly.orbitUiReactComponents.distSharedMod.FocusManager {
    def this(scope: typingsJapgolly.orbitUiReactComponents.distSharedSrcUseFocusScopeMod.DomScope) = this()
    def this(
      scope: typingsJapgolly.orbitUiReactComponents.distSharedSrcUseFocusScopeMod.DomScope,
      hasIsVirtualKeyPropOnFocus: FocusManagerOptions
    ) = this()
  }
  
  @JSImport("@orbit-ui/react-components", "FocusTarget")
  @js.native
  object FocusTarget extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.orbitUiReactComponents.distSharedSrcFocusTargetMod.FocusTarget & String
      ] = js.native
    
    /* "first" */ val first: typingsJapgolly.orbitUiReactComponents.distSharedSrcFocusTargetMod.FocusTarget.first & String = js.native
    
    /* "last" */ val last: typingsJapgolly.orbitUiReactComponents.distSharedSrcFocusTargetMod.FocusTarget.last & String = js.native
  }
  
  @JSImport("@orbit-ui/react-components", "FocusableElementSelector")
  @js.native
  val FocusableElementSelector: String = js.native
  
  @JSImport("@orbit-ui/react-components", "FolderIcon")
  @js.native
  val FolderIcon: OrbitComponent[svg, OmitInnerMultiVariantIcon] = js.native
  
  @JSImport("@orbit-ui/react-components", "FolderIcon24")
  @js.native
  val FolderIcon24: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "FolderIcon32")
  @js.native
  val FolderIcon32: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "Footer")
  @js.native
  val Footer: OrbitComponent[HTMLElement, InnerFooterProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "Form")
  @js.native
  val Form: OrbitComponent[HTMLElement, InnerFormProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "FormContext")
  @js.native
  val FormContext: Context[FormContextType] = js.native
  
  @JSImport("@orbit-ui/react-components", "GearIcon")
  @js.native
  val GearIcon: OrbitComponent[svg, OmitInnerMultiVariantIcon] = js.native
  
  @JSImport("@orbit-ui/react-components", "GearIcon24")
  @js.native
  val GearIcon24: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "GearIcon32")
  @js.native
  val GearIcon32: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "Group")
  @js.native
  val Group: OrbitComponent[HTMLElement, InnerGroupProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "GroupField")
  @js.native
  val GroupField: OrbitComponent[HTMLElement, InnerGroupFieldProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "GroupIcon")
  @js.native
  val GroupIcon: OrbitComponent[svg, OmitInnerMultiVariantIcon] = js.native
  
  @JSImport("@orbit-ui/react-components", "GroupIcon24")
  @js.native
  val GroupIcon24: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "GroupIcon32")
  @js.native
  val GroupIcon32: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "GuestAddIcon")
  @js.native
  val GuestAddIcon: OrbitComponent[svg, OmitInnerMultiVariantIcon] = js.native
  
  @JSImport("@orbit-ui/react-components", "GuestAddIcon24")
  @js.native
  val GuestAddIcon24: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "GuestAddIcon32")
  @js.native
  val GuestAddIcon32: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "GuestRemoveIcon")
  @js.native
  val GuestRemoveIcon: OrbitComponent[svg, OmitInnerMultiVariantIcon] = js.native
  
  @JSImport("@orbit-ui/react-components", "GuestRemoveIcon24")
  @js.native
  val GuestRemoveIcon24: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "GuestRemoveIcon32")
  @js.native
  val GuestRemoveIcon32: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "H1")
  @js.native
  val H1: OrbitComponent[ElementType, OmitInnerHeadingPropssize] = js.native
  
  @JSImport("@orbit-ui/react-components", "H2")
  @js.native
  val H2: OrbitComponent[ElementType, OmitInnerHeadingPropssize] = js.native
  
  @JSImport("@orbit-ui/react-components", "H3")
  @js.native
  val H3: OrbitComponent[ElementType, OmitInnerHeadingPropssize] = js.native
  
  @JSImport("@orbit-ui/react-components", "H4")
  @js.native
  val H4: OrbitComponent[ElementType, OmitInnerHeadingPropssize] = js.native
  
  @JSImport("@orbit-ui/react-components", "H5")
  @js.native
  val H5: OrbitComponent[ElementType, OmitInnerHeadingPropssize] = js.native
  
  @JSImport("@orbit-ui/react-components", "H6")
  @js.native
  val H6: OrbitComponent[ElementType, OmitInnerHeadingPropssize] = js.native
  
  @JSImport("@orbit-ui/react-components", "Header")
  @js.native
  val Header: OrbitComponent[HTMLElement, InnerHeaderProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "Heading")
  @js.native
  val Heading: OrbitComponent[HTMLElement, InnerHeadingProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "HelpIcon")
  @js.native
  val HelpIcon: OrbitComponent[svg, OmitInnerMultiVariantIcon] = js.native
  
  @JSImport("@orbit-ui/react-components", "HelpIcon24")
  @js.native
  val HelpIcon24: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "HelpIcon32")
  @js.native
  val HelpIcon32: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "HelpMessage")
  @js.native
  val HelpMessage: OrbitComponent[HTMLElement, InnerHelpMessageProps] = js.native
  
  object HiddenAutocomplete {
    
    inline def apply(hasNameValueRequiredValidationStateRest: HiddenAutocompleteProps): Element = ^.asInstanceOf[js.Dynamic].apply(hasNameValueRequiredValidationStateRest.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@orbit-ui/react-components", "HiddenAutocomplete")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@orbit-ui/react-components", "HiddenAutocomplete.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  object HiddenSelect {
    
    inline def apply(hasNameSelectedKeyRequiredValidationStateRest: HiddenSelectProps): Element = ^.asInstanceOf[js.Dynamic].apply(hasNameSelectedKeyRequiredValidationStateRest.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@orbit-ui/react-components", "HiddenSelect")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@orbit-ui/react-components", "HiddenSelect.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@orbit-ui/react-components", "HorizontalDotsIcon")
  @js.native
  val HorizontalDotsIcon: OrbitComponent[svg, OmitInnerMultiVariantIcon] = js.native
  
  @JSImport("@orbit-ui/react-components", "HorizontalDotsIcon24")
  @js.native
  val HorizontalDotsIcon24: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "HorizontalDotsIcon32")
  @js.native
  val HorizontalDotsIcon32: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "Icon")
  @js.native
  val Icon: OrbitComponent[svg, InnerIconProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "IconButton")
  @js.native
  val IconButton: OrbitComponent[button, InnerIconButtonProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "IconLink")
  @js.native
  val IconLink: OrbitComponent[HTMLElement, InnerIconLinkProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "IconList")
  @js.native
  val IconList: OrbitComponent[HTMLElement, InnerIconListProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "Illustration")
  @js.native
  val Illustration: OrbitComponent[HTMLElement, InnerIllustrationProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "Image")
  @js.native
  val Image: OrbitComponent[HTMLElement, InnerImageProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "ImageIcon")
  @js.native
  val ImageIcon: OrbitComponent[svg, OmitInnerMultiVariantIcon] = js.native
  
  @JSImport("@orbit-ui/react-components", "ImageIcon24")
  @js.native
  val ImageIcon24: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "ImageIcon32")
  @js.native
  val ImageIcon32: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "InfoIcon")
  @js.native
  val InfoIcon: OrbitComponent[svg, OmitInnerMultiVariantIcon] = js.native
  
  @JSImport("@orbit-ui/react-components", "InfoIcon24")
  @js.native
  val InfoIcon24: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "InfoIcon32")
  @js.native
  val InfoIcon32: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "Inline")
  @js.native
  val Inline: OrbitComponent[HTMLElement, InnerInlineProps] = js.native
  
  inline def InnerAccordion(
    hasIdExpandedKeysPropDefaultExpandedKeysOnExpansionChangeExpansionModeAutoFocusVariantAsChildrenForwardedRefRest: InnerAccordionProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerAccordion")(hasIdExpandedKeysPropDefaultExpandedKeysOnExpansionChangeExpansionModeAutoFocusVariantAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerAccordionHeader(props: InnerAccordionHeaderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerAccordionHeader")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerAccordionPanel(props: InnerAccordionPanelProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerAccordionPanel")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerAlert(
    hasVariantPrimaryButtonLabelPrimaryButtonDisabledSecondaryButtonLabelSecondaryButtonDisabledCancelButtonLabelAutoFocusButtonOnPrimaryButtonClickOnSecondaryButtonClickOnCancelButtonClickZIndexChildrenForwardedRefRest: InnerAlertProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerAlert")(hasVariantPrimaryButtonLabelPrimaryButtonDisabledSecondaryButtonLabelSecondaryButtonDisabledCancelButtonLabelAutoFocusButtonOnPrimaryButtonClickOnSecondaryButtonClickOnCancelButtonClickZIndexChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerAlertTrigger(hasForwardedRefRest: InnerAlertTriggerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerAlertTrigger")(hasForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerAutocomplete(props: InnerAutocompleteProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerAutocomplete")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerAvatar(hasNameSrcRetryCountSizeAriaLabelAsForwardedRefRest: InnerAvatarProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerAvatar")(hasNameSrcRetryCountSizeAriaLabelAsForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerAvatarGroup(hasSizeAsChildrenForwardedRefRest: InnerAvatarGroupProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerAvatarGroup")(hasSizeAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerBadge(hasVariantOverlapAsChildrenForwardedRefRest: InnerBadgeProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerBadge")(hasVariantOverlapAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerBox(props: InnerBoxProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerBox")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerButton(props: InnerButtonProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerButton")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerButtonGroup(props: InnerButtonGroupProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerButtonGroup")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerCard(hasOrientationSizeFluidAsChildrenForwardedRefRest: InnerCardProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerCard")(hasOrientationSizeFluidAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerCheckbox(props: InnerCheckboxProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerCheckbox")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerCheckboxGroup(props: InnerCheckboxGroupProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerCheckboxGroup")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerContent(hasAsChildrenForwardedRefRest: InnerContentProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerContent")(hasAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerCounter(props: InnerCounterProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerCounter")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerCrossButton(hasForwardedRefRest: InnerCrossButtonProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerCrossButton")(hasForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerDateInput(
    hasValuePropDefaultValuePlaceholderOnDateChangePresetsPresetsVariantFluidWrapperPropsDisabledReadOnlyClassNameStyleAsForwardedRefRest: InnerDateInputProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerDateInput")(hasValuePropDefaultValuePlaceholderOnDateChangePresetsPresetsVariantFluidWrapperPropsDisabledReadOnlyClassNameStyleAsForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerDateRangeInput(props: InnerDateRangeInputProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerDateRangeInput")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerDialog(
    hasIdRoleSizeDismissableFocusZIndexAriaLabelAriaLabelledByAriaDescribedByWrapperPropsAsChildrenForwardedRefRest: InnerDialogProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerDialog")(hasIdRoleSizeDismissableFocusZIndexAriaLabelAriaLabelledByAriaDescribedByWrapperPropsAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerDialogTrigger(
    hasOpenPropDefaultOpenOnOpenChangeDismissableZIndexAsChildrenForwardedRefRest: InnerDialogTriggerProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerDialogTrigger")(hasOpenPropDefaultOpenOnOpenChangeDismissableZIndexAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerDisclosure(hasIdOpenDefaultOpenOnOpenChangeAsChildrenForwardedRefRest: InnerDisclosureProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerDisclosure")(hasIdOpenDefaultOpenOnOpenChangeAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerDisclosureArrow(hasOpenForwardedRefRest: InnerDisclosureArrowProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerDisclosureArrow")(hasOpenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerDivider(hasOrientationAsChildrenForwardedRefRest: InnerDividerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerDivider")(hasOrientationAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerDot(props: InnerDotProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerDot")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerErrorMessage(props: InnerErrorMessageProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerErrorMessage")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerField(props: InnerFieldProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerField")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerFieldset(hasIdLabelAsChildrenForwardedRefRest: InnerFieldsetProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerFieldset")(hasIdLabelAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerFlex(
    hasDirectionInlineReverseAlignContentAlignItemsJustifyContentGapWrapFluidHasWidthHeightStyleChildrenForwardedRefRest: InnerFlexProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerFlex")(hasDirectionInlineReverseAlignContentAlignItemsJustifyContentGapWrapFluidHasWidthHeightStyleChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerFooter(hasAsChildrenForwardedRefRest: InnerFooterProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerFooter")(hasAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerForm(props: InnerFormProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerForm")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerGroup(hasOrientationAlignVerticalAlignWrapChildrenForwardedRefRest: InnerGroupProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerGroup")(hasOrientationAlignVerticalAlignWrapChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerGroupField(props: InnerGroupFieldProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerGroupField")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerHeader(hasAsChildrenForwardedRefRest: InnerHeaderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerHeader")(hasAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerHeading(props: InnerHeadingProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerHeading")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerHelpMessage(props: InnerHelpMessageProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerHelpMessage")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerIcon(props: InnerIconProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerIcon")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerIconButton(props: InnerIconButtonProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerIconButton")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerIconLink(props: InnerIconLinkProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerIconLink")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerIconList(hasSizeDisabledChildrenAsForwardedRefRest: InnerIconListProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerIconList")(hasSizeDisabledChildrenAsForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerIllustration(hasOrientationShapeColorAsChildrenForwardedRefRest: InnerIllustrationProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerIllustration")(hasOrientationShapeColorAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerImage(hasShapeSizeWidthHeightFitPositionAsForwardedRefRest: InnerImageProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerImage")(hasShapeSizeWidthHeightFitPositionAsForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerInline(hasAlignVerticalAlignChildrenGapWrapForwardedRefRest: InnerInlineProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerInline")(hasAlignVerticalAlignChildrenGapWrapForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerInputGroup(hasFluidDisabledReadOnlyAsChildrenForwardedRefRest: InnerInputGroupProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerInputGroup")(hasFluidDisabledReadOnlyAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerItem(props: InnerItemProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerItem")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerLabel(props: InnerLabelProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerLabel")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerLink(props: InnerLinkProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerLink")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerListItem(hasSizeAsChildrenForwardedRefRest: InnerListItemProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerListItem")(hasSizeAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerListbox(
    hasIdSelectedKeysPropDefaultSelectedKeysValidationStateOnSelectionChangeOnFocusChangeSelectionModeNodesPropAutoFocusDefaultFocusTargetFocusOnHoverUseVirtualFocusTabbableFluidAriaLabelAriaLabelledByAsChildrenForwardedRefRest: InnerListboxProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerListbox")(hasIdSelectedKeysPropDefaultSelectedKeysValidationStateOnSelectionChangeOnFocusChangeSelectionModeNodesPropAutoFocusDefaultFocusTargetFocusOnHoverUseVirtualFocusTabbableFluidAriaLabelAriaLabelledByAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerListboxOption(hasHasKeyTooltipIdDisabledActiveFocusHoverAsChildrenForwardedRefRest: InnerListboxOptionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerListboxOption")(hasHasKeyTooltipIdDisabledActiveFocusHoverAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerListboxSection(hasIdTitleAsChildrenForwardedRefRest: InnerListboxSectionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerListboxSection")(hasIdTitleAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerLozenge(hasColorSizeAsChildrenForwardedRefRest: InnerLozengeProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerLozenge")(hasColorSizeAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerMenu(
    hasIdSelectedKeysPropDefaultSelectedKeysValidationStateOnSelectionChangeSelectionModeNodesPropAutoFocusDefaultFocusTargetFluidAriaLabelAriaLabelledByAsChildrenForwardedRefRest: InnerMenuProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerMenu")(hasIdSelectedKeysPropDefaultSelectedKeysValidationStateOnSelectionChangeSelectionModeNodesPropAutoFocusDefaultFocusTargetFluidAriaLabelAriaLabelledByAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerMenuItem(hasHasKeyTooltipIdDisabledActiveFocusHoverAsChildrenForwardedRefRest: InnerMenuItemProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerMenuItem")(hasHasKeyTooltipIdDisabledActiveFocusHoverAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerMenuSection(hasIdTitleAsChildrenForwardedRefRest: InnerMenuSectionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerMenuSection")(hasIdTitleAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerMenuTrigger(props: InnerMenuTriggerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerMenuTrigger")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerMessage(hasShowVariantOnDismissRolePropAsChildrenForwardedRefRest: InnerMessageProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerMessage")(hasShowVariantOnDismissRolePropAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerModal(hasFullscreenDismissableZIndexChildrenForwardedRefRest: InnerModalProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerModal")(hasFullscreenDismissableZIndexChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerModalTrigger(hasDismissableForwardedRefRest: InnerModalTriggerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerModalTrigger")(hasDismissableForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerMultiVariantIcon(hasComponent24Component32SizeForwardedRefRest: InnerMultiVariantIconProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerMultiVariantIcon")(hasComponent24Component32SizeForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerNumberInput(props: InnerNumberInputProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerNumberInput")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerOrderedList(hasAsForwardedRefRest: InnerListProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerOrderedList")(hasAsForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerOverlay(hasShowBorderOffsetContainerElementZIndexAsChildrenForwardedRefRest: InnerOverlayProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerOverlay")(hasShowBorderOffsetContainerElementZIndexAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerOverlayArrow(hasAsForwardedRefRest: InnerOverlayArrowProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerOverlayArrow")(hasAsForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerParagraph(props: InnerParagraphProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerParagraph")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerPasswordInput(props: InnerPasswordInputProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerPasswordInput")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerPopover(hasIdFocusAriaLabelAriaLabelledByAsChildrenForwardedRefRest: InnerPopoverProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerPopover")(hasIdFocusAriaLabelAriaLabelledByAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerPopoverTrigger(
    hasIdOpenDefaultOpenPositionPropOnOpenChangeDismissableAllowFlipAllowPreventOverflowContainerElementZIndexAsChildrenForwardedRefRest: InnerPopoverTriggerProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerPopoverTrigger")(hasIdOpenDefaultOpenPositionPropOnOpenChangeDismissableAllowFlipAllowPreventOverflowContainerElementZIndexAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerRadio(props: InnerRadioProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerRadio")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerRadioGroup(props: InnerRadioGroupProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerRadioGroup")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerRow(props: InnerRowProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerRow")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerSearchInput(props: InnerSearchInputProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerSearchInput")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerSection(props: InnerSectionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerSection")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerSelect(props: InnerSelectProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerSelect")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerStack(hasAlignVerticalAlignGapWrapChildrenForwardedRefRest: InnerStackProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerStack")(hasAlignVerticalAlignGapWrapChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerSvgImage(hasSrcSizeWidthHeightStrokeFillAriaLabelForwardedRefRest: InnerSvgImageProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerSvgImage")(hasSrcSizeWidthHeightStrokeFillAriaLabelForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerSwitch(props: InnerSwitchProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerSwitch")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerTab(hasHasKeyTabIdPanelIdDisabledActiveFocusHoverAsChildrenForwardedRefRest: InnerTabProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTab")(hasHasKeyTabIdPanelIdDisabledActiveFocusHoverAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerTabList(hasTabsAutoFocusForwardedRefRest: InnerTabListProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTabList")(hasTabsAutoFocusForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerTabPanel(hasHasKeyTabIdPanelIdAsChildrenForwardedRefRest: InnerTabPanelProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTabPanel")(hasHasKeyTabIdPanelIdAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerTabs(
    hasIdSelectedKeyPropDefaultSelectedKeyOnSelectionChangeManualAutoFocusFluidOrientationAriaLabelChildrenForwardedRefRest: InnerTabsProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTabs")(hasIdSelectedKeyPropDefaultSelectedKeyOnSelectionChangeManualAutoFocusFluidOrientationAriaLabelChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerTag(hasVariantOnRemoveDisabledFluidSizeActiveFocusHoverAsChildrenForwardedRefRest: InnerTagProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTag")(hasVariantOnRemoveDisabledFluidSizeActiveFocusHoverAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerTagList(hasSizeOnRemoveOnClearReadOnlyAsForwardedRefChildrenRest: InnerTagListProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTagList")(hasSizeOnRemoveOnClearReadOnlyAsForwardedRefChildrenRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerText(props: InnerTextProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerText")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerTextAddon(props: InnerTextAddonProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTextAddon")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerTextArea(props: InnerTextAreaProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTextArea")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerTextInput(props: InnerTextInputProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTextInput")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerTextLink(props: InnerTextLinkProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTextLink")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerTile(props: InnerTileProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTile")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerTileGroup(
    hasValueDefaultValueSelectionModeRowSizeOnChangeOrientationDisabledChildrenForwardedRefRest: InnerTileGroupProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTileGroup")(hasValueDefaultValueSelectionModeRowSizeOnChangeOrientationDisabledChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerTileLink(hasOrientationDisabledActiveFocusHoverChildrenForwardedRefRest: InnerTileLinkProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTileLink")(hasOrientationDisabledActiveFocusHoverChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerToggleButton(props: InnerToggleButtonProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerToggleButton")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerToggleIconButton(props: InnerToggleIconButtonProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerToggleIconButton")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerToolbar(
    hasAutoFocusOrientationAlignVerticalAlignGapWrapDisabledAsChildrenForwardedRefRest: InnerToolbarProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerToolbar")(hasAutoFocusOrientationAlignVerticalAlignGapWrapDisabledAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerTooltip(hasAsChildrenForwardedRefRest: InnerTooltipProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTooltip")(hasAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerTooltipTrigger(
    hasOpenDefaultOpenPositionPropOnOpenChangeDisabledAllowFlipAllowPreventOverflowContainerElementZIndexAsChildrenForwardedRefRest: InnerTooltipTriggerProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTooltipTrigger")(hasOpenDefaultOpenPositionPropOnOpenChangeDisabledAllowFlipAllowPreventOverflowContainerElementZIndexAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerTransition(hasShowAnimateFirstRenderEnterLeaveAsChildrenForwardedRefRest: InnerTransitionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTransition")(hasShowAnimateFirstRenderEnterLeaveAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerUnderlay(hasZIndexAsForwardedRefRest: InnerUnderlayProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerUnderlay")(hasZIndexAsForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerValidMessage(props: InnerValidMessageProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerValidMessage")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerVisuallyHidden(hasAsChildrenForwardedRefRest: InnerVisuallyHiddenProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerVisuallyHidden")(hasAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components", "InputGroup")
  @js.native
  val InputGroup: OrbitComponent[HTMLElement, InnerInputGroupProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "InputGroupContext")
  @js.native
  val InputGroupContext: Context[InputGroupContextType] = js.native
  
  @JSImport("@orbit-ui/react-components", "Item")
  @js.native
  val Item: OrbitComponent[HTMLElement, InnerItemProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "ItemKeyProp")
  @js.native
  val ItemKeyProp: /* "data-o-ui-key" */ String = js.native
  
  @JSImport("@orbit-ui/react-components", "Keys")
  @js.native
  object Keys extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.orbitUiReactComponents.distSharedSrcKeysMod.Keys & String] = js.native
    
    /* "ArrowDown" */ val arrowDown: typingsJapgolly.orbitUiReactComponents.distSharedSrcKeysMod.Keys.arrowDown & String = js.native
    
    /* "ArrowLeft" */ val arrowLeft: typingsJapgolly.orbitUiReactComponents.distSharedSrcKeysMod.Keys.arrowLeft & String = js.native
    
    /* "ArrowRight" */ val arrowRight: typingsJapgolly.orbitUiReactComponents.distSharedSrcKeysMod.Keys.arrowRight & String = js.native
    
    /* "ArrowUp" */ val arrowUp: typingsJapgolly.orbitUiReactComponents.distSharedSrcKeysMod.Keys.arrowUp & String = js.native
    
    /* "Backspace" */ val backspace: typingsJapgolly.orbitUiReactComponents.distSharedSrcKeysMod.Keys.backspace & String = js.native
    
    /* "Delete" */ val delete: typingsJapgolly.orbitUiReactComponents.distSharedSrcKeysMod.Keys.delete & String = js.native
    
    /* "End" */ val end: typingsJapgolly.orbitUiReactComponents.distSharedSrcKeysMod.Keys.end & String = js.native
    
    /* "Enter" */ val enter: typingsJapgolly.orbitUiReactComponents.distSharedSrcKeysMod.Keys.enter & String = js.native
    
    /* "Escape" */ val esc: typingsJapgolly.orbitUiReactComponents.distSharedSrcKeysMod.Keys.esc & String = js.native
    
    /* "Home" */ val home: typingsJapgolly.orbitUiReactComponents.distSharedSrcKeysMod.Keys.home & String = js.native
    
    /* " " */ val space: typingsJapgolly.orbitUiReactComponents.distSharedSrcKeysMod.Keys.space & String = js.native
    
    /* "Tab" */ val tab: typingsJapgolly.orbitUiReactComponents.distSharedSrcKeysMod.Keys.tab & String = js.native
  }
  
  @JSImport("@orbit-ui/react-components", "Label")
  @js.native
  val Label: OrbitComponent[HTMLElement, InnerLabelProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "LightbulbIcon")
  @js.native
  val LightbulbIcon: OrbitComponent[svg, OmitInnerMultiVariantIcon] = js.native
  
  @JSImport("@orbit-ui/react-components", "LightbulbIcon24")
  @js.native
  val LightbulbIcon24: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "LightbulbIcon32")
  @js.native
  val LightbulbIcon32: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "Link")
  @js.native
  val Link: OrbitComponent[HTMLElement, InnerLinkProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "ListItem")
  @js.native
  val ListItem: OrbitComponent[HTMLElement, InnerListItemProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "Listbox")
  @js.native
  val Listbox: OrbitComponent[ListboxElement, InnerListboxProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "ListboxContext")
  @js.native
  val ListboxContext: Context[ListboxContextType] = js.native
  
  @JSImport("@orbit-ui/react-components", "ListboxOption")
  @js.native
  val ListboxOption: OrbitComponent[HTMLElement, InnerListboxOptionProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "ListboxSection")
  @js.native
  val ListboxSection: OrbitComponent[HTMLElement, InnerListboxSectionProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "Lozenge")
  @js.native
  val Lozenge: OrbitComponent[HTMLElement, InnerLozengeProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "MagnifierIcon")
  @js.native
  val MagnifierIcon: OrbitComponent[svg, OmitInnerMultiVariantIcon] = js.native
  
  @JSImport("@orbit-ui/react-components", "MagnifierIcon24")
  @js.native
  val MagnifierIcon24: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "MagnifierIcon32")
  @js.native
  val MagnifierIcon32: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "Menu")
  @js.native
  val Menu: OrbitComponent[HTMLElement, InnerMenuProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "MenuContext")
  @js.native
  val MenuContext: Context[MenuContextType] = js.native
  
  @JSImport("@orbit-ui/react-components", "MenuItem")
  @js.native
  val MenuItem: OrbitComponent[HTMLElement, InnerMenuItemProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "MenuSection")
  @js.native
  val MenuSection: OrbitComponent[HTMLElement, InnerMenuSectionProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "MenuTrigger")
  @js.native
  val MenuTrigger: OrbitComponent[HTMLElement, InnerMenuTriggerProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "MenuTriggerContext")
  @js.native
  val MenuTriggerContext: Context[MenuTriggerContextType] = js.native
  
  @JSImport("@orbit-ui/react-components", "Message")
  @js.native
  val Message: OrbitComponent[HTMLElement, InnerMessageProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "Modal")
  @js.native
  val Modal: OrbitComponent[HTMLElement, InnerModalProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "ModalTrigger")
  @js.native
  val ModalTrigger: OrbitComponent[HTMLElement, InnerDialogTriggerProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "MultiVariantIcon")
  @js.native
  val MultiVariantIcon: OrbitComponent[svg, InnerMultiVariantIconProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "MusicIcon")
  @js.native
  val MusicIcon: OrbitComponent[svg, OmitInnerMultiVariantIcon] = js.native
  
  @JSImport("@orbit-ui/react-components", "MusicIcon24")
  @js.native
  val MusicIcon24: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "MusicIcon32")
  @js.native
  val MusicIcon32: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "NodeType")
  @js.native
  object NodeType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.orbitUiReactComponents.distCollectionSrcUseCollectionMod.NodeType & String
      ] = js.native
    
    /* "divider" */ val divider: typingsJapgolly.orbitUiReactComponents.distCollectionSrcUseCollectionMod.NodeType.divider & String = js.native
    
    /* "item" */ val item: typingsJapgolly.orbitUiReactComponents.distCollectionSrcUseCollectionMod.NodeType.item & String = js.native
    
    /* "section" */ val section: typingsJapgolly.orbitUiReactComponents.distCollectionSrcUseCollectionMod.NodeType.section & String = js.native
  }
  
  @JSImport("@orbit-ui/react-components", "NotificationIcon")
  @js.native
  val NotificationIcon: OrbitComponent[svg, OmitInnerMultiVariantIcon] = js.native
  
  @JSImport("@orbit-ui/react-components", "NotificationIcon24")
  @js.native
  val NotificationIcon24: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "NotificationIcon32")
  @js.native
  val NotificationIcon32: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "NotificationOffIcon")
  @js.native
  val NotificationOffIcon: OrbitComponent[svg, OmitInnerMultiVariantIcon] = js.native
  
  @JSImport("@orbit-ui/react-components", "NotificationOffIcon24")
  @js.native
  val NotificationOffIcon24: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "NotificationOffIcon32")
  @js.native
  val NotificationOffIcon32: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "NumberInput")
  @js.native
  val NumberInput: OrbitComponent[HTMLElement, InnerNumberInputProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "OptionKeyProp")
  @js.native
  val OptionKeyProp: /* "data-o-ui-key" */ String = js.native
  
  @JSImport("@orbit-ui/react-components", "OrderedList")
  @js.native
  val OrderedList: OrbitComponent[HTMLElement, InnerListProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "Overlay")
  @js.native
  val Overlay: OrbitComponent[HTMLElement, InnerOverlayProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "OverlayArrow")
  @js.native
  val OverlayArrow: OrbitComponent[HTMLElement, InnerOverlayArrowProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "P")
  @js.native
  val P: OrbitComponent[HTMLElement, InnerParagraphProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "Paragraph")
  @js.native
  val Paragraph: OrbitComponent[HTMLElement, InnerParagraphProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "PasswordInput")
  @js.native
  val PasswordInput: OrbitComponent[input, InnerPasswordInputProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "PdfIcon")
  @js.native
  val PdfIcon: OrbitComponent[svg, OmitInnerMultiVariantIcon] = js.native
  
  @JSImport("@orbit-ui/react-components", "PdfIcon24")
  @js.native
  val PdfIcon24: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "PdfIcon32")
  @js.native
  val PdfIcon32: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "Popover")
  @js.native
  val Popover: OrbitComponent[HTMLElement, InnerPopoverProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "PopoverTrigger")
  @js.native
  val PopoverTrigger: OrbitComponent[HTMLElement, InnerPopoverTriggerProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "PopoverTriggerContext")
  @js.native
  val PopoverTriggerContext: Context[PopoverTriggerContextType] = js.native
  
  @JSImport("@orbit-ui/react-components", "PrinterIcon")
  @js.native
  val PrinterIcon: OrbitComponent[svg, OmitInnerMultiVariantIcon] = js.native
  
  @JSImport("@orbit-ui/react-components", "PrinterIcon24")
  @js.native
  val PrinterIcon24: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "PrinterIcon32")
  @js.native
  val PrinterIcon32: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "PrivacyIcon")
  @js.native
  val PrivacyIcon: OrbitComponent[svg, OmitInnerMultiVariantIcon] = js.native
  
  @JSImport("@orbit-ui/react-components", "PrivacyIcon24")
  @js.native
  val PrivacyIcon24: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "PrivacyIcon32")
  @js.native
  val PrivacyIcon32: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "Radio")
  @js.native
  val Radio: OrbitComponent[HTMLElement, InnerRadioProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "RadioGroup")
  @js.native
  val RadioGroup: OrbitComponent[HTMLElement, InnerRadioGroupProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "Row")
  @js.native
  val Row: OrbitComponent[HTMLElement, InnerRowProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "SearchInput")
  @js.native
  val SearchInput: OrbitComponent[input, InnerSearchInputProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "Section")
  @js.native
  val Section: OrbitComponent[HTMLElement, InnerSectionProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "Select")
  @js.native
  val Select: OrbitComponent[HTMLElement, InnerSelectProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "SignoutIcon")
  @js.native
  val SignoutIcon: OrbitComponent[svg, OmitInnerMultiVariantIcon] = js.native
  
  @JSImport("@orbit-ui/react-components", "SignoutIcon24")
  @js.native
  val SignoutIcon24: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "SignoutIcon32")
  @js.native
  val SignoutIcon32: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "SlashIcon")
  @js.native
  val SlashIcon: OrbitComponent[svg, OmitInnerMultiVariantIcon] = js.native
  
  @JSImport("@orbit-ui/react-components", "SlashIcon24")
  @js.native
  val SlashIcon24: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "SlashIcon32")
  @js.native
  val SlashIcon32: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "SortIcon")
  @js.native
  val SortIcon: OrbitComponent[svg, OmitInnerMultiVariantIcon] = js.native
  
  @JSImport("@orbit-ui/react-components", "SortIcon24")
  @js.native
  val SortIcon24: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "SortIcon32")
  @js.native
  val SortIcon32: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "Stack")
  @js.native
  val Stack: OrbitComponent[HTMLElement, InnerStackProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "StyleContext")
  @js.native
  val StyleContext: Context[StyleContextType] = js.native
  
  @JSImport("@orbit-ui/react-components", "StyleProvider")
  @js.native
  val StyleProvider: Provider[StyleContextType] = js.native
  
  @JSImport("@orbit-ui/react-components", "SvgImage")
  @js.native
  val SvgImage: OrbitComponent[HTMLElement, InnerSvgImageProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "Switch")
  @js.native
  val Switch: OrbitComponent[HTMLElement, InnerSwitchProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "Tab")
  @js.native
  val Tab: OrbitComponent[HTMLElement, InnerTabProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "TabKeyProp")
  @js.native
  val TabKeyProp: /* "data-o-ui-key" */ String = js.native
  
  @JSImport("@orbit-ui/react-components", "TabList")
  @js.native
  val TabList: OrbitComponent[HTMLElement, InnerTabListProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "TabPanel")
  @js.native
  val TabPanel: OrbitComponent[HTMLElement, InnerTabPanelProps] = js.native
  
  object TabPanels {
    
    inline def apply(hasPanelsRest: TabPanelsProps): Element = ^.asInstanceOf[js.Dynamic].apply(hasPanelsRest.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@orbit-ui/react-components", "TabPanels")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@orbit-ui/react-components", "TabPanels.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@orbit-ui/react-components", "TabbableElementSelector")
  @js.native
  val TabbableElementSelector: String = js.native
  
  @JSImport("@orbit-ui/react-components", "Tabs")
  @js.native
  val Tabs: OrbitComponent[HTMLElement, InnerTabsProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "TabsContext")
  @js.native
  val TabsContext: Context[TabsContextType] = js.native
  
  @JSImport("@orbit-ui/react-components", "Tag")
  @js.native
  val Tag: OrbitComponent[HTMLElement, InnerTagProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "TagList")
  @js.native
  val TagList: OrbitComponent[HTMLElement, InnerTagListProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "Text")
  @js.native
  val Text: OrbitComponent[HTMLElement, InnerTextProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "TextAddon")
  @js.native
  val TextAddon: OrbitComponent[HTMLElement, InnerTextAddonProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "TextArea")
  @js.native
  val TextArea: OrbitComponent[HTMLElement, InnerTextAreaProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "TextInput")
  @js.native
  val TextInput: OrbitComponent[input, InnerTextInputProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "TextLink")
  @js.native
  val TextLink: OrbitComponent[HTMLElement, InnerTextLinkProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "ThemeComputedStyle")
  @js.native
  open class ThemeComputedStyle protected ()
    extends typingsJapgolly.orbitUiReactComponents.distThemeProviderMod.ThemeComputedStyle {
    def this(componentRef: RefHandle[org.scalajs.dom.Element]) = this()
  }
  
  @JSImport("@orbit-ui/react-components", "ThemeContext")
  @js.native
  val ThemeContext: Context[ThemeContextType] = js.native
  
  inline def ThemeProvider(hasThemeColorSchemeDefaultColorSchemeChildrenAsRest: ThemeProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ThemeProvider")(hasThemeColorSchemeDefaultColorSchemeChildrenAsRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components", "Tile")
  @js.native
  val Tile: OrbitComponent[HTMLElement, InnerTileProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "TileGroup")
  @js.native
  val TileGroup: OrbitComponent[HTMLElement, InnerTileGroupProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "TileLink")
  @js.native
  val TileLink: OrbitComponent[HTMLElement, InnerTileLinkProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "ToggleButton")
  @js.native
  val ToggleButton: OrbitComponent[button, InnerToggleButtonProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "ToggleIconButton")
  @js.native
  val ToggleIconButton: OrbitComponent[button, InnerToggleIconButtonProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "Toolbar")
  @js.native
  val Toolbar: OrbitComponent[HTMLElement, InnerToolbarProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "ToolbarContext")
  @js.native
  val ToolbarContext: Context[ToolbarContextType] = js.native
  
  @JSImport("@orbit-ui/react-components", "Tooltip")
  @js.native
  val Tooltip: OrbitComponent[HTMLElement, InnerTooltipProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "TooltipTrigger")
  @js.native
  val TooltipTrigger: OrbitComponent[HTMLElement, InnerTooltipTriggerProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "TooltipTriggerContext")
  @js.native
  val TooltipTriggerContext: Context[js.Object] = js.native
  
  @JSImport("@orbit-ui/react-components", "Transition")
  @js.native
  val Transition: OrbitComponent[HTMLElement, InnerTransitionProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "TrashIcon")
  @js.native
  val TrashIcon: OrbitComponent[svg, OmitInnerMultiVariantIcon] = js.native
  
  @JSImport("@orbit-ui/react-components", "TrashIcon24")
  @js.native
  val TrashIcon24: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "TrashIcon32")
  @js.native
  val TrashIcon32: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "Underlay")
  @js.native
  val Underlay: OrbitComponent[HTMLElement, InnerUnderlayProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "UnorderedList")
  @js.native
  val UnorderedList: OrbitComponent[HTMLElement, InnerListProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "UserAddIcon")
  @js.native
  val UserAddIcon: OrbitComponent[svg, OmitInnerMultiVariantIcon] = js.native
  
  @JSImport("@orbit-ui/react-components", "UserAddIcon24")
  @js.native
  val UserAddIcon24: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "UserAddIcon32")
  @js.native
  val UserAddIcon32: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "UserRemoveIcon")
  @js.native
  val UserRemoveIcon: OrbitComponent[svg, OmitInnerMultiVariantIcon] = js.native
  
  @JSImport("@orbit-ui/react-components", "UserRemoveIcon24")
  @js.native
  val UserRemoveIcon24: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "UserRemoveIcon32")
  @js.native
  val UserRemoveIcon32: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "ValidMessage")
  @js.native
  val ValidMessage: OrbitComponent[HTMLElement, InnerValidMessageProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "VerticalDotsIcon")
  @js.native
  val VerticalDotsIcon: OrbitComponent[svg, OmitInnerMultiVariantIcon] = js.native
  
  @JSImport("@orbit-ui/react-components", "VerticalDotsIcon24")
  @js.native
  val VerticalDotsIcon24: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "VerticalDotsIcon32")
  @js.native
  val VerticalDotsIcon32: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "VideoIcon")
  @js.native
  val VideoIcon: OrbitComponent[svg, OmitInnerMultiVariantIcon] = js.native
  
  @JSImport("@orbit-ui/react-components", "VideoIcon24")
  @js.native
  val VideoIcon24: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "VideoIcon32")
  @js.native
  val VideoIcon32: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "VirtualFocusCssClass")
  @js.native
  val VirtualFocusCssClass: /* "o-ui-focus" */ String = js.native
  
  @JSImport("@orbit-ui/react-components", "VisuallyHidden")
  @js.native
  val VisuallyHidden: OrbitComponent[HTMLElement, InnerVisuallyHiddenProps] = js.native
  
  @JSImport("@orbit-ui/react-components", "WarningIcon")
  @js.native
  val WarningIcon: OrbitComponent[svg, OmitInnerMultiVariantIcon] = js.native
  
  @JSImport("@orbit-ui/react-components", "WarningIcon24")
  @js.native
  val WarningIcon24: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "WarningIcon32")
  @js.native
  val WarningIcon32: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "ZipIcon")
  @js.native
  val ZipIcon: OrbitComponent[svg, OmitInnerMultiVariantIcon] = js.native
  
  @JSImport("@orbit-ui/react-components", "ZipIcon24")
  @js.native
  val ZipIcon24: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  @JSImport("@orbit-ui/react-components", "ZipIcon32")
  @js.native
  val ZipIcon32: OrbitComponent[svg, OmitInnerIconPropssrc] = js.native
  
  inline def adaptSize[T /* <: Size */](size: Size, adapter: SizeAdapter[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("adaptSize")(size.asInstanceOf[js.Any], adapter.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def appendEventKey(str: String, key: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("appendEventKey")(str.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def arrayify[T](value: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayify")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def arrayify[T](value: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayify")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def assignRef[T](ref: AssignableRef[T], node: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assignRef")(ref.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def augmentElement(
    element: japgolly.scalajs.react.facade.React.Element & RefAttributes[Any],
    newProps: Record[String, Any]
  ): japgolly.scalajs.react.facade.React.Element = (^.asInstanceOf[js.Dynamic].applyDynamic("augmentElement")(element.asInstanceOf[js.Any], newProps.asInstanceOf[js.Any])).asInstanceOf[japgolly.scalajs.react.facade.React.Element]
  
  inline def createChainedFunction_false[T /* <: ChainableFunction */](funcs: (T | `false`)*): ChainableFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("createChainedFunction")(funcs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ChainableFunction]
  
  inline def createCollectionItem(hasKeyIndexElementTypeRefContentProps: CollectionItem): typingsJapgolly.orbitUiReactComponents.anon.Content = ^.asInstanceOf[js.Dynamic].applyDynamic("createCollectionItem")(hasKeyIndexElementTypeRefContentProps.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.orbitUiReactComponents.anon.Content]
  
  inline def createDisposables(): Add = ^.asInstanceOf[js.Dynamic].applyDynamic("createDisposables")().asInstanceOf[Add]
  
  inline def createEmbeddableAdapter[T /* <: Size */](sizeAdapter: SizeAdapter[T]): js.Function2[
    /* element */ japgolly.scalajs.react.facade.React.Element, 
    /* hasSizeProps */ RecordWithSize, 
    japgolly.scalajs.react.facade.React.Element
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createEmbeddableAdapter")(sizeAdapter.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* element */ japgolly.scalajs.react.facade.React.Element, 
    /* hasSizeProps */ RecordWithSize, 
    japgolly.scalajs.react.facade.React.Element
  ]]
  
  inline def createFocusableTreeWalker(root: HTMLElement): TreeWalker = ^.asInstanceOf[js.Dynamic].applyDynamic("createFocusableTreeWalker")(root.asInstanceOf[js.Any]).asInstanceOf[TreeWalker]
  inline def createFocusableTreeWalker(root: HTMLElement, hasTabbable: FocusableTreeWalkerOptions): TreeWalker = (^.asInstanceOf[js.Dynamic].applyDynamic("createFocusableTreeWalker")(root.asInstanceOf[js.Any], hasTabbable.asInstanceOf[js.Any])).asInstanceOf[TreeWalker]
  
  inline def createIcon(src: ElementType): OrbitComponent[svg, OmitInnerIconPropssrc] = ^.asInstanceOf[js.Dynamic].applyDynamic("createIcon")(src.asInstanceOf[js.Any]).asInstanceOf[OrbitComponent[svg, OmitInnerIconPropssrc]]
  
  inline def createMultiVariantIcon(src24: ElementType, src32: ElementType): OrbitComponent[svg, OmitInnerMultiVariantIcon] = (^.asInstanceOf[js.Dynamic].applyDynamic("createMultiVariantIcon")(src24.asInstanceOf[js.Any], src32.asInstanceOf[js.Any])).asInstanceOf[OrbitComponent[svg, OmitInnerMultiVariantIcon]]
  
  inline def createSizeAdapter[T /* <: Size */](adapter: SizeAdapter[T]): js.Function1[/* size */ Size, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSizeAdapter")(adapter.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* size */ Size, T]]
  
  inline def cssModule_false(moduleName: String, values: (`false` | String)*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cssModule")(scala.List(moduleName.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  inline def embedIconButton[Props /* <: typingsJapgolly.orbitUiReactComponents.anon.Size & (Record[String, Any]) */](element: japgolly.scalajs.react.facade.React.Element, hasSizeProps: Props): japgolly.scalajs.react.facade.React.Element = (^.asInstanceOf[js.Dynamic].applyDynamic("embedIconButton")(element.asInstanceOf[js.Any], hasSizeProps.asInstanceOf[js.Any])).asInstanceOf[japgolly.scalajs.react.facade.React.Element]
  
  inline def embeddedIconSize(size: Size): `2xs` | xs | sm | md | lg | inherit = ^.asInstanceOf[js.Dynamic].applyDynamic("embeddedIconSize")(size.asInstanceOf[js.Any]).asInstanceOf[`2xs` | xs | sm | md | lg | inherit]
  
  inline def forwardRef[P /* <: Record[String, Any] */, T](render: ForwardRefRenderFunction[AsRef[T], P]): OrbitComponent[T, P] = ^.asInstanceOf[js.Dynamic].applyDynamic("forwardRef")(render.asInstanceOf[js.Any]).asInstanceOf[OrbitComponent[T, P]]
  
  inline def getItemText(item: CollectionNode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getItemText")(item.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getRawSlots(children: Node, slots: js.Array[String]): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRawSlots")(children.asInstanceOf[js.Any], slots.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
  
  inline def getSlotKey(element: japgolly.scalajs.react.facade.React.Element): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getSlotKey")(element.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getSlots[T /* <: SlotOptions */](children: Node, has_Slots: T): GetSlotsReturn[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSlots")(children.asInstanceOf[js.Any], has_Slots.asInstanceOf[js.Any])).asInstanceOf[GetSlotsReturn[T]]
  
  inline def isArray[T](value: Any): /* is std.Array<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<T> */ Boolean]
  
  inline def isDefined(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefined")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDevToolsBlurEvent(rootRef: RefHandle[HTMLElement]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDevToolsBlurEvent")(rootRef.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDivider(node: CollectionNode): /* is @orbit-ui/react-components.@orbit-ui/react-components/dist/collection/src/useCollection.CollectionDivider */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDivider")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @orbit-ui/react-components.@orbit-ui/react-components/dist/collection/src/useCollection.CollectionDivider */ Boolean]
  
  inline def isEmptyArray(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyArray")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFunction(value: Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
  
  inline def isItem(node: CollectionNode): /* is @orbit-ui/react-components.@orbit-ui/react-components/dist/collection/src/useCollection.CollectionItem */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isItem")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @orbit-ui/react-components.@orbit-ui/react-components/dist/collection/src/useCollection.CollectionItem */ Boolean]
  
  inline def isNil(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNil")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNilOrEmpty(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNilOrEmpty")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNull(value: Any): /* is null */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNull")(value.asInstanceOf[js.Any]).asInstanceOf[/* is null */ Boolean]
  
  inline def isNumber(value: Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(value.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  inline def isPlainObject(value: Any): /* is std.Record<string, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlainObject")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Record<string, any> */ Boolean]
  
  inline def isPromise(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSection(node: CollectionNode): /* is @orbit-ui/react-components.@orbit-ui/react-components/dist/collection/src/useCollection.CollectionSection */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSection")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @orbit-ui/react-components.@orbit-ui/react-components/dist/collection/src/useCollection.CollectionSection */ Boolean]
  
  inline def isString(value: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(value.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def isTargetParent(target: EventTarget, parentRef: RefHandle[HTMLElement]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTargetParent")(target.asInstanceOf[js.Any], parentRef.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isUndefined(value: Any): /* is undefined */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUndefined")(value.asInstanceOf[js.Any]).asInstanceOf[/* is undefined */ Boolean]
  
  inline def mergeClasses_false(values: (String | `false`)*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeClasses")(values.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
  
  inline def mergeProps[T /* <: js.Array[Props] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: T
  ): UnionToIntersection[TupleTypes[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeProps")(args.asInstanceOf[js.Any]).asInstanceOf[UnionToIntersection[TupleTypes[T]]]
  
  inline def mergeRefs[T](refs: AssignableRef[T]*): MergedRef[UnwrapStateType[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeRefs")(refs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[MergedRef[UnwrapStateType[T]]]
  
  inline def normalizeSize[T /* <: Size */](): md | T = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeSize")().asInstanceOf[md | T]
  inline def normalizeSize[T /* <: Size */](size: T): md | T = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeSize")(size.asInstanceOf[js.Any]).asInstanceOf[md | T]
  
  inline def omitProps[TObject /* <: Record[String, Any] */, TKey /* <: String */](obj: TObject, omit: js.Array[TKey]): Omit[TObject, TKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("omitProps")(obj.asInstanceOf[js.Any], omit.asInstanceOf[js.Any])).asInstanceOf[Omit[TObject, TKey]]
  
  inline def parseTooltipTrigger(children: Node): js.Tuple2[
    japgolly.scalajs.react.facade.React.Element, 
    japgolly.scalajs.react.facade.React.Element
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseTooltipTrigger")(children.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    japgolly.scalajs.react.facade.React.Element, 
    japgolly.scalajs.react.facade.React.Element
  ]]
  
  inline def reduceCollection(nodes: js.Array[CollectionNode], acceptItem: js.Function1[/* item */ CollectionItem, Boolean]): js.Array[CollectionItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceCollection")(nodes.asInstanceOf[js.Any], acceptItem.asInstanceOf[js.Any])).asInstanceOf[js.Array[CollectionItem]]
  
  inline def resolveChildren(children: Node): Node = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveChildren")(children.asInstanceOf[js.Any]).asInstanceOf[Node]
  inline def resolveChildren(children: Node, renderProps: Record[String, Any]): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveChildren")(children.asInstanceOf[js.Any], renderProps.asInstanceOf[js.Any])).asInstanceOf[Node]
  
  inline def resolveFragment(children: Node): Node = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveFragment")(children.asInstanceOf[js.Any]).asInstanceOf[Node]
  
  inline def slot[P](slotName: String, ElementType: P): P = (^.asInstanceOf[js.Dynamic].applyDynamic("slot")(slotName.asInstanceOf[js.Any], ElementType.asInstanceOf[js.Any])).asInstanceOf[P]
  
  inline def toPixelValue(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toPixelValue")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def useAccordionContext(): AccordionContextType = ^.asInstanceOf[js.Dynamic].applyDynamic("useAccordionContext")().asInstanceOf[AccordionContextType]
  
  inline def useAsyncSearch[T](load: js.Function2[/* query */ String, /* signal */ AbortSignal, js.Promise[js.Array[T]]]): IsLoading[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAsyncSearch")(load.asInstanceOf[js.Any]).asInstanceOf[IsLoading[T]]
  
  inline def useAutoFocus(targetRef: RefHandle[HTMLElement]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useAutoFocus")(targetRef.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useAutoFocus(targetRef: RefHandle[HTMLElement], hasIsDisabledDelayOnFocus: AutoFocusOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useAutoFocus")(targetRef.asInstanceOf[js.Any], hasIsDisabledDelayOnFocus.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useAutoFocusChild(focusManager: typingsJapgolly.orbitUiReactComponents.distSharedSrcUseFocusManagerMod.FocusManager): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useAutoFocusChild")(focusManager.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useAutoFocusChild(
    focusManager: typingsJapgolly.orbitUiReactComponents.distSharedSrcUseFocusManagerMod.FocusManager,
    hasTargetIsDisabledDelayCanFocusOnFocusOnNotFound: AutoFocusChildOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useAutoFocusChild")(focusManager.asInstanceOf[js.Any], hasTargetIsDisabledDelayCanFocusOnFocusOnNotFound.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useChainedEventCallback_false[T /* <: ChainableFunction */](callbacks: (T | `false`)*): ChainableFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("useChainedEventCallback")(callbacks.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ChainableFunction]
  
  inline def useCheckableContext(): js.Tuple2[CheckableContextType, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useCheckableContext")().asInstanceOf[js.Tuple2[CheckableContextType, Boolean]]
  
  inline def useCheckableProps(hasValue: `0`): js.Tuple2[UseCheckablePropsReturn, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useCheckableProps")(hasValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[UseCheckablePropsReturn, Boolean]]
  
  inline def useCheckbox(
    hasModuleIsInFieldIdCheckedDefaultCheckedIndeterminateDefaultIndeterminateAutoFocusRequiredValidationStateOnChangeSizeReverseNameTabIndexActiveFocusHoverDisabledAriaLabelAriaLabelledByForwardedRef: UseCheckboxProps
  ): UseCheckboxReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("useCheckbox")(hasModuleIsInFieldIdCheckedDefaultCheckedIndeterminateDefaultIndeterminateAutoFocusRequiredValidationStateOnChangeSizeReverseNameTabIndexActiveFocusHoverDisabledAriaLabelAriaLabelledByForwardedRef.asInstanceOf[js.Any]).asInstanceOf[UseCheckboxReturn]
  
  inline def useCollection(children: Node): js.Array[CollectionNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("useCollection")(children.asInstanceOf[js.Any]).asInstanceOf[js.Array[CollectionNode]]
  
  inline def useCollectionSearch(children: Node, hasOnSearch: UseCollectionSearchOptions): js.Tuple2[
    js.Array[CollectionNode], 
    js.Function2[/* event */ ReactEventFrom[org.scalajs.dom.Element], /* query */ String, Unit]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useCollectionSearch")(children.asInstanceOf[js.Any], hasOnSearch.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    js.Array[CollectionNode], 
    js.Function2[/* event */ ReactEventFrom[org.scalajs.dom.Element], /* query */ String, Unit]
  ]]
  
  inline def useColorScheme(colorScheme: ColorSchemeOrSystem, defaultColorScheme: ColorScheme): ColorScheme = (^.asInstanceOf[js.Dynamic].applyDynamic("useColorScheme")(colorScheme.asInstanceOf[js.Any], defaultColorScheme.asInstanceOf[js.Any])).asInstanceOf[ColorScheme]
  
  inline def useCommittedRef[T](value: T): RefHandle[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useCommittedRef")(value.asInstanceOf[js.Any]).asInstanceOf[RefHandle[T]]
  
  inline def useControllableState[T](): js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useControllableState")().asInstanceOf[js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean]]
  inline def useControllableState[T](controlledValue: T): js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useControllableState")(controlledValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean]]
  inline def useControllableState[T](controlledValue: T, initialValue: T): js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableState")(controlledValue.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean]]
  inline def useControllableState[T](controlledValue: T, initialValue: T, defaultValue: T): js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableState")(controlledValue.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean]]
  inline def useControllableState[T](controlledValue: T, initialValue: T, defaultValue: T, hasOnChange: ControllableStateOptions[T]): js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableState")(controlledValue.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], hasOnChange.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean]]
  inline def useControllableState[T](controlledValue: T, initialValue: T, defaultValue: Unit, hasOnChange: ControllableStateOptions[T]): js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableState")(controlledValue.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], hasOnChange.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean]]
  inline def useControllableState[T](controlledValue: T, initialValue: Unit, defaultValue: T): js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableState")(controlledValue.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean]]
  inline def useControllableState[T](controlledValue: T, initialValue: Unit, defaultValue: T, hasOnChange: ControllableStateOptions[T]): js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableState")(controlledValue.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], hasOnChange.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean]]
  inline def useControllableState[T](
    controlledValue: T,
    initialValue: Unit,
    defaultValue: Unit,
    hasOnChange: ControllableStateOptions[T]
  ): js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableState")(controlledValue.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], hasOnChange.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean]]
  inline def useControllableState[T](controlledValue: Unit, initialValue: T): js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableState")(controlledValue.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean]]
  inline def useControllableState[T](controlledValue: Unit, initialValue: T, defaultValue: T): js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableState")(controlledValue.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean]]
  inline def useControllableState[T](controlledValue: Unit, initialValue: T, defaultValue: T, hasOnChange: ControllableStateOptions[T]): js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableState")(controlledValue.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], hasOnChange.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean]]
  inline def useControllableState[T](
    controlledValue: Unit,
    initialValue: T,
    defaultValue: Unit,
    hasOnChange: ControllableStateOptions[T]
  ): js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableState")(controlledValue.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], hasOnChange.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean]]
  inline def useControllableState[T](controlledValue: Unit, initialValue: Unit, defaultValue: T): js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableState")(controlledValue.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean]]
  inline def useControllableState[T](
    controlledValue: Unit,
    initialValue: Unit,
    defaultValue: T,
    hasOnChange: ControllableStateOptions[T]
  ): js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableState")(controlledValue.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], hasOnChange.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean]]
  inline def useControllableState[T](
    controlledValue: Unit,
    initialValue: Unit,
    defaultValue: Unit,
    hasOnChange: ControllableStateOptions[T]
  ): js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableState")(controlledValue.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], hasOnChange.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean]]
  
  inline def useDialogTriggerContext(): DialogTriggerContextType = ^.asInstanceOf[js.Dynamic].applyDynamic("useDialogTriggerContext")().asInstanceOf[DialogTriggerContextType]
  
  inline def useDisclosureContext(): DisclosureContextType = ^.asInstanceOf[js.Dynamic].applyDynamic("useDisclosureContext")().asInstanceOf[DisclosureContextType]
  
  inline def useDisposables(): Dispose = ^.asInstanceOf[js.Dynamic].applyDynamic("useDisposables")().asInstanceOf[Dispose]
  
  inline def useDocumentListener(eventName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useDocumentListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useDocumentListener(eventName: String, listener: Null, active: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDocumentListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useDocumentListener(eventName: String, listener: Null, active: Boolean, options: EventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDocumentListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useDocumentListener(eventName: String, listener: Null, active: Boolean, options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDocumentListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useDocumentListener(eventName: String, listener: Null, active: Unit, options: EventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDocumentListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useDocumentListener(eventName: String, listener: Null, active: Unit, options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDocumentListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useDocumentListener(eventName: String, listener: EventListenerOrEventListenerObject): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDocumentListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useDocumentListener(eventName: String, listener: EventListenerOrEventListenerObject, active: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDocumentListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useDocumentListener(
    eventName: String,
    listener: EventListenerOrEventListenerObject,
    active: Boolean,
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDocumentListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useDocumentListener(eventName: String, listener: EventListenerOrEventListenerObject, active: Boolean, options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDocumentListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useDocumentListener(
    eventName: String,
    listener: EventListenerOrEventListenerObject,
    active: Unit,
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDocumentListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useDocumentListener(eventName: String, listener: EventListenerOrEventListenerObject, active: Unit, options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDocumentListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventCallback[TCallback /* <: js.Function1[/* repeated */ Any, Unit] */](): TCallback = ^.asInstanceOf[js.Dynamic].applyDynamic("useEventCallback")().asInstanceOf[TCallback]
  inline def useEventCallback[TCallback /* <: js.Function1[/* repeated */ Any, Unit] */](callback: TCallback): TCallback = ^.asInstanceOf[js.Dynamic].applyDynamic("useEventCallback")(callback.asInstanceOf[js.Any]).asInstanceOf[TCallback]
  
  inline def useEventListener(eventTarget: js.Function0[EventTarget], eventName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(eventTarget: js.Function0[EventTarget], eventName: String, listener: Null, active: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(
    eventTarget: js.Function0[EventTarget],
    eventName: String,
    listener: Null,
    active: Boolean,
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(
    eventTarget: js.Function0[EventTarget],
    eventName: String,
    listener: Null,
    active: Boolean,
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(
    eventTarget: js.Function0[EventTarget],
    eventName: String,
    listener: Null,
    active: Unit,
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(
    eventTarget: js.Function0[EventTarget],
    eventName: String,
    listener: Null,
    active: Unit,
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(
    eventTarget: js.Function0[EventTarget],
    eventName: String,
    listener: EventListenerOrEventListenerObject
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(
    eventTarget: js.Function0[EventTarget],
    eventName: String,
    listener: EventListenerOrEventListenerObject,
    active: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(
    eventTarget: js.Function0[EventTarget],
    eventName: String,
    listener: EventListenerOrEventListenerObject,
    active: Boolean,
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(
    eventTarget: js.Function0[EventTarget],
    eventName: String,
    listener: EventListenerOrEventListenerObject,
    active: Boolean,
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(
    eventTarget: js.Function0[EventTarget],
    eventName: String,
    listener: EventListenerOrEventListenerObject,
    active: Unit,
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(
    eventTarget: js.Function0[EventTarget],
    eventName: String,
    listener: EventListenerOrEventListenerObject,
    active: Unit,
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(eventTarget: EventTarget, eventName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(eventTarget: EventTarget, eventName: String, listener: Null, active: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(
    eventTarget: EventTarget,
    eventName: String,
    listener: Null,
    active: Boolean,
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(eventTarget: EventTarget, eventName: String, listener: Null, active: Boolean, options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(
    eventTarget: EventTarget,
    eventName: String,
    listener: Null,
    active: Unit,
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(eventTarget: EventTarget, eventName: String, listener: Null, active: Unit, options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(eventTarget: EventTarget, eventName: String, listener: EventListenerOrEventListenerObject): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(
    eventTarget: EventTarget,
    eventName: String,
    listener: EventListenerOrEventListenerObject,
    active: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(
    eventTarget: EventTarget,
    eventName: String,
    listener: EventListenerOrEventListenerObject,
    active: Boolean,
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(
    eventTarget: EventTarget,
    eventName: String,
    listener: EventListenerOrEventListenerObject,
    active: Boolean,
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(
    eventTarget: EventTarget,
    eventName: String,
    listener: EventListenerOrEventListenerObject,
    active: Unit,
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(
    eventTarget: EventTarget,
    eventName: String,
    listener: EventListenerOrEventListenerObject,
    active: Unit,
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useFieldContext(): js.Tuple2[FieldContextType, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFieldContext")().asInstanceOf[js.Tuple2[FieldContextType, Boolean]]
  
  inline def useFieldInputProps(): js.Tuple2[UseFieldInputPropsReturn, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFieldInputProps")().asInstanceOf[js.Tuple2[UseFieldInputPropsReturn, Boolean]]
  
  inline def useFieldLabelProps(hasAsProp: UseFieldLabelProps_): js.Tuple2[UseFieldLabelPropsReturn, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFieldLabelProps")(hasAsProp.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[UseFieldLabelPropsReturn, Boolean]]
  
  inline def useFieldMessageProps(): js.Tuple2[UseFieldMessagePropsReturn, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFieldMessageProps")().asInstanceOf[js.Tuple2[UseFieldMessagePropsReturn, Boolean]]
  
  inline def useFlexAlignment(orientation: Orientation, align: Alignment, verticalAlign: Alignment): AlignItems = (^.asInstanceOf[js.Dynamic].applyDynamic("useFlexAlignment")(orientation.asInstanceOf[js.Any], align.asInstanceOf[js.Any], verticalAlign.asInstanceOf[js.Any])).asInstanceOf[AlignItems]
  
  inline def useFlexDirection(orientation: Orientation): Direction = ^.asInstanceOf[js.Dynamic].applyDynamic("useFlexDirection")(orientation.asInstanceOf[js.Any]).asInstanceOf[Direction]
  
  inline def useFocusManager(scope: typingsJapgolly.orbitUiReactComponents.distSharedSrcUseFocusScopeMod.DomScope): typingsJapgolly.orbitUiReactComponents.distSharedSrcUseFocusManagerMod.FocusManager = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusManager")(scope.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.orbitUiReactComponents.distSharedSrcUseFocusManagerMod.FocusManager]
  inline def useFocusManager(
    scope: typingsJapgolly.orbitUiReactComponents.distSharedSrcUseFocusScopeMod.DomScope,
    hasIsVirtualKeyPropOnFocus: FocusManagerOptions
  ): typingsJapgolly.orbitUiReactComponents.distSharedSrcUseFocusManagerMod.FocusManager = (^.asInstanceOf[js.Dynamic].applyDynamic("useFocusManager")(scope.asInstanceOf[js.Any], hasIsVirtualKeyPropOnFocus.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.orbitUiReactComponents.distSharedSrcUseFocusManagerMod.FocusManager]
  
  inline def useFocusScope(): js.Tuple2[
    typingsJapgolly.orbitUiReactComponents.distSharedSrcUseFocusScopeMod.DomScope, 
    js.Function1[/* rootElement */ HTMLElement, Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusScope")().asInstanceOf[js.Tuple2[
    typingsJapgolly.orbitUiReactComponents.distSharedSrcUseFocusScopeMod.DomScope, 
    js.Function1[/* rootElement */ HTMLElement, Unit]
  ]]
  
  inline def useFocusWithin(): OnFocus | OnBlurOnFocus = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusWithin")().asInstanceOf[OnFocus | OnBlurOnFocus]
  inline def useFocusWithin(hasOnFocusOnBlurIsDisabled: UseFocusWithinOptions): OnFocus | OnBlurOnFocus = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusWithin")(hasOnFocusOnBlurIsDisabled.asInstanceOf[js.Any]).asInstanceOf[OnFocus | OnBlurOnFocus]
  
  inline def useForceRender(): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useForceRender")().asInstanceOf[js.Function0[Unit]]
  
  inline def useFormButton(): js.Tuple2[FormButtonProps, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFormButton")().asInstanceOf[js.Tuple2[FormButtonProps, Boolean]]
  
  inline def useFormContext(): js.Tuple2[FormContextType, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFormContext")().asInstanceOf[js.Tuple2[FormContextType, Boolean]]
  
  inline def useFormField(): js.Tuple2[FormFieldProps, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFormField")().asInstanceOf[js.Tuple2[FormFieldProps, Boolean]]
  
  inline def useForwardInputApi(inputRef: RefHandle[HTMLInputElement]): js.Function1[/* targetRef */ RefHandle[HTMLInputElement], HTMLInputElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("useForwardInputApi")(inputRef.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* targetRef */ RefHandle[HTMLInputElement], HTMLInputElement]]
  
  inline def useGroupInput(
    hasRoleModuleRequiredValidationStateOrientationGapWrapSizeReverseDisabledIsInFieldGroupRef: UseGroupInputProps
  ): UseGroupInputReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("useGroupInput")(hasRoleModuleRequiredValidationStateOrientationGapWrapSizeReverseDisabledIsInFieldGroupRef.asInstanceOf[js.Any]).asInstanceOf[UseGroupInputReturn]
  
  inline def useHasChild(querySelector: String, rootRef: RefHandle[HTMLElement]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("useHasChild")(querySelector.asInstanceOf[js.Any], rootRef.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def useHasChildren(querySelectors: Record[String, String], rootRef: RefHandle[HTMLElement]): Record[String, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("useHasChildren")(querySelectors.asInstanceOf[js.Any], rootRef.asInstanceOf[js.Any])).asInstanceOf[Record[String, Boolean]]
  
  inline def useId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("useId")().asInstanceOf[String]
  inline def useId(userId: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("useId")(userId.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def useId(userId: String, prefix: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("useId")(userId.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def useId(userId: Unit, prefix: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("useId")(userId.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def useInput(
    hasModuleIdValuePlaceholderRequiredValidationStateOnChangeTypeAutoFocusDisabledReadOnlyFluidLoadingActiveFocusHoverForwardedRef: UseInputProps
  ): InputProps = ^.asInstanceOf[js.Dynamic].applyDynamic("useInput")(hasModuleIdValuePlaceholderRequiredValidationStateOnChangeTypeAutoFocusDisabledReadOnlyFluidLoadingActiveFocusHoverForwardedRef.asInstanceOf[js.Any]).asInstanceOf[InputProps]
  
  inline def useInputButton(button: japgolly.scalajs.react.facade.React.Element, isActive: Boolean): japgolly.scalajs.react.facade.React.Element = (^.asInstanceOf[js.Dynamic].applyDynamic("useInputButton")(button.asInstanceOf[js.Any], isActive.asInstanceOf[js.Any])).asInstanceOf[japgolly.scalajs.react.facade.React.Element]
  inline def useInputButton(button: japgolly.scalajs.react.facade.React.Element, isActive: Boolean, props: Record[String, Any]): japgolly.scalajs.react.facade.React.Element = (^.asInstanceOf[js.Dynamic].applyDynamic("useInputButton")(button.asInstanceOf[js.Any], isActive.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[japgolly.scalajs.react.facade.React.Element]
  
  inline def useInputGroupAddonProps(): js.Tuple2[UseInputGroupAddonPropsReturn, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useInputGroupAddonProps")().asInstanceOf[js.Tuple2[UseInputGroupAddonPropsReturn, Boolean]]
  
  inline def useInputGroupButtonAddonProps(): js.Tuple2[UseInputGroupButtonAddonPropsReturn, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useInputGroupButtonAddonProps")().asInstanceOf[js.Tuple2[UseInputGroupButtonAddonPropsReturn, Boolean]]
  
  inline def useInputGroupContext(): js.Tuple2[InputGroupContextType, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useInputGroupContext")().asInstanceOf[js.Tuple2[InputGroupContextType, Boolean]]
  
  inline def useInputGroupMenuAddonProps(): js.Tuple2[UseInputGroupMenuAddonPropsReturn, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useInputGroupMenuAddonProps")().asInstanceOf[js.Tuple2[UseInputGroupMenuAddonPropsReturn, Boolean]]
  
  inline def useInputGroupProps(): js.Tuple2[UseInputGroupPropsReturn, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useInputGroupProps")().asInstanceOf[js.Tuple2[UseInputGroupPropsReturn, Boolean]]
  
  inline def useInputGroupSelectAddonProps(): js.Tuple2[UseInputGroupSelectAddonPropsReturn, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useInputGroupSelectAddonProps")().asInstanceOf[js.Tuple2[UseInputGroupSelectAddonPropsReturn, Boolean]]
  
  inline def useInputGroupTextInputProps(): js.Tuple2[UseInputGroupPropsReturn, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useInputGroupTextInputProps")().asInstanceOf[js.Tuple2[UseInputGroupPropsReturn, Boolean]]
  
  inline def useInputIcon(icon: Node): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("useInputIcon")(icon.asInstanceOf[js.Any]).asInstanceOf[Element]
  inline def useInputIcon(icon: Node, props: UseInputIconProps): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("useInputIcon")(icon.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  inline def useIsInitialRender(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsInitialRender")().asInstanceOf[Boolean]
  
  inline def useKeyboardNavigation(
    focusManager: typingsJapgolly.orbitUiReactComponents.distSharedSrcUseFocusManagerMod.FocusManager,
    hasPreviousNextFirstLast: KeyboardNavigationBindings
  ): OnKeyDown = (^.asInstanceOf[js.Dynamic].applyDynamic("useKeyboardNavigation")(focusManager.asInstanceOf[js.Any], hasPreviousNextFirstLast.asInstanceOf[js.Any])).asInstanceOf[OnKeyDown]
  inline def useKeyboardNavigation(
    focusManager: typingsJapgolly.orbitUiReactComponents.distSharedSrcUseFocusManagerMod.FocusManager,
    hasPreviousNextFirstLast: KeyboardNavigationBindings,
    hasOnSelect: KeyboardNavigationOptions
  ): OnKeyDown = (^.asInstanceOf[js.Dynamic].applyDynamic("useKeyboardNavigation")(focusManager.asInstanceOf[js.Any], hasPreviousNextFirstLast.asInstanceOf[js.Any], hasOnSelect.asInstanceOf[js.Any])).asInstanceOf[OnKeyDown]
  
  inline def useKeyedRovingFocus(
    scope: typingsJapgolly.orbitUiReactComponents.distSharedSrcUseFocusScopeMod.DomScope,
    currentKey: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useKeyedRovingFocus")(scope.asInstanceOf[js.Any], currentKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useKeyedRovingFocus(
    scope: typingsJapgolly.orbitUiReactComponents.distSharedSrcUseFocusScopeMod.DomScope,
    currentKey: String,
    hasKeyPropIsDisabled: IsDisabled
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useKeyedRovingFocus")(scope.asInstanceOf[js.Any], currentKey.asInstanceOf[js.Any], hasKeyPropIsDisabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useListboxContext(): ListboxContextType = ^.asInstanceOf[js.Dynamic].applyDynamic("useListboxContext")().asInstanceOf[ListboxContextType]
  
  inline def useMediaQuery(query: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useMediaQuery")(query.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def useMenuContext(): MenuContextType = ^.asInstanceOf[js.Dynamic].applyDynamic("useMenuContext")().asInstanceOf[MenuContextType]
  
  inline def useMenuTriggerContext(): MenuTriggerContextType = ^.asInstanceOf[js.Dynamic].applyDynamic("useMenuTriggerContext")().asInstanceOf[MenuTriggerContextType]
  
  inline def useMergedRefs[T](refs: AssignableRef[T]*): MergedRef[UnwrapStateType[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMergedRefs")(refs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[MergedRef[UnwrapStateType[T]]]
  
  inline def useModalTriggerContext(): DialogTriggerContextType = ^.asInstanceOf[js.Dynamic].applyDynamic("useModalTriggerContext")().asInstanceOf[DialogTriggerContextType]
  
  inline def useOnlyCollectionItems(nodes: js.Array[CollectionNode]): js.Array[CollectionItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("useOnlyCollectionItems")(nodes.asInstanceOf[js.Any]).asInstanceOf[js.Array[CollectionItem]]
  
  inline def useOverlayFocusRing(): ClassNameString = ^.asInstanceOf[js.Dynamic].applyDynamic("useOverlayFocusRing")().asInstanceOf[ClassNameString]
  inline def useOverlayFocusRing(hasFocus: UseOverlayFocusRingProps): ClassNameString = ^.asInstanceOf[js.Dynamic].applyDynamic("useOverlayFocusRing")(hasFocus.asInstanceOf[js.Any]).asInstanceOf[ClassNameString]
  
  inline def useOverlayLightDismiss(overlayRef: RefHandle[HTMLElement]): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("useOverlayLightDismiss")(overlayRef.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  inline def useOverlayLightDismiss(
    overlayRef: RefHandle[HTMLElement],
    hasTriggerOnHideHideOnEscapeHideOnLeaveHideOnOutsideClick: UseOverlayLightDismissOptions
  ): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("useOverlayLightDismiss")(overlayRef.asInstanceOf[js.Any], hasTriggerOnHideHideOnEscapeHideOnLeaveHideOnOutsideClick.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def useOverlayPosition(): ArrowRef = ^.asInstanceOf[js.Dynamic].applyDynamic("useOverlayPosition")().asInstanceOf[ArrowRef]
  inline def useOverlayPosition(hasPositionOffsetAllowFlipAllowPreventOverflowBoundaryElementHasArrow: UseOverlayPositionOptions): ArrowRef = ^.asInstanceOf[js.Dynamic].applyDynamic("useOverlayPosition")(hasPositionOffsetAllowFlipAllowPreventOverflowBoundaryElementHasArrow.asInstanceOf[js.Any]).asInstanceOf[ArrowRef]
  
  inline def useOverlayTrigger(isOpen: Boolean): OnClick | OnKeyUp | OnMouseEnter = ^.asInstanceOf[js.Dynamic].applyDynamic("useOverlayTrigger")(isOpen.asInstanceOf[js.Any]).asInstanceOf[OnClick | OnKeyUp | OnMouseEnter]
  inline def useOverlayTrigger(isOpen: Boolean, hasHideOnLeaveTriggerOnShowOnHideIsDisabled: UseOverlayTriggerOptions): OnClick | OnKeyUp | OnMouseEnter = (^.asInstanceOf[js.Dynamic].applyDynamic("useOverlayTrigger")(isOpen.asInstanceOf[js.Any], hasHideOnLeaveTriggerOnShowOnHideIsDisabled.asInstanceOf[js.Any])).asInstanceOf[OnClick | OnKeyUp | OnMouseEnter]
  
  inline def usePopoverTriggerContext(): PopoverTriggerContextType = ^.asInstanceOf[js.Dynamic].applyDynamic("usePopoverTriggerContext")().asInstanceOf[PopoverTriggerContextType]
  
  inline def usePopup(`type`: menu | listbox | dialog): ArrowProps = ^.asInstanceOf[js.Dynamic].applyDynamic("usePopup")(`type`.asInstanceOf[js.Any]).asInstanceOf[ArrowProps]
  inline def usePopup(
    `type`: menu | listbox | dialog,
    hasIdOpenDefaultOpenOnOpenChangeHideOnEscapeHideOnLeaveHideOnOutsideClickRestoreFocusTriggerHasArrowPositionOffsetDisabledAllowFlipAllowPreventOverflowBoundaryElementKeyProp: UsePopupOptions
  ): ArrowProps = (^.asInstanceOf[js.Dynamic].applyDynamic("usePopup")(`type`.asInstanceOf[js.Any], hasIdOpenDefaultOpenOnOpenChangeHideOnEscapeHideOnLeaveHideOnOutsideClickRestoreFocusTriggerHasArrowPositionOffsetDisabledAllowFlipAllowPreventOverflowBoundaryElementKeyProp.asInstanceOf[js.Any])).asInstanceOf[ArrowProps]
  
  inline def useRawSlots(children: Node, slots: js.Array[String]): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("useRawSlots")(children.asInstanceOf[js.Any], slots.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
  
  inline def useRefState[T](): js.Tuple2[
    RefHandle[T], 
    js.Function2[/* newValue */ T, /* rerender */ js.UndefOr[Boolean], Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRefState")().asInstanceOf[js.Tuple2[
    RefHandle[T], 
    js.Function2[/* newValue */ T, /* rerender */ js.UndefOr[Boolean], Unit]
  ]]
  inline def useRefState[T](initialValue: T): js.Tuple2[
    RefHandle[T], 
    js.Function2[/* newValue */ T, /* rerender */ js.UndefOr[Boolean], Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRefState")(initialValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    RefHandle[T], 
    js.Function2[/* newValue */ T, /* rerender */ js.UndefOr[Boolean], Unit]
  ]]
  
  inline def useResizeObserver(onResize: js.Function1[/* entry */ ResizeObserverEntry, Unit]): RefFn[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("useResizeObserver")(onResize.asInstanceOf[js.Any]).asInstanceOf[RefFn[HTMLElement]]
  inline def useResizeObserver(
    onResize: js.Function1[/* entry */ ResizeObserverEntry, Unit],
    hasIsDisabledBox: UseResizeObserverOptions
  ): RefFn[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("useResizeObserver")(onResize.asInstanceOf[js.Any], hasIsDisabledBox.asInstanceOf[js.Any])).asInstanceOf[RefFn[HTMLElement]]
  
  inline def useRestoreFocus(scope: typingsJapgolly.orbitUiReactComponents.distSharedMod.DomScope): OnKeyDownUndefined | `1` = ^.asInstanceOf[js.Dynamic].applyDynamic("useRestoreFocus")(scope.asInstanceOf[js.Any]).asInstanceOf[OnKeyDownUndefined | `1`]
  inline def useRestoreFocus(
    scope: typingsJapgolly.orbitUiReactComponents.distSharedMod.DomScope,
    hasIsDisabled: UseRestoreFocusOptions
  ): OnKeyDownUndefined | `1` = (^.asInstanceOf[js.Dynamic].applyDynamic("useRestoreFocus")(scope.asInstanceOf[js.Any], hasIsDisabled.asInstanceOf[js.Any])).asInstanceOf[OnKeyDownUndefined | `1`]
  
  inline def useRovingFocus(scope: typingsJapgolly.orbitUiReactComponents.distSharedSrcUseFocusScopeMod.DomScope): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useRovingFocus")(scope.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useRovingFocus(
    scope: typingsJapgolly.orbitUiReactComponents.distSharedSrcUseFocusScopeMod.DomScope,
    hasIsDisabled: `2`
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useRovingFocus")(scope.asInstanceOf[js.Any], hasIsDisabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useScrollableCollection(containerRef: RefHandle[org.scalajs.dom.Element]): Style | StyleHeight = ^.asInstanceOf[js.Dynamic].applyDynamic("useScrollableCollection")(containerRef.asInstanceOf[js.Any]).asInstanceOf[Style | StyleHeight]
  inline def useScrollableCollection(
    containerRef: RefHandle[org.scalajs.dom.Element],
    hasMaxHeightBorderHeightPaddingHeightItemSelectorSectionSelectorDividerSelectorDisabled: UseScrollableCollectionOptions
  ): Style | StyleHeight = (^.asInstanceOf[js.Dynamic].applyDynamic("useScrollableCollection")(containerRef.asInstanceOf[js.Any], hasMaxHeightBorderHeightPaddingHeightItemSelectorSectionSelectorDividerSelectorDisabled.asInstanceOf[js.Any])).asInstanceOf[Style | StyleHeight]
  
  inline def useSelect(
    children: Node,
    hasIdOpenPropDefaultOpenSelectedKeyPropDefaultSelectedKeyValidationStateOnSelectionChangeOnOpenChangeDirectionAlignAutoFocusDisabledReadOnlyAllowFlipAllowPreventOverflowAllowResponsiveMenuWidthAriaLabelAriaLabelledByAriaDescribedByHasMenuIdHasMenuWidthMenuStyleMenuPropsRef: UseSelectProps
  ): Close = (^.asInstanceOf[js.Dynamic].applyDynamic("useSelect")(children.asInstanceOf[js.Any], hasIdOpenPropDefaultOpenSelectedKeyPropDefaultSelectedKeyValidationStateOnSelectionChangeOnOpenChangeDirectionAlignAutoFocusDisabledReadOnlyAllowFlipAllowPreventOverflowAllowResponsiveMenuWidthAriaLabelAriaLabelledByAriaDescribedByHasMenuIdHasMenuWidthMenuStyleMenuPropsRef.asInstanceOf[js.Any])).asInstanceOf[Close]
  
  inline def useSlots[T /* <: SlotOptions */](children: Node, slots: T): UseSlotsReturn[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useSlots")(children.asInstanceOf[js.Any], slots.asInstanceOf[js.Any])).asInstanceOf[UseSlotsReturn[T]]
  
  inline def useStyleContext(): StyleContextType = ^.asInstanceOf[js.Dynamic].applyDynamic("useStyleContext")().asInstanceOf[StyleContextType]
  
  inline def useStyleProps(key: String): js.Tuple2[StyleContextType, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useStyleProps")(key.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[StyleContextType, Boolean]]
  
  inline def useTabsContext(): TabsContextType = ^.asInstanceOf[js.Dynamic].applyDynamic("useTabsContext")().asInstanceOf[TabsContextType]
  
  inline def useThemeComputedStyle(componentRef: RefHandle[org.scalajs.dom.Element]): typingsJapgolly.orbitUiReactComponents.distThemeProviderSrcUseThemeComputedStyleMod.ThemeComputedStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("useThemeComputedStyle")(componentRef.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.orbitUiReactComponents.distThemeProviderSrcUseThemeComputedStyleMod.ThemeComputedStyle]
  
  inline def useThemeContext(): ThemeContextType = ^.asInstanceOf[js.Dynamic].applyDynamic("useThemeContext")().asInstanceOf[ThemeContextType]
  
  inline def useToolbarContext(): js.Tuple2[ToolbarContextType, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useToolbarContext")().asInstanceOf[js.Tuple2[ToolbarContextType, Boolean]]
  
  inline def useToolbarProps(): js.Tuple2[UseToolbarPropsReturn, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useToolbarProps")().asInstanceOf[js.Tuple2[UseToolbarPropsReturn, Boolean]]
  
  inline def useTooltipTriggerContext(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("useTooltipTriggerContext")().asInstanceOf[js.Object]
  
  inline def useTrapFocus(focusManager: typingsJapgolly.orbitUiReactComponents.distSharedMod.FocusManager): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useTrapFocus")(focusManager.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useTriggerWidth(): js.Tuple2[RefFn[HTMLElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTriggerWidth")().asInstanceOf[js.Tuple2[RefFn[HTMLElement], String]]
  inline def useTriggerWidth(hasIsDisabled: UseTriggerWidthOptions): js.Tuple2[RefFn[HTMLElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTriggerWidth")(hasIsDisabled.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[RefFn[HTMLElement], String]]
  
  inline def useWindowListener(eventName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useWindowListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useWindowListener(eventName: String, listener: Null, active: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useWindowListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useWindowListener(eventName: String, listener: Null, active: Boolean, options: EventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useWindowListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useWindowListener(eventName: String, listener: Null, active: Boolean, options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useWindowListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useWindowListener(eventName: String, listener: Null, active: Unit, options: EventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useWindowListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useWindowListener(eventName: String, listener: Null, active: Unit, options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useWindowListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useWindowListener(eventName: String, listener: EventListenerOrEventListenerObject): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useWindowListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useWindowListener(eventName: String, listener: EventListenerOrEventListenerObject, active: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useWindowListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useWindowListener(
    eventName: String,
    listener: EventListenerOrEventListenerObject,
    active: Boolean,
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useWindowListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useWindowListener(eventName: String, listener: EventListenerOrEventListenerObject, active: Boolean, options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useWindowListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useWindowListener(
    eventName: String,
    listener: EventListenerOrEventListenerObject,
    active: Unit,
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useWindowListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useWindowListener(eventName: String, listener: EventListenerOrEventListenerObject, active: Unit, options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useWindowListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def walkFocusableElements(
    root: HTMLElement,
    onElement: js.Function2[/* element */ org.scalajs.dom.Element, /* index */ js.UndefOr[Double], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("walkFocusableElements")(root.asInstanceOf[js.Any], onElement.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def wrappedInputPropsAdapter[P /* <: `3` */](hasClassNameRest: P): (Omit[P, className]) & AdaptedWrappedInputProps = ^.asInstanceOf[js.Dynamic].applyDynamic("wrappedInputPropsAdapter")(hasClassNameRest.asInstanceOf[js.Any]).asInstanceOf[(Omit[P, className]) & AdaptedWrappedInputProps]
}
