package typingsJapgolly.fundamentalReact.labelMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelProps
  extends /* x */ StringDictionary[js.Any] {
  var className: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[LabelTypes] = js.undefined
}

object LabelProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    className: String = null,
    `type`: LabelTypes = null
  ): LabelProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelProps]
  }
}

