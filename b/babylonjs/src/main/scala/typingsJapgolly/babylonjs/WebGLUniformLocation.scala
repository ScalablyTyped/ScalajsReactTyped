package typingsJapgolly.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGLUniformLocation extends StObject {
  
  var _currentState: Any
}
object WebGLUniformLocation {
  
  inline def apply(_currentState: Any): WebGLUniformLocation = {
    val __obj = js.Dynamic.literal(_currentState = _currentState.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGLUniformLocation]
  }
  
  extension [Self <: WebGLUniformLocation](x: Self) {
    
    inline def set_currentState(value: Any): Self = StObject.set(x, "_currentState", value.asInstanceOf[js.Any])
  }
}
