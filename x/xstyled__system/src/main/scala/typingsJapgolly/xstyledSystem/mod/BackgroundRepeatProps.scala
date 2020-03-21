package typingsJapgolly.xstyledSystem.mod

import typingsJapgolly.csstype.mod.BackgroundRepeatProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundRepeatProps extends js.Object {
  val backgroundRepeat: js.UndefOr[ResponsiveValue[BackgroundRepeatProperty]] = js.undefined
}

object BackgroundRepeatProps {
  @scala.inline
  def apply(backgroundRepeat: ResponsiveValue[BackgroundRepeatProperty] = null): BackgroundRepeatProps = {
    val __obj = js.Dynamic.literal()
    if (backgroundRepeat != null) __obj.updateDynamic("backgroundRepeat")(backgroundRepeat.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundRepeatProps]
  }
}

