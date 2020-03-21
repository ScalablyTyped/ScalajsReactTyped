package typingsJapgolly.daterangepicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DataRangePickerCallback = js.Function3[
    /* start */ typingsJapgolly.moment.mod.Moment, 
    /* end */ typingsJapgolly.moment.mod.Moment, 
    /* label */ java.lang.String | scala.Null, 
    scala.Unit
  ]
  type DateOrString = java.lang.String | typingsJapgolly.moment.mod.Moment | js.Date
}
