package typingsJapgolly.three

import typingsJapgolly.three.shaderMaterialMod.ShaderMaterial
import typingsJapgolly.three.shaderMaterialMod.ShaderMaterialParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/materials/ShadowMaterial", JSImport.Namespace)
@js.native
object shadowMaterialMod extends js.Object {
  @js.native
  class ShadowMaterial () extends ShaderMaterial {
    def this(parameters: ShaderMaterialParameters) = this()
  }
  
}

