package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultEntryEvents extends IEvents {
  var OnAddObjectFile: js.UndefOr[
    js.Function2[
      /* objVer */ IObjVer, 
      /* sourceObjectFile */ ISourceObjectFile, 
      Null | Boolean | AnonFinally
    ]
  ] = js.undefined
  var OnAddObjectToFavorites: js.UndefOr[js.Function1[/* objID */ IObjID, Null | Boolean | AnonOnError]] = js.undefined
  var OnAddObjectsToFavorites: js.UndefOr[js.Function1[/* objIDs */ IObjIDs, Null | Boolean | AnonOnError]] = js.undefined
  var OnChangeVaultLanguage: js.UndefOr[js.Function1[/* languageID */ Double, Null | Boolean | AnonOnError]] = js.undefined
  var OnCheckInObject: js.UndefOr[
    js.Function2[
      /* objVer */ IObjVer, 
      /* propertyValues */ IPropertyValues, 
      Null | Boolean | AnonOnSuccess
    ]
  ] = js.undefined
  var OnCheckInObjects: js.UndefOr[
    js.Function2[
      /* objVers */ IObjVers, 
      /* propertyValues */ IPropertyValues, 
      Null | Boolean | AnonFinallyOnError
    ]
  ] = js.undefined
  var OnCheckOutObject: js.UndefOr[js.Function1[/* objID */ IObjID, Null | Boolean | AnonOnSuccess]] = js.undefined
  var OnCheckOutObjects: js.UndefOr[js.Function1[/* objIDs */ IObjIDs, Null | Boolean | AnonFinallyOnError]] = js.undefined
  var OnCreateObject: js.UndefOr[
    js.Function6[
      /* objectType */ Double, 
      /* propertyValues */ IPropertyValues, 
      /* sourceObjectFiles */ ISourceObjectFiles, 
      /* accessControlList */ IAccessControlList, 
      /* checkInRequested */ Boolean, 
      /* singleFileRequested */ Boolean, 
      Null | Boolean | AnonOnSuccess
    ]
  ] = js.undefined
  var OnDestroyObject: js.UndefOr[js.Function1[/* objID */ IObjID, Null | Boolean | AnonOnError]] = js.undefined
  var OnDestroyObjectVersion: js.UndefOr[js.Function1[/* objVer */ IObjVer, Null | Boolean | AnonOnError]] = js.undefined
  var OnDestroyObjectVersions: js.UndefOr[js.Function1[/* objVers */ IObjVers, Null | Boolean | AnonOnError]] = js.undefined
  var OnDestroyObjects: js.UndefOr[js.Function1[/* objIDs */ IObjIDs, Null | Boolean | AnonOnError]] = js.undefined
  var OnLogOut: js.UndefOr[js.Function0[Null | Boolean | AnonOnError]] = js.undefined
  var OnLoggedIn: js.UndefOr[js.Function0[Unit]] = js.undefined
  var OnModifyObjectVersionLabels: js.UndefOr[
    js.Function5[
      /* objVer */ IObjVer, 
      /* clearFromOtherVersions */ Boolean, 
      /* append */ Boolean, 
      /* labelIDs */ IIDs, 
      /* singleLabelRequired */ Boolean, 
      Null | Boolean | AnonOnError
    ]
  ] = js.undefined
  var OnNotification: js.UndefOr[js.Function3[/* id */ String, /* data1 */ js.Any, /* data2 */ js.Any, _]] = js.undefined
  var OnObjectAddedToFavorites: js.UndefOr[js.Function1[/* objID */ IObjID, Unit]] = js.undefined
  var OnObjectCheckedIn: js.UndefOr[js.Function1[/* objectVersion */ IObjectVersion, Unit]] = js.undefined
  var OnObjectCheckedOut: js.UndefOr[js.Function1[/* objectVersion */ IObjectVersion, Unit]] = js.undefined
  var OnObjectCheckoutUndone: js.UndefOr[js.Function1[/* objectVersion */ IObjectVersion, Unit]] = js.undefined
  var OnObjectCheckoutsUndone: js.UndefOr[js.Function1[/* objectVersions */ IObjectVersions, Unit]] = js.undefined
  var OnObjectCreated: js.UndefOr[js.Function1[/* objectVersion */ IObjectVersion, Unit]] = js.undefined
  var OnObjectDestroyed: js.UndefOr[js.Function1[/* objID */ IObjID, Unit]] = js.undefined
  var OnObjectFileAdded: js.UndefOr[
    js.Function2[/* objectVersion */ IObjectVersion, /* objectFile */ IObjectFile, Unit]
  ] = js.undefined
  var OnObjectFileRemoved: js.UndefOr[js.Function2[/* objectVersion */ IObjectVersion, /* fileVer */ IFileVer, Unit]] = js.undefined
  var OnObjectFileRenamed: js.UndefOr[
    js.Function2[/* objectVersion */ IObjectVersion, /* objectFile */ IObjectFile, Unit]
  ] = js.undefined
  var OnObjectLevelPropertySet: js.UndefOr[js.Function2[/* objID */ IObjID, /* propertyValue */ IPropertyValue, Unit]] = js.undefined
  var OnObjectOfflineAvailabilityRemoved: js.UndefOr[js.Function1[/* objID */ IObjID, Unit]] = js.undefined
  var OnObjectOfflineAvailabilitySet: js.UndefOr[js.Function1[/* objID */ IObjID, Unit]] = js.undefined
  var OnObjectRemoved: js.UndefOr[js.Function1[/* objectVersion */ IObjectVersion, Unit]] = js.undefined
  var OnObjectRemovedFromFavorites: js.UndefOr[js.Function1[/* objID */ IObjID, Unit]] = js.undefined
  var OnObjectUndeleted: js.UndefOr[js.Function1[/* objectVersion */ IObjectVersion, Unit]] = js.undefined
  var OnObjectVersionDestroyed: js.UndefOr[js.Function1[/* objVer */ IObjVer, Unit]] = js.undefined
  var OnObjectVersionLabelsModified: js.UndefOr[
    js.Function4[
      /* objVer */ IObjVer, 
      /* clearFromOtherVersions */ Boolean, 
      /* append */ Boolean, 
      /* labelIDs */ IIDs, 
      Unit
    ]
  ] = js.undefined
  var OnObjectVersionPermissionsSet: js.UndefOr[js.Function1[/* objectVersion */ IObjectVersion, Unit]] = js.undefined
  var OnObjectVersionRolledBack: js.UndefOr[js.Function1[/* objectVersion */ IObjectVersion, Unit]] = js.undefined
  var OnObjectVersionsDestroyed: js.UndefOr[js.Function1[/* objVers */ IObjVers, Unit]] = js.undefined
  var OnObjectsAddedToFavorites: js.UndefOr[js.Function1[/* objIDs */ IObjIDs, Unit]] = js.undefined
  var OnObjectsCheckedIn: js.UndefOr[js.Function1[/* objectVersions */ IObjectVersions, Unit]] = js.undefined
  var OnObjectsCheckedOut: js.UndefOr[js.Function1[/* objectVersions */ IObjectVersions, Unit]] = js.undefined
  var OnObjectsDestroyed: js.UndefOr[js.Function1[/* objIDs */ IObjIDs, Unit]] = js.undefined
  var OnObjectsRemoved: js.UndefOr[js.Function1[/* objectVersions */ IObjectVersions, Unit]] = js.undefined
  var OnObjectsRemovedFromFavorites: js.UndefOr[js.Function1[/* objIDs */ IObjIDs, Unit]] = js.undefined
  var OnPropertiesOfObjectVersionSet: js.UndefOr[js.Function1[/* objectVersion */ IObjectVersion, Unit]] = js.undefined
  var OnPropertiesOfObjectVersionsSet: js.UndefOr[js.Function1[/* objectVersions */ IObjectVersions, Unit]] = js.undefined
  var OnRemoveObject: js.UndefOr[js.Function1[/* objID */ IObjID, Null | Boolean | AnonOnSuccess]] = js.undefined
  var OnRemoveObjectFile: js.UndefOr[
    js.Function2[/* objVer */ IObjVer, /* fileVer */ IFileVer, Null | Boolean | AnonOnSuccess]
  ] = js.undefined
  var OnRemoveObjectFromFavorites: js.UndefOr[js.Function1[/* objID */ IObjID, Null | Boolean | AnonOnError]] = js.undefined
  var OnRemoveObjectOfflineAvailability: js.UndefOr[js.Function1[/* objID */ IObjID, Null | Boolean | AnonOnError]] = js.undefined
  var OnRemoveObjects: js.UndefOr[js.Function1[/* objIDs */ IObjIDs, Null | Boolean | AnonFinallyOnError]] = js.undefined
  var OnRemoveObjectsFromFavorites: js.UndefOr[js.Function1[/* objIDs */ IObjIDs, Null | Boolean | AnonOnError]] = js.undefined
  var OnRenameObjectFile: js.UndefOr[
    js.Function4[
      /* objVer */ IObjVer, 
      /* fileVer */ IFileVer, 
      /* newName */ Null | ITypedValue, 
      /* newExtension */ Null | ITypedValue, 
      Null | Boolean | AnonFinally
    ]
  ] = js.undefined
  var OnRollBackObjectVersion: js.UndefOr[js.Function1[/* objVer */ IObjVer, Null | Boolean | AnonOnSuccess]] = js.undefined
  var OnSetObjectLevelProperty: js.UndefOr[
    js.Function2[/* objID */ IObjID, /* propertyValue */ IPropertyValue, Null | Boolean | AnonOnError]
  ] = js.undefined
  var OnSetObjectOfflineAvailability: js.UndefOr[js.Function1[/* objID */ IObjID, Null | Boolean | AnonOnError]] = js.undefined
  var OnSetObjectVersionPermissions: js.UndefOr[
    js.Function3[
      /* objVer */ IObjVer, 
      /* changeAllVersions */ Boolean, 
      /* accessControlList */ IAccessControlList, 
      Null | Boolean | AnonOnSuccess
    ]
  ] = js.undefined
  var OnSetPropertiesOfObjectVersion: js.UndefOr[
    js.Function3[
      /* setPropertiesParams */ ISetPropertiesParams, 
      /* singlePropertyUpdate */ Boolean, 
      /* singlePropertyRemove */ Boolean, 
      Null | Boolean | AnonOnSuccess
    ]
  ] = js.undefined
  var OnSetPropertiesOfObjectVersions: js.UndefOr[
    js.Function3[
      /* setPropertiesParamsOfMultipleObjects */ ISetPropertiesParamsOfMultipleObjects, 
      /* singlePropertyUpdate */ Boolean, 
      /* singlePropertyRemove */ Boolean, 
      Null | Boolean | AnonFinallyOnError
    ]
  ] = js.undefined
  var OnStarted: js.UndefOr[js.Function0[Unit]] = js.undefined
  var OnStop: js.UndefOr[js.Function0[Unit]] = js.undefined
  var OnSwitchToOfflineMode: js.UndefOr[js.Function0[Null | Boolean | AnonOnError]] = js.undefined
  var OnSwitchToOnlineMode: js.UndefOr[js.Function0[Null | Boolean | AnonOnError]] = js.undefined
  var OnSwitchedToOfflineMode: js.UndefOr[js.Function0[Unit]] = js.undefined
  var OnSwitchedToOnlineMode: js.UndefOr[js.Function0[Unit]] = js.undefined
  var OnUndeleteObject: js.UndefOr[js.Function1[/* objID */ IObjID, Null | Boolean | AnonOnSuccess]] = js.undefined
  var OnUndeleteObjects: js.UndefOr[js.Function1[/* objIDs */ IObjIDs, Null | Boolean | AnonFinallyOnError]] = js.undefined
  var OnUndoObjectCheckout: js.UndefOr[js.Function1[/* objVer */ IObjVer, Null | Boolean | AnonOnSuccess]] = js.undefined
  var OnUndoObjectCheckouts: js.UndefOr[js.Function1[/* objVers */ IObjVers, Null | Boolean | AnonFinallyOnError]] = js.undefined
  var OnVaultLanguageChanged: js.UndefOr[js.Function1[/* languageID */ Double, Unit]] = js.undefined
}

