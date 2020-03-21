package typingsJapgolly.reactNativeCalendars

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AgendaItemsMap[TItem] = org.scalablytyped.runtime.StringDictionary[js.Array[TItem]]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNativeCalendars.mod.MultiDotMarkingProps
    - typingsJapgolly.reactNativeCalendars.mod.DotMarkingProps
    - typingsJapgolly.reactNativeCalendars.mod.PeriodMarkingProps
    - typingsJapgolly.reactNativeCalendars.mod.MultiPeriodMarkingProps
    - typingsJapgolly.reactNativeCalendars.mod.CustomMarkingProps
    - js.Object
  */
  type CalendarMarkingProps = typingsJapgolly.reactNativeCalendars.mod._CalendarMarkingProps | js.Object
  type CalendarThemeIdStyle = org.scalablytyped.runtime.StringDictionary[
    typingsJapgolly.reactNative.mod.ViewStyle | typingsJapgolly.reactNative.mod.TextStyle
  ]
  type DateCallbackHandler = js.Function1[/* date */ typingsJapgolly.reactNativeCalendars.mod.DateObject, scala.Unit]
  type TCalendarDate = js.Date | typingsJapgolly.reactNativeCalendars.mod.DateObject | scala.Double | java.lang.String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XDate */ js.Any)
}
