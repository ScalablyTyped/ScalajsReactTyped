package typingsJapgolly.babylonjs

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGLProgram extends StObject {
  
  var __SPECTOR_rebuildProgram: js.UndefOr[
    (js.Function4[
      /* vertexSourceCode */ String, 
      /* fragmentSourceCode */ String, 
      /* onCompiled */ js.Function1[/* program */ this.type, Unit], 
      /* onError */ js.Function1[/* message */ String, Unit], 
      Unit
    ]) | Null
  ] = js.undefined
}
object WebGLProgram {
  
  inline def apply(): WebGLProgram = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebGLProgram]
  }
  
  extension [Self <: WebGLProgram](x: Self) {
    
    inline def set__SPECTOR_rebuildProgram(
      value: (/* vertexSourceCode */ String, /* fragmentSourceCode */ String, /* onCompiled */ js.Function1[WebGLProgram, Unit], /* onError */ js.Function1[/* message */ String, Unit]) => Callback
    ): Self = StObject.set(x, "__SPECTOR_rebuildProgram", js.Any.fromFunction4((t0: /* vertexSourceCode */ String, t1: /* fragmentSourceCode */ String, t2: /* onCompiled */ js.Function1[WebGLProgram, Unit], t3: /* onError */ js.Function1[/* message */ String, Unit]) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def set__SPECTOR_rebuildProgramNull: Self = StObject.set(x, "__SPECTOR_rebuildProgram", null)
    
    inline def set__SPECTOR_rebuildProgramUndefined: Self = StObject.set(x, "__SPECTOR_rebuildProgram", js.undefined)
  }
}
