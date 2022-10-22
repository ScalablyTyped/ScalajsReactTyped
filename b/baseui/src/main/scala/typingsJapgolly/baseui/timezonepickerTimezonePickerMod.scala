package typingsJapgolly.baseui

import typingsJapgolly.baseui.timezonepickerTypesMod.Timezone
import typingsJapgolly.baseui.timezonepickerTypesMod.TimezonePickerProps
import typingsJapgolly.baseui.timezonepickerTypesMod.TimezonePickerState
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timezonepickerTimezonePickerMod {
  
  @JSImport("baseui/timezonepicker/timezone-picker", JSImport.Default)
  @js.native
  open class default () extends TimezonePicker
  
  @js.native
  trait TimezonePicker extends Component[TimezonePickerProps, TimezonePickerState, Any] {
    
    def buildTimezones(compareDate: js.Date): js.Array[Timezone] = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MTimezonePicker(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MTimezonePicker(prevProps: TimezonePickerProps): Unit = js.native
  }
}
