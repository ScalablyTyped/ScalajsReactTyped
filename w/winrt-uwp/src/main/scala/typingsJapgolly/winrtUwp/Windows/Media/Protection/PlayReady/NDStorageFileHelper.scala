package typingsJapgolly.winrtUwp.Windows.Media.Protection.PlayReady

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrtUwp.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages PlayReady-ND storage files. */
@JSGlobal("Windows.Media.Protection.PlayReady.NDStorageFileHelper")
@js.native
/** Creates a new instance of the NDStorageFileHelper class. */
class NDStorageFileHelper () extends js.Object {
  /**
    * Gets transmitter settings from the URLs associated with a StorageFile object if the URLs contain PlayReady-ND metadata.
    * @param file A storage file object that a media server has discovered.
    * @return The transmitter settings found in the storage file.
    */
  def getFileURLs(file: IStorageFile): IVector[String] = js.native
}

