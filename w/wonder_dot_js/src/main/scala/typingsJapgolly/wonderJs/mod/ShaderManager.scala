package typingsJapgolly.wonderJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015", "ShaderManager")
@js.native
class ShaderManager protected ()
  extends typingsJapgolly.wonderJs.shaderManagerMod.ShaderManager {
  def this(material: typingsJapgolly.wonderJs.materialMod.Material) = this()
}

/* static members */
@JSImport("wonder.js/dist/es2015", "ShaderManager")
@js.native
object ShaderManager extends js.Object {
  def create(material: typingsJapgolly.wonderJs.materialMod.Material): typingsJapgolly.wonderJs.shaderManagerMod.ShaderManager = js.native
}

