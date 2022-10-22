package typingsJapgolly.chrome.anon

import typingsJapgolly.chrome.chrome.fileSystemProvider.DirectoryPathRecursiveRequestedEvent
import typingsJapgolly.chrome.chrome.fileSystemProvider.DirectoryPathRequestedEvent
import typingsJapgolly.chrome.chrome.fileSystemProvider.EntryPathRecursiveRequestedEvent
import typingsJapgolly.chrome.chrome.fileSystemProvider.FilePathLengthRequestedEvent
import typingsJapgolly.chrome.chrome.fileSystemProvider.FilePathRequestedEvent
import typingsJapgolly.chrome.chrome.fileSystemProvider.FileSystemInfo
import typingsJapgolly.chrome.chrome.fileSystemProvider.MetadataRequestedEvent
import typingsJapgolly.chrome.chrome.fileSystemProvider.MountOptions
import typingsJapgolly.chrome.chrome.fileSystemProvider.NotificationOptions
import typingsJapgolly.chrome.chrome.fileSystemProvider.OpenFileRequestedEvent
import typingsJapgolly.chrome.chrome.fileSystemProvider.OpenedFileIoRequestedEvent
import typingsJapgolly.chrome.chrome.fileSystemProvider.OpenedFileOffsetRequestedEvent
import typingsJapgolly.chrome.chrome.fileSystemProvider.OpenedFileRequestedEvent
import typingsJapgolly.chrome.chrome.fileSystemProvider.OperationRequestedEvent
import typingsJapgolly.chrome.chrome.fileSystemProvider.OptionlessRequestedEvent
import typingsJapgolly.chrome.chrome.fileSystemProvider.RequestedEvent
import typingsJapgolly.chrome.chrome.fileSystemProvider.SourceTargetPathRequestedEvent
import typingsJapgolly.chrome.chrome.fileSystemProvider.UnmountOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeoffileSystemProvider extends StObject {
  
  def get(fileSystemId: String, callback: js.Function1[/* fileSystem */ FileSystemInfo, Unit]): Unit = js.native
  
  def getAll(callback: js.Function1[/* fileSystems */ js.Array[FileSystemInfo], Unit]): Unit = js.native
  
  def mount(options: MountOptions): Unit = js.native
  def mount(options: MountOptions, callback: js.Function0[Unit]): Unit = js.native
  
  def notify(options: NotificationOptions, callback: js.Function0[Unit]): Unit = js.native
  
  var onAbortRequested: OperationRequestedEvent = js.native
  
  var onAddWatcherRequested: EntryPathRecursiveRequestedEvent = js.native
  
  var onCloseFileRequested: OpenedFileRequestedEvent = js.native
  
  var onConfigureRequested: RequestedEvent = js.native
  
  var onCopyEntryRequested: SourceTargetPathRequestedEvent = js.native
  
  var onCreateDirectoryRequested: DirectoryPathRecursiveRequestedEvent = js.native
  
  var onCreateFileRequested: FilePathRequestedEvent = js.native
  
  var onDeleteEntryRequested: EntryPathRecursiveRequestedEvent = js.native
  
  var onGetMetadataRequested: MetadataRequestedEvent = js.native
  
  var onMountRequested: OptionlessRequestedEvent = js.native
  
  var onMoveEntryRequested: SourceTargetPathRequestedEvent = js.native
  
  var onOpenFileRequested: OpenFileRequestedEvent = js.native
  
  var onReadDirectoryRequested: DirectoryPathRequestedEvent = js.native
  
  var onReadFileRequested: OpenedFileOffsetRequestedEvent = js.native
  
  var onRemoveWatcherRequested: EntryPathRecursiveRequestedEvent = js.native
  
  var onTruncateRequested: FilePathLengthRequestedEvent = js.native
  
  var onUnmountRequested: RequestedEvent = js.native
  
  var onWriteFileRequested: OpenedFileIoRequestedEvent = js.native
  
  def unmount(options: UnmountOptions): Unit = js.native
  def unmount(options: UnmountOptions, callback: js.Function0[Unit]): Unit = js.native
}
