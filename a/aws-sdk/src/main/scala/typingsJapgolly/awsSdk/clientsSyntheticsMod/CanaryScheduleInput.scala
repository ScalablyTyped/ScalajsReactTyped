package typingsJapgolly.awsSdk.clientsSyntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanaryScheduleInput extends StObject {
  
  /**
    * How long, in seconds, for the canary to continue making regular runs according to the schedule in the Expression value. If you specify 0, the canary continues making runs until you stop it. If you omit this field, the default of 0 is used.
    */
  var DurationInSeconds: js.UndefOr[MaxOneYearInSeconds] = js.undefined
  
  /**
    * A rate expression or a cron expression that defines how often the canary is to run. For a rate expression, The syntax is rate(number unit). unit can be minute, minutes, or hour.  For example, rate(1 minute) runs the canary once a minute, rate(10 minutes) runs it once every 10 minutes, and rate(1 hour) runs it once every hour. You can specify a frequency between rate(1 minute) and rate(1 hour). Specifying rate(0 minute) or rate(0 hour) is a special value that causes the canary to run only once when it is started. Use cron(expression) to specify a cron expression. You can't schedule a canary to wait for more than a year before running. For information about the syntax for cron expressions, see  Scheduling canary runs using cron.
    */
  var Expression: String
}
object CanaryScheduleInput {
  
  inline def apply(Expression: String): CanaryScheduleInput = {
    val __obj = js.Dynamic.literal(Expression = Expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanaryScheduleInput]
  }
  
  extension [Self <: CanaryScheduleInput](x: Self) {
    
    inline def setDurationInSeconds(value: MaxOneYearInSeconds): Self = StObject.set(x, "DurationInSeconds", value.asInstanceOf[js.Any])
    
    inline def setDurationInSecondsUndefined: Self = StObject.set(x, "DurationInSeconds", js.undefined)
    
    inline def setExpression(value: String): Self = StObject.set(x, "Expression", value.asInstanceOf[js.Any])
  }
}
