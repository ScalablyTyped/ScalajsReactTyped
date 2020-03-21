package typingsJapgolly.wordpressDom.mod

import org.scalajs.dom.raw.Node
import typingsJapgolly.std.HTMLMarqueeElement
import typingsJapgolly.wordpressDom.wordpressDomStrings.marquee
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/dom", "replaceTag")
@js.native
object replaceTag_marquee extends js.Object {
  def apply(node: Node, tagName: marquee): HTMLMarqueeElement = js.native
}

