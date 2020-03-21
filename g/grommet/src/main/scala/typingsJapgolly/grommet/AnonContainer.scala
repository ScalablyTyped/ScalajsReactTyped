package typingsJapgolly.grommet

import typingsJapgolly.grommet.baseMod.ExtendType
import typingsJapgolly.grommet.utilsMod.BackgroundType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContainer extends js.Object {
  var background: js.UndefOr[BackgroundType] = js.undefined
  var border: js.UndefOr[AnonRadiusString] = js.undefined
  var container: js.UndefOr[AnonZIndex] = js.undefined
  var extend: js.UndefOr[ExtendType] = js.undefined
  var overlay: js.UndefOr[Anon1] = js.undefined
  var responsiveBreakpoint: js.UndefOr[String] = js.undefined
  var zIndex: js.UndefOr[String] = js.undefined
}

object AnonContainer {
  @scala.inline
  def apply(
    background: BackgroundType = null,
    border: AnonRadiusString = null,
    container: AnonZIndex = null,
    extend: ExtendType = null,
    overlay: Anon1 = null,
    responsiveBreakpoint: String = null,
    zIndex: String = null
  ): AnonContainer = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (responsiveBreakpoint != null) __obj.updateDynamic("responsiveBreakpoint")(responsiveBreakpoint.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContainer]
  }
}

