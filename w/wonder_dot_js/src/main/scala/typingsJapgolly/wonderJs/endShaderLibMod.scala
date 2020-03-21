package typingsJapgolly.wonderJs

import typingsJapgolly.wonderJs.engineMaterialMod.EngineMaterial
import typingsJapgolly.wonderJs.engineShaderLibMod.EngineShaderLib
import typingsJapgolly.wonderJs.programMod.Program
import typingsJapgolly.wonderJs.quadCommandMod.QuadCommand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/shader/lib/common/EndShaderLib", JSImport.Namespace)
@js.native
object endShaderLibMod extends js.Object {
  @js.native
  class EndShaderLib () extends EngineShaderLib {
    def sendShaderVariables(program: Program, cmd: QuadCommand, material: EngineMaterial): Unit = js.native
  }
  
  /* static members */
  @js.native
  object EndShaderLib extends js.Object {
    def create(): EndShaderLib = js.native
  }
  
}

