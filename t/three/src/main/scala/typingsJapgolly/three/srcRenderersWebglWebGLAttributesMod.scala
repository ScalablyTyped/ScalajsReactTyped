package typingsJapgolly.three

import org.scalajs.dom.WebGLRenderingContext
import typingsJapgolly.std.WebGL2RenderingContext
import typingsJapgolly.three.anon.BytesPerElement
import typingsJapgolly.three.srcCoreBufferAttributeMod.BufferAttribute
import typingsJapgolly.three.srcCoreInterleavedBufferAttributeMod.InterleavedBufferAttribute
import typingsJapgolly.three.srcRenderersWebglWebGLCapabilitiesMod.WebGLCapabilities
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRenderersWebglWebGLAttributesMod {
  
  @JSImport("three/src/renderers/webgl/WebGLAttributes", "WebGLAttributes")
  @js.native
  open class WebGLAttributes protected () extends StObject {
    def this(gl: WebGLRenderingContext, capabilities: WebGLCapabilities) = this()
    def this(gl: WebGL2RenderingContext, capabilities: WebGLCapabilities) = this()
    
    def get(attribute: BufferAttribute): BytesPerElement = js.native
    def get(attribute: InterleavedBufferAttribute): BytesPerElement = js.native
    
    def remove(attribute: BufferAttribute): Unit = js.native
    def remove(attribute: InterleavedBufferAttribute): Unit = js.native
    
    def update(attribute: BufferAttribute, bufferType: Double): Unit = js.native
    def update(attribute: InterleavedBufferAttribute, bufferType: Double): Unit = js.native
  }
}
