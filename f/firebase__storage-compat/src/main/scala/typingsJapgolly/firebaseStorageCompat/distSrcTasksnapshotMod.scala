package typingsJapgolly.firebaseStorageCompat

import typingsJapgolly.firebaseStorageCompat.distSrcReferenceMod.ReferenceCompat
import typingsJapgolly.firebaseStorageCompat.distSrcTaskMod.UploadTaskCompat
import typingsJapgolly.firebaseStorageTypes.mod.FullMetadata
import typingsJapgolly.firebaseStorageTypes.mod.Reference
import typingsJapgolly.firebaseStorageTypes.mod.TaskState
import typingsJapgolly.firebaseStorageTypes.mod.UploadTask
import typingsJapgolly.firebaseStorageTypes.mod.UploadTaskSnapshot
import typingsJapgolly.firebaseUtil.mod.Compat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTasksnapshotMod {
  
  @JSImport("@firebase/storage-compat/dist/src/tasksnapshot", "UploadTaskSnapshotCompat")
  @js.native
  open class UploadTaskSnapshotCompat protected ()
    extends StObject
       with UploadTaskSnapshot
       with Compat[typingsJapgolly.firebaseStorage.mod.UploadTaskSnapshot] {
    def this(
      _delegate: typingsJapgolly.firebaseStorage.mod.UploadTaskSnapshot,
      task: UploadTaskCompat,
      ref: ReferenceCompat
    ) = this()
    
    /* CompleteClass */
    var _delegate: typingsJapgolly.firebaseStorage.mod.UploadTaskSnapshot = js.native
    
    /* CompleteClass */
    var bytesTransferred: Double = js.native
    @JSName("bytesTransferred")
    def bytesTransferred_MUploadTaskSnapshotCompat: Double = js.native
    
    /* CompleteClass */
    var metadata: FullMetadata = js.native
    @JSName("metadata")
    def metadata_MUploadTaskSnapshotCompat: FullMetadata = js.native
    
    /* CompleteClass */
    var ref: Reference = js.native
    @JSName("ref")
    val ref_UploadTaskSnapshotCompat: ReferenceCompat = js.native
    
    /* CompleteClass */
    var state: TaskState = js.native
    @JSName("state")
    def state_MUploadTaskSnapshotCompat: String = js.native
    
    /* CompleteClass */
    var task: UploadTask = js.native
    @JSName("task")
    val task_UploadTaskSnapshotCompat: UploadTaskCompat = js.native
    
    /* CompleteClass */
    var totalBytes: Double = js.native
    @JSName("totalBytes")
    def totalBytes_MUploadTaskSnapshotCompat: Double = js.native
  }
}
