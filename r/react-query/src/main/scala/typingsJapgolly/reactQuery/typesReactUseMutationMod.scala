package typingsJapgolly.reactQuery

import typingsJapgolly.reactQuery.reactQueryStrings.mutationFn
import typingsJapgolly.reactQuery.reactQueryStrings.mutationKey
import typingsJapgolly.reactQuery.typesCoreTypesMod.MutationFunction
import typingsJapgolly.reactQuery.typesCoreTypesMod.MutationKey
import typingsJapgolly.reactQuery.typesReactTypesMod.UseMutationOptions
import typingsJapgolly.reactQuery.typesReactTypesMod.UseMutationResult
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesReactUseMutationMod {
  
  @JSImport("react-query/types/react/useMutation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useMutation[TData, TError, TVariables, TContext](mutationFn: MutationFunction[TData, TVariables]): UseMutationResult[TData, TError, TVariables, TContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMutation")(mutationFn.asInstanceOf[js.Any]).asInstanceOf[UseMutationResult[TData, TError, TVariables, TContext]]
  inline def useMutation[TData, TError, TVariables, TContext](mutationKey: MutationKey): UseMutationResult[TData, TError, TVariables, TContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMutation")(mutationKey.asInstanceOf[js.Any]).asInstanceOf[UseMutationResult[TData, TError, TVariables, TContext]]
  inline def useMutation[TData, TError, TVariables, TContext](
    mutationKey: MutationKey,
    mutationFn: Unit,
    options: Omit[UseMutationOptions[TData, TError, TVariables, TContext], mutationKey | mutationFn]
  ): UseMutationResult[TData, TError, TVariables, TContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("useMutation")(mutationKey.asInstanceOf[js.Any], mutationFn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UseMutationResult[TData, TError, TVariables, TContext]]
  inline def useMutation[TData, TError, TVariables, TContext](mutationKey: MutationKey, mutationFn: MutationFunction[TData, TVariables]): UseMutationResult[TData, TError, TVariables, TContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("useMutation")(mutationKey.asInstanceOf[js.Any], mutationFn.asInstanceOf[js.Any])).asInstanceOf[UseMutationResult[TData, TError, TVariables, TContext]]
  inline def useMutation[TData, TError, TVariables, TContext](
    mutationKey: MutationKey,
    mutationFn: MutationFunction[TData, TVariables],
    options: Omit[UseMutationOptions[TData, TError, TVariables, TContext], mutationKey | mutationFn]
  ): UseMutationResult[TData, TError, TVariables, TContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("useMutation")(mutationKey.asInstanceOf[js.Any], mutationFn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UseMutationResult[TData, TError, TVariables, TContext]]
  inline def useMutation[TData, TError, TVariables, TContext](options: UseMutationOptions[TData, TError, TVariables, TContext]): UseMutationResult[TData, TError, TVariables, TContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMutation")(options.asInstanceOf[js.Any]).asInstanceOf[UseMutationResult[TData, TError, TVariables, TContext]]
  
  inline def useMutation_mutationFn[TData, TError, TVariables, TContext](
    mutationFn: MutationFunction[TData, TVariables],
    options: Omit[UseMutationOptions[TData, TError, TVariables, TContext], mutationFn]
  ): UseMutationResult[TData, TError, TVariables, TContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("useMutation")(mutationFn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UseMutationResult[TData, TError, TVariables, TContext]]
  
  inline def useMutation_mutationKey[TData, TError, TVariables, TContext](
    mutationKey: MutationKey,
    options: Omit[UseMutationOptions[TData, TError, TVariables, TContext], mutationKey]
  ): UseMutationResult[TData, TError, TVariables, TContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("useMutation")(mutationKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UseMutationResult[TData, TError, TVariables, TContext]]
}
