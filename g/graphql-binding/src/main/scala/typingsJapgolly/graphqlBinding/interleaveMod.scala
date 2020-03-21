package typingsJapgolly.graphqlBinding

import typingsJapgolly.graphqlBinding.typesMod.Interpolation
import typingsJapgolly.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-binding/dist/codegen/utils/interleave", JSImport.Namespace)
@js.native
object interleaveMod extends js.Object {
  def interleave[Props](strings: TemplateStringsArray, interpolations: js.Array[Interpolation[Props]]): js.Array[Interpolation[Props]] = js.native
}

