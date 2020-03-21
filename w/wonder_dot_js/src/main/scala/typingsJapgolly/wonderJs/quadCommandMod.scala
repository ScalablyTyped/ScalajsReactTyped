package typingsJapgolly.wonderJs

import typingsJapgolly.wonderJs.bufferContainerMod.BufferContainer
import typingsJapgolly.wonderJs.gameObjectMod.GameObject
import typingsJapgolly.wonderJs.materialMod.Material
import typingsJapgolly.wonderJs.matrix4Mod.Matrix4
import typingsJapgolly.wonderJs.programMod.Program
import typingsJapgolly.wonderJs.renderCommandMod.RenderCommand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/command/QuadCommand", JSImport.Namespace)
@js.native
object quadCommandMod extends js.Object {
  @js.native
  abstract class QuadCommand () extends RenderCommand {
    var buffers: BufferContainer = js.native
    var mMatrix: Matrix4 = js.native
    var material: Material = js.native
    val mvpMatrix: Matrix4 = js.native
    var pMatrix: Matrix4 = js.native
    val program: Program = js.native
    var sortId: Double = js.native
    var target: GameObject = js.native
    var vMatrix: Matrix4 = js.native
    val vpMatrix: Matrix4 = js.native
    /* protected */ def draw(material: Material): Unit = js.native
  }
  
}

