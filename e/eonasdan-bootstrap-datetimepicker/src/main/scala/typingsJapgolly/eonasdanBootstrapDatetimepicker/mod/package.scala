package typingsJapgolly.eonasdanBootstrapDatetimepicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DateComparable = java.lang.String | js.Date | typingsJapgolly.moment.mod.Moment
  type FromTo = js.Tuple2[typingsJapgolly.moment.mod.Moment, typingsJapgolly.moment.mod.Moment]
  type IndexedDates = org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  type IndexedHours = org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  type ParseInputDateFunction = js.Function1[/* inputDate */ java.lang.String, typingsJapgolly.moment.mod.Moment]
}
