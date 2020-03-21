package typingsJapgolly.reduxApiMiddleware

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type RSAAActions = (typingsJapgolly.reduxApiMiddleware.mod.RSAARequestAction[scala.Nothing, scala.Nothing]) | (typingsJapgolly.reduxApiMiddleware.mod.RSAAResultAction[scala.Nothing, scala.Nothing])
  type RSAAFailureAction[Payload, Meta] = typingsJapgolly.reduxApiMiddleware.mod.RSAAResultAction[Payload, Meta]
  type RSAAFailureType[State, Payload, Meta] = java.lang.String | js.Symbol | (typingsJapgolly.reduxApiMiddleware.mod.RSAAFailureTypeDescriptor[State, Payload, Meta])
  type RSAARequestAction[Payload, Meta] = (typingsJapgolly.reduxApiMiddleware.mod.ValidAction[Payload, Meta]) | typingsJapgolly.reduxApiMiddleware.mod.InvalidAction[typingsJapgolly.reduxApiMiddleware.mod.InvalidRSAA]
  type RSAARequestType[State, Payload, Meta] = java.lang.String | js.Symbol | (typingsJapgolly.reduxApiMiddleware.mod.RSAARequestTypeDescriptor[State, Payload, Meta])
  type RSAAResultAction[Payload, Meta] = (typingsJapgolly.reduxApiMiddleware.mod.ValidAction[Payload, Meta]) | (typingsJapgolly.reduxApiMiddleware.mod.InvalidAction[
    typingsJapgolly.reduxApiMiddleware.mod.InternalError | typingsJapgolly.reduxApiMiddleware.mod.RequestError | typingsJapgolly.reduxApiMiddleware.mod.ApiError[Payload]
  ])
  type RSAASuccessAction[Payload, Meta] = typingsJapgolly.reduxApiMiddleware.mod.RSAAResultAction[Payload, Meta]
  type RSAASuccessType[State, Payload, Meta] = java.lang.String | js.Symbol | (typingsJapgolly.reduxApiMiddleware.mod.RSAASuccessTypeDescriptor[State, Payload, Meta])
  type TypeOrResolver[Arg, Type] = Type | (js.Function1[/* arg */ Arg, Type])
}
