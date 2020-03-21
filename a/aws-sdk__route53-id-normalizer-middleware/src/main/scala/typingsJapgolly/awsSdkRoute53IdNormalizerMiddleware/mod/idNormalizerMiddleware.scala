package typingsJapgolly.awsSdkRoute53IdNormalizerMiddleware.mod

import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/route53-id-normalizer-middleware", "idNormalizerMiddleware")
@js.native
object idNormalizerMiddleware extends js.Object {
  def apply[Input /* <: IdentifierBearer */, Output /* <: js.Object */](next: Handler[Input, Output]): Handler[Input, Output] = js.native
}

