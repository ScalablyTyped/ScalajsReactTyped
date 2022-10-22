package typingsJapgolly.wonderJs

import typingsJapgolly.wonderJs.distEs2015MaterialBasicMaterialMod.BasicMaterial
import typingsJapgolly.wonderJs.distEs2015RendererCommandQuadCommandMod.QuadCommand
import typingsJapgolly.wonderJs.distEs2015RendererProgramProgramMod.Program
import typingsJapgolly.wonderJs.distEs2015RendererShaderLibEngineShaderLibMod.EngineShaderLib
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015RendererShaderLibBasicBasicShaderLibMod {
  
  @JSImport("wonder.js/dist/es2015/renderer/shader/lib/basic/BasicShaderLib", "BasicShaderLib")
  @js.native
  open class BasicShaderLib () extends EngineShaderLib {
    
    def sendShaderVariables(program: Program, cmd: QuadCommand, material: BasicMaterial): Unit = js.native
    
    def setShaderDefinition(cmd: QuadCommand, material: BasicMaterial): Unit = js.native
  }
  /* static members */
  object BasicShaderLib {
    
    @JSImport("wonder.js/dist/es2015/renderer/shader/lib/basic/BasicShaderLib", "BasicShaderLib")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): BasicShaderLib = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[BasicShaderLib]
  }
}
