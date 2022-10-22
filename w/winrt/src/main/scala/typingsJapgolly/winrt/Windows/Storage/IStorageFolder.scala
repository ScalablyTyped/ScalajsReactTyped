package typingsJapgolly.winrt.Windows.Storage

import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStorageFolder
  extends StObject
     with IStorageItem {
  
  def createFileAsync(desiredName: String): IAsyncOperation[StorageFile] = js.native
  def createFileAsync(desiredName: String, options: CreationCollisionOption): IAsyncOperation[StorageFile] = js.native
  
  def createFolderAsync(desiredName: String): IAsyncOperation[StorageFolder] = js.native
  def createFolderAsync(desiredName: String, options: CreationCollisionOption): IAsyncOperation[StorageFolder] = js.native
  
  def getFileAsync(name: String): IAsyncOperation[StorageFile] = js.native
  
  def getFilesAsync(): IAsyncOperation[IVectorView[StorageFile]] = js.native
  
  def getFolderAsync(name: String): IAsyncOperation[StorageFolder] = js.native
  
  def getFoldersAsync(): IAsyncOperation[IVectorView[StorageFolder]] = js.native
  
  def getItemAsync(name: String): IAsyncOperation[IStorageItem] = js.native
  
  def getItemsAsync(): IAsyncOperation[IVectorView[IStorageItem]] = js.native
  def getItemsAsync(startIndex: Double, maxItemsToRetrieve: Double): IAsyncOperation[IVectorView[IStorageItem]] = js.native
}
