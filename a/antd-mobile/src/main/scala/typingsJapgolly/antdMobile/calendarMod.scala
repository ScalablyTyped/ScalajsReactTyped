package typingsJapgolly.antdMobile

import typingsJapgolly.antdMobile.calendarPropsTypeMod.CalendarProps
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd-mobile/lib/calendar", JSImport.Namespace)
@js.native
object calendarMod extends js.Object {
  @js.native
  trait Calendar
    extends Component[CalendarProps, js.Any, js.Any]
  
  @js.native
  class default () extends Calendar
  
  /* static members */
  @js.native
  object default extends js.Object {
    var contextTypes: AnonAntLocale = js.native
    var defaultProps: AnonTimePickerPickerPrefixCls = js.native
  }
  
}

