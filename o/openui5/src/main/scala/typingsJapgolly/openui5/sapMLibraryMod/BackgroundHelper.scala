package typingsJapgolly.openui5.sapMLibraryMod

import typingsJapgolly.openui5.float
import typingsJapgolly.openui5.sapUiCoreLibraryMod.CSSColor
import typingsJapgolly.openui5.sapUiCoreLibraryMod.URI
import typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BackgroundHelper {
  
  @JSImport("sap/m/library", "BackgroundHelper")
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
