package typingsJapgolly.firebaseStorage.distStorageMod

import typingsJapgolly.firebaseStorage.firebaseStorageStrings.canceled
import typingsJapgolly.firebaseStorage.firebaseStorageStrings.canceling
import typingsJapgolly.firebaseStorage.firebaseStorageStrings.error
import typingsJapgolly.firebaseStorage.firebaseStorageStrings.paused
import typingsJapgolly.firebaseStorage.firebaseStorageStrings.pausing
import typingsJapgolly.firebaseStorage.firebaseStorageStrings.running
import typingsJapgolly.firebaseStorage.firebaseStorageStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Internal enum for task state.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firebaseStorage.firebaseStorageStrings.running
  - typingsJapgolly.firebaseStorage.firebaseStorageStrings.pausing
  - typingsJapgolly.firebaseStorage.firebaseStorageStrings.paused
  - typingsJapgolly.firebaseStorage.firebaseStorageStrings.success
  - typingsJapgolly.firebaseStorage.firebaseStorageStrings.canceling
  - typingsJapgolly.firebaseStorage.firebaseStorageStrings.canceled
  - typingsJapgolly.firebaseStorage.firebaseStorageStrings.error
*/
trait InternalTaskState extends StObject
object InternalTaskState {
  
  inline def CANCELED: canceled = "canceled".asInstanceOf[canceled]
  
  inline def CANCELING: canceling = "canceling".asInstanceOf[canceling]
  
  inline def ERROR: error = "error".asInstanceOf[error]
  
  inline def PAUSED: paused = "paused".asInstanceOf[paused]
  
  inline def PAUSING: pausing = "pausing".asInstanceOf[pausing]
  
  inline def RUNNING: running = "running".asInstanceOf[running]
  
  inline def SUCCESS: success = "success".asInstanceOf[success]
}
