package typingsJapgolly.vueDevtoolsApi.anon

import typingsJapgolly.vueDevtoolsApi.libEsmApiComponentMod.ComponentDevtoolsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var componentInstance: typingsJapgolly.vueDevtoolsApi.libEsmApiComponentMod.ComponentInstance
  
  var options: ComponentDevtoolsOptions
}
object Options {
  
  inline def apply(
    componentInstance: typingsJapgolly.vueDevtoolsApi.libEsmApiComponentMod.ComponentInstance,
    options: ComponentDevtoolsOptions
  ): Options = {
    val __obj = js.Dynamic.literal(componentInstance = componentInstance.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setComponentInstance(value: typingsJapgolly.vueDevtoolsApi.libEsmApiComponentMod.ComponentInstance): Self = StObject.set(x, "componentInstance", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: ComponentDevtoolsOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
