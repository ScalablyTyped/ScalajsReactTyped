package typingsJapgolly.baseui

import typingsJapgolly.baseui.anon.PartialdefaultProps
import typingsJapgolly.baseui.anon.Readonlyxstringanyidstrin
import typingsJapgolly.baseui.anon.Start
import typingsJapgolly.baseui.anon.StepsValue
import typingsJapgolly.baseui.baseuiStrings.`12`
import typingsJapgolly.baseui.baseuiStrings.`24`
import typingsJapgolly.baseui.selectTypesMod.OnChangeParams
import typingsJapgolly.baseui.selectTypesMod.Option
import typingsJapgolly.baseui.selectTypesMod.Value
import typingsJapgolly.baseui.timepickerTypesMod.TimePickerDefaultProps
import typingsJapgolly.baseui.timepickerTypesMod.TimePickerProps
import typingsJapgolly.baseui.timepickerTypesMod.TimePickerState
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timepickerTimepickerMod {
  
  @JSImport("baseui/timepicker/timepicker", JSImport.Default)
  @js.native
  open class default[T] protected () extends TimePicker[T] {
    def this(props: TimePickerProps[T]) = this()
  }
  object default {
    
    @JSImport("baseui/timepicker/timepicker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("baseui/timepicker/timepicker", "default.defaultProps")
    @js.native
    def defaultProps: TimePickerDefaultProps = js.native
    inline def defaultProps_=(x: TimePickerDefaultProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait TimePicker[T] extends Component[TimePickerProps[T], TimePickerState, Any] {
    
    def buildSelectedOption(b: T): Option = js.native
    def buildSelectedOption(b: T, a: `12` | `24`): Option = js.native
    
    def buildSteps(): js.Array[Any] = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MTimePicker(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MTimePicker(prevProps: TimePickerProps[T]): Unit = js.native
    
    var creatableFilterOptions: js.Function4[
        /* options */ Value, 
        /* filterValue */ String, 
        /* excludeOptions */ js.UndefOr[Value | Null], 
        /* newProps */ js.UndefOr[PartialdefaultProps | Null], 
        js.Array[Readonlyxstringanyidstrin]
      ] = js.native
    
    var dateHelpers: typingsJapgolly.baseui.datepickerUtilsDateHelpersMod.default[T] = js.native
    
    def getTimeWindowInSeconds(step: Double): Start = js.native
    
    def handleChange(seconds: Double): Unit = js.native
    
    def onChange(params: OnChangeParams): Unit = js.native
    
    def secondsToLabel(seconds: Double): String = js.native
    def secondsToLabel(seconds: Double, format: `12` | `24`): String = js.native
    
    def setTime(d: T, c: Double, b: Double, a: Double): T = js.native
    def setTime(d: Null, c: Double, b: Double, a: Double): T = js.native
    def setTime(d: Unit, c: Double, b: Double, a: Double): T = js.native
    
    @JSName("state")
    var state_TimePicker: StepsValue = js.native
    
    /**
      * Converts a time string, e.g. 10:00, to one or more possible TimePicker
      * options representing that time.
      */
    def stringToOptions(a: String): js.Array[Option] = js.native
    def stringToOptions(a: String, format: `12` | `24`): js.Array[Option] = js.native
  }
}
