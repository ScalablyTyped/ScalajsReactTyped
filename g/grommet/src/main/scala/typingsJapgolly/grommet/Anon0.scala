package typingsJapgolly.grommet

import typingsJapgolly.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0 extends js.Object {
  var color: js.UndefOr[ColorType] = js.undefined
}

object Anon0 {
  @scala.inline
  def apply(color: ColorType = null): Anon0 = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon0]
  }
}

