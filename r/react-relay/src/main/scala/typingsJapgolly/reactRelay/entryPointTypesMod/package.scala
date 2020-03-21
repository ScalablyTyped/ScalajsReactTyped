package typingsJapgolly.reactRelay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object entryPointTypesMod {
  type EntryPointComponent[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] = japgolly.scalajs.react.raw.React.Component[
    (typingsJapgolly.reactRelay.entryPointTypesMod.EntryPointProps[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]) with js.Object, 
    js.Object
  ]
  type EnvironmentProviderOptions = org.scalablytyped.runtime.StringDictionary[js.Any]
  type ExtractEntryPointTypeHelper[TEntryPointParams] = js.Function1[
    /* entryPoint */ js.UndefOr[
      typingsJapgolly.reactRelay.entryPointTypesMod.PreloadedEntryPoint[js.Any] | scala.Null
    ], 
    js.UndefOr[
      (typingsJapgolly.reactRelay.entryPointTypesMod.ThinNestedEntryPointParams[
        TEntryPointParams, 
        typingsJapgolly.reactRelay.entryPointTypesMod.EntryPoint[TEntryPointParams, js.Any]
      ]) | scala.Null
    ]
  ]
  type ExtractQueryTypeHelper[TEnvironmentProviderOptions] = js.Function1[
    /* query */ typingsJapgolly.reactRelay.entryPointTypesMod.PreloadedQuery[
      typingsJapgolly.relayRuntime.relayRuntimeTypesMod.OperationType, 
      typingsJapgolly.reactRelay.entryPointTypesMod.EnvironmentProviderOptions
    ], 
    typingsJapgolly.reactRelay.entryPointTypesMod.ThinQueryParams[
      typingsJapgolly.relayRuntime.relayRuntimeTypesMod.OperationType, 
      TEnvironmentProviderOptions
    ]
  ]
  type PreloadableConcreteRequest[TQuery /* <: typingsJapgolly.relayRuntime.relayRuntimeTypesMod.OperationType */] = js.Object
}
