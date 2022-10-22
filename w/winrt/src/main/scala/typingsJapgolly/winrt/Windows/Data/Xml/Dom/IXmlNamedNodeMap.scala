package typingsJapgolly.winrt.Windows.Data.Xml.Dom

import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IXmlNamedNodeMap
  extends StObject
     with IVectorView[IXmlNode] {
  
  def getNamedItem(name: String): IXmlNode = js.native
  
  def getNamedItemNS(namespaceUri: Any, name: String): IXmlNode = js.native
  
  def item(index: Double): IXmlNode = js.native
  
  def removeNamedItem(name: String): IXmlNode = js.native
  
  def removeNamedItemNS(namespaceUri: Any, name: String): IXmlNode = js.native
  
  def setNamedItem(node: IXmlNode): IXmlNode = js.native
  
  def setNamedItemNS(node: IXmlNode): IXmlNode = js.native
}
