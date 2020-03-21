package typingsJapgolly.awsSdkLocationConstraintMiddleware.mod

import typingsJapgolly.awsSdkTypes.middlewareMod.Middleware
import typingsJapgolly.awsSdkTypes.utilMod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/location-constraint-middleware", "locationConstraintMiddleware")
@js.native
object locationConstraintMiddleware extends js.Object {
  def apply[Input /* <: LocationConstraintAwareInput */, Output /* <: js.Object */](regionProvider: Provider[String]): Middleware[Input, Output] = js.native
}

