package typingsJapgolly.vueDevtoolsApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Root extends StObject {
  
  var app: typingsJapgolly.vueDevtoolsApi.libEsmApiAppMod.App
  
  var root: typingsJapgolly.vueDevtoolsApi.libEsmApiComponentMod.ComponentInstance
}
object Root {
  
  inline def apply(
    app: typingsJapgolly.vueDevtoolsApi.libEsmApiAppMod.App,
    root: typingsJapgolly.vueDevtoolsApi.libEsmApiComponentMod.ComponentInstance
  ): Root = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Root]
  }
  
  extension [Self <: Root](x: Self) {
    
    inline def setApp(value: typingsJapgolly.vueDevtoolsApi.libEsmApiAppMod.App): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: typingsJapgolly.vueDevtoolsApi.libEsmApiComponentMod.ComponentInstance): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
