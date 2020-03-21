package typingsJapgolly.xrm.Xrm.Metadata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Type to hold Labels as part of the EntityMetadata
  */
trait Label extends js.Object {
  /**
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
    */
  var LocalizedLabels: js.Array[LocalizedLabel]
  var UserLocalizedLabel: LocalizedLabel
}

object Label {
  @scala.inline
  def apply(LocalizedLabels: js.Array[LocalizedLabel], UserLocalizedLabel: LocalizedLabel): Label = {
    val __obj = js.Dynamic.literal(LocalizedLabels = LocalizedLabels.asInstanceOf[js.Any], UserLocalizedLabel = UserLocalizedLabel.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Label]
  }
}

