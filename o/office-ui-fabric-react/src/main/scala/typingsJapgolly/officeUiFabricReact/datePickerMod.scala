package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.datePickerTypesMod.IDatePickerProps
import typingsJapgolly.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/DatePicker", JSImport.Namespace)
@js.native
object datePickerMod extends js.Object {
  @js.native
  class DatePickerBase protected ()
    extends typingsJapgolly.officeUiFabricReact.datePickerBaseMod.DatePickerBase {
    def this(props: IDatePickerProps) = this()
  }
  
  val DatePicker: FunctionComponent[IDatePickerProps] = js.native
  /* static members */
  @js.native
  object DatePickerBase extends js.Object {
    var defaultProps: IDatePickerProps = js.native
  }
  
  @js.native
  object DateRangeType extends js.Object {
    /* 0 */ val Day: typingsJapgolly.officeUiFabricReact.dateValuesMod.DateRangeType.Day with Double = js.native
    /* 2 */ val Month: typingsJapgolly.officeUiFabricReact.dateValuesMod.DateRangeType.Month with Double = js.native
    /* 1 */ val Week: typingsJapgolly.officeUiFabricReact.dateValuesMod.DateRangeType.Week with Double = js.native
    /* 3 */ val WorkWeek: typingsJapgolly.officeUiFabricReact.dateValuesMod.DateRangeType.WorkWeek with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.officeUiFabricReact.dateValuesMod.DateRangeType with Double] = js.native
  }
  
  @js.native
  object DayOfWeek extends js.Object {
    /* 5 */ val Friday: typingsJapgolly.officeUiFabricReact.dateValuesMod.DayOfWeek.Friday with Double = js.native
    /* 1 */ val Monday: typingsJapgolly.officeUiFabricReact.dateValuesMod.DayOfWeek.Monday with Double = js.native
    /* 6 */ val Saturday: typingsJapgolly.officeUiFabricReact.dateValuesMod.DayOfWeek.Saturday with Double = js.native
    /* 0 */ val Sunday: typingsJapgolly.officeUiFabricReact.dateValuesMod.DayOfWeek.Sunday with Double = js.native
    /* 4 */ val Thursday: typingsJapgolly.officeUiFabricReact.dateValuesMod.DayOfWeek.Thursday with Double = js.native
    /* 2 */ val Tuesday: typingsJapgolly.officeUiFabricReact.dateValuesMod.DayOfWeek.Tuesday with Double = js.native
    /* 3 */ val Wednesday: typingsJapgolly.officeUiFabricReact.dateValuesMod.DayOfWeek.Wednesday with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.officeUiFabricReact.dateValuesMod.DayOfWeek with Double] = js.native
  }
  
  @js.native
  object FirstWeekOfYear extends js.Object {
    /* 0 */ val FirstDay: typingsJapgolly.officeUiFabricReact.dateValuesMod.FirstWeekOfYear.FirstDay with Double = js.native
    /* 2 */ val FirstFourDayWeek: typingsJapgolly.officeUiFabricReact.dateValuesMod.FirstWeekOfYear.FirstFourDayWeek with Double = js.native
    /* 1 */ val FirstFullWeek: typingsJapgolly.officeUiFabricReact.dateValuesMod.FirstWeekOfYear.FirstFullWeek with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.officeUiFabricReact.dateValuesMod.FirstWeekOfYear with Double] = js.native
  }
  
}

