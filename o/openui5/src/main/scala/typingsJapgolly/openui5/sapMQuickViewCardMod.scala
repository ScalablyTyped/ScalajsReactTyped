package typingsJapgolly.openui5

import typingsJapgolly.openui5.sap.ClassInfo
import typingsJapgolly.openui5.sapMQuickViewBaseMod.QuickViewBaseSettings
import typingsJapgolly.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMQuickViewCardMod {
  
  @JSImport("sap/m/QuickViewCard", JSImport.Default)
  @js.native
  /**
    * Constructor for a new QuickViewCard.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends QuickViewCard {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: QuickViewCardSettings) = this()
    def this(/**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: String,
      /**
      * Initial settings for the new control
      */
    mSettings: QuickViewCardSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: QuickViewCardSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/QuickViewCard", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.QuickViewCard with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.QuickViewBase.extend}.
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
    oClassInfo: ClassInfo[T, QuickViewCard]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, QuickViewCard],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.QuickViewCard.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typingsJapgolly.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typingsJapgolly.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait QuickViewCard
    extends typingsJapgolly.openui5.sapMQuickViewBaseMod.default {
    
    /**
      * Gets current value of property {@link #getShowVerticalScrollBar showVerticalScrollBar}.
      *
      * Determines whether the browser displays the vertical scroll bar or simply cuts the content of the QuickViewCard.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showVerticalScrollBar`
      */
    def getShowVerticalScrollBar(): Boolean = js.native
    
    /**
      * Sets a new value for property {@link #getShowVerticalScrollBar showVerticalScrollBar}.
      *
      * Determines whether the browser displays the vertical scroll bar or simply cuts the content of the QuickViewCard.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowVerticalScrollBar(): this.type = js.native
    def setShowVerticalScrollBar(/**
      * New value for property `showVerticalScrollBar`
      */
    bShowVerticalScrollBar: Boolean): this.type = js.native
  }
  
  trait QuickViewCardSettings
    extends StObject
       with QuickViewBaseSettings {
    
    /**
      * Determines whether the browser displays the vertical scroll bar or simply cuts the content of the QuickViewCard.
      */
    var showVerticalScrollBar: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object QuickViewCardSettings {
    
    inline def apply(): QuickViewCardSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QuickViewCardSettings]
    }
    
    extension [Self <: QuickViewCardSettings](x: Self) {
      
      inline def setShowVerticalScrollBar(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showVerticalScrollBar", value.asInstanceOf[js.Any])
      
      inline def setShowVerticalScrollBarUndefined: Self = StObject.set(x, "showVerticalScrollBar", js.undefined)
    }
  }
}
