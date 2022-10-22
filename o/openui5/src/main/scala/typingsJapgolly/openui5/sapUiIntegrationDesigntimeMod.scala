package typingsJapgolly.openui5

import typingsJapgolly.openui5.sap.ClassInfo
import typingsJapgolly.openui5.sapUiBaseManagedObjectMod.ManagedObjectSettings
import typingsJapgolly.openui5.sapUiIntegrationWidgetsCardMod.CardFacade
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiIntegrationDesigntimeMod {
  
  @JSImport("sap/ui/integration/Designtime", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `Designtime`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    *
    * This class does not have its own settings, but all settings applicable to the base type {@link sap.ui.base.ManagedObject#constructor
    * sap.ui.base.ManagedObject} can be used.
    */
  open class default () extends Designtime {
    def this(/**
      * Initial settings for the new Designtime.
      */
    mSettings: DesigntimeSettings) = this()
    def this(/**
      * ID for the new Designtime, generated automatically if no ID is given.
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new Designtime, generated automatically if no ID is given.
      */
    sId: String,
      /**
      * Initial settings for the new Designtime.
      */
    mSettings: DesigntimeSettings
    ) = this()
    def this(
      /**
      * ID for the new Designtime, generated automatically if no ID is given.
      */
    sId: Unit,
      /**
      * Initial settings for the new Designtime.
      */
    mSettings: DesigntimeSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/integration/Designtime", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.integration.Designtime with name `sClassName` and enriches it
      * with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.base.ManagedObject.extend}.
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
    oClassInfo: ClassInfo[T, Designtime]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Designtime],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.integration.Designtime.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typingsJapgolly.openui5.sapUiBaseManagedObjectMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typingsJapgolly.openui5.sapUiBaseManagedObjectMetadataMod.default]
  }
  
  @js.native
  trait Designtime
    extends typingsJapgolly.openui5.sapUiBaseManagedObjectMod.default {
    
    /**
      * Returns an interface to the card, which uses this extension.
      *
      * @returns An interface to the card.
      */
    def getCard(): CardFacade = js.native
  }
  
  type DesigntimeSettings = ManagedObjectSettings
}
