package typingsJapgolly.openui5

import typingsJapgolly.openui5.sap.ClassInfo
import typingsJapgolly.openui5.sapMLibraryMod.BarDesign
import typingsJapgolly.openui5.sapMLibraryMod.IBar
import typingsJapgolly.openui5.sapMLibraryMod.IBarHTMLTag
import typingsJapgolly.openui5.sapMLibraryMod.TitleAlignment
import typingsJapgolly.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typingsJapgolly.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typingsJapgolly.openui5.sapUiCoreControlMod.ControlSettings
import typingsJapgolly.openui5.sapUiCoreLibraryMod.ID
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMBarMod {
  
  @JSImport("sap/m/Bar", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `Bar`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Bar {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: BarSettings) = this()
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
    mSettings: BarSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: BarSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_m_IBar: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/Bar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.Bar with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Control.extend}.
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
    oClassInfo: ClassInfo[T, Bar]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Bar],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.Bar.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typingsJapgolly.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typingsJapgolly.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Bar
    extends typingsJapgolly.openui5.sapUiCoreControlMod.default
       with IBar {
    
    /**
      * Sets classes according to the context of the page. Possible contexts are header, footer and subheader.
      *
      * @returns `this` for chaining
      */
    def _applyContextClassFor(): IBar = js.native
    
    /**
      * Sets HTML tag according to the context of the page. Possible contexts are header, footer and subheader.
      *
      * @returns `this` for chaining
      */
    def _applyTag(): IBar = js.native
    
    def addAriaLabelledBy(
      /**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: typingsJapgolly.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * Adds some ariaLabelledBy into the association {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAriaLabelledBy(/**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: ID): this.type = js.native
    
    /**
      * Adds some contentLeft to the aggregation {@link #getContentLeft contentLeft}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addContentLeft(
      /**
      * The contentLeft to add; if empty, nothing is inserted
      */
    oContentLeft: typingsJapgolly.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Adds some contentMiddle to the aggregation {@link #getContentMiddle contentMiddle}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addContentMiddle(
      /**
      * The contentMiddle to add; if empty, nothing is inserted
      */
    oContentMiddle: typingsJapgolly.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Adds some contentRight to the aggregation {@link #getContentRight contentRight}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addContentRight(
      /**
      * The contentRight to add; if empty, nothing is inserted
      */
    oContentRight: typingsJapgolly.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Sets classes and HTML tag according to the context of the page. Possible contexts are header, footer
      * and subheader.
      *
      * @returns `this` for chaining
      */
    def applyTagAndContextClassFor(): IBar = js.native
    
    /**
      * Destroys all the contentLeft in the aggregation {@link #getContentLeft contentLeft}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyContentLeft(): this.type = js.native
    
    /**
      * Destroys all the contentMiddle in the aggregation {@link #getContentMiddle contentMiddle}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyContentMiddle(): this.type = js.native
    
    /**
      * Destroys all the contentRight in the aggregation {@link #getContentRight contentRight}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyContentRight(): this.type = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaLabelledBy
      * ariaLabelledBy}.
      */
    def getAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * Gets content of aggregation {@link #getContentLeft contentLeft}.
      *
      * Represents the left content area, usually containing a button or an app icon. If it is overlapped by
      * the right content, its content will disappear and the text will show an ellipsis.
      */
    def getContentLeft(): js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets content of aggregation {@link #getContentMiddle contentMiddle}.
      *
      * Represents the middle content area. Controls such as label, segmented buttons or select can be placed
      * here. The content is centrally positioned if there is enough space. If the right or left content overlaps
      * the middle content, the middle content will be centered in the space between the left and the right content.
      */
    def getContentMiddle(): js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets content of aggregation {@link #getContentRight contentRight}.
      *
      * Represents the right content area. Controls such as action buttons or search field can be placed here.
      */
    def getContentRight(): js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets the available Bar contexts.
      *
      * @returns with all available contexts
      */
    def getContext(): js.Object = js.native
    
    /**
      * @SINCE 1.22
      *
      * Gets current value of property {@link #getDesign design}.
      *
      * Determines the design of the bar. If set to auto, it becomes dependent on the place where the bar is
      * placed.
      *
      * Default value is `Auto`.
      *
      * @returns Value of property `design`
      */
    def getDesign(): BarDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BarDesign * / any */ String) = js.native
    
    /**
      * @deprecated (since 1.16) - replaced by `contentMiddle` aggregation. `contentMiddle` will always occupy
      * of the 100% width when no `contentLeft` and `contentRight` are being set.
      *
      * Gets current value of property {@link #getEnableFlexBox enableFlexBox}.
      *
      * If this flag is set to true, contentMiddle will be rendered as a HBox and layoutData can be used to allocate
      * available space.
      *
      * Default value is `false`.
      *
      * @returns Value of property `enableFlexBox`
      */
    def getEnableFlexBox(): Boolean = js.native
    
    /**
      * Gets the HTML tag of the root element.
      *
      * @returns The HTML-tag
      */
    def getHTMLTag(): IBarHTMLTag | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof IBarHTMLTag * / any */ String) = js.native
    
    /**
      * @SINCE 1.85
      *
      * Gets current value of property {@link #getTitleAlignment titleAlignment}.
      *
      * Specifies the Title alignment (theme specific). If set to `TitleAlignment.None`, the automatic title
      * alignment depending on the theme settings will be disabled. If set to `TitleAlignment.Auto`, the Title
      * will be aligned as it is set in the theme (if not set, the default value is `center`); Other possible
      * values are `TitleAlignment.Start` (left or right depending on LTR/RTL), and `TitleAlignment.Center` (centered)
      *
      * Default value is `None`.
      *
      * @returns Value of property `titleAlignment`
      */
    def getTitleAlignment(): TitleAlignment | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleAlignment * / any */ String) = js.native
    
    /**
      * @SINCE 1.12
      * @deprecated (since 1.18.6) - This property has no effect since release 1.18.6 and should not be used.
      * Translucent bar may overlay an input and make it difficult to edit.
      *
      * Gets current value of property {@link #getTranslucent translucent}.
      *
      * Indicates whether the Bar is partially translucent. It is only applied for touch devices.
      *
      * Default value is `false`.
      *
      * @returns Value of property `translucent`
      */
    def getTranslucent(): Boolean = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getContentLeft contentLeft}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfContentLeft(
      /**
      * The contentLeft whose index is looked for
      */
    oContentLeft: typingsJapgolly.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getContentMiddle contentMiddle}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfContentMiddle(
      /**
      * The contentMiddle whose index is looked for
      */
    oContentMiddle: typingsJapgolly.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getContentRight contentRight}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfContentRight(
      /**
      * The contentRight whose index is looked for
      */
    oContentRight: typingsJapgolly.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Inserts a contentLeft into the aggregation {@link #getContentLeft contentLeft}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertContentLeft(
      /**
      * The contentLeft to insert; if empty, nothing is inserted
      */
    oContentLeft: typingsJapgolly.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the contentLeft should be inserted at; for a negative value of `iIndex`, the contentLeft
      * is inserted at position 0; for a value greater than the current size of the aggregation, the contentLeft
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a contentMiddle into the aggregation {@link #getContentMiddle contentMiddle}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertContentMiddle(
      /**
      * The contentMiddle to insert; if empty, nothing is inserted
      */
    oContentMiddle: typingsJapgolly.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the contentMiddle should be inserted at; for a negative value of `iIndex`, the contentMiddle
      * is inserted at position 0; for a value greater than the current size of the aggregation, the contentMiddle
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a contentRight into the aggregation {@link #getContentRight contentRight}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertContentRight(
      /**
      * The contentRight to insert; if empty, nothing is inserted
      */
    oContentRight: typingsJapgolly.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the contentRight should be inserted at; for a negative value of `iIndex`, the contentRight
      * is inserted at position 0; for a value greater than the current size of the aggregation, the contentRight
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Determines whether the Bar is sensitive to the container context.
      *
      * Implementation of the IBar interface.
      *
      * @returns isContextSensitive
      */
    def isContextSensitive(): Boolean = js.native
    
    /**
      * Removes all the controls in the association named {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getContentLeft contentLeft}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllContentLeft(): js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getContentMiddle contentMiddle}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllContentMiddle(): js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getContentRight contentRight}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllContentRight(): js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Removes an ariaLabelledBy from the association named {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns The removed ariaLabelledBy or `null`
      */
    def removeAriaLabelledBy(/**
      * The ariaLabelledBy to be removed or its index or ID
      */
    vAriaLabelledBy: int): ID | Null = js.native
    def removeAriaLabelledBy(
      /**
      * The ariaLabelledBy to be removed or its index or ID
      */
    vAriaLabelledBy: typingsJapgolly.openui5.sapUiCoreControlMod.default
    ): ID | Null = js.native
    def removeAriaLabelledBy(/**
      * The ariaLabelledBy to be removed or its index or ID
      */
    vAriaLabelledBy: ID): ID | Null = js.native
    
    def removeContentLeft(/**
      * The contentLeft to remove or its index or id
      */
    vContentLeft: String): typingsJapgolly.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a contentLeft from the aggregation {@link #getContentLeft contentLeft}.
      *
      * @returns The removed contentLeft or `null`
      */
    def removeContentLeft(/**
      * The contentLeft to remove or its index or id
      */
    vContentLeft: int): typingsJapgolly.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeContentLeft(
      /**
      * The contentLeft to remove or its index or id
      */
    vContentLeft: typingsJapgolly.openui5.sapUiCoreControlMod.default
    ): typingsJapgolly.openui5.sapUiCoreControlMod.default | Null = js.native
    
    def removeContentMiddle(/**
      * The contentMiddle to remove or its index or id
      */
    vContentMiddle: String): typingsJapgolly.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a contentMiddle from the aggregation {@link #getContentMiddle contentMiddle}.
      *
      * @returns The removed contentMiddle or `null`
      */
    def removeContentMiddle(/**
      * The contentMiddle to remove or its index or id
      */
    vContentMiddle: int): typingsJapgolly.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeContentMiddle(
      /**
      * The contentMiddle to remove or its index or id
      */
    vContentMiddle: typingsJapgolly.openui5.sapUiCoreControlMod.default
    ): typingsJapgolly.openui5.sapUiCoreControlMod.default | Null = js.native
    
    def removeContentRight(/**
      * The contentRight to remove or its index or id
      */
    vContentRight: String): typingsJapgolly.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a contentRight from the aggregation {@link #getContentRight contentRight}.
      *
      * @returns The removed contentRight or `null`
      */
    def removeContentRight(/**
      * The contentRight to remove or its index or id
      */
    vContentRight: int): typingsJapgolly.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeContentRight(
      /**
      * The contentRight to remove or its index or id
      */
    vContentRight: typingsJapgolly.openui5.sapUiCoreControlMod.default
    ): typingsJapgolly.openui5.sapUiCoreControlMod.default | Null = js.native
    
    /**
      * @SINCE 1.22
      *
      * Sets a new value for property {@link #getDesign design}.
      *
      * Determines the design of the bar. If set to auto, it becomes dependent on the place where the bar is
      * placed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Auto`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDesign(): this.type = js.native
    def setDesign(
      /**
      * New value for property `design`
      */
    sDesign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BarDesign * / any */ String
    ): this.type = js.native
    def setDesign(/**
      * New value for property `design`
      */
    sDesign: BarDesign): this.type = js.native
    
    /**
      * @deprecated (since 1.16) - replaced by `contentMiddle` aggregation. `contentMiddle` will always occupy
      * of the 100% width when no `contentLeft` and `contentRight` are being set.
      *
      * Sets a new value for property {@link #getEnableFlexBox enableFlexBox}.
      *
      * If this flag is set to true, contentMiddle will be rendered as a HBox and layoutData can be used to allocate
      * available space.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnableFlexBox(): this.type = js.native
    def setEnableFlexBox(/**
      * New value for property `enableFlexBox`
      */
    bEnableFlexBox: Boolean): this.type = js.native
    
    def setHTMLTag(
      /**
      * The HTML tag of the root element
      */
    sTag: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof IBarHTMLTag * / any */ String
    ): IBar = js.native
    /**
      * Sets the HTML tag of the root element.
      *
      * @returns this for chaining
      */
    def setHTMLTag(/**
      * The HTML tag of the root element
      */
    sTag: IBarHTMLTag): IBar = js.native
    
    /**
      * @SINCE 1.85
      *
      * Sets a new value for property {@link #getTitleAlignment titleAlignment}.
      *
      * Specifies the Title alignment (theme specific). If set to `TitleAlignment.None`, the automatic title
      * alignment depending on the theme settings will be disabled. If set to `TitleAlignment.Auto`, the Title
      * will be aligned as it is set in the theme (if not set, the default value is `center`); Other possible
      * values are `TitleAlignment.Start` (left or right depending on LTR/RTL), and `TitleAlignment.Center` (centered)
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `None`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitleAlignment(): this.type = js.native
    def setTitleAlignment(
      /**
      * New value for property `titleAlignment`
      */
    sTitleAlignment: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleAlignment * / any */ String
    ): this.type = js.native
    def setTitleAlignment(/**
      * New value for property `titleAlignment`
      */
    sTitleAlignment: TitleAlignment): this.type = js.native
    
    /**
      * @SINCE 1.12
      * @deprecated (since 1.18.6) - This property has no effect since release 1.18.6 and should not be used.
      * Translucent bar may overlay an input and make it difficult to edit.
      *
      * Sets a new value for property {@link #getTranslucent translucent}.
      *
      * Indicates whether the Bar is partially translucent. It is only applied for touch devices.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTranslucent(): this.type = js.native
    def setTranslucent(/**
      * New value for property `translucent`
      */
    bTranslucent: Boolean): this.type = js.native
  }
  
  trait BarSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Association to controls / ids which label this control (see WAI-ARIA attribute aria-labelledby).
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * Represents the left content area, usually containing a button or an app icon. If it is overlapped by
      * the right content, its content will disappear and the text will show an ellipsis.
      */
    var contentLeft: js.UndefOr[
        js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] | typingsJapgolly.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Represents the middle content area. Controls such as label, segmented buttons or select can be placed
      * here. The content is centrally positioned if there is enough space. If the right or left content overlaps
      * the middle content, the middle content will be centered in the space between the left and the right content.
      */
    var contentMiddle: js.UndefOr[
        js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] | typingsJapgolly.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Represents the right content area. Controls such as action buttons or search field can be placed here.
      */
    var contentRight: js.UndefOr[
        js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] | typingsJapgolly.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.22
      *
      * Determines the design of the bar. If set to auto, it becomes dependent on the place where the bar is
      * placed.
      */
    var design: js.UndefOr[
        BarDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BarDesign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @deprecated (since 1.16) - replaced by `contentMiddle` aggregation. `contentMiddle` will always occupy
      * of the 100% width when no `contentLeft` and `contentRight` are being set.
      *
      * If this flag is set to true, contentMiddle will be rendered as a HBox and layoutData can be used to allocate
      * available space.
      */
    var enableFlexBox: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.85
      *
      * Specifies the Title alignment (theme specific). If set to `TitleAlignment.None`, the automatic title
      * alignment depending on the theme settings will be disabled. If set to `TitleAlignment.Auto`, the Title
      * will be aligned as it is set in the theme (if not set, the default value is `center`); Other possible
      * values are `TitleAlignment.Start` (left or right depending on LTR/RTL), and `TitleAlignment.Center` (centered)
      */
    var titleAlignment: js.UndefOr[
        TitleAlignment | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleAlignment * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.12
      * @deprecated (since 1.18.6) - This property has no effect since release 1.18.6 and should not be used.
      * Translucent bar may overlay an input and make it difficult to edit.
      *
      * Indicates whether the Bar is partially translucent. It is only applied for touch devices.
      */
    var translucent: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object BarSettings {
    
    inline def apply(): BarSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BarSettings]
    }
    
    extension [Self <: BarSettings](x: Self) {
      
      inline def setAriaLabelledBy(value: js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typingsJapgolly.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setContentLeft(
        value: js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] | typingsJapgolly.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "contentLeft", value.asInstanceOf[js.Any])
      
      inline def setContentLeftUndefined: Self = StObject.set(x, "contentLeft", js.undefined)
      
      inline def setContentLeftVarargs(value: typingsJapgolly.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "contentLeft", js.Array(value*))
      
      inline def setContentMiddle(
        value: js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] | typingsJapgolly.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "contentMiddle", value.asInstanceOf[js.Any])
      
      inline def setContentMiddleUndefined: Self = StObject.set(x, "contentMiddle", js.undefined)
      
      inline def setContentMiddleVarargs(value: typingsJapgolly.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "contentMiddle", js.Array(value*))
      
      inline def setContentRight(
        value: js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default] | typingsJapgolly.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "contentRight", value.asInstanceOf[js.Any])
      
      inline def setContentRightUndefined: Self = StObject.set(x, "contentRight", js.undefined)
      
      inline def setContentRightVarargs(value: typingsJapgolly.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "contentRight", js.Array(value*))
      
      inline def setDesign(
        value: BarDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BarDesign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "design", value.asInstanceOf[js.Any])
      
      inline def setDesignUndefined: Self = StObject.set(x, "design", js.undefined)
      
      inline def setEnableFlexBox(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableFlexBox", value.asInstanceOf[js.Any])
      
      inline def setEnableFlexBoxUndefined: Self = StObject.set(x, "enableFlexBox", js.undefined)
      
      inline def setTitleAlignment(
        value: TitleAlignment | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleAlignment * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "titleAlignment", value.asInstanceOf[js.Any])
      
      inline def setTitleAlignmentUndefined: Self = StObject.set(x, "titleAlignment", js.undefined)
      
      inline def setTranslucent(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "translucent", value.asInstanceOf[js.Any])
      
      inline def setTranslucentUndefined: Self = StObject.set(x, "translucent", js.undefined)
    }
  }
}
