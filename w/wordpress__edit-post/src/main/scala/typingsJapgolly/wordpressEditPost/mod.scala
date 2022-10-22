package typingsJapgolly.wordpressEditPost

import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.Record
import typingsJapgolly.wordpressEditPost.anon.AjaxUrl
import typingsJapgolly.wordpressEditPost.anon.Color
import typingsJapgolly.wordpressEditPost.anon.Css
import typingsJapgolly.wordpressEditPost.anon.Description
import typingsJapgolly.wordpressEditPost.anon.IsLocked
import typingsJapgolly.wordpressEditPost.anon.Name
import typingsJapgolly.wordpressEditPost.anon.OmitPropsname
import typingsJapgolly.wordpressEditPost.anon.PartialEditorSettings
import typingsJapgolly.wordpressEditPost.anon.Slug
import typingsJapgolly.wordpressEditPost.anon.TypeofimportedActions
import typingsJapgolly.wordpressEditPost.anon.TypeofimportedSelectors
import typingsJapgolly.wordpressEditPost.componentsBlockSettingsMenuPluginBlockSettingsMenuItemMod.PluginBlockSettingsMenuItem.Props
import typingsJapgolly.wordpressEditPost.wordpressEditPostStrings.`coreSlashedit-post`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/edit-post", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@wordpress/edit-post", "PluginBlockSettingsMenuItem")
  @js.native
  val PluginBlockSettingsMenuItem: ComponentType[Props] = js.native
  
  /**
    * Renders items below the Status & Availability panel in the Document Sidebar.
    *
    * @example
    * ```jsx
    * const { registerPlugin } = wp.plugins;
    * const { PluginDocumentSettingPanel } = wp.editPost;
    *
    * const MyDocumentSettingTest = () => (
    *     <PluginDocumentSettingPanel className="my-document-setting-plugin" title="My Panel">
    *         <p>My Document Setting Panel</p>
    *     </PluginDocumentSettingPanel>
    * );
    *
    * registerPlugin( 'document-setting-test', { render: MyDocumentSettingTest } );
    * ```
    */
  object PluginDocumentSettingPanel {
    
    inline def apply(
      props: typingsJapgolly.wordpressEditPost.componentsSidebarPluginDocumentSettingPanelMod.PluginDocumentSettingPanel.Props
    ): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@wordpress/edit-post", "PluginDocumentSettingPanel")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/edit-post", "PluginDocumentSettingPanel.Slot")
    @js.native
    def Slot: FC[OmitPropsname] = js.native
    inline def Slot_=(x: FC[OmitPropsname]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Slot")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@wordpress/edit-post", "PluginMoreMenuItem")
  @js.native
  val PluginMoreMenuItem: ComponentType[
    typingsJapgolly.wordpressEditPost.componentsHeaderPluginMoreMenuItemMod.PluginMoreMenuItem.Props
  ] = js.native
  
  /**
    * Renders provided content to the post-publish panel in the publish flow (side panel that opens
    * after a user publishes the post).
    *
    * @example
    * ```jsx
    * const { PluginPostPublishPanel } = wp.editPost;
    *
    * const MyPluginPostPublishPanel = () => (
    *     <PluginPostPublishPanel
    *         className="my-plugin-post-publish-panel"
    *         title="My panel title"
    *         initialOpen={true}
    *     >
    *         My panel content
    *     </PluginPostPublishPanel>
    * );
    * ```
    */
  object PluginPostPublishPanel {
    
    inline def apply(
      props: typingsJapgolly.wordpressEditPost.componentsSidebarPluginPostPublishPanelMod.PluginPostPublishPanel.Props
    ): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@wordpress/edit-post", "PluginPostPublishPanel")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/edit-post", "PluginPostPublishPanel.Slot")
    @js.native
    def Slot: FC[OmitPropsname] = js.native
    inline def Slot_=(x: FC[OmitPropsname]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Slot")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Renders a row in the Status & Visibility panel of the Document sidebar.
    * It should be noted that this is named and implemented around the function it serves
    * and not its location, which may change in future iterations.
    *
    * @example
    * ```jsx
    * const { PluginPostStatusInfo } = wp.editPost;
    *
    * const MyPluginPostStatusInfo = () => (
    *     <PluginPostStatusInfo className="my-plugin-post-status-info">
    *         My post status info
    *     </PluginPostStatusInfo>
    * );
    * ```
    */
  object PluginPostStatusInfo {
    
    inline def apply(
      props: typingsJapgolly.wordpressEditPost.componentsSidebarPluginPostStatusInfoMod.PluginPostStatusInfo.Props
    ): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@wordpress/edit-post", "PluginPostStatusInfo")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/edit-post", "PluginPostStatusInfo.Slot")
    @js.native
    def Slot: FC[OmitPropsname] = js.native
    inline def Slot_=(x: FC[OmitPropsname]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Slot")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Renders provided content to the pre-publish side panel in the publish flow (side panel that opens
    * when a user first pushes "Publish" from the main editor).
    *
    * @example
    * ```jsx
    * const { PluginPrePublishPanel } = wp.editPost;
    *
    * const MyPluginPrePublishPanel = () => (
    *     <PluginPrePublishPanel
    *         className="my-plugin-pre-publish-panel"
    *         title="My panel title"
    *         initialOpen={true}
    *     >
    *         My panel content
    *     </PluginPrePublishPanel>
    * );
    * ```
    */
  object PluginPrePublishPanel {
    
    inline def apply(
      props: typingsJapgolly.wordpressEditPost.componentsSidebarPluginPrePublishPanelMod.PluginPrePublishPanel.Props
    ): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@wordpress/edit-post", "PluginPrePublishPanel")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/edit-post", "PluginPrePublishPanel.Slot")
    @js.native
    def Slot: FC[OmitPropsname] = js.native
    inline def Slot_=(x: FC[OmitPropsname]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Slot")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@wordpress/edit-post", "PluginSidebar")
  @js.native
  val PluginSidebar: ComponentType[
    typingsJapgolly.wordpressEditPost.componentsSidebarPluginSidebarMod.PluginSidebar.Props
  ] = js.native
  
  @JSImport("@wordpress/edit-post", "PluginSidebarMoreMenuItem")
  @js.native
  val PluginSidebarMoreMenuItem: ComponentType[
    typingsJapgolly.wordpressEditPost.componentsHeaderPluginSidebarMoreMenuItemMod.PluginSidebarMoreMenuItem.Props
  ] = js.native
  
  inline def initializeEditor(id: String, postType: String, postId: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeEditor")(id.asInstanceOf[js.Any], postType.asInstanceOf[js.Any], postId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def initializeEditor(
    id: String,
    postType: String,
    postId: String,
    settings: Unit,
    // FIXME: it is unclear what this is
  initialEdits: js.Object
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeEditor")(id.asInstanceOf[js.Any], postType.asInstanceOf[js.Any], postId.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], initialEdits.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def initializeEditor(id: String, postType: String, postId: String, settings: PartialEditorSettings): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeEditor")(id.asInstanceOf[js.Any], postType.asInstanceOf[js.Any], postId.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def initializeEditor(
    id: String,
    postType: String,
    postId: String,
    settings: PartialEditorSettings,
    // FIXME: it is unclear what this is
  initialEdits: js.Object
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeEditor")(id.asInstanceOf[js.Any], postType.asInstanceOf[js.Any], postId.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], initialEdits.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def initializeEditor(id: String, postType: String, postId: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeEditor")(id.asInstanceOf[js.Any], postType.asInstanceOf[js.Any], postId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def initializeEditor(
    id: String,
    postType: String,
    postId: Double,
    settings: Unit,
    // FIXME: it is unclear what this is
  initialEdits: js.Object
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeEditor")(id.asInstanceOf[js.Any], postType.asInstanceOf[js.Any], postId.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], initialEdits.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def initializeEditor(id: String, postType: String, postId: Double, settings: PartialEditorSettings): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeEditor")(id.asInstanceOf[js.Any], postType.asInstanceOf[js.Any], postId.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def initializeEditor(
    id: String,
    postType: String,
    postId: Double,
    settings: PartialEditorSettings,
    // FIXME: it is unclear what this is
  initialEdits: js.Object
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeEditor")(id.asInstanceOf[js.Any], postType.asInstanceOf[js.Any], postId.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], initialEdits.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def reinitializeEditor(postType: String, postId: String, target: org.scalajs.dom.Element): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reinitializeEditor")(postType.asInstanceOf[js.Any], postId.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def reinitializeEditor(
    postType: String,
    postId: String,
    target: org.scalajs.dom.Element,
    settings: Unit,
    // FIXME: it is unclear what this is
  initialEdits: js.Object
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reinitializeEditor")(postType.asInstanceOf[js.Any], postId.asInstanceOf[js.Any], target.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], initialEdits.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def reinitializeEditor(postType: String, postId: String, target: org.scalajs.dom.Element, settings: PartialEditorSettings): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reinitializeEditor")(postType.asInstanceOf[js.Any], postId.asInstanceOf[js.Any], target.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def reinitializeEditor(
    postType: String,
    postId: String,
    target: org.scalajs.dom.Element,
    settings: PartialEditorSettings,
    // FIXME: it is unclear what this is
  initialEdits: js.Object
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reinitializeEditor")(postType.asInstanceOf[js.Any], postId.asInstanceOf[js.Any], target.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], initialEdits.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def reinitializeEditor(postType: String, postId: Double, target: org.scalajs.dom.Element): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reinitializeEditor")(postType.asInstanceOf[js.Any], postId.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def reinitializeEditor(
    postType: String,
    postId: Double,
    target: org.scalajs.dom.Element,
    settings: Unit,
    // FIXME: it is unclear what this is
  initialEdits: js.Object
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reinitializeEditor")(postType.asInstanceOf[js.Any], postId.asInstanceOf[js.Any], target.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], initialEdits.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def reinitializeEditor(postType: String, postId: Double, target: org.scalajs.dom.Element, settings: PartialEditorSettings): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reinitializeEditor")(postType.asInstanceOf[js.Any], postId.asInstanceOf[js.Any], target.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def reinitializeEditor(
    postType: String,
    postId: Double,
    target: org.scalajs.dom.Element,
    settings: PartialEditorSettings,
    // FIXME: it is unclear what this is
  initialEdits: js.Object
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reinitializeEditor")(postType.asInstanceOf[js.Any], postId.asInstanceOf[js.Any], target.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], initialEdits.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* augmented module */
  object wordpressDataAugmentingMod {
    
    @JSImport("@wordpress/data", JSImport.Namespace)
    @js.native
    val ^ : js.Any = js.native
    
    inline def dispatch_coreeditpost(key: `coreSlashedit-post`): TypeofimportedActions = ^.asInstanceOf[js.Dynamic].applyDynamic("dispatch")(key.asInstanceOf[js.Any]).asInstanceOf[TypeofimportedActions]
    
    inline def select_coreeditpost(key: `coreSlashedit-post`): TypeofimportedSelectors = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(key.asInstanceOf[js.Any]).asInstanceOf[TypeofimportedSelectors]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wordpressEditPost.wordpressEditPostStrings.text
    - typingsJapgolly.wordpressEditPost.wordpressEditPostStrings.visual
  */
  trait EditorMode extends StObject
  object EditorMode {
    
    inline def text: typingsJapgolly.wordpressEditPost.wordpressEditPostStrings.text = "text".asInstanceOf[typingsJapgolly.wordpressEditPost.wordpressEditPostStrings.text]
    
    inline def visual: typingsJapgolly.wordpressEditPost.wordpressEditPostStrings.visual = "visual".asInstanceOf[typingsJapgolly.wordpressEditPost.wordpressEditPostStrings.visual]
  }
  
  trait EditorSettings extends StObject {
    
    /**
      * Enable/Disable Wide/Full Alignments
      * @defaultValue `false`
      */
    var alignWide: Boolean
    
    /**
      * Array of allowed block types, `true` for all blocks, or `false` for no blocks.
      * @defaultValue `true`
      */
    var allowedBlockTypes: js.Array[String] | Boolean
    
    /**
      * Mapping of extension:mimetype
      * @example
      * ```js
      * {
      *   "jpg|jpeg|jpe": "image/jpeg",
      * }
      * ```
      */
    var allowedMimeTypes: (Record[String, String]) | Null
    
    var autosaveInterval: Double
    
    /**
      * Array of objects representing the legacy widgets available.
      */
    var availableLegacyWidgets: js.Array[Description]
    
    // FIXME: it is unclear what this value should be.
    var availableTemplates: js.Array[Any]
    
    /**
      * Empty post placeholder.
      * @defaultValue `"Start writing or type / to choose a block"`
      */
    var bodyPlaceholder: String
    
    /**
      * Whether or not the user can switch to the code editor.
      */
    var codeEditingEnabled: Boolean
    
    /**
      * Palette colors.
      */
    var colors: js.Array[Color]
    
    /**
      * Whether or not the custom colors are disabled.
      */
    var disableCustomColors: Boolean
    
    /**
      * Whether or not the custom font sizes are disabled.
      */
    var disableCustomFontSizes: Boolean
    
    /**
      * Whether or not the custom post formats are disabled.
      */
    var disablePostFormats: Boolean
    
    /**
      * Whether or not the custom fields are enabled.
      */
    var enableCustomFields: Boolean
    
    /**
      * Whether the focus mode is enabled or not.
      */
    var focusMode: Boolean
    
    /**
      * Array of available font sizes.
      */
    var fontSizes: js.Array[Name]
    
    /**
      * Whether or not the editor toolbar is fixed.
      */
    var hasFixedToolbar: Boolean
    
    /**
      * Whether or not the user is able to manage widgets.
      */
    var hasPermissionsToManageWidgets: Boolean
    
    /**
      * Available image sizes.
      */
    var imageSizes: js.Array[Slug]
    
    /**
      * Whether the editor is in RTL mode.
      */
    var isRTL: Boolean
    
    var maxUploadFileSize: Double
    
    /**
      * Max width to constraint resizing.
      */
    var maxWidth: Double
    
    var postLock: IsLocked
    
    var postLockUtils: AjaxUrl
    
    var richEditingEnabled: Boolean
    
    var styles: js.Array[Css]
    
    /**
      * Empty title placeholder.
      * @defaultValue `"Add title"`
      */
    var titlePlaceholder: String
  }
  object EditorSettings {
    
    inline def apply(
      alignWide: Boolean,
      allowedBlockTypes: js.Array[String] | Boolean,
      autosaveInterval: Double,
      availableLegacyWidgets: js.Array[Description],
      availableTemplates: js.Array[Any],
      bodyPlaceholder: String,
      codeEditingEnabled: Boolean,
      colors: js.Array[Color],
      disableCustomColors: Boolean,
      disableCustomFontSizes: Boolean,
      disablePostFormats: Boolean,
      enableCustomFields: Boolean,
      focusMode: Boolean,
      fontSizes: js.Array[Name],
      hasFixedToolbar: Boolean,
      hasPermissionsToManageWidgets: Boolean,
      imageSizes: js.Array[Slug],
      isRTL: Boolean,
      maxUploadFileSize: Double,
      maxWidth: Double,
      postLock: IsLocked,
      postLockUtils: AjaxUrl,
      richEditingEnabled: Boolean,
      styles: js.Array[Css],
      titlePlaceholder: String
    ): EditorSettings = {
      val __obj = js.Dynamic.literal(alignWide = alignWide.asInstanceOf[js.Any], allowedBlockTypes = allowedBlockTypes.asInstanceOf[js.Any], autosaveInterval = autosaveInterval.asInstanceOf[js.Any], availableLegacyWidgets = availableLegacyWidgets.asInstanceOf[js.Any], availableTemplates = availableTemplates.asInstanceOf[js.Any], bodyPlaceholder = bodyPlaceholder.asInstanceOf[js.Any], codeEditingEnabled = codeEditingEnabled.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], disableCustomColors = disableCustomColors.asInstanceOf[js.Any], disableCustomFontSizes = disableCustomFontSizes.asInstanceOf[js.Any], disablePostFormats = disablePostFormats.asInstanceOf[js.Any], enableCustomFields = enableCustomFields.asInstanceOf[js.Any], focusMode = focusMode.asInstanceOf[js.Any], fontSizes = fontSizes.asInstanceOf[js.Any], hasFixedToolbar = hasFixedToolbar.asInstanceOf[js.Any], hasPermissionsToManageWidgets = hasPermissionsToManageWidgets.asInstanceOf[js.Any], imageSizes = imageSizes.asInstanceOf[js.Any], isRTL = isRTL.asInstanceOf[js.Any], maxUploadFileSize = maxUploadFileSize.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], postLock = postLock.asInstanceOf[js.Any], postLockUtils = postLockUtils.asInstanceOf[js.Any], richEditingEnabled = richEditingEnabled.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], titlePlaceholder = titlePlaceholder.asInstanceOf[js.Any], allowedMimeTypes = null)
      __obj.asInstanceOf[EditorSettings]
    }
    
    extension [Self <: EditorSettings](x: Self) {
      
      inline def setAlignWide(value: Boolean): Self = StObject.set(x, "alignWide", value.asInstanceOf[js.Any])
      
      inline def setAllowedBlockTypes(value: js.Array[String] | Boolean): Self = StObject.set(x, "allowedBlockTypes", value.asInstanceOf[js.Any])
      
      inline def setAllowedBlockTypesVarargs(value: String*): Self = StObject.set(x, "allowedBlockTypes", js.Array(value*))
      
      inline def setAllowedMimeTypes(value: Record[String, String]): Self = StObject.set(x, "allowedMimeTypes", value.asInstanceOf[js.Any])
      
      inline def setAllowedMimeTypesNull: Self = StObject.set(x, "allowedMimeTypes", null)
      
      inline def setAutosaveInterval(value: Double): Self = StObject.set(x, "autosaveInterval", value.asInstanceOf[js.Any])
      
      inline def setAvailableLegacyWidgets(value: js.Array[Description]): Self = StObject.set(x, "availableLegacyWidgets", value.asInstanceOf[js.Any])
      
      inline def setAvailableLegacyWidgetsVarargs(value: Description*): Self = StObject.set(x, "availableLegacyWidgets", js.Array(value*))
      
      inline def setAvailableTemplates(value: js.Array[Any]): Self = StObject.set(x, "availableTemplates", value.asInstanceOf[js.Any])
      
      inline def setAvailableTemplatesVarargs(value: Any*): Self = StObject.set(x, "availableTemplates", js.Array(value*))
      
      inline def setBodyPlaceholder(value: String): Self = StObject.set(x, "bodyPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setCodeEditingEnabled(value: Boolean): Self = StObject.set(x, "codeEditingEnabled", value.asInstanceOf[js.Any])
      
      inline def setColors(value: js.Array[Color]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsVarargs(value: Color*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setDisableCustomColors(value: Boolean): Self = StObject.set(x, "disableCustomColors", value.asInstanceOf[js.Any])
      
      inline def setDisableCustomFontSizes(value: Boolean): Self = StObject.set(x, "disableCustomFontSizes", value.asInstanceOf[js.Any])
      
      inline def setDisablePostFormats(value: Boolean): Self = StObject.set(x, "disablePostFormats", value.asInstanceOf[js.Any])
      
      inline def setEnableCustomFields(value: Boolean): Self = StObject.set(x, "enableCustomFields", value.asInstanceOf[js.Any])
      
      inline def setFocusMode(value: Boolean): Self = StObject.set(x, "focusMode", value.asInstanceOf[js.Any])
      
      inline def setFontSizes(value: js.Array[Name]): Self = StObject.set(x, "fontSizes", value.asInstanceOf[js.Any])
      
      inline def setFontSizesVarargs(value: Name*): Self = StObject.set(x, "fontSizes", js.Array(value*))
      
      inline def setHasFixedToolbar(value: Boolean): Self = StObject.set(x, "hasFixedToolbar", value.asInstanceOf[js.Any])
      
      inline def setHasPermissionsToManageWidgets(value: Boolean): Self = StObject.set(x, "hasPermissionsToManageWidgets", value.asInstanceOf[js.Any])
      
      inline def setImageSizes(value: js.Array[Slug]): Self = StObject.set(x, "imageSizes", value.asInstanceOf[js.Any])
      
      inline def setImageSizesVarargs(value: Slug*): Self = StObject.set(x, "imageSizes", js.Array(value*))
      
      inline def setIsRTL(value: Boolean): Self = StObject.set(x, "isRTL", value.asInstanceOf[js.Any])
      
      inline def setMaxUploadFileSize(value: Double): Self = StObject.set(x, "maxUploadFileSize", value.asInstanceOf[js.Any])
      
      inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setPostLock(value: IsLocked): Self = StObject.set(x, "postLock", value.asInstanceOf[js.Any])
      
      inline def setPostLockUtils(value: AjaxUrl): Self = StObject.set(x, "postLockUtils", value.asInstanceOf[js.Any])
      
      inline def setRichEditingEnabled(value: Boolean): Self = StObject.set(x, "richEditingEnabled", value.asInstanceOf[js.Any])
      
      inline def setStyles(value: js.Array[Css]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesVarargs(value: Css*): Self = StObject.set(x, "styles", js.Array(value*))
      
      inline def setTitlePlaceholder(value: String): Self = StObject.set(x, "titlePlaceholder", value.asInstanceOf[js.Any])
    }
  }
  
  trait MetaboxDescriptor extends StObject {
    
    var id: String
    
    var title: String
  }
  object MetaboxDescriptor {
    
    inline def apply(id: String, title: String): MetaboxDescriptor = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetaboxDescriptor]
    }
    
    extension [Self <: MetaboxDescriptor](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wordpressEditPost.wordpressEditPostStrings.advanced
    - typingsJapgolly.wordpressEditPost.wordpressEditPostStrings.normal
    - typingsJapgolly.wordpressEditPost.wordpressEditPostStrings.side
  */
  trait MetaboxLocation extends StObject
  object MetaboxLocation {
    
    inline def advanced: typingsJapgolly.wordpressEditPost.wordpressEditPostStrings.advanced = "advanced".asInstanceOf[typingsJapgolly.wordpressEditPost.wordpressEditPostStrings.advanced]
    
    inline def normal: typingsJapgolly.wordpressEditPost.wordpressEditPostStrings.normal = "normal".asInstanceOf[typingsJapgolly.wordpressEditPost.wordpressEditPostStrings.normal]
    
    inline def side: typingsJapgolly.wordpressEditPost.wordpressEditPostStrings.side = "side".asInstanceOf[typingsJapgolly.wordpressEditPost.wordpressEditPostStrings.side]
  }
}