object IVaultEntryEvents {
  @scala.inline
  def apply(
    Register: (Event, js.Function) => CallbackTo[Double],
    Unregister: Double => Callback,
    OnAddObjectFile: (/* objVer */ IObjVer, /* sourceObjectFile */ ISourceObjectFile) => CallbackTo[Null | Boolean | AnonFinally] = null,
    OnAddObjectToFavorites: /* objID */ IObjID => CallbackTo[Null | Boolean | AnonOnError] = null,
    OnAddObjectsToFavorites: /* objIDs */ IObjIDs => CallbackTo[Null | Boolean | AnonOnError] = null,
    OnChangeVaultLanguage: /* languageID */ Double => CallbackTo[Null | Boolean | AnonOnError] = null,
    OnCheckInObject: (/* objVer */ IObjVer, /* propertyValues */ IPropertyValues) => CallbackTo[Null | Boolean | AnonOnSuccess] = null,
    OnCheckInObjects: (/* objVers */ IObjVers, /* propertyValues */ IPropertyValues) => CallbackTo[Null | Boolean | AnonFinallyOnError] = null,
    OnCheckOutObject: /* objID */ IObjID => CallbackTo[Null | Boolean | AnonOnSuccess] = null,
    OnCheckOutObjects: /* objIDs */ IObjIDs => CallbackTo[Null | Boolean | AnonFinallyOnError] = null,
    OnCreateObject: (/* objectType */ Double, /* propertyValues */ IPropertyValues, /* sourceObjectFiles */ ISourceObjectFiles, /* accessControlList */ IAccessControlList, /* checkInRequested */ Boolean, /* singleFileRequested */ Boolean) => CallbackTo[Null | Boolean | AnonOnSuccess] = null,
    OnDestroyObject: /* objID */ IObjID => CallbackTo[Null | Boolean | AnonOnError] = null,
    OnDestroyObjectVersion: /* objVer */ IObjVer => CallbackTo[Null | Boolean | AnonOnError] = null,
    OnDestroyObjectVersions: /* objVers */ IObjVers => CallbackTo[Null | Boolean | AnonOnError] = null,
    OnDestroyObjects: /* objIDs */ IObjIDs => CallbackTo[Null | Boolean | AnonOnError] = null,
    OnLogOut: js.UndefOr[CallbackTo[Null | Boolean | AnonOnError]] = js.undefined,
    OnLoggedIn: js.UndefOr[Callback] = js.undefined,
    OnModifyObjectVersionLabels: (/* objVer */ IObjVer, /* clearFromOtherVersions */ Boolean, /* append */ Boolean, /* labelIDs */ IIDs, /* singleLabelRequired */ Boolean) => CallbackTo[Null | Boolean | AnonOnError] = null,
    OnNotification: (/* id */ String, /* data1 */ js.Any, /* data2 */ js.Any) => CallbackTo[js.Any] = null,
    OnObjectAddedToFavorites: /* objID */ IObjID => Callback = null,
    OnObjectCheckedIn: /* objectVersion */ IObjectVersion => Callback = null,
    OnObjectCheckedOut: /* objectVersion */ IObjectVersion => Callback = null,
    OnObjectCheckoutUndone: /* objectVersion */ IObjectVersion => Callback = null,
    OnObjectCheckoutsUndone: /* objectVersions */ IObjectVersions => Callback = null,
    OnObjectCreated: /* objectVersion */ IObjectVersion => Callback = null,
    OnObjectDestroyed: /* objID */ IObjID => Callback = null,
    OnObjectFileAdded: (/* objectVersion */ IObjectVersion, /* objectFile */ IObjectFile) => Callback = null,
    OnObjectFileRemoved: (/* objectVersion */ IObjectVersion, /* fileVer */ IFileVer) => Callback = null,
    OnObjectFileRenamed: (/* objectVersion */ IObjectVersion, /* objectFile */ IObjectFile) => Callback = null,
    OnObjectLevelPropertySet: (/* objID */ IObjID, /* propertyValue */ IPropertyValue) => Callback = null,
    OnObjectOfflineAvailabilityRemoved: /* objID */ IObjID => Callback = null,
    OnObjectOfflineAvailabilitySet: /* objID */ IObjID => Callback = null,
    OnObjectRemoved: /* objectVersion */ IObjectVersion => Callback = null,
    OnObjectRemovedFromFavorites: /* objID */ IObjID => Callback = null,
    OnObjectUndeleted: /* objectVersion */ IObjectVersion => Callback = null,
    OnObjectVersionDestroyed: /* objVer */ IObjVer => Callback = null,
    OnObjectVersionLabelsModified: (/* objVer */ IObjVer, /* clearFromOtherVersions */ Boolean, /* append */ Boolean, /* labelIDs */ IIDs) => Callback = null,
    OnObjectVersionPermissionsSet: /* objectVersion */ IObjectVersion => Callback = null,
    OnObjectVersionRolledBack: /* objectVersion */ IObjectVersion => Callback = null,
    OnObjectVersionsDestroyed: /* objVers */ IObjVers => Callback = null,
    OnObjectsAddedToFavorites: /* objIDs */ IObjIDs => Callback = null,
    OnObjectsCheckedIn: /* objectVersions */ IObjectVersions => Callback = null,
    OnObjectsCheckedOut: /* objectVersions */ IObjectVersions => Callback = null,
    OnObjectsDestroyed: /* objIDs */ IObjIDs => Callback = null,
    OnObjectsRemoved: /* objectVersions */ IObjectVersions => Callback = null,
    OnObjectsRemovedFromFavorites: /* objIDs */ IObjIDs => Callback = null,
    OnPropertiesOfObjectVersionSet: /* objectVersion */ IObjectVersion => Callback = null,
    OnPropertiesOfObjectVersionsSet: /* objectVersions */ IObjectVersions => Callback = null,
    OnRemoveObject: /* objID */ IObjID => CallbackTo[Null | Boolean | AnonOnSuccess] = null,
    OnRemoveObjectFile: (/* objVer */ IObjVer, /* fileVer */ IFileVer) => CallbackTo[Null | Boolean | AnonOnSuccess] = null,
    OnRemoveObjectFromFavorites: /* objID */ IObjID => CallbackTo[Null | Boolean | AnonOnError] = null,
    OnRemoveObjectOfflineAvailability: /* objID */ IObjID => CallbackTo[Null | Boolean | AnonOnError] = null,
    OnRemoveObjects: /* objIDs */ IObjIDs => CallbackTo[Null | Boolean | AnonFinallyOnError] = null,
    OnRemoveObjectsFromFavorites: /* objIDs */ IObjIDs => CallbackTo[Null | Boolean | AnonOnError] = null,
    OnRenameObjectFile: (/* objVer */ IObjVer, /* fileVer */ IFileVer, /* newName */ Null | ITypedValue, /* newExtension */ Null | ITypedValue) => CallbackTo[Null | Boolean | AnonFinally] = null,
    OnRollBackObjectVersion: /* objVer */ IObjVer => CallbackTo[Null | Boolean | AnonOnSuccess] = null,
    OnSetObjectLevelProperty: (/* objID */ IObjID, /* propertyValue */ IPropertyValue) => CallbackTo[Null | Boolean | AnonOnError] = null,
    OnSetObjectOfflineAvailability: /* objID */ IObjID => CallbackTo[Null | Boolean | AnonOnError] = null,
    OnSetObjectVersionPermissions: (/* objVer */ IObjVer, /* changeAllVersions */ Boolean, /* accessControlList */ IAccessControlList) => CallbackTo[Null | Boolean | AnonOnSuccess] = null,
    OnSetPropertiesOfObjectVersion: (/* setPropertiesParams */ ISetPropertiesParams, /* singlePropertyUpdate */ Boolean, /* singlePropertyRemove */ Boolean) => CallbackTo[Null | Boolean | AnonOnSuccess] = null,
    OnSetPropertiesOfObjectVersions: (/* setPropertiesParamsOfMultipleObjects */ ISetPropertiesParamsOfMultipleObjects, /* singlePropertyUpdate */ Boolean, /* singlePropertyRemove */ Boolean) => CallbackTo[Null | Boolean | AnonFinallyOnError] = null,
    OnStarted: js.UndefOr[Callback] = js.undefined,
    OnStop: js.UndefOr[Callback] = js.undefined,
    OnSwitchToOfflineMode: js.UndefOr[CallbackTo[Null | Boolean | AnonOnError]] = js.undefined,
    OnSwitchToOnlineMode: js.UndefOr[CallbackTo[Null | Boolean | AnonOnError]] = js.undefined,
    OnSwitchedToOfflineMode: js.UndefOr[Callback] = js.undefined,
    OnSwitchedToOnlineMode: js.UndefOr[Callback] = js.undefined,
    OnUndeleteObject: /* objID */ IObjID => CallbackTo[Null | Boolean | AnonOnSuccess] = null,
    OnUndeleteObjects: /* objIDs */ IObjIDs => CallbackTo[Null | Boolean | AnonFinallyOnError] = null,
    OnUndoObjectCheckout: /* objVer */ IObjVer => CallbackTo[Null | Boolean | AnonOnSuccess] = null,
    OnUndoObjectCheckouts: /* objVers */ IObjVers => CallbackTo[Null | Boolean | AnonFinallyOnError] = null,
    OnVaultLanguageChanged: /* languageID */ Double => Callback = null
  ): IVaultEntryEvents = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Register")(js.Any.fromFunction2((t0: typingsJapgolly.mfiles.MFiles.Event, t1: js.Function) => Register(t0, t1).runNow()))
    __obj.updateDynamic("Unregister")(js.Any.fromFunction1((t0: scala.Double) => Unregister(t0).runNow()))
    if (OnAddObjectFile != null) __obj.updateDynamic("OnAddObjectFile")(js.Any.fromFunction2((t0: /* objVer */ typingsJapgolly.mfiles.IObjVer, t1: /* sourceObjectFile */ typingsJapgolly.mfiles.ISourceObjectFile) => OnAddObjectFile(t0, t1).runNow()))
    if (OnAddObjectToFavorites != null) __obj.updateDynamic("OnAddObjectToFavorites")(js.Any.fromFunction1((t0: /* objID */ typingsJapgolly.mfiles.IObjID) => OnAddObjectToFavorites(t0).runNow()))
    if (OnAddObjectsToFavorites != null) __obj.updateDynamic("OnAddObjectsToFavorites")(js.Any.fromFunction1((t0: /* objIDs */ typingsJapgolly.mfiles.IObjIDs) => OnAddObjectsToFavorites(t0).runNow()))
    if (OnChangeVaultLanguage != null) __obj.updateDynamic("OnChangeVaultLanguage")(js.Any.fromFunction1((t0: /* languageID */ scala.Double) => OnChangeVaultLanguage(t0).runNow()))
    if (OnCheckInObject != null) __obj.updateDynamic("OnCheckInObject")(js.Any.fromFunction2((t0: /* objVer */ typingsJapgolly.mfiles.IObjVer, t1: /* propertyValues */ typingsJapgolly.mfiles.IPropertyValues) => OnCheckInObject(t0, t1).runNow()))
    if (OnCheckInObjects != null) __obj.updateDynamic("OnCheckInObjects")(js.Any.fromFunction2((t0: /* objVers */ typingsJapgolly.mfiles.IObjVers, t1: /* propertyValues */ typingsJapgolly.mfiles.IPropertyValues) => OnCheckInObjects(t0, t1).runNow()))
    if (OnCheckOutObject != null) __obj.updateDynamic("OnCheckOutObject")(js.Any.fromFunction1((t0: /* objID */ typingsJapgolly.mfiles.IObjID) => OnCheckOutObject(t0).runNow()))
    if (OnCheckOutObjects != null) __obj.updateDynamic("OnCheckOutObjects")(js.Any.fromFunction1((t0: /* objIDs */ typingsJapgolly.mfiles.IObjIDs) => OnCheckOutObjects(t0).runNow()))
    if (OnCreateObject != null) __obj.updateDynamic("OnCreateObject")(js.Any.fromFunction6((t0: /* objectType */ scala.Double, t1: /* propertyValues */ typingsJapgolly.mfiles.IPropertyValues, t2: /* sourceObjectFiles */ typingsJapgolly.mfiles.ISourceObjectFiles, t3: /* accessControlList */ typingsJapgolly.mfiles.IAccessControlList, t4: /* checkInRequested */ scala.Boolean, t5: /* singleFileRequested */ scala.Boolean) => OnCreateObject(t0, t1, t2, t3, t4, t5).runNow()))
    if (OnDestroyObject != null) __obj.updateDynamic("OnDestroyObject")(js.Any.fromFunction1((t0: /* objID */ typingsJapgolly.mfiles.IObjID) => OnDestroyObject(t0).runNow()))
    if (OnDestroyObjectVersion != null) __obj.updateDynamic("OnDestroyObjectVersion")(js.Any.fromFunction1((t0: /* objVer */ typingsJapgolly.mfiles.IObjVer) => OnDestroyObjectVersion(t0).runNow()))
    if (OnDestroyObjectVersions != null) __obj.updateDynamic("OnDestroyObjectVersions")(js.Any.fromFunction1((t0: /* objVers */ typingsJapgolly.mfiles.IObjVers) => OnDestroyObjectVersions(t0).runNow()))
    if (OnDestroyObjects != null) __obj.updateDynamic("OnDestroyObjects")(js.Any.fromFunction1((t0: /* objIDs */ typingsJapgolly.mfiles.IObjIDs) => OnDestroyObjects(t0).runNow()))
    OnLogOut.foreach(p => __obj.updateDynamic("OnLogOut")(p.toJsFn))
    OnLoggedIn.foreach(p => __obj.updateDynamic("OnLoggedIn")(p.toJsFn))
    if (OnModifyObjectVersionLabels != null) __obj.updateDynamic("OnModifyObjectVersionLabels")(js.Any.fromFunction5((t0: /* objVer */ typingsJapgolly.mfiles.IObjVer, t1: /* clearFromOtherVersions */ scala.Boolean, t2: /* append */ scala.Boolean, t3: /* labelIDs */ typingsJapgolly.mfiles.IIDs, t4: /* singleLabelRequired */ scala.Boolean) => OnModifyObjectVersionLabels(t0, t1, t2, t3, t4).runNow()))
    if (OnNotification != null) __obj.updateDynamic("OnNotification")(js.Any.fromFunction3((t0: /* id */ java.lang.String, t1: /* data1 */ js.Any, t2: /* data2 */ js.Any) => OnNotification(t0, t1, t2).runNow()))
    if (OnObjectAddedToFavorites != null) __obj.updateDynamic("OnObjectAddedToFavorites")(js.Any.fromFunction1((t0: /* objID */ typingsJapgolly.mfiles.IObjID) => OnObjectAddedToFavorites(t0).runNow()))
    if (OnObjectCheckedIn != null) __obj.updateDynamic("OnObjectCheckedIn")(js.Any.fromFunction1((t0: /* objectVersion */ typingsJapgolly.mfiles.IObjectVersion) => OnObjectCheckedIn(t0).runNow()))
    if (OnObjectCheckedOut != null) __obj.updateDynamic("OnObjectCheckedOut")(js.Any.fromFunction1((t0: /* objectVersion */ typingsJapgolly.mfiles.IObjectVersion) => OnObjectCheckedOut(t0).runNow()))
    if (OnObjectCheckoutUndone != null) __obj.updateDynamic("OnObjectCheckoutUndone")(js.Any.fromFunction1((t0: /* objectVersion */ typingsJapgolly.mfiles.IObjectVersion) => OnObjectCheckoutUndone(t0).runNow()))
    if (OnObjectCheckoutsUndone != null) __obj.updateDynamic("OnObjectCheckoutsUndone")(js.Any.fromFunction1((t0: /* objectVersions */ typingsJapgolly.mfiles.IObjectVersions) => OnObjectCheckoutsUndone(t0).runNow()))
    if (OnObjectCreated != null) __obj.updateDynamic("OnObjectCreated")(js.Any.fromFunction1((t0: /* objectVersion */ typingsJapgolly.mfiles.IObjectVersion) => OnObjectCreated(t0).runNow()))
    if (OnObjectDestroyed != null) __obj.updateDynamic("OnObjectDestroyed")(js.Any.fromFunction1((t0: /* objID */ typingsJapgolly.mfiles.IObjID) => OnObjectDestroyed(t0).runNow()))
    if (OnObjectFileAdded != null) __obj.updateDynamic("OnObjectFileAdded")(js.Any.fromFunction2((t0: /* objectVersion */ typingsJapgolly.mfiles.IObjectVersion, t1: /* objectFile */ typingsJapgolly.mfiles.IObjectFile) => OnObjectFileAdded(t0, t1).runNow()))
    if (OnObjectFileRemoved != null) __obj.updateDynamic("OnObjectFileRemoved")(js.Any.fromFunction2((t0: /* objectVersion */ typingsJapgolly.mfiles.IObjectVersion, t1: /* fileVer */ typingsJapgolly.mfiles.IFileVer) => OnObjectFileRemoved(t0, t1).runNow()))
    if (OnObjectFileRenamed != null) __obj.updateDynamic("OnObjectFileRenamed")(js.Any.fromFunction2((t0: /* objectVersion */ typingsJapgolly.mfiles.IObjectVersion, t1: /* objectFile */ typingsJapgolly.mfiles.IObjectFile) => OnObjectFileRenamed(t0, t1).runNow()))
    if (OnObjectLevelPropertySet != null) __obj.updateDynamic("OnObjectLevelPropertySet")(js.Any.fromFunction2((t0: /* objID */ typingsJapgolly.mfiles.IObjID, t1: /* propertyValue */ typingsJapgolly.mfiles.IPropertyValue) => OnObjectLevelPropertySet(t0, t1).runNow()))
    if (OnObjectOfflineAvailabilityRemoved != null) __obj.updateDynamic("OnObjectOfflineAvailabilityRemoved")(js.Any.fromFunction1((t0: /* objID */ typingsJapgolly.mfiles.IObjID) => OnObjectOfflineAvailabilityRemoved(t0).runNow()))
    if (OnObjectOfflineAvailabilitySet != null) __obj.updateDynamic("OnObjectOfflineAvailabilitySet")(js.Any.fromFunction1((t0: /* objID */ typingsJapgolly.mfiles.IObjID) => OnObjectOfflineAvailabilitySet(t0).runNow()))
    if (OnObjectRemoved != null) __obj.updateDynamic("OnObjectRemoved")(js.Any.fromFunction1((t0: /* objectVersion */ typingsJapgolly.mfiles.IObjectVersion) => OnObjectRemoved(t0).runNow()))
    if (OnObjectRemovedFromFavorites != null) __obj.updateDynamic("OnObjectRemovedFromFavorites")(js.Any.fromFunction1((t0: /* objID */ typingsJapgolly.mfiles.IObjID) => OnObjectRemovedFromFavorites(t0).runNow()))
    if (OnObjectUndeleted != null) __obj.updateDynamic("OnObjectUndeleted")(js.Any.fromFunction1((t0: /* objectVersion */ typingsJapgolly.mfiles.IObjectVersion) => OnObjectUndeleted(t0).runNow()))
    if (OnObjectVersionDestroyed != null) __obj.updateDynamic("OnObjectVersionDestroyed")(js.Any.fromFunction1((t0: /* objVer */ typingsJapgolly.mfiles.IObjVer) => OnObjectVersionDestroyed(t0).runNow()))
    if (OnObjectVersionLabelsModified != null) __obj.updateDynamic("OnObjectVersionLabelsModified")(js.Any.fromFunction4((t0: /* objVer */ typingsJapgolly.mfiles.IObjVer, t1: /* clearFromOtherVersions */ scala.Boolean, t2: /* append */ scala.Boolean, t3: /* labelIDs */ typingsJapgolly.mfiles.IIDs) => OnObjectVersionLabelsModified(t0, t1, t2, t3).runNow()))
    if (OnObjectVersionPermissionsSet != null) __obj.updateDynamic("OnObjectVersionPermissionsSet")(js.Any.fromFunction1((t0: /* objectVersion */ typingsJapgolly.mfiles.IObjectVersion) => OnObjectVersionPermissionsSet(t0).runNow()))
    if (OnObjectVersionRolledBack != null) __obj.updateDynamic("OnObjectVersionRolledBack")(js.Any.fromFunction1((t0: /* objectVersion */ typingsJapgolly.mfiles.IObjectVersion) => OnObjectVersionRolledBack(t0).runNow()))
    if (OnObjectVersionsDestroyed != null) __obj.updateDynamic("OnObjectVersionsDestroyed")(js.Any.fromFunction1((t0: /* objVers */ typingsJapgolly.mfiles.IObjVers) => OnObjectVersionsDestroyed(t0).runNow()))
    if (OnObjectsAddedToFavorites != null) __obj.updateDynamic("OnObjectsAddedToFavorites")(js.Any.fromFunction1((t0: /* objIDs */ typingsJapgolly.mfiles.IObjIDs) => OnObjectsAddedToFavorites(t0).runNow()))
    if (OnObjectsCheckedIn != null) __obj.updateDynamic("OnObjectsCheckedIn")(js.Any.fromFunction1((t0: /* objectVersions */ typingsJapgolly.mfiles.IObjectVersions) => OnObjectsCheckedIn(t0).runNow()))
    if (OnObjectsCheckedOut != null) __obj.updateDynamic("OnObjectsCheckedOut")(js.Any.fromFunction1((t0: /* objectVersions */ typingsJapgolly.mfiles.IObjectVersions) => OnObjectsCheckedOut(t0).runNow()))
    if (OnObjectsDestroyed != null) __obj.updateDynamic("OnObjectsDestroyed")(js.Any.fromFunction1((t0: /* objIDs */ typingsJapgolly.mfiles.IObjIDs) => OnObjectsDestroyed(t0).runNow()))
    if (OnObjectsRemoved != null) __obj.updateDynamic("OnObjectsRemoved")(js.Any.fromFunction1((t0: /* objectVersions */ typingsJapgolly.mfiles.IObjectVersions) => OnObjectsRemoved(t0).runNow()))
    if (OnObjectsRemovedFromFavorites != null) __obj.updateDynamic("OnObjectsRemovedFromFavorites")(js.Any.fromFunction1((t0: /* objIDs */ typingsJapgolly.mfiles.IObjIDs) => OnObjectsRemovedFromFavorites(t0).runNow()))
    if (OnPropertiesOfObjectVersionSet != null) __obj.updateDynamic("OnPropertiesOfObjectVersionSet")(js.Any.fromFunction1((t0: /* objectVersion */ typingsJapgolly.mfiles.IObjectVersion) => OnPropertiesOfObjectVersionSet(t0).runNow()))
    if (OnPropertiesOfObjectVersionsSet != null) __obj.updateDynamic("OnPropertiesOfObjectVersionsSet")(js.Any.fromFunction1((t0: /* objectVersions */ typingsJapgolly.mfiles.IObjectVersions) => OnPropertiesOfObjectVersionsSet(t0).runNow()))
    if (OnRemoveObject != null) __obj.updateDynamic("OnRemoveObject")(js.Any.fromFunction1((t0: /* objID */ typingsJapgolly.mfiles.IObjID) => OnRemoveObject(t0).runNow()))
    if (OnRemoveObjectFile != null) __obj.updateDynamic("OnRemoveObjectFile")(js.Any.fromFunction2((t0: /* objVer */ typingsJapgolly.mfiles.IObjVer, t1: /* fileVer */ typingsJapgolly.mfiles.IFileVer) => OnRemoveObjectFile(t0, t1).runNow()))
    if (OnRemoveObjectFromFavorites != null) __obj.updateDynamic("OnRemoveObjectFromFavorites")(js.Any.fromFunction1((t0: /* objID */ typingsJapgolly.mfiles.IObjID) => OnRemoveObjectFromFavorites(t0).runNow()))
    if (OnRemoveObjectOfflineAvailability != null) __obj.updateDynamic("OnRemoveObjectOfflineAvailability")(js.Any.fromFunction1((t0: /* objID */ typingsJapgolly.mfiles.IObjID) => OnRemoveObjectOfflineAvailability(t0).runNow()))
    if (OnRemoveObjects != null) __obj.updateDynamic("OnRemoveObjects")(js.Any.fromFunction1((t0: /* objIDs */ typingsJapgolly.mfiles.IObjIDs) => OnRemoveObjects(t0).runNow()))
    if (OnRemoveObjectsFromFavorites != null) __obj.updateDynamic("OnRemoveObjectsFromFavorites")(js.Any.fromFunction1((t0: /* objIDs */ typingsJapgolly.mfiles.IObjIDs) => OnRemoveObjectsFromFavorites(t0).runNow()))
    if (OnRenameObjectFile != null) __obj.updateDynamic("OnRenameObjectFile")(js.Any.fromFunction4((t0: /* objVer */ typingsJapgolly.mfiles.IObjVer, t1: /* fileVer */ typingsJapgolly.mfiles.IFileVer, t2: /* newName */ scala.Null | typingsJapgolly.mfiles.ITypedValue, t3: /* newExtension */ scala.Null | typingsJapgolly.mfiles.ITypedValue) => OnRenameObjectFile(t0, t1, t2, t3).runNow()))
    if (OnRollBackObjectVersion != null) __obj.updateDynamic("OnRollBackObjectVersion")(js.Any.fromFunction1((t0: /* objVer */ typingsJapgolly.mfiles.IObjVer) => OnRollBackObjectVersion(t0).runNow()))
    if (OnSetObjectLevelProperty != null) __obj.updateDynamic("OnSetObjectLevelProperty")(js.Any.fromFunction2((t0: /* objID */ typingsJapgolly.mfiles.IObjID, t1: /* propertyValue */ typingsJapgolly.mfiles.IPropertyValue) => OnSetObjectLevelProperty(t0, t1).runNow()))
    if (OnSetObjectOfflineAvailability != null) __obj.updateDynamic("OnSetObjectOfflineAvailability")(js.Any.fromFunction1((t0: /* objID */ typingsJapgolly.mfiles.IObjID) => OnSetObjectOfflineAvailability(t0).runNow()))
    if (OnSetObjectVersionPermissions != null) __obj.updateDynamic("OnSetObjectVersionPermissions")(js.Any.fromFunction3((t0: /* objVer */ typingsJapgolly.mfiles.IObjVer, t1: /* changeAllVersions */ scala.Boolean, t2: /* accessControlList */ typingsJapgolly.mfiles.IAccessControlList) => OnSetObjectVersionPermissions(t0, t1, t2).runNow()))
    if (OnSetPropertiesOfObjectVersion != null) __obj.updateDynamic("OnSetPropertiesOfObjectVersion")(js.Any.fromFunction3((t0: /* setPropertiesParams */ typingsJapgolly.mfiles.ISetPropertiesParams, t1: /* singlePropertyUpdate */ scala.Boolean, t2: /* singlePropertyRemove */ scala.Boolean) => OnSetPropertiesOfObjectVersion(t0, t1, t2).runNow()))
    if (OnSetPropertiesOfObjectVersions != null) __obj.updateDynamic("OnSetPropertiesOfObjectVersions")(js.Any.fromFunction3((t0: /* setPropertiesParamsOfMultipleObjects */ typingsJapgolly.mfiles.ISetPropertiesParamsOfMultipleObjects, t1: /* singlePropertyUpdate */ scala.Boolean, t2: /* singlePropertyRemove */ scala.Boolean) => OnSetPropertiesOfObjectVersions(t0, t1, t2).runNow()))
    OnStarted.foreach(p => __obj.updateDynamic("OnStarted")(p.toJsFn))
    OnStop.foreach(p => __obj.updateDynamic("OnStop")(p.toJsFn))
    OnSwitchToOfflineMode.foreach(p => __obj.updateDynamic("OnSwitchToOfflineMode")(p.toJsFn))
    OnSwitchToOnlineMode.foreach(p => __obj.updateDynamic("OnSwitchToOnlineMode")(p.toJsFn))
    OnSwitchedToOfflineMode.foreach(p => __obj.updateDynamic("OnSwitchedToOfflineMode")(p.toJsFn))
    OnSwitchedToOnlineMode.foreach(p => __obj.updateDynamic("OnSwitchedToOnlineMode")(p.toJsFn))
    if (OnUndeleteObject != null) __obj.updateDynamic("OnUndeleteObject")(js.Any.fromFunction1((t0: /* objID */ typingsJapgolly.mfiles.IObjID) => OnUndeleteObject(t0).runNow()))
    if (OnUndeleteObjects != null) __obj.updateDynamic("OnUndeleteObjects")(js.Any.fromFunction1((t0: /* objIDs */ typingsJapgolly.mfiles.IObjIDs) => OnUndeleteObjects(t0).runNow()))
    if (OnUndoObjectCheckout != null) __obj.updateDynamic("OnUndoObjectCheckout")(js.Any.fromFunction1((t0: /* objVer */ typingsJapgolly.mfiles.IObjVer) => OnUndoObjectCheckout(t0).runNow()))
    if (OnUndoObjectCheckouts != null) __obj.updateDynamic("OnUndoObjectCheckouts")(js.Any.fromFunction1((t0: /* objVers */ typingsJapgolly.mfiles.IObjVers) => OnUndoObjectCheckouts(t0).runNow()))
    if (OnVaultLanguageChanged != null) __obj.updateDynamic("OnVaultLanguageChanged")(js.Any.fromFunction1((t0: /* languageID */ scala.Double) => OnVaultLanguageChanged(t0).runNow()))
    __obj.asInstanceOf[IVaultEntryEvents]
  }
}

