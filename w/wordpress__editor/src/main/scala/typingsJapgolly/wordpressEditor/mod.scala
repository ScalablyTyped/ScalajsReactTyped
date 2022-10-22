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
import typingsJapgolly.wordpressBlockEditor.mod.EditorStyle
import typingsJapgolly.wordpressComponents.autocompleteMod.Autocomplete.Completer
import typingsJapgolly.wordpressCoreData.schemaMod.Schema.User
import typingsJapgolly.wordpressEditor.anon.Typeof
import typingsJapgolly.wordpressEditor.anon.TypeofApply
import typingsJapgolly.wordpressEditor.anon.TypeofApplySlot
import typingsJapgolly.wordpressEditor.anon.TypeofButtonBlockAppender
import typingsJapgolly.wordpressEditor.anon.TypeofContent
import typingsJapgolly.wordpressEditor.anon.TypeofSlot
import typingsJapgolly.wordpressEditor.anon.TypeofimportedActions
import typingsJapgolly.wordpressEditor.anon.TypeofimportedSelectors
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.coreSlasheditor
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.view
import typingsJapgolly.wordpressMediaUtils.utilsUploadMediaMod.UploadMediaOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/editor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@wordpress/editor", "AlignmentToolbar")
  @js.native
  val AlignmentToolbar: ComponentType[Props] = js.native
  
  // tslint:disable-next-line:no-unnecessary-generics
  inline def Autocomplete[T](props: typingsJapgolly.wordpressComponents.autocompleteMod.Autocomplete.Props[T]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Autocomplete")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@wordpress/editor", "AutosaveMonitor")
  @js.native
  val AutosaveMonitor: ComponentType[
    typingsJapgolly.wordpressEditor.componentsAutosaveMonitorMod.AutosaveMonitor.Props
  ] = js.native
  
  @JSImport("@wordpress/editor", "BlockAlignmentToolbar")
  @js.native
  val BlockAlignmentToolbar: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsBlockAlignmentToolbarMod.BlockAlignmentToolbar.Props
  ] = js.native
  
  @JSImport("@wordpress/editor", "BlockControls")
  @js.native
  val BlockControls: Typeof = js.native
  
  @JSImport("@wordpress/editor", "BlockEdit")
  @js.native
  val BlockEdit: ComponentType[typingsJapgolly.wordpressBlockEditor.componentsBlockEditMod.BlockEdit.Props] = js.native
  
  @JSImport("@wordpress/editor", "BlockEditorKeyboardShortcuts")
  @js.native
  val BlockEditorKeyboardShortcuts: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsBlockEditorKeyboardShortcutsMod.BlockEditorKeyboardShortcuts.Props
  ] = js.native
  
  @JSImport("@wordpress/editor", "BlockFormatControls")
  @js.native
  val BlockFormatControls: TypeofApply = js.native
  
  @JSImport("@wordpress/editor", "BlockIcon")
  @js.native
  val BlockIcon: ComponentType[typingsJapgolly.wordpressBlockEditor.componentsBlockIconMod.BlockIcon.Props] = js.native
  
  @JSImport("@wordpress/editor", "BlockInspector")
  @js.native
  val BlockInspector: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsBlockInspectorMod.BlockInspector.Props
  ] = js.native
  
  @JSImport("@wordpress/editor", "BlockList")
  @js.native
  val BlockList: ComponentType[typingsJapgolly.wordpressBlockEditor.componentsBlockListMod.BlockList.Props] = js.native
  
  @JSImport("@wordpress/editor", "BlockMover")
  @js.native
  val BlockMover: ComponentType[typingsJapgolly.wordpressBlockEditor.componentsBlockMoverMod.BlockMover.Props] = js.native
  
  @JSImport("@wordpress/editor", "BlockNavigationDropdown")
  @js.native
  val BlockNavigationDropdown: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsBlockNavigationDropdownMod.BlockNavigationDropdown.Props
  ] = js.native
  
  @JSImport("@wordpress/editor", "BlockSelectionClearer")
  @js.native
  val BlockSelectionClearer: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsBlockSelectionClearerMod.BlockSelectionClearer.Props
  ] = js.native
  
  @JSImport("@wordpress/editor", "BlockSettingsMenu")
  @js.native
  val BlockSettingsMenu: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsBlockSettingsMenuMod.BlockSettingsMenu.Props
  ] = js.native
  
  @JSImport("@wordpress/editor", "BlockTitle")
  @js.native
  val BlockTitle: ComponentType[typingsJapgolly.wordpressBlockEditor.componentsBlockTitleMod.BlockTitle.Props] = js.native
  
  @JSImport("@wordpress/editor", "BlockToolbar")
  @js.native
  val BlockToolbar: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsBlockToolbarMod.BlockToolbar.Props
  ] = js.native
  
  @JSImport("@wordpress/editor", "ColorPalette")
  @js.native
  val ColorPalette: ComponentType[typingsJapgolly.wordpressComponents.colorPaletteMod.ColorPalette.Props] = js.native
  
  @JSImport("@wordpress/editor", "ContrastChecker")
  @js.native
  val ContrastChecker: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsContrastCheckerMod.ContrastChecker.Props
  ] = js.native
  
  @JSImport("@wordpress/editor", "CopyHandler")
  @js.native
  val CopyHandler: ComponentType[typingsJapgolly.wordpressBlockEditor.componentsCopyHandlerMod.CopyHandler.Props] = js.native
  
  @JSImport("@wordpress/editor", "DefaultBlockAppender")
  @js.native
  val DefaultBlockAppender: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsDefaultBlockAppenderMod.DefaultBlockAppender.Props
  ] = js.native
  
  @JSImport("@wordpress/editor", "DocumentOutline")
  @js.native
  val DocumentOutline: ComponentType[
    typingsJapgolly.wordpressEditor.componentsDocumentOutlineMod.DocumentOutline.Props
  ] = js.native
  
  @JSImport("@wordpress/editor", "DocumentOutlineCheck")
  @js.native
  val DocumentOutlineCheck: ComponentType[
    typingsJapgolly.wordpressEditor.componentsDocumentOutlineCheckMod.DocumentOutlineCheck.Props
  ] = js.native
  
  @JSImport("@wordpress/editor", "EditorGlobalKeyboardShortcuts")
  @js.native
  val EditorGlobalKeyboardShortcuts: ComponentType[
    typingsJapgolly.wordpressEditor.componentsGlobalKeyboardShortcutsVisualEditorShortcutsMod.VisualEditorGlobalKeyboardShortcuts.Props
  ] = js.native
  
  @JSImport("@wordpress/editor", "EditorHistoryRedo")
  @js.native
  val EditorHistoryRedo: ComponentType[
    typingsJapgolly.wordpressEditor.componentsEditorHistoryRedoMod.EditorHistoryRedo.Props
  ] = js.native
  
  @JSImport("@wordpress/editor", "EditorHistoryUndo")
  @js.native
  val EditorHistoryUndo: ComponentType[
    typingsJapgolly.wordpressEditor.componentsEditorHistoryUndoMod.EditorHistoryUndo.Props
  ] = js.native
  
  @JSImport("@wordpress/editor", "EditorNotices")
  @js.native
  val EditorNotices: ComponentType[typingsJapgolly.wordpressEditor.componentsEditorNoticesMod.EditorNotices.Props] = js.native
  
  @JSImport("@wordpress/editor", "EditorProvider")
  @js.native
  val EditorProvider: ComponentType[typingsJapgolly.wordpressEditor.componentsProviderMod.EditorProvider.Props] = js.native
  
  @JSImport("@wordpress/editor", "ErrorBoundary")
  @js.native
  val ErrorBoundary: ComponentType[typingsJapgolly.wordpressEditor.componentsErrorBoundaryMod.ErrorBoundary.Props] = js.native
  
  @JSImport("@wordpress/editor", "FontSizePicker")
  @js.native
  val FontSizePicker: ComponentType[typingsJapgolly.wordpressBlockEditor.componentsFontSizesMod.FontSizePicker.Props] = js.native
  
  @JSImport("@wordpress/editor", "InnerBlocks")
  @js.native
  val InnerBlocks: TypeofButtonBlockAppender = js.native
  
  @JSImport("@wordpress/editor", "Inserter")
  @js.native
  val Inserter: ComponentType[typingsJapgolly.wordpressBlockEditor.componentsInserterMod.Inserter.Props] = js.native
  
  @JSImport("@wordpress/editor", "InspectorAdvancedControls")
  @js.native
  val InspectorAdvancedControls: TypeofSlot = js.native
  
  @JSImport("@wordpress/editor", "InspectorControls")
  @js.native
  val InspectorControls: TypeofApplySlot = js.native
  
  inline def MediaPlaceholder[T /* <: Boolean */](
    props: typingsJapgolly.wordpressBlockEditor.componentsMediaPlaceholderMod.MediaPlaceholder.Props[T]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MediaPlaceholder")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@wordpress/editor", "MediaUploadCheck")
  @js.native
  val MediaUploadCheck: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsMediaUploadCheckMod.MediaUploadCheck.Props
  ] = js.native
  
  inline def MediaUpload_[T /* <: Boolean */](props: typingsJapgolly.wordpressBlockEditor.componentsMediaUploadMod.MediaUpload.Props[T]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MediaUpload")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@wordpress/editor", "MultiBlocksSwitcher")
  @js.native
  val MultiBlocksSwitcher: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsBlockSwitcherMultiBlocksSwitcherMod.MultiBlocksSwitcher.Props
  ] = js.native
  
  @JSImport("@wordpress/editor", "MultiSelectScrollIntoView")
  @js.native
  val MultiSelectScrollIntoView: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsMultiSelectScrollIntoViewMod.MultiSelectScrollIntoView.Props
  ] = js.native
  
  @JSImport("@wordpress/editor", "NavigableToolbar")
  @js.native
  val NavigableToolbar: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsNavigableToolbarMod.NavigableToolbar.Props
  ] = js.native
  
  @JSImport("@wordpress/editor", "ObserveTyping")
  @js.native
  val ObserveTyping: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsObserveTypingMod.ObserveTyping.Props
  ] = js.native
  
  @JSImport("@wordpress/editor", "PageAttributesCheck")
  @js.native
  val PageAttributesCheck: ComponentType[
    typingsJapgolly.wordpressEditor.componentsPageAttributesCheckMod.PageAttributesCheck.Props
  ] = js.native
  
  @JSImport("@wordpress/editor", "PageAttributesOrder")
  @js.native
  val PageAttributesOrder: ComponentType[
    typingsJapgolly.wordpressEditor.componentsPageAttributesOrderMod.PageAttributesOrder.Props
  ] = js.native
  
  @JSImport("@wordpress/editor", "PageAttributesParent")
  @js.native
  val PageAttributesParent: ComponentType[
    typingsJapgolly.wordpressEditor.componentsPageAttributesParentMod.PageAttributesParent.Props
  ] = js.native
  
  @JSImport("@wordpress/editor", "PageTemplate")
  @js.native
  val PageTemplate: ComponentType[
    typingsJapgolly.wordpressEditor.componentsPageAttributesTemplateMod.PageTemplate.Props
  ] = js.native
  
  @JSImport("@wordpress/editor", "PanelColorSettings")
  @js.native
  val PanelColorSettings: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsPanelColorSettingsMod.PanelColorSettings.Props
  ] = js.native
  
  @JSImport("@wordpress/editor", "PlainText")
  @js.native
  val PlainText: ComponentType[typingsJapgolly.wordpressBlockEditor.componentsPlainTextMod.PlainText.Props] = js.native
  
  @JSImport("@wordpress/editor", "PostAuthor")
  @js.native
  val PostAuthor: ComponentType[typingsJapgolly.wordpressEditor.componentsPostAuthorMod.PostAuthor.Props] = js.native
  
  @JSImport("@wordpress/editor", "PostAuthorCheck")
  @js.native
  val PostAuthorCheck: ComponentType[
    typingsJapgolly.wordpressEditor.componentsPostAuthorCheckMod.PostAuthorCheck.Props
  ] = js.native
  
  @JSImport("@wordpress/editor", "PostComments")
  @js.native
  val PostComments: ComponentType[typingsJapgolly.wordpressEditor.componentsPostCommentsMod.PostComments.Props] = js.native
  
  @JSImport("@wordpress/editor", "PostExcerpt")
  @js.native
  val PostExcerpt: ComponentType[typingsJapgolly.wordpressEditor.componentsPostExcerptMod.PostExcerpt.Props] = js.native
  
  @JSImport("@wordpress/editor", "PostExcerptCheck")
  @js.native
  val PostExcerptCheck: ComponentType[
    typingsJapgolly.wordpressEditor.componentsPostExcerptCheckMod.PostExcerptCheck.Props
  ] = js.native
  
  @JSImport("@wordpress/editor", "PostFeaturedImage")
  @js.native
  val PostFeaturedImage: ComponentType[
    typingsJapgolly.wordpressEditor.componentsPostFeaturedImageMod.PostFeaturedImage.Props
  ] = js.native
  
  @JSImport("@wordpress/editor", "PostFeaturedImageCheck")
  @js.native
  val PostFeaturedImageCheck: ComponentType[
    typingsJapgolly.wordpressEditor.componentsPostFeaturedImageCheckMod.PostFeaturedImageCheck.Props
  ] = js.native
  
  @JSImport("@wordpress/editor", "PostFormat")
  @js.native
  val PostFormat: ComponentType[typingsJapgolly.wordpressEditor.componentsPostFormatMod.PostFormat.Props] = js.native
  
  @JSImport("@wordpress/editor", "PostFormatCheck")
  @js.native
  val PostFormatCheck: ComponentType[
    typingsJapgolly.wordpressEditor.componentsPostFormatCheckMod.PostFormatCheck.Props
  ] = js.native
  
  @JSImport("@wordpress/editor", "PostLastRevision")
  @js.native
  val PostLastRevision: ComponentType[
    typingsJapgolly.wordpressEditor.componentsPostLastRevisionMod.PostLastRevision.Props
  ] = js.native
  
  @JSImport("@wordpress/editor", "PostLastRevisionCheck")
  @js.native
  val PostLastRevisionCheck: ComponentType[
    typingsJapgolly.wordpressEditor.componentsPostLastRevisionCheckMod.PostLastRevisionCheck.Props
  ] = js.native
  
  @JSImport("@wordpress/editor", "PostLockedModal")
  @js.native
  val PostLockedModal: ComponentType[
    typingsJapgolly.wordpressEditor.componentsPostLockedModalMod.PostLockedModal.Props
  ] = js.native
  
  @JSImport("@wordpress/editor", "PostPendingStatus")
  @js.native
  val PostPendingStatus: ComponentType[
    typingsJapgolly.wordpressEditor.componentsPostPendingStatusMod.PostPendingStatus.Props
  ] = js.native
  
  @JSImport("@wordpress/editor", "PostPendingStatusCheck")
  @js.native
  val PostPendingStatusCheck: ComponentType[
    typingsJapgolly.wordpressEditor.componentsPostPendingStatusCheckMod.PostPendingStatusCheck.Props
  ] = js.native
  
  @JSImport("@wordpress/editor", "PostPingbacks")
  @js.native
  val PostPingbacks: ComponentType[typingsJapgolly.wordpressEditor.componentsPostPingbacksMod.PostPingbacks.Props] = js.native
  
  @JSImport("@wordpress/editor", "PostPreviewButton")
  @js.native
  val PostPreviewButton: ComponentType[
    typingsJapgolly.wordpressEditor.componentsPostPreviewButtonMod.PostPreviewButton.Props
  ] = js.native
  
  @JSImport("@wordpress/editor", "PostPublishButton")
  @js.native
  val PostPublishButton: ComponentType[
    typingsJapgolly.wordpressEditor.componentsPostPublishButtonMod.PostPublishButton.Props
  ] = js.native
  
  @JSImport("@wordpress/editor", "PostPublishButtonLabel")
  @js.native
  val PostPublishButtonLabel: ComponentType[
    typingsJapgolly.wordpressEditor.componentsPostPublishButtonLabelMod.PostPublishButtonLabel.Props
  ] = js.native
  
  @JSImport("@wordpress/editor", "PostPublishPanel")
  @js.native
  val PostPublishPanel: ComponentType[
    typingsJapgolly.wordpressEditor.componentsPostPublishPanelMod.PostPublishPanel.Props
  ] = js.native
  
  @JSImport("@wordpress/editor", "PostSavedState")
  @js.native
  val PostSavedState: ComponentType[typingsJapgolly.wordpressEditor.componentsPostSavedStateMod.PostSavedState.Props] = js.native
  
  @JSImport("@wordpress/editor", "PostSchedule")
  @js.native
  val PostSchedule: ComponentType[typingsJapgolly.wordpressEditor.componentsPostScheduleMod.PostSchedule.Props] = js.native
  
  @JSImport("@wordpress/editor", "PostScheduleCheck")
  @js.native
  val PostScheduleCheck: ComponentType[
    typingsJapgolly.wordpressEditor.componentsPostScheduleCheckMod.PostScheduleCheck.Props
  ] = js.native
  
  @JSImport("@wordpress/editor", "PostScheduleLabel")
  @js.native
  val PostScheduleLabel: ComponentType[
    typingsJapgolly.wordpressEditor.componentsPostScheduleLabelMod.PostScheduleLabel.Props
  ] = js.native
  
  @JSImport("@wordpress/editor", "PostSticky")
  @js.native
  val PostSticky: ComponentType[typingsJapgolly.wordpressEditor.componentsPostStickyMod.PostSticky.Props] = js.native
  
  @JSImport("@wordpress/editor", "PostStickyCheck")
  @js.native
  val PostStickyCheck: ComponentType[
    typingsJapgolly.wordpressEditor.componentsPostStickyCheckMod.PostStickyCheck.Props
  ] = js.native
  
  @JSImport("@wordpress/editor", "PostSwitchToDraftButton")
  @js.native
  val PostSwitchToDraftButton: ComponentType[
    typingsJapgolly.wordpressEditor.componentsPostSwitchToDraftButtonMod.PostSwitchToDraftButton.Props
  ] = js.native
  
  @JSImport("@wordpress/editor", "PostTaxonomies")
  @js.native
  val PostTaxonomies: ComponentType[typingsJapgolly.wordpressEditor.componentsPostTaxonomiesMod.PostTaxonomies.Props] = js.native
  
  @JSImport("@wordpress/editor", "PostTaxonomiesCheck")
  @js.native
  val PostTaxonomiesCheck: ComponentType[
    typingsJapgolly.wordpressEditor.componentsPostTaxonomiesCheckMod.PostTaxonomiesCheck.Props
  ] = js.native
  
  @JSImport("@wordpress/editor", "PostTextEditor")
  @js.native
  val PostTextEditor: ComponentType[typingsJapgolly.wordpressEditor.componentsPostTextEditorMod.PostTextEditor.Props] = js.native
  
  @JSImport("@wordpress/editor", "PostTitle")
  @js.native
  val PostTitle: ComponentType[typingsJapgolly.wordpressEditor.componentsPostTitleMod.PostTitle.Props] = js.native
  
  @JSImport("@wordpress/editor", "PostTrash")
  @js.native
  val PostTrash: ComponentType[typingsJapgolly.wordpressEditor.componentsPostTrashMod.PostTrash.Props] = js.native
  
  @JSImport("@wordpress/editor", "PostTrashCheck")
  @js.native
  val PostTrashCheck: ComponentType[typingsJapgolly.wordpressEditor.componentsPostTrashCheckMod.PostTrashCheck.Props] = js.native
  
  @JSImport("@wordpress/editor", "PostTypeSupportCheck")
  @js.native
  val PostTypeSupportCheck: ComponentType[
    typingsJapgolly.wordpressEditor.componentsPostTypeSupportCheckMod.PostTypeSupportCheck.Props
  ] = js.native
  
  @JSImport("@wordpress/editor", "PostVisibility")
  @js.native
  val PostVisibility: ComponentType[typingsJapgolly.wordpressEditor.componentsPostVisibilityMod.PostVisibility.Props] = js.native
  
  @JSImport("@wordpress/editor", "PostVisibilityCheck")
  @js.native
  val PostVisibilityCheck: ComponentType[
    typingsJapgolly.wordpressEditor.componentsPostVisibilityCheckMod.PostVisibilityCheck.Props
  ] = js.native
  
  @JSImport("@wordpress/editor", "PostVisibilityLabel")
  @js.native
  val PostVisibilityLabel: ComponentType[
    typingsJapgolly.wordpressEditor.componentsPostVisibilityLabelMod.PostVisibilityLabel.Props
  ] = js.native
  
  @JSImport("@wordpress/editor", "PreserveScrollInReorder")
  @js.native
  val PreserveScrollInReorder: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsPreserveScrollInReorderMod.PreserveScrollInReorder.Props
  ] = js.native
  
  @JSImport("@wordpress/editor", "RichText")
  @js.native
  val RichText: TypeofContent = js.native
  
  @JSImport("@wordpress/editor", "RichTextShortcut")
  @js.native
  val RichTextShortcut: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsRichTextMod.RichTextShortcut.Props
  ] = js.native
  
  @JSImport("@wordpress/editor", "RichTextToolbarButton")
  @js.native
  val RichTextToolbarButton: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsRichTextMod.RichTextToolbarButton.Props
  ] = js.native
  
  @JSImport("@wordpress/editor", "SkipToSelectedBlock")
  @js.native
  val SkipToSelectedBlock: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsSkipToSelectedBlockMod.SkipToSelectedBlock.Props
  ] = js.native
  
  @JSImport("@wordpress/editor", "TableOfContents")
  @js.native
  val TableOfContents: ComponentType[
    typingsJapgolly.wordpressEditor.componentsTableOfContentsMod.TableOfContents.Props
  ] = js.native
  
  @JSImport("@wordpress/editor", "TextEditorGlobalKeyboardShortcuts")
  @js.native
  val TextEditorGlobalKeyboardShortcuts: ComponentType[
    typingsJapgolly.wordpressEditor.componentsGlobalKeyboardShortcutsTextEditorShortcutsMod.TextEditorGlobalKeyboardShortcuts.Props
  ] = js.native
  
  @JSImport("@wordpress/editor", "URLInput")
  @js.native
  val URLInput: ComponentType[typingsJapgolly.wordpressBlockEditor.componentsUrlInputMod.URLInput.Props] = js.native
  
  @JSImport("@wordpress/editor", "URLInputButton")
  @js.native
  val URLInputButton: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsUrlInputButtonMod.URLInputButton.Props
  ] = js.native
  
  @JSImport("@wordpress/editor", "URLPopover")
  @js.native
  val URLPopover: ComponentType[typingsJapgolly.wordpressBlockEditor.componentsUrlPopoverMod.URLPopover.Props] = js.native
  
  @JSImport("@wordpress/editor", "UnsavedChangesWarning")
  @js.native
  val UnsavedChangesWarning: ComponentType[
    typingsJapgolly.wordpressEditor.componentsUnsavedChangesWarningMod.UnsavedChangesWarning.Props
  ] = js.native
  
  @JSImport("@wordpress/editor", "VisualEditorGlobalKeyboardShortcuts")
  @js.native
  val VisualEditorGlobalKeyboardShortcuts: ComponentType[
    typingsJapgolly.wordpressEditor.componentsGlobalKeyboardShortcutsVisualEditorShortcutsMod.VisualEditorGlobalKeyboardShortcuts.Props
  ] = js.native
  
  @JSImport("@wordpress/editor", "Warning")
  @js.native
  val Warning: ComponentType[typingsJapgolly.wordpressBlockEditor.componentsWarningMod.Warning.Props] = js.native
  
  @JSImport("@wordpress/editor", "WordCount")
  @js.native
  val WordCount: ComponentType[typingsJapgolly.wordpressEditor.componentsWordCountMod.WordCount.Props] = js.native
  
  @JSImport("@wordpress/editor", "WritingFlow")
  @js.native
  val WritingFlow: ComponentType[typingsJapgolly.wordpressBlockEditor.componentsWritingFlowMod.WritingFlow.Props] = js.native
  
  @JSImport("@wordpress/editor", "blockAutocompleter")
  @js.native
  val blockAutocompleter: Completer[EditorInserterItem] = js.native
  
  inline def cleanForSlug(slug: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanForSlug")(slug.asInstanceOf[js.Any]).asInstanceOf[String]
  
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
  
  @JSImport("@wordpress/editor", "getFontSizeClass")
  @js.native
  val getFontSizeClass: js.Function1[/* fontSizeSlug */ String, String] = js.native
  
  inline def mediaUpload(options: UploadMediaOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("mediaUpload")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  object storeConfig {
    
    @JSImport("@wordpress/editor", "storeConfig")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/editor", "storeConfig.actions")
    @js.native
    def actions: Any = js.native
    inline def actions_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("actions")(x.asInstanceOf[js.Any])
    
    @JSImport("@wordpress/editor", "storeConfig.controls")
    @js.native
    def controls: Any = js.native
    inline def controls_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("controls")(x.asInstanceOf[js.Any])
    
    @JSImport("@wordpress/editor", "storeConfig.reducer")
    @js.native
    def reducer: Any = js.native
    inline def reducer_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reducer")(x.asInstanceOf[js.Any])
    
    @JSImport("@wordpress/editor", "storeConfig.selectors")
    @js.native
    def selectors: Any = js.native
    inline def selectors_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectors")(x.asInstanceOf[js.Any])
  }
  
  inline def transformStyles(styles: js.Array[EditorStyle]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformStyles")(styles.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def transformStyles(styles: js.Array[EditorStyle], wrapperClassName: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformStyles")(styles.asInstanceOf[js.Any], wrapperClassName.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @JSImport("@wordpress/editor", "userAutocompleter")
  @js.native
  val userAutocompleter: Completer[User[view]] = js.native
  
  // prettier-ignore
  inline def withColorContext[ProvidedProps /* <: PartialProps */, OwnProps /* <: Any */](component: ComponentClassP[ProvidedProps & OwnProps & js.Object]): /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentClass<ProvidedProps & OwnProps, react.react.ComponentState> extends react.react.ComponentType<infer U> ? react.react.ComponentType<std.Omit<U, 'colors' | 'disableCustomColors' | 'hasColorsToChoose'> & std.Omit<ProvidedProps, 'hasColorsToChoose'>> : never */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("withColorContext")(component.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentClass<ProvidedProps & OwnProps, react.react.ComponentState> extends react.react.ComponentType<infer U> ? react.react.ComponentType<std.Omit<U, 'colors' | 'disableCustomColors' | 'hasColorsToChoose'> & std.Omit<ProvidedProps, 'hasColorsToChoose'>> : never */ js.Any]
  inline def withColorContext[ProvidedProps /* <: PartialProps */, OwnProps /* <: Any */](component: FunctionComponent[ProvidedProps & OwnProps]): /* import warning: importer.ImportType#apply Failed type conversion: react.react.FunctionComponent<ProvidedProps & OwnProps> extends react.react.ComponentType<infer U> ? react.react.ComponentType<std.Omit<U, 'colors' | 'disableCustomColors' | 'hasColorsToChoose'> & std.Omit<ProvidedProps, 'hasColorsToChoose'>> : never */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("withColorContext")(component.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: react.react.FunctionComponent<ProvidedProps & OwnProps> extends react.react.ComponentType<infer U> ? react.react.ComponentType<std.Omit<U, 'colors' | 'disableCustomColors' | 'hasColorsToChoose'> & std.Omit<ProvidedProps, 'hasColorsToChoose'>> : never */ js.Any]
  
  @JSImport("@wordpress/editor", "withColors")
  @js.native
  val withColors: js.Function1[
    /* repeated */ String | (Record[String, String]), 
    js.Function1[/* component */ ComponentType[Any], ComponentType[Any]]
  ] = js.native
  
  @JSImport("@wordpress/editor", "withFontSizes")
  @js.native
  val withFontSizes: js.Function1[
    /* repeated */ String, 
    js.Function1[/* component */ ComponentType[Any], ComponentType[Any]]
  ] = js.native
  
  /* augmented module */
  object wordpressDataAugmentingMod {
    
    @JSImport("@wordpress/data", JSImport.Namespace)
    @js.native
    val ^ : js.Any = js.native
    
    inline def dispatch_coreeditor(key: coreSlasheditor): TypeofimportedActions = ^.asInstanceOf[js.Dynamic].applyDynamic("dispatch")(key.asInstanceOf[js.Any]).asInstanceOf[TypeofimportedActions]
    
    inline def select_coreeditor(key: coreSlasheditor): TypeofimportedSelectors = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(key.asInstanceOf[js.Any]).asInstanceOf[TypeofimportedSelectors]
  }
}
