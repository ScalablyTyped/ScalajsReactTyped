package typingsJapgolly.antdMobileRn.stepsPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepsPropsType extends js.Object {
  var children: js.Array[_]
  var current: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[String] = js.undefined
}

object StepsPropsType {
  @scala.inline
  def apply(children: js.Array[_], current: Int | Double = null, size: String = null): StepsPropsType = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepsPropsType]
  }
}

