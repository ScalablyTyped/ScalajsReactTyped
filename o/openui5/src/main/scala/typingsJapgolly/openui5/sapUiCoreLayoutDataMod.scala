package typingsJapgolly.openui5

import typingsJapgolly.openui5.sap.ClassInfo
import typingsJapgolly.openui5.sapUiCoreElementMod.ElementSettings
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreLayoutDataMod {
  
  @JSImport("sap/ui/core/LayoutData", JSImport.Default)
  @js.native
  /**
    * Constructor for a new LayoutData.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    *
    * This class does not have its own settings, but all settings applicable to the base type {@link sap.ui.core.Element#constructor
    * sap.ui.core.Element} can be used.
    */
  open class default ()
    extends typingsJapgolly.openui5.sapUiCoreElementMod.default {
    def this(/**
      * initial settings for the new control
      */
    mSettings: LayoutDataSettings) = this()
    def this(/**
      * id for the new control, generated automatically if no id is given
      */
    sId: String) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: String,
      /**
      * initial settings for the new control
      */
    mSettings: LayoutDataSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: LayoutDataSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/LayoutData", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.core.LayoutData with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Element.extend}.
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
    oClassInfo: ClassInfo[T, LayoutData]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, LayoutData],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.core.LayoutData.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typingsJapgolly.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typingsJapgolly.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  type LayoutData = typingsJapgolly.openui5.sapUiCoreElementMod.default
  
  type LayoutDataSettings = ElementSettings
}
