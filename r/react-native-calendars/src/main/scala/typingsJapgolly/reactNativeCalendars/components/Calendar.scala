package typingsJapgolly.reactNativeCalendars.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeCalendars.mod.CalendarBaseProps
import typingsJapgolly.reactNativeCalendars.mod.CalendarMarkingProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. */
object Calendar {
  def apply(
    props: CalendarMarkingProps with CalendarBaseProps with js.Object,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    CalendarMarkingProps with CalendarBaseProps with js.Object, 
    typingsJapgolly.reactNativeCalendars.mod.Calendar, 
    Unit, 
    CalendarMarkingProps with CalendarBaseProps with js.Object
  ] = {
    val __obj = js.Dynamic.literal()
  
      js.Dynamic.global.Object.assign(__obj, props)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeCalendars.mod.CalendarMarkingProps with typingsJapgolly.reactNativeCalendars.mod.CalendarBaseProps with js.Object, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeCalendars.mod.Calendar](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeCalendars.mod.CalendarMarkingProps with typingsJapgolly.reactNativeCalendars.mod.CalendarBaseProps with js.Object])(children: _*)
  }
  @JSImport("react-native-calendars", "Calendar")
  @js.native
  object componentImport extends js.Object
  
}

