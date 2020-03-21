package typingsJapgolly.wiredep

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCss extends js.Object {
  /**
    * @example:
    *  /-\s(.+css)/gi
    */
  var css: js.RegExp
  /**
    * @example:
    *  /-\s(.+js)/gi
    */
  @JSName("js")
  var js_ : js.RegExp
}

object AnonCss {
  @scala.inline
  def apply(css: js.RegExp, js_ : js.RegExp): AnonCss = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any])
    __obj.updateDynamic("js")(js_.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCss]
  }
}

