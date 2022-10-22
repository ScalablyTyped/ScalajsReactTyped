package typingsJapgolly.yog2Kernel

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.nodeRal.mod.Config
import typingsJapgolly.nodeRal.mod.ConfigNormalizer
import typingsJapgolly.nodeRal.mod.RAL.RalRunner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CleanCache extends StObject {
    
    // 清除viewcache
    def cleanCache(): Unit
  }
  object CleanCache {
    
    inline def apply(cleanCache: Callback): CleanCache = {
      val __obj = js.Dynamic.literal(cleanCache = cleanCache.toJsFn)
      __obj.asInstanceOf[CleanCache]
    }
    
    extension [Self <: CleanCache](x: Self) {
      
      inline def setCleanCache(value: Callback): Self = StObject.set(x, "cleanCache", value.toJsFn)
    }
  }
  
  @js.native
  trait TypeofRAL extends StObject {
    
    def apply(serviceName: String): RalRunner = js.native
    def apply(serviceName: String, options: js.Object): RalRunner = js.native
    
    var NormalizerManager: Instantiable0[typingsJapgolly.nodeRal.mod.RAL.NormalizerManager] = js.native
    
    var RalRunner: Instantiable1[/* serviceName */ String, typingsJapgolly.nodeRal.mod.RAL.RalRunner] = js.native
    
    def appendExtPath(extPath: String): Unit = js.native
    
    def getConf(name: String): Config = js.native
    
    def getRawConf(name: String): Config = js.native
    
    def init(): Unit = js.native
    def init(options: js.Object): Unit = js.native
    
    def reload(): Unit = js.native
    def reload(options: js.Object): Unit = js.native
    
    def setConfigNormalizer(normalizers: ConfigNormalizer): Unit = js.native
  }
  
  @js.native
  trait TypeofRALPromise extends StObject {
    
    def apply[T](name: String): js.Promise[T] = js.native
    def apply[T](name: String, options: js.Object): js.Promise[T] = js.native
  }
}
