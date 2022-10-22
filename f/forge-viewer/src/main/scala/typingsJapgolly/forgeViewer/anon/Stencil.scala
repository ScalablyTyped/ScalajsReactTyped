package typingsJapgolly.forgeViewer.anon

import typingsJapgolly.forgeViewer.THREE.WebGLColorBuffer
import typingsJapgolly.forgeViewer.THREE.WebGLDepthBuffer
import typingsJapgolly.forgeViewer.THREE.WebGLStencilBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stencil extends StObject {
  
  var color: WebGLColorBuffer
  
  var depth: WebGLDepthBuffer
  
  var stencil: WebGLStencilBuffer
}
object Stencil {
  
  inline def apply(color: WebGLColorBuffer, depth: WebGLDepthBuffer, stencil: WebGLStencilBuffer): Stencil = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], stencil = stencil.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stencil]
  }
  
  extension [Self <: Stencil](x: Self) {
    
    inline def setColor(value: WebGLColorBuffer): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setDepth(value: WebGLDepthBuffer): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setStencil(value: WebGLStencilBuffer): Self = StObject.set(x, "stencil", value.asInstanceOf[js.Any])
  }
}
