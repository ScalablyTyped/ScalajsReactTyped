package typingsJapgolly.pollyjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ErrorEventListener = js.Function3[
    /* req */ typingsJapgolly.pollyjsCore.mod.Request, 
    /* error */ js.Any, 
    /* event */ typingsJapgolly.pollyjsCore.mod.ListenerEvent, 
    scala.Unit | js.Promise[scala.Unit]
  ]
  type ErrorRouteEvent = typingsJapgolly.pollyjsCore.pollyjsCoreStrings.error
  type Headers = typingsJapgolly.std.Record[java.lang.String, java.lang.String | js.Array[java.lang.String]]
  type InterceptHandler = js.Function3[
    /* req */ typingsJapgolly.pollyjsCore.mod.Request, 
    /* res */ typingsJapgolly.pollyjsCore.mod.Response, 
    /* interceptor */ typingsJapgolly.pollyjsCore.mod.Interceptor, 
    scala.Unit | js.Promise[scala.Unit]
  ]
  type MatchBy[T, R] = js.Function2[/* input */ T, /* req */ typingsJapgolly.pollyjsCore.mod.Request, R]
  type PollyEventListener = js.Function1[/* poll */ typingsJapgolly.pollyjsCore.mod.Polly, scala.Unit]
  type RecordingEventListener = js.Function3[
    /* req */ typingsJapgolly.pollyjsCore.mod.Request, 
    /* recording */ js.Any, 
    /* event */ typingsJapgolly.pollyjsCore.mod.ListenerEvent, 
    scala.Unit | js.Promise[scala.Unit]
  ]
  type RequestEventListener = js.Function2[
    /* req */ typingsJapgolly.pollyjsCore.mod.Request, 
    /* event */ typingsJapgolly.pollyjsCore.mod.ListenerEvent, 
    scala.Unit | js.Promise[scala.Unit]
  ]
  type RequestRouteEvent = typingsJapgolly.pollyjsCore.pollyjsCoreStrings.request
  type ResponseEventListener = js.Function3[
    /* req */ typingsJapgolly.pollyjsCore.mod.Request, 
    /* res */ typingsJapgolly.pollyjsCore.mod.Response, 
    /* event */ typingsJapgolly.pollyjsCore.mod.ListenerEvent, 
    scala.Unit | js.Promise[scala.Unit]
  ]
}
