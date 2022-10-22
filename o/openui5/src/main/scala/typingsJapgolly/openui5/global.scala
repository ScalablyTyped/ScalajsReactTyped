package typingsJapgolly.openui5

import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Touch
import org.scalajs.dom.TouchList
import typingsJapgolly.openui5.anon.AsyncCache
import typingsJapgolly.openui5.anon.Bundles
import typingsJapgolly.openui5.anon.Cloned
import typingsJapgolly.openui5.anon.Domref
import typingsJapgolly.openui5.anon.FailOnError
import typingsJapgolly.openui5.anon.FragmentContent
import typingsJapgolly.openui5.anon.FragmentName
import typingsJapgolly.openui5.anon.HandleValidation
import typingsJapgolly.openui5.anon.To
import typingsJapgolly.openui5.anon.ViewContent
import typingsJapgolly.openui5.anon.ViewData
import typingsJapgolly.openui5.anon.`19`
import typingsJapgolly.openui5.sapUiCoreCoreMod.Core
import typingsJapgolly.openui5.sapUiCoreLibraryMod.CSSColor
import typingsJapgolly.openui5.sapUiCoreLibraryMod.URI
import typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /**
    * Root namespace for JavaScript functionality provided by SAP SE.
    *
    * The `sap` namespace is automatically registered with the OpenAjax hub if it exists.
    */
  object sap {
    
    /**
      * @SINCE 1.4
      *
      * The main UI5 control library, with responsive controls that can be used in touch devices as well as desktop
      * browsers.
      */
    object m {
      
      @JSGlobal("sap.m")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * @SINCE 1.12
        *
        * Helper for rendering themable background.
        */
      object BackgroundHelper {
        
        @JSGlobal("sap.m.BackgroundHelper")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * Adds CSS classes and styles to the given RenderManager, depending on the given configuration for background
          * color and background image. To be called by control renderers supporting the global themable background
          * image within their root tag, before they call openEnd, voidEnd, writeClasses() and writeStyles().
          */
        inline def addBackgroundColorStyles(/**
          * The RenderManager
          */
        rm: default): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addBackgroundColorStyles")(rm.asInstanceOf[js.Any]).asInstanceOf[Unit]
        inline def addBackgroundColorStyles(
          /**
          * The RenderManager
          */
        rm: default,
          /**
          * A configured custom background color for the control, if any
          */
        sBgColor: Unit,
          /**
          * The configured custom background image for the control, if any
          */
        sBgImgUrl: URI
        ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBackgroundColorStyles")(rm.asInstanceOf[js.Any], sBgColor.asInstanceOf[js.Any], sBgImgUrl.asInstanceOf[js.Any])).asInstanceOf[Unit]
        inline def addBackgroundColorStyles(
          /**
          * The RenderManager
          */
        rm: default,
          /**
          * A configured custom background color for the control, if any
          */
        sBgColor: CSSColor
        ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBackgroundColorStyles")(rm.asInstanceOf[js.Any], sBgColor.asInstanceOf[js.Any])).asInstanceOf[Unit]
        inline def addBackgroundColorStyles(
          /**
          * The RenderManager
          */
        rm: default,
          /**
          * A configured custom background color for the control, if any
          */
        sBgColor: CSSColor,
          /**
          * The configured custom background image for the control, if any
          */
        sBgImgUrl: URI
        ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBackgroundColorStyles")(rm.asInstanceOf[js.Any], sBgColor.asInstanceOf[js.Any], sBgImgUrl.asInstanceOf[js.Any])).asInstanceOf[Unit]
        
        /**
          * Renders an HTML tag into the given RenderManager which carries the background image which is either configured
          * and given or coming from the current theme. Should be called right after the opening root tag has been
          * completed, so this is the first child element inside the control.
          */
        inline def renderBackgroundImageTag(
          /**
          * The RenderManager
          */
        rm: default,
          /**
          * Control within which the tag will be rendered; its ID will be used to generate the element ID
          */
        oControl: typingsJapgolly.openui5.sapUiCoreControlMod.default,
          /**
          * A CSS class or an array of CSS classes to add to the element
          */
        vCssClass: String
        ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderBackgroundImageTag")(rm.asInstanceOf[js.Any], oControl.asInstanceOf[js.Any], vCssClass.asInstanceOf[js.Any])).asInstanceOf[Unit]
        inline def renderBackgroundImageTag(
          /**
          * The RenderManager
          */
        rm: default,
          /**
          * Control within which the tag will be rendered; its ID will be used to generate the element ID
          */
        oControl: typingsJapgolly.openui5.sapUiCoreControlMod.default,
          /**
          * A CSS class or an array of CSS classes to add to the element
          */
        vCssClass: String,
          /**
          * The image of a configured background image; if this is not given, the theme background will be used and
          * also the other settings are ignored.
          */
        sBgImgUrl: Unit,
          /**
          * Whether the background image should be repeated/tiled (or stretched)
          */
        bRepeat: Boolean
        ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderBackgroundImageTag")(rm.asInstanceOf[js.Any], oControl.asInstanceOf[js.Any], vCssClass.asInstanceOf[js.Any], sBgImgUrl.asInstanceOf[js.Any], bRepeat.asInstanceOf[js.Any])).asInstanceOf[Unit]
        inline def renderBackgroundImageTag(
          /**
          * The RenderManager
          */
        rm: default,
          /**
          * Control within which the tag will be rendered; its ID will be used to generate the element ID
          */
        oControl: typingsJapgolly.openui5.sapUiCoreControlMod.default,
          /**
          * A CSS class or an array of CSS classes to add to the element
          */
        vCssClass: String,
          /**
          * The image of a configured background image; if this is not given, the theme background will be used and
          * also the other settings are ignored.
          */
        sBgImgUrl: Unit,
          /**
          * Whether the background image should be repeated/tiled (or stretched)
          */
        bRepeat: Boolean,
          /**
          * The background image opacity, if any
          */
        fOpacity: float
        ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderBackgroundImageTag")(rm.asInstanceOf[js.Any], oControl.asInstanceOf[js.Any], vCssClass.asInstanceOf[js.Any], sBgImgUrl.asInstanceOf[js.Any], bRepeat.asInstanceOf[js.Any], fOpacity.asInstanceOf[js.Any])).asInstanceOf[Unit]
        inline def renderBackgroundImageTag(
          /**
          * The RenderManager
          */
        rm: default,
          /**
          * Control within which the tag will be rendered; its ID will be used to generate the element ID
          */
        oControl: typingsJapgolly.openui5.sapUiCoreControlMod.default,
          /**
          * A CSS class or an array of CSS classes to add to the element
          */
        vCssClass: String,
          /**
          * The image of a configured background image; if this is not given, the theme background will be used and
          * also the other settings are ignored.
          */
        sBgImgUrl: Unit,
          /**
          * Whether the background image should be repeated/tiled (or stretched)
          */
        bRepeat: Unit,
          /**
          * The background image opacity, if any
          */
        fOpacity: float
        ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderBackgroundImageTag")(rm.asInstanceOf[js.Any], oControl.asInstanceOf[js.Any], vCssClass.asInstanceOf[js.Any], sBgImgUrl.asInstanceOf[js.Any], bRepeat.asInstanceOf[js.Any], fOpacity.asInstanceOf[js.Any])).asInstanceOf[Unit]
        inline def renderBackgroundImageTag(
          /**
          * The RenderManager
          */
        rm: default,
          /**
          * Control within which the tag will be rendered; its ID will be used to generate the element ID
          */
        oControl: typingsJapgolly.openui5.sapUiCoreControlMod.default,
          /**
          * A CSS class or an array of CSS classes to add to the element
          */
        vCssClass: String,
          /**
          * The image of a configured background image; if this is not given, the theme background will be used and
          * also the other settings are ignored.
          */
        sBgImgUrl: URI
        ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderBackgroundImageTag")(rm.asInstanceOf[js.Any], oControl.asInstanceOf[js.Any], vCssClass.asInstanceOf[js.Any], sBgImgUrl.asInstanceOf[js.Any])).asInstanceOf[Unit]
        inline def renderBackgroundImageTag(
          /**
          * The RenderManager
          */
        rm: default,
          /**
          * Control within which the tag will be rendered; its ID will be used to generate the element ID
          */
        oControl: typingsJapgolly.openui5.sapUiCoreControlMod.default,
          /**
          * A CSS class or an array of CSS classes to add to the element
          */
        vCssClass: String,
          /**
          * The image of a configured background image; if this is not given, the theme background will be used and
          * also the other settings are ignored.
          */
        sBgImgUrl: URI,
          /**
          * Whether the background image should be repeated/tiled (or stretched)
          */
        bRepeat: Boolean
        ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderBackgroundImageTag")(rm.asInstanceOf[js.Any], oControl.asInstanceOf[js.Any], vCssClass.asInstanceOf[js.Any], sBgImgUrl.asInstanceOf[js.Any], bRepeat.asInstanceOf[js.Any])).asInstanceOf[Unit]
        inline def renderBackgroundImageTag(
          /**
          * The RenderManager
          */
        rm: default,
          /**
          * Control within which the tag will be rendered; its ID will be used to generate the element ID
          */
        oControl: typingsJapgolly.openui5.sapUiCoreControlMod.default,
          /**
          * A CSS class or an array of CSS classes to add to the element
          */
        vCssClass: String,
          /**
          * The image of a configured background image; if this is not given, the theme background will be used and
          * also the other settings are ignored.
          */
        sBgImgUrl: URI,
          /**
          * Whether the background image should be repeated/tiled (or stretched)
          */
        bRepeat: Boolean,
          /**
          * The background image opacity, if any
          */
        fOpacity: float
        ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderBackgroundImageTag")(rm.asInstanceOf[js.Any], oControl.asInstanceOf[js.Any], vCssClass.asInstanceOf[js.Any], sBgImgUrl.asInstanceOf[js.Any], bRepeat.asInstanceOf[js.Any], fOpacity.asInstanceOf[js.Any])).asInstanceOf[Unit]
        inline def renderBackgroundImageTag(
          /**
          * The RenderManager
          */
        rm: default,
          /**
          * Control within which the tag will be rendered; its ID will be used to generate the element ID
          */
        oControl: typingsJapgolly.openui5.sapUiCoreControlMod.default,
          /**
          * A CSS class or an array of CSS classes to add to the element
          */
        vCssClass: String,
          /**
          * The image of a configured background image; if this is not given, the theme background will be used and
          * also the other settings are ignored.
          */
        sBgImgUrl: URI,
          /**
          * Whether the background image should be repeated/tiled (or stretched)
          */
        bRepeat: Unit,
          /**
          * The background image opacity, if any
          */
        fOpacity: float
        ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderBackgroundImageTag")(rm.asInstanceOf[js.Any], oControl.asInstanceOf[js.Any], vCssClass.asInstanceOf[js.Any], sBgImgUrl.asInstanceOf[js.Any], bRepeat.asInstanceOf[js.Any], fOpacity.asInstanceOf[js.Any])).asInstanceOf[Unit]
        inline def renderBackgroundImageTag(
          /**
          * The RenderManager
          */
        rm: default,
          /**
          * Control within which the tag will be rendered; its ID will be used to generate the element ID
          */
        oControl: typingsJapgolly.openui5.sapUiCoreControlMod.default,
          /**
          * A CSS class or an array of CSS classes to add to the element
          */
        vCssClass: js.Array[String]
        ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderBackgroundImageTag")(rm.asInstanceOf[js.Any], oControl.asInstanceOf[js.Any], vCssClass.asInstanceOf[js.Any])).asInstanceOf[Unit]
        inline def renderBackgroundImageTag(
          /**
          * The RenderManager
          */
        rm: default,
          /**
          * Control within which the tag will be rendered; its ID will be used to generate the element ID
          */
        oControl: typingsJapgolly.openui5.sapUiCoreControlMod.default,
          /**
          * A CSS class or an array of CSS classes to add to the element
          */
        vCssClass: js.Array[String],
          /**
          * The image of a configured background image; if this is not given, the theme background will be used and
          * also the other settings are ignored.
          */
        sBgImgUrl: Unit,
          /**
          * Whether the background image should be repeated/tiled (or stretched)
          */
        bRepeat: Boolean
        ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderBackgroundImageTag")(rm.asInstanceOf[js.Any], oControl.asInstanceOf[js.Any], vCssClass.asInstanceOf[js.Any], sBgImgUrl.asInstanceOf[js.Any], bRepeat.asInstanceOf[js.Any])).asInstanceOf[Unit]
        inline def renderBackgroundImageTag(
          /**
          * The RenderManager
          */
        rm: default,
          /**
          * Control within which the tag will be rendered; its ID will be used to generate the element ID
          */
        oControl: typingsJapgolly.openui5.sapUiCoreControlMod.default,
          /**
          * A CSS class or an array of CSS classes to add to the element
          */
        vCssClass: js.Array[String],
          /**
          * The image of a configured background image; if this is not given, the theme background will be used and
          * also the other settings are ignored.
          */
        sBgImgUrl: Unit,
          /**
          * Whether the background image should be repeated/tiled (or stretched)
          */
        bRepeat: Boolean,
          /**
          * The background image opacity, if any
          */
        fOpacity: float
        ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderBackgroundImageTag")(rm.asInstanceOf[js.Any], oControl.asInstanceOf[js.Any], vCssClass.asInstanceOf[js.Any], sBgImgUrl.asInstanceOf[js.Any], bRepeat.asInstanceOf[js.Any], fOpacity.asInstanceOf[js.Any])).asInstanceOf[Unit]
        inline def renderBackgroundImageTag(
          /**
          * The RenderManager
          */
        rm: default,
          /**
          * Control within which the tag will be rendered; its ID will be used to generate the element ID
          */
        oControl: typingsJapgolly.openui5.sapUiCoreControlMod.default,
          /**
          * A CSS class or an array of CSS classes to add to the element
          */
        vCssClass: js.Array[String],
          /**
          * The image of a configured background image; if this is not given, the theme background will be used and
          * also the other settings are ignored.
          */
        sBgImgUrl: Unit,
          /**
          * Whether the background image should be repeated/tiled (or stretched)
          */
        bRepeat: Unit,
          /**
          * The background image opacity, if any
          */
        fOpacity: float
        ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderBackgroundImageTag")(rm.asInstanceOf[js.Any], oControl.asInstanceOf[js.Any], vCssClass.asInstanceOf[js.Any], sBgImgUrl.asInstanceOf[js.Any], bRepeat.asInstanceOf[js.Any], fOpacity.asInstanceOf[js.Any])).asInstanceOf[Unit]
        inline def renderBackgroundImageTag(
          /**
          * The RenderManager
          */
        rm: default,
          /**
          * Control within which the tag will be rendered; its ID will be used to generate the element ID
          */
        oControl: typingsJapgolly.openui5.sapUiCoreControlMod.default,
          /**
          * A CSS class or an array of CSS classes to add to the element
          */
        vCssClass: js.Array[String],
          /**
          * The image of a configured background image; if this is not given, the theme background will be used and
          * also the other settings are ignored.
          */
        sBgImgUrl: URI
        ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderBackgroundImageTag")(rm.asInstanceOf[js.Any], oControl.asInstanceOf[js.Any], vCssClass.asInstanceOf[js.Any], sBgImgUrl.asInstanceOf[js.Any])).asInstanceOf[Unit]
        inline def renderBackgroundImageTag(
          /**
          * The RenderManager
          */
        rm: default,
          /**
          * Control within which the tag will be rendered; its ID will be used to generate the element ID
          */
        oControl: typingsJapgolly.openui5.sapUiCoreControlMod.default,
          /**
          * A CSS class or an array of CSS classes to add to the element
          */
        vCssClass: js.Array[String],
          /**
          * The image of a configured background image; if this is not given, the theme background will be used and
          * also the other settings are ignored.
          */
        sBgImgUrl: URI,
          /**
          * Whether the background image should be repeated/tiled (or stretched)
          */
        bRepeat: Boolean
        ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderBackgroundImageTag")(rm.asInstanceOf[js.Any], oControl.asInstanceOf[js.Any], vCssClass.asInstanceOf[js.Any], sBgImgUrl.asInstanceOf[js.Any], bRepeat.asInstanceOf[js.Any])).asInstanceOf[Unit]
        inline def renderBackgroundImageTag(
          /**
          * The RenderManager
          */
        rm: default,
          /**
          * Control within which the tag will be rendered; its ID will be used to generate the element ID
          */
        oControl: typingsJapgolly.openui5.sapUiCoreControlMod.default,
          /**
          * A CSS class or an array of CSS classes to add to the element
          */
        vCssClass: js.Array[String],
          /**
          * The image of a configured background image; if this is not given, the theme background will be used and
          * also the other settings are ignored.
          */
        sBgImgUrl: URI,
          /**
          * Whether the background image should be repeated/tiled (or stretched)
          */
        bRepeat: Boolean,
          /**
          * The background image opacity, if any
          */
        fOpacity: float
        ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderBackgroundImageTag")(rm.asInstanceOf[js.Any], oControl.asInstanceOf[js.Any], vCssClass.asInstanceOf[js.Any], sBgImgUrl.asInstanceOf[js.Any], bRepeat.asInstanceOf[js.Any], fOpacity.asInstanceOf[js.Any])).asInstanceOf[Unit]
        inline def renderBackgroundImageTag(
          /**
          * The RenderManager
          */
        rm: default,
          /**
          * Control within which the tag will be rendered; its ID will be used to generate the element ID
          */
        oControl: typingsJapgolly.openui5.sapUiCoreControlMod.default,
          /**
          * A CSS class or an array of CSS classes to add to the element
          */
        vCssClass: js.Array[String],
          /**
          * The image of a configured background image; if this is not given, the theme background will be used and
          * also the other settings are ignored.
          */
        sBgImgUrl: URI,
          /**
          * Whether the background image should be repeated/tiled (or stretched)
          */
        bRepeat: Unit,
          /**
          * The background image opacity, if any
          */
        fOpacity: float
        ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderBackgroundImageTag")(rm.asInstanceOf[js.Any], oControl.asInstanceOf[js.Any], vCssClass.asInstanceOf[js.Any], sBgImgUrl.asInstanceOf[js.Any], bRepeat.asInstanceOf[js.Any], fOpacity.asInstanceOf[js.Any])).asInstanceOf[Unit]
      }
      
      /**
        * @SINCE 1.12
        *
        * Helper for Images.
        */
      object ImageHelper {
        
        @JSGlobal("sap.m.ImageHelper")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * Creates or updates an image control.
          *
          * @returns The new or updated image control or icon
          */
        inline def getImageControl(
          /**
          * UD of the image to be dealt with.
          */
        sImgId: String,
          /**
          * The image to update. If undefined, a new image will be created.
          */
        oImage: typingsJapgolly.openui5.sapMImageMod.default,
          /**
          * oImageControl's parentControl.
          */
        oParent: typingsJapgolly.openui5.sapUiCoreControlMod.default,
          /**
          * Settings for the image control; the `src` property MUST be contained; the keys of the object must be
          * valid names of image settings
          */
        mProperties: js.Object,
          /**
          * Array of CSS classes which will be added if the image needs to be created.
          */
        aCssClassesToAdd: js.Array[String],
          /**
          * All CSS classes that oImageControl has and which are contained in this array are removed before adding
          * the CSS classes listed in aCssClassesToAdd.
          */
        aCssClassesToRemove: js.Array[String]
        ): typingsJapgolly.openui5.sapMImageMod.default | typingsJapgolly.openui5.sapUiCoreIconMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageControl")(sImgId.asInstanceOf[js.Any], oImage.asInstanceOf[js.Any], oParent.asInstanceOf[js.Any], mProperties.asInstanceOf[js.Any], aCssClassesToAdd.asInstanceOf[js.Any], aCssClassesToRemove.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.openui5.sapMImageMod.default | typingsJapgolly.openui5.sapUiCoreIconMod.default]
      }
      
      /**
        * @SINCE 1.21.2
        *
        * Suggestion helper for `sap.m.Input` fields when used with an OData model.
        *
        * Creates a multi-column suggest list for an `sap.m.Input` field based on a `ValueList` annotation. The
        * `ValueList` annotation will be resolved via the binding information of the input field.
        *
        * If the annotation describes multiple input parameters, the suggest provider will resolve all of these
        * relative to the context of the input field and use them for the suggest query. The suggest provider will
        * write all values that are described as output parameters back to the model (relative to the context of
        * the input field). This can only be done if the model runs in "TwoWay" binding mode. Both features can
        * be switched off via the `bResolveInput/bResolveOutput` parameter of the suggest function.
        */
      object InputODataSuggestProvider {
        
        @JSGlobal("sap.m.InputODataSuggestProvider")
        @js.native
        val ^ : js.Any = js.native
        
        inline def suggest(
          oEvent: typingsJapgolly.openui5.sapUiBaseEventMod.default,
          /**
          * SuggestProvider resolves all input parameters for the data query
          */
        bResolveInput: Boolean,
          /**
          * SuggestProvider writes back all output parameters.
          */
        bResolveOutput: Boolean,
          /**
          * If iLength is provided only these number of entries will be requested.
          */
        iLength: int
        ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("suggest")(oEvent.asInstanceOf[js.Any], bResolveInput.asInstanceOf[js.Any], bResolveOutput.asInstanceOf[js.Any], iLength.asInstanceOf[js.Any])).asInstanceOf[Unit]
      }
      
      /**
        * @SINCE 1.16.7
        *
        * Helper for Popups.
        */
      object PopupHelper {
        
        @JSGlobal("sap.m.PopupHelper")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * Converts the given percentage value to an absolute number based on the given base size.
          *
          * @returns The calculated size string with "px" as unit or `null` when the format of given parameter is
          * wrong.
          */
        inline def calcPercentageSize(
          /**
          * A percentage value in string format, for example "25%"
          */
        sPercentage: String,
          /**
          * A float number which the calculation is based on.
          */
        fBaseSize: float
        ): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("calcPercentageSize")(sPercentage.asInstanceOf[js.Any], fBaseSize.asInstanceOf[js.Any])).asInstanceOf[String | Null]
      }
      
      /**
        * @SINCE 1.48.0
        *
        * The public facade of the {@link sap.m.SelectionDetailsItem} element.
        */
      @JSGlobal("sap.m.SelectionDetailsItemFacade")
      @js.native
      /**
        * Describes the public facade of the {@link sap.m.SelectionDetailsItem} element.
        */
      open class SelectionDetailsItemFacade ()
        extends StObject
           with typingsJapgolly.openui5.sap.m.SelectionDetailsItemFacade
      
      @JSGlobal("sap.m.Support")
      @js.native
      val Support: /* undefined */ Any = js.native
      
      /**
        * @SINCE 1.20
        *
        * Hide the soft keyboard.
        */
      inline def closeKeyboard(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeKeyboard")().asInstanceOf[Unit]
      
      /**
        * @SINCE 1.11
        *
        * Search given control's parents and try to find iScroll.
        *
        * @returns iScroll reference or `undefined` if cannot find
        */
      inline def getIScroll(
        /**
        * Control to start the search at
        */
      oControl: typingsJapgolly.openui5.sapUiCoreControlMod.default
      ): js.UndefOr[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIScroll")(oControl.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Object]]
      
      /**
        * @SINCE 1.10
        * @deprecated (since 1.12) - UI5 returns null for invalid date
        *
        * Returns invalid date value of UI5.
        *
        * @returns `null` as value for an invalid date
        */
      inline def getInvalidDate(): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getInvalidDate")().asInstanceOf[Null]
      
      /**
        * @SINCE 1.10
        *
        * Finds default locale settings once and returns always the same.
        *
        * We should not need to create new instance to get same locale settings This method keeps the locale instance
        * in the scope and returns the same after first run
        *
        * @returns Locale instance
        */
      inline def getLocale(): typingsJapgolly.openui5.sapUiCoreLocaleMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocale")().asInstanceOf[typingsJapgolly.openui5.sapUiCoreLocaleMod.default]
      
      /**
        * @SINCE 1.10
        *
        * Finds default locale data once and returns always the same.
        *
        * @returns LocaleData instance
        */
      inline def getLocaleData(): typingsJapgolly.openui5.sapUiCoreLocaleDataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleData")().asInstanceOf[typingsJapgolly.openui5.sapUiCoreLocaleDataMod.default]
      
      /**
        * @SINCE 1.11
        *
        * Search given control's parents and try to find a ScrollDelegate.
        *
        * @returns ScrollDelegate or `undefined` if it cannot be found
        */
      inline def getScrollDelegate(
        /**
        * Starting point for the search
        */
      oControl: typingsJapgolly.openui5.sapUiCoreControlMod.default,
        /**
        * Whether the search should stop on component level (`false`) or not
        */
      bGlobal: Boolean
      ): js.UndefOr[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("getScrollDelegate")(oControl.asInstanceOf[js.Any], bGlobal.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Object]]
      
      /**
        * @SINCE 1.10
        *
        * Checks if the given parameter is a valid JsDate Object.
        *
        * @returns Whether the given parameter is a valid JsDate Object.
        */
      inline def isDate(/**
        * Any variable to test.
        */
      value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      /**
        * Touch helper.
        */
      object touch {
        
        @JSGlobal("sap.m.touch")
        @js.native
        val ^ : js.Any = js.native
        
        inline def countContained(
          /**
          * The list of touch objects to search.
          */
        oTouchList: TouchList,
          /**
          * A jQuery element or an element reference or an element id.
          */
        vElement: String
        ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("countContained")(oTouchList.asInstanceOf[js.Any], vElement.asInstanceOf[js.Any])).asInstanceOf[Double]
        inline def countContained(
          /**
          * The list of touch objects to search.
          */
        oTouchList: TouchList,
          /**
          * A jQuery element or an element reference or an element id.
          */
        vElement: Element
        ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("countContained")(oTouchList.asInstanceOf[js.Any], vElement.asInstanceOf[js.Any])).asInstanceOf[Double]
        /**
          * Given a list of touches, count the number of touches related with the given element.
          *
          * @returns The number of touches related with the given element.
          */
        inline def countContained(
          /**
          * The list of touch objects to search.
          */
        oTouchList: TouchList,
          /**
          * A jQuery element or an element reference or an element id.
          */
        vElement: jQuery[HTMLElement]
        ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("countContained")(oTouchList.asInstanceOf[js.Any], vElement.asInstanceOf[js.Any])).asInstanceOf[Double]
        
        /**
          * Given a list of touch objects, find the touch that matches the given one.
          *
          * @returns The touch matching if any.
          */
        inline def find(
          /**
          * The list of touch objects to search.
          */
        oTouchList: TouchList,
          /**
          * A touch object to find or a Touch.identifier that uniquely identifies the current finger in the touch
          * session.
          */
        oTouch: Touch
        ): js.UndefOr[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(oTouchList.asInstanceOf[js.Any], oTouch.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Object]]
        inline def find(
          /**
          * The list of touch objects to search.
          */
        oTouchList: TouchList,
          /**
          * A touch object to find or a Touch.identifier that uniquely identifies the current finger in the touch
          * session.
          */
        oTouch: Double
        ): js.UndefOr[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(oTouchList.asInstanceOf[js.Any], oTouch.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Object]]
      }
    }
    
    /**
      * The `sap.ui` namespace is the central OpenAjax compliant entry point for UI related JavaScript functionality
      * provided by SAP.
      */
    object ui {
      
      @JSGlobal("sap.ui")
      @js.native
      val ^ : js.Any = js.native
      
      object Device {
        
        /**
          * Contains information about the used browser.
          */
        object browser {
          
          /**
            * Enumeration containing the names of known browsers.
            */
          object BROWSER {
            
            @JSGlobal("sap.ui.Device.browser.BROWSER.ANDROID")
            @js.native
            val ANDROID: /* undefined */ Any = js.native
            
            @JSGlobal("sap.ui.Device.browser.BROWSER.CHROME")
            @js.native
            val CHROME: /* undefined */ Any = js.native
            
            @JSGlobal("sap.ui.Device.browser.BROWSER.FIREFOX")
            @js.native
            val FIREFOX: /* undefined */ Any = js.native
            
            @JSGlobal("sap.ui.Device.browser.BROWSER.SAFARI")
            @js.native
            val SAFARI: /* undefined */ Any = js.native
          }
          
          @JSGlobal("sap.ui.Device.browser.blink")
          @js.native
          val blink: Boolean = js.native
          
          @JSGlobal("sap.ui.Device.browser.chrome")
          @js.native
          val chrome: Boolean = js.native
          
          @JSGlobal("sap.ui.Device.browser.firefox")
          @js.native
          val firefox: Boolean = js.native
          
          @JSGlobal("sap.ui.Device.browser.fullscreen")
          @js.native
          val fullscreen: Boolean = js.native
          
          @JSGlobal("sap.ui.Device.browser.mobile")
          @js.native
          val mobile: Boolean = js.native
          
          @JSGlobal("sap.ui.Device.browser.mozilla")
          @js.native
          val mozilla: Boolean = js.native
          
          @JSGlobal("sap.ui.Device.browser.name")
          @js.native
          val name: String = js.native
          
          @JSGlobal("sap.ui.Device.browser.safari")
          @js.native
          val safari: Boolean = js.native
          
          @JSGlobal("sap.ui.Device.browser.version")
          @js.native
          val version: float = js.native
          
          @JSGlobal("sap.ui.Device.browser.versionStr")
          @js.native
          val versionStr: String = js.native
          
          @JSGlobal("sap.ui.Device.browser.webkit")
          @js.native
          val webkit: Boolean = js.native
          
          @JSGlobal("sap.ui.Device.browser.webview")
          @js.native
          val webview: Boolean = js.native
        }
        
        /**
          * Event API for screen width changes.
          *
          * This API is based on media queries but can also be used if media queries are not natively supported by
          * the used browser. In this case, the behavior of media queries is simulated by this API.
          *
          * There are several predefined {@link sap.ui.Device.media.RANGESETS range sets} available. Each of them
          * defines a set of intervals for the screen width (from small to large). Whenever the screen width changes
          * and the current screen width is in a different interval to the one before the change, the registered
          * event handlers for the range set are called.
          *
          * If needed, it is also possible to define a custom set of intervals.
          *
          * The following example shows a typical use case:
          * ```javascript
          *
          * function sizeChanged(mParams) {
          *     switch(mParams.name) {
          *         case "Phone":
          *             // Do what is needed for a little screen
          *             break;
          *         case "Tablet":
          *             // Do what is needed for a medium sized screen
          *             break;
          *         case "Desktop":
          *             // Do what is needed for a large screen
          *     }
          * }
          *
          * // Register an event handler to changes of the screen size
          * sap.ui.Device.media.attachHandler(sizeChanged, null, sap.ui.Device.media.RANGESETS.SAP_STANDARD);
          * // Do some initialization work based on the current size
          * sizeChanged(sap.ui.Device.media.getCurrentRange(sap.ui.Device.media.RANGESETS.SAP_STANDARD));
          * ```
          */
        object media {
          
          @JSGlobal("sap.ui.Device.media")
          @js.native
          val ^ : js.Any = js.native
          
          /**
            * Enumeration containing the names and settings of predefined screen width media query range sets.
            */
          object RANGESETS {
            
            @JSGlobal("sap.ui.Device.media.RANGESETS.SAP_3STEPS")
            @js.native
            val SAP_3STEPS: /* undefined */ Any = js.native
            
            @JSGlobal("sap.ui.Device.media.RANGESETS.SAP_4STEPS")
            @js.native
            val SAP_4STEPS: /* undefined */ Any = js.native
            
            @JSGlobal("sap.ui.Device.media.RANGESETS.SAP_6STEPS")
            @js.native
            val SAP_6STEPS: /* undefined */ Any = js.native
            
            @JSGlobal("sap.ui.Device.media.RANGESETS.SAP_STANDARD")
            @js.native
            val SAP_STANDARD: /* undefined */ Any = js.native
            
            @JSGlobal("sap.ui.Device.media.RANGESETS.SAP_STANDARD_EXTENDED")
            @js.native
            val SAP_STANDARD_EXTENDED: /* undefined */ Any = js.native
          }
          
          /**
            * Registers the given event handler to change events of the screen width based on the range set with the
            * specified name.
            *
            * The event is fired whenever the screen width changes and the current screen width is in a different interval
            * of the given range set than before the width change.
            *
            * The event handler is called with a single argument: a map `mParams` which provides the following information
            * about the entered interval:
            * 	 - `mParams.from`: The start value (inclusive) of the entered interval as a number
            * 	 - `mParams.to`: The end value (exclusive) range of the entered interval as a number or undefined for
            * 			the last interval (infinity)
            * 	 - `mParams.unit`: The unit used for the values above, e.g. `"px"`
            * 	 - `mParams.name`: The name of the entered interval, if available
            */
          inline def attachHandler(
            /**
            * The handler function to call when the event occurs. This function will be called in the context of the
            * `oListener` instance (if present) or on the `window` instance. A map with information about the entered
            * range set is provided as a single argument to the handler (see details above).
            */
          fnFunction: js.Function1[/* p1 */ To, Unit]
          ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("attachHandler")(fnFunction.asInstanceOf[js.Any]).asInstanceOf[Unit]
          inline def attachHandler(
            /**
            * The handler function to call when the event occurs. This function will be called in the context of the
            * `oListener` instance (if present) or on the `window` instance. A map with information about the entered
            * range set is provided as a single argument to the handler (see details above).
            */
          fnFunction: js.Function1[/* p1 */ To, Unit],
            /**
            * The object that wants to be notified when the event occurs (`this` context within the handler function).
            * If it is not specified, the handler function is called in the context of the `window`.
            */
          oListener: js.Object
          ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attachHandler")(fnFunction.asInstanceOf[js.Any], oListener.asInstanceOf[js.Any])).asInstanceOf[Unit]
          inline def attachHandler(
            /**
            * The handler function to call when the event occurs. This function will be called in the context of the
            * `oListener` instance (if present) or on the `window` instance. A map with information about the entered
            * range set is provided as a single argument to the handler (see details above).
            */
          fnFunction: js.Function1[/* p1 */ To, Unit],
            /**
            * The object that wants to be notified when the event occurs (`this` context within the handler function).
            * If it is not specified, the handler function is called in the context of the `window`.
            */
          oListener: js.Object,
            /**
            * The name of the range set to listen to. The range set must be initialized beforehand ({@link sap.ui.Device.media.initRangeSet}).
            * If no name is provided, the {@link sap.ui.Device.media.RANGESETS.SAP_STANDARD default range set} is used.
            */
          sName: String
          ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attachHandler")(fnFunction.asInstanceOf[js.Any], oListener.asInstanceOf[js.Any], sName.asInstanceOf[js.Any])).asInstanceOf[Unit]
          inline def attachHandler(
            /**
            * The handler function to call when the event occurs. This function will be called in the context of the
            * `oListener` instance (if present) or on the `window` instance. A map with information about the entered
            * range set is provided as a single argument to the handler (see details above).
            */
          fnFunction: js.Function1[/* p1 */ To, Unit],
            /**
            * The object that wants to be notified when the event occurs (`this` context within the handler function).
            * If it is not specified, the handler function is called in the context of the `window`.
            */
          oListener: Unit,
            /**
            * The name of the range set to listen to. The range set must be initialized beforehand ({@link sap.ui.Device.media.initRangeSet}).
            * If no name is provided, the {@link sap.ui.Device.media.RANGESETS.SAP_STANDARD default range set} is used.
            */
          sName: String
          ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attachHandler")(fnFunction.asInstanceOf[js.Any], oListener.asInstanceOf[js.Any], sName.asInstanceOf[js.Any])).asInstanceOf[Unit]
          
          /**
            * Removes a previously attached event handler from the change events of the screen width.
            *
            * The passed parameters must match those used for registration with {@link #.attachHandler} beforehand.
            */
          inline def detachHandler(/**
            * The handler function to detach from the event
            */
          fnFunction: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("detachHandler")(fnFunction.asInstanceOf[js.Any]).asInstanceOf[Unit]
          inline def detachHandler(
            /**
            * The handler function to detach from the event
            */
          fnFunction: js.Function,
            /**
            * The object that wanted to be notified when the event occurred
            */
          oListener: js.Object
          ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("detachHandler")(fnFunction.asInstanceOf[js.Any], oListener.asInstanceOf[js.Any])).asInstanceOf[Unit]
          inline def detachHandler(
            /**
            * The handler function to detach from the event
            */
          fnFunction: js.Function,
            /**
            * The object that wanted to be notified when the event occurred
            */
          oListener: js.Object,
            /**
            * The name of the range set to listen to. If no name is provided, the {@link sap.ui.Device.media.RANGESETS.SAP_STANDARD
            * default range set} is used.
            */
          sName: String
          ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("detachHandler")(fnFunction.asInstanceOf[js.Any], oListener.asInstanceOf[js.Any], sName.asInstanceOf[js.Any])).asInstanceOf[Unit]
          inline def detachHandler(
            /**
            * The handler function to detach from the event
            */
          fnFunction: js.Function,
            /**
            * The object that wanted to be notified when the event occurred
            */
          oListener: Unit,
            /**
            * The name of the range set to listen to. If no name is provided, the {@link sap.ui.Device.media.RANGESETS.SAP_STANDARD
            * default range set} is used.
            */
          sName: String
          ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("detachHandler")(fnFunction.asInstanceOf[js.Any], oListener.asInstanceOf[js.Any], sName.asInstanceOf[js.Any])).asInstanceOf[Unit]
          
          /**
            * Returns information about the current active range of the range set with the given name.
            *
            * If the optional parameter `iWidth` is given, the active range will be determined for that width, otherwise
            * it is determined for the current window size.
            *
            * @returns Information about the current active interval of the range set. The returned object has the
            * same structure as the argument of the event handlers ({@link sap.ui.Device.media.attachHandler})
            */
          inline def getCurrentRange(
            /**
            * The name of the range set. The range set must be initialized beforehand ({@link sap.ui.Device.media.initRangeSet})
            */
          sName: String
          ): To = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentRange")(sName.asInstanceOf[js.Any]).asInstanceOf[To]
          inline def getCurrentRange(
            /**
            * The name of the range set. The range set must be initialized beforehand ({@link sap.ui.Device.media.initRangeSet})
            */
          sName: String,
            /**
            * An optional width, based on which the range should be determined; If `iWidth` is not a number, the window
            * size will be used.
            */
          iWidth: int
          ): To = (^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentRange")(sName.asInstanceOf[js.Any], iWidth.asInstanceOf[js.Any])).asInstanceOf[To]
          
          /**
            * Returns `true` if a range set with the given name is already initialized.
            *
            * @returns Returns `true` if a range set with the given name is already initialized
            */
          inline def hasRangeSet(/**
            * The name of the range set.
            */
          sName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasRangeSet")(sName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
          
          /**
            * Initializes a screen width media query range set.
            *
            * This initialization step makes the range set ready to be used for one of the other functions in namespace
            * `sap.ui.Device.media`. The most important {@link sap.ui.Device.media.RANGESETS predefined range sets}
            * are initialized automatically.
            *
            * To make a not yet initialized {@link sap.ui.Device.media.RANGESETS predefined range set} ready to be
            * used, call this function with the name of the range set to be initialized:
            * ```javascript
            *
            * sap.ui.Device.media.initRangeSet(sap.ui.Device.media.RANGESETS.SAP_3STEPS);
            * ```
            *
            *
            * Alternatively it is possible to define custom range sets as shown in the following example:
            * ```javascript
            *
            * sap.ui.Device.media.initRangeSet("MyRangeSet", [200, 400], "px", ["Small", "Medium", "Large"]);
            * ```
            *  This example defines the following named ranges:
            * 	 - `"Small"`: For screens smaller than 200 pixels.
            * 	 - `"Medium"`: For screens greater than or equal to 200 pixels and smaller than 400 pixels.
            * 	 - `"Large"`: For screens greater than or equal to 400 pixels.  The range names are optional. If
            * 			they are specified a CSS class (e.g. `sapUiMedia-MyRangeSet-Small`) is also added to the document root
            * 			depending on the current active range. This can be suppressed via parameter `bSuppressClasses`.
            */
          inline def initRangeSet(
            /**
            * The name of the range set to be initialized - either a {@link sap.ui.Device.media.RANGESETS predefined}
            * or custom one. The name must be a valid id and consist only of letters and numeric digits.
            */
          sName: String
          ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initRangeSet")(sName.asInstanceOf[js.Any]).asInstanceOf[Unit]
          inline def initRangeSet(
            /**
            * The name of the range set to be initialized - either a {@link sap.ui.Device.media.RANGESETS predefined}
            * or custom one. The name must be a valid id and consist only of letters and numeric digits.
            */
          sName: String,
            /**
            * The range borders
            */
          aRangeBorders: js.Array[int]
          ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initRangeSet")(sName.asInstanceOf[js.Any], aRangeBorders.asInstanceOf[js.Any])).asInstanceOf[Unit]
          inline def initRangeSet(
            /**
            * The name of the range set to be initialized - either a {@link sap.ui.Device.media.RANGESETS predefined}
            * or custom one. The name must be a valid id and consist only of letters and numeric digits.
            */
          sName: String,
            /**
            * The range borders
            */
          aRangeBorders: js.Array[int],
            /**
            * The unit which should be used for the values given in `aRangeBorders`. The allowed values are `"px"`
            * (default), `"em"` or `"rem"`
            */
          sUnit: String
          ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initRangeSet")(sName.asInstanceOf[js.Any], aRangeBorders.asInstanceOf[js.Any], sUnit.asInstanceOf[js.Any])).asInstanceOf[Unit]
          inline def initRangeSet(
            /**
            * The name of the range set to be initialized - either a {@link sap.ui.Device.media.RANGESETS predefined}
            * or custom one. The name must be a valid id and consist only of letters and numeric digits.
            */
          sName: String,
            /**
            * The range borders
            */
          aRangeBorders: js.Array[int],
            /**
            * The unit which should be used for the values given in `aRangeBorders`. The allowed values are `"px"`
            * (default), `"em"` or `"rem"`
            */
          sUnit: String,
            /**
            * The names of the ranges. The names must be a valid id and consist only of letters and digits. If names
            * are specified, CSS classes are also added to the document root as described above. This behavior can
            * be switched off explicitly by using `bSuppressClasses`. **Note:** `aRangeBorders` with `n` entries define
            * `n+1` ranges. Therefore `n+1` names must be provided.
            */
          aRangeNames: js.Array[String]
          ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initRangeSet")(sName.asInstanceOf[js.Any], aRangeBorders.asInstanceOf[js.Any], sUnit.asInstanceOf[js.Any], aRangeNames.asInstanceOf[js.Any])).asInstanceOf[Unit]
          inline def initRangeSet(
            /**
            * The name of the range set to be initialized - either a {@link sap.ui.Device.media.RANGESETS predefined}
            * or custom one. The name must be a valid id and consist only of letters and numeric digits.
            */
          sName: String,
            /**
            * The range borders
            */
          aRangeBorders: js.Array[int],
            /**
            * The unit which should be used for the values given in `aRangeBorders`. The allowed values are `"px"`
            * (default), `"em"` or `"rem"`
            */
          sUnit: String,
            /**
            * The names of the ranges. The names must be a valid id and consist only of letters and digits. If names
            * are specified, CSS classes are also added to the document root as described above. This behavior can
            * be switched off explicitly by using `bSuppressClasses`. **Note:** `aRangeBorders` with `n` entries define
            * `n+1` ranges. Therefore `n+1` names must be provided.
            */
          aRangeNames: js.Array[String],
            /**
            * Whether or not writing of CSS classes to the document root should be suppressed when `aRangeNames` are
            * provided
            */
          bSuppressClasses: Boolean
          ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initRangeSet")(sName.asInstanceOf[js.Any], aRangeBorders.asInstanceOf[js.Any], sUnit.asInstanceOf[js.Any], aRangeNames.asInstanceOf[js.Any], bSuppressClasses.asInstanceOf[js.Any])).asInstanceOf[Unit]
          inline def initRangeSet(
            /**
            * The name of the range set to be initialized - either a {@link sap.ui.Device.media.RANGESETS predefined}
            * or custom one. The name must be a valid id and consist only of letters and numeric digits.
            */
          sName: String,
            /**
            * The range borders
            */
          aRangeBorders: js.Array[int],
            /**
            * The unit which should be used for the values given in `aRangeBorders`. The allowed values are `"px"`
            * (default), `"em"` or `"rem"`
            */
          sUnit: String,
            /**
            * The names of the ranges. The names must be a valid id and consist only of letters and digits. If names
            * are specified, CSS classes are also added to the document root as described above. This behavior can
            * be switched off explicitly by using `bSuppressClasses`. **Note:** `aRangeBorders` with `n` entries define
            * `n+1` ranges. Therefore `n+1` names must be provided.
            */
          aRangeNames: Unit,
            /**
            * Whether or not writing of CSS classes to the document root should be suppressed when `aRangeNames` are
            * provided
            */
          bSuppressClasses: Boolean
          ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initRangeSet")(sName.asInstanceOf[js.Any], aRangeBorders.asInstanceOf[js.Any], sUnit.asInstanceOf[js.Any], aRangeNames.asInstanceOf[js.Any], bSuppressClasses.asInstanceOf[js.Any])).asInstanceOf[Unit]
          inline def initRangeSet(
            /**
            * The name of the range set to be initialized - either a {@link sap.ui.Device.media.RANGESETS predefined}
            * or custom one. The name must be a valid id and consist only of letters and numeric digits.
            */
          sName: String,
            /**
            * The range borders
            */
          aRangeBorders: js.Array[int],
            /**
            * The unit which should be used for the values given in `aRangeBorders`. The allowed values are `"px"`
            * (default), `"em"` or `"rem"`
            */
          sUnit: Unit,
            /**
            * The names of the ranges. The names must be a valid id and consist only of letters and digits. If names
            * are specified, CSS classes are also added to the document root as described above. This behavior can
            * be switched off explicitly by using `bSuppressClasses`. **Note:** `aRangeBorders` with `n` entries define
            * `n+1` ranges. Therefore `n+1` names must be provided.
            */
          aRangeNames: js.Array[String]
          ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initRangeSet")(sName.asInstanceOf[js.Any], aRangeBorders.asInstanceOf[js.Any], sUnit.asInstanceOf[js.Any], aRangeNames.asInstanceOf[js.Any])).asInstanceOf[Unit]
          inline def initRangeSet(
            /**
            * The name of the range set to be initialized - either a {@link sap.ui.Device.media.RANGESETS predefined}
            * or custom one. The name must be a valid id and consist only of letters and numeric digits.
            */
          sName: String,
            /**
            * The range borders
            */
          aRangeBorders: js.Array[int],
            /**
            * The unit which should be used for the values given in `aRangeBorders`. The allowed values are `"px"`
            * (default), `"em"` or `"rem"`
            */
          sUnit: Unit,
            /**
            * The names of the ranges. The names must be a valid id and consist only of letters and digits. If names
            * are specified, CSS classes are also added to the document root as described above. This behavior can
            * be switched off explicitly by using `bSuppressClasses`. **Note:** `aRangeBorders` with `n` entries define
            * `n+1` ranges. Therefore `n+1` names must be provided.
            */
          aRangeNames: js.Array[String],
            /**
            * Whether or not writing of CSS classes to the document root should be suppressed when `aRangeNames` are
            * provided
            */
          bSuppressClasses: Boolean
          ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initRangeSet")(sName.asInstanceOf[js.Any], aRangeBorders.asInstanceOf[js.Any], sUnit.asInstanceOf[js.Any], aRangeNames.asInstanceOf[js.Any], bSuppressClasses.asInstanceOf[js.Any])).asInstanceOf[Unit]
          inline def initRangeSet(
            /**
            * The name of the range set to be initialized - either a {@link sap.ui.Device.media.RANGESETS predefined}
            * or custom one. The name must be a valid id and consist only of letters and numeric digits.
            */
          sName: String,
            /**
            * The range borders
            */
          aRangeBorders: js.Array[int],
            /**
            * The unit which should be used for the values given in `aRangeBorders`. The allowed values are `"px"`
            * (default), `"em"` or `"rem"`
            */
          sUnit: Unit,
            /**
            * The names of the ranges. The names must be a valid id and consist only of letters and digits. If names
            * are specified, CSS classes are also added to the document root as described above. This behavior can
            * be switched off explicitly by using `bSuppressClasses`. **Note:** `aRangeBorders` with `n` entries define
            * `n+1` ranges. Therefore `n+1` names must be provided.
            */
          aRangeNames: Unit,
            /**
            * Whether or not writing of CSS classes to the document root should be suppressed when `aRangeNames` are
            * provided
            */
          bSuppressClasses: Boolean
          ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initRangeSet")(sName.asInstanceOf[js.Any], aRangeBorders.asInstanceOf[js.Any], sUnit.asInstanceOf[js.Any], aRangeNames.asInstanceOf[js.Any], bSuppressClasses.asInstanceOf[js.Any])).asInstanceOf[Unit]
          inline def initRangeSet(
            /**
            * The name of the range set to be initialized - either a {@link sap.ui.Device.media.RANGESETS predefined}
            * or custom one. The name must be a valid id and consist only of letters and numeric digits.
            */
          sName: String,
            /**
            * The range borders
            */
          aRangeBorders: Unit,
            /**
            * The unit which should be used for the values given in `aRangeBorders`. The allowed values are `"px"`
            * (default), `"em"` or `"rem"`
            */
          sUnit: String
          ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initRangeSet")(sName.asInstanceOf[js.Any], aRangeBorders.asInstanceOf[js.Any], sUnit.asInstanceOf[js.Any])).asInstanceOf[Unit]
          inline def initRangeSet(
            /**
            * The name of the range set to be initialized - either a {@link sap.ui.Device.media.RANGESETS predefined}
            * or custom one. The name must be a valid id and consist only of letters and numeric digits.
            */
          sName: String,
            /**
            * The range borders
            */
          aRangeBorders: Unit,
            /**
            * The unit which should be used for the values given in `aRangeBorders`. The allowed values are `"px"`
            * (default), `"em"` or `"rem"`
            */
          sUnit: String,
            /**
            * The names of the ranges. The names must be a valid id and consist only of letters and digits. If names
            * are specified, CSS classes are also added to the document root as described above. This behavior can
            * be switched off explicitly by using `bSuppressClasses`. **Note:** `aRangeBorders` with `n` entries define
            * `n+1` ranges. Therefore `n+1` names must be provided.
            */
          aRangeNames: js.Array[String]
          ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initRangeSet")(sName.asInstanceOf[js.Any], aRangeBorders.asInstanceOf[js.Any], sUnit.asInstanceOf[js.Any], aRangeNames.asInstanceOf[js.Any])).asInstanceOf[Unit]
          inline def initRangeSet(
            /**
            * The name of the range set to be initialized - either a {@link sap.ui.Device.media.RANGESETS predefined}
            * or custom one. The name must be a valid id and consist only of letters and numeric digits.
            */
          sName: String,
            /**
            * The range borders
            */
          aRangeBorders: Unit,
            /**
            * The unit which should be used for the values given in `aRangeBorders`. The allowed values are `"px"`
            * (default), `"em"` or `"rem"`
            */
          sUnit: String,
            /**
            * The names of the ranges. The names must be a valid id and consist only of letters and digits. If names
            * are specified, CSS classes are also added to the document root as described above. This behavior can
            * be switched off explicitly by using `bSuppressClasses`. **Note:** `aRangeBorders` with `n` entries define
            * `n+1` ranges. Therefore `n+1` names must be provided.
            */
          aRangeNames: js.Array[String],
            /**
            * Whether or not writing of CSS classes to the document root should be suppressed when `aRangeNames` are
            * provided
            */
          bSuppressClasses: Boolean
          ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initRangeSet")(sName.asInstanceOf[js.Any], aRangeBorders.asInstanceOf[js.Any], sUnit.asInstanceOf[js.Any], aRangeNames.asInstanceOf[js.Any], bSuppressClasses.asInstanceOf[js.Any])).asInstanceOf[Unit]
          inline def initRangeSet(
            /**
            * The name of the range set to be initialized - either a {@link sap.ui.Device.media.RANGESETS predefined}
            * or custom one. The name must be a valid id and consist only of letters and numeric digits.
            */
          sName: String,
            /**
            * The range borders
            */
          aRangeBorders: Unit,
            /**
            * The unit which should be used for the values given in `aRangeBorders`. The allowed values are `"px"`
            * (default), `"em"` or `"rem"`
            */
          sUnit: String,
            /**
            * The names of the ranges. The names must be a valid id and consist only of letters and digits. If names
            * are specified, CSS classes are also added to the document root as described above. This behavior can
            * be switched off explicitly by using `bSuppressClasses`. **Note:** `aRangeBorders` with `n` entries define
            * `n+1` ranges. Therefore `n+1` names must be provided.
            */
          aRangeNames: Unit,
            /**
            * Whether or not writing of CSS classes to the document root should be suppressed when `aRangeNames` are
            * provided
            */
          bSuppressClasses: Boolean
          ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initRangeSet")(sName.asInstanceOf[js.Any], aRangeBorders.asInstanceOf[js.Any], sUnit.asInstanceOf[js.Any], aRangeNames.asInstanceOf[js.Any], bSuppressClasses.asInstanceOf[js.Any])).asInstanceOf[Unit]
          inline def initRangeSet(
            /**
            * The name of the range set to be initialized - either a {@link sap.ui.Device.media.RANGESETS predefined}
            * or custom one. The name must be a valid id and consist only of letters and numeric digits.
            */
          sName: String,
            /**
            * The range borders
            */
          aRangeBorders: Unit,
            /**
            * The unit which should be used for the values given in `aRangeBorders`. The allowed values are `"px"`
            * (default), `"em"` or `"rem"`
            */
          sUnit: Unit,
            /**
            * The names of the ranges. The names must be a valid id and consist only of letters and digits. If names
            * are specified, CSS classes are also added to the document root as described above. This behavior can
            * be switched off explicitly by using `bSuppressClasses`. **Note:** `aRangeBorders` with `n` entries define
            * `n+1` ranges. Therefore `n+1` names must be provided.
            */
          aRangeNames: js.Array[String]
          ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initRangeSet")(sName.asInstanceOf[js.Any], aRangeBorders.asInstanceOf[js.Any], sUnit.asInstanceOf[js.Any], aRangeNames.asInstanceOf[js.Any])).asInstanceOf[Unit]
          inline def initRangeSet(
            /**
            * The name of the range set to be initialized - either a {@link sap.ui.Device.media.RANGESETS predefined}
            * or custom one. The name must be a valid id and consist only of letters and numeric digits.
            */
          sName: String,
            /**
            * The range borders
            */
          aRangeBorders: Unit,
            /**
            * The unit which should be used for the values given in `aRangeBorders`. The allowed values are `"px"`
            * (default), `"em"` or `"rem"`
            */
          sUnit: Unit,
            /**
            * The names of the ranges. The names must be a valid id and consist only of letters and digits. If names
            * are specified, CSS classes are also added to the document root as described above. This behavior can
            * be switched off explicitly by using `bSuppressClasses`. **Note:** `aRangeBorders` with `n` entries define
            * `n+1` ranges. Therefore `n+1` names must be provided.
            */
          aRangeNames: js.Array[String],
            /**
            * Whether or not writing of CSS classes to the document root should be suppressed when `aRangeNames` are
            * provided
            */
          bSuppressClasses: Boolean
          ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initRangeSet")(sName.asInstanceOf[js.Any], aRangeBorders.asInstanceOf[js.Any], sUnit.asInstanceOf[js.Any], aRangeNames.asInstanceOf[js.Any], bSuppressClasses.asInstanceOf[js.Any])).asInstanceOf[Unit]
          inline def initRangeSet(
            /**
            * The name of the range set to be initialized - either a {@link sap.ui.Device.media.RANGESETS predefined}
            * or custom one. The name must be a valid id and consist only of letters and numeric digits.
            */
          sName: String,
            /**
            * The range borders
            */
          aRangeBorders: Unit,
            /**
            * The unit which should be used for the values given in `aRangeBorders`. The allowed values are `"px"`
            * (default), `"em"` or `"rem"`
            */
          sUnit: Unit,
            /**
            * The names of the ranges. The names must be a valid id and consist only of letters and digits. If names
            * are specified, CSS classes are also added to the document root as described above. This behavior can
            * be switched off explicitly by using `bSuppressClasses`. **Note:** `aRangeBorders` with `n` entries define
            * `n+1` ranges. Therefore `n+1` names must be provided.
            */
          aRangeNames: Unit,
            /**
            * Whether or not writing of CSS classes to the document root should be suppressed when `aRangeNames` are
            * provided
            */
          bSuppressClasses: Boolean
          ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initRangeSet")(sName.asInstanceOf[js.Any], aRangeBorders.asInstanceOf[js.Any], sUnit.asInstanceOf[js.Any], aRangeNames.asInstanceOf[js.Any], bSuppressClasses.asInstanceOf[js.Any])).asInstanceOf[Unit]
          
          /**
            * Removes a previously initialized range set and detaches all registered handlers.
            *
            * Only custom range sets can be removed via this function. Initialized predefined range sets ({@link sap.ui.Device.media.RANGESETS})
            * cannot be removed.
            */
          inline def removeRangeSet(/**
            * The name of the range set which should be removed.
            */
          sName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeRangeSet")(sName.asInstanceOf[js.Any]).asInstanceOf[Unit]
        }
        
        /**
          * Common API for orientation change notifications across all platforms.
          *
          * For browsers or devices that do not provide native support for orientation change events the API simulates
          * them based on the ratio of the document's width and height.
          */
        object orientation {
          
          @JSGlobal("sap.ui.Device.orientation")
          @js.native
          val ^ : js.Any = js.native
          
          /**
            * Registers the given event handler to orientation change events of the document's window.
            *
            * The event is fired whenever the screen orientation changes and the width of the document's window becomes
            * greater than its height or the other way round.
            *
            * The event handler is called with a single argument: a map `mParams` which provides the following information:
            *
            * 	 - `mParams.landscape`: If this flag is set to `true`, the screen is currently in landscape mode, otherwise
            * 			in portrait mode.
            */
          inline def attachHandler(
            /**
            * The handler function to call when the event occurs. This function will be called in the context of the
            * `oListener` instance (if present) or on the `window` instance. A map with information about the orientation
            * is provided as a single argument to the handler (see details above).
            */
          fnFunction: js.Function
          ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("attachHandler")(fnFunction.asInstanceOf[js.Any]).asInstanceOf[Unit]
          inline def attachHandler(
            /**
            * The handler function to call when the event occurs. This function will be called in the context of the
            * `oListener` instance (if present) or on the `window` instance. A map with information about the orientation
            * is provided as a single argument to the handler (see details above).
            */
          fnFunction: js.Function,
            /**
            * The object that wants to be notified when the event occurs (`this` context within the handler function).
            * If it is not specified, the handler function is called in the context of the `window`.
            */
          oListener: js.Object
          ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attachHandler")(fnFunction.asInstanceOf[js.Any], oListener.asInstanceOf[js.Any])).asInstanceOf[Unit]
          
          /**
            * Removes a previously attached event handler from the orientation change events.
            *
            * The passed parameters must match those used for registration with {@link #.attachHandler} beforehand.
            */
          inline def detachHandler(/**
            * The handler function to detach from the event
            */
          fnFunction: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("detachHandler")(fnFunction.asInstanceOf[js.Any]).asInstanceOf[Unit]
          inline def detachHandler(
            /**
            * The handler function to detach from the event
            */
          fnFunction: js.Function,
            /**
            * The object that wanted to be notified when the event occurred
            */
          oListener: js.Object
          ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("detachHandler")(fnFunction.asInstanceOf[js.Any], oListener.asInstanceOf[js.Any])).asInstanceOf[Unit]
          
          @JSGlobal("sap.ui.Device.orientation.landscape")
          @js.native
          val landscape: Boolean = js.native
          
          @JSGlobal("sap.ui.Device.orientation.portrait")
          @js.native
          val portrait: Boolean = js.native
        }
        
        /**
          * Contains information about the operating system of the Device.
          */
        object os {
          
          /**
            * Enumeration containing the names of known operating systems.
            */
          object OS {
            
            @JSGlobal("sap.ui.Device.os.OS.ANDROID")
            @js.native
            val ANDROID: /* undefined */ Any = js.native
            
            @JSGlobal("sap.ui.Device.os.OS.IOS")
            @js.native
            val IOS: /* undefined */ Any = js.native
            
            @JSGlobal("sap.ui.Device.os.OS.LINUX")
            @js.native
            val LINUX: /* undefined */ Any = js.native
            
            @JSGlobal("sap.ui.Device.os.OS.MACINTOSH")
            @js.native
            val MACINTOSH: /* undefined */ Any = js.native
            
            @JSGlobal("sap.ui.Device.os.OS.WINDOWS")
            @js.native
            val WINDOWS: /* undefined */ Any = js.native
          }
          
          @JSGlobal("sap.ui.Device.os.android")
          @js.native
          val android: Boolean = js.native
          
          @JSGlobal("sap.ui.Device.os.ios")
          @js.native
          val ios: Boolean = js.native
          
          @JSGlobal("sap.ui.Device.os.linux")
          @js.native
          val linux: Boolean = js.native
          
          @JSGlobal("sap.ui.Device.os.macintosh")
          @js.native
          val macintosh: Boolean = js.native
          
          @JSGlobal("sap.ui.Device.os.name")
          @js.native
          val name: String = js.native
          
          @JSGlobal("sap.ui.Device.os.version")
          @js.native
          val version: float = js.native
          
          @JSGlobal("sap.ui.Device.os.versionStr")
          @js.native
          val versionStr: String = js.native
          
          @JSGlobal("sap.ui.Device.os.windows")
          @js.native
          val windows: Boolean = js.native
        }
        
        /**
          * Common API for document window size change notifications across all platforms.
          */
        object resize {
          
          @JSGlobal("sap.ui.Device.resize")
          @js.native
          val ^ : js.Any = js.native
          
          /**
            * Registers the given event handler to resize change events of the document's window.
            *
            * The event is fired whenever the document's window size changes.
            *
            * The event handler is called with a single argument: a map `mParams` which provides the following information:
            *
            * 	 - `mParams.height`: The height of the document's window in pixels.
            * 	 - `mParams.width`: The width of the document's window in pixels.
            */
          inline def attachHandler(
            /**
            * The handler function to call when the event occurs. This function will be called in the context of the
            * `oListener` instance (if present) or on the `window` instance. A map with information about the size
            * is provided as a single argument to the handler (see details above).
            */
          fnFunction: js.Function
          ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("attachHandler")(fnFunction.asInstanceOf[js.Any]).asInstanceOf[Unit]
          inline def attachHandler(
            /**
            * The handler function to call when the event occurs. This function will be called in the context of the
            * `oListener` instance (if present) or on the `window` instance. A map with information about the size
            * is provided as a single argument to the handler (see details above).
            */
          fnFunction: js.Function,
            /**
            * The object that wants to be notified when the event occurs (`this` context within the handler function).
            * If it is not specified, the handler function is called in the context of the `window`.
            */
          oListener: js.Object
          ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attachHandler")(fnFunction.asInstanceOf[js.Any], oListener.asInstanceOf[js.Any])).asInstanceOf[Unit]
          
          /**
            * Removes a previously attached event handler from the resize events.
            *
            * The passed parameters must match those used for registration with {@link #.attachHandler} beforehand.
            */
          inline def detachHandler(/**
            * The handler function to detach from the event
            */
          fnFunction: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("detachHandler")(fnFunction.asInstanceOf[js.Any]).asInstanceOf[Unit]
          inline def detachHandler(
            /**
            * The handler function to detach from the event
            */
          fnFunction: js.Function,
            /**
            * The object that wanted to be notified when the event occurred
            */
          oListener: js.Object
          ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("detachHandler")(fnFunction.asInstanceOf[js.Any], oListener.asInstanceOf[js.Any])).asInstanceOf[Unit]
          
          @JSGlobal("sap.ui.Device.resize.height")
          @js.native
          val height: int = js.native
          
          @JSGlobal("sap.ui.Device.resize.width")
          @js.native
          val width: int = js.native
        }
        
        /**
          * Contains information about detected capabilities of the used browser or Device.
          */
        object support {
          
          @JSGlobal("sap.ui.Device.support.matchmedia")
          @js.native
          val matchmedia: Boolean = js.native
          
          @JSGlobal("sap.ui.Device.support.matchmedialistener")
          @js.native
          val matchmedialistener: Boolean = js.native
          
          @JSGlobal("sap.ui.Device.support.orientation")
          @js.native
          val orientation: Boolean = js.native
          
          @JSGlobal("sap.ui.Device.support.pointer")
          @js.native
          val pointer: Boolean = js.native
          
          @JSGlobal("sap.ui.Device.support.retina")
          @js.native
          val retina: Boolean = js.native
          
          @JSGlobal("sap.ui.Device.support.touch")
          @js.native
          val touch: Boolean = js.native
          
          @JSGlobal("sap.ui.Device.support.websocket")
          @js.native
          val websocket: Boolean = js.native
        }
        
        /**
          * Provides a basic categorization of the used device based on various indicators.
          *
          * These indicators are, for example, the support of touch events, the used operating system, and the user
          * agent of the browser.
          *
          * **Note:** There is no easy way to precisely determine the used device from the information provided by
          * the browser. We therefore rely especially on the user agent. In combination with given device capabilities,
          * it is therefore possible that multiple flags are set to `true`. This is mostly the case for desktop devices
          * with touch capability, and for mobile devices requesting web pages as desktop pages.
          */
        object system {
          
          @JSGlobal("sap.ui.Device.system.combi")
          @js.native
          val combi: Boolean = js.native
          
          @JSGlobal("sap.ui.Device.system.desktop")
          @js.native
          val desktop: Boolean = js.native
          
          @JSGlobal("sap.ui.Device.system.phone")
          @js.native
          val phone: Boolean = js.native
          
          @JSGlobal("sap.ui.Device.system.tablet")
          @js.native
          val tablet: Boolean = js.native
        }
      }
      
      object component {
        
        /**
          * @SINCE 1.15.0
          * @deprecated (since 1.56) - use {@link sap.ui.core.Component.get Component.get} or {@link sap.ui.core.Component.create
          * Component.create} instead. Note: {@link sap.ui.core.Component.create Component.create} does not support
          * synchronous loading or the deprecated options ***manifestFirst*** and ***manifestUrl***.
          *
          * Creates a new instance of a `Component` or returns the instance of an existing `Component`.
          *
          * If you want to look up an existing `Component` you can call this function with a Component ID as parameter:
          *
          * ```javascript
          *
          *   var oComponent = sap.ui.component(sComponentId);
          * ```
          *
          *
          * To create a new instance of a component you pass a component configuration object into this function:
          *
          * ```javascript
          *
          *   var oComponent = sap.ui.component({
          *     name: "my.Component",
          *     url: "my/component/location",
          *     id: "myCompId1"
          *   });
          * ```
          *
          *
          * @returns the Component instance or a Promise in case of asynchronous loading
          */
        inline def apply(
          /**
          * ID of an existing Component or the configuration object to create the Component
          */
        vConfig: String
        ): typingsJapgolly.openui5.sapUiCoreComponentMod.default | js.Promise[Any] = ^.asInstanceOf[js.Dynamic].apply(vConfig.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.openui5.sapUiCoreComponentMod.default | js.Promise[Any]]
        inline def apply(
          /**
          * ID of an existing Component or the configuration object to create the Component
          */
        vConfig: HandleValidation
        ): typingsJapgolly.openui5.sapUiCoreComponentMod.default | js.Promise[Any] = ^.asInstanceOf[js.Dynamic].apply(vConfig.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.openui5.sapUiCoreComponentMod.default | js.Promise[Any]]
        
        @JSGlobal("sap.ui.component")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * @SINCE 1.16.3
          * @deprecated (since 1.56) - use {@link sap.ui.core.Component.load}
          *
          * Load a component without instantiating it.
          *
          * Provides support for loading components asynchronously by setting `oConfig.async` to true. In that case,
          * the method returns a JavaScript 6 Promise that will be fulfilled with the component class after loading.
          *
          * Using `async = true` doesn't necessarily mean that no more synchronous loading occurs. Both the framework
          * as well as component implementations might still execute synchronous requests. The contract for `async
          * = true` just allows to use async calls.
          *
          * When a manifest.json is referenced in oConfig this manifest is not used for the derived instances of
          * the Component class. The manifest/manifest url must be provided for every instance explicitly.
          *
          * Since 1.27.0, when asynchronous loading is used, additional `asyncHints` can be provided. This parameter
          * is only used internally by the UI5 framework and compatibility cannot be guaranteed. The parameter must
          * not be used in productive code, except in code delivered by the UI5 teams.
          *
          *
          * 	 - `oConfig.asyncHints.components : string[]`a list of components needed by the current component and
          * 			its subcomponents The framework will try to preload these components (their Component-preload.js) asynchronously,
          * 			errors will be ignored. Please note that the framework has no knowledge about whether a Component provides
          * 			a preload file or whether it is bundled in some library preload. If Components are listed in the hints
          * 			section, they will be preloaded.
          * 	 - `oConfig.asyncHints.libs : string[]`libraries needed by the Component and its subcomponents. The
          * 			framework will asynchronously load those libraries, if they're not loaded yet.
          * 	 - `oConfig.asyncHints.preloadBundles : string[]`a list of additional preload bundles The framework
          * 			will try to load these bundles asynchronously before requiring the Component, errors will be ignored.
          * 			The named modules must only represent preload bundles. If they are normal modules, their dependencies
          * 			will be loaded with the normal synchronous request mechanism and performance might degrade. `oConfig.asyncHints.preloadOnly
          * 			: boolean (default: false)` whether only the preloads should be done, but not the loading of the Component
          * 			controller class itself.
          *
          * If Components and/or libraries are listed in the hints section, all the corresponding preload files will
          * be requested in parallel. The constructor class will only be required after all of them are rejected
          * or resolved. Instead of specifying just the name of a component or library in the hints, an object might
          * be given that contains a mandatory `name` property and, optionally, an `url` that will be used for a
          * `registerModulePath` and/or a `lazy` property. When `lazy` is set to a truthy value, only a necessary
          * `registerModulePath` will be executed, but the corresponding component or lib won't be preloaded. For
          * preload bundles, also an object might be given instead of a simple name, but there only the `url` property
          * is supported, not the `lazy` property.
          *
          * Note: so far, only the requests for the preload files (library and/or component) are executed asynchronously.
          * If a preload is deactivated by configuration (e.g. debug mode), then remaining requests still might be
          * synchronous.
          *
          * @returns Constructor of the component class or a Promise that will be fulfilled with the same
          */
        inline def load(
          /**
          * Configuration object describing the Component to be loaded. See {@link sap.ui.component} for more information.
          */
        oConfig: js.Object
        ): js.Function | js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(oConfig.asInstanceOf[js.Any]).asInstanceOf[js.Function | js.Promise[Any]]
      }
      
      /**
        * @deprecated (since 1.56) - use {@link sap.ui.core.mvc.Controller.extend Controller.extend} to define
        * the controller class and {@link sap.ui.core.mvc.Controller.create Controller.create} to create controller
        * instances. For further information, see {@link sap.ui.core.mvc.Controller}.
        *
        * Defines a controller class or creates an instance of an already defined controller class.
        *
        * When a name and a controller implementation object is given, a new controller class of the given name
        * is created. The members of the implementation object will be copied into each new instance of that controller
        * class (shallow copy). **Note**: as the members are shallow copied, controller instances will share all
        * object values. This might or might not be what applications expect.
        *
        * If only a name is given, a new instance of the named controller class is returned.
        *
        * @returns void, the new controller instance or a Promise resolving with the controller in async case
        */
      inline def controller(/**
        * The controller name
        */
      sName: String): Unit | typingsJapgolly.openui5.sapUiCoreMvcControllerMod.default | js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("controller")(sName.asInstanceOf[js.Any]).asInstanceOf[Unit | typingsJapgolly.openui5.sapUiCoreMvcControllerMod.default | js.Promise[Any]]
      inline def controller(
        /**
        * The controller name
        */
      sName: String,
        /**
        * An object literal defining the methods and properties of the controller
        */
      oControllerImpl: js.Object
      ): Unit | typingsJapgolly.openui5.sapUiCoreMvcControllerMod.default | js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("controller")(sName.asInstanceOf[js.Any], oControllerImpl.asInstanceOf[js.Any])).asInstanceOf[Unit | typingsJapgolly.openui5.sapUiCoreMvcControllerMod.default | js.Promise[Any]]
      inline def controller(
        /**
        * The controller name
        */
      sName: String,
        /**
        * An object literal defining the methods and properties of the controller
        */
      oControllerImpl: js.Object,
        /**
        * Decides whether the controller gets loaded asynchronously or not
        */
      bAsync: Boolean
      ): Unit | typingsJapgolly.openui5.sapUiCoreMvcControllerMod.default | js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("controller")(sName.asInstanceOf[js.Any], oControllerImpl.asInstanceOf[js.Any], bAsync.asInstanceOf[js.Any])).asInstanceOf[Unit | typingsJapgolly.openui5.sapUiCoreMvcControllerMod.default | js.Promise[Any]]
      inline def controller(
        /**
        * The controller name
        */
      sName: String,
        /**
        * An object literal defining the methods and properties of the controller
        */
      oControllerImpl: Unit,
        /**
        * Decides whether the controller gets loaded asynchronously or not
        */
      bAsync: Boolean
      ): Unit | typingsJapgolly.openui5.sapUiCoreMvcControllerMod.default | js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("controller")(sName.asInstanceOf[js.Any], oControllerImpl.asInstanceOf[js.Any], bAsync.asInstanceOf[js.Any])).asInstanceOf[Unit | typingsJapgolly.openui5.sapUiCoreMvcControllerMod.default | js.Promise[Any]]
      
      /**
        * @SINCE 0.8
        *
        * The SAPUI5 Core Runtime.
        *
        * Contains the UI5 Core and all its components, base classes for Controls, Components and the Model View
        * Controller classes.
        */
      object core {
        
        @JSGlobal("sap.ui.core")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * Applies the support for custom style classes on the prototype of a `sap.ui.core.Element`.
          *
          * All controls (subclasses of `sap.ui.core.Control`) provide the support custom style classes. The control
          * API provides functions to the application which allow it to add, remove or change style classes for the
          * control. In general, this option is not available for elements because elements do not necessarily have
          * a representation in the DOM.
          *
          * This function can be used by a control developer to explicitly enrich the API of his/her element implementation
          * with the API functions for the custom style class support. It must be called on the prototype of the
          * element.
          *
          * **Usage Example:**
          * ```javascript
          *
          * sap.ui.define(['sap/ui/core/Element', 'sap/ui/core/CustomStyleClassSupport'], function(Element, CustomStyleClassSupport) {
          *    "use strict";
          *    var MyElement = Element.extend("my.MyElement", {
          *       metadata : {
          *          //...
          *       }
          *       //...
          *    });
          *
          *    CustomStyleClassSupport.apply(MyElement.prototype);
          *
          *    return MyElement;
          * }, true);
          * ```
          *
          *
          * Furthermore, the function `oRenderManager.writeClasses(oElement);` ({@link sap.ui.core.RenderManager#writeClasses})
          * must be called within the renderer of the control to which the element belongs, when writing the root
          * tag of the element. This ensures the classes are written to the HTML.
          *
          * This function adds the following functions to the elements prototype:
          * 	 - `addStyleClass`: {@link sap.ui.core.Control#addStyleClass}
          * 	 - `removeStyleClass`: {@link sap.ui.core.Control#removeStyleClass}
          * 	 - `toggleStyleClass`: {@link sap.ui.core.Control#toggleStyleClass}
          * 	 - `hasStyleClass`: {@link sap.ui.core.Control#hasStyleClass}  In addition the clone function of
          * 			the element is extended to ensure that the custom style classes are also available on the cloned element.
          *
          * **Note:** This function can only be used within control development. An application cannot add
          * style class support on existing elements by calling this function.
          */
        inline def CustomStyleClassSupport(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("CustomStyleClassSupport")().asInstanceOf[Unit]
      }
      
      /**
        * @SINCE 1.27.0
        *
        * Defines a JavaScript module with its ID, its dependencies and a module export value or factory.
        *
        * The typical and only suggested usage of this method is to have one single, top level call to `sap.ui.define`
        * in one JavaScript resource (file). When a module is requested by its module ID for the first time, the
        * corresponding resource is determined from the ID and the current {@link sap.ui.loader.config configuration}.
        * The resource will be loaded and executed which in turn will execute the top level `sap.ui.define` call.
        *
        * If the module ID was omitted from that call, it will be substituted by the ID that was used to request
        * the module. As a preparation step, the dependencies as well as their transitive dependencies, will be
        * loaded. Then, the module value (its export) will be determined: if a static value (object, literal) was
        * given as `vFactory`, that value will be the module value. If a function was given, that function will
        * be called (providing the module exports of the declared dependencies as parameters to the function) and
        * its return value will be used as module export value. The framework internally associates the resulting
        * value with the module ID and provides it to the original requester of the module. Whenever the module
        * is requested again, the same export value will be returned (modules are executed only once).
        *
        * Example:
        *  The following example defines a module, but doesn't hard code the module ID. If stored in a file 'sap/mylib/SomeClass.js',
        * it can be requested with the ID 'sap/mylib/SomeClass'.
        * ```javascript
        *
        *   sap.ui.define(['./Helper', 'sap/m/Bar'], function(Helper,Bar) {
        *
        *     // create a new class
        *     var SomeClass = function() {};
        *
        *     // add methods to its prototype
        *     SomeClass.prototype.foo = function() {
        *
        *         // use a function from the dependency 'Helper' in the same package (e.g. 'sap/mylib/Helper' )
        *         var mSettings = Helper.foo();
        *
        *         // create and return an sap.m.Bar (using its local name 'Bar')
        *         return new Bar(mSettings);
        *
        *     }
        *
        *     // return the class as module value
        *     return SomeClass;
        *
        *   });
        * ```
        *
        *
        * In another module or in an application HTML page, the {@link sap.ui.require} API can be used to load
        * the sap/mylib/Something module and to work with it:
        *
        *
        * ```javascript
        *
        * sap.ui.require(['sap/mylib/Something'], function(Something) {
        *
        *   // instantiate a Something and call foo() on it
        *   new Something().foo();
        *
        * });
        * ```
        *
        *
        * Module Name Syntax:
        *
        * `sap.ui.define` uses a simplified variant of the {@link jQuery.sap.getResourcePath unified resource name}
        * syntax for the module's own name as well as for its dependencies. The only difference to that syntax
        * is, that for `sap.ui.define` and `sap.ui.require`, the extension (which always would be '.js') has to
        * be omitted. Both methods always add this extension internally.
        *
        * As a convenience, the name of a dependency can start with the segment './' which will be replaced by
        * the name of the package that contains the currently defined module (relative name).
        *
        * It is best practice to omit the name of the defined module (first parameter) and to use relative names
        * for the dependencies whenever possible. This reduces the necessary configuration, simplifies renaming
        * of packages and allows to map them to a different namespace.
        *
        * Dependency to Modules:
        *
        * If a dependencies array is given, each entry represents the name of another module that the currently
        * defined module depends on. All dependency modules are loaded before the export of the currently defined
        * module is determined. The module export of each dependency module will be provided as a parameter to
        * a factory function, the order of the parameters will match the order of the modules in the dependencies
        * array.
        *
        * **Note:** The order in which the dependency modules are executed is **not** defined by the order
        * in the dependencies array! The execution order is affected by dependencies between the dependency
        * modules as well as by their current state (whether a module already has been loaded or not). Neither
        * module implementations nor dependents that require a module set must make any assumption about the execution
        * order (other than expressed by their dependencies).
        *
        * **Note:** A static module export (a literal provided to `sap.ui.define`) cannot depend on the module
        * exports of the dependency modules as it has to be calculated before the dependencies are resolved. As
        * an alternative, modules can define a factory function, calculate a static export value in that function,
        * potentially based on the dependencies, and return the result as module export value. The same approach
        * must be taken when the module export is supposed to be a function.
        *
        * Asynchronous Contract:
        *
        * `sap.ui.define` is designed to support real Asynchronous Module Definitions (AMD) in future, although
        * it internally still might use synchronous module loading, depending on configuration and context. However,
        * callers of `sap.ui.define` must never rely on any synchronous behavior that they might observe in a specific
        * test scenario.
        *
        * For example, callers of `sap.ui.define` must not use the module export value immediately after invoking
        * `sap.ui.define`:
        *
        *
        * ```javascript
        *
        *   // COUNTER EXAMPLE HOW __NOT__ TO DO IT
        *
        *   // define a class Something as AMD module
        *   sap.ui.define('Something', [], function() {
        *     var Something = function() {};
        *     return Something;
        *   });
        *
        *   // DON'T DO THAT!
        *   // accessing the class _synchronously_ after sap.ui.define was called
        *   new Something();
        *
        * ```
        *
        *
        * Applications that need to ensure synchronous module definition or synchronous loading of dependencies
        * **MUST** use the deprecated legacy APIs {@link jQuery.sap.declare} and {@link jQuery.sap.require}.
        *
        * (No) Global References:
        *
        * To be in line with AMD best practices, modules defined with `sap.ui.define` should not make any use of
        * global variables if those variables are also available as module exports. Instead, they should add dependencies
        * to those modules and use the corresponding parameter of the factory function to access the module exports.
        *
        * As the current programming model and the documentation of UI5 heavily rely on global names, there will
        * be a transition phase where UI5 enables AMD modules and local references to module exports in parallel
        * to the old global names. The fourth parameter of `sap.ui.define` has been added to support that transition
        * phase. When this parameter is set to true, the framework provides two additional features
        *
        *
        * 	 - Before the factory function is called, the existence of the global parent namespace for the current
        * 			module is ensured
        * 	 - The module export returned by the module's factory function will be automatically exported under
        * 			the global name which is derived from the ID of the module
        *
        * The parameter lets the framework know whether any of those two operations is needed or not. In future
        * versions of UI5, a central configuration option is planned to suppress those 'exports'.
        *
        * Third Party Modules: Although third party modules don't use UI5 APIs, they still can be listed as dependencies
        * in a `sap.ui.define` call. They will be requested and executed like UI5 modules, but to make their exports
        * available, so called ***shims*** have to be defined.
        *
        * Note that UI5 temporarily deactivates an existing AMD loader while it executes third party modules known
        * to support AMD. This sounds contradictorily at a first glance as UI5 wants to support AMD, but for now
        * it is necessary to fully support UI5 applications that rely on global names for such modules.
        *
        * For third-party modules that UI5 delivers (e.g. those in namespace `sap/ui/thirdparty/`), the necessary
        * shims are defined by UI5 itself by executing the private module `ui5loader-autoconfig.js` during bootstrap.
        *
        * Example:
        * ```javascript
        *
        *   // module 'Something' wants to use third party library 'URI.js'
        *   // It is packaged by UI5 as non-UI5-module 'sap/ui/thirdparty/URI'
        *   // the following shim helps UI5 to correctly load URI.js and to retrieve the module's export value
        *   // Apps don't have to define that shim, it is already applied by ui5loader-autconfig.js
        *   sap.ui.loader.config({
        *     shim: {
        *       'sap/ui/thirdparty/URI': {
        *          amd: true, // URI.js reacts on an AMD loader, this flag lets UI5 temp. disable such loaders
        *          exports: 'URI' // name of the global variable under which URI.js exports its module value
        *       }
        *     }
        *   });
        *
        *   // now the module can be retrieved like other modules
        *   sap.ui.define('Something', ['sap/ui/thirdparty/URI'], function(URIModuleValue) {
        *
        *     new URIModuleValue(...); // same as the global 'URI' name: new URI(...)
        *
        *     ...
        *   });
        * ```
        *
        *
        * Differences to Standard AMD:
        *
        * The current implementation of `sap.ui.define` differs from the AMD specification (https://github.com/amdjs/amdjs-api)
        * or from concrete AMD loaders like `requireJS` in several aspects:
        * 	 - The name `sap.ui.define` is different from the plain `define`. This has two reasons: first, it avoids
        * 			the impression that `sap.ui.define` is an exact implementation of an AMD loader. And second, it allows
        * 			the coexistence of an AMD loader (e.g. requireJS) and `sap.ui.define` in one application as long as UI5
        * 			or applications using UI5 are not fully prepared to run with an AMD loader. Note that the difference
        * 			of the API names also implies that the UI5 loader can't be used to load 'real' AMD modules as they expect
        * 			methods `define` and `require` to be available. Modules that use Unified Module Definition (UMD) syntax,
        * 			can be loaded, but only when no AMD loader is present or when they expose their export also to the global
        * 			namespace, even when an AMD loader is present (as e.g. jQuery does) or when a shim is defined for them
        * 			using the `amd:true` flag (see example above)
        * 	 - Depending on configuration and the current context, `sap.ui.define` loads the dependencies of a module
        * 			either synchronously using a sync XHR call + eval or asynchronously via script tags. The sync loading
        * 			is basically a tribute to the synchronous history of UI5. There's no way for a module developer to enforce
        * 			synchronous loading of the dependencies and on the long run, sync loading will be faded out. Applications
        * 			that need to ensure synchronous loading of dependencies **MUST** use the deprecated legacy APIs like
        * 			{@link jQuery.sap.require}.
        * 	 - `sap.ui.define` does not support plugins to use other file types, formats or protocols. It is not
        * 			planned to support this in future
        * 	 - `sap.ui.define` does not support absolute URLs as module names (dependencies) nor does it allow module
        * 			names that start with a slash. To refer to a module at an absolute URL, a resource root can be registered
        * 			that points to that URL (or to a prefix of it).
        * 	 - `sap.ui.define` does **not** support the 'sugar' of requireJS where CommonJS style dependency declarations
        * 			using `sap.ui.require("something")` are automagically converted into `sap.ui.define` dependencies before
        * 			executing the factory function.
        *
        * Restrictions, Design Considerations:
        * 	 - **Restriction**: as dependency management is not supported for Non-UI5 modules, the only way to ensure
        * 			proper execution order for such modules currently is to rely on the order in the dependency array. Obviously,
        * 			this only works as long as `sap.ui.define` uses synchronous loading. It will be enhanced when asynchronous
        * 			loading is implemented.
        * 	 - It was discussed to enforce asynchronous execution of the module factory function (e.g. with a timeout
        * 			of 0). But this would have invalidated the current migration scenario where a sync `jQuery.sap.require`
        * 			call can load a `sap.ui.define`'ed module. If the module definition would not execute synchronously,
        * 			the synchronous contract of the require call would be broken (default behavior in existing UI5 applications)
        *
        * 	 - A single file must not contain multiple calls to `sap.ui.define`. Multiple calls currently are only
        * 			supported in the so called 'preload' files that the UI5 merge tooling produces. The exact details of
        * 			how this works might be changed in future implementations and are not part of the API contract
        * See:
        * 	https://github.com/amdjs/amdjs-api
        */
      inline def define(
        /**
        * List of dependencies of the module
        */
      aDependencies: js.Array[
              /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 1404, starting with typingsJapgolly.openui5.openui5Strings.sapSlashfSlashAvatar, typingsJapgolly.openui5.openui5Strings.sapSlashfSlashAvatarGroup, typingsJapgolly.openui5.openui5Strings.sapSlashfSlashAvatarGroupItem */ Any
            ],
        /**
        * The module export value or a function that calculates that value
        */
      vFactory: js.Function
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(aDependencies.asInstanceOf[js.Any], vFactory.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def define(
        /**
        * List of dependencies of the module
        */
      aDependencies: js.Array[
              /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 1404, starting with typingsJapgolly.openui5.openui5Strings.sapSlashfSlashAvatar, typingsJapgolly.openui5.openui5Strings.sapSlashfSlashAvatarGroup, typingsJapgolly.openui5.openui5Strings.sapSlashfSlashAvatarGroupItem */ Any
            ],
        /**
        * The module export value or a function that calculates that value
        */
      vFactory: js.Function,
        /**
        * Whether an export to global names is required - should be used by SAP-owned code only
        */
      bExport: Boolean
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(aDependencies.asInstanceOf[js.Any], vFactory.asInstanceOf[js.Any], bExport.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def define(
        /**
        * List of dependencies of the module
        */
      aDependencies: js.Array[
              /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 1404, starting with typingsJapgolly.openui5.openui5Strings.sapSlashfSlashAvatar, typingsJapgolly.openui5.openui5Strings.sapSlashfSlashAvatarGroup, typingsJapgolly.openui5.openui5Strings.sapSlashfSlashAvatarGroupItem */ Any
            ],
        /**
        * The module export value or a function that calculates that value
        */
      vFactory: Any
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(aDependencies.asInstanceOf[js.Any], vFactory.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def define(
        /**
        * List of dependencies of the module
        */
      aDependencies: js.Array[
              /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 1404, starting with typingsJapgolly.openui5.openui5Strings.sapSlashfSlashAvatar, typingsJapgolly.openui5.openui5Strings.sapSlashfSlashAvatarGroup, typingsJapgolly.openui5.openui5Strings.sapSlashfSlashAvatarGroupItem */ Any
            ],
        /**
        * The module export value or a function that calculates that value
        */
      vFactory: Any,
        /**
        * Whether an export to global names is required - should be used by SAP-owned code only
        */
      bExport: Boolean
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(aDependencies.asInstanceOf[js.Any], vFactory.asInstanceOf[js.Any], bExport.asInstanceOf[js.Any])).asInstanceOf[Unit]
      /**
        * @SINCE 1.27.0
        *
        * Defines a JavaScript module with its ID, its dependencies and a module export value or factory.
        *
        * The typical and only suggested usage of this method is to have one single, top level call to `sap.ui.define`
        * in one JavaScript resource (file). When a module is requested by its module ID for the first time, the
        * corresponding resource is determined from the ID and the current {@link sap.ui.loader.config configuration}.
        * The resource will be loaded and executed which in turn will execute the top level `sap.ui.define` call.
        *
        * If the module ID was omitted from that call, it will be substituted by the ID that was used to request
        * the module. As a preparation step, the dependencies as well as their transitive dependencies, will be
        * loaded. Then, the module value (its export) will be determined: if a static value (object, literal) was
        * given as `vFactory`, that value will be the module value. If a function was given, that function will
        * be called (providing the module exports of the declared dependencies as parameters to the function) and
        * its return value will be used as module export value. The framework internally associates the resulting
        * value with the module ID and provides it to the original requester of the module. Whenever the module
        * is requested again, the same export value will be returned (modules are executed only once).
        *
        * Example:
        *  The following example defines a module, but doesn't hard code the module ID. If stored in a file 'sap/mylib/SomeClass.js',
        * it can be requested with the ID 'sap/mylib/SomeClass'.
        * ```javascript
        *
        *   sap.ui.define(['./Helper', 'sap/m/Bar'], function(Helper,Bar) {
        *
        *     // create a new class
        *     var SomeClass = function() {};
        *
        *     // add methods to its prototype
        *     SomeClass.prototype.foo = function() {
        *
        *         // use a function from the dependency 'Helper' in the same package (e.g. 'sap/mylib/Helper' )
        *         var mSettings = Helper.foo();
        *
        *         // create and return an sap.m.Bar (using its local name 'Bar')
        *         return new Bar(mSettings);
        *
        *     }
        *
        *     // return the class as module value
        *     return SomeClass;
        *
        *   });
        * ```
        *
        *
        * In another module or in an application HTML page, the {@link sap.ui.require} API can be used to load
        * the sap/mylib/Something module and to work with it:
        *
        *
        * ```javascript
        *
        * sap.ui.require(['sap/mylib/Something'], function(Something) {
        *
        *   // instantiate a Something and call foo() on it
        *   new Something().foo();
        *
        * });
        * ```
        *
        *
        * Module Name Syntax:
        *
        * `sap.ui.define` uses a simplified variant of the {@link jQuery.sap.getResourcePath unified resource name}
        * syntax for the module's own name as well as for its dependencies. The only difference to that syntax
        * is, that for `sap.ui.define` and `sap.ui.require`, the extension (which always would be '.js') has to
        * be omitted. Both methods always add this extension internally.
        *
        * As a convenience, the name of a dependency can start with the segment './' which will be replaced by
        * the name of the package that contains the currently defined module (relative name).
        *
        * It is best practice to omit the name of the defined module (first parameter) and to use relative names
        * for the dependencies whenever possible. This reduces the necessary configuration, simplifies renaming
        * of packages and allows to map them to a different namespace.
        *
        * Dependency to Modules:
        *
        * If a dependencies array is given, each entry represents the name of another module that the currently
        * defined module depends on. All dependency modules are loaded before the export of the currently defined
        * module is determined. The module export of each dependency module will be provided as a parameter to
        * a factory function, the order of the parameters will match the order of the modules in the dependencies
        * array.
        *
        * **Note:** The order in which the dependency modules are executed is **not** defined by the order
        * in the dependencies array! The execution order is affected by dependencies between the dependency
        * modules as well as by their current state (whether a module already has been loaded or not). Neither
        * module implementations nor dependents that require a module set must make any assumption about the execution
        * order (other than expressed by their dependencies).
        *
        * **Note:** A static module export (a literal provided to `sap.ui.define`) cannot depend on the module
        * exports of the dependency modules as it has to be calculated before the dependencies are resolved. As
        * an alternative, modules can define a factory function, calculate a static export value in that function,
        * potentially based on the dependencies, and return the result as module export value. The same approach
        * must be taken when the module export is supposed to be a function.
        *
        * Asynchronous Contract:
        *
        * `sap.ui.define` is designed to support real Asynchronous Module Definitions (AMD) in future, although
        * it internally still might use synchronous module loading, depending on configuration and context. However,
        * callers of `sap.ui.define` must never rely on any synchronous behavior that they might observe in a specific
        * test scenario.
        *
        * For example, callers of `sap.ui.define` must not use the module export value immediately after invoking
        * `sap.ui.define`:
        *
        *
        * ```javascript
        *
        *   // COUNTER EXAMPLE HOW __NOT__ TO DO IT
        *
        *   // define a class Something as AMD module
        *   sap.ui.define('Something', [], function() {
        *     var Something = function() {};
        *     return Something;
        *   });
        *
        *   // DON'T DO THAT!
        *   // accessing the class _synchronously_ after sap.ui.define was called
        *   new Something();
        *
        * ```
        *
        *
        * Applications that need to ensure synchronous module definition or synchronous loading of dependencies
        * **MUST** use the deprecated legacy APIs {@link jQuery.sap.declare} and {@link jQuery.sap.require}.
        *
        * (No) Global References:
        *
        * To be in line with AMD best practices, modules defined with `sap.ui.define` should not make any use of
        * global variables if those variables are also available as module exports. Instead, they should add dependencies
        * to those modules and use the corresponding parameter of the factory function to access the module exports.
        *
        * As the current programming model and the documentation of UI5 heavily rely on global names, there will
        * be a transition phase where UI5 enables AMD modules and local references to module exports in parallel
        * to the old global names. The fourth parameter of `sap.ui.define` has been added to support that transition
        * phase. When this parameter is set to true, the framework provides two additional features
        *
        *
        * 	 - Before the factory function is called, the existence of the global parent namespace for the current
        * 			module is ensured
        * 	 - The module export returned by the module's factory function will be automatically exported under
        * 			the global name which is derived from the ID of the module
        *
        * The parameter lets the framework know whether any of those two operations is needed or not. In future
        * versions of UI5, a central configuration option is planned to suppress those 'exports'.
        *
        * Third Party Modules: Although third party modules don't use UI5 APIs, they still can be listed as dependencies
        * in a `sap.ui.define` call. They will be requested and executed like UI5 modules, but to make their exports
        * available, so called ***shims*** have to be defined.
        *
        * Note that UI5 temporarily deactivates an existing AMD loader while it executes third party modules known
        * to support AMD. This sounds contradictorily at a first glance as UI5 wants to support AMD, but for now
        * it is necessary to fully support UI5 applications that rely on global names for such modules.
        *
        * For third-party modules that UI5 delivers (e.g. those in namespace `sap/ui/thirdparty/`), the necessary
        * shims are defined by UI5 itself by executing the private module `ui5loader-autoconfig.js` during bootstrap.
        *
        * Example:
        * ```javascript
        *
        *   // module 'Something' wants to use third party library 'URI.js'
        *   // It is packaged by UI5 as non-UI5-module 'sap/ui/thirdparty/URI'
        *   // the following shim helps UI5 to correctly load URI.js and to retrieve the module's export value
        *   // Apps don't have to define that shim, it is already applied by ui5loader-autconfig.js
        *   sap.ui.loader.config({
        *     shim: {
        *       'sap/ui/thirdparty/URI': {
        *          amd: true, // URI.js reacts on an AMD loader, this flag lets UI5 temp. disable such loaders
        *          exports: 'URI' // name of the global variable under which URI.js exports its module value
        *       }
        *     }
        *   });
        *
        *   // now the module can be retrieved like other modules
        *   sap.ui.define('Something', ['sap/ui/thirdparty/URI'], function(URIModuleValue) {
        *
        *     new URIModuleValue(...); // same as the global 'URI' name: new URI(...)
        *
        *     ...
        *   });
        * ```
        *
        *
        * Differences to Standard AMD:
        *
        * The current implementation of `sap.ui.define` differs from the AMD specification (https://github.com/amdjs/amdjs-api)
        * or from concrete AMD loaders like `requireJS` in several aspects:
        * 	 - The name `sap.ui.define` is different from the plain `define`. This has two reasons: first, it avoids
        * 			the impression that `sap.ui.define` is an exact implementation of an AMD loader. And second, it allows
        * 			the coexistence of an AMD loader (e.g. requireJS) and `sap.ui.define` in one application as long as UI5
        * 			or applications using UI5 are not fully prepared to run with an AMD loader. Note that the difference
        * 			of the API names also implies that the UI5 loader can't be used to load 'real' AMD modules as they expect
        * 			methods `define` and `require` to be available. Modules that use Unified Module Definition (UMD) syntax,
        * 			can be loaded, but only when no AMD loader is present or when they expose their export also to the global
        * 			namespace, even when an AMD loader is present (as e.g. jQuery does) or when a shim is defined for them
        * 			using the `amd:true` flag (see example above)
        * 	 - Depending on configuration and the current context, `sap.ui.define` loads the dependencies of a module
        * 			either synchronously using a sync XHR call + eval or asynchronously via script tags. The sync loading
        * 			is basically a tribute to the synchronous history of UI5. There's no way for a module developer to enforce
        * 			synchronous loading of the dependencies and on the long run, sync loading will be faded out. Applications
        * 			that need to ensure synchronous loading of dependencies **MUST** use the deprecated legacy APIs like
        * 			{@link jQuery.sap.require}.
        * 	 - `sap.ui.define` does not support plugins to use other file types, formats or protocols. It is not
        * 			planned to support this in future
        * 	 - `sap.ui.define` does not support absolute URLs as module names (dependencies) nor does it allow module
        * 			names that start with a slash. To refer to a module at an absolute URL, a resource root can be registered
        * 			that points to that URL (or to a prefix of it).
        * 	 - `sap.ui.define` does **not** support the 'sugar' of requireJS where CommonJS style dependency declarations
        * 			using `sap.ui.require("something")` are automagically converted into `sap.ui.define` dependencies before
        * 			executing the factory function.
        *
        * Restrictions, Design Considerations:
        * 	 - **Restriction**: as dependency management is not supported for Non-UI5 modules, the only way to ensure
        * 			proper execution order for such modules currently is to rely on the order in the dependency array. Obviously,
        * 			this only works as long as `sap.ui.define` uses synchronous loading. It will be enhanced when asynchronous
        * 			loading is implemented.
        * 	 - It was discussed to enforce asynchronous execution of the module factory function (e.g. with a timeout
        * 			of 0). But this would have invalidated the current migration scenario where a sync `jQuery.sap.require`
        * 			call can load a `sap.ui.define`'ed module. If the module definition would not execute synchronously,
        * 			the synchronous contract of the require call would be broken (default behavior in existing UI5 applications)
        *
        * 	 - A single file must not contain multiple calls to `sap.ui.define`. Multiple calls currently are only
        * 			supported in the so called 'preload' files that the UI5 merge tooling produces. The exact details of
        * 			how this works might be changed in future implementations and are not part of the API contract
        * See:
        * 	https://github.com/amdjs/amdjs-api
        */
      inline def define(
        /**
        * ID of the module in simplified resource name syntax. When omitted, the loader determines the ID from
        * the request.
        */
      sModuleName: String,
        /**
        * List of dependencies of the module
        */
      aDependencies: js.Array[
              /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 1404, starting with typingsJapgolly.openui5.openui5Strings.sapSlashfSlashAvatar, typingsJapgolly.openui5.openui5Strings.sapSlashfSlashAvatarGroup, typingsJapgolly.openui5.openui5Strings.sapSlashfSlashAvatarGroupItem */ Any
            ],
        /**
        * The module export value or a function that calculates that value
        */
      vFactory: js.Function
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(sModuleName.asInstanceOf[js.Any], aDependencies.asInstanceOf[js.Any], vFactory.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def define(
        /**
        * ID of the module in simplified resource name syntax. When omitted, the loader determines the ID from
        * the request.
        */
      sModuleName: String,
        /**
        * List of dependencies of the module
        */
      aDependencies: js.Array[
              /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 1404, starting with typingsJapgolly.openui5.openui5Strings.sapSlashfSlashAvatar, typingsJapgolly.openui5.openui5Strings.sapSlashfSlashAvatarGroup, typingsJapgolly.openui5.openui5Strings.sapSlashfSlashAvatarGroupItem */ Any
            ],
        /**
        * The module export value or a function that calculates that value
        */
      vFactory: js.Function,
        /**
        * Whether an export to global names is required - should be used by SAP-owned code only
        */
      bExport: Boolean
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(sModuleName.asInstanceOf[js.Any], aDependencies.asInstanceOf[js.Any], vFactory.asInstanceOf[js.Any], bExport.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def define(
        /**
        * ID of the module in simplified resource name syntax. When omitted, the loader determines the ID from
        * the request.
        */
      sModuleName: String,
        /**
        * List of dependencies of the module
        */
      aDependencies: js.Array[
              /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 1404, starting with typingsJapgolly.openui5.openui5Strings.sapSlashfSlashAvatar, typingsJapgolly.openui5.openui5Strings.sapSlashfSlashAvatarGroup, typingsJapgolly.openui5.openui5Strings.sapSlashfSlashAvatarGroupItem */ Any
            ],
        /**
        * The module export value or a function that calculates that value
        */
      vFactory: Any
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(sModuleName.asInstanceOf[js.Any], aDependencies.asInstanceOf[js.Any], vFactory.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def define(
        /**
        * ID of the module in simplified resource name syntax. When omitted, the loader determines the ID from
        * the request.
        */
      sModuleName: String,
        /**
        * List of dependencies of the module
        */
      aDependencies: js.Array[
              /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 1404, starting with typingsJapgolly.openui5.openui5Strings.sapSlashfSlashAvatar, typingsJapgolly.openui5.openui5Strings.sapSlashfSlashAvatarGroup, typingsJapgolly.openui5.openui5Strings.sapSlashfSlashAvatarGroupItem */ Any
            ],
        /**
        * The module export value or a function that calculates that value
        */
      vFactory: Any,
        /**
        * Whether an export to global names is required - should be used by SAP-owned code only
        */
      bExport: Boolean
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(sModuleName.asInstanceOf[js.Any], aDependencies.asInstanceOf[js.Any], vFactory.asInstanceOf[js.Any], bExport.asInstanceOf[js.Any])).asInstanceOf[Unit]
      /**
        * @SINCE 1.27.0
        *
        * Defines a JavaScript module with its ID, its dependencies and a module export value or factory.
        *
        * The typical and only suggested usage of this method is to have one single, top level call to `sap.ui.define`
        * in one JavaScript resource (file). When a module is requested by its module ID for the first time, the
        * corresponding resource is determined from the ID and the current {@link sap.ui.loader.config configuration}.
        * The resource will be loaded and executed which in turn will execute the top level `sap.ui.define` call.
        *
        * If the module ID was omitted from that call, it will be substituted by the ID that was used to request
        * the module. As a preparation step, the dependencies as well as their transitive dependencies, will be
        * loaded. Then, the module value (its export) will be determined: if a static value (object, literal) was
        * given as `vFactory`, that value will be the module value. If a function was given, that function will
        * be called (providing the module exports of the declared dependencies as parameters to the function) and
        * its return value will be used as module export value. The framework internally associates the resulting
        * value with the module ID and provides it to the original requester of the module. Whenever the module
        * is requested again, the same export value will be returned (modules are executed only once).
        *
        * Example:
        *  The following example defines a module, but doesn't hard code the module ID. If stored in a file 'sap/mylib/SomeClass.js',
        * it can be requested with the ID 'sap/mylib/SomeClass'.
        * ```javascript
        *
        *   sap.ui.define(['./Helper', 'sap/m/Bar'], function(Helper,Bar) {
        *
        *     // create a new class
        *     var SomeClass = function() {};
        *
        *     // add methods to its prototype
        *     SomeClass.prototype.foo = function() {
        *
        *         // use a function from the dependency 'Helper' in the same package (e.g. 'sap/mylib/Helper' )
        *         var mSettings = Helper.foo();
        *
        *         // create and return an sap.m.Bar (using its local name 'Bar')
        *         return new Bar(mSettings);
        *
        *     }
        *
        *     // return the class as module value
        *     return SomeClass;
        *
        *   });
        * ```
        *
        *
        * In another module or in an application HTML page, the {@link sap.ui.require} API can be used to load
        * the sap/mylib/Something module and to work with it:
        *
        *
        * ```javascript
        *
        * sap.ui.require(['sap/mylib/Something'], function(Something) {
        *
        *   // instantiate a Something and call foo() on it
        *   new Something().foo();
        *
        * });
        * ```
        *
        *
        * Module Name Syntax:
        *
        * `sap.ui.define` uses a simplified variant of the {@link jQuery.sap.getResourcePath unified resource name}
        * syntax for the module's own name as well as for its dependencies. The only difference to that syntax
        * is, that for `sap.ui.define` and `sap.ui.require`, the extension (which always would be '.js') has to
        * be omitted. Both methods always add this extension internally.
        *
        * As a convenience, the name of a dependency can start with the segment './' which will be replaced by
        * the name of the package that contains the currently defined module (relative name).
        *
        * It is best practice to omit the name of the defined module (first parameter) and to use relative names
        * for the dependencies whenever possible. This reduces the necessary configuration, simplifies renaming
        * of packages and allows to map them to a different namespace.
        *
        * Dependency to Modules:
        *
        * If a dependencies array is given, each entry represents the name of another module that the currently
        * defined module depends on. All dependency modules are loaded before the export of the currently defined
        * module is determined. The module export of each dependency module will be provided as a parameter to
        * a factory function, the order of the parameters will match the order of the modules in the dependencies
        * array.
        *
        * **Note:** The order in which the dependency modules are executed is **not** defined by the order
        * in the dependencies array! The execution order is affected by dependencies between the dependency
        * modules as well as by their current state (whether a module already has been loaded or not). Neither
        * module implementations nor dependents that require a module set must make any assumption about the execution
        * order (other than expressed by their dependencies).
        *
        * **Note:** A static module export (a literal provided to `sap.ui.define`) cannot depend on the module
        * exports of the dependency modules as it has to be calculated before the dependencies are resolved. As
        * an alternative, modules can define a factory function, calculate a static export value in that function,
        * potentially based on the dependencies, and return the result as module export value. The same approach
        * must be taken when the module export is supposed to be a function.
        *
        * Asynchronous Contract:
        *
        * `sap.ui.define` is designed to support real Asynchronous Module Definitions (AMD) in future, although
        * it internally still might use synchronous module loading, depending on configuration and context. However,
        * callers of `sap.ui.define` must never rely on any synchronous behavior that they might observe in a specific
        * test scenario.
        *
        * For example, callers of `sap.ui.define` must not use the module export value immediately after invoking
        * `sap.ui.define`:
        *
        *
        * ```javascript
        *
        *   // COUNTER EXAMPLE HOW __NOT__ TO DO IT
        *
        *   // define a class Something as AMD module
        *   sap.ui.define('Something', [], function() {
        *     var Something = function() {};
        *     return Something;
        *   });
        *
        *   // DON'T DO THAT!
        *   // accessing the class _synchronously_ after sap.ui.define was called
        *   new Something();
        *
        * ```
        *
        *
        * Applications that need to ensure synchronous module definition or synchronous loading of dependencies
        * **MUST** use the deprecated legacy APIs {@link jQuery.sap.declare} and {@link jQuery.sap.require}.
        *
        * (No) Global References:
        *
        * To be in line with AMD best practices, modules defined with `sap.ui.define` should not make any use of
        * global variables if those variables are also available as module exports. Instead, they should add dependencies
        * to those modules and use the corresponding parameter of the factory function to access the module exports.
        *
        * As the current programming model and the documentation of UI5 heavily rely on global names, there will
        * be a transition phase where UI5 enables AMD modules and local references to module exports in parallel
        * to the old global names. The fourth parameter of `sap.ui.define` has been added to support that transition
        * phase. When this parameter is set to true, the framework provides two additional features
        *
        *
        * 	 - Before the factory function is called, the existence of the global parent namespace for the current
        * 			module is ensured
        * 	 - The module export returned by the module's factory function will be automatically exported under
        * 			the global name which is derived from the ID of the module
        *
        * The parameter lets the framework know whether any of those two operations is needed or not. In future
        * versions of UI5, a central configuration option is planned to suppress those 'exports'.
        *
        * Third Party Modules: Although third party modules don't use UI5 APIs, they still can be listed as dependencies
        * in a `sap.ui.define` call. They will be requested and executed like UI5 modules, but to make their exports
        * available, so called ***shims*** have to be defined.
        *
        * Note that UI5 temporarily deactivates an existing AMD loader while it executes third party modules known
        * to support AMD. This sounds contradictorily at a first glance as UI5 wants to support AMD, but for now
        * it is necessary to fully support UI5 applications that rely on global names for such modules.
        *
        * For third-party modules that UI5 delivers (e.g. those in namespace `sap/ui/thirdparty/`), the necessary
        * shims are defined by UI5 itself by executing the private module `ui5loader-autoconfig.js` during bootstrap.
        *
        * Example:
        * ```javascript
        *
        *   // module 'Something' wants to use third party library 'URI.js'
        *   // It is packaged by UI5 as non-UI5-module 'sap/ui/thirdparty/URI'
        *   // the following shim helps UI5 to correctly load URI.js and to retrieve the module's export value
        *   // Apps don't have to define that shim, it is already applied by ui5loader-autconfig.js
        *   sap.ui.loader.config({
        *     shim: {
        *       'sap/ui/thirdparty/URI': {
        *          amd: true, // URI.js reacts on an AMD loader, this flag lets UI5 temp. disable such loaders
        *          exports: 'URI' // name of the global variable under which URI.js exports its module value
        *       }
        *     }
        *   });
        *
        *   // now the module can be retrieved like other modules
        *   sap.ui.define('Something', ['sap/ui/thirdparty/URI'], function(URIModuleValue) {
        *
        *     new URIModuleValue(...); // same as the global 'URI' name: new URI(...)
        *
        *     ...
        *   });
        * ```
        *
        *
        * Differences to Standard AMD:
        *
        * The current implementation of `sap.ui.define` differs from the AMD specification (https://github.com/amdjs/amdjs-api)
        * or from concrete AMD loaders like `requireJS` in several aspects:
        * 	 - The name `sap.ui.define` is different from the plain `define`. This has two reasons: first, it avoids
        * 			the impression that `sap.ui.define` is an exact implementation of an AMD loader. And second, it allows
        * 			the coexistence of an AMD loader (e.g. requireJS) and `sap.ui.define` in one application as long as UI5
        * 			or applications using UI5 are not fully prepared to run with an AMD loader. Note that the difference
        * 			of the API names also implies that the UI5 loader can't be used to load 'real' AMD modules as they expect
        * 			methods `define` and `require` to be available. Modules that use Unified Module Definition (UMD) syntax,
        * 			can be loaded, but only when no AMD loader is present or when they expose their export also to the global
        * 			namespace, even when an AMD loader is present (as e.g. jQuery does) or when a shim is defined for them
        * 			using the `amd:true` flag (see example above)
        * 	 - Depending on configuration and the current context, `sap.ui.define` loads the dependencies of a module
        * 			either synchronously using a sync XHR call + eval or asynchronously via script tags. The sync loading
        * 			is basically a tribute to the synchronous history of UI5. There's no way for a module developer to enforce
        * 			synchronous loading of the dependencies and on the long run, sync loading will be faded out. Applications
        * 			that need to ensure synchronous loading of dependencies **MUST** use the deprecated legacy APIs like
        * 			{@link jQuery.sap.require}.
        * 	 - `sap.ui.define` does not support plugins to use other file types, formats or protocols. It is not
        * 			planned to support this in future
        * 	 - `sap.ui.define` does not support absolute URLs as module names (dependencies) nor does it allow module
        * 			names that start with a slash. To refer to a module at an absolute URL, a resource root can be registered
        * 			that points to that URL (or to a prefix of it).
        * 	 - `sap.ui.define` does **not** support the 'sugar' of requireJS where CommonJS style dependency declarations
        * 			using `sap.ui.require("something")` are automagically converted into `sap.ui.define` dependencies before
        * 			executing the factory function.
        *
        * Restrictions, Design Considerations:
        * 	 - **Restriction**: as dependency management is not supported for Non-UI5 modules, the only way to ensure
        * 			proper execution order for such modules currently is to rely on the order in the dependency array. Obviously,
        * 			this only works as long as `sap.ui.define` uses synchronous loading. It will be enhanced when asynchronous
        * 			loading is implemented.
        * 	 - It was discussed to enforce asynchronous execution of the module factory function (e.g. with a timeout
        * 			of 0). But this would have invalidated the current migration scenario where a sync `jQuery.sap.require`
        * 			call can load a `sap.ui.define`'ed module. If the module definition would not execute synchronously,
        * 			the synchronous contract of the require call would be broken (default behavior in existing UI5 applications)
        *
        * 	 - A single file must not contain multiple calls to `sap.ui.define`. Multiple calls currently are only
        * 			supported in the so called 'preload' files that the UI5 merge tooling produces. The exact details of
        * 			how this works might be changed in future implementations and are not part of the API contract
        * See:
        * 	https://github.com/amdjs/amdjs-api
        */
      inline def define(
        /**
        * ID of the module in simplified resource name syntax. When omitted, the loader determines the ID from
        * the request.
        */
      sModuleName: String,
        /**
        * The module export value or a function that calculates that value
        */
      vFactory: js.Function
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(sModuleName.asInstanceOf[js.Any], vFactory.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def define(
        /**
        * ID of the module in simplified resource name syntax. When omitted, the loader determines the ID from
        * the request.
        */
      sModuleName: String,
        /**
        * The module export value or a function that calculates that value
        */
      vFactory: js.Function,
        /**
        * Whether an export to global names is required - should be used by SAP-owned code only
        */
      bExport: Boolean
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(sModuleName.asInstanceOf[js.Any], vFactory.asInstanceOf[js.Any], bExport.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def define(
        /**
        * ID of the module in simplified resource name syntax. When omitted, the loader determines the ID from
        * the request.
        */
      sModuleName: String,
        /**
        * The module export value or a function that calculates that value
        */
      vFactory: Any
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(sModuleName.asInstanceOf[js.Any], vFactory.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def define(
        /**
        * ID of the module in simplified resource name syntax. When omitted, the loader determines the ID from
        * the request.
        */
      sModuleName: String,
        /**
        * The module export value or a function that calculates that value
        */
      vFactory: Any,
        /**
        * Whether an export to global names is required - should be used by SAP-owned code only
        */
      bExport: Boolean
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(sModuleName.asInstanceOf[js.Any], vFactory.asInstanceOf[js.Any], bExport.asInstanceOf[js.Any])).asInstanceOf[Unit]
      /**
        * @SINCE 1.27.0
        *
        * Defines a JavaScript module with its ID, its dependencies and a module export value or factory.
        *
        * The typical and only suggested usage of this method is to have one single, top level call to `sap.ui.define`
        * in one JavaScript resource (file). When a module is requested by its module ID for the first time, the
        * corresponding resource is determined from the ID and the current {@link sap.ui.loader.config configuration}.
        * The resource will be loaded and executed which in turn will execute the top level `sap.ui.define` call.
        *
        * If the module ID was omitted from that call, it will be substituted by the ID that was used to request
        * the module. As a preparation step, the dependencies as well as their transitive dependencies, will be
        * loaded. Then, the module value (its export) will be determined: if a static value (object, literal) was
        * given as `vFactory`, that value will be the module value. If a function was given, that function will
        * be called (providing the module exports of the declared dependencies as parameters to the function) and
        * its return value will be used as module export value. The framework internally associates the resulting
        * value with the module ID and provides it to the original requester of the module. Whenever the module
        * is requested again, the same export value will be returned (modules are executed only once).
        *
        * Example:
        *  The following example defines a module, but doesn't hard code the module ID. If stored in a file 'sap/mylib/SomeClass.js',
        * it can be requested with the ID 'sap/mylib/SomeClass'.
        * ```javascript
        *
        *   sap.ui.define(['./Helper', 'sap/m/Bar'], function(Helper,Bar) {
        *
        *     // create a new class
        *     var SomeClass = function() {};
        *
        *     // add methods to its prototype
        *     SomeClass.prototype.foo = function() {
        *
        *         // use a function from the dependency 'Helper' in the same package (e.g. 'sap/mylib/Helper' )
        *         var mSettings = Helper.foo();
        *
        *         // create and return an sap.m.Bar (using its local name 'Bar')
        *         return new Bar(mSettings);
        *
        *     }
        *
        *     // return the class as module value
        *     return SomeClass;
        *
        *   });
        * ```
        *
        *
        * In another module or in an application HTML page, the {@link sap.ui.require} API can be used to load
        * the sap/mylib/Something module and to work with it:
        *
        *
        * ```javascript
        *
        * sap.ui.require(['sap/mylib/Something'], function(Something) {
        *
        *   // instantiate a Something and call foo() on it
        *   new Something().foo();
        *
        * });
        * ```
        *
        *
        * Module Name Syntax:
        *
        * `sap.ui.define` uses a simplified variant of the {@link jQuery.sap.getResourcePath unified resource name}
        * syntax for the module's own name as well as for its dependencies. The only difference to that syntax
        * is, that for `sap.ui.define` and `sap.ui.require`, the extension (which always would be '.js') has to
        * be omitted. Both methods always add this extension internally.
        *
        * As a convenience, the name of a dependency can start with the segment './' which will be replaced by
        * the name of the package that contains the currently defined module (relative name).
        *
        * It is best practice to omit the name of the defined module (first parameter) and to use relative names
        * for the dependencies whenever possible. This reduces the necessary configuration, simplifies renaming
        * of packages and allows to map them to a different namespace.
        *
        * Dependency to Modules:
        *
        * If a dependencies array is given, each entry represents the name of another module that the currently
        * defined module depends on. All dependency modules are loaded before the export of the currently defined
        * module is determined. The module export of each dependency module will be provided as a parameter to
        * a factory function, the order of the parameters will match the order of the modules in the dependencies
        * array.
        *
        * **Note:** The order in which the dependency modules are executed is **not** defined by the order
        * in the dependencies array! The execution order is affected by dependencies between the dependency
        * modules as well as by their current state (whether a module already has been loaded or not). Neither
        * module implementations nor dependents that require a module set must make any assumption about the execution
        * order (other than expressed by their dependencies).
        *
        * **Note:** A static module export (a literal provided to `sap.ui.define`) cannot depend on the module
        * exports of the dependency modules as it has to be calculated before the dependencies are resolved. As
        * an alternative, modules can define a factory function, calculate a static export value in that function,
        * potentially based on the dependencies, and return the result as module export value. The same approach
        * must be taken when the module export is supposed to be a function.
        *
        * Asynchronous Contract:
        *
        * `sap.ui.define` is designed to support real Asynchronous Module Definitions (AMD) in future, although
        * it internally still might use synchronous module loading, depending on configuration and context. However,
        * callers of `sap.ui.define` must never rely on any synchronous behavior that they might observe in a specific
        * test scenario.
        *
        * For example, callers of `sap.ui.define` must not use the module export value immediately after invoking
        * `sap.ui.define`:
        *
        *
        * ```javascript
        *
        *   // COUNTER EXAMPLE HOW __NOT__ TO DO IT
        *
        *   // define a class Something as AMD module
        *   sap.ui.define('Something', [], function() {
        *     var Something = function() {};
        *     return Something;
        *   });
        *
        *   // DON'T DO THAT!
        *   // accessing the class _synchronously_ after sap.ui.define was called
        *   new Something();
        *
        * ```
        *
        *
        * Applications that need to ensure synchronous module definition or synchronous loading of dependencies
        * **MUST** use the deprecated legacy APIs {@link jQuery.sap.declare} and {@link jQuery.sap.require}.
        *
        * (No) Global References:
        *
        * To be in line with AMD best practices, modules defined with `sap.ui.define` should not make any use of
        * global variables if those variables are also available as module exports. Instead, they should add dependencies
        * to those modules and use the corresponding parameter of the factory function to access the module exports.
        *
        * As the current programming model and the documentation of UI5 heavily rely on global names, there will
        * be a transition phase where UI5 enables AMD modules and local references to module exports in parallel
        * to the old global names. The fourth parameter of `sap.ui.define` has been added to support that transition
        * phase. When this parameter is set to true, the framework provides two additional features
        *
        *
        * 	 - Before the factory function is called, the existence of the global parent namespace for the current
        * 			module is ensured
        * 	 - The module export returned by the module's factory function will be automatically exported under
        * 			the global name which is derived from the ID of the module
        *
        * The parameter lets the framework know whether any of those two operations is needed or not. In future
        * versions of UI5, a central configuration option is planned to suppress those 'exports'.
        *
        * Third Party Modules: Although third party modules don't use UI5 APIs, they still can be listed as dependencies
        * in a `sap.ui.define` call. They will be requested and executed like UI5 modules, but to make their exports
        * available, so called ***shims*** have to be defined.
        *
        * Note that UI5 temporarily deactivates an existing AMD loader while it executes third party modules known
        * to support AMD. This sounds contradictorily at a first glance as UI5 wants to support AMD, but for now
        * it is necessary to fully support UI5 applications that rely on global names for such modules.
        *
        * For third-party modules that UI5 delivers (e.g. those in namespace `sap/ui/thirdparty/`), the necessary
        * shims are defined by UI5 itself by executing the private module `ui5loader-autoconfig.js` during bootstrap.
        *
        * Example:
        * ```javascript
        *
        *   // module 'Something' wants to use third party library 'URI.js'
        *   // It is packaged by UI5 as non-UI5-module 'sap/ui/thirdparty/URI'
        *   // the following shim helps UI5 to correctly load URI.js and to retrieve the module's export value
        *   // Apps don't have to define that shim, it is already applied by ui5loader-autconfig.js
        *   sap.ui.loader.config({
        *     shim: {
        *       'sap/ui/thirdparty/URI': {
        *          amd: true, // URI.js reacts on an AMD loader, this flag lets UI5 temp. disable such loaders
        *          exports: 'URI' // name of the global variable under which URI.js exports its module value
        *       }
        *     }
        *   });
        *
        *   // now the module can be retrieved like other modules
        *   sap.ui.define('Something', ['sap/ui/thirdparty/URI'], function(URIModuleValue) {
        *
        *     new URIModuleValue(...); // same as the global 'URI' name: new URI(...)
        *
        *     ...
        *   });
        * ```
        *
        *
        * Differences to Standard AMD:
        *
        * The current implementation of `sap.ui.define` differs from the AMD specification (https://github.com/amdjs/amdjs-api)
        * or from concrete AMD loaders like `requireJS` in several aspects:
        * 	 - The name `sap.ui.define` is different from the plain `define`. This has two reasons: first, it avoids
        * 			the impression that `sap.ui.define` is an exact implementation of an AMD loader. And second, it allows
        * 			the coexistence of an AMD loader (e.g. requireJS) and `sap.ui.define` in one application as long as UI5
        * 			or applications using UI5 are not fully prepared to run with an AMD loader. Note that the difference
        * 			of the API names also implies that the UI5 loader can't be used to load 'real' AMD modules as they expect
        * 			methods `define` and `require` to be available. Modules that use Unified Module Definition (UMD) syntax,
        * 			can be loaded, but only when no AMD loader is present or when they expose their export also to the global
        * 			namespace, even when an AMD loader is present (as e.g. jQuery does) or when a shim is defined for them
        * 			using the `amd:true` flag (see example above)
        * 	 - Depending on configuration and the current context, `sap.ui.define` loads the dependencies of a module
        * 			either synchronously using a sync XHR call + eval or asynchronously via script tags. The sync loading
        * 			is basically a tribute to the synchronous history of UI5. There's no way for a module developer to enforce
        * 			synchronous loading of the dependencies and on the long run, sync loading will be faded out. Applications
        * 			that need to ensure synchronous loading of dependencies **MUST** use the deprecated legacy APIs like
        * 			{@link jQuery.sap.require}.
        * 	 - `sap.ui.define` does not support plugins to use other file types, formats or protocols. It is not
        * 			planned to support this in future
        * 	 - `sap.ui.define` does not support absolute URLs as module names (dependencies) nor does it allow module
        * 			names that start with a slash. To refer to a module at an absolute URL, a resource root can be registered
        * 			that points to that URL (or to a prefix of it).
        * 	 - `sap.ui.define` does **not** support the 'sugar' of requireJS where CommonJS style dependency declarations
        * 			using `sap.ui.require("something")` are automagically converted into `sap.ui.define` dependencies before
        * 			executing the factory function.
        *
        * Restrictions, Design Considerations:
        * 	 - **Restriction**: as dependency management is not supported for Non-UI5 modules, the only way to ensure
        * 			proper execution order for such modules currently is to rely on the order in the dependency array. Obviously,
        * 			this only works as long as `sap.ui.define` uses synchronous loading. It will be enhanced when asynchronous
        * 			loading is implemented.
        * 	 - It was discussed to enforce asynchronous execution of the module factory function (e.g. with a timeout
        * 			of 0). But this would have invalidated the current migration scenario where a sync `jQuery.sap.require`
        * 			call can load a `sap.ui.define`'ed module. If the module definition would not execute synchronously,
        * 			the synchronous contract of the require call would be broken (default behavior in existing UI5 applications)
        *
        * 	 - A single file must not contain multiple calls to `sap.ui.define`. Multiple calls currently are only
        * 			supported in the so called 'preload' files that the UI5 merge tooling produces. The exact details of
        * 			how this works might be changed in future implementations and are not part of the API contract
        * See:
        * 	https://github.com/amdjs/amdjs-api
        */
      inline def define(
        /**
        * The module export value or a function that calculates that value
        */
      vFactory: js.Function
      ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("define")(vFactory.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def define(
        /**
        * The module export value or a function that calculates that value
        */
      vFactory: js.Function,
        /**
        * Whether an export to global names is required - should be used by SAP-owned code only
        */
      bExport: Boolean
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(vFactory.asInstanceOf[js.Any], bExport.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def define(/**
        * The module export value or a function that calculates that value
        */
      vFactory: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("define")(vFactory.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def define(
        /**
        * The module export value or a function that calculates that value
        */
      vFactory: Any,
        /**
        * Whether an export to global names is required - should be used by SAP-owned code only
        */
      bExport: Boolean
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(vFactory.asInstanceOf[js.Any], bExport.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def extensionpoint(
        /**
        * The view or fragment containing the extension point
        */
      oContainer: typingsJapgolly.openui5.sapUiCoreFragmentMod.default,
        /**
        * The extensionName used to identify the extension point in the customizing
        */
      sExtName: String
      ): js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] | js.Promise[js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]] = (^.asInstanceOf[js.Dynamic].applyDynamic("extensionpoint")(oContainer.asInstanceOf[js.Any], sExtName.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] | js.Promise[js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]]
      inline def extensionpoint(
        /**
        * The view or fragment containing the extension point
        */
      oContainer: typingsJapgolly.openui5.sapUiCoreFragmentMod.default,
        /**
        * The extensionName used to identify the extension point in the customizing
        */
      sExtName: String,
        /**
        * Optional callback function creating default content, returning an array of controls. It is executed when
        * there's no customizing, if not provided, no default content will be rendered. `fnCreateDefaultContent`
        * might also return a Promise, which resolves with an array of controls.
        */
      fnCreateDefaultContent: js.Function
      ): js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] | js.Promise[js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]] = (^.asInstanceOf[js.Dynamic].applyDynamic("extensionpoint")(oContainer.asInstanceOf[js.Any], sExtName.asInstanceOf[js.Any], fnCreateDefaultContent.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] | js.Promise[js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]]
      inline def extensionpoint(
        /**
        * The view or fragment containing the extension point
        */
      oContainer: typingsJapgolly.openui5.sapUiCoreFragmentMod.default,
        /**
        * The extensionName used to identify the extension point in the customizing
        */
      sExtName: String,
        /**
        * Optional callback function creating default content, returning an array of controls. It is executed when
        * there's no customizing, if not provided, no default content will be rendered. `fnCreateDefaultContent`
        * might also return a Promise, which resolves with an array of controls.
        */
      fnCreateDefaultContent: js.Function,
        /**
        * Optional - use this parameter to attach the extension point to a particular aggregation
        */
      oTargetControl: Unit,
        /**
        * Optional - if provided along with `oTargetControl`, the extension point content is added to this particular
        * aggregation at oTargetControl, if not given, but an oTargetControl is still present, the function will
        * attempt to add the extension point to the default aggregation of oTargetControl. If no oTargetControl
        * is provided, sAggregationName will also be ignored.
        */
      sAggregationName: String
      ): js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] | js.Promise[js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]] = (^.asInstanceOf[js.Dynamic].applyDynamic("extensionpoint")(oContainer.asInstanceOf[js.Any], sExtName.asInstanceOf[js.Any], fnCreateDefaultContent.asInstanceOf[js.Any], oTargetControl.asInstanceOf[js.Any], sAggregationName.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] | js.Promise[js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]]
      inline def extensionpoint(
        /**
        * The view or fragment containing the extension point
        */
      oContainer: typingsJapgolly.openui5.sapUiCoreFragmentMod.default,
        /**
        * The extensionName used to identify the extension point in the customizing
        */
      sExtName: String,
        /**
        * Optional callback function creating default content, returning an array of controls. It is executed when
        * there's no customizing, if not provided, no default content will be rendered. `fnCreateDefaultContent`
        * might also return a Promise, which resolves with an array of controls.
        */
      fnCreateDefaultContent: js.Function,
        /**
        * Optional - use this parameter to attach the extension point to a particular aggregation
        */
      oTargetControl: typingsJapgolly.openui5.sapUiCoreControlMod.default
      ): js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] | js.Promise[js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]] = (^.asInstanceOf[js.Dynamic].applyDynamic("extensionpoint")(oContainer.asInstanceOf[js.Any], sExtName.asInstanceOf[js.Any], fnCreateDefaultContent.asInstanceOf[js.Any], oTargetControl.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] | js.Promise[js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]]
      inline def extensionpoint(
        /**
        * The view or fragment containing the extension point
        */
      oContainer: typingsJapgolly.openui5.sapUiCoreFragmentMod.default,
        /**
        * The extensionName used to identify the extension point in the customizing
        */
      sExtName: String,
        /**
        * Optional callback function creating default content, returning an array of controls. It is executed when
        * there's no customizing, if not provided, no default content will be rendered. `fnCreateDefaultContent`
        * might also return a Promise, which resolves with an array of controls.
        */
      fnCreateDefaultContent: js.Function,
        /**
        * Optional - use this parameter to attach the extension point to a particular aggregation
        */
      oTargetControl: typingsJapgolly.openui5.sapUiCoreControlMod.default,
        /**
        * Optional - if provided along with `oTargetControl`, the extension point content is added to this particular
        * aggregation at oTargetControl, if not given, but an oTargetControl is still present, the function will
        * attempt to add the extension point to the default aggregation of oTargetControl. If no oTargetControl
        * is provided, sAggregationName will also be ignored.
        */
      sAggregationName: String
      ): js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] | js.Promise[js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]] = (^.asInstanceOf[js.Dynamic].applyDynamic("extensionpoint")(oContainer.asInstanceOf[js.Any], sExtName.asInstanceOf[js.Any], fnCreateDefaultContent.asInstanceOf[js.Any], oTargetControl.asInstanceOf[js.Any], sAggregationName.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] | js.Promise[js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]]
      inline def extensionpoint(
        /**
        * The view or fragment containing the extension point
        */
      oContainer: typingsJapgolly.openui5.sapUiCoreFragmentMod.default,
        /**
        * The extensionName used to identify the extension point in the customizing
        */
      sExtName: String,
        /**
        * Optional callback function creating default content, returning an array of controls. It is executed when
        * there's no customizing, if not provided, no default content will be rendered. `fnCreateDefaultContent`
        * might also return a Promise, which resolves with an array of controls.
        */
      fnCreateDefaultContent: Unit,
        /**
        * Optional - use this parameter to attach the extension point to a particular aggregation
        */
      oTargetControl: Unit,
        /**
        * Optional - if provided along with `oTargetControl`, the extension point content is added to this particular
        * aggregation at oTargetControl, if not given, but an oTargetControl is still present, the function will
        * attempt to add the extension point to the default aggregation of oTargetControl. If no oTargetControl
        * is provided, sAggregationName will also be ignored.
        */
      sAggregationName: String
      ): js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] | js.Promise[js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]] = (^.asInstanceOf[js.Dynamic].applyDynamic("extensionpoint")(oContainer.asInstanceOf[js.Any], sExtName.asInstanceOf[js.Any], fnCreateDefaultContent.asInstanceOf[js.Any], oTargetControl.asInstanceOf[js.Any], sAggregationName.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] | js.Promise[js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]]
      inline def extensionpoint(
        /**
        * The view or fragment containing the extension point
        */
      oContainer: typingsJapgolly.openui5.sapUiCoreFragmentMod.default,
        /**
        * The extensionName used to identify the extension point in the customizing
        */
      sExtName: String,
        /**
        * Optional callback function creating default content, returning an array of controls. It is executed when
        * there's no customizing, if not provided, no default content will be rendered. `fnCreateDefaultContent`
        * might also return a Promise, which resolves with an array of controls.
        */
      fnCreateDefaultContent: Unit,
        /**
        * Optional - use this parameter to attach the extension point to a particular aggregation
        */
      oTargetControl: typingsJapgolly.openui5.sapUiCoreControlMod.default
      ): js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] | js.Promise[js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]] = (^.asInstanceOf[js.Dynamic].applyDynamic("extensionpoint")(oContainer.asInstanceOf[js.Any], sExtName.asInstanceOf[js.Any], fnCreateDefaultContent.asInstanceOf[js.Any], oTargetControl.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] | js.Promise[js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]]
      inline def extensionpoint(
        /**
        * The view or fragment containing the extension point
        */
      oContainer: typingsJapgolly.openui5.sapUiCoreFragmentMod.default,
        /**
        * The extensionName used to identify the extension point in the customizing
        */
      sExtName: String,
        /**
        * Optional callback function creating default content, returning an array of controls. It is executed when
        * there's no customizing, if not provided, no default content will be rendered. `fnCreateDefaultContent`
        * might also return a Promise, which resolves with an array of controls.
        */
      fnCreateDefaultContent: Unit,
        /**
        * Optional - use this parameter to attach the extension point to a particular aggregation
        */
      oTargetControl: typingsJapgolly.openui5.sapUiCoreControlMod.default,
        /**
        * Optional - if provided along with `oTargetControl`, the extension point content is added to this particular
        * aggregation at oTargetControl, if not given, but an oTargetControl is still present, the function will
        * attempt to add the extension point to the default aggregation of oTargetControl. If no oTargetControl
        * is provided, sAggregationName will also be ignored.
        */
      sAggregationName: String
      ): js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] | js.Promise[js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]] = (^.asInstanceOf[js.Dynamic].applyDynamic("extensionpoint")(oContainer.asInstanceOf[js.Any], sExtName.asInstanceOf[js.Any], fnCreateDefaultContent.asInstanceOf[js.Any], oTargetControl.asInstanceOf[js.Any], sAggregationName.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] | js.Promise[js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]]
      /**
        * @deprecated (since 1.56) - Use {@link sap.ui.core.ExtensionPoint.load} instead
        *
        * Creates 0..n UI5 controls from an `ExtensionPoint`.
        *
        * One control if the `ExtensionPoint` is e.g. filled with a `View`, zero for extension points without configured
        * extension and n controls for multi-root `Fragments` as extension.
        *
        * In `JSViews`, this function allows both JSON notation in aggregation content as well as adding an extension
        * point to an aggregation after the target control has already been instantiated. In the latter case the
        * optional parameters oTargetControls and oTargetAggregation need to be specified.
        *
        * @returns An array with 0..n controls created from an ExtensionPoint or if fnCreateDefaultContent is called
        * and returns a Promise, a Promise with the controls is returned instead
        */
      inline def extensionpoint(
        /**
        * The view or fragment containing the extension point
        */
      oContainer: typingsJapgolly.openui5.sapUiCoreMvcViewMod.default,
        /**
        * The extensionName used to identify the extension point in the customizing
        */
      sExtName: String
      ): js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] | js.Promise[js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]] = (^.asInstanceOf[js.Dynamic].applyDynamic("extensionpoint")(oContainer.asInstanceOf[js.Any], sExtName.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] | js.Promise[js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]]
      inline def extensionpoint(
        /**
        * The view or fragment containing the extension point
        */
      oContainer: typingsJapgolly.openui5.sapUiCoreMvcViewMod.default,
        /**
        * The extensionName used to identify the extension point in the customizing
        */
      sExtName: String,
        /**
        * Optional callback function creating default content, returning an array of controls. It is executed when
        * there's no customizing, if not provided, no default content will be rendered. `fnCreateDefaultContent`
        * might also return a Promise, which resolves with an array of controls.
        */
      fnCreateDefaultContent: js.Function
      ): js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] | js.Promise[js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]] = (^.asInstanceOf[js.Dynamic].applyDynamic("extensionpoint")(oContainer.asInstanceOf[js.Any], sExtName.asInstanceOf[js.Any], fnCreateDefaultContent.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] | js.Promise[js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]]
      inline def extensionpoint(
        /**
        * The view or fragment containing the extension point
        */
      oContainer: typingsJapgolly.openui5.sapUiCoreMvcViewMod.default,
        /**
        * The extensionName used to identify the extension point in the customizing
        */
      sExtName: String,
        /**
        * Optional callback function creating default content, returning an array of controls. It is executed when
        * there's no customizing, if not provided, no default content will be rendered. `fnCreateDefaultContent`
        * might also return a Promise, which resolves with an array of controls.
        */
      fnCreateDefaultContent: js.Function,
        /**
        * Optional - use this parameter to attach the extension point to a particular aggregation
        */
      oTargetControl: Unit,
        /**
        * Optional - if provided along with `oTargetControl`, the extension point content is added to this particular
        * aggregation at oTargetControl, if not given, but an oTargetControl is still present, the function will
        * attempt to add the extension point to the default aggregation of oTargetControl. If no oTargetControl
        * is provided, sAggregationName will also be ignored.
        */
      sAggregationName: String
      ): js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] | js.Promise[js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]] = (^.asInstanceOf[js.Dynamic].applyDynamic("extensionpoint")(oContainer.asInstanceOf[js.Any], sExtName.asInstanceOf[js.Any], fnCreateDefaultContent.asInstanceOf[js.Any], oTargetControl.asInstanceOf[js.Any], sAggregationName.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] | js.Promise[js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]]
      inline def extensionpoint(
        /**
        * The view or fragment containing the extension point
        */
      oContainer: typingsJapgolly.openui5.sapUiCoreMvcViewMod.default,
        /**
        * The extensionName used to identify the extension point in the customizing
        */
      sExtName: String,
        /**
        * Optional callback function creating default content, returning an array of controls. It is executed when
        * there's no customizing, if not provided, no default content will be rendered. `fnCreateDefaultContent`
        * might also return a Promise, which resolves with an array of controls.
        */
      fnCreateDefaultContent: js.Function,
        /**
        * Optional - use this parameter to attach the extension point to a particular aggregation
        */
      oTargetControl: typingsJapgolly.openui5.sapUiCoreControlMod.default
      ): js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] | js.Promise[js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]] = (^.asInstanceOf[js.Dynamic].applyDynamic("extensionpoint")(oContainer.asInstanceOf[js.Any], sExtName.asInstanceOf[js.Any], fnCreateDefaultContent.asInstanceOf[js.Any], oTargetControl.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] | js.Promise[js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]]
      inline def extensionpoint(
        /**
        * The view or fragment containing the extension point
        */
      oContainer: typingsJapgolly.openui5.sapUiCoreMvcViewMod.default,
        /**
        * The extensionName used to identify the extension point in the customizing
        */
      sExtName: String,
        /**
        * Optional callback function creating default content, returning an array of controls. It is executed when
        * there's no customizing, if not provided, no default content will be rendered. `fnCreateDefaultContent`
        * might also return a Promise, which resolves with an array of controls.
        */
      fnCreateDefaultContent: js.Function,
        /**
        * Optional - use this parameter to attach the extension point to a particular aggregation
        */
      oTargetControl: typingsJapgolly.openui5.sapUiCoreControlMod.default,
        /**
        * Optional - if provided along with `oTargetControl`, the extension point content is added to this particular
        * aggregation at oTargetControl, if not given, but an oTargetControl is still present, the function will
        * attempt to add the extension point to the default aggregation of oTargetControl. If no oTargetControl
        * is provided, sAggregationName will also be ignored.
        */
      sAggregationName: String
      ): js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] | js.Promise[js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]] = (^.asInstanceOf[js.Dynamic].applyDynamic("extensionpoint")(oContainer.asInstanceOf[js.Any], sExtName.asInstanceOf[js.Any], fnCreateDefaultContent.asInstanceOf[js.Any], oTargetControl.asInstanceOf[js.Any], sAggregationName.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] | js.Promise[js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]]
      inline def extensionpoint(
        /**
        * The view or fragment containing the extension point
        */
      oContainer: typingsJapgolly.openui5.sapUiCoreMvcViewMod.default,
        /**
        * The extensionName used to identify the extension point in the customizing
        */
      sExtName: String,
        /**
        * Optional callback function creating default content, returning an array of controls. It is executed when
        * there's no customizing, if not provided, no default content will be rendered. `fnCreateDefaultContent`
        * might also return a Promise, which resolves with an array of controls.
        */
      fnCreateDefaultContent: Unit,
        /**
        * Optional - use this parameter to attach the extension point to a particular aggregation
        */
      oTargetControl: Unit,
        /**
        * Optional - if provided along with `oTargetControl`, the extension point content is added to this particular
        * aggregation at oTargetControl, if not given, but an oTargetControl is still present, the function will
        * attempt to add the extension point to the default aggregation of oTargetControl. If no oTargetControl
        * is provided, sAggregationName will also be ignored.
        */
      sAggregationName: String
      ): js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] | js.Promise[js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]] = (^.asInstanceOf[js.Dynamic].applyDynamic("extensionpoint")(oContainer.asInstanceOf[js.Any], sExtName.asInstanceOf[js.Any], fnCreateDefaultContent.asInstanceOf[js.Any], oTargetControl.asInstanceOf[js.Any], sAggregationName.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] | js.Promise[js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]]
      inline def extensionpoint(
        /**
        * The view or fragment containing the extension point
        */
      oContainer: typingsJapgolly.openui5.sapUiCoreMvcViewMod.default,
        /**
        * The extensionName used to identify the extension point in the customizing
        */
      sExtName: String,
        /**
        * Optional callback function creating default content, returning an array of controls. It is executed when
        * there's no customizing, if not provided, no default content will be rendered. `fnCreateDefaultContent`
        * might also return a Promise, which resolves with an array of controls.
        */
      fnCreateDefaultContent: Unit,
        /**
        * Optional - use this parameter to attach the extension point to a particular aggregation
        */
      oTargetControl: typingsJapgolly.openui5.sapUiCoreControlMod.default
      ): js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] | js.Promise[js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]] = (^.asInstanceOf[js.Dynamic].applyDynamic("extensionpoint")(oContainer.asInstanceOf[js.Any], sExtName.asInstanceOf[js.Any], fnCreateDefaultContent.asInstanceOf[js.Any], oTargetControl.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] | js.Promise[js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]]
      inline def extensionpoint(
        /**
        * The view or fragment containing the extension point
        */
      oContainer: typingsJapgolly.openui5.sapUiCoreMvcViewMod.default,
        /**
        * The extensionName used to identify the extension point in the customizing
        */
      sExtName: String,
        /**
        * Optional callback function creating default content, returning an array of controls. It is executed when
        * there's no customizing, if not provided, no default content will be rendered. `fnCreateDefaultContent`
        * might also return a Promise, which resolves with an array of controls.
        */
      fnCreateDefaultContent: Unit,
        /**
        * Optional - use this parameter to attach the extension point to a particular aggregation
        */
      oTargetControl: typingsJapgolly.openui5.sapUiCoreControlMod.default,
        /**
        * Optional - if provided along with `oTargetControl`, the extension point content is added to this particular
        * aggregation at oTargetControl, if not given, but an oTargetControl is still present, the function will
        * attempt to add the extension point to the default aggregation of oTargetControl. If no oTargetControl
        * is provided, sAggregationName will also be ignored.
        */
      sAggregationName: String
      ): js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] | js.Promise[js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]] = (^.asInstanceOf[js.Dynamic].applyDynamic("extensionpoint")(oContainer.asInstanceOf[js.Any], sExtName.asInstanceOf[js.Any], fnCreateDefaultContent.asInstanceOf[js.Any], oTargetControl.asInstanceOf[js.Any], sAggregationName.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] | js.Promise[js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]]
      
      /**
        * @deprecated (since 1.58) - use {@link sap.ui.core.Fragment.load} instead
        *
        * Instantiate a Fragment - this method loads the Fragment content, instantiates it, and returns this content.
        * The Fragment object itself is not an entity which has further significance beyond this constructor.
        *
        * To instantiate an existing Fragment, call this method as: sap.ui.fragment(sName, sType, [oController]);
        * The sName must correspond to a Fragment module which can be loaded via the module system (fragmentName
        * + suffix ".fragment.[typeextension]") and which defines the Fragment content. If oController is given,
        * the (event handler) methods referenced in the Fragment will be called on this controller. Note that Fragments
        * may require a Controller to be given and certain methods to be available.
        *
        * The Fragment types "XML", "JS" and "HTML" are available by default; additional Fragment types can be
        * implemented and added using the sap.ui.core.Fragment.registerType() function.
        *
        * Advanced usage: To instantiate a Fragment and give further configuration options, call this method as:
        * sap.ui.fragment(oFragmentConfig, [oController]); The oFragmentConfig object can have the following properties:
        * - "fragmentName": the name of the Fragment, as above - "fragmentContent": the definition of the Fragment
        * content itself. When this property is given, any given name is ignored. The type of this property depends
        * on the Fragment type, e.g. it could be a string for XML Fragments. - "type": the type of the Fragment,
        * as above (mandatory) - "id": the ID of the Fragment (optional) Further properties may be supported by
        * future or custom Fragment types. Any given properties will be forwarded to the Fragment implementation.
        *
        * If you want to give a fixed ID for the Fragment, please use the advanced version of this method call
        * with the configuration object or use the typed factories like sap.ui.xmlfragment(...) or sap.ui.jsfragment(...).
        * Otherwise the Fragment ID is generated. In any case, the Fragment ID will be used as prefix for the ID
        * of all contained controls.
        *
        * @returns the root Control(s) of the Fragment content
        */
      inline def fragment(
        /**
        * the Fragment name
        */
      sName: String,
        /**
        * the Fragment type, e.g. "XML", "JS", or "HTML"
        */
      sType: String
      ): typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("fragment")(sName.asInstanceOf[js.Any], sType.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]
      inline def fragment(
        /**
        * the Fragment name
        */
      sName: String,
        /**
        * the Fragment type, e.g. "XML", "JS", or "HTML"
        */
      sType: String,
        /**
        * the Controller or Object which should be used by the controls in the Fragment. Note that some Fragments
        * may not need a Controller and other may need one - and even rely on certain methods implemented in the
        * Controller.
        */
      oController: js.Object
      ): typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("fragment")(sName.asInstanceOf[js.Any], sType.asInstanceOf[js.Any], oController.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]
      inline def fragment(
        /**
        * the Fragment name
        */
      sName: String,
        /**
        * the Fragment type, e.g. "XML", "JS", or "HTML"
        */
      sType: String,
        /**
        * the Controller or Object which should be used by the controls in the Fragment. Note that some Fragments
        * may not need a Controller and other may need one - and even rely on certain methods implemented in the
        * Controller.
        */
      oController: typingsJapgolly.openui5.sapUiCoreMvcControllerMod.default
      ): typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("fragment")(sName.asInstanceOf[js.Any], sType.asInstanceOf[js.Any], oController.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]
      inline def fragment(
        /**
        * the Fragment name
        */
      sName: js.Object,
        /**
        * the Fragment type, e.g. "XML", "JS", or "HTML"
        */
      sType: String
      ): typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("fragment")(sName.asInstanceOf[js.Any], sType.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]
      inline def fragment(
        /**
        * the Fragment name
        */
      sName: js.Object,
        /**
        * the Fragment type, e.g. "XML", "JS", or "HTML"
        */
      sType: String,
        /**
        * the Controller or Object which should be used by the controls in the Fragment. Note that some Fragments
        * may not need a Controller and other may need one - and even rely on certain methods implemented in the
        * Controller.
        */
      oController: js.Object
      ): typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("fragment")(sName.asInstanceOf[js.Any], sType.asInstanceOf[js.Any], oController.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]
      inline def fragment(
        /**
        * the Fragment name
        */
      sName: js.Object,
        /**
        * the Fragment type, e.g. "XML", "JS", or "HTML"
        */
      sType: String,
        /**
        * the Controller or Object which should be used by the controls in the Fragment. Note that some Fragments
        * may not need a Controller and other may need one - and even rely on certain methods implemented in the
        * Controller.
        */
      oController: typingsJapgolly.openui5.sapUiCoreMvcControllerMod.default
      ): typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("fragment")(sName.asInstanceOf[js.Any], sType.asInstanceOf[js.Any], oController.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]
      
      /**
        * Retrieve the {@link sap.ui.core.Core SAPUI5 Core} instance for the current window.
        *
        * @returns the API of the current SAPUI5 Core instance.
        */
      inline def getCore(): Core = ^.asInstanceOf[js.Dynamic].applyDynamic("getCore")().asInstanceOf[Core]
      
      /**
        * @deprecated (since 1.56) - Use {@link module:sap/ui/VersionInfo.load} instead
        *
        * Loads the version info file (resources/sap-ui-version.json) and returns it or if a library name is specified
        * then the version info of the individual library will be returned.
        *
        * In case of the version info file is not available an error will occur when calling this function.
        *
        * @returns the full version info, the library specific one, undefined (if library is not listed or there
        * was an error and "failOnError" is set to "false") or a Promise which resolves with one of them
        */
      inline def getVersionInfo(): js.UndefOr[js.Object | js.Promise[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getVersionInfo")().asInstanceOf[js.UndefOr[js.Object | js.Promise[Any]]]
      inline def getVersionInfo(
        /**
        * name of the library (e.g. "sap.ui.core") or an object map (see below)
        */
      mOptions: String
      ): js.UndefOr[js.Object | js.Promise[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getVersionInfo")(mOptions.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Object | js.Promise[Any]]]
      inline def getVersionInfo(
        /**
        * name of the library (e.g. "sap.ui.core") or an object map (see below)
        */
      mOptions: FailOnError
      ): js.UndefOr[js.Object | js.Promise[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getVersionInfo")(mOptions.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Object | js.Promise[Any]]]
      
      /**
        * @deprecated (since 1.58) - use {@link sap.ui.core.Fragment.load} instead
        *
        * Instantiates an HTML-based Fragment.
        *
        * To instantiate a fragment, call:
        * ```javascript
        *
        *    sap.ui.htmlfragment([sId], sFragmentName, [oController]);
        * ```
        *  The fragment instance ID is optional and will be used as prefix for the ID of all contained controls.
        * If no ID is passed, controls will not be prefixed. The `sFragmentName` must correspond to an HTML fragment
        * which can be loaded via the module system (fragmentName + ".fragment.html") and which defines the fragment.
        * If `oController` is given, the methods referenced in the fragment will be called on this controller.
        * Note that fragments may require a controller to be given and certain methods to be available.
        *
        * Advanced usage:: To instantiate a fragment and optionally directly give the HTML definition instead of
        * loading it from a file, call:
        * ```javascript
        *
        *     sap.ui.htmlfragment(oFragmentConfig, [oController]);
        * ```
        *  The `oFragmentConfig` object can either have a `fragmentName` or a `fragmentContent` property, but not
        * both of them. `fragmentContent` can hold the fragment definition as XML string; if not given, `fragmentName`
        * must be given and the fragment content definition is loaded by the module system. Again, if `oController`
        * is given, any methods referenced in the fragment will be called on this controller.
        *
        * @returns Root control or controls of the created fragment instance
        */
      inline def htmlfragment(
        /**
        * ID of the newly created fragment
        */
      sId: String,
        /**
        * Resource name of the fragment, a module name in dot notation without the '.fragment.html' suffix. Alternatively,
        * a configuration object can be given with the properties described below. In this case, no `sId` may be
        * given as first parameter, but as property `id` in the configuration object.
        */
      vFragment: String
      ): typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("htmlfragment")(sId.asInstanceOf[js.Any], vFragment.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]
      inline def htmlfragment(
        /**
        * ID of the newly created fragment
        */
      sId: String,
        /**
        * Resource name of the fragment, a module name in dot notation without the '.fragment.html' suffix. Alternatively,
        * a configuration object can be given with the properties described below. In this case, no `sId` may be
        * given as first parameter, but as property `id` in the configuration object.
        */
      vFragment: String,
        /**
        * A controller to be used for event handlers in the fragment; can either be the controller of an enclosing
        * view, a new controller instance, or a simple object with the necessary methods attached. Note that a
        * fragment has no runtime representation besides its contained controls. There's therefore no API to retrieve
        * the controller after creating a fragment
        */
      oController: js.Object
      ): typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("htmlfragment")(sId.asInstanceOf[js.Any], vFragment.asInstanceOf[js.Any], oController.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]
      inline def htmlfragment(
        /**
        * ID of the newly created fragment
        */
      sId: String,
        /**
        * Resource name of the fragment, a module name in dot notation without the '.fragment.html' suffix. Alternatively,
        * a configuration object can be given with the properties described below. In this case, no `sId` may be
        * given as first parameter, but as property `id` in the configuration object.
        */
      vFragment: String,
        /**
        * A controller to be used for event handlers in the fragment; can either be the controller of an enclosing
        * view, a new controller instance, or a simple object with the necessary methods attached. Note that a
        * fragment has no runtime representation besides its contained controls. There's therefore no API to retrieve
        * the controller after creating a fragment
        */
      oController: typingsJapgolly.openui5.sapUiCoreMvcControllerMod.default
      ): typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("htmlfragment")(sId.asInstanceOf[js.Any], vFragment.asInstanceOf[js.Any], oController.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]
      inline def htmlfragment(
        /**
        * ID of the newly created fragment
        */
      sId: String,
        /**
        * Resource name of the fragment, a module name in dot notation without the '.fragment.html' suffix. Alternatively,
        * a configuration object can be given with the properties described below. In this case, no `sId` may be
        * given as first parameter, but as property `id` in the configuration object.
        */
      vFragment: FragmentContent
      ): typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("htmlfragment")(sId.asInstanceOf[js.Any], vFragment.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]
      inline def htmlfragment(
        /**
        * ID of the newly created fragment
        */
      sId: String,
        /**
        * Resource name of the fragment, a module name in dot notation without the '.fragment.html' suffix. Alternatively,
        * a configuration object can be given with the properties described below. In this case, no `sId` may be
        * given as first parameter, but as property `id` in the configuration object.
        */
      vFragment: FragmentContent,
        /**
        * A controller to be used for event handlers in the fragment; can either be the controller of an enclosing
        * view, a new controller instance, or a simple object with the necessary methods attached. Note that a
        * fragment has no runtime representation besides its contained controls. There's therefore no API to retrieve
        * the controller after creating a fragment
        */
      oController: js.Object
      ): typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("htmlfragment")(sId.asInstanceOf[js.Any], vFragment.asInstanceOf[js.Any], oController.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]
      inline def htmlfragment(
        /**
        * ID of the newly created fragment
        */
      sId: String,
        /**
        * Resource name of the fragment, a module name in dot notation without the '.fragment.html' suffix. Alternatively,
        * a configuration object can be given with the properties described below. In this case, no `sId` may be
        * given as first parameter, but as property `id` in the configuration object.
        */
      vFragment: FragmentContent,
        /**
        * A controller to be used for event handlers in the fragment; can either be the controller of an enclosing
        * view, a new controller instance, or a simple object with the necessary methods attached. Note that a
        * fragment has no runtime representation besides its contained controls. There's therefore no API to retrieve
        * the controller after creating a fragment
        */
      oController: typingsJapgolly.openui5.sapUiCoreMvcControllerMod.default
      ): typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("htmlfragment")(sId.asInstanceOf[js.Any], vFragment.asInstanceOf[js.Any], oController.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]
      /**
        * @deprecated (since 1.58) - use {@link sap.ui.core.Fragment.load} instead
        *
        * Instantiates an HTML-based Fragment.
        *
        * To instantiate a fragment, call:
        * ```javascript
        *
        *    sap.ui.htmlfragment([sId], sFragmentName, [oController]);
        * ```
        *  The fragment instance ID is optional and will be used as prefix for the ID of all contained controls.
        * If no ID is passed, controls will not be prefixed. The `sFragmentName` must correspond to an HTML fragment
        * which can be loaded via the module system (fragmentName + ".fragment.html") and which defines the fragment.
        * If `oController` is given, the methods referenced in the fragment will be called on this controller.
        * Note that fragments may require a controller to be given and certain methods to be available.
        *
        * Advanced usage:: To instantiate a fragment and optionally directly give the HTML definition instead of
        * loading it from a file, call:
        * ```javascript
        *
        *     sap.ui.htmlfragment(oFragmentConfig, [oController]);
        * ```
        *  The `oFragmentConfig` object can either have a `fragmentName` or a `fragmentContent` property, but not
        * both of them. `fragmentContent` can hold the fragment definition as XML string; if not given, `fragmentName`
        * must be given and the fragment content definition is loaded by the module system. Again, if `oController`
        * is given, any methods referenced in the fragment will be called on this controller.
        *
        * @returns Root control or controls of the created fragment instance
        */
      inline def htmlfragment(
        /**
        * Resource name of the fragment, a module name in dot notation without the '.fragment.html' suffix. Alternatively,
        * a configuration object can be given with the properties described below. In this case, no `sId` may be
        * given as first parameter, but as property `id` in the configuration object.
        */
      vFragment: String
      ): typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] = ^.asInstanceOf[js.Dynamic].applyDynamic("htmlfragment")(vFragment.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]
      inline def htmlfragment(
        /**
        * Resource name of the fragment, a module name in dot notation without the '.fragment.html' suffix. Alternatively,
        * a configuration object can be given with the properties described below. In this case, no `sId` may be
        * given as first parameter, but as property `id` in the configuration object.
        */
      vFragment: String,
        /**
        * A controller to be used for event handlers in the fragment; can either be the controller of an enclosing
        * view, a new controller instance, or a simple object with the necessary methods attached. Note that a
        * fragment has no runtime representation besides its contained controls. There's therefore no API to retrieve
        * the controller after creating a fragment
        */
      oController: js.Object
      ): typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("htmlfragment")(vFragment.asInstanceOf[js.Any], oController.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]
      inline def htmlfragment(
        /**
        * Resource name of the fragment, a module name in dot notation without the '.fragment.html' suffix. Alternatively,
        * a configuration object can be given with the properties described below. In this case, no `sId` may be
        * given as first parameter, but as property `id` in the configuration object.
        */
      vFragment: String,
        /**
        * A controller to be used for event handlers in the fragment; can either be the controller of an enclosing
        * view, a new controller instance, or a simple object with the necessary methods attached. Note that a
        * fragment has no runtime representation besides its contained controls. There's therefore no API to retrieve
        * the controller after creating a fragment
        */
      oController: typingsJapgolly.openui5.sapUiCoreMvcControllerMod.default
      ): typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("htmlfragment")(vFragment.asInstanceOf[js.Any], oController.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]
      inline def htmlfragment(
        /**
        * Resource name of the fragment, a module name in dot notation without the '.fragment.html' suffix. Alternatively,
        * a configuration object can be given with the properties described below. In this case, no `sId` may be
        * given as first parameter, but as property `id` in the configuration object.
        */
      vFragment: FragmentContent
      ): typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] = ^.asInstanceOf[js.Dynamic].applyDynamic("htmlfragment")(vFragment.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]
      inline def htmlfragment(
        /**
        * Resource name of the fragment, a module name in dot notation without the '.fragment.html' suffix. Alternatively,
        * a configuration object can be given with the properties described below. In this case, no `sId` may be
        * given as first parameter, but as property `id` in the configuration object.
        */
      vFragment: FragmentContent,
        /**
        * A controller to be used for event handlers in the fragment; can either be the controller of an enclosing
        * view, a new controller instance, or a simple object with the necessary methods attached. Note that a
        * fragment has no runtime representation besides its contained controls. There's therefore no API to retrieve
        * the controller after creating a fragment
        */
      oController: js.Object
      ): typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("htmlfragment")(vFragment.asInstanceOf[js.Any], oController.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]
      inline def htmlfragment(
        /**
        * Resource name of the fragment, a module name in dot notation without the '.fragment.html' suffix. Alternatively,
        * a configuration object can be given with the properties described below. In this case, no `sId` may be
        * given as first parameter, but as property `id` in the configuration object.
        */
      vFragment: FragmentContent,
        /**
        * A controller to be used for event handlers in the fragment; can either be the controller of an enclosing
        * view, a new controller instance, or a simple object with the necessary methods attached. Note that a
        * fragment has no runtime representation besides its contained controls. There's therefore no API to retrieve
        * the controller after creating a fragment
        */
      oController: typingsJapgolly.openui5.sapUiCoreMvcControllerMod.default
      ): typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("htmlfragment")(vFragment.asInstanceOf[js.Any], oController.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]
      
      /**
        * @deprecated (since 1.56) - Use {@link sap.ui.core.mvc.HTMLView.create HTMLView.create} to create view
        * instances
        *
        * Defines or creates an instance of a declarative HTML view.
        *
        * The behavior of this method depends on the signature of the call and on the current context.
        *
        *
        * 	 - View Definition `sap.ui.htmlview(sId, vView)`: Defines a view of the given name with the given implementation.
        * 			sId must be the views name, vView must be an object and can contain implementations for any of the hooks
        * 			provided by HTMLView
        * 	 - View Instantiation `sap.ui.htmlview(sId?, vView)`: Creates an instance of the view with the given
        * 			name (and id).
        *
        * Any other call signature will lead to a runtime error. If the id is omitted in the second variant, an
        * id will be created automatically.
        *
        * @returns the created HTMLView instance in the creation case, otherwise undefined
        */
      inline def htmlview(
        /**
        * id of the newly created view, only allowed for instance creation
        */
      sId: String,
        /**
        * name or implementation of the view.
        */
      vView: String
      ): js.UndefOr[typingsJapgolly.openui5.sapUiCoreMvcHtmlviewMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("htmlview")(sId.asInstanceOf[js.Any], vView.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsJapgolly.openui5.sapUiCoreMvcHtmlviewMod.default]]
      inline def htmlview(
        /**
        * id of the newly created view, only allowed for instance creation
        */
      sId: String,
        /**
        * name or implementation of the view.
        */
      vView: `19`
      ): js.UndefOr[typingsJapgolly.openui5.sapUiCoreMvcHtmlviewMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("htmlview")(sId.asInstanceOf[js.Any], vView.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsJapgolly.openui5.sapUiCoreMvcHtmlviewMod.default]]
      /**
        * @deprecated (since 1.56) - Use {@link sap.ui.core.mvc.HTMLView.create HTMLView.create} to create view
        * instances
        *
        * Defines or creates an instance of a declarative HTML view.
        *
        * The behavior of this method depends on the signature of the call and on the current context.
        *
        *
        * 	 - View Definition `sap.ui.htmlview(sId, vView)`: Defines a view of the given name with the given implementation.
        * 			sId must be the views name, vView must be an object and can contain implementations for any of the hooks
        * 			provided by HTMLView
        * 	 - View Instantiation `sap.ui.htmlview(sId?, vView)`: Creates an instance of the view with the given
        * 			name (and id).
        *
        * Any other call signature will lead to a runtime error. If the id is omitted in the second variant, an
        * id will be created automatically.
        *
        * @returns the created HTMLView instance in the creation case, otherwise undefined
        */
      inline def htmlview(/**
        * name or implementation of the view.
        */
      vView: String): js.UndefOr[typingsJapgolly.openui5.sapUiCoreMvcHtmlviewMod.default] = ^.asInstanceOf[js.Dynamic].applyDynamic("htmlview")(vView.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typingsJapgolly.openui5.sapUiCoreMvcHtmlviewMod.default]]
      inline def htmlview(/**
        * name or implementation of the view.
        */
      vView: `19`): js.UndefOr[typingsJapgolly.openui5.sapUiCoreMvcHtmlviewMod.default] = ^.asInstanceOf[js.Dynamic].applyDynamic("htmlview")(vView.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typingsJapgolly.openui5.sapUiCoreMvcHtmlviewMod.default]]
      
      /**
        * @SINCE 1.62
        *
        * SAPUI5 library with controls specialized for SAP Fiori apps.
        */
      object integration {
        
        object designtime {
          
          object baseEditor {
            
            object propertyEditor {
              
              object iconEditor {
                
                /**
                  * @SINCE 1.81
                  * @EXPERIMENTAL
                  *
                  * Validates if the provided value belongs to the icon pool.
                  */
                object IsInIconPool {
                  
                  @JSGlobal("sap.ui.integration.designtime.baseEditor.propertyEditor.iconEditor.IsInIconPool")
                  @js.native
                  val ^ : js.Any = js.native
                  
                  inline def validate(/**
                    * Value to validate
                    */
                  vValue: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(vValue.asInstanceOf[js.Any]).asInstanceOf[Boolean]
                  /**
                    * Validator function
                    *
                    * @returns Validation result
                    */
                  inline def validate(/**
                    * Value to validate
                    */
                  vValue: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(vValue.asInstanceOf[js.Any]).asInstanceOf[Boolean]
                }
              }
            }
          }
        }
      }
      
      /**
        * @deprecated (since 1.58) - use {@link sap.ui.core.Fragment.load} instead
        *
        * Defines OR instantiates an HTML-based fragment.
        *
        * To define a JS fragment, call:
        * ```javascript
        *
        *    sap.ui.jsfragment(sName, oFragmentDefinition)
        * ```
        *  where:
        * 	 - `sName` is the name by which this fragment later can be found and instantiated. If defined in its
        * 			own file, in order to be found by the module loading system, the file location and name must correspond
        * 			to `sName` (path + file name must be: fragmentName + ".fragment.js").
        * 	 - `oFragmentDefinition` is an object at least holding the `createContent(oController)` method which
        * 			defines the fragment content. If given during instantiation, the `createContent` method receives a controller
        * 			instance (otherwise, parameter `oController` will be undefined) and the return value must be one `sap.ui.core.Control`
        * 			(which could have any number of children).
        *
        * To instantiate a JS fragment, call:
        * ```javascript
        *
        *    sap.ui.jsfragment([sId], sFragmentName, [oController]);
        * ```
        *  The fragment ID is optional (generated if not given) and the fragment implementation can use
        * it to make contained controls unique (this depends on the implementation: some JS fragments may choose
        * not to support multiple instances within one application and not use the ID prefixing). The `sFragmentName`
        * must correspond to a JS fragment which can be loaded via the module system (`sFragmentName` converted
        * to a path + ".fragment.js" suffix) and which defines the fragment. Or it can be a name that has been
        * used earlier to define a fragment of that name. If `oController` is given, the methods referenced in
        * the fragment will be called on this controller. Note that fragments may require a controller to be given
        * and certain methods to be available.
        *
        * @returns The root control(s) of the created fragment instance
        */
      inline def jsfragment(
        /**
        * Name of the fragment when defining a fragment; ID or name or configuration object when instantiating
        * a fragment
        */
      vName: String
      ): typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] = ^.asInstanceOf[js.Dynamic].applyDynamic("jsfragment")(vName.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]
      inline def jsfragment(
        /**
        * Name of the fragment when defining a fragment; ID or name or configuration object when instantiating
        * a fragment
        */
      vName: String,
        /**
        * When defining a fragment, this parameter must be a factory object that will be used to create new instances
        * of the fragment; it must at least contain a `createContent` method. When creating an instance of a fragment
        * and when `vName` was an ID, this parameter must be the name of the fragment. When the first parameter
        * was a name, this parameter must be omitted.
        */
      vFragmentDefinition: String
      ): typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsfragment")(vName.asInstanceOf[js.Any], vFragmentDefinition.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]
      inline def jsfragment(
        /**
        * Name of the fragment when defining a fragment; ID or name or configuration object when instantiating
        * a fragment
        */
      vName: String,
        /**
        * When defining a fragment, this parameter must be a factory object that will be used to create new instances
        * of the fragment; it must at least contain a `createContent` method. When creating an instance of a fragment
        * and when `vName` was an ID, this parameter must be the name of the fragment. When the first parameter
        * was a name, this parameter must be omitted.
        */
      vFragmentDefinition: String,
        /**
        * A controller to be used for event handlers in the fragment; can either be the controller of an enclosing
        * view, a new controller instance, or a simple object with the necessary methods attached. Note that a
        * fragment has no runtime representation besides its contained controls. There's therefore no API to retrieve
        * the controller after creating a fragment
        */
      oController: js.Object
      ): typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsfragment")(vName.asInstanceOf[js.Any], vFragmentDefinition.asInstanceOf[js.Any], oController.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]
      inline def jsfragment(
        /**
        * Name of the fragment when defining a fragment; ID or name or configuration object when instantiating
        * a fragment
        */
      vName: String,
        /**
        * When defining a fragment, this parameter must be a factory object that will be used to create new instances
        * of the fragment; it must at least contain a `createContent` method. When creating an instance of a fragment
        * and when `vName` was an ID, this parameter must be the name of the fragment. When the first parameter
        * was a name, this parameter must be omitted.
        */
      vFragmentDefinition: String,
        /**
        * A controller to be used for event handlers in the fragment; can either be the controller of an enclosing
        * view, a new controller instance, or a simple object with the necessary methods attached. Note that a
        * fragment has no runtime representation besides its contained controls. There's therefore no API to retrieve
        * the controller after creating a fragment
        */
      oController: typingsJapgolly.openui5.sapUiCoreMvcControllerMod.default
      ): typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsfragment")(vName.asInstanceOf[js.Any], vFragmentDefinition.asInstanceOf[js.Any], oController.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]
      inline def jsfragment(
        /**
        * Name of the fragment when defining a fragment; ID or name or configuration object when instantiating
        * a fragment
        */
      vName: String,
        /**
        * When defining a fragment, this parameter must be a factory object that will be used to create new instances
        * of the fragment; it must at least contain a `createContent` method. When creating an instance of a fragment
        * and when `vName` was an ID, this parameter must be the name of the fragment. When the first parameter
        * was a name, this parameter must be omitted.
        */
      vFragmentDefinition: js.Object
      ): typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsfragment")(vName.asInstanceOf[js.Any], vFragmentDefinition.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]
      inline def jsfragment(
        /**
        * Name of the fragment when defining a fragment; ID or name or configuration object when instantiating
        * a fragment
        */
      vName: String,
        /**
        * When defining a fragment, this parameter must be a factory object that will be used to create new instances
        * of the fragment; it must at least contain a `createContent` method. When creating an instance of a fragment
        * and when `vName` was an ID, this parameter must be the name of the fragment. When the first parameter
        * was a name, this parameter must be omitted.
        */
      vFragmentDefinition: js.Object,
        /**
        * A controller to be used for event handlers in the fragment; can either be the controller of an enclosing
        * view, a new controller instance, or a simple object with the necessary methods attached. Note that a
        * fragment has no runtime representation besides its contained controls. There's therefore no API to retrieve
        * the controller after creating a fragment
        */
      oController: js.Object
      ): typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsfragment")(vName.asInstanceOf[js.Any], vFragmentDefinition.asInstanceOf[js.Any], oController.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]
      inline def jsfragment(
        /**
        * Name of the fragment when defining a fragment; ID or name or configuration object when instantiating
        * a fragment
        */
      vName: String,
        /**
        * When defining a fragment, this parameter must be a factory object that will be used to create new instances
        * of the fragment; it must at least contain a `createContent` method. When creating an instance of a fragment
        * and when `vName` was an ID, this parameter must be the name of the fragment. When the first parameter
        * was a name, this parameter must be omitted.
        */
      vFragmentDefinition: js.Object,
        /**
        * A controller to be used for event handlers in the fragment; can either be the controller of an enclosing
        * view, a new controller instance, or a simple object with the necessary methods attached. Note that a
        * fragment has no runtime representation besides its contained controls. There's therefore no API to retrieve
        * the controller after creating a fragment
        */
      oController: typingsJapgolly.openui5.sapUiCoreMvcControllerMod.default
      ): typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsfragment")(vName.asInstanceOf[js.Any], vFragmentDefinition.asInstanceOf[js.Any], oController.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]
      inline def jsfragment(
        /**
        * Name of the fragment when defining a fragment; ID or name or configuration object when instantiating
        * a fragment
        */
      vName: String,
        /**
        * When defining a fragment, this parameter must be a factory object that will be used to create new instances
        * of the fragment; it must at least contain a `createContent` method. When creating an instance of a fragment
        * and when `vName` was an ID, this parameter must be the name of the fragment. When the first parameter
        * was a name, this parameter must be omitted.
        */
      vFragmentDefinition: Unit,
        /**
        * A controller to be used for event handlers in the fragment; can either be the controller of an enclosing
        * view, a new controller instance, or a simple object with the necessary methods attached. Note that a
        * fragment has no runtime representation besides its contained controls. There's therefore no API to retrieve
        * the controller after creating a fragment
        */
      oController: js.Object
      ): typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsfragment")(vName.asInstanceOf[js.Any], vFragmentDefinition.asInstanceOf[js.Any], oController.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]
      inline def jsfragment(
        /**
        * Name of the fragment when defining a fragment; ID or name or configuration object when instantiating
        * a fragment
        */
      vName: String,
        /**
        * When defining a fragment, this parameter must be a factory object that will be used to create new instances
        * of the fragment; it must at least contain a `createContent` method. When creating an instance of a fragment
        * and when `vName` was an ID, this parameter must be the name of the fragment. When the first parameter
        * was a name, this parameter must be omitted.
        */
      vFragmentDefinition: Unit,
        /**
        * A controller to be used for event handlers in the fragment; can either be the controller of an enclosing
        * view, a new controller instance, or a simple object with the necessary methods attached. Note that a
        * fragment has no runtime representation besides its contained controls. There's therefore no API to retrieve
        * the controller after creating a fragment
        */
      oController: typingsJapgolly.openui5.sapUiCoreMvcControllerMod.default
      ): typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsfragment")(vName.asInstanceOf[js.Any], vFragmentDefinition.asInstanceOf[js.Any], oController.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]
      inline def jsfragment(
        /**
        * Name of the fragment when defining a fragment; ID or name or configuration object when instantiating
        * a fragment
        */
      vName: FragmentName
      ): typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] = ^.asInstanceOf[js.Dynamic].applyDynamic("jsfragment")(vName.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]
      inline def jsfragment(
        /**
        * Name of the fragment when defining a fragment; ID or name or configuration object when instantiating
        * a fragment
        */
      vName: FragmentName,
        /**
        * When defining a fragment, this parameter must be a factory object that will be used to create new instances
        * of the fragment; it must at least contain a `createContent` method. When creating an instance of a fragment
        * and when `vName` was an ID, this parameter must be the name of the fragment. When the first parameter
        * was a name, this parameter must be omitted.
        */
      vFragmentDefinition: String
      ): typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsfragment")(vName.asInstanceOf[js.Any], vFragmentDefinition.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]
      inline def jsfragment(
        /**
        * Name of the fragment when defining a fragment; ID or name or configuration object when instantiating
        * a fragment
        */
      vName: FragmentName,
        /**
        * When defining a fragment, this parameter must be a factory object that will be used to create new instances
        * of the fragment; it must at least contain a `createContent` method. When creating an instance of a fragment
        * and when `vName` was an ID, this parameter must be the name of the fragment. When the first parameter
        * was a name, this parameter must be omitted.
        */
      vFragmentDefinition: String,
        /**
        * A controller to be used for event handlers in the fragment; can either be the controller of an enclosing
        * view, a new controller instance, or a simple object with the necessary methods attached. Note that a
        * fragment has no runtime representation besides its contained controls. There's therefore no API to retrieve
        * the controller after creating a fragment
        */
      oController: js.Object
      ): typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsfragment")(vName.asInstanceOf[js.Any], vFragmentDefinition.asInstanceOf[js.Any], oController.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]
      inline def jsfragment(
        /**
        * Name of the fragment when defining a fragment; ID or name or configuration object when instantiating
        * a fragment
        */
      vName: FragmentName,
        /**
        * When defining a fragment, this parameter must be a factory object that will be used to create new instances
        * of the fragment; it must at least contain a `createContent` method. When creating an instance of a fragment
        * and when `vName` was an ID, this parameter must be the name of the fragment. When the first parameter
        * was a name, this parameter must be omitted.
        */
      vFragmentDefinition: String,
        /**
        * A controller to be used for event handlers in the fragment; can either be the controller of an enclosing
        * view, a new controller instance, or a simple object with the necessary methods attached. Note that a
        * fragment has no runtime representation besides its contained controls. There's therefore no API to retrieve
        * the controller after creating a fragment
        */
      oController: typingsJapgolly.openui5.sapUiCoreMvcControllerMod.default
      ): typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsfragment")(vName.asInstanceOf[js.Any], vFragmentDefinition.asInstanceOf[js.Any], oController.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]
      inline def jsfragment(
        /**
        * Name of the fragment when defining a fragment; ID or name or configuration object when instantiating
        * a fragment
        */
      vName: FragmentName,
        /**
        * When defining a fragment, this parameter must be a factory object that will be used to create new instances
        * of the fragment; it must at least contain a `createContent` method. When creating an instance of a fragment
        * and when `vName` was an ID, this parameter must be the name of the fragment. When the first parameter
        * was a name, this parameter must be omitted.
        */
      vFragmentDefinition: js.Object
      ): typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsfragment")(vName.asInstanceOf[js.Any], vFragmentDefinition.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]
      inline def jsfragment(
        /**
        * Name of the fragment when defining a fragment; ID or name or configuration object when instantiating
        * a fragment
        */
      vName: FragmentName,
        /**
        * When defining a fragment, this parameter must be a factory object that will be used to create new instances
        * of the fragment; it must at least contain a `createContent` method. When creating an instance of a fragment
        * and when `vName` was an ID, this parameter must be the name of the fragment. When the first parameter
        * was a name, this parameter must be omitted.
        */
      vFragmentDefinition: js.Object,
        /**
        * A controller to be used for event handlers in the fragment; can either be the controller of an enclosing
        * view, a new controller instance, or a simple object with the necessary methods attached. Note that a
        * fragment has no runtime representation besides its contained controls. There's therefore no API to retrieve
        * the controller after creating a fragment
        */
      oController: js.Object
      ): typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsfragment")(vName.asInstanceOf[js.Any], vFragmentDefinition.asInstanceOf[js.Any], oController.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]
      inline def jsfragment(
        /**
        * Name of the fragment when defining a fragment; ID or name or configuration object when instantiating
        * a fragment
        */
      vName: FragmentName,
        /**
        * When defining a fragment, this parameter must be a factory object that will be used to create new instances
        * of the fragment; it must at least contain a `createContent` method. When creating an instance of a fragment
        * and when `vName` was an ID, this parameter must be the name of the fragment. When the first parameter
        * was a name, this parameter must be omitted.
        */
      vFragmentDefinition: js.Object,
        /**
        * A controller to be used for event handlers in the fragment; can either be the controller of an enclosing
        * view, a new controller instance, or a simple object with the necessary methods attached. Note that a
        * fragment has no runtime representation besides its contained controls. There's therefore no API to retrieve
        * the controller after creating a fragment
        */
      oController: typingsJapgolly.openui5.sapUiCoreMvcControllerMod.default
      ): typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsfragment")(vName.asInstanceOf[js.Any], vFragmentDefinition.asInstanceOf[js.Any], oController.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]
      inline def jsfragment(
        /**
        * Name of the fragment when defining a fragment; ID or name or configuration object when instantiating
        * a fragment
        */
      vName: FragmentName,
        /**
        * When defining a fragment, this parameter must be a factory object that will be used to create new instances
        * of the fragment; it must at least contain a `createContent` method. When creating an instance of a fragment
        * and when `vName` was an ID, this parameter must be the name of the fragment. When the first parameter
        * was a name, this parameter must be omitted.
        */
      vFragmentDefinition: Unit,
        /**
        * A controller to be used for event handlers in the fragment; can either be the controller of an enclosing
        * view, a new controller instance, or a simple object with the necessary methods attached. Note that a
        * fragment has no runtime representation besides its contained controls. There's therefore no API to retrieve
        * the controller after creating a fragment
        */
      oController: js.Object
      ): typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsfragment")(vName.asInstanceOf[js.Any], vFragmentDefinition.asInstanceOf[js.Any], oController.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]
      inline def jsfragment(
        /**
        * Name of the fragment when defining a fragment; ID or name or configuration object when instantiating
        * a fragment
        */
      vName: FragmentName,
        /**
        * When defining a fragment, this parameter must be a factory object that will be used to create new instances
        * of the fragment; it must at least contain a `createContent` method. When creating an instance of a fragment
        * and when `vName` was an ID, this parameter must be the name of the fragment. When the first parameter
        * was a name, this parameter must be omitted.
        */
      vFragmentDefinition: Unit,
        /**
        * A controller to be used for event handlers in the fragment; can either be the controller of an enclosing
        * view, a new controller instance, or a simple object with the necessary methods attached. Note that a
        * fragment has no runtime representation besides its contained controls. There's therefore no API to retrieve
        * the controller after creating a fragment
        */
      oController: typingsJapgolly.openui5.sapUiCoreMvcControllerMod.default
      ): typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsfragment")(vName.asInstanceOf[js.Any], vFragmentDefinition.asInstanceOf[js.Any], oController.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]
      
      /**
        * @deprecated (since 1.56) - Use {@link sap.ui.core.mvc.JSONView.create JSONView.create} to create view
        * instances
        *
        * Creates a JSON view of the given name and id.
        *
        * The `viewName` must either correspond to a JSON module that can be loaded via the module system (viewName
        * + suffix ".view.json") and which defines the view or it must be a configuration object for a view. The
        * configuration object can have a viewName, viewContent and a controller property. The viewName behaves
        * as described above, viewContent can hold the view description as JSON string or as object literal.
        *
        * **Note**: when an object literal is given, it might be modified during view construction.
        *
        * The controller property can hold a controller instance. If a controller instance is given, it overrides
        * the controller defined in the view.
        *
        * When property `async` is set to true, the view definition and the controller class (and its dependencies)
        * will be loaded asynchronously. Any controls used in the view might be loaded sync or async, depending
        * on the view configuration. Even when the view definition is provided as string or object tree, controller
        * or controls might be loaded asynchronously. In any case, a view instance will be returned synchronously
        * by this factory API, but its content (control tree) might appear only later. Also see {@link sap.ui.core.mvc.View#loaded}.
        *
        * Like with any other control, an id is optional and will be created when missing.
        *
        * @returns the created JSONView instance
        */
      inline def jsonview(
        /**
        * id of the newly created view
        */
      sId: String,
        /**
        * name of a view resource or view configuration as described above.
        */
      vView: String
      ): typingsJapgolly.openui5.sapUiCoreMvcJsonviewMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("jsonview")(sId.asInstanceOf[js.Any], vView.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.openui5.sapUiCoreMvcJsonviewMod.default]
      inline def jsonview(
        /**
        * id of the newly created view
        */
      sId: String,
        /**
        * name of a view resource or view configuration as described above.
        */
      vView: ViewContent
      ): typingsJapgolly.openui5.sapUiCoreMvcJsonviewMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("jsonview")(sId.asInstanceOf[js.Any], vView.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.openui5.sapUiCoreMvcJsonviewMod.default]
      /**
        * @deprecated (since 1.56) - Use {@link sap.ui.core.mvc.JSONView.create JSONView.create} to create view
        * instances
        *
        * Creates a JSON view of the given name and id.
        *
        * The `viewName` must either correspond to a JSON module that can be loaded via the module system (viewName
        * + suffix ".view.json") and which defines the view or it must be a configuration object for a view. The
        * configuration object can have a viewName, viewContent and a controller property. The viewName behaves
        * as described above, viewContent can hold the view description as JSON string or as object literal.
        *
        * **Note**: when an object literal is given, it might be modified during view construction.
        *
        * The controller property can hold a controller instance. If a controller instance is given, it overrides
        * the controller defined in the view.
        *
        * When property `async` is set to true, the view definition and the controller class (and its dependencies)
        * will be loaded asynchronously. Any controls used in the view might be loaded sync or async, depending
        * on the view configuration. Even when the view definition is provided as string or object tree, controller
        * or controls might be loaded asynchronously. In any case, a view instance will be returned synchronously
        * by this factory API, but its content (control tree) might appear only later. Also see {@link sap.ui.core.mvc.View#loaded}.
        *
        * Like with any other control, an id is optional and will be created when missing.
        *
        * @returns the created JSONView instance
        */
      inline def jsonview(/**
        * name of a view resource or view configuration as described above.
        */
      vView: String): typingsJapgolly.openui5.sapUiCoreMvcJsonviewMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("jsonview")(vView.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.openui5.sapUiCoreMvcJsonviewMod.default]
      inline def jsonview(/**
        * name of a view resource or view configuration as described above.
        */
      vView: ViewContent): typingsJapgolly.openui5.sapUiCoreMvcJsonviewMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("jsonview")(vView.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.openui5.sapUiCoreMvcJsonviewMod.default]
      
      /**
        * @deprecated (since 1.56) - Use {@link sap.ui.core.mvc.View.extend View.extend} to define the view class
        * and {@link sap.ui.core.mvc.View.create View.create} to create view instances
        *
        * Defines or creates an instance of a JavaScript view.
        *
        * The behavior of this method depends on the signature of the call and on the current context.
        *
        * View Definition:
        * ```javascript
        *
        *   sap.ui.jsview(sId, vView);
        * ```
        *  Defines a view of the given name with the given implementation. `sId` must be the view's name, `vView`
        * must be an object and can contain implementations for any of the hooks provided by JSView.
        *
        * View Instantiation (deprecated):
        * ```javascript
        *
        *   var oView = sap.ui.jsview(vView);
        *   var oView = sap.ui.jsview(vView, bASync);
        *   var oView = sap.ui.jsview(sId, vView);
        *   var oView = sap.ui.jsview(sId, vView, bAsync);
        * ```
        *  Creates an instance of the view with the given name (and id). If no view implementation has been defined
        * for that view name, a JavaScript module with the same qualified name and with suffix `.view.js` will
        * be loaded (required) and executed. The module should register a view definition on execution (1st. variant
        * above).
        *
        * If `sId` is omitted, an ID will be created automatically.
        *
        * When `bAsync` has a truthy value, the view definition will be read asynchronously, if needed, but the
        * (incomplete) view instance will be returned immediately.
        *
        * **Note:** Any other call signature will lead to a runtime error.
        *
        * @returns the created JSView instance in the creation case, otherwise undefined
        */
      inline def jsview(
        /**
        * ID of the newly created view, only allowed for instance creation
        */
      sId: String,
        /**
        * name or implementation of the view.
        */
      vView: String
      ): js.UndefOr[typingsJapgolly.openui5.sapUiCoreMvcJsviewMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsview")(sId.asInstanceOf[js.Any], vView.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsJapgolly.openui5.sapUiCoreMvcJsviewMod.default]]
      inline def jsview(
        /**
        * ID of the newly created view, only allowed for instance creation
        */
      sId: String,
        /**
        * name or implementation of the view.
        */
      vView: String,
        /**
        * whether the view source is loaded asynchronously
        */
      bAsync: Boolean
      ): js.UndefOr[typingsJapgolly.openui5.sapUiCoreMvcJsviewMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsview")(sId.asInstanceOf[js.Any], vView.asInstanceOf[js.Any], bAsync.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsJapgolly.openui5.sapUiCoreMvcJsviewMod.default]]
      inline def jsview(
        /**
        * ID of the newly created view, only allowed for instance creation
        */
      sId: String,
        /**
        * name or implementation of the view.
        */
      vView: js.Object
      ): js.UndefOr[typingsJapgolly.openui5.sapUiCoreMvcJsviewMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsview")(sId.asInstanceOf[js.Any], vView.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsJapgolly.openui5.sapUiCoreMvcJsviewMod.default]]
      inline def jsview(
        /**
        * ID of the newly created view, only allowed for instance creation
        */
      sId: String,
        /**
        * name or implementation of the view.
        */
      vView: js.Object,
        /**
        * whether the view source is loaded asynchronously
        */
      bAsync: Boolean
      ): js.UndefOr[typingsJapgolly.openui5.sapUiCoreMvcJsviewMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsview")(sId.asInstanceOf[js.Any], vView.asInstanceOf[js.Any], bAsync.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsJapgolly.openui5.sapUiCoreMvcJsviewMod.default]]
      /**
        * @deprecated (since 1.56) - Use {@link sap.ui.core.mvc.View.extend View.extend} to define the view class
        * and {@link sap.ui.core.mvc.View.create View.create} to create view instances
        *
        * Defines or creates an instance of a JavaScript view.
        *
        * The behavior of this method depends on the signature of the call and on the current context.
        *
        * View Definition:
        * ```javascript
        *
        *   sap.ui.jsview(sId, vView);
        * ```
        *  Defines a view of the given name with the given implementation. `sId` must be the view's name, `vView`
        * must be an object and can contain implementations for any of the hooks provided by JSView.
        *
        * View Instantiation (deprecated):
        * ```javascript
        *
        *   var oView = sap.ui.jsview(vView);
        *   var oView = sap.ui.jsview(vView, bASync);
        *   var oView = sap.ui.jsview(sId, vView);
        *   var oView = sap.ui.jsview(sId, vView, bAsync);
        * ```
        *  Creates an instance of the view with the given name (and id). If no view implementation has been defined
        * for that view name, a JavaScript module with the same qualified name and with suffix `.view.js` will
        * be loaded (required) and executed. The module should register a view definition on execution (1st. variant
        * above).
        *
        * If `sId` is omitted, an ID will be created automatically.
        *
        * When `bAsync` has a truthy value, the view definition will be read asynchronously, if needed, but the
        * (incomplete) view instance will be returned immediately.
        *
        * **Note:** Any other call signature will lead to a runtime error.
        *
        * @returns the created JSView instance in the creation case, otherwise undefined
        */
      inline def jsview(/**
        * name or implementation of the view.
        */
      vView: String): js.UndefOr[typingsJapgolly.openui5.sapUiCoreMvcJsviewMod.default] = ^.asInstanceOf[js.Dynamic].applyDynamic("jsview")(vView.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typingsJapgolly.openui5.sapUiCoreMvcJsviewMod.default]]
      inline def jsview(
        /**
        * name or implementation of the view.
        */
      vView: String,
        /**
        * whether the view source is loaded asynchronously
        */
      bAsync: Boolean
      ): js.UndefOr[typingsJapgolly.openui5.sapUiCoreMvcJsviewMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsview")(vView.asInstanceOf[js.Any], bAsync.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsJapgolly.openui5.sapUiCoreMvcJsviewMod.default]]
      inline def jsview(/**
        * name or implementation of the view.
        */
      vView: js.Object): js.UndefOr[typingsJapgolly.openui5.sapUiCoreMvcJsviewMod.default] = ^.asInstanceOf[js.Dynamic].applyDynamic("jsview")(vView.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typingsJapgolly.openui5.sapUiCoreMvcJsviewMod.default]]
      inline def jsview(
        /**
        * name or implementation of the view.
        */
      vView: js.Object,
        /**
        * whether the view source is loaded asynchronously
        */
      bAsync: Boolean
      ): js.UndefOr[typingsJapgolly.openui5.sapUiCoreMvcJsviewMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsview")(vView.asInstanceOf[js.Any], bAsync.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsJapgolly.openui5.sapUiCoreMvcJsviewMod.default]]
      
      /**
        * @deprecated (since 1.56) - Lazy loading enforces synchronous requests and therefore has been deprecated
        * without a replacement. Instead of loading classes via lazy stubs, they should be required as dependencies
        * of an AMD module (using {@link sap.ui.define}) or on demand with a call to {@link sap.ui.require}.
        *
        * Creates a lazy loading stub for a given class `sClassName`.
        *
        * If the class has been loaded already, nothing is done. Otherwise a stub object or constructor and - optionally
        * - a set of stub methods are created. All created stubs will load the corresponding module on execution
        * and then delegate to their counterpart in the loaded module.
        *
        * When no methods are given or when the list of methods contains the special name "new" (which is an operator
        * can't be used as method name in JavaScript), then a stub **constructor** for class `sClassName` is created.
        * Otherwise, a plain object is created.
        *
        * **Note**: Accessing any stub as a plain object without executing it (no matter whether it is a function
        * or an object) won't load the module and therefore most likely won't work as expected. This is a fundamental
        * restriction of the lazy loader approach.
        *
        * **Note**: As a side effect of this method, the namespace containing the given class is created **immediately**.
        */
      inline def lazyRequire(
        /**
        * Fully qualified name (dot notation) of the class that should be prepared
        */
      sClassName: String
      ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("lazyRequire")(sClassName.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def lazyRequire(
        /**
        * Fully qualified name (dot notation) of the class that should be prepared
        */
      sClassName: String,
        /**
        * Space separated list of additional (static) methods that should be created as stubs
        */
      sMethods: String
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lazyRequire")(sClassName.asInstanceOf[js.Any], sMethods.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def lazyRequire(
        /**
        * Fully qualified name (dot notation) of the class that should be prepared
        */
      sClassName: String,
        /**
        * Space separated list of additional (static) methods that should be created as stubs
        */
      sMethods: String,
        /**
        * Name of the module to load, defaults to the class name
        */
      sModuleName: String
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lazyRequire")(sClassName.asInstanceOf[js.Any], sMethods.asInstanceOf[js.Any], sModuleName.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def lazyRequire(
        /**
        * Fully qualified name (dot notation) of the class that should be prepared
        */
      sClassName: String,
        /**
        * Space separated list of additional (static) methods that should be created as stubs
        */
      sMethods: Unit,
        /**
        * Name of the module to load, defaults to the class name
        */
      sModuleName: String
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lazyRequire")(sClassName.asInstanceOf[js.Any], sMethods.asInstanceOf[js.Any], sModuleName.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /**
        * Provides access to UI5 loader configuration.
        *
        * The configuration is used by {@link sap.ui.require} and {@link sap.ui.define}.
        */
      object loader {
        
        @JSGlobal("sap.ui.loader")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * @SINCE 1.56.0
          *
          * Sets the configuration for the UI5 loader. The configuration can be updated multiple times. Later changes
          * do not impact modules that have been loaded before.
          *
          * If no parameter is given, a partial copy of UI5 loader configuration in use is returned.
          *
          * The configuration options are aligned with the "Common Config" draft of the AMD spec (https://github.com/amdjs/amdjs-api/blob/master/CommonConfig.md).
          *
          * The following code shows an example of what a UI5 loader configuration might look like:
          * ```javascript
          *
          *
          *   sap.ui.loader.config({
          *
          *     // location from where to load all modules by default
          *     baseUrl: '../../resources/',
          *
          *     paths: {
          *       // load modules whose ID equals to or starts with 'my/module' from example.com
          *       'my/module': 'https://example.com/resources/my/module'
          *     },
          *
          *     map: {
          *       // if any module requires 'sinon', load module 'sap/ui/thirdparty/sinon-4'
          *       '*': {
          *         'sinon': 'sap/ui/thirdparty/sinon-4'
          *       },
          *       // but if a module whose ID equals to or starts with 'app' requires 'sinon'
          *       // then load a legacy version instead
          *       "app": {
          *         'sinon': 'sap/ui/legacy/sinon'
          *       }
          *     },
          *
          *     // define two bundles that consists of JS modules only
          *     bundles: {
          *       bundle1: ['module1', 'module2'],
          *       bundle2: ['moduleX', 'moduleY']
          *     },
          *
          *     // define a bundle that also contains non-JS resources
          *     bundlesUI5: {
          *       'all.js': ['Component.js', 'manifest.json',
          *                  'App.controller.js', 'App.view.xml']
          *     },
          *
          *     // activate real async loading and module definitions
          *     async: true,
          *
          *     // provide dependency and export metadata for non-UI5 modules
          *     shim: {
          *       'sap/ui/thirdparty/blanket': {
          *         amd: true,
          *         exports: 'blanket'
          *       }
          *     }
          *
          *   });
          *
          * ```
          *
          *
          * @returns UI5 loader configuration in use.
          */
        inline def config(): js.UndefOr[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("config")().asInstanceOf[js.UndefOr[js.Object]]
        inline def config(
          /**
          * The provided configuration gets merged with the UI5 loader configuration in use. If `cfg` is omitted
          * or `undefined`, a copy of the current configuration gets returned, containing at least the properties
          * `amd` and `async`.
          */
        cfg: Bundles
        ): js.UndefOr[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("config")(cfg.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Object]]
      }
      
      /**
        * @deprecated (since 1.56) - use `sap.ui.loader.config` instead.
        *
        * Redirects access to resources that are part of the given namespace to a location relative to the assumed
        * **application root folder**.
        *
        * Any UI5 managed resource (view, controller, control, JavaScript module, CSS file, etc.) whose resource
        * name starts with `sNamespace`, will be loaded from an equally named subfolder of the **application root
        * folder**. If the resource name consists of multiple segments (separated by a dot), each segment is assumed
        * to represent an individual folder. In other words: when a resource name is converted to a URL, any dots
        * ('.') are converted to slashes ('/').
        *
        * **Note:** The **application root folder** is assumed to be the same as the folder where the current page
        * resides in.
        *
        * Usage sample:
        * ```javascript
        *
        *   // Let UI5 know that resources, whose name starts with "com.mycompany.myapp"
        *   // should be loaded from the URL location "./com/mycompany/myapp"
        *   sap.ui.localResources("com.mycompany.myapp");
        *
        *   // The following call implicitly will use the mapping done by the previous line
        *   // It will load a view from ./com/mycompany/myapp/views/Main.view.xml
        *   View.create({ viewName : "com.mycompany.myapp.views.Main", type : ViewType.XML}).then(function(oView) {
        *       // do stuff
        *   });
        * ```
        *
        *
        * When applications need a more flexible mapping between resource names and their location, they can use
        * {@link sap.ui.loader.config} with option `paths`.
        */
      inline def localResources(
        /**
        * Namespace prefix for which to load resources relative to the application root folder
        */
      sNamespace: String
      ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("localResources")(sNamespace.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * The SAPUI5 Data Binding API.
        *
        * The default binding mode for model implementations (if not implemented otherwise) is two-way and the
        * supported binding modes by the model are one-way, two-way and one-time. The default binding mode can
        * be changed by the application for each model instance. A model implementation should specify its supported
        * binding modes and set the default binding mode accordingly (e.g. if the model supports only one-way binding
        * the default binding mode should also be set to one-way).
        *
        * The default size limit for models is 100. The size limit determines the number of entries used for the
        * list bindings.
        */
      object model {
        
        /**
          * Analytical Adapter for ODataModels
          */
        object analytics {
          
          @JSGlobal("sap.ui.model.analytics")
          @js.native
          val ^ : js.Any = js.native
          
          /**
            * @EXPERIMENTAL
            *
            * If called on an instance of an (v1/v2) ODataModel it will enrich it with analytics capabilities.
            */
          inline def ODataModelAdapter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ODataModelAdapter")().asInstanceOf[Unit]
        }
        
        /**
          * OData-based DataBinding Utility Class
          */
        object odata {
          
          @JSGlobal("sap.ui.model.odata")
          @js.native
          val ^ : js.Any = js.native
          
          /**
            * @EXPERIMENTAL
            *
            * Adapter for TreeBindings to add the ListBinding functionality and use the tree structure in list based
            * controls. Only usable with the sap.ui.table.TreeTable control. The functions defined here are only available
            * when you are using a TreeTable and an ODataModel.
            */
          inline def ODataTreeBindingAdapter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ODataTreeBindingAdapter")().asInstanceOf[Unit]
          
          /**
            * Adapter for TreeBindings to add the ListBinding functionality and use the tree structure in list based
            * controls.
            */
          inline def ODataTreeBindingFlat(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ODataTreeBindingFlat")().asInstanceOf[Unit]
        }
      }
      
      /**
        * @deprecated (since 1.1) - see {@link topic:c78c07c094e04ccfaab659378a1707c7 Creating Control and Class
        * Modules}.
        *
        * Ensures that a given a namespace or hierarchy of nested namespaces exists in the current `window`.
        *
        * @returns the innermost namespace of the hierarchy
        */
      inline def namespace(sNamespace: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("namespace")(sNamespace.asInstanceOf[js.Any]).asInstanceOf[js.Object]
      
      object require {
        
        /**
          * Resolves one or more module dependencies.
          *
          * Synchronous Retrieval of a Single Module Export Value (Probing):
          *
          * When called with a single string, that string is assumed to be the ID of an already loaded module and
          * the export of that module is returned. If the module has not been loaded yet, or if it is a Non-UI5 module
          * (e.g. third-party module) without a shim, `undefined` is returned.
          *
          * This signature variant allows synchronous access to module exports without initiating module loading.
          *
          * Sample:
          * ```javascript
          *
          *   var JSONModel = sap.ui.require("sap/ui/model/json/JSONModel");
          * ```
          *
          *
          * For modules that are known to be UI5 modules, this signature variant can be used to check whether the
          * module has been loaded.
          *
          * Asynchronous Loading of Multiple Modules:
          *
          * If an array of strings is given and (optionally) a callback function, then the strings are interpreted
          * as module IDs and the corresponding modules (and their transitive dependencies) are loaded. Then the
          * callback function will be called asynchronously. The module exports of the specified modules will be
          * provided as parameters to the callback function in the same order in which they appeared in the dependencies
          * array.
          *
          * The return value for the asynchronous use case is `undefined`.
          *
          *
          * ```javascript
          *
          *   sap.ui.require(['sap/ui/model/json/JSONModel', 'sap/ui/core/UIComponent'], function(JSONModel,UIComponent) {
          *
          *     var MyComponent = UIComponent.extend('MyComponent', {
          *       ...
          *     });
          *     ...
          *
          *   });
          * ```
          *
          *
          * This method uses the same variation of the {@link jQuery.sap.getResourcePath unified resource name} syntax
          * that {@link sap.ui.define} uses: module names are specified without the implicit extension '.js'. Relative
          * module names are not supported.
          *
          * @returns A single module export value (sync probing variant) or `undefined` (async loading variant)
          */
        inline def apply(/**
          * Dependency (dependencies) to resolve
          */
        vDependencies: String): js.UndefOr[Any] = ^.asInstanceOf[js.Dynamic].apply(vDependencies.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Any]]
        inline def apply(
          /**
          * Dependency (dependencies) to resolve
          */
        vDependencies: String,
          /**
          * Callback function to execute after resolving an array of dependencies
          */
        fnCallback: js.Function
        ): js.UndefOr[Any] = (^.asInstanceOf[js.Dynamic].apply(vDependencies.asInstanceOf[js.Any], fnCallback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Any]]
        inline def apply(
          /**
          * Dependency (dependencies) to resolve
          */
        vDependencies: String,
          /**
          * Callback function to execute after resolving an array of dependencies
          */
        fnCallback: js.Function,
          /**
          * Callback function to execute if an error was detected while loading the dependencies or executing the
          * factory function. Note that due to browser restrictions not all errors will be reported via this callback.
          * In general, module loading is designed for the non-error case. Error handling is not complete.
          */
        fnErrback: js.Function
        ): js.UndefOr[Any] = (^.asInstanceOf[js.Dynamic].apply(vDependencies.asInstanceOf[js.Any], fnCallback.asInstanceOf[js.Any], fnErrback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Any]]
        inline def apply(
          /**
          * Dependency (dependencies) to resolve
          */
        vDependencies: String,
          /**
          * Callback function to execute after resolving an array of dependencies
          */
        fnCallback: Unit,
          /**
          * Callback function to execute if an error was detected while loading the dependencies or executing the
          * factory function. Note that due to browser restrictions not all errors will be reported via this callback.
          * In general, module loading is designed for the non-error case. Error handling is not complete.
          */
        fnErrback: js.Function
        ): js.UndefOr[Any] = (^.asInstanceOf[js.Dynamic].apply(vDependencies.asInstanceOf[js.Any], fnCallback.asInstanceOf[js.Any], fnErrback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Any]]
        inline def apply(/**
          * Dependency (dependencies) to resolve
          */
        vDependencies: js.Array[String]): js.UndefOr[Any] = ^.asInstanceOf[js.Dynamic].apply(vDependencies.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Any]]
        inline def apply(
          /**
          * Dependency (dependencies) to resolve
          */
        vDependencies: js.Array[String],
          /**
          * Callback function to execute after resolving an array of dependencies
          */
        fnCallback: js.Function
        ): js.UndefOr[Any] = (^.asInstanceOf[js.Dynamic].apply(vDependencies.asInstanceOf[js.Any], fnCallback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Any]]
        inline def apply(
          /**
          * Dependency (dependencies) to resolve
          */
        vDependencies: js.Array[String],
          /**
          * Callback function to execute after resolving an array of dependencies
          */
        fnCallback: js.Function,
          /**
          * Callback function to execute if an error was detected while loading the dependencies or executing the
          * factory function. Note that due to browser restrictions not all errors will be reported via this callback.
          * In general, module loading is designed for the non-error case. Error handling is not complete.
          */
        fnErrback: js.Function
        ): js.UndefOr[Any] = (^.asInstanceOf[js.Dynamic].apply(vDependencies.asInstanceOf[js.Any], fnCallback.asInstanceOf[js.Any], fnErrback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Any]]
        inline def apply(
          /**
          * Dependency (dependencies) to resolve
          */
        vDependencies: js.Array[String],
          /**
          * Callback function to execute after resolving an array of dependencies
          */
        fnCallback: Unit,
          /**
          * Callback function to execute if an error was detected while loading the dependencies or executing the
          * factory function. Note that due to browser restrictions not all errors will be reported via this callback.
          * In general, module loading is designed for the non-error case. Error handling is not complete.
          */
        fnErrback: js.Function
        ): js.UndefOr[Any] = (^.asInstanceOf[js.Dynamic].apply(vDependencies.asInstanceOf[js.Any], fnCallback.asInstanceOf[js.Any], fnErrback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Any]]
        
        @JSGlobal("sap.ui.require")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * Calculates a URL from the provided resource name.
          *
          * The calculation takes any configured ID mappings or resource paths into account (see {@link sap.ui.loader.config
          * config options map and paths}. It also supports relative segments such as `./` and `../` within the path,
          * but not at its beginning. If relative navigation would cross the root namespace (e.g. `sap.ui.require.toUrl("../")`)
          * or when the resource name starts with a slash or with a relative segment, an error is thrown.
          *
          * **Note:** `toUrl` does not resolve the returned URL; whether it is an absolute URL or a relative URL
          * depends on the configured `baseUrl` and `paths`.
          * See:
          * 	https://github.com/amdjs/amdjs-api/wiki/require#requiretourlstring-
          *
          * @returns Path to the resource, e.g. `'/home/app/data.json'`
          */
        inline def toUrl(/**
          * Name of a resource e.g. `'app/data.json'`
          */
        sName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toUrl")(sName.asInstanceOf[js.Any]).asInstanceOf[String]
      }
      
      /**
        * @deprecated (since 1.56.0) - use `sap.ui.require.toUrl` instead.
        *
        * Returns the URL of a resource that belongs to the given library and has the given relative location within
        * the library. This is mainly meant for static resources like images that are inside the library. It is
        * NOT meant for access to JavaScript modules or anything for which a different URL has been registered
        * with sap.ui.loader.config({paths:...}). For these cases use sap.ui.require.toUrl(). It DOES work, however,
        * when the given sResourcePath starts with "themes/" (= when it is a theme-dependent resource). Even when
        * for this theme a different location outside the normal library location is configured.
        *
        * @returns the URL of the requested resource
        */
      inline def resource(
        /**
        * the name of a library, like "sap.ui.layout"
        */
      sLibraryName: String,
        /**
        * the relative path of a resource inside this library, like "img/mypic.png" or "themes/my_theme/img/mypic.png"
        */
      sResourcePath: String
      ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resource")(sLibraryName.asInstanceOf[js.Any], sResourcePath.asInstanceOf[js.Any])).asInstanceOf[String]
      
      /**
        * @deprecated (since 1.1) - use {@link sap.ui.core.Control#placeAt Control#placeAt} instead.
        *
        * Displays the control tree with the given root inside the area of the given DOM reference (or inside the
        * DOM node with the given ID) or in the given Control.
        *
        * Example:
        * ```javascript
        *
        *   <div id="SAPUI5UiArea"></div>
        *   <script>
        *     var oRoot = new sap.m.Label();
        *     oRoot.setText("Hello world!");
        *     sap.ui.setRoot("SAPUI5UiArea", oRoot);
        *   </script>
        * ```
        *
        *
        * This is a shortcut for `sap.ui.getCore().setRoot()`.
        *
        * Internally, if a string is given that does not identify a UIArea or a control then implicitly a new `UIArea`
        * is created for the given DOM reference and the given control is added.
        */
      inline def setRoot(
        /**
        * a DOM Element or Id String of the UIArea
        */
      oDomRef: String,
        /**
        * the Control that should be added to the `UIArea`.
        */
      oControl: typingsJapgolly.openui5.sapUiBaseInterfaceMod.default
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRoot")(oDomRef.asInstanceOf[js.Any], oControl.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def setRoot(
        /**
        * a DOM Element or Id String of the UIArea
        */
      oDomRef: String,
        /**
        * the Control that should be added to the `UIArea`.
        */
      oControl: typingsJapgolly.openui5.sapUiCoreControlMod.default
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRoot")(oDomRef.asInstanceOf[js.Any], oControl.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def setRoot(
        /**
        * a DOM Element or Id String of the UIArea
        */
      oDomRef: Element,
        /**
        * the Control that should be added to the `UIArea`.
        */
      oControl: typingsJapgolly.openui5.sapUiBaseInterfaceMod.default
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRoot")(oDomRef.asInstanceOf[js.Any], oControl.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def setRoot(
        /**
        * a DOM Element or Id String of the UIArea
        */
      oDomRef: Element,
        /**
        * the Control that should be added to the `UIArea`.
        */
      oControl: typingsJapgolly.openui5.sapUiCoreControlMod.default
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRoot")(oDomRef.asInstanceOf[js.Any], oControl.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def setRoot(
        /**
        * a DOM Element or Id String of the UIArea
        */
      oDomRef: typingsJapgolly.openui5.sapUiCoreControlMod.default,
        /**
        * the Control that should be added to the `UIArea`.
        */
      oControl: typingsJapgolly.openui5.sapUiBaseInterfaceMod.default
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRoot")(oDomRef.asInstanceOf[js.Any], oControl.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def setRoot(
        /**
        * a DOM Element or Id String of the UIArea
        */
      oDomRef: typingsJapgolly.openui5.sapUiCoreControlMod.default,
        /**
        * the Control that should be added to the `UIArea`.
        */
      oControl: typingsJapgolly.openui5.sapUiCoreControlMod.default
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRoot")(oDomRef.asInstanceOf[js.Any], oControl.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /**
        * @SINCE 1.50
        *
        * UI5 library: sap.ui.support. A library for the Support Assistant tool. Overview: The library provides
        * the Support Assistant tool. It enables application developers to check whether their applications are
        * built according to the best practices for building SAPUI5 apps. The tool uses a set of pre-defined rules
        * to check all aspects of an application.
        */
      object support {
        
        @JSGlobal("sap.ui.support.CoreFacade")
        @js.native
        val CoreFacade: /* undefined */ Any = js.native
        
        /**
          * @SINCE 1.48
          *
          * Allows to select the scope of analysis on an application.
          *
          * Overview:
          *
          * `ExecutionScope` is the third parameter of a rule check function. It provides access to internal UI5
          * objects available for inspection. The `getElements` API method allows the user to select a specific subset
          * of elements valid for their case. It accepts one query object argument.
          *
          * Usage:
          *
          * When a rule is executed, three parameters are passed: `oIssueManager`, `oCoreFacade` and `oScope`.
          *
          * An `ExecutionScope` instance is passed to every call of a rule check function. When you analyze your
          * application, available objects are collected depending on the settings passed to the Support Assistant
          * at the moment when you start it.
          */
        @JSGlobal("sap.ui.support.ExecutionScope")
        @js.native
        open class ExecutionScope ()
          extends StObject
             with typingsJapgolly.openui5.sap.ui.support.ExecutionScope
        object ExecutionScope {
          
          @JSGlobal("sap.ui.support.ExecutionScope")
          @js.native
          val ^ : js.Any = js.native
          
          /**
            *
            * @returns Array of matched elements
            */
          /* static member */
          inline def getElements(/**
            * Object with specific filtering options
            */
          oConfig: Cloned): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getElements")(oConfig.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
          
          /**
            * Gets elements by their type
            *
            * @returns Array of matched elements
            */
          /* static member */
          inline def getElementsByClassName(
            /**
            * Either string or function to be used when selecting a subset of elements
            */
          classNameSelector: String
          ): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByClassName")(classNameSelector.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
          inline def getElementsByClassName(
            /**
            * Either string or function to be used when selecting a subset of elements
            */
          classNameSelector: js.Function
          ): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByClassName")(classNameSelector.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
          
          /**
            * Gets the logged objects by object type
            *
            * @returns Array of logged objects
            */
          /* static member */
          inline def getLoggedObjects(/**
            * Type of logged objects
            */
          `type`: Any): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLoggedObjects")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
          
          /**
            * Returns all public elements, i.e. elements that are part of public API aggregations
            *
            * @returns Array of matched elements
            */
          /* static member */
          inline def getPublicElements(): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPublicElements")().asInstanceOf[js.Array[Any]]
          
          /**
            * Gets the type of the execution scope
            *
            * @returns The type of the execution scope. Possible values are `global`, `subtree` or `components`.
            */
          /* static member */
          inline def getType(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getType")().asInstanceOf[String]
        }
        
        /**
          * Creates a RuleSet. The RuleSet can store multiple rules concerning namespaces. Usage: The RuleSet is
          * an interface used to create, update and delete rulesets.
          */
        object RuleSet {
          
          @JSGlobal("sap.ui.support.RuleSet")
          @js.native
          val ^ : js.Any = js.native
          
          /**
            * Adds rules to RuleSet.
            *
            * @returns sRuleVerificationStatus Verification status
            */
          inline def addRule(/**
            * Settings object with rule information
            */
          oSettings: js.Object): String = ^.asInstanceOf[js.Dynamic].applyDynamic("addRule")(oSettings.asInstanceOf[js.Any]).asInstanceOf[String]
          
          /**
            * Clears all rulesets inside the RuleSet.
            */
          inline def clearAllRuleSets(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearAllRuleSets")().asInstanceOf[Unit]
          
          /**
            * Gets all rules from the RuleSet.
            *
            * @returns All rules within the current RuleSet
            */
          inline def getRules(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getRules")().asInstanceOf[js.Object]
          
          /**
            * Loads the previous selection of the user - which rules are selected to be run by the Rule Analyzer. The
            * method applies the settings to the currently loaded rules.
            */
          inline def loadSelectionOfRules(/**
            * The current loaded libraries and their rules
            */
          aLibraries: js.Array[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadSelectionOfRules")(aLibraries.asInstanceOf[js.Any]).asInstanceOf[Unit]
          
          /**
            * Remove rule from RuleSet.
            */
          inline def removeRule(/**
            * Rule object that will be removed
            */
          oRule: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeRule")(oRule.asInstanceOf[js.Any]).asInstanceOf[Unit]
          
          /**
            * Stores which rules are selected to be run by the analyzer on the next check
            */
          inline def storeSelectionOfRules(/**
            * The data for the libraries and their rules
            */
          aLibraries: js.Array[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("storeSelectionOfRules")(aLibraries.asInstanceOf[js.Any]).asInstanceOf[Unit]
          
          /**
            * Updates rules from the RuleSet.
            *
            * @returns sRuleVerification Rule Verification status
            */
          inline def updateRule(/**
            * Rule ID
            */
          sRuleId: String, /**
            * Rule settings
            */
          ORuleSettings: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("updateRule")(sRuleId.asInstanceOf[js.Any], ORuleSettings.asInstanceOf[js.Any])).asInstanceOf[String]
        }
      }
      
      /**
        * @deprecated (since 1.56) - use an {@link sap.ui.core.mvc.XMLView XMLView} or {@link sap.ui.core.mvc.JSView
        * JSView} instead.
        *
        * Creates a Template for the given ID, DOM reference or a configuration object.
        *
        * If no parameter is defined, this function makes a lookup of DOM elements which are specifying a type
        * attribute. If the value of this type attribute matches a registered type then the content of this DOM
        * element will be used to create a new `Template` instance.
        *
        * If you want to lookup all kind of existing and known templates and parse them directly you can simply
        * call:
        * ```javascript
        *
        *   sap.ui.template();
        * ```
        *
        *
        * To parse a concrete DOM element you can do so by using this function in the following way:
        * ```javascript
        *
        *   sap.ui.template("theTemplateId");
        * ```
        *
        *
        * Or you can pass the reference to a DOM element and use this DOM element as a source for the template:
        *
        * ```javascript
        *
        *   sap.ui.template(oDomRef);
        * ```
        *
        *
        * The last option to use this function is to pass the information via a configuration object. This configuration
        * object can be used to pass a context for the templating framework when compiling the template:
        * ```javascript
        *
        *   var oTemplateById = sap.ui.template({
        *     id: "theTemplateId",
        *     context: { ... }
        *   });
        *
        *   var oTemplateByDomRef = sap.ui.template({
        *     domref: oDomRef,
        *     context: { ... }
        *   });
        * ```
        *
        *
        * It can also be used to load a template from another file:
        * ```javascript
        *
        *   var oTemplate = sap.ui.template({
        *     id: "myTemplate",
        *     src: "myTemplate.tmpl"
        *   });
        *
        *   var oTemplateWithContext = sap.ui.template({
        *     id: "myTemplate",
        *     src: "myTemplate.tmpl",
        *     context: { ... }
        *   });
        * ```
        *
        *
        * @returns the created Template instance or in case of usage without parameters any array of templates
        * is returned
        */
      inline def template(): typingsJapgolly.openui5.sapUiCoreTmplTemplateMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreTmplTemplateMod.default] = ^.asInstanceOf[js.Dynamic].applyDynamic("template")().asInstanceOf[typingsJapgolly.openui5.sapUiCoreTmplTemplateMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreTmplTemplateMod.default]]
      inline def template(
        /**
        * the ID or the DOM reference to the template to lookup or a configuration object containing the src, type
        * and eventually the ID of the Template.
        */
      oTemplate: String
      ): typingsJapgolly.openui5.sapUiCoreTmplTemplateMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreTmplTemplateMod.default] = ^.asInstanceOf[js.Dynamic].applyDynamic("template")(oTemplate.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.openui5.sapUiCoreTmplTemplateMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreTmplTemplateMod.default]]
      inline def template(
        /**
        * the ID or the DOM reference to the template to lookup or a configuration object containing the src, type
        * and eventually the ID of the Template.
        */
      oTemplate: Element
      ): typingsJapgolly.openui5.sapUiCoreTmplTemplateMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreTmplTemplateMod.default] = ^.asInstanceOf[js.Dynamic].applyDynamic("template")(oTemplate.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.openui5.sapUiCoreTmplTemplateMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreTmplTemplateMod.default]]
      inline def template(
        /**
        * the ID or the DOM reference to the template to lookup or a configuration object containing the src, type
        * and eventually the ID of the Template.
        */
      oTemplate: Domref
      ): typingsJapgolly.openui5.sapUiCoreTmplTemplateMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreTmplTemplateMod.default] = ^.asInstanceOf[js.Dynamic].applyDynamic("template")(oTemplate.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.openui5.sapUiCoreTmplTemplateMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreTmplTemplateMod.default]]
      
      /**
        * @deprecated (since 1.56) - use {@link sap.ui.core.mvc.XMLView} in combination with {@link topic:5ee619fc1370463ea674ee04b65ed83b
        * XML Templating} instead
        *
        * Defines or creates an instance of a template view.
        *
        * The behavior of this method depends on the signature of the call and on the current context.
        *
        *
        * 	 - View Definition `sap.ui.templateview(sId, vView)`: Defines a view of the given name with the given
        * 			implementation. sId must be the views name, vView must be an object and can contain implementations for
        * 			any of the hooks provided by templateview
        * 	 - View Instantiation `sap.ui.templateview(sId?, vView)`: Creates an instance of the view with the given
        * 			name (and id).
        *
        * Any other call signature will lead to a runtime error. If the id is omitted in the second variant, an
        * id will be created automatically.
        *
        * @returns the created TemplateView instance in the creation case, otherwise undefined
        */
      inline def templateview(
        /**
        * id of the newly created view, only allowed for instance creation
        */
      sId: String,
        /**
        * name or implementation of the view.
        */
      vView: String
      ): js.UndefOr[typingsJapgolly.openui5.sapUiCoreMvcTemplateViewMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("templateview")(sId.asInstanceOf[js.Any], vView.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsJapgolly.openui5.sapUiCoreMvcTemplateViewMod.default]]
      inline def templateview(
        /**
        * id of the newly created view, only allowed for instance creation
        */
      sId: String,
        /**
        * name or implementation of the view.
        */
      vView: js.Object
      ): js.UndefOr[typingsJapgolly.openui5.sapUiCoreMvcTemplateViewMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("templateview")(sId.asInstanceOf[js.Any], vView.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsJapgolly.openui5.sapUiCoreMvcTemplateViewMod.default]]
      /**
        * @deprecated (since 1.56) - use {@link sap.ui.core.mvc.XMLView} in combination with {@link topic:5ee619fc1370463ea674ee04b65ed83b
        * XML Templating} instead
        *
        * Defines or creates an instance of a template view.
        *
        * The behavior of this method depends on the signature of the call and on the current context.
        *
        *
        * 	 - View Definition `sap.ui.templateview(sId, vView)`: Defines a view of the given name with the given
        * 			implementation. sId must be the views name, vView must be an object and can contain implementations for
        * 			any of the hooks provided by templateview
        * 	 - View Instantiation `sap.ui.templateview(sId?, vView)`: Creates an instance of the view with the given
        * 			name (and id).
        *
        * Any other call signature will lead to a runtime error. If the id is omitted in the second variant, an
        * id will be created automatically.
        *
        * @returns the created TemplateView instance in the creation case, otherwise undefined
        */
      inline def templateview(/**
        * name or implementation of the view.
        */
      vView: String): js.UndefOr[typingsJapgolly.openui5.sapUiCoreMvcTemplateViewMod.default] = ^.asInstanceOf[js.Dynamic].applyDynamic("templateview")(vView.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typingsJapgolly.openui5.sapUiCoreMvcTemplateViewMod.default]]
      inline def templateview(/**
        * name or implementation of the view.
        */
      vView: js.Object): js.UndefOr[typingsJapgolly.openui5.sapUiCoreMvcTemplateViewMod.default] = ^.asInstanceOf[js.Dynamic].applyDynamic("templateview")(vView.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typingsJapgolly.openui5.sapUiCoreMvcTemplateViewMod.default]]
      
      /**
        * @SINCE 0.13
        * @deprecated (since 1.38)
        *
        * Controls that implement the SAP User Experience (UX) Guidelines 3.0
        */
      object ux3 {
        
        @JSGlobal("sap.ui.ux3.ShellPersonalization")
        @js.native
        val ShellPersonalization: /* undefined */ Any = js.native
      }
      
      /**
        * @deprecated (since 1.56) - Use {@link sap.ui.core.mvc.View.extend View.extend} to define the view class
        * and {@link sap.ui.core.mvc.View.create View.create} to create view instances
        *
        * Creates a view of the given type, name and with the given ID.
        *
        * @returns the created View instance
        */
      inline def view(): typingsJapgolly.openui5.sapUiCoreMvcViewMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("view")().asInstanceOf[typingsJapgolly.openui5.sapUiCoreMvcViewMod.default]
      inline def view(
        /**
        * The ID of the newly created view, only allowed for instance creation. If no ID is given, an ID will be
        * generated. For view definition, skip this parameter and use `vView` as the first parameter.
        */
      sId: String
      ): typingsJapgolly.openui5.sapUiCoreMvcViewMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("view")(sId.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.openui5.sapUiCoreMvcViewMod.default]
      inline def view(
        /**
        * The ID of the newly created view, only allowed for instance creation. If no ID is given, an ID will be
        * generated. For view definition, skip this parameter and use `vView` as the first parameter.
        */
      sId: String,
        /**
        * The view name or view configuration object.
        */
      vView: String
      ): typingsJapgolly.openui5.sapUiCoreMvcViewMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("view")(sId.asInstanceOf[js.Any], vView.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.openui5.sapUiCoreMvcViewMod.default]
      inline def view(
        /**
        * The ID of the newly created view, only allowed for instance creation. If no ID is given, an ID will be
        * generated. For view definition, skip this parameter and use `vView` as the first parameter.
        */
      sId: String,
        /**
        * The view name or view configuration object.
        */
      vView: ViewData
      ): typingsJapgolly.openui5.sapUiCoreMvcViewMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("view")(sId.asInstanceOf[js.Any], vView.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.openui5.sapUiCoreMvcViewMod.default]
      inline def view(
        /**
        * The ID of the newly created view, only allowed for instance creation. If no ID is given, an ID will be
        * generated. For view definition, skip this parameter and use `vView` as the first parameter.
        */
      sId: Unit,
        /**
        * The view name or view configuration object.
        */
      vView: String
      ): typingsJapgolly.openui5.sapUiCoreMvcViewMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("view")(sId.asInstanceOf[js.Any], vView.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.openui5.sapUiCoreMvcViewMod.default]
      inline def view(
        /**
        * The ID of the newly created view, only allowed for instance creation. If no ID is given, an ID will be
        * generated. For view definition, skip this parameter and use `vView` as the first parameter.
        */
      sId: Unit,
        /**
        * The view name or view configuration object.
        */
      vView: ViewData
      ): typingsJapgolly.openui5.sapUiCoreMvcViewMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("view")(sId.asInstanceOf[js.Any], vView.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.openui5.sapUiCoreMvcViewMod.default]
      
      /**
        * @deprecated (since 1.58) - use {@link sap.ui.core.Fragment.load} instead
        *
        * Instantiates an XML-based Fragment.
        *
        * To instantiate a fragment, call:
        * ```javascript
        *
        *    sap.ui.xmlfragment([sId], sFragmentName, [oController]);
        * ```
        *  The fragment instance ID is optional and will be used as prefix for the ID of all contained controls.
        * If no ID is passed, controls will not be prefixed. The `sFragmentName` must correspond to an XML fragment
        * which can be loaded via the module system (fragmentName + ".fragment.xml") and which defines the fragment.
        * If `oController` is given, the methods referenced in the fragment will be called on this controller.
        *
        * Note that fragments may require a controller to be given and certain methods to be available.
        *
        * Advanced usage:: To instantiate a fragment and optionally directly give the XML definition instead of
        * loading it from a file, call:
        * ```javascript
        *
        *     sap.ui.xmlfragment(oFragmentConfig, [oController]);
        * ```
        *  The `oFragmentConfig` object can either have a `fragmentName` or a `fragmentContent` property, but not
        * both. `fragmentContent` can hold the fragment definition as XML string; if not given, `fragmentName`
        * must be given and the fragment content definition is loaded via the module system. Again, if `oController`
        * is given, the methods referenced in the fragment will be called on this controller.
        *
        * @returns the root Control(s) of the created fragment instance
        */
      inline def xmlfragment(
        /**
        * ID of the newly created fragment
        */
      sId: String,
        /**
        * Resource name of the fragment; a module name in dot notation without the '.fragment.xml' suffix. Alternatively,
        * a configuration object can be given with the properties described below. In this case, no `sId` may be
        * given as first parameter, but as property `id` in the configuration object.
        */
      vFragment: String
      ): typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("xmlfragment")(sId.asInstanceOf[js.Any], vFragment.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]
      inline def xmlfragment(
        /**
        * ID of the newly created fragment
        */
      sId: String,
        /**
        * Resource name of the fragment; a module name in dot notation without the '.fragment.xml' suffix. Alternatively,
        * a configuration object can be given with the properties described below. In this case, no `sId` may be
        * given as first parameter, but as property `id` in the configuration object.
        */
      vFragment: String,
        /**
        * A controller to be used for event handlers in the fragment; can either be the controller of an enclosing
        * view, a new controller instance, or a simple object with the necessary methods attached. Note that a
        * fragment has no runtime representation besides its contained controls. There's therefore no API to retrieve
        * the controller after creating a fragment
        */
      oController: js.Object
      ): typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("xmlfragment")(sId.asInstanceOf[js.Any], vFragment.asInstanceOf[js.Any], oController.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]
      inline def xmlfragment(
        /**
        * ID of the newly created fragment
        */
      sId: String,
        /**
        * Resource name of the fragment; a module name in dot notation without the '.fragment.xml' suffix. Alternatively,
        * a configuration object can be given with the properties described below. In this case, no `sId` may be
        * given as first parameter, but as property `id` in the configuration object.
        */
      vFragment: String,
        /**
        * A controller to be used for event handlers in the fragment; can either be the controller of an enclosing
        * view, a new controller instance, or a simple object with the necessary methods attached. Note that a
        * fragment has no runtime representation besides its contained controls. There's therefore no API to retrieve
        * the controller after creating a fragment
        */
      oController: typingsJapgolly.openui5.sapUiCoreMvcControllerMod.default
      ): typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("xmlfragment")(sId.asInstanceOf[js.Any], vFragment.asInstanceOf[js.Any], oController.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]
      inline def xmlfragment(
        /**
        * ID of the newly created fragment
        */
      sId: String,
        /**
        * Resource name of the fragment; a module name in dot notation without the '.fragment.xml' suffix. Alternatively,
        * a configuration object can be given with the properties described below. In this case, no `sId` may be
        * given as first parameter, but as property `id` in the configuration object.
        */
      vFragment: FragmentContent
      ): typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("xmlfragment")(sId.asInstanceOf[js.Any], vFragment.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]
      inline def xmlfragment(
        /**
        * ID of the newly created fragment
        */
      sId: String,
        /**
        * Resource name of the fragment; a module name in dot notation without the '.fragment.xml' suffix. Alternatively,
        * a configuration object can be given with the properties described below. In this case, no `sId` may be
        * given as first parameter, but as property `id` in the configuration object.
        */
      vFragment: FragmentContent,
        /**
        * A controller to be used for event handlers in the fragment; can either be the controller of an enclosing
        * view, a new controller instance, or a simple object with the necessary methods attached. Note that a
        * fragment has no runtime representation besides its contained controls. There's therefore no API to retrieve
        * the controller after creating a fragment
        */
      oController: js.Object
      ): typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("xmlfragment")(sId.asInstanceOf[js.Any], vFragment.asInstanceOf[js.Any], oController.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]
      inline def xmlfragment(
        /**
        * ID of the newly created fragment
        */
      sId: String,
        /**
        * Resource name of the fragment; a module name in dot notation without the '.fragment.xml' suffix. Alternatively,
        * a configuration object can be given with the properties described below. In this case, no `sId` may be
        * given as first parameter, but as property `id` in the configuration object.
        */
      vFragment: FragmentContent,
        /**
        * A controller to be used for event handlers in the fragment; can either be the controller of an enclosing
        * view, a new controller instance, or a simple object with the necessary methods attached. Note that a
        * fragment has no runtime representation besides its contained controls. There's therefore no API to retrieve
        * the controller after creating a fragment
        */
      oController: typingsJapgolly.openui5.sapUiCoreMvcControllerMod.default
      ): typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("xmlfragment")(sId.asInstanceOf[js.Any], vFragment.asInstanceOf[js.Any], oController.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]
      /**
        * @deprecated (since 1.58) - use {@link sap.ui.core.Fragment.load} instead
        *
        * Instantiates an XML-based Fragment.
        *
        * To instantiate a fragment, call:
        * ```javascript
        *
        *    sap.ui.xmlfragment([sId], sFragmentName, [oController]);
        * ```
        *  The fragment instance ID is optional and will be used as prefix for the ID of all contained controls.
        * If no ID is passed, controls will not be prefixed. The `sFragmentName` must correspond to an XML fragment
        * which can be loaded via the module system (fragmentName + ".fragment.xml") and which defines the fragment.
        * If `oController` is given, the methods referenced in the fragment will be called on this controller.
        *
        * Note that fragments may require a controller to be given and certain methods to be available.
        *
        * Advanced usage:: To instantiate a fragment and optionally directly give the XML definition instead of
        * loading it from a file, call:
        * ```javascript
        *
        *     sap.ui.xmlfragment(oFragmentConfig, [oController]);
        * ```
        *  The `oFragmentConfig` object can either have a `fragmentName` or a `fragmentContent` property, but not
        * both. `fragmentContent` can hold the fragment definition as XML string; if not given, `fragmentName`
        * must be given and the fragment content definition is loaded via the module system. Again, if `oController`
        * is given, the methods referenced in the fragment will be called on this controller.
        *
        * @returns the root Control(s) of the created fragment instance
        */
      inline def xmlfragment(
        /**
        * Resource name of the fragment; a module name in dot notation without the '.fragment.xml' suffix. Alternatively,
        * a configuration object can be given with the properties described below. In this case, no `sId` may be
        * given as first parameter, but as property `id` in the configuration object.
        */
      vFragment: String
      ): typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] = ^.asInstanceOf[js.Dynamic].applyDynamic("xmlfragment")(vFragment.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]
      inline def xmlfragment(
        /**
        * Resource name of the fragment; a module name in dot notation without the '.fragment.xml' suffix. Alternatively,
        * a configuration object can be given with the properties described below. In this case, no `sId` may be
        * given as first parameter, but as property `id` in the configuration object.
        */
      vFragment: String,
        /**
        * A controller to be used for event handlers in the fragment; can either be the controller of an enclosing
        * view, a new controller instance, or a simple object with the necessary methods attached. Note that a
        * fragment has no runtime representation besides its contained controls. There's therefore no API to retrieve
        * the controller after creating a fragment
        */
      oController: js.Object
      ): typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("xmlfragment")(vFragment.asInstanceOf[js.Any], oController.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]
      inline def xmlfragment(
        /**
        * Resource name of the fragment; a module name in dot notation without the '.fragment.xml' suffix. Alternatively,
        * a configuration object can be given with the properties described below. In this case, no `sId` may be
        * given as first parameter, but as property `id` in the configuration object.
        */
      vFragment: String,
        /**
        * A controller to be used for event handlers in the fragment; can either be the controller of an enclosing
        * view, a new controller instance, or a simple object with the necessary methods attached. Note that a
        * fragment has no runtime representation besides its contained controls. There's therefore no API to retrieve
        * the controller after creating a fragment
        */
      oController: typingsJapgolly.openui5.sapUiCoreMvcControllerMod.default
      ): typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("xmlfragment")(vFragment.asInstanceOf[js.Any], oController.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]
      inline def xmlfragment(
        /**
        * Resource name of the fragment; a module name in dot notation without the '.fragment.xml' suffix. Alternatively,
        * a configuration object can be given with the properties described below. In this case, no `sId` may be
        * given as first parameter, but as property `id` in the configuration object.
        */
      vFragment: FragmentContent
      ): typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] = ^.asInstanceOf[js.Dynamic].applyDynamic("xmlfragment")(vFragment.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]
      inline def xmlfragment(
        /**
        * Resource name of the fragment; a module name in dot notation without the '.fragment.xml' suffix. Alternatively,
        * a configuration object can be given with the properties described below. In this case, no `sId` may be
        * given as first parameter, but as property `id` in the configuration object.
        */
      vFragment: FragmentContent,
        /**
        * A controller to be used for event handlers in the fragment; can either be the controller of an enclosing
        * view, a new controller instance, or a simple object with the necessary methods attached. Note that a
        * fragment has no runtime representation besides its contained controls. There's therefore no API to retrieve
        * the controller after creating a fragment
        */
      oController: js.Object
      ): typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("xmlfragment")(vFragment.asInstanceOf[js.Any], oController.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]
      inline def xmlfragment(
        /**
        * Resource name of the fragment; a module name in dot notation without the '.fragment.xml' suffix. Alternatively,
        * a configuration object can be given with the properties described below. In this case, no `sId` may be
        * given as first parameter, but as property `id` in the configuration object.
        */
      vFragment: FragmentContent,
        /**
        * A controller to be used for event handlers in the fragment; can either be the controller of an enclosing
        * view, a new controller instance, or a simple object with the necessary methods attached. Note that a
        * fragment has no runtime representation besides its contained controls. There's therefore no API to retrieve
        * the controller after creating a fragment
        */
      oController: typingsJapgolly.openui5.sapUiCoreMvcControllerMod.default
      ): typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("xmlfragment")(vFragment.asInstanceOf[js.Any], oController.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.openui5.sapUiCoreControlMod.default | js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]
      
      /**
        * @deprecated (since 1.56) - Use {@link sap.ui.core.mvc.XMLView.create XMLView.create} to create view instances
        *
        * Instantiates an XMLView of the given name and with the given ID.
        *
        * The `vView` can either be the name of the module that contains the view definition or it can be a configuration
        * object with properties `viewName`, `viewContent` and a `controller` property (more properties are described
        * in the parameters section below).
        *
        * If a `viewName` is given, it behaves the same as when `vView` is a string: the named resource will be
        * loaded and parsed as XML. Alternatively, an already loaded view definition can be provided as `viewContent`,
        * either as XML string or as an already parsed XML document. Exactly one of `viewName` and `viewContent`
        * must be given, if none or both are given, an error will be reported. The `controller` property is optional
        * and can hold a controller instance. When given, it overrides the controller class defined in the view
        * definition.
        *
        * When property `async` is set to true, the view definition and the controller class (and its dependencies)
        * will be loaded asynchronously. Any controls used in the view might be loaded sync or async, depending
        * on the processingMode. Even when the view definition is provided as string or XML Document, controller
        * or controls might be loaded asynchronously. In any case a view instance will be returned synchronously
        * by this factory API, but its content (control tree) might appear only later. Also see {@link sap.ui.core.mvc.View#loaded}.
        *
        * **Note**: If an XML document is given, it might be modified during view construction.
        *
        * **Note**: On root level, you can only define content for the default aggregation, e.g. without adding
        * the `<content>` tag. If you want to specify content for another aggregation of a view like `dependents`,
        * place it in a child control's dependents aggregation or add it by using {@link sap.ui.core.mvc.XMLView#addDependent}.
        *
        * **Note**: If you enable caching, you need to take care of the invalidation via keys. Automatic invalidation
        * takes only place if the UI5 version or the component descriptor (manifest.json) change. This is still
        * an experimental feature and may experience slight changes of the invalidation parameters or the cache
        * key format.
        *
        * Like with any other control, `sId` is optional and an ID will be created automatically.
        *
        * @returns the created XMLView instance
        */
      inline def xmlview(
        /**
        * ID of the newly created view
        */
      sId: String,
        /**
        * Name of the view or a view configuration object as described above
        */
      vView: String
      ): typingsJapgolly.openui5.sapUiCoreMvcXmlviewMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("xmlview")(sId.asInstanceOf[js.Any], vView.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.openui5.sapUiCoreMvcXmlviewMod.default]
      inline def xmlview(
        /**
        * ID of the newly created view
        */
      sId: String,
        /**
        * Name of the view or a view configuration object as described above
        */
      vView: AsyncCache
      ): typingsJapgolly.openui5.sapUiCoreMvcXmlviewMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("xmlview")(sId.asInstanceOf[js.Any], vView.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.openui5.sapUiCoreMvcXmlviewMod.default]
      /**
        * @deprecated (since 1.56) - Use {@link sap.ui.core.mvc.XMLView.create XMLView.create} to create view instances
        *
        * Instantiates an XMLView of the given name and with the given ID.
        *
        * The `vView` can either be the name of the module that contains the view definition or it can be a configuration
        * object with properties `viewName`, `viewContent` and a `controller` property (more properties are described
        * in the parameters section below).
        *
        * If a `viewName` is given, it behaves the same as when `vView` is a string: the named resource will be
        * loaded and parsed as XML. Alternatively, an already loaded view definition can be provided as `viewContent`,
        * either as XML string or as an already parsed XML document. Exactly one of `viewName` and `viewContent`
        * must be given, if none or both are given, an error will be reported. The `controller` property is optional
        * and can hold a controller instance. When given, it overrides the controller class defined in the view
        * definition.
        *
        * When property `async` is set to true, the view definition and the controller class (and its dependencies)
        * will be loaded asynchronously. Any controls used in the view might be loaded sync or async, depending
        * on the processingMode. Even when the view definition is provided as string or XML Document, controller
        * or controls might be loaded asynchronously. In any case a view instance will be returned synchronously
        * by this factory API, but its content (control tree) might appear only later. Also see {@link sap.ui.core.mvc.View#loaded}.
        *
        * **Note**: If an XML document is given, it might be modified during view construction.
        *
        * **Note**: On root level, you can only define content for the default aggregation, e.g. without adding
        * the `<content>` tag. If you want to specify content for another aggregation of a view like `dependents`,
        * place it in a child control's dependents aggregation or add it by using {@link sap.ui.core.mvc.XMLView#addDependent}.
        *
        * **Note**: If you enable caching, you need to take care of the invalidation via keys. Automatic invalidation
        * takes only place if the UI5 version or the component descriptor (manifest.json) change. This is still
        * an experimental feature and may experience slight changes of the invalidation parameters or the cache
        * key format.
        *
        * Like with any other control, `sId` is optional and an ID will be created automatically.
        *
        * @returns the created XMLView instance
        */
      inline def xmlview(/**
        * Name of the view or a view configuration object as described above
        */
      vView: String): typingsJapgolly.openui5.sapUiCoreMvcXmlviewMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("xmlview")(vView.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.openui5.sapUiCoreMvcXmlviewMod.default]
      inline def xmlview(/**
        * Name of the view or a view configuration object as described above
        */
      vView: AsyncCache): typingsJapgolly.openui5.sapUiCoreMvcXmlviewMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("xmlview")(vView.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.openui5.sapUiCoreMvcXmlviewMod.default]
    }
  }
}
