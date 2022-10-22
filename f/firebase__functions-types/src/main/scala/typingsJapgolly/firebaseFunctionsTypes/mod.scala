package typingsJapgolly.firebaseFunctionsTypes

import typingsJapgolly.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@firebase/functions-types", "FirebaseFunctions")
  @js.native
  /* private */ open class FirebaseFunctions () extends StObject {
    
    /**
      * Gets an `HttpsCallable` instance that refers to the function with the given
      * name.
      *
      * @param name The name of the https callable function.
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
    def useFunctionsEmulator(origin: String): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.ok
    - typingsJapgolly.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.cancelled
    - typingsJapgolly.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.unknown
    - typingsJapgolly.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.`invalid-argument`
    - typingsJapgolly.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.`deadline-exceeded`
    - typingsJapgolly.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.`not-found`
    - typingsJapgolly.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.`already-exists`
    - typingsJapgolly.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.`permission-denied`
    - typingsJapgolly.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.`resource-exhausted`
    - typingsJapgolly.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.`failed-precondition`
    - typingsJapgolly.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.aborted
    - typingsJapgolly.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.`out-of-range`
    - typingsJapgolly.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.unimplemented
    - typingsJapgolly.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.internal
    - typingsJapgolly.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.unavailable
    - typingsJapgolly.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.`data-loss`
    - typingsJapgolly.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.unauthenticated
  */
  trait FunctionsErrorCode extends StObject
  object FunctionsErrorCode {
    
    inline def aborted: typingsJapgolly.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.aborted = "aborted".asInstanceOf[typingsJapgolly.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.aborted]
    
    inline def `already-exists`: typingsJapgolly.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.`already-exists` = "already-exists".asInstanceOf[typingsJapgolly.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.`already-exists`]
    
    inline def cancelled: typingsJapgolly.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.cancelled = "cancelled".asInstanceOf[typingsJapgolly.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.cancelled]
    
    inline def `data-loss`: typingsJapgolly.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.`data-loss` = "data-loss".asInstanceOf[typingsJapgolly.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.`data-loss`]
    
    inline def `deadline-exceeded`: typingsJapgolly.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.`deadline-exceeded` = "deadline-exceeded".asInstanceOf[typingsJapgolly.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.`deadline-exceeded`]
    
    inline def `failed-precondition`: typingsJapgolly.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.`failed-precondition` = "failed-precondition".asInstanceOf[typingsJapgolly.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.`failed-precondition`]
    
    inline def internal: typingsJapgolly.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.internal = "internal".asInstanceOf[typingsJapgolly.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.internal]
    
    inline def `invalid-argument`: typingsJapgolly.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.`invalid-argument` = "invalid-argument".asInstanceOf[typingsJapgolly.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.`invalid-argument`]
    
    inline def `not-found`: typingsJapgolly.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.`not-found` = "not-found".asInstanceOf[typingsJapgolly.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.`not-found`]
    
    inline def ok: typingsJapgolly.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.ok = "ok".asInstanceOf[typingsJapgolly.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.ok]
    
    inline def `out-of-range`: typingsJapgolly.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.`out-of-range` = "out-of-range".asInstanceOf[typingsJapgolly.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.`out-of-range`]
    
    inline def `permission-denied`: typingsJapgolly.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.`permission-denied` = "permission-denied".asInstanceOf[typingsJapgolly.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.`permission-denied`]
    
    inline def `resource-exhausted`: typingsJapgolly.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.`resource-exhausted` = "resource-exhausted".asInstanceOf[typingsJapgolly.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.`resource-exhausted`]
    
    inline def unauthenticated: typingsJapgolly.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.unauthenticated = "unauthenticated".asInstanceOf[typingsJapgolly.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.unauthenticated]
    
    inline def unavailable: typingsJapgolly.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.unavailable = "unavailable".asInstanceOf[typingsJapgolly.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.unavailable]
    
    inline def unimplemented: typingsJapgolly.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.unimplemented = "unimplemented".asInstanceOf[typingsJapgolly.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.unimplemented]
    
    inline def unknown: typingsJapgolly.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.unknown = "unknown".asInstanceOf[typingsJapgolly.firebaseFunctionsTypes.firebaseFunctionsTypesStrings.unknown]
  }
  
  type HttpsCallable = js.Function1[/* data */ js.UndefOr[js.Object | Null], js.Promise[HttpsCallableResult]]
  
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
  
  /* augmented module */
  object firebaseComponentAugmentingMod {
    
    trait NameServiceMapping extends StObject {
      
      var `functions-compat`: FirebaseFunctions
    }
    object NameServiceMapping {
      
      inline def apply(`functions-compat`: FirebaseFunctions): NameServiceMapping = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("functions-compat")(`functions-compat`.asInstanceOf[js.Any])
        __obj.asInstanceOf[NameServiceMapping]
      }
      
      extension [Self <: NameServiceMapping](x: Self) {
        
        inline def `setFunctions-compat`(value: FirebaseFunctions): Self = StObject.set(x, "functions-compat", value.asInstanceOf[js.Any])
      }
    }
  }
}
