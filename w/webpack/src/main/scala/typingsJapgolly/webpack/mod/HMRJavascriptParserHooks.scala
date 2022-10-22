package typingsJapgolly.webpack.mod

import typingsJapgolly.tapable.mod.SyncBailHook
import typingsJapgolly.tapable.mod.UnsetAdditionalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HMRJavascriptParserHooks extends StObject {
  
  var hotAcceptCallback: SyncBailHook[js.Tuple2[Any, js.Array[String]], Unit, UnsetAdditionalOptions]
  
  var hotAcceptWithoutCallback: SyncBailHook[js.Tuple2[Any, js.Array[String]], Unit, UnsetAdditionalOptions]
}
object HMRJavascriptParserHooks {
  
  inline def apply(
    hotAcceptCallback: SyncBailHook[js.Tuple2[Any, js.Array[String]], Unit, UnsetAdditionalOptions],
    hotAcceptWithoutCallback: SyncBailHook[js.Tuple2[Any, js.Array[String]], Unit, UnsetAdditionalOptions]
  ): HMRJavascriptParserHooks = {
    val __obj = js.Dynamic.literal(hotAcceptCallback = hotAcceptCallback.asInstanceOf[js.Any], hotAcceptWithoutCallback = hotAcceptWithoutCallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[HMRJavascriptParserHooks]
  }
  
  extension [Self <: HMRJavascriptParserHooks](x: Self) {
    
    inline def setHotAcceptCallback(value: SyncBailHook[js.Tuple2[Any, js.Array[String]], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "hotAcceptCallback", value.asInstanceOf[js.Any])
    
    inline def setHotAcceptWithoutCallback(value: SyncBailHook[js.Tuple2[Any, js.Array[String]], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "hotAcceptWithoutCallback", value.asInstanceOf[js.Any])
  }
}
