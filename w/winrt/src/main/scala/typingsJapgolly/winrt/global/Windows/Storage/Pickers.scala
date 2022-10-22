package typingsJapgolly.winrt.global.Windows.Storage

import typingsJapgolly.winrt.Windows.Foundation.Collections.IIterator
import typingsJapgolly.winrt.Windows.Foundation.Collections.IKeyValuePair
import typingsJapgolly.winrt.Windows.Foundation.Collections.IMap
import typingsJapgolly.winrt.Windows.Foundation.Collections.IMapView
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.Collections.ValueSet
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Storage.IStorageFile
import typingsJapgolly.winrt.Windows.Storage.Pickers.PickerLocationId
import typingsJapgolly.winrt.Windows.Storage.Pickers.PickerViewMode
import typingsJapgolly.winrt.Windows.Storage.Pickers.Provider.AddFileResult
import typingsJapgolly.winrt.Windows.Storage.Pickers.Provider.FileSelectionMode
import typingsJapgolly.winrt.Windows.Storage.Pickers.Provider.SetFileNameResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Pickers {
  
  @JSGlobal("Windows.Storage.Pickers.FileExtensionVector")
  @js.native
  open class FileExtensionVector ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Storage.Pickers.FileExtensionVector {
    
    /* CompleteClass */
    override def first(): IIterator[String] = js.native
  }
  
  @JSGlobal("Windows.Storage.Pickers.FileOpenPicker")
  @js.native
  open class FileOpenPicker ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Storage.Pickers.FileOpenPicker {
    
    /* CompleteClass */
    var commitButtonText: String = js.native
    
    /* CompleteClass */
    var continuationData: ValueSet = js.native
    
    /* CompleteClass */
    var fileTypeFilter: IVector[String] = js.native
    
    /* CompleteClass */
    override def pickMultipleFilesAndContinue(): Unit = js.native
    
    /* CompleteClass */
    override def pickMultipleFilesAsync(): IAsyncOperation[IVectorView[typingsJapgolly.winrt.Windows.Storage.StorageFile]] = js.native
    
    /* CompleteClass */
    override def pickSingleFileAndContinue(): Unit = js.native
    
    /* CompleteClass */
    override def pickSingleFileAsync(): IAsyncOperation[typingsJapgolly.winrt.Windows.Storage.StorageFile] = js.native
    
    /* CompleteClass */
    var settingsIdentifier: String = js.native
    
    /* CompleteClass */
    var suggestedStartLocation: PickerLocationId = js.native
    
    /* CompleteClass */
    var viewMode: PickerViewMode = js.native
  }
  
  @JSGlobal("Windows.Storage.Pickers.FilePickerFileTypesOrderedMap")
  @js.native
  open class FilePickerFileTypesOrderedMap ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Storage.Pickers.FilePickerFileTypesOrderedMap {
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    override def first(): IIterator[IKeyValuePair[String, IVector[String]]] = js.native
    
    /* CompleteClass */
    override def getView(): IMapView[String, IVector[String]] = js.native
    
    /* CompleteClass */
    override def hasKey(key: String): Boolean = js.native
    
    /* CompleteClass */
    override def insert(key: String, value: IVector[String]): Boolean = js.native
    
    /* CompleteClass */
    override def lookup(key: String): IVector[String] = js.native
    
    /* CompleteClass */
    override def remove(key: String): Unit = js.native
    
    /* CompleteClass */
    var size: Double = js.native
  }
  
  @JSGlobal("Windows.Storage.Pickers.FilePickerSelectedFilesArray")
  @js.native
  open class FilePickerSelectedFilesArray ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Storage.Pickers.FilePickerSelectedFilesArray {
    
    /* CompleteClass */
    override def first(): IIterator[typingsJapgolly.winrt.Windows.Storage.StorageFile] = js.native
  }
  
  @JSGlobal("Windows.Storage.Pickers.FileSavePicker")
  @js.native
  open class FileSavePicker ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Storage.Pickers.FileSavePicker {
    
    /* CompleteClass */
    var commitButtonText: String = js.native
    
    /* CompleteClass */
    var continuationData: ValueSet = js.native
    
    /* CompleteClass */
    var defaultFileExtension: String = js.native
    
    /* CompleteClass */
    var fileTypeChoices: IMap[String, IVector[String]] = js.native
    
    /* CompleteClass */
    override def pickSaveFileAndContinue(): Unit = js.native
    
    /* CompleteClass */
    override def pickSaveFileAsync(): IAsyncOperation[typingsJapgolly.winrt.Windows.Storage.StorageFile] = js.native
    
    /* CompleteClass */
    var settingsIdentifier: String = js.native
    
    /* CompleteClass */
    var suggestedFileName: String = js.native
    
    /* CompleteClass */
    var suggestedSaveFile: typingsJapgolly.winrt.Windows.Storage.StorageFile = js.native
    
    /* CompleteClass */
    var suggestedStartLocation: PickerLocationId = js.native
  }
  
  @JSGlobal("Windows.Storage.Pickers.FolderPicker")
  @js.native
  open class FolderPicker ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Storage.Pickers.FolderPicker {
    
    /* CompleteClass */
    var commitButtonText: String = js.native
    
    /* CompleteClass */
    var continuationData: ValueSet = js.native
    
    /* CompleteClass */
    var fileTypeFilter: IVector[String] = js.native
    
    /* CompleteClass */
    override def pickFolderAndContinue(): Unit = js.native
    
    /* CompleteClass */
    override def pickSingleFolderAsync(): IAsyncOperation[typingsJapgolly.winrt.Windows.Storage.StorageFolder] = js.native
    
    /* CompleteClass */
    var settingsIdentifier: String = js.native
    
    /* CompleteClass */
    var suggestedStartLocation: PickerLocationId = js.native
    
    /* CompleteClass */
    var viewMode: PickerViewMode = js.native
  }
  
  @JSGlobal("Windows.Storage.Pickers.PickerLocationId")
  @js.native
  object PickerLocationId extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Storage.Pickers.PickerLocationId & Double] = js.native
    
    /* 1 */ val computerFolder: typingsJapgolly.winrt.Windows.Storage.Pickers.PickerLocationId.computerFolder & Double = js.native
    
    /* 2 */ val desktop: typingsJapgolly.winrt.Windows.Storage.Pickers.PickerLocationId.desktop & Double = js.native
    
    /* 0 */ val documentsLibrary: typingsJapgolly.winrt.Windows.Storage.Pickers.PickerLocationId.documentsLibrary & Double = js.native
    
    /* 3 */ val downloads: typingsJapgolly.winrt.Windows.Storage.Pickers.PickerLocationId.downloads & Double = js.native
    
    /* 4 */ val homeGroup: typingsJapgolly.winrt.Windows.Storage.Pickers.PickerLocationId.homeGroup & Double = js.native
    
    /* 5 */ val musicLibrary: typingsJapgolly.winrt.Windows.Storage.Pickers.PickerLocationId.musicLibrary & Double = js.native
    
    /* 6 */ val picturesLibrary: typingsJapgolly.winrt.Windows.Storage.Pickers.PickerLocationId.picturesLibrary & Double = js.native
    
    /* 7 */ val videosLibrary: typingsJapgolly.winrt.Windows.Storage.Pickers.PickerLocationId.videosLibrary & Double = js.native
  }
  
  @JSGlobal("Windows.Storage.Pickers.PickerViewMode")
  @js.native
  object PickerViewMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Storage.Pickers.PickerViewMode & Double] = js.native
    
    /* 0 */ val list: typingsJapgolly.winrt.Windows.Storage.Pickers.PickerViewMode.list & Double = js.native
    
    /* 1 */ val thumbnail: typingsJapgolly.winrt.Windows.Storage.Pickers.PickerViewMode.thumbnail & Double = js.native
  }
  
  object Provider {
    
    @JSGlobal("Windows.Storage.Pickers.Provider.AddFileResult")
    @js.native
    object AddFileResult extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Storage.Pickers.Provider.AddFileResult & Double] = js.native
      
      /* 0 */ val added: typingsJapgolly.winrt.Windows.Storage.Pickers.Provider.AddFileResult.added & Double = js.native
      
      /* 1 */ val alreadyAdded: typingsJapgolly.winrt.Windows.Storage.Pickers.Provider.AddFileResult.alreadyAdded & Double = js.native
      
      /* 2 */ val notAllowed: typingsJapgolly.winrt.Windows.Storage.Pickers.Provider.AddFileResult.notAllowed & Double = js.native
      
      /* 3 */ val unavailable: typingsJapgolly.winrt.Windows.Storage.Pickers.Provider.AddFileResult.unavailable & Double = js.native
    }
    
    @JSGlobal("Windows.Storage.Pickers.Provider.FileOpenPickerUI")
    @js.native
    open class FileOpenPickerUI ()
      extends StObject
         with typingsJapgolly.winrt.Windows.Storage.Pickers.Provider.FileOpenPickerUI {
      
      /* CompleteClass */
      override def addFile(id: String, file: IStorageFile): AddFileResult = js.native
      
      /* CompleteClass */
      var allowedFileTypes: IVectorView[String] = js.native
      
      /* CompleteClass */
      override def canAddFile(file: IStorageFile): Boolean = js.native
      
      /* CompleteClass */
      override def containsFile(id: String): Boolean = js.native
      
      /* CompleteClass */
      var onclosing: Any = js.native
      
      /* CompleteClass */
      var onfileremoved: Any = js.native
      
      /* CompleteClass */
      override def removeFile(id: String): Unit = js.native
      
      /* CompleteClass */
      var selectionMode: FileSelectionMode = js.native
      
      /* CompleteClass */
      var settingsIdentifier: String = js.native
      
      /* CompleteClass */
      var title: String = js.native
    }
    
    @JSGlobal("Windows.Storage.Pickers.Provider.FileRemovedEventArgs")
    @js.native
    open class FileRemovedEventArgs ()
      extends StObject
         with typingsJapgolly.winrt.Windows.Storage.Pickers.Provider.FileRemovedEventArgs {
      
      /* CompleteClass */
      var id: String = js.native
    }
    
    @JSGlobal("Windows.Storage.Pickers.Provider.FileSavePickerUI")
    @js.native
    open class FileSavePickerUI ()
      extends StObject
         with typingsJapgolly.winrt.Windows.Storage.Pickers.Provider.FileSavePickerUI {
      
      /* CompleteClass */
      var allowedFileTypes: IVectorView[String] = js.native
      
      /* CompleteClass */
      var fileName: String = js.native
      
      /* CompleteClass */
      var onfilenamechanged: Any = js.native
      
      /* CompleteClass */
      var ontargetfilerequested: Any = js.native
      
      /* CompleteClass */
      var settingsIdentifier: String = js.native
      
      /* CompleteClass */
      var title: String = js.native
      
      /* CompleteClass */
      override def trySetFileName(value: String): SetFileNameResult = js.native
    }
    
    @JSGlobal("Windows.Storage.Pickers.Provider.FileSelectionMode")
    @js.native
    object FileSelectionMode extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsJapgolly.winrt.Windows.Storage.Pickers.Provider.FileSelectionMode & Double
          ] = js.native
      
      /* 1 */ val multiple: typingsJapgolly.winrt.Windows.Storage.Pickers.Provider.FileSelectionMode.multiple & Double = js.native
      
      /* 0 */ val single: typingsJapgolly.winrt.Windows.Storage.Pickers.Provider.FileSelectionMode.single & Double = js.native
    }
    
    @JSGlobal("Windows.Storage.Pickers.Provider.PickerClosingDeferral")
    @js.native
    open class PickerClosingDeferral ()
      extends StObject
         with typingsJapgolly.winrt.Windows.Storage.Pickers.Provider.PickerClosingDeferral {
      
      /* CompleteClass */
      override def complete(): Unit = js.native
    }
    
    @JSGlobal("Windows.Storage.Pickers.Provider.PickerClosingEventArgs")
    @js.native
    open class PickerClosingEventArgs ()
      extends StObject
         with typingsJapgolly.winrt.Windows.Storage.Pickers.Provider.PickerClosingEventArgs {
      
      /* CompleteClass */
      var closingOperation: typingsJapgolly.winrt.Windows.Storage.Pickers.Provider.PickerClosingOperation = js.native
      
      /* CompleteClass */
      var isCanceled: Boolean = js.native
    }
    
    @JSGlobal("Windows.Storage.Pickers.Provider.PickerClosingOperation")
    @js.native
    open class PickerClosingOperation ()
      extends StObject
         with typingsJapgolly.winrt.Windows.Storage.Pickers.Provider.PickerClosingOperation {
      
      /* CompleteClass */
      var deadline: js.Date = js.native
      
      /* CompleteClass */
      override def getDeferral(): typingsJapgolly.winrt.Windows.Storage.Pickers.Provider.PickerClosingDeferral = js.native
    }
    
    @JSGlobal("Windows.Storage.Pickers.Provider.SetFileNameResult")
    @js.native
    object SetFileNameResult extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsJapgolly.winrt.Windows.Storage.Pickers.Provider.SetFileNameResult & Double
          ] = js.native
      
      /* 1 */ val notAllowed: typingsJapgolly.winrt.Windows.Storage.Pickers.Provider.SetFileNameResult.notAllowed & Double = js.native
      
      /* 0 */ val succeeded: typingsJapgolly.winrt.Windows.Storage.Pickers.Provider.SetFileNameResult.succeeded & Double = js.native
      
      /* 2 */ val unavailable: typingsJapgolly.winrt.Windows.Storage.Pickers.Provider.SetFileNameResult.unavailable & Double = js.native
    }
    
    @JSGlobal("Windows.Storage.Pickers.Provider.TargetFileRequest")
    @js.native
    open class TargetFileRequest ()
      extends StObject
         with typingsJapgolly.winrt.Windows.Storage.Pickers.Provider.TargetFileRequest {
      
      /* CompleteClass */
      override def getDeferral(): typingsJapgolly.winrt.Windows.Storage.Pickers.Provider.TargetFileRequestDeferral = js.native
      
      /* CompleteClass */
      var targetFile: IStorageFile = js.native
    }
    
    @JSGlobal("Windows.Storage.Pickers.Provider.TargetFileRequestDeferral")
    @js.native
    open class TargetFileRequestDeferral ()
      extends StObject
         with typingsJapgolly.winrt.Windows.Storage.Pickers.Provider.TargetFileRequestDeferral {
      
      /* CompleteClass */
      override def complete(): Unit = js.native
    }
    
    @JSGlobal("Windows.Storage.Pickers.Provider.TargetFileRequestedEventArgs")
    @js.native
    open class TargetFileRequestedEventArgs ()
      extends StObject
         with typingsJapgolly.winrt.Windows.Storage.Pickers.Provider.TargetFileRequestedEventArgs {
      
      /* CompleteClass */
      var request: typingsJapgolly.winrt.Windows.Storage.Pickers.Provider.TargetFileRequest = js.native
    }
  }
}
