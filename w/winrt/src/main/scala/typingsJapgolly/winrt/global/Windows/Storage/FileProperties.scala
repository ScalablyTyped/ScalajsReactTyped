package typingsJapgolly.winrt.global.Windows.Storage

import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typingsJapgolly.winrt.Windows.Storage.FileProperties.ThumbnailType
import typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer
import typingsJapgolly.winrt.Windows.Storage.Streams.IInputStream
import typingsJapgolly.winrt.Windows.Storage.Streams.IOutputStream
import typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStream
import typingsJapgolly.winrt.Windows.Storage.Streams.InputStreamOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FileProperties {
  
  @JSGlobal("Windows.Storage.FileProperties.BasicProperties")
  @js.native
  open class BasicProperties ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Storage.FileProperties.BasicProperties {
    
    /* CompleteClass */
    var dateModified: js.Date = js.native
    
    /* CompleteClass */
    var itemDate: js.Date = js.native
    
    /* CompleteClass */
    var size: Double = js.native
  }
  
  @JSGlobal("Windows.Storage.FileProperties.DocumentProperties")
  @js.native
  open class DocumentProperties ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Storage.FileProperties.DocumentProperties
  
  @JSGlobal("Windows.Storage.FileProperties.ImageProperties")
  @js.native
  open class ImageProperties ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Storage.FileProperties.ImageProperties
  
  @JSGlobal("Windows.Storage.FileProperties.MusicProperties")
  @js.native
  open class MusicProperties ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Storage.FileProperties.MusicProperties
  
  @JSGlobal("Windows.Storage.FileProperties.PhotoOrientation")
  @js.native
  object PhotoOrientation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Storage.FileProperties.PhotoOrientation & Double] = js.native
    
    /* 2 */ val flipHorizontal: typingsJapgolly.winrt.Windows.Storage.FileProperties.PhotoOrientation.flipHorizontal & Double = js.native
    
    /* 4 */ val flipVertical: typingsJapgolly.winrt.Windows.Storage.FileProperties.PhotoOrientation.flipVertical & Double = js.native
    
    /* 1 */ val normal: typingsJapgolly.winrt.Windows.Storage.FileProperties.PhotoOrientation.normal & Double = js.native
    
    /* 3 */ val rotate180: typingsJapgolly.winrt.Windows.Storage.FileProperties.PhotoOrientation.rotate180 & Double = js.native
    
    /* 6 */ val rotate270: typingsJapgolly.winrt.Windows.Storage.FileProperties.PhotoOrientation.rotate270 & Double = js.native
    
    /* 8 */ val rotate90: typingsJapgolly.winrt.Windows.Storage.FileProperties.PhotoOrientation.rotate90 & Double = js.native
    
    /* 5 */ val transpose: typingsJapgolly.winrt.Windows.Storage.FileProperties.PhotoOrientation.transpose & Double = js.native
    
    /* 7 */ val transverse: typingsJapgolly.winrt.Windows.Storage.FileProperties.PhotoOrientation.transverse & Double = js.native
    
    /* 0 */ val unspecified: typingsJapgolly.winrt.Windows.Storage.FileProperties.PhotoOrientation.unspecified & Double = js.native
  }
  
  @JSGlobal("Windows.Storage.FileProperties.PropertyPrefetchOptions")
  @js.native
  object PropertyPrefetchOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrt.Windows.Storage.FileProperties.PropertyPrefetchOptions & Double
      ] = js.native
    
    /* 5 */ val basicProperties: typingsJapgolly.winrt.Windows.Storage.FileProperties.PropertyPrefetchOptions.basicProperties & Double = js.native
    
    /* 4 */ val documentProperties: typingsJapgolly.winrt.Windows.Storage.FileProperties.PropertyPrefetchOptions.documentProperties & Double = js.native
    
    /* 3 */ val imageProperties: typingsJapgolly.winrt.Windows.Storage.FileProperties.PropertyPrefetchOptions.imageProperties & Double = js.native
    
    /* 1 */ val musicProperties: typingsJapgolly.winrt.Windows.Storage.FileProperties.PropertyPrefetchOptions.musicProperties & Double = js.native
    
    /* 0 */ val none: typingsJapgolly.winrt.Windows.Storage.FileProperties.PropertyPrefetchOptions.none & Double = js.native
    
    /* 2 */ val videoProperties: typingsJapgolly.winrt.Windows.Storage.FileProperties.PropertyPrefetchOptions.videoProperties & Double = js.native
  }
  
  @JSGlobal("Windows.Storage.FileProperties.StorageItemContentProperties")
  @js.native
  open class StorageItemContentProperties ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Storage.FileProperties.StorageItemContentProperties
  
  @JSGlobal("Windows.Storage.FileProperties.StorageItemThumbnail")
  @js.native
  open class StorageItemThumbnail ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Storage.FileProperties.StorageItemThumbnail {
    
    /* CompleteClass */
    var canRead: Boolean = js.native
    
    /* CompleteClass */
    var canWrite: Boolean = js.native
    
    /* CompleteClass */
    override def cloneStream(): IRandomAccessStream = js.native
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* CompleteClass */
    var contentType: String = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /* CompleteClass */
    override def flushAsync(): IAsyncOperation[Boolean] = js.native
    
    /* CompleteClass */
    override def getInputStreamAt(position: Double): IInputStream = js.native
    
    /* CompleteClass */
    override def getOutputStreamAt(position: Double): IOutputStream = js.native
    
    /* CompleteClass */
    var originalHeight: Double = js.native
    
    /* CompleteClass */
    var originalWidth: Double = js.native
    
    /* CompleteClass */
    var position: Double = js.native
    
    /* CompleteClass */
    override def readAsync(buffer: IBuffer, count: Double, options: InputStreamOptions): IAsyncOperationWithProgress[IBuffer, Double] = js.native
    
    /* CompleteClass */
    var returnedSmallerCachedSize: Boolean = js.native
    
    /* CompleteClass */
    override def seek(position: Double): Unit = js.native
    
    /* CompleteClass */
    var size: Double = js.native
    
    /* CompleteClass */
    var `type`: ThumbnailType = js.native
    
    /* CompleteClass */
    override def writeAsync(buffer: IBuffer): IAsyncOperationWithProgress[Double, Double] = js.native
  }
  
  @JSGlobal("Windows.Storage.FileProperties.ThumbnailMode")
  @js.native
  object ThumbnailMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Storage.FileProperties.ThumbnailMode & Double] = js.native
    
    /* 3 */ val documentsView: typingsJapgolly.winrt.Windows.Storage.FileProperties.ThumbnailMode.documentsView & Double = js.native
    
    /* 4 */ val listView: typingsJapgolly.winrt.Windows.Storage.FileProperties.ThumbnailMode.listView & Double = js.native
    
    /* 2 */ val musicView: typingsJapgolly.winrt.Windows.Storage.FileProperties.ThumbnailMode.musicView & Double = js.native
    
    /* 0 */ val picturesView: typingsJapgolly.winrt.Windows.Storage.FileProperties.ThumbnailMode.picturesView & Double = js.native
    
    /* 5 */ val singleItem: typingsJapgolly.winrt.Windows.Storage.FileProperties.ThumbnailMode.singleItem & Double = js.native
    
    /* 1 */ val videosView: typingsJapgolly.winrt.Windows.Storage.FileProperties.ThumbnailMode.videosView & Double = js.native
  }
  
  @JSGlobal("Windows.Storage.FileProperties.ThumbnailOptions")
  @js.native
  object ThumbnailOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Storage.FileProperties.ThumbnailOptions & Double] = js.native
    
    /* 0 */ val none: typingsJapgolly.winrt.Windows.Storage.FileProperties.ThumbnailOptions.none & Double = js.native
    
    /* 2 */ val resizeThumbnail: typingsJapgolly.winrt.Windows.Storage.FileProperties.ThumbnailOptions.resizeThumbnail & Double = js.native
    
    /* 1 */ val returnOnlyIfCached: typingsJapgolly.winrt.Windows.Storage.FileProperties.ThumbnailOptions.returnOnlyIfCached & Double = js.native
    
    /* 3 */ val useCurrentScale: typingsJapgolly.winrt.Windows.Storage.FileProperties.ThumbnailOptions.useCurrentScale & Double = js.native
  }
  
  @JSGlobal("Windows.Storage.FileProperties.ThumbnailType")
  @js.native
  object ThumbnailType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Storage.FileProperties.ThumbnailType & Double] = js.native
    
    /* 1 */ val icon: typingsJapgolly.winrt.Windows.Storage.FileProperties.ThumbnailType.icon & Double = js.native
    
    /* 0 */ val image: typingsJapgolly.winrt.Windows.Storage.FileProperties.ThumbnailType.image & Double = js.native
  }
  
  @JSGlobal("Windows.Storage.FileProperties.VideoOrientation")
  @js.native
  object VideoOrientation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Storage.FileProperties.VideoOrientation & Double] = js.native
    
    /* 0 */ val normal: typingsJapgolly.winrt.Windows.Storage.FileProperties.VideoOrientation.normal & Double = js.native
    
    /* 2 */ val rotate180: typingsJapgolly.winrt.Windows.Storage.FileProperties.VideoOrientation.rotate180 & Double = js.native
    
    /* 3 */ val rotate270: typingsJapgolly.winrt.Windows.Storage.FileProperties.VideoOrientation.rotate270 & Double = js.native
    
    /* 1 */ val rotate90: typingsJapgolly.winrt.Windows.Storage.FileProperties.VideoOrientation.rotate90 & Double = js.native
  }
  
  @JSGlobal("Windows.Storage.FileProperties.VideoProperties")
  @js.native
  open class VideoProperties ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Storage.FileProperties.VideoProperties
}
