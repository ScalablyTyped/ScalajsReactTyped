package typingsJapgolly.vegaTypings

import typingsJapgolly.vegaTypings.encodeMod.Field
import typingsJapgolly.vegaTypings.encodeMod.ScaledValueRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRange
  extends ScaledValueRef[js.Any] {
  var range: Double | Boolean
  var scale: Field
}

object AnonRange {
  @scala.inline
  def apply(range: Double | Boolean, scale: Field): AnonRange = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRange]
  }
}

