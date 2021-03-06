package typingsJapgolly.relayRuntime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object relayNetworkTypesMod {
  type ExecuteFunction = js.Function4[
    /* request */ typingsJapgolly.relayRuntime.relayConcreteNodeMod.RequestParameters, 
    /* variables */ typingsJapgolly.relayRuntime.relayRuntimeTypesMod.Variables, 
    /* cacheConfig */ typingsJapgolly.relayRuntime.relayRuntimeTypesMod.CacheConfig, 
    /* uploadables */ js.UndefOr[typingsJapgolly.relayRuntime.relayNetworkTypesMod.UploadableMap | scala.Null], 
    typingsJapgolly.relayRuntime.relayObservableMod.RelayObservable[typingsJapgolly.relayRuntime.relayNetworkTypesMod.GraphQLResponse]
  ]
  type FetchFunction = js.Function4[
    /* request */ typingsJapgolly.relayRuntime.relayConcreteNodeMod.RequestParameters, 
    /* variables */ typingsJapgolly.relayRuntime.relayRuntimeTypesMod.Variables, 
    /* cacheConfig */ typingsJapgolly.relayRuntime.relayRuntimeTypesMod.CacheConfig, 
    /* uploadables */ js.UndefOr[typingsJapgolly.relayRuntime.relayNetworkTypesMod.UploadableMap | scala.Null], 
    typingsJapgolly.relayRuntime.relayObservableMod.ObservableFromValue[typingsJapgolly.relayRuntime.relayNetworkTypesMod.GraphQLResponse]
  ]
  type LogRequestInfoFunction = js.Function1[/* arg */ js.Any, scala.Unit]
  type PayloadData = org.scalablytyped.runtime.StringDictionary[js.Any]
  type PayloadExtensions = org.scalablytyped.runtime.StringDictionary[js.Any]
  type SubscribeFunction = js.Function4[
    /* request */ typingsJapgolly.relayRuntime.relayConcreteNodeMod.RequestParameters, 
    /* variables */ typingsJapgolly.relayRuntime.relayRuntimeTypesMod.Variables, 
    /* cacheConfig */ typingsJapgolly.relayRuntime.relayRuntimeTypesMod.CacheConfig, 
    /* observer */ js.UndefOr[
      typingsJapgolly.relayRuntime.relayNetworkTypesMod.LegacyObserver[typingsJapgolly.relayRuntime.relayNetworkTypesMod.GraphQLResponse]
    ], 
    typingsJapgolly.relayRuntime.relayObservableMod.RelayObservable[typingsJapgolly.relayRuntime.relayNetworkTypesMod.GraphQLResponse] | typingsJapgolly.relayRuntime.relayRuntimeTypesMod.Disposable
  ]
  type Uploadable = org.scalajs.dom.raw.File | org.scalajs.dom.raw.Blob
  type UploadableMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.relayRuntime.relayNetworkTypesMod.Uploadable]
}
