package typingsJapgolly.licenseWebpackPlugin

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.licenseWebpackPlugin.distLicenseIdentifiedModuleMod.LicenseIdentifiedModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distModuleCacheMod {
  
  trait ModuleCache extends StObject {
    
    def alreadySeenForChunk(chunkName: String, packageName: String): Boolean
    
    def getAllModules(): js.Array[LicenseIdentifiedModule]
    
    def getAllModulesForChunk(chunkName: String): js.Array[LicenseIdentifiedModule]
    
    def getModule(packageName: String): LicenseIdentifiedModule | Null
    
    def markSeenForChunk(chunkName: String, packageName: String): Unit
    
    def registerModule(chunkName: String, module: LicenseIdentifiedModule): Unit
  }
  object ModuleCache {
    
    inline def apply(
      alreadySeenForChunk: (String, String) => Boolean,
      getAllModules: CallbackTo[js.Array[LicenseIdentifiedModule]],
      getAllModulesForChunk: String => js.Array[LicenseIdentifiedModule],
      getModule: String => LicenseIdentifiedModule | Null,
      markSeenForChunk: (String, String) => Callback,
      registerModule: (String, LicenseIdentifiedModule) => Callback
    ): ModuleCache = {
      val __obj = js.Dynamic.literal(alreadySeenForChunk = js.Any.fromFunction2(alreadySeenForChunk), getAllModules = getAllModules.toJsFn, getAllModulesForChunk = js.Any.fromFunction1(getAllModulesForChunk), getModule = js.Any.fromFunction1(getModule), markSeenForChunk = js.Any.fromFunction2((t0: String, t1: String) => (markSeenForChunk(t0, t1)).runNow()), registerModule = js.Any.fromFunction2((t0: String, t1: LicenseIdentifiedModule) => (registerModule(t0, t1)).runNow()))
      __obj.asInstanceOf[ModuleCache]
    }
    
    extension [Self <: ModuleCache](x: Self) {
      
      inline def setAlreadySeenForChunk(value: (String, String) => Boolean): Self = StObject.set(x, "alreadySeenForChunk", js.Any.fromFunction2(value))
      
      inline def setGetAllModules(value: CallbackTo[js.Array[LicenseIdentifiedModule]]): Self = StObject.set(x, "getAllModules", value.toJsFn)
      
      inline def setGetAllModulesForChunk(value: String => js.Array[LicenseIdentifiedModule]): Self = StObject.set(x, "getAllModulesForChunk", js.Any.fromFunction1(value))
      
      inline def setGetModule(value: String => LicenseIdentifiedModule | Null): Self = StObject.set(x, "getModule", js.Any.fromFunction1(value))
      
      inline def setMarkSeenForChunk(value: (String, String) => Callback): Self = StObject.set(x, "markSeenForChunk", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setRegisterModule(value: (String, LicenseIdentifiedModule) => Callback): Self = StObject.set(x, "registerModule", js.Any.fromFunction2((t0: String, t1: LicenseIdentifiedModule) => (value(t0, t1)).runNow()))
    }
  }
}
