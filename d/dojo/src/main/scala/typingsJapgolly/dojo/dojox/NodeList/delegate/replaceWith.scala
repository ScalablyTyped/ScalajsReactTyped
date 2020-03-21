package typingsJapgolly.dojo.dojox.NodeList.delegate

import typingsJapgolly.std.HTMLElement
import typingsJapgolly.std.NodeList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Replaces each node in ths NodeList with the content passed to replaceWith.
  * The content will be cloned if the length of NodeList
  * is greater than 1. Only the DOM nodes are cloned, not
  * any attached event handlers.
  *
  * @param content
  */
@js.native
trait replaceWith extends js.Object {
  def apply(content: String): js.Any = js.native
  def apply(content: HTMLElement): js.Any = js.native
  def apply(content: NodeList): js.Any = js.native
}

