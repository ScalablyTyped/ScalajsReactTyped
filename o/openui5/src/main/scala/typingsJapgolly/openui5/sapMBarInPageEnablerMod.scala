package typingsJapgolly.openui5

import typingsJapgolly.openui5.sap.ClassInfo
import typingsJapgolly.openui5.sapMLibraryMod.IBar
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMBarInPageEnablerMod {
  
  @JSImport("sap/m/BarInPageEnabler", JSImport.Default)
  @js.native
  open class default () extends BarInPageEnabler
  /* static members */
  object default {
    
    @JSImport("sap/m/BarInPageEnabler", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Adds the sapMBarChildClass to a control.
      */
    inline def addChildClassTo(
      /**
      * The sap.ui.core.Control to which the sapMBarChildClass will be added
      */
    oControl: typingsJapgolly.openui5.sapUiCoreControlMod.default
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addChildClassTo")(oControl.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Creates a new subclass of class sap.m.BarInPageEnabler with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.base.Object.extend}.
      *
      * @returns Created class / constructor function
      */
    inline def extend[T /* <: Record[String, Any] */](/**
      * Name of the class being created
      */
    sClassName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: Unit,
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, BarInPageEnabler]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, BarInPageEnabler],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.BarInPageEnabler.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typingsJapgolly.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typingsJapgolly.openui5.sapUiBaseMetadataMod.default]
    
    /**
      * Renders the tooltip for the given control
      */
    inline def renderTooltip(
      /**
      * the RenderManager that can be used for writing to the render output buffer.
      */
    oRM: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * an object representation of the control that should be rendered.
      */
    oControl: typingsJapgolly.openui5.sapUiCoreControlMod.default
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderTooltip")(oRM.asInstanceOf[js.Any], oControl.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @js.native
  trait BarInPageEnabler
    extends typingsJapgolly.openui5.sapUiBaseObjectMod.default {
    
    /**
      * Sets classes and HTML tag according to the context of the page.
      *
      * Possible contexts are header, footer, subheader.
      *
      * @returns `this` for chaining
      */
    def applyTagAndContextClassFor(/**
      * allowed values are header, footer, subheader.
      */
    sContext: String): IBar = js.native
    
    /**
      * Gets the Bar contexts inside page.
      *
      * @returns with all available contexts.
      */
    def getContext(): js.Object = js.native
    
    /**
      * Gets the HTML tag of the root domref.
      *
      * @returns the HTML-tag
      */
    def getHTMLTag(): String = js.native
    
    /**
      * Determines whether the bar is sensitive to the container context.
      *
      * Implementation of the IBar interface.
      *
      * @returns isContextSensitive
      */
    def isContextSensitive(): Boolean = js.native
    
    /**
      * Renders the HTML for the given control, using the provided {@link sap.ui.core.RenderManager}.
      */
    def render(
      /**
      * the RenderManager that can be used for writing to the render output buffer.
      */
    oRM: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * an object representation of the control that should be rendered.
      */
    oControl: typingsJapgolly.openui5.sapUiCoreControlMod.default
    ): Unit = js.native
    
    /**
      * Sets the HTML tag of the root element.
      *
      * @returns `this` to allow method chaining
      */
    def setHTMLTag(/**
      * The new root element
      */
    sNewTag: String): IBar = js.native
  }
}
