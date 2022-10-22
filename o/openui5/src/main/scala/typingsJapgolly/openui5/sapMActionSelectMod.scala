package typingsJapgolly.openui5

import typingsJapgolly.openui5.sap.ClassInfo
import typingsJapgolly.openui5.sapMSelectMod.SelectSettings
import typingsJapgolly.openui5.sapUiCoreLibraryMod.ID
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMActionSelectMod {
  
  @JSImport("sap/m/ActionSelect", JSImport.Default)
  @js.native
  /**
    * Constructor for a new ActionSelect.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ActionSelect {
    def this(/**
      * initial settings for the new control
      */
    mSettings: ActionSelectSettings) = this()
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
    mSettings: ActionSelectSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: ActionSelectSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/ActionSelect", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.ActionSelect with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.Select.extend}.
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
    oClassInfo: ClassInfo[T, ActionSelect]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ActionSelect],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.ActionSelect.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typingsJapgolly.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typingsJapgolly.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ActionSelect
    extends typingsJapgolly.openui5.sapMSelectMod.default {
    
    def addButton(
      /**
      * The buttons to add; if empty, nothing is inserted
      */
    vButton: typingsJapgolly.openui5.sapMButtonMod.default
    ): this.type = js.native
    /**
      * Adds some button into the association {@link #getButtons buttons}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addButton(/**
      * The buttons to add; if empty, nothing is inserted
      */
    vButton: ID): this.type = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getButtons
      * buttons}.
      */
    def getButtons(): js.Array[ID] = js.native
    
    /**
      * Remove all buttons from the ActionSelect.
      *
      * @returns An array with the ids of the removed elements (might be empty).
      */
    def removeAllButtons(): js.Array[String] = js.native
    
    def removeButton(/**
      * The button to remove or its index or ID.
      */
    vButton: String): String | Null = js.native
    /**
      * Removes the given button from the `ActionSelect` content.
      *
      * @returns The ID of the removed button or `null`.
      */
    def removeButton(/**
      * The button to remove or its index or ID.
      */
    vButton: int): String | Null = js.native
    def removeButton(
      /**
      * The button to remove or its index or ID.
      */
    vButton: typingsJapgolly.openui5.sapMButtonMod.default
    ): String | Null = js.native
  }
  
  trait ActionSelectSettings
    extends StObject
       with SelectSettings {
    
    /**
      * Buttons to be added to the ActionSelect content.
      */
    var buttons: js.UndefOr[js.Array[typingsJapgolly.openui5.sapMButtonMod.default | String]] = js.undefined
  }
  object ActionSelectSettings {
    
    inline def apply(): ActionSelectSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionSelectSettings]
    }
    
    extension [Self <: ActionSelectSettings](x: Self) {
      
      inline def setButtons(value: js.Array[typingsJapgolly.openui5.sapMButtonMod.default | String]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      inline def setButtonsVarargs(value: (typingsJapgolly.openui5.sapMButtonMod.default | String)*): Self = StObject.set(x, "buttons", js.Array(value*))
    }
  }
}
