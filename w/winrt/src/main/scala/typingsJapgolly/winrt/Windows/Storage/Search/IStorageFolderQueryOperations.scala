package typingsJapgolly.winrt.Windows.Storage.Search

import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Storage.IStorageItem
import typingsJapgolly.winrt.Windows.Storage.StorageFile
import typingsJapgolly.winrt.Windows.Storage.StorageFolder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStorageFolderQueryOperations extends StObject {
  
  def areQueryOptionsSupported(queryOptions: QueryOptions): Boolean = js.native
  
  def createFileQuery(): StorageFileQueryResult = js.native
  def createFileQuery(query: CommonFileQuery): StorageFileQueryResult = js.native
  
  def createFileQueryWithOptions(queryOptions: QueryOptions): StorageFileQueryResult = js.native
  
  def createFolderQuery(): StorageFolderQueryResult = js.native
  def createFolderQuery(query: CommonFolderQuery): StorageFolderQueryResult = js.native
  
  def createFolderQueryWithOptions(queryOptions: QueryOptions): StorageFolderQueryResult = js.native
  
  def createItemQuery(): StorageItemQueryResult = js.native
  
  def createItemQueryWithOptions(queryOptions: QueryOptions): StorageItemQueryResult = js.native
  
  def getFilesAsync(query: CommonFileQuery): IAsyncOperation[IVectorView[StorageFile]] = js.native
  def getFilesAsync(query: CommonFileQuery, startIndex: Double, maxItemsToRetrieve: Double): IAsyncOperation[IVectorView[StorageFile]] = js.native
  
  def getFoldersAsync(query: CommonFolderQuery): IAsyncOperation[IVectorView[StorageFolder]] = js.native
  def getFoldersAsync(query: CommonFolderQuery, startIndex: Double, maxItemsToRetrieve: Double): IAsyncOperation[IVectorView[StorageFolder]] = js.native
  
  def getIndexedStateAsync(): IAsyncOperation[IndexedState] = js.native
  
  def getItemsAsync(startIndex: Double, maxItemsToRetrieve: Double): IAsyncOperation[IVectorView[IStorageItem]] = js.native
  
  def isCommonFileQuerySupported(query: CommonFileQuery): Boolean = js.native
  
  def isCommonFolderQuerySupported(query: CommonFolderQuery): Boolean = js.native
}
