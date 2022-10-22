package typingsJapgolly.vueDevtoolsApi.anon

import typingsJapgolly.vueDevtoolsApi.libEsmApiComponentMod.InspectedComponentData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceData extends StObject {
  
  var app: typingsJapgolly.vueDevtoolsApi.libEsmApiAppMod.App
  
  var componentInstance: typingsJapgolly.vueDevtoolsApi.libEsmApiComponentMod.ComponentInstance
  
  var instanceData: InspectedComponentData
}
object InstanceData {
  
  inline def apply(
    app: typingsJapgolly.vueDevtoolsApi.libEsmApiAppMod.App,
    componentInstance: typingsJapgolly.vueDevtoolsApi.libEsmApiComponentMod.ComponentInstance,
    instanceData: InspectedComponentData
  ): InstanceData = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], componentInstance = componentInstance.asInstanceOf[js.Any], instanceData = instanceData.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceData]
  }
  
  extension [Self <: InstanceData](x: Self) {
    
    inline def setApp(value: typingsJapgolly.vueDevtoolsApi.libEsmApiAppMod.App): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setComponentInstance(value: typingsJapgolly.vueDevtoolsApi.libEsmApiComponentMod.ComponentInstance): Self = StObject.set(x, "componentInstance", value.asInstanceOf[js.Any])
    
    inline def setInstanceData(value: InspectedComponentData): Self = StObject.set(x, "instanceData", value.asInstanceOf[js.Any])
  }
}
