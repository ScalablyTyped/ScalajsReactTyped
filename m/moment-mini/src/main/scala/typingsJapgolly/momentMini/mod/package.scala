package typingsJapgolly.momentMini

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.momentMini.momentMiniStrings.sameDay
    - typingsJapgolly.momentMini.momentMiniStrings.nextDay
    - typingsJapgolly.momentMini.momentMiniStrings.lastDay
    - typingsJapgolly.momentMini.momentMiniStrings.nextWeek
    - typingsJapgolly.momentMini.momentMiniStrings.lastWeek
    - typingsJapgolly.momentMini.momentMiniStrings.sameElse
    - java.lang.String
  */
  type CalendarKey = typingsJapgolly.momentMini.mod._CalendarKey | java.lang.String
  type CalendarSpecVal = java.lang.String | (js.Function2[
    /* m */ js.UndefOr[typingsJapgolly.momentMini.mod.MomentInput], 
    /* now */ js.UndefOr[typingsJapgolly.momentMini.mod.Moment], 
    java.lang.String
  ])
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.momentMini.mod.Duration_
    - scala.Double
    - java.lang.String
    - typingsJapgolly.momentMini.mod.FromTo
    - typingsJapgolly.momentMini.mod.DurationInputObject
    - scala.Unit
  */
  type DurationInputArg1 = typingsJapgolly.momentMini.mod._DurationInputArg1 | scala.Double | java.lang.String | scala.Unit
  type DurationInputArg2 = typingsJapgolly.momentMini.mod.unitOfTime.DurationConstructor
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsJapgolly.momentMini.mod.Moment
    - typingsJapgolly.momentMini.mod.Duration_
    - js.Array[java.lang.String]
    - scala.Boolean
  */
  type LocaleSpecifier = typingsJapgolly.momentMini.mod._LocaleSpecifier | js.Array[java.lang.String] | java.lang.String | scala.Boolean
  type MomentFormatSpecification = java.lang.String | typingsJapgolly.momentMini.mod.MomentBuiltinFormat | (js.Array[java.lang.String | typingsJapgolly.momentMini.mod.MomentBuiltinFormat])
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.momentMini.mod.Moment
    - typingsJapgolly.std.Date
    - java.lang.String
    - scala.Double
    - js.Array[scala.Double | java.lang.String]
    - typingsJapgolly.momentMini.mod.MomentInputObject
    - scala.Unit
  */
  type MomentInput = typingsJapgolly.momentMini.mod._MomentInput | (js.Array[scala.Double | java.lang.String]) | js.Date | java.lang.String | scala.Double | scala.Unit
  type MonthWeekdayFn = js.Function2[
    /* momentToFormat */ typingsJapgolly.momentMini.mod.Moment, 
    /* format */ js.UndefOr[java.lang.String], 
    java.lang.String
  ]
  type RelativeTimeFuturePastVal = java.lang.String | (js.Function1[/* relTime */ java.lang.String, java.lang.String])
  type RelativeTimeSpecVal = java.lang.String | (js.Function4[
    /* n */ scala.Double, 
    /* withoutSuffix */ scala.Boolean, 
    /* key */ typingsJapgolly.momentMini.mod.RelativeTimeKey, 
    /* isFuture */ scala.Boolean, 
    java.lang.String
  ])
  type WeekdaySimpleFn = js.Function1[/* momentToFormat */ typingsJapgolly.momentMini.mod.Moment, java.lang.String]
}
