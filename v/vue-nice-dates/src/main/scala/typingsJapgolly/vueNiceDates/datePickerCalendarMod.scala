package typingsJapgolly.vueNiceDates

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.vueNiceDates.anon.HandleClickDate
import typingsJapgolly.vueNiceDates.anon.OmitDatePickerPropsisFocu
import typingsJapgolly.vueNiceDates.anon.ReceivedDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datePickerCalendarMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor * / any */ trait DatePickerCalendar extends StObject {
    
    def date(): ReceivedDate
    
    var methods: HandleClickDate
    
    var props: OmitDatePickerPropsisFocu
    
    var watch: StringDictionary[js.Function1[/* date */ js.Date, Unit]]
  }
  object DatePickerCalendar {
    
    @JSImport("vue-nice-dates/DatePickerCalendar", "DatePickerCalendar")
    @js.native
    val ^ : DatePickerCalendar = js.native
    
    extension [Self <: DatePickerCalendar](x: Self) {
      
      inline def setDate(value: CallbackTo[ReceivedDate]): Self = StObject.set(x, "date", value.toJsFn)
      
      inline def setMethods(value: HandleClickDate): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setProps(value: OmitDatePickerPropsisFocu): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setWatch(value: StringDictionary[js.Function1[/* date */ js.Date, Unit]]): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
    }
  }
}
