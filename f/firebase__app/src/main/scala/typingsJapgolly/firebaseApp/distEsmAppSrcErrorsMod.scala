package typingsJapgolly.firebaseApp

import typingsJapgolly.firebaseApp.firebaseAppStrings.`app-deleted`
import typingsJapgolly.firebaseApp.firebaseAppStrings.`bad-app-name`
import typingsJapgolly.firebaseApp.firebaseAppStrings.`duplicate-app`
import typingsJapgolly.firebaseApp.firebaseAppStrings.`idb-delete`
import typingsJapgolly.firebaseApp.firebaseAppStrings.`idb-get`
import typingsJapgolly.firebaseApp.firebaseAppStrings.`idb-open`
import typingsJapgolly.firebaseApp.firebaseAppStrings.`idb-set`
import typingsJapgolly.firebaseApp.firebaseAppStrings.`invalid-app-argument`
import typingsJapgolly.firebaseApp.firebaseAppStrings.`invalid-log-argument`
import typingsJapgolly.firebaseApp.firebaseAppStrings.`no-app`
import typingsJapgolly.firebaseApp.firebaseAppStrings.`no-options`
import typingsJapgolly.firebaseUtil.mod.ErrorFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmAppSrcErrorsMod {
  
  @JSImport("@firebase/app/dist/esm/app/src/errors", "ERROR_FACTORY")
  @js.native
  val ERROR_FACTORY: ErrorFactory[AppError, ErrorParams] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firebaseApp.firebaseAppStrings.`no-app`
    - typingsJapgolly.firebaseApp.firebaseAppStrings.`bad-app-name`
    - typingsJapgolly.firebaseApp.firebaseAppStrings.`duplicate-app`
    - typingsJapgolly.firebaseApp.firebaseAppStrings.`app-deleted`
    - typingsJapgolly.firebaseApp.firebaseAppStrings.`no-options`
    - typingsJapgolly.firebaseApp.firebaseAppStrings.`invalid-app-argument`
    - typingsJapgolly.firebaseApp.firebaseAppStrings.`invalid-log-argument`
    - typingsJapgolly.firebaseApp.firebaseAppStrings.`idb-open`
    - typingsJapgolly.firebaseApp.firebaseAppStrings.`idb-get`
    - typingsJapgolly.firebaseApp.firebaseAppStrings.`idb-set`
    - typingsJapgolly.firebaseApp.firebaseAppStrings.`idb-delete`
  */
  trait AppError extends StObject
  object AppError {
    
    inline def APP_DELETED: `app-deleted` = "app-deleted".asInstanceOf[`app-deleted`]
    
    inline def BAD_APP_NAME: `bad-app-name` = "bad-app-name".asInstanceOf[`bad-app-name`]
    
    inline def DUPLICATE_APP: `duplicate-app` = "duplicate-app".asInstanceOf[`duplicate-app`]
    
    inline def IDB_DELETE: `idb-delete` = "idb-delete".asInstanceOf[`idb-delete`]
    
    inline def IDB_GET: `idb-get` = "idb-get".asInstanceOf[`idb-get`]
    
    inline def IDB_OPEN: `idb-open` = "idb-open".asInstanceOf[`idb-open`]
    
    inline def IDB_WRITE: `idb-set` = "idb-set".asInstanceOf[`idb-set`]
    
    inline def INVALID_APP_ARGUMENT: `invalid-app-argument` = "invalid-app-argument".asInstanceOf[`invalid-app-argument`]
    
    inline def INVALID_LOG_ARGUMENT: `invalid-log-argument` = "invalid-log-argument".asInstanceOf[`invalid-log-argument`]
    
    inline def NO_APP: `no-app` = "no-app".asInstanceOf[`no-app`]
    
    inline def NO_OPTIONS: `no-options` = "no-options".asInstanceOf[`no-options`]
  }
  
  @js.native
  trait ErrorParams extends StObject
}
