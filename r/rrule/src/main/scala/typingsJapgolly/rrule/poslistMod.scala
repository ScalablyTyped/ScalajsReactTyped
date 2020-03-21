package typingsJapgolly.rrule

import typingsJapgolly.rrule.datetimeMod.Time
import typingsJapgolly.rrule.iterinfoMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rrule/dist/esm/src/iter/poslist", JSImport.Namespace)
@js.native
object poslistMod extends js.Object {
  def buildPoslist(
    bysetpos: js.Array[Double],
    timeset: js.Array[Time],
    start: Double,
    end: Double,
    ii: default,
    dayset: js.Array[Double | Null]
  ): js.Array[js.Date] = js.native
}

