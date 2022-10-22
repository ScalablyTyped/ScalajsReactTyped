package typingsJapgolly.winrt.global.Windows.Storage

import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Storage.FileProperties.BasicProperties
import typingsJapgolly.winrt.Windows.Storage.FileProperties.DocumentProperties
import typingsJapgolly.winrt.Windows.Storage.FileProperties.ImageProperties
import typingsJapgolly.winrt.Windows.Storage.FileProperties.MusicProperties
import typingsJapgolly.winrt.Windows.Storage.FileProperties.StorageItemThumbnail
import typingsJapgolly.winrt.Windows.Storage.FileProperties.ThumbnailMode
import typingsJapgolly.winrt.Windows.Storage.FileProperties.ThumbnailOptions
import typingsJapgolly.winrt.Windows.Storage.FileProperties.VideoProperties
import typingsJapgolly.winrt.Windows.Storage.IStorageItem
import typingsJapgolly.winrt.Windows.Storage.Search.IStorageQueryResultBase
import typingsJapgolly.winrt.Windows.Storage.Streams.IInputStream
import typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BulkAccess {
  
  @JSGlobal("Windows.Storage.BulkAccess.FileInformation")
  @js.native
  open class FileInformation ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Storage.BulkAccess.FileInformation {
    
    /* CompleteClass */
    var basicProperties: BasicProperties = js.native
    
    /* CompleteClass */
    var documentProperties: DocumentProperties = js.native
    
    /* CompleteClass */
    var imageProperties: ImageProperties = js.native
    
    /* CompleteClass */
    var musicProperties: MusicProperties = js.native
    
    /* CompleteClass */
    var onpropertiesupdated: Any = js.native
    
    /* CompleteClass */
    var onthumbnailupdated: Any = js.native
    
    /* CompleteClass */
    override def openReadAsync(): IAsyncOperation[IRandomAccessStreamWithContentType] = js.native
    
    /* CompleteClass */
    override def openSequentialReadAsync(): IAsyncOperation[IInputStream] = js.native
    
    /* CompleteClass */
    var thumbnail: StorageItemThumbnail = js.native
    
    /* CompleteClass */
    var videoProperties: VideoProperties = js.native
  }
  
  @JSGlobal("Windows.Storage.BulkAccess.FileInformationFactory")
  @js.native
  open class FileInformationFactory protected ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Storage.BulkAccess.FileInformationFactory {
    def this(queryResult: IStorageQueryResultBase, mode: ThumbnailMode) = this()
    def this(queryResult: IStorageQueryResultBase, mode: ThumbnailMode, requestedThumbnailSize: Double) = this()
    def this(
      queryResult: IStorageQueryResultBase,
      mode: ThumbnailMode,
      requestedThumbnailSize: Double,
      thumbnailOptions: ThumbnailOptions
    ) = this()
    def this(
      queryResult: IStorageQueryResultBase,
      mode: ThumbnailMode,
      requestedThumbnailSize: Double,
      thumbnailOptions: ThumbnailOptions,
      delayLoad: Boolean
    ) = this()
  }
  
  @JSGlobal("Windows.Storage.BulkAccess.FolderInformation")
  @js.native
  open class FolderInformation ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Storage.BulkAccess.FolderInformation {
    
    /* CompleteClass */
    var basicProperties: BasicProperties = js.native
    
    /* CompleteClass */
    var documentProperties: DocumentProperties = js.native
    
    /* InferMemberOverrides */
    override def getItemsAsync(startIndex: Double, maxItemsToRetrieve: Double): IAsyncOperation[IVectorView[IStorageItem]] = js.native
    
    /* CompleteClass */
    var imageProperties: ImageProperties = js.native
    
    /* CompleteClass */
    var musicProperties: MusicProperties = js.native
    
    /* CompleteClass */
    var onpropertiesupdated: Any = js.native
    
    /* CompleteClass */
    var onthumbnailupdated: Any = js.native
    
    /* CompleteClass */
    var thumbnail: StorageItemThumbnail = js.native
    
    /* CompleteClass */
    var videoProperties: VideoProperties = js.native
  }
}
