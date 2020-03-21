package typingsJapgolly.zeroclipboard.mod

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.Element
import typingsJapgolly.zeroclipboard.ZC.List
import typingsJapgolly.zeroclipboard.ZC.ZeroClipboardClient
import typingsJapgolly.zeroclipboard.ZC.ZeroClipboardStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zeroclipboard", JSImport.Namespace)
@js.native
class ^ () extends ZeroClipboardClient {
  def this(elements: Element) = this()
  def this(elements: List[Element]) = this()
}

@JSImport("zeroclipboard", JSImport.Namespace)
@js.native
object ^ extends TopLevel[ZeroClipboardStatic]

