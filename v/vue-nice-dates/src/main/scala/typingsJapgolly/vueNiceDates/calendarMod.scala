package typingsJapgolly.vueNiceDates

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.vueNiceDates.anon.Date
import typingsJapgolly.vueNiceDates.anon.GetGridType
import typingsJapgolly.vueNiceDates.anon.GridType
import typingsJapgolly.vueNiceDates.anon.MergedModifiers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calendarMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor * / any */ trait Calendar extends StObject {
    
    var computed: MergedModifiers
    
    def data(): GridType
    
    var methods: GetGridType
    
    var props: Date
    
    var watch: StringDictionary[
        js.Function2[/* newValue */ js.Date | String, /* oldValue */ js.Date | String, Unit]
      ]
  }
  object Calendar {
    
    @JSImport("vue-nice-dates/Calendar", "Calendar")
    @js.native
    val ^ : Calendar = js.native
    
    extension [Self <: Calendar](x: Self) {
      
      inline def setComputed(value: MergedModifiers): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
      
      inline def setData(value: CallbackTo[GridType]): Self = StObject.set(x, "data", value.toJsFn)
      
      inline def setMethods(value: GetGridType): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setProps(value: Date): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setWatch(
        value: StringDictionary[
              js.Function2[/* newValue */ js.Date | String, /* oldValue */ js.Date | String, Unit]
            ]
      ): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
    }
  }
}
