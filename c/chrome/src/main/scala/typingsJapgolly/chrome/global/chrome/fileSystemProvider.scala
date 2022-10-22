package typingsJapgolly.chrome.global.chrome

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

////////////////////
// File System Provider
////////////////////
/**
  * Use the chrome.fileSystemProvider API to create file systems, that can be accessible from the file manager on Chrome OS.
  * Availability: Since Chrome 40.
  * Permissions:  "fileSystemProvider"
  * Important: This API works only on Chrome OS.
  */
object fileSystemProvider {
  
  @JSGlobal("chrome.fileSystemProvider")
  @js.native
  val ^ : js.Any = js.native
  
  inline def get(fileSystemId: String, callback: js.Function1[/* fileSystem */ FileSystemInfo, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(fileSystemId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getAll(callback: js.Function1[/* fileSystems */ js.Array[FileSystemInfo], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getAll")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def mount(options: MountOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mount")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def mount(options: MountOptions, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def notify_(options: NotificationOptions, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notify")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSGlobal("chrome.fileSystemProvider.onAbortRequested")
  @js.native
  def onAbortRequested: OperationRequestedEvent = js.native
  inline def onAbortRequested_=(x: OperationRequestedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onAbortRequested")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.fileSystemProvider.onAddWatcherRequested")
  @js.native
  def onAddWatcherRequested: EntryPathRecursiveRequestedEvent = js.native
  inline def onAddWatcherRequested_=(x: EntryPathRecursiveRequestedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onAddWatcherRequested")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.fileSystemProvider.onCloseFileRequested")
  @js.native
  def onCloseFileRequested: OpenedFileRequestedEvent = js.native
  inline def onCloseFileRequested_=(x: OpenedFileRequestedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onCloseFileRequested")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.fileSystemProvider.onConfigureRequested")
  @js.native
  def onConfigureRequested: RequestedEvent = js.native
  inline def onConfigureRequested_=(x: RequestedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onConfigureRequested")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.fileSystemProvider.onCopyEntryRequested")
  @js.native
  def onCopyEntryRequested: SourceTargetPathRequestedEvent = js.native
  inline def onCopyEntryRequested_=(x: SourceTargetPathRequestedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onCopyEntryRequested")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.fileSystemProvider.onCreateDirectoryRequested")
  @js.native
  def onCreateDirectoryRequested: DirectoryPathRecursiveRequestedEvent = js.native
  inline def onCreateDirectoryRequested_=(x: DirectoryPathRecursiveRequestedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onCreateDirectoryRequested")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.fileSystemProvider.onCreateFileRequested")
  @js.native
  def onCreateFileRequested: FilePathRequestedEvent = js.native
  inline def onCreateFileRequested_=(x: FilePathRequestedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onCreateFileRequested")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.fileSystemProvider.onDeleteEntryRequested")
  @js.native
  def onDeleteEntryRequested: EntryPathRecursiveRequestedEvent = js.native
  inline def onDeleteEntryRequested_=(x: EntryPathRecursiveRequestedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onDeleteEntryRequested")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.fileSystemProvider.onGetMetadataRequested")
  @js.native
  def onGetMetadataRequested: MetadataRequestedEvent = js.native
  inline def onGetMetadataRequested_=(x: MetadataRequestedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onGetMetadataRequested")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.fileSystemProvider.onMountRequested")
  @js.native
  def onMountRequested: OptionlessRequestedEvent = js.native
  inline def onMountRequested_=(x: OptionlessRequestedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMountRequested")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.fileSystemProvider.onMoveEntryRequested")
  @js.native
  def onMoveEntryRequested: SourceTargetPathRequestedEvent = js.native
  inline def onMoveEntryRequested_=(x: SourceTargetPathRequestedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMoveEntryRequested")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.fileSystemProvider.onOpenFileRequested")
  @js.native
  def onOpenFileRequested: OpenFileRequestedEvent = js.native
  inline def onOpenFileRequested_=(x: OpenFileRequestedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onOpenFileRequested")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.fileSystemProvider.onReadDirectoryRequested")
  @js.native
  def onReadDirectoryRequested: DirectoryPathRequestedEvent = js.native
  inline def onReadDirectoryRequested_=(x: DirectoryPathRequestedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onReadDirectoryRequested")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.fileSystemProvider.onReadFileRequested")
  @js.native
  def onReadFileRequested: OpenedFileOffsetRequestedEvent = js.native
  inline def onReadFileRequested_=(x: OpenedFileOffsetRequestedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onReadFileRequested")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.fileSystemProvider.onRemoveWatcherRequested")
  @js.native
  def onRemoveWatcherRequested: EntryPathRecursiveRequestedEvent = js.native
  inline def onRemoveWatcherRequested_=(x: EntryPathRecursiveRequestedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onRemoveWatcherRequested")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.fileSystemProvider.onTruncateRequested")
  @js.native
  def onTruncateRequested: FilePathLengthRequestedEvent = js.native
  inline def onTruncateRequested_=(x: FilePathLengthRequestedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onTruncateRequested")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.fileSystemProvider.onUnmountRequested")
  @js.native
  def onUnmountRequested: RequestedEvent = js.native
  inline def onUnmountRequested_=(x: RequestedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onUnmountRequested")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.fileSystemProvider.onWriteFileRequested")
  @js.native
  def onWriteFileRequested: OpenedFileIoRequestedEvent = js.native
  inline def onWriteFileRequested_=(x: OpenedFileIoRequestedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onWriteFileRequested")(x.asInstanceOf[js.Any])
  
  inline def unmount(options: UnmountOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unmount")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def unmount(options: UnmountOptions, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unmount")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
