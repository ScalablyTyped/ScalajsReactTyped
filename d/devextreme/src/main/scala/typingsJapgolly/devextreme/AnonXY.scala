package typingsJapgolly.devextreme

import typingsJapgolly.devextreme.devextremeStrings.fit
import typingsJapgolly.devextreme.devextremeStrings.flip
import typingsJapgolly.devextreme.devextremeStrings.flipfit
import typingsJapgolly.devextreme.devextremeStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonXY extends js.Object {
  var x: js.UndefOr[fit | flip | flipfit | none] = js.undefined
  var y: js.UndefOr[fit | flip | flipfit | none] = js.undefined
}

object AnonXY {
  @scala.inline
  def apply(x: fit | flip | flipfit | none = null, y: fit | flip | flipfit | none = null): AnonXY = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonXY]
  }
}

