package typingsJapgolly.openui5

import typingsJapgolly.openui5.sap.ClassInfo
import typingsJapgolly.openui5.sapMSemanticShareMenuPageMod.ShareMenuPageSettings
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMSemanticDetailPageMod {
  
  @JSImport("sap/m/semantic/DetailPage", JSImport.Default)
  @js.native
  /**
    * Constructor for a new DetailPage
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends DetailPage {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: DetailPageSettings) = this()
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
    mSettings: DetailPageSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: DetailPageSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/semantic/DetailPage", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.semantic.DetailPage with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.semantic.ShareMenuPage.extend}.
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
    oClassInfo: ClassInfo[T, DetailPage]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, DetailPage],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.semantic.DetailPage.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typingsJapgolly.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typingsJapgolly.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait DetailPage
    extends typingsJapgolly.openui5.sapMSemanticShareMenuPageMod.default {
    
    /**
      * Destroys the addAction in the aggregation {@link #getAddAction addAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyAddAction(): this.type = js.native
    
    /**
      * Destroys the cancelAction in the aggregation {@link #getCancelAction cancelAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyCancelAction(): this.type = js.native
    
    /**
      * Destroys the deleteAction in the aggregation {@link #getDeleteAction deleteAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyDeleteAction(): this.type = js.native
    
    /**
      * Destroys the discussInJamAction in the aggregation {@link #getDiscussInJamAction discussInJamAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyDiscussInJamAction(): this.type = js.native
    
    /**
      * Destroys the draftIndicator in the aggregation {@link #getDraftIndicator draftIndicator}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyDraftIndicator(): this.type = js.native
    
    /**
      * Destroys the editAction in the aggregation {@link #getEditAction editAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyEditAction(): this.type = js.native
    
    /**
      * Destroys the favoriteAction in the aggregation {@link #getFavoriteAction favoriteAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyFavoriteAction(): this.type = js.native
    
    /**
      * Destroys the flagAction in the aggregation {@link #getFlagAction flagAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyFlagAction(): this.type = js.native
    
    /**
      * Destroys the forwardAction in the aggregation {@link #getForwardAction forwardAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyForwardAction(): this.type = js.native
    
    /**
      * Destroys the mainAction in the aggregation {@link #getMainAction mainAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyMainAction(): this.type = js.native
    
    /**
      * Destroys the messagesIndicator in the aggregation {@link #getMessagesIndicator messagesIndicator}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyMessagesIndicator(): this.type = js.native
    
    /**
      * Destroys the negativeAction in the aggregation {@link #getNegativeAction negativeAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyNegativeAction(): this.type = js.native
    
    /**
      * Destroys the openInAction in the aggregation {@link #getOpenInAction openInAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyOpenInAction(): this.type = js.native
    
    /**
      * Destroys the pagingAction in the aggregation {@link #getPagingAction pagingAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyPagingAction(): this.type = js.native
    
    /**
      * Destroys the positiveAction in the aggregation {@link #getPositiveAction positiveAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyPositiveAction(): this.type = js.native
    
    /**
      * Destroys the printAction in the aggregation {@link #getPrintAction printAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyPrintAction(): this.type = js.native
    
    /**
      * Destroys the saveAction in the aggregation {@link #getSaveAction saveAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySaveAction(): this.type = js.native
    
    /**
      * Destroys the saveAsTileAction in the aggregation {@link #getSaveAsTileAction saveAsTileAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySaveAsTileAction(): this.type = js.native
    
    /**
      * Destroys the sendEmailAction in the aggregation {@link #getSendEmailAction sendEmailAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySendEmailAction(): this.type = js.native
    
    /**
      * Destroys the sendMessageAction in the aggregation {@link #getSendMessageAction sendMessageAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySendMessageAction(): this.type = js.native
    
    /**
      * Destroys the shareInJamAction in the aggregation {@link #getShareInJamAction shareInJamAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyShareInJamAction(): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getAddAction addAction}.
      *
      * Add action
      */
    def getAddAction(): typingsJapgolly.openui5.sapMSemanticAddActionMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getCancelAction cancelAction}.
      *
      * Cancel action
      */
    def getCancelAction(): typingsJapgolly.openui5.sapMSemanticCancelActionMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getDeleteAction deleteAction}.
      *
      * Delete action
      */
    def getDeleteAction(): typingsJapgolly.openui5.sapMSemanticDeleteActionMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getDiscussInJamAction discussInJamAction}.
      *
      * DiscussInJam action
      */
    def getDiscussInJamAction(): typingsJapgolly.openui5.sapMSemanticDiscussInJamActionMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getDraftIndicator draftIndicator}.
      *
      * DraftIndicator
      */
    def getDraftIndicator(): typingsJapgolly.openui5.sapMDraftIndicatorMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getEditAction editAction}.
      *
      * Edit action
      */
    def getEditAction(): typingsJapgolly.openui5.sapMSemanticEditActionMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getFavoriteAction favoriteAction}.
      *
      * Favorite action
      */
    def getFavoriteAction(): typingsJapgolly.openui5.sapMSemanticFavoriteActionMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getFlagAction flagAction}.
      *
      * Flag action
      */
    def getFlagAction(): typingsJapgolly.openui5.sapMSemanticFlagActionMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getForwardAction forwardAction}.
      *
      * Negative action
      */
    def getForwardAction(): typingsJapgolly.openui5.sapMSemanticForwardActionMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getMainAction mainAction}.
      *
      * Main action
      */
    def getMainAction(): typingsJapgolly.openui5.sapMSemanticMainActionMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getMessagesIndicator messagesIndicator}.
      *
      * MessagesIndicator
      */
    def getMessagesIndicator(): typingsJapgolly.openui5.sapMSemanticMessagesIndicatorMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getNegativeAction negativeAction}.
      *
      * Negative action
      */
    def getNegativeAction(): typingsJapgolly.openui5.sapMSemanticNegativeActionMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getOpenInAction openInAction}.
      *
      * OpenIn action
      */
    def getOpenInAction(): typingsJapgolly.openui5.sapMSemanticOpenInActionMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getPagingAction pagingAction}.
      *
      * Paging action
      */
    def getPagingAction(): typingsJapgolly.openui5.sapMPagingButtonMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getPositiveAction positiveAction}.
      *
      * Positive action
      */
    def getPositiveAction(): typingsJapgolly.openui5.sapMSemanticPositiveActionMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getPrintAction printAction}.
      *
      * Print action
      */
    def getPrintAction(): typingsJapgolly.openui5.sapMSemanticPrintActionMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getSaveAction saveAction}.
      *
      * Save action
      */
    def getSaveAction(): typingsJapgolly.openui5.sapMSemanticSaveActionMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getSaveAsTileAction saveAsTileAction}.
      *
      * SaveAsTile button
      */
    def getSaveAsTileAction(): typingsJapgolly.openui5.sapMButtonMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getSendEmailAction sendEmailAction}.
      *
      * SendEmail action
      */
    def getSendEmailAction(): typingsJapgolly.openui5.sapMSemanticSendEmailActionMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getSendMessageAction sendMessageAction}.
      *
      * SendMessage action
      */
    def getSendMessageAction(): typingsJapgolly.openui5.sapMSemanticSendMessageActionMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getShareInJamAction shareInJamAction}.
      *
      * ShareInJam action
      */
    def getShareInJamAction(): typingsJapgolly.openui5.sapMSemanticShareInJamActionMod.default = js.native
    
    /**
      * Sets the aggregated {@link #getAddAction addAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAddAction(
      /**
      * The addAction to set
      */
    oAddAction: typingsJapgolly.openui5.sapMSemanticAddActionMod.default
    ): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getCancelAction cancelAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCancelAction(
      /**
      * The cancelAction to set
      */
    oCancelAction: typingsJapgolly.openui5.sapMSemanticCancelActionMod.default
    ): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getDeleteAction deleteAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDeleteAction(
      /**
      * The deleteAction to set
      */
    oDeleteAction: typingsJapgolly.openui5.sapMSemanticDeleteActionMod.default
    ): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getDiscussInJamAction discussInJamAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDiscussInJamAction(
      /**
      * The discussInJamAction to set
      */
    oDiscussInJamAction: typingsJapgolly.openui5.sapMSemanticDiscussInJamActionMod.default
    ): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getDraftIndicator draftIndicator}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDraftIndicator(
      /**
      * The draftIndicator to set
      */
    oDraftIndicator: typingsJapgolly.openui5.sapMDraftIndicatorMod.default
    ): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getEditAction editAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEditAction(
      /**
      * The editAction to set
      */
    oEditAction: typingsJapgolly.openui5.sapMSemanticEditActionMod.default
    ): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getFavoriteAction favoriteAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFavoriteAction(
      /**
      * The favoriteAction to set
      */
    oFavoriteAction: typingsJapgolly.openui5.sapMSemanticFavoriteActionMod.default
    ): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getFlagAction flagAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFlagAction(
      /**
      * The flagAction to set
      */
    oFlagAction: typingsJapgolly.openui5.sapMSemanticFlagActionMod.default
    ): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getForwardAction forwardAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setForwardAction(
      /**
      * The forwardAction to set
      */
    oForwardAction: typingsJapgolly.openui5.sapMSemanticForwardActionMod.default
    ): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getMainAction mainAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMainAction(
      /**
      * The mainAction to set
      */
    oMainAction: typingsJapgolly.openui5.sapMSemanticMainActionMod.default
    ): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getMessagesIndicator messagesIndicator}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMessagesIndicator(
      /**
      * The messagesIndicator to set
      */
    oMessagesIndicator: typingsJapgolly.openui5.sapMSemanticMessagesIndicatorMod.default
    ): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getNegativeAction negativeAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setNegativeAction(
      /**
      * The negativeAction to set
      */
    oNegativeAction: typingsJapgolly.openui5.sapMSemanticNegativeActionMod.default
    ): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getOpenInAction openInAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setOpenInAction(
      /**
      * The openInAction to set
      */
    oOpenInAction: typingsJapgolly.openui5.sapMSemanticOpenInActionMod.default
    ): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getPagingAction pagingAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPagingAction(
      /**
      * The pagingAction to set
      */
    oPagingAction: typingsJapgolly.openui5.sapMPagingButtonMod.default
    ): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getPositiveAction positiveAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPositiveAction(
      /**
      * The positiveAction to set
      */
    oPositiveAction: typingsJapgolly.openui5.sapMSemanticPositiveActionMod.default
    ): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getPrintAction printAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPrintAction(
      /**
      * The printAction to set
      */
    oPrintAction: typingsJapgolly.openui5.sapMSemanticPrintActionMod.default
    ): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getSaveAction saveAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSaveAction(
      /**
      * The saveAction to set
      */
    oSaveAction: typingsJapgolly.openui5.sapMSemanticSaveActionMod.default
    ): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getSaveAsTileAction saveAsTileAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSaveAsTileAction(
      /**
      * The saveAsTileAction to set
      */
    oSaveAsTileAction: typingsJapgolly.openui5.sapMButtonMod.default
    ): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getSendEmailAction sendEmailAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSendEmailAction(
      /**
      * The sendEmailAction to set
      */
    oSendEmailAction: typingsJapgolly.openui5.sapMSemanticSendEmailActionMod.default
    ): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getSendMessageAction sendMessageAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSendMessageAction(
      /**
      * The sendMessageAction to set
      */
    oSendMessageAction: typingsJapgolly.openui5.sapMSemanticSendMessageActionMod.default
    ): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getShareInJamAction shareInJamAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShareInJamAction(
      /**
      * The shareInJamAction to set
      */
    oShareInJamAction: typingsJapgolly.openui5.sapMSemanticShareInJamActionMod.default
    ): this.type = js.native
  }
  
  trait DetailPageSettings
    extends StObject
       with ShareMenuPageSettings {
    
    /**
      * Add action
      */
    var addAction: js.UndefOr[typingsJapgolly.openui5.sapMSemanticAddActionMod.default] = js.undefined
    
    /**
      * Cancel action
      */
    var cancelAction: js.UndefOr[typingsJapgolly.openui5.sapMSemanticCancelActionMod.default] = js.undefined
    
    /**
      * Delete action
      */
    var deleteAction: js.UndefOr[typingsJapgolly.openui5.sapMSemanticDeleteActionMod.default] = js.undefined
    
    /**
      * DiscussInJam action
      */
    var discussInJamAction: js.UndefOr[typingsJapgolly.openui5.sapMSemanticDiscussInJamActionMod.default] = js.undefined
    
    /**
      * DraftIndicator
      */
    var draftIndicator: js.UndefOr[typingsJapgolly.openui5.sapMDraftIndicatorMod.default] = js.undefined
    
    /**
      * Edit action
      */
    var editAction: js.UndefOr[typingsJapgolly.openui5.sapMSemanticEditActionMod.default] = js.undefined
    
    /**
      * Favorite action
      */
    var favoriteAction: js.UndefOr[typingsJapgolly.openui5.sapMSemanticFavoriteActionMod.default] = js.undefined
    
    /**
      * Flag action
      */
    var flagAction: js.UndefOr[typingsJapgolly.openui5.sapMSemanticFlagActionMod.default] = js.undefined
    
    /**
      * Negative action
      */
    var forwardAction: js.UndefOr[typingsJapgolly.openui5.sapMSemanticForwardActionMod.default] = js.undefined
    
    /**
      * Main action
      */
    var mainAction: js.UndefOr[typingsJapgolly.openui5.sapMSemanticMainActionMod.default] = js.undefined
    
    /**
      * MessagesIndicator
      */
    var messagesIndicator: js.UndefOr[typingsJapgolly.openui5.sapMSemanticMessagesIndicatorMod.default] = js.undefined
    
    /**
      * Negative action
      */
    var negativeAction: js.UndefOr[typingsJapgolly.openui5.sapMSemanticNegativeActionMod.default] = js.undefined
    
    /**
      * OpenIn action
      */
    var openInAction: js.UndefOr[typingsJapgolly.openui5.sapMSemanticOpenInActionMod.default] = js.undefined
    
    /**
      * Paging action
      */
    var pagingAction: js.UndefOr[typingsJapgolly.openui5.sapMPagingButtonMod.default] = js.undefined
    
    /**
      * Positive action
      */
    var positiveAction: js.UndefOr[typingsJapgolly.openui5.sapMSemanticPositiveActionMod.default] = js.undefined
    
    /**
      * Print action
      */
    var printAction: js.UndefOr[typingsJapgolly.openui5.sapMSemanticPrintActionMod.default] = js.undefined
    
    /**
      * Save action
      */
    var saveAction: js.UndefOr[typingsJapgolly.openui5.sapMSemanticSaveActionMod.default] = js.undefined
    
    /**
      * SaveAsTile button
      */
    var saveAsTileAction: js.UndefOr[typingsJapgolly.openui5.sapMButtonMod.default] = js.undefined
    
    /**
      * SendEmail action
      */
    var sendEmailAction: js.UndefOr[typingsJapgolly.openui5.sapMSemanticSendEmailActionMod.default] = js.undefined
    
    /**
      * SendMessage action
      */
    var sendMessageAction: js.UndefOr[typingsJapgolly.openui5.sapMSemanticSendMessageActionMod.default] = js.undefined
    
    /**
      * ShareInJam action
      */
    var shareInJamAction: js.UndefOr[typingsJapgolly.openui5.sapMSemanticShareInJamActionMod.default] = js.undefined
  }
  object DetailPageSettings {
    
    inline def apply(): DetailPageSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DetailPageSettings]
    }
    
    extension [Self <: DetailPageSettings](x: Self) {
      
      inline def setAddAction(value: typingsJapgolly.openui5.sapMSemanticAddActionMod.default): Self = StObject.set(x, "addAction", value.asInstanceOf[js.Any])
      
      inline def setAddActionUndefined: Self = StObject.set(x, "addAction", js.undefined)
      
      inline def setCancelAction(value: typingsJapgolly.openui5.sapMSemanticCancelActionMod.default): Self = StObject.set(x, "cancelAction", value.asInstanceOf[js.Any])
      
      inline def setCancelActionUndefined: Self = StObject.set(x, "cancelAction", js.undefined)
      
      inline def setDeleteAction(value: typingsJapgolly.openui5.sapMSemanticDeleteActionMod.default): Self = StObject.set(x, "deleteAction", value.asInstanceOf[js.Any])
      
      inline def setDeleteActionUndefined: Self = StObject.set(x, "deleteAction", js.undefined)
      
      inline def setDiscussInJamAction(value: typingsJapgolly.openui5.sapMSemanticDiscussInJamActionMod.default): Self = StObject.set(x, "discussInJamAction", value.asInstanceOf[js.Any])
      
      inline def setDiscussInJamActionUndefined: Self = StObject.set(x, "discussInJamAction", js.undefined)
      
      inline def setDraftIndicator(value: typingsJapgolly.openui5.sapMDraftIndicatorMod.default): Self = StObject.set(x, "draftIndicator", value.asInstanceOf[js.Any])
      
      inline def setDraftIndicatorUndefined: Self = StObject.set(x, "draftIndicator", js.undefined)
      
      inline def setEditAction(value: typingsJapgolly.openui5.sapMSemanticEditActionMod.default): Self = StObject.set(x, "editAction", value.asInstanceOf[js.Any])
      
      inline def setEditActionUndefined: Self = StObject.set(x, "editAction", js.undefined)
      
      inline def setFavoriteAction(value: typingsJapgolly.openui5.sapMSemanticFavoriteActionMod.default): Self = StObject.set(x, "favoriteAction", value.asInstanceOf[js.Any])
      
      inline def setFavoriteActionUndefined: Self = StObject.set(x, "favoriteAction", js.undefined)
      
      inline def setFlagAction(value: typingsJapgolly.openui5.sapMSemanticFlagActionMod.default): Self = StObject.set(x, "flagAction", value.asInstanceOf[js.Any])
      
      inline def setFlagActionUndefined: Self = StObject.set(x, "flagAction", js.undefined)
      
      inline def setForwardAction(value: typingsJapgolly.openui5.sapMSemanticForwardActionMod.default): Self = StObject.set(x, "forwardAction", value.asInstanceOf[js.Any])
      
      inline def setForwardActionUndefined: Self = StObject.set(x, "forwardAction", js.undefined)
      
      inline def setMainAction(value: typingsJapgolly.openui5.sapMSemanticMainActionMod.default): Self = StObject.set(x, "mainAction", value.asInstanceOf[js.Any])
      
      inline def setMainActionUndefined: Self = StObject.set(x, "mainAction", js.undefined)
      
      inline def setMessagesIndicator(value: typingsJapgolly.openui5.sapMSemanticMessagesIndicatorMod.default): Self = StObject.set(x, "messagesIndicator", value.asInstanceOf[js.Any])
      
      inline def setMessagesIndicatorUndefined: Self = StObject.set(x, "messagesIndicator", js.undefined)
      
      inline def setNegativeAction(value: typingsJapgolly.openui5.sapMSemanticNegativeActionMod.default): Self = StObject.set(x, "negativeAction", value.asInstanceOf[js.Any])
      
      inline def setNegativeActionUndefined: Self = StObject.set(x, "negativeAction", js.undefined)
      
      inline def setOpenInAction(value: typingsJapgolly.openui5.sapMSemanticOpenInActionMod.default): Self = StObject.set(x, "openInAction", value.asInstanceOf[js.Any])
      
      inline def setOpenInActionUndefined: Self = StObject.set(x, "openInAction", js.undefined)
      
      inline def setPagingAction(value: typingsJapgolly.openui5.sapMPagingButtonMod.default): Self = StObject.set(x, "pagingAction", value.asInstanceOf[js.Any])
      
      inline def setPagingActionUndefined: Self = StObject.set(x, "pagingAction", js.undefined)
      
      inline def setPositiveAction(value: typingsJapgolly.openui5.sapMSemanticPositiveActionMod.default): Self = StObject.set(x, "positiveAction", value.asInstanceOf[js.Any])
      
      inline def setPositiveActionUndefined: Self = StObject.set(x, "positiveAction", js.undefined)
      
      inline def setPrintAction(value: typingsJapgolly.openui5.sapMSemanticPrintActionMod.default): Self = StObject.set(x, "printAction", value.asInstanceOf[js.Any])
      
      inline def setPrintActionUndefined: Self = StObject.set(x, "printAction", js.undefined)
      
      inline def setSaveAction(value: typingsJapgolly.openui5.sapMSemanticSaveActionMod.default): Self = StObject.set(x, "saveAction", value.asInstanceOf[js.Any])
      
      inline def setSaveActionUndefined: Self = StObject.set(x, "saveAction", js.undefined)
      
      inline def setSaveAsTileAction(value: typingsJapgolly.openui5.sapMButtonMod.default): Self = StObject.set(x, "saveAsTileAction", value.asInstanceOf[js.Any])
      
      inline def setSaveAsTileActionUndefined: Self = StObject.set(x, "saveAsTileAction", js.undefined)
      
      inline def setSendEmailAction(value: typingsJapgolly.openui5.sapMSemanticSendEmailActionMod.default): Self = StObject.set(x, "sendEmailAction", value.asInstanceOf[js.Any])
      
      inline def setSendEmailActionUndefined: Self = StObject.set(x, "sendEmailAction", js.undefined)
      
      inline def setSendMessageAction(value: typingsJapgolly.openui5.sapMSemanticSendMessageActionMod.default): Self = StObject.set(x, "sendMessageAction", value.asInstanceOf[js.Any])
      
      inline def setSendMessageActionUndefined: Self = StObject.set(x, "sendMessageAction", js.undefined)
      
      inline def setShareInJamAction(value: typingsJapgolly.openui5.sapMSemanticShareInJamActionMod.default): Self = StObject.set(x, "shareInJamAction", value.asInstanceOf[js.Any])
      
      inline def setShareInJamActionUndefined: Self = StObject.set(x, "shareInJamAction", js.undefined)
    }
  }
}
