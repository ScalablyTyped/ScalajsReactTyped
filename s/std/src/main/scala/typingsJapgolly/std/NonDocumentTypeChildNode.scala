package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NonDocumentTypeChildNode extends js.Object {
  /**
    * Returns the first following sibling that is an element, and null otherwise.
    */
  val nextElementSibling: org.scalajs.dom.raw.Element | Null
  /**
    * Returns the first preceding sibling that is an element, and null otherwise.
    */
  val previousElementSibling: org.scalajs.dom.raw.Element | Null
}

object NonDocumentTypeChildNode {
  @scala.inline
  def apply(
    nextElementSibling: org.scalajs.dom.raw.Element = null,
    previousElementSibling: org.scalajs.dom.raw.Element = null
  ): NonDocumentTypeChildNode = {
    val __obj = js.Dynamic.literal()
    if (nextElementSibling != null) __obj.updateDynamic("nextElementSibling")(nextElementSibling.asInstanceOf[js.Any])
    if (previousElementSibling != null) __obj.updateDynamic("previousElementSibling")(previousElementSibling.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonDocumentTypeChildNode]
  }
}

