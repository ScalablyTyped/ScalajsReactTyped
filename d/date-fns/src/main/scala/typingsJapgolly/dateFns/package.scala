package typingsJapgolly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dateFns {
  type CurriedFn1[A, R] = js.Function1[/* a */ A, R]
  type DurationAliased = typingsJapgolly.dateFns.Duration
  type IntervalAliased = typingsJapgolly.dateFns.Interval
  type LocaleAliased = typingsJapgolly.dateFns.Locale
}
