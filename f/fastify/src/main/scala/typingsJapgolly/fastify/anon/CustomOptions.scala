package typingsJapgolly.fastify.anon

import typingsJapgolly.ajv.distCoreMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomOptions extends StObject {
  
  var customOptions: js.UndefOr[Options] = js.undefined
  
  var plugins: js.UndefOr[js.Array[js.Function | (js.Tuple2[js.Function, Any])]] = js.undefined
}
object CustomOptions {
  
  inline def apply(): CustomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomOptions]
  }
  
  extension [Self <: CustomOptions](x: Self) {
    
    inline def setCustomOptions(value: Options): Self = StObject.set(x, "customOptions", value.asInstanceOf[js.Any])
    
    inline def setCustomOptionsUndefined: Self = StObject.set(x, "customOptions", js.undefined)
    
    inline def setPlugins(value: js.Array[js.Function | (js.Tuple2[js.Function, Any])]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setPluginsVarargs(value: (js.Function | (js.Tuple2[js.Function, Any]))*): Self = StObject.set(x, "plugins", js.Array(value*))
  }
}
