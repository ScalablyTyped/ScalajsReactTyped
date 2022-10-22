package typingsJapgolly.babylonjs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.babylonjs.buffersDataBufferMod.DataBuffer
import typingsJapgolly.babylonjs.typesMod.Nullable
import typingsJapgolly.std.WebGLTransformFeedback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enginesExtensionsEngineDottransformFeedbackMod {
  
  @JSImport("babylonjs/Engines/Extensions/engine.transformFeedback", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Engines/Extensions/engine.transformFeedback", "_forceTransformFeedbackToBundle")
  @js.native
  def forceTransformFeedbackToBundle: Boolean = js.native
  
  inline def forceTransformFeedbackToBundle_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_forceTransformFeedbackToBundle")(x.asInstanceOf[js.Any])
  
  /* augmented module */
  object babylonjsEnginesEngineAugmentingMod {
    
    trait Engine extends StObject {
      
      /**
        * Begins a transform feedback operation
        * @param usePoints defines if points or triangles must be used
        */
      def beginTransformFeedback(usePoints: Boolean): Unit
      
      /**
        * Bind a webGL transform feedback object to the webgl context
        * @param value defines the webGL transform feedback object to bind
        */
      def bindTransformFeedback(value: Nullable[WebGLTransformFeedback]): Unit
      
      /**
        * Bind a webGL buffer for a transform feedback operation
        * @param value defines the webGL buffer to bind
        */
      def bindTransformFeedbackBuffer(value: Nullable[DataBuffer]): Unit
      
      /**
        * Creates a webGL transform feedback object
        * Please makes sure to check webGLVersion property to check if you are running webGL 2+
        * @returns the webGL transform feedback object
        */
      def createTransformFeedback(): WebGLTransformFeedback
      
      /**
        * Delete a webGL transform feedback object
        * @param value defines the webGL transform feedback object to delete
        */
      def deleteTransformFeedback(value: WebGLTransformFeedback): Unit
      
      /**
        * Ends a transform feedback operation
        */
      def endTransformFeedback(): Unit
      
      /**
        * Specify the varyings to use with transform feedback
        * @param program defines the associated webGL program
        * @param value defines the list of strings representing the varying names
        */
      def setTranformFeedbackVaryings(program: WebGLProgram, value: js.Array[String]): Unit
    }
    object Engine {
      
      inline def apply(
        beginTransformFeedback: Boolean => Callback,
        bindTransformFeedback: Nullable[WebGLTransformFeedback] => Callback,
        bindTransformFeedbackBuffer: Nullable[DataBuffer] => Callback,
        createTransformFeedback: CallbackTo[WebGLTransformFeedback],
        deleteTransformFeedback: WebGLTransformFeedback => Callback,
        endTransformFeedback: Callback,
        setTranformFeedbackVaryings: (WebGLProgram, js.Array[String]) => Callback
      ): Engine = {
        val __obj = js.Dynamic.literal(beginTransformFeedback = js.Any.fromFunction1((t0: Boolean) => beginTransformFeedback(t0).runNow()), bindTransformFeedback = js.Any.fromFunction1((t0: Nullable[WebGLTransformFeedback]) => bindTransformFeedback(t0).runNow()), bindTransformFeedbackBuffer = js.Any.fromFunction1((t0: Nullable[DataBuffer]) => bindTransformFeedbackBuffer(t0).runNow()), createTransformFeedback = createTransformFeedback.toJsFn, deleteTransformFeedback = js.Any.fromFunction1((t0: WebGLTransformFeedback) => deleteTransformFeedback(t0).runNow()), endTransformFeedback = endTransformFeedback.toJsFn, setTranformFeedbackVaryings = js.Any.fromFunction2((t0: WebGLProgram, t1: js.Array[String]) => (setTranformFeedbackVaryings(t0, t1)).runNow()))
        __obj.asInstanceOf[Engine]
      }
      
      extension [Self <: Engine](x: Self) {
        
        inline def setBeginTransformFeedback(value: Boolean => Callback): Self = StObject.set(x, "beginTransformFeedback", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
        
        inline def setBindTransformFeedback(value: Nullable[WebGLTransformFeedback] => Callback): Self = StObject.set(x, "bindTransformFeedback", js.Any.fromFunction1((t0: Nullable[WebGLTransformFeedback]) => value(t0).runNow()))
        
        inline def setBindTransformFeedbackBuffer(value: Nullable[DataBuffer] => Callback): Self = StObject.set(x, "bindTransformFeedbackBuffer", js.Any.fromFunction1((t0: Nullable[DataBuffer]) => value(t0).runNow()))
        
        inline def setCreateTransformFeedback(value: CallbackTo[WebGLTransformFeedback]): Self = StObject.set(x, "createTransformFeedback", value.toJsFn)
        
        inline def setDeleteTransformFeedback(value: WebGLTransformFeedback => Callback): Self = StObject.set(x, "deleteTransformFeedback", js.Any.fromFunction1((t0: WebGLTransformFeedback) => value(t0).runNow()))
        
        inline def setEndTransformFeedback(value: Callback): Self = StObject.set(x, "endTransformFeedback", value.toJsFn)
        
        inline def setSetTranformFeedbackVaryings(value: (WebGLProgram, js.Array[String]) => Callback): Self = StObject.set(x, "setTranformFeedbackVaryings", js.Any.fromFunction2((t0: WebGLProgram, t1: js.Array[String]) => (value(t0, t1)).runNow()))
      }
    }
  }
}
