package typingsJapgolly.mjmlReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MjmlProps extends js.Object {
  var lang: js.UndefOr[String] = js.undefined
  var owa: js.UndefOr[String] = js.undefined
}

object MjmlProps {
  @scala.inline
  def apply(lang: String = null, owa: String = null): MjmlProps = {
    val __obj = js.Dynamic.literal()
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (owa != null) __obj.updateDynamic("owa")(owa.asInstanceOf[js.Any])
    __obj.asInstanceOf[MjmlProps]
  }
}

