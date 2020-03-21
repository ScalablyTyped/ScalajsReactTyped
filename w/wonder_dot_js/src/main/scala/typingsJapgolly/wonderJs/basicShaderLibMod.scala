package typingsJapgolly.wonderJs

import typingsJapgolly.wonderJs.basicMaterialMod.BasicMaterial
import typingsJapgolly.wonderJs.engineShaderLibMod.EngineShaderLib
import typingsJapgolly.wonderJs.programMod.Program
import typingsJapgolly.wonderJs.quadCommandMod.QuadCommand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/shader/lib/basic/BasicShaderLib", JSImport.Namespace)
@js.native
object basicShaderLibMod extends js.Object {
  @js.native
  class BasicShaderLib () extends EngineShaderLib {
    def sendShaderVariables(program: Program, cmd: QuadCommand, material: BasicMaterial): Unit = js.native
    def setShaderDefinition(cmd: QuadCommand, material: BasicMaterial): Unit = js.native
  }
  
  /* static members */
  @js.native
  object BasicShaderLib extends js.Object {
    def create(): BasicShaderLib = js.native
  }
  
}

