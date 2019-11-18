package typingsJapgolly.antd

import typingsJapgolly.antd.antdStrings.circle
import typingsJapgolly.antd.antdStrings.default
import typingsJapgolly.antd.antdStrings.large
import typingsJapgolly.antd.antdStrings.small
import typingsJapgolly.antd.antdStrings.square
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Circle extends js.Object {
  var shape: js.UndefOr[square | circle] = js.undefined
  var size: js.UndefOr[Double | small | default | large] = js.undefined
}

object Anon_Circle {
  @scala.inline
  def apply(shape: square | circle = null, size: Double | small | default | large = null): Anon_Circle = {
    val __obj = js.Dynamic.literal()
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Circle]
  }
}

