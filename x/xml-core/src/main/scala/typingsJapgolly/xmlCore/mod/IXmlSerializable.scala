package typingsJapgolly.xmlCore.mod

import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IXmlSerializable extends js.Object {
  /**
    * Writes object to XML node
    * - if class was initialized and it has no one change, GetXml returns null
    * @returns Node
    */
  def GetXml(): Node | Null = js.native
  def LoadXml(node: String): Unit = js.native
  /**
    * Reads XML from string
    * @param  {Node} node
    * @returns void
    */
  def LoadXml(node: typingsJapgolly.std.Node): Unit = js.native
}

