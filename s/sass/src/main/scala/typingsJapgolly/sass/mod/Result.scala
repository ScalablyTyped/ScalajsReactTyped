package typingsJapgolly.sass.mod

import typingsJapgolly.node.Buffer
import typingsJapgolly.sass.AnonDuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  /**
    * The compiled CSS.
    *
    * Write this to a file, or serve it out as needed.
    */
  var css: Buffer
  /**
    * The source map.
    */
  var map: js.UndefOr[Buffer] = js.undefined
  var stats: AnonDuration
}

object Result {
  @scala.inline
  def apply(css: Buffer, stats: AnonDuration, map: Buffer = null): Result = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
}

