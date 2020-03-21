package typingsJapgolly.devextreme

import org.scalajs.dom.raw.Element
import typingsJapgolly.devextreme.devextremeNumbers.`0`
import typingsJapgolly.devextreme.devextremeNumbers.`1`
import typingsJapgolly.devextreme.devextremeNumbers.`2`
import typingsJapgolly.devextreme.devextremeNumbers.`3`
import typingsJapgolly.devextreme.devextremeNumbers.`4`
import typingsJapgolly.devextreme.devextremeNumbers.`5`
import typingsJapgolly.devextreme.devextremeNumbers.`6`
import typingsJapgolly.devextreme.devextremeStrings.agenda
import typingsJapgolly.devextreme.devextremeStrings.auto
import typingsJapgolly.devextreme.devextremeStrings.day
import typingsJapgolly.devextreme.devextremeStrings.horizontal
import typingsJapgolly.devextreme.devextremeStrings.month
import typingsJapgolly.devextreme.devextremeStrings.timelineDay
import typingsJapgolly.devextreme.devextremeStrings.timelineMonth
import typingsJapgolly.devextreme.devextremeStrings.timelineWeek
import typingsJapgolly.devextreme.devextremeStrings.timelineWorkWeek
import typingsJapgolly.devextreme.devextremeStrings.unlimited
import typingsJapgolly.devextreme.devextremeStrings.vertical
import typingsJapgolly.devextreme.devextremeStrings.week
import typingsJapgolly.devextreme.devextremeStrings.workWeek
import typingsJapgolly.devextreme.mod.DevExpress.core.dxElement
import typingsJapgolly.devextreme.mod.DevExpress.core.template
import typingsJapgolly.devextreme.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAgendaDuration extends js.Object {
  var agendaDuration: js.UndefOr[Double] = js.undefined
  var appointmentCollectorTemplate: js.UndefOr[
    template | (js.Function2[
      /* data */ AnonAppointmentCount, 
      /* collectorElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.undefined
  var appointmentTemplate: js.UndefOr[
    template | (js.Function3[
      /* model */ AnonAppointmentData, 
      /* itemIndex */ Double, 
      /* contentElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.undefined
  var appointmentTooltipTemplate: js.UndefOr[
    template | (js.Function3[
      /* model */ AnonAppointmentData, 
      /* itemIndex */ Double, 
      /* contentElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.undefined
  var cellDuration: js.UndefOr[Double] = js.undefined
  var dataCellTemplate: js.UndefOr[
    template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.undefined
  var dateCellTemplate: js.UndefOr[
    template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.undefined
  var dropDownAppointmentTemplate: js.UndefOr[
    template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* contentElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.undefined
  var endDayHour: js.UndefOr[Double] = js.undefined
  var firstDayOfWeek: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
  var groupByDate: js.UndefOr[Boolean] = js.undefined
  var groupOrientation: js.UndefOr[horizontal | vertical] = js.undefined
  var groups: js.UndefOr[js.Array[String]] = js.undefined
  var intervalCount: js.UndefOr[Double] = js.undefined
  var maxAppointmentsPerCell: js.UndefOr[Double | auto | unlimited] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var resourceCellTemplate: js.UndefOr[
    template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.undefined
  var startDate: js.UndefOr[js.Date | Double | String] = js.undefined
  var startDayHour: js.UndefOr[Double] = js.undefined
  var timeCellTemplate: js.UndefOr[
    template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.undefined
  var `type`: js.UndefOr[
    agenda | day | month | timelineDay | timelineMonth | timelineWeek | timelineWorkWeek | week | workWeek
  ] = js.undefined
}

object AnonAgendaDuration {
  @scala.inline
  def apply(
    agendaDuration: Int | Double = null,
    appointmentCollectorTemplate: template | (js.Function2[
      /* data */ AnonAppointmentCount, 
      /* collectorElement */ dxElement, 
      String | Element | JQuery
    ]) = null,
    appointmentTemplate: template | (js.Function3[
      /* model */ AnonAppointmentData, 
      /* itemIndex */ Double, 
      /* contentElement */ dxElement, 
      String | Element | JQuery
    ]) = null,
    appointmentTooltipTemplate: template | (js.Function3[
      /* model */ AnonAppointmentData, 
      /* itemIndex */ Double, 
      /* contentElement */ dxElement, 
      String | Element | JQuery
    ]) = null,
    cellDuration: Int | Double = null,
    dataCellTemplate: template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ]) = null,
    dateCellTemplate: template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ]) = null,
    dropDownAppointmentTemplate: template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* contentElement */ dxElement, 
      String | Element | JQuery
    ]) = null,
    endDayHour: Int | Double = null,
    firstDayOfWeek: `0` | `1` | `2` | `3` | `4` | `5` | `6` = null,
    groupByDate: js.UndefOr[Boolean] = js.undefined,
    groupOrientation: horizontal | vertical = null,
    groups: js.Array[String] = null,
    intervalCount: Int | Double = null,
    maxAppointmentsPerCell: Double | auto | unlimited = null,
    name: String = null,
    resourceCellTemplate: template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ]) = null,
    startDate: js.Date | Double | String = null,
    startDayHour: Int | Double = null,
    timeCellTemplate: template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ]) = null,
    `type`: agenda | day | month | timelineDay | timelineMonth | timelineWeek | timelineWorkWeek | week | workWeek = null
  ): AnonAgendaDuration = {
    val __obj = js.Dynamic.literal()
    if (agendaDuration != null) __obj.updateDynamic("agendaDuration")(agendaDuration.asInstanceOf[js.Any])
    if (appointmentCollectorTemplate != null) __obj.updateDynamic("appointmentCollectorTemplate")(appointmentCollectorTemplate.asInstanceOf[js.Any])
    if (appointmentTemplate != null) __obj.updateDynamic("appointmentTemplate")(appointmentTemplate.asInstanceOf[js.Any])
    if (appointmentTooltipTemplate != null) __obj.updateDynamic("appointmentTooltipTemplate")(appointmentTooltipTemplate.asInstanceOf[js.Any])
    if (cellDuration != null) __obj.updateDynamic("cellDuration")(cellDuration.asInstanceOf[js.Any])
    if (dataCellTemplate != null) __obj.updateDynamic("dataCellTemplate")(dataCellTemplate.asInstanceOf[js.Any])
    if (dateCellTemplate != null) __obj.updateDynamic("dateCellTemplate")(dateCellTemplate.asInstanceOf[js.Any])
    if (dropDownAppointmentTemplate != null) __obj.updateDynamic("dropDownAppointmentTemplate")(dropDownAppointmentTemplate.asInstanceOf[js.Any])
    if (endDayHour != null) __obj.updateDynamic("endDayHour")(endDayHour.asInstanceOf[js.Any])
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    if (!js.isUndefined(groupByDate)) __obj.updateDynamic("groupByDate")(groupByDate.asInstanceOf[js.Any])
    if (groupOrientation != null) __obj.updateDynamic("groupOrientation")(groupOrientation.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (intervalCount != null) __obj.updateDynamic("intervalCount")(intervalCount.asInstanceOf[js.Any])
    if (maxAppointmentsPerCell != null) __obj.updateDynamic("maxAppointmentsPerCell")(maxAppointmentsPerCell.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (resourceCellTemplate != null) __obj.updateDynamic("resourceCellTemplate")(resourceCellTemplate.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (startDayHour != null) __obj.updateDynamic("startDayHour")(startDayHour.asInstanceOf[js.Any])
    if (timeCellTemplate != null) __obj.updateDynamic("timeCellTemplate")(timeCellTemplate.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAgendaDuration]
  }
}

