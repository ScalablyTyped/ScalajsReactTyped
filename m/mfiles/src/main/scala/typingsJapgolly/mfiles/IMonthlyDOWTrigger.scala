package typingsJapgolly.mfiles

import typingsJapgolly.mfiles.MFiles.MFTriggerMonth
import typingsJapgolly.mfiles.MFiles.MFTriggerWeekDay
import typingsJapgolly.mfiles.MFiles.MFTriggerWeekOfMonth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMonthlyDOWTrigger extends js.Object {
  var DaysOfTheWeek: MFTriggerWeekDay
  var Months: MFTriggerMonth
  var WhichWeek: MFTriggerWeekOfMonth
}

object IMonthlyDOWTrigger {
  @scala.inline
  def apply(DaysOfTheWeek: MFTriggerWeekDay, Months: MFTriggerMonth, WhichWeek: MFTriggerWeekOfMonth): IMonthlyDOWTrigger = {
    val __obj = js.Dynamic.literal(DaysOfTheWeek = DaysOfTheWeek.asInstanceOf[js.Any], Months = Months.asInstanceOf[js.Any], WhichWeek = WhichWeek.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IMonthlyDOWTrigger]
  }
}

