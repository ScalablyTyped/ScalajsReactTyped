package typingsJapgolly.flatpickr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object optionsMod {
  type DateLimit[D] = D | typingsJapgolly.flatpickr.optionsMod.DateRangeLimit[D] | (js.Function1[/* date */ typingsJapgolly.flatpickr.globalsMod._Global_.Date, scala.Boolean])
  type DateOption = typingsJapgolly.flatpickr.globalsMod._Global_.Date | java.lang.String | scala.Double
  type Hook = js.Function4[
    /* dates */ js.Array[typingsJapgolly.flatpickr.globalsMod._Global_.Date], 
    /* currentDateString */ java.lang.String, 
    /* self */ typingsJapgolly.flatpickr.instanceMod.Instance, 
    /* data */ js.UndefOr[js.Any], 
    scala.Unit
  ]
  type Plugin[E] = js.Function1[
    /* fp */ typingsJapgolly.flatpickr.instanceMod.Instance with E, 
    typingsJapgolly.flatpickr.optionsMod.Options
  ]
}
