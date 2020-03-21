package typingsJapgolly.awsSdkTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object middlewareMod {
  type BuildHandler[Input /* <: js.Object */, Output /* <: js.Object */, Stream] = typingsJapgolly.awsSdkTypes.middlewareMod.FinalizeHandler[Input, Output, Stream]
  type BuildHandlerArguments[Input /* <: js.Object */, Stream] = typingsJapgolly.awsSdkTypes.middlewareMod.FinalizeHandlerArguments[Input, Stream]
  type BuildMiddleware[Input /* <: js.Object */, Output /* <: js.Object */, Stream] = typingsJapgolly.awsSdkTypes.middlewareMod.FinalizeMiddleware[Input, Output, Stream]
  type FinalizeHandler[Input /* <: js.Object */, Output /* <: js.Object */, Stream] = js.Function1[
    /* args */ typingsJapgolly.awsSdkTypes.middlewareMod.FinalizeHandlerArguments[Input, Stream], 
    js.Promise[Output]
  ]
  type FinalizeMiddleware[Input /* <: js.Object */, Output /* <: js.Object */, Stream] = js.Function2[
    /* next */ typingsJapgolly.awsSdkTypes.middlewareMod.FinalizeHandler[Input, Output, Stream], 
    /* context */ typingsJapgolly.awsSdkTypes.middlewareMod.HandlerExecutionContext, 
    typingsJapgolly.awsSdkTypes.middlewareMod.FinalizeHandler[Input, Output, Stream]
  ]
  type Handler[Input /* <: js.Object */, Output /* <: js.Object */] = js.Function1[
    /* args */ typingsJapgolly.awsSdkTypes.middlewareMod.HandlerArguments[Input], 
    js.Promise[Output]
  ]
  type Middleware[Input /* <: js.Object */, Output /* <: js.Object */] = js.Function2[
    /* next */ typingsJapgolly.awsSdkTypes.middlewareMod.Handler[Input, Output], 
    /* context */ typingsJapgolly.awsSdkTypes.middlewareMod.HandlerExecutionContext, 
    typingsJapgolly.awsSdkTypes.middlewareMod.Handler[Input, Output]
  ]
  type SerializeHandler[Input /* <: js.Object */, Output /* <: js.Object */, Stream] = js.Function1[
    /* args */ typingsJapgolly.awsSdkTypes.middlewareMod.SerializeHandlerArguments[Input, Stream], 
    js.Promise[Output]
  ]
  type SerializeMiddleware[Input /* <: js.Object */, Output /* <: js.Object */, Stream] = js.Function2[
    /* next */ typingsJapgolly.awsSdkTypes.middlewareMod.SerializeHandler[Input, Output, Stream], 
    /* context */ typingsJapgolly.awsSdkTypes.middlewareMod.HandlerExecutionContext, 
    typingsJapgolly.awsSdkTypes.middlewareMod.SerializeHandler[Input, Output, Stream]
  ]
  type Terminalware[OutputConstraint /* <: js.Object */, Stream] = js.Function1[
    /* context */ typingsJapgolly.awsSdkTypes.middlewareMod.HandlerExecutionContext, 
    typingsJapgolly.awsSdkTypes.middlewareMod.FinalizeHandler[js.Object, OutputConstraint, Stream]
  ]
}
