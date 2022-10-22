package typingsJapgolly.vueDevtoolsApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentInstances extends StObject {
  
  var app: typingsJapgolly.vueDevtoolsApi.libEsmApiAppMod.App
  
  var componentInstances: js.Array[typingsJapgolly.vueDevtoolsApi.libEsmApiComponentMod.ComponentInstance]
}
object ComponentInstances {
  
  inline def apply(
    app: typingsJapgolly.vueDevtoolsApi.libEsmApiAppMod.App,
    componentInstances: js.Array[typingsJapgolly.vueDevtoolsApi.libEsmApiComponentMod.ComponentInstance]
  ): ComponentInstances = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], componentInstances = componentInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentInstances]
  }
  
  extension [Self <: ComponentInstances](x: Self) {
    
    inline def setApp(value: typingsJapgolly.vueDevtoolsApi.libEsmApiAppMod.App): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setComponentInstances(value: js.Array[typingsJapgolly.vueDevtoolsApi.libEsmApiComponentMod.ComponentInstance]): Self = StObject.set(x, "componentInstances", value.asInstanceOf[js.Any])
    
    inline def setComponentInstancesVarargs(value: typingsJapgolly.vueDevtoolsApi.libEsmApiComponentMod.ComponentInstance*): Self = StObject.set(x, "componentInstances", js.Array(value*))
  }
}
