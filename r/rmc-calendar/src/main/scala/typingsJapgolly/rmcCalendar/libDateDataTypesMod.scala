package typingsJapgolly.rmcCalendar

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.rmcCalendar.libDateSingleMonthMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDateDataTypesMod {
  
  object Models {
    
    @js.native
    sealed trait SelectType extends StObject
    @JSImport("rmc-calendar/lib/date/DataTypes", "Models.SelectType")
    @js.native
    object SelectType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[SelectType & Double] = js.native
      
      /** 起/止 */
      @js.native
      sealed trait All
        extends StObject
           with SelectType
      /* 2 */ val All: typingsJapgolly.rmcCalendar.libDateDataTypesMod.Models.SelectType.All & Double = js.native
      
      /** 区间止 */
      @js.native
      sealed trait End
        extends StObject
           with SelectType
      /* 6 */ val End: typingsJapgolly.rmcCalendar.libDateDataTypesMod.Models.SelectType.End & Double = js.native
      
      /** 区间中 */
      @js.native
      sealed trait Middle
        extends StObject
           with SelectType
      /* 5 */ val Middle: typingsJapgolly.rmcCalendar.libDateDataTypesMod.Models.SelectType.Middle & Double = js.native
      
      @js.native
      sealed trait None
        extends StObject
           with SelectType
      /* 0 */ val None: typingsJapgolly.rmcCalendar.libDateDataTypesMod.Models.SelectType.None & Double = js.native
      
      /** 区间仅选择了 起 */
      @js.native
      sealed trait Only
        extends StObject
           with SelectType
      /* 3 */ val Only: typingsJapgolly.rmcCalendar.libDateDataTypesMod.Models.SelectType.Only & Double = js.native
      
      /** 单选 */
      @js.native
      sealed trait Single
        extends StObject
           with SelectType
      /* 1 */ val Single: typingsJapgolly.rmcCalendar.libDateDataTypesMod.Models.SelectType.Single & Double = js.native
      
      /** 区间起 */
      @js.native
      sealed trait Start
        extends StObject
           with SelectType
      /* 4 */ val Start: typingsJapgolly.rmcCalendar.libDateDataTypesMod.Models.SelectType.Start & Double = js.native
    }
    
    trait CellData extends StObject {
      
      var dayOfMonth: Double
      
      var isFirstOfMonth: Boolean
      
      var isLastOfMonth: Boolean
      
      var outOfDate: Boolean
      
      var selected: SelectType
      
      var tick: Double
    }
    object CellData {
      
      inline def apply(
        dayOfMonth: Double,
        isFirstOfMonth: Boolean,
        isLastOfMonth: Boolean,
        outOfDate: Boolean,
        selected: SelectType,
        tick: Double
      ): CellData = {
        val __obj = js.Dynamic.literal(dayOfMonth = dayOfMonth.asInstanceOf[js.Any], isFirstOfMonth = isFirstOfMonth.asInstanceOf[js.Any], isLastOfMonth = isLastOfMonth.asInstanceOf[js.Any], outOfDate = outOfDate.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], tick = tick.asInstanceOf[js.Any])
        __obj.asInstanceOf[CellData]
      }
      
      extension [Self <: CellData](x: Self) {
        
        inline def setDayOfMonth(value: Double): Self = StObject.set(x, "dayOfMonth", value.asInstanceOf[js.Any])
        
        inline def setIsFirstOfMonth(value: Boolean): Self = StObject.set(x, "isFirstOfMonth", value.asInstanceOf[js.Any])
        
        inline def setIsLastOfMonth(value: Boolean): Self = StObject.set(x, "isLastOfMonth", value.asInstanceOf[js.Any])
        
        inline def setOutOfDate(value: Boolean): Self = StObject.set(x, "outOfDate", value.asInstanceOf[js.Any])
        
        inline def setSelected(value: SelectType): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
        
        inline def setTick(value: Double): Self = StObject.set(x, "tick", value.asInstanceOf[js.Any])
      }
    }
    
    trait ExtraData extends StObject {
      
      /** (web only) 附加cell样式 className */
      var cellCls: js.UndefOr[Any] = js.undefined
      
      var cellRender: js.UndefOr[js.Function1[/* date */ js.Date, Node]] = js.undefined
      
      /** 是否禁止选择 */
      var disable: js.UndefOr[Boolean] = js.undefined
      
      /** 扩展信息 */
      var info: js.UndefOr[String] = js.undefined
    }
    object ExtraData {
      
      inline def apply(): ExtraData = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ExtraData]
      }
      
      extension [Self <: ExtraData](x: Self) {
        
        inline def setCellCls(value: Any): Self = StObject.set(x, "cellCls", value.asInstanceOf[js.Any])
        
        inline def setCellClsUndefined: Self = StObject.set(x, "cellCls", js.undefined)
        
        inline def setCellRender(value: /* date */ js.Date => Node): Self = StObject.set(x, "cellRender", js.Any.fromFunction1(value))
        
        inline def setCellRenderUndefined: Self = StObject.set(x, "cellRender", js.undefined)
        
        inline def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
        
        inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
        
        inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
        
        inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      }
    }
    
    trait Locale extends StObject {
      
      var am: String
      
      var begin: String
      
      var begin_over: String
      
      var clear: String
      
      var confirm: String
      
      var dateFormat: String
      
      var dateTimeFormat: String
      
      var end: String
      
      var lastMonth: String
      
      var lastWeek: String
      
      var loadPrevMonth: String
      
      var month: String
      
      var monthTitle: String
      
      var noChoose: String
      
      var over: String
      
      var pm: String
      
      var selectEndTime: String
      
      var selectStartTime: String
      
      var selectTime: String
      
      var start: String
      
      var title: String
      
      var today: String
      
      var week: js.Array[String]
      
      var year: String
      
      var yesterday: String
    }
    object Locale {
      
      inline def apply(
        am: String,
        begin: String,
        begin_over: String,
        clear: String,
        confirm: String,
        dateFormat: String,
        dateTimeFormat: String,
        end: String,
        lastMonth: String,
        lastWeek: String,
        loadPrevMonth: String,
        month: String,
        monthTitle: String,
        noChoose: String,
        over: String,
        pm: String,
        selectEndTime: String,
        selectStartTime: String,
        selectTime: String,
        start: String,
        title: String,
        today: String,
        week: js.Array[String],
        year: String,
        yesterday: String
      ): Locale = {
        val __obj = js.Dynamic.literal(am = am.asInstanceOf[js.Any], begin = begin.asInstanceOf[js.Any], begin_over = begin_over.asInstanceOf[js.Any], clear = clear.asInstanceOf[js.Any], confirm = confirm.asInstanceOf[js.Any], dateFormat = dateFormat.asInstanceOf[js.Any], dateTimeFormat = dateTimeFormat.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], lastMonth = lastMonth.asInstanceOf[js.Any], lastWeek = lastWeek.asInstanceOf[js.Any], loadPrevMonth = loadPrevMonth.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], monthTitle = monthTitle.asInstanceOf[js.Any], noChoose = noChoose.asInstanceOf[js.Any], over = over.asInstanceOf[js.Any], pm = pm.asInstanceOf[js.Any], selectEndTime = selectEndTime.asInstanceOf[js.Any], selectStartTime = selectStartTime.asInstanceOf[js.Any], selectTime = selectTime.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], today = today.asInstanceOf[js.Any], week = week.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any], yesterday = yesterday.asInstanceOf[js.Any])
        __obj.asInstanceOf[Locale]
      }
      
      extension [Self <: Locale](x: Self) {
        
        inline def setAm(value: String): Self = StObject.set(x, "am", value.asInstanceOf[js.Any])
        
        inline def setBegin(value: String): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
        
        inline def setBegin_over(value: String): Self = StObject.set(x, "begin_over", value.asInstanceOf[js.Any])
        
        inline def setClear(value: String): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
        
        inline def setConfirm(value: String): Self = StObject.set(x, "confirm", value.asInstanceOf[js.Any])
        
        inline def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
        
        inline def setDateTimeFormat(value: String): Self = StObject.set(x, "dateTimeFormat", value.asInstanceOf[js.Any])
        
        inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
        
        inline def setLastMonth(value: String): Self = StObject.set(x, "lastMonth", value.asInstanceOf[js.Any])
        
        inline def setLastWeek(value: String): Self = StObject.set(x, "lastWeek", value.asInstanceOf[js.Any])
        
        inline def setLoadPrevMonth(value: String): Self = StObject.set(x, "loadPrevMonth", value.asInstanceOf[js.Any])
        
        inline def setMonth(value: String): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
        
        inline def setMonthTitle(value: String): Self = StObject.set(x, "monthTitle", value.asInstanceOf[js.Any])
        
        inline def setNoChoose(value: String): Self = StObject.set(x, "noChoose", value.asInstanceOf[js.Any])
        
        inline def setOver(value: String): Self = StObject.set(x, "over", value.asInstanceOf[js.Any])
        
        inline def setPm(value: String): Self = StObject.set(x, "pm", value.asInstanceOf[js.Any])
        
        inline def setSelectEndTime(value: String): Self = StObject.set(x, "selectEndTime", value.asInstanceOf[js.Any])
        
        inline def setSelectStartTime(value: String): Self = StObject.set(x, "selectStartTime", value.asInstanceOf[js.Any])
        
        inline def setSelectTime(value: String): Self = StObject.set(x, "selectTime", value.asInstanceOf[js.Any])
        
        inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setToday(value: String): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
        
        inline def setWeek(value: js.Array[String]): Self = StObject.set(x, "week", value.asInstanceOf[js.Any])
        
        inline def setWeekVarargs(value: String*): Self = StObject.set(x, "week", js.Array(value*))
        
        inline def setYear(value: String): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
        
        inline def setYesterday(value: String): Self = StObject.set(x, "yesterday", value.asInstanceOf[js.Any])
      }
    }
    
    trait MonthData extends StObject {
      
      var component: js.UndefOr[Node] = js.undefined
      
      var componentRef: js.UndefOr[default] = js.undefined
      
      var firstDate: js.Date
      
      var height: js.UndefOr[Double] = js.undefined
      
      var lastDate: js.Date
      
      var title: String
      
      var updateLayout: js.UndefOr[js.Function] = js.undefined
      
      var weeks: js.Array[js.Array[CellData]]
      
      var y: js.UndefOr[Double] = js.undefined
    }
    object MonthData {
      
      inline def apply(firstDate: js.Date, lastDate: js.Date, title: String, weeks: js.Array[js.Array[CellData]]): MonthData = {
        val __obj = js.Dynamic.literal(firstDate = firstDate.asInstanceOf[js.Any], lastDate = lastDate.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], weeks = weeks.asInstanceOf[js.Any])
        __obj.asInstanceOf[MonthData]
      }
      
      extension [Self <: MonthData](x: Self) {
        
        inline def setComponent(value: VdomNode): Self = StObject.set(x, "component", value.rawNode.asInstanceOf[js.Any])
        
        inline def setComponentNull: Self = StObject.set(x, "component", null)
        
        inline def setComponentRef(value: default): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
        
        inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
        
        inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
        
        inline def setComponentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "component", js.Array(value*))
        
        inline def setComponentVdomElement(value: VdomElement): Self = StObject.set(x, "component", value.rawElement.asInstanceOf[js.Any])
        
        inline def setFirstDate(value: js.Date): Self = StObject.set(x, "firstDate", value.asInstanceOf[js.Any])
        
        inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
        
        inline def setLastDate(value: js.Date): Self = StObject.set(x, "lastDate", value.asInstanceOf[js.Any])
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setUpdateLayout(value: js.Function): Self = StObject.set(x, "updateLayout", value.asInstanceOf[js.Any])
        
        inline def setUpdateLayoutUndefined: Self = StObject.set(x, "updateLayout", js.undefined)
        
        inline def setWeeks(value: js.Array[js.Array[CellData]]): Self = StObject.set(x, "weeks", value.asInstanceOf[js.Any])
        
        inline def setWeeksVarargs(value: js.Array[CellData]*): Self = StObject.set(x, "weeks", js.Array(value*))
        
        inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
        
        inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      }
    }
  }
}
