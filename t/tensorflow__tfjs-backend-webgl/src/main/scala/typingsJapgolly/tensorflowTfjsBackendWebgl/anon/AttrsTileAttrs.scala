package typingsJapgolly.tensorflowTfjsBackendWebgl.anon

import typingsJapgolly.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.TileAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.TileInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsTileAttrs extends StObject {
  
  var attrs: TileAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: TileInputs
}
object AttrsTileAttrs {
  
  inline def apply(attrs: TileAttrs, backend: MathBackendWebGL, inputs: TileInputs): AttrsTileAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsTileAttrs]
  }
  
  extension [Self <: AttrsTileAttrs](x: Self) {
    
    inline def setAttrs(value: TileAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: TileInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
