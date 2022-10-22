package typingsJapgolly.vueDevtoolsApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParentInstances extends StObject {
  
  var componentInstance: typingsJapgolly.vueDevtoolsApi.libEsmApiComponentMod.ComponentInstance
  
  var parentInstances: js.Array[typingsJapgolly.vueDevtoolsApi.libEsmApiComponentMod.ComponentInstance]
}
object ParentInstances {
  
  inline def apply(
    componentInstance: typingsJapgolly.vueDevtoolsApi.libEsmApiComponentMod.ComponentInstance,
    parentInstances: js.Array[typingsJapgolly.vueDevtoolsApi.libEsmApiComponentMod.ComponentInstance]
  ): ParentInstances = {
    val __obj = js.Dynamic.literal(componentInstance = componentInstance.asInstanceOf[js.Any], parentInstances = parentInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParentInstances]
  }
  
  extension [Self <: ParentInstances](x: Self) {
    
    inline def setComponentInstance(value: typingsJapgolly.vueDevtoolsApi.libEsmApiComponentMod.ComponentInstance): Self = StObject.set(x, "componentInstance", value.asInstanceOf[js.Any])
    
    inline def setParentInstances(value: js.Array[typingsJapgolly.vueDevtoolsApi.libEsmApiComponentMod.ComponentInstance]): Self = StObject.set(x, "parentInstances", value.asInstanceOf[js.Any])
    
    inline def setParentInstancesVarargs(value: typingsJapgolly.vueDevtoolsApi.libEsmApiComponentMod.ComponentInstance*): Self = StObject.set(x, "parentInstances", js.Array(value*))
  }
}
