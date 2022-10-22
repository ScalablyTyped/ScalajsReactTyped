package typingsJapgolly.webpack.anon

import typingsJapgolly.webpack.mod.RuntimeSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hash extends StObject {
  
  var hash: String
  
  var module: typingsJapgolly.webpack.mod.Module
  
  var runtime: RuntimeSpec
  
  var runtimes: js.Array[RuntimeSpec]
}
object Hash {
  
  inline def apply(hash: String, module: typingsJapgolly.webpack.mod.Module, runtimes: js.Array[RuntimeSpec]): Hash = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], runtimes = runtimes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hash]
  }
  
  extension [Self <: Hash](x: Self) {
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setModule(value: typingsJapgolly.webpack.mod.Module): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setRuntime(value: RuntimeSpec): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    inline def setRuntimes(value: js.Array[RuntimeSpec]): Self = StObject.set(x, "runtimes", value.asInstanceOf[js.Any])
    
    inline def setRuntimesVarargs(value: RuntimeSpec*): Self = StObject.set(x, "runtimes", js.Array(value*))
  }
}
