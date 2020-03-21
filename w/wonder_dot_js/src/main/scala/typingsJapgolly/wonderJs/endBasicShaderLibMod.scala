package typingsJapgolly.wonderJs

import typingsJapgolly.wonderJs.engineShaderLibMod.EngineShaderLib
import typingsJapgolly.wonderJs.quadCommandMod.QuadCommand
import typingsJapgolly.wonderJs.standardBasicMaterialMod.StandardBasicMaterial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/shader/lib/basic/EndBasicShaderLib", JSImport.Namespace)
@js.native
object endBasicShaderLibMod extends js.Object {
  @js.native
  class EndBasicShaderLib () extends EngineShaderLib {
    def setShaderDefinition(cmd: QuadCommand, material: StandardBasicMaterial): Unit = js.native
  }
  
  /* static members */
  @js.native
  object EndBasicShaderLib extends js.Object {
    def create(): EndBasicShaderLib = js.native
  }
  
}

