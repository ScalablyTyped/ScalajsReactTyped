package typingsJapgolly.winrt.Windows.Storage.Search

import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Storage.StorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStorageFileQueryResult
  extends StObject
     with IStorageQueryResultBase {
  
  def getFilesAsync(): IAsyncOperation[IVectorView[StorageFile]] = js.native
  def getFilesAsync(startIndex: Double, maxNumberOfItems: Double): IAsyncOperation[IVectorView[StorageFile]] = js.native
}
