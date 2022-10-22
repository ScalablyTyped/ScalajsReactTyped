package typingsJapgolly.maplibreGl.mod

import org.scalajs.dom.WebGLUniformLocation
import typingsJapgolly.maplibreGl.anon.PartialUniformany
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UniformBinder extends StObject {
  
  def getBinding(context: Context, location: WebGLUniformLocation, name: String): PartialUniformany
  
  def setUniform(
    uniform: Uniform[Any],
    globals: GlobalProperties,
    currentValue: PossiblyEvaluatedPropertyValue[Any],
    uniformName: String
  ): scala.Unit
  
  var uniformNames: js.Array[String]
}
object UniformBinder {
  
  inline def apply(
    getBinding: (Context, WebGLUniformLocation, String) => PartialUniformany,
    setUniform: (Uniform[Any], GlobalProperties, PossiblyEvaluatedPropertyValue[Any], String) => japgolly.scalajs.react.Callback,
    uniformNames: js.Array[String]
  ): UniformBinder = {
    val __obj = js.Dynamic.literal(getBinding = js.Any.fromFunction3(getBinding), setUniform = js.Any.fromFunction4((t0: Uniform[Any], t1: GlobalProperties, t2: PossiblyEvaluatedPropertyValue[Any], t3: String) => (setUniform(t0, t1, t2, t3)).runNow()), uniformNames = uniformNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[UniformBinder]
  }
  
  extension [Self <: UniformBinder](x: Self) {
    
    inline def setGetBinding(value: (Context, WebGLUniformLocation, String) => PartialUniformany): Self = StObject.set(x, "getBinding", js.Any.fromFunction3(value))
    
    inline def setSetUniform(
      value: (Uniform[Any], GlobalProperties, PossiblyEvaluatedPropertyValue[Any], String) => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "setUniform", js.Any.fromFunction4((t0: Uniform[Any], t1: GlobalProperties, t2: PossiblyEvaluatedPropertyValue[Any], t3: String) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setUniformNames(value: js.Array[String]): Self = StObject.set(x, "uniformNames", value.asInstanceOf[js.Any])
    
    inline def setUniformNamesVarargs(value: String*): Self = StObject.set(x, "uniformNames", js.Array(value*))
  }
}
