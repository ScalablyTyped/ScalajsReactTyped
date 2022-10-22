package typingsJapgolly.rollup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinimalPluginContext extends StObject {
  
  var meta: PluginContextMeta
}
object MinimalPluginContext {
  
  inline def apply(meta: PluginContextMeta): MinimalPluginContext = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinimalPluginContext]
  }
  
  extension [Self <: MinimalPluginContext](x: Self) {
    
    inline def setMeta(value: PluginContextMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
