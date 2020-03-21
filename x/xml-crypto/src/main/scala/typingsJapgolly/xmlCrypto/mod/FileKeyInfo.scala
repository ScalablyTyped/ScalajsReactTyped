package typingsJapgolly.xmlCrypto.mod

import org.scalajs.dom.raw.Node
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xml-crypto", "FileKeyInfo")
@js.native
class FileKeyInfo () extends js.Object {
  def this(file: String) = this()
  var file: String = js.native
  def getKey(): Buffer = js.native
  def getKey(keyInfo: Node): Buffer = js.native
  def getKeyInfo(): String = js.native
  def getKeyInfo(key: String): String = js.native
  def getKeyInfo(key: String, prefix: String): String = js.native
}

