package typingsJapgolly.winrt.global.Windows.Storage

import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Storage.IStorageItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Storage.StorageFolder")
@js.native
open class StorageFolder ()
  extends StObject
     with typingsJapgolly.winrt.Windows.Storage.StorageFolder {
  
  /* InferMemberOverrides */
  override def getItemsAsync(startIndex: Double, maxItemsToRetrieve: Double): IAsyncOperation[IVectorView[IStorageItem]] = js.native
  
  /* CompleteClass */
  override def tryGetItemAsync(name: String): IAsyncOperation[IStorageItem] = js.native
}
/* static members */
object StorageFolder {
  
  @JSGlobal("Windows.Storage.StorageFolder")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFolderFromPathAsync(path: String): IAsyncOperation[typingsJapgolly.winrt.Windows.Storage.StorageFolder] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFolderFromPathAsync")(path.asInstanceOf[js.Any]).asInstanceOf[IAsyncOperation[typingsJapgolly.winrt.Windows.Storage.StorageFolder]]
}
