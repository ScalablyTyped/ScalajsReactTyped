package typingsJapgolly.next.anon

import typingsJapgolly.next.distBuildWebpackLoadersGetModuleBuildInfoMod.AssetBinding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<next.next/dist/build/webpack/plugins/middleware-plugin.EdgeFunctionDefinition, 'assets' | 'wasm'> */
trait PickEdgeFunctionDefinitio extends StObject {
  
  var assets: js.UndefOr[js.Array[AssetBinding]] = js.undefined
  
  var wasm: js.UndefOr[js.Array[AssetBinding]] = js.undefined
}
object PickEdgeFunctionDefinitio {
  
  inline def apply(): PickEdgeFunctionDefinitio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickEdgeFunctionDefinitio]
  }
  
  extension [Self <: PickEdgeFunctionDefinitio](x: Self) {
    
    inline def setAssets(value: js.Array[AssetBinding]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    inline def setAssetsUndefined: Self = StObject.set(x, "assets", js.undefined)
    
    inline def setAssetsVarargs(value: AssetBinding*): Self = StObject.set(x, "assets", js.Array(value*))
    
    inline def setWasm(value: js.Array[AssetBinding]): Self = StObject.set(x, "wasm", value.asInstanceOf[js.Any])
    
    inline def setWasmUndefined: Self = StObject.set(x, "wasm", js.undefined)
    
    inline def setWasmVarargs(value: AssetBinding*): Self = StObject.set(x, "wasm", js.Array(value*))
  }
}
