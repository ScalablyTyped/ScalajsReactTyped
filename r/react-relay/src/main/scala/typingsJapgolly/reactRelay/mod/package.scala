package typingsJapgolly.reactRelay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Container[Props] = typingsJapgolly.react.mod.ComponentType[
    typingsJapgolly.reactRelay.mod.ContainerProps[Props] with typingsJapgolly.reactRelay.AnonComponentRef
  ]
  type ContainerProps[Props] = typingsJapgolly.reactRelay.mod.MappedFragmentProps[
    typingsJapgolly.std.Pick[
      Props, 
      typingsJapgolly.std.Exclude[java.lang.String, typingsJapgolly.reactRelay.reactRelayStrings.relay]
    ]
  ]
  type FragmentOrRegularProp[T] = T | js.Array[typingsJapgolly.relayRuntime.mod._FragmentRefs[js.Any]] | typingsJapgolly.relayRuntime.mod._FragmentRefs[js.Any]
  type MappedFragmentProps[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: react-relay.react-relay.FragmentOrRegularProp<T[K]>}
    */ typingsJapgolly.reactRelay.reactRelayStrings.MappedFragmentProps with T
  type ObserverOrCallback = typingsJapgolly.relayRuntime.relayObservableMod.Observer[scala.Unit] | (js.Function1[/* error */ js.UndefOr[js.Error | scala.Null], scala.Unit])
  type ReactRelayLocalQueryRenderer[TOperation /* <: typingsJapgolly.relayRuntime.relayRuntimeTypesMod.OperationType */] = japgolly.scalajs.react.raw.React.Component[
    typingsJapgolly.reactRelay.mod.QueryRendererProps[TOperation] with js.Object, 
    js.Object
  ]
  type ReactRelayQueryRenderer[TOperation /* <: typingsJapgolly.relayRuntime.relayRuntimeTypesMod.OperationType */] = japgolly.scalajs.react.raw.React.Component[
    typingsJapgolly.reactRelay.AnonCacheConfig with typingsJapgolly.reactRelay.mod.QueryRendererProps[TOperation] with js.Object, 
    js.Object
  ]
}
