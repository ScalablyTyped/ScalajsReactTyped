package typingsJapgolly.googleDriveRealtimeApi

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.googleDriveRealtimeApi.anon.FileIds
import typingsJapgolly.googleDriveRealtimeApi.gapi.drive.realtime.Document
import typingsJapgolly.googleDriveRealtimeApi.gapi.drive.realtime.Error
import typingsJapgolly.googleDriveRealtimeApi.gapi.drive.realtime.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// rtclient is a global var introduced by realtime-client-utils.js
object rtclient {
  
  trait ClientUtils extends StObject {
    
    var RealtimeLoader: RealtimeLoaderFactory
    
    /**
      * Creates a new Realtime file.
      * @param title {string} title of the newly created file.
      * @param mimeType {string} the MIME type of the new file.
      * @param callback {(file:DriveAPIFileResource) => void} the callback to call after creation.
      */
    def createRealtimeFile(title: String, mimeType: String, callback: js.Function1[/* file */ DriveAPIFileResource, Unit]): Unit
    
    // INCOMPLETE
    var params: FileIds
  }
  object ClientUtils {
    
    inline def apply(
      RealtimeLoader: RealtimeLoaderFactory,
      createRealtimeFile: (String, String, js.Function1[/* file */ DriveAPIFileResource, Unit]) => Callback,
      params: FileIds
    ): ClientUtils = {
      val __obj = js.Dynamic.literal(RealtimeLoader = RealtimeLoader.asInstanceOf[js.Any], createRealtimeFile = js.Any.fromFunction3((t0: String, t1: String, t2: js.Function1[/* file */ DriveAPIFileResource, Unit]) => (createRealtimeFile(t0, t1, t2)).runNow()), params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientUtils]
    }
    
    extension [Self <: ClientUtils](x: Self) {
      
      inline def setCreateRealtimeFile(value: (String, String, js.Function1[/* file */ DriveAPIFileResource, Unit]) => Callback): Self = StObject.set(x, "createRealtimeFile", js.Any.fromFunction3((t0: String, t1: String, t2: js.Function1[/* file */ DriveAPIFileResource, Unit]) => (value(t0, t1, t2)).runNow()))
      
      inline def setParams(value: FileIds): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setRealtimeLoader(value: RealtimeLoaderFactory): Self = StObject.set(x, "RealtimeLoader", value.asInstanceOf[js.Any])
    }
  }
  
  trait DriveAPIFileResource extends StObject {
    
    var id: String
  }
  object DriveAPIFileResource {
    
    inline def apply(id: String): DriveAPIFileResource = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[DriveAPIFileResource]
    }
    
    extension [Self <: DriveAPIFileResource](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait LoaderOptions extends StObject {
    
    // Function to be called after authorization and before loading files.
    def afterAuth(): Unit
    
    // Your Application ID from the Google APIs Console.
    var appId: String
    
    // The ID of the button to click to authorize. Must be a DOM element ID.
    var authButtonElementId: String
    
    // Autocreate files right after auth automatically.
    var autoCreate: Boolean
    
    // Client ID from the console.
    var clientId: String
    
    // The name of newly created Drive files, if no title is specified.
    var defaultTitle: String
    
    // Function to be called when a Realtime model is first created.
    def initializeModel(model: Model): Unit
    
    // The MIME type of newly created Drive Files. By default the application
    // specific MIME type will be used:
    // application/vnd.google-apps.drive-sdk.
    var newFileMimeType: String
    
    // Function to be called every time a Realtime file is loaded.
    def onFileLoaded(rtdoc: Document): Unit
    
    //newFileMimeType = null // default
    // Function to be called to initialize custom Collaborative Objects types.
    def registerTypes(): Unit
  }
  object LoaderOptions {
    
    inline def apply(
      afterAuth: Callback,
      appId: String,
      authButtonElementId: String,
      autoCreate: Boolean,
      clientId: String,
      defaultTitle: String,
      initializeModel: Model => Callback,
      newFileMimeType: String,
      onFileLoaded: Document => Callback,
      registerTypes: Callback
    ): LoaderOptions = {
      val __obj = js.Dynamic.literal(afterAuth = afterAuth.toJsFn, appId = appId.asInstanceOf[js.Any], authButtonElementId = authButtonElementId.asInstanceOf[js.Any], autoCreate = autoCreate.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], defaultTitle = defaultTitle.asInstanceOf[js.Any], initializeModel = js.Any.fromFunction1((t0: Model) => initializeModel(t0).runNow()), newFileMimeType = newFileMimeType.asInstanceOf[js.Any], onFileLoaded = js.Any.fromFunction1((t0: Document) => onFileLoaded(t0).runNow()), registerTypes = registerTypes.toJsFn)
      __obj.asInstanceOf[LoaderOptions]
    }
    
    extension [Self <: LoaderOptions](x: Self) {
      
      inline def setAfterAuth(value: Callback): Self = StObject.set(x, "afterAuth", value.toJsFn)
      
      inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      inline def setAuthButtonElementId(value: String): Self = StObject.set(x, "authButtonElementId", value.asInstanceOf[js.Any])
      
      inline def setAutoCreate(value: Boolean): Self = StObject.set(x, "autoCreate", value.asInstanceOf[js.Any])
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setDefaultTitle(value: String): Self = StObject.set(x, "defaultTitle", value.asInstanceOf[js.Any])
      
      inline def setInitializeModel(value: Model => Callback): Self = StObject.set(x, "initializeModel", js.Any.fromFunction1((t0: Model) => value(t0).runNow()))
      
      inline def setNewFileMimeType(value: String): Self = StObject.set(x, "newFileMimeType", value.asInstanceOf[js.Any])
      
      inline def setOnFileLoaded(value: Document => Callback): Self = StObject.set(x, "onFileLoaded", js.Any.fromFunction1((t0: Document) => value(t0).runNow()))
      
      inline def setRegisterTypes(value: Callback): Self = StObject.set(x, "registerTypes", value.toJsFn)
    }
  }
  
  trait RealtimeLoader extends StObject {
    
    def handleErrors(e: Error): Unit
    
    def load(): Unit
    
    def start(): Unit
  }
  object RealtimeLoader {
    
    inline def apply(handleErrors: Error => Callback, load: Callback, start: Callback): RealtimeLoader = {
      val __obj = js.Dynamic.literal(handleErrors = js.Any.fromFunction1((t0: Error) => handleErrors(t0).runNow()), load = load.toJsFn, start = start.toJsFn)
      __obj.asInstanceOf[RealtimeLoader]
    }
    
    extension [Self <: RealtimeLoader](x: Self) {
      
      inline def setHandleErrors(value: Error => Callback): Self = StObject.set(x, "handleErrors", js.Any.fromFunction1((t0: Error) => value(t0).runNow()))
      
      inline def setLoad(value: Callback): Self = StObject.set(x, "load", value.toJsFn)
      
      inline def setStart(value: Callback): Self = StObject.set(x, "start", value.toJsFn)
    }
  }
  
  @js.native
  trait RealtimeLoaderFactory
    extends StObject
       with Instantiable1[/* options */ LoaderOptions, RealtimeLoader]
}
