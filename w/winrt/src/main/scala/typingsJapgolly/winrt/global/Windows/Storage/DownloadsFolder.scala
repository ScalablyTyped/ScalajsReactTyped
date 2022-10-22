package typingsJapgolly.winrt.global.Windows.Storage

import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Storage.DownloadsFolder")
@js.native
open class DownloadsFolder ()
  extends StObject
     with typingsJapgolly.winrt.Windows.Storage.DownloadsFolder
/* static members */
object DownloadsFolder {
  
  @JSGlobal("Windows.Storage.DownloadsFolder")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createFileAsync(desiredName: String): IAsyncOperation[typingsJapgolly.winrt.Windows.Storage.StorageFile] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFileAsync")(desiredName.asInstanceOf[js.Any]).asInstanceOf[IAsyncOperation[typingsJapgolly.winrt.Windows.Storage.StorageFile]]
  inline def createFileAsync(desiredName: String, option: typingsJapgolly.winrt.Windows.Storage.CreationCollisionOption): IAsyncOperation[typingsJapgolly.winrt.Windows.Storage.StorageFile] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFileAsync")(desiredName.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[IAsyncOperation[typingsJapgolly.winrt.Windows.Storage.StorageFile]]
  
  inline def createFolderAsync(desiredName: String): IAsyncOperation[typingsJapgolly.winrt.Windows.Storage.StorageFolder] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFolderAsync")(desiredName.asInstanceOf[js.Any]).asInstanceOf[IAsyncOperation[typingsJapgolly.winrt.Windows.Storage.StorageFolder]]
  inline def createFolderAsync(desiredName: String, option: typingsJapgolly.winrt.Windows.Storage.CreationCollisionOption): IAsyncOperation[typingsJapgolly.winrt.Windows.Storage.StorageFolder] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFolderAsync")(desiredName.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[IAsyncOperation[typingsJapgolly.winrt.Windows.Storage.StorageFolder]]
}
