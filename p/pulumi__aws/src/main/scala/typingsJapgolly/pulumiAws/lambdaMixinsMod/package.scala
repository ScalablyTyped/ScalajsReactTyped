package typingsJapgolly.pulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object lambdaMixinsMod {
  type BaseCallbackFunctionArgs = typingsJapgolly.pulumiAws.utilsMod.Overwrite[
    typingsJapgolly.pulumiAws.lambdaFunctionMod.FunctionArgs, 
    typingsJapgolly.pulumiAws.AnonCodePathOptions
  ]
  type Callback[E, R] = js.Function3[
    /* event */ E, 
    /* context */ typingsJapgolly.pulumiAws.lambdaMixinsMod.Context, 
    /* callback */ js.Function2[/* error */ js.UndefOr[js.Any], /* result */ js.UndefOr[R], scala.Unit], 
    js.Promise[R] | scala.Unit
  ]
  type CallbackFactory[E, R] = js.Function0[typingsJapgolly.pulumiAws.lambdaMixinsMod.Callback[E, R]]
  type EventHandler[E, R] = (typingsJapgolly.pulumiAws.lambdaMixinsMod.Callback[E, R]) | typingsJapgolly.pulumiAws.lambdaFunctionMod.Function
}
