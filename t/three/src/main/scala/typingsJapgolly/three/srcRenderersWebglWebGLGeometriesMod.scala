package typingsJapgolly.three

import org.scalajs.dom.WebGLRenderingContext
import typingsJapgolly.three.srcCoreBufferAttributeMod.BufferAttribute
import typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry
import typingsJapgolly.three.srcCoreEventDispatcherMod.Event
import typingsJapgolly.three.srcCoreObject3DMod.Object3D
import typingsJapgolly.three.srcRenderersWebglWebGLAttributesMod.WebGLAttributes
import typingsJapgolly.three.srcRenderersWebglWebGLInfoMod.WebGLInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRenderersWebglWebGLGeometriesMod {
  
  @JSImport("three/src/renderers/webgl/WebGLGeometries", "WebGLGeometries")
  @js.native
  open class WebGLGeometries protected () extends StObject {
    def this(gl: WebGLRenderingContext, attributes: WebGLAttributes, info: WebGLInfo) = this()
    
    def get(`object`: Object3D[Event], geometry: BufferGeometry): BufferGeometry = js.native
    
    def getWireframeAttribute(geometry: BufferGeometry): BufferAttribute = js.native
    
    def update(geometry: BufferGeometry): Unit = js.native
  }
}
