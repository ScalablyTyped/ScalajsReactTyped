package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WEBGLDebugShaders extends StObject {
  
  /* standard dom */
  def getTranslatedShaderSource(shader: org.scalajs.dom.WebGLShader): java.lang.String
}
object WEBGLDebugShaders {
  
  inline def apply(getTranslatedShaderSource: org.scalajs.dom.WebGLShader => java.lang.String): WEBGLDebugShaders = {
    val __obj = js.Dynamic.literal(getTranslatedShaderSource = js.Any.fromFunction1(getTranslatedShaderSource))
    __obj.asInstanceOf[WEBGLDebugShaders]
  }
  
  extension [Self <: WEBGLDebugShaders](x: Self) {
    
    inline def setGetTranslatedShaderSource(value: org.scalajs.dom.WebGLShader => java.lang.String): Self = StObject.set(x, "getTranslatedShaderSource", js.Any.fromFunction1(value))
  }
}
