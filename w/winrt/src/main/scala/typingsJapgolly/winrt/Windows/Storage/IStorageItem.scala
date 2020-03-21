package typingsJapgolly.winrt.Windows.Storage

import typingsJapgolly.winrt.Windows.Foundation.IAsyncAction
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Storage.FileProperties.BasicProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStorageItem extends js.Object {
  var attributes: FileAttributes = js.native
  var dateCreated: js.Date = js.native
  var name: String = js.native
  var path: String = js.native
  def deleteAsync(): IAsyncAction = js.native
  def deleteAsync(option: StorageDeleteOption): IAsyncAction = js.native
  def getBasicPropertiesAsync(): IAsyncOperation[BasicProperties] = js.native
  def isOfType(`type`: StorageItemTypes): Boolean = js.native
  def renameAsync(desiredName: String): IAsyncAction = js.native
  def renameAsync(desiredName: String, option: NameCollisionOption): IAsyncAction = js.native
}

