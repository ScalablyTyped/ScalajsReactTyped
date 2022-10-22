package typingsJapgolly.parcelTypes.mod

import typingsJapgolly.parcelTypes.anon.BundleBundleGraph
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Runtime[ConfigType] extends StObject {
  
  @JSName("apply")
  def apply(arg0: BundleBundleGraph[ConfigType]): Async[Unit | RuntimeAsset | js.Array[RuntimeAsset]]
  
  var loadConfig: js.UndefOr[
    js.Function1[
      /* arg0 */ typingsJapgolly.parcelTypes.anon.Config, 
      js.Promise[ConfigType] | ConfigType
    ]
  ] = js.undefined
}
object Runtime {
  
  inline def apply[ConfigType](apply: BundleBundleGraph[ConfigType] => Async[Unit | RuntimeAsset | js.Array[RuntimeAsset]]): Runtime[ConfigType] = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
    __obj.asInstanceOf[Runtime[ConfigType]]
  }
  
  extension [Self <: Runtime[?], ConfigType](x: Self & Runtime[ConfigType]) {
    
    inline def setApply(value: BundleBundleGraph[ConfigType] => Async[Unit | RuntimeAsset | js.Array[RuntimeAsset]]): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
    
    inline def setLoadConfig(value: /* arg0 */ typingsJapgolly.parcelTypes.anon.Config => js.Promise[ConfigType] | ConfigType): Self = StObject.set(x, "loadConfig", js.Any.fromFunction1(value))
    
    inline def setLoadConfigUndefined: Self = StObject.set(x, "loadConfig", js.undefined)
  }
}
