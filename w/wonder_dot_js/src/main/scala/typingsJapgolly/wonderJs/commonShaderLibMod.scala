package typingsJapgolly.wonderJs

import typingsJapgolly.wonderJs.engineMaterialMod.EngineMaterial
import typingsJapgolly.wonderJs.engineShaderLibMod.EngineShaderLib
import typingsJapgolly.wonderJs.programMod.Program
import typingsJapgolly.wonderJs.quadCommandMod.QuadCommand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/shader/lib/common/CommonShaderLib", JSImport.Namespace)
@js.native
object commonShaderLibMod extends js.Object {
  @js.native
  class CommonShaderLib () extends EngineShaderLib {
    def sendShaderVariables(program: Program, cmd: QuadCommand, material: EngineMaterial): Unit = js.native
    def setShaderDefinition(cmd: QuadCommand, material: EngineMaterial): Unit = js.native
  }
  
  /* static members */
  @js.native
  object CommonShaderLib extends js.Object {
    def create(): CommonShaderLib = js.native
  }
  
}

