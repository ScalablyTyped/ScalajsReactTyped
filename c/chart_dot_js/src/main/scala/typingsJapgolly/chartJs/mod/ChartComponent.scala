package typingsJapgolly.chartJs.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.chartJs.typesBasicMod.AnyObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartComponent extends StObject {
  
  var afterRegister: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var afterUnregister: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var beforeRegister: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var beforeUnregister: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var defaultRoutes: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var defaults: js.UndefOr[AnyObject] = js.undefined
  
  var id: String
}
object ChartComponent {
  
  inline def apply(id: String): ChartComponent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartComponent]
  }
  
  extension [Self <: ChartComponent](x: Self) {
    
    inline def setAfterRegister(value: Callback): Self = StObject.set(x, "afterRegister", value.toJsFn)
    
    inline def setAfterRegisterUndefined: Self = StObject.set(x, "afterRegister", js.undefined)
    
    inline def setAfterUnregister(value: Callback): Self = StObject.set(x, "afterUnregister", value.toJsFn)
    
    inline def setAfterUnregisterUndefined: Self = StObject.set(x, "afterUnregister", js.undefined)
    
    inline def setBeforeRegister(value: Callback): Self = StObject.set(x, "beforeRegister", value.toJsFn)
    
    inline def setBeforeRegisterUndefined: Self = StObject.set(x, "beforeRegister", js.undefined)
    
    inline def setBeforeUnregister(value: Callback): Self = StObject.set(x, "beforeUnregister", value.toJsFn)
    
    inline def setBeforeUnregisterUndefined: Self = StObject.set(x, "beforeUnregister", js.undefined)
    
    inline def setDefaultRoutes(value: StringDictionary[String]): Self = StObject.set(x, "defaultRoutes", value.asInstanceOf[js.Any])
    
    inline def setDefaultRoutesUndefined: Self = StObject.set(x, "defaultRoutes", js.undefined)
    
    inline def setDefaults(value: AnyObject): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    inline def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
