package typingsJapgolly.reactNativeCalendars.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.Context
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeCalendars.anon.EnableSwipeMonths
import typingsJapgolly.reactNativeCalendars.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def CalendarContext: Context[ProviderContextValue] = ^.asInstanceOf[js.Dynamic].selectDynamic("CalendarContext").asInstanceOf[Context[ProviderContextValue]]

type AgendaItemsMap[TItem] = StringDictionary[js.Array[TItem]]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactNativeCalendars.mod.MultiDotMarkingProps
  - typingsJapgolly.reactNativeCalendars.mod.DotMarkingProps
  - typingsJapgolly.reactNativeCalendars.mod.PeriodMarkingProps
  - typingsJapgolly.reactNativeCalendars.mod.MultiPeriodMarkingProps
  - typingsJapgolly.reactNativeCalendars.mod.CustomMarkingProps
  - js.Object
*/
type CalendarMarkingProps = _CalendarMarkingProps | js.Object

type CalendarProps = CalendarMarkingProps & CalendarBaseProps & EnableSwipeMonths

type CalendarThemeIdStyle = StringDictionary[ViewStyle | TextStyle]

type DateCallbackHandler = js.Function1[/* date */ DateObject, Unit]

type TCalendarDate = js.Date | DateObject | Double | String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XDate */ Any)
