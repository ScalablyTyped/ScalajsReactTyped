package typingsJapgolly.vizJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Module extends StObject {
    
    var Module: typingsJapgolly.vizJs.Module
    
    def render(instance: typingsJapgolly.vizJs.Module, src: String, options: Options): String
    @JSName("render")
    var render_Original: RenderFunction
  }
  object Module {
    
    inline def apply(
      Module: typingsJapgolly.vizJs.Module,
      render: (/* instance */ typingsJapgolly.vizJs.Module, /* src */ String, /* options */ Options) => String
    ): typingsJapgolly.vizJs.anon.Module = {
      val __obj = js.Dynamic.literal(Module = Module.asInstanceOf[js.Any], render = js.Any.fromFunction3(render))
      __obj.asInstanceOf[typingsJapgolly.vizJs.anon.Module]
    }
    
    extension [Self <: typingsJapgolly.vizJs.anon.Module](x: Self) {
      
      inline def setModule(value: typingsJapgolly.vizJs.Module): Self = StObject.set(x, "Module", value.asInstanceOf[js.Any])
      
      inline def setRender(
        value: (/* instance */ typingsJapgolly.vizJs.Module, /* src */ String, /* options */ Options) => String
      ): Self = StObject.set(x, "render", js.Any.fromFunction3(value))
    }
  }
}
