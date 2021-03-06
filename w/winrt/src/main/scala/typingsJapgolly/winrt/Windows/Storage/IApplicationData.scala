package typingsJapgolly.winrt.Windows.Storage

import typingsJapgolly.winrt.Windows.Foundation.IAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IApplicationData extends js.Object {
  var localFolder: StorageFolder = js.native
  var localSettings: ApplicationDataContainer = js.native
  var ondatachanged: js.Any = js.native
  var roamingFolder: StorageFolder = js.native
  var roamingSettings: ApplicationDataContainer = js.native
  var roamingStorageQuota: Double = js.native
  var temporaryFolder: StorageFolder = js.native
  var version: Double = js.native
  def clearAsync(): IAsyncAction = js.native
  def clearAsync(locality: ApplicationDataLocality): IAsyncAction = js.native
  def setVersionAsync(desiredVersion: Double, handler: ApplicationDataSetVersionHandler): IAsyncAction = js.native
  def signalDataChanged(): Unit = js.native
}

