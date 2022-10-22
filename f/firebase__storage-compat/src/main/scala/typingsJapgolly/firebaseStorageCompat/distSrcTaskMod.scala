package typingsJapgolly.firebaseStorageCompat

import typingsJapgolly.firebaseStorage.mod.StorageError
import typingsJapgolly.firebaseStorage.mod.TaskEvent
import typingsJapgolly.firebaseStorageCompat.distSrcReferenceMod.ReferenceCompat
import typingsJapgolly.firebaseStorageCompat.distSrcTasksnapshotMod.UploadTaskSnapshotCompat
import typingsJapgolly.firebaseStorageTypes.mod.StorageObserver
import typingsJapgolly.firebaseStorageTypes.mod.UploadTask
import typingsJapgolly.firebaseUtil.mod.Compat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTaskMod {
  
  @JSImport("@firebase/storage-compat/dist/src/task", "UploadTaskCompat")
  @js.native
  open class UploadTaskCompat protected ()
    extends StObject
       with UploadTask
       with Compat[typingsJapgolly.firebaseStorage.mod.UploadTask] {
    def this(_delegate: typingsJapgolly.firebaseStorage.mod.UploadTask, _ref: ReferenceCompat) = this()
    
    /* CompleteClass */
    var _delegate: typingsJapgolly.firebaseStorage.mod.UploadTask = js.native
    
    /* private */ val _ref: Any = js.native
    
    def on(`type`: TaskEvent): Unsubscribe | Subscribe[UploadTaskSnapshotCompat] = js.native
    def on(`type`: TaskEvent, nextOrObserver: js.Function1[/* a */ UploadTaskSnapshotCompat, Any]): Unsubscribe | Subscribe[UploadTaskSnapshotCompat] = js.native
    def on(
      `type`: TaskEvent,
      nextOrObserver: js.Function1[/* a */ UploadTaskSnapshotCompat, Any],
      error: js.Function1[/* error */ StorageError, Unit | Null]
    ): Unsubscribe | Subscribe[UploadTaskSnapshotCompat] = js.native
    def on(
      `type`: TaskEvent,
      nextOrObserver: js.Function1[/* a */ UploadTaskSnapshotCompat, Any],
      error: js.Function1[/* error */ StorageError, Unit | Null],
      completed: js.Function0[Unit | Null]
    ): Unsubscribe | Subscribe[UploadTaskSnapshotCompat] = js.native
    def on(
      `type`: TaskEvent,
      nextOrObserver: js.Function1[/* a */ UploadTaskSnapshotCompat, Any],
      error: Unit,
      completed: js.Function0[Unit | Null]
    ): Unsubscribe | Subscribe[UploadTaskSnapshotCompat] = js.native
    def on(
      `type`: TaskEvent,
      nextOrObserver: Null,
      error: js.Function1[/* error */ StorageError, Unit | Null]
    ): Unsubscribe | Subscribe[UploadTaskSnapshotCompat] = js.native
    def on(
      `type`: TaskEvent,
      nextOrObserver: Null,
      error: js.Function1[/* error */ StorageError, Unit | Null],
      completed: js.Function0[Unit | Null]
    ): Unsubscribe | Subscribe[UploadTaskSnapshotCompat] = js.native
    def on(`type`: TaskEvent, nextOrObserver: Null, error: Unit, completed: js.Function0[Unit | Null]): Unsubscribe | Subscribe[UploadTaskSnapshotCompat] = js.native
    def on(
      `type`: TaskEvent,
      nextOrObserver: Unit,
      error: js.Function1[/* error */ StorageError, Unit | Null]
    ): Unsubscribe | Subscribe[UploadTaskSnapshotCompat] = js.native
    def on(
      `type`: TaskEvent,
      nextOrObserver: Unit,
      error: js.Function1[/* error */ StorageError, Unit | Null],
      completed: js.Function0[Unit | Null]
    ): Unsubscribe | Subscribe[UploadTaskSnapshotCompat] = js.native
    def on(`type`: TaskEvent, nextOrObserver: Unit, error: Unit, completed: js.Function0[Unit | Null]): Unsubscribe | Subscribe[UploadTaskSnapshotCompat] = js.native
    def on(`type`: TaskEvent, nextOrObserver: StorageObserver[UploadTaskSnapshotCompat]): Unsubscribe | Subscribe[UploadTaskSnapshotCompat] = js.native
    def on(
      `type`: TaskEvent,
      nextOrObserver: StorageObserver[UploadTaskSnapshotCompat],
      error: js.Function1[/* error */ StorageError, Unit | Null]
    ): Unsubscribe | Subscribe[UploadTaskSnapshotCompat] = js.native
    def on(
      `type`: TaskEvent,
      nextOrObserver: StorageObserver[UploadTaskSnapshotCompat],
      error: js.Function1[/* error */ StorageError, Unit | Null],
      completed: js.Function0[Unit | Null]
    ): Unsubscribe | Subscribe[UploadTaskSnapshotCompat] = js.native
    def on(
      `type`: TaskEvent,
      nextOrObserver: StorageObserver[UploadTaskSnapshotCompat],
      error: Unit,
      completed: js.Function0[Unit | Null]
    ): Unsubscribe | Subscribe[UploadTaskSnapshotCompat] = js.native
    
    @JSName("snapshot")
    def snapshot_MUploadTaskCompat: UploadTaskSnapshotCompat = js.native
  }
  
  type CompleteFn = js.Function0[Unit]
  
  type ErrorFn = js.Function1[/* error */ StorageError, Unit]
  
  type NextFn[T] = js.Function1[/* value */ T, Unit]
  
  type Subscribe[T] = js.Function3[
    /* next */ js.UndefOr[NextFn[T] | typingsJapgolly.firebaseStorage.mod.StorageObserver[T]], 
    /* error */ js.UndefOr[ErrorFn], 
    /* complete */ js.UndefOr[CompleteFn], 
    Unsubscribe
  ]
  
  type Unsubscribe = js.Function0[Unit]
}
