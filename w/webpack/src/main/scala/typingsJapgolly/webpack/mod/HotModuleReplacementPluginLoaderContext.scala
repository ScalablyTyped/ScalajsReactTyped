package typingsJapgolly.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * These properties are added by the HotModuleReplacementPlugin
  */
trait HotModuleReplacementPluginLoaderContext extends StObject {
  
  var hot: js.UndefOr[Boolean] = js.undefined
}
object HotModuleReplacementPluginLoaderContext {
  
  inline def apply(): HotModuleReplacementPluginLoaderContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HotModuleReplacementPluginLoaderContext]
  }
  
  extension [Self <: HotModuleReplacementPluginLoaderContext](x: Self) {
    
    inline def setHot(value: Boolean): Self = StObject.set(x, "hot", value.asInstanceOf[js.Any])
    
    inline def setHotUndefined: Self = StObject.set(x, "hot", js.undefined)
  }
}
