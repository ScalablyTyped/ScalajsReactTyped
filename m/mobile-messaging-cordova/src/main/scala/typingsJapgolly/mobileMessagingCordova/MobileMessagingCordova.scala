package typingsJapgolly.mobileMessagingCordova

import japgolly.scalajs.react.Callback
import org.scalajs.dom.CustomEvent
import typingsJapgolly.mobileMessagingCordova.anon.Actions
import typingsJapgolly.mobileMessagingCordova.anon.ApplicationCodePersistingDisabled
import typingsJapgolly.mobileMessagingCordova.anon.ForceCleanup
import typingsJapgolly.mobileMessagingCordova.anon.MultipleNotifications
import typingsJapgolly.mobileMessagingCordova.anon.ShowModally
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MobileMessagingCordova {
  
  @js.native
  trait Api extends StObject {
    
    def defaultMessageStorage(): js.UndefOr[DefaultMessageStorage] = js.native
    
    /**
      * Performs depersonalization of the current installation on the platform.
      *
      * @param callback will be called on success
      * @param errorCallback will be called on error
      */
    def depersonalize(
      callback: js.Function1[/* personalizeContext */ PersonalizeContext, Unit],
      errorCallback: js.Function1[/* error */ MobileMessagingError, Unit]
    ): Unit = js.native
    
    /**
      * Performs depersonalization of the installation referenced by pushRegistrationId.
      *
      * @param pushRegistrationId of the remote installation to depersonalize
      * @param callback will be called on success
      * @param errorCallback will be called on error
      */
    def depersonalizeInstallation(
      pushRegistrationId: String,
      callback: js.Function1[/* installation */ Installation, Unit],
      errorCallback: js.Function1[/* error */ MobileMessagingError, Unit]
    ): Unit = js.native
    
    /**
      * Fetches installation from the server.
      *
      * @param callback will be called on success
      * @param errorCallback will be called on error
      */
    def fetchInstallation(
      callback: js.Function1[/* installation */ Installation, Unit],
      errorCallback: js.Function1[/* error */ MobileMessagingError, Unit]
    ): Unit = js.native
    
    /**
      * Fetch user data from the server.
      *
      * @param callback will be called with fetched user data on success
      * @param errorCallback will be called on error
      */
    def fetchUser(
      callback: js.Function1[/* userData */ UserData, Unit],
      errorCallback: js.Function1[/* error */ MobileMessagingError, Unit]
    ): Unit = js.native
    
    /**
      * Gets locally cached installation.
      *
      * @param callback will be called on success
      * @param errorCallback will be called on error
      */
    def getInstallation(
      callback: js.Function1[/* installation */ Installation, Unit],
      errorCallback: js.Function1[/* error */ MobileMessagingError, Unit]
    ): Unit = js.native
    
    /**
      * Gets user data from the locally stored cache.
      *
      * @param callback will be called with fetched user data on success
      * @param errorCallback will be called on error
      */
    def getUser(
      callback: js.Function1[/* userData */ UserData, Unit],
      errorCallback: js.Function1[/* error */ MobileMessagingError, Unit]
    ): Unit = js.native
    
    /**
      * Starts a new Mobile Messaging session.
      *
      * @param config. Configuration for Mobile Messaging
      * @param onInitError. Error callback
      */
    def init(config: Configuration): Unit = js.native
    def init(config: Configuration, onInitError: js.Function1[/* error */ MobileMessagingError, Unit]): Unit = js.native
    
    /**
      * Mark messages as seen
      *
      * @param messageIds of identifiers of message to mark as seen
      * @param callback will be called upon completion
      * @param errorCallback will be called on error
      */
    def markMessagesSeen(
      messageIds: js.Array[String],
      callback: js.Function1[/* messages */ js.Array[Message], Unit],
      errorCallback: js.Function1[/* error */ MobileMessagingError, Unit]
    ): Unit = js.native
    
    def off(event: Event, handler: js.Function1[/* message */ Message, Unit]): Unit = js.native
    
    def on(event: Event, handler: js.Function1[/* message */ Message, Unit]): Unit = js.native
    
    /**
      * Performs personalization of the current installation on the platform.
      *
      * @param context. An object containing user identity information as well as additional user attributes.
      * @param callback will be called on success
      * @param errorCallback will be called on error
      */
    def personalize(
      context: PersonalizeContext,
      callback: js.Function1[/* personalizeContext */ PersonalizeContext, Unit],
      errorCallback: js.Function1[/* error */ MobileMessagingError, Unit]
    ): Unit = js.native
    
    /**
      * Register to event coming from MobileMessaging library.
      * The following events are supported:
      *
      * @param event
      * @param handler will be called when event occurs
      */
    def register(event: Event, handler: js.Function1[/* message */ Message, Unit]): Unit = js.native
    
    /**
      * Saves installation to the server.
      *
      * @param installation. An object containing installation data
      * @param callback will be called on success
      * @param errorCallback will be called on error
      */
    def saveInstallation(
      installation: Installation,
      callback: js.Function1[/* data */ Installation, Unit],
      errorCallback: js.Function1[/* error */ MobileMessagingError, Unit]
    ): Unit = js.native
    
    /**
      * Saves user data to the server.
      *
      * @param userData. An object containing user data
      * @param callback will be called on success
      * @param errorCallback will be called on error
      */
    def saveUser(
      userData: UserData,
      callback: js.Function1[/* userData */ UserData, Unit],
      errorCallback: js.Function1[/* error */ MobileMessagingError, Unit]
    ): Unit = js.native
    
    /**
      * Sets any installation as primary for this user.
      *
      * @param pushRegistrationId of an installation
      * @param primary or not
      * @param callback will be called on success
      * @param errorCallback will be called on error
      */
    def setInstallationAsPrimary(
      pushRegistrationId: String,
      primary: Boolean,
      callback: js.Function1[/* installation */ Installation, Unit],
      errorCallback: js.Function1[/* error */ MobileMessagingError, Unit]
    ): Unit = js.native
    
    /**
      * Displays chat view
      * @param config
      */
    def showChat(): Unit = js.native
    def showChat(config: ChatConfig): Unit = js.native
    
    /**
      * Displays built-in error dialog so that user can resolve errors during sdk initialization.
      *
      * @param errorCode to display dialog for
      * @param callback will be called upon completion
      * @param errorCallback will be called on error
      */
    def showDialogForError(
      errorCode: Double,
      callback: js.Function0[Unit],
      errorCallback: js.Function1[/* error */ MobileMessagingError, Unit]
    ): Unit = js.native
    
    /**
      * Sends an event to the server eventually, handles possible errors and do retries for you.
      *
      * @param eventData. An object containing event data
      * {
      *   definitionId: "eventDefinitionId"
      *   properties: {
      *     "stringAttribute": "string",
      *     "numberAttribute": 1,
      *     "dateAttribute": "2020-02-26T09:41:57Z",
      *     "booleanAttribute": true
      *   }
      * }
      */
    def submitEvent(eventData: CustomEvent): Unit = js.native
    
    /**
      * Sends an event to the server immediately.
      * You have to handle possible connection or server errors, do retries yourself.
      *
      * @param eventData. An object containing event data
      * {
      *   definitionId: "eventDefinitionId"
      *   properties: {
      *     "stringAttribute": "string",
      *     "numberAttribute": 1,
      *     "dateAttribute": "2020-02-26T09:41:57Z",
      *     "booleanAttribute": true
      *   }
      * }
      * @param callback will be called on result
      * @param errorCallback will be called on error, you have to handle error and do retries yourself
      */
    def submitEventImmediately(eventData: CustomEvent, callback: js.Function0[Unit], errorCallback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Un register from MobileMessaging library event.
      *
      * @param event
      * @param handler will be unregistered from event
      */
    def unregister(event: Event, handler: js.Function1[/* message */ Message, Unit]): Unit = js.native
  }
  
  trait ChatConfig extends StObject {
    
    var ios: js.UndefOr[ShowModally] = js.undefined
  }
  object ChatConfig {
    
    inline def apply(): ChatConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChatConfig]
    }
    
    extension [Self <: ChatConfig](x: Self) {
      
      inline def setIos(value: ShowModally): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
      
      inline def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
    }
  }
  
  trait Configuration extends StObject {
    
    var android: js.UndefOr[MultipleNotifications] = js.undefined
    
    /**
      * The application code of your Application from Push Portal website
      */
    var applicationCode: String
    
    var defaultMessageStorage: js.UndefOr[Boolean] = js.undefined
    
    var geofencingEnabled: js.UndefOr[Boolean] = js.undefined
    
    var inAppChatEnabled: js.UndefOr[Boolean] = js.undefined
    
    var ios: js.UndefOr[ForceCleanup] = js.undefined
    
    /**
      * Message storage save callback
      */
    var messageStorage: js.UndefOr[String] = js.undefined
    
    var notificationCategories: js.UndefOr[js.Array[Actions]] = js.undefined
    
    var privacySettings: js.UndefOr[ApplicationCodePersistingDisabled] = js.undefined
  }
  object Configuration {
    
    inline def apply(applicationCode: String): Configuration = {
      val __obj = js.Dynamic.literal(applicationCode = applicationCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Configuration]
    }
    
    extension [Self <: Configuration](x: Self) {
      
      inline def setAndroid(value: MultipleNotifications): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
      
      inline def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
      
      inline def setApplicationCode(value: String): Self = StObject.set(x, "applicationCode", value.asInstanceOf[js.Any])
      
      inline def setDefaultMessageStorage(value: Boolean): Self = StObject.set(x, "defaultMessageStorage", value.asInstanceOf[js.Any])
      
      inline def setDefaultMessageStorageUndefined: Self = StObject.set(x, "defaultMessageStorage", js.undefined)
      
      inline def setGeofencingEnabled(value: Boolean): Self = StObject.set(x, "geofencingEnabled", value.asInstanceOf[js.Any])
      
      inline def setGeofencingEnabledUndefined: Self = StObject.set(x, "geofencingEnabled", js.undefined)
      
      inline def setInAppChatEnabled(value: Boolean): Self = StObject.set(x, "inAppChatEnabled", value.asInstanceOf[js.Any])
      
      inline def setInAppChatEnabledUndefined: Self = StObject.set(x, "inAppChatEnabled", js.undefined)
      
      inline def setIos(value: ForceCleanup): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
      
      inline def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
      
      inline def setMessageStorage(value: String): Self = StObject.set(x, "messageStorage", value.asInstanceOf[js.Any])
      
      inline def setMessageStorageUndefined: Self = StObject.set(x, "messageStorage", js.undefined)
      
      inline def setNotificationCategories(value: js.Array[Actions]): Self = StObject.set(x, "notificationCategories", value.asInstanceOf[js.Any])
      
      inline def setNotificationCategoriesUndefined: Self = StObject.set(x, "notificationCategories", js.undefined)
      
      inline def setNotificationCategoriesVarargs(value: Actions*): Self = StObject.set(x, "notificationCategories", js.Array(value*))
      
      inline def setPrivacySettings(value: ApplicationCodePersistingDisabled): Self = StObject.set(x, "privacySettings", value.asInstanceOf[js.Any])
      
      inline def setPrivacySettingsUndefined: Self = StObject.set(x, "privacySettings", js.undefined)
    }
  }
  
  trait DefaultMessageStorage extends StObject {
    
    def delete(messageId: String, callback: js.Function0[Unit]): Unit
    
    def deleteAll(callback: js.Function0[Unit]): Unit
    
    def find(messageId: String, callback: js.Function1[/* message */ Message, Unit]): Unit
    
    def findAll(callback: js.Function1[/* messages */ js.Array[Message], Unit]): Unit
  }
  object DefaultMessageStorage {
    
    inline def apply(
      delete: (String, js.Function0[Unit]) => Callback,
      deleteAll: js.Function0[Unit] => Callback,
      find: (String, js.Function1[/* message */ Message, Unit]) => Callback,
      findAll: js.Function1[/* messages */ js.Array[Message], Unit] => Callback
    ): DefaultMessageStorage = {
      val __obj = js.Dynamic.literal(delete = js.Any.fromFunction2((t0: String, t1: js.Function0[Unit]) => (delete(t0, t1)).runNow()), deleteAll = js.Any.fromFunction1((t0: js.Function0[Unit]) => deleteAll(t0).runNow()), find = js.Any.fromFunction2((t0: String, t1: js.Function1[/* message */ Message, Unit]) => (find(t0, t1)).runNow()), findAll = js.Any.fromFunction1((t0: js.Function1[/* messages */ js.Array[Message], Unit]) => findAll(t0).runNow()))
      __obj.asInstanceOf[DefaultMessageStorage]
    }
    
    extension [Self <: DefaultMessageStorage](x: Self) {
      
      inline def setDelete(value: (String, js.Function0[Unit]) => Callback): Self = StObject.set(x, "delete", js.Any.fromFunction2((t0: String, t1: js.Function0[Unit]) => (value(t0, t1)).runNow()))
      
      inline def setDeleteAll(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "deleteAll", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
      
      inline def setFind(value: (String, js.Function1[/* message */ Message, Unit]) => Callback): Self = StObject.set(x, "find", js.Any.fromFunction2((t0: String, t1: js.Function1[/* message */ Message, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setFindAll(value: js.Function1[/* messages */ js.Array[Message], Unit] => Callback): Self = StObject.set(x, "findAll", js.Any.fromFunction1((t0: js.Function1[/* messages */ js.Array[Message], Unit]) => value(t0).runNow()))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.mobileMessagingCordova.mobileMessagingCordovaStrings.messageReceived
    - typingsJapgolly.mobileMessagingCordova.mobileMessagingCordovaStrings.notificationTapped
    - typingsJapgolly.mobileMessagingCordova.mobileMessagingCordovaStrings.tokenReceived
    - typingsJapgolly.mobileMessagingCordova.mobileMessagingCordovaStrings.registrationUpdated
    - typingsJapgolly.mobileMessagingCordova.mobileMessagingCordovaStrings.geofenceEntered
    - typingsJapgolly.mobileMessagingCordova.mobileMessagingCordovaStrings.actionTapped
    - typingsJapgolly.mobileMessagingCordova.mobileMessagingCordovaStrings.installationUpdated
    - typingsJapgolly.mobileMessagingCordova.mobileMessagingCordovaStrings.userUpdated
    - typingsJapgolly.mobileMessagingCordova.mobileMessagingCordovaStrings.personalized
    - typingsJapgolly.mobileMessagingCordova.mobileMessagingCordovaStrings.depersonalized
    - typingsJapgolly.mobileMessagingCordova.mobileMessagingCordovaStrings.deeplink
  */
  trait Event extends StObject
  object Event {
    
    inline def actionTapped: typingsJapgolly.mobileMessagingCordova.mobileMessagingCordovaStrings.actionTapped = "actionTapped".asInstanceOf[typingsJapgolly.mobileMessagingCordova.mobileMessagingCordovaStrings.actionTapped]
    
    inline def deeplink: typingsJapgolly.mobileMessagingCordova.mobileMessagingCordovaStrings.deeplink = "deeplink".asInstanceOf[typingsJapgolly.mobileMessagingCordova.mobileMessagingCordovaStrings.deeplink]
    
    inline def depersonalized: typingsJapgolly.mobileMessagingCordova.mobileMessagingCordovaStrings.depersonalized = "depersonalized".asInstanceOf[typingsJapgolly.mobileMessagingCordova.mobileMessagingCordovaStrings.depersonalized]
    
    inline def geofenceEntered: typingsJapgolly.mobileMessagingCordova.mobileMessagingCordovaStrings.geofenceEntered = "geofenceEntered".asInstanceOf[typingsJapgolly.mobileMessagingCordova.mobileMessagingCordovaStrings.geofenceEntered]
    
    inline def installationUpdated: typingsJapgolly.mobileMessagingCordova.mobileMessagingCordovaStrings.installationUpdated = "installationUpdated".asInstanceOf[typingsJapgolly.mobileMessagingCordova.mobileMessagingCordovaStrings.installationUpdated]
    
    inline def messageReceived: typingsJapgolly.mobileMessagingCordova.mobileMessagingCordovaStrings.messageReceived = "messageReceived".asInstanceOf[typingsJapgolly.mobileMessagingCordova.mobileMessagingCordovaStrings.messageReceived]
    
    inline def notificationTapped: typingsJapgolly.mobileMessagingCordova.mobileMessagingCordovaStrings.notificationTapped = "notificationTapped".asInstanceOf[typingsJapgolly.mobileMessagingCordova.mobileMessagingCordovaStrings.notificationTapped]
    
    inline def personalized: typingsJapgolly.mobileMessagingCordova.mobileMessagingCordovaStrings.personalized = "personalized".asInstanceOf[typingsJapgolly.mobileMessagingCordova.mobileMessagingCordovaStrings.personalized]
    
    inline def registrationUpdated: typingsJapgolly.mobileMessagingCordova.mobileMessagingCordovaStrings.registrationUpdated = "registrationUpdated".asInstanceOf[typingsJapgolly.mobileMessagingCordova.mobileMessagingCordovaStrings.registrationUpdated]
    
    inline def tokenReceived: typingsJapgolly.mobileMessagingCordova.mobileMessagingCordovaStrings.tokenReceived = "tokenReceived".asInstanceOf[typingsJapgolly.mobileMessagingCordova.mobileMessagingCordovaStrings.tokenReceived]
    
    inline def userUpdated: typingsJapgolly.mobileMessagingCordova.mobileMessagingCordovaStrings.userUpdated = "userUpdated".asInstanceOf[typingsJapgolly.mobileMessagingCordova.mobileMessagingCordovaStrings.userUpdated]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.mobileMessagingCordova.mobileMessagingCordovaStrings.Male
    - typingsJapgolly.mobileMessagingCordova.mobileMessagingCordovaStrings.Female
  */
  trait Gender extends StObject
  object Gender {
    
    inline def Female: typingsJapgolly.mobileMessagingCordova.mobileMessagingCordovaStrings.Female = "Female".asInstanceOf[typingsJapgolly.mobileMessagingCordova.mobileMessagingCordovaStrings.Female]
    
    inline def Male: typingsJapgolly.mobileMessagingCordova.mobileMessagingCordovaStrings.Male = "Male".asInstanceOf[typingsJapgolly.mobileMessagingCordova.mobileMessagingCordovaStrings.Male]
  }
  
  trait Installation extends StObject {
    
    var appVersion: js.UndefOr[String] = js.undefined
    
    var applicationUserId: js.UndefOr[String] = js.undefined
    
    var customAttributes: js.UndefOr[Record[String, String | Double | Boolean]] = js.undefined
    
    var deviceManufacturer: js.UndefOr[String] = js.undefined
    
    var deviceModel: js.UndefOr[String] = js.undefined
    
    var deviceName: js.UndefOr[String] = js.undefined
    
    var deviceSecure: js.UndefOr[Boolean] = js.undefined
    
    var deviceTimezoneId: js.UndefOr[String] = js.undefined
    
    var geoEnabled: js.UndefOr[Boolean] = js.undefined
    
    var isPrimaryDevice: js.UndefOr[Boolean] = js.undefined
    
    var isPushRegistrationEnabled: js.UndefOr[Boolean] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
    
    var notificationsEnabled: js.UndefOr[Boolean] = js.undefined
    
    var os: js.UndefOr[OS] = js.undefined
    
    var osVersion: String
    
    var sdkVersion: js.UndefOr[String] = js.undefined
  }
  object Installation {
    
    inline def apply(osVersion: String): Installation = {
      val __obj = js.Dynamic.literal(osVersion = osVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[Installation]
    }
    
    extension [Self <: Installation](x: Self) {
      
      inline def setAppVersion(value: String): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
      
      inline def setAppVersionUndefined: Self = StObject.set(x, "appVersion", js.undefined)
      
      inline def setApplicationUserId(value: String): Self = StObject.set(x, "applicationUserId", value.asInstanceOf[js.Any])
      
      inline def setApplicationUserIdUndefined: Self = StObject.set(x, "applicationUserId", js.undefined)
      
      inline def setCustomAttributes(value: Record[String, String | Double | Boolean]): Self = StObject.set(x, "customAttributes", value.asInstanceOf[js.Any])
      
      inline def setCustomAttributesUndefined: Self = StObject.set(x, "customAttributes", js.undefined)
      
      inline def setDeviceManufacturer(value: String): Self = StObject.set(x, "deviceManufacturer", value.asInstanceOf[js.Any])
      
      inline def setDeviceManufacturerUndefined: Self = StObject.set(x, "deviceManufacturer", js.undefined)
      
      inline def setDeviceModel(value: String): Self = StObject.set(x, "deviceModel", value.asInstanceOf[js.Any])
      
      inline def setDeviceModelUndefined: Self = StObject.set(x, "deviceModel", js.undefined)
      
      inline def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
      
      inline def setDeviceNameUndefined: Self = StObject.set(x, "deviceName", js.undefined)
      
      inline def setDeviceSecure(value: Boolean): Self = StObject.set(x, "deviceSecure", value.asInstanceOf[js.Any])
      
      inline def setDeviceSecureUndefined: Self = StObject.set(x, "deviceSecure", js.undefined)
      
      inline def setDeviceTimezoneId(value: String): Self = StObject.set(x, "deviceTimezoneId", value.asInstanceOf[js.Any])
      
      inline def setDeviceTimezoneIdUndefined: Self = StObject.set(x, "deviceTimezoneId", js.undefined)
      
      inline def setGeoEnabled(value: Boolean): Self = StObject.set(x, "geoEnabled", value.asInstanceOf[js.Any])
      
      inline def setGeoEnabledUndefined: Self = StObject.set(x, "geoEnabled", js.undefined)
      
      inline def setIsPrimaryDevice(value: Boolean): Self = StObject.set(x, "isPrimaryDevice", value.asInstanceOf[js.Any])
      
      inline def setIsPrimaryDeviceUndefined: Self = StObject.set(x, "isPrimaryDevice", js.undefined)
      
      inline def setIsPushRegistrationEnabled(value: Boolean): Self = StObject.set(x, "isPushRegistrationEnabled", value.asInstanceOf[js.Any])
      
      inline def setIsPushRegistrationEnabledUndefined: Self = StObject.set(x, "isPushRegistrationEnabled", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setNotificationsEnabled(value: Boolean): Self = StObject.set(x, "notificationsEnabled", value.asInstanceOf[js.Any])
      
      inline def setNotificationsEnabledUndefined: Self = StObject.set(x, "notificationsEnabled", js.undefined)
      
      inline def setOs(value: OS): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      inline def setOsUndefined: Self = StObject.set(x, "os", js.undefined)
      
      inline def setOsVersion(value: String): Self = StObject.set(x, "osVersion", value.asInstanceOf[js.Any])
      
      inline def setSdkVersion(value: String): Self = StObject.set(x, "sdkVersion", value.asInstanceOf[js.Any])
      
      inline def setSdkVersionUndefined: Self = StObject.set(x, "sdkVersion", js.undefined)
    }
  }
  
  trait Message extends StObject {
    
    var body: js.UndefOr[String] = js.undefined
    
    var browserUrl: js.UndefOr[String] = js.undefined
    
    // Android only
    var category: js.UndefOr[String] = js.undefined
    
    // Android only
    var chat: js.UndefOr[String] = js.undefined
    
    var contentUrl: js.UndefOr[String] = js.undefined
    
    var customPayload: js.UndefOr[Record[String, String]] = js.undefined
    
    var deeplink: js.UndefOr[String] = js.undefined
    
    var geo: js.UndefOr[Boolean] = js.undefined
    
    // Android only
    var icon: js.UndefOr[String] = js.undefined
    
    var inAppDismissTitle: js.UndefOr[String] = js.undefined
    
    var internalData: js.UndefOr[String] = js.undefined
    
    var messageId: String
    
    var originalPayload: js.UndefOr[Record[String, String]] = js.undefined
    
    var receivedTimestamp: js.UndefOr[Double] = js.undefined
    
    var seen: js.UndefOr[Boolean] = js.undefined
    
    var seenDate: js.UndefOr[Double] = js.undefined
    
    var silent: js.UndefOr[String] = js.undefined
    
    var sound: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    // iOS only
    var vibrate: js.UndefOr[Boolean] = js.undefined
    
    var webViewUrl: js.UndefOr[String] = js.undefined
  }
  object Message {
    
    inline def apply(messageId: String): Message = {
      val __obj = js.Dynamic.literal(messageId = messageId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    extension [Self <: Message](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setBrowserUrl(value: String): Self = StObject.set(x, "browserUrl", value.asInstanceOf[js.Any])
      
      inline def setBrowserUrlUndefined: Self = StObject.set(x, "browserUrl", js.undefined)
      
      inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      inline def setChat(value: String): Self = StObject.set(x, "chat", value.asInstanceOf[js.Any])
      
      inline def setChatUndefined: Self = StObject.set(x, "chat", js.undefined)
      
      inline def setContentUrl(value: String): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
      
      inline def setContentUrlUndefined: Self = StObject.set(x, "contentUrl", js.undefined)
      
      inline def setCustomPayload(value: Record[String, String]): Self = StObject.set(x, "customPayload", value.asInstanceOf[js.Any])
      
      inline def setCustomPayloadUndefined: Self = StObject.set(x, "customPayload", js.undefined)
      
      inline def setDeeplink(value: String): Self = StObject.set(x, "deeplink", value.asInstanceOf[js.Any])
      
      inline def setDeeplinkUndefined: Self = StObject.set(x, "deeplink", js.undefined)
      
      inline def setGeo(value: Boolean): Self = StObject.set(x, "geo", value.asInstanceOf[js.Any])
      
      inline def setGeoUndefined: Self = StObject.set(x, "geo", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setInAppDismissTitle(value: String): Self = StObject.set(x, "inAppDismissTitle", value.asInstanceOf[js.Any])
      
      inline def setInAppDismissTitleUndefined: Self = StObject.set(x, "inAppDismissTitle", js.undefined)
      
      inline def setInternalData(value: String): Self = StObject.set(x, "internalData", value.asInstanceOf[js.Any])
      
      inline def setInternalDataUndefined: Self = StObject.set(x, "internalData", js.undefined)
      
      inline def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
      
      inline def setOriginalPayload(value: Record[String, String]): Self = StObject.set(x, "originalPayload", value.asInstanceOf[js.Any])
      
      inline def setOriginalPayloadUndefined: Self = StObject.set(x, "originalPayload", js.undefined)
      
      inline def setReceivedTimestamp(value: Double): Self = StObject.set(x, "receivedTimestamp", value.asInstanceOf[js.Any])
      
      inline def setReceivedTimestampUndefined: Self = StObject.set(x, "receivedTimestamp", js.undefined)
      
      inline def setSeen(value: Boolean): Self = StObject.set(x, "seen", value.asInstanceOf[js.Any])
      
      inline def setSeenDate(value: Double): Self = StObject.set(x, "seenDate", value.asInstanceOf[js.Any])
      
      inline def setSeenDateUndefined: Self = StObject.set(x, "seenDate", js.undefined)
      
      inline def setSeenUndefined: Self = StObject.set(x, "seen", js.undefined)
      
      inline def setSilent(value: String): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      inline def setSound(value: String): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
      
      inline def setSoundUndefined: Self = StObject.set(x, "sound", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setVibrate(value: Boolean): Self = StObject.set(x, "vibrate", value.asInstanceOf[js.Any])
      
      inline def setVibrateUndefined: Self = StObject.set(x, "vibrate", js.undefined)
      
      inline def setWebViewUrl(value: String): Self = StObject.set(x, "webViewUrl", value.asInstanceOf[js.Any])
      
      inline def setWebViewUrlUndefined: Self = StObject.set(x, "webViewUrl", js.undefined)
    }
  }
  
  trait MobileMessagingError extends StObject {
    
    var code: String
    
    var message: String
  }
  object MobileMessagingError {
    
    inline def apply(code: String, message: String): MobileMessagingError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[MobileMessagingError]
    }
    
    extension [Self <: MobileMessagingError](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.mobileMessagingCordova.mobileMessagingCordovaStrings.Android
    - typingsJapgolly.mobileMessagingCordova.mobileMessagingCordovaStrings.iOS
  */
  trait OS extends StObject
  object OS {
    
    inline def Android: typingsJapgolly.mobileMessagingCordova.mobileMessagingCordovaStrings.Android = "Android".asInstanceOf[typingsJapgolly.mobileMessagingCordova.mobileMessagingCordovaStrings.Android]
    
    inline def iOS: typingsJapgolly.mobileMessagingCordova.mobileMessagingCordovaStrings.iOS = "iOS".asInstanceOf[typingsJapgolly.mobileMessagingCordova.mobileMessagingCordovaStrings.iOS]
  }
  
  trait PersonalizeContext extends StObject {
    
    var forceDepersonalize: js.UndefOr[Boolean] = js.undefined
    
    var userAttributes: js.UndefOr[Record[String, String | Double | Boolean | js.Array[js.Object]]] = js.undefined
    
    var userIdentity: UserIdentity
  }
  object PersonalizeContext {
    
    inline def apply(userIdentity: UserIdentity): PersonalizeContext = {
      val __obj = js.Dynamic.literal(userIdentity = userIdentity.asInstanceOf[js.Any])
      __obj.asInstanceOf[PersonalizeContext]
    }
    
    extension [Self <: PersonalizeContext](x: Self) {
      
      inline def setForceDepersonalize(value: Boolean): Self = StObject.set(x, "forceDepersonalize", value.asInstanceOf[js.Any])
      
      inline def setForceDepersonalizeUndefined: Self = StObject.set(x, "forceDepersonalize", js.undefined)
      
      inline def setUserAttributes(value: Record[String, String | Double | Boolean | js.Array[js.Object]]): Self = StObject.set(x, "userAttributes", value.asInstanceOf[js.Any])
      
      inline def setUserAttributesUndefined: Self = StObject.set(x, "userAttributes", js.undefined)
      
      inline def setUserIdentity(value: UserIdentity): Self = StObject.set(x, "userIdentity", value.asInstanceOf[js.Any])
    }
  }
  
  trait UserData extends StObject {
    
    var birthday: js.UndefOr[String] = js.undefined
    
    var customAttributes: js.UndefOr[Record[String, String | Double | Boolean | js.Array[js.Object]]] = js.undefined
    
    var emails: js.UndefOr[js.Array[String]] = js.undefined
    
    var externalUserId: String
    
    var firstName: js.UndefOr[String] = js.undefined
    
    var gender: js.UndefOr[Gender] = js.undefined
    
    var lastName: js.UndefOr[String] = js.undefined
    
    var middleName: js.UndefOr[String] = js.undefined
    
    var phones: js.UndefOr[js.Array[String]] = js.undefined
    
    var tags: js.UndefOr[js.Array[String]] = js.undefined
  }
  object UserData {
    
    inline def apply(externalUserId: String): UserData = {
      val __obj = js.Dynamic.literal(externalUserId = externalUserId.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserData]
    }
    
    extension [Self <: UserData](x: Self) {
      
      inline def setBirthday(value: String): Self = StObject.set(x, "birthday", value.asInstanceOf[js.Any])
      
      inline def setBirthdayUndefined: Self = StObject.set(x, "birthday", js.undefined)
      
      inline def setCustomAttributes(value: Record[String, String | Double | Boolean | js.Array[js.Object]]): Self = StObject.set(x, "customAttributes", value.asInstanceOf[js.Any])
      
      inline def setCustomAttributesUndefined: Self = StObject.set(x, "customAttributes", js.undefined)
      
      inline def setEmails(value: js.Array[String]): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
      
      inline def setEmailsUndefined: Self = StObject.set(x, "emails", js.undefined)
      
      inline def setEmailsVarargs(value: String*): Self = StObject.set(x, "emails", js.Array(value*))
      
      inline def setExternalUserId(value: String): Self = StObject.set(x, "externalUserId", value.asInstanceOf[js.Any])
      
      inline def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
      
      inline def setFirstNameUndefined: Self = StObject.set(x, "firstName", js.undefined)
      
      inline def setGender(value: Gender): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
      
      inline def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
      
      inline def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
      
      inline def setLastNameUndefined: Self = StObject.set(x, "lastName", js.undefined)
      
      inline def setMiddleName(value: String): Self = StObject.set(x, "middleName", value.asInstanceOf[js.Any])
      
      inline def setMiddleNameUndefined: Self = StObject.set(x, "middleName", js.undefined)
      
      inline def setPhones(value: js.Array[String]): Self = StObject.set(x, "phones", value.asInstanceOf[js.Any])
      
      inline def setPhonesUndefined: Self = StObject.set(x, "phones", js.undefined)
      
      inline def setPhonesVarargs(value: String*): Self = StObject.set(x, "phones", js.Array(value*))
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    }
  }
  
  trait UserIdentity extends StObject {
    
    var emails: js.UndefOr[js.Array[String]] = js.undefined
    
    var externalUserId: String
    
    var phones: js.UndefOr[js.Array[String]] = js.undefined
  }
  object UserIdentity {
    
    inline def apply(externalUserId: String): UserIdentity = {
      val __obj = js.Dynamic.literal(externalUserId = externalUserId.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserIdentity]
    }
    
    extension [Self <: UserIdentity](x: Self) {
      
      inline def setEmails(value: js.Array[String]): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
      
      inline def setEmailsUndefined: Self = StObject.set(x, "emails", js.undefined)
      
      inline def setEmailsVarargs(value: String*): Self = StObject.set(x, "emails", js.Array(value*))
      
      inline def setExternalUserId(value: String): Self = StObject.set(x, "externalUserId", value.asInstanceOf[js.Any])
      
      inline def setPhones(value: js.Array[String]): Self = StObject.set(x, "phones", value.asInstanceOf[js.Any])
      
      inline def setPhonesUndefined: Self = StObject.set(x, "phones", js.undefined)
      
      inline def setPhonesVarargs(value: String*): Self = StObject.set(x, "phones", js.Array(value*))
    }
  }
}
