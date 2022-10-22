package typingsJapgolly.reactBigScheduler.mod

import typingsJapgolly.reactBigScheduler.anon.CellUnit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchedulerDataBehaviors extends StObject {
  
  var getCustomDateFunc: js.UndefOr[
    js.Function3[
      /* schedulerData */ SchedulerData, 
      /* num */ Double, 
      /* date */ js.UndefOr[String], 
      CellUnit
    ]
  ] = js.undefined
  
  var isNonWorkingTimeFunc: js.UndefOr[js.Function2[/* schedulerData */ SchedulerData, /* time */ String, Boolean]] = js.undefined
}
object SchedulerDataBehaviors {
  
  inline def apply(): SchedulerDataBehaviors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerDataBehaviors]
  }
  
  extension [Self <: SchedulerDataBehaviors](x: Self) {
    
    inline def setGetCustomDateFunc(
      value: (/* schedulerData */ SchedulerData, /* num */ Double, /* date */ js.UndefOr[String]) => CellUnit
    ): Self = StObject.set(x, "getCustomDateFunc", js.Any.fromFunction3(value))
    
    inline def setGetCustomDateFuncUndefined: Self = StObject.set(x, "getCustomDateFunc", js.undefined)
    
    inline def setIsNonWorkingTimeFunc(value: (/* schedulerData */ SchedulerData, /* time */ String) => Boolean): Self = StObject.set(x, "isNonWorkingTimeFunc", js.Any.fromFunction2(value))
    
    inline def setIsNonWorkingTimeFuncUndefined: Self = StObject.set(x, "isNonWorkingTimeFunc", js.undefined)
  }
}
