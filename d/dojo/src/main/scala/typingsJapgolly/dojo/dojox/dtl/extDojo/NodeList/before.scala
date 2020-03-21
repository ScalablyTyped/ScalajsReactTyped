package typingsJapgolly.dojo.dojox.dtl.extDojo.NodeList

import typingsJapgolly.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Places the content before every node in the NodeList.
  * The content will be cloned if the length of NodeList
  * is greater than 1. Only the DOM nodes are cloned, not
  * any attached event handlers.
  *
  * @param content
  */
@js.native
trait before extends js.Object {
  def apply(content: String): js.Any = js.native
  def apply(content: typingsJapgolly.dojo.dojox.dtl.extDojo.NodeList): js.Any = js.native
  def apply(content: HTMLElement): js.Any = js.native
}

