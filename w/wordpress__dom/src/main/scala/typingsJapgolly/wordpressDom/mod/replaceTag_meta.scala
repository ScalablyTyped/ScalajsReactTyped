package typingsJapgolly.wordpressDom.mod

import org.scalajs.dom.raw.HTMLMetaElement
import org.scalajs.dom.raw.Node
import typingsJapgolly.wordpressDom.wordpressDomStrings.meta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/dom", "replaceTag")
@js.native
object replaceTag_meta extends js.Object {
  def apply(node: Node, tagName: meta): HTMLMetaElement = js.native
}

