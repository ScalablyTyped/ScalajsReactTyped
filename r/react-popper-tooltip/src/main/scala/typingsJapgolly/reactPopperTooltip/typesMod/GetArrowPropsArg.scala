package typingsJapgolly.reactPopperTooltip.typesMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetArrowPropsArg
  extends /* key */ StringDictionary[js.Any] {
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object GetArrowPropsArg {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[js.Any] = null, style: CSSProperties = null): GetArrowPropsArg = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetArrowPropsArg]
  }
}

