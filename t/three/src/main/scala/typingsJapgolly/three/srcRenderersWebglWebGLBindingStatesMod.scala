package typingsJapgolly.three

import org.scalajs.dom.WebGLRenderingContext
import typingsJapgolly.three.srcCoreBufferAttributeMod.BufferAttribute
import typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry
import typingsJapgolly.three.srcCoreEventDispatcherMod.Event
import typingsJapgolly.three.srcCoreObject3DMod.Object3D
import typingsJapgolly.three.srcMaterialsMaterialMod.Material
import typingsJapgolly.three.srcRenderersWebglWebGLAttributesMod.WebGLAttributes
import typingsJapgolly.three.srcRenderersWebglWebGLCapabilitiesMod.WebGLCapabilities
import typingsJapgolly.three.srcRenderersWebglWebGLExtensionsMod.WebGLExtensions
import typingsJapgolly.three.srcRenderersWebglWebGLProgramMod.WebGLProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRenderersWebglWebGLBindingStatesMod {
  
  @JSImport("three/src/renderers/webgl/WebGLBindingStates", "WebGLBindingStates")
  @js.native
  open class WebGLBindingStates protected () extends StObject {
    def this(
      gl: WebGLRenderingContext,
      extensions: WebGLExtensions,
      attributes: WebGLAttributes,
      capabilities: WebGLCapabilities
    ) = this()
    
    def disableUnusedAttributes(): Unit = js.native
    
    def dispose(): Unit = js.native
    
    def enableAttribute(attribute: Double): Unit = js.native
    
    def initAttributes(): Unit = js.native
    
    def releaseStatesOfGeometry(): Unit = js.native
    
    def releaseStatesOfProgram(): Unit = js.native
    
    def reset(): Unit = js.native
    
    def resetDefaultState(): Unit = js.native
    
    def setup(
      `object`: Object3D[Event],
      material: Material,
      program: WebGLProgram,
      geometry: BufferGeometry,
      index: BufferAttribute
    ): Unit = js.native
  }
}
