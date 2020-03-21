package typingsJapgolly.zeroclipboard

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.Element
import typingsJapgolly.zeroclipboard.ZC.List
import typingsJapgolly.zeroclipboard.ZC.ZeroClipboardClient
import typingsJapgolly.zeroclipboard.ZC.ZeroClipboardStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ZeroClipboard")
@js.native
class ZeroClipboard () extends ZeroClipboardClient {
  def this(elements: Element) = this()
  def this(elements: List[Element]) = this()
}

/**
  * [ZeroClipboard description]
  * @type {ZC.ZeroClipboardStatic}
  */
@JSGlobal("ZeroClipboard")
@js.native
object ZeroClipboard extends TopLevel[ZeroClipboardStatic]

