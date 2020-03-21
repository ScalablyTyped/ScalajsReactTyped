package typingsJapgolly.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MathEvents extends js.Object {
  /*This value is the time (in milliseconds) that a user must hold the mouse still over a math element before it
    * is considered to be hovering over the math.
    */
  var hover: js.UndefOr[Double] = js.undefined
  /*This is a list of CSS declarations for styling the zoomed mathematics. See the definitions in
    * extensions/MathEvents.js for details of what are defined by default. See CSS Style Objects for details on how
    * to specify CSS style in a JavaScript object.
    */
  var styles: js.UndefOr[js.Any] = js.undefined
}

object MathEvents {
  @scala.inline
  def apply(hover: Int | Double = null, styles: js.Any = null): MathEvents = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[MathEvents]
  }
}

