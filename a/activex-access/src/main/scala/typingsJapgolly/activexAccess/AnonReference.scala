package typingsJapgolly.activexAccess

import typingsJapgolly.activexAccess.Access.Reference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReference extends js.Object {
  val Reference: typingsJapgolly.activexAccess.Access.Reference
}

object AnonReference {
  @scala.inline
  def apply(Reference: Reference): AnonReference = {
    val __obj = js.Dynamic.literal(Reference = Reference.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonReference]
  }
}

