package typingsJapgolly.fhirKitClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType[T /* <: String */] extends js.Object {
  var `type`: T
}

object AnonType {
  @scala.inline
  def apply[T /* <: String */](`type`: T): AnonType[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType[T]]
  }
}

