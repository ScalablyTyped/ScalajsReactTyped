package typingsJapgolly.reactNativeFirebase.mod.RNFirebase

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeFirebase.mod.App
import typingsJapgolly.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Source: https://github.com/firebase/firebase-js-sdk/blob/master/packages/functions-types/index.d.ts
object functions {
  
  /**
    * `FirebaseFunctions` represents a Functions app, and is the entry point for
    * all Functions operations.
    */
  trait Functions
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    /**
      * Gets an `HttpsCallable` instance that refers to the function with the given
      * name.
      *
      * @param name The name of the https callable function.
      * @return The `HttpsCallable` instance.
      */
    def httpsCallable[Params, Result](name: String): HttpsCallable[Params, Result]
    
    /**
      * Changes this instance to point to a Cloud Functions emulator running
      * locally.
      *
      * See https://firebase.google.com/docs/functions/local-emulator
      *
      * @param origin the origin string of the local emulator started via firebase tools
      * "http://10.0.0.8:1337".
      */
    def useFunctionsEmulator(origin: String): js.Promise[Null]
  }
  object Functions {
    
    inline def apply(httpsCallable: String => HttpsCallable[Any, Any], useFunctionsEmulator: String => js.Promise[Null]): Functions = {
      val __obj = js.Dynamic.literal(httpsCallable = js.Any.fromFunction1(httpsCallable), useFunctionsEmulator = js.Any.fromFunction1(useFunctionsEmulator))
      __obj.asInstanceOf[Functions]
    }
    
    extension [Self <: Functions](x: Self) {
      
      inline def setHttpsCallable(value: String => HttpsCallable[Any, Any]): Self = StObject.set(x, "httpsCallable", js.Any.fromFunction1(value))
      
      inline def setUseFunctionsEmulator(value: String => js.Promise[Null]): Self = StObject.set(x, "useFunctionsEmulator", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * The set of Firebase Functions status codes. The codes are the same at the
    * ones exposed by gRPC here:
    * https://github.com/grpc/grpc/blob/master/doc/statuscodes.md
    *
    * Possible values:
    * - 'cancelled': The operation was cancelled (typically by the caller).
    * - 'unknown': Unknown error or an error from a different error domain.
    * - 'invalid-argument': Client specified an invalid argument. Note that this
    *   differs from 'failed-precondition'. 'invalid-argument' indicates
    *   arguments that are problematic regardless of the state of the system
    *   (e.g. an invalid field name).
    * - 'deadline-exceeded': Deadline expired before operation could complete.
    *   For operations that change the state of the system, this error may be
    *   returned even if the operation has completed successfully. For example,
    *   a successful response from a server could have been delayed long enough
    *   for the deadline to expire.
    * - 'not-found': Some requested document was not found.
    * - 'already-exists': Some document that we attempted to create already
    *   exists.
    * - 'permission-denied': The caller does not have permission to execute the
    *   specified operation.
    * - 'resource-exhausted': Some resource has been exhausted, perhaps a
    *   per-user quota, or perhaps the entire file system is out of space.
    * - 'failed-precondition': Operation was rejected because the system is not
    *   in a state required for the operation's execution.
    * - 'aborted': The operation was aborted, typically due to a concurrency
    *   issue like transaction aborts, etc.
    * - 'out-of-range': Operation was attempted past the valid range.
    * - 'unimplemented': Operation is not implemented or not supported/enabled.
    * - 'internal': Internal errors. Means some invariants expected by
    *   underlying system has been broken. If you see one of these errors,
    *   something is very broken.
    * - 'unavailable': The service is currently unavailable. This is most likely
    *   a transient condition and may be corrected by retrying with a backoff.
    * - 'data-loss': Unrecoverable data loss or corruption.
    * - 'unauthenticated': The request does not have valid authentication
    *   credentials for the operation.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.ok
    - typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.cancelled
    - typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.unknown
    - typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.`invalid-argument`
    - typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.`deadline-exceeded`
    - typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.`not-found`
    - typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.`already-exists`
    - typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.`permission-denied`
    - typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.`resource-exhausted`
    - typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.`failed-precondition`
    - typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.aborted
    - typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.`out-of-range`
    - typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.unimplemented
    - typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.internal
    - typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.unavailable
    - typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.`data-loss`
    - typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.unauthenticated
  */
  trait FunctionsErrorCode extends StObject
  object FunctionsErrorCode {
    
    inline def aborted: typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.aborted = "aborted".asInstanceOf[typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.aborted]
    
    inline def `already-exists`: typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.`already-exists` = "already-exists".asInstanceOf[typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.`already-exists`]
    
    inline def cancelled: typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.cancelled = "cancelled".asInstanceOf[typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.cancelled]
    
    inline def `data-loss`: typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.`data-loss` = "data-loss".asInstanceOf[typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.`data-loss`]
    
    inline def `deadline-exceeded`: typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.`deadline-exceeded` = "deadline-exceeded".asInstanceOf[typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.`deadline-exceeded`]
    
    inline def `failed-precondition`: typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.`failed-precondition` = "failed-precondition".asInstanceOf[typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.`failed-precondition`]
    
    inline def internal: typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.internal = "internal".asInstanceOf[typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.internal]
    
    inline def `invalid-argument`: typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.`invalid-argument` = "invalid-argument".asInstanceOf[typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.`invalid-argument`]
    
    inline def `not-found`: typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.`not-found` = "not-found".asInstanceOf[typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.`not-found`]
    
    inline def ok: typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.ok = "ok".asInstanceOf[typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.ok]
    
    inline def `out-of-range`: typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.`out-of-range` = "out-of-range".asInstanceOf[typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.`out-of-range`]
    
    inline def `permission-denied`: typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.`permission-denied` = "permission-denied".asInstanceOf[typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.`permission-denied`]
    
    inline def `resource-exhausted`: typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.`resource-exhausted` = "resource-exhausted".asInstanceOf[typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.`resource-exhausted`]
    
    inline def unauthenticated: typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.unauthenticated = "unauthenticated".asInstanceOf[typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.unauthenticated]
    
    inline def unavailable: typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.unavailable = "unavailable".asInstanceOf[typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.unavailable]
    
    inline def unimplemented: typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.unimplemented = "unimplemented".asInstanceOf[typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.unimplemented]
    
    inline def unknown: typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.unknown = "unknown".asInstanceOf[typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.unknown]
  }
  
  /**
    * firebase.functions.X
    */
  @js.native
  trait FunctionsStatics extends StObject {
    
    /**
      * constructor overload:
      * See https://github.com/invertase/react-native-firebase-docs/blob/master/docs/functions/reference/functions.md
      */
    def apply(): Functions = js.native
    def apply(appOrRegion: String): Functions = js.native
    def apply(appOrRegion: String, region: String): Functions = js.native
    def apply(appOrRegion: Unit, region: String): Functions = js.native
    def apply(appOrRegion: App): Functions = js.native
    def apply(appOrRegion: App, region: String): Functions = js.native
    
    /**
      * Uppercased + underscored variables of @FunctionsErrorCode
      */
    var HttpsErrorCode: typingsJapgolly.reactNativeFirebase.mod.RNFirebase.functions.HttpsErrorCode = js.native
  }
  
  /**
    * An HttpsCallable is a reference to a "callable" http trigger in
    * Google Cloud Functions.
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Params extends void ? (): std.Promise<react-native-firebase.react-native-firebase.RNFirebase.functions.HttpsCallableResult<Result>> : (data : Params): std.Promise<react-native-firebase.react-native-firebase.RNFirebase.functions.HttpsCallableResult<Result>>
    }}}
    */
  @js.native
  trait HttpsCallable[Params, Result] extends StObject
  
  /**
    * An HttpsCallableResult wraps a single result from a function call.
    */
  trait HttpsCallableResult[R] extends StObject {
    
    val data: R
  }
  object HttpsCallableResult {
    
    inline def apply[R](data: R): HttpsCallableResult[R] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpsCallableResult[R]]
    }
    
    extension [Self <: HttpsCallableResult[?], R](x: Self & HttpsCallableResult[R]) {
      
      inline def setData(value: R): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
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
  
  type HttpsErrorCode = StringDictionary[FunctionsErrorCode]
}
