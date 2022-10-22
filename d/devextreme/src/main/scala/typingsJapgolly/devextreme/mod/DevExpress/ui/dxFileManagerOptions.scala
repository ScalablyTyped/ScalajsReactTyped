package typingsJapgolly.devextreme.mod.DevExpress.ui

import japgolly.scalajs.react.Callback
import typingsJapgolly.devextreme.anon.ChunkSize
import typingsJapgolly.devextreme.anon.Copy
import typingsJapgolly.devextreme.anon.Details
import typingsJapgolly.devextreme.anon.ShowPanel
import typingsJapgolly.devextreme.mod.DevExpress.common.SingleOrMultiple
import typingsJapgolly.devextreme.mod.DevExpress.fileManagement.FileSystemItem
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxFileManager.ContextMenuItemClickEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxFileManager.ContextMenuShowingEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxFileManager.CurrentDirectoryChangedEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxFileManager.DirectoryCreatedEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxFileManager.DirectoryCreatingEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxFileManager.ErrorOccurredEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxFileManager.FileUploadedEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxFileManager.FileUploadingEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxFileManager.FocusedItemChangedEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxFileManager.ItemCopiedEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxFileManager.ItemCopyingEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxFileManager.ItemDeletedEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxFileManager.ItemDeletingEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxFileManager.ItemDownloadingEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxFileManager.ItemMovedEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxFileManager.ItemMovingEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxFileManager.ItemRenamedEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxFileManager.ItemRenamingEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxFileManager.SelectedFileOpenedEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxFileManager.SelectionChangedEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxFileManager.ToolbarItemClickEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxFileManagerOptions
  extends StObject
     with WidgetOptions[dxFileManager] {
  
  /**
    * Specifies the allowed upload file extensions.
    */
  var allowedFileExtensions: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Configures the context menu settings.
    */
  var contextMenu: js.UndefOr[dxFileManagerContextMenu] = js.undefined
  
  /**
    * Specifies the path that is used when the FileManager is initialized.
    */
  var currentPath: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies an array of path keys to the current location.
    */
  var currentPathKeys: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Customizes columns in details view. Applies only if itemView.mode is &apos;details&apos;.
    */
  var customizeDetailColumns: js.UndefOr[
    js.Function1[
      /* columns */ js.Array[dxFileManagerDetailsColumn], 
      js.Array[dxFileManagerDetailsColumn]
    ]
  ] = js.undefined
  
  /**
    * Allows you to provide custom icons to be used as thumbnails.
    */
  var customizeThumbnail: js.UndefOr[js.Function1[/* fileSystemItem */ FileSystemItem, String]] = js.undefined
  
  /**
    * Specifies the file system provider.
    */
  var fileSystemProvider: js.UndefOr[Any] = js.undefined
  
  /**
    * Specifies a key of the initially or currently focused item.
    */
  var focusedItemKey: js.UndefOr[String] = js.undefined
  
  /**
    * Configures the file and directory view.
    */
  var itemView: js.UndefOr[Details] = js.undefined
  
  /**
    * Configures notification settings.
    */
  var notifications: js.UndefOr[ShowPanel] = js.undefined
  
  /**
    * A function that is executed when a context menu item is clicked.
    */
  var onContextMenuItemClick: js.UndefOr[js.Function1[/* e */ ContextMenuItemClickEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed before a context menu is displayed.
    */
  var onContextMenuShowing: js.UndefOr[js.Function1[/* e */ ContextMenuShowingEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when the current directory is changed.
    */
  var onCurrentDirectoryChanged: js.UndefOr[js.Function1[/* e */ CurrentDirectoryChangedEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when a directory is created.
    */
  var onDirectoryCreated: js.UndefOr[js.Function1[/* e */ DirectoryCreatedEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed before a directory is created.
    */
  var onDirectoryCreating: js.UndefOr[js.Function1[/* e */ DirectoryCreatingEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when an error occurs.
    */
  var onErrorOccurred: js.UndefOr[js.Function1[/* e */ ErrorOccurredEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when a file is successfully uploaded.
    */
  var onFileUploaded: js.UndefOr[js.Function1[/* e */ FileUploadedEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed before the file is uploaded.
    */
  var onFileUploading: js.UndefOr[js.Function1[/* e */ FileUploadingEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when the focused item is changed.
    */
  var onFocusedItemChanged: js.UndefOr[js.Function1[/* e */ FocusedItemChangedEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when a file or directory is copied.
    */
  var onItemCopied: js.UndefOr[js.Function1[/* e */ ItemCopiedEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed before a file or directory is copied.
    */
  var onItemCopying: js.UndefOr[js.Function1[/* e */ ItemCopyingEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when a file or directory is deleted.
    */
  var onItemDeleted: js.UndefOr[js.Function1[/* e */ ItemDeletedEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed before a file or directory is deleted.
    */
  var onItemDeleting: js.UndefOr[js.Function1[/* e */ ItemDeletingEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed before a file is downloaded.
    */
  var onItemDownloading: js.UndefOr[js.Function1[/* e */ ItemDownloadingEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when a file or directory is moved.
    */
  var onItemMoved: js.UndefOr[js.Function1[/* e */ ItemMovedEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed before a file or directory is moved.
    */
  var onItemMoving: js.UndefOr[js.Function1[/* e */ ItemMovingEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when a file or directory is renamed.
    */
  var onItemRenamed: js.UndefOr[js.Function1[/* e */ ItemRenamedEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed before a file or directory is renamed.
    */
  var onItemRenaming: js.UndefOr[js.Function1[/* e */ ItemRenamingEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when the selected file is opened.
    */
  var onSelectedFileOpened: js.UndefOr[js.Function1[/* e */ SelectedFileOpenedEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when a file system item is selected or selection is canceled.
    */
  var onSelectionChanged: js.UndefOr[js.Function1[/* e */ SelectionChangedEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when a toolbar item is clicked.
    */
  var onToolbarItemClick: js.UndefOr[js.Function1[/* e */ ToolbarItemClickEvent, Unit]] = js.undefined
  
  /**
    * Specifies actions that a user is allowed to perform on files and directories.
    */
  var permissions: js.UndefOr[Copy] = js.undefined
  
  /**
    * Specifies the root directory name.
    */
  var rootFolderName: js.UndefOr[String] = js.undefined
  
  /**
    * Contains an array of initially or currently selected files and directories&apos; keys.
    */
  var selectedItemKeys: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Specifies whether a user can select a single or multiple files and directories in the item view simultaneously.
    */
  var selectionMode: js.UndefOr[SingleOrMultiple] = js.undefined
  
  /**
    * Configures toolbar settings.
    */
  var toolbar: js.UndefOr[dxFileManagerToolbar] = js.undefined
  
  /**
    * Configures upload settings.
    */
  var upload: js.UndefOr[ChunkSize] = js.undefined
}
object dxFileManagerOptions {
  
  inline def apply(): dxFileManagerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxFileManagerOptions]
  }
  
  extension [Self <: dxFileManagerOptions](x: Self) {
    
    inline def setAllowedFileExtensions(value: js.Array[String]): Self = StObject.set(x, "allowedFileExtensions", value.asInstanceOf[js.Any])
    
    inline def setAllowedFileExtensionsUndefined: Self = StObject.set(x, "allowedFileExtensions", js.undefined)
    
    inline def setAllowedFileExtensionsVarargs(value: String*): Self = StObject.set(x, "allowedFileExtensions", js.Array(value*))
    
    inline def setContextMenu(value: dxFileManagerContextMenu): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
    
    inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
    
    inline def setCurrentPath(value: String): Self = StObject.set(x, "currentPath", value.asInstanceOf[js.Any])
    
    inline def setCurrentPathKeys(value: js.Array[String]): Self = StObject.set(x, "currentPathKeys", value.asInstanceOf[js.Any])
    
    inline def setCurrentPathKeysUndefined: Self = StObject.set(x, "currentPathKeys", js.undefined)
    
    inline def setCurrentPathKeysVarargs(value: String*): Self = StObject.set(x, "currentPathKeys", js.Array(value*))
    
    inline def setCurrentPathUndefined: Self = StObject.set(x, "currentPath", js.undefined)
    
    inline def setCustomizeDetailColumns(value: /* columns */ js.Array[dxFileManagerDetailsColumn] => js.Array[dxFileManagerDetailsColumn]): Self = StObject.set(x, "customizeDetailColumns", js.Any.fromFunction1(value))
    
    inline def setCustomizeDetailColumnsUndefined: Self = StObject.set(x, "customizeDetailColumns", js.undefined)
    
    inline def setCustomizeThumbnail(value: /* fileSystemItem */ FileSystemItem => String): Self = StObject.set(x, "customizeThumbnail", js.Any.fromFunction1(value))
    
    inline def setCustomizeThumbnailUndefined: Self = StObject.set(x, "customizeThumbnail", js.undefined)
    
    inline def setFileSystemProvider(value: Any): Self = StObject.set(x, "fileSystemProvider", value.asInstanceOf[js.Any])
    
    inline def setFileSystemProviderUndefined: Self = StObject.set(x, "fileSystemProvider", js.undefined)
    
    inline def setFocusedItemKey(value: String): Self = StObject.set(x, "focusedItemKey", value.asInstanceOf[js.Any])
    
    inline def setFocusedItemKeyUndefined: Self = StObject.set(x, "focusedItemKey", js.undefined)
    
    inline def setItemView(value: Details): Self = StObject.set(x, "itemView", value.asInstanceOf[js.Any])
    
    inline def setItemViewUndefined: Self = StObject.set(x, "itemView", js.undefined)
    
    inline def setNotifications(value: ShowPanel): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
    
    inline def setNotificationsUndefined: Self = StObject.set(x, "notifications", js.undefined)
    
    inline def setOnContextMenuItemClick(value: /* e */ ContextMenuItemClickEvent => Callback): Self = StObject.set(x, "onContextMenuItemClick", js.Any.fromFunction1((t0: /* e */ ContextMenuItemClickEvent) => value(t0).runNow()))
    
    inline def setOnContextMenuItemClickUndefined: Self = StObject.set(x, "onContextMenuItemClick", js.undefined)
    
    inline def setOnContextMenuShowing(value: /* e */ ContextMenuShowingEvent => Callback): Self = StObject.set(x, "onContextMenuShowing", js.Any.fromFunction1((t0: /* e */ ContextMenuShowingEvent) => value(t0).runNow()))
    
    inline def setOnContextMenuShowingUndefined: Self = StObject.set(x, "onContextMenuShowing", js.undefined)
    
    inline def setOnCurrentDirectoryChanged(value: /* e */ CurrentDirectoryChangedEvent => Callback): Self = StObject.set(x, "onCurrentDirectoryChanged", js.Any.fromFunction1((t0: /* e */ CurrentDirectoryChangedEvent) => value(t0).runNow()))
    
    inline def setOnCurrentDirectoryChangedUndefined: Self = StObject.set(x, "onCurrentDirectoryChanged", js.undefined)
    
    inline def setOnDirectoryCreated(value: /* e */ DirectoryCreatedEvent => Callback): Self = StObject.set(x, "onDirectoryCreated", js.Any.fromFunction1((t0: /* e */ DirectoryCreatedEvent) => value(t0).runNow()))
    
    inline def setOnDirectoryCreatedUndefined: Self = StObject.set(x, "onDirectoryCreated", js.undefined)
    
    inline def setOnDirectoryCreating(value: /* e */ DirectoryCreatingEvent => Callback): Self = StObject.set(x, "onDirectoryCreating", js.Any.fromFunction1((t0: /* e */ DirectoryCreatingEvent) => value(t0).runNow()))
    
    inline def setOnDirectoryCreatingUndefined: Self = StObject.set(x, "onDirectoryCreating", js.undefined)
    
    inline def setOnErrorOccurred(value: /* e */ ErrorOccurredEvent => Callback): Self = StObject.set(x, "onErrorOccurred", js.Any.fromFunction1((t0: /* e */ ErrorOccurredEvent) => value(t0).runNow()))
    
    inline def setOnErrorOccurredUndefined: Self = StObject.set(x, "onErrorOccurred", js.undefined)
    
    inline def setOnFileUploaded(value: /* e */ FileUploadedEvent => Callback): Self = StObject.set(x, "onFileUploaded", js.Any.fromFunction1((t0: /* e */ FileUploadedEvent) => value(t0).runNow()))
    
    inline def setOnFileUploadedUndefined: Self = StObject.set(x, "onFileUploaded", js.undefined)
    
    inline def setOnFileUploading(value: /* e */ FileUploadingEvent => Callback): Self = StObject.set(x, "onFileUploading", js.Any.fromFunction1((t0: /* e */ FileUploadingEvent) => value(t0).runNow()))
    
    inline def setOnFileUploadingUndefined: Self = StObject.set(x, "onFileUploading", js.undefined)
    
    inline def setOnFocusedItemChanged(value: /* e */ FocusedItemChangedEvent => Callback): Self = StObject.set(x, "onFocusedItemChanged", js.Any.fromFunction1((t0: /* e */ FocusedItemChangedEvent) => value(t0).runNow()))
    
    inline def setOnFocusedItemChangedUndefined: Self = StObject.set(x, "onFocusedItemChanged", js.undefined)
    
    inline def setOnItemCopied(value: /* e */ ItemCopiedEvent => Callback): Self = StObject.set(x, "onItemCopied", js.Any.fromFunction1((t0: /* e */ ItemCopiedEvent) => value(t0).runNow()))
    
    inline def setOnItemCopiedUndefined: Self = StObject.set(x, "onItemCopied", js.undefined)
    
    inline def setOnItemCopying(value: /* e */ ItemCopyingEvent => Callback): Self = StObject.set(x, "onItemCopying", js.Any.fromFunction1((t0: /* e */ ItemCopyingEvent) => value(t0).runNow()))
    
    inline def setOnItemCopyingUndefined: Self = StObject.set(x, "onItemCopying", js.undefined)
    
    inline def setOnItemDeleted(value: /* e */ ItemDeletedEvent => Callback): Self = StObject.set(x, "onItemDeleted", js.Any.fromFunction1((t0: /* e */ ItemDeletedEvent) => value(t0).runNow()))
    
    inline def setOnItemDeletedUndefined: Self = StObject.set(x, "onItemDeleted", js.undefined)
    
    inline def setOnItemDeleting(value: /* e */ ItemDeletingEvent => Callback): Self = StObject.set(x, "onItemDeleting", js.Any.fromFunction1((t0: /* e */ ItemDeletingEvent) => value(t0).runNow()))
    
    inline def setOnItemDeletingUndefined: Self = StObject.set(x, "onItemDeleting", js.undefined)
    
    inline def setOnItemDownloading(value: /* e */ ItemDownloadingEvent => Callback): Self = StObject.set(x, "onItemDownloading", js.Any.fromFunction1((t0: /* e */ ItemDownloadingEvent) => value(t0).runNow()))
    
    inline def setOnItemDownloadingUndefined: Self = StObject.set(x, "onItemDownloading", js.undefined)
    
    inline def setOnItemMoved(value: /* e */ ItemMovedEvent => Callback): Self = StObject.set(x, "onItemMoved", js.Any.fromFunction1((t0: /* e */ ItemMovedEvent) => value(t0).runNow()))
    
    inline def setOnItemMovedUndefined: Self = StObject.set(x, "onItemMoved", js.undefined)
    
    inline def setOnItemMoving(value: /* e */ ItemMovingEvent => Callback): Self = StObject.set(x, "onItemMoving", js.Any.fromFunction1((t0: /* e */ ItemMovingEvent) => value(t0).runNow()))
    
    inline def setOnItemMovingUndefined: Self = StObject.set(x, "onItemMoving", js.undefined)
    
    inline def setOnItemRenamed(value: /* e */ ItemRenamedEvent => Callback): Self = StObject.set(x, "onItemRenamed", js.Any.fromFunction1((t0: /* e */ ItemRenamedEvent) => value(t0).runNow()))
    
    inline def setOnItemRenamedUndefined: Self = StObject.set(x, "onItemRenamed", js.undefined)
    
    inline def setOnItemRenaming(value: /* e */ ItemRenamingEvent => Callback): Self = StObject.set(x, "onItemRenaming", js.Any.fromFunction1((t0: /* e */ ItemRenamingEvent) => value(t0).runNow()))
    
    inline def setOnItemRenamingUndefined: Self = StObject.set(x, "onItemRenaming", js.undefined)
    
    inline def setOnSelectedFileOpened(value: /* e */ SelectedFileOpenedEvent => Callback): Self = StObject.set(x, "onSelectedFileOpened", js.Any.fromFunction1((t0: /* e */ SelectedFileOpenedEvent) => value(t0).runNow()))
    
    inline def setOnSelectedFileOpenedUndefined: Self = StObject.set(x, "onSelectedFileOpened", js.undefined)
    
    inline def setOnSelectionChanged(value: /* e */ SelectionChangedEvent => Callback): Self = StObject.set(x, "onSelectionChanged", js.Any.fromFunction1((t0: /* e */ SelectionChangedEvent) => value(t0).runNow()))
    
    inline def setOnSelectionChangedUndefined: Self = StObject.set(x, "onSelectionChanged", js.undefined)
    
    inline def setOnToolbarItemClick(value: /* e */ ToolbarItemClickEvent => Callback): Self = StObject.set(x, "onToolbarItemClick", js.Any.fromFunction1((t0: /* e */ ToolbarItemClickEvent) => value(t0).runNow()))
    
    inline def setOnToolbarItemClickUndefined: Self = StObject.set(x, "onToolbarItemClick", js.undefined)
    
    inline def setPermissions(value: Copy): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setRootFolderName(value: String): Self = StObject.set(x, "rootFolderName", value.asInstanceOf[js.Any])
    
    inline def setRootFolderNameUndefined: Self = StObject.set(x, "rootFolderName", js.undefined)
    
    inline def setSelectedItemKeys(value: js.Array[String]): Self = StObject.set(x, "selectedItemKeys", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemKeysUndefined: Self = StObject.set(x, "selectedItemKeys", js.undefined)
    
    inline def setSelectedItemKeysVarargs(value: String*): Self = StObject.set(x, "selectedItemKeys", js.Array(value*))
    
    inline def setSelectionMode(value: SingleOrMultiple): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
    
    inline def setToolbar(value: dxFileManagerToolbar): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    inline def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
    
    inline def setUpload(value: ChunkSize): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
    
    inline def setUploadUndefined: Self = StObject.set(x, "upload", js.undefined)
  }
}
