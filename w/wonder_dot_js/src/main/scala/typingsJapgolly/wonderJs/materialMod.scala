package typingsJapgolly.wonderJs

import typingsJapgolly.wonderJs.colorMod.Color
import typingsJapgolly.wonderJs.geometryMod.Geometry
import typingsJapgolly.wonderJs.programMod.Program
import typingsJapgolly.wonderJs.quadCommandMod.QuadCommand
import typingsJapgolly.wonderJs.shaderMod.Shader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/material/Material", JSImport.Namespace)
@js.native
object materialMod extends js.Object {
  @js.native
  abstract class Material () extends js.Object {
    var color: Color = js.native
    var geometry: Geometry = js.native
    val program: Program = js.native
    val shader: Shader = js.native
    /* protected */ def createShader(): Shader = js.native
    def dispose(): Unit = js.native
    def init(): Unit = js.native
    def initWhenCreate(): Unit = js.native
    def updateShader(quadCmd: QuadCommand): Unit = js.native
  }
  
}

