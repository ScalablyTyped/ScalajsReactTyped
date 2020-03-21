package typingsJapgolly.winrt.Windows.Data.Xml.Dom

import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Foundation.Uri
import typingsJapgolly.winrt.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IXmlDocumentStatics extends js.Object {
  def loadFromFileAsync(file: IStorageFile): IAsyncOperation[XmlDocument] = js.native
  def loadFromFileAsync(file: IStorageFile, loadSettings: XmlLoadSettings): IAsyncOperation[XmlDocument] = js.native
  def loadFromUriAsync(uri: Uri): IAsyncOperation[XmlDocument] = js.native
  def loadFromUriAsync(uri: Uri, loadSettings: XmlLoadSettings): IAsyncOperation[XmlDocument] = js.native
}

