package typingsJapgolly.wordpressEditor

import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.Record
import typingsJapgolly.wordpressBlockEditor.anon.PartialEditorFontSizePick
import typingsJapgolly.wordpressBlockEditor.anon.PartialProps
import typingsJapgolly.wordpressBlockEditor.anon.PickEditorColorcolor
import typingsJapgolly.wordpressBlockEditor.componentsAlignmentToolbarMod.AlignmentToolbar.Props
import typingsJapgolly.wordpressBlockEditor.mod.EditorColor
import typingsJapgolly.wordpressBlockEditor.mod.EditorFontSize
import typingsJapgolly.wordpressBlockEditor.mod.EditorInserterItem
import typingsJapgolly.wordpressComponents.autocompleteMod.Autocomplete.Completer
import typingsJapgolly.wordpressCoreData.schemaMod.Schema.User
import typingsJapgolly.wordpressEditor.anon.Typeof
import typingsJapgolly.wordpressEditor.anon.TypeofApply
import typingsJapgolly.wordpressEditor.anon.TypeofApplySlot
import typingsJapgolly.wordpressEditor.anon.TypeofButtonBlockAppender
import typingsJapgolly.wordpressEditor.anon.TypeofContent
import typingsJapgolly.wordpressEditor.anon.TypeofSlot
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.view
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsMod {
  
  @JSImport("@wordpress/editor/components", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@wordpress/editor/components", "AlignmentToolbar")
  @js.native
  val AlignmentToolbar: ComponentType[Props] = js.native
  
  // tslint:disable-next-line:no-unnecessary-generics
  inline def Autocomplete[T](props: typingsJapgolly.wordpressComponents.autocompleteMod.Autocomplete.Props[T]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Autocomplete")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@wordpress/editor/components", "AutosaveMonitor")
  @js.native
  val AutosaveMonitor: ComponentType[
    typingsJapgolly.wordpressEditor.componentsAutosaveMonitorMod.AutosaveMonitor.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "BlockAlignmentToolbar")
  @js.native
  val BlockAlignmentToolbar: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsBlockAlignmentToolbarMod.BlockAlignmentToolbar.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "BlockControls")
  @js.native
  val BlockControls: Typeof = js.native
  
  @JSImport("@wordpress/editor/components", "BlockEdit")
  @js.native
  val BlockEdit: ComponentType[typingsJapgolly.wordpressBlockEditor.componentsBlockEditMod.BlockEdit.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "BlockEditorKeyboardShortcuts")
  @js.native
  val BlockEditorKeyboardShortcuts: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsBlockEditorKeyboardShortcutsMod.BlockEditorKeyboardShortcuts.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "BlockFormatControls")
  @js.native
  val BlockFormatControls: TypeofApply = js.native
  
  @JSImport("@wordpress/editor/components", "BlockIcon")
  @js.native
  val BlockIcon: ComponentType[typingsJapgolly.wordpressBlockEditor.componentsBlockIconMod.BlockIcon.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "BlockInspector")
  @js.native
  val BlockInspector: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsBlockInspectorMod.BlockInspector.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "BlockList")
  @js.native
  val BlockList: ComponentType[typingsJapgolly.wordpressBlockEditor.componentsBlockListMod.BlockList.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "BlockMover")
  @js.native
  val BlockMover: ComponentType[typingsJapgolly.wordpressBlockEditor.componentsBlockMoverMod.BlockMover.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "BlockNavigationDropdown")
  @js.native
  val BlockNavigationDropdown: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsBlockNavigationDropdownMod.BlockNavigationDropdown.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "BlockSelectionClearer")
  @js.native
  val BlockSelectionClearer: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsBlockSelectionClearerMod.BlockSelectionClearer.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "BlockSettingsMenu")
  @js.native
  val BlockSettingsMenu: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsBlockSettingsMenuMod.BlockSettingsMenu.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "BlockTitle")
  @js.native
  val BlockTitle: ComponentType[typingsJapgolly.wordpressBlockEditor.componentsBlockTitleMod.BlockTitle.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "BlockToolbar")
  @js.native
  val BlockToolbar: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsBlockToolbarMod.BlockToolbar.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "ColorPalette")
  @js.native
  val ColorPalette: ComponentType[typingsJapgolly.wordpressComponents.colorPaletteMod.ColorPalette.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "ContrastChecker")
  @js.native
  val ContrastChecker: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsContrastCheckerMod.ContrastChecker.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "CopyHandler")
  @js.native
  val CopyHandler: ComponentType[typingsJapgolly.wordpressBlockEditor.componentsCopyHandlerMod.CopyHandler.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "DefaultBlockAppender")
  @js.native
  val DefaultBlockAppender: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsDefaultBlockAppenderMod.DefaultBlockAppender.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "DocumentOutline")
  @js.native
  val DocumentOutline: ComponentType[
    typingsJapgolly.wordpressEditor.componentsDocumentOutlineMod.DocumentOutline.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "DocumentOutlineCheck")
  @js.native
  val DocumentOutlineCheck: ComponentType[
    typingsJapgolly.wordpressEditor.componentsDocumentOutlineCheckMod.DocumentOutlineCheck.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "EditorGlobalKeyboardShortcuts")
  @js.native
  val EditorGlobalKeyboardShortcuts: ComponentType[
    typingsJapgolly.wordpressEditor.componentsGlobalKeyboardShortcutsVisualEditorShortcutsMod.VisualEditorGlobalKeyboardShortcuts.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "EditorHistoryRedo")
  @js.native
  val EditorHistoryRedo: ComponentType[
    typingsJapgolly.wordpressEditor.componentsEditorHistoryRedoMod.EditorHistoryRedo.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "EditorHistoryUndo")
  @js.native
  val EditorHistoryUndo: ComponentType[
    typingsJapgolly.wordpressEditor.componentsEditorHistoryUndoMod.EditorHistoryUndo.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "EditorNotices")
  @js.native
  val EditorNotices: ComponentType[typingsJapgolly.wordpressEditor.componentsEditorNoticesMod.EditorNotices.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "EditorProvider")
  @js.native
  val EditorProvider: ComponentType[typingsJapgolly.wordpressEditor.componentsProviderMod.EditorProvider.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "ErrorBoundary")
  @js.native
  val ErrorBoundary: ComponentType[typingsJapgolly.wordpressEditor.componentsErrorBoundaryMod.ErrorBoundary.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "FontSizePicker")
  @js.native
  val FontSizePicker: ComponentType[typingsJapgolly.wordpressBlockEditor.componentsFontSizesMod.FontSizePicker.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "InnerBlocks")
  @js.native
  val InnerBlocks: TypeofButtonBlockAppender = js.native
  
  @JSImport("@wordpress/editor/components", "Inserter")
  @js.native
  val Inserter: ComponentType[typingsJapgolly.wordpressBlockEditor.componentsInserterMod.Inserter.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "InspectorAdvancedControls")
  @js.native
  val InspectorAdvancedControls: TypeofSlot = js.native
  
  @JSImport("@wordpress/editor/components", "InspectorControls")
  @js.native
  val InspectorControls: TypeofApplySlot = js.native
  
  inline def MediaPlaceholder[T /* <: Boolean */](
    props: typingsJapgolly.wordpressBlockEditor.componentsMediaPlaceholderMod.MediaPlaceholder.Props[T]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MediaPlaceholder")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def MediaUpload[T /* <: Boolean */](props: typingsJapgolly.wordpressBlockEditor.componentsMediaUploadMod.MediaUpload.Props[T]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MediaUpload")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@wordpress/editor/components", "MediaUploadCheck")
  @js.native
  val MediaUploadCheck: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsMediaUploadCheckMod.MediaUploadCheck.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "MultiBlocksSwitcher")
  @js.native
  val MultiBlocksSwitcher: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsBlockSwitcherMultiBlocksSwitcherMod.MultiBlocksSwitcher.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "MultiSelectScrollIntoView")
  @js.native
  val MultiSelectScrollIntoView: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsMultiSelectScrollIntoViewMod.MultiSelectScrollIntoView.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "NavigableToolbar")
  @js.native
  val NavigableToolbar: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsNavigableToolbarMod.NavigableToolbar.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "ObserveTyping")
  @js.native
  val ObserveTyping: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsObserveTypingMod.ObserveTyping.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "PageAttributesCheck")
  @js.native
  val PageAttributesCheck: ComponentType[
    typingsJapgolly.wordpressEditor.componentsPageAttributesCheckMod.PageAttributesCheck.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "PageAttributesOrder")
  @js.native
  val PageAttributesOrder: ComponentType[
    typingsJapgolly.wordpressEditor.componentsPageAttributesOrderMod.PageAttributesOrder.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "PageAttributesParent")
  @js.native
  val PageAttributesParent: ComponentType[
    typingsJapgolly.wordpressEditor.componentsPageAttributesParentMod.PageAttributesParent.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "PageTemplate")
  @js.native
  val PageTemplate: ComponentType[
    typingsJapgolly.wordpressEditor.componentsPageAttributesTemplateMod.PageTemplate.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "PanelColorSettings")
  @js.native
  val PanelColorSettings: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsPanelColorSettingsMod.PanelColorSettings.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "PlainText")
  @js.native
  val PlainText: ComponentType[typingsJapgolly.wordpressBlockEditor.componentsPlainTextMod.PlainText.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PostAuthor")
  @js.native
  val PostAuthor: ComponentType[typingsJapgolly.wordpressEditor.componentsPostAuthorMod.PostAuthor.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PostAuthorCheck")
  @js.native
  val PostAuthorCheck: ComponentType[
    typingsJapgolly.wordpressEditor.componentsPostAuthorCheckMod.PostAuthorCheck.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "PostComments")
  @js.native
  val PostComments: ComponentType[typingsJapgolly.wordpressEditor.componentsPostCommentsMod.PostComments.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PostExcerpt")
  @js.native
  val PostExcerpt: ComponentType[typingsJapgolly.wordpressEditor.componentsPostExcerptMod.PostExcerpt.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PostExcerptCheck")
  @js.native
  val PostExcerptCheck: ComponentType[
    typingsJapgolly.wordpressEditor.componentsPostExcerptCheckMod.PostExcerptCheck.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "PostFeaturedImage")
  @js.native
  val PostFeaturedImage: ComponentType[
    typingsJapgolly.wordpressEditor.componentsPostFeaturedImageMod.PostFeaturedImage.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "PostFeaturedImageCheck")
  @js.native
  val PostFeaturedImageCheck: ComponentType[
    typingsJapgolly.wordpressEditor.componentsPostFeaturedImageCheckMod.PostFeaturedImageCheck.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "PostFormat")
  @js.native
  val PostFormat: ComponentType[typingsJapgolly.wordpressEditor.componentsPostFormatMod.PostFormat.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PostFormatCheck")
  @js.native
  val PostFormatCheck: ComponentType[
    typingsJapgolly.wordpressEditor.componentsPostFormatCheckMod.PostFormatCheck.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "PostLastRevision")
  @js.native
  val PostLastRevision: ComponentType[
    typingsJapgolly.wordpressEditor.componentsPostLastRevisionMod.PostLastRevision.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "PostLastRevisionCheck")
  @js.native
  val PostLastRevisionCheck: ComponentType[
    typingsJapgolly.wordpressEditor.componentsPostLastRevisionCheckMod.PostLastRevisionCheck.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "PostLockedModal")
  @js.native
  val PostLockedModal: ComponentType[
    typingsJapgolly.wordpressEditor.componentsPostLockedModalMod.PostLockedModal.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "PostPendingStatus")
  @js.native
  val PostPendingStatus: ComponentType[
    typingsJapgolly.wordpressEditor.componentsPostPendingStatusMod.PostPendingStatus.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "PostPendingStatusCheck")
  @js.native
  val PostPendingStatusCheck: ComponentType[
    typingsJapgolly.wordpressEditor.componentsPostPendingStatusCheckMod.PostPendingStatusCheck.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "PostPingbacks")
  @js.native
  val PostPingbacks: ComponentType[typingsJapgolly.wordpressEditor.componentsPostPingbacksMod.PostPingbacks.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PostPreviewButton")
  @js.native
  val PostPreviewButton: ComponentType[
    typingsJapgolly.wordpressEditor.componentsPostPreviewButtonMod.PostPreviewButton.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "PostPublishButton")
  @js.native
  val PostPublishButton: ComponentType[
    typingsJapgolly.wordpressEditor.componentsPostPublishButtonMod.PostPublishButton.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "PostPublishButtonLabel")
  @js.native
  val PostPublishButtonLabel: ComponentType[
    typingsJapgolly.wordpressEditor.componentsPostPublishButtonLabelMod.PostPublishButtonLabel.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "PostPublishPanel")
  @js.native
  val PostPublishPanel: ComponentType[
    typingsJapgolly.wordpressEditor.componentsPostPublishPanelMod.PostPublishPanel.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "PostSavedState")
  @js.native
  val PostSavedState: ComponentType[typingsJapgolly.wordpressEditor.componentsPostSavedStateMod.PostSavedState.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PostSchedule")
  @js.native
  val PostSchedule: ComponentType[typingsJapgolly.wordpressEditor.componentsPostScheduleMod.PostSchedule.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PostScheduleCheck")
  @js.native
  val PostScheduleCheck: ComponentType[
    typingsJapgolly.wordpressEditor.componentsPostScheduleCheckMod.PostScheduleCheck.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "PostScheduleLabel")
  @js.native
  val PostScheduleLabel: ComponentType[
    typingsJapgolly.wordpressEditor.componentsPostScheduleLabelMod.PostScheduleLabel.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "PostSticky")
  @js.native
  val PostSticky: ComponentType[typingsJapgolly.wordpressEditor.componentsPostStickyMod.PostSticky.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PostStickyCheck")
  @js.native
  val PostStickyCheck: ComponentType[
    typingsJapgolly.wordpressEditor.componentsPostStickyCheckMod.PostStickyCheck.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "PostSwitchToDraftButton")
  @js.native
  val PostSwitchToDraftButton: ComponentType[
    typingsJapgolly.wordpressEditor.componentsPostSwitchToDraftButtonMod.PostSwitchToDraftButton.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "PostTaxonomies")
  @js.native
  val PostTaxonomies: ComponentType[typingsJapgolly.wordpressEditor.componentsPostTaxonomiesMod.PostTaxonomies.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PostTaxonomiesCheck")
  @js.native
  val PostTaxonomiesCheck: ComponentType[
    typingsJapgolly.wordpressEditor.componentsPostTaxonomiesCheckMod.PostTaxonomiesCheck.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "PostTextEditor")
  @js.native
  val PostTextEditor: ComponentType[typingsJapgolly.wordpressEditor.componentsPostTextEditorMod.PostTextEditor.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PostTitle")
  @js.native
  val PostTitle: ComponentType[typingsJapgolly.wordpressEditor.componentsPostTitleMod.PostTitle.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PostTrash")
  @js.native
  val PostTrash: ComponentType[typingsJapgolly.wordpressEditor.componentsPostTrashMod.PostTrash.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PostTrashCheck")
  @js.native
  val PostTrashCheck: ComponentType[typingsJapgolly.wordpressEditor.componentsPostTrashCheckMod.PostTrashCheck.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PostTypeSupportCheck")
  @js.native
  val PostTypeSupportCheck: ComponentType[
    typingsJapgolly.wordpressEditor.componentsPostTypeSupportCheckMod.PostTypeSupportCheck.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "PostVisibility")
  @js.native
  val PostVisibility: ComponentType[typingsJapgolly.wordpressEditor.componentsPostVisibilityMod.PostVisibility.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "PostVisibilityCheck")
  @js.native
  val PostVisibilityCheck: ComponentType[
    typingsJapgolly.wordpressEditor.componentsPostVisibilityCheckMod.PostVisibilityCheck.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "PostVisibilityLabel")
  @js.native
  val PostVisibilityLabel: ComponentType[
    typingsJapgolly.wordpressEditor.componentsPostVisibilityLabelMod.PostVisibilityLabel.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "PreserveScrollInReorder")
  @js.native
  val PreserveScrollInReorder: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsPreserveScrollInReorderMod.PreserveScrollInReorder.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "RichText")
  @js.native
  val RichText: TypeofContent = js.native
  
  @JSImport("@wordpress/editor/components", "RichTextShortcut")
  @js.native
  val RichTextShortcut: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsRichTextMod.RichTextShortcut.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "RichTextToolbarButton")
  @js.native
  val RichTextToolbarButton: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsRichTextMod.RichTextToolbarButton.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "SkipToSelectedBlock")
  @js.native
  val SkipToSelectedBlock: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsSkipToSelectedBlockMod.SkipToSelectedBlock.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "TableOfContents")
  @js.native
  val TableOfContents: ComponentType[
    typingsJapgolly.wordpressEditor.componentsTableOfContentsMod.TableOfContents.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "TextEditorGlobalKeyboardShortcuts")
  @js.native
  val TextEditorGlobalKeyboardShortcuts: ComponentType[
    typingsJapgolly.wordpressEditor.componentsGlobalKeyboardShortcutsTextEditorShortcutsMod.TextEditorGlobalKeyboardShortcuts.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "URLInput")
  @js.native
  val URLInput: ComponentType[typingsJapgolly.wordpressBlockEditor.componentsUrlInputMod.URLInput.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "URLInputButton")
  @js.native
  val URLInputButton: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsUrlInputButtonMod.URLInputButton.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "URLPopover")
  @js.native
  val URLPopover: ComponentType[typingsJapgolly.wordpressBlockEditor.componentsUrlPopoverMod.URLPopover.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "UnsavedChangesWarning")
  @js.native
  val UnsavedChangesWarning: ComponentType[
    typingsJapgolly.wordpressEditor.componentsUnsavedChangesWarningMod.UnsavedChangesWarning.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "VisualEditorGlobalKeyboardShortcuts")
  @js.native
  val VisualEditorGlobalKeyboardShortcuts: ComponentType[
    typingsJapgolly.wordpressEditor.componentsGlobalKeyboardShortcutsVisualEditorShortcutsMod.VisualEditorGlobalKeyboardShortcuts.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "Warning")
  @js.native
  val Warning: ComponentType[typingsJapgolly.wordpressBlockEditor.componentsWarningMod.Warning.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "WordCount")
  @js.native
  val WordCount: ComponentType[typingsJapgolly.wordpressEditor.componentsWordCountMod.WordCount.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "WritingFlow")
  @js.native
  val WritingFlow: ComponentType[typingsJapgolly.wordpressBlockEditor.componentsWritingFlowMod.WritingFlow.Props] = js.native
  
  @JSImport("@wordpress/editor/components", "blockAutocompleter")
  @js.native
  val blockAutocompleter: Completer[EditorInserterItem] = js.native
  
  inline def createCustomColorsHOC[T /* <: js.Array[String] */](colorsArray: js.Array[EditorColor]): js.Function1[
    /* colorNames */ T, 
    js.Function1[/* component */ ComponentType[Any], ComponentType[Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createCustomColorsHOC")(colorsArray.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* colorNames */ T, 
    js.Function1[/* component */ ComponentType[Any], ComponentType[Any]]
  ]]
  
  inline def getColorClassName(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getColorClassName")().asInstanceOf[js.UndefOr[String]]
  inline def getColorClassName(colorContextName: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getColorClassName")(colorContextName.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def getColorClassName(colorContextName: String, colorSlug: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getColorClassName")(colorContextName.asInstanceOf[js.Any], colorSlug.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getColorClassName(colorContextName: Unit, colorSlug: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getColorClassName")(colorContextName.asInstanceOf[js.Any], colorSlug.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def getColorClassName_Union(colorContextName: String, colorSlug: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getColorClassName")(colorContextName.asInstanceOf[js.Any], colorSlug.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def getColorObjectByAttributeValues(colors: js.Array[EditorColor], definedColor: String, customColor: String): EditorColor | PickEditorColorcolor = (^.asInstanceOf[js.Dynamic].applyDynamic("getColorObjectByAttributeValues")(colors.asInstanceOf[js.Any], definedColor.asInstanceOf[js.Any], customColor.asInstanceOf[js.Any])).asInstanceOf[EditorColor | PickEditorColorcolor]
  inline def getColorObjectByAttributeValues(colors: js.Array[EditorColor], definedColor: Unit, customColor: String): EditorColor | PickEditorColorcolor = (^.asInstanceOf[js.Dynamic].applyDynamic("getColorObjectByAttributeValues")(colors.asInstanceOf[js.Any], definedColor.asInstanceOf[js.Any], customColor.asInstanceOf[js.Any])).asInstanceOf[EditorColor | PickEditorColorcolor]
  
  inline def getColorObjectByColorValue(colors: js.Array[EditorColor]): js.UndefOr[EditorColor] = ^.asInstanceOf[js.Dynamic].applyDynamic("getColorObjectByColorValue")(colors.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[EditorColor]]
  inline def getColorObjectByColorValue(colors: js.Array[EditorColor], colorValue: String): js.UndefOr[EditorColor] = (^.asInstanceOf[js.Dynamic].applyDynamic("getColorObjectByColorValue")(colors.asInstanceOf[js.Any], colorValue.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[EditorColor]]
  
  inline def getFontSize(fontSizes: js.Array[EditorFontSize], fontSizeAttribute: String, customFontSizeAttribute: Double): PartialEditorFontSizePick = (^.asInstanceOf[js.Dynamic].applyDynamic("getFontSize")(fontSizes.asInstanceOf[js.Any], fontSizeAttribute.asInstanceOf[js.Any], customFontSizeAttribute.asInstanceOf[js.Any])).asInstanceOf[PartialEditorFontSizePick]
  inline def getFontSize(fontSizes: js.Array[EditorFontSize], fontSizeAttribute: Unit, customFontSizeAttribute: Double): PartialEditorFontSizePick = (^.asInstanceOf[js.Dynamic].applyDynamic("getFontSize")(fontSizes.asInstanceOf[js.Any], fontSizeAttribute.asInstanceOf[js.Any], customFontSizeAttribute.asInstanceOf[js.Any])).asInstanceOf[PartialEditorFontSizePick]
  
  @JSImport("@wordpress/editor/components", "getFontSizeClass")
  @js.native
  val getFontSizeClass: js.Function1[/* fontSizeSlug */ String, String] = js.native
  
  @JSImport("@wordpress/editor/components", "userAutocompleter")
  @js.native
  val userAutocompleter: Completer[User[view]] = js.native
  
  // prettier-ignore
  inline def withColorContext[ProvidedProps /* <: PartialProps */, OwnProps /* <: Any */](component: ComponentClassP[ProvidedProps & OwnProps & js.Object]): /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentClass<ProvidedProps & OwnProps, react.react.ComponentState> extends react.react.ComponentType<infer U> ? react.react.ComponentType<std.Omit<U, 'colors' | 'disableCustomColors' | 'hasColorsToChoose'> & std.Omit<ProvidedProps, 'hasColorsToChoose'>> : never */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("withColorContext")(component.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentClass<ProvidedProps & OwnProps, react.react.ComponentState> extends react.react.ComponentType<infer U> ? react.react.ComponentType<std.Omit<U, 'colors' | 'disableCustomColors' | 'hasColorsToChoose'> & std.Omit<ProvidedProps, 'hasColorsToChoose'>> : never */ js.Any]
  inline def withColorContext[ProvidedProps /* <: PartialProps */, OwnProps /* <: Any */](component: FunctionComponent[ProvidedProps & OwnProps]): /* import warning: importer.ImportType#apply Failed type conversion: react.react.FunctionComponent<ProvidedProps & OwnProps> extends react.react.ComponentType<infer U> ? react.react.ComponentType<std.Omit<U, 'colors' | 'disableCustomColors' | 'hasColorsToChoose'> & std.Omit<ProvidedProps, 'hasColorsToChoose'>> : never */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("withColorContext")(component.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: react.react.FunctionComponent<ProvidedProps & OwnProps> extends react.react.ComponentType<infer U> ? react.react.ComponentType<std.Omit<U, 'colors' | 'disableCustomColors' | 'hasColorsToChoose'> & std.Omit<ProvidedProps, 'hasColorsToChoose'>> : never */ js.Any]
  
  @JSImport("@wordpress/editor/components", "withColors")
  @js.native
  val withColors: js.Function1[
    /* repeated */ String | (Record[String, String]), 
    js.Function1[/* component */ ComponentType[Any], ComponentType[Any]]
  ] = js.native
  
  @JSImport("@wordpress/editor/components", "withFontSizes")
  @js.native
  val withFontSizes: js.Function1[
    /* repeated */ String, 
    js.Function1[/* component */ ComponentType[Any], ComponentType[Any]]
  ] = js.native
}
