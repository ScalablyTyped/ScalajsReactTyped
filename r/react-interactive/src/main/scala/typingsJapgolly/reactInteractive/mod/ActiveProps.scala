package typingsJapgolly.reactInteractive.mod

import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactInteractive.AnonActive
  - typingsJapgolly.reactInteractive.AnonHoverActive
*/
trait ActiveProps extends js.Object

object ActiveProps {
  @scala.inline
  def AnonActive(active: CSSProperties = null): ActiveProps = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveProps]
  }
  @scala.inline
  def AnonHoverActive(
    hoverActive: CSSProperties = null,
    keyActive: CSSProperties = null,
    touchActive: CSSProperties = null
  ): ActiveProps = {
    val __obj = js.Dynamic.literal()
    if (hoverActive != null) __obj.updateDynamic("hoverActive")(hoverActive.asInstanceOf[js.Any])
    if (keyActive != null) __obj.updateDynamic("keyActive")(keyActive.asInstanceOf[js.Any])
    if (touchActive != null) __obj.updateDynamic("touchActive")(touchActive.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveProps]
  }
}

