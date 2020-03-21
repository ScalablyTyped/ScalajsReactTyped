package typingsJapgolly.winrt.Windows.Data.Xml.Dom

import typingsJapgolly.winrt.Windows.Foundation.IAsyncAction
import typingsJapgolly.winrt.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IXmlDocumentIO extends js.Object {
  def loadXml(xml: String): Unit = js.native
  def loadXml(xml: String, loadSettings: XmlLoadSettings): Unit = js.native
  def saveToFileAsync(file: IStorageFile): IAsyncAction = js.native
}

