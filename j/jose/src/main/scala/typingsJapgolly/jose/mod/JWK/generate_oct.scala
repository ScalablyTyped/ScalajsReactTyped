package typingsJapgolly.jose.mod.JWK

import typingsJapgolly.jose.joseStrings.oct
import typingsJapgolly.jose.mod.BasicParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWK.generate")
@js.native
object generate_oct extends js.Object {
  def apply(kty: oct): js.Promise[OctKey] = js.native
  def apply(kty: oct, bitlength: Double): js.Promise[OctKey] = js.native
  def apply(kty: oct, bitlength: Double, parameters: BasicParameters): js.Promise[OctKey] = js.native
}

