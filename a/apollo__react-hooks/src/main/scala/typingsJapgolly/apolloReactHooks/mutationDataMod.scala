package typingsJapgolly.apolloReactHooks

import typingsJapgolly.apolloReactCommon.typesMod.ExecutionResult
import typingsJapgolly.apolloReactCommon.typesMod.MutationFunctionOptions
import typingsJapgolly.apolloReactCommon.typesMod.MutationResult
import typingsJapgolly.apolloReactHooks.operationDataMod.OperationData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/react-hooks/lib/data/MutationData", JSImport.Namespace)
@js.native
object mutationDataMod extends js.Object {
  @js.native
  class MutationData[TData, TVariables] protected ()
    extends OperationData[js.Any] {
    def this(hasOptionsContextResultSetResult: AnonContext[TData, TVariables]) = this()
    var generateNewMutationId: js.Any = js.native
    var isMostRecentMutation: js.Any = js.native
    var mostRecentMutationId: js.Any = js.native
    var mutate: js.Any = js.native
    var onMutationCompleted: js.Any = js.native
    var onMutationError: js.Any = js.native
    var onMutationStart: js.Any = js.native
    var previousResult: js.UndefOr[js.Any] = js.native
    var result: js.Any = js.native
    var runMutation: js.Any = js.native
    var setResult: js.Any = js.native
    var updateResult: js.Any = js.native
    def afterExecute(): js.Function0[Unit] = js.native
    def execute(result: MutationResult[TData]): js.Tuple2[
        js.Function1[
          /* options */ js.UndefOr[MutationFunctionOptions[TData, TVariables]], 
          js.Promise[ExecutionResult[TData]]
        ], 
        MutationResult[TData]
      ] = js.native
  }
  
}

