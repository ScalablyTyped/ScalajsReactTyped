package typingsJapgolly.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait fragLoadProgressData extends js.Object {
  var frag: Fragment
  var stats: Stats
}

object fragLoadProgressData {
  @scala.inline
  def apply(frag: Fragment, stats: Stats): fragLoadProgressData = {
    val __obj = js.Dynamic.literal(frag = frag.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[fragLoadProgressData]
  }
}

