package typingsJapgolly.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatsConnectionTypes extends js.Object {
  var all: StatsResourceCount
  var plain: StatsResourceCount
  var tls: StatsResourceCount
}

object StatsConnectionTypes {
  @scala.inline
  def apply(all: StatsResourceCount, plain: StatsResourceCount, tls: StatsResourceCount): StatsConnectionTypes = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], plain = plain.asInstanceOf[js.Any], tls = tls.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StatsConnectionTypes]
  }
}

