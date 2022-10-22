package typingsJapgolly.tensorflowTfjsBackendWebgl.anon

import typingsJapgolly.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.MinAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.MinInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsMinAttrs extends StObject {
  
  var attrs: MinAttrs
  
  var backend: MathBackendWebGL
  
  var inputs: MinInputs
}
object AttrsMinAttrs {
  
  inline def apply(attrs: MinAttrs, backend: MathBackendWebGL, inputs: MinInputs): AttrsMinAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsMinAttrs]
  }
  
  extension [Self <: AttrsMinAttrs](x: Self) {
    
    inline def setAttrs(value: MinAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: MinInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
