package typingsJapgolly.wiredep

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReplace extends js.Object {
  /**
    * @example:
    *  /(([ \t]*)\/\/\s*bower:*(\S*))(\n|\r|.)*?(\/\/\s*endbower)/gi
    */
  var block: js.RegExp
  var detect: AnonLess
  var replace: AnonCssLess
}

object AnonReplace {
  @scala.inline
  def apply(block: js.RegExp, detect: AnonLess, replace: AnonCssLess): AnonReplace = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], detect = detect.asInstanceOf[js.Any], replace = replace.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonReplace]
  }
}

