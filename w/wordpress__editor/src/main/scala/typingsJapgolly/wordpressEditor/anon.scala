package typingsJapgolly.wordpressEditor

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.IterableIterator
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Record
import typingsJapgolly.wordpressBlockEditor.anon.AjaxUrl
import typingsJapgolly.wordpressBlockEditor.anon.Children
import typingsJapgolly.wordpressBlockEditor.anon.Description
import typingsJapgolly.wordpressBlockEditor.anon.Index
import typingsJapgolly.wordpressBlockEditor.anon.IsLocked
import typingsJapgolly.wordpressBlockEditor.anon.OmitPropsname
import typingsJapgolly.wordpressBlockEditor.anon.PartialBlockInstancekstri
import typingsJapgolly.wordpressBlockEditor.componentsBlockControlsMod.BlockControls.Props
import typingsJapgolly.wordpressBlockEditor.componentsRichTextMod.RichText.ContentProps
import typingsJapgolly.wordpressBlockEditor.mod.EditorBlockListSettings
import typingsJapgolly.wordpressBlockEditor.mod.EditorBlockMode
import typingsJapgolly.wordpressBlockEditor.mod.EditorColor
import typingsJapgolly.wordpressBlockEditor.mod.EditorFontSize
import typingsJapgolly.wordpressBlockEditor.mod.EditorImageSize
import typingsJapgolly.wordpressBlockEditor.mod.EditorInserterItem
import typingsJapgolly.wordpressBlockEditor.mod.EditorSettings
import typingsJapgolly.wordpressBlockEditor.mod.EditorStyle
import typingsJapgolly.wordpressBlocks.apiTemplatesMod.TemplateArray
import typingsJapgolly.wordpressBlocks.mod.BlockInstance
import typingsJapgolly.wordpressCoreData.mod.Autosave
import typingsJapgolly.wordpressCoreData.schemaMod.Schema.Decontextualize
import typingsJapgolly.wordpressCoreData.schemaMod.Schema.PostOrPage
import typingsJapgolly.wordpressCoreData.schemaMod.Schema.User
import typingsJapgolly.wordpressEditor.wordpressEditorInts.`-1`
import typingsJapgolly.wordpressEditor.wordpressEditorInts.`1`
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.`object`
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.`private`
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.`var`
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.a
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.abbr
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.address
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.area
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.article
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.aside
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.audio
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.b
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.base
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.bdi
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.bdo
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.blockquote
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.body
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.br
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.button
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.canvas
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.caption
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.cite
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.code
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.col
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.colgroup
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.data
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.datalist
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.dd
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.del
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.details
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.dfn
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.dialog
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.div
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.dl
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.dt
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.edit
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.em
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.embed
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.fieldset
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.figcaption
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.figure
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.footer
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.form
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.h1
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.h2
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.h3
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.h4
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.h5
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.h6
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.head
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.header
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.hgroup
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.hr
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.html
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.i
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.iframe
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.img
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.input
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.ins
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.kbd
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.label
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.legend
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.li
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.link
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.main
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.map
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.mark
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.menu
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.meta
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.meter
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.nav
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.noscript
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.ol
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.optgroup
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.option
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.output
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.p
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.password
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.picture
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.pre
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.preview_link
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.progress
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.public
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.q
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.rp
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.rt
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.ruby
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.s
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.samp
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.script
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.section
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.select
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.slot
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.small
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.source
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.span
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.strong
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.style
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.sub
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.summary
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.sup
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.table
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.tbody
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.td
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.template
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.textarea
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.tfoot
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.th
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.thead
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.time
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.title
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.tr
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.track
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.u
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.ul
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.video
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.view
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.wbr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@wordpress/block-editor.@wordpress/block-editor.EditorSettings> */
  trait PartialEditorSettings extends StObject {
    
    var alignWide: js.UndefOr[Boolean] = js.undefined
    
    var allowedBlockTypes: js.UndefOr[js.Array[String] | Boolean] = js.undefined
    
    var allowedMimeTypes: js.UndefOr[(Record[String, String]) | Null] = js.undefined
    
    var autosaveInterval: js.UndefOr[Double] = js.undefined
    
    var availableLegacyWidgets: js.UndefOr[js.Array[Description]] = js.undefined
    
    var availableTemplates: js.UndefOr[js.Array[Any]] = js.undefined
    
    var bodyPlaceholder: js.UndefOr[String] = js.undefined
    
    var codeEditingEnabled: js.UndefOr[Boolean] = js.undefined
    
    var colors: js.UndefOr[js.Array[EditorColor]] = js.undefined
    
    var disableCustomColors: js.UndefOr[Boolean] = js.undefined
    
    var disableCustomEditorFontSizes: js.UndefOr[Boolean] = js.undefined
    
    var disablePostFormats: js.UndefOr[Boolean] = js.undefined
    
    var enableCustomFields: js.UndefOr[Boolean] = js.undefined
    
    var focusMode: js.UndefOr[Boolean] = js.undefined
    
    var fontSizes: js.UndefOr[js.Array[EditorFontSize]] = js.undefined
    
    var hasFixedToolbar: js.UndefOr[Boolean] = js.undefined
    
    var hasPermissionsToManageWidgets: js.UndefOr[Boolean] = js.undefined
    
    var imageSizes: js.UndefOr[js.Array[EditorImageSize]] = js.undefined
    
    var isRTL: js.UndefOr[Boolean] = js.undefined
    
    var maxUploadFileSize: js.UndefOr[Double] = js.undefined
    
    var maxWidth: js.UndefOr[Double] = js.undefined
    
    var postLock: js.UndefOr[IsLocked] = js.undefined
    
    var postLockUtils: js.UndefOr[AjaxUrl] = js.undefined
    
    var richEditingEnabled: js.UndefOr[Boolean] = js.undefined
    
    var styles: js.UndefOr[js.Array[EditorStyle]] = js.undefined
    
    var titlePlaceholder: js.UndefOr[String] = js.undefined
  }
  object PartialEditorSettings {
    
    inline def apply(): PartialEditorSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialEditorSettings]
    }
    
    extension [Self <: PartialEditorSettings](x: Self) {
      
      inline def setAlignWide(value: Boolean): Self = StObject.set(x, "alignWide", value.asInstanceOf[js.Any])
      
      inline def setAlignWideUndefined: Self = StObject.set(x, "alignWide", js.undefined)
      
      inline def setAllowedBlockTypes(value: js.Array[String] | Boolean): Self = StObject.set(x, "allowedBlockTypes", value.asInstanceOf[js.Any])
      
      inline def setAllowedBlockTypesUndefined: Self = StObject.set(x, "allowedBlockTypes", js.undefined)
      
      inline def setAllowedBlockTypesVarargs(value: String*): Self = StObject.set(x, "allowedBlockTypes", js.Array(value*))
      
      inline def setAllowedMimeTypes(value: Record[String, String]): Self = StObject.set(x, "allowedMimeTypes", value.asInstanceOf[js.Any])
      
      inline def setAllowedMimeTypesNull: Self = StObject.set(x, "allowedMimeTypes", null)
      
      inline def setAllowedMimeTypesUndefined: Self = StObject.set(x, "allowedMimeTypes", js.undefined)
      
      inline def setAutosaveInterval(value: Double): Self = StObject.set(x, "autosaveInterval", value.asInstanceOf[js.Any])
      
      inline def setAutosaveIntervalUndefined: Self = StObject.set(x, "autosaveInterval", js.undefined)
      
      inline def setAvailableLegacyWidgets(value: js.Array[Description]): Self = StObject.set(x, "availableLegacyWidgets", value.asInstanceOf[js.Any])
      
      inline def setAvailableLegacyWidgetsUndefined: Self = StObject.set(x, "availableLegacyWidgets", js.undefined)
      
      inline def setAvailableLegacyWidgetsVarargs(value: Description*): Self = StObject.set(x, "availableLegacyWidgets", js.Array(value*))
      
      inline def setAvailableTemplates(value: js.Array[Any]): Self = StObject.set(x, "availableTemplates", value.asInstanceOf[js.Any])
      
      inline def setAvailableTemplatesUndefined: Self = StObject.set(x, "availableTemplates", js.undefined)
      
      inline def setAvailableTemplatesVarargs(value: Any*): Self = StObject.set(x, "availableTemplates", js.Array(value*))
      
      inline def setBodyPlaceholder(value: String): Self = StObject.set(x, "bodyPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setBodyPlaceholderUndefined: Self = StObject.set(x, "bodyPlaceholder", js.undefined)
      
      inline def setCodeEditingEnabled(value: Boolean): Self = StObject.set(x, "codeEditingEnabled", value.asInstanceOf[js.Any])
      
      inline def setCodeEditingEnabledUndefined: Self = StObject.set(x, "codeEditingEnabled", js.undefined)
      
      inline def setColors(value: js.Array[EditorColor]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setColorsVarargs(value: EditorColor*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setDisableCustomColors(value: Boolean): Self = StObject.set(x, "disableCustomColors", value.asInstanceOf[js.Any])
      
      inline def setDisableCustomColorsUndefined: Self = StObject.set(x, "disableCustomColors", js.undefined)
      
      inline def setDisableCustomEditorFontSizes(value: Boolean): Self = StObject.set(x, "disableCustomEditorFontSizes", value.asInstanceOf[js.Any])
      
      inline def setDisableCustomEditorFontSizesUndefined: Self = StObject.set(x, "disableCustomEditorFontSizes", js.undefined)
      
      inline def setDisablePostFormats(value: Boolean): Self = StObject.set(x, "disablePostFormats", value.asInstanceOf[js.Any])
      
      inline def setDisablePostFormatsUndefined: Self = StObject.set(x, "disablePostFormats", js.undefined)
      
      inline def setEnableCustomFields(value: Boolean): Self = StObject.set(x, "enableCustomFields", value.asInstanceOf[js.Any])
      
      inline def setEnableCustomFieldsUndefined: Self = StObject.set(x, "enableCustomFields", js.undefined)
      
      inline def setFocusMode(value: Boolean): Self = StObject.set(x, "focusMode", value.asInstanceOf[js.Any])
      
      inline def setFocusModeUndefined: Self = StObject.set(x, "focusMode", js.undefined)
      
      inline def setFontSizes(value: js.Array[EditorFontSize]): Self = StObject.set(x, "fontSizes", value.asInstanceOf[js.Any])
      
      inline def setFontSizesUndefined: Self = StObject.set(x, "fontSizes", js.undefined)
      
      inline def setFontSizesVarargs(value: EditorFontSize*): Self = StObject.set(x, "fontSizes", js.Array(value*))
      
      inline def setHasFixedToolbar(value: Boolean): Self = StObject.set(x, "hasFixedToolbar", value.asInstanceOf[js.Any])
      
      inline def setHasFixedToolbarUndefined: Self = StObject.set(x, "hasFixedToolbar", js.undefined)
      
      inline def setHasPermissionsToManageWidgets(value: Boolean): Self = StObject.set(x, "hasPermissionsToManageWidgets", value.asInstanceOf[js.Any])
      
      inline def setHasPermissionsToManageWidgetsUndefined: Self = StObject.set(x, "hasPermissionsToManageWidgets", js.undefined)
      
      inline def setImageSizes(value: js.Array[EditorImageSize]): Self = StObject.set(x, "imageSizes", value.asInstanceOf[js.Any])
      
      inline def setImageSizesUndefined: Self = StObject.set(x, "imageSizes", js.undefined)
      
      inline def setImageSizesVarargs(value: EditorImageSize*): Self = StObject.set(x, "imageSizes", js.Array(value*))
      
      inline def setIsRTL(value: Boolean): Self = StObject.set(x, "isRTL", value.asInstanceOf[js.Any])
      
      inline def setIsRTLUndefined: Self = StObject.set(x, "isRTL", js.undefined)
      
      inline def setMaxUploadFileSize(value: Double): Self = StObject.set(x, "maxUploadFileSize", value.asInstanceOf[js.Any])
      
      inline def setMaxUploadFileSizeUndefined: Self = StObject.set(x, "maxUploadFileSize", js.undefined)
      
      inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setPostLock(value: IsLocked): Self = StObject.set(x, "postLock", value.asInstanceOf[js.Any])
      
      inline def setPostLockUndefined: Self = StObject.set(x, "postLock", js.undefined)
      
      inline def setPostLockUtils(value: AjaxUrl): Self = StObject.set(x, "postLockUtils", value.asInstanceOf[js.Any])
      
      inline def setPostLockUtilsUndefined: Self = StObject.set(x, "postLockUtils", js.undefined)
      
      inline def setRichEditingEnabled(value: Boolean): Self = StObject.set(x, "richEditingEnabled", value.asInstanceOf[js.Any])
      
      inline def setRichEditingEnabledUndefined: Self = StObject.set(x, "richEditingEnabled", js.undefined)
      
      inline def setStyles(value: js.Array[EditorStyle]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setStylesVarargs(value: EditorStyle*): Self = StObject.set(x, "styles", js.Array(value*))
      
      inline def setTitlePlaceholder(value: String): Self = StObject.set(x, "titlePlaceholder", value.asInstanceOf[js.Any])
      
      inline def setTitlePlaceholderUndefined: Self = StObject.set(x, "titlePlaceholder", js.undefined)
    }
  }
  
  trait PostName extends StObject {
    
    var postName: String
    
    var prefix: String
    
    var suffix: js.UndefOr[String] = js.undefined
  }
  object PostName {
    
    inline def apply(postName: String, prefix: String): PostName = {
      val __obj = js.Dynamic.literal(postName = postName.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostName]
    }
    
    extension [Self <: PostName](x: Self) {
      
      inline def setPostName(value: String): Self = StObject.set(x, "postName", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    }
  }
  
  @js.native
  trait Typeof extends StObject {
    
    def apply(props: Props): Element = js.native
    
    var Slot: FC[OmitPropsname] = js.native
  }
  
  @js.native
  trait TypeofApply extends StObject {
    
    def apply(
      props: typingsJapgolly.wordpressBlockEditor.componentsBlockFormatControlsMod.BlockFormatControls.Props
    ): Element = js.native
    
    var Slot: FC[OmitPropsname] = js.native
  }
  
  @js.native
  trait TypeofApplySlot extends StObject {
    
    def apply(props: typingsJapgolly.wordpressBlockEditor.componentsInspectorControlsMod.InspectorControls.Props): Element = js.native
    
    var Slot: FC[OmitPropsname] = js.native
  }
  
  @js.native
  trait TypeofButtonBlockAppender extends StObject {
    
    def apply(props: typingsJapgolly.wordpressBlockEditor.componentsInnerBlocksMod.InnerBlocks.Props): Element = js.native
    
    /**
      * display a `+` (plus) icon button that, when clicked, displays the block picker menu. No
      * default Block is inserted.
      */
    var ButtonBlockAppender: ComponentType[Children] = js.native
    
    var Content: ComponentType[Children] = js.native
    
    /**
      * display the default block appender as set by `wp.blocks.setDefaultBlockName`. Typically this
      * is the `paragraph` block.
      */
    var DefaultBlockAppender: ComponentType[Children] = js.native
  }
  
  @js.native
  trait TypeofContent extends StObject {
    
    def apply(
      props: typingsJapgolly.wordpressBlockEditor.componentsRichTextMod.RichText.Props[
          a | abbr | address | area | article | aside | audio | b | base | bdi | bdo | blockquote | body | br | button | canvas | caption | cite | code | col | colgroup | data | datalist | dd | del | details | dfn | dialog | div | dl | dt | em | embed | fieldset | figcaption | figure | footer | form | h1 | h2 | h3 | h4 | h5 | h6 | head | header | hgroup | hr | html | i | iframe | img | input | ins | kbd | label | legend | li | link | main | map | mark | menu | meta | meter | nav | noscript | `object` | ol | optgroup | option | output | p | picture | pre | progress | q | rp | rt | ruby | s | samp | script | section | select | slot | small | source | span | strong | style | sub | summary | sup | table | tbody | td | template | textarea | tfoot | th | thead | time | title | tr | track | u | ul | `var` | video | wbr
        ]
    ): Element = js.native
    
    /**
      * Should be used in the `save` function of your block to correctly save rich text content.
      */
    @JSName("Content")
    def Content_a(props: ContentProps[a]): Element = js.native
    @JSName("Content")
    def Content_abbr(props: ContentProps[abbr]): Element = js.native
    @JSName("Content")
    def Content_address(props: ContentProps[address]): Element = js.native
    @JSName("Content")
    def Content_area(props: ContentProps[area]): Element = js.native
    @JSName("Content")
    def Content_article(props: ContentProps[article]): Element = js.native
    @JSName("Content")
    def Content_aside(props: ContentProps[aside]): Element = js.native
    @JSName("Content")
    def Content_audio(props: ContentProps[audio]): Element = js.native
    @JSName("Content")
    def Content_b(props: ContentProps[b]): Element = js.native
    @JSName("Content")
    def Content_base(props: ContentProps[base]): Element = js.native
    @JSName("Content")
    def Content_bdi(props: ContentProps[bdi]): Element = js.native
    @JSName("Content")
    def Content_bdo(props: ContentProps[bdo]): Element = js.native
    @JSName("Content")
    def Content_blockquote(props: ContentProps[blockquote]): Element = js.native
    @JSName("Content")
    def Content_body(props: ContentProps[body]): Element = js.native
    @JSName("Content")
    def Content_br(props: ContentProps[br]): Element = js.native
    @JSName("Content")
    def Content_button(props: ContentProps[button]): Element = js.native
    @JSName("Content")
    def Content_canvas(props: ContentProps[canvas]): Element = js.native
    @JSName("Content")
    def Content_caption(props: ContentProps[caption]): Element = js.native
    @JSName("Content")
    def Content_cite(props: ContentProps[cite]): Element = js.native
    @JSName("Content")
    def Content_code(props: ContentProps[code]): Element = js.native
    @JSName("Content")
    def Content_col(props: ContentProps[col]): Element = js.native
    @JSName("Content")
    def Content_colgroup(props: ContentProps[colgroup]): Element = js.native
    @JSName("Content")
    def Content_data(props: ContentProps[data]): Element = js.native
    @JSName("Content")
    def Content_datalist(props: ContentProps[datalist]): Element = js.native
    @JSName("Content")
    def Content_dd(props: ContentProps[dd]): Element = js.native
    @JSName("Content")
    def Content_del(props: ContentProps[del]): Element = js.native
    @JSName("Content")
    def Content_details(props: ContentProps[details]): Element = js.native
    @JSName("Content")
    def Content_dfn(props: ContentProps[dfn]): Element = js.native
    @JSName("Content")
    def Content_dialog(props: ContentProps[dialog]): Element = js.native
    @JSName("Content")
    def Content_div(props: ContentProps[div]): Element = js.native
    @JSName("Content")
    def Content_dl(props: ContentProps[dl]): Element = js.native
    @JSName("Content")
    def Content_dt(props: ContentProps[dt]): Element = js.native
    @JSName("Content")
    def Content_em(props: ContentProps[em]): Element = js.native
    @JSName("Content")
    def Content_embed(props: ContentProps[embed]): Element = js.native
    @JSName("Content")
    def Content_fieldset(props: ContentProps[fieldset]): Element = js.native
    @JSName("Content")
    def Content_figcaption(props: ContentProps[figcaption]): Element = js.native
    @JSName("Content")
    def Content_figure(props: ContentProps[figure]): Element = js.native
    @JSName("Content")
    def Content_footer(props: ContentProps[footer]): Element = js.native
    @JSName("Content")
    def Content_form(props: ContentProps[form]): Element = js.native
    @JSName("Content")
    def Content_h1(props: ContentProps[h1]): Element = js.native
    @JSName("Content")
    def Content_h2(props: ContentProps[h2]): Element = js.native
    @JSName("Content")
    def Content_h3(props: ContentProps[h3]): Element = js.native
    @JSName("Content")
    def Content_h4(props: ContentProps[h4]): Element = js.native
    @JSName("Content")
    def Content_h5(props: ContentProps[h5]): Element = js.native
    @JSName("Content")
    def Content_h6(props: ContentProps[h6]): Element = js.native
    @JSName("Content")
    def Content_head(props: ContentProps[head]): Element = js.native
    @JSName("Content")
    def Content_header(props: ContentProps[header]): Element = js.native
    @JSName("Content")
    def Content_hgroup(props: ContentProps[hgroup]): Element = js.native
    @JSName("Content")
    def Content_hr(props: ContentProps[hr]): Element = js.native
    @JSName("Content")
    def Content_html(props: ContentProps[html]): Element = js.native
    @JSName("Content")
    def Content_i(props: ContentProps[i]): Element = js.native
    @JSName("Content")
    def Content_iframe(props: ContentProps[iframe]): Element = js.native
    @JSName("Content")
    def Content_img(props: ContentProps[img]): Element = js.native
    @JSName("Content")
    def Content_input(props: ContentProps[input]): Element = js.native
    @JSName("Content")
    def Content_ins(props: ContentProps[ins]): Element = js.native
    @JSName("Content")
    def Content_kbd(props: ContentProps[kbd]): Element = js.native
    @JSName("Content")
    def Content_label(props: ContentProps[label]): Element = js.native
    @JSName("Content")
    def Content_legend(props: ContentProps[legend]): Element = js.native
    @JSName("Content")
    def Content_li(props: ContentProps[li]): Element = js.native
    @JSName("Content")
    def Content_link(props: ContentProps[link]): Element = js.native
    @JSName("Content")
    def Content_main(props: ContentProps[main]): Element = js.native
    @JSName("Content")
    def Content_map(props: ContentProps[map]): Element = js.native
    @JSName("Content")
    def Content_mark(props: ContentProps[mark]): Element = js.native
    @JSName("Content")
    def Content_menu(props: ContentProps[menu]): Element = js.native
    @JSName("Content")
    def Content_meta(props: ContentProps[meta]): Element = js.native
    @JSName("Content")
    def Content_meter(props: ContentProps[meter]): Element = js.native
    @JSName("Content")
    def Content_nav(props: ContentProps[nav]): Element = js.native
    @JSName("Content")
    def Content_noscript(props: ContentProps[noscript]): Element = js.native
    @JSName("Content")
    def Content_object(props: ContentProps[`object`]): Element = js.native
    @JSName("Content")
    def Content_ol(props: ContentProps[ol]): Element = js.native
    @JSName("Content")
    def Content_optgroup(props: ContentProps[optgroup]): Element = js.native
    @JSName("Content")
    def Content_option(props: ContentProps[option]): Element = js.native
    @JSName("Content")
    def Content_output(props: ContentProps[output]): Element = js.native
    @JSName("Content")
    def Content_p(props: ContentProps[p]): Element = js.native
    @JSName("Content")
    def Content_picture(props: ContentProps[picture]): Element = js.native
    @JSName("Content")
    def Content_pre(props: ContentProps[pre]): Element = js.native
    @JSName("Content")
    def Content_progress(props: ContentProps[progress]): Element = js.native
    @JSName("Content")
    def Content_q(props: ContentProps[q]): Element = js.native
    @JSName("Content")
    def Content_rp(props: ContentProps[rp]): Element = js.native
    @JSName("Content")
    def Content_rt(props: ContentProps[rt]): Element = js.native
    @JSName("Content")
    def Content_ruby(props: ContentProps[ruby]): Element = js.native
    @JSName("Content")
    def Content_s(props: ContentProps[s]): Element = js.native
    @JSName("Content")
    def Content_samp(props: ContentProps[samp]): Element = js.native
    @JSName("Content")
    def Content_script(props: ContentProps[script]): Element = js.native
    @JSName("Content")
    def Content_section(props: ContentProps[section]): Element = js.native
    @JSName("Content")
    def Content_select(props: ContentProps[select]): Element = js.native
    @JSName("Content")
    def Content_slot(props: ContentProps[slot]): Element = js.native
    @JSName("Content")
    def Content_small(props: ContentProps[small]): Element = js.native
    @JSName("Content")
    def Content_source(props: ContentProps[source]): Element = js.native
    @JSName("Content")
    def Content_span(props: ContentProps[span]): Element = js.native
    @JSName("Content")
    def Content_strong(props: ContentProps[strong]): Element = js.native
    @JSName("Content")
    def Content_style(props: ContentProps[style]): Element = js.native
    @JSName("Content")
    def Content_sub(props: ContentProps[sub]): Element = js.native
    @JSName("Content")
    def Content_summary(props: ContentProps[summary]): Element = js.native
    @JSName("Content")
    def Content_sup(props: ContentProps[sup]): Element = js.native
    @JSName("Content")
    def Content_table(props: ContentProps[table]): Element = js.native
    @JSName("Content")
    def Content_tbody(props: ContentProps[tbody]): Element = js.native
    @JSName("Content")
    def Content_td(props: ContentProps[td]): Element = js.native
    @JSName("Content")
    def Content_template(props: ContentProps[template]): Element = js.native
    @JSName("Content")
    def Content_textarea(props: ContentProps[textarea]): Element = js.native
    @JSName("Content")
    def Content_tfoot(props: ContentProps[tfoot]): Element = js.native
    @JSName("Content")
    def Content_th(props: ContentProps[th]): Element = js.native
    @JSName("Content")
    def Content_thead(props: ContentProps[thead]): Element = js.native
    @JSName("Content")
    def Content_time(props: ContentProps[time]): Element = js.native
    @JSName("Content")
    def Content_title(props: ContentProps[title]): Element = js.native
    @JSName("Content")
    def Content_tr(props: ContentProps[tr]): Element = js.native
    @JSName("Content")
    def Content_track(props: ContentProps[track]): Element = js.native
    @JSName("Content")
    def Content_u(props: ContentProps[u]): Element = js.native
    @JSName("Content")
    def Content_ul(props: ContentProps[ul]): Element = js.native
    @JSName("Content")
    def Content_var(props: ContentProps[`var`]): Element = js.native
    @JSName("Content")
    def Content_video(props: ContentProps[video]): Element = js.native
    @JSName("Content")
    def Content_wbr(props: ContentProps[wbr]): Element = js.native
    
    def isEmpty(value: String): Boolean = js.native
    def isEmpty(value: js.Array[String]): Boolean = js.native
  }
  
  @js.native
  trait TypeofSlot extends StObject {
    
    def apply(
      props: typingsJapgolly.wordpressBlockEditor.componentsInspectorAdvancedControlsMod.InspectorAdvancedControls.Props
    ): Element = js.native
    
    var Slot: FC[OmitPropsname] = js.native
  }
  
  @js.native
  trait TypeofimportedActions extends StObject {
    
    def autosave(): IterableIterator[Unit] = js.native
    def autosave(options: Record[String, Boolean]): IterableIterator[Unit] = js.native
    
    def clearSelectedBlock(): Unit = js.native
    
    def createUndoLevel(): Unit = js.native
    
    def disablePublishSidebar(): Unit = js.native
    
    def editPost(edits: Record[String, Any]): Unit = js.native
    
    def enablePublishSidebar(): Unit = js.native
    
    def enterFormattedText(): Unit = js.native
    
    def exitFormattedText(): Unit = js.native
    
    def hideInsertionPoint(): Unit = js.native
    
    def insertBlock(block: BlockInstance[StringDictionary[Any]]): Unit = js.native
    def insertBlock(block: BlockInstance[StringDictionary[Any]], index: Double): Unit = js.native
    def insertBlock(block: BlockInstance[StringDictionary[Any]], index: Double, rootClientId: String): Unit = js.native
    def insertBlock(
      block: BlockInstance[StringDictionary[Any]],
      index: Double,
      rootClientId: String,
      updateSelection: Boolean
    ): Unit = js.native
    def insertBlock(
      block: BlockInstance[StringDictionary[Any]],
      index: Double,
      rootClientId: Unit,
      updateSelection: Boolean
    ): Unit = js.native
    def insertBlock(block: BlockInstance[StringDictionary[Any]], index: Unit, rootClientId: String): Unit = js.native
    def insertBlock(
      block: BlockInstance[StringDictionary[Any]],
      index: Unit,
      rootClientId: String,
      updateSelection: Boolean
    ): Unit = js.native
    def insertBlock(
      block: BlockInstance[StringDictionary[Any]],
      index: Unit,
      rootClientId: Unit,
      updateSelection: Boolean
    ): Unit = js.native
    
    def insertBlocks(blocks: js.Array[BlockInstance[StringDictionary[Any]]]): IterableIterator[Unit] = js.native
    def insertBlocks(blocks: js.Array[BlockInstance[StringDictionary[Any]]], index: Double): IterableIterator[Unit] = js.native
    def insertBlocks(blocks: js.Array[BlockInstance[StringDictionary[Any]]], index: Double, rootClientId: String): IterableIterator[Unit] = js.native
    def insertBlocks(
      blocks: js.Array[BlockInstance[StringDictionary[Any]]],
      index: Double,
      rootClientId: String,
      updateSelection: Boolean
    ): IterableIterator[Unit] = js.native
    def insertBlocks(
      blocks: js.Array[BlockInstance[StringDictionary[Any]]],
      index: Double,
      rootClientId: Unit,
      updateSelection: Boolean
    ): IterableIterator[Unit] = js.native
    def insertBlocks(blocks: js.Array[BlockInstance[StringDictionary[Any]]], index: Unit, rootClientId: String): IterableIterator[Unit] = js.native
    def insertBlocks(
      blocks: js.Array[BlockInstance[StringDictionary[Any]]],
      index: Unit,
      rootClientId: String,
      updateSelection: Boolean
    ): IterableIterator[Unit] = js.native
    def insertBlocks(
      blocks: js.Array[BlockInstance[StringDictionary[Any]]],
      index: Unit,
      rootClientId: Unit,
      updateSelection: Boolean
    ): IterableIterator[Unit] = js.native
    
    def insertDefaultBlock(): Unit = js.native
    def insertDefaultBlock(attributes: Unit, rootClientId: String): Unit = js.native
    def insertDefaultBlock(attributes: Unit, rootClientId: String, index: Double): Unit = js.native
    def insertDefaultBlock(attributes: Unit, rootClientId: Unit, index: Double): Unit = js.native
    def insertDefaultBlock(attributes: Record[String, Any]): Unit = js.native
    def insertDefaultBlock(attributes: Record[String, Any], rootClientId: String): Unit = js.native
    def insertDefaultBlock(attributes: Record[String, Any], rootClientId: String, index: Double): Unit = js.native
    def insertDefaultBlock(attributes: Record[String, Any], rootClientId: Unit, index: Double): Unit = js.native
    
    def lockPostSaving(lockName: String): Unit = js.native
    
    def mergeBlocks(firstBlockClientId: String, secondBlockClientId: String): Unit = js.native
    
    def moveBlockToPosition(clientId: String, fromRootClientId: String, toRootClientId: String, index: Double): IterableIterator[Unit] = js.native
    def moveBlockToPosition(clientId: String, fromRootClientId: String, toRootClientId: Unit, index: Double): IterableIterator[Unit] = js.native
    def moveBlockToPosition(clientId: String, fromRootClientId: Unit, toRootClientId: String, index: Double): IterableIterator[Unit] = js.native
    def moveBlockToPosition(clientId: String, fromRootClientId: Unit, toRootClientId: Unit, index: Double): IterableIterator[Unit] = js.native
    def moveBlockToPosition(clientId: Unit, fromRootClientId: String, toRootClientId: String, index: Double): IterableIterator[Unit] = js.native
    def moveBlockToPosition(clientId: Unit, fromRootClientId: String, toRootClientId: Unit, index: Double): IterableIterator[Unit] = js.native
    def moveBlockToPosition(clientId: Unit, fromRootClientId: Unit, toRootClientId: String, index: Double): IterableIterator[Unit] = js.native
    def moveBlockToPosition(clientId: Unit, fromRootClientId: Unit, toRootClientId: Unit, index: Double): IterableIterator[Unit] = js.native
    
    def moveBlocksDown(clientIds: String, rootClientId: String): Unit = js.native
    def moveBlocksDown(clientIds: js.Array[String], rootClientId: String): Unit = js.native
    
    def moveBlocksUp(clientIds: String, rootClientId: String): Unit = js.native
    def moveBlocksUp(clientIds: js.Array[String], rootClientId: String): Unit = js.native
    
    def multiSelect(start: String, end: String): Unit = js.native
    
    def receiveBlocks(blocks: js.Array[BlockInstance[StringDictionary[Any]]]): Unit = js.native
    
    def redo(): Unit = js.native
    
    def refreshPost(): IterableIterator[Unit] = js.native
    
    def removeBlock(clientId: String): Unit = js.native
    def removeBlock(clientId: String, selectPrevious: Boolean): Unit = js.native
    
    def removeBlocks(clientIds: String): IterableIterator[Unit] = js.native
    def removeBlocks(clientIds: String, selectPrevious: Boolean): IterableIterator[Unit] = js.native
    def removeBlocks(clientIds: js.Array[String]): IterableIterator[Unit] = js.native
    def removeBlocks(clientIds: js.Array[String], selectPrevious: Boolean): IterableIterator[Unit] = js.native
    
    def replaceBlock(clientId: String, block: js.Array[BlockInstance[StringDictionary[Any]]]): Unit = js.native
    def replaceBlock(clientId: String, block: BlockInstance[StringDictionary[Any]]): Unit = js.native
    def replaceBlock(clientId: js.Array[String], block: js.Array[BlockInstance[StringDictionary[Any]]]): Unit = js.native
    def replaceBlock(clientId: js.Array[String], block: BlockInstance[StringDictionary[Any]]): Unit = js.native
    
    def replaceBlocks(clientIds: String, blocks: js.Array[BlockInstance[StringDictionary[Any]]]): IterableIterator[Unit] = js.native
    def replaceBlocks(clientIds: String, blocks: js.Array[BlockInstance[StringDictionary[Any]]], indexToSelect: Double): IterableIterator[Unit] = js.native
    def replaceBlocks(clientIds: String, blocks: BlockInstance[StringDictionary[Any]]): IterableIterator[Unit] = js.native
    def replaceBlocks(clientIds: String, blocks: BlockInstance[StringDictionary[Any]], indexToSelect: Double): IterableIterator[Unit] = js.native
    def replaceBlocks(clientIds: js.Array[String], blocks: js.Array[BlockInstance[StringDictionary[Any]]]): IterableIterator[Unit] = js.native
    def replaceBlocks(
      clientIds: js.Array[String],
      blocks: js.Array[BlockInstance[StringDictionary[Any]]],
      indexToSelect: Double
    ): IterableIterator[Unit] = js.native
    def replaceBlocks(clientIds: js.Array[String], blocks: BlockInstance[StringDictionary[Any]]): IterableIterator[Unit] = js.native
    def replaceBlocks(clientIds: js.Array[String], blocks: BlockInstance[StringDictionary[Any]], indexToSelect: Double): IterableIterator[Unit] = js.native
    
    def resetAutosave(newAutosave: Autosave): IterableIterator[Unit] = js.native
    
    def resetBlocks(blocks: js.Array[BlockInstance[StringDictionary[Any]]]): Unit = js.native
    
    def resetEditorBlocks(blocks: js.Array[BlockInstance[StringDictionary[Any]]]): IterableIterator[Unit] = js.native
    def resetEditorBlocks(blocks: js.Array[BlockInstance[StringDictionary[Any]]], options: Record[String, Any]): IterableIterator[Unit] = js.native
    
    def resetPost(post: Record[String, Any]): Unit = js.native
    
    def savePost(): IterableIterator[Unit] = js.native
    def savePost(options: Record[String, Any]): IterableIterator[Unit] = js.native
    
    def selectBlock(clientId: String): Unit = js.native
    def selectBlock(clientId: String, initialPosition: Double): Unit = js.native
    
    def setTemplateValidity(isValid: Boolean): Unit = js.native
    
    def setupEditor(post: Record[String, Any]): IterableIterator[Unit] = js.native
    def setupEditor(post: Record[String, Any], edits: Unit, template: TemplateArray): IterableIterator[Unit] = js.native
    def setupEditor(post: Record[String, Any], edits: Record[String, Any]): IterableIterator[Unit] = js.native
    def setupEditor(post: Record[String, Any], edits: Record[String, Any], template: TemplateArray): IterableIterator[Unit] = js.native
    
    def setupEditorState(post: Record[String, Any]): Unit = js.native
    
    def showInsertionPoint(): Unit = js.native
    def showInsertionPoint(rootClientId: String): Unit = js.native
    def showInsertionPoint(rootClientId: String, index: Double): Unit = js.native
    def showInsertionPoint(rootClientId: Unit, index: Double): Unit = js.native
    
    def startMultiSelect(): Unit = js.native
    
    def startTyping(): Unit = js.native
    
    def stopMultiSelect(): Unit = js.native
    
    def stopTyping(): Unit = js.native
    
    def synchronizeTemplate(): Unit = js.native
    
    def toggleBlockMode(clientId: String): Unit = js.native
    
    def toggleSelection(): Unit = js.native
    def toggleSelection(isSelectionEnabled: Boolean): Unit = js.native
    
    def trashPost(): IterableIterator[Unit] = js.native
    
    def undo(): Unit = js.native
    
    def unlockPostSaving(lockName: String): Unit = js.native
    
    def updateBlock(clientId: String, updates: PartialBlockInstancekstri): Unit = js.native
    
    def updateBlockAttributes(clientId: String, attributes: Record[String, Any]): Unit = js.native
    
    def updateBlockListSettings(clientId: String, settings: EditorBlockListSettings): Unit = js.native
    
    def updateEditorSettings(settings: PartialEditorSettings): Unit = js.native
    
    def updatePost(edits: Record[String, Any]): Unit = js.native
    
    def updatePostLock(lock: IsLocked): Unit = js.native
  }
  
  @js.native
  trait TypeofimportedSelectors extends StObject {
    
    def canInsertBlockType(blockName: String): Boolean = js.native
    def canInsertBlockType(blockName: String, rootClientId: String): Boolean = js.native
    
    def canUserUseUnfilteredHTML(): Boolean = js.native
    
    def didPostSaveRequestFail(): Boolean = js.native
    
    def didPostSaveRequestSucceed(): Boolean = js.native
    
    def getActivePostLock(): js.UndefOr[String] = js.native
    
    def getAdjacentBlockClientId(): String | Null = js.native
    def getAdjacentBlockClientId(startClientId: String): String | Null = js.native
    def getAdjacentBlockClientId(startClientId: String, modifier: `1` | `-1`): String | Null = js.native
    def getAdjacentBlockClientId(startClientId: Unit, modifier: `1` | `-1`): String | Null = js.native
    
    def getAutosave(): Autosave | js.Object = js.native
    
    @JSName("getAutosaveAttribute")
    def getAutosaveAttribute_previewlink(attributeName: preview_link): String | js.Object = js.native
    
    def getBlock(clientId: String): BlockInstance[StringDictionary[Any]] | Null = js.native
    
    def getBlockAttributes(clientId: String): (Record[String, Any]) | Null = js.native
    
    def getBlockCount(): Double = js.native
    def getBlockCount(rootClientId: String): Double = js.native
    
    def getBlockHierarchyRootClientId(clientId: String): String = js.native
    
    def getBlockIndex(clientId: String): Double = js.native
    def getBlockIndex(clientId: String, rootClientId: String): Double = js.native
    
    def getBlockInsertionPoint(): Index = js.native
    
    def getBlockListSettings(): js.UndefOr[EditorBlockListSettings] = js.native
    def getBlockListSettings(clientId: String): js.UndefOr[EditorBlockListSettings] = js.native
    
    def getBlockMode(clientId: String): EditorBlockMode = js.native
    
    def getBlockName(clientId: String): String | Null = js.native
    
    def getBlockOrder(): js.Array[String] = js.native
    def getBlockOrder(rootClientId: String): js.Array[String] = js.native
    
    def getBlockRootClientId(clientId: String): String | Null = js.native
    
    def getBlockSelectionEnd(): js.UndefOr[String] = js.native
    
    def getBlockSelectionStart(): js.UndefOr[String] = js.native
    
    def getBlocks(): js.Array[BlockInstance[StringDictionary[Any]]] = js.native
    def getBlocks(rootClientId: String): js.Array[BlockInstance[StringDictionary[Any]]] = js.native
    
    def getBlocksByClientId(clientIds: String): js.Array[BlockInstance[StringDictionary[Any]] | Null] = js.native
    def getBlocksByClientId(clientIds: js.Array[String]): js.Array[BlockInstance[StringDictionary[Any]] | Null] = js.native
    
    def getBlocksForSerialization(): js.Array[BlockInstance[StringDictionary[Any]]] = js.native
    
    def getClientIdsOfDescendants(clientIds: js.Array[String]): js.Array[String] = js.native
    
    def getClientIdsWithDescendants(): js.Array[String] = js.native
    
    def getCurrentPost(): Decontextualize[PostOrPage[edit]] = js.native
    
    def getCurrentPostAttribute[T /* <: /* keyof @wordpress/core-data.@wordpress/core-data/schema.Schema.PostOrPage<'edit'> */ String */](attributeName: T): js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @wordpress/core-data.@wordpress/core-data/schema.Schema.Decontextualize<@wordpress/core-data.@wordpress/core-data/schema.Schema.PostOrPage<'edit'>>[T] */ js.Any
      ] = js.native
    
    def getCurrentPostId(): Double = js.native
    
    def getCurrentPostLastRevisionId(): Double | Null = js.native
    
    def getCurrentPostRevisionsCount(): Double = js.native
    
    def getCurrentPostType(): String = js.native
    
    def getEditedPostAttribute[T /* <: /* keyof @wordpress/core-data.@wordpress/core-data/schema.Schema.PostOrPage<'edit'> */ String */](attributeName: T): js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @wordpress/core-data.@wordpress/core-data/schema.Schema.Decontextualize<@wordpress/core-data.@wordpress/core-data/schema.Schema.PostOrPage<'edit'>>[T] */ js.Any
      ] = js.native
    
    def getEditedPostContent(): String = js.native
    
    def getEditedPostPreviewLink(): String | Null = js.native
    
    def getEditedPostVisibility(): password | `private` | public = js.native
    
    def getEditorBlocks(): js.Array[BlockInstance[StringDictionary[Any]]] = js.native
    
    def getEditorSettings(): EditorSettings = js.native
    
    def getFirstMultiSelectedBlockClientId(): String | Null = js.native
    
    def getGlobalBlockCount(): Double = js.native
    def getGlobalBlockCount(blockName: String): Double = js.native
    
    def getInserterItems(): js.Array[EditorInserterItem] = js.native
    def getInserterItems(rootClientId: String): js.Array[EditorInserterItem] = js.native
    
    def getLastMultiSelectedBlockClientId(): String | Null = js.native
    
    def getMultiSelectedBlockClientIds(): js.Array[String] = js.native
    
    def getMultiSelectedBlocks(): js.Array[BlockInstance[StringDictionary[Any]]] = js.native
    
    def getMultiSelectedBlocksEndClientId(): String | Null = js.native
    
    def getMultiSelectedBlocksStartClientId(): String | Null = js.native
    
    def getNextBlockClientId(): String | Null = js.native
    def getNextBlockClientId(startClientId: String): String | Null = js.native
    
    def getPermalink(): String | Null = js.native
    
    def getPermalinkParts(): PostName | Null = js.native
    
    def getPostEdits(): Partial[Decontextualize[PostOrPage[edit]]] = js.native
    
    def getPostLockUser(): js.UndefOr[User[view] | Null] = js.native
    
    def getPreviousBlockClientId(): String | Null = js.native
    def getPreviousBlockClientId(startClientId: String): String | Null = js.native
    
    def getReferenceByDistinctEdits(): js.Array[Any] = js.native
    
    def getSelectedBlock(): BlockInstance[StringDictionary[Any]] | Null = js.native
    
    def getSelectedBlockClientId(): String | Null = js.native
    
    def getSelectedBlockCount(): Double = js.native
    
    def getSelectedBlocksInitialCaretPosition(): Double | Null = js.native
    
    def getStateBeforeOptimisticTransaction(transactionId: js.Object): Any = js.native
    
    def getSuggestedPostFormat(): String | Null = js.native
    
    def getTemplate(): Any = js.native
    
    def getTemplateLock(): js.UndefOr[String] = js.native
    def getTemplateLock(rootClientId: String): js.UndefOr[String] = js.native
    
    def hasAutosave(): Boolean = js.native
    
    def hasChangedContent(): Boolean = js.native
    
    def hasEditorRedo(): Boolean = js.native
    
    def hasEditorUndo(): Boolean = js.native
    
    def hasInserterItems(): Boolean = js.native
    def hasInserterItems(rootClientId: String): Boolean = js.native
    
    def hasMultiSelection(): Boolean = js.native
    
    def hasSelectedBlock(): Boolean = js.native
    
    def hasSelectedInnerBlock(clientId: String): Boolean = js.native
    def hasSelectedInnerBlock(clientId: String, deep: Boolean): Boolean = js.native
    
    def inSomeHistory(predicate: js.Function1[/* state */ Record[String, Any], Boolean]): Boolean = js.native
    
    def isAncestorMultiSelected(clientId: String): Boolean = js.native
    
    def isAutosavingPost(): Boolean = js.native
    
    def isBlockInsertionPointVisible(): Boolean = js.native
    
    def isBlockMultiSelected(clientId: String): Boolean = js.native
    
    def isBlockSelected(clientId: String): Boolean = js.native
    
    def isBlockValid(clientId: String): Boolean = js.native
    
    def isBlockWithinSelection(clientId: String): Boolean = js.native
    
    def isCaretWithinFormattedText(): Boolean = js.native
    
    def isCleanNewPost(): Boolean = js.native
    
    def isCurrentPostPending(): Boolean = js.native
    
    def isCurrentPostPublished(): Boolean = js.native
    
    def isCurrentPostScheduled(): Boolean = js.native
    
    def isEditedPostAutosaveable(): Boolean = js.native
    
    def isEditedPostBeingScheduled(): Boolean = js.native
    
    def isEditedPostDateFloating(): Boolean = js.native
    
    def isEditedPostDirty(): Boolean = js.native
    
    def isEditedPostEmpty(): Boolean = js.native
    
    def isEditedPostNew(): Boolean = js.native
    
    def isEditedPostPublishable(): Boolean = js.native
    
    def isEditedPostSaveable(): Boolean = js.native
    
    def isFirstMultiSelectedBlock(clientId: String): Boolean = js.native
    
    def isMultiSelecting(): Boolean = js.native
    
    def isPermalinkEditable(): Boolean = js.native
    
    def isPostLockTakeover(): Boolean = js.native
    
    def isPostLocked(): Boolean = js.native
    
    def isPostSavingLocked(): Boolean = js.native
    
    def isPreviewingPost(): Boolean = js.native
    
    def isPublishSidebarEnabled(): Boolean = js.native
    
    def isPublishingPost(): Boolean = js.native
    
    def isSavingPost(): Boolean = js.native
    
    def isSelectionEnabled(): Boolean = js.native
    
    def isTyping(): Boolean = js.native
    
    def isValidTemplate(): Boolean = js.native
  }
}
