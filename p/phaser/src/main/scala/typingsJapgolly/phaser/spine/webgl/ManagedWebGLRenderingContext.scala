package typingsJapgolly.phaser.spine.webgl

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.WebGLRenderingContext
import typingsJapgolly.phaser.spine.Restorable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedWebGLRenderingContext extends StObject {
  
  def addRestorable(restorable: Restorable): Unit
  
  var canvas: HTMLCanvasElement | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OffscreenCanvas */ Any)
  
  var gl: WebGLRenderingContext
  
  def removeRestorable(restorable: Restorable): Unit
  
  /* private */ var restorables: Any
}
object ManagedWebGLRenderingContext {
  
  inline def apply(
    addRestorable: Restorable => Callback,
    canvas: HTMLCanvasElement | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OffscreenCanvas */ Any),
    gl: WebGLRenderingContext,
    removeRestorable: Restorable => Callback,
    restorables: Any
  ): ManagedWebGLRenderingContext = {
    val __obj = js.Dynamic.literal(addRestorable = js.Any.fromFunction1((t0: Restorable) => addRestorable(t0).runNow()), canvas = canvas.asInstanceOf[js.Any], gl = gl.asInstanceOf[js.Any], removeRestorable = js.Any.fromFunction1((t0: Restorable) => removeRestorable(t0).runNow()), restorables = restorables.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedWebGLRenderingContext]
  }
  
  extension [Self <: ManagedWebGLRenderingContext](x: Self) {
    
    inline def setAddRestorable(value: Restorable => Callback): Self = StObject.set(x, "addRestorable", js.Any.fromFunction1((t0: Restorable) => value(t0).runNow()))
    
    inline def setCanvas(
      value: HTMLCanvasElement | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OffscreenCanvas */ Any)
    ): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
    
    inline def setGl(value: WebGLRenderingContext): Self = StObject.set(x, "gl", value.asInstanceOf[js.Any])
    
    inline def setRemoveRestorable(value: Restorable => Callback): Self = StObject.set(x, "removeRestorable", js.Any.fromFunction1((t0: Restorable) => value(t0).runNow()))
    
    inline def setRestorables(value: Any): Self = StObject.set(x, "restorables", value.asInstanceOf[js.Any])
  }
}
