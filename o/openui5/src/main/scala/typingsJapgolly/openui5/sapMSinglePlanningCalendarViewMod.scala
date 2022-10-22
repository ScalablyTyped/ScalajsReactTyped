package typingsJapgolly.openui5

import typingsJapgolly.openui5.sap.ClassInfo
import typingsJapgolly.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typingsJapgolly.openui5.sapUiCoreElementMod.ElementSettings
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMSinglePlanningCalendarViewMod {
  
  @JSImport("sap/m/SinglePlanningCalendarView", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `SinglePlanningCalendarView`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends SinglePlanningCalendarView {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: SinglePlanningCalendarViewSettings) = this()
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
    mSettings: SinglePlanningCalendarViewSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: SinglePlanningCalendarViewSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/SinglePlanningCalendarView", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.SinglePlanningCalendarView with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, SinglePlanningCalendarView]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, SinglePlanningCalendarView],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.SinglePlanningCalendarView.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typingsJapgolly.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typingsJapgolly.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait SinglePlanningCalendarView
    extends typingsJapgolly.openui5.sapUiCoreElementMod.default {
    
    /**
      * Should calculate the startDate which will be displayed in the `sap.m.SinglePlanningCalendar` based on
      * a given date.
      */
    def calculateStartDate(/**
      * the given date
      */
    oDate: js.Object): Unit = js.native
    
    /**
      * Should return the number of columns to be displayed in the grid of the `sap.m.SinglePlanningCalendar`.
      */
    def getEntityCount(): Unit = js.native
    
    /**
      * @SINCE 1.98
      *
      * Gets current value of property {@link #getFirstDayOfWeek firstDayOfWeek}.
      *
      * If set, the first day of the displayed week is this day. Valid values are 0 to 6 starting on Sunday.
      * If there is no valid value set, the default of the used locale is used.
      *
      * Note: This property will only have effect in Week view and Month view of the SinglePlanningCalendar,
      * but it wouldn't have effect in WorkWeek view.
      *
      * Default value is `-1`.
      *
      * @returns Value of property `firstDayOfWeek`
      */
    def getFirstDayOfWeek(): int = js.native
    
    /**
      * Gets current value of property {@link #getKey key}.
      *
      * Indicates a unique key for the view
      *
      * @returns Value of property `key`
      */
    def getKey(): String = js.native
    
    /**
      * Should return a number of entities until the next/previous startDate of the `sap.m.SinglePlanningCalendar`
      * after navigating forward/backward with the arrows. For example, by pressing the forward button inside
      * the work week view, the next startDate of a work week will be 7 entities (days) away from the current
      * one.
      */
    def getScrollEntityCount(): Unit = js.native
    
    /**
      * Gets current value of property {@link #getTitle title}.
      *
      * Adds a title for the view
      *
      * @returns Value of property `title`
      */
    def getTitle(): String = js.native
    
    /**
      * @SINCE 1.98
      *
      * Sets a new value for property {@link #getFirstDayOfWeek firstDayOfWeek}.
      *
      * If set, the first day of the displayed week is this day. Valid values are 0 to 6 starting on Sunday.
      * If there is no valid value set, the default of the used locale is used.
      *
      * Note: This property will only have effect in Week view and Month view of the SinglePlanningCalendar,
      * but it wouldn't have effect in WorkWeek view.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `-1`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFirstDayOfWeek(): this.type = js.native
    def setFirstDayOfWeek(/**
      * New value for property `firstDayOfWeek`
      */
    iFirstDayOfWeek: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getKey key}.
      *
      * Indicates a unique key for the view
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setKey(/**
      * New value for property `key`
      */
    sKey: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTitle title}.
      *
      * Adds a title for the view
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitle(/**
      * New value for property `title`
      */
    sTitle: String): this.type = js.native
  }
  
  trait SinglePlanningCalendarViewSettings
    extends StObject
       with ElementSettings {
    
    /**
      * @SINCE 1.98
      *
      * If set, the first day of the displayed week is this day. Valid values are 0 to 6 starting on Sunday.
      * If there is no valid value set, the default of the used locale is used.
      *
      * Note: This property will only have effect in Week view and Month view of the SinglePlanningCalendar,
      * but it wouldn't have effect in WorkWeek view.
      */
    var firstDayOfWeek: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Indicates a unique key for the view
      */
    var key: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Adds a title for the view
      */
    var title: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object SinglePlanningCalendarViewSettings {
    
    inline def apply(): SinglePlanningCalendarViewSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SinglePlanningCalendarViewSettings]
    }
    
    extension [Self <: SinglePlanningCalendarViewSettings](x: Self) {
      
      inline def setFirstDayOfWeek(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
      
      inline def setFirstDayOfWeekUndefined: Self = StObject.set(x, "firstDayOfWeek", js.undefined)
      
      inline def setKey(value: String | PropertyBindingInfo): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
