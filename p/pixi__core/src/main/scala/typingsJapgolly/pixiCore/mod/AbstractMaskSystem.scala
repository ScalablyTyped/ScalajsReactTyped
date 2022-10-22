package typingsJapgolly.pixiCore.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * System plugin to the renderer to manage specific types of masking operations.
  * @memberof PIXI
  */
trait AbstractMaskSystem
  extends StObject
     with ISystem {
  
  /**
    * Setup renderer to use the current mask data.
    * @private
    */
  /* protected */ def _useCurrent(): Unit
  
  /** Gets count of masks of certain type. */
  def getStackLength(): Double
  
  /**
    * Constant for gl.enable
    * @private
    */
  /* protected */ var glConst: Double
  
  /**
    * The mask stack
    * @member {PIXI.MaskData[]}
    */
  /* protected */ var maskStack: js.Array[MaskData]
  
  /* protected */ var renderer: Renderer
  
  /**
    * Changes the mask stack that is used by this System.
    * @param {PIXI.MaskData[]} maskStack - The mask stack
    */
  def setMaskStack(maskStack: js.Array[MaskData]): Unit
}
object AbstractMaskSystem {
  
  inline def apply(
    _useCurrent: Callback,
    destroy: Callback,
    getStackLength: CallbackTo[Double],
    glConst: Double,
    maskStack: js.Array[MaskData],
    renderer: Renderer,
    setMaskStack: js.Array[MaskData] => Callback
  ): AbstractMaskSystem = {
    val __obj = js.Dynamic.literal(_useCurrent = _useCurrent.toJsFn, destroy = destroy.toJsFn, getStackLength = getStackLength.toJsFn, glConst = glConst.asInstanceOf[js.Any], maskStack = maskStack.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], setMaskStack = js.Any.fromFunction1((t0: js.Array[MaskData]) => setMaskStack(t0).runNow()))
    __obj.asInstanceOf[AbstractMaskSystem]
  }
  
  extension [Self <: AbstractMaskSystem](x: Self) {
    
    inline def setGetStackLength(value: CallbackTo[Double]): Self = StObject.set(x, "getStackLength", value.toJsFn)
    
    inline def setGlConst(value: Double): Self = StObject.set(x, "glConst", value.asInstanceOf[js.Any])
    
    inline def setMaskStack(value: js.Array[MaskData]): Self = StObject.set(x, "maskStack", value.asInstanceOf[js.Any])
    
    inline def setMaskStackVarargs(value: MaskData*): Self = StObject.set(x, "maskStack", js.Array(value*))
    
    inline def setRenderer(value: Renderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    inline def setSetMaskStack(value: js.Array[MaskData] => Callback): Self = StObject.set(x, "setMaskStack", js.Any.fromFunction1((t0: js.Array[MaskData]) => value(t0).runNow()))
    
    inline def set_useCurrent(value: Callback): Self = StObject.set(x, "_useCurrent", value.toJsFn)
  }
}
