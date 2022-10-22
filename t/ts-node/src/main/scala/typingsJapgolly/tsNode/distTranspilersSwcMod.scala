package typingsJapgolly.tsNode

import typingsJapgolly.tsNode.anon.PickServiceExtractconfigo
import typingsJapgolly.tsNode.anon.TypeofswcWasm
import typingsJapgolly.tsNode.distTranspilersTypesMod.CreateTranspilerOptions
import typingsJapgolly.tsNode.distTranspilersTypesMod.Transpiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTranspilersSwcMod {
  
  @JSImport("ts-node/dist/transpilers/swc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(createOptions: SwcTranspilerOptions): Transpiler = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(createOptions.asInstanceOf[js.Any]).asInstanceOf[Transpiler]
  
  trait SwcTranspilerOptions
    extends StObject
       with CreateTranspilerOptions {
    
    /**
      * swc compiler to use for compilation
      * Set to '@swc/wasm' to use swc's WASM compiler
      * Default: '@swc/core', falling back to '@swc/wasm'
      */
    var swc: js.UndefOr[String | TypeofswcWasm] = js.undefined
  }
  object SwcTranspilerOptions {
    
    inline def apply(service: PickServiceExtractconfigo): SwcTranspilerOptions = {
      val __obj = js.Dynamic.literal(service = service.asInstanceOf[js.Any])
      __obj.asInstanceOf[SwcTranspilerOptions]
    }
    
    extension [Self <: SwcTranspilerOptions](x: Self) {
      
      inline def setSwc(value: String | TypeofswcWasm): Self = StObject.set(x, "swc", value.asInstanceOf[js.Any])
      
      inline def setSwcUndefined: Self = StObject.set(x, "swc", js.undefined)
    }
  }
}
