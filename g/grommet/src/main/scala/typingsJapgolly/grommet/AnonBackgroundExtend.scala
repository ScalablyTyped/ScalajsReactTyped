package typingsJapgolly.grommet

import typingsJapgolly.grommet.baseMod.ExtendType
import typingsJapgolly.grommet.utilsMod.BackgroundType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBackgroundExtend extends js.Object {
  var background: js.UndefOr[BackgroundType] = js.undefined
  var extend: js.UndefOr[ExtendType] = js.undefined
}

object AnonBackgroundExtend {
  @scala.inline
  def apply(background: BackgroundType = null, extend: ExtendType = null): AnonBackgroundExtend = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBackgroundExtend]
  }
}

