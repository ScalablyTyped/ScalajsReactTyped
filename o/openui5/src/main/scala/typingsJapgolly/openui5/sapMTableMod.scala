package typingsJapgolly.openui5

import japgolly.scalajs.react.Callback
import typingsJapgolly.openui5.anon.ColumnListItem
import typingsJapgolly.openui5.anon.HasPopin
import typingsJapgolly.openui5.anon.`4`
import typingsJapgolly.openui5.sap.ClassInfo
import typingsJapgolly.openui5.sapMLibraryMod.BackgroundDesign
import typingsJapgolly.openui5.sapMLibraryMod.PopinLayout
import typingsJapgolly.openui5.sapMListBaseMod.ListBaseSettings
import typingsJapgolly.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typingsJapgolly.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typingsJapgolly.openui5.sapUiCoreLibraryMod.Priority
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMTableMod {
  
  @JSImport("sap/m/Table", JSImport.Default)
  @js.native
  /**
    * Constructor for a new Table.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:/responsive-table/ Responsive Table}
    */
  open class default () extends Table {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: TableSettings) = this()
    def this(/**
      * Id for the new control, generated automatically if no id is given
      */
    sId: String) = this()
    def this(
      /**
      * Id for the new control, generated automatically if no id is given
      */
    sId: String,
      /**
      * Initial settings for the new control
      */
    mSettings: TableSettings
    ) = this()
    def this(
      /**
      * Id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: TableSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/Table", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.Table with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.ListBase.extend}.
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
    oClassInfo: ClassInfo[T, Table]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Table],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.Table.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typingsJapgolly.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typingsJapgolly.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Table
    extends typingsJapgolly.openui5.sapMListBaseMod.default {
    
    /**
      * Adds some column to the aggregation {@link #getColumns columns}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addColumn(
      /**
      * The column to add; if empty, nothing is inserted
      */
    oColumn: typingsJapgolly.openui5.sapMColumnMod.default
    ): this.type = js.native
    
    /**
      * @SINCE 1.60
      *
      * Attaches event handler `fnFunction` to the {@link #event:paste paste} event of this `sap.m.Table`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Table` itself.
      *
      * This event gets fired when the user pastes content from the clipboard to the table. Pasting can be done
      * via the context menu or the standard paste keyboard shortcut, if the focus is inside the table.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPaste(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachPaste(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Table` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.60
      *
      * Attaches event handler `fnFunction` to the {@link #event:paste paste} event of this `sap.m.Table`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Table` itself.
      *
      * This event gets fired when the user pastes content from the clipboard to the table. Pasting can be done
      * via the context menu or the standard paste keyboard shortcut, if the focus is inside the table.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPaste(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachPaste(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Table` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.77
      *
      * Attaches event handler `fnFunction` to the {@link #event:popinChanged popinChanged} event of this `sap.m.Table`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Table` itself.
      *
      * Fired when the table pop-in has changed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPopinChanged(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachPopinChanged(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Table` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.77
      *
      * Attaches event handler `fnFunction` to the {@link #event:popinChanged popinChanged} event of this `sap.m.Table`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Table` itself.
      *
      * Fired when the table pop-in has changed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPopinChanged(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachPopinChanged(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Table` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys all the columns in the aggregation {@link #getColumns columns}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyColumns(): this.type = js.native
    
    /**
      * @SINCE 1.60
      *
      * Detaches event handler `fnFunction` from the {@link #event:paste paste} event of this `sap.m.Table`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachPaste(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachPaste(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.77
      *
      * Detaches event handler `fnFunction` from the {@link #event:popinChanged popinChanged} event of this `sap.m.Table`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachPopinChanged(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachPopinChanged(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    def fireBeforeOpenContextMenu(/**
      * Parameters to pass along with the event
      */
    mParameters: ColumnListItem): Boolean = js.native
    
    /**
      * @SINCE 1.60
      *
      * Fires event {@link #event:paste paste} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def firePaste(): Boolean = js.native
    def firePaste(/**
      * Parameters to pass along with the event
      */
    mParameters: `4`): Boolean = js.native
    
    /**
      * @SINCE 1.77
      *
      * Fires event {@link #event:popinChanged popinChanged} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def firePopinChanged(): this.type = js.native
    def firePopinChanged(/**
      * Parameters to pass along with the event
      */
    mParameters: HasPopin): this.type = js.native
    
    /**
      * @SINCE 1.52
      *
      * Gets current value of property {@link #getAlternateRowColors alternateRowColors}.
      *
      * Enables alternating table row colors. **Note:** This property can only be used with the Belize and Belize
      * Deep themes. Alternate row coloring is not available for the High Contrast Black/White themes.
      *
      * Default value is `false`.
      *
      * @returns Value of property `alternateRowColors`
      */
    def getAlternateRowColors(): Boolean = js.native
    
    /**
      * @SINCE 1.76
      *
      * Gets current value of property {@link #getAutoPopinMode autoPopinMode}.
      *
      * Enables the auto pop-in behavior for the table control.
      *
      * If this property is set to `true`, the table control overwrites the `demandPopin` and the `minScreenWidth`
      * properties of the `sap.m.Column` control. The pop-in behavior depends on the `importance` property of
      * the `sap.m.Column` control. Columns configured with this property are moved to the pop-in area in the
      * following order:
      *
      *
      * 	 - With importance `High`: moved last
      * 	 - With importance `Medium` or `None`: moved second
      * 	 - With importance `Low`: moved first
      *
      * **Note:** If this property is changed from `true` to `false`, the application must reconfigure the `demandPopin`
      * and `minScreenWidth` properties of the `sap.m.Column` control by itself. There is no automatic mechanism
      * that restores the old values if `autoPopinMode` was set from `false` to `true` before.
      *
      * Default value is `false`.
      *
      * @returns Value of property `autoPopinMode`
      */
    def getAutoPopinMode(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getBackgroundDesign backgroundDesign}.
      *
      * Sets the background style of the table. Depending on the theme, you can change the state of the background
      * from `Solid` to `Translucent` or to `Transparent`.
      *
      * Default value is `Translucent`.
      *
      * @returns Value of property `backgroundDesign`
      */
    def getBackgroundDesign(): BackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String) = js.native
    
    /**
      * Getter for aggregation columns.
      *
      * @returns columns of the Table
      */
    def getColumns(): js.Array[typingsJapgolly.openui5.sapMColumnMod.default] = js.native
    def getColumns(
      /**
      * set true to get the columns in an order that respects personalization settings
      */
    bSort: Boolean
    ): js.Array[typingsJapgolly.openui5.sapMColumnMod.default] = js.native
    
    /**
      * @SINCE 1.60
      *
      * Gets current value of property {@link #getContextualWidth contextualWidth}.
      *
      * Defines the contextual width for the `sap.m.Table` control. By defining this property the table adapts
      * the pop-in behavior based on the container in which the table is placed or the configured contextual
      * width. By default, `sap.m.Table` renders in pop-in behavior only depending on the window size or device.
      *
      * For example, by setting the `contextualWidth` property to 600px or Tablet, the table can be placed in
      * a container with 600px width, where the pop-in is used. You can use specific CSS sizes (for example,
      * 600px or 600), you can also use the `sap.m.ScreenSize` enumeration (for example, Phone, Tablet, Desktop,
      * Small, Medium, Large, ....). If this property is set to `Auto`, the `ResizeHandler` will manage the contextual
      * width of the table. **Note:** Only "Inherit", "Auto", and pixel-based CSS sizes (for example, 200, 200px)
      * can be applied to the `contextualWidth` property. Due to the rendering cost, we recommend to use the
      * valid value mentioned before except for "Auto".
      *
      * Default value is `"Inherit"`.
      *
      * @returns Value of property `contextualWidth`
      */
    def getContextualWidth(): String = js.native
    
    /**
      * @SINCE 1.22
      *
      * Gets current value of property {@link #getFixedLayout fixedLayout}.
      *
      * Defines the algorithm to be used to layout the table cells, rows, and columns. This property allows three
      * possible values:
      * 	 - `true`
      * 	 - `false`
      * 	 - `Strict`
      *
      * By default, the table is rendered with a fixed layout algorithm (`fixedLayout=true`). This means the
      * horizontal layout only depends on the table's width and the width of the columns, not the content of
      * the cells. Cells in subsequent rows do not affect column width. This allows a browser to provide a faster
      * table layout since the browser can begin to display the table once the first row has been analyzed.
      *
      * If this property is set to `false`, `sap.m.Table` is rendered with an auto layout algorithm. This means,
      * the width of the table and its cells depends on the content of the cells. The column width is set by
      * the widest unbreakable content inside the cells. This can make the rendering slow, since the browser
      * needs to go through all the content in the table before determining the final layout.
      *
      *
      * If this property is set to `Strict` and the `width` property is defined for all columns (and not the
      * expected "auto" value), then the `sap.m.Table` control renders a placeholder column which occupies the
      * remaining width of the control to ensure the column width setting is strictly applied.
      *
      *
      * If there is only one remaining column with a width larger than the table, then this column gets the maximum
      * width available in the table. If the column width is smaller than the table, then the column width is
      * retained, and the remaining width of the table is occupied by the placeholder column.
      *
      *
      * The placeholder column gets rendered only if there are no columns in the pop-in area.
      *
      *
      * **Note:** Since `sap.m.Table` does not have its own scrollbars, setting `fixedLayout` to false can force
      * the table to overflow, which may cause visual problems. It is suggested to use this property when a table
      * has a few columns in wide screens or within the horizontal scroll container (e.g `sap.m.Dialog`) to handle
      * overflow. In auto layout mode the `width` property of `sap.m.Column` is taken into account as a minimum
      * width.
      *
      * Default value is `true`.
      *
      * @returns Value of property `fixedLayout`
      */
    def getFixedLayout(): Any = js.native
    
    /**
      * @SINCE 1.77
      *
      * Gets current value of property {@link #getHiddenInPopin hiddenInPopin}.
      *
      * Defines which columns should be hidden instead of moved into the pop-in area depending on their importance.
      * See {@link sap.m.Column#getImportance}
      *
      * **Note:** To hide columns based on their importance, it's mandatory to set `demandPopin="true"` for the
      * `sap.m.Column` control or set `autoPopinMode="true"` for the `sap.m.Table` control. See {@link topic:38855e06486f4910bfa6f4485f7c2bac
      * Configuring Responsive Behavior of a Table} and {@link sap.m.Table#getAutoPopinMode}.
      *
      * @returns Value of property `hiddenInPopin`
      */
    def getHiddenInPopin(): js.Array[
        Priority | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Priority * / any */ String)
      ] = js.native
    
    /**
      * @SINCE 1.52
      *
      * Gets current value of property {@link #getPopinLayout popinLayout}.
      *
      * Defines the layout in which the table pop-in rows are rendered. **Note:** The `demandPopin` and `minScreenWidth`
      * properties of the `Column` control must be configured appropriately.
      *
      * Default value is `Block`.
      *
      * @returns Value of property `popinLayout`
      */
    def getPopinLayout(): PopinLayout | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PopinLayout * / any */ String) = js.native
    
    /**
      * @SINCE 1.22.1
      *
      * Gets current value of property {@link #getShowOverlay showOverlay}.
      *
      * Setting this property to `true` will show an overlay on top of the table content and prevents the user
      * interaction with it.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showOverlay`
      */
    def getShowOverlay(): Boolean = js.native
    
    /**
      * Checks for the provided `sap.m.Column` in the aggregation {@link #getColumns columns}. and returns its
      * index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfColumn(
      /**
      * The column whose index is looked for
      */
    oColumn: typingsJapgolly.openui5.sapMColumnMod.default
    ): int = js.native
    
    /**
      * Inserts a column into the aggregation {@link #getColumns columns}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertColumn(
      /**
      * The column to insert; if empty, nothing is inserted
      */
    oColumn: typingsJapgolly.openui5.sapMColumnMod.default,
      /**
      * The `0`-based index the column should be inserted at; for a negative value of `iIndex`, the column is
      * inserted at position 0; for a value greater than the current size of the aggregation, the column is inserted
      * at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getColumns columns}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllColumns(): js.Array[typingsJapgolly.openui5.sapMColumnMod.default] = js.native
    
    def removeColumn(/**
      * The column to remove or its index or id
      */
    vColumn: String): typingsJapgolly.openui5.sapMColumnMod.default | Null = js.native
    /**
      * Removes a column from the aggregation {@link #getColumns columns}.
      *
      * @returns The removed column or `null`
      */
    def removeColumn(/**
      * The column to remove or its index or id
      */
    vColumn: int): typingsJapgolly.openui5.sapMColumnMod.default | Null = js.native
    def removeColumn(
      /**
      * The column to remove or its index or id
      */
    vColumn: typingsJapgolly.openui5.sapMColumnMod.default
    ): typingsJapgolly.openui5.sapMColumnMod.default | Null = js.native
    
    /**
      * @SINCE 1.52
      *
      * Sets a new value for property {@link #getAlternateRowColors alternateRowColors}.
      *
      * Enables alternating table row colors. **Note:** This property can only be used with the Belize and Belize
      * Deep themes. Alternate row coloring is not available for the High Contrast Black/White themes.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAlternateRowColors(): this.type = js.native
    def setAlternateRowColors(/**
      * New value for property `alternateRowColors`
      */
    bAlternateRowColors: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.76
      *
      * Sets a new value for property {@link #getAutoPopinMode autoPopinMode}.
      *
      * Enables the auto pop-in behavior for the table control.
      *
      * If this property is set to `true`, the table control overwrites the `demandPopin` and the `minScreenWidth`
      * properties of the `sap.m.Column` control. The pop-in behavior depends on the `importance` property of
      * the `sap.m.Column` control. Columns configured with this property are moved to the pop-in area in the
      * following order:
      *
      *
      * 	 - With importance `High`: moved last
      * 	 - With importance `Medium` or `None`: moved second
      * 	 - With importance `Low`: moved first
      *
      * **Note:** If this property is changed from `true` to `false`, the application must reconfigure the `demandPopin`
      * and `minScreenWidth` properties of the `sap.m.Column` control by itself. There is no automatic mechanism
      * that restores the old values if `autoPopinMode` was set from `false` to `true` before.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAutoPopinMode(): this.type = js.native
    def setAutoPopinMode(/**
      * New value for property `autoPopinMode`
      */
    bAutoPopinMode: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getBackgroundDesign backgroundDesign}.
      *
      * Sets the background style of the table. Depending on the theme, you can change the state of the background
      * from `Solid` to `Translucent` or to `Transparent`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Translucent`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBackgroundDesign(): this.type = js.native
    def setBackgroundDesign(
      /**
      * New value for property `backgroundDesign`
      */
    sBackgroundDesign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String
    ): this.type = js.native
    def setBackgroundDesign(/**
      * New value for property `backgroundDesign`
      */
    sBackgroundDesign: BackgroundDesign): this.type = js.native
    
    /**
      * @SINCE 1.60
      *
      * Sets a new value for property {@link #getContextualWidth contextualWidth}.
      *
      * Defines the contextual width for the `sap.m.Table` control. By defining this property the table adapts
      * the pop-in behavior based on the container in which the table is placed or the configured contextual
      * width. By default, `sap.m.Table` renders in pop-in behavior only depending on the window size or device.
      *
      * For example, by setting the `contextualWidth` property to 600px or Tablet, the table can be placed in
      * a container with 600px width, where the pop-in is used. You can use specific CSS sizes (for example,
      * 600px or 600), you can also use the `sap.m.ScreenSize` enumeration (for example, Phone, Tablet, Desktop,
      * Small, Medium, Large, ....). If this property is set to `Auto`, the `ResizeHandler` will manage the contextual
      * width of the table. **Note:** Only "Inherit", "Auto", and pixel-based CSS sizes (for example, 200, 200px)
      * can be applied to the `contextualWidth` property. Due to the rendering cost, we recommend to use the
      * valid value mentioned before except for "Auto".
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"Inherit"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setContextualWidth(): this.type = js.native
    def setContextualWidth(/**
      * New value for property `contextualWidth`
      */
    sContextualWidth: String): this.type = js.native
    
    /**
      * @SINCE 1.22
      *
      * Sets a new value for property {@link #getFixedLayout fixedLayout}.
      *
      * Defines the algorithm to be used to layout the table cells, rows, and columns. This property allows three
      * possible values:
      * 	 - `true`
      * 	 - `false`
      * 	 - `Strict`
      *
      * By default, the table is rendered with a fixed layout algorithm (`fixedLayout=true`). This means the
      * horizontal layout only depends on the table's width and the width of the columns, not the content of
      * the cells. Cells in subsequent rows do not affect column width. This allows a browser to provide a faster
      * table layout since the browser can begin to display the table once the first row has been analyzed.
      *
      * If this property is set to `false`, `sap.m.Table` is rendered with an auto layout algorithm. This means,
      * the width of the table and its cells depends on the content of the cells. The column width is set by
      * the widest unbreakable content inside the cells. This can make the rendering slow, since the browser
      * needs to go through all the content in the table before determining the final layout.
      *
      *
      * If this property is set to `Strict` and the `width` property is defined for all columns (and not the
      * expected "auto" value), then the `sap.m.Table` control renders a placeholder column which occupies the
      * remaining width of the control to ensure the column width setting is strictly applied.
      *
      *
      * If there is only one remaining column with a width larger than the table, then this column gets the maximum
      * width available in the table. If the column width is smaller than the table, then the column width is
      * retained, and the remaining width of the table is occupied by the placeholder column.
      *
      *
      * The placeholder column gets rendered only if there are no columns in the pop-in area.
      *
      *
      * **Note:** Since `sap.m.Table` does not have its own scrollbars, setting `fixedLayout` to false can force
      * the table to overflow, which may cause visual problems. It is suggested to use this property when a table
      * has a few columns in wide screens or within the horizontal scroll container (e.g `sap.m.Dialog`) to handle
      * overflow. In auto layout mode the `width` property of `sap.m.Column` is taken into account as a minimum
      * width.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFixedLayout(): this.type = js.native
    def setFixedLayout(/**
      * New value for property `fixedLayout`
      */
    oFixedLayout: Any): this.type = js.native
    
    /**
      * @SINCE 1.77
      *
      * Sets a new value for property {@link #getHiddenInPopin hiddenInPopin}.
      *
      * Defines which columns should be hidden instead of moved into the pop-in area depending on their importance.
      * See {@link sap.m.Column#getImportance}
      *
      * **Note:** To hide columns based on their importance, it's mandatory to set `demandPopin="true"` for the
      * `sap.m.Column` control or set `autoPopinMode="true"` for the `sap.m.Table` control. See {@link topic:38855e06486f4910bfa6f4485f7c2bac
      * Configuring Responsive Behavior of a Table} and {@link sap.m.Table#getAutoPopinMode}.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHiddenInPopin(
      /**
      * New value for property `hiddenInPopin`
      */
    sHiddenInPopin: js.Array[
          Priority | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Priority * / any */ String)
        ]
    ): this.type = js.native
    
    /**
      * @SINCE 1.52
      *
      * Sets a new value for property {@link #getPopinLayout popinLayout}.
      *
      * Defines the layout in which the table pop-in rows are rendered. **Note:** The `demandPopin` and `minScreenWidth`
      * properties of the `Column` control must be configured appropriately.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Block`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPopinLayout(): this.type = js.native
    def setPopinLayout(
      /**
      * New value for property `popinLayout`
      */
    sPopinLayout: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PopinLayout * / any */ String
    ): this.type = js.native
    def setPopinLayout(/**
      * New value for property `popinLayout`
      */
    sPopinLayout: PopinLayout): this.type = js.native
    
    /**
      * @SINCE 1.22.1
      *
      * Sets a new value for property {@link #getShowOverlay showOverlay}.
      *
      * Setting this property to `true` will show an overlay on top of the table content and prevents the user
      * interaction with it.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowOverlay(): this.type = js.native
    def setShowOverlay(/**
      * New value for property `showOverlay`
      */
    bShowOverlay: Boolean): this.type = js.native
  }
  
  trait TableSettings
    extends StObject
       with ListBaseSettings {
    
    /**
      * @SINCE 1.52
      *
      * Enables alternating table row colors. **Note:** This property can only be used with the Belize and Belize
      * Deep themes. Alternate row coloring is not available for the High Contrast Black/White themes.
      */
    var alternateRowColors: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.76
      *
      * Enables the auto pop-in behavior for the table control.
      *
      * If this property is set to `true`, the table control overwrites the `demandPopin` and the `minScreenWidth`
      * properties of the `sap.m.Column` control. The pop-in behavior depends on the `importance` property of
      * the `sap.m.Column` control. Columns configured with this property are moved to the pop-in area in the
      * following order:
      *
      *
      * 	 - With importance `High`: moved last
      * 	 - With importance `Medium` or `None`: moved second
      * 	 - With importance `Low`: moved first
      *
      * **Note:** If this property is changed from `true` to `false`, the application must reconfigure the `demandPopin`
      * and `minScreenWidth` properties of the `sap.m.Column` control by itself. There is no automatic mechanism
      * that restores the old values if `autoPopinMode` was set from `false` to `true` before.
      */
    var autoPopinMode: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Sets the background style of the table. Depending on the theme, you can change the state of the background
      * from `Solid` to `Translucent` or to `Transparent`.
      */
    var backgroundDesign: js.UndefOr[
        BackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the columns of the table.
      */
    var columns: js.UndefOr[
        js.Array[typingsJapgolly.openui5.sapMColumnMod.default] | typingsJapgolly.openui5.sapMColumnMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.60
      *
      * Defines the contextual width for the `sap.m.Table` control. By defining this property the table adapts
      * the pop-in behavior based on the container in which the table is placed or the configured contextual
      * width. By default, `sap.m.Table` renders in pop-in behavior only depending on the window size or device.
      *
      * For example, by setting the `contextualWidth` property to 600px or Tablet, the table can be placed in
      * a container with 600px width, where the pop-in is used. You can use specific CSS sizes (for example,
      * 600px or 600), you can also use the `sap.m.ScreenSize` enumeration (for example, Phone, Tablet, Desktop,
      * Small, Medium, Large, ....). If this property is set to `Auto`, the `ResizeHandler` will manage the contextual
      * width of the table. **Note:** Only "Inherit", "Auto", and pixel-based CSS sizes (for example, 200, 200px)
      * can be applied to the `contextualWidth` property. Due to the rendering cost, we recommend to use the
      * valid value mentioned before except for "Auto".
      */
    var contextualWidth: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.22
      *
      * Defines the algorithm to be used to layout the table cells, rows, and columns. This property allows three
      * possible values:
      * 	 - `true`
      * 	 - `false`
      * 	 - `Strict`
      *
      * By default, the table is rendered with a fixed layout algorithm (`fixedLayout=true`). This means the
      * horizontal layout only depends on the table's width and the width of the columns, not the content of
      * the cells. Cells in subsequent rows do not affect column width. This allows a browser to provide a faster
      * table layout since the browser can begin to display the table once the first row has been analyzed.
      *
      * If this property is set to `false`, `sap.m.Table` is rendered with an auto layout algorithm. This means,
      * the width of the table and its cells depends on the content of the cells. The column width is set by
      * the widest unbreakable content inside the cells. This can make the rendering slow, since the browser
      * needs to go through all the content in the table before determining the final layout.
      *
      *
      * If this property is set to `Strict` and the `width` property is defined for all columns (and not the
      * expected "auto" value), then the `sap.m.Table` control renders a placeholder column which occupies the
      * remaining width of the control to ensure the column width setting is strictly applied.
      *
      *
      * If there is only one remaining column with a width larger than the table, then this column gets the maximum
      * width available in the table. If the column width is smaller than the table, then the column width is
      * retained, and the remaining width of the table is occupied by the placeholder column.
      *
      *
      * The placeholder column gets rendered only if there are no columns in the pop-in area.
      *
      *
      * **Note:** Since `sap.m.Table` does not have its own scrollbars, setting `fixedLayout` to false can force
      * the table to overflow, which may cause visual problems. It is suggested to use this property when a table
      * has a few columns in wide screens or within the horizontal scroll container (e.g `sap.m.Dialog`) to handle
      * overflow. In auto layout mode the `width` property of `sap.m.Column` is taken into account as a minimum
      * width.
      */
    var fixedLayout: js.UndefOr[Any | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.77
      *
      * Defines which columns should be hidden instead of moved into the pop-in area depending on their importance.
      * See {@link sap.m.Column#getImportance}
      *
      * **Note:** To hide columns based on their importance, it's mandatory to set `demandPopin="true"` for the
      * `sap.m.Column` control or set `autoPopinMode="true"` for the `sap.m.Table` control. See {@link topic:38855e06486f4910bfa6f4485f7c2bac
      * Configuring Responsive Behavior of a Table} and {@link sap.m.Table#getAutoPopinMode}.
      */
    var hiddenInPopin: js.UndefOr[
        (js.Array[
          Priority | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Priority * / any */ String)
        ]) | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.60
      *
      * This event gets fired when the user pastes content from the clipboard to the table. Pasting can be done
      * via the context menu or the standard paste keyboard shortcut, if the focus is inside the table.
      */
    var paste: js.UndefOr[
        js.Function1[/* oEvent */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit]
      ] = js.undefined
    
    /**
      * @SINCE 1.77
      *
      * Fired when the table pop-in has changed.
      */
    var popinChanged: js.UndefOr[
        js.Function1[/* oEvent */ typingsJapgolly.openui5.sapUiBaseEventMod.default, Unit]
      ] = js.undefined
    
    /**
      * @SINCE 1.52
      *
      * Defines the layout in which the table pop-in rows are rendered. **Note:** The `demandPopin` and `minScreenWidth`
      * properties of the `Column` control must be configured appropriately.
      */
    var popinLayout: js.UndefOr[
        PopinLayout | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PopinLayout * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.22.1
      *
      * Setting this property to `true` will show an overlay on top of the table content and prevents the user
      * interaction with it.
      */
    var showOverlay: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object TableSettings {
    
    inline def apply(): TableSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableSettings]
    }
    
    extension [Self <: TableSettings](x: Self) {
      
      inline def setAlternateRowColors(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "alternateRowColors", value.asInstanceOf[js.Any])
      
      inline def setAlternateRowColorsUndefined: Self = StObject.set(x, "alternateRowColors", js.undefined)
      
      inline def setAutoPopinMode(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "autoPopinMode", value.asInstanceOf[js.Any])
      
      inline def setAutoPopinModeUndefined: Self = StObject.set(x, "autoPopinMode", js.undefined)
      
      inline def setBackgroundDesign(
        value: BackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "backgroundDesign", value.asInstanceOf[js.Any])
      
      inline def setBackgroundDesignUndefined: Self = StObject.set(x, "backgroundDesign", js.undefined)
      
      inline def setColumns(
        value: js.Array[typingsJapgolly.openui5.sapMColumnMod.default] | typingsJapgolly.openui5.sapMColumnMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setColumnsVarargs(value: typingsJapgolly.openui5.sapMColumnMod.default*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setContextualWidth(value: String | PropertyBindingInfo): Self = StObject.set(x, "contextualWidth", value.asInstanceOf[js.Any])
      
      inline def setContextualWidthUndefined: Self = StObject.set(x, "contextualWidth", js.undefined)
      
      inline def setFixedLayout(value: Any | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "fixedLayout", value.asInstanceOf[js.Any])
      
      inline def setFixedLayoutUndefined: Self = StObject.set(x, "fixedLayout", js.undefined)
      
      inline def setHiddenInPopin(
        value: (js.Array[
              Priority | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Priority * / any */ String)
            ]) | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "hiddenInPopin", value.asInstanceOf[js.Any])
      
      inline def setHiddenInPopinUndefined: Self = StObject.set(x, "hiddenInPopin", js.undefined)
      
      inline def setHiddenInPopinVarargs(
        value: (Priority | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Priority * / any */ String))*
      ): Self = StObject.set(x, "hiddenInPopin", js.Array(value*))
      
      inline def setPaste(value: /* oEvent */ typingsJapgolly.openui5.sapUiBaseEventMod.default => Callback): Self = StObject.set(x, "paste", js.Any.fromFunction1((t0: /* oEvent */ typingsJapgolly.openui5.sapUiBaseEventMod.default) => value(t0).runNow()))
      
      inline def setPasteUndefined: Self = StObject.set(x, "paste", js.undefined)
      
      inline def setPopinChanged(value: /* oEvent */ typingsJapgolly.openui5.sapUiBaseEventMod.default => Callback): Self = StObject.set(x, "popinChanged", js.Any.fromFunction1((t0: /* oEvent */ typingsJapgolly.openui5.sapUiBaseEventMod.default) => value(t0).runNow()))
      
      inline def setPopinChangedUndefined: Self = StObject.set(x, "popinChanged", js.undefined)
      
      inline def setPopinLayout(
        value: PopinLayout | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PopinLayout * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "popinLayout", value.asInstanceOf[js.Any])
      
      inline def setPopinLayoutUndefined: Self = StObject.set(x, "popinLayout", js.undefined)
      
      inline def setShowOverlay(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showOverlay", value.asInstanceOf[js.Any])
      
      inline def setShowOverlayUndefined: Self = StObject.set(x, "showOverlay", js.undefined)
    }
  }
}
