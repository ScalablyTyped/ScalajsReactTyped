package typingsJapgolly.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Facet extends js.Object {
  /**
    * The unique key for the document attribute.
    */
  var DocumentAttributeKey: js.UndefOr[typingsJapgolly.awsSdk.kendraMod.DocumentAttributeKey] = js.native
}

object Facet {
  @scala.inline
  def apply(DocumentAttributeKey: DocumentAttributeKey = null): Facet = {
    val __obj = js.Dynamic.literal()
    if (DocumentAttributeKey != null) __obj.updateDynamic("DocumentAttributeKey")(DocumentAttributeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Facet]
  }
}

