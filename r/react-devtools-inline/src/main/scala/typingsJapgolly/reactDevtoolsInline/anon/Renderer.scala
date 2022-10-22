package typingsJapgolly.reactDevtoolsInline.anon

import typingsJapgolly.reactDevtoolsInline.commonsMod.ReactRenderer
import typingsJapgolly.reactDevtoolsInline.commonsMod.RendererInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Renderer extends StObject {
  
  var id: Double
  
  var renderer: ReactRenderer
  
  var rendererInterface: RendererInterface
}
object Renderer {
  
  inline def apply(id: Double, renderer: ReactRenderer, rendererInterface: RendererInterface): Renderer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], rendererInterface = rendererInterface.asInstanceOf[js.Any])
    __obj.asInstanceOf[Renderer]
  }
  
  extension [Self <: Renderer](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRenderer(value: ReactRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    inline def setRendererInterface(value: RendererInterface): Self = StObject.set(x, "rendererInterface", value.asInstanceOf[js.Any])
  }
}
