package typingsJapgolly.jqueryCountdown

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jQueryCountdown {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.jqueryCountdown.jqueryCountdownStrings.start
    - typingsJapgolly.jqueryCountdown.jqueryCountdownStrings.stop
    - typingsJapgolly.jqueryCountdown.jqueryCountdownStrings.pause
    - typingsJapgolly.jqueryCountdown.jqueryCountdownStrings.resume
  */
  trait Controls extends StObject
  object Controls {
    
    inline def pause: typingsJapgolly.jqueryCountdown.jqueryCountdownStrings.pause = "pause".asInstanceOf[typingsJapgolly.jqueryCountdown.jqueryCountdownStrings.pause]
    
    inline def resume: typingsJapgolly.jqueryCountdown.jqueryCountdownStrings.resume = "resume".asInstanceOf[typingsJapgolly.jqueryCountdown.jqueryCountdownStrings.resume]
    
    inline def start: typingsJapgolly.jqueryCountdown.jqueryCountdownStrings.start = "start".asInstanceOf[typingsJapgolly.jqueryCountdown.jqueryCountdownStrings.start]
    
    inline def stop: typingsJapgolly.jqueryCountdown.jqueryCountdownStrings.stop = "stop".asInstanceOf[typingsJapgolly.jqueryCountdown.jqueryCountdownStrings.stop]
  }
  
  trait Event
    extends StObject
       with typingsJapgolly.jquery.JQuery.Event {
    
    /**
      * Passed away the final date?
      */
    var elapsed: Boolean
    
    /**
      * The parsed final date native object
      */
    var finalDate: js.Date
    
    var offset: OffsetEvent
    
    /**
      * The formatter function
      */
    def strftime(format: String): String
  }
  object Event {
    
    inline def apply(
      elapsed: Boolean,
      finalDate: js.Date,
      isDefaultPrevented: CallbackTo[Boolean],
      isImmediatePropagationStopped: CallbackTo[Boolean],
      isPropagationStopped: CallbackTo[Boolean],
      offset: OffsetEvent,
      preventDefault: Callback,
      stopImmediatePropagation: Callback,
      stopPropagation: Callback,
      strftime: String => String,
      timeStamp: Double,
      `type`: String
    ): Event = {
      val __obj = js.Dynamic.literal(elapsed = elapsed.asInstanceOf[js.Any], finalDate = finalDate.asInstanceOf[js.Any], isDefaultPrevented = isDefaultPrevented.toJsFn, isImmediatePropagationStopped = isImmediatePropagationStopped.toJsFn, isPropagationStopped = isPropagationStopped.toJsFn, offset = offset.asInstanceOf[js.Any], preventDefault = preventDefault.toJsFn, stopImmediatePropagation = stopImmediatePropagation.toJsFn, stopPropagation = stopPropagation.toJsFn, strftime = js.Any.fromFunction1(strftime), timeStamp = timeStamp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    extension [Self <: Event](x: Self) {
      
      inline def setElapsed(value: Boolean): Self = StObject.set(x, "elapsed", value.asInstanceOf[js.Any])
      
      inline def setFinalDate(value: js.Date): Self = StObject.set(x, "finalDate", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: OffsetEvent): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setStrftime(value: String => String): Self = StObject.set(x, "strftime", js.Any.fromFunction1(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.jqueryCountdown.jqueryCountdownStrings.updateDotcountdown
    - typingsJapgolly.jqueryCountdown.jqueryCountdownStrings.finishDotcountdown
    - typingsJapgolly.jqueryCountdown.jqueryCountdownStrings.stopDotcountdown
  */
  trait Methods extends StObject
  object Methods {
    
    inline def finishDotcountdown: typingsJapgolly.jqueryCountdown.jqueryCountdownStrings.finishDotcountdown = "finish.countdown".asInstanceOf[typingsJapgolly.jqueryCountdown.jqueryCountdownStrings.finishDotcountdown]
    
    inline def stopDotcountdown: typingsJapgolly.jqueryCountdown.jqueryCountdownStrings.stopDotcountdown = "stop.countdown".asInstanceOf[typingsJapgolly.jqueryCountdown.jqueryCountdownStrings.stopDotcountdown]
    
    inline def updateDotcountdown: typingsJapgolly.jqueryCountdown.jqueryCountdownStrings.updateDotcountdown = "update.countdown".asInstanceOf[typingsJapgolly.jqueryCountdown.jqueryCountdownStrings.updateDotcountdown]
  }
  
  trait OffsetEvent extends StObject {
    
    /**
      * Days left until next week
      */
    var days: Double
    
    /**
      * Days left until next month
      */
    var daysToMonth: Double
    
    /**
      * Days left until next week
      */
    var daysToWeek: Double
    
    /**
      * Hours left until next day
      */
    var hours: Double
    
    /**
      * Minutes left for the next hour
      */
    var minutes: Double
    
    /**
      * Months left until final date
      */
    var months: Double
    
    /**
      * Seconds left for the next minute
      */
    var seconds: Double
    
    /**
      * Total amount of days left until final date
      */
    var totalDays: Double
    
    /**
      * Total amount of hours left until final date
      */
    var totalHours: Double
    
    /**
      * Total amount of minutes left until final date
      */
    var totalMinutes: Double
    
    /**
      * Total amount of seconds left until final date
      */
    var totalSeconds: Double
    
    /**
      * Weeks left until the final date
      */
    var weeks: Double
    
    /**
      * Weeks left until the next month
      */
    var weeksToMonth: Double
    
    /**
      * Years left until final date
      */
    var years: Double
  }
  object OffsetEvent {
    
    inline def apply(
      days: Double,
      daysToMonth: Double,
      daysToWeek: Double,
      hours: Double,
      minutes: Double,
      months: Double,
      seconds: Double,
      totalDays: Double,
      totalHours: Double,
      totalMinutes: Double,
      totalSeconds: Double,
      weeks: Double,
      weeksToMonth: Double,
      years: Double
    ): OffsetEvent = {
      val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any], daysToMonth = daysToMonth.asInstanceOf[js.Any], daysToWeek = daysToWeek.asInstanceOf[js.Any], hours = hours.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any], totalDays = totalDays.asInstanceOf[js.Any], totalHours = totalHours.asInstanceOf[js.Any], totalMinutes = totalMinutes.asInstanceOf[js.Any], totalSeconds = totalSeconds.asInstanceOf[js.Any], weeks = weeks.asInstanceOf[js.Any], weeksToMonth = weeksToMonth.asInstanceOf[js.Any], years = years.asInstanceOf[js.Any])
      __obj.asInstanceOf[OffsetEvent]
    }
    
    extension [Self <: OffsetEvent](x: Self) {
      
      inline def setDays(value: Double): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
      
      inline def setDaysToMonth(value: Double): Self = StObject.set(x, "daysToMonth", value.asInstanceOf[js.Any])
      
      inline def setDaysToWeek(value: Double): Self = StObject.set(x, "daysToWeek", value.asInstanceOf[js.Any])
      
      inline def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
      
      inline def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
      
      inline def setMonths(value: Double): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      inline def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
      
      inline def setTotalDays(value: Double): Self = StObject.set(x, "totalDays", value.asInstanceOf[js.Any])
      
      inline def setTotalHours(value: Double): Self = StObject.set(x, "totalHours", value.asInstanceOf[js.Any])
      
      inline def setTotalMinutes(value: Double): Self = StObject.set(x, "totalMinutes", value.asInstanceOf[js.Any])
      
      inline def setTotalSeconds(value: Double): Self = StObject.set(x, "totalSeconds", value.asInstanceOf[js.Any])
      
      inline def setWeeks(value: Double): Self = StObject.set(x, "weeks", value.asInstanceOf[js.Any])
      
      inline def setWeeksToMonth(value: Double): Self = StObject.set(x, "weeksToMonth", value.asInstanceOf[js.Any])
      
      inline def setYears(value: Double): Self = StObject.set(x, "years", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    /**
      * Deferred initialization mode
      */
    var defer: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Allow to continue after finishes
      */
    var elapse: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The update rate in milliseconds
      */
    var precision: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDefer(value: Boolean): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
      
      inline def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
      
      inline def setElapse(value: Boolean): Self = StObject.set(x, "elapse", value.asInstanceOf[js.Any])
      
      inline def setElapseUndefined: Self = StObject.set(x, "elapse", js.undefined)
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    }
  }
}
