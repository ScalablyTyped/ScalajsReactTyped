package typingsJapgolly.victory

import typingsJapgolly.victory.mod.DomainTuple
import typingsJapgolly.victory.mod._DomainPropType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonYDomainTuple extends _DomainPropType {
  var x: DomainTuple
  var y: js.UndefOr[DomainTuple] = js.undefined
}

object AnonYDomainTuple {
  @scala.inline
  def apply(x: DomainTuple, y: DomainTuple = null): AnonYDomainTuple = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonYDomainTuple]
  }
}

