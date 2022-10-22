package typingsJapgolly.vueDevtoolsApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name extends StObject {
  
  var componentInstance: typingsJapgolly.vueDevtoolsApi.libEsmApiComponentMod.ComponentInstance
  
  var name: String
}
object Name {
  
  inline def apply(
    componentInstance: typingsJapgolly.vueDevtoolsApi.libEsmApiComponentMod.ComponentInstance,
    name: String
  ): Name = {
    val __obj = js.Dynamic.literal(componentInstance = componentInstance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  
  extension [Self <: Name](x: Self) {
    
    inline def setComponentInstance(value: typingsJapgolly.vueDevtoolsApi.libEsmApiComponentMod.ComponentInstance): Self = StObject.set(x, "componentInstance", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
