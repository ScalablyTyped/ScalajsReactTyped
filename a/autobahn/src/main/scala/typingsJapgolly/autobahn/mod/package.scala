package typingsJapgolly.autobahn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // Workaround to get intellisense on type unions of 'literals' | string. 
  // See https://github.com/Microsoft/TypeScript/issues/29729
  type CustomTransportType = java.lang.String with js.Object
  type DeferFactory = js.Function0[typingsJapgolly.when.When.Promise_[js.Any]]
  type OnChallengeHandler = js.Function3[
    /* session */ typingsJapgolly.autobahn.mod.Session, 
    /* method */ java.lang.String, 
    /* extra */ js.Any, 
    java.lang.String | typingsJapgolly.when.When.Promise_[java.lang.String]
  ]
  type RegisterEndpoint = js.Function3[
    /* args */ js.UndefOr[js.Array[js.Any]], 
    /* kwargs */ js.UndefOr[js.Any], 
    /* details */ js.UndefOr[typingsJapgolly.autobahn.mod.IInvocation], 
    scala.Unit
  ]
  type SubscribeHandler = js.Function3[
    /* args */ js.UndefOr[js.Array[js.Any] | js.Any], 
    /* kwargs */ js.UndefOr[js.Any], 
    /* details */ js.UndefOr[typingsJapgolly.autobahn.mod.IEvent], 
    scala.Unit
  ]
  type TransportType = typingsJapgolly.autobahn.mod.DefaultTransportType | typingsJapgolly.autobahn.mod.CustomTransportType
}
