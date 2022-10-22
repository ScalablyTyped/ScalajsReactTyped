package typingsJapgolly.pixiCore.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRenderableObject extends StObject {
  
  /** After method for transform updates */
  def disableTempParent(parent: IRenderableContainer): Unit
  
  /** Before method for transform updates */
  def enableTempParent(): IRenderableContainer
  
  /** Object must have a parent container */
  var parent: IRenderableContainer
  
  /** Render object directly */
  def render(renderer: Renderer): Unit
  
  /** Update the transforms */
  def updateTransform(): Unit
}
object IRenderableObject {
  
  inline def apply(
    disableTempParent: IRenderableContainer => Callback,
    enableTempParent: CallbackTo[IRenderableContainer],
    parent: IRenderableContainer,
    render: Renderer => Callback,
    updateTransform: Callback
  ): IRenderableObject = {
    val __obj = js.Dynamic.literal(disableTempParent = js.Any.fromFunction1((t0: IRenderableContainer) => disableTempParent(t0).runNow()), enableTempParent = enableTempParent.toJsFn, parent = parent.asInstanceOf[js.Any], render = js.Any.fromFunction1((t0: Renderer) => render(t0).runNow()), updateTransform = updateTransform.toJsFn)
    __obj.asInstanceOf[IRenderableObject]
  }
  
  extension [Self <: IRenderableObject](x: Self) {
    
    inline def setDisableTempParent(value: IRenderableContainer => Callback): Self = StObject.set(x, "disableTempParent", js.Any.fromFunction1((t0: IRenderableContainer) => value(t0).runNow()))
    
    inline def setEnableTempParent(value: CallbackTo[IRenderableContainer]): Self = StObject.set(x, "enableTempParent", value.toJsFn)
    
    inline def setParent(value: IRenderableContainer): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setRender(value: Renderer => Callback): Self = StObject.set(x, "render", js.Any.fromFunction1((t0: Renderer) => value(t0).runNow()))
    
    inline def setUpdateTransform(value: Callback): Self = StObject.set(x, "updateTransform", value.toJsFn)
  }
}
