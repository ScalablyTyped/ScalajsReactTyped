package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFTriggerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITriggerType extends StObject {
  
  def Clone(): ITriggerType
  
  val Daily: IDailyTrigger
  
  val MonthlyDOW: IMonthlyDOWTrigger
  
  val MonthlyDate: IMonthlyDateTrigger
  
  def SetDailyTrigger(DailyTrigger: IDailyTrigger): Unit
  
  def SetMonthlyDOW(MonthlyDOWTrigger: IMonthlyDOWTrigger): Unit
  
  def SetMonthlyDate(MonthlyDateTrigger: IMonthlyDateTrigger): Unit
  
  def SetWeekly(WeeklyTrigger: IWeeklyTrigger): Unit
  
  var Type: MFTriggerType
  
  val Weekly: IWeeklyTrigger
}
object ITriggerType {
  
  inline def apply(
    Clone: CallbackTo[ITriggerType],
    Daily: IDailyTrigger,
    MonthlyDOW: IMonthlyDOWTrigger,
    MonthlyDate: IMonthlyDateTrigger,
    SetDailyTrigger: IDailyTrigger => Callback,
    SetMonthlyDOW: IMonthlyDOWTrigger => Callback,
    SetMonthlyDate: IMonthlyDateTrigger => Callback,
    SetWeekly: IWeeklyTrigger => Callback,
    Type: MFTriggerType,
    Weekly: IWeeklyTrigger
  ): ITriggerType = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, Daily = Daily.asInstanceOf[js.Any], MonthlyDOW = MonthlyDOW.asInstanceOf[js.Any], MonthlyDate = MonthlyDate.asInstanceOf[js.Any], SetDailyTrigger = js.Any.fromFunction1((t0: IDailyTrigger) => SetDailyTrigger(t0).runNow()), SetMonthlyDOW = js.Any.fromFunction1((t0: IMonthlyDOWTrigger) => SetMonthlyDOW(t0).runNow()), SetMonthlyDate = js.Any.fromFunction1((t0: IMonthlyDateTrigger) => SetMonthlyDate(t0).runNow()), SetWeekly = js.Any.fromFunction1((t0: IWeeklyTrigger) => SetWeekly(t0).runNow()), Type = Type.asInstanceOf[js.Any], Weekly = Weekly.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITriggerType]
  }
  
  extension [Self <: ITriggerType](x: Self) {
    
    inline def setClone(value: CallbackTo[ITriggerType]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setDaily(value: IDailyTrigger): Self = StObject.set(x, "Daily", value.asInstanceOf[js.Any])
    
    inline def setMonthlyDOW(value: IMonthlyDOWTrigger): Self = StObject.set(x, "MonthlyDOW", value.asInstanceOf[js.Any])
    
    inline def setMonthlyDate(value: IMonthlyDateTrigger): Self = StObject.set(x, "MonthlyDate", value.asInstanceOf[js.Any])
    
    inline def setSetDailyTrigger(value: IDailyTrigger => Callback): Self = StObject.set(x, "SetDailyTrigger", js.Any.fromFunction1((t0: IDailyTrigger) => value(t0).runNow()))
    
    inline def setSetMonthlyDOW(value: IMonthlyDOWTrigger => Callback): Self = StObject.set(x, "SetMonthlyDOW", js.Any.fromFunction1((t0: IMonthlyDOWTrigger) => value(t0).runNow()))
    
    inline def setSetMonthlyDate(value: IMonthlyDateTrigger => Callback): Self = StObject.set(x, "SetMonthlyDate", js.Any.fromFunction1((t0: IMonthlyDateTrigger) => value(t0).runNow()))
    
    inline def setSetWeekly(value: IWeeklyTrigger => Callback): Self = StObject.set(x, "SetWeekly", js.Any.fromFunction1((t0: IWeeklyTrigger) => value(t0).runNow()))
    
    inline def setType(value: MFTriggerType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setWeekly(value: IWeeklyTrigger): Self = StObject.set(x, "Weekly", value.asInstanceOf[js.Any])
  }
}
