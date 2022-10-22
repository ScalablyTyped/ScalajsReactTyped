package typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerModuleNameCache extends StObject {
  
  def get(directory: java.lang.String): js.UndefOr[ResolvedModuleWithFailedLookupLocations]
  
  def set(directory: java.lang.String, result: ResolvedModuleWithFailedLookupLocations): Unit
}
object PerModuleNameCache {
  
  inline def apply(
    get: java.lang.String => js.UndefOr[ResolvedModuleWithFailedLookupLocations],
    set: (java.lang.String, ResolvedModuleWithFailedLookupLocations) => Callback
  ): PerModuleNameCache = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction2((t0: java.lang.String, t1: ResolvedModuleWithFailedLookupLocations) => (set(t0, t1)).runNow()))
    __obj.asInstanceOf[PerModuleNameCache]
  }
  
  extension [Self <: PerModuleNameCache](x: Self) {
    
    inline def setGet(value: java.lang.String => js.UndefOr[ResolvedModuleWithFailedLookupLocations]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setSet(value: (java.lang.String, ResolvedModuleWithFailedLookupLocations) => Callback): Self = StObject.set(x, "set", js.Any.fromFunction2((t0: java.lang.String, t1: ResolvedModuleWithFailedLookupLocations) => (value(t0, t1)).runNow()))
  }
}
