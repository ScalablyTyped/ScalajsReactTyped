package typingsJapgolly.winrtUwp.global.Windows.Media

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrtUwp.Windows.Foundation.IAsyncOperationWithProgress
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportAccessMode
import typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportConnectionTransport
import typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportContentType
import typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportContentTypeFilter
import typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportItemSelectionMode
import typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportPowerSource
import typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportProgress
import typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportSourceType
import typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportStage
import typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportStorageMediumType
import typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportSubfolderCreationMode
import typingsJapgolly.winrtUwp.Windows.Storage.IStorageFolder
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The Windows.Media.Import namespace provides APIs for discovering and importing photos and videos from devices including cameras, mass storage devices, phones, and other devices that support photo import. */
object Import {
  
  /** Specifies the access mode with which photos are imported. */
  @JSGlobal("Windows.Media.Import.PhotoImportAccessMode")
  @js.native
  object PhotoImportAccessMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportAccessMode & Double] = js.native
    
    /* 2 */ val readAndDelete: typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportAccessMode.readAndDelete & Double = js.native
    
    /* 1 */ val readOnly: typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportAccessMode.readOnly & Double = js.native
    
    /* 0 */ val readWrite: typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportAccessMode.readWrite & Double = js.native
  }
  
  /** Specifies the connection transport used for photo import. */
  @JSGlobal("Windows.Media.Import.PhotoImportConnectionTransport")
  @js.native
  object PhotoImportConnectionTransport extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportConnectionTransport & Double
      ] = js.native
    
    /* 3 */ val bluetooth: typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportConnectionTransport.bluetooth & Double = js.native
    
    /* 2 */ val ip: typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportConnectionTransport.ip & Double = js.native
    
    /* 0 */ val unknown: typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportConnectionTransport.unknown & Double = js.native
    
    /* 1 */ val usb: typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportConnectionTransport.usb & Double = js.native
  }
  
  /** Specifies the content type of an imported item. */
  @JSGlobal("Windows.Media.Import.PhotoImportContentType")
  @js.native
  object PhotoImportContentType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportContentType & Double] = js.native
    
    /* 1 */ val image: typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportContentType.image & Double = js.native
    
    /* 0 */ val unknown: typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportContentType.unknown & Double = js.native
    
    /* 2 */ val video: typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportContentType.video & Double = js.native
  }
  
  /** Specifies the content types that are included in a photo import operation. */
  @JSGlobal("Windows.Media.Import.PhotoImportContentTypeFilter")
  @js.native
  object PhotoImportContentTypeFilter extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportContentTypeFilter & Double
      ] = js.native
    
    /* 2 */ val imagesAndVideos: typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportContentTypeFilter.imagesAndVideos & Double = js.native
    
    /* 0 */ val onlyImages: typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportContentTypeFilter.onlyImages & Double = js.native
    
    /* 1 */ val onlyVideos: typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportContentTypeFilter.onlyVideos & Double = js.native
  }
  
  /** Represents the result of a operation that deletes imported media items from the source. */
  /* note: abstract class */ @JSGlobal("Windows.Media.Import.PhotoImportDeleteImportedItemsFromSourceResult")
  @js.native
  open class PhotoImportDeleteImportedItemsFromSourceResult ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportDeleteImportedItemsFromSourceResult {
    
    /** Gets a list of items that were deleted from the source. */
    /* CompleteClass */
    var deletedItems: IVectorView[typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportItem] = js.native
    
    /** Gets a value indicating whether the delete operation has succeeded. */
    /* CompleteClass */
    var hasSucceeded: Boolean = js.native
    
    /** Gets the number of photos deleted in the operation. */
    /* CompleteClass */
    var photosCount: Double = js.native
    
    /** Gets the size of the deleted photos, in bytes. */
    /* CompleteClass */
    var photosSizeInBytes: Double = js.native
    
    /** Gets the photo import session associated with the delete operation. */
    /* CompleteClass */
    var session: typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportSession = js.native
    
    /** Gets the number of sibling files deleted in the operation. */
    /* CompleteClass */
    var siblingsCount: Double = js.native
    
    /** Gets the size of the deleted sibling files, in bytes. */
    /* CompleteClass */
    var siblingsSizeInBytes: Double = js.native
    
    /** Gets the number of sidecar files deleted in the operation. */
    /* CompleteClass */
    var sidecarsCount: Double = js.native
    
    /** Gets the size of the deleted sidecar files, in bytes. */
    /* CompleteClass */
    var sidecarsSizeInBytes: Double = js.native
    
    /** Gets the total number of items deleted in the operation. */
    /* CompleteClass */
    var totalCount: Double = js.native
    
    /** Gets the total size of the all deleted items, in bytes. */
    /* CompleteClass */
    var totalSizeInBytes: Double = js.native
    
    /** Gets the number of videos deleted in the operation. */
    /* CompleteClass */
    var videosCount: Double = js.native
    
    /** Gets the size of the deleted videos, in bytes. */
    /* CompleteClass */
    var videosSizeInBytes: Double = js.native
  }
  
  /** Represents the result of a operation that finds media items on a source. */
  /* note: abstract class */ @JSGlobal("Windows.Media.Import.PhotoImportFindItemsResult")
  @js.native
  open class PhotoImportFindItemsResult ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportFindItemsResult
  
  /** Represents the result of a operation that imports media items from the source. */
  /* note: abstract class */ @JSGlobal("Windows.Media.Import.PhotoImportImportItemsResult")
  @js.native
  open class PhotoImportImportItemsResult ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportImportItemsResult {
    
    /**
      * Asynchronously deletes the items that were imported from the source.
      * @return An asynchronous operation that returns a PhotoImportDeleteImportedItemsFromSourceResult on successful completion.
      */
    /* CompleteClass */
    override def deleteImportedItemsFromSourceAsync(): IPromiseWithIAsyncOperationWithProgress[
        typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportDeleteImportedItemsFromSourceResult, 
        Double
      ] = js.native
    
    /** Gets a value indicating whether the import operation has succeeded. */
    /* CompleteClass */
    var hasSucceeded: Boolean = js.native
    
    /** Gets a list of items that were imported from the source. */
    /* CompleteClass */
    var importedItems: IVectorView[typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportItem] = js.native
    
    /** Gets the number of photos imported in the operation. */
    /* CompleteClass */
    var photosCount: Double = js.native
    
    /** Gets the size of the imported photos, in bytes. */
    /* CompleteClass */
    var photosSizeInBytes: Double = js.native
    
    /** Gets the photo import session associated with the import operation. */
    /* CompleteClass */
    var session: typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportSession = js.native
    
    /** Gets the number of sibling files imported in the operation. */
    /* CompleteClass */
    var siblingsCount: Double = js.native
    
    /** Gets the size of the imported sidecar files, in bytes. */
    /* CompleteClass */
    var siblingsSizeInBytes: Double = js.native
    
    /** Gets the number of sidecar files imported in the operation. */
    /* CompleteClass */
    var sidecarsCount: Double = js.native
    
    /** Gets the size of the imported sidecar files, in bytes. */
    /* CompleteClass */
    var sidecarsSizeInBytes: Double = js.native
    
    /** Gets the total number of items imported in the operation. */
    /* CompleteClass */
    var totalCount: Double = js.native
    
    /** Gets the total size of the all imported items, in bytes. */
    /* CompleteClass */
    var totalSizeInBytes: Double = js.native
    
    /** Gets the number of videos imported in the operation. */
    /* CompleteClass */
    var videosCount: Double = js.native
    
    /** Gets the size of the imported videos, in bytes. */
    /* CompleteClass */
    var videosSizeInBytes: Double = js.native
  }
  
  /** Specifies the types of files that are included in an import operation. */
  @JSGlobal("Windows.Media.Import.PhotoImportImportMode")
  @js.native
  object PhotoImportImportMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportImportMode & Double] = js.native
    
    /* 2 */ val ignoreSiblings: typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportImportMode.ignoreSiblings & Double = js.native
    
    /* 1 */ val ignoreSidecars: typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportImportMode.ignoreSidecars & Double = js.native
    
    /* 3 */ val ignoreSidecarsAndSiblings: typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportImportMode.ignoreSidecarsAndSiblings & Double = js.native
    
    /* 0 */ val importEverything: typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportImportMode.importEverything & Double = js.native
  }
  
  /** Represents an media item that has been imported from a source. */
  /* note: abstract class */ @JSGlobal("Windows.Media.Import.PhotoImportItem")
  @js.native
  open class PhotoImportItem ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportItem {
    
    /** Gets the content type of the imported item. */
    /* CompleteClass */
    var contentType: PhotoImportContentType = js.native
    
    /** Gets the creation date of the imported item. */
    /* CompleteClass */
    var date: js.Date = js.native
    
    /** Gets a list of the names of files associated with this item that were deleted. */
    /* CompleteClass */
    var deletedFileNames: IVectorView[String] = js.native
    
    /** Gets a list of the names of files associated with this item that were imported. */
    /* CompleteClass */
    var importedFileNames: IVectorView[String] = js.native
    
    /** Gets a value indicating whether the item is currently selected for import. */
    /* CompleteClass */
    var isSelected: Boolean = js.native
    
    /** Gets the key used to identify the item. */
    /* CompleteClass */
    var itemKey: Double = js.native
    
    /** Gets the name of the item. */
    /* CompleteClass */
    var name: String = js.native
    
    /** Gets the sibling file associated with the item, if one exists. */
    /* CompleteClass */
    var sibling: typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportSidecar = js.native
    
    /** Gets the list of sidecar files associated with the item, if any exists. */
    /* CompleteClass */
    var sidecars: IVectorView[typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportSidecar] = js.native
    
    /** Gets the size of the item, in bytes. */
    /* CompleteClass */
    var sizeInBytes: Double = js.native
    
    /** Gets a random access stream containing the thumbnail image associated with the item. */
    /* CompleteClass */
    var thumbnail: IRandomAccessStreamReference = js.native
    
    /** Gets the list of video segments associated with the item. */
    /* CompleteClass */
    var videoSegments: IVectorView[typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportVideoSegment] = js.native
  }
  
  /** Provides data for the PhotoImportFindItemsResult::ItemImported event. */
  /* note: abstract class */ @JSGlobal("Windows.Media.Import.PhotoImportItemImportedEventArgs")
  @js.native
  open class PhotoImportItemImportedEventArgs ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportItemImportedEventArgs {
    
    /** Gets the imported item associated with the PhotoImportFindItemsResult::ItemImported event. */
    /* CompleteClass */
    var importedItem: typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportItem = js.native
  }
  
  /** Specifies the initial selection state for items that are discovered using PhotoImportSession::FindItemsAsync . */
  @JSGlobal("Windows.Media.Import.PhotoImportItemSelectionMode")
  @js.native
  object PhotoImportItemSelectionMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportItemSelectionMode & Double
      ] = js.native
    
    /* 0 */ val selectAll: typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportItemSelectionMode.selectAll & Double = js.native
    
    /* 2 */ val selectNew: typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportItemSelectionMode.selectNew & Double = js.native
    
    /* 1 */ val selectNone: typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportItemSelectionMode.selectNone & Double = js.native
  }
  
  /** Provides APIs for determining if photo import is supported on the current device, finding sources from which to import photos, and getting references to any pending photo import operations. */
  /* note: abstract class */ @JSGlobal("Windows.Media.Import.PhotoImportManager")
  @js.native
  open class PhotoImportManager ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportManager
  object PhotoImportManager {
    
    @JSGlobal("Windows.Media.Import.PhotoImportManager")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Finds all currently available sources from which photos can be imported.
      * @return An asynchronous operation that returns a list of available sources on successful completion.
      */
    /* static member */
    inline def findAllSourcesAsync(): IPromiseWithIAsyncOperation[IVectorView[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllSourcesAsync")().asInstanceOf[IPromiseWithIAsyncOperation[IVectorView[Any]]]
    
    /**
      * Gets the list of all pending photo import operations.
      * @return The list of all pending photo operations.
      */
    /* static member */
    inline def getPendingOperations(): IVectorView[typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportOperation] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPendingOperations")().asInstanceOf[IVectorView[typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportOperation]]
    
    /**
      * Gets a value indicating if photo import is supported on the current device.
      * @return An asynchronous operation that returns true if photo import is supported. Otherwise, returns false.
      */
    /* static member */
    inline def isSupportedAsync(): IPromiseWithIAsyncOperation[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupportedAsync")().asInstanceOf[IPromiseWithIAsyncOperation[Boolean]]
  }
  
  /** Represents an in-progress photo import operation. */
  /* note: abstract class */ @JSGlobal("Windows.Media.Import.PhotoImportOperation")
  @js.native
  open class PhotoImportOperation ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportOperation {
    
    /** Causes in-progress delete from source operations to continue. */
    /* CompleteClass */
    var continueDeletingImportedItemsFromSourceAsync: IAsyncOperationWithProgress[
        typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportDeleteImportedItemsFromSourceResult, 
        Double
      ] = js.native
    
    /** Causes in-progress find operations to continue. */
    /* CompleteClass */
    var continueFindingItemsAsync: IAsyncOperationWithProgress[typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportFindItemsResult, Double] = js.native
    
    /** Causes in-progress import items operations to continue. */
    /* CompleteClass */
    var continueImportingItemsAsync: IAsyncOperationWithProgress[
        typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportImportItemsResult, 
        PhotoImportProgress
      ] = js.native
    
    /** Gets the photo import session associated with the operation. */
    /* CompleteClass */
    var session: typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportSession = js.native
    
    /** Gets the current stage of the in-progress operation. */
    /* CompleteClass */
    var stage: PhotoImportStage = js.native
  }
  
  /** Specifies the current power source of the source device containing items to be imported. */
  @JSGlobal("Windows.Media.Import.PhotoImportPowerSource")
  @js.native
  object PhotoImportPowerSource extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportPowerSource & Double] = js.native
    
    /* 1 */ val battery: typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportPowerSource.battery & Double = js.native
    
    /* 2 */ val external: typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportPowerSource.external & Double = js.native
    
    /* 0 */ val unknown: typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportPowerSource.unknown & Double = js.native
  }
  
  /** Provides data for the PhotoImportFindItemsResult::SelectionChanged event. */
  /* note: abstract class */ @JSGlobal("Windows.Media.Import.PhotoImportSelectionChangedEventArgs")
  @js.native
  open class PhotoImportSelectionChangedEventArgs ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportSelectionChangedEventArgs {
    
    /** Gets a value indicating whether no items are selected after the selection has changed. */
    /* CompleteClass */
    var isSelectionEmpty: Boolean = js.native
  }
  
  /** Represents a photo import session with a photo import source. */
  /* note: abstract class */ @JSGlobal("Windows.Media.Import.PhotoImportSession")
  @js.native
  open class PhotoImportSession ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportSession {
    
    /** Gets or sets a value specifying whether the session date should be appended to the destination folder name. */
    /* CompleteClass */
    var appendSessionDateToDestinationFolder: Boolean = js.native
    
    /** Closes the photo import session and releases associated resources. */
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /** Gets or sets the prefix for the destination file name. */
    /* CompleteClass */
    var destinationFileNamePrefix: String = js.native
    
    /** Gets or sets the destination folder for the photo import session. */
    /* CompleteClass */
    var destinationFolder: IStorageFolder = js.native
    
    /**
      * Asynchronously finds items on the source device that are available for import.
      * @param contentTypeFilter A value indicating whether the find operation includes images, videos, or both in the results.
      * @param itemSelectionMode A value indicating whether all items, no items, or only new items in the results are initially marked as selected.
      * @return An asynchronous operation that returns a PhotoImportFindItemsResult on successful completion.
      */
    /* CompleteClass */
    override def findItemsAsync(contentTypeFilter: PhotoImportContentTypeFilter, itemSelectionMode: PhotoImportItemSelectionMode): IPromiseWithIAsyncOperationWithProgress[typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportFindItemsResult, Double] = js.native
    
    /** Gets a unique identifier for the import session. */
    /* CompleteClass */
    var sessionId: String = js.native
    
    /** Gets an object representing the source device associated with the photo import session. */
    /* CompleteClass */
    var source: typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportSource = js.native
    
    /** Gets or sets a value indicating the method used for naming subfolders within the destination folder. */
    /* CompleteClass */
    var subfolderCreationMode: PhotoImportSubfolderCreationMode = js.native
  }
  
  /** Represents a sidecar file or a sibling file to a PhotoImportItem . */
  /* note: abstract class */ @JSGlobal("Windows.Media.Import.PhotoImportSidecar")
  @js.native
  open class PhotoImportSidecar ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportSidecar {
    
    /** Gets the date of the sidecar or sibling file. */
    /* CompleteClass */
    var date: js.Date = js.native
    
    /** Gets the name of the sidecar or sibling file. */
    /* CompleteClass */
    var name: String = js.native
    
    /** Gets the size of the sidecar or sibling file, in bytes. */
    /* CompleteClass */
    var sizeInBytes: Double = js.native
  }
  
  /** Represents the source device for a photo import session. */
  /* note: abstract class */ @JSGlobal("Windows.Media.Import.PhotoImportSource")
  @js.native
  open class PhotoImportSource ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportSource {
    
    /** The battery level of the source device. */
    /* CompleteClass */
    var batteryLevelPercent: Double = js.native
    
    /** Gets the connection protocol that is being used to communicate with the source device. */
    /* CompleteClass */
    var connectionProtocol: String = js.native
    
    /** Gets a value indicating the transport mechanism that is being used for importing items from the source device. */
    /* CompleteClass */
    var connectionTransport: PhotoImportConnectionTransport = js.native
    
    /**
      * Creates a new photo import session.
      * @return The new PhotoImportSession object.
      */
    /* CompleteClass */
    override def createImportSession(): typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportSession = js.native
    
    /** Gets the current date and time on the device. */
    /* CompleteClass */
    var dateTime: js.Date = js.native
    
    /** Gets a human-readable description of the source device. */
    /* CompleteClass */
    var description: String = js.native
    
    /** Gets the human-readable display name for the source device. */
    /* CompleteClass */
    var displayName: String = js.native
    
    /** Gets a unique 16-byte identifier that is common across multiple transports supported by the device. */
    /* CompleteClass */
    var id: String = js.native
    
    /** Gets a value indicating if the source device is locked. */
    /* CompleteClass */
    var isLocked: Boolean = js.native
    
    /** Gets a value indicating if the source device is a mass storage device. */
    /* CompleteClass */
    var isMassStorage: Boolean = js.native
    
    /** Gets the source device's human-readable manufacturer name. */
    /* CompleteClass */
    var manufacturer: String = js.native
    
    /** Gets the device model name. */
    /* CompleteClass */
    var model: String = js.native
    
    /** Gets a value indicating the type of power source being used by the source device, if it is known. */
    /* CompleteClass */
    var powerSource: PhotoImportPowerSource = js.native
    
    /** Gets the serial number of the device. */
    /* CompleteClass */
    var serialNumber: String = js.native
    
    /** Gets a list of objects representing the different storage media exposed by the source device. */
    /* CompleteClass */
    var storageMedia: IVectorView[typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportStorageMedium] = js.native
    
    /** Gets a reference to a stream containing the thumbnail image for the source device. */
    /* CompleteClass */
    var thumbnail: IRandomAccessStreamReference = js.native
    
    /** Gets a value indicating the type of the source device. */
    /* CompleteClass */
    var `type`: PhotoImportSourceType = js.native
  }
  object PhotoImportSource {
    
    @JSGlobal("Windows.Media.Import.PhotoImportSource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new instance of PhotoImportSource from the specified root folder.
      * @param sourceRootFolder The root folder from which the photo import source is created.
      * @return An asynchronous operation that returns a PhotoImportSource upon successful completion.
      */
    /* static member */
    inline def fromFolderAsync(sourceRootFolder: IStorageFolder): IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFolderAsync")(sourceRootFolder.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportSource]]
    
    /**
      * Creates a new instance of PhotoImportSource from the specified device ID.
      * @param sourceId The root folder from which the photo import source is created.
      * @return An asynchronous operation that returns a PhotoImportSource upon successful completion.
      */
    /* static member */
    inline def fromIdAsync(sourceId: String): IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIdAsync")(sourceId.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportSource]]
  }
  
  /** Specifies the type of device that is being used as a photo import source. */
  @JSGlobal("Windows.Media.Import.PhotoImportSourceType")
  @js.native
  object PhotoImportSourceType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportSourceType & Double] = js.native
    
    /* 6 */ val audioRecorder: typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportSourceType.audioRecorder & Double = js.native
    
    /* 1 */ val camera: typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportSourceType.camera & Double = js.native
    
    /* 0 */ val generic: typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportSourceType.generic & Double = js.native
    
    /* 2 */ val mediaPlayer: typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportSourceType.mediaPlayer & Double = js.native
    
    /* 5 */ val personalInfoManager: typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportSourceType.personalInfoManager & Double = js.native
    
    /* 3 */ val phone: typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportSourceType.phone & Double = js.native
    
    /* 4 */ val video: typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportSourceType.video & Double = js.native
  }
  
  /** Specifies the stages of the photo import process. */
  @JSGlobal("Windows.Media.Import.PhotoImportStage")
  @js.native
  object PhotoImportStage extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportStage & Double] = js.native
    
    /* 3 */ val deletingImportedItemsFromSource: typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportStage.deletingImportedItemsFromSource & Double = js.native
    
    /* 1 */ val findingItems: typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportStage.findingItems & Double = js.native
    
    /* 2 */ val importingItems: typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportStage.importingItems & Double = js.native
    
    /* 0 */ val notStarted: typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportStage.notStarted & Double = js.native
  }
  
  /** Represents a storage medium exposed by a photo import source device. */
  /* note: abstract class */ @JSGlobal("Windows.Media.Import.PhotoImportStorageMedium")
  @js.native
  open class PhotoImportStorageMedium ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportStorageMedium {
    
    /** Gets the available space on the storage medium, in bytes. */
    /* CompleteClass */
    var availableSpaceInBytes: Double = js.native
    
    /** Gets the capacity of the storage media, in bytes. */
    /* CompleteClass */
    var capacityInBytes: Double = js.native
    
    /** Gets a description of the storage medium. */
    /* CompleteClass */
    var description: String = js.native
    
    /** Gets the name of the storage medium. */
    /* CompleteClass */
    var name: String = js.native
    
    /** Refreshes the information about the storage medium. */
    /* CompleteClass */
    override def refresh(): Unit = js.native
    
    /** Gets the serial number of the storage medium. */
    /* CompleteClass */
    var serialNumber: String = js.native
    
    /** Gets the type of the storage medium. */
    /* CompleteClass */
    var storageMediumType: PhotoImportStorageMediumType = js.native
    
    /** Gets a value indicating the access modes supported by the storage medium. */
    /* CompleteClass */
    var supportedAccessMode: PhotoImportAccessMode = js.native
  }
  
  /** Specifies the type of a storage medium. */
  @JSGlobal("Windows.Media.Import.PhotoImportStorageMediumType")
  @js.native
  object PhotoImportStorageMediumType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportStorageMediumType & Double
      ] = js.native
    
    /* 1 */ val fixed: typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportStorageMediumType.fixed & Double = js.native
    
    /* 2 */ val removable: typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportStorageMediumType.removable & Double = js.native
    
    /* 0 */ val undefined: typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportStorageMediumType.undefined & Double = js.native
  }
  
  /** Specifies the method used for naming subfolders within the destination folder. */
  @JSGlobal("Windows.Media.Import.PhotoImportSubfolderCreationMode")
  @js.native
  object PhotoImportSubfolderCreationMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportSubfolderCreationMode & Double
      ] = js.native
    
    /* 2 */ val createSubfoldersFromExifDate: typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportSubfolderCreationMode.createSubfoldersFromExifDate & Double = js.native
    
    /* 1 */ val createSubfoldersFromFileDate: typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportSubfolderCreationMode.createSubfoldersFromFileDate & Double = js.native
    
    /* 0 */ val doNotCreateSubfolders: typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportSubfolderCreationMode.doNotCreateSubfolders & Double = js.native
    
    /* 3 */ val keepOriginalFolderStructure: typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportSubfolderCreationMode.keepOriginalFolderStructure & Double = js.native
  }
  
  /** Represents an imported video segment. */
  /* note: abstract class */ @JSGlobal("Windows.Media.Import.PhotoImportVideoSegment")
  @js.native
  open class PhotoImportVideoSegment ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportVideoSegment {
    
    /** Gets the date of the imported video segment. */
    /* CompleteClass */
    var date: js.Date = js.native
    
    /** Gets the name of the imported video segment. */
    /* CompleteClass */
    var name: String = js.native
    
    /** Gets the sibling file associated with the imported video segment. */
    /* CompleteClass */
    var sibling: typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportSidecar = js.native
    
    /** Gets the sidecar file associated with the imported video segment. */
    /* CompleteClass */
    var sidecars: IVectorView[typingsJapgolly.winrtUwp.Windows.Media.Import.PhotoImportSidecar] = js.native
    
    /** Gets the size of the imported video segment, in bytes. */
    /* CompleteClass */
    var sizeInBytes: Double = js.native
  }
}
