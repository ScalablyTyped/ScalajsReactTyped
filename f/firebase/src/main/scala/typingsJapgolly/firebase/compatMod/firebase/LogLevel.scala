package typingsJapgolly.firebase.compatMod.firebase

import typingsJapgolly.firebase.firebaseStrings.error_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The JS SDK supports 5 log levels and also allows a user the ability to
  * silence the logs altogether.
  *
  * The order is as follows:
  * silent < debug < verbose < info < warn < error
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firebase.firebaseStrings.debug
  - typingsJapgolly.firebase.firebaseStrings.verbose
  - typingsJapgolly.firebase.firebaseStrings.info
  - typingsJapgolly.firebase.firebaseStrings.warn
  - typingsJapgolly.firebase.firebaseStrings.error_
  - typingsJapgolly.firebase.firebaseStrings.silent
*/
trait LogLevel extends StObject
object LogLevel {
  
  inline def debug: typingsJapgolly.firebase.firebaseStrings.debug = "debug".asInstanceOf[typingsJapgolly.firebase.firebaseStrings.debug]
  
  inline def error: error_ = "error".asInstanceOf[error_]
  
  inline def info: typingsJapgolly.firebase.firebaseStrings.info = "info".asInstanceOf[typingsJapgolly.firebase.firebaseStrings.info]
  
  inline def silent: typingsJapgolly.firebase.firebaseStrings.silent = "silent".asInstanceOf[typingsJapgolly.firebase.firebaseStrings.silent]
  
  inline def verbose: typingsJapgolly.firebase.firebaseStrings.verbose = "verbose".asInstanceOf[typingsJapgolly.firebase.firebaseStrings.verbose]
  
  inline def warn: typingsJapgolly.firebase.firebaseStrings.warn = "warn".asInstanceOf[typingsJapgolly.firebase.firebaseStrings.warn]
}
