package typingsJapgolly.firebaseAppCheck

import typingsJapgolly.firebaseAppCheck.firebaseAppCheckStrings.`already-initialized`
import typingsJapgolly.firebaseAppCheck.firebaseAppCheckStrings.`fetch-network-error`
import typingsJapgolly.firebaseAppCheck.firebaseAppCheckStrings.`fetch-parse-error`
import typingsJapgolly.firebaseAppCheck.firebaseAppCheckStrings.`fetch-status-error`
import typingsJapgolly.firebaseAppCheck.firebaseAppCheckStrings.`recaptcha-error`
import typingsJapgolly.firebaseAppCheck.firebaseAppCheckStrings.`storage-get`
import typingsJapgolly.firebaseAppCheck.firebaseAppCheckStrings.`storage-open`
import typingsJapgolly.firebaseAppCheck.firebaseAppCheckStrings.`storage-set`
import typingsJapgolly.firebaseAppCheck.firebaseAppCheckStrings.`use-before-activation`
import typingsJapgolly.firebaseAppCheck.firebaseAppCheckStrings.throttled
import typingsJapgolly.firebaseUtil.mod.ErrorFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmSrcErrorsMod {
  
  @JSImport("@firebase/app-check/dist/esm/src/errors", "ERROR_FACTORY")
  @js.native
  val ERROR_FACTORY: ErrorFactory[AppCheckError, ErrorParams] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firebaseAppCheck.firebaseAppCheckStrings.`already-initialized`
    - typingsJapgolly.firebaseAppCheck.firebaseAppCheckStrings.`use-before-activation`
    - typingsJapgolly.firebaseAppCheck.firebaseAppCheckStrings.`fetch-network-error`
    - typingsJapgolly.firebaseAppCheck.firebaseAppCheckStrings.`fetch-parse-error`
    - typingsJapgolly.firebaseAppCheck.firebaseAppCheckStrings.`fetch-status-error`
    - typingsJapgolly.firebaseAppCheck.firebaseAppCheckStrings.`storage-open`
    - typingsJapgolly.firebaseAppCheck.firebaseAppCheckStrings.`storage-get`
    - typingsJapgolly.firebaseAppCheck.firebaseAppCheckStrings.`storage-set`
    - typingsJapgolly.firebaseAppCheck.firebaseAppCheckStrings.`recaptcha-error`
    - typingsJapgolly.firebaseAppCheck.firebaseAppCheckStrings.throttled
  */
  trait AppCheckError extends StObject
  object AppCheckError {
    
    inline def ALREADY_INITIALIZED: `already-initialized` = "already-initialized".asInstanceOf[`already-initialized`]
    
    inline def FETCH_NETWORK_ERROR: `fetch-network-error` = "fetch-network-error".asInstanceOf[`fetch-network-error`]
    
    inline def FETCH_PARSE_ERROR: `fetch-parse-error` = "fetch-parse-error".asInstanceOf[`fetch-parse-error`]
    
    inline def FETCH_STATUS_ERROR: `fetch-status-error` = "fetch-status-error".asInstanceOf[`fetch-status-error`]
    
    inline def RECAPTCHA_ERROR: `recaptcha-error` = "recaptcha-error".asInstanceOf[`recaptcha-error`]
    
    inline def STORAGE_GET: `storage-get` = "storage-get".asInstanceOf[`storage-get`]
    
    inline def STORAGE_OPEN: `storage-open` = "storage-open".asInstanceOf[`storage-open`]
    
    inline def STORAGE_WRITE: `storage-set` = "storage-set".asInstanceOf[`storage-set`]
    
    inline def THROTTLED: throttled = "throttled".asInstanceOf[throttled]
    
    inline def USE_BEFORE_ACTIVATION: `use-before-activation` = "use-before-activation".asInstanceOf[`use-before-activation`]
  }
  
  @js.native
  trait ErrorParams extends StObject
}
