package typingsJapgolly.fundamentalReact.panelMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelActionsProps
  extends /* x */ StringDictionary[js.Any] {
  var className: js.UndefOr[String] = js.undefined
}

object PanelActionsProps {
  @scala.inline
  def apply(StringDictionary: /* x */ StringDictionary[js.Any] = null, className: String = null): PanelActionsProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanelActionsProps]
  }
}

