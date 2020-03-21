package typingsJapgolly.three

import org.scalajs.dom.raw.WebGLRenderingContext
import typingsJapgolly.three.bufferGeometryMod.BufferGeometry
import typingsJapgolly.three.materialMod.Material
import typingsJapgolly.three.object3DMod.Object3D
import typingsJapgolly.three.webGLProgramMod.WebGLProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/renderers/webgl/WebGLMorphtargets", JSImport.Namespace)
@js.native
object webGLMorphtargetsMod extends js.Object {
  @js.native
  class WebGLMorphtargets protected () extends js.Object {
    def this(gl: WebGLRenderingContext) = this()
    def update(`object`: Object3D, geometry: BufferGeometry, material: Material, program: WebGLProgram): Unit = js.native
  }
  
}

