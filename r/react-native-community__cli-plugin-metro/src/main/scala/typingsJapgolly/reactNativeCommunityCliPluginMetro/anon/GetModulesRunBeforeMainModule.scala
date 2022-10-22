package typingsJapgolly.reactNativeCommunityCliPluginMetro.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetModulesRunBeforeMainModule extends StObject {
  
  def getModulesRunBeforeMainModule(): js.Array[String]
  
  def getPolyfills(): Any
}
object GetModulesRunBeforeMainModule {
  
  inline def apply(getModulesRunBeforeMainModule: CallbackTo[js.Array[String]], getPolyfills: CallbackTo[Any]): GetModulesRunBeforeMainModule = {
    val __obj = js.Dynamic.literal(getModulesRunBeforeMainModule = getModulesRunBeforeMainModule.toJsFn, getPolyfills = getPolyfills.toJsFn)
    __obj.asInstanceOf[GetModulesRunBeforeMainModule]
  }
  
  extension [Self <: GetModulesRunBeforeMainModule](x: Self) {
    
    inline def setGetModulesRunBeforeMainModule(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getModulesRunBeforeMainModule", value.toJsFn)
    
    inline def setGetPolyfills(value: CallbackTo[Any]): Self = StObject.set(x, "getPolyfills", value.toJsFn)
  }
}
