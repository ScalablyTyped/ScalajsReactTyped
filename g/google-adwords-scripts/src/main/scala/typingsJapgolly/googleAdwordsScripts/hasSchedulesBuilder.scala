package typingsJapgolly.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait hasSchedulesBuilder[B] extends StObject {
  
  def withSchedules(schedules: ExtensionScheduleInput): B
}
object hasSchedulesBuilder {
  
  inline def apply[B](withSchedules: ExtensionScheduleInput => B): hasSchedulesBuilder[B] = {
    val __obj = js.Dynamic.literal(withSchedules = js.Any.fromFunction1(withSchedules))
    __obj.asInstanceOf[hasSchedulesBuilder[B]]
  }
  
  extension [Self <: hasSchedulesBuilder[?], B](x: Self & hasSchedulesBuilder[B]) {
    
    inline def setWithSchedules(value: ExtensionScheduleInput => B): Self = StObject.set(x, "withSchedules", js.Any.fromFunction1(value))
  }
}
