package typingsJapgolly.firebaseStorage.distStorageMod

import typingsJapgolly.firebaseStorage.firebaseStorageStrings.canceled
import typingsJapgolly.firebaseStorage.firebaseStorageStrings.error
import typingsJapgolly.firebaseStorage.firebaseStorageStrings.paused
import typingsJapgolly.firebaseStorage.firebaseStorageStrings.running
import typingsJapgolly.firebaseStorage.firebaseStorageStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined { readonly RUNNING :'running',  readonly PAUSED :'paused',  readonly SUCCESS :'success',  readonly CANCELED :'canceled',  readonly ERROR :'error'}[keyof { readonly RUNNING :'running',  readonly PAUSED :'paused',  readonly SUCCESS :'success',  readonly CANCELED :'canceled',  readonly ERROR :'error'}] */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firebaseStorage.firebaseStorageStrings.running
  - typingsJapgolly.firebaseStorage.firebaseStorageStrings.paused
  - typingsJapgolly.firebaseStorage.firebaseStorageStrings.canceled
  - typingsJapgolly.firebaseStorage.firebaseStorageStrings.error
  - typingsJapgolly.firebaseStorage.firebaseStorageStrings.success
*/
trait _TaskState extends StObject
object _TaskState {
  
  /** The task was canceled. */
  @JSImport("@firebase/storage/dist/storage", "_TaskState.CANCELED")
  @js.native
  val CANCELED: canceled = js.native
  
  /** The task failed with an error. */
  @JSImport("@firebase/storage/dist/storage", "_TaskState.ERROR")
  @js.native
  val ERROR: error = js.native
  
  /** The task was paused by the user. */
  @JSImport("@firebase/storage/dist/storage", "_TaskState.PAUSED")
  @js.native
  val PAUSED: paused = js.native
  
  /** The task is currently transferring data. */
  @JSImport("@firebase/storage/dist/storage", "_TaskState.RUNNING")
  @js.native
  val RUNNING: running = js.native
  
  /** The task completed successfully. */
  @JSImport("@firebase/storage/dist/storage", "_TaskState.SUCCESS")
  @js.native
  val SUCCESS: success = js.native
}
