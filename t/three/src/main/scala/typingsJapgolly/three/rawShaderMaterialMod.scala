package typingsJapgolly.three

import typingsJapgolly.three.shaderMaterialMod.ShaderMaterial
import typingsJapgolly.three.shaderMaterialMod.ShaderMaterialParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/materials/RawShaderMaterial", JSImport.Namespace)
@js.native
object rawShaderMaterialMod extends js.Object {
  @js.native
  class RawShaderMaterial () extends ShaderMaterial {
    def this(parameters: ShaderMaterialParameters) = this()
  }
  
}

