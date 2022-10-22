package typingsJapgolly.firebaseFunctions

import org.scalajs.dom.RequestInit
import org.scalajs.dom.Response
import org.scalajs.dom.URL
import typingsJapgolly.firebaseApp.mod.FirebaseApp
import typingsJapgolly.firebaseAppCheckInteropTypes.mod.AppCheckInternalComponentName
import typingsJapgolly.firebaseAuthInteropTypes.mod.FirebaseAuthInternalName
import typingsJapgolly.firebaseComponent.mod.Provider
import typingsJapgolly.firebaseFunctions.anon.Details
import typingsJapgolly.firebaseFunctions.anon.FnCall
import typingsJapgolly.firebaseFunctions.distEsmNodeSrcContextMod.ContextProvider
import typingsJapgolly.firebaseFunctions.distEsmNodeSrcPublicTypesMod.HttpsCallable
import typingsJapgolly.firebaseFunctions.distEsmNodeSrcPublicTypesMod.HttpsCallableOptions
import typingsJapgolly.firebaseMessagingInteropTypes.mod.MessagingInternalComponentName
import typingsJapgolly.std.RequestInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmNodeSrcServiceMod {
  
  @JSImport("@firebase/functions/dist/esm-node/src/service", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/functions/dist/esm-node/src/service", "DEFAULT_REGION")
  @js.native
  val DEFAULT_REGION: /* "us-central1" */ String = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FirebaseService * / any */ @JSImport("@firebase/functions/dist/esm-node/src/service", "FunctionsService")
  @js.native
  open class FunctionsService protected () extends StObject {
    /**
      * Creates a new Functions service for the given app.
      * @param app - The FirebaseApp to use.
      */
    def this(
      app: FirebaseApp,
      authProvider: Provider[FirebaseAuthInternalName],
      messagingProvider: Provider[MessagingInternalComponentName],
      appCheckProvider: Provider[AppCheckInternalComponentName],
      regionOrCustomDomain: String,
      fetchImpl: FnCall
    ) = this()
    def this(
      app: FirebaseApp,
      authProvider: Provider[FirebaseAuthInternalName],
      messagingProvider: Provider[MessagingInternalComponentName],
      appCheckProvider: Provider[AppCheckInternalComponentName],
      regionOrCustomDomain: Unit,
      fetchImpl: FnCall
    ) = this()
    
    def _delete(): js.Promise[Unit] = js.native
    
    /**
      * Returns the URL for a callable with the given name.
      * @param name - The name of the callable.
      * @internal
      */
    def _url(name: String): String = js.native
    
    val app: FirebaseApp = js.native
    
    var cancelAllRequests: js.Promise[Unit] = js.native
    
    val contextProvider: ContextProvider = js.native
    
    var customDomain: String | Null = js.native
    
    def deleteService(): js.Promise[Unit] = js.native
    
    var emulatorOrigin: String | Null = js.native
    
    def fetchImpl(input: URL): js.Promise[Response] = js.native
    def fetchImpl(input: URL, init: RequestInit): js.Promise[Response] = js.native
    def fetchImpl(input: RequestInfo): js.Promise[Response] = js.native
    def fetchImpl(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
    
    var region: String = js.native
  }
  
  inline def connectFunctionsEmulator(functionsInstance: FunctionsService, host: String, port: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectFunctionsEmulator")(functionsInstance.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def httpsCallable[RequestData, ResponseData](functionsInstance: FunctionsService, name: String): HttpsCallable[RequestData, ResponseData] = (^.asInstanceOf[js.Dynamic].applyDynamic("httpsCallable")(functionsInstance.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[HttpsCallable[RequestData, ResponseData]]
  inline def httpsCallable[RequestData, ResponseData](functionsInstance: FunctionsService, name: String, options: HttpsCallableOptions): HttpsCallable[RequestData, ResponseData] = (^.asInstanceOf[js.Dynamic].applyDynamic("httpsCallable")(functionsInstance.asInstanceOf[js.Any], name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HttpsCallable[RequestData, ResponseData]]
  
  inline def httpsCallableFromURL[RequestData, ResponseData](functionsInstance: FunctionsService, url: String): HttpsCallable[RequestData, ResponseData] = (^.asInstanceOf[js.Dynamic].applyDynamic("httpsCallableFromURL")(functionsInstance.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[HttpsCallable[RequestData, ResponseData]]
  inline def httpsCallableFromURL[RequestData, ResponseData](functionsInstance: FunctionsService, url: String, options: HttpsCallableOptions): HttpsCallable[RequestData, ResponseData] = (^.asInstanceOf[js.Dynamic].applyDynamic("httpsCallableFromURL")(functionsInstance.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HttpsCallable[RequestData, ResponseData]]
  
  trait HttpResponseBody extends StObject {
    
    var data: js.UndefOr[Any] = js.undefined
    
    var error: js.UndefOr[Details] = js.undefined
    
    var result: js.UndefOr[Any] = js.undefined
  }
  object HttpResponseBody {
    
    inline def apply(): HttpResponseBody = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpResponseBody]
    }
    
    extension [Self <: HttpResponseBody](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setError(value: Details): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setResult(value: Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    }
  }
}
