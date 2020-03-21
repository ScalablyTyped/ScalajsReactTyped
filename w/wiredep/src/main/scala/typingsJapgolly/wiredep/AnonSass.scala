package typingsJapgolly.wiredep

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSass extends js.Object {
  /**
    * @example:
    *  /@import\s['"](.+css)['"]/gi
    */
  var css: js.RegExp
  /**
    * @example:
    *  /@import\s['"](.+sass)['"]/gi
    */
  var sass: js.RegExp
  /**
    * @example:
    *  /@import\s['"](.+scss)['"]/gi
    */
  var scss: js.RegExp
}

object AnonSass {
  @scala.inline
  def apply(css: js.RegExp, sass: js.RegExp, scss: js.RegExp): AnonSass = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], sass = sass.asInstanceOf[js.Any], scss = scss.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSass]
  }
}

