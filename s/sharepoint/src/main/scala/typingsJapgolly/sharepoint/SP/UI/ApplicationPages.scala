package typingsJapgolly.sharepoint.SP.UI

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.microsoftAjax.Sys.Component
import typingsJapgolly.microsoftAjax.Sys.EventArgs
import typingsJapgolly.sharepoint.SP.ClientValueObject
import typingsJapgolly.sharepoint.SP.Guid
import typingsJapgolly.sharepoint.SP.SerializationContext
import typingsJapgolly.sharepoint.SP.UrlZone
import typingsJapgolly.sharepoint.SP.Utilities.PrincipalSource
import typingsJapgolly.sharepoint.SP.Utilities.PrincipalType
import typingsJapgolly.sharepoint.SP.Web
import typingsJapgolly.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ApplicationPages {
  
  @js.native
  sealed trait CalendarScope extends StObject
  @JSGlobal("SP.UI.ApplicationPages.CalendarScope")
  @js.native
  object CalendarScope extends StObject {
    
    @js.native
    sealed trait daily
      extends StObject
         with CalendarScope
    
    @js.native
    sealed trait dailyGroup
      extends StObject
         with CalendarScope
    
    @js.native
    sealed trait monthly
      extends StObject
         with CalendarScope
    
    @js.native
    sealed trait nothing
      extends StObject
         with CalendarScope
    
    @js.native
    sealed trait weekly
      extends StObject
         with CalendarScope
    
    @js.native
    sealed trait weeklyGroup
      extends StObject
         with CalendarScope
  }
  
  @js.native
  sealed trait SelectorType extends StObject
  @JSGlobal("SP.UI.ApplicationPages.SelectorType")
  @js.native
  object SelectorType extends StObject {
    
    @js.native
    sealed trait event
      extends StObject
         with SelectorType
    
    @js.native
    sealed trait none
      extends StObject
         with SelectorType
    
    @js.native
    sealed trait people
      extends StObject
         with SelectorType
    
    @js.native
    sealed trait people_And_Resource
      extends StObject
         with SelectorType
    
    @js.native
    sealed trait resource
      extends StObject
         with SelectorType
  }
  
  trait BaseSelectorComponent
    extends StObject
       with ISelectorComponent
  object BaseSelectorComponent {
    
    inline def apply(
      get_callback: CallbackTo[js.Function2[/* sender */ Any, /* e */ EventArgs, Unit]],
      get_componentType: CallbackTo[SelectorType],
      get_scopeKey: CallbackTo[String],
      get_selectedEntities: CallbackTo[Any],
      removeEntity: ResolveEntity => Callback,
      revertTo: ResolveEntity => Callback,
      setEntity: ResolveEntity => Callback,
      set_callback: js.Function2[/* sender */ Any, /* e */ EventArgs, Unit] => Callback,
      set_selectedEntities: Any => Callback
    ): BaseSelectorComponent = {
      val __obj = js.Dynamic.literal(get_callback = get_callback.toJsFn, get_componentType = get_componentType.toJsFn, get_scopeKey = get_scopeKey.toJsFn, get_selectedEntities = get_selectedEntities.toJsFn, removeEntity = js.Any.fromFunction1((t0: ResolveEntity) => removeEntity(t0).runNow()), revertTo = js.Any.fromFunction1((t0: ResolveEntity) => revertTo(t0).runNow()), setEntity = js.Any.fromFunction1((t0: ResolveEntity) => setEntity(t0).runNow()), set_callback = js.Any.fromFunction1((t0: js.Function2[/* sender */ Any, /* e */ EventArgs, Unit]) => set_callback(t0).runNow()), set_selectedEntities = js.Any.fromFunction1((t0: Any) => set_selectedEntities(t0).runNow()))
      __obj.asInstanceOf[BaseSelectorComponent]
    }
  }
  
  trait CalendarInstanceRepository extends StObject
  
  trait CalendarSelector
    extends StObject
       with Component {
    
    def addHandler(
      scopeKey: String,
      people: Boolean,
      resource: Boolean,
      handler: js.Function2[/* sender */ Any, /* selection */ SelectorSelectionEventArgs, Unit]
    ): Unit
    
    def getSelector(`type`: SelectorType, scopeKey: String): ISelectorComponent
    
    def registerSelector(selector: ISelectorComponent): Unit
    
    def removeEntity(scopeKey: String, ent: ResolveEntity): Unit
    
    def revertTo(scopeKey: String, ent: ResolveEntity): Unit
  }
  object CalendarSelector {
    
    inline def apply(
      addHandler: (String, Boolean, Boolean, js.Function2[/* sender */ Any, /* selection */ SelectorSelectionEventArgs, Unit]) => Callback,
      add_disposing: js.Function => Callback,
      add_propertyChanged: js.Function => Callback,
      beginUpdate: Callback,
      dispose: Callback,
      endUpdate: Callback,
      getSelector: (SelectorType, String) => ISelectorComponent,
      get_events: CallbackTo[Any],
      get_id: CallbackTo[String],
      get_isInitialized: CallbackTo[Boolean],
      get_isUpdating: CallbackTo[Boolean],
      initialize: Callback,
      raisePropertyChanged: String => Callback,
      registerSelector: ISelectorComponent => Callback,
      removeEntity: (String, ResolveEntity) => Callback,
      remove_disposing: js.Function => Callback,
      remove_propertyChanged: js.Function => Callback,
      revertTo: (String, ResolveEntity) => Callback,
      set_id: String => Callback,
      updated: Callback
    ): CalendarSelector = {
      val __obj = js.Dynamic.literal(addHandler = js.Any.fromFunction4((t0: String, t1: Boolean, t2: Boolean, t3: js.Function2[/* sender */ Any, /* selection */ SelectorSelectionEventArgs, Unit]) => (addHandler(t0, t1, t2, t3)).runNow()), add_disposing = js.Any.fromFunction1((t0: js.Function) => add_disposing(t0).runNow()), add_propertyChanged = js.Any.fromFunction1((t0: js.Function) => add_propertyChanged(t0).runNow()), beginUpdate = beginUpdate.toJsFn, dispose = dispose.toJsFn, endUpdate = endUpdate.toJsFn, getSelector = js.Any.fromFunction2(getSelector), get_events = get_events.toJsFn, get_id = get_id.toJsFn, get_isInitialized = get_isInitialized.toJsFn, get_isUpdating = get_isUpdating.toJsFn, initialize = initialize.toJsFn, raisePropertyChanged = js.Any.fromFunction1((t0: String) => raisePropertyChanged(t0).runNow()), registerSelector = js.Any.fromFunction1((t0: ISelectorComponent) => registerSelector(t0).runNow()), removeEntity = js.Any.fromFunction2((t0: String, t1: ResolveEntity) => (removeEntity(t0, t1)).runNow()), remove_disposing = js.Any.fromFunction1((t0: js.Function) => remove_disposing(t0).runNow()), remove_propertyChanged = js.Any.fromFunction1((t0: js.Function) => remove_propertyChanged(t0).runNow()), revertTo = js.Any.fromFunction2((t0: String, t1: ResolveEntity) => (revertTo(t0, t1)).runNow()), set_id = js.Any.fromFunction1((t0: String) => set_id(t0).runNow()), updated = updated.toJsFn)
      __obj.asInstanceOf[CalendarSelector]
    }
    
    extension [Self <: CalendarSelector](x: Self) {
      
      inline def setAddHandler(
        value: (String, Boolean, Boolean, js.Function2[/* sender */ Any, /* selection */ SelectorSelectionEventArgs, Unit]) => Callback
      ): Self = StObject.set(x, "addHandler", js.Any.fromFunction4((t0: String, t1: Boolean, t2: Boolean, t3: js.Function2[/* sender */ Any, /* selection */ SelectorSelectionEventArgs, Unit]) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setGetSelector(value: (SelectorType, String) => ISelectorComponent): Self = StObject.set(x, "getSelector", js.Any.fromFunction2(value))
      
      inline def setRegisterSelector(value: ISelectorComponent => Callback): Self = StObject.set(x, "registerSelector", js.Any.fromFunction1((t0: ISelectorComponent) => value(t0).runNow()))
      
      inline def setRemoveEntity(value: (String, ResolveEntity) => Callback): Self = StObject.set(x, "removeEntity", js.Any.fromFunction2((t0: String, t1: ResolveEntity) => (value(t0, t1)).runNow()))
      
      inline def setRevertTo(value: (String, ResolveEntity) => Callback): Self = StObject.set(x, "revertTo", js.Any.fromFunction2((t0: String, t1: ResolveEntity) => (value(t0, t1)).runNow()))
    }
  }
  
  trait ClientPeoplePickerQueryParameters
    extends StObject
       with ClientValueObject {
    
    def get_allUrlZones(): Boolean
    
    def get_allowEmailAddresses(): Boolean
    
    def get_allowMultipleEntities(): Boolean
    
    def get_enabledClaimProviders(): String
    
    def get_forceClaims(): Boolean
    
    def get_maximumEntitySuggestions(): Double
    
    def get_principalSource(): PrincipalSource
    
    def get_principalType(): PrincipalType
    
    def get_queryString(): String
    
    def get_required(): Boolean
    
    def get_sharePointGroupID(): Double
    
    def get_urlZone(): UrlZone
    
    def get_urlZoneSpecified(): Boolean
    
    def get_web(): Web
    
    def get_webApplicationID(): Guid
    
    def set_allUrlZones(value: Boolean): Unit
    
    def set_allowEmailAddresses(value: Boolean): Unit
    
    def set_allowMultipleEntities(value: Boolean): Unit
    
    def set_enabledClaimProviders(value: String): Unit
    
    def set_forceClaims(value: Boolean): Unit
    
    def set_maximumEntitySuggestions(value: Double): Unit
    
    def set_principalSource(value: PrincipalSource): Unit
    
    def set_principalType(value: PrincipalType): Unit
    
    def set_queryString(value: String): Unit
    
    def set_required(value: Boolean): Unit
    
    def set_sharePointGroupID(value: Double): Unit
    
    def set_urlZone(value: UrlZone): Unit
    
    def set_urlZoneSpecified(value: Boolean): Unit
    
    def set_web(value: Web): Unit
    
    def set_webApplicationID(value: Guid): Unit
  }
  object ClientPeoplePickerQueryParameters {
    
    inline def apply(
      customFromJson: Any => Boolean,
      customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
      fromJson: Any => Callback,
      get_allUrlZones: CallbackTo[Boolean],
      get_allowEmailAddresses: CallbackTo[Boolean],
      get_allowMultipleEntities: CallbackTo[Boolean],
      get_enabledClaimProviders: CallbackTo[String],
      get_forceClaims: CallbackTo[Boolean],
      get_maximumEntitySuggestions: CallbackTo[Double],
      get_principalSource: CallbackTo[PrincipalSource],
      get_principalType: CallbackTo[PrincipalType],
      get_queryString: CallbackTo[String],
      get_required: CallbackTo[Boolean],
      get_sharePointGroupID: CallbackTo[Double],
      get_typeId: CallbackTo[String],
      get_urlZone: CallbackTo[UrlZone],
      get_urlZoneSpecified: CallbackTo[Boolean],
      get_web: CallbackTo[Web],
      get_webApplicationID: CallbackTo[Guid],
      set_allUrlZones: Boolean => Callback,
      set_allowEmailAddresses: Boolean => Callback,
      set_allowMultipleEntities: Boolean => Callback,
      set_enabledClaimProviders: String => Callback,
      set_forceClaims: Boolean => Callback,
      set_maximumEntitySuggestions: Double => Callback,
      set_principalSource: PrincipalSource => Callback,
      set_principalType: PrincipalType => Callback,
      set_queryString: String => Callback,
      set_required: Boolean => Callback,
      set_sharePointGroupID: Double => Callback,
      set_urlZone: UrlZone => Callback,
      set_urlZoneSpecified: Boolean => Callback,
      set_web: Web => Callback,
      set_webApplicationID: Guid => Callback,
      writeToXml: (XmlWriter, SerializationContext) => Callback
    ): ClientPeoplePickerQueryParameters = {
      val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_allUrlZones = get_allUrlZones.toJsFn, get_allowEmailAddresses = get_allowEmailAddresses.toJsFn, get_allowMultipleEntities = get_allowMultipleEntities.toJsFn, get_enabledClaimProviders = get_enabledClaimProviders.toJsFn, get_forceClaims = get_forceClaims.toJsFn, get_maximumEntitySuggestions = get_maximumEntitySuggestions.toJsFn, get_principalSource = get_principalSource.toJsFn, get_principalType = get_principalType.toJsFn, get_queryString = get_queryString.toJsFn, get_required = get_required.toJsFn, get_sharePointGroupID = get_sharePointGroupID.toJsFn, get_typeId = get_typeId.toJsFn, get_urlZone = get_urlZone.toJsFn, get_urlZoneSpecified = get_urlZoneSpecified.toJsFn, get_web = get_web.toJsFn, get_webApplicationID = get_webApplicationID.toJsFn, set_allUrlZones = js.Any.fromFunction1((t0: Boolean) => set_allUrlZones(t0).runNow()), set_allowEmailAddresses = js.Any.fromFunction1((t0: Boolean) => set_allowEmailAddresses(t0).runNow()), set_allowMultipleEntities = js.Any.fromFunction1((t0: Boolean) => set_allowMultipleEntities(t0).runNow()), set_enabledClaimProviders = js.Any.fromFunction1((t0: String) => set_enabledClaimProviders(t0).runNow()), set_forceClaims = js.Any.fromFunction1((t0: Boolean) => set_forceClaims(t0).runNow()), set_maximumEntitySuggestions = js.Any.fromFunction1((t0: Double) => set_maximumEntitySuggestions(t0).runNow()), set_principalSource = js.Any.fromFunction1((t0: PrincipalSource) => set_principalSource(t0).runNow()), set_principalType = js.Any.fromFunction1((t0: PrincipalType) => set_principalType(t0).runNow()), set_queryString = js.Any.fromFunction1((t0: String) => set_queryString(t0).runNow()), set_required = js.Any.fromFunction1((t0: Boolean) => set_required(t0).runNow()), set_sharePointGroupID = js.Any.fromFunction1((t0: Double) => set_sharePointGroupID(t0).runNow()), set_urlZone = js.Any.fromFunction1((t0: UrlZone) => set_urlZone(t0).runNow()), set_urlZoneSpecified = js.Any.fromFunction1((t0: Boolean) => set_urlZoneSpecified(t0).runNow()), set_web = js.Any.fromFunction1((t0: Web) => set_web(t0).runNow()), set_webApplicationID = js.Any.fromFunction1((t0: Guid) => set_webApplicationID(t0).runNow()), writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
      __obj.asInstanceOf[ClientPeoplePickerQueryParameters]
    }
    
    extension [Self <: ClientPeoplePickerQueryParameters](x: Self) {
      
      inline def setGet_allUrlZones(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_allUrlZones", value.toJsFn)
      
      inline def setGet_allowEmailAddresses(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_allowEmailAddresses", value.toJsFn)
      
      inline def setGet_allowMultipleEntities(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_allowMultipleEntities", value.toJsFn)
      
      inline def setGet_enabledClaimProviders(value: CallbackTo[String]): Self = StObject.set(x, "get_enabledClaimProviders", value.toJsFn)
      
      inline def setGet_forceClaims(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_forceClaims", value.toJsFn)
      
      inline def setGet_maximumEntitySuggestions(value: CallbackTo[Double]): Self = StObject.set(x, "get_maximumEntitySuggestions", value.toJsFn)
      
      inline def setGet_principalSource(value: CallbackTo[PrincipalSource]): Self = StObject.set(x, "get_principalSource", value.toJsFn)
      
      inline def setGet_principalType(value: CallbackTo[PrincipalType]): Self = StObject.set(x, "get_principalType", value.toJsFn)
      
      inline def setGet_queryString(value: CallbackTo[String]): Self = StObject.set(x, "get_queryString", value.toJsFn)
      
      inline def setGet_required(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_required", value.toJsFn)
      
      inline def setGet_sharePointGroupID(value: CallbackTo[Double]): Self = StObject.set(x, "get_sharePointGroupID", value.toJsFn)
      
      inline def setGet_urlZone(value: CallbackTo[UrlZone]): Self = StObject.set(x, "get_urlZone", value.toJsFn)
      
      inline def setGet_urlZoneSpecified(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_urlZoneSpecified", value.toJsFn)
      
      inline def setGet_web(value: CallbackTo[Web]): Self = StObject.set(x, "get_web", value.toJsFn)
      
      inline def setGet_webApplicationID(value: CallbackTo[Guid]): Self = StObject.set(x, "get_webApplicationID", value.toJsFn)
      
      inline def setSet_allUrlZones(value: Boolean => Callback): Self = StObject.set(x, "set_allUrlZones", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setSet_allowEmailAddresses(value: Boolean => Callback): Self = StObject.set(x, "set_allowEmailAddresses", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setSet_allowMultipleEntities(value: Boolean => Callback): Self = StObject.set(x, "set_allowMultipleEntities", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setSet_enabledClaimProviders(value: String => Callback): Self = StObject.set(x, "set_enabledClaimProviders", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSet_forceClaims(value: Boolean => Callback): Self = StObject.set(x, "set_forceClaims", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setSet_maximumEntitySuggestions(value: Double => Callback): Self = StObject.set(x, "set_maximumEntitySuggestions", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setSet_principalSource(value: PrincipalSource => Callback): Self = StObject.set(x, "set_principalSource", js.Any.fromFunction1((t0: PrincipalSource) => value(t0).runNow()))
      
      inline def setSet_principalType(value: PrincipalType => Callback): Self = StObject.set(x, "set_principalType", js.Any.fromFunction1((t0: PrincipalType) => value(t0).runNow()))
      
      inline def setSet_queryString(value: String => Callback): Self = StObject.set(x, "set_queryString", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSet_required(value: Boolean => Callback): Self = StObject.set(x, "set_required", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setSet_sharePointGroupID(value: Double => Callback): Self = StObject.set(x, "set_sharePointGroupID", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setSet_urlZone(value: UrlZone => Callback): Self = StObject.set(x, "set_urlZone", js.Any.fromFunction1((t0: UrlZone) => value(t0).runNow()))
      
      inline def setSet_urlZoneSpecified(value: Boolean => Callback): Self = StObject.set(x, "set_urlZoneSpecified", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setSet_web(value: Web => Callback): Self = StObject.set(x, "set_web", js.Any.fromFunction1((t0: Web) => value(t0).runNow()))
      
      inline def setSet_webApplicationID(value: Guid => Callback): Self = StObject.set(x, "set_webApplicationID", js.Any.fromFunction1((t0: Guid) => value(t0).runNow()))
    }
  }
  
  trait ClientPeoplePickerWebServiceInterface extends StObject
  
  trait ICalendarController extends StObject {
    
    def collapseAll(): Unit
    
    def deleteItem(itemId: String): Unit
    
    def expandAll(): Unit
    
    def getActiveScope(): CalendarScope
    
    def moveToDate(date: String): Unit
    
    def moveToView(scope: CalendarScope): Unit
    
    def moveToViewDate(scope: CalendarScope, date: String): Unit
    
    def moveToViewType(viewType: String): Unit
    
    def newItemDialog(contentTypeId: String): Unit
    
    def refreshItems(): Unit
  }
  object ICalendarController {
    
    inline def apply(
      collapseAll: Callback,
      deleteItem: String => Callback,
      expandAll: Callback,
      getActiveScope: CallbackTo[CalendarScope],
      moveToDate: String => Callback,
      moveToView: CalendarScope => Callback,
      moveToViewDate: (CalendarScope, String) => Callback,
      moveToViewType: String => Callback,
      newItemDialog: String => Callback,
      refreshItems: Callback
    ): ICalendarController = {
      val __obj = js.Dynamic.literal(collapseAll = collapseAll.toJsFn, deleteItem = js.Any.fromFunction1((t0: String) => deleteItem(t0).runNow()), expandAll = expandAll.toJsFn, getActiveScope = getActiveScope.toJsFn, moveToDate = js.Any.fromFunction1((t0: String) => moveToDate(t0).runNow()), moveToView = js.Any.fromFunction1((t0: CalendarScope) => moveToView(t0).runNow()), moveToViewDate = js.Any.fromFunction2((t0: CalendarScope, t1: String) => (moveToViewDate(t0, t1)).runNow()), moveToViewType = js.Any.fromFunction1((t0: String) => moveToViewType(t0).runNow()), newItemDialog = js.Any.fromFunction1((t0: String) => newItemDialog(t0).runNow()), refreshItems = refreshItems.toJsFn)
      __obj.asInstanceOf[ICalendarController]
    }
    
    extension [Self <: ICalendarController](x: Self) {
      
      inline def setCollapseAll(value: Callback): Self = StObject.set(x, "collapseAll", value.toJsFn)
      
      inline def setDeleteItem(value: String => Callback): Self = StObject.set(x, "deleteItem", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setExpandAll(value: Callback): Self = StObject.set(x, "expandAll", value.toJsFn)
      
      inline def setGetActiveScope(value: CallbackTo[CalendarScope]): Self = StObject.set(x, "getActiveScope", value.toJsFn)
      
      inline def setMoveToDate(value: String => Callback): Self = StObject.set(x, "moveToDate", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setMoveToView(value: CalendarScope => Callback): Self = StObject.set(x, "moveToView", js.Any.fromFunction1((t0: CalendarScope) => value(t0).runNow()))
      
      inline def setMoveToViewDate(value: (CalendarScope, String) => Callback): Self = StObject.set(x, "moveToViewDate", js.Any.fromFunction2((t0: CalendarScope, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setMoveToViewType(value: String => Callback): Self = StObject.set(x, "moveToViewType", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setNewItemDialog(value: String => Callback): Self = StObject.set(x, "newItemDialog", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setRefreshItems(value: Callback): Self = StObject.set(x, "refreshItems", value.toJsFn)
    }
  }
  
  trait ISelectorComponent extends StObject {
    
    def get_callback(): js.Function2[/* sender */ Any, /* e */ EventArgs, Unit]
    
    def get_componentType(): SelectorType
    
    def get_scopeKey(): String
    
    def get_selectedEntities(): Any
    
    def removeEntity(ent: ResolveEntity): Unit
    
    def revertTo(ent: ResolveEntity): Unit
    
    def setEntity(ent: ResolveEntity): Unit
    
    def set_callback(value: js.Function2[/* sender */ Any, /* e */ EventArgs, Unit]): Unit
    
    def set_selectedEntities(value: Any): Unit
  }
  object ISelectorComponent {
    
    inline def apply(
      get_callback: CallbackTo[js.Function2[/* sender */ Any, /* e */ EventArgs, Unit]],
      get_componentType: CallbackTo[SelectorType],
      get_scopeKey: CallbackTo[String],
      get_selectedEntities: CallbackTo[Any],
      removeEntity: ResolveEntity => Callback,
      revertTo: ResolveEntity => Callback,
      setEntity: ResolveEntity => Callback,
      set_callback: js.Function2[/* sender */ Any, /* e */ EventArgs, Unit] => Callback,
      set_selectedEntities: Any => Callback
    ): ISelectorComponent = {
      val __obj = js.Dynamic.literal(get_callback = get_callback.toJsFn, get_componentType = get_componentType.toJsFn, get_scopeKey = get_scopeKey.toJsFn, get_selectedEntities = get_selectedEntities.toJsFn, removeEntity = js.Any.fromFunction1((t0: ResolveEntity) => removeEntity(t0).runNow()), revertTo = js.Any.fromFunction1((t0: ResolveEntity) => revertTo(t0).runNow()), setEntity = js.Any.fromFunction1((t0: ResolveEntity) => setEntity(t0).runNow()), set_callback = js.Any.fromFunction1((t0: js.Function2[/* sender */ Any, /* e */ EventArgs, Unit]) => set_callback(t0).runNow()), set_selectedEntities = js.Any.fromFunction1((t0: Any) => set_selectedEntities(t0).runNow()))
      __obj.asInstanceOf[ISelectorComponent]
    }
    
    extension [Self <: ISelectorComponent](x: Self) {
      
      inline def setGet_callback(value: CallbackTo[js.Function2[/* sender */ Any, /* e */ EventArgs, Unit]]): Self = StObject.set(x, "get_callback", value.toJsFn)
      
      inline def setGet_componentType(value: CallbackTo[SelectorType]): Self = StObject.set(x, "get_componentType", value.toJsFn)
      
      inline def setGet_scopeKey(value: CallbackTo[String]): Self = StObject.set(x, "get_scopeKey", value.toJsFn)
      
      inline def setGet_selectedEntities(value: CallbackTo[Any]): Self = StObject.set(x, "get_selectedEntities", value.toJsFn)
      
      inline def setRemoveEntity(value: ResolveEntity => Callback): Self = StObject.set(x, "removeEntity", js.Any.fromFunction1((t0: ResolveEntity) => value(t0).runNow()))
      
      inline def setRevertTo(value: ResolveEntity => Callback): Self = StObject.set(x, "revertTo", js.Any.fromFunction1((t0: ResolveEntity) => value(t0).runNow()))
      
      inline def setSetEntity(value: ResolveEntity => Callback): Self = StObject.set(x, "setEntity", js.Any.fromFunction1((t0: ResolveEntity) => value(t0).runNow()))
      
      inline def setSet_callback(value: js.Function2[/* sender */ Any, /* e */ EventArgs, Unit] => Callback): Self = StObject.set(x, "set_callback", js.Any.fromFunction1((t0: js.Function2[/* sender */ Any, /* e */ EventArgs, Unit]) => value(t0).runNow()))
      
      inline def setSet_selectedEntities(value: Any => Callback): Self = StObject.set(x, "set_selectedEntities", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    }
  }
  
  trait PeoplePickerWebServiceInterface extends StObject
  
  trait ResolveEntity extends StObject {
    
    var accountName: String
    
    var displayName: String
    
    var email: String
    
    var entityType: String
    
    def get_key(): String
    
    var id: String
    
    var isGroup: Boolean
    
    var members: js.Array[ResolveEntity]
    
    var needResolve: Boolean
    
    var tYPE_EVENT: String
    
    var tYPE_EXCHANGE: String
    
    var tYPE_RESOURCE: String
    
    var tYPE_USER: String
  }
  object ResolveEntity {
    
    inline def apply(
      accountName: String,
      displayName: String,
      email: String,
      entityType: String,
      get_key: CallbackTo[String],
      id: String,
      isGroup: Boolean,
      members: js.Array[ResolveEntity],
      needResolve: Boolean,
      tYPE_EVENT: String,
      tYPE_EXCHANGE: String,
      tYPE_RESOURCE: String,
      tYPE_USER: String
    ): ResolveEntity = {
      val __obj = js.Dynamic.literal(accountName = accountName.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], entityType = entityType.asInstanceOf[js.Any], get_key = get_key.toJsFn, id = id.asInstanceOf[js.Any], isGroup = isGroup.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], needResolve = needResolve.asInstanceOf[js.Any], tYPE_EVENT = tYPE_EVENT.asInstanceOf[js.Any], tYPE_EXCHANGE = tYPE_EXCHANGE.asInstanceOf[js.Any], tYPE_RESOURCE = tYPE_RESOURCE.asInstanceOf[js.Any], tYPE_USER = tYPE_USER.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolveEntity]
    }
    
    extension [Self <: ResolveEntity](x: Self) {
      
      inline def setAccountName(value: String): Self = StObject.set(x, "accountName", value.asInstanceOf[js.Any])
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEntityType(value: String): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
      
      inline def setGet_key(value: CallbackTo[String]): Self = StObject.set(x, "get_key", value.toJsFn)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIsGroup(value: Boolean): Self = StObject.set(x, "isGroup", value.asInstanceOf[js.Any])
      
      inline def setMembers(value: js.Array[ResolveEntity]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
      
      inline def setMembersVarargs(value: ResolveEntity*): Self = StObject.set(x, "members", js.Array(value*))
      
      inline def setNeedResolve(value: Boolean): Self = StObject.set(x, "needResolve", value.asInstanceOf[js.Any])
      
      inline def setTYPE_EVENT(value: String): Self = StObject.set(x, "tYPE_EVENT", value.asInstanceOf[js.Any])
      
      inline def setTYPE_EXCHANGE(value: String): Self = StObject.set(x, "tYPE_EXCHANGE", value.asInstanceOf[js.Any])
      
      inline def setTYPE_RESOURCE(value: String): Self = StObject.set(x, "tYPE_RESOURCE", value.asInstanceOf[js.Any])
      
      inline def setTYPE_USER(value: String): Self = StObject.set(x, "tYPE_USER", value.asInstanceOf[js.Any])
    }
  }
  
  trait SelectorSelectionEventArgs
    extends StObject
       with EventArgs {
    
    def get_entities(): Any
  }
  object SelectorSelectionEventArgs {
    
    inline def apply(Empty: EventArgs, get_entities: CallbackTo[Any]): SelectorSelectionEventArgs = {
      val __obj = js.Dynamic.literal(Empty = Empty.asInstanceOf[js.Any], get_entities = get_entities.toJsFn)
      __obj.asInstanceOf[SelectorSelectionEventArgs]
    }
    
    extension [Self <: SelectorSelectionEventArgs](x: Self) {
      
      inline def setGet_entities(value: CallbackTo[Any]): Self = StObject.set(x, "get_entities", value.toJsFn)
    }
  }
}
