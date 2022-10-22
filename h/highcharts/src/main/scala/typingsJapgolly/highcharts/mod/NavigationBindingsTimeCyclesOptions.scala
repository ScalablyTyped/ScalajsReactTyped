package typingsJapgolly.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationBindingsTimeCyclesOptions extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
}
object NavigationBindingsTimeCyclesOptions {
  
  inline def apply(): NavigationBindingsTimeCyclesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationBindingsTimeCyclesOptions]
  }
  
  extension [Self <: NavigationBindingsTimeCyclesOptions](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
  }
}
