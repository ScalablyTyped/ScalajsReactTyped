package typingsJapgolly.firebaseFunctions

import typingsJapgolly.firebaseApp.mod.FirebaseApp
import typingsJapgolly.firebaseUtil.mod.FirebaseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFunctionsMod {
  
  @JSImport("@firebase/functions/dist/functions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def connectFunctionsEmulator(functionsInstance: Functions, host: String, port: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectFunctionsEmulator")(functionsInstance.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getFunctions(): Functions = ^.asInstanceOf[js.Dynamic].applyDynamic("getFunctions")().asInstanceOf[Functions]
  inline def getFunctions(app: Unit, regionOrCustomDomain: String): Functions = (^.asInstanceOf[js.Dynamic].applyDynamic("getFunctions")(app.asInstanceOf[js.Any], regionOrCustomDomain.asInstanceOf[js.Any])).asInstanceOf[Functions]
  inline def getFunctions(app: FirebaseApp): Functions = ^.asInstanceOf[js.Dynamic].applyDynamic("getFunctions")(app.asInstanceOf[js.Any]).asInstanceOf[Functions]
  inline def getFunctions(app: FirebaseApp, regionOrCustomDomain: String): Functions = (^.asInstanceOf[js.Dynamic].applyDynamic("getFunctions")(app.asInstanceOf[js.Any], regionOrCustomDomain.asInstanceOf[js.Any])).asInstanceOf[Functions]
  
  inline def httpsCallable[RequestData, ResponseData](functionsInstance: Functions, name: String): HttpsCallable_[RequestData, ResponseData] = (^.asInstanceOf[js.Dynamic].applyDynamic("httpsCallable")(functionsInstance.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[HttpsCallable_[RequestData, ResponseData]]
  inline def httpsCallable[RequestData, ResponseData](functionsInstance: Functions, name: String, options: HttpsCallableOptions): HttpsCallable_[RequestData, ResponseData] = (^.asInstanceOf[js.Dynamic].applyDynamic("httpsCallable")(functionsInstance.asInstanceOf[js.Any], name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HttpsCallable_[RequestData, ResponseData]]
  
  inline def httpsCallableFromURL[RequestData, ResponseData](functionsInstance: Functions, url: String): HttpsCallable_[RequestData, ResponseData] = (^.asInstanceOf[js.Dynamic].applyDynamic("httpsCallableFromURL")(functionsInstance.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[HttpsCallable_[RequestData, ResponseData]]
  inline def httpsCallableFromURL[RequestData, ResponseData](functionsInstance: Functions, url: String, options: HttpsCallableOptions): HttpsCallable_[RequestData, ResponseData] = (^.asInstanceOf[js.Dynamic].applyDynamic("httpsCallableFromURL")(functionsInstance.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HttpsCallable_[RequestData, ResponseData]]
  
  trait Functions extends StObject {
    
    /**
      * The {@link @firebase/app#FirebaseApp} this `Functions` instance is associated with.
      */
    var app: FirebaseApp
    
    /**
      * A custom domain hosting the callable Cloud Functions.
      * ex: https://mydomain.com
      */
    var customDomain: String | Null
    
    /**
      * The region the callable Cloud Functions are located in.
      * Default is `us-central-1`.
      */
    var region: String
  }
  object Functions {
    
    inline def apply(app: FirebaseApp, region: String): Functions = {
      val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], customDomain = null)
      __obj.asInstanceOf[Functions]
    }
    
    extension [Self <: Functions](x: Self) {
      
      inline def setApp(value: FirebaseApp): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setCustomDomain(value: String): Self = StObject.set(x, "customDomain", value.asInstanceOf[js.Any])
      
      inline def setCustomDomainNull: Self = StObject.set(x, "customDomain", null)
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FunctionsError extends FirebaseError {
    
    /**
      * A standard error code that will be returned to the client. This also
      * determines the HTTP status code of the response, as defined in code.proto.
      */
    @JSName("code")
    val code_FunctionsError: FunctionsErrorCode = js.native
    
    /**
      * Extra data to be converted to JSON and included in the error response.
      */
    val details: js.UndefOr[Any] = js.native
  }
  
  type FunctionsErrorCode = /* template literal string: functions/${FunctionsErrorCodeCore} */ String
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firebaseFunctions.firebaseFunctionsStrings.ok
    - typingsJapgolly.firebaseFunctions.firebaseFunctionsStrings.cancelled
    - typingsJapgolly.firebaseFunctions.firebaseFunctionsStrings.unknown
    - typingsJapgolly.firebaseFunctions.firebaseFunctionsStrings.`invalid-argument`
    - typingsJapgolly.firebaseFunctions.firebaseFunctionsStrings.`deadline-exceeded`
    - typingsJapgolly.firebaseFunctions.firebaseFunctionsStrings.`not-found`
    - typingsJapgolly.firebaseFunctions.firebaseFunctionsStrings.`already-exists`
    - typingsJapgolly.firebaseFunctions.firebaseFunctionsStrings.`permission-denied`
    - typingsJapgolly.firebaseFunctions.firebaseFunctionsStrings.`resource-exhausted`
    - typingsJapgolly.firebaseFunctions.firebaseFunctionsStrings.`failed-precondition`
    - typingsJapgolly.firebaseFunctions.firebaseFunctionsStrings.aborted
    - typingsJapgolly.firebaseFunctions.firebaseFunctionsStrings.`out-of-range`
    - typingsJapgolly.firebaseFunctions.firebaseFunctionsStrings.unimplemented
    - typingsJapgolly.firebaseFunctions.firebaseFunctionsStrings.internal
    - typingsJapgolly.firebaseFunctions.firebaseFunctionsStrings.unavailable
    - typingsJapgolly.firebaseFunctions.firebaseFunctionsStrings.`data-loss`
    - typingsJapgolly.firebaseFunctions.firebaseFunctionsStrings.unauthenticated
  */
  trait FunctionsErrorCodeCore extends StObject
  object FunctionsErrorCodeCore {
    
    inline def aborted: typingsJapgolly.firebaseFunctions.firebaseFunctionsStrings.aborted = "aborted".asInstanceOf[typingsJapgolly.firebaseFunctions.firebaseFunctionsStrings.aborted]
    
    inline def `already-exists`: typingsJapgolly.firebaseFunctions.firebaseFunctionsStrings.`already-exists` = "already-exists".asInstanceOf[typingsJapgolly.firebaseFunctions.firebaseFunctionsStrings.`already-exists`]
    
    inline def cancelled: typingsJapgolly.firebaseFunctions.firebaseFunctionsStrings.cancelled = "cancelled".asInstanceOf[typingsJapgolly.firebaseFunctions.firebaseFunctionsStrings.cancelled]
    
    inline def `data-loss`: typingsJapgolly.firebaseFunctions.firebaseFunctionsStrings.`data-loss` = "data-loss".asInstanceOf[typingsJapgolly.firebaseFunctions.firebaseFunctionsStrings.`data-loss`]
    
    inline def `deadline-exceeded`: typingsJapgolly.firebaseFunctions.firebaseFunctionsStrings.`deadline-exceeded` = "deadline-exceeded".asInstanceOf[typingsJapgolly.firebaseFunctions.firebaseFunctionsStrings.`deadline-exceeded`]
    
    inline def `failed-precondition`: typingsJapgolly.firebaseFunctions.firebaseFunctionsStrings.`failed-precondition` = "failed-precondition".asInstanceOf[typingsJapgolly.firebaseFunctions.firebaseFunctionsStrings.`failed-precondition`]
    
    inline def internal: typingsJapgolly.firebaseFunctions.firebaseFunctionsStrings.internal = "internal".asInstanceOf[typingsJapgolly.firebaseFunctions.firebaseFunctionsStrings.internal]
    
    inline def `invalid-argument`: typingsJapgolly.firebaseFunctions.firebaseFunctionsStrings.`invalid-argument` = "invalid-argument".asInstanceOf[typingsJapgolly.firebaseFunctions.firebaseFunctionsStrings.`invalid-argument`]
    
    inline def `not-found`: typingsJapgolly.firebaseFunctions.firebaseFunctionsStrings.`not-found` = "not-found".asInstanceOf[typingsJapgolly.firebaseFunctions.firebaseFunctionsStrings.`not-found`]
    
    inline def ok: typingsJapgolly.firebaseFunctions.firebaseFunctionsStrings.ok = "ok".asInstanceOf[typingsJapgolly.firebaseFunctions.firebaseFunctionsStrings.ok]
    
    inline def `out-of-range`: typingsJapgolly.firebaseFunctions.firebaseFunctionsStrings.`out-of-range` = "out-of-range".asInstanceOf[typingsJapgolly.firebaseFunctions.firebaseFunctionsStrings.`out-of-range`]
    
    inline def `permission-denied`: typingsJapgolly.firebaseFunctions.firebaseFunctionsStrings.`permission-denied` = "permission-denied".asInstanceOf[typingsJapgolly.firebaseFunctions.firebaseFunctionsStrings.`permission-denied`]
    
    inline def `resource-exhausted`: typingsJapgolly.firebaseFunctions.firebaseFunctionsStrings.`resource-exhausted` = "resource-exhausted".asInstanceOf[typingsJapgolly.firebaseFunctions.firebaseFunctionsStrings.`resource-exhausted`]
    
    inline def unauthenticated: typingsJapgolly.firebaseFunctions.firebaseFunctionsStrings.unauthenticated = "unauthenticated".asInstanceOf[typingsJapgolly.firebaseFunctions.firebaseFunctionsStrings.unauthenticated]
    
    inline def unavailable: typingsJapgolly.firebaseFunctions.firebaseFunctionsStrings.unavailable = "unavailable".asInstanceOf[typingsJapgolly.firebaseFunctions.firebaseFunctionsStrings.unavailable]
    
    inline def unimplemented: typingsJapgolly.firebaseFunctions.firebaseFunctionsStrings.unimplemented = "unimplemented".asInstanceOf[typingsJapgolly.firebaseFunctions.firebaseFunctionsStrings.unimplemented]
    
    inline def unknown: typingsJapgolly.firebaseFunctions.firebaseFunctionsStrings.unknown = "unknown".asInstanceOf[typingsJapgolly.firebaseFunctions.firebaseFunctionsStrings.unknown]
  }
  
  trait HttpsCallableOptions extends StObject {
    
    /**
      * Time in milliseconds after which to cancel if there is no response.
      * Default is 70000.
      */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object HttpsCallableOptions {
    
    inline def apply(): HttpsCallableOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpsCallableOptions]
    }
    
    extension [Self <: HttpsCallableOptions](x: Self) {
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait HttpsCallableResult[ResponseData] extends StObject {
    
    /**
      * Data returned from callable function.
      */
    val data: ResponseData
  }
  object HttpsCallableResult {
    
    inline def apply[ResponseData](data: ResponseData): HttpsCallableResult[ResponseData] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpsCallableResult[ResponseData]]
    }
    
    extension [Self <: HttpsCallableResult[?], ResponseData](x: Self & HttpsCallableResult[ResponseData]) {
      
      inline def setData(value: ResponseData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  type HttpsCallable_[RequestData, ResponseData] = js.Function1[
    /* data */ js.UndefOr[RequestData | Null], 
    js.Promise[HttpsCallableResult[ResponseData]]
  ]
}
