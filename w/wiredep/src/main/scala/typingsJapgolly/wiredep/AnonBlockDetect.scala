package typingsJapgolly.wiredep

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBlockDetect extends js.Object {
  /**
    * @example:
    *  /(([ \t]*)\/\/\s*bower:*(\S*))(\n|\r|.)*?(\/\/\s*endbower)/gi
    */
  var block: js.RegExp
  var detect: AnonSass
  var replace: AnonScss
}

object AnonBlockDetect {
  @scala.inline
  def apply(block: js.RegExp, detect: AnonSass, replace: AnonScss): AnonBlockDetect = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], detect = detect.asInstanceOf[js.Any], replace = replace.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBlockDetect]
  }
}

