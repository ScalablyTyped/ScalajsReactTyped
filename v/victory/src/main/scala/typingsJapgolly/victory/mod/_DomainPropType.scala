package typingsJapgolly.victory.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _DomainPropType extends js.Object

object _DomainPropType {
  @scala.inline
  def AnonXDomainTuple(y: DomainTuple, x: DomainTuple = null): _DomainPropType = {
    val __obj = js.Dynamic.literal(y = y.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    __obj.asInstanceOf[_DomainPropType]
  }
  @scala.inline
  def AnonYDomainTuple(x: DomainTuple, y: DomainTuple = null): _DomainPropType = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[_DomainPropType]
  }
}

