package typingsJapgolly.wordpressBlockEditor

import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.Record
import typingsJapgolly.wordpressBlockEditor.anon.Children
import typingsJapgolly.wordpressBlockEditor.anon.OmitPropsname
import typingsJapgolly.wordpressBlockEditor.anon.PartialEditorFontSizePick
import typingsJapgolly.wordpressBlockEditor.anon.PartialProps
import typingsJapgolly.wordpressBlockEditor.anon.PickEditorColorcolor
import typingsJapgolly.wordpressBlockEditor.componentsAlignmentToolbarMod.AlignmentToolbar.Props
import typingsJapgolly.wordpressBlockEditor.componentsRichTextMod.RichText.ContentProps
import typingsJapgolly.wordpressBlockEditor.componentsUseBlockPropsMod.UseBlockProps_
import typingsJapgolly.wordpressBlockEditor.mod.EditorColor
import typingsJapgolly.wordpressBlockEditor.mod.EditorFontSize
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.`object`
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.`var`
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.a
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.abbr
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.address
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.area
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.article
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.aside
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.audio
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.b
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.base
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.bdi
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.bdo
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.blockquote
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.body
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.br
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.button
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.canvas
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.caption
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.cite
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.code
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.col
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.colgroup
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.data
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.datalist
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.dd
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.del
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.details
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.dfn
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.dialog
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.div
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.dl
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.dt
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.em
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.embed
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.fieldset
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.figcaption
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.figure
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.footer
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.form
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.h1
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.h2
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.h3
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.h4
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.h5
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.h6
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.head
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.header
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.hgroup
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.hr
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.html
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.i
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.iframe
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.img
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.input
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.ins
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.kbd
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.label
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.legend
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.li
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.link
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.main
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.map
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.mark
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.menu
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.meta
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.meter
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.nav
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.noscript
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.ol
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.optgroup
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.option
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.output
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.p
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.picture
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.pre
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.progress
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.q
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.rp
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.rt
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.ruby
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.s
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.samp
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.script
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.section
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.select
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.slot
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.small
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.source
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.span
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.strong
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.style
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.sub
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.summary
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.sup
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.table
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.tbody
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.td
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.template
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.textarea
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.tfoot
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.th
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.thead
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.time
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.title
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.tr
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.track
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.u
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.ul
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.video
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.wbr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsMod {
  
  @JSImport("@wordpress/block-editor/components", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@wordpress/block-editor/components", "AlignmentToolbar")
  @js.native
  val AlignmentToolbar: ComponentType[Props] = js.native
  
  // tslint:disable-next-line:no-unnecessary-generics
  inline def Autocomplete[T](props: typingsJapgolly.wordpressComponents.autocompleteMod.Autocomplete.Props[T]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Autocomplete")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@wordpress/block-editor/components", "BlockAlignmentToolbar")
  @js.native
  val BlockAlignmentToolbar: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsBlockAlignmentToolbarMod.BlockAlignmentToolbar.Props
  ] = js.native
  
  object BlockControls {
    
    inline def apply(props: typingsJapgolly.wordpressBlockEditor.componentsBlockControlsMod.BlockControls.Props): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@wordpress/block-editor/components", "BlockControls")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/block-editor/components", "BlockControls.Slot")
    @js.native
    def Slot: FC[OmitPropsname] = js.native
    inline def Slot_=(x: FC[OmitPropsname]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Slot")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@wordpress/block-editor/components", "BlockEdit")
  @js.native
  val BlockEdit: ComponentType[typingsJapgolly.wordpressBlockEditor.componentsBlockEditMod.BlockEdit.Props] = js.native
  
  @JSImport("@wordpress/block-editor/components", "BlockEditorKeyboardShortcuts")
  @js.native
  val BlockEditorKeyboardShortcuts: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsBlockEditorKeyboardShortcutsMod.BlockEditorKeyboardShortcuts.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor/components", "BlockEditorProvider")
  @js.native
  val BlockEditorProvider: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsProviderMod.BlockEditorProvider.Props
  ] = js.native
  
  object BlockFormatControls {
    
    inline def apply(
      props: typingsJapgolly.wordpressBlockEditor.componentsBlockFormatControlsMod.BlockFormatControls.Props
    ): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@wordpress/block-editor/components", "BlockFormatControls")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/block-editor/components", "BlockFormatControls.Slot")
    @js.native
    def Slot: FC[OmitPropsname] = js.native
    inline def Slot_=(x: FC[OmitPropsname]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Slot")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@wordpress/block-editor/components", "BlockIcon")
  @js.native
  val BlockIcon: ComponentType[typingsJapgolly.wordpressBlockEditor.componentsBlockIconMod.BlockIcon.Props] = js.native
  
  @JSImport("@wordpress/block-editor/components", "BlockInspector")
  @js.native
  val BlockInspector: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsBlockInspectorMod.BlockInspector.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor/components", "BlockList")
  @js.native
  val BlockList: ComponentType[typingsJapgolly.wordpressBlockEditor.componentsBlockListMod.BlockList.Props] = js.native
  
  @JSImport("@wordpress/block-editor/components", "BlockMover")
  @js.native
  val BlockMover: ComponentType[typingsJapgolly.wordpressBlockEditor.componentsBlockMoverMod.BlockMover.Props] = js.native
  
  @JSImport("@wordpress/block-editor/components", "BlockNavigationDropdown")
  @js.native
  val BlockNavigationDropdown: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsBlockNavigationDropdownMod.BlockNavigationDropdown.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor/components", "BlockSelectionClearer")
  @js.native
  val BlockSelectionClearer: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsBlockSelectionClearerMod.BlockSelectionClearer.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor/components", "BlockSettingsMenu")
  @js.native
  val BlockSettingsMenu: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsBlockSettingsMenuMod.BlockSettingsMenu.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor/components", "BlockTitle")
  @js.native
  val BlockTitle: ComponentType[typingsJapgolly.wordpressBlockEditor.componentsBlockTitleMod.BlockTitle.Props] = js.native
  
  @JSImport("@wordpress/block-editor/components", "BlockToolbar")
  @js.native
  val BlockToolbar: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsBlockToolbarMod.BlockToolbar.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor/components", "BlockVerticalAlignmentToolbar")
  @js.native
  val BlockVerticalAlignmentToolbar: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsBlockVerticalAlignmentToolbarMod.BlockVerticalAlignmentToolbar.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor/components", "ButtonBlockAppender")
  @js.native
  val ButtonBlockAppender: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsButtonBlockAppenderMod.ButtonBlockAppender.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor/components", "ColorPalette")
  @js.native
  val ColorPalette: ComponentType[typingsJapgolly.wordpressComponents.colorPaletteMod.ColorPalette.Props] = js.native
  
  @JSImport("@wordpress/block-editor/components", "ContrastChecker")
  @js.native
  val ContrastChecker: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsContrastCheckerMod.ContrastChecker.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor/components", "CopyHandler")
  @js.native
  val CopyHandler: ComponentType[typingsJapgolly.wordpressBlockEditor.componentsCopyHandlerMod.CopyHandler.Props] = js.native
  
  @JSImport("@wordpress/block-editor/components", "DefaultBlockAppender")
  @js.native
  val DefaultBlockAppender: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsDefaultBlockAppenderMod.DefaultBlockAppender.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor/components", "FontSizePicker")
  @js.native
  val FontSizePicker: ComponentType[typingsJapgolly.wordpressBlockEditor.componentsFontSizesMod.FontSizePicker.Props] = js.native
  
  object InnerBlocks {
    
    inline def apply(props: typingsJapgolly.wordpressBlockEditor.componentsInnerBlocksMod.InnerBlocks.Props): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@wordpress/block-editor/components", "InnerBlocks")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * display a `+` (plus) icon button that, when clicked, displays the block picker menu. No
      * default Block is inserted.
      */
    @JSImport("@wordpress/block-editor/components", "InnerBlocks.ButtonBlockAppender")
    @js.native
    def ButtonBlockAppender: ComponentType[Children] = js.native
    inline def ButtonBlockAppender_=(x: ComponentType[Children]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ButtonBlockAppender")(x.asInstanceOf[js.Any])
    
    @JSImport("@wordpress/block-editor/components", "InnerBlocks.Content")
    @js.native
    def Content: ComponentType[Children] = js.native
    inline def Content_=(x: ComponentType[Children]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
    
    /**
      * display the default block appender as set by `wp.blocks.setDefaultBlockName`. Typically this
      * is the `paragraph` block.
      */
    @JSImport("@wordpress/block-editor/components", "InnerBlocks.DefaultBlockAppender")
    @js.native
    def DefaultBlockAppender: ComponentType[Children] = js.native
    inline def DefaultBlockAppender_=(x: ComponentType[Children]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultBlockAppender")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@wordpress/block-editor/components", "Inserter")
  @js.native
  val Inserter: ComponentType[typingsJapgolly.wordpressBlockEditor.componentsInserterMod.Inserter.Props] = js.native
  
  object InspectorAdvancedControls {
    
    inline def apply(
      props: typingsJapgolly.wordpressBlockEditor.componentsInspectorAdvancedControlsMod.InspectorAdvancedControls.Props
    ): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@wordpress/block-editor/components", "InspectorAdvancedControls")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/block-editor/components", "InspectorAdvancedControls.Slot")
    @js.native
    def Slot: FC[OmitPropsname] = js.native
    inline def Slot_=(x: FC[OmitPropsname]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Slot")(x.asInstanceOf[js.Any])
  }
  
  object InspectorControls {
    
    inline def apply(props: typingsJapgolly.wordpressBlockEditor.componentsInspectorControlsMod.InspectorControls.Props): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@wordpress/block-editor/components", "InspectorControls")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/block-editor/components", "InspectorControls.Slot")
    @js.native
    def Slot: FC[OmitPropsname] = js.native
    inline def Slot_=(x: FC[OmitPropsname]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Slot")(x.asInstanceOf[js.Any])
  }
  
  inline def MediaPlaceholder[T /* <: Boolean */](
    props: typingsJapgolly.wordpressBlockEditor.componentsMediaPlaceholderMod.MediaPlaceholder.Props[T]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MediaPlaceholder")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def MediaUpload[T /* <: Boolean */](props: typingsJapgolly.wordpressBlockEditor.componentsMediaUploadMod.MediaUpload.Props[T]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MediaUpload")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@wordpress/block-editor/components", "MediaUploadCheck")
  @js.native
  val MediaUploadCheck: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsMediaUploadCheckMod.MediaUploadCheck.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor/components", "MultiBlocksSwitcher")
  @js.native
  val MultiBlocksSwitcher: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsBlockSwitcherMultiBlocksSwitcherMod.MultiBlocksSwitcher.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor/components", "MultiSelectScrollIntoView")
  @js.native
  val MultiSelectScrollIntoView: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsMultiSelectScrollIntoViewMod.MultiSelectScrollIntoView.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor/components", "NavigableToolbar")
  @js.native
  val NavigableToolbar: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsNavigableToolbarMod.NavigableToolbar.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor/components", "ObserveTyping")
  @js.native
  val ObserveTyping: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsObserveTypingMod.ObserveTyping.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor/components", "PanelColorSettings")
  @js.native
  val PanelColorSettings: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsPanelColorSettingsMod.PanelColorSettings.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor/components", "PlainText")
  @js.native
  val PlainText: ComponentType[typingsJapgolly.wordpressBlockEditor.componentsPlainTextMod.PlainText.Props] = js.native
  
  @JSImport("@wordpress/block-editor/components", "PreserveScrollInReorder")
  @js.native
  val PreserveScrollInReorder: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsPreserveScrollInReorderMod.PreserveScrollInReorder.Props
  ] = js.native
  
  object RichText {
    
    inline def apply(
      props: typingsJapgolly.wordpressBlockEditor.componentsRichTextMod.RichText.Props[
          a | abbr | address | area | article | aside | audio | b | base | bdi | bdo | blockquote | body | br | button | canvas | caption | cite | code | col | colgroup | data | datalist | dd | del | details | dfn | dialog | div | dl | dt | em | embed | fieldset | figcaption | figure | footer | form | h1 | h2 | h3 | h4 | h5 | h6 | head | header | hgroup | hr | html | i | iframe | img | input | ins | kbd | label | legend | li | link | main | map | mark | menu | meta | meter | nav | noscript | `object` | ol | optgroup | option | output | p | picture | pre | progress | q | rp | rt | ruby | s | samp | script | section | select | slot | small | source | span | strong | style | sub | summary | sup | table | tbody | td | template | textarea | tfoot | th | thead | time | title | tr | track | u | ul | `var` | video | wbr
        ]
    ): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@wordpress/block-editor/components", "RichText")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Should be used in the `save` function of your block to correctly save rich text content.
      */
    inline def Content_a(props: ContentProps[a]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_abbr(props: ContentProps[abbr]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_address(props: ContentProps[address]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_area(props: ContentProps[area]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_article(props: ContentProps[article]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_aside(props: ContentProps[aside]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_audio(props: ContentProps[audio]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_b(props: ContentProps[b]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_base(props: ContentProps[base]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_bdi(props: ContentProps[bdi]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_bdo(props: ContentProps[bdo]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_blockquote(props: ContentProps[blockquote]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_body(props: ContentProps[body]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_br(props: ContentProps[br]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_button(props: ContentProps[button]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_canvas(props: ContentProps[canvas]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_caption(props: ContentProps[caption]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_cite(props: ContentProps[cite]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_code(props: ContentProps[code]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_col(props: ContentProps[col]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_colgroup(props: ContentProps[colgroup]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_data(props: ContentProps[data]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_datalist(props: ContentProps[datalist]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_dd(props: ContentProps[dd]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_del(props: ContentProps[del]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_details(props: ContentProps[details]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_dfn(props: ContentProps[dfn]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_dialog(props: ContentProps[dialog]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_div(props: ContentProps[div]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_dl(props: ContentProps[dl]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_dt(props: ContentProps[dt]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_em(props: ContentProps[em]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_embed(props: ContentProps[embed]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_fieldset(props: ContentProps[fieldset]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_figcaption(props: ContentProps[figcaption]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_figure(props: ContentProps[figure]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_footer(props: ContentProps[footer]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_form(props: ContentProps[form]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_h1(props: ContentProps[h1]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_h2(props: ContentProps[h2]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_h3(props: ContentProps[h3]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_h4(props: ContentProps[h4]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_h5(props: ContentProps[h5]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_h6(props: ContentProps[h6]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_head(props: ContentProps[head]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_header(props: ContentProps[header]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_hgroup(props: ContentProps[hgroup]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_hr(props: ContentProps[hr]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_html(props: ContentProps[html]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_i(props: ContentProps[i]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_iframe(props: ContentProps[iframe]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_img(props: ContentProps[img]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_input(props: ContentProps[input]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_ins(props: ContentProps[ins]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_kbd(props: ContentProps[kbd]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_label(props: ContentProps[label]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_legend(props: ContentProps[legend]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_li(props: ContentProps[li]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_link(props: ContentProps[link]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_main(props: ContentProps[main]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_map(props: ContentProps[map]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_mark(props: ContentProps[mark]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_menu(props: ContentProps[menu]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_meta(props: ContentProps[meta]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_meter(props: ContentProps[meter]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_nav(props: ContentProps[nav]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_noscript(props: ContentProps[noscript]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_object(props: ContentProps[`object`]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_ol(props: ContentProps[ol]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_optgroup(props: ContentProps[optgroup]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_option(props: ContentProps[option]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_output(props: ContentProps[output]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_p(props: ContentProps[p]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_picture(props: ContentProps[picture]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_pre(props: ContentProps[pre]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_progress(props: ContentProps[progress]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_q(props: ContentProps[q]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_rp(props: ContentProps[rp]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_rt(props: ContentProps[rt]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_ruby(props: ContentProps[ruby]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_s(props: ContentProps[s]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_samp(props: ContentProps[samp]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_script(props: ContentProps[script]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_section(props: ContentProps[section]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_select(props: ContentProps[select]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_slot(props: ContentProps[slot]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_small(props: ContentProps[small]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_source(props: ContentProps[source]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_span(props: ContentProps[span]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_strong(props: ContentProps[strong]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_style(props: ContentProps[style]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_sub(props: ContentProps[sub]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_summary(props: ContentProps[summary]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_sup(props: ContentProps[sup]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_table(props: ContentProps[table]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_tbody(props: ContentProps[tbody]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_td(props: ContentProps[td]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_template(props: ContentProps[template]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_textarea(props: ContentProps[textarea]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_tfoot(props: ContentProps[tfoot]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_th(props: ContentProps[th]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_thead(props: ContentProps[thead]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_time(props: ContentProps[time]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_title(props: ContentProps[title]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_tr(props: ContentProps[tr]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_track(props: ContentProps[track]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_u(props: ContentProps[u]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_ul(props: ContentProps[ul]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_var(props: ContentProps[`var`]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_video(props: ContentProps[video]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Content_wbr(props: ContentProps[wbr]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def isEmpty(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isEmpty(value: js.Array[String]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSImport("@wordpress/block-editor/components", "RichTextShortcut")
  @js.native
  val RichTextShortcut: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsRichTextMod.RichTextShortcut.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor/components", "RichTextToolbarButton")
  @js.native
  val RichTextToolbarButton: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsRichTextMod.RichTextToolbarButton.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor/components", "SkipToSelectedBlock")
  @js.native
  val SkipToSelectedBlock: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsSkipToSelectedBlockMod.SkipToSelectedBlock.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor/components", "URLInput")
  @js.native
  val URLInput: ComponentType[typingsJapgolly.wordpressBlockEditor.componentsUrlInputMod.URLInput.Props] = js.native
  
  @JSImport("@wordpress/block-editor/components", "URLInputButton")
  @js.native
  val URLInputButton: ComponentType[
    typingsJapgolly.wordpressBlockEditor.componentsUrlInputButtonMod.URLInputButton.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor/components", "URLPopover")
  @js.native
  val URLPopover: ComponentType[typingsJapgolly.wordpressBlockEditor.componentsUrlPopoverMod.URLPopover.Props] = js.native
  
  @JSImport("@wordpress/block-editor/components", "Warning")
  @js.native
  val Warning: ComponentType[typingsJapgolly.wordpressBlockEditor.componentsWarningMod.Warning.Props] = js.native
  
  @JSImport("@wordpress/block-editor/components", "WritingFlow")
  @js.native
  val WritingFlow: ComponentType[typingsJapgolly.wordpressBlockEditor.componentsWritingFlowMod.WritingFlow.Props] = js.native
  
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
  
  inline def getFontSizeClass(fontSizeSlug: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFontSizeClass")(fontSizeSlug.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@wordpress/block-editor/components", "useBlockProps")
  @js.native
  val useBlockProps: UseBlockProps_ = js.native
  
  // prettier-ignore
  inline def withColorContext[ProvidedProps /* <: PartialProps */, OwnProps /* <: Any */](component: ComponentClassP[ProvidedProps & OwnProps & js.Object]): /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentClass<ProvidedProps & OwnProps, react.react.ComponentState> extends react.react.ComponentType<infer U> ? react.react.ComponentType<std.Omit<U, 'colors' | 'disableCustomColors' | 'hasColorsToChoose'> & std.Omit<ProvidedProps, 'hasColorsToChoose'>> : never */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("withColorContext")(component.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentClass<ProvidedProps & OwnProps, react.react.ComponentState> extends react.react.ComponentType<infer U> ? react.react.ComponentType<std.Omit<U, 'colors' | 'disableCustomColors' | 'hasColorsToChoose'> & std.Omit<ProvidedProps, 'hasColorsToChoose'>> : never */ js.Any]
  inline def withColorContext[ProvidedProps /* <: PartialProps */, OwnProps /* <: Any */](component: FunctionComponent[ProvidedProps & OwnProps]): /* import warning: importer.ImportType#apply Failed type conversion: react.react.FunctionComponent<ProvidedProps & OwnProps> extends react.react.ComponentType<infer U> ? react.react.ComponentType<std.Omit<U, 'colors' | 'disableCustomColors' | 'hasColorsToChoose'> & std.Omit<ProvidedProps, 'hasColorsToChoose'>> : never */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("withColorContext")(component.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: react.react.FunctionComponent<ProvidedProps & OwnProps> extends react.react.ComponentType<infer U> ? react.react.ComponentType<std.Omit<U, 'colors' | 'disableCustomColors' | 'hasColorsToChoose'> & std.Omit<ProvidedProps, 'hasColorsToChoose'>> : never */ js.Any]
  
  inline def withColors(colorTypes: (String | (Record[String, String]))*): js.Function1[/* component */ ComponentType[Any], ComponentType[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withColors")(colorTypes.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Function1[/* component */ ComponentType[Any], ComponentType[Any]]]
  
  inline def withFontSizes(attributeNames: String*): js.Function1[/* component */ ComponentType[Any], ComponentType[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withFontSizes")(attributeNames.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Function1[/* component */ ComponentType[Any], ComponentType[Any]]]
}
