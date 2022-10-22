package typingsJapgolly.parcelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bundler[ConfigType] extends StObject {
  
  def bundle(arg0: typingsJapgolly.parcelTypes.anon.BundleGraph[ConfigType]): Async[Unit]
  
  var loadConfig: js.UndefOr[
    js.Function1[
      /* arg0 */ typingsJapgolly.parcelTypes.anon.Config, 
      js.Promise[ConfigType] | ConfigType
    ]
  ] = js.undefined
  
  def optimize(arg0: typingsJapgolly.parcelTypes.anon.BundleGraph[ConfigType]): Async[Unit]
}
object Bundler {
  
  inline def apply[ConfigType](
    bundle: typingsJapgolly.parcelTypes.anon.BundleGraph[ConfigType] => Async[Unit],
    optimize: typingsJapgolly.parcelTypes.anon.BundleGraph[ConfigType] => Async[Unit]
  ): Bundler[ConfigType] = {
    val __obj = js.Dynamic.literal(bundle = js.Any.fromFunction1(bundle), optimize = js.Any.fromFunction1(optimize))
    __obj.asInstanceOf[Bundler[ConfigType]]
  }
  
  extension [Self <: Bundler[?], ConfigType](x: Self & Bundler[ConfigType]) {
    
    inline def setBundle(value: typingsJapgolly.parcelTypes.anon.BundleGraph[ConfigType] => Async[Unit]): Self = StObject.set(x, "bundle", js.Any.fromFunction1(value))
    
    inline def setLoadConfig(value: /* arg0 */ typingsJapgolly.parcelTypes.anon.Config => js.Promise[ConfigType] | ConfigType): Self = StObject.set(x, "loadConfig", js.Any.fromFunction1(value))
    
    inline def setLoadConfigUndefined: Self = StObject.set(x, "loadConfig", js.undefined)
    
    inline def setOptimize(value: typingsJapgolly.parcelTypes.anon.BundleGraph[ConfigType] => Async[Unit]): Self = StObject.set(x, "optimize", js.Any.fromFunction1(value))
  }
}
