package typingsJapgolly.winrt.Windows.Data.Xml.Dom

import typingsJapgolly.winrt.Windows.Foundation.IAsyncAction
import typingsJapgolly.winrt.Windows.Storage.IStorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IXmlDocumentIO extends StObject {
  
  def loadXml(xml: String): Unit = js.native
  def loadXml(xml: String, loadSettings: XmlLoadSettings): Unit = js.native
  
  def saveToFileAsync(file: IStorageFile): IAsyncAction = js.native
}
