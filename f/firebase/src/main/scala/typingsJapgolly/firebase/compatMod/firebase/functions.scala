package typingsJapgolly.firebase.compatMod.firebase

import typingsJapgolly.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functions {
  
  @js.native
  trait Functions extends StObject {
    
    /**
      * Gets an `HttpsCallable` instance that refers to the function with the given
      * name.
      *
      * @param name The name of the https callable function.
      * @param options The options for this HttpsCallable instance.
      * @return The `HttpsCallable` instance.
      */
    def httpsCallable(name: String): HttpsCallable = js.native
    def httpsCallable(name: String, options: HttpsCallableOptions): HttpsCallable = js.native
    
    /**
      * Modify this instance to communicate with the Cloud Functions emulator.
      *
      * Note: this must be called before this instance has been used to do any operations.
      *
      * @param host The emulator host (ex: localhost)
      * @param port The emulator port (ex: 5001)
      */
    def useEmulator(host: String, port: Double): Unit = js.native
    
    /**
      * Changes this instance to point to a Cloud Functions emulator running
      * locally. See https://firebase.google.com/docs/functions/local-emulator
      *
      * @deprecated Prefer the useEmulator(host, port) method.
      * @param origin The origin of the local emulator, such as
      * "http://localhost:5005".
      */
    def useFunctionsEmulator(url: String): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firebase.firebaseStrings.ok
    - typingsJapgolly.firebase.firebaseStrings.cancelled
    - typingsJapgolly.firebase.firebaseStrings.unknown
    - typingsJapgolly.firebase.firebaseStrings.`invalid-argument`
    - typingsJapgolly.firebase.firebaseStrings.`deadline-exceeded`
    - typingsJapgolly.firebase.firebaseStrings.`not-found`
    - typingsJapgolly.firebase.firebaseStrings.`already-exists`
    - typingsJapgolly.firebase.firebaseStrings.`permission-denied`
    - typingsJapgolly.firebase.firebaseStrings.`resource-exhausted`
    - typingsJapgolly.firebase.firebaseStrings.`failed-precondition`
    - typingsJapgolly.firebase.firebaseStrings.aborted
    - typingsJapgolly.firebase.firebaseStrings.`out-of-range`
    - typingsJapgolly.firebase.firebaseStrings.unimplemented
    - typingsJapgolly.firebase.firebaseStrings.internal
    - typingsJapgolly.firebase.firebaseStrings.unavailable
    - typingsJapgolly.firebase.firebaseStrings.`data-loss`
    - typingsJapgolly.firebase.firebaseStrings.unauthenticated
  */
  trait FunctionsErrorCode extends StObject
  object FunctionsErrorCode {
    
    inline def aborted: typingsJapgolly.firebase.firebaseStrings.aborted = "aborted".asInstanceOf[typingsJapgolly.firebase.firebaseStrings.aborted]
    
    inline def `already-exists`: typingsJapgolly.firebase.firebaseStrings.`already-exists` = "already-exists".asInstanceOf[typingsJapgolly.firebase.firebaseStrings.`already-exists`]
    
    inline def cancelled: typingsJapgolly.firebase.firebaseStrings.cancelled = "cancelled".asInstanceOf[typingsJapgolly.firebase.firebaseStrings.cancelled]
    
    inline def `data-loss`: typingsJapgolly.firebase.firebaseStrings.`data-loss` = "data-loss".asInstanceOf[typingsJapgolly.firebase.firebaseStrings.`data-loss`]
    
    inline def `deadline-exceeded`: typingsJapgolly.firebase.firebaseStrings.`deadline-exceeded` = "deadline-exceeded".asInstanceOf[typingsJapgolly.firebase.firebaseStrings.`deadline-exceeded`]
    
    inline def `failed-precondition`: typingsJapgolly.firebase.firebaseStrings.`failed-precondition` = "failed-precondition".asInstanceOf[typingsJapgolly.firebase.firebaseStrings.`failed-precondition`]
    
    inline def internal: typingsJapgolly.firebase.firebaseStrings.internal = "internal".asInstanceOf[typingsJapgolly.firebase.firebaseStrings.internal]
    
    inline def `invalid-argument`: typingsJapgolly.firebase.firebaseStrings.`invalid-argument` = "invalid-argument".asInstanceOf[typingsJapgolly.firebase.firebaseStrings.`invalid-argument`]
    
    inline def `not-found`: typingsJapgolly.firebase.firebaseStrings.`not-found` = "not-found".asInstanceOf[typingsJapgolly.firebase.firebaseStrings.`not-found`]
    
    inline def ok: typingsJapgolly.firebase.firebaseStrings.ok = "ok".asInstanceOf[typingsJapgolly.firebase.firebaseStrings.ok]
    
    inline def `out-of-range`: typingsJapgolly.firebase.firebaseStrings.`out-of-range` = "out-of-range".asInstanceOf[typingsJapgolly.firebase.firebaseStrings.`out-of-range`]
    
    inline def `permission-denied`: typingsJapgolly.firebase.firebaseStrings.`permission-denied` = "permission-denied".asInstanceOf[typingsJapgolly.firebase.firebaseStrings.`permission-denied`]
    
    inline def `resource-exhausted`: typingsJapgolly.firebase.firebaseStrings.`resource-exhausted` = "resource-exhausted".asInstanceOf[typingsJapgolly.firebase.firebaseStrings.`resource-exhausted`]
    
    inline def unauthenticated: typingsJapgolly.firebase.firebaseStrings.unauthenticated = "unauthenticated".asInstanceOf[typingsJapgolly.firebase.firebaseStrings.unauthenticated]
    
    inline def unavailable: typingsJapgolly.firebase.firebaseStrings.unavailable = "unavailable".asInstanceOf[typingsJapgolly.firebase.firebaseStrings.unavailable]
    
    inline def unimplemented: typingsJapgolly.firebase.firebaseStrings.unimplemented = "unimplemented".asInstanceOf[typingsJapgolly.firebase.firebaseStrings.unimplemented]
    
    inline def unknown: typingsJapgolly.firebase.firebaseStrings.unknown = "unknown".asInstanceOf[typingsJapgolly.firebase.firebaseStrings.unknown]
  }
  
  type HttpsCallable = js.Function1[/* data */ js.UndefOr[Any], js.Promise[HttpsCallableResult]]
  
  trait HttpsCallableOptions extends StObject {
    
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
  
  trait HttpsCallableResult extends StObject {
    
    val data: Any
  }
  object HttpsCallableResult {
    
    inline def apply(data: Any): HttpsCallableResult = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpsCallableResult]
    }
    
    extension [Self <: HttpsCallableResult](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  trait HttpsError
    extends StObject
       with Error {
    
    /**
      * A standard error code that will be returned to the client. This also
      * determines the HTTP status code of the response, as defined in code.proto.
      */
    val code: FunctionsErrorCode
    
    /**
      * Extra data to be converted to JSON and included in the error response.
      */
    val details: js.UndefOr[Any] = js.undefined
  }
  object HttpsError {
    
    inline def apply(code: FunctionsErrorCode, message: String, name: String): HttpsError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpsError]
    }
    
    extension [Self <: HttpsError](x: Self) {
      
      inline def setCode(value: FunctionsErrorCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setDetails(value: Any): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    }
  }
}
