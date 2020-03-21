package typingsJapgolly.moment

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.moment.momentStrings.sameDay
    - typingsJapgolly.moment.momentStrings.nextDay
    - typingsJapgolly.moment.momentStrings.lastDay
    - typingsJapgolly.moment.momentStrings.nextWeek
    - typingsJapgolly.moment.momentStrings.lastWeek
    - typingsJapgolly.moment.momentStrings.sameElse
    - java.lang.String
  */
  type CalendarKey = typingsJapgolly.moment.mod._CalendarKey | java.lang.String
  type CalendarSpecVal = java.lang.String | (js.Function2[
    /* m */ js.UndefOr[typingsJapgolly.moment.mod.MomentInput], 
    /* now */ js.UndefOr[typingsJapgolly.moment.mod.Moment], 
    java.lang.String
  ])
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.moment.mod.Duration_
    - scala.Double
    - java.lang.String
    - typingsJapgolly.moment.mod.FromTo
    - typingsJapgolly.moment.mod.DurationInputObject
    - scala.Unit
  */
  type DurationInputArg1 = typingsJapgolly.moment.mod._DurationInputArg1 | scala.Double | java.lang.String | scala.Unit
  type DurationInputArg2 = typingsJapgolly.moment.mod.unitOfTime.DurationConstructor
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsJapgolly.moment.mod.Moment
    - typingsJapgolly.moment.mod.Duration_
    - js.Array[java.lang.String]
    - scala.Boolean
  */
  type LocaleSpecifier = typingsJapgolly.moment.mod._LocaleSpecifier | js.Array[java.lang.String] | java.lang.String | scala.Boolean
  type MomentFormatSpecification = java.lang.String | typingsJapgolly.moment.mod.MomentBuiltinFormat | (js.Array[java.lang.String | typingsJapgolly.moment.mod.MomentBuiltinFormat])
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.moment.mod.Moment
    - typingsJapgolly.std.Date
    - java.lang.String
    - scala.Double
    - js.Array[scala.Double | java.lang.String]
    - typingsJapgolly.moment.mod.MomentInputObject
    - scala.Unit
  */
  type MomentInput = typingsJapgolly.moment.mod._MomentInput | (js.Array[scala.Double | java.lang.String]) | js.Date | java.lang.String | scala.Double | scala.Unit
  type MonthWeekdayFn = js.Function2[
    /* momentToFormat */ typingsJapgolly.moment.mod.Moment, 
    /* format */ js.UndefOr[java.lang.String], 
    java.lang.String
  ]
  type RelativeTimeFuturePastVal = java.lang.String | (js.Function1[/* relTime */ java.lang.String, java.lang.String])
  type RelativeTimeSpecVal = java.lang.String | (js.Function4[
    /* n */ scala.Double, 
    /* withoutSuffix */ scala.Boolean, 
    /* key */ typingsJapgolly.moment.mod.RelativeTimeKey, 
    /* isFuture */ scala.Boolean, 
    java.lang.String
  ])
  type WeekdaySimpleFn = js.Function1[/* momentToFormat */ typingsJapgolly.moment.mod.Moment, java.lang.String]
}
