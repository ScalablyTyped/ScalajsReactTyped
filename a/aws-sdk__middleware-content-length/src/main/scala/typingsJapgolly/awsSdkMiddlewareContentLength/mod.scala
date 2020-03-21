package typingsJapgolly.awsSdkMiddlewareContentLength

import typingsJapgolly.awsSdkTypes.middlewareMod.BuildMiddleware
import typingsJapgolly.awsSdkTypes.utilMod.BodyLengthCalculator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/middleware-content-length", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def contentLengthMiddleware(bodyLengthCalculator: BodyLengthCalculator): BuildMiddleware[_, _, _] = js.native
}

