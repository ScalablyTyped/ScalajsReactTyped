package typingsJapgolly.firebaseStorage

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

object distSrcImplementationTaskenumsMod {
  
  @JSImport("@firebase/storage/dist/src/implementation/taskenums", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object TaskEvent {
    
    @JSImport("@firebase/storage/dist/src/implementation/taskenums", "TaskEvent")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * For this event,
      * <ul>
      *   <li>The `next` function is triggered on progress updates and when the
      *       task is paused/resumed with an `UploadTaskSnapshot` as the first
      *       argument.</li>
      *   <li>The `error` function is triggered if the upload is canceled or fails
      *       for another reason.</li>
      *   <li>The `complete` function is triggered if the upload completes
      *       successfully.</li>
      * </ul>
      */
    @JSImport("@firebase/storage/dist/src/implementation/taskenums", "TaskEvent.STATE_CHANGED")
    @js.native
    def STATE_CHANGED: String = js.native
    inline def STATE_CHANGED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STATE_CHANGED")(x.asInstanceOf[js.Any])
  }
  type TaskEvent = String
  
  /* Inlined { readonly RUNNING :'running',  readonly PAUSED :'paused',  readonly SUCCESS :'success',  readonly CANCELED :'canceled',  readonly ERROR :'error'}[keyof { readonly RUNNING :'running',  readonly PAUSED :'paused',  readonly SUCCESS :'success',  readonly CANCELED :'canceled',  readonly ERROR :'error'}] */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firebaseStorage.firebaseStorageStrings.running
    - typingsJapgolly.firebaseStorage.firebaseStorageStrings.paused
    - typingsJapgolly.firebaseStorage.firebaseStorageStrings.canceled
    - typingsJapgolly.firebaseStorage.firebaseStorageStrings.error
    - typingsJapgolly.firebaseStorage.firebaseStorageStrings.success
  */
  trait TaskState extends StObject
  object TaskState {
    
    /** The task was canceled. */
    @JSImport("@firebase/storage/dist/src/implementation/taskenums", "TaskState.CANCELED")
    @js.native
    val CANCELED: canceled = js.native
    
    /** The task failed with an error. */
    @JSImport("@firebase/storage/dist/src/implementation/taskenums", "TaskState.ERROR")
    @js.native
    val ERROR: error = js.native
    
    /** The task was paused by the user. */
    @JSImport("@firebase/storage/dist/src/implementation/taskenums", "TaskState.PAUSED")
    @js.native
    val PAUSED: paused = js.native
    
    /** The task is currently transferring data. */
    @JSImport("@firebase/storage/dist/src/implementation/taskenums", "TaskState.RUNNING")
    @js.native
    val RUNNING: running = js.native
    
    /** The task completed successfully. */
    @JSImport("@firebase/storage/dist/src/implementation/taskenums", "TaskState.SUCCESS")
    @js.native
    val SUCCESS: success = js.native
  }
  
  inline def taskStateFromInternalTaskState(state: InternalTaskState): TaskState = ^.asInstanceOf[js.Dynamic].applyDynamic("taskStateFromInternalTaskState")(state.asInstanceOf[js.Any]).asInstanceOf[TaskState]
  
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
}
