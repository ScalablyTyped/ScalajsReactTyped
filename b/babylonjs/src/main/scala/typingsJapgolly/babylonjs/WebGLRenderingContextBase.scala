package typingsJapgolly.babylonjs

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.babylonjs.babylonjsStrings.OCULUS_multiview
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// WebGL extensions
trait WebGLRenderingContextBase extends StObject {
  
  @JSName("getExtension")
  def getExtension_OCULUSmultiview(extensionName: OCULUS_multiview): OCULUSMultiview | Null
  
  def makeXRCompatible(): js.Promise[Unit]
}
object WebGLRenderingContextBase {
  
  inline def apply(
    getExtension: OCULUS_multiview => OCULUSMultiview | Null,
    makeXRCompatible: CallbackTo[js.Promise[Unit]]
  ): WebGLRenderingContextBase = {
    val __obj = js.Dynamic.literal(getExtension = js.Any.fromFunction1(getExtension), makeXRCompatible = makeXRCompatible.toJsFn)
    __obj.asInstanceOf[WebGLRenderingContextBase]
  }
  
  extension [Self <: WebGLRenderingContextBase](x: Self) {
    
    inline def setGetExtension(value: OCULUS_multiview => OCULUSMultiview | Null): Self = StObject.set(x, "getExtension", js.Any.fromFunction1(value))
    
    inline def setMakeXRCompatible(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "makeXRCompatible", value.toJsFn)
  }
}
