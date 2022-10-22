package typingsJapgolly.winrtUwp.global.Windows.Storage

import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.Foundation.Uri
import typingsJapgolly.winrtUwp.Windows.Storage.IStorageFile
import typingsJapgolly.winrtUwp.Windows.Storage.StreamedFileDataRequestedHandler
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a file. Provides information about the file and its content, and ways to manipulate them. */
/* note: abstract class */ @JSGlobal("Windows.Storage.StorageFile")
@js.native
open class StorageFile ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Storage.StorageFile
object StorageFile {
  
  @JSGlobal("Windows.Storage.StorageFile")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a StorageFile to represent the specified stream of data. This method lets the app produce the data on-demand by specifying a function to be invoked when the StorageFile that represents the stream is first accessed.
    * @param displayNameWithExtension The user-friendly name of the StorageFile to create, including a file type extension.
    * @param dataRequested The function that should be invoked when the StorageFile that is returned is first accessed. This function should produce the data stream represented by the returned StorageFile and lets the app produce data on-demand instead of writing the contents of the file at creation time.
    * @param thumbnail The thumbnail image for the StorageFile to create.
    * @return When this method completes, it returns a StorageFile object that represents the new stream of data.
    */
  /* static member */
  inline def createStreamedFileAsync(
    displayNameWithExtension: String,
    dataRequested: StreamedFileDataRequestedHandler,
    thumbnail: IRandomAccessStreamReference
  ): IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.Storage.StorageFile] = (^.asInstanceOf[js.Dynamic].applyDynamic("createStreamedFileAsync")(displayNameWithExtension.asInstanceOf[js.Any], dataRequested.asInstanceOf[js.Any], thumbnail.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.Storage.StorageFile]]
  
  /**
    * Creates a StorageFile to represent a stream of data from the specified URI resource. This method lets the app download the data on-demand when the StorageFile that represents the stream is first accessed.
    * @param displayNameWithExtension The user-friendly name of the StorageFile to create, including a file type extension.
    * @param uri The URI of the resource used to create the StorageFile .
    * @param thumbnail The thumbnail image for the StorageFile to create.
    * @return When this method completes, it returns a StorageFile object that represents the URI resource.
    */
  /* static member */
  inline def createStreamedFileFromUriAsync(displayNameWithExtension: String, uri: Uri, thumbnail: IRandomAccessStreamReference): IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.Storage.StorageFile] = (^.asInstanceOf[js.Dynamic].applyDynamic("createStreamedFileFromUriAsync")(displayNameWithExtension.asInstanceOf[js.Any], uri.asInstanceOf[js.Any], thumbnail.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.Storage.StorageFile]]
  
  /**
    * Gets a StorageFile object to represent the specified URI app resource. For examples of sample URIs see How to load file resources.
    * @param uri The URI of the app resource to get a StorageFile to represent.
    * @return When this method completes, it returns a StorageFile object that represents the URI resource.
    */
  /* static member */
  inline def getFileFromApplicationUriAsync(uri: Uri): IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.Storage.StorageFile] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFileFromApplicationUriAsync")(uri.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.Storage.StorageFile]]
  
  /**
    * Gets a StorageFile object to represent the file at the specified path.
    * @param path The path of the file to get a StorageFile to represent.
    * @return When this method completes, it returns the file as a StorageFile .
    */
  /* static member */
  inline def getFileFromPathAsync(path: String): IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.Storage.StorageFile] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFileFromPathAsync")(path.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.Storage.StorageFile]]
  
  /**
    * Replaces the contents of the file referred to by the specified IStorageFile object with a new data stream. This method lets the app produce the data on-demand by specifying a function to be invoked when the StorageFile that represents the stream is first accessed.
    * @param fileToReplace The file (type IStorageFile ) that the new data stream should be written to.
    * @param dataRequested The function that should be invoked when the StorageFile that is returned is first accessed. This function should produce the data stream represented by the returned StorageFile and lets the app produce data on-demand instead of writing the contents of the file at creation time.
    * @param thumbnail The thumbnail image for the StorageFile to create.
    * @return When this method completes, it returns a StorageFile object that represents the new data stream. Subsequently, this StorageFile object should be used to access file content instead of the file (type IStorageFile ) that was specified to be replace.
    */
  /* static member */
  inline def replaceWithStreamedFileAsync(
    fileToReplace: IStorageFile,
    dataRequested: StreamedFileDataRequestedHandler,
    thumbnail: IRandomAccessStreamReference
  ): IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.Storage.StorageFile] = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceWithStreamedFileAsync")(fileToReplace.asInstanceOf[js.Any], dataRequested.asInstanceOf[js.Any], thumbnail.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.Storage.StorageFile]]
  
  /**
    * Replaces the contents of the file referred to by the specified IStorageFile object with a new data stream of the specified URI. This method lets the app download the data on-demand when the StorageFile that represents the stream is first accessed.
    * @param fileToReplace The file that the created StorageFile will provide a stream of.
    * @param uri The URI of the resource used to create the StorageFile .
    * @param thumbnail The thumbnail image for the StorageFile to create.
    * @return When this method completes, it returns a StorageFile object that represents the streamed file. Subsequently, this StorageFile object should be used to access file content instead of the file (type IStorageFile ) that was specified to be replace.
    */
  /* static member */
  inline def replaceWithStreamedFileFromUriAsync(fileToReplace: IStorageFile, uri: Uri, thumbnail: IRandomAccessStreamReference): IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.Storage.StorageFile] = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceWithStreamedFileFromUriAsync")(fileToReplace.asInstanceOf[js.Any], uri.asInstanceOf[js.Any], thumbnail.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.Storage.StorageFile]]
}
