package typingsJapgolly.officeUiFabricReact.documentCardTypesMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDocumentCard extends js.Object {
  /**
    * Sets focus to the DocumentCard.
    */
  def focus(): Unit
}

object IDocumentCard {
  @scala.inline
  def apply(focus: Callback): IDocumentCard = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("focus")(focus.toJsFn)
    __obj.asInstanceOf[IDocumentCard]
  }
}

