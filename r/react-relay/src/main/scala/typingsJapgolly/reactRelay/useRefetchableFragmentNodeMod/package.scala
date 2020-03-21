package typingsJapgolly.reactRelay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object useRefetchableFragmentNodeMod {
  type RefetchExact[TQuery /* <: typingsJapgolly.relayRuntime.relayRuntimeTypesMod.OperationType */, TOptions] = js.Function1[
    /* data */ js.UndefOr[js.Any | scala.Null], 
    typingsJapgolly.reactRelay.useRefetchableFragmentNodeMod.RefetchFnExact[TQuery, TOptions]
  ]
  type RefetchExactDynamicResponse[TQuery /* <: typingsJapgolly.relayRuntime.relayRuntimeTypesMod.OperationType */, TOptions] = typingsJapgolly.std.ReturnType[
    typingsJapgolly.reactRelay.useRefetchableFragmentNodeMod.RefetchExact[TQuery, TOptions]
  ]
  type RefetchFn[TQuery /* <: typingsJapgolly.relayRuntime.relayRuntimeTypesMod.OperationType */, TOptions] = typingsJapgolly.reactRelay.useRefetchableFragmentNodeMod.RefetchFnExact[TQuery, TOptions]
  type RefetchFnBase[TVars, TOptions] = js.Function2[
    /* vars */ TVars, 
    /* options */ js.UndefOr[TOptions], 
    typingsJapgolly.relayRuntime.relayRuntimeTypesMod.Disposable
  ]
  type RefetchFnDynamic[TQuery /* <: typingsJapgolly.relayRuntime.relayRuntimeTypesMod.OperationType */, TKey /* <: org.scalablytyped.runtime.StringDictionary[js.Any] | scala.Null */, TOptions] = (typingsJapgolly.reactRelay.useRefetchableFragmentNodeMod.RefetchInexactDynamicResponse[TQuery, TOptions]) with (typingsJapgolly.reactRelay.useRefetchableFragmentNodeMod.RefetchExactDynamicResponse[TQuery, TOptions])
  type RefetchFnExact[TQuery /* <: typingsJapgolly.relayRuntime.relayRuntimeTypesMod.OperationType */, TOptions] = typingsJapgolly.reactRelay.useRefetchableFragmentNodeMod.RefetchFnBase[
    /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any, 
    TOptions
  ]
  type RefetchFnInexact[TQuery /* <: typingsJapgolly.relayRuntime.relayRuntimeTypesMod.OperationType */, TOptions] = typingsJapgolly.reactRelay.useRefetchableFragmentNodeMod.RefetchFnBase[
    /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any, 
    TOptions
  ]
  type RefetchInexact[TQuery /* <: typingsJapgolly.relayRuntime.relayRuntimeTypesMod.OperationType */, TOptions] = js.Function1[
    /* data */ js.UndefOr[js.Any], 
    typingsJapgolly.reactRelay.useRefetchableFragmentNodeMod.RefetchFnInexact[TQuery, TOptions]
  ]
  type RefetchInexactDynamicResponse[TQuery /* <: typingsJapgolly.relayRuntime.relayRuntimeTypesMod.OperationType */, TOptions] = typingsJapgolly.std.ReturnType[
    typingsJapgolly.reactRelay.useRefetchableFragmentNodeMod.RefetchInexact[TQuery, TOptions]
  ]
}
