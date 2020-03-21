package typingsJapgolly.jose.mod.JWK

import typingsJapgolly.jose.joseStrings.EC
import typingsJapgolly.jose.mod.BasicParameters
import typingsJapgolly.jose.mod.ECCurve
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWK.generate")
@js.native
object generate_EC extends js.Object {
  def apply(kty: EC): js.Promise[ECKey] = js.native
  def apply(kty: EC, crv: ECCurve): js.Promise[ECKey] = js.native
  def apply(kty: EC, crv: ECCurve, parameters: BasicParameters): js.Promise[ECKey] = js.native
  def apply(kty: EC, crv: ECCurve, parameters: BasicParameters, `private`: Boolean): js.Promise[ECKey] = js.native
}

