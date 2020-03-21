package typingsJapgolly.memwatchNext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type EventCallback = js.Function1[
    /* data */ typingsJapgolly.memwatchNext.mod.LeakInformation | typingsJapgolly.memwatchNext.mod.StatsInformation | js.Object, 
    scala.Unit
  ]
}
