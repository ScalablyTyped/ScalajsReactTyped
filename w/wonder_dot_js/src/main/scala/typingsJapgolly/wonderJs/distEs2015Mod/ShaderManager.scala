package typingsJapgolly.wonderJs.distEs2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "ShaderManager")
@js.native
open class ShaderManager protected ()
  extends typingsJapgolly.wonderJs.distEs2015MaterialShaderManagerMod.ShaderManager {
  def this(material: typingsJapgolly.wonderJs.distEs2015MaterialMaterialMod.Material) = this()
}
/* static members */
object ShaderManager {
  
  @JSImport("wonder.js/dist/es2015", "ShaderManager")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(material: typingsJapgolly.wonderJs.distEs2015MaterialMaterialMod.Material): typingsJapgolly.wonderJs.distEs2015MaterialShaderManagerMod.ShaderManager = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(material.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.wonderJs.distEs2015MaterialShaderManagerMod.ShaderManager]
}
