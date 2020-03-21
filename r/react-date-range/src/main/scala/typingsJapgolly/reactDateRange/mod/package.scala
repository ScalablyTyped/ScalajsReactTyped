package typingsJapgolly.reactDateRange

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AnyDate = java.lang.String | typingsJapgolly.moment.mod.Moment
  type DateFunc = js.Function1[
    /* now */ typingsJapgolly.moment.mod.Moment, 
    typingsJapgolly.reactDateRange.mod.AnyDate
  ]
  type DateInputType = typingsJapgolly.reactDateRange.mod.AnyDate | typingsJapgolly.reactDateRange.mod.DateFunc
  type SizeType = scala.Double
}
